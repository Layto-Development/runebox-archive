public class class322 {
   boolean field2603 = true;
   boolean field2607 = true;
   class120 field2594 = new class120();
   class120 field2600 = new class120();
   class120 field2602 = new class120();
   class120[] field2598;
   class120[] field2599;
   float[][] field2596;
   float[][] field2601;
   float[][] field2604;
   float[][] field2606;
   final class120[] field2597;
   public class322 field2605;
   public final int field2595;

   public class322(int var1, class184 var2, boolean var3) {
      this.field2595 = var2.method1127();
      this.field2597 = new class120[var1];
      this.field2598 = new class120[this.field2597.length];
      this.field2599 = new class120[this.field2597.length];
      this.field2596 = new float[this.field2597.length][3];

      for(int var4 = 0; var4 < this.field2597.length; ++var4) {
         this.field2597[var4] = new class120(var2, var3);
         this.field2596[var4][0] = var2.method1131();
         this.field2596[var4][1] = var2.method1131();
         this.field2596[var4][2] = var2.method1131();
      }

      this.method1698();
   }

   void method1698() {
      this.field2604 = new float[this.field2597.length][3];
      this.field2601 = new float[this.field2597.length][3];
      this.field2606 = new float[this.field2597.length][3];
      class120 var2;
      synchronized(class120.field1487) {
         if (class261.field2286 == 0) {
            var2 = new class120();
         } else {
            class120.field1487[--class261.field2286].method837();
            var2 = class120.field1487[class261.field2286];
         }
      }

      class120 var3 = var2;

      for(int var4 = 0; var4 < this.field2597.length; ++var4) {
         class120 var5 = this.method1708(var4);
         var3.method844(var5);
         var3.method849();
         this.field2604[var4] = var3.method836();
         this.field2601[var4][0] = var5.field1488[12];
         this.field2601[var4][1] = var5.field1488[13];
         this.field2601[var4][2] = var5.field1488[14];
         this.field2606[var4] = var5.method843();
      }

      var3.method846();
   }

   class120 method1708(int var1) {
      return this.field2597[var1];
   }

   class120 method1700(int var1) {
      if (this.field2598[var1] == null) {
         this.field2598[var1] = new class120(this.method1708(var1));
         if (null != this.field2605) {
            this.field2598[var1].method847(this.field2605.method1700(var1));
         } else {
            this.field2598[var1].method847(class120.field1489);
         }
      }

      return this.field2598[var1];
   }

   class120 method1707(int var1) {
      if (this.field2599[var1] == null) {
         this.field2599[var1] = new class120(this.method1700(var1));
         this.field2599[var1].method849();
      }

      return this.field2599[var1];
   }

   void method1701(class120 var1) {
      this.field2600.method844(var1);
      this.field2603 = true;
      this.field2607 = true;
   }

   class120 method1702() {
      return this.field2600;
   }

   class120 method1703() {
      if (this.field2603) {
         this.field2602.method844(this.method1702());
         if (null != this.field2605) {
            this.field2602.method847(this.field2605.method1703());
         }

         this.field2603 = false;
      }

      return this.field2602;
   }

   public class120 method1699(int var1) {
      if (this.field2607) {
         this.field2594.method844(this.method1707(var1));
         this.field2594.method847(this.method1703());
         this.field2607 = false;
      }

      return this.field2594;
   }

   float[] method1704(int var1) {
      return this.field2604[var1];
   }

   float[] method1705(int var1) {
      return this.field2601[var1];
   }

   float[] method1706(int var1) {
      return this.field2606[var1];
   }
}
