import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class class163 extends class306 {
   public static class245 field1035 = new class245(64);
   public static class245 field1036 = new class245(30);
   public static class509 field1034;
   public static class509 field1047;
   static boolean field1040;
   int field1033 = 128;
   int field1037;
   int field1038 = 0;
   int field1045 = 128;
   int field1046 = 0;
   int field1048 = 0;
   int field1049;
   short[] field1041;
   short[] field1042;
   short[] field1043;
   short[] field1044;
   public int field1039 = -1;

   class163() {
   }

   void method623(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         this.method620(var1, var3);
      }
   }

   void method620(class366 var1, int var2) {
      if (var2 == 1) {
         this.field1049 = var1.method1703();
      } else if (var2 == 2) {
         this.field1039 = var1.method1703();
      } else if (var2 == 4) {
         this.field1033 = var1.method1703();
      } else if (var2 == 5) {
         this.field1045 = var1.method1703();
      } else if (var2 == 6) {
         this.field1046 = var1.method1703();
      } else if (var2 == 7) {
         this.field1038 = var1.method1654();
      } else if (var2 == 8) {
         this.field1048 = var1.method1654();
      } else {
         int var4;
         int var5;
         if (var2 == 40) {
            var4 = var1.method1654();
            this.field1044 = new short[var4];
            this.field1041 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1044[var5] = (short)var1.method1703();
               this.field1041[var5] = (short)var1.method1703();
            }
         } else if (var2 == 41) {
            var4 = var1.method1654();
            this.field1042 = new short[var4];
            this.field1043 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1042[var5] = (short)var1.method1703();
               this.field1043[var5] = (short)var1.method1703();
            }
         }
      }

   }

   public final class485 method621(int var1) {
      class485 var3 = this.method622();
      class485 var4;
      if (-1 != this.field1039 && var1 != -1) {
         var4 = class464.method2200(this.field1039).method2192(var3, var1);
      } else {
         var4 = var3.method2318(true);
      }

      if (this.field1033 != 128 || 128 != this.field1045) {
         var4.method2306(this.field1033, this.field1045, this.field1033);
      }

      if (this.field1046 != 0) {
         if (90 == this.field1046) {
            var4.method2303();
         }

         if (this.field1046 == 180) {
            var4.method2303();
            var4.method2303();
         }

         if (this.field1046 == 270) {
            var4.method2303();
            var4.method2303();
            var4.method2303();
         }
      }

      return var4;
   }

   public final class485 method622() {
      class485 var2 = (class485)field1036.method1183((long)this.field1037);
      if (null == var2) {
         class327 var3 = class327.method1514(field1034, this.field1049, 0);
         if (var3 == null) {
            return null;
         }

         int var4;
         if (null != this.field1044) {
            for(var4 = 0; var4 < this.field1044.length; ++var4) {
               var3.method1513(this.field1044[var4], this.field1041[var4]);
            }
         }

         if (this.field1042 != null) {
            for(var4 = 0; var4 < this.field1042.length; ++var4) {
               var3.method1504(this.field1042[var4], this.field1043[var4]);
            }
         }

         var2 = var3.method1510(64 + this.field1038, 850 + this.field1048, -30, -50, -30);
         field1036.method1182(var2, (long)this.field1037);
      }

      return var2;
   }

   public static class163 method625(int var0) {
      class163 var2 = (class163)field1035.method1183((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = field1047.method2422(13, var0);
         var2 = new class163();
         var2.field1037 = var0;
         if (var3 != null) {
            var2.method623(new class366(var3));
         }

         field1035.method1182(var2, (long)var0);
         return var2;
      }
   }

   static Date method624() throws ParseException {
      SimpleDateFormat var1 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
      var1.setLenient(false);
      StringBuilder var2 = new StringBuilder();
      String[] var3 = class292.field2002;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         String var5 = var3[var4];
         if (var5 == null) {
            class292.method1316(7);
            class292.method1328("Date not valid.", "Please ensure all characters are populated.", "");
            return null;
         }

         var2.append(var5);
      }

      var2.append("12");
      return var1.parse(var2.toString());
   }
}
