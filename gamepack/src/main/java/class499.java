public class class499 {
   static final int[] field3942 = new int[]{16777215, 14942979, 16747520, 16772352, 32806, 2375822, 7547266, 16720268, 11884176, 5261772, 10724259, 13970688, 15693351, 16577588, 494960, 2208255, 10178454, 16756679, 13722276, 8105443, 16751190, 2543274, 7591918, 10246609, 10021057, 11894492, 2894892, 9699842, 6371605, 13680896, 4882723, 14504, 8388736, 14025328, 10682978, 4004472};

   class499() throws Throwable {
   }

   public static class335 method2442(int var0, String var1, class121 var2, int var3) {
      class335 var5 = class335.createPacket(ClientPacket.field968, Client.field641.field2758);
      var5.buffer.method1114(0);
      int var6 = var5.buffer.field1818;
      var5.buffer.method1114(var0);
      String var7 = var1.toLowerCase();
      int var8 = 0;
      byte[] var9 = null;
      if (var7.startsWith(class27.field334)) {
         var8 = 0;
         var1 = var1.substring(class27.field334.length());
      } else if (var7.startsWith(class27.field425)) {
         var8 = 1;
         var1 = var1.substring(class27.field425.length());
      } else if (var7.startsWith(class27.field336)) {
         var8 = 2;
         var1 = var1.substring(class27.field336.length());
      } else if (var7.startsWith(class27.field427)) {
         var8 = 3;
         var1 = var1.substring(class27.field427.length());
      } else if (var7.startsWith(class27.field306)) {
         var8 = 4;
         var1 = var1.substring(class27.field306.length());
      } else if (var7.startsWith(class27.field429)) {
         var8 = 5;
         var1 = var1.substring(class27.field429.length());
      } else if (var7.startsWith(class27.field430)) {
         var8 = 6;
         var1 = var1.substring(class27.field430.length());
      } else if (var7.startsWith(class27.field241)) {
         var8 = 7;
         var1 = var1.substring(class27.field241.length());
      } else if (var7.startsWith(class27.field276)) {
         var8 = 8;
         var1 = var1.substring(class27.field276.length());
      } else if (var7.startsWith(class27.field298)) {
         var8 = 9;
         var1 = var1.substring(class27.field298.length());
      } else if (var7.startsWith(class27.field342)) {
         var8 = 10;
         var1 = var1.substring(class27.field342.length());
      } else if (var7.startsWith(class27.field435)) {
         var8 = 11;
         var1 = var1.substring(class27.field435.length());
      } else if (var7.startsWith(class27.field352)) {
         var8 = 12;
         var1 = var1.substring(class27.field352.length());
      } else if (var7.startsWith(class27.field437)) {
         var9 = method2441(var7);
         if (null != var9) {
            var8 = var9.length + 12;
            var1 = var1.substring(class27.field437.length() + var9.length + 1);
         }
      }

      var7 = var1.toLowerCase();
      byte var10 = 0;
      if (var7.startsWith(class27.field438)) {
         var10 = 1;
         var1 = var1.substring(class27.field438.length());
      } else if (var7.startsWith(class27.field439)) {
         var10 = 2;
         var1 = var1.substring(class27.field439.length());
      } else if (var7.startsWith(class27.field288)) {
         var10 = 3;
         var1 = var1.substring(class27.field288.length());
      } else if (var7.startsWith(class27.field441)) {
         var10 = 4;
         var1 = var1.substring(class27.field441.length());
      } else if (var7.startsWith(class27.field325)) {
         var10 = 5;
         var1 = var1.substring(class27.field325.length());
      }

      var5.buffer.method1114(var8);
      var5.buffer.method1114(var10);
      if (null != var9 && Client.field758 >= 214) {
         for(int var11 = 0; var11 < var9.length; ++var11) {
            var5.buffer.method1114(var9[var11]);
         }
      }

      class68.method653(var5.buffer, var1);
      if (var0 == class137.field1579.method1195()) {
         var5.buffer.method1114(var3);
      }

      var5.buffer.method1123(var5.buffer.field1818 - var6);
      return var5;
   }

   static byte[] method2441(String var0) {
      boolean var2 = true;
      boolean var3 = true;
      int var4 = class27.field437.length();
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

   public static int[] method2443(byte[] var0) {
      if (var0 != null && var0.length != 0 && var0.length <= 8) {
         int[] var2 = new int[var0.length];

         for(int var3 = 0; var3 < var0.length; ++var3) {
            if (var0[var3] < 0 || var0[var3] > field3942.length) {
               return null;
            }

            var2[var3] = field3942[var0[var3]];
         }

         return var2;
      } else {
         return null;
      }
   }
}
