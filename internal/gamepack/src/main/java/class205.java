public class class205 {
   static class296 field1579;
   public int field1575;
   public int field1576;
   public int field1577;
   public int field1578;

   public class205(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   public class205(int var1, int var2, int var3, int var4) {
      this.method1062(var1, var2);
      this.method1063(var3, var4);
   }

   public void method1062(int var1, int var2) {
      this.field1578 = var1;
      this.field1576 = var2;
   }

   public void method1063(int var1, int var2) {
      this.field1577 = var1;
      this.field1575 = var2;
   }

   public boolean method1064(int var1, int var2, byte var3) {
      boolean var10000;
      if (var1 >= this.field1578 && var1 < this.field1577 + this.field1578) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         if (var2 >= this.field1576) {
            if (var3 >= -1) {
               throw new IllegalStateException();
            }

            if (var2 < this.field1576 + this.field1575) {
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

   public void method1065(class205 var1, class205 var2) {
      this.method1066(var1, var2);
      this.method1067(var1, var2);
   }

   void method1066(class205 var1, class205 var2) {
      var2.field1578 = this.field1578;
      var2.field1577 = this.field1577;
      if (this.field1578 < var1.field1578) {
         var2.field1577 = (var2.field1577 * 2133643001 - (var1.field1578 * 2133643001 - this.field1578 * 2133643001)) * -2074045623;
         var2.field1578 = var1.field1578;
      }

      if (var2.method1068() > var1.method1068()) {
         var2.field1577 -= var2.method1068() - var1.method1068();
      }

      if (var2.field1577 < 0) {
         var2.field1577 = 0;
      }

   }

   void method1067(class205 var1, class205 var2) {
      var2.field1576 = this.field1576;
      var2.field1575 = this.field1575;
      if (this.field1576 < var1.field1576) {
         var2.field1575 = (var2.field1575 * -584535177 - (var1.field1576 * -584535177 - this.field1576 * -584535177)) * 377886279;
         var2.field1576 = var1.field1576;
      }

      if (var2.method1070() > var1.method1070()) {
         var2.field1575 -= var2.method1070() - var1.method1070();
      }

      if (var2.field1575 < 0) {
         var2.field1575 = 0;
      }

   }

   int method1068() {
      return this.field1577 + this.field1578;
   }

   int method1070() {
      return this.field1576 + this.field1575;
   }

   static final boolean method1069(class322 var0) {
      int var2 = var0.field2184;
      if (var2 == 205) {
         Client.field1169 = 250;
         return true;
      } else {
         int var3;
         int var4;
         if (var2 >= 300 && var2 <= 313) {
            var3 = (var2 - 300) / 2;
            var4 = var2 & 1;
            Client.field1402.method1073(var3, var4 == 1);
         }

         if (var2 >= 314 && var2 <= 323) {
            var3 = (var2 - 314) / 2;
            var4 = var2 & 1;
            Client.field1402.method1074(var3, var4 == 1);
         }

         if (var2 == 324) {
            Client.field1402.method1081(0);
         }

         if (var2 == 325) {
            Client.field1402.method1081(1);
         }

         if (var2 == 326) {
            class53 var5 = class53.method226(class10.field140, Client.field1181.field3781);
            Client.field1402.method1075(var5.field435);
            Client.field1181.method2254(var5);
            return true;
         } else {
            return false;
         }
      }
   }
}
