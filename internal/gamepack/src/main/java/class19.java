import java.util.Iterator;

public class class19 extends class450 {
   class509 field210;
   class509 field211;
   class509 field212;

   public class19(class450 var1, class509 var2, class509 var3, class509 var4) {
      super(var1);
      this.field210 = var2;
      this.field211 = var3;
      this.field212 = var4;
      super.field3555 = "LoadSongTask";
   }

   public boolean method2101() {
      int var2 = 0;
      Iterator var3 = class469.field3716.iterator();

      while(true) {
         while(var3.hasNext()) {
            class468 var4 = (class468)var3.next();
            if (null != var4 && var4.field3705.field41 > 1 && var4.field3705.method16()) {
               this.method2104("Attempted to load patches of already loading midiplayer!");
               return true;
            }

            if (var4 != null && !var4.field3704) {
               try {
                  if (null != var4.field3702 && var4.field3699 != -1 && var4.field3700 != -1) {
                     if (null == var4.field3709) {
                        var4.field3709 = class147.method562(var4.field3702, var4.field3699, var4.field3700);
                        if (null == var4.field3709) {
                           continue;
                        }
                     }

                     if (null == var4.field3708) {
                        var4.field3708 = new class41(this.field212, this.field211);
                     }

                     if (var4.field3705.method11(var4.field3709, this.field210, var4.field3708)) {
                        ++var2;
                        var4.field3704 = true;
                        var4.field3705.method12();
                     }
                  } else {
                     ++var2;
                  }
               } catch (Exception var6) {
                  class431.method2006((String)null, var6);
                  this.method2104(var6.getMessage());
                  return true;
               }
            } else {
               ++var2;
            }
         }

         if (var2 == class469.field3716.size()) {
            return true;
         }

         return false;
      }
   }
}
