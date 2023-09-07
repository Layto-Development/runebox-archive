import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;

public class class69 {
    final int field656;
    final String field655;
    final Map<String, java.util.List<String>> field654;

    class69(HttpURLConnection var1) throws IOException {
        this.field656 = var1.getResponseCode();
        var1.getResponseMessage();
        this.field654 = var1.getHeaderFields();
        StringBuilder var2 = new StringBuilder();
        InputStream var3 = this.field656 >= 300 ? var1.getErrorStream() : var1.getInputStream();
        if (var3 != null) {
            InputStreamReader var4 = new InputStreamReader(var3);
            BufferedReader var5 = new BufferedReader(var4);

            String var6;
            while ((var6 = var5.readLine()) != null) {
                var2.append(var6);
            }

            var3.close();
        }

        this.field655 = var2.toString();
    }

    class69(String var1) {
        this.field656 = 400;
        this.field654 = null;
        this.field655 = "";
    }

    static int method220(class320 var0) {
        int var2 = var0.method1408(2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = var0.method1408(5);
        } else if (var2 == 2) {
            var3 = var0.method1408(8);
        } else {
            var3 = var0.method1408(11);
        }

        return var3;
    }

    public int method217() {
        return this.field656;
    }

    public Map<String, java.util.List<String>> method218() {
        return this.field654;
    }

    public String method219() {
        return this.field655;
    }
}
