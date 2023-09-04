public class class360 {
   int[] field2608 = new int[8];
   short[] field2609 = new short[8];

   public class360(class90 var1) {
      int var2 = 0;
      if (var1.method351()) {
         var2 = var1.method352().length;
         System.arraycopy(var1.method352(), 0, this.field2608, 0, var2);
         System.arraycopy(var1.method354(), 0, this.field2609, 0, var2);
      }

      for(int var3 = var2; var3 < 8; ++var3) {
         this.field2608[var3] = -1;
         this.field2609[var3] = -1;
      }

   }

   public int[] method1619() {
      return this.field2608;
   }

   public short[] method1620() {
      return this.field2609;
   }

   public void method1621(int var1, int var2, short var3) {
      this.field2608[var1] = var2;
      this.field2609[var1] = var3;
   }

   public void method1622(int[] var1, short[] var2) {
      this.field2608 = var1;
      this.field2609 = var2;
   }
}
