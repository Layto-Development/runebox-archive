public class class339 {
   static char[] field2528;
   static char[] field2529 = new char[64];
   static char[] field2530;
   static class534 field2531;
   static int[] field2527;

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field2529[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field2529[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field2529[var0] = (char)(var0 + 48 - 52);
      }

      field2529[62] = '+';
      field2529[63] = '/';
      field2530 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field2530[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field2530[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field2530[var0] = (char)(var0 + 48 - 52);
      }

      field2530[62] = '*';
      field2530[63] = '-';
      field2528 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field2528[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field2528[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field2528[var0] = (char)(var0 + 48 - 52);
      }

      field2528[62] = '-';
      field2528[63] = '_';
      field2527 = new int[128];

      for(var0 = 0; var0 < field2527.length; ++var0) {
         field2527[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field2527[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field2527[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field2527[var0] = 52 + (var0 - 48);
      }

      int[] var2 = field2527;
      field2527[43] = 62;
      var2[42] = 62;
      int[] var1 = field2527;
      field2527[47] = 63;
      var1[45] = 63;
   }

   class339() throws Throwable {
   }

   public static String method1584(byte[] var0, int var1, int var2) {
      StringBuilder var4 = new StringBuilder();

      for(int var5 = var1; var5 < var1 + var2; var5 += 3) {
         int var6 = var0[var5] & 255;
         var4.append(field2529[var6 >>> 2]);
         if (var5 < var2 - 1) {
            int var7 = var0[var5 + 1] & 255;
            var4.append(field2529[(var6 & 3) << 4 | var7 >>> 4]);
            if (var5 < var2 - 2) {
               int var8 = var0[var5 + 2] & 255;
               var4.append(field2529[(var7 & 15) << 2 | var8 >>> 6]).append(field2529[var8 & 63]);
            } else {
               var4.append(field2529[(var7 & 15) << 2]).append("=");
            }
         } else {
            var4.append(field2529[(var6 & 3) << 4]).append("==");
         }
      }

      return var4.toString();
   }
}
