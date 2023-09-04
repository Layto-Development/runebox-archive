public class class536 extends class306 {
   static int[] field4273;
   public final int field4274;
   public final int field4275;
   public final int[] field4276;
   public final int[] field4277;

   class536(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.field4275 = var1;
      this.field4274 = var2;
      this.field4276 = var3;
      this.field4277 = var4;
   }

   public boolean method2573(int var1, int var2) {
      if (var2 >= 0 && var2 < this.field4277.length) {
         int var4 = this.field4277[var2];
         if (var1 >= var4 && var1 <= this.field4276[var2] + var4) {
            return true;
         }
      }

      return false;
   }
}
