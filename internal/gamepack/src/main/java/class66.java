public class class66 {
   final int field517;
   final int field518;
   final String field519;

   class66(int var1, int var2, String var3) {
      this.field517 = var1;
      this.field518 = var2;
      this.field519 = var3;
   }

   class66(class366 var1) {
      this(var1.method1654(), var1.method1654(), var1.method1662());
   }

   String method288() {
      return Integer.toHexString(this.field517) + Integer.toHexString(this.field518) + this.field519;
   }

   int method287() {
      return this.field518;
   }
}
