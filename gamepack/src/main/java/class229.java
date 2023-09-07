import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class class229 implements class117 {
    final MessageDigest field1793;

    class229(class296 var1) {
        this.field1793 = this.method1049();
    }

    static int method1047(byte[] var0) {
        int var1 = 0;
        byte[] var2 = var0;

        for (int var3 = 0; var3 < var2.length; ++var3) {
            byte var4 = var2[var3];
            int var5 = method1050(var4);
            var1 += var5;
            if (var5 != 8) {
                break;
            }
        }

        return var1;
    }

    static int method1050(byte var0) {
        int var1 = 0;
        if (var0 == 0) {
            var1 = 8;
        } else {
            for (int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
                ++var1;
            }
        }

        return var1;
    }

    boolean method1051(int var1, String var2, long var3) {
        byte[] var5 = this.method1048(var2, var3);
        return method1047(var5) >= var1;
    }

    byte[] method1048(String var1, long var2) {
        StringBuilder var4 = new StringBuilder();
        var4.append(var1).append(Long.toHexString(var2));
        this.field1793.reset();

        this.field1793.update(var4.toString().getBytes(StandardCharsets.UTF_8));

        return this.field1793.digest();
    }

    MessageDigest method1049() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException var2) {
            var2.printStackTrace();
            return null;
        }
    }
}
