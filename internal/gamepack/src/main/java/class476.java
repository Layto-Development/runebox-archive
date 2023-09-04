public class class476 extends class434 {
   static byte[][] field3769;
   final boolean field3768;

   public class476(boolean var1) {
      this.field3768 = var1;
   }

   int method2247(class538 var1, class538 var2) {
      if (var1.field4284 != 0) {
         if (var2.field4284 == 0) {
            return this.field3768 ? -1 : 1;
         }
      } else if (var2.field4284 != 0) {
         return this.field3768 ? 1 : -1;
      }

      return this.method2028(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method2247((class538)var1, (class538)var2);
   }

   static final void method2248(class433 var0) {
      var0.field3381 = false;
      if (var0.field3386 != -1) {
         class464 var2 = class464.method2200(var0.field3386);
         if (null != var2) {
            if (!var2.method2199() && null != var2.field3674) {
               ++var0.field3416;
               if (var0.field3373 < var2.field3674.length && var0.field3416 > var2.field3685[var0.field3373]) {
                  var0.field3416 = 1;
                  ++var0.field3373;
                  Client.method850(var2, var0.field3373, var0.field3403, var0.field3374);
               }

               if (var0.field3373 >= var2.field3674.length) {
                  if (var2.field3678 > 0) {
                     var0.field3373 -= var2.field3678;
                     if (var2.field3686) {
                        ++var0.field3417;
                     }

                     if (var0.field3373 < 0 || var0.field3373 >= var2.field3674.length || var2.field3686 && var0.field3417 >= var2.field3667) {
                        var0.field3416 = 0;
                        var0.field3373 = 0;
                        var0.field3417 = 0;
                     }
                  } else {
                     var0.field3416 = 0;
                     var0.field3373 = 0;
                  }

                  Client.method850(var2, var0.field3373, var0.field3403, var0.field3374);
               }
            } else if (var2.method2199()) {
               ++var0.field3373;
               int var3 = var2.method2196();
               if (var0.field3373 < var3) {
                  Client.method858(var2, var0.field3373, var0.field3403, var0.field3374);
               } else {
                  if (var2.field3678 > 0) {
                     var0.field3373 -= var2.field3678;
                     if (var2.field3686) {
                        ++var0.field3417;
                     }

                     if (var0.field3373 < 0 || var0.field3373 >= var3 || var2.field3686 && var0.field3417 >= var2.field3667) {
                        var0.field3373 = 0;
                        var0.field3416 = 0;
                        var0.field3417 = 0;
                     }
                  } else {
                     var0.field3416 = 0;
                     var0.field3373 = 0;
                  }

                  Client.method858(var2, var0.field3373, var0.field3403, var0.field3374);
               }
            } else {
               var0.field3386 = -1;
            }
         } else {
            var0.field3386 = -1;
         }
      }

      class231 var7 = new class231(var0.method2021());

      int var4;
      for(class248 var8 = (class248)var7.method1127(); null != var8; var8 = (class248)var7.next()) {
         if (-1 != var8.field1790 && Client.field1419 >= var8.field1789) {
            var4 = class163.method625(var8.field1790).field1039;
            if (var4 == -1) {
               var8.method295();
               --var0.field3424;
            } else {
               var8.field1787 = Math.max(var8.field1787, 0);
               class464 var5 = class464.method2200(var4);
               if (null != var5.field3674 && !var5.method2199()) {
                  ++var8.field1786;
                  if (var8.field1787 < var5.field3674.length && var8.field1786 > var5.field3685[var8.field1787]) {
                     var8.field1786 = 1;
                     ++var8.field1787;
                     Client.method850(var5, var8.field1787, var0.field3403, var0.field3374);
                  }

                  if (var8.field1787 >= var5.field3674.length) {
                     var8.method295();
                     --var0.field3424;
                  }
               } else if (var5.method2199()) {
                  ++var8.field1787;
                  int var6 = var5.method2196();
                  if (var8.field1787 < var6) {
                     Client.method858(var5, var8.field1787, var0.field3403, var0.field3374);
                  } else {
                     var8.method295();
                     --var0.field3424;
                  }
               } else {
                  var8.method295();
                  --var0.field3424;
               }
            }
         }
      }

      class464 var9;
      if (var0.field3418 != -1 && var0.field3435 <= 1) {
         var9 = class464.method2200(var0.field3418);
         if (var9.field3687 == 1 && var0.field3437 > 0 && var0.field3429 <= Client.field1419 && var0.field3430 < Client.field1419) {
            var0.field3435 = 1;
            return;
         }
      }

      if (var0.field3418 != -1 && 0 == var0.field3435) {
         var9 = class464.method2200(var0.field3418);
         if (var9 != null) {
            if (!var9.method2199() && var9.field3674 != null) {
               ++var0.field3420;
               if (var0.field3419 < var9.field3674.length && var0.field3420 > var9.field3685[var0.field3419]) {
                  var0.field3420 = 1;
                  ++var0.field3419;
                  Client.method850(var9, var0.field3419, var0.field3403, var0.field3374);
               }

               if (var0.field3419 >= var9.field3674.length) {
                  var0.field3419 -= var9.field3678;
                  ++var0.field3400;
                  if (var0.field3400 >= var9.field3667) {
                     var0.field3418 = -1;
                  } else if (var0.field3419 >= 0 && var0.field3419 < var9.field3674.length) {
                     Client.method850(var9, var0.field3419, var0.field3403, var0.field3374);
                  } else {
                     var0.field3418 = -1;
                  }
               }

               var0.field3381 = var9.field3681;
            } else if (var9.method2199()) {
               ++var0.field3419;
               var4 = var9.method2196();
               if (var0.field3419 < var4) {
                  Client.method858(var9, var0.field3419, var0.field3403, var0.field3374);
               } else {
                  var0.field3419 -= var9.field3678;
                  ++var0.field3400;
                  if (var0.field3400 >= var9.field3667) {
                     var0.field3418 = -1;
                  } else if (var0.field3419 >= 0 && var0.field3419 < var4) {
                     Client.method858(var9, var0.field3419, var0.field3403, var0.field3374);
                  } else {
                     var0.field3418 = -1;
                  }
               }
            } else {
               var0.field3418 = -1;
            }
         } else {
            var0.field3418 = -1;
         }
      }

      if (var0.field3435 > 0) {
         --var0.field3435;
      }

   }
}
