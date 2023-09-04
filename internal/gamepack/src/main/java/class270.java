import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class270 extends class151 {
   class247[] field2313;
   List field2314;

   public class270(class298 var1, int var2, int var3) {
      byte[] var4 = var1.method1629(var2, var3 + 1);
      this.method1516(new class184(var4));
   }

   public class270(class298 var1, int var2) {
      byte[] var3 = var1.method1629(var2, 0);
      this.method1516(new class184(var3));
   }

   void method1516(class184 var1) {
      int var3 = var1.method1141();
      this.field2313 = new class247[var3];
      this.field2314 = new ArrayList(var3);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field2313[var4] = (class247)class341.method1788(class247.method1450(), var1.method1125());
         int var5 = var1.method1141();
         HashMap var6 = new HashMap(var5);

         while(var5-- > 0) {
            Object var7 = this.field2313[var4].method1449(var1);
            int var8 = var1.method1141();
            ArrayList var9 = new ArrayList();

            while(var8-- > 0) {
               int var10 = var1.method1141();
               var9.add(var10);
            }

            var6.put(var7, var9);
         }

         this.field2314.add(var4, var6);
      }

   }

   public List method1517(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var4 = (Map)this.field2314.get(var2);
      return (List)var4.get(var1);
   }
}
