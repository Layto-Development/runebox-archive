public class class446 extends class410 {
   boolean field3390;
   boolean field3391;

   class446() {
   }

   int method2174(class446 var1) {
      if (super.field3157 == Client.field576 && var1.field3157 != Client.field576) {
         return -1;
      } else if (var1.field3157 == Client.field576 && Client.field576 != super.field3157) {
         return 1;
      } else if (super.field3157 != 0 && var1.field3157 == 0) {
         return -1;
      } else if (var1.field3157 != 0 && super.field3157 == 0) {
         return 1;
      } else if (this.field3390 && !var1.field3390) {
         return -1;
      } else if (!this.field3390 && var1.field3390) {
         return 1;
      } else if (this.field3391 && !var1.field3391) {
         return -1;
      } else if (!this.field3391 && var1.field3391) {
         return 1;
      } else {
         return super.field3157 != 0 ? super.field3156 - var1.field3156 : var1.field3156 - super.field3156;
      }
   }

   public int method1769(class332 var1) {
      return this.method2174((class446)var1);
   }

   public int compareTo(Object var1) {
      return this.method2174((class446)var1);
   }
}
