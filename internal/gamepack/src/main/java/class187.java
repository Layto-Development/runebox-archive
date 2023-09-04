public abstract class class187 implements class115 {
   class377 field1489;

   class187(int var1) {
   }

   abstract void method984(class366 var1, int var2);

   public void method983(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         class383 var4 = (class383)class1.method2(class383.method1773(), var3);
         if (var4 != null) {
            switch (var4.field2708) {
               case 0:
                  int var5 = var1.method1654();
                  this.field1489 = class381.method1758(var5);
                  if (this.field1489 != null) {
                     break;
                  }

                  throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
               case 1:
                  var1.method1704();
                  break;
               case 2:
                  class491[] var6 = new class491[]{class491.field3935, class491.field3932, class491.field3933, class491.field3931};
                  class1.method2(var6, var1.method1654());
                  break;
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
            }
         } else {
            this.method984(var1, var3);
         }
      }
   }

   boolean method986() {
      return this.field1489 != null;
   }

   Object method985() {
      if (class377.field2695 == this.field1489) {
         return 0;
      } else if (class377.field2696 == this.field1489) {
         return -1L;
      } else {
         return class377.field2690 == this.field1489 ? "" : null;
      }
   }
}
