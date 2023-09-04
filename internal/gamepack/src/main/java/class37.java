import java.util.ArrayList;
import java.util.Iterator;

public class class37 {
   static long field318;
   static final class37 field315 = new class37(0);
   static final class37 field317 = new class37(1);
   final int field316;

   class37(int var1) {
      this.field316 = var1;
   }

   static void method157(ArrayList var0, boolean var1) {
      if (!var1) {
         class469.field3717.clear();
      }

      Iterator var3 = var0.iterator();

      while(var3.hasNext()) {
         class468 var4 = (class468)var3.next();
         if (var4.field3699 != -1 && -1 != var4.field3700) {
            if (!var1) {
               class469.field3717.add(var4);
            }

            class469.field3723.add(var4);
         }
      }

   }

   static void method158(int var0) {
      Client.field1346 = 0L;
      if (var0 >= 2) {
         Client.field1347 = true;
      } else {
         Client.field1347 = false;
      }

      if (Client.method868() == 1) {
         class530.field4182.method2536(765, 503);
      } else {
         class530.field4182.method2536(7680, 2160);
      }

      if (Client.field1200 >= 25) {
         Client.method806();
      }

   }
}
