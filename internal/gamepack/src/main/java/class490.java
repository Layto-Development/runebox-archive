import java.util.Comparator;

class class490 implements Comparator {
   static class298 field3860;
   // $FF: synthetic field
   final class354 this$0;

   class490(class354 var1) {
      this.this$0 = var1;
   }

   int method2386(class312 var1, class312 var2) {
      if (var1.field2560 > var2.field2560) {
         return 1;
      } else {
         return var1.field2560 < var2.field2560 ? -1 : 0;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2386((class312)var1, (class312)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
