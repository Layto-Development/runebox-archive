import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TimeZone;

@class293
public final class class15 {
   static final HashMap field199 = new HashMap();

   static {
      TimeZone var0;
      synchronized(field199) {
         TimeZone var2 = (TimeZone)field199.get("Europe/London");
         if (null == var2) {
            var2 = TimeZone.getTimeZone("Europe/London");
            field199.put("Europe/London", var2);
         }

         var0 = var2;
      }

      Calendar.getInstance(var0);
   }

   class15() throws Throwable {
   }

   public static void method95(int var0, byte var1) {
      if (!class469.field3716.isEmpty()) {
         if (var1 <= -1) {
            throw new IllegalStateException();
         }

         Iterator var2 = class469.field3716.iterator();

         while(var2.hasNext()) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }

            class468 var3 = (class468)var2.next();
            if (null != var3) {
               var3.field3701 = var0;
            }
         }

         class468 var4 = (class468)class469.field3716.get(0);
         if (var4 != null) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }

            if (var4.field3705 != null) {
               if (var1 <= -1) {
                  throw new IllegalStateException();
               }

               if (var4.field3705.method42()) {
                  if (var1 <= -1) {
                     return;
                  }

                  if (!var4.field3710) {
                     if (var1 <= -1) {
                        throw new IllegalStateException();
                     }

                     var4.field3705.method10(var0);
                     var4.field3698 = (float)var0;
                  }
               }
            }
         }
      }

   }
}
