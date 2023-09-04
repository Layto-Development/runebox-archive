public class class202 extends class70 {
   class525 field1562;

   public class202() {
      this.field1562 = null;
   }

   class202(class365 var1) {
      if (var1 != null) {
         this.field1562 = new class525(var1, (class404)null);
      }
   }

   public class202(class404 var1) {
      this.field1562 = new class525((class365)null, var1);
   }

   public boolean method1057(byte var1) {
      boolean var10000;
      if (null == this.field1562) {
         if (var1 == -1) {
            throw new IllegalStateException();
         }

         var10000 = true;
      } else {
         var10000 = false;
      }

      return var10000;
   }

   public class404 method1059() {
      if (null != this.field1562 && this.field1562.field4172.tryLock()) {
         class404 var2;
         try {
            var2 = this.method1056();
         } finally {
            this.field1562.field4172.unlock();
         }

         return var2;
      } else {
         return null;
      }
   }

   public class404 method1058() {
      if (this.field1562 != null) {
         this.field1562.field4172.lock();

         class404 var2;
         try {
            var2 = this.method1056();
         } finally {
            this.field1562.field4172.unlock();
         }

         return var2;
      } else {
         return null;
      }
   }

   class404 method1056() {
      if (this.field1562.field4171 == null) {
         this.field1562.field4171 = this.field1562.field4176.method1638((int[])null);
         this.field1562.field4176 = null;
      }

      return this.field1562.field4171;
   }
}
