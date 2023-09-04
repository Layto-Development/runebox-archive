public class class53 extends class70 {
   public static class322[][] field436;
   static class488 field437;
   static class53[] field433 = new class53[300];
   static int field434 = 0;
   public class10 field430;
   public class435 field435;
   public int field431;
   public int field432;

   class53() {
   }

   public void method224() {
      if (field434 < field433.length) {
         field433[++field434 - 1] = this;
      }
   }

   public static class53 method226(class10 var0, class421 var1) {
      class53 var3 = class207.method1085((byte)-1);
      var3.field430 = var0;
      var3.field431 = var0.field149;
      if (var3.field431 == -1) {
         var3.field435 = new class435(260);
      } else if (var3.field431 == -2) {
         var3.field435 = new class435(10000);
      } else if (var3.field431 <= 18) {
         var3.field435 = new class435(20);
      } else if (var3.field431 <= 98) {
         var3.field435 = new class435(100);
      } else {
         var3.field435 = new class435(260);
      }

      var3.field435.method2030(var1);
      var3.field435.method2032(var3.field430.field98);
      var3.field432 = 0;
      return var3;
   }

   public static int method225(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
      var0 = (var0 >>> 4) + var0 & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }
}
