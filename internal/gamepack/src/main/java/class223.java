public class class223 extends class306 {
   public static class245 field1673 = new class245(64);
   public static class509 field1678;
   static class296[] field1668;
   public boolean field1669 = true;
   public int field1666 = -1;
   public int field1667 = 0;
   public int field1670 = -1;
   public int field1671;
   public int field1672;
   public int field1674;
   public int field1675;
   public int field1676;
   public int field1677;

   public void method1113() {
      if (-1 != this.field1670) {
         this.method1115(this.field1670);
         this.field1675 = this.field1671;
         this.field1674 = this.field1672;
         this.field1676 = this.field1677;
      }

      this.method1115(this.field1667);
   }

   public void method1114(class366 var1, int var2) {
      while(true) {
         int var4 = var1.method1654();
         if (var4 == 0) {
            return;
         }

         this.method1112(var1, var4, var2);
      }
   }

   void method1112(class366 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field1667 = var1.method1710();
      } else if (var2 == 2) {
         this.field1666 = var1.method1654();
      } else if (var2 == 5) {
         this.field1669 = false;
      } else if (var2 == 7) {
         this.field1670 = var1.method1710();
      } else if (var2 == 8) {
      }

   }

   void method1115(int var1) {
      double var3 = (double)(var1 >> 16 & 255) / 256.0;
      double var5 = (double)(var1 >> 8 & 255) / 256.0;
      double var7 = (double)(var1 & 255) / 256.0;
      double var9 = var3;
      if (var5 < var3) {
         var9 = var5;
      }

      if (var7 < var9) {
         var9 = var7;
      }

      double var11 = var3;
      if (var5 > var3) {
         var11 = var5;
      }

      if (var7 > var11) {
         var11 = var7;
      }

      double var13 = 0.0;
      double var15 = 0.0;
      double var17 = (var9 + var11) / 2.0;
      if (var11 != var9) {
         if (var17 < 0.5) {
            var15 = (var11 - var9) / (var11 + var9);
         }

         if (var17 >= 0.5) {
            var15 = (var11 - var9) / (2.0 - var11 - var9);
         }

         if (var11 == var3) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if (var11 == var5) {
            var13 = 2.0 + (var7 - var3) / (var11 - var9);
         } else if (var11 == var7) {
            var13 = (var3 - var5) / (var11 - var9) + 4.0;
         }
      }

      var13 /= 6.0;
      this.field1671 = (int)(var13 * 256.0);
      this.field1672 = (int)(var15 * 256.0);
      this.field1677 = (int)(var17 * 256.0);
      if (this.field1672 < 0) {
         this.field1672 = 0;
      } else if (this.field1672 > 255) {
         this.field1672 = 255;
      }

      if (this.field1677 < 0) {
         this.field1677 = 0;
      } else if (this.field1677 > 255) {
         this.field1677 = 255;
      }

   }

   public static void method1117(class509 var0) {
      field1678 = var0;
   }

   public static void method1116() {
      field1673.method1180();
   }
}
