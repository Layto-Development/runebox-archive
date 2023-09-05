public class class396 extends class151 {
   public static class298 field3090;
   public static class298 field3091;
   public static int field3093;
   static class364 field3099 = new class364(64);
   int[] field3095;
   int[] field3101 = new int[]{-1, -1, -1, -1, -1};
   short[] field3092;
   short[] field3096;
   short[] field3097;
   short[] field3098;
   public boolean field3100 = false;
   public int field3094 = -1;

   class396() {
   }

   void method1911(class184 var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method1910(var1, var3);
      }
   }

   void method1910(class184 var1, int var2) {
      if (var2 == 1) {
         this.field3094 = var1.readUnsignedByte();
      } else {
         int var4;
         int var5;
         if (var2 == 2) {
            var4 = var1.readUnsignedByte();
            this.field3095 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3095[var5] = var1.method1174();
            }
         } else if (var2 == 3) {
            this.field3100 = true;
         } else if (var2 == 40) {
            var4 = var1.readUnsignedByte();
            this.field3096 = new short[var4];
            this.field3097 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3096[var5] = (short)var1.method1174();
               this.field3097[var5] = (short)var1.method1174();
            }
         } else if (var2 == 41) {
            var4 = var1.readUnsignedByte();
            this.field3098 = new short[var4];
            this.field3092 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field3098[var5] = (short)var1.method1174();
               this.field3092[var5] = (short)var1.method1174();
            }
         } else if (var2 >= 60 && var2 < 70) {
            this.field3101[var2 - 60] = var1.method1174();
         }
      }

   }

   public boolean method1908() {
      if (null == this.field3095) {
         return true;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.field3095.length; ++var3) {
            if (!field3091.method1631(this.field3095[var3], 0)) {
               var2 = false;
            }
         }

         return var2;
      }
   }

   public class533 method1909() {
      if (this.field3095 == null) {
         return null;
      } else {
         class533[] var2 = new class533[this.field3095.length];

         for(int var3 = 0; var3 < this.field3095.length; ++var3) {
            var2[var3] = class533.method2538(field3091, this.field3095[var3], 0);
         }

         class533 var5;
         if (var2.length == 1) {
            var5 = var2[0];
         } else {
            var5 = new class533(var2, var2.length);
         }

         int var4;
         if (null != this.field3096) {
            for(var4 = 0; var4 < this.field3096.length; ++var4) {
               var5.method2537(this.field3096[var4], this.field3097[var4]);
            }
         }

         if (this.field3098 != null) {
            for(var4 = 0; var4 < this.field3098.length; ++var4) {
               var5.method2528(this.field3098[var4], this.field3092[var4]);
            }
         }

         return var5;
      }
   }

   public boolean method1913() {
      boolean var2 = true;

      for(int var3 = 0; var3 < 5; ++var3) {
         if (this.field3101[var3] != -1 && !field3091.method1631(this.field3101[var3], 0)) {
            var2 = false;
         }
      }

      return var2;
   }

   public class533 method1912() {
      class533[] var2 = new class533[5];
      int var3 = 0;

      for(int var4 = 0; var4 < 5; ++var4) {
         if (this.field3101[var4] != -1) {
            var2[var3++] = class533.method2538(field3091, this.field3101[var4], 0);
         }
      }

      class533 var6 = new class533(var2, var3);
      int var5;
      if (this.field3096 != null) {
         for(var5 = 0; var5 < this.field3096.length; ++var5) {
            var6.method2537(this.field3096[var5], this.field3097[var5]);
         }
      }

      if (null != this.field3098) {
         for(var5 = 0; var5 < this.field3098.length; ++var5) {
            var6.method2528(this.field3098[var5], this.field3092[var5]);
         }
      }

      return var6;
   }

   public static class396 method1915(int var0) {
      class396 var2 = (class396)field3099.method1851((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = field3090.method1629(3, var0);
         var2 = new class396();
         if (var3 != null) {
            var2.method1911(new class184(var3));
         }

         field3099.method1850(var2, (long)var0);
         return var2;
      }
   }

   public static void method1914() {
      field3099.method1848();
   }
}
