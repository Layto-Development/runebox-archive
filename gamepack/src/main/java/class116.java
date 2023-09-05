public class class116 extends class151 {
   static class298 field1475;
   static class364 field1474 = new class364(64);
   int[][] field1476;
   Object[][] field1478;
   public int field1477 = -1;

   class116() {
   }

   void method820(class184 var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method817(var1, var3);
      }
   }

   public Object[] method819(int var1) {
      return null == this.field1478 ? null : this.field1478[var1];
   }

   void method817(class184 var1, int var2) {
      if (var2 == 3) {
         int var4 = var1.readUnsignedByte();
         if (null == this.field1478) {
            this.field1478 = new Object[var4][];
            this.field1476 = new int[var4][];
         }

         for(int var5 = var1.readUnsignedByte(); var5 != 255; var5 = var1.readUnsignedByte()) {
            int var6 = var1.readUnsignedByte();
            int[] var7 = new int[var6];

            for(int var8 = 0; var8 < var6; ++var8) {
               var7[var8] = var1.method1172();
            }

            this.field1478[var5] = class463.method2263(var1, var7);
            this.field1476[var5] = var7;
         }
      } else if (var2 == 4) {
         this.field1477 = var1.method1141();
      }

   }

   void method818() {
   }

   public static void method823(class298 var0) {
      field1475 = var0;
   }

   public static class116 method822(int var0) {
      class116 var2 = (class116)field1474.method1851((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = field1475.method1629(38, var0);
         var2 = new class116();
         if (null != var3) {
            var2.method820(new class184(var3));
         }

         var2.method818();
         field1474.method1850(var2, (long)var0);
         return var2;
      }
   }

   public static void method821() {
      field1474.method1848();
   }
}
