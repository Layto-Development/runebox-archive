import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class338 {
   static String field2526;
   boolean field2524 = false;
   boolean[] field2522;
   /** @deprecated */
   @Deprecated
   String[] field2521;
   Map field2525;
   long field2523;

   class338() {
      int var1 = class85.field574.method2448(19);
      this.field2525 = new HashMap();
      this.field2522 = new boolean[var1];

      int var2;
      for(var2 = 0; var2 < var1; ++var2) {
         class333 var3 = class333.method1566(var2);
         this.field2522[var2] = var3.field2504;
      }

      var2 = 0;
      if (class85.field574.method2530(15)) {
         var2 = class85.field574.method2448(15);
      }

      this.field2521 = new String[var2];
      this.method1581();
   }

   void method1583(int var1, int var2) {
      this.field2525.put(var1, var2);
      if (this.field2522[var1]) {
         this.field2524 = true;
      }

   }

   int method1572(int var1) {
      Object var3 = this.field2525.get(var1);
      return var3 instanceof Integer ? (Integer)var3 : -1;
   }

   void method1580(int var1, String var2) {
      this.field2525.put(var1, var2);
   }

   String method1573(int var1) {
      Object var3 = this.field2525.get(var1);
      return var3 instanceof String ? (String)var3 : "";
   }

   /** @deprecated */
   @Deprecated
   void method1579(int var1, String var2) {
      this.field2521[var1] = var2;
   }

   /** @deprecated */
   @Deprecated
   String method1574(int var1) {
      return this.field2521[var1];
   }

   void method1582() {
      int var2;
      for(var2 = 0; var2 < this.field2522.length; ++var2) {
         if (!this.field2522[var2]) {
            this.field2525.remove(var2);
         }
      }

      for(var2 = 0; var2 < this.field2521.length; ++var2) {
         this.field2521[var2] = null;
      }

   }

   class390 method1575(boolean var1) {
      return class269.method1220("2", class376.field2687.field301, var1);
   }

   void method1576() {
      class390 var2 = this.method1575(true);

      try {
         int var3 = 3;
         int var4 = 0;
         Iterator var5 = this.field2525.entrySet().iterator();

         while(var5.hasNext()) {
            Map.Entry var6 = (Map.Entry)var5.next();
            int var7 = (Integer)var6.getKey();
            if (this.field2522[var7]) {
               Object var8 = var6.getValue();
               var3 += 3;
               if (var8 instanceof Integer) {
                  var3 += 4;
               } else if (var8 instanceof String) {
                  var3 += class366.method1717((String)var8);
               }

               ++var4;
            }
         }

         class366 var24 = new class366(var3);
         var24.method1643(2);
         var24.method1684(var4);
         Iterator var25 = this.field2525.entrySet().iterator();

         while(var25.hasNext()) {
            Map.Entry var26 = (Map.Entry)var25.next();
            int var27 = (Integer)var26.getKey();
            if (this.field2522[var27]) {
               var24.method1684(var27);
               Object var9 = var26.getValue();
               class377 var10 = class377.method1743(var9.getClass());
               var24.method1643(var10.field2692);
               Class var12 = var9.getClass();
               class377 var13 = class377.method1743(var12);
               if (var13 == null) {
                  throw new IllegalArgumentException();
               }

               class416 var11 = var13.field2694;
               var11.method1904(var9, var24);
            }
         }

         var2.method1780(var24.field2650, 0, var24.field2652);
      } catch (Exception var22) {
      } finally {
         try {
            var2.method1783();
         } catch (Exception var21) {
         }

      }

      this.field2524 = false;
      this.field2523 = class123.method471();
   }

   void method1581() {
      class390 var2 = this.method1575(false);

      try {
         byte[] var3 = new byte[(int)var2.method1781()];

         int var5;
         for(int var4 = 0; var4 < var3.length; var4 += var5) {
            var5 = var2.method1782(var3, var4, var3.length - var4);
            if (var5 == -1) {
               throw new EOFException();
            }
         }

         class366 var25 = new class366(var3);
         if (var25.field2650.length - var25.field2652 < 1) {
            return;
         }

         int var6 = var25.method1654();
         if (var6 < 0 || var6 > 2) {
            return;
         }

         int var7;
         int var8;
         int var9;
         int var10;
         if (var6 >= 2) {
            var7 = var25.method1703();

            for(var8 = 0; var8 < var7; ++var8) {
               var9 = var25.method1703();
               var10 = var25.method1654();
               class377 var11 = (class377)class1.method2(class377.method1745(), var10);
               Object var12 = var11.method1744(var25);
               if (var9 >= 0 && var9 < this.field2522.length && this.field2522[var9]) {
                  this.field2525.put(var9, var12);
               }
            }
         } else {
            var7 = var25.method1703();

            for(var8 = 0; var8 < var7; ++var8) {
               var9 = var25.method1703();
               var10 = var25.method1658();
               if (var9 >= 0 && var9 < this.field2522.length && this.field2522[var9]) {
                  this.field2525.put(var9, var10);
               }
            }

            var8 = var25.method1703();

            for(var9 = 0; var9 < var8; ++var9) {
               var25.method1703();
               var25.method1662();
            }
         }
      } catch (Exception var23) {
      } finally {
         try {
            var2.method1783();
         } catch (Exception var22) {
         }

      }

      this.field2524 = false;
   }

   void method1577() {
      if (this.field2524 && this.field2523 < class123.method471() - 60000L) {
         this.method1576();
      }

   }

   boolean method1578() {
      return this.field2524;
   }
}
