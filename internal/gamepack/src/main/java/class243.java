public class class243 extends class306 {
   static class296[] field1778;
   static class534 field1777;
   class349 field1772;
   class97 field1768;
   class97 field1774;
   int field1769;
   int field1770;
   int field1773;
   String field1771;
   String field1775;
   String field1776;

   class243(int var1, String var2, String var3, String var4) {
      this.field1768 = class97.field669;
      this.field1774 = class97.field669;
      this.method1174(var1, var2, var3, var4);
   }

   void method1174(int var1, String var2, String var3, String var4) {
      int var6 = ++class431.field3370 - 1;
      this.field1773 = var6;
      this.field1769 = Client.field1419;
      this.field1770 = var1;
      this.field1771 = var2;
      this.method1179();
      this.field1775 = var3;
      this.field1776 = var4;
      this.method1172();
      this.method1176();
   }

   void method1172() {
      this.field1768 = class97.field669;
   }

   final boolean method1177() {
      if (this.field1768 == class97.field669) {
         this.method1173();
      }

      return this.field1768 == class97.field668;
   }

   void method1173() {
      this.field1768 = class290.field1979.field939.method1809(this.field1772) ? class97.field668 : class97.field667;
   }

   void method1176() {
      this.field1774 = class97.field669;
   }

   final boolean method1175() {
      if (class97.field669 == this.field1774) {
         this.method1178();
      }

      return this.field1774 == class97.field668;
   }

   void method1178() {
      this.field1774 = class290.field1979.field938.method1809(this.field1772) ? class97.field668 : class97.field667;
   }

   final void method1179() {
      if (this.field1771 != null) {
         this.field1772 = new class349(Client.method864(this.field1771), class103.field694);
      } else {
         this.field1772 = null;
      }

   }
}
