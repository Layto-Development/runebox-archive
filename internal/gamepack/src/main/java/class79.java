public final class class79 {
   class55 field1246;
   class55 field1247;
   class55[] field1245;
   int field1244 = 0;
   int field1248;

   public class79(int var1) {
      this.field1248 = var1;
      this.field1245 = new class55[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class55 var3 = this.field1245[var2] = new class55();
         var3.field1077 = var3;
         var3.field1079 = var3;
      }

   }

   public class55 method709(long var1) {
      class55 var3 = this.field1245[(int)(var1 & (long)(this.field1248 - 1))];

      for(this.field1246 = var3.field1077; this.field1246 != var3; this.field1246 = this.field1246.field1077) {
         if (this.field1246.field1078 == var1) {
            class55 var4 = this.field1246;
            this.field1246 = this.field1246.field1077;
            return var4;
         }
      }

      this.field1246 = null;
      return null;
   }

   public int method708() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.field1248; ++var2) {
         class55 var3 = this.field1245[var2];

         for(class55 var4 = var3.field1077; var4 != var3; var4 = var4.field1077) {
            ++var1;
         }
      }

      return var1;
   }

   public void method712(class55 var1, long var2) {
      if (var1.field1079 != null) {
         var1.method605();
      }

      class55 var4 = this.field1245[(int)(var2 & (long)(this.field1248 - 1))];
      var1.field1079 = var4.field1079;
      var1.field1077 = var4;
      var1.field1079.field1077 = var1;
      var1.field1077.field1079 = var1;
      var1.field1078 = var2;
   }

   public class55 method710() {
      this.field1244 = 0;
      return this.method711();
   }

   public class55 method711() {
      class55 var1;
      if (this.field1244 > 0 && this.field1247 != this.field1245[this.field1244 - 1]) {
         var1 = this.field1247;
         this.field1247 = var1.field1077;
         return var1;
      } else {
         do {
            if (this.field1244 >= this.field1248) {
               return null;
            }

            var1 = this.field1245[this.field1244++].field1077;
         } while(var1 == this.field1245[this.field1244 - 1]);

         this.field1247 = var1.field1077;
         return var1;
      }
   }
}
