public class class164 extends class184 {
   static final int[] field1698 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   class152 field1697;
   int field1699;

   public class164(int var1) {
      super(var1);
   }

   public void method997(int[] var1) {
      this.field1697 = new class152(var1);
   }

   public void method998(class152 var1) {
      this.field1697 = var1;
   }

   public void method1000(int var1) {
      super.field1816[++super.field1818 - 1] = (byte)(var1 + this.field1697.method939());
   }

   public int method999() {
      return super.field1816[++super.field1818 - 1] - this.field1697.method939() & 255;
   }

   public boolean method1001() {
      int var2 = super.field1816[super.field1818] - this.field1697.method940() & 255;
      return var2 >= 128;
   }

   public int method1003() {
      int var2 = super.field1816[++super.field1818 - 1] - this.field1697.method939() & 255;
      return var2 < 128 ? var2 : (var2 - 128 << 8) + (super.field1816[++super.field1818 - 1] - this.field1697.method939() & 255);
   }

   public void method1002(byte[] var1, int var2, int var3) {
      for(int var5 = 0; var5 < var3; ++var5) {
         var1[var5 + var2] = (byte)(super.field1816[++super.field1818 - 1] - this.field1697.method939());
      }

   }

   public void method1006() {
      this.field1699 = super.field1818 * 8;
   }

   public int method1004(int var1) {
      int var3 = this.field1699 >> 3;
      int var4 = 8 - (this.field1699 & 7);
      int var5 = 0;

      for(this.field1699 += var1; var1 > var4; var4 = 8) {
         var5 += (super.field1816[var3++] & field1698[var4]) << var1 - var4;
         var1 -= var4;
      }

      if (var4 == var1) {
         var5 += super.field1816[var3] & field1698[var4];
      } else {
         var5 += super.field1816[var3] >> var4 - var1 & field1698[var1];
      }

      return var5;
   }

   public void method1007() {
      super.field1818 = (this.field1699 + 7) / 8;
   }

   public int method1005(int var1) {
      return var1 * 8 - this.field1699;
   }
}
