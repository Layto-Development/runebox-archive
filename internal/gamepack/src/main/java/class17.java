public final class class17 {
   class257 field203;
   class524 field204;
   class72 field205;
   int field202;
   int field206;

   public class17(int var1) {
      this(var1, var1);
   }

   public class17(int var1, int var2) {
      this.field205 = new class72();
      this.field206 = var1;
      this.field202 = var1;

      int var3;
      for(var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
      }

      this.field204 = new class524(var3);
   }

   public Object method97(long var1) {
      class69 var3 = (class69)this.field204.method2509(var1);
      if (var3 == null) {
         return null;
      } else {
         Object var4 = var3.method294();
         if (var4 == null) {
            var3.method295();
            var3.method1406();
            this.field202 += var3.field529;
            return null;
         } else {
            if (var3.method293()) {
               class9 var5 = new class9(var4, var3.field529);
               this.field204.method2513(var5, var3.field531);
               this.field205.method297(var5);
               var5.field2069 = 0L;
               var3.method295();
               var3.method1406();
            } else {
               this.field205.method297(var3);
               var3.field2069 = 0L;
            }

            return var4;
         }
      }
   }

   void method103(long var1) {
      class69 var3 = (class69)this.field204.method2509(var1);
      this.method98(var3);
   }

   void method98(class69 var1) {
      if (var1 != null) {
         var1.method295();
         var1.method1406();
         this.field202 += var1.field529;
      }

   }

   public void method99(Object var1, long var2) {
      this.method100(var1, var2, 1);
   }

   public void method100(Object var1, long var2, int var4) {
      if (var4 > this.field206) {
         throw new IllegalStateException();
      } else {
         this.method103(var2);
         this.field202 -= var4;

         while(this.field202 < 0) {
            class69 var5 = (class69)this.field205.method299();
            if (var5 == null) {
               throw new RuntimeException("");
            }

            if (!var5.method293()) {
            }

            this.method98(var5);
            if (this.field203 != null) {
               this.field203.method1200(var5.method294());
            }
         }

         class9 var6 = new class9(var1, var4);
         this.field204.method2513(var6, var2);
         this.field205.method297(var6);
         var6.field2069 = 0L;
      }
   }

   public void method101(int var1) {
      for(class69 var2 = (class69)this.field205.method300(); var2 != null; var2 = (class69)this.field205.method302()) {
         if (var2.method293()) {
            if (var2.method294() == null) {
               var2.method295();
               var2.method1406();
               this.field202 += var2.field529;
            }
         } else if (++var2.field2069 > (long)var1) {
            class335 var3 = new class335(var2.method294(), var2.field529);
            this.field204.method2513(var3, var2.field531);
            class72.method298(var3, var2);
            var2.method295();
            var2.method1406();
         }
      }

   }

   public void method102() {
      this.field205.method303();
      this.field204.method2510();
      this.field202 = this.field206;
   }
}
