public class class435 extends class366 {
   static final int[] field3453 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   class421 field3452;
   int field3454;

   public class435(int var1) {
      super(var1);
   }

   public void method2029(int[] var1) {
      this.field3452 = new class421(var1);
   }

   public void method2030(class421 var1) {
      this.field3452 = var1;
   }

   public void method2032(int var1) {
      super.field2650[++super.field2652 - 1] = (byte)(var1 + this.field3452.method1945());
   }

   public int method2031() {
      return super.field2650[++super.field2652 - 1] - this.field3452.method1945() & 255;
   }

   public boolean method2033() {
      int var2 = super.field2650[super.field2652] - this.field3452.method1946() & 255;
      return var2 >= 128;
   }

   public int method2035() {
      int var2 = super.field2650[++super.field2652 - 1] - this.field3452.method1945() & 255;
      return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.field2650[++super.field2652 - 1] - this.field3452.method1945() & 255);
   }

   public void method2034(byte[] var1, int var2, int var3) {
      for(int var5 = 0; var5 < var3; ++var5) {
         var1[var5 + var2] = (byte)(super.field2650[++super.field2652 - 1] - this.field3452.method1945());
      }

   }

   public void method2038() {
      this.field3454 = super.field2652 * 8;
   }

   public int method2036(int var1) {
      int var3 = this.field3454 >> 3;
      int var4 = 8 - (this.field3454 & 7);
      int var5 = 0;

      for(this.field3454 += var1; var1 > var4; var4 = 8) {
         var5 += (super.field2650[var3++] & field3453[var4]) << var1 - var4;
         var1 -= var4;
      }

      if (var4 == var1) {
         var5 += super.field2650[var3] & field3453[var4];
      } else {
         var5 += super.field2650[var3] >> var4 - var1 & field3453[var1];
      }

      return var5;
   }

   public void method2039() {
      super.field2652 = (this.field3454 + 7) / 8;
   }

   public int method2037(int var1) {
      return var1 * 8 - this.field3454;
   }
}
