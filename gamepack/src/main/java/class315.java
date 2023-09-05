public class class315 {
   static class480 field2564;
   class45 field2566 = new class45();
   long field2567;
   public int field2565 = -1;

   public class315(class184 var1) {
      this.method1686(var1);
   }

   void method1686(class184 var1) {
      this.field2567 = var1.method1130();
      this.field2565 = var1.readInt();

      for(int var3 = var1.readUnsignedByte(); var3 != 0; var3 = var1.readUnsignedByte()) {
         Object var4;
         if (var3 == 3) {
            var4 = new class216(this);
         } else if (var3 == 1) {
            var4 = new class43(this);
         } else if (var3 == 13) {
            var4 = new class165(this);
         } else if (var3 == 4) {
            var4 = new class244(this);
         } else if (var3 == 6) {
            var4 = new class343(this);
         } else if (var3 == 5) {
            var4 = new class387(this);
         } else if (var3 == 2) {
            var4 = new class516(this);
         } else if (var3 == 7) {
            var4 = new class527(this);
         } else if (var3 == 14) {
            var4 = new class5(this);
         } else if (var3 == 8) {
            var4 = new class417(this);
         } else if (var3 == 9) {
            var4 = new class336(this);
         } else if (var3 == 10) {
            var4 = new class127(this);
         } else if (var3 == 11) {
            var4 = new class289(this);
         } else if (var3 == 12) {
            var4 = new class465(this);
         } else {
            if (var3 != 15) {
               throw new RuntimeException("");
            }

            var4 = new class514(this);
         }

         ((class56)var4).method608(var1);
         this.field2566.method577((class55)var4);
      }

   }

   public void method1685(class15 var1) {
      if (var1.field145 == this.field2567 && this.field2565 == var1.field162) {
         for(class56 var3 = (class56)this.field2566.method583(); null != var3; var3 = (class56)this.field2566.method579()) {
            var3.method607(var1);
         }

         ++var1.field162;
      } else {
         throw new RuntimeException("");
      }
   }

   public static class335 method1687(byte var0) {
      if (class335.field2685 == 0) {
         if (var0 != -1) {
            throw new IllegalStateException();
         } else {
            return new class335();
         }
      } else {
         return class335.field2684[--class335.field2685];
      }
   }
}
