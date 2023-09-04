import java.util.ArrayList;

public class class175 extends class316 {
   static int field1428;
   static String field1426;
   int field1427;
   // $FF: synthetic field
   final class207 this$0;

   class175(class207 var1) {
      this.this$0 = var1;
      this.field1427 = -1;
   }

   void method1441(class366 var1) {
      this.field1427 = var1.method1703();
   }

   void method1440(class8 var1) {
      var1.method62(this.field1427);
   }

   static void method944(ArrayList var0, int var1, int var2, int var3, int var4) {
      if (!var0.isEmpty()) {
         int var6 = (Integer)var0.get(0);
         if (var6 == -1 && !Client.field1388) {
            class283.method1299(0, 0);
         } else if (var6 != -1 && !class469.method2208(var6) && class158.field1004.method510() != 0) {
            ArrayList var7 = new ArrayList();

            for(int var8 = 0; var8 < var0.size(); ++var8) {
               var7.add(new class468(class339.field2531, (Integer)var0.get(var8), 0, class158.field1004.method510(), false));
            }

            if (Client.field1388) {
               class469.field3717.clear();
               class469.field3717.addAll(var7);
               class469.method2212(var1, var2, var3, var4);
            } else {
               class469.method2206(var7, var1, var2, var3, var4, false);
            }
         }

      }
   }
}
