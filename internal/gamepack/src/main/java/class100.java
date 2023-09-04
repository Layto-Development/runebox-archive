public class class100 {
   boolean field680 = false;
   class509 field678;
   int field679 = 0;
   String field677;

   class100(class509 var1) {
      this.field678 = var1;
   }

   void method375(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         if (this.field677 != var1) {
            this.field677 = var1;
            this.field679 = 0;
            this.field680 = false;
            this.method376();
         }
      }
   }

   int method376() {
      if (this.field677 == null) {
         this.field679 = 100;
         this.field680 = true;
      } else {
         if (this.field679 < 33) {
            if (!this.field678.method2442(class75.field546.field549, this.field677)) {
               return this.field679;
            }

            this.field679 = 33;
         }

         if (33 == this.field679) {
            if (this.field678.method2444(class75.field545.field549, this.field677) && !this.field678.method2442(class75.field545.field549, this.field677)) {
               return this.field679;
            }

            this.field679 = 66;
         }

         if (this.field679 == 66) {
            if (!this.field678.method2442(this.field677, class75.field548.field549)) {
               return this.field679;
            }

            this.field679 = 100;
            this.field680 = true;
         }
      }

      return this.field679;
   }

   boolean method377() {
      return this.field680;
   }

   int method378() {
      return this.field679;
   }
}
