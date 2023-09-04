public class class251 implements Comparable {
   String field2230;
   String field2231;

   public class251(String var1) {
      this.field2231 = var1;
      class246 var4 = class246.field2215;
      String var3;
      if (null == var1) {
         var3 = null;
      } else {
         label66: {
            int var5 = 0;

            int var6;
            for(var6 = var1.length(); var5 < var6 && class311.method1682(var1.charAt(var5)); ++var5) {
            }

            while(var6 > var5 && class311.method1682(var1.charAt(var6 - 1))) {
               --var6;
            }

            int var7 = var6 - var5;
            if (var7 >= 1) {
               int var9;
               if (var4 == null) {
                  var9 = 12;
               } else {
                  switch (var4.field2208) {
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
                     if (class311.method1680(var10)) {
                        char var11 = class311.method1679(var10);
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

      this.field2230 = var3;
   }

   public class251(String var1, class246 var2) {
      this.field2231 = var1;
      String var4;
      if (null == var1) {
         var4 = null;
      } else {
         label66: {
            int var5 = 0;

            int var6;
            for(var6 = var1.length(); var5 < var6 && class311.method1682(var1.charAt(var5)); ++var5) {
            }

            while(var6 > var5 && class311.method1682(var1.charAt(var6 - 1))) {
               --var6;
            }

            int var7 = var6 - var5;
            if (var7 >= 1) {
               int var9;
               if (null == var2) {
                  var9 = 12;
               } else {
                  switch (var2.field2208) {
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
                     if (class311.method1680(var10)) {
                        char var11 = class311.method1679(var10);
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

      this.field2230 = var4;
   }

   public String method1458() {
      return this.field2231;
   }

   public String method1456() {
      return this.field2230;
   }

   public boolean method1459() {
      return null != this.field2230;
   }

   public boolean equals(Object var1) {
      if (var1 instanceof class251) {
         class251 var2 = (class251)var1;
         if (null == this.field2230) {
            return null == var2.field2230;
         } else if (null == var2.field2230) {
            return false;
         } else {
            return this.hashCode() != var2.hashCode() ? false : this.field2230.equals(var2.field2230);
         }
      } else {
         return false;
      }
   }

   public int hashCode() {
      return this.field2230 == null ? 0 : this.field2230.hashCode();
   }

   public String toString() {
      return this.method1458();
   }

   public int method1457(class251 var1) {
      if (this.field2230 == null) {
         return null == var1.field2230 ? 0 : 1;
      } else {
         return null == var1.field2230 ? -1 : this.field2230.compareTo(var1.field2230);
      }
   }

   public int compareTo(Object var1) {
      return this.method1457((class251)var1);
   }
}
