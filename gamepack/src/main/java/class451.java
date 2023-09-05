public class class451 extends class151 {
   public static class298 field3507;
   public static class364 field3502 = new class364(64);
   static class427[] field3497;
   public boolean field3498 = true;
   public int field3495 = -1;
   public int field3496 = 0;
   public int field3499 = -1;
   public int field3500;
   public int field3501;
   public int field3503;
   public int field3504;
   public int field3505;
   public int field3506;

   public void method2222() {
      if (this.field3499 != -1) {
         this.method2224(this.field3499);
         this.field3504 = this.field3500;
         this.field3503 = this.field3501;
         this.field3505 = this.field3506;
      }

      this.method2224(this.field3496);
   }

   public void method2223(class184 var1, int var2) {
      while(true) {
         int var4 = var1.readUnsignedByte();
         if (var4 == 0) {
            return;
         }

         this.method2221(var1, var4, var2);
      }
   }

   void method2221(class184 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field3496 = var1.method1181();
      } else if (var2 == 2) {
         this.field3495 = var1.readUnsignedByte();
      } else if (var2 == 5) {
         this.field3498 = false;
      } else if (var2 == 7) {
         this.field3499 = var1.method1181();
      } else if (var2 == 8) {
      }

   }

   void method2224(int var1) {
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
      this.field3500 = (int)(var13 * 256.0);
      this.field3501 = (int)(var15 * 256.0);
      this.field3506 = (int)(var17 * 256.0);
      if (this.field3501 < 0) {
         this.field3501 = 0;
      } else if (this.field3501 > 255) {
         this.field3501 = 255;
      }

      if (this.field3506 < 0) {
         this.field3506 = 0;
      } else if (this.field3506 > 255) {
         this.field3506 = 255;
      }

   }

   public static void method2226(class298 var0) {
      field3507 = var0;
   }

   public static void method2225() {
      field3502.method1848();
   }
}
