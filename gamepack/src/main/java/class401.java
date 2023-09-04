import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TimeZone;

@class466
public final class class401 {
   static final HashMap field3115 = new HashMap();

   static {
      TimeZone var0;
      synchronized(field3115) {
         TimeZone var2 = (TimeZone)field3115.get("Europe/London");
         if (null == var2) {
            var2 = TimeZone.getTimeZone("Europe/London");
            field3115.put("Europe/London", var2);
         }

         var0 = var2;
      }

      Calendar.getInstance(var0);
   }

   class401() throws Throwable {
   }

   public static void method1966(int var0, byte var1) {
      if (!class228.field2105.isEmpty()) {
         if (var1 <= -1) {
            throw new IllegalStateException();
         }

         Iterator var2 = class228.field2105.iterator();

         while(var2.hasNext()) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }

            class131 var3 = (class131)var2.next();
            if (null != var3) {
               var3.field1547 = var0;
            }
         }

         class131 var4 = (class131)class228.field2105.get(0);
         if (var4 != null) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }

            if (var4.field1551 != null) {
               if (var1 <= -1) {
                  throw new IllegalStateException();
               }

               if (var4.field1551.method2203()) {
                  if (var1 <= -1) {
                     return;
                  }

                  if (!var4.field1556) {
                     if (var1 <= -1) {
                        throw new IllegalStateException();
                     }

                     var4.field1551.method2175(var0);
                     var4.field1544 = (float)var0;
                  }
               }
            }
         }
      }

   }
}
