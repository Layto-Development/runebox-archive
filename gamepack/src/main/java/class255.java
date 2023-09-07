import javax.net.ssl.HttpsURLConnection;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;

public class class255 {
    static int field1918;
    final DecimalFormat field1915;
    final Map<String, String> field1916;
    final Map<class495, Float> field1917;

    public class255() {
        this.field1916 = new HashMap<String, String>();
        this.field1917 = new HashMap<>();
        this.field1915 = new DecimalFormat();
        this.field1915.setMaximumFractionDigits(2);
    }

    public void method1128(HttpsURLConnection var1) {
        Iterator<Entry<String, String>> var3 = this.field1916.entrySet().iterator();

        while (var3.hasNext()) {
            Entry<String, String> var4 = var3.next();
            var1.setRequestProperty(var4.getKey(), var4.getValue());
        }

    }

    public Map<String, String> method1129() {
        return this.field1916;
    }

    public void method1130(String var1, String var2) {
        if (var1 != null && !var1.isEmpty()) {
            this.field1916.put(var1, var2 != null ? var2 : "");
        }

    }

    public void method1139(String var1) {
        if (null != var1 && !var1.isEmpty()) {
            this.field1916.remove(var1);
        }

    }

    void method1135(class411 var1, String var2) {
        String var4 = String.format("%s %s", var1.method1902(), var2);
        this.method1130("Authorization", var4);
    }

    public void method1131(String var1) {
        this.method1135(class411.field2897, var1);
    }

    public void method1140(String var1) {
        this.method1135(class411.field2898, var1);
    }

    public void method1134(class495 var1) {
        this.field1916.put("Content-Type", var1.method2246());
    }

    public void method1132() {
        this.field1916.remove("Content-Type");
    }

    public void method1133(class495 var1) {
        this.method1137(var1, 1.0F);
    }

    void method1137(class495 var1, float var2) {
        this.field1917.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
        this.method1136();
    }

    void method1136() {
        this.field1916.remove("Accept");
        if (!this.field1917.isEmpty()) {
            this.field1916.put("Accept", this.method1138());
        }

    }

    String method1138() {
        ArrayList<Entry<class495, Float>> var2 = new ArrayList<>(this.field1917.entrySet());
        Collections.sort(var2, new class168(this));
        StringBuilder var3 = new StringBuilder();
        Iterator<Entry<class495, Float>> var4 = var2.iterator();

        while (var4.hasNext()) {
            Entry<class495, Float> var5 = var4.next();
            if (var3.length() > 0) {
                var3.append(",");
            }

            var3.append(var5.getKey().method2246());
            float var6 = var5.getValue();
            if (var6 < 1.0F) {
                String var7 = this.field1915.format(var6);
                var3.append(";q=").append(var7);
            }
        }

        return var3.toString();
    }
}
