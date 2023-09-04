public class class153 extends class460 {
   class429 field969 = new class429();
   class429 field972 = new class429();
   int field970 = -1;
   int field971 = 0;

   public final synchronized void method586(class460 var1) {
      this.field972.method1996(var1);
   }

   public final synchronized void method576(class460 var1) {
      var1.method295();
   }

   void method577() {
      if (this.field971 > 0) {
         for(class161 var1 = (class161)this.field969.method1991(); var1 != null; var1 = (class161)this.field969.method1993()) {
            var1.field1023 -= this.field971;
         }

         this.field970 -= this.field971;
         this.field971 = 0;
      }

   }

   void method578(class70 var1, class161 var2) {
      while(var1 != this.field969.field3340 && ((class161)var1).field1023 <= var2.field1023) {
         var1 = var1.field530;
      }

      class429.method1988(var2, var1);
      this.field970 = ((class161)this.field969.field3340.field530).field1023;
   }

   void method579(class161 var1) {
      var1.method295();
      var1.method616();
      class70 var2 = this.field969.field3340.field530;
      if (var2 == this.field969.field3340) {
         this.field970 = -1;
      } else {
         this.field970 = ((class161)var2).field1023;
      }

   }

   protected class460 method2169() {
      return (class460)this.field972.method1991();
   }

   protected class460 method2170() {
      return (class460)this.field972.method1993();
   }

   protected int method2167() {
      return 0;
   }

   public final synchronized void method2172(int[] var1, int var2, int var3) {
      do {
         if (this.field970 < 0) {
            this.method583(var1, var2, var3);
            return;
         }

         if (this.field971 + var3 < this.field970) {
            this.field971 += var3;
            this.method583(var1, var2, var3);
            return;
         }

         int var4 = this.field970 - this.field971;
         this.method583(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field971 += var4;
         this.method577();
         class161 var5 = (class161)this.field969.method1991();
         synchronized(var5) {
            int var7 = var5.method617(this);
            if (var7 < 0) {
               var5.field1023 = 0;
               this.method579(var5);
            } else {
               var5.field1023 = var7;
               this.method578(var5.field530, var5);
            }
         }
      } while(var3 != 0);

   }

   void method583(int[] var1, int var2, int var3) {
      for(class460 var4 = (class460)this.field972.method1991(); var4 != null; var4 = (class460)this.field972.method1993()) {
         var4.method2173(var1, var2, var3);
      }

   }

   public final synchronized void method2171(int var1) {
      do {
         if (this.field970 < 0) {
            this.method587(var1);
            return;
         }

         if (this.field971 + var1 < this.field970) {
            this.field971 += var1;
            this.method587(var1);
            return;
         }

         int var2 = this.field970 - this.field971;
         this.method587(var2);
         var1 -= var2;
         this.field971 += var2;
         this.method577();
         class161 var3 = (class161)this.field969.method1991();
         synchronized(var3) {
            int var5 = var3.method617(this);
            if (var5 < 0) {
               var3.field1023 = 0;
               this.method579(var3);
            } else {
               var3.field1023 = var5;
               this.method578(var3.field530, var3);
            }
         }
      } while(var1 != 0);

   }

   void method587(int var1) {
      for(class460 var2 = (class460)this.field972.method1991(); var2 != null; var2 = (class460)this.field972.method1993()) {
         var2.method2171(var1);
      }

   }
}
