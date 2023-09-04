import java.util.regex.Pattern;

@class466
public final class class330 {
   static {
      Pattern.compile("^\\D*(\\d+)\\D*$");
   }

   class330() throws Throwable {
   }

   public static String method1745(CharSequence[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var9 = var0[var1];
         return var9 == null ? "null" : var9.toString();
      } else {
         int var4 = var2 + var1;
         int var5 = 0;

         for(int var6 = var1; var6 < var4; ++var6) {
            CharSequence var7 = var0[var6];
            if (var7 == null) {
               var5 += 4;
            } else {
               var5 += var7.length();
            }
         }

         StringBuilder var10 = new StringBuilder(var5);

         for(int var11 = var1; var11 < var4; ++var11) {
            CharSequence var8 = var0[var11];
            if (null == var8) {
               var10.append("null");
            } else {
               var10.append(var8);
            }
         }

         return var10.toString();
      }
   }

   public static boolean method1742(CharSequence var0) {
      return method1743(var0, 10, true);
   }

   static boolean method1743(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            int var9 = var0.charAt(var8);
            if (var8 == 0) {
               if (var9 == 45) {
                  var4 = true;
                  continue;
               }

               if (var9 == 43 && var2) {
                  continue;
               }
            }

            if (var9 >= 48 && var9 <= 57) {
               var9 -= 48;
            } else if (var9 >= 65 && var9 <= 90) {
               var9 -= 55;
            } else {
               if (var9 < 97 || var9 > 122) {
                  return false;
               }

               var9 -= 87;
            }

            if (var9 >= var1) {
               return false;
            }

            if (var4) {
               var9 = -var9;
            }

            int var10 = var9 + var1 * var6;
            if (var6 != var10 / var1) {
               return false;
            }

            var6 = var10;
            var5 = true;
         }

         return var5;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static int method1736(CharSequence var0) {
      return method1731(var0, 10, true);
   }

   public static int method1731(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            int var9 = var0.charAt(var8);
            if (var8 == 0) {
               if (var9 == 45) {
                  var4 = true;
                  continue;
               }

               if (var9 == 43 && var2) {
                  continue;
               }
            }

            if (var9 >= 48 && var9 <= 57) {
               var9 -= 48;
            } else if (var9 >= 65 && var9 <= 90) {
               var9 -= 55;
            } else {
               if (var9 < 97 || var9 > 122) {
                  throw new NumberFormatException();
               }

               var9 -= 87;
            }

            if (var9 >= var1) {
               throw new NumberFormatException();
            }

            if (var4) {
               var9 = -var9;
            }

            int var10 = var6 * var1 + var9;
            if (var6 != var10 / var1) {
               throw new NumberFormatException();
            }

            var6 = var10;
            var5 = true;
         }

         if (!var5) {
            throw new NumberFormatException();
         } else {
            return var6;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static String method1732(int var0, boolean var1) {
      return var1 && var0 >= 0 ? method1735(var0, 10, var1) : Integer.toString(var0);
   }

   static String method1735(int var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         if (var2 && var0 >= 0) {
            int var4 = 2;

            for(int var5 = var0 / var1; var5 != 0; ++var4) {
               var5 /= var1;
            }

            char[] var6 = new char[var4];
            var6[0] = '+';

            for(int var7 = var4 - 1; var7 > 0; --var7) {
               int var8 = var0;
               var0 /= var1;
               int var9 = var8 - var1 * var0;
               if (var9 >= 10) {
                  var6[var7] = (char)(var9 + 87);
               } else {
                  var6[var7] = (char)(var9 + 48);
               }
            }

            return new String(var6);
         } else {
            return Integer.toString(var0, var1);
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   public static int method1739(CharSequence var0) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + class162.method996(var0.charAt(var4));
      }

      return var3;
   }

   public static int method1738(CharSequence var0) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + var0.charAt(var4);
      }

      return var3;
   }

   public static boolean method1740(char var0) {
      return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public static boolean method1746(char var0) {
      return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
   }

   public static String method1737(String var0) {
      StringBuilder var2 = new StringBuilder(var0.length());
      int var3 = 0;
      int var4 = -1;

      for(int var5 = 0; var5 < var0.length(); ++var5) {
         char var6 = var0.charAt(var5);
         if (var6 == '<') {
            var2.append(var0.substring(var3, var5));
            var4 = var5;
         } else if (var6 == '>' && var4 != -1) {
            String var7 = var0.substring(var4 + 1, var5);
            var4 = -1;
            if (var7.equals("lt")) {
               var2.append("<");
            } else if (var7.equals("gt")) {
               var2.append(">");
            } else if (var7.equals("br")) {
               var2.append("\n");
            }

            var3 = var5 + 1;
         }
      }

      if (var3 < var0.length()) {
         var2.append(var0.substring(var3, var0.length()));
      }

      return var2.toString();
   }

   public static String method1733(String var0) {
      int var2 = var0.length();
      char[] var3 = new char[var2];
      byte var4 = 2;

      for(int var5 = 0; var5 < var2; ++var5) {
         char var6 = var0.charAt(var5);
         if (var4 == 0) {
            var6 = Character.toLowerCase(var6);
         } else if (var4 == 2 || Character.isUpperCase(var6)) {
            var6 = class162.method992(var6);
         }

         if (Character.isLetter(var6)) {
            var4 = 0;
         } else if (var6 != '.' && var6 != '?' && var6 != '!') {
            if (Character.isSpaceChar(var6)) {
               if (var4 != 2) {
                  var4 = 1;
               }
            } else {
               var4 = 1;
            }
         } else {
            var4 = 2;
         }

         var3[var5] = var6;
      }

      return new String(var3);
   }

   public static String method1744(char var0, int var1) {
      char[] var3 = new char[var1];

      for(int var4 = 0; var4 < var1; ++var4) {
         var3[var4] = var0;
      }

      return new String(var3);
   }

   public static boolean method1734(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else if (var0 >= 160 && var0 <= 255) {
         return true;
      } else {
         return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
      }
   }

   public static int method1741(int var0) {
      if (var0 > 0) {
         return 1;
      } else {
         return var0 < 0 ? -1 : 0;
      }
   }
}
