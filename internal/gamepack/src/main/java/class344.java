public class class344 extends class70 {
   static class501 field2563;
   class242 field2562;
   int field2558;
   int field2559;
   int[] field2560;
   int[][] field2561;

   public class344(int var1, byte[] var2) {
      this.field2558 = var1;
      class366 var3 = new class366(var2);
      this.field2559 = var3.method1654();
      this.field2560 = new int[this.field2559];
      this.field2561 = new int[this.field2559][];

      int var4;
      for(var4 = 0; var4 < this.field2559; ++var4) {
         this.field2560[var4] = var3.method1654();
      }

      for(var4 = 0; var4 < this.field2559; ++var4) {
         this.field2561[var4] = new int[var3.method1654()];
      }

      for(var4 = 0; var4 < this.field2559; ++var4) {
         for(int var5 = 0; var5 < this.field2561[var4].length; ++var5) {
            this.field2561[var4][var5] = var3.method1654();
         }
      }

      if (var3.field2652 < var3.field2650.length) {
         var4 = var3.method1703();
         if (var4 > 0) {
            this.field2562 = new class242(var3, var4);
         }
      }

   }

   public int method1593() {
      return this.field2559;
   }

   public class242 method1592() {
      return this.field2562;
   }
}
