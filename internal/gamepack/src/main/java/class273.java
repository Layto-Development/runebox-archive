public class class273 extends class397 {
   final class516 field1918;

   public class273(class516 var1) {
      super(400);
      this.field1918 = var1;
   }

   class57 method1811() {
      return new class92();
   }

   class57[] method1805(int var1) {
      return new class92[var1];
   }

   public void method1282(class366 var1, int var2) {
      while(var1.field2652 < var2) {
         int var4 = var1.method1654();
         if (var4 == 4) {
            class349 var10 = new class349(var1.method1662(), this.field1918);
            if (!var10.method1599()) {
               throw new IllegalStateException();
            }

            boolean var11 = false;
            class290.field1979.method551(var10.method1598(), var11);
         } else {
            boolean var5 = (var4 & 1) != 0;
            class349 var6 = new class349(var1.method1662(), this.field1918);
            class349 var7 = new class349(var1.method1662(), this.field1918);
            var1.method1662();
            if (!var6.method1599()) {
               throw new IllegalStateException();
            }

            class92 var8 = (class92)this.method1796(var6);
            if (var5) {
               class92 var9 = (class92)this.method1796(var7);
               if (null != var9 && var8 != var9) {
                  if (var8 != null) {
                     this.method1797(var9);
                  } else {
                     var8 = var9;
                  }
               }
            }

            if (null != var8) {
               this.method1800(var8, var6, var7);
            } else if (this.method1814() < 400) {
               int var12 = this.method1814();
               var8 = (class92)this.method1798(var6, var7);
               var8.field659 = var12;
            }
         }
      }

   }
}
