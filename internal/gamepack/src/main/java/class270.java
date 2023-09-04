public class class270 extends class316 {
   static class296 field1889;
   static Thread field1892;
   int field1891;
   long field1890;
   // $FF: synthetic field
   final class207 this$0;

   class270(class207 var1) {
      this.this$0 = var1;
   }

   void method1441(class366 var1) {
      this.field1891 = var1.method1658();
      this.field1890 = var1.method1659();
   }

   void method1440(class8 var1) {
      var1.method68(this.field1891, this.field1890);
   }

   static final void method1226() {
      for(class149 var1 = (class149)Client.field1386.method1991(); var1 != null; var1 = (class149)Client.field1386.method1993()) {
         if (var1.field950 == class156.field980 && !var1.field956) {
            if (Client.field1419 >= var1.field949) {
               var1.method567(Client.field1195);
               if (var1.field956) {
                  var1.method295();
               } else {
                  class137.field875.method1843(var1.field950, var1.field951, var1.field952, var1.field948, 60, var1, 0, -1L, false);
               }
            }
         } else {
            var1.method295();
         }
      }

   }
}
