public class class3 {
   float field5;
   float field6;
   float field7;

   static {
      new class3(0.0F, 0.0F, 0.0F);
      new class3(1.0F, 1.0F, 1.0F);
      new class3(1.0F, 0.0F, 0.0F);
      new class3(0.0F, 1.0F, 0.0F);
      new class3(0.0F, 0.0F, 1.0F);
      method7(100);
   }

   class3(float var1, float var2, float var3) {
      this.field6 = var1;
      this.field5 = var2;
      this.field7 = var3;
   }

   final float method5() {
      return (float)Math.sqrt((double)(this.field6 * this.field6 + this.field5 * this.field5 + this.field7 * this.field7));
   }

   public String toString() {
      return this.field6 + ", " + this.field5 + ", " + this.field7;
   }

   static void method7(int var0) {
   }

   static int method6(int var0, class283 var1, boolean var2) {
      if (var0 == 6200) {
         class41.field341 -= 2;
         Client.field1389 = (short)class197.method1020(class197.field1537[class41.field341]);
         if (Client.field1389 <= 0) {
            Client.field1389 = 256;
         }

         Client.field1275 = (short)class197.method1020(class197.field1537[class41.field341 + 1]);
         if (Client.field1275 <= 0) {
            Client.field1275 = 256;
         }

         return 1;
      } else if (var0 == 6201) {
         class41.field341 -= 2;
         Client.field1391 = (short)class197.field1537[class41.field341];
         if (Client.field1391 <= 0) {
            Client.field1391 = 256;
         }

         Client.field1392 = (short)class197.field1537[1 + class41.field341];
         if (Client.field1392 <= 0) {
            Client.field1392 = 320;
         }

         return 1;
      } else if (var0 == 6202) {
         class41.field341 -= 4;
         Client.field1393 = (short)class197.field1537[class41.field341];
         if (Client.field1393 <= 0) {
            Client.field1393 = 1;
         }

         Client.field1225 = (short)class197.field1537[1 + class41.field341];
         if (Client.field1225 <= 0) {
            Client.field1225 = 32767;
         } else if (Client.field1225 < Client.field1393) {
            Client.field1225 = Client.field1393;
         }

         Client.field1395 = (short)class197.field1537[2 + class41.field341];
         if (Client.field1395 <= 0) {
            Client.field1395 = 1;
         }

         Client.field1396 = (short)class197.field1537[3 + class41.field341];
         if (Client.field1396 <= 0) {
            Client.field1396 = 32767;
         } else if (Client.field1396 < Client.field1395) {
            Client.field1396 = Client.field1395;
         }

         return 1;
      } else if (var0 == 6203) {
         if (Client.field1409 != null) {
            class241.method1164(0, 0, Client.field1409.field2173, Client.field1409.field2150, false);
            class197.field1537[++class41.field341 - 1] = Client.field1332;
            class197.field1537[++class41.field341 - 1] = Client.field1207;
         } else {
            class197.field1537[++class41.field341 - 1] = -1;
            class197.field1537[++class41.field341 - 1] = -1;
         }

         return 1;
      } else if (var0 == 6204) {
         class197.field1537[++class41.field341 - 1] = Client.field1391;
         class197.field1537[++class41.field341 - 1] = Client.field1392;
         return 1;
      } else if (var0 == 6205) {
         class197.field1537[++class41.field341 - 1] = class197.method1039(Client.field1389);
         class197.field1537[++class41.field341 - 1] = class197.method1039(Client.field1275);
         return 1;
      } else if (var0 == 6220) {
         class197.field1537[++class41.field341 - 1] = 0;
         return 1;
      } else if (var0 == 6221) {
         class197.field1537[++class41.field341 - 1] = 0;
         return 1;
      } else if (var0 == 6222) {
         class197.field1537[++class41.field341 - 1] = class114.field730;
         return 1;
      } else if (var0 == 6223) {
         class197.field1537[++class41.field341 - 1] = class394.field2761;
         return 1;
      } else {
         return 2;
      }
   }
}
