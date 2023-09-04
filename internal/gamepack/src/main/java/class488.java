import java.util.HashMap;

public class class488 {
   static int[] field3922;
   class509 field3921;
   class509 field3923;
   HashMap field3920;

   public class488(class509 var1, class509 var2) {
      this.field3923 = var1;
      this.field3921 = var2;
      this.field3920 = new HashMap();
   }

   public HashMap method2327(class467[] var1) {
      HashMap var3 = new HashMap();
      class467[] var4 = var1;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class467 var6 = var4[var5];
         if (this.field3920.containsKey(var6)) {
            var3.put(var6, this.field3920.get(var6));
         } else {
            class509 var8 = this.field3923;
            class509 var9 = this.field3921;
            String var10 = var6.field3694;
            class396 var7;
            if (!var8.method2444(var10, "")) {
               var7 = null;
            } else {
               int var11 = var8.method2447(var10);
               int var12 = var8.method2439(var11, "");
               var7 = class382.method1769(var8, var9, var11, var12);
            }

            if (null != var7) {
               this.field3920.put(var6, var7);
               var3.put(var6, var7);
            }
         }
      }

      return var3;
   }
}
