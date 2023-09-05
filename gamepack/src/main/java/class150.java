public class class150 extends class151 {
   static class298 field1619;
   static class364 field1618 = new class364(64);
   static int[] field1622;
   public int[][] field1620;
   public Object[][] field1621;

   class150() {
   }

   void method933(class184 var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method934(var1, var3);
      }
   }

   void method934(class184 var1, int var2) {
      if (var2 == 1) {
         int var4 = var1.readUnsignedByte();
         if (this.field1620 == null) {
            this.field1620 = new int[var4][];
         }

         for(int var5 = var1.readUnsignedByte(); var5 != 255; var5 = var1.readUnsignedByte()) {
            int var6 = var5 & 127;
            boolean var7 = (var5 & 128) != 0;
            int[] var8 = new int[var1.readUnsignedByte()];

            for(int var9 = 0; var9 < var8.length; ++var9) {
               var8[var9] = var1.method1172();
            }

            this.field1620[var6] = var8;
            if (var7) {
               if (null == this.field1621) {
                  this.field1621 = new Object[this.field1620.length][];
               }

               this.field1621[var6] = class463.method2263(var1, var8);
            }
         }
      }

   }

   void method935() {
   }

   public static class150 method936(int var0) {
      class150 var2 = (class150)field1618.method1851((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = field1619.method1629(39, var0);
         var2 = new class150();
         if (var3 != null) {
            var2.method933(new class184(var3));
         }

         var2.method935();
         field1618.method1850(var2, (long)var0);
         return var2;
      }
   }

   public static void method937() {
      field1618.method1848();
   }
}
