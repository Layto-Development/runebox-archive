public abstract class class91 {
   static int field1287;
   double field1283 = 0.0;
   int field1284 = 0;
   int field1285 = 0;
   int field1286 = 0;

   class91(int var1, int var2) {
      this.field1286 = var1;
      this.field1284 = 0;
      this.field1285 = var2 >= 0 && var2 <= 27 ? var2 : 0;
      this.field1283 = method724(this.field1284, this.field1286, this.field1285);
   }

   public void method723() {
      if (this.field1284 < this.field1286) {
         ++this.field1284;
         this.field1283 = method724(this.field1284, this.field1286, this.field1285);
      }

   }

   double method722() {
      return this.field1283;
   }

   static double method724(int var0, int var1, int var2) {
      double var4 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0;
      if (!(var4 <= 0.0) && !(var4 >= 1.0)) {
         double var6;
         double var8;
         switch (var2) {
            case 0:
               return var4;
            case 1:
               return 1.0 - Math.cos(var4 * Math.PI / 2.0);
            case 2:
               return Math.sin(var4 * Math.PI / 2.0);
            case 3:
               return -(Math.cos(var4 * Math.PI) - 1.0) / 2.0;
            case 4:
               return var4 * var4;
            case 5:
               return 1.0 - (1.0 - var4) * (1.0 - var4);
            case 6:
               return var4 < 0.5 ? var4 * 2.0 * var4 : 1.0 - Math.pow(2.0 + var4 * -2.0, 2.0) / 2.0;
            case 7:
               return var4 * var4 * var4;
            case 8:
               return 1.0 - Math.pow(1.0 - var4, 3.0);
            case 9:
               return var4 < 0.5 ? var4 * var4 * 4.0 * var4 : 1.0 - Math.pow(2.0 + var4 * -2.0, 3.0) / 2.0;
            case 10:
               return var4 * var4 * var4 * var4;
            case 11:
               return 1.0 - Math.pow(1.0 - var4, 4.0);
            case 12:
               return var4 < 0.5 ? var4 * var4 * var4 * var4 * 8.0 : 1.0 - Math.pow(2.0 + var4 * -2.0, 4.0) / 2.0;
            case 13:
               return var4 * var4 * var4 * var4 * var4;
            case 14:
               return 1.0 - Math.pow(1.0 - var4, 5.0);
            case 15:
               return var4 < 0.5 ? var4 * var4 * 8.0 * var4 * var4 * var4 : 1.0 - Math.pow(var4 * -2.0 + 2.0, 5.0) / 2.0;
            case 16:
               return Math.pow(2.0, var4 * 10.0 - 10.0);
            case 17:
               return 1.0 - Math.pow(2.0, var4 * -10.0);
            case 18:
               return var4 < 0.5 ? Math.pow(2.0, 10.0 + var4 * 20.0) / 2.0 : (2.0 - Math.pow(2.0, 10.0 + var4 * -20.0)) / 2.0;
            case 19:
               return 1.0 - Math.sqrt(1.0 - Math.pow(var4, 2.0));
            case 20:
               return Math.sqrt(1.0 - Math.pow(var4 - 1.0, 2.0));
            case 21:
               return var4 < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(var4 * 2.0, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(2.0 + var4 * -2.0, 2.0)) + 1.0) / 2.0;
            case 22:
               var6 = 1.70158;
               var8 = 2.70158;
               return var4 * 2.70158 * var4 * var4 - var4 * 1.70158 * var4;
            case 23:
               var6 = 1.70158;
               var8 = 2.70158;
               return 1.0 + 2.70158 * Math.pow(var4 - 1.0, 3.0) + 1.70158 * Math.pow(var4 - 1.0, 2.0);
            case 24:
               var6 = 1.70158;
               var8 = 2.5949095;
               return var4 < 0.5 ? Math.pow(var4 * 2.0, 2.0) * (var4 * 7.189819 - 2.5949095) / 2.0 : (Math.pow(var4 * 2.0 - 2.0, 2.0) * (3.5949095 * (var4 * 2.0 - 2.0) + 2.5949095) + 2.0) / 2.0;
            case 25:
               var6 = 2.0943951023931953;
               return -Math.pow(2.0, var4 * 10.0 - 10.0) * Math.sin((var4 * 10.0 - 10.75) * 2.0943951023931953);
            case 26:
               var6 = 2.0943951023931953;
               return Math.pow(2.0, var4 * -10.0) * Math.sin(2.0943951023931953 * (var4 * 10.0 - 0.75)) + 1.0;
            case 27:
               var6 = 1.3962634015954636;
               var8 = Math.sin((var4 * 20.0 - 11.125) * 1.3962634015954636);
               return var4 < 0.5 ? -(Math.pow(2.0, var4 * 20.0 - 10.0) * var8) / 2.0 : Math.pow(2.0, 10.0 + var4 * -20.0) * var8 / 2.0 + 1.0;
            default:
               return var4;
         }
      } else {
         return var4 <= 0.0 ? 0.0 : 1.0;
      }
   }
}
