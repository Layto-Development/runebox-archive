import java.util.ArrayList;

public class class452 extends class450 {
   ArrayList field3575;

   public class452(class450 var1, ArrayList var2) {
      super(var1);
      this.field3575 = var2;
      super.field3555 = "ConcurrentMidiTask";
   }

   public boolean method2101() {
      for(int var2 = 0; var2 < this.field3575.size(); ++var2) {
         class450 var3 = (class450)this.field3575.get(var2);
         if (var3 == null) {
            this.field3575.remove(var2);
            --var2;
         } else if (var3.method2101()) {
            if (var3.method2102()) {
               this.method2104(var3.method2100());
               this.field3575.clear();
               return true;
            }

            if (var3.method2103() != null) {
               this.field3575.add(var3.method2103());
            }

            super.field3557 = var3.field3557;
            this.field3575.remove(var2);
            --var2;
         }
      }

      if (this.field3575.isEmpty()) {
         return true;
      } else {
         return false;
      }
   }
}
