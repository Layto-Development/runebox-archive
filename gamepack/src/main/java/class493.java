import java.security.SecureRandom;

public final class class493 extends class496 {
   static SecureRandom field3877;
   boolean field3875 = false;
   class157 field3872;
   int field3867;
   int field3868;
   int field3869;
   int field3870;
   int field3871;
   int field3873 = 0;
   int field3874 = 0;
   int field3876;

   class493(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.field3876 = var1;
      this.field3869 = var2;
      this.field3870 = var3;
      this.field3871 = var4;
      this.field3867 = var5;
      this.field3868 = var7 + var6;
      int var8 = class529.method2515(this.field3876).field4158;
      if (var8 != -1) {
         this.field3875 = false;
         this.field3872 = class157.method984(var8);
      } else {
         this.field3875 = true;
      }

   }

   final void method2390(int var1) {
      if (!this.field3875) {
         this.field3874 += var1;
         if (!this.field3872.method983()) {
            while(this.field3874 > this.field3872.field1674[this.field3873]) {
               this.field3874 -= this.field3872.field1674[this.field3873];
               ++this.field3873;
               if (this.field3873 >= this.field3872.field1663.length) {
                  this.field3875 = true;
                  break;
               }
            }
         } else {
            this.field3873 += var1;
            if (this.field3873 >= this.field3872.method980()) {
               this.field3875 = true;
            }
         }

      }
   }

   protected final class104 method2401() {
      class529 var2 = class529.method2515(this.field3876);
      class104 var3;
      if (!this.field3875) {
         var3 = var2.method2511(this.field3873);
      } else {
         var3 = var2.method2511(-1);
      }

      return var3 == null ? null : var3;
   }
}
