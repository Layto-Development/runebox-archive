public class class21 extends class306 {
   public static class509 field215;
   public static class509 field216;
   public static int field218;
   static class245 field224 = new class245(64);
   int[] field220;
   int[] field226 = new int[]{-1, -1, -1, -1, -1};
   short[] field217;
   short[] field221;
   short[] field222;
   short[] field223;
   public boolean field225 = false;
   public int field219 = -1;

   class21() {
   }

   void method113(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         this.method112(var1, var3);
      }
   }

   void method112(class366 var1, int var2) {
      if (var2 == 1) {
         this.field219 = var1.method1654();
      } else {
         int var4;
         int var5;
         if (var2 == 2) {
            var4 = var1.method1654();
            this.field220 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field220[var5] = var1.method1703();
            }
         } else if (var2 == 3) {
            this.field225 = true;
         } else if (var2 == 40) {
            var4 = var1.method1654();
            this.field221 = new short[var4];
            this.field222 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field221[var5] = (short)var1.method1703();
               this.field222[var5] = (short)var1.method1703();
            }
         } else if (var2 == 41) {
            var4 = var1.method1654();
            this.field223 = new short[var4];
            this.field217 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field223[var5] = (short)var1.method1703();
               this.field217[var5] = (short)var1.method1703();
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.field226[var2 - 60] = var1.method1703();
         }
      }

   }

   public boolean method110() {
      if (null == this.field220) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field220.length; ++var3) {
            if (!field216.method2424(this.field220[var3], 0)) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   public class327 method111() {
      if (this.field220 == null) {
         return null;
      } else {
         class327[] var2 = new class327[this.field220.length];

         for(int var3 = 0; var3 < this.field220.length; ++var3) {
            var2[var3] = class327.method1514(field216, this.field220[var3], 0);
         }

         class327 var5;
         if (var2.length == 1) {
            var5 = var2[0];
         } else {
            var5 = new class327(var2, var2.length);
         }

         int var4;
         if (null != this.field221) {
            for(var4 = 0; var4 < this.field221.length; ++var4) {
               var5.method1513(this.field221[var4], this.field222[var4]);
            }
         }

         if (this.field223 != null) {
            for(var4 = 0; var4 < this.field223.length; ++var4) {
               var5.method1504(this.field223[var4], this.field217[var4]);
            }
         }

         return var5;
      }
   }

   public boolean method115() {
      boolean var2 = true;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (-1 != this.field226[var3] && !field216.method2424(this.field226[var3], 0)) {
            var2 = false;
         }
      }

      return var2;
   }

   public class327 method114() {
      class327[] var2 = new class327[5];
      int var3 = 0;

      for(int var4 = 0; var4 < 5; ++var4) {
         if (this.field226[var4] != -1) {
            var2[var3++] = class327.method1514(field216, this.field226[var4], 0);
         }
      }

      class327 var6 = new class327(var2, var3);
      int var5;
      if (this.field221 != null) {
         for(var5 = 0; var5 < this.field221.length; ++var5) {
            var6.method1513(this.field221[var5], this.field222[var5]);
         }
      }

      if (null != this.field223) {
         for(var5 = 0; var5 < this.field223.length; ++var5) {
            var6.method1504(this.field223[var5], this.field217[var5]);
         }
      }

      return var6;
   }

   public static class21 method117(int var0) {
      class21 var2 = (class21)field224.method1183((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = field215.method2422(3, var0);
         var2 = new class21();
         if (var3 != null) {
            var2.method113(new class366(var3));
         }

         field224.method1182(var2, (long)var0);
         return var2;
      }
   }

   public static void method116() {
      field224.method1180();
   }
}
