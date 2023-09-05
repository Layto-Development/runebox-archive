public class class447 {
   static int[] field3392 = new int[500];
   static int[] field3394 = new int[500];
   static int[] field3397 = new int[500];
   static int[] field3398 = new int[500];
   boolean field3402 = false;
   class370 field3393 = null;
   int field3396 = -1;
   int[] field3395;
   int[] field3399;
   int[] field3400;
   int[] field3401;

   class447(byte[] var1, class370 var2) {
      this.field3393 = var2;
      class184 var3 = new class184(var1);
      class184 var4 = new class184(var1);
      var3.field1818 = 2;
      int var5 = var3.readUnsignedByte();
      int var6 = -1;
      int var7 = 0;
      var4.field1818 = var3.field1818 + var5;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.readUnsignedByte();
         if (var9 > 0) {
            if (this.field3393.field2898[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if (this.field3393.field2898[var10] == 0) {
                     field3398[var7] = var10;
                     field3392[var7] = 0;
                     field3394[var7] = 0;
                     field3397[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field3398[var7] = var8;
            short var11 = 0;
            if (this.field3393.field2898[var8] == 3) {
               var11 = 128;
            }

            if ((var9 & 1) != 0) {
               field3392[var7] = var4.method1136();
            } else {
               field3392[var7] = var11;
            }

            if ((var9 & 2) != 0) {
               field3394[var7] = var4.method1136();
            } else {
               field3394[var7] = var11;
            }

            if ((var9 & 4) != 0) {
               field3397[var7] = var4.method1136();
            } else {
               field3397[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if (this.field3393.field2898[var8] == 5) {
               this.field3402 = true;
            }
         }
      }

      if (var4.field1818 != var1.length) {
      }

      this.field3396 = var7;
      this.field3395 = new int[var7];
      this.field3399 = new int[var7];
      this.field3400 = new int[var7];
      this.field3401 = new int[var7];

      for(var8 = 0; var8 < var7; ++var8) {
         this.field3395[var8] = field3398[var8];
         this.field3399[var8] = field3392[var8];
         this.field3400[var8] = field3394[var8];
         this.field3401[var8] = field3397[var8];
      }

   }
}
