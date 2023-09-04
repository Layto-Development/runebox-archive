public class class20 extends class538 {
   boolean field213;
   boolean field214;

   class20() {
   }

   int method108(class20 var1) {
      if (super.field4284 == Client.field1116 && var1.field4284 != Client.field1116) {
         return -1;
      } else if (var1.field4284 == Client.field1116 && Client.field1116 != super.field4284) {
         return 1;
      } else if (super.field4284 != 0 && var1.field4284 == 0) {
         return -1;
      } else if (0 != var1.field4284 && super.field4284 == 0) {
         return 1;
      } else if (this.field213 && !var1.field213) {
         return -1;
      } else if (!this.field213 && var1.field213) {
         return 1;
      } else if (this.field214 && !var1.field214) {
         return -1;
      } else if (!this.field214 && var1.field214) {
         return 1;
      } else {
         return 0 != super.field4284 ? super.field4283 - var1.field4283 : var1.field4283 - super.field4283;
      }
   }

   public int method246(class57 var1) {
      return this.method108((class20)var1);
   }

   public int compareTo(Object var1) {
      return this.method108((class20)var1);
   }
}
