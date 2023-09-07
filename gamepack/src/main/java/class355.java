import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class355 implements class501 {
    final Map<String, String> field2558;

    public class355(Map<String, String> var1) {
        this.field2558 = var1;
    }

    @Override
    public class495 method2274() {
        return null;
    }

    @Override
    public byte[] method2273() throws UnsupportedEncodingException {
        return this.method1690().getBytes(StandardCharsets.UTF_8);
    }

    public String method1690() throws UnsupportedEncodingException {
        StringBuilder var2 = new StringBuilder();
        Iterator<Entry<String, String>> var3 = this.field2558.entrySet().iterator();

        while (var3.hasNext()) {
            Entry<String, String> var4 = var3.next();
            String var5 = URLEncoder.encode(var4.getKey(), StandardCharsets.UTF_8);
            String var6 = URLEncoder.encode(var4.getValue(), StandardCharsets.UTF_8);
            var2.append(var5).append("=").append(var6).append("&");
        }

        if (var2.length() == 0) {
            return "";
        } else {
            var2.deleteCharAt(var2.length() - 1);
            var2.insert(0, "?");
            return var2.toString();
        }
    }
}
