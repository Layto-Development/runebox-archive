public class class370 extends class55 {
   static class425 field2901;
   class226 field2900;
   int field2896;
   int field2897;
   int[] field2898;
   int[][] field2899;

   public class370(int var1, byte[] var2) {
      this.field2896 = var1;
      class184 var3 = new class184(var2);
      this.field2897 = var3.method1125();
      this.field2898 = new int[this.field2897];
      this.field2899 = new int[this.field2897][];

      int var4;
      for(var4 = 0; var4 < this.field2897; ++var4) {
         this.field2898[var4] = var3.method1125();
      }

      for(var4 = 0; var4 < this.field2897; ++var4) {
         this.field2899[var4] = new int[var3.method1125()];
      }

      for(var4 = 0; var4 < this.field2897; ++var4) {
         for(int var5 = 0; var5 < this.field2899[var4].length; ++var5) {
            this.field2899[var4][var5] = var3.method1125();
         }
      }

      if (var3.field1818 < var3.field1816.length) {
         var4 = var3.method1174();
         if (var4 > 0) {
            this.field2900 = new class226(var3, var4);
         }
      }

   }

   public int method1862() {
      return this.field2897;
   }

   public class226 method1861() {
      return this.field2900;
   }
}
