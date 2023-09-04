public class class139 extends class55 {
   class478 field1583;

   public class139() {
      this.field1583 = null;
   }

   class139(class223 var1) {
      if (var1 != null) {
         this.field1583 = new class478(var1, (class408)null);
      }
   }

   public class139(class408 var1) {
      this.field1583 = new class478((class223)null, var1);
   }

   public boolean method908(byte var1) {
      boolean var10000;
      if (null == this.field1583) {
         if (var1 == -1) {
            throw new IllegalStateException();
         }

         var10000 = true;
      } else {
         var10000 = false;
      }

      return var10000;
   }

   public class408 method910() {
      if (null != this.field1583 && this.field1583.field3656.tryLock()) {
         class408 var2;
         try {
            var2 = this.method907();
         } finally {
            this.field1583.field3656.unlock();
         }

         return var2;
      } else {
         return null;
      }
   }

   public class408 method909() {
      if (this.field1583 != null) {
         this.field1583.field3656.lock();

         class408 var2;
         try {
            var2 = this.method907();
         } finally {
            this.field1583.field3656.unlock();
         }

         return var2;
      } else {
         return null;
      }
   }

   class408 method907() {
      if (this.field1583.field3655 == null) {
         this.field1583.field3655 = this.field1583.field3660.method1329((int[])null);
         this.field1583.field3660 = null;
      }

      return this.field1583.field3655;
   }
}
