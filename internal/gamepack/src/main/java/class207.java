public class class207 {
   static class322 field1596;
   class457 field1598 = new class457();
   long field1599;
   public int field1597 = -1;

   public class207(class366 var1) {
      this.method1084(var1);
   }

   void method1084(class366 var1) {
      this.field1599 = var1.method1659();
      this.field1597 = var1.method1658();

      for(int var3 = var1.method1654(); var3 != 0; var3 = var1.method1654()) {
         Object var4;
         if (var3 == 3) {
            var4 = new class265(this);
         } else if (var3 == 1) {
            var4 = new class189(this);
         } else if (var3 == 13) {
            var4 = new class236(this);
         } else if (var3 == 4) {
            var4 = new class210(this);
         } else if (var3 == 6) {
            var4 = new class175(this);
         } else if (var3 == 5) {
            var4 = new class222(this);
         } else if (var3 == 2) {
            var4 = new class540(this);
         } else if (var3 == 7) {
            var4 = new class343(this);
         } else if (var3 == 14) {
            var4 = new class126(this);
         } else if (var3 == 8) {
            var4 = new class196(this);
         } else if (var3 == 9) {
            var4 = new class270(this);
         } else if (var3 == 10) {
            var4 = new class318(this);
         } else if (var3 == 11) {
            var4 = new class60(this);
         } else if (var3 == 12) {
            var4 = new class2(this);
         } else {
            if (var3 != 15) {
               throw new RuntimeException("");
            }

            var4 = new class262(this);
         }

         ((class316)var4).method1441(var1);
         this.field1598.method2138((class70)var4);
      }

   }

   public void method1083(class8 var1) {
      if (var1.field55 == this.field1599 && this.field1597 == var1.field72) {
         for(class316 var3 = (class316)this.field1598.method2144(); null != var3; var3 = (class316)this.field1598.method2140()) {
            var3.method1440(var1);
         }

         ++var1.field72;
      } else {
         throw new RuntimeException("");
      }
   }

   public static class53 method1085(byte var0) {
      if (0 == class53.field434) {
         if (var0 != -1) {
            throw new IllegalStateException();
         } else {
            return new class53();
         }
      } else {
         return class53.field433[--class53.field434];
      }
   }
}
