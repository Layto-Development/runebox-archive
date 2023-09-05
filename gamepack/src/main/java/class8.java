public abstract class class8 extends class512 implements class473 {
   protected class8(class442 var1, class121 var2, int var3) {
      super(var1, var2, var3);
   }

   protected abstract class455 method119(int var1);

   public int method118() {
      return super.field3983;
   }

   public Object method2286(int var1) {
      class455 var3 = this.method119(var1);
      return null != var3 && var3.method2249() ? var3.method2248() : null;
   }

   public class438 method117(class184 var1) {
      int var3 = var1.method1174();
      class455 var4 = this.method119(var3);
      class438 var5 = new class438(var3);
      Class var6 = var4.field3557.field2222;
      if (var6 == Integer.class) {
         var5.field3325 = var1.readInt();
      } else if (var6 == Long.class) {
         var5.field3325 = var1.method1130();
      } else if (var6 == String.class) {
         var5.field3325 = var1.method1175();
      } else {
         if (!class123.class.isAssignableFrom(var6)) {
            throw new IllegalStateException();
         }

         try {
            class123 var7 = (class123)var6.newInstance();
            var7.method863(var1);
            var5.field3325 = var7;
         } catch (InstantiationException var8) {
         } catch (IllegalAccessException var9) {
         }
      }

      return var5;
   }
}
