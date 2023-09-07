import javax.net.ssl.HttpsURLConnection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;

public class class189 {
    static class372 field1542;
    final class255 field1543;
    final class535 field1549;
    final HttpsURLConnection field1547;
    boolean field1544;
    boolean field1546;
    class501 field1545;
    int field1548;

    public class189(URL var1, class535 var2, boolean var3) throws IOException {
        this(var1, var2, new class255(), var3);
    }

    public class189(URL var1, class535 var2, class255 var3, boolean var4) throws IOException {
        this.field1546 = false;
        this.field1544 = false;
        this.field1548 = 300000;
        if (!var2.method2578()) {
            throw new UnsupportedEncodingException("Unsupported request method used " + var2.method2576());
        } else {
            this.field1547 = (HttpsURLConnection) var1.openConnection();
            if (!var4) {
                this.field1547.setSSLSocketFactory(class408.method1857());
            }

            this.field1549 = var2;
            this.field1543 = null != var3 ? var3 : new class255();
        }
    }

    public class255 method879() {
        return this.field1543;
    }

    public void method875(class501 var1) {
        if (!this.field1546) {
            if (var1 == null) {
                this.field1543.method1139("Content-Type");
                this.field1545 = null;
            } else {
                this.field1545 = var1;
                if (this.field1545.method2274() != null) {
                    this.field1543.method1134(this.field1545.method2274());
                } else {
                    this.field1543.method1132();
                }

            }
        }
    }

    void method876() throws ProtocolException {
        if (!this.field1546) {
            this.field1547.setRequestMethod(this.field1549.method2576());
            this.field1543.method1128(this.field1547);
            if (this.field1549.method2577() && this.field1545 != null) {
                this.field1547.setDoOutput(true);
                ByteArrayOutputStream var2 = new ByteArrayOutputStream();

                try {
                    var2.write(this.field1545.method2273());
                    var2.writeTo(this.field1547.getOutputStream());
                } catch (IOException var12) {
                    var12.printStackTrace();
                } finally {
                    try {
                        var2.close();
                    } catch (IOException var11) {
                        var11.printStackTrace();
                    }

                }
            }

            this.field1547.setConnectTimeout(this.field1548);
            this.field1547.setInstanceFollowRedirects(this.field1544);
            this.field1546 = true;
        }
    }

    boolean method878() throws IOException {
        if (!this.field1546) {
            this.method876();
        }

        this.field1547.connect();
        return this.field1547.getResponseCode() == -1;
    }

    class69 method877() {
        try {
            if (!this.field1546 || this.field1547.getResponseCode() == -1) {
                return new class69("No REST response has been received yet.");
            }
        } catch (IOException var11) {
            this.field1547.disconnect();
            return new class69("Error decoding REST response code: " + var11.getMessage());
        }

        class69 var4;
        try {
            class69 var2 = new class69(this.field1547);
            return var2;
        } catch (IOException var9) {
            var4 = new class69("Error decoding REST response: " + var9.getMessage());
        } finally {
            this.field1547.disconnect();
        }

        return var4;
    }
}
