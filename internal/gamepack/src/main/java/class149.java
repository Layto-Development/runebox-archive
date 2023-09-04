import java.security.SecureRandom;

public final class class149 extends class165 {
   static SecureRandom field958;
   boolean field956 = false;
   class464 field953;
   int field948;
   int field949;
   int field950;
   int field951;
   int field952;
   int field954 = 0;
   int field955 = 0;
   int field957;

   class149(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field957 = var1;
      this.field950 = var2;
      this.field951 = var3;
      this.field952 = var4;
      this.field948 = var5;
      this.field949 = var7 + var6;
      int var8 = class163.method625(this.field957).field1039;
      if (var8 != -1) {
         this.field956 = false;
         this.field953 = class464.method2200(var8);
      } else {
         this.field956 = true;
      }

   }

   final void method567(int var1) {
      if (!this.field956) {
         this.field955 += var1;
         if (!this.field953.method2199()) {
            while(this.field955 > this.field953.field3685[this.field954]) {
               this.field955 -= this.field953.field3685[this.field954];
               ++this.field954;
               if (this.field954 >= this.field953.field3674.length) {
                  this.field956 = true;
                  break;
               }
            }
         } else {
            this.field954 += var1;
            if (this.field954 >= this.field953.method2196()) {
               this.field956 = true;
            }
         }

      }
   }

   protected final class485 method632() {
      class163 var2 = class163.method625(this.field957);
      class485 var3;
      if (!this.field956) {
         var3 = var2.method621(this.field954);
      } else {
         var3 = var2.method621(-1);
      }

      return var3 == null ? null : var3;
   }
}
