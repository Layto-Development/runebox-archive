import java.util.Iterator;

public class class432 extends class450 {
   static class62 field3372;

   public class432(class450 var1) {
      super(var1);
      super.field3555 = "AddRequestTask";
   }

   public boolean method2101() {
      while(!class469.field3723.isEmpty()) {
         class468 var2 = (class468)class469.field3723.peek();
         if (var2 == null) {
            class469.field3723.pop();
         } else {
            var2.field3705 = this.method2016();
            class469.field3716.add(var2);
            class469.field3723.pop();
         }
      }

      return true;
   }

   class5 method2016() {
      class5 var2 = null;
      Iterator var3 = class469.field3714.iterator();

      while(true) {
         class5 var4;
         do {
            do {
               if (!var3.hasNext()) {
                  if (null != var2) {
                     ++var2.field41;
                     if (var2.method37() == 0 && var2.method42()) {
                        var2.method47();
                        var2.method45();
                        var2.method10(0);
                     }
                  }

                  return var2;
               }

               var4 = (class5)var3.next();
            } while(var4 == null);
         } while(null != var2 && var2.field41 <= var4.field41 && (var4.method37() != 0 || !var4.method42()));

         var2 = var4;
      }
   }
}
