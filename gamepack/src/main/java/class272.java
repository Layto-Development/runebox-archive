public class class272 extends class124 {
   class201 field2324 = new class201();
   class201 field2327 = new class201();
   int field2325 = -1;
   int field2326 = 0;

   public final synchronized void method1525(class124 var1) {
      this.field2327.method1241(var1);
   }

   public final synchronized void method1520(class124 var1) {
      var1.method605();
   }

   void method1521() {
      if (this.field2326 > 0) {
         for(class232 var1 = (class232)this.field2324.method1236(); var1 != null; var1 = (class232)this.field2324.method1238()) {
            var1.field2141 -= this.field2326;
         }

         this.field2325 -= this.field2326;
         this.field2326 = 0;
      }

   }

   void method1522(class55 var1, class232 var2) {
      while(var1 != this.field2324.field1935 && ((class232)var1).field2141 <= var2.field2141) {
         var1 = var1.field1077;
      }

      class201.method1233(var2, var1);
      this.field2325 = ((class232)this.field2324.field1935.field1077).field2141;
   }

   void method1523(class232 var1) {
      var1.method605();
      var1.method1417();
      class55 var2 = this.field2324.field1935.field1077;
      if (var2 == this.field2324.field1935) {
         this.field2325 = -1;
      } else {
         this.field2325 = ((class232)var2).field2141;
      }

   }

   protected class124 method866() {
      return (class124)this.field2327.method1236();
   }

   protected class124 method867() {
      return (class124)this.field2327.method1238();
   }

   protected int method864() {
      return 0;
   }

   public final synchronized void method869(int[] var1, int var2, int var3) {
      do {
         if (this.field2325 < 0) {
            this.method1524(var1, var2, var3);
            return;
         }

         if (this.field2326 + var3 < this.field2325) {
            this.field2326 += var3;
            this.method1524(var1, var2, var3);
            return;
         }

         int var4 = this.field2325 - this.field2326;
         this.method1524(var1, var2, var4);
         var2 += var4;
         var3 -= var4;
         this.field2326 += var4;
         this.method1521();
         class232 var5 = (class232)this.field2324.method1236();
         synchronized(var5) {
            int var7 = var5.method1418(this);
            if (var7 < 0) {
               var5.field2141 = 0;
               this.method1523(var5);
            } else {
               var5.field2141 = var7;
               this.method1522(var5.field1077, var5);
            }
         }
      } while(var3 != 0);

   }

   void method1524(int[] var1, int var2, int var3) {
      for(class124 var4 = (class124)this.field2327.method1236(); var4 != null; var4 = (class124)this.field2327.method1238()) {
         var4.method870(var1, var2, var3);
      }

   }

   public final synchronized void method868(int var1) {
      do {
         if (this.field2325 < 0) {
            this.method1526(var1);
            return;
         }

         if (this.field2326 + var1 < this.field2325) {
            this.field2326 += var1;
            this.method1526(var1);
            return;
         }

         int var2 = this.field2325 - this.field2326;
         this.method1526(var2);
         var1 -= var2;
         this.field2326 += var2;
         this.method1521();
         class232 var3 = (class232)this.field2324.method1236();
         synchronized(var3) {
            int var5 = var3.method1418(this);
            if (var5 < 0) {
               var3.field2141 = 0;
               this.method1523(var3);
            } else {
               var3.field2141 = var5;
               this.method1522(var3.field1077, var3);
            }
         }
      } while(var1 != 0);

   }

   void method1526(int var1) {
      for(class124 var2 = (class124)this.field2327.method1236(); var2 != null; var2 = (class124)this.field2327.method1238()) {
         var2.method868(var1);
      }

   }
}
