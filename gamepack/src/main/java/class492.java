public class class492 {
   float field3864;
   float field3865;
   float field3866;

   static {
      new class492(0.0F, 0.0F, 0.0F);
      new class492(1.0F, 1.0F, 1.0F);
      new class492(1.0F, 0.0F, 0.0F);
      new class492(0.0F, 1.0F, 0.0F);
      new class492(0.0F, 0.0F, 1.0F);
      method2389(100);
   }

   class492(float var1, float var2, float var3) {
      this.field3865 = var1;
      this.field3864 = var2;
      this.field3866 = var3;
   }

   final float method2387() {
      return (float)Math.sqrt((double)(this.field3865 * this.field3865 + this.field3864 * this.field3864 + this.field3866 * this.field3866));
   }

   public String toString() {
      return this.field3865 + ", " + this.field3864 + ", " + this.field3866;
   }

   static void method2389(int var0) {
   }

   static int method2388(int var0, class106 var1, boolean var2) {
      if (var0 == 6200) {
         class482.field3830 -= 2;
         Client.field849 = (short)class18.method198(class18.field200[class482.field3830]);
         if (Client.field849 <= 0) {
            Client.field849 = 256;
         }

         Client.field735 = (short)class18.method198(class18.field200[class482.field3830 + 1]);
         if (Client.field735 <= 0) {
            Client.field735 = 256;
         }

         return 1;
      } else if (var0 == 6201) {
         class482.field3830 -= 2;
         Client.field851 = (short)class18.field200[class482.field3830];
         if (Client.field851 <= 0) {
            Client.field851 = 256;
         }

         Client.field852 = (short)class18.field200[1 + class482.field3830];
         if (Client.field852 <= 0) {
            Client.field852 = 320;
         }

         return 1;
      } else if (var0 == 6202) {
         class482.field3830 -= 4;
         Client.field853 = (short)class18.field200[class482.field3830];
         if (Client.field853 <= 0) {
            Client.field853 = 1;
         }

         Client.field685 = (short)class18.field200[1 + class482.field3830];
         if (Client.field685 <= 0) {
            Client.field685 = 32767;
         } else if (Client.field685 < Client.field853) {
            Client.field685 = Client.field853;
         }

         Client.field855 = (short)class18.field200[2 + class482.field3830];
         if (Client.field855 <= 0) {
            Client.field855 = 1;
         }

         Client.field856 = (short)class18.field200[3 + class482.field3830];
         if (Client.field856 <= 0) {
            Client.field856 = 32767;
         } else if (Client.field856 < Client.field855) {
            Client.field856 = Client.field855;
         }

         return 1;
      } else if (var0 == 6203) {
         if (Client.field869 != null) {
            class126.method877(0, 0, Client.field869.field3689, Client.field869.field3666, false);
            class18.field200[++class482.field3830 - 1] = Client.field792;
            class18.field200[++class482.field3830 - 1] = Client.field667;
         } else {
            class18.field200[++class482.field3830 - 1] = -1;
            class18.field200[++class482.field3830 - 1] = -1;
         }

         return 1;
      } else if (var0 == 6204) {
         class18.field200[++class482.field3830 - 1] = Client.field851;
         class18.field200[++class482.field3830 - 1] = Client.field852;
         return 1;
      } else if (var0 == 6205) {
         class18.field200[++class482.field3830 - 1] = class18.method217(Client.field849);
         class18.field200[++class482.field3830 - 1] = class18.method217(Client.field735);
         return 1;
      } else if (var0 == 6220) {
         class18.field200[++class482.field3830 - 1] = 0;
         return 1;
      } else if (var0 == 6221) {
         class18.field200[++class482.field3830 - 1] = 0;
         return 1;
      } else if (var0 == 6222) {
         class18.field200[++class482.field3830 - 1] = class426.field3228;
         return 1;
      } else if (var0 == 6223) {
         class18.field200[++class482.field3830 - 1] = class456.field3562;
         return 1;
      } else {
         return 2;
      }
   }
}
