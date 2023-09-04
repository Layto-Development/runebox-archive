public abstract class class78 extends class83 implements class30 {
   protected class78(class31 var1, class103 var2, int var3) {
      super(var1, var2, var3);
   }

   protected abstract class187 method313(int var1);

   public int method312() {
      return super.field562;
   }

   public Object method135(int var1) {
      class187 var3 = this.method313(var1);
      return null != var3 && var3.method986() ? var3.method985() : null;
   }

   public class374 method311(class366 var1) {
      int var3 = var1.method1703();
      class187 var4 = this.method313(var3);
      class374 var5 = new class374(var3);
      Class var6 = var4.field1489.field2693;
      if (var6 == Integer.class) {
         var5.field2675 = var1.method1658();
      } else if (var6 == Long.class) {
         var5.field2675 = var1.method1659();
      } else if (var6 == String.class) {
         var5.field2675 = var1.method1704();
      } else {
         if (!class541.class.isAssignableFrom(var6)) {
            throw new IllegalStateException();
         }

         try {
            class541 var7 = (class541)var6.newInstance();
            var7.method2584(var1);
            var5.field2675 = var7;
         } catch (InstantiationException var8) {
         } catch (IllegalAccessException var9) {
         }
      }

      return var5;
   }
}
