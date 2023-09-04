public class class143 {
   boolean field1599 = false;
   class298 field1597;
   int field1598 = 0;
   String field1596;

   class143(class298 var1) {
      this.field1597 = var1;
   }

   void method915(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         if (this.field1596 != var1) {
            this.field1596 = var1;
            this.field1598 = 0;
            this.field1599 = false;
            this.method916();
         }
      }
   }

   int method916() {
      if (this.field1596 == null) {
         this.field1598 = 100;
         this.field1599 = true;
      } else {
         if (this.field1598 < 33) {
            if (!this.field1597.method1649(class511.field3978.field3981, this.field1596)) {
               return this.field1598;
            }

            this.field1598 = 33;
         }

         if (this.field1598 == 33) {
            if (this.field1597.method1651(class511.field3977.field3981, this.field1596) && !this.field1597.method1649(class511.field3977.field3981, this.field1596)) {
               return this.field1598;
            }

            this.field1598 = 66;
         }

         if (this.field1598 == 66) {
            if (!this.field1597.method1649(this.field1596, class511.field3980.field3981)) {
               return this.field1598;
            }

            this.field1598 = 100;
            this.field1599 = true;
         }
      }

      return this.field1598;
   }

   boolean method917() {
      return this.field1599;
   }

   int method918() {
      return this.field1598;
   }
}
