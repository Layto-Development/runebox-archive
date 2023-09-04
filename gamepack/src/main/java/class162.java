public class class162 {
   public static class298 field1690;
   public static final char[] field1691 = new char[]{'\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000', '\u0000', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\u0000', '\u017e', '\u0178'};

   class162() throws Throwable {
   }

   public static byte method996(char var0) {
      byte var2;
      if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
         if (var0 == 8364) {
            var2 = -128;
         } else if (var0 == 8218) {
            var2 = -126;
         } else if (var0 == 402) {
            var2 = -125;
         } else if (var0 == 8222) {
            var2 = -124;
         } else if (var0 == 8230) {
            var2 = -123;
         } else if (var0 == 8224) {
            var2 = -122;
         } else if (var0 == 8225) {
            var2 = -121;
         } else if (var0 == 710) {
            var2 = -120;
         } else if (var0 == 8240) {
            var2 = -119;
         } else if (var0 == 352) {
            var2 = -118;
         } else if (var0 == 8249) {
            var2 = -117;
         } else if (var0 == 338) {
            var2 = -116;
         } else if (var0 == 381) {
            var2 = -114;
         } else if (var0 == 8216) {
            var2 = -111;
         } else if (var0 == 8217) {
            var2 = -110;
         } else if (var0 == 8220) {
            var2 = -109;
         } else if (var0 == 8221) {
            var2 = -108;
         } else if (var0 == 8226) {
            var2 = -107;
         } else if (var0 == 8211) {
            var2 = -106;
         } else if (var0 == 8212) {
            var2 = -105;
         } else if (var0 == 732) {
            var2 = -104;
         } else if (var0 == 8482) {
            var2 = -103;
         } else if (var0 == 353) {
            var2 = -102;
         } else if (var0 == 8250) {
            var2 = -101;
         } else if (var0 == 339) {
            var2 = -100;
         } else if (var0 == 382) {
            var2 = -98;
         } else if (var0 == 376) {
            var2 = -97;
         } else {
            var2 = 63;
         }
      } else {
         var2 = (byte)var0;
      }

      return var2;
   }

   static char method992(char var0) {
      return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
   }

   public static char method991(byte var0) {
      int var2 = var0 & 255;
      if (var2 == 0) {
         throw new IllegalArgumentException("" + Integer.toString(var2, 16));
      } else {
         if (var2 >= 128 && var2 < 160) {
            char var3 = field1691[var2 - 128];
            if (var3 == 0) {
               var3 = '?';
            }

            var2 = var3;
         }

         return (char)var2;
      }
   }

   public static byte[] method993(CharSequence var0) {
      int var2 = var0.length();
      byte[] var3 = new byte[var2];

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if ((var5 <= 0 || var5 >= 128) && (var5 < 160 || var5 > 255)) {
            if (var5 == 8364) {
               var3[var4] = -128;
            } else if (var5 == 8218) {
               var3[var4] = -126;
            } else if (var5 == 402) {
               var3[var4] = -125;
            } else if (var5 == 8222) {
               var3[var4] = -124;
            } else if (var5 == 8230) {
               var3[var4] = -123;
            } else if (var5 == 8224) {
               var3[var4] = -122;
            } else if (var5 == 8225) {
               var3[var4] = -121;
            } else if (var5 == 710) {
               var3[var4] = -120;
            } else if (var5 == 8240) {
               var3[var4] = -119;
            } else if (var5 == 352) {
               var3[var4] = -118;
            } else if (var5 == 8249) {
               var3[var4] = -117;
            } else if (var5 == 338) {
               var3[var4] = -116;
            } else if (var5 == 381) {
               var3[var4] = -114;
            } else if (var5 == 8216) {
               var3[var4] = -111;
            } else if (var5 == 8217) {
               var3[var4] = -110;
            } else if (var5 == 8220) {
               var3[var4] = -109;
            } else if (var5 == 8221) {
               var3[var4] = -108;
            } else if (var5 == 8226) {
               var3[var4] = -107;
            } else if (var5 == 8211) {
               var3[var4] = -106;
            } else if (var5 == 8212) {
               var3[var4] = -105;
            } else if (var5 == 732) {
               var3[var4] = -104;
            } else if (var5 == 8482) {
               var3[var4] = -103;
            } else if (var5 == 353) {
               var3[var4] = -102;
            } else if (var5 == 8250) {
               var3[var4] = -101;
            } else if (var5 == 339) {
               var3[var4] = -100;
            } else if (var5 == 382) {
               var3[var4] = -98;
            } else if (var5 == 376) {
               var3[var4] = -97;
            } else {
               var3[var4] = 63;
            }
         } else {
            var3[var4] = (byte)var5;
         }
      }

      return var3;
   }

   public static int method994(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var6 = var2 - var1;

      for(int var7 = 0; var7 < var6; ++var7) {
         char var8 = var0.charAt(var7 + var1);
         if ((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
            if (var8 == 8364) {
               var3[var7 + var4] = -128;
            } else if (var8 == 8218) {
               var3[var4 + var7] = -126;
            } else if (var8 == 402) {
               var3[var7 + var4] = -125;
            } else if (var8 == 8222) {
               var3[var4 + var7] = -124;
            } else if (var8 == 8230) {
               var3[var4 + var7] = -123;
            } else if (var8 == 8224) {
               var3[var7 + var4] = -122;
            } else if (var8 == 8225) {
               var3[var7 + var4] = -121;
            } else if (var8 == 710) {
               var3[var7 + var4] = -120;
            } else if (var8 == 8240) {
               var3[var4 + var7] = -119;
            } else if (var8 == 352) {
               var3[var7 + var4] = -118;
            } else if (var8 == 8249) {
               var3[var4 + var7] = -117;
            } else if (var8 == 338) {
               var3[var7 + var4] = -116;
            } else if (var8 == 381) {
               var3[var7 + var4] = -114;
            } else if (var8 == 8216) {
               var3[var4 + var7] = -111;
            } else if (var8 == 8217) {
               var3[var7 + var4] = -110;
            } else if (var8 == 8220) {
               var3[var4 + var7] = -109;
            } else if (var8 == 8221) {
               var3[var7 + var4] = -108;
            } else if (var8 == 8226) {
               var3[var4 + var7] = -107;
            } else if (var8 == 8211) {
               var3[var4 + var7] = -106;
            } else if (var8 == 8212) {
               var3[var4 + var7] = -105;
            } else if (var8 == 732) {
               var3[var4 + var7] = -104;
            } else if (var8 == 8482) {
               var3[var4 + var7] = -103;
            } else if (var8 == 353) {
               var3[var4 + var7] = -102;
            } else if (var8 == 8250) {
               var3[var4 + var7] = -101;
            } else if (var8 == 339) {
               var3[var7 + var4] = -100;
            } else if (var8 == 382) {
               var3[var4 + var7] = -98;
            } else if (var8 == 376) {
               var3[var7 + var4] = -97;
            } else {
               var3[var4 + var7] = 63;
            }
         } else {
            var3[var7 + var4] = (byte)var8;
         }
      }

      return var6;
   }

   public static String method995(byte[] var0, int var1, int var2) {
      char[] var4 = new char[var2];
      int var5 = 0;

      for(int var6 = 0; var6 < var2; ++var6) {
         int var7 = var0[var1 + var6] & 255;
         if (var7 != 0) {
            if (var7 >= 128 && var7 < 160) {
               char var8 = field1691[var7 - 128];
               if (var8 == 0) {
                  var8 = '?';
               }

               var7 = var8;
            }

            var4[var5++] = (char)var7;
         }
      }

      return new String(var4, 0, var5);
   }
}
