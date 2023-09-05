public class class135 extends class151 {
   public static class298 field1569;
   public static class364 field1570 = new class364(64);
   static int[] field1567;
   class197 field1568;

   class135() {
   }

   void method896() {
   }

   void method897(class184 var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method900(var1, var3);
      }
   }

   void method900(class184 var1, int var2) {
      if (var2 == 249) {
         this.field1568 = class83.method717(var1, this.field1568);
      }

   }

   public int method898(int var1, int var2) {
      return class83.method716(this.field1568, var1, var2);
   }

   public String method899(int var1, String var2) {
      class197 var5 = this.field1568;
      String var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class183 var6 = (class183)var5.method1222((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = (String)var6.field1815;
         }
      }

      return var4;
   }

   public static class135 method901(int var0) {
      class135 var2 = (class135)field1570.method1851((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = field1569.method1629(34, var0);
         var2 = new class135();
         if (var3 != null) {
            var2.method897(new class184(var3));
         }

         var2.method896();
         field1570.method1850(var2, (long)var0);
         return var2;
      }
   }
}
