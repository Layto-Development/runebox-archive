import java.util.Iterator;

public class class483 extends class78 implements class101 {
   final class17 field3804 = new class17(64);
   final class509 field3803;
   final int field3802;

   public class483(class31 var1, int var2, class103 var3, class509 var4) {
      super(var1, var3, var4 != null ? var4.method2448(var2) : 0);
      this.field3803 = var4;
      this.field3802 = var2;
   }

   protected class187 method313(int var1) {
      synchronized(this.field3804) {
         class118 var3 = (class118)this.field3804.method97((long)var1);
         if (null == var3) {
            var3 = this.method2286(var1);
            this.field3804.method99(var3, (long)var1);
         }

         return var3;
      }
   }

   class118 method2286(int var1) {
      byte[] var3 = this.field3803.method2422(this.field3802, var1);
      class118 var4 = new class118(var1);
      if (var3 != null) {
         var4.method983(new class366(var3));
      }

      return var4;
   }

   public void method2285() {
      synchronized(this.field3804) {
         this.field3804.method102();
      }
   }

   public Iterator iterator() {
      return new class401(this);
   }
}
