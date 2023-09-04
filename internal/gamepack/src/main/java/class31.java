public class class31 implements class42 {
   public static final class31 field296 = new class31("stellardawn", "Stellar Dawn", 1);
   public static final class31 field297 = new class31("game4", "Game 4", 3);
   public static final class31 field298 = new class31("game3", "Game 3", 2);
   public static final class31 field300 = new class31("oldscape", "RuneScape 2007", 5);
   public static final class31 field302 = new class31("runescape", "RuneScape", 0);
   public static final class31 field303 = new class31("game5", "Game 5", 4);
   final int field299;
   public final String field301;

   class31(String var1, String var2, int var3) {
      this.field301 = var1;
      this.field299 = var3;
   }

   public int method180() {
      return this.field299;
   }

   public static int method136(CharSequence var0, CharSequence var1, class103 var2) {
      int var4 = var0.length();
      int var5 = var1.length();
      int var6 = 0;
      int var7 = 0;
      char var8 = 0;
      char var9 = 0;

      int var10;
      int var11;
      while(var6 - var8 < var4 || var7 - var9 < var5) {
         if (var6 - var8 >= var4) {
            return -1;
         }

         if (var7 - var9 >= var5) {
            return 1;
         }

         if (var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var0.charAt(var6++);
         }

         if (var9 != 0) {
            var11 = var9;
            boolean var16 = false;
         } else {
            var11 = var1.charAt(var7++);
         }

         var8 = class336.method1570((char)var10);
         var9 = class336.method1570((char)var11);
         var10 = class336.method1569((char)var10, var2);
         var11 = class336.method1569((char)var11, var2);
         if (var11 != var10 && Character.toUpperCase((char)var10) != Character.toUpperCase((char)var11)) {
            var10 = Character.toLowerCase((char)var10);
            var11 = Character.toLowerCase((char)var11);
            if (var10 != var11) {
               return class336.method1568((char)var10, var2) - class336.method1568((char)var11, var2);
            }
         }
      }

      var10 = Math.min(var4, var5);

      int var12;
      char var13;
      for(var11 = 0; var11 < var10; ++var11) {
         if (class103.field684 == var2) {
            var6 = var4 - 1 - var11;
            var7 = var5 - 1 - var11;
         } else {
            var7 = var11;
            var6 = var11;
         }

         var12 = var0.charAt(var6);
         var13 = var1.charAt(var7);
         if (var13 != var12 && Character.toUpperCase((char)var12) != Character.toUpperCase(var13)) {
            var12 = Character.toLowerCase((char)var12);
            var13 = Character.toLowerCase(var13);
            if (var12 != var13) {
               return class336.method1568((char)var12, var2) - class336.method1568(var13, var2);
            }
         }
      }

      var11 = var4 - var5;
      if (var11 != 0) {
         return var11;
      } else {
         for(var12 = 0; var12 < var10; ++var12) {
            var13 = var0.charAt(var12);
            char var14 = var1.charAt(var12);
            if (var14 != var13) {
               return class336.method1568(var13, var2) - class336.method1568(var14, var2);
            }
         }

         return 0;
      }
   }
}
