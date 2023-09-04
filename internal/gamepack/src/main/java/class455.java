public abstract class class455 implements class86 {
   class247 field3557;

   class455(int var1) {
   }

   abstract void method2247(class184 var1, int var2);

   public void method2246(class184 var1) {
      while(true) {
         int var3 = var1.method1125();
         if (var3 == 0) {
            return;
         }

         class107 var4 = (class107)class341.method1788(class107.method798(), var3);
         if (var4 != null) {
            switch (var4.field1430) {
               case 0:
                  int var5 = var1.method1125();
                  this.field3557 = class302.method1662(var5);
                  if (this.field3557 != null) {
                     break;
                  }

                  throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
               case 1:
                  var1.method1175();
                  break;
               case 2:
                  class339[] var6 = new class339[]{class339.field2719, class339.field2716, class339.field2717, class339.field2715};
                  class341.method1788(var6, var1.method1125());
                  break;
               default:
                  throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
            }
         } else {
            this.method2247(var1, var3);
         }
      }
   }

   boolean method2249() {
      return this.field3557 != null;
   }

   Object method2248() {
      if (class247.field2224 == this.field3557) {
         return 0;
      } else if (class247.field2225 == this.field3557) {
         return -1L;
      } else {
         return class247.field2219 == this.field3557 ? "" : null;
      }
   }
}
