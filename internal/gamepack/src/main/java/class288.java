public class class288 extends class151 {
   static int[] field2445;
   public final int field2446;
   public final int field2447;
   public final int[] field2448;
   public final int[] field2449;

   class288(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.field2447 = var1;
      this.field2446 = var2;
      this.field2448 = var3;
      this.field2449 = var4;
   }

   public boolean method1601(int var1, int var2) {
      if (var2 >= 0 && var2 < this.field2449.length) {
         int var4 = this.field2449[var2];
         if (var1 >= var4 && var1 <= this.field2448[var2] + var4) {
            return true;
         }
      }

      return false;
   }
}
