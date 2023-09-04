public class class242 {
   int field2196;
   int field2197;
   final int field2198;
   final int[] field2194;
   final int[] field2200;
   final int[][] field2195;
   final int[][] field2199;

   public class242(int var1, int var2) {
      this.field2199 = new int[var1][var2];
      this.field2195 = new int[var1][var2];
      int var3 = var1 * var2;
      int var4 = class349.method1808(var3 / 4);
      this.field2200 = new int[var4];
      this.field2194 = new int[var4];
      this.field2198 = var4 - 1;
   }

   void method1443() {
      for(int var2 = 0; var2 < this.field2199.length; ++var2) {
         for(int var3 = 0; var3 < this.field2199[var2].length; ++var3) {
            this.field2199[var2][var3] = 0;
            this.field2195[var2][var3] = 99999999;
         }
      }

   }

   void method1433(int var1, int var2) {
      this.field2196 = var1;
      this.field2197 = var2;
   }

   int method1434() {
      return this.field2196;
   }

   int method1435() {
      return this.field2197;
   }

   int method1436() {
      return this.field2199.length;
   }

   int method1441() {
      return this.field2199[0].length;
   }

   int[][] method1442() {
      return this.field2199;
   }

   int[][] method1437() {
      return this.field2195;
   }

   int[] method1438() {
      return this.field2200;
   }

   int[] method1439() {
      return this.field2194;
   }

   int method1440() {
      return this.field2198;
   }
}
