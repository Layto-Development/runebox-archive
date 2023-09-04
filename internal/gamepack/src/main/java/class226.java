public class class226 {
   static class22 field2089;
   static short[][][] field2088;
   class322[] field2086;
   int field2087;

   class226(class184 var1, int var2) {
      this.field2086 = new class322[var2];
      this.field2087 = var1.method1125();

      for(int var3 = 0; var3 < this.field2086.length; ++var3) {
         class322 var4 = new class322(this.field2087, var1, false);
         this.field2086[var3] = var4;
      }

      this.method1340();
   }

   void method1340() {
      class322[] var2 = this.field2086;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class322 var4 = var2[var3];
         if (var4.field2595 >= 0) {
            var4.field2605 = this.field2086[var4.field2595];
         }
      }

   }

   public int method1335() {
      return this.field2086.length;
   }

   class322 method1336(int var1) {
      return var1 >= this.method1335() ? null : this.field2086[var1];
   }

   class322[] method1337() {
      return this.field2086;
   }

   void method1338(class495 var1, int var2) {
      this.method1339(var1, var2, (boolean[])null, false);
   }

   void method1339(class495 var1, int var2, boolean[] var3, boolean var4) {
      int var6 = var1.method2394();
      int var7 = 0;
      class322[] var8 = this.method1337();

      for(int var9 = 0; var9 < var8.length; ++var9) {
         class322 var10 = var8[var9];
         if (null == var3 || var4 == var3[var7]) {
            var1.method2396(var2, var10, var7, var6);
         }

         ++var7;
      }

   }
}
