import java.util.Iterator;

public class class485 extends class358 {
   static boolean field3840;

   public class485(class358 var1) {
      super(var1);
      super.field2810 = "StartSongTask";
   }

   public boolean method1831() {
      Iterator var2 = class228.field2105.iterator();

      while(var2.hasNext()) {
         class131 var3 = (class131)var2.next();
         if (null != var3 && !var3.field1552 && null != var3.field1551) {
            try {
               var3.field1551.method2178();
               var3.field1551.method2175(0);
               if (var3.field1555 != null) {
                  var3.field1551.method2179(var3.field1555, var3.field1549);
               }

               var3.field1555 = null;
               var3.field1554 = null;
               var3.field1548 = null;
               var3.field1552 = true;
            } catch (Exception var5) {
               class194.method1208((String)null, var5);
               this.method1834(var5.getMessage());
               return true;
            }
         }
      }

      super.field2812 = true;
      return true;
   }
}
