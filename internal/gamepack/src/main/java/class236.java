public class class236 implements class188 {
   static long field2168;
   static final class236 field2149 = new class236(1, 1, (String)null, 0, 2);
   static final class236 field2150 = new class236(2, 2, (String)null, 1, 2);
   static final class236 field2151 = new class236(3, 3, (String)null, 2, 2);
   static final class236 field2152 = new class236(13, 13, (String)null, 3, 7);
   static final class236 field2153 = new class236(0, 0, (String)null, -1, -1);
   static final class236 field2154 = new class236(6, 6, (String)null, 5, 1);
   static final class236 field2155 = new class236(7, 7, (String)null, 6, 3);
   static final class236 field2156 = new class236(11, 11, (String)null, 1, 7);
   static final class236 field2157 = new class236(4, 4, (String)null, 3, 1);
   static final class236 field2158 = new class236(10, 10, (String)null, 0, 7);
   static final class236 field2159 = new class236(9, 9, (String)null, 8, 3);
   static final class236 field2160 = new class236(12, 12, (String)null, 2, 7);
   static final class236 field2161 = new class236(14, 14, (String)null, 4, 7);
   static final class236 field2162 = new class236(15, 15, (String)null, 5, 7);
   static final class236 field2163 = new class236(16, 16, (String)null, 0, 5);
   static final class236 field2165 = new class236(8, 8, (String)null, 7, 3);
   static final class236 field2167 = new class236(5, 5, (String)null, 4, 1);
   final int field2148;
   final int field2164;
   final int field2166;

   class236(int var1, int var2, String var3, int var4, int var5) {
      this.field2164 = var1;
      this.field2148 = var2;
      this.field2166 = var4;
   }

   public int method1195() {
      return this.field2148;
   }

   int method1422() {
      return this.field2166;
   }

   static final void method1423(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class278[] var10) {
      int var13;
      for(int var12 = 0; var12 < 8; ++var12) {
         for(var13 = 0; var13 < 8; ++var13) {
            if (var12 + var2 > 0 && var2 + var12 < 103 && var3 + var13 > 0 && var3 + var13 < 103) {
               int[] var10000 = var10[var1].field2387[var12 + var2];
               var10000[var13 + var3] &= -16777217;
            }
         }
      }

      class184 var20 = new class184(var0);

      for(var13 = 0; var13 < 4; ++var13) {
         for(int var14 = 0; var14 < 64; ++var14) {
            for(int var15 = 0; var15 < 64; ++var15) {
               if (var4 == var13 && var14 >= var5 && var14 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
                  int var16 = var2 + class411.method1986(var14 & 7, var15 & 7, var7);
                  int var17 = var3 + class411.method1988(var14 & 7, var15 & 7, var7);
                  int var18 = (var14 & 7) + var2 + var8;
                  int var19 = var3 + var9 + (var15 & 7);
                  class526.method2496(var20, var1, var16, var17, var18, var19, var7);
               } else {
                  class526.method2496(var20, 0, -1, -1, 0, 0, 0);
               }
            }
         }
      }

   }
}
