public class class49 {
   static final int[] field421 = new int[]{16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472};

   class49() throws Throwable {
   }

   public static class53 method215(int var0, String var1, class103 var2, int var3) {
      class53 var5 = class53.method226(class10.field116, Client.field1181.field3781);
      var5.field435.method1643(0);
      int var6 = var5.field435.field2652;
      var5.field435.method1643(var0);
      String var7 = var1.toLowerCase();
      int var8 = 0;
      byte[] var9 = null;
      if (var7.startsWith(class424.field3101)) {
         var8 = 0;
         var1 = var1.substring(class424.field3101.length());
      } else if (var7.startsWith(class424.field3192)) {
         var8 = 1;
         var1 = var1.substring(class424.field3192.length());
      } else if (var7.startsWith(class424.field3103)) {
         var8 = 2;
         var1 = var1.substring(class424.field3103.length());
      } else if (var7.startsWith(class424.field3194)) {
         var8 = 3;
         var1 = var1.substring(class424.field3194.length());
      } else if (var7.startsWith(class424.field3073)) {
         var8 = 4;
         var1 = var1.substring(class424.field3073.length());
      } else if (var7.startsWith(class424.field3196)) {
         var8 = 5;
         var1 = var1.substring(class424.field3196.length());
      } else if (var7.startsWith(class424.field3197)) {
         var8 = 6;
         var1 = var1.substring(class424.field3197.length());
      } else if (var7.startsWith(class424.field3008)) {
         var8 = 7;
         var1 = var1.substring(class424.field3008.length());
      } else if (var7.startsWith(class424.field3043)) {
         var8 = 8;
         var1 = var1.substring(class424.field3043.length());
      } else if (var7.startsWith(class424.field3065)) {
         var8 = 9;
         var1 = var1.substring(class424.field3065.length());
      } else if (var7.startsWith(class424.field3109)) {
         var8 = 10;
         var1 = var1.substring(class424.field3109.length());
      } else if (var7.startsWith(class424.field3202)) {
         var8 = 11;
         var1 = var1.substring(class424.field3202.length());
      } else if (var7.startsWith(class424.field3119)) {
         var8 = 12;
         var1 = var1.substring(class424.field3119.length());
      } else if (var7.startsWith(class424.field3204)) {
         var9 = method214(var7);
         if (null != var9) {
            var8 = var9.length + 12;
            var1 = var1.substring(class424.field3204.length() + var9.length + 1);
         }
      }

      var7 = var1.toLowerCase();
      byte var10 = 0;
      if (var7.startsWith(class424.field3205)) {
         var10 = 1;
         var1 = var1.substring(class424.field3205.length());
      } else if (var7.startsWith(class424.field3206)) {
         var10 = 2;
         var1 = var1.substring(class424.field3206.length());
      } else if (var7.startsWith(class424.field3055)) {
         var10 = 3;
         var1 = var1.substring(class424.field3055.length());
      } else if (var7.startsWith(class424.field3208)) {
         var10 = 4;
         var1 = var1.substring(class424.field3208.length());
      } else if (var7.startsWith(class424.field3092)) {
         var10 = 5;
         var1 = var1.substring(class424.field3092.length());
      }

      var5.field435.method1643(var8);
      var5.field435.method1643(var10);
      if (null != var9 && Client.field1298 >= 214) {
         for(int var11 = 0; var11 < var9.length; ++var11) {
            var5.field435.method1643(var9[var11]);
         }
      }

      class453.method2110(var5.field435, var1);
      if (var0 == class341.field2541.method180()) {
         var5.field435.method1643(var3);
      }

      var5.field435.method1652(var5.field435.field2652 - var6);
      return var5;
   }

   static byte[] method214(String var0) {
      boolean var2 = true;
      boolean var3 = true;
      int var4 = class424.field3204.length();
      int var5 = 0;
      byte[] var6 = new byte[8];

      while(true) {
         int var7 = var5 + var4;
         if (var7 >= var0.length()) {
            return null;
         }

         char var8 = var0.charAt(var7);
         if (var8 == ':') {
            if (var5 == 0) {
               return null;
            }

            byte[] var9 = new byte[var5];
            System.arraycopy(var6, 0, var9, 0, var5);
            return var9;
         }

         if (var6.length == var5) {
            return null;
         }

         if (var8 >= '0' && var8 <= '9') {
            var8 = (char)(var8 - 48);
         } else {
            if (var8 < 'a' || var8 > 'z') {
               return null;
            }

            var8 = (char)(var8 - 87);
         }

         var6[var5++] = (byte)var8;
      }
   }

   public static int[] method216(byte[] var0) {
      if (var0 != null && var0.length != 0 && var0.length <= 8) {
         int[] var2 = new int[var0.length];

         for(int var3 = 0; var3 < var0.length; ++var3) {
            if (var0[var3] < 0 || var0[var3] > field421.length) {
               return null;
            }

            var2[var3] = field421[var0[var3]];
         }

         return var2;
      } else {
         return null;
      }
   }
}
