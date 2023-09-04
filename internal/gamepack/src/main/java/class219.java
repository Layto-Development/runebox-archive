public class class219 {
   static class121 field2034;
   static class22 field2035;
   public byte field2037;
   public class251 field2036;
   public int field2038;

   class219() {
   }

   static final void method1319(class518 var0) {
      int var3;
      int var4;
      int var5;
      int var7;
      if (var0.field4033 != -1) {
         Object var2 = null;
         var3 = 65536;
         if (var0.field4033 < var3) {
            var2 = Client.field636[var0.field4033];
         } else {
            var2 = Client.field749[var0.field4033 - var3];
         }

         if (var2 != null) {
            var4 = var0.field4028 - ((class518)var2).field4028;
            var5 = var0.field3999 - ((class518)var2).field3999;
            if (var4 != 0 || var5 != 0) {
               var7 = (int)(Math.atan2((double)var4, (double)var5) * 325.94932345220167) & 2047;
               var0.field4039 = var7;
            }
         } else if (var0.field4003) {
            var0.field4033 = -1;
            var0.field4003 = false;
         }
      }

      int var8;
      if (var0.field4046 == 0 || var0.field4072 > 0) {
         var8 = -1;
         if (var0.field4036 != -1 && var0.field4037 != -1) {
            var3 = 64 + (var0.field4036 * 128 - class69.field1134 * 128);
            var4 = var0.field4037 * 128 - class478.field3659 * 128 + 64;
            var5 = var0.field4028 - var3;
            int var6 = var0.field3999 - var4;
            if (var5 != 0 || var6 != 0) {
               var7 = (int)(Math.atan2((double)var5, (double)var6) * 325.94932345220167) & 2047;
               var8 = var7;
            }
         } else if (var0.field4035 != -1) {
            var8 = var0.field4035;
         }

         if (var8 != -1) {
            var0.field4039 = var8;
            if (var0.field4038) {
               var0.field4000 = var0.field4039;
            }
         }

         var0.method2474();
      }

      var8 = var0.field4039 - var0.field4000 & 2047;
      if (var8 != 0) {
         boolean var9 = true;
         boolean var10 = true;
         ++var0.field4040;
         var5 = var8 > 1024 ? -1 : 1;
         var0.field4000 += var0.field4067 * var5;
         boolean var11 = true;
         if (var8 < var0.field4067 || var8 > 2048 - var0.field4067) {
            var0.field4000 = var0.field4039;
            var11 = false;
         }

         if (var0.field4067 > 0 && var0.field4011 == var0.field4004 && (var0.field4040 > 25 || var11)) {
            if (var5 == -1 && var0.field4005 != -1) {
               var0.field4011 = var0.field4005;
            } else if (var5 == 1 && var0.field4066 != -1) {
               var0.field4011 = var0.field4066;
            } else {
               var0.field4011 = var0.field4007;
            }
         }

         var0.field4000 &= 2047;
      } else {
         if (var0.field4003) {
            var0.field4033 = -1;
            var0.field4003 = false;
         }

         var0.field4040 = 0;
      }

   }
}
