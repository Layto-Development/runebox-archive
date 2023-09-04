import java.util.ArrayList;
import java.util.Iterator;

public class class99 extends class450 {
   ArrayList field676;

   public class99(class450 var1, ArrayList var2) {
      super(var1);
      super.field3555 = "ClearRequestTask";
      this.field676 = var2;
   }

   public boolean method2101() {
      if (this.field676.isEmpty()) {
         return true;
      } else {
         Iterator var2 = this.field676.iterator();

         while(var2.hasNext()) {
            class468 var3 = (class468)var2.next();

            try {
               if (class469.field3716.contains(var3)) {
                  if (null == var3) {
                     class469.field3716.remove(var3);
                  } else {
                     if (var3.field3705.field41 > 0) {
                        --var3.field3705.field41;
                     }

                     if (0 == var3.field3705.field41) {
                        var3.field3705.method47();
                        var3.field3705.method45();
                        var3.field3705.method10(0);
                     }

                     int var4 = var3.field3699;
                     int var5 = var3.field3700;
                     Iterator var6 = class469.field3719.iterator();

                     while(var6.hasNext()) {
                        class122 var7 = (class122)var6.next();
                        var7.method470(var4, var5);
                     }

                     class469.field3716.remove(var3);
                  }
               }
            } catch (Exception var8) {
               class431.method2006((String)null, var8);
               this.method2104(var8.getMessage());
               class469.field3716.clear();
               return true;
            }
         }

         return true;
      }
   }
}
