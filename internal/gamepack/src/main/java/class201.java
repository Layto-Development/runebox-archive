public class class201 {
   class55 field1934;
   public class55 field1935 = new class55();

   public class201() {
      this.field1935.field1077 = this.field1935;
      this.field1935.field1079 = this.field1935;
   }

   public void method1232() {
      while(true) {
         class55 var1 = this.field1935.field1077;
         if (var1 == this.field1935) {
            this.field1934 = null;
            return;
         }

         var1.method605();
      }
   }

   public void method1240(class55 var1) {
      if (var1.field1079 != null) {
         var1.method605();
      }

      var1.field1079 = this.field1935.field1079;
      var1.field1077 = this.field1935;
      var1.field1079.field1077 = var1;
      var1.field1077.field1079 = var1;
   }

   public void method1241(class55 var1) {
      if (var1.field1079 != null) {
         var1.method605();
      }

      var1.field1079 = this.field1935;
      var1.field1077 = this.field1935.field1077;
      var1.field1079.field1077 = var1;
      var1.field1077.field1079 = var1;
   }

   public class55 method1234() {
      class55 var1 = this.field1935.field1077;
      if (var1 == this.field1935) {
         return null;
      } else {
         var1.method605();
         return var1;
      }
   }

   public class55 method1235() {
      class55 var1 = this.field1935.field1079;
      if (var1 == this.field1935) {
         return null;
      } else {
         var1.method605();
         return var1;
      }
   }

   public class55 method1236() {
      class55 var1 = this.field1935.field1077;
      if (var1 == this.field1935) {
         this.field1934 = null;
         return null;
      } else {
         this.field1934 = var1.field1077;
         return var1;
      }
   }

   public class55 method1237() {
      class55 var1 = this.field1935.field1079;
      if (var1 == this.field1935) {
         this.field1934 = null;
         return null;
      } else {
         this.field1934 = var1.field1079;
         return var1;
      }
   }

   public class55 method1238() {
      class55 var1 = this.field1934;
      if (var1 == this.field1935) {
         this.field1934 = null;
         return null;
      } else {
         this.field1934 = var1.field1077;
         return var1;
      }
   }

   public class55 method1242() {
      class55 var1 = this.field1934;
      if (var1 == this.field1935) {
         this.field1934 = null;
         return null;
      } else {
         this.field1934 = var1.field1079;
         return var1;
      }
   }

   public boolean method1239() {
      return this.field1935.field1077 == this.field1935;
   }

   public static void method1233(class55 var0, class55 var1) {
      if (var0.field1079 != null) {
         var0.method605();
      }

      var0.field1079 = var1.field1079;
      var0.field1077 = var1;
      var0.field1079.field1077 = var0;
      var0.field1077.field1079 = var0;
   }
}
