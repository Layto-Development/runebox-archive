import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

public final class class477 extends Canvas {
   static class409 field3653;
   static class6 field3650;
   static int field3652;
   static long field3651;
   Component field3654;

   class477(Component var1) {
      this.field3654 = var1;
   }

   public final void update(Graphics var1) {
      this.field3654.update(var1);
   }

   public final void paint(Graphics var1) {
      this.field3654.paint(var1);
   }

   static final void method2312() {
      int var4;
      for(int var1 = 0; var1 < Client.field831; ++var1) {
         int var10002 = Client.field788[var1]--;
         if (Client.field788[var1] >= -10) {
            class404 var11 = Client.field620[var1];
            if (var11 == null) {
               class404 var10000 = (class404)null;
               var11 = class404.method1975(class57.field1081, Client.field832[var1], 0);
               if (null == var11) {
                  continue;
               }

               int[] var19 = Client.field788;
               var19[var1] += var11.method1974();
               Client.field620[var1] = var11;
            }

            if (Client.field788[var1] < 0) {
               int var3;
               if (Client.field583[var1] != 0) {
                  var4 = 128 * (Client.field583[var1] & 255);
                  int var5 = Client.field583[var1] >> 16 & 255;
                  int var6 = var5 * 128 + 64 - class259.field2281.field4028;
                  if (var6 < 0) {
                     var6 = -var6;
                  }

                  int var7 = Client.field583[var1] >> 8 & 255;
                  int var8 = 64 + var7 * 128 - class259.field2281.field3999;
                  if (var8 < 0) {
                     var8 = -var8;
                  }

                  int var9 = var8 + var6 - 128;
                  if (var9 > var4) {
                     Client.field788[var1] = -100;
                     continue;
                  }

                  if (var9 < 0) {
                     var9 = 0;
                  }

                  var3 = (var4 - var9) * class4.field36.method2432() / var4;
               } else {
                  var3 = class4.field36.method2414();
               }

               if (var3 > 0) {
                  class408 var14 = var11.method1973().method1981(class519.field4079);
                  class432 var15 = class432.method2105(var14, 100, var3);
                  var15.method2075(Client.field833[var1] - 1);
                  class514.field3985.method1525(var15);
               }

               Client.field788[var1] = -100;
            }
         } else {
            --Client.field831;

            for(int var2 = var1; var2 < Client.field831; ++var2) {
               Client.field832[var2] = Client.field832[var2 + 1];
               Client.field620[var2] = Client.field620[var2 + 1];
               Client.field833[var2] = Client.field833[var2 + 1];
               Client.field788[var2] = Client.field788[var2 + 1];
               Client.field583[var2] = Client.field583[var2 + 1];
            }

            --var1;
         }
      }

      if (Client.field848) {
         boolean var10;
         if (!class228.field2107.isEmpty()) {
            var10 = true;
         } else if (!class228.field2105.isEmpty() && class228.field2105.get(0) != null && ((class131)class228.field2105.get(0)).field1551 != null) {
            var10 = ((class131)class228.field2105.get(0)).field1551.method2203();
         } else {
            var10 = false;
         }

         if (!var10) {
            if (class4.field36.method2406() != 0) {
               boolean var12 = !class228.field2106.isEmpty();
               if (var12) {
                  class22 var13 = class303.field2520;
                  var4 = class4.field36.method2406();
                  if (!class228.field2106.isEmpty()) {
                     ArrayList var16 = new ArrayList();
                     Iterator var17 = class228.field2106.iterator();

                     while(var17.hasNext()) {
                        class131 var18 = (class131)var17.next();
                        var18.field1552 = false;
                        var18.field1550 = false;
                        var18.field1556 = false;
                        var18.field1553 = false;
                        var18.field1548 = var13;
                        var18.field1547 = var4;
                        var18.field1544 = 0.0F;
                        var16.add(var18);
                     }

                     class228.method1377(var16, class228.field2109, class228.field2110, class228.field2111, class228.field2102, false);
                  }
               }
            }

            Client.field848 = false;
         }
      }

   }
}
