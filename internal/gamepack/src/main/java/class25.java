public class class25 {
   int[] field230 = new int[8];
   short[] field231 = new short[8];

   public class25(class453 var1) {
      int var2 = 0;
      if (var1.method2234()) {
         var2 = var1.method2235().length;
         System.arraycopy(var1.method2235(), 0, this.field230, 0, var2);
         System.arraycopy(var1.method2237(), 0, this.field231, 0, var2);
      }

      for(int var3 = var2; var3 < 8; ++var3) {
         this.field230[var3] = -1;
         this.field231[var3] = -1;
      }

   }

   public int[] method263() {
      return this.field230;
   }

   public short[] method264() {
      return this.field231;
   }

   public void method265(int var1, int var2, short var3) {
      this.field230[var1] = var2;
      this.field231[var1] = var3;
   }

   public void method266(int[] var1, short[] var2) {
      this.field230 = var1;
      this.field231 = var2;
   }
}
