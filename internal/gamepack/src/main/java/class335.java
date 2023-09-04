public class class335 extends class55 {
   public static class480[][] field2687;
   static class31 field2688;
   static class335[] field2684 = new class335[300];
   static int field2685 = 0;
   public class164 field2686;
   public class46 field2681;
   public int field2682;
   public int field2683;

   class335() {
   }

   public void method1771() {
      if (field2685 < field2684.length) {
         field2684[++field2685 - 1] = this;
      }
   }

   public static class335 method1773(class46 var0, class152 var1) {
      class335 var3 = class315.method1687((byte)-1);
      var3.field2681 = var0;
      var3.field2682 = var0.field1001;
      if (var3.field2682 == -1) {
         var3.field2686 = new class164(260);
      } else if (var3.field2682 == -2) {
         var3.field2686 = new class164(10000);
      } else if (var3.field2682 <= 18) {
         var3.field2686 = new class164(20);
      } else if (var3.field2682 <= 98) {
         var3.field2686 = new class164(100);
      } else {
         var3.field2686 = new class164(260);
      }

      var3.field2686.method998(var1);
      var3.field2686.method1000(var3.field2681.field950);
      var3.field2683 = 0;
      return var3;
   }

   public static int method1772(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 & 858993459) + (var0 >>> 2 & 858993459);
      var0 = (var0 >>> 4) + var0 & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }
}
