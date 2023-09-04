public class class97 extends class3 {
   static byte[][] field1316;
   final boolean field1315;

   public class97(boolean var1) {
      this.field1315 = var1;
   }

   int method731(class410 var1, class410 var2) {
      if (var1.field3157 != 0) {
         if (var2.field3157 == 0) {
            return this.field1315 ? -1 : 1;
         }
      } else if (var2.field3157 != 0) {
         return this.field1315 ? 1 : -1;
      }

      return this.method6(var1, var2);
   }

   public int compare(Object var1, Object var2) {
      return this.method731((class410)var1, (class410)var2);
   }

   static final void method732(class518 var0) {
      var0.field4006 = false;
      if (var0.field4011 != -1) {
         class157 var2 = class157.method984(var0.field4011);
         if (null != var2) {
            if (!var2.method983() && null != var2.field1663) {
               ++var0.field4041;
               if (var0.field3998 < var2.field1663.length && var0.field4041 > var2.field1674[var0.field3998]) {
                  var0.field4041 = 1;
                  ++var0.field3998;
                  Client.method466(var2, var0.field3998, var0.field4028, var0.field3999);
               }

               if (var0.field3998 >= var2.field1663.length) {
                  if (var2.field1667 > 0) {
                     var0.field3998 -= var2.field1667;
                     if (var2.field1675) {
                        ++var0.field4042;
                     }

                     if (var0.field3998 < 0 || var0.field3998 >= var2.field1663.length || var2.field1675 && var0.field4042 >= var2.field1656) {
                        var0.field4041 = 0;
                        var0.field3998 = 0;
                        var0.field4042 = 0;
                     }
                  } else {
                     var0.field4041 = 0;
                     var0.field3998 = 0;
                  }

                  Client.method466(var2, var0.field3998, var0.field4028, var0.field3999);
               }
            } else if (var2.method983()) {
               ++var0.field3998;
               int var3 = var2.method980();
               if (var0.field3998 < var3) {
                  Client.method474(var2, var0.field3998, var0.field4028, var0.field3999);
               } else {
                  if (var2.field1667 > 0) {
                     var0.field3998 -= var2.field1667;
                     if (var2.field1675) {
                        ++var0.field4042;
                     }

                     if (var0.field3998 < 0 || var0.field3998 >= var3 || var2.field1675 && var0.field4042 >= var2.field1656) {
                        var0.field3998 = 0;
                        var0.field4041 = 0;
                        var0.field4042 = 0;
                     }
                  } else {
                     var0.field4041 = 0;
                     var0.field3998 = 0;
                  }

                  Client.method474(var2, var0.field3998, var0.field4028, var0.field3999);
               }
            } else {
               var0.field4011 = -1;
            }
         } else {
            var0.field4011 = -1;
         }
      }

      class356 var7 = new class356(var0.method2469());

      int var4;
      for(class515 var8 = (class515)var7.method1828(); null != var8; var8 = (class515)var7.next()) {
         if (var8.field3993 != -1 && Client.field879 >= var8.field3992) {
            var4 = class529.method2515(var8.field3993).field4158;
            if (var4 == -1) {
               var8.method605();
               --var0.field4049;
            } else {
               var8.field3990 = Math.max(var8.field3990, 0);
               class157 var5 = class157.method984(var4);
               if (null != var5.field1663 && !var5.method983()) {
                  ++var8.field3989;
                  if (var8.field3990 < var5.field1663.length && var8.field3989 > var5.field1674[var8.field3990]) {
                     var8.field3989 = 1;
                     ++var8.field3990;
                     Client.method466(var5, var8.field3990, var0.field4028, var0.field3999);
                  }

                  if (var8.field3990 >= var5.field1663.length) {
                     var8.method605();
                     --var0.field4049;
                  }
               } else if (var5.method983()) {
                  ++var8.field3990;
                  int var6 = var5.method980();
                  if (var8.field3990 < var6) {
                     Client.method474(var5, var8.field3990, var0.field4028, var0.field3999);
                  } else {
                     var8.method605();
                     --var0.field4049;
                  }
               } else {
                  var8.method605();
                  --var0.field4049;
               }
            }
         }
      }

      class157 var9;
      if (var0.field4043 != -1 && var0.field4060 <= 1) {
         var9 = class157.method984(var0.field4043);
         if (var9.field1676 == 1 && var0.field4062 > 0 && var0.field4054 <= Client.field879 && var0.field4055 < Client.field879) {
            var0.field4060 = 1;
            return;
         }
      }

      if (var0.field4043 != -1 && var0.field4060 == 0) {
         var9 = class157.method984(var0.field4043);
         if (var9 != null) {
            if (!var9.method983() && var9.field1663 != null) {
               ++var0.field4045;
               if (var0.field4044 < var9.field1663.length && var0.field4045 > var9.field1674[var0.field4044]) {
                  var0.field4045 = 1;
                  ++var0.field4044;
                  Client.method466(var9, var0.field4044, var0.field4028, var0.field3999);
               }

               if (var0.field4044 >= var9.field1663.length) {
                  var0.field4044 -= var9.field1667;
                  ++var0.field4025;
                  if (var0.field4025 >= var9.field1656) {
                     var0.field4043 = -1;
                  } else if (var0.field4044 >= 0 && var0.field4044 < var9.field1663.length) {
                     Client.method466(var9, var0.field4044, var0.field4028, var0.field3999);
                  } else {
                     var0.field4043 = -1;
                  }
               }

               var0.field4006 = var9.field1670;
            } else if (var9.method983()) {
               ++var0.field4044;
               var4 = var9.method980();
               if (var0.field4044 < var4) {
                  Client.method474(var9, var0.field4044, var0.field4028, var0.field3999);
               } else {
                  var0.field4044 -= var9.field1667;
                  ++var0.field4025;
                  if (var0.field4025 >= var9.field1656) {
                     var0.field4043 = -1;
                  } else if (var0.field4044 >= 0 && var0.field4044 < var4) {
                     Client.method474(var9, var0.field4044, var0.field4028, var0.field3999);
                  } else {
                     var0.field4043 = -1;
                  }
               }
            } else {
               var0.field4043 = -1;
            }
         } else {
            var0.field4043 = -1;
         }
      }

      if (var0.field4060 > 0) {
         --var0.field4060;
      }

   }
}
