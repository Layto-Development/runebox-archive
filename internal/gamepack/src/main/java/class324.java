import java.util.Random;

public class class324 {
   class324() throws Throwable {
   }

   public static void method1709(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      if (var0 == var2) {
         if (var1 == var3) {
            return;
         }

         if (var3 > var1 && var3 < var1 + var4) {
            --var4;
            var1 += var4;
            var3 += var4;
            var4 = var1 - var4;

            for(var4 += 7; var1 >= var4; var2[var3--] = var0[var1--]) {
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
               var2[var3--] = var0[var1--];
            }

            for(var4 -= 7; var1 >= var4; var2[var3--] = var0[var1--]) {
            }

            return;
         }
      }

      var4 += var1;

      for(var4 -= 7; var1 < var4; var2[var3++] = var0[var1++]) {
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
         var2[var3++] = var0[var1++];
      }

      for(var4 += 7; var1 < var4; var2[var3++] = var0[var1++]) {
      }

   }

   public static void method1711(int[] var0, int var1, int var2) {
      for(var2 = var1 + var2 - 7; var1 < var2; var0[var1++] = 0) {
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
         var0[var1++] = 0;
      }

      for(var2 += 7; var1 < var2; var0[var1++] = 0) {
      }

   }

   public static void method1710(int[] var0, int var1, int var2, int var3) {
      if (var2 == 0 && var3 == 0) {
         var2 = (int)(Math.random() * 2.147483647E9);
         var3 = (int)(Math.random() * 2.147483647E9);
      }

      long var4 = (long)var2 << 32 | (long)var3;
      Random var6 = new Random(var4);

      for(int var7 = var1 - 1; var7 > 0; --var7) {
         int var8 = var6.nextInt(var7 + 1);
         if (var7 != var8) {
            int var9 = var0[var7];
            var0[var7] = var0[var8];
            var0[var8] = var9;
         }
      }

   }
}
