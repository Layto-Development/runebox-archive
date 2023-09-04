import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

public final class class512 extends Canvas {
   static class121 field4083;
   static class35 field4086;
   static int field4085;
   static long field4084;
   Component field4087;

   class512(Component var1) {
      this.field4087 = var1;
   }

   public final void update(Graphics var1) {
      this.field4087.update(var1);
   }

   public final void paint(Graphics var1) {
      this.field4087.paint(var1);
   }

   static final void method2452() {
      int var4;
      for(int var1 = 0; var1 < Client.field1371; ++var1) {
         int var10002 = Client.field1328[var1]--;
         if (Client.field1328[var1] >= -10) {
            class314 var11 = Client.field1160[var1];
            if (var11 == null) {
               class314 var10000 = (class314)null;
               var11 = class314.method1437(class150.field960, Client.field1372[var1], 0);
               if (null == var11) {
                  continue;
               }

               int[] var19 = Client.field1328;
               var19[var1] += var11.method1436();
               Client.field1160[var1] = var11;
            }

            if (Client.field1328[var1] < 0) {
               int var3;
               if (Client.field1123[var1] != 0) {
                  var4 = 128 * (Client.field1123[var1] & 255);
                  int var5 = Client.field1123[var1] >> 16 & 255;
                  int var6 = var5 * 128 + 64 - class266.field1874.field3403;
                  if (var6 < 0) {
                     var6 = -var6;
                  }

                  int var7 = Client.field1123[var1] >> 8 & 255;
                  int var8 = 64 + var7 * 128 - class266.field1874.field3374;
                  if (var8 < 0) {
                     var8 = -var8;
                  }

                  int var9 = var8 + var6 - 128;
                  if (var9 > var4) {
                     Client.field1328[var1] = -100;
                     continue;
                  }

                  if (var9 < 0) {
                     var9 = 0;
                  }

                  var3 = (var4 - var9) * class158.field1004.method536() / var4;
               } else {
                  var3 = class158.field1004.method518();
               }

               if (var3 > 0) {
                  class404 var14 = var11.method1435().method1829(class193.field1516);
                  class271 var15 = class271.method1266(var14, 100, var3);
                  var15.method1232(Client.field1373[var1] - 1);
                  class262.field1860.method586(var15);
               }

               Client.field1328[var1] = -100;
            }
         } else {
            --Client.field1371;

            for(int var2 = var1; var2 < Client.field1371; ++var2) {
               Client.field1372[var2] = Client.field1372[var2 + 1];
               Client.field1160[var2] = Client.field1160[var2 + 1];
               Client.field1373[var2] = Client.field1373[var2 + 1];
               Client.field1328[var2] = Client.field1328[var2 + 1];
               Client.field1123[var2] = Client.field1123[var2 + 1];
            }

            --var1;
         }
      }

      if (Client.field1388) {
         boolean var10;
         if (!class469.field3718.isEmpty()) {
            var10 = true;
         } else if (!class469.field3716.isEmpty() && class469.field3716.get(0) != null && ((class468)class469.field3716.get(0)).field3705 != null) {
            var10 = ((class468)class469.field3716.get(0)).field3705.method42();
         } else {
            var10 = false;
         }

         if (!var10) {
            if (class158.field1004.method510() != 0) {
               boolean var12 = !class469.field3717.isEmpty();
               if (var12) {
                  class534 var13 = class339.field2531;
                  var4 = class158.field1004.method510();
                  if (!class469.field3717.isEmpty()) {
                     ArrayList var16 = new ArrayList();
                     Iterator var17 = class469.field3717.iterator();

                     while(var17.hasNext()) {
                        class468 var18 = (class468)var17.next();
                        var18.field3706 = false;
                        var18.field3704 = false;
                        var18.field3710 = false;
                        var18.field3707 = false;
                        var18.field3702 = var13;
                        var18.field3701 = var4;
                        var18.field3698 = 0.0F;
                        var16.add(var18);
                     }

                     class469.method2206(var16, class469.field3720, class469.field3721, class469.field3722, class469.field3713, false);
                  }
               }
            }

            Client.field1388 = false;
         }
      }

   }
}
