public abstract class class368 {
   int field2661;
   int field2662;
   public final class113 field2659;
   public final class113 field2660;

   class368(class113 var1, class113 var2) {
      this.field2660 = var1;
      this.field2659 = var2;
   }

   abstract class260 method1725();

   abstract int method1721();

   abstract int method1726();

   public abstract int method1720();

   boolean method1719(int var1, int var2) {
      if (this.method1723(var1, var2)) {
         return true;
      } else {
         return this.method1724(var1, var2);
      }
   }

   boolean method1722() {
      return this.method1720() >= 0;
   }

   boolean method1723(int var1, int var2) {
      if (!this.method1722()) {
         return false;
      } else {
         class430 var4 = class430.method2005(this.method1720());
         int var5 = this.method1726();
         int var6 = this.method1721();
         switch (var4.field3366.field4040) {
            case 0:
               if (var1 <= this.field2661 - var5 || var1 > this.field2661) {
                  return false;
               }
               break;
            case 1:
               if (var1 < this.field2661 || var1 >= var5 + this.field2661) {
                  return false;
               }
               break;
            case 2:
               if (var1 < this.field2661 - var5 / 2 || var1 > var5 / 2 + this.field2661) {
                  return false;
               }
         }

         switch (var4.field3361.field2973) {
            case 0:
               if (var2 < this.field2662 - var6 / 2 || var2 > var6 / 2 + this.field2662) {
                  return false;
               }
               break;
            case 1:
               if (var2 > this.field2662 - var6 && var2 <= this.field2662) {
                  break;
               }

               return false;
            case 2:
               if (var2 < this.field2662 || var2 >= this.field2662 + var6) {
                  return false;
               }
         }

         return true;
      }
   }

   boolean method1724(int var1, int var2) {
      class260 var4 = this.method1725();
      if (null == var4) {
         return false;
      } else if (var1 >= this.field2661 - var4.field1859 / 2 && var1 <= var4.field1859 / 2 + this.field2661) {
         return var2 >= this.field2662 && var2 <= var4.field1857 + this.field2662;
      } else {
         return false;
      }
   }
}
