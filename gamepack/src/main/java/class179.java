public class class179 extends class151 {
   public static class298 field1800;
   public static class364 field1801 = new class364(64);
   int field1802 = 0;
   public int field1803;
   public int field1804;
   public int field1805;
   public int field1806;

   public void method1104() {
      this.method1107(this.field1802);
   }

   public void method1105(class184 var1, int var2) {
      while(true) {
         int var4 = var1.readUnsignedByte();
         if (var4 == 0) {
            return;
         }

         this.method1106(var1, var4, var2);
      }
   }

   void method1106(class184 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field1802 = var1.method1181();
      }

   }

   void method1107(int var1) {
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
            var15 = (var11 - var9) / (var9 + var11);
         }

         if (var17 >= 0.5) {
            var15 = (var11 - var9) / (2.0 - var11 - var9);
         }

         if (var3 == var11) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if (var11 == var5) {
            var13 = (var7 - var3) / (var11 - var9) + 2.0;
         } else if (var11 == var7) {
            var13 = 4.0 + (var3 - var5) / (var11 - var9);
         }
      }

      var13 /= 6.0;
      this.field1804 = (int)(var15 * 256.0);
      this.field1803 = (int)(var17 * 256.0);
      if (this.field1804 < 0) {
         this.field1804 = 0;
      } else if (this.field1804 > 255) {
         this.field1804 = 255;
      }

      if (this.field1803 < 0) {
         this.field1803 = 0;
      } else if (this.field1803 > 255) {
         this.field1803 = 255;
      }

      if (var17 > 0.5) {
         this.field1805 = (int)((1.0 - var17) * var15 * 512.0);
      } else {
         this.field1805 = (int)(var15 * var17 * 512.0);
      }

      if (this.field1805 < 1) {
         this.field1805 = 1;
      }

      this.field1806 = (int)(var13 * (double)this.field1805);
   }

   public static void method1108(class298 var0) {
      field1800 = var0;
   }
}
