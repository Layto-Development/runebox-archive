import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class class529 extends class151 {
   public static class298 field4153;
   public static class298 field4166;
   public static class364 field4154 = new class364(64);
   public static class364 field4155 = new class364(30);
   static boolean field4159;
   int field4152 = 128;
   int field4156;
   int field4157 = 0;
   int field4164 = 128;
   int field4165 = 0;
   int field4167 = 0;
   int field4168;
   short[] field4160;
   short[] field4161;
   short[] field4162;
   short[] field4163;
   public int field4158 = -1;

   class529() {
   }

   void method2513(class184 var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method2510(var1, var3);
      }
   }

   void method2510(class184 var1, int var2) {
      if (var2 == 1) {
         this.field4168 = var1.method1174();
      } else if (var2 == 2) {
         this.field4158 = var1.method1174();
      } else if (var2 == 4) {
         this.field4152 = var1.method1174();
      } else if (var2 == 5) {
         this.field4164 = var1.method1174();
      } else if (var2 == 6) {
         this.field4165 = var1.method1174();
      } else if (var2 == 7) {
         this.field4157 = var1.readUnsignedByte();
      } else if (var2 == 8) {
         this.field4167 = var1.readUnsignedByte();
      } else {
         int var4;
         int var5;
         if (var2 == 40) {
            var4 = var1.readUnsignedByte();
            this.field4163 = new short[var4];
            this.field4160 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field4163[var5] = (short)var1.method1174();
               this.field4160[var5] = (short)var1.method1174();
            }
         } else if (var2 == 41) {
            var4 = var1.readUnsignedByte();
            this.field4161 = new short[var4];
            this.field4162 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field4161[var5] = (short)var1.method1174();
               this.field4162[var5] = (short)var1.method1174();
            }
         }
      }

   }

   public final class104 method2511(int var1) {
      class104 var3 = this.method2512();
      class104 var4;
      if (this.field4158 != -1 && var1 != -1) {
         var4 = class157.method984(this.field4158).method976(var3, var1);
      } else {
         var4 = var3.method784(true);
      }

      if (this.field4152 != 128 || this.field4164 != 128) {
         var4.method771(this.field4152, this.field4164, this.field4152);
      }

      if (this.field4165 != 0) {
         if (this.field4165 == 90) {
            var4.method768();
         }

         if (this.field4165 == 180) {
            var4.method768();
            var4.method768();
         }

         if (this.field4165 == 270) {
            var4.method768();
            var4.method768();
            var4.method768();
         }
      }

      return var4;
   }

   public final class104 method2512() {
      class104 var2 = (class104)field4155.method1851((long)this.field4156);
      if (null == var2) {
         class533 var3 = class533.method2538(field4153, this.field4168, 0);
         if (var3 == null) {
            return null;
         }

         int var4;
         if (null != this.field4163) {
            for(var4 = 0; var4 < this.field4163.length; ++var4) {
               var3.method2537(this.field4163[var4], this.field4160[var4]);
            }
         }

         if (this.field4161 != null) {
            for(var4 = 0; var4 < this.field4161.length; ++var4) {
               var3.method2528(this.field4161[var4], this.field4162[var4]);
            }
         }

         var2 = var3.method2534(64 + this.field4157, 850 + this.field4167, -30, -50, -30);
         field4155.method1850(var2, (long)this.field4156);
      }

      return var2;
   }

   public static class529 method2515(int var0) {
      class529 var2 = (class529)field4154.method1851((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = field4166.method1629(13, var0);
         var2 = new class529();
         var2.field4156 = var0;
         if (var3 != null) {
            var2.method2513(new class184(var3));
         }

         field4154.method1850(var2, (long)var0);
         return var2;
      }
   }

   static Date method2514() throws ParseException {
      SimpleDateFormat var1 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
      var1.setLenient(false);
      StringBuilder var2 = new StringBuilder();
      String[] var3 = class534.field4238;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         String var5 = var3[var4];
         if (var5 == null) {
            class534.method2543(7);
            class534.method2555("Date not valid.", "Please ensure all characters are populated.", "");
            return null;
         }

         var2.append(var5);
      }

      var2.append("12");
      return var1.parse(var2.toString());
   }
}
