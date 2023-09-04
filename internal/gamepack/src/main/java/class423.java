public class class423 implements class42 {
   static long field3000;
   static final class423 field2981 = new class423(1, 1, (String)null, 0, 2);
   static final class423 field2982 = new class423(2, 2, (String)null, 1, 2);
   static final class423 field2983 = new class423(3, 3, (String)null, 2, 2);
   static final class423 field2984 = new class423(13, 13, (String)null, 3, 7);
   static final class423 field2985 = new class423(0, 0, (String)null, -1, -1);
   static final class423 field2986 = new class423(6, 6, (String)null, 5, 1);
   static final class423 field2987 = new class423(7, 7, (String)null, 6, 3);
   static final class423 field2988 = new class423(11, 11, (String)null, 1, 7);
   static final class423 field2989 = new class423(4, 4, (String)null, 3, 1);
   static final class423 field2990 = new class423(10, 10, (String)null, 0, 7);
   static final class423 field2991 = new class423(9, 9, (String)null, 8, 3);
   static final class423 field2992 = new class423(12, 12, (String)null, 2, 7);
   static final class423 field2993 = new class423(14, 14, (String)null, 4, 7);
   static final class423 field2994 = new class423(15, 15, (String)null, 5, 7);
   static final class423 field2995 = new class423(16, 16, (String)null, 0, 5);
   static final class423 field2997 = new class423(8, 8, (String)null, 7, 3);
   static final class423 field2999 = new class423(5, 5, (String)null, 4, 1);
   final int field2980;
   final int field2996;
   final int field2998;

   class423(int var1, int var2, String var3, int var4, int var5) {
      this.field2996 = var1;
      this.field2980 = var2;
      this.field2998 = var4;
   }

   public int method180() {
      return this.field2980;
   }

   int method1950() {
      return this.field2998;
   }

   static final void method1951(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class378[] var10) {
      int var13;
      for(int var12 = 0; var12 < 8; ++var12) {
         for(var13 = 0; var13 < 8; ++var13) {
            if (var12 + var2 > 0 && var2 + var12 < 103 && var3 + var13 > 0 && var3 + var13 < 103) {
               int[] var10000 = var10[var1].field2701[var12 + var2];
               var10000[var13 + var3] &= -16777217;
            }
         }
      }

      class366 var20 = new class366(var0);

      for(var13 = 0; var13 < 4; ++var13) {
         for(int var14 = 0; var14 < 64; ++var14) {
            for(int var15 = 0; var15 < 64; ++var15) {
               if (var4 == var13 && var14 >= var5 && var14 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
                  int var16 = var2 + class352.method1603(var14 & 7, var15 & 7, var7);
                  int var17 = var3 + class352.method1605(var14 & 7, var15 & 7, var7);
                  int var18 = (var14 & 7) + var2 + var8;
                  int var19 = var3 + var9 + (var15 & 7);
                  class513.method2458(var20, var1, var16, var17, var18, var19, var7);
               } else {
                  class513.method2458(var20, 0, -1, -1, 0, 0, 0);
               }
            }
         }
      }

   }
}
