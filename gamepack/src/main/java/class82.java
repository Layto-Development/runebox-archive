public class class82 {
   String field1254;
   String field1256;
   public final class177 field1253;
   public final int field1257;
   public final long field1255;

   class82(class184 var1, byte var2, int var3) {
      this.field1256 = var1.readString();
      this.field1254 = var1.readString();
      this.field1257 = var1.method1174();
      this.field1255 = var1.method1130();
      int var4 = var1.readInt();
      int var5 = var1.readInt();
      this.field1253 = new class177();
      this.field1253.method1098(2);
      this.field1253.method1102(var2);
      this.field1253.field1798 = var4;
      this.field1253.field1796 = var5;
      this.field1253.field1797 = 0;
      this.field1253.field1793 = 0;
      this.field1253.field1794 = var3;
   }

   public String method715() {
      return this.field1256;
   }

   public String method714() {
      return this.field1254;
   }
}
