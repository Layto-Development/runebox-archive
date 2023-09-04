public final class class23 {
   class197 field226;
   class295 field225;
   class361 field227;
   int field224;
   int field228;

   public class23(int var1) {
      this(var1, var1);
   }

   public class23(int var1, int var2) {
      this.field227 = new class361();
      this.field228 = var1;
      this.field224 = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
      }

      this.field226 = new class197(var3);
   }

   public Object method255(long var1) {
      class109 var3 = (class109)this.field226.method1222(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.method804();
         if (var4 == null) {
            var3.method605();
            var3.method938();
            this.field224 += var3.field1441;
            return null;
         } else {
            if (var3.method803()) {
               class510 var5 = new class510(var4, var3.field1441);
               this.field226.method1226(var5, var3.field1078);
               this.field227.method1839(var5);
               var5.field1625 = 0L;
               var3.method605();
               var3.method938();
            } else {
               this.field227.method1839(var3);
               var3.field1625 = 0L;
            }

            return var4;
         }
      }
   }

   void method261(long var1) {
      class109 var3 = (class109)this.field226.method1222(var1);
      this.method256(var3);
   }

   void method256(class109 var1) {
      if (var1 != null) {
         var1.method605();
         var1.method938();
         this.field224 += var1.field1441;
      }

   }

   public void method257(Object var1, long var2) {
      this.method258(var1, var2, 1);
   }

   public void method258(Object var1, long var2, int var4) {
      if (var4 > this.field228) {
         throw new IllegalStateException();
      } else {
         this.method261(var2);
         this.field224 -= var4;

         while(this.field224 < 0) {
            class109 var5 = (class109)this.field227.method1841();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.method803()) {
            }

            this.method256(var5);
            if (this.field225 != null) {
               this.field225.method1616(var5.method804());
            }
         }

         class510 var6 = new class510(var1, var4);
         this.field226.method1226(var6, var2);
         this.field227.method1839(var6);
         var6.field1625 = 0L;
      }
   }

   public void method259(int var1) {
      for(class109 var2 = (class109)this.field227.method1842(); var2 != null; var2 = (class109)this.field227.method1844()) {
         if (var2.method803()) {
            if (var2.method804() == null) {
               var2.method605();
               var2.method938();
               this.field224 += var2.field1441;
            }
         } else if (++var2.field1625 > (long)var1) {
            class517 var3 = new class517(var2.method804(), var2.field1441);
            this.field226.method1226(var3, var2.field1078);
            class361.method1840(var3, var2);
            var2.method605();
            var2.method938();
         }
      }

   }

   public void method260() {
      this.field227.method1845();
      this.field226.method1223();
      this.field224 = this.field228;
   }
}
