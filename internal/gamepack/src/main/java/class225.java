public class class225 extends class306 {
   public static class245 field1680 = new class245(64);
   public static class245 field1681 = new class245(64);
   public static class509 field1679;
   int field1688 = -1;
   int field1689 = -1;
   public int field1682;
   public int field1683 = 70;
   public int field1684 = 255;
   public int field1685 = 255;
   public int field1686 = 1;
   public int field1687 = -1;
   public int field1690 = 30;
   public int field1691 = 0;

   public void method1121(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         this.method1118(var1, var3);
      }
   }

   void method1118(class366 var1, int var2) {
      if (var2 == 1) {
         var1.method1703();
      } else if (var2 == 2) {
         this.field1685 = var1.method1654();
      } else if (var2 == 3) {
         this.field1684 = var1.method1654();
      } else if (var2 == 4) {
         this.field1687 = 0;
      } else if (var2 == 5) {
         this.field1683 = var1.method1703();
      } else if (var2 == 6) {
         var1.method1654();
      } else if (var2 == 7) {
         this.field1688 = var1.method1702();
      } else if (var2 == 8) {
         this.field1689 = var1.method1702();
      } else if (var2 == 11) {
         this.field1687 = var1.method1703();
      } else if (var2 == 14) {
         this.field1690 = var1.method1654();
      } else if (var2 == 15) {
         this.field1691 = var1.method1654();
      }

   }

   public class296 method1119() {
      if (this.field1688 < 0) {
         return null;
      } else {
         class296 var2 = (class296)field1681.method1183((long)this.field1688);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class513.method2454(class185.field1484, this.field1688, 0);
            if (null != var2) {
               field1681.method1182(var2, (long)this.field1688);
            }

            return var2;
         }
      }
   }

   public class296 method1120() {
      if (this.field1689 < 0) {
         return null;
      } else {
         class296 var2 = (class296)field1681.method1183((long)this.field1689);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class513.method2454(class185.field1484, this.field1689, 0);
            if (null != var2) {
               field1681.method1182(var2, (long)this.field1689);
            }

            return var2;
         }
      }
   }

   public static void method1122(class509 var0, class509 var1) {
      field1679 = var0;
      class185.field1484 = var1;
   }
}
