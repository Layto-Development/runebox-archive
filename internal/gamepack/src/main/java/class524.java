import java.util.Iterator;

public final class class524 implements Iterable {
   class70 field4168;
   class70 field4169;
   class70[] field4167;
   int field4166;
   int field4170 = 0;

   public class524(int var1) {
      this.field4166 = var1;
      this.field4167 = new class70[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class70 var3 = this.field4167[var2] = new class70();
         var3.field530 = var3;
         var3.field532 = var3;
      }

   }

   public class70 method2509(long var1) {
      class70 var3 = this.field4167[(int)(var1 & (long)(this.field4166 - 1))];

      for(this.field4168 = var3.field530; this.field4168 != var3; this.field4168 = this.field4168.field530) {
         if (this.field4168.field531 == var1) {
            class70 var4 = this.field4168;
            this.field4168 = this.field4168.field530;
            return var4;
         }
      }

      this.field4168 = null;
      return null;
   }

   public void method2513(class70 var1, long var2) {
      if (var1.field532 != null) {
         var1.method295();
      }

      class70 var4 = this.field4167[(int)(var2 & (long)(this.field4166 - 1))];
      var1.field532 = var4.field532;
      var1.field530 = var4;
      var1.field532.field530 = var1;
      var1.field530.field532 = var1;
      var1.field531 = var2;
   }

   public void method2510() {
      for(int var1 = 0; var1 < this.field4166; ++var1) {
         class70 var2 = this.field4167[var1];

         while(true) {
            class70 var3 = var2.field530;
            if (var3 == var2) {
               break;
            }

            var3.method295();
         }
      }

      this.field4168 = null;
      this.field4169 = null;
   }

   public class70 method2511() {
      this.field4170 = 0;
      return this.method2512();
   }

   public class70 method2512() {
      class70 var1;
      if (this.field4170 > 0 && this.field4169 != this.field4167[this.field4170 - 1]) {
         var1 = this.field4169;
         this.field4169 = var1.field530;
         return var1;
      } else {
         do {
            if (this.field4170 >= this.field4166) {
               return null;
            }

            var1 = this.field4167[this.field4170++].field530;
         } while(var1 == this.field4167[this.field4170 - 1]);

         this.field4169 = var1.field530;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class231(this);
   }
}
