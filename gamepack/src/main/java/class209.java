import java.util.Iterator;

public class class209 extends class358 {
   static class331 field1963;

   public class209(class358 var1) {
      super(var1);
      super.field2810 = "AddRequestTask";
   }

   public boolean method1831() {
      while(!class228.field2112.isEmpty()) {
         class131 var2 = (class131)class228.field2112.peek();
         if (var2 == null) {
            class228.field2112.pop();
         } else {
            var2.field1551 = this.method1265();
            class228.field2105.add(var2);
            class228.field2112.pop();
         }
      }

      return true;
   }

   class448 method1265() {
      class448 var2 = null;
      Iterator var3 = class228.field2103.iterator();

      while(true) {
         class448 var4;
         do {
            do {
               if (!var3.hasNext()) {
                  if (null != var2) {
                     ++var2.field3433;
                     if (var2.method2198() == 0 && var2.method2203()) {
                        var2.method2207();
                        var2.method2205();
                        var2.method2175(0);
                     }
                  }

                  return var2;
               }

               var4 = (class448)var3.next();
            } while(var4 == null);
         } while(null != var2 && var2.field3433 <= var4.field3433 && (var4.method2198() != 0 || !var4.method2203()));

         var2 = var4;
      }
   }
}
