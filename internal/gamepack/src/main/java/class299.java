import java.util.Iterator;

public class class299 extends class8 implements class250 {
   final class23 field2502 = new class23(64);
   final class298 field2501;
   final int field2500;

   public class299(class442 var1, int var2, class121 var3, class298 var4) {
      super(var1, var3, var4 != null ? var4.method1655(var2) : 0);
      this.field2501 = var4;
      this.field2500 = var2;
   }

   protected class455 method119(int var1) {
      synchronized(this.field2502) {
         class350 var3 = (class350)this.field2502.method255((long)var1);
         if (null == var3) {
            var3 = this.method1659(var1);
            this.field2502.method257(var3, (long)var1);
         }

         return var3;
      }
   }

   class350 method1659(int var1) {
      byte[] var3 = this.field2501.method1629(this.field2500, var1);
      class350 var4 = new class350(var1);
      if (var3 != null) {
         var4.method2246(new class184(var3));
      }

      return var4;
   }

   public void method1658() {
      synchronized(this.field2502) {
         this.field2502.method260();
      }
   }

   public Iterator iterator() {
      return new class389(this);
   }
}
