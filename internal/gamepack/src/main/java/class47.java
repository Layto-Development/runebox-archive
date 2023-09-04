import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class class47 implements class334 {
   final MessageDigest field1031 = this.method589();

   class47(class100 var1) {
   }

   boolean method591(int var1, String var2, long var3) {
      byte[] var5 = this.method588(var2, var3);
      return method587(var5) >= var1;
   }

   byte[] method588(String var1, long var2) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var1).append(Long.toHexString(var2));
      this.field1031.reset();

      try {
         this.field1031.update(var4.toString().getBytes("UTF-8"));
      } catch (UnsupportedEncodingException var6) {
         var6.printStackTrace();
      }

      return this.field1031.digest();
   }

   MessageDigest method589() {
      try {
         return MessageDigest.getInstance("SHA-256");
      } catch (NoSuchAlgorithmException var2) {
         var2.printStackTrace();
         return null;
      }
   }

   static int method587(byte[] var0) {
      int var1 = 0;
      byte[] var2 = var0;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         byte var4 = var2[var3];
         int var5 = method590(var4);
         var1 += var5;
         if (var5 != 8) {
            break;
         }
      }

      return var1;
   }

   static int method590(byte var0) {
      int var1 = 0;
      if (var0 == 0) {
         var1 = 8;
      } else {
         for(int var2 = var0 & 255; (var2 & 128) == 0; var2 <<= 1) {
            ++var1;
         }
      }

      return var1;
   }
}
