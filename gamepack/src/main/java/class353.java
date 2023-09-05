import java.util.ArrayList;
import java.util.Iterator;

public class class353 {
   static long field2777;
   static final class353 field2774 = new class353(0);
   static final class353 field2776 = new class353(1);
   final int field2775;

   class353(int var1) {
      this.field2775 = var1;
   }

   static void method1815(ArrayList var0, boolean var1) {
      if (!var1) {
         class228.field2106.clear();
      }

      Iterator var3 = var0.iterator();

      while(var3.hasNext()) {
         class131 var4 = (class131)var3.next();
         if (var4.field1545 != -1 && var4.field1546 != -1) {
            if (!var1) {
               class228.field2106.add(var4);
            }

            class228.field2112.add(var4);
         }
      }

   }

   static void method1816(int var0) {
      Client.field806 = 0L;
      if (var0 >= 2) {
         Client.field807 = true;
      } else {
         Client.field807 = false;
      }

      if (Client.method484() == 1) {
         class191.field1877.method1266(765, 503);
      } else {
         class191.field1877.method1266(7680, 2160);
      }

      if (Client.gameState >= 25) {
         Client.method422();
      }

   }
}
