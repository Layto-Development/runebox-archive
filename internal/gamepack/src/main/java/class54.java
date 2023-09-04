public class class54 {
   boolean field447 = true;
   boolean field451 = true;
   class475 field438 = new class475();
   class475 field444 = new class475();
   class475 field446 = new class475();
   class475[] field442;
   class475[] field443;
   float[][] field440;
   float[][] field445;
   float[][] field448;
   float[][] field450;
   final class475[] field441;
   public class54 field449;
   public final int field439;

   public class54(int var1, class366 var2, boolean var3) {
      this.field439 = var2.method1656();
      this.field441 = new class475[var1];
      this.field442 = new class475[this.field441.length];
      this.field443 = new class475[this.field441.length];
      this.field440 = new float[this.field441.length][3];

      for(int var4 = 0; var4 < this.field441.length; ++var4) {
         this.field441[var4] = new class475(var2, var3);
         this.field440[var4][0] = var2.method1660();
         this.field440[var4][1] = var2.method1660();
         this.field440[var4][2] = var2.method1660();
      }

      this.method227();
   }

   void method227() {
      this.field448 = new float[this.field441.length][3];
      this.field445 = new float[this.field441.length][3];
      this.field450 = new float[this.field441.length][3];
      class475 var2;
      synchronized(class475.field3765) {
         if (0 == class180.field1453) {
            var2 = new class475();
         } else {
            class475.field3765[--class180.field1453].method2233();
            var2 = class475.field3765[class180.field1453];
         }
      }

      class475 var3 = var2;

      for(int var4 = 0; var4 < this.field441.length; ++var4) {
         class475 var5 = this.method237(var4);
         var3.method2240(var5);
         var3.method2245();
         this.field448[var4] = var3.method2232();
         this.field445[var4][0] = var5.field3766[12];
         this.field445[var4][1] = var5.field3766[13];
         this.field445[var4][2] = var5.field3766[14];
         this.field450[var4] = var5.method2239();
      }

      var3.method2242();
   }

   class475 method237(int var1) {
      return this.field441[var1];
   }

   class475 method229(int var1) {
      if (this.field442[var1] == null) {
         this.field442[var1] = new class475(this.method237(var1));
         if (null != this.field449) {
            this.field442[var1].method2243(this.field449.method229(var1));
         } else {
            this.field442[var1].method2243(class475.field3767);
         }
      }

      return this.field442[var1];
   }

   class475 method236(int var1) {
      if (this.field443[var1] == null) {
         this.field443[var1] = new class475(this.method229(var1));
         this.field443[var1].method2245();
      }

      return this.field443[var1];
   }

   void method230(class475 var1) {
      this.field444.method2240(var1);
      this.field447 = true;
      this.field451 = true;
   }

   class475 method231() {
      return this.field444;
   }

   class475 method232() {
      if (this.field447) {
         this.field446.method2240(this.method231());
         if (null != this.field449) {
            this.field446.method2243(this.field449.method232());
         }

         this.field447 = false;
      }

      return this.field446;
   }

   public class475 method228(int var1) {
      if (this.field451) {
         this.field438.method2240(this.method236(var1));
         this.field438.method2243(this.method232());
         this.field451 = false;
      }

      return this.field438;
   }

   float[] method233(int var1) {
      return this.field448[var1];
   }

   float[] method234(int var1) {
      return this.field445[var1];
   }

   float[] method235(int var1) {
      return this.field450[var1];
   }
}
