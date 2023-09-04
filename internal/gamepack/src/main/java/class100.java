public class class100 {
   final int field1325;
   final int field1326;
   final String field1327;

   class100(int var1, int var2, String var3) {
      this.field1325 = var1;
      this.field1326 = var2;
      this.field1327 = var3;
   }

   class100(class184 var1) {
      this(var1.method1125(), var1.method1125(), var1.method1133());
   }

   String method747() {
      return Integer.toHexString(this.field1325) + Integer.toHexString(this.field1326) + this.field1327;
   }

   int method746() {
      return this.field1326;
   }
}
