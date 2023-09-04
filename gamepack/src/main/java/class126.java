import java.util.Comparator;

public class class126 implements Comparator {
   static class425[] field1525;
   static class64 field1523;
   static int field1522;
   boolean field1524;

   class126() {
   }

   int method878(class82 var1, class82 var2) {
      if (var2.field1257 == var1.field1257) {
         return 0;
      } else {
         if (this.field1524) {
            if (var1.field1257 == Client.field576) {
               return -1;
            }

            if (var2.field1257 == Client.field576) {
               return 1;
            }
         }

         return var1.field1257 < var2.field1257 ? -1 : 1;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method878((class82)var1, (class82)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static final void method877(int var0, int var1, int var2, int var3, boolean var4) {
      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var6 = var3 - 334;
      int var7;
      if (var6 < 0) {
         var7 = Client.field849;
      } else if (var6 >= 100) {
         var7 = Client.field735;
      } else {
         var7 = Client.field849 + var6 * (Client.field735 - Client.field849) / 100;
      }

      int var8 = 512 * var3 * var7 / (var2 * 334);
      int var9;
      int var10;
      short var17;
      if (var8 < Client.field855) {
         var17 = Client.field855;
         var7 = var2 * var17 * 334 / (var3 * 512);
         if (var7 > Client.field685) {
            var7 = Client.field685;
            var9 = var3 * var7 * 512 / (var17 * 334);
            var10 = (var2 - var9) / 2;
            if (var4) {
               class156.method948();
               class156.method954(var0, var1, var10, var3, -16777216);
               class156.method954(var0 + var2 - var10, var1, var10, var3, -16777216);
            }

            var0 += var10;
            var2 -= var10 * 2;
         }
      } else if (var8 > Client.field856) {
         var17 = Client.field856;
         var7 = var17 * var2 * 334 / (var3 * 512);
         if (var7 < Client.field853) {
            var7 = Client.field853;
            var9 = var17 * var2 * 334 / (var7 * 512);
            var10 = (var3 - var9) / 2;
            if (var4) {
               class156.method948();
               class156.method954(var0, var1, var2, var10, -16777216);
               class156.method954(var0, var3 + var1 - var10, var2, var10, -16777216);
            }

            var1 += var10;
            var3 -= var10 * 2;
         }
      }

      Client.field861 = var7 * var3 / 334;
      if (var2 != Client.field792 || Client.field667 != var3) {
         int[] var18 = new int[9];

         for(var10 = 0; var10 < var18.length; ++var10) {
            int var11 = var10 * 32 + 128 + 15;
            int var12 = Client.method476(var11);
            int var13 = class399.field3109[var11];
            int var15 = var3 - 334;
            if (var15 < 0) {
               var15 = 0;
            } else if (var15 > 100) {
               var15 = 100;
            }

            int var16 = Client.field851 + var15 * (Client.field852 - Client.field851) / 100;
            int var14 = var16 * var12 / 256;
            var18[var10] = var14 * var13 >> 16;
         }

         class175.method1063(var18, 500, 800, var2 * 334 / var3, 334);
      }

      Client.field857 = var0;
      Client.field858 = var1;
      Client.field792 = var2;
      Client.field667 = var3;
   }
}
