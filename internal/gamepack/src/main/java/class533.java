public class class533 {
   static int[] field4214 = new int[500];
   static int[] field4216 = new int[500];
   static int[] field4219 = new int[500];
   static int[] field4220 = new int[500];
   boolean field4224 = false;
   class344 field4215 = null;
   int field4218 = -1;
   int[] field4217;
   int[] field4221;
   int[] field4222;
   int[] field4223;

   class533(byte[] var1, class344 var2) {
      this.field4215 = var2;
      class366 var3 = new class366(var1);
      class366 var4 = new class366(var1);
      var3.field2652 = 2;
      int var5 = var3.method1654();
      int var6 = -1;
      int var7 = 0;
      var4.field2652 = var3.field2652 + var5;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.method1654();
         if (var9 > 0) {
            if (this.field4215.field2560[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if (this.field4215.field2560[var10] == 0) {
                     field4220[var7] = var10;
                     field4214[var7] = 0;
                     field4216[var7] = 0;
                     field4219[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field4220[var7] = var8;
            short var11 = 0;
            if (this.field4215.field2560[var8] == 3) {
               var11 = 128;
            }

            if ((var9 & 1) != 0) {
               field4214[var7] = var4.method1665();
            } else {
               field4214[var7] = var11;
            }

            if ((var9 & 2) != 0) {
               field4216[var7] = var4.method1665();
            } else {
               field4216[var7] = var11;
            }

            if ((var9 & 4) != 0) {
               field4219[var7] = var4.method1665();
            } else {
               field4219[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if (this.field4215.field2560[var8] == 5) {
               this.field4224 = true;
            }
         }
      }

      if (var4.field2652 != var1.length) {
      }

      this.field4218 = var7;
      this.field4217 = new int[var7];
      this.field4221 = new int[var7];
      this.field4222 = new int[var7];
      this.field4223 = new int[var7];

      for(var8 = 0; var8 < var7; ++var8) {
         this.field4217[var8] = field4220[var8];
         this.field4221[var8] = field4214[var8];
         this.field4222[var8] = field4216[var8];
         this.field4223[var8] = field4219[var8];
      }

   }
}
