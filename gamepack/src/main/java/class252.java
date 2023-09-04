import java.util.ArrayList;
import java.util.Iterator;

public class class252 extends class358 {
   ArrayList field2232;

   public class252(class358 var1, ArrayList var2) {
      super(var1);
      super.field2810 = "ClearRequestTask";
      this.field2232 = var2;
   }

   public boolean method1831() {
      if (this.field2232.isEmpty()) {
         return true;
      } else {
         Iterator var2 = this.field2232.iterator();

         while(var2.hasNext()) {
            class131 var3 = (class131)var2.next();

            try {
               if (class228.field2105.contains(var3)) {
                  if (null == var3) {
                     class228.field2105.remove(var3);
                  } else {
                     if (var3.field1551.field3433 > 0) {
                        --var3.field1551.field3433;
                     }

                     if (var3.field1551.field3433 == 0) {
                        var3.field1551.method2207();
                        var3.field1551.method2205();
                        var3.field1551.method2175(0);
                     }

                     int var4 = var3.field1545;
                     int var5 = var3.field1546;
                     Iterator var6 = class228.field2108.iterator();

                     while(var6.hasNext()) {
                        class285 var7 = (class285)var6.next();
                        var7.method1598(var4, var5);
                     }

                     class228.field2105.remove(var3);
                  }
               }
            } catch (Exception var8) {
               class194.method1208((String)null, var8);
               this.method1834(var8.getMessage());
               class228.field2105.clear();
               return true;
            }
         }

         return true;
      }
   }
}
