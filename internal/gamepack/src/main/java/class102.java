public class class102 {
   class243[] field682 = new class243[100];
   int field681;

   class102() {
   }

   class243 method380(int var1, String var2, String var3, String var4) {
      class243 var6 = this.field682[99];

      for(int var7 = this.field681; var7 > 0; --var7) {
         if (var7 != 100) {
            this.field682[var7] = this.field682[var7 - 1];
         }
      }

      if (null == var6) {
         var6 = new class243(var1, var2, var4, var3);
      } else {
         var6.method295();
         var6.method1406();
         var6.method1174(var1, var2, var4, var3);
      }

      this.field682[0] = var6;
      if (this.field681 < 100) {
         ++this.field681;
      }

      return var6;
   }

   class243 method381(int var1) {
      return var1 >= 0 && var1 < this.field681 ? this.field682[var1] : null;
   }

   int method379() {
      return this.field681;
   }
}
