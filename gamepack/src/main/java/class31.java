import java.util.HashMap;

public class class31 {
   static int[] field573;
   class298 field572;
   class298 field574;
   HashMap field571;

   public class31(class298 var1, class298 var2) {
      this.field574 = var1;
      this.field572 = var2;
      this.field571 = new HashMap();
   }

   public HashMap method358(class344[] var1) {
      HashMap var3 = new HashMap();
      class344[] var4 = var1;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class344 var6 = var4[var5];
         if (this.field571.containsKey(var6)) {
            var3.put(var6, this.field571.get(var6));
         } else {
            class298 var8 = this.field574;
            class298 var9 = this.field572;
            String var10 = var6.field2743;
            class460 var7;
            if (!var8.method1651(var10, "")) {
               var7 = null;
            } else {
               int var11 = var8.method1654(var10);
               int var12 = var8.method1646(var11, "");
               var7 = class398.method1929(var8, var9, var11, var12);
            }

            if (null != var7) {
               this.field571.put(var6, var7);
               var3.put(var6, var7);
            }
         }
      }

      return var3;
   }
}
