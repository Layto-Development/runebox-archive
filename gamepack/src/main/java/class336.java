public class class336 extends class56 {
   static class427 field2689;
   static Thread field2692;
   int field2691;
   long field2690;
   // $FF: synthetic field
   final class315 this$0;

   class336(class315 var1) {
      this.this$0 = var1;
   }

   void method608(class184 var1) {
      this.field2691 = var1.method1129();
      this.field2690 = var1.method1130();
   }

   void method607(class15 var1) {
      var1.method155(this.field2691, this.field2690);
   }

   static final void method1774() {
      for(class493 var1 = (class493)Client.field846.method1236(); var1 != null; var1 = (class493)Client.field846.method1238()) {
         if (var1.field3869 == class192.field1881 && !var1.field3875) {
            if (Client.field879 >= var1.field3868) {
               var1.method2390(Client.field655);
               if (var1.field3875) {
                  var1.method605();
               } else {
                  class75.field1223.method1034(var1.field3869, var1.field3870, var1.field3871, var1.field3867, 60, var1, 0, -1L, false);
               }
            }
         } else {
            var1.method605();
         }
      }

   }
}
