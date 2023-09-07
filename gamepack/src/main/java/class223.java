import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;

public class class223 extends class357 {
    public static int field1763;
    static int field1765;
    final boolean field1764;

    public class223(boolean var1, int var2) {
        super(var2);
        this.field1764 = var1;
    }

    @Override
    void method1697(class244 var1) throws IOException {
        URLConnection var3 = null;
        boolean var10 = false;

        label124:
        {
            HttpURLConnection var13;
            label125:
            {
                try {
                    var10 = true;
                    String var4 = var1.field1861.getProtocol();
                    if (var4.equals("http")) {
                        var3 = this.method1033(var1);
                    } else {
                        if (!var4.equals("https")) {
                            var1.field1864 = class244.field1863;
                            var10 = false;
                            break label124;
                        }

                        var3 = this.method1034(var1);
                    }

                    this.method1698(var3, var1);
                    var10 = false;
                    break label125;
                } catch (IOException var11) {
                    var1.field1864 = class244.field1863;
                    var10 = false;
                } finally {
                    if (var10) {
                        if (null != var3 && var3 instanceof HttpURLConnection) {
                            HttpURLConnection var7 = (HttpURLConnection) var3;
                            var7.disconnect();
                        }

                    }
                }

                if (null != var3 && var3 instanceof HttpURLConnection) {
                    var13 = (HttpURLConnection) var3;
                    var13.disconnect();
                }

                return;
            }

            if (null != var3 && var3 instanceof HttpURLConnection) {
                var13 = (HttpURLConnection) var3;
                var13.disconnect();
            }

            return;
        }

        if (null != var3 && var3 instanceof HttpURLConnection) {
            HttpURLConnection var5 = (HttpURLConnection) var3;
            var5.disconnect();
        }

    }

    URLConnection method1033(class244 var1) throws IOException {
        URLConnection var3 = var1.field1861.openConnection();
        this.method1702(var3);
        return var3;
    }

    URLConnection method1034(class244 var1) throws IOException {
        HttpsURLConnection var3 = (HttpsURLConnection) var1.field1861.openConnection();
        if (!this.field1764) {
            var3.setSSLSocketFactory(class408.method1857());
        }

        this.method1702(var3);
        return var3;
    }
}
