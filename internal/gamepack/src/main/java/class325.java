import java.util.HashSet;
import java.util.Set;

public class class325 implements class188 {
   static boolean field2627;
   static int field2628;
   static final class325 field2613;
   static final class325 field2614;
   static final class325 field2615;
   static final class325 field2616;
   static final class325 field2617;
   static final class325 field2618;
   static final class325 field2619;
   static final class325 field2620;
   static final class325 field2621;
   static final class325 field2622;
   static final class325 field2623;
   static final class325 field2624;
   static final class325 field2629;
   final int field2625;
   final Set field2626 = new HashSet();

   static {
      field2617 = new class325("", 0, new class163[]{class163.field1695, class163.field1693});
      field2613 = new class325("", 1, new class163[]{class163.field1692, class163.field1695, class163.field1693});
      field2614 = new class325("", 2, new class163[]{class163.field1692, class163.field1696, class163.field1695});
      field2629 = new class325("", 3, new class163[]{class163.field1692});
      field2616 = new class325("", 4);
      field2618 = new class325("", 5, new class163[]{class163.field1692, class163.field1695});
      field2619 = new class325("", 6, new class163[]{class163.field1695});
      field2622 = new class325("", 8, new class163[]{class163.field1692, class163.field1695});
      field2620 = new class325("", 9, new class163[]{class163.field1692, class163.field1696});
      field2621 = new class325("", 10, new class163[]{class163.field1692});
      field2615 = new class325("", 11, new class163[]{class163.field1692});
      field2623 = new class325("", 12, new class163[]{class163.field1692, class163.field1695});
      field2624 = new class325("", 13, new class163[]{class163.field1692});
      method1713();
   }

   class325(String var1, int var2) {
      this.field2625 = var2;
   }

   class325(String var1, int var2, class163[] var3) {
      this.field2625 = var2;
      class163[] var4 = var3;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class163 var6 = var4[var5];
         this.field2626.add(var6);
      }

   }

   public int method1195() {
      return this.field2625;
   }

   static class325[] method1713() {
      return new class325[]{field2615, field2624, field2616, field2620, field2622, field2629, field2621, field2623, field2618, field2613, field2619, field2614, field2617};
   }

   static void method1712(class230 var0) {
      if (var0.method1397() != Client.field603) {
         Client.field603 = var0.method1397();
         boolean var2 = var0.method1397();
         if (class71.field1140 != var2) {
            class71.field1141.method1848();
            class71.field1186.method1848();
            class71.field1143.method1848();
            class71.field1140 = var2;
         }
      }

      if (var0.field2129 != Client.field577) {
         class22 var4 = class331.field2666;
         int var3 = var0.field2129;
         if ((var3 & class38.field918.method1195()) != 0) {
            class409.field3154 = class398.method1926(var4, "logo_deadman_mode", "");
         } else if ((var3 & class38.field919.method1195()) != 0) {
            class409.field3154 = class398.method1926(var4, "logo_seasonal_mode", "");
         } else if ((var3 & class38.field897.method1195()) != 0) {
            class409.field3154 = class398.method1926(var4, "logo_speedrunning", "");
         } else {
            class409.field3154 = class398.method1926(var4, "logo", "");
         }
      }

      class381.field3055 = var0.field2136;
      Client.field576 = var0.field2133;
      Client.field577 = var0.field2129;
      class462.field3591 = var0.field2140;
      class91.field1287 = Client.field601 == 0 ? '\uaa4a' : '\u9c40' + var0.field2133;
      class382.field3062 = Client.field601 == 0 ? 443 : '\uc350' + var0.field2133;
      class245.field2206 = class91.field1287;
   }
}
