public class class119 {
   static class427 field1486;
   public int field1482;
   public int field1483;
   public int field1484;
   public int field1485;

   public class119(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   public class119(int var1, int var2, int var3, int var4) {
      this.method825(var1, var2);
      this.method826(var3, var4);
   }

   public void method825(int var1, int var2) {
      this.field1485 = var1;
      this.field1483 = var2;
   }

   public void method826(int var1, int var2) {
      this.field1484 = var1;
      this.field1482 = var2;
   }

   public boolean method827(int var1, int var2, byte var3) {
      boolean var10000;
      if (var1 >= this.field1485 && var1 < this.field1484 + this.field1485) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         if (var2 >= this.field1483) {
            if (var3 >= -1) {
               throw new IllegalStateException();
            }

            if (var2 < this.field1483 + this.field1482) {
               var10000 = true;
               return var10000;
            }
         }
      }

      var10000 = false;
      return var10000;
   }

   public String toString() {
      return null;
   }

   public void method828(class119 var1, class119 var2) {
      this.method829(var1, var2);
      this.method830(var1, var2);
   }

   void method829(class119 var1, class119 var2) {
      var2.field1485 = this.field1485;
      var2.field1484 = this.field1484;
      if (this.field1485 < var1.field1485) {
         var2.field1484 = (var2.field1484 * 2133643001 - (var1.field1485 * 2133643001 - this.field1485 * 2133643001)) * -2074045623;
         var2.field1485 = var1.field1485;
      }

      if (var2.method831() > var1.method831()) {
         var2.field1484 -= var2.method831() - var1.method831();
      }

      if (var2.field1484 < 0) {
         var2.field1484 = 0;
      }

   }

   void method830(class119 var1, class119 var2) {
      var2.field1483 = this.field1483;
      var2.field1482 = this.field1482;
      if (this.field1483 < var1.field1483) {
         var2.field1482 = (var2.field1482 * -584535177 - (var1.field1483 * -584535177 - this.field1483 * -584535177)) * 377886279;
         var2.field1483 = var1.field1483;
      }

      if (var2.method833() > var1.method833()) {
         var2.field1482 -= var2.method833() - var1.method833();
      }

      if (var2.field1482 < 0) {
         var2.field1482 = 0;
      }

   }

   int method831() {
      return this.field1484 + this.field1485;
   }

   int method833() {
      return this.field1483 + this.field1482;
   }

   static final boolean method832(class480 var0) {
      int var2 = var0.field3700;
      if (var2 == 205) {
         Client.field629 = 250;
         return true;
      } else {
         int var3;
         int var4;
         if (var2 >= 300 && var2 <= 313) {
            var3 = (var2 - 300) / 2;
            var4 = var2 & 1;
            Client.field862.method1387(var3, var4 == 1);
         }

         if (var2 >= 314 && var2 <= 323) {
            var3 = (var2 - 314) / 2;
            var4 = var2 & 1;
            Client.field862.method1388(var3, var4 == 1);
         }

         if (var2 == 324) {
            Client.field862.method1395(0);
         }

         if (var2 == 325) {
            Client.field862.method1395(1);
         }

         if (var2 == 326) {
            class335 var5 = class335.method1773(class46.field992, Client.field641.field2758);
            Client.field862.method1389(var5.field2686);
            Client.field641.method1797(var5);
            return true;
         } else {
            return false;
         }
      }
   }
}
