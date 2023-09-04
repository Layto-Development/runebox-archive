public class class167 implements class155 {
   class187[] field1711;
   class201 field1712 = new class201();
   class298 field1709;
   double field1710 = 1.0;
   int field1707;
   int field1708 = 0;
   int field1713 = 128;

   public class167(class298 var1, class298 var2, int var3, double var4, int var6) {
      this.field1709 = var2;
      this.field1707 = var3;
      this.field1708 = this.field1707;
      this.field1710 = var4;
      this.field1713 = var6;
      int[] var7 = var1.method1640(0);
      if (var7 != null) {
         int var8 = var7.length;
         this.field1711 = new class187[var1.method1655(0)];

         for(int var9 = 0; var9 < var8; ++var9) {
            class184 var10 = new class184(var1.method1629(0, var7[var9]));
            this.field1711[var7[var9]] = new class187(var10);
         }
      } else {
         this.field1711 = new class187[0];
      }

   }

   public int method1008() {
      if (this.field1711.length == 0) {
         return 100;
      } else {
         int var2 = 0;
         int var3 = 0;
         class187[] var4 = this.field1711;

         for(int var5 = 0; var5 < var4.length; ++var5) {
            class187 var6 = var4[var5];
            if (var6 != null && var6.field1846 != null) {
               var2 += var6.field1846.length;
               int[] var7 = var6.field1846;

               for(int var8 = 0; var8 < var7.length; ++var8) {
                  int var9 = var7[var8];
                  if (this.field1709.method1632(var9)) {
                     ++var3;
                  }
               }
            }
         }

         if (var2 == 0) {
            return 0;
         } else {
            return var3 * 100 / var2;
         }
      }
   }

   public void method1009(double var1) {
      this.field1710 = var1;
      this.method1011();
   }

   public int[] method946(int var1) {
      class187 var3 = this.field1711[var1];
      if (null != var3) {
         if (var3.field1852 != null) {
            this.field1712.method1241(var3);
            var3.field1851 = true;
            return var3.field1852;
         }

         boolean var4 = var3.method1194(this.field1710, this.field1713, this.field1709);
         if (var4) {
            if (this.field1708 == 0) {
               class187 var5 = (class187)this.field1712.method1235();
               var5.method1192();
            } else {
               --this.field1708;
            }

            this.field1712.method1241(var3);
            var3.field1851 = true;
            return var3.field1852;
         }
      }

      return null;
   }

   public int method943(int var1) {
      return this.field1711[var1] != null ? this.field1711[var1].field1844 : 0;
   }

   public boolean method945(int var1) {
      return this.field1711[var1].field1845;
   }

   public boolean method944(int var1) {
      return this.field1713 == 64;
   }

   public void method1011() {
      for(int var2 = 0; var2 < this.field1711.length; ++var2) {
         if (null != this.field1711[var2]) {
            this.field1711[var2].method1192();
         }
      }

      this.field1712 = new class201();
      this.field1708 = this.field1707;
   }

   public void method1010(int var1) {
      for(int var3 = 0; var3 < this.field1711.length; ++var3) {
         class187 var4 = this.field1711[var3];
         if (null != var4 && var4.field1850 != 0 && var4.field1851) {
            var4.method1193(var1);
            var4.field1851 = false;
         }
      }

   }
}
