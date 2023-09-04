import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class522 extends class306 {
   class377[] field4160;
   List field4161;

   public class522(class509 var1, int var2, int var3) {
      byte[] var4 = var1.method2422(var2, var3 + 1);
      this.method2507(new class366(var4));
   }

   public class522(class509 var1, int var2) {
      byte[] var3 = var1.method2422(var2, 0);
      this.method2507(new class366(var3));
   }

   void method2507(class366 var1) {
      int var3 = var1.method1670();
      this.field4160 = new class377[var3];
      this.field4161 = new ArrayList(var3);

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field4160[var4] = (class377)class1.method2(class377.method1745(), var1.method1654());
         int var5 = var1.method1670();
         HashMap var6 = new HashMap(var5);

         while(var5-- > 0) {
            Object var7 = this.field4160[var4].method1744(var1);
            int var8 = var1.method1670();
            ArrayList var9 = new ArrayList();

            while(var8-- > 0) {
               int var10 = var1.method1670();
               var9.add(var10);
            }

            var6.put(var7, var9);
         }

         this.field4161.add(var4, var6);
      }

   }

   public List method2508(Object var1, int var2) {
      if (var2 < 0) {
         var2 = 0;
      }

      Map var4 = (Map)this.field4161.get(var2);
      return (List)var4.get(var1);
   }
}
