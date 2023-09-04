public class class349 implements Comparable {
   String field2568;
   String field2569;

   public class349(String var1) {
      this.field2569 = var1;
      class516 var4 = class516.field4132;
      String var3;
      if (null == var1) {
         var3 = null;
      } else {
         label66: {
            int var5 = 0;

            int var6;
            for(var6 = var1.length(); var5 < var6 && class462.method2177(var1.charAt(var5)); ++var5) {
            }

            while(var6 > var5 && class462.method2177(var1.charAt(var6 - 1))) {
               --var6;
            }

            int var7 = var6 - var5;
            if (var7 >= 1) {
               int var9;
               if (var4 == null) {
                  var9 = 12;
               } else {
                  switch (var4.field4125) {
                     case 0:
                        var9 = 20;
                        break;
                     default:
                        var9 = 12;
                  }
               }

               if (var7 <= var9) {
                  StringBuilder var8 = new StringBuilder(var7);

                  for(var9 = var5; var9 < var6; ++var9) {
                     char var10 = var1.charAt(var9);
                     if (class462.method2175(var10)) {
                        char var11 = class462.method2174(var10);
                        if (var11 != 0) {
                           var8.append(var11);
                        }
                     }
                  }

                  if (var8.length() == 0) {
                     var3 = null;
                  } else {
                     var3 = var8.toString();
                  }
                  break label66;
               }
            }

            var3 = null;
         }
      }

      this.field2568 = var3;
   }

   public class349(String var1, class516 var2) {
      this.field2569 = var1;
      String var4;
      if (null == var1) {
         var4 = null;
      } else {
         label66: {
            int var5 = 0;

            int var6;
            for(var6 = var1.length(); var5 < var6 && class462.method2177(var1.charAt(var5)); ++var5) {
            }

            while(var6 > var5 && class462.method2177(var1.charAt(var6 - 1))) {
               --var6;
            }

            int var7 = var6 - var5;
            if (var7 >= 1) {
               int var9;
               if (null == var2) {
                  var9 = 12;
               } else {
                  switch (var2.field4125) {
                     case 0:
                        var9 = 20;
                        break;
                     default:
                        var9 = 12;
                  }
               }

               if (var7 <= var9) {
                  StringBuilder var8 = new StringBuilder(var7);

                  for(var9 = var5; var9 < var6; ++var9) {
                     char var10 = var1.charAt(var9);
                     if (class462.method2175(var10)) {
                        char var11 = class462.method2174(var10);
                        if (var11 != 0) {
                           var8.append(var11);
                        }
                     }
                  }

                  if (var8.length() == 0) {
                     var4 = null;
                  } else {
                     var4 = var8.toString();
                  }
                  break label66;
               }
            }

            var4 = null;
         }
      }

      this.field2568 = var4;
   }

   public String method1598() {
      return this.field2569;
   }

   public String method1596() {
      return this.field2568;
   }

   public boolean method1599() {
      return null != this.field2568;
   }

   public boolean equals(Object var1) {
      if (var1 instanceof class349) {
         class349 var2 = (class349)var1;
         if (null == this.field2568) {
            return null == var2.field2568;
         } else if (null == var2.field2568) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.field2568.equals(var2.field2568);
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.field2568 == null ? 0 : this.field2568.hashCode();
   }

   public String toString() {
      return this.method1598();
   }

   public int method1597(class349 var1) {
      if (this.field2568 == null) {
         return null == var1.field2568 ? 0 : 1;
      } else {
         return null == var1.field2568 ? -1 : this.field2568.compareTo(var1.field2568);
      }
   }

   public int compareTo(Object var1) {
      return this.method1597((class349)var1);
   }
}
