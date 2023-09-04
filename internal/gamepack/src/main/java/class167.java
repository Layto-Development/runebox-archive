public class class167 {
   int field1064;
   int field1065;
   final int field1066;
   final int[] field1062;
   final int[] field1068;
   final int[][] field1063;
   final int[][] field1067;

   public class167(int var1, int var2) {
      this.field1067 = new int[var1][var2];
      this.field1063 = new int[var1][var2];
      int var3 = var1 * var2;
      int var4 = class32.method143(var3 / 4);
      this.field1068 = new int[var4];
      this.field1062 = new int[var4];
      this.field1066 = var4 - 1;
   }

   void method654() {
      for(int var2 = 0; var2 < this.field1067.length; ++var2) {
         for(int var3 = 0; var3 < this.field1067[var2].length; ++var3) {
            this.field1067[var2][var3] = 0;
            this.field1063[var2][var3] = 99999999;
         }
      }

   }

   void method644(int var1, int var2) {
      this.field1064 = var1;
      this.field1065 = var2;
   }

   int method645() {
      return this.field1064;
   }

   int method646() {
      return this.field1065;
   }

   int method647() {
      return this.field1067.length;
   }

   int method652() {
      return this.field1067[0].length;
   }

   int[][] method653() {
      return this.field1067;
   }

   int[][] method648() {
      return this.field1063;
   }

   int[] method649() {
      return this.field1068;
   }

   int[] method650() {
      return this.field1062;
   }

   int method651() {
      return this.field1066;
   }
}
