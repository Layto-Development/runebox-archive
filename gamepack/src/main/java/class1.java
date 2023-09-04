import java.util.Iterator;

public class class1 extends class358 {
   class298 field1;
   class298 field2;
   class298 field3;

   public class1(class358 var1, class298 var2, class298 var3, class298 var4) {
      super(var1);
      this.field1 = var2;
      this.field2 = var3;
      this.field3 = var4;
      super.field2810 = "LoadSongTask";
   }

   public boolean method1831() {
      int var2 = 0;
      Iterator var3 = class228.field2105.iterator();

      while(true) {
         while(var3.hasNext()) {
            class131 var4 = (class131)var3.next();
            if (null != var4 && var4.field1551.field3433 > 1 && var4.field1551.method2180()) {
               this.method1834("Attempted to load patches of already loading midiplayer!");
               return true;
            }

            if (var4 != null && !var4.field1550) {
               try {
                  if (null != var4.field1548 && var4.field1545 != -1 && var4.field1546 != -1) {
                     if (null == var4.field1555) {
                        var4.field1555 = class362.method1846(var4.field1548, var4.field1545, var4.field1546);
                        if (null == var4.field1555) {
                           continue;
                        }
                     }

                     if (null == var4.field1554) {
                        var4.field1554 = new class482(this.field3, this.field2);
                     }

                     if (var4.field1551.method2176(var4.field1555, this.field1, var4.field1554)) {
                        ++var2;
                        var4.field1550 = true;
                        var4.field1551.method2177();
                     }
                  } else {
                     ++var2;
                  }
               } catch (Exception var6) {
                  class194.method1208((String)null, var6);
                  this.method1834(var6.getMessage());
                  return true;
               }
            } else {
               ++var2;
            }
         }

         if (var2 == class228.field2105.size()) {
            return true;
         }

         return false;
      }
   }
}
