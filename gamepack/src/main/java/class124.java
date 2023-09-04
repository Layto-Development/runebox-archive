public abstract class class124 extends class55 {
   class124 field1514;
   class367 field1517;
   int field1515;
   volatile boolean field1516 = true;

   protected class124() {
   }

   protected abstract class124 method866();

   protected abstract class124 method867();

   protected abstract int method864();

   protected abstract void method868(int var1);

   protected abstract void method869(int[] var1, int var2, int var3);

   int method865() {
      return 255;
   }

   final void method870(int[] var1, int var2, int var3) {
      if (this.field1516) {
         this.method869(var1, var2, var3);
      } else {
         this.method868(var3);
      }

   }
}
