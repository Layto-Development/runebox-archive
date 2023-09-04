import java.util.HashSet;
import java.util.Set;

public class class451 implements class42 {
   static boolean field3572;
   static int field3573;
   static final class451 field3558;
   static final class451 field3559;
   static final class451 field3560;
   static final class451 field3561;
   static final class451 field3562;
   static final class451 field3563;
   static final class451 field3564;
   static final class451 field3565;
   static final class451 field3566;
   static final class451 field3567;
   static final class451 field3568;
   static final class451 field3569;
   static final class451 field3574;
   final int field3570;
   final Set field3571 = new HashSet();

   static {
      field3562 = new class451("", 0, new class28[]{class28.field269, class28.field267});
      field3558 = new class451("", 1, new class28[]{class28.field266, class28.field269, class28.field267});
      field3559 = new class451("", 2, new class28[]{class28.field266, class28.field270, class28.field269});
      field3574 = new class451("", 3, new class28[]{class28.field266});
      field3561 = new class451("", 4);
      field3563 = new class451("", 5, new class28[]{class28.field266, class28.field269});
      field3564 = new class451("", 6, new class28[]{class28.field269});
      field3567 = new class451("", 8, new class28[]{class28.field266, class28.field269});
      field3565 = new class451("", 9, new class28[]{class28.field266, class28.field270});
      field3566 = new class451("", 10, new class28[]{class28.field266});
      field3560 = new class451("", 11, new class28[]{class28.field266});
      field3568 = new class451("", 12, new class28[]{class28.field266, class28.field269});
      field3569 = new class451("", 13, new class28[]{class28.field266});
      method2107();
   }

   class451(String var1, int var2) {
      this.field3570 = var2;
   }

   class451(String var1, int var2, class28[] var3) {
      this.field3570 = var2;
      class28[] var4 = var3;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class28 var6 = var4[var5];
         this.field3571.add(var6);
      }

   }

   public int method180() {
      return this.field3570;
   }

   static class451[] method2107() {
      return new class451[]{field3560, field3569, field3561, field3565, field3567, field3574, field3566, field3568, field3563, field3558, field3564, field3559, field3562};
   }

   static void method2106(class518 var0) {
      if (var0.method2480() != Client.field1143) {
         Client.field1143 = var0.method2480();
         boolean var2 = var0.method2480();
         if (class47.field360 != var2) {
            class47.field361.method1180();
            class47.field406.method1180();
            class47.field363.method1180();
            class47.field360 = var2;
         }
      }

      if (var0.field4142 != Client.field1117) {
         class534 var4 = class62.field492;
         int var3 = var0.field4142;
         if ((var3 & class145.field931.method180()) != 0) {
            class35.field308 = class382.method1766(var4, "logo_deadman_mode", "");
         } else if ((var3 & class145.field932.method180()) != 0) {
            class35.field308 = class382.method1766(var4, "logo_seasonal_mode", "");
         } else if ((var3 & class145.field910.method180()) != 0) {
            class35.field308 = class382.method1766(var4, "logo_speedrunning", "");
         } else {
            class35.field308 = class382.method1766(var4, "logo", "");
         }
      }

      class80.field555 = var0.field4149;
      Client.field1116 = var0.field4146;
      Client.field1117 = var0.field4142;
      class298.field2033 = var0.field4153;
      class12.field183 = 0 == Client.field1141 ? '\uaa4a' : '\u9c40' + var0.field4146;
      class249.field1797 = 0 == Client.field1141 ? 443 : '\uc350' + var0.field4146;
      class136.field853 = class12.field183;
   }
}
