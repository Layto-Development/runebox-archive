public class class397 extends class428 {
   final class246 field3102;

   public class397(class246 var1) {
      super(400);
      this.field3102 = var1;
   }

   class332 method2055() {
      return new class11();
   }

   class332[] method2049(int var1) {
      return new class11[var1];
   }

   public void method1917(class184 var1, int var2) {
      while(var1.field1818 < var2) {
         int var4 = var1.readUnsignedByte();
         if (var4 == 4) {
            class251 var10 = new class251(var1.readString(), this.field3102);
            if (!var10.method1459()) {
               throw new IllegalStateException();
            }

            boolean var11 = false;
            class314.field2562.method1487(var10.method1458(), var11);
         } else {
            boolean var5 = (var4 & 1) != 0;
            class251 var6 = new class251(var1.readString(), this.field3102);
            class251 var7 = new class251(var1.readString(), this.field3102);
            var1.readString();
            if (!var6.method1459()) {
               throw new IllegalStateException();
            }

            class11 var8 = (class11)this.method2040(var6);
            if (var5) {
               class11 var9 = (class11)this.method2040(var7);
               if (null != var9 && var8 != var9) {
                  if (var8 != null) {
                     this.method2041(var9);
                  } else {
                     var8 = var9;
                  }
               }
            }

            if (null != var8) {
               this.method2044(var8, var6, var7);
            } else if (this.method2058() < 400) {
               int var12 = this.method2058();
               var8 = (class11)this.method2042(var6, var7);
               var8.field110 = var12;
            }
         }
      }

   }
}
