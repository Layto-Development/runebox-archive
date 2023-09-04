import java.util.ArrayList;

public class class343 extends class56 {
   static int field2738;
   static String field2736;
   int field2737;
   // $FF: synthetic field
   final class315 this$0;

   class343(class315 var1) {
      this.this$0 = var1;
      this.field2737 = -1;
   }

   void method608(class184 var1) {
      this.field2737 = var1.method1174();
   }

   void method607(class15 var1) {
      var1.method149(this.field2737);
   }

   static void method1790(ArrayList var0, int var1, int var2, int var3, int var4) {
      if (!var0.isEmpty()) {
         int var6 = (Integer)var0.get(0);
         if (var6 == -1 && !Client.field848) {
            class106.method792(0, 0);
         } else if (var6 != -1 && !class228.method1379(var6) && class4.field36.method2406() != 0) {
            ArrayList var7 = new ArrayList();

            for(int var8 = 0; var8 < var0.size(); ++var8) {
               var7.add(new class131(class303.field2520, (Integer)var0.get(var8), 0, class4.field36.method2406(), false));
            }

            if (Client.field848) {
               class228.field2106.clear();
               class228.field2106.addAll(var7);
               class228.method1383(var1, var2, var3, var4);
            } else {
               class228.method1377(var7, var1, var2, var3, var4, false);
            }
         }

      }
   }
}
