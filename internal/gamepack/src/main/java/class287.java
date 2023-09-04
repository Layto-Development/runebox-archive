import java.util.Iterator;

public class class287 extends class450 {
   static boolean field1972;

   public class287(class450 var1) {
      super(var1);
      super.field3555 = "StartSongTask";
   }

   public boolean method2101() {
      Iterator var2 = class469.field3716.iterator();

      while(var2.hasNext()) {
         class468 var3 = (class468)var2.next();
         if (null != var3 && !var3.field3706 && null != var3.field3705) {
            try {
               var3.field3705.method13();
               var3.field3705.method10(0);
               if (var3.field3709 != null) {
                  var3.field3705.method15(var3.field3709, var3.field3703);
               }

               var3.field3709 = null;
               var3.field3708 = null;
               var3.field3702 = null;
               var3.field3706 = true;
            } catch (Exception var5) {
               class431.method2006((String)null, var5);
               this.method2104(var5.getMessage());
               return true;
            }
         }
      }

      super.field3557 = true;
      return true;
   }
}
