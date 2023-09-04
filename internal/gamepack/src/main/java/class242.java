public class class242 {
   static class534 field1767;
   static short[][][] field1766;
   class54[] field1764;
   int field1765;

   class242(class366 var1, int var2) {
      this.field1764 = new class54[var2];
      this.field1765 = var1.method1654();

      for(int var3 = 0; var3 < this.field1764.length; ++var3) {
         class54 var4 = new class54(this.field1765, var1, false);
         this.field1764[var3] = var4;
      }

      this.method1171();
   }

   void method1171() {
      class54[] var2 = this.field1764;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class54 var4 = var2[var3];
         if (var4.field439 >= 0) {
            var4.field449 = this.field1764[var4.field439];
         }
      }

   }

   public int method1166() {
      return this.field1764.length;
   }

   class54 method1167(int var1) {
      return var1 >= this.method1166() ? null : this.field1764[var1];
   }

   class54[] method1168() {
      return this.field1764;
   }

   void method1169(class272 var1, int var2) {
      this.method1170(var1, var2, (boolean[])null, false);
   }

   void method1170(class272 var1, int var2, boolean[] var3, boolean var4) {
      int var6 = var1.method1275();
      int var7 = 0;
      class54[] var8 = this.method1168();

      for(int var9 = 0; var9 < var8.length; ++var9) {
         class54 var10 = var8[var9];
         if (null == var3 || var4 == var3[var7]) {
            var1.method1277(var2, var10, var7, var6);
         }

         ++var7;
      }

   }
}
