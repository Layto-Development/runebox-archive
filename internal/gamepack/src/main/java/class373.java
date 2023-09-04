public abstract class class373 {
   int field2924;
   int field2925;
   public final class89 field2922;
   public final class89 field2923;

   class373(class89 var1, class89 var2) {
      this.field2923 = var1;
      this.field2922 = var2;
   }

   abstract class174 method1876();

   abstract int method1872();

   abstract int method1877();

   public abstract int method1871();

   boolean method1870(int var1, int var2) {
      if (this.method1874(var1, var2)) {
         return true;
      } else {
         return this.method1875(var1, var2);
      }
   }

   boolean method1873() {
      return this.method1871() >= 0;
   }

   boolean method1874(int var1, int var2) {
      if (!this.method1873()) {
         return false;
      } else {
         class444 var4 = class444.method2173(this.method1871());
         int var5 = this.method1877();
         int var6 = this.method1872();
         switch (var4.field3387.field1237) {
            case 0:
               if (var1 <= this.field2924 - var5 || var1 > this.field2924) {
                  return false;
               }
               break;
            case 1:
               if (var1 < this.field2924 || var1 >= var5 + this.field2924) {
                  return false;
               }
               break;
            case 2:
               if (var1 < this.field2924 - var5 / 2 || var1 > var5 / 2 + this.field2924) {
                  return false;
               }
         }

         switch (var4.field3382.field1557) {
            case 0:
               if (var2 < this.field2925 - var6 / 2 || var2 > var6 / 2 + this.field2925) {
                  return false;
               }
               break;
            case 1:
               if (var2 > this.field2925 - var6 && var2 <= this.field2925) {
                  break;
               }

               return false;
            case 2:
               if (var2 < this.field2925 || var2 >= this.field2925 + var6) {
                  return false;
               }
         }

         return true;
      }
   }

   boolean method1875(int var1, int var2) {
      class174 var4 = this.method1876();
      if (null == var4) {
         return false;
      } else if (var1 >= this.field2924 - var4.field1735 / 2 && var1 <= var4.field1735 / 2 + this.field2924) {
         return var2 >= this.field2925 && var2 <= var4.field1733 + this.field2925;
      } else {
         return false;
      }
   }
}
