import java.util.HashMap;
import java.util.Map;

public class class157 extends class151 {
   public static class364 field1657 = new class364(100);
   public static class364 field1665 = new class364(100);
   public static class364 field1666 = new class364(64);
   static boolean field1655 = false;
   boolean[] field1660;
   int field1661 = 0;
   int field1662 = 0;
   int[] field1664;
   int[] field1669;
   public boolean field1670 = false;
   public boolean field1675 = false;
   public int field1656 = 99;
   public int field1659 = -1;
   public int field1667 = -1;
   public int field1668 = -1;
   public int field1671 = 5;
   public int field1673 = -1;
   public int field1676 = -1;
   public int field1677 = -1;
   public int field1678 = 2;
   public int[] field1658;
   public int[] field1663;
   public int[] field1674;
   public Map field1672;

   class157() {
   }

   void method972(class184 var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method973(var1, var3);
      }
   }

   void method973(class184 var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.method1174();
         this.field1674 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1674[var5] = var1.method1174();
         }

         this.field1663 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1663[var5] = var1.method1174();
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1663[var5] += var1.method1174() << 16;
         }
      } else if (var2 == 2) {
         this.field1667 = var1.method1174();
      } else if (var2 == 3) {
         var4 = var1.readUnsignedByte();
         this.field1669 = new int[var4 + 1];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1669[var5] = var1.readUnsignedByte();
         }

         this.field1669[var4] = 9999999;
      } else if (var2 == 4) {
         this.field1670 = true;
      } else if (var2 == 5) {
         this.field1671 = var1.readUnsignedByte();
      } else if (var2 == 6) {
         this.field1668 = var1.method1174();
      } else if (var2 == 7) {
         this.field1673 = var1.method1174();
      } else if (var2 == 8) {
         this.field1656 = var1.readUnsignedByte();
         this.field1675 = true;
      } else if (var2 == 9) {
         this.field1676 = var1.readUnsignedByte();
      } else if (var2 == 10) {
         this.field1677 = var1.readUnsignedByte();
      } else if (var2 == 11) {
         this.field1678 = var1.readUnsignedByte();
      } else if (var2 == 12) {
         var4 = var1.readUnsignedByte();
         this.field1664 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1664[var5] = var1.method1174();
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1664[var5] += var1.method1174() << 16;
         }
      } else if (var2 == 13) {
         var4 = var1.readUnsignedByte();
         this.field1658 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1658[var5] = var1.method1181();
         }
      } else if (var2 == 14) {
         this.field1659 = var1.readInt();
      } else if (var2 == 15) {
         var4 = var1.method1174();
         this.field1672 = new HashMap();

         for(var5 = 0; var5 < var4; ++var5) {
            int var6 = var1.method1174();
            int var7 = var1.method1181();
            this.field1672.put(var6, var7);
         }
      } else if (var2 == 16) {
         this.field1661 = var1.method1174();
         this.field1662 = var1.method1174();
      } else if (var2 == 17) {
         this.field1660 = new boolean[256];

         for(var4 = 0; var4 < this.field1660.length; ++var4) {
            this.field1660[var4] = false;
         }

         var4 = var1.readUnsignedByte();

         for(var5 = 0; var5 < var4; ++var5) {
            this.field1660[var1.readUnsignedByte()] = true;
         }
      }

   }

   void method982() {
      if (this.field1676 == -1) {
         if (this.field1669 == null && null == this.field1660) {
            this.field1676 = 0;
         } else {
            this.field1676 = 2;
         }
      }

      if (this.field1677 == -1) {
         if (null == this.field1669 && this.field1660 == null) {
            this.field1677 = 0;
         } else {
            this.field1677 = 2;
         }
      }

   }

   public class104 method975(class104 var1, int var2) {
      class104 var5;
      if (!this.method983()) {
         var2 = this.field1663[var2];
         class488 var6 = method987(var2 >> 16);
         var2 &= 65535;
         if (var6 == null) {
            return var1.method757(true);
         } else {
            var5 = var1.method757(!var6.method2381(var2));
            var5.method783(var6, var2);
            return var5;
         }
      } else {
         class495 var4 = method985(this.field1659);
         if (null == var4) {
            return var1.method757(true);
         } else {
            var5 = var1.method757(!var4.method2395());
            var5.method762(var4, var2);
            return var5;
         }
      }
   }

   class104 method974(class104 var1, int var2, int var3) {
      class104 var6;
      if (!this.method983()) {
         var2 = this.field1663[var2];
         class488 var7 = method987(var2 >> 16);
         var2 &= 65535;
         if (null == var7) {
            return var1.method757(true);
         } else {
            var6 = var1.method757(!var7.method2381(var2));
            var3 &= 3;
            if (var3 == 1) {
               var6.method770();
            } else if (var3 == 2) {
               var6.method769();
            } else if (var3 == 3) {
               var6.method768();
            }

            var6.method783(var7, var2);
            if (var3 == 1) {
               var6.method768();
            } else if (var3 == 2) {
               var6.method769();
            } else if (var3 == 3) {
               var6.method770();
            }

            return var6;
         }
      } else {
         class495 var5 = method985(this.field1659);
         if (null == var5) {
            return var1.method757(true);
         } else {
            var6 = var1.method757(!var5.method2395());
            var3 &= 3;
            if (var3 == 1) {
               var6.method770();
            } else if (var3 == 2) {
               var6.method769();
            } else if (var3 == 3) {
               var6.method768();
            }

            var6.method762(var5, var2);
            if (var3 == 1) {
               var6.method768();
            } else if (var3 == 2) {
               var6.method769();
            } else if (var3 == 3) {
               var6.method770();
            }

            return var6;
         }
      }
   }

   class104 method976(class104 var1, int var2) {
      class104 var5;
      if (!this.method983()) {
         var2 = this.field1663[var2];
         class488 var6 = method987(var2 >> 16);
         var2 &= 65535;
         if (null == var6) {
            return var1.method784(true);
         } else {
            var5 = var1.method784(!var6.method2381(var2));
            var5.method783(var6, var2);
            return var5;
         }
      } else {
         class495 var4 = method985(this.field1659);
         if (var4 == null) {
            return var1.method784(true);
         } else {
            var5 = var1.method784(!var4.method2395());
            var5.method762(var4, var2);
            return var5;
         }
      }
   }

   public class104 method977(class104 var1, int var2, class157 var3, int var4) {
      if (field1655 && !this.method983() && !var3.method983()) {
         return this.method978(var1, var2, var3, var4);
      } else {
         class104 var6 = var1.method757(false);
         boolean var7 = false;
         class488 var8 = null;
         class370 var9 = null;
         class495 var10;
         if (this.method983()) {
            var10 = this.method981();
            if (var10 == null) {
               return var6;
            }

            if (var3.method983() && null == this.field1660) {
               var6.method762(var10, var2);
               return var6;
            }

            var9 = var10.field3918;
            var6.method765(var9, var10, var2, this.field1660, false, !var3.method983());
         } else {
            var2 = this.field1663[var2];
            var8 = method987(var2 >> 16);
            var2 &= 65535;
            if (null == var8) {
               return var3.method975(var1, var4);
            }

            if (!var3.method983() && (null == this.field1669 || var4 == -1)) {
               var6.method783(var8, var2);
               return var6;
            }

            if (null == this.field1669 || var4 == -1) {
               var6.method783(var8, var2);
               return var6;
            }

            var7 = var3.method983();
            if (!var7) {
               var6.method766(var8, var2, this.field1669, false);
            }
         }

         if (var3.method983()) {
            var10 = var3.method981();
            if (var10 == null) {
               return var6;
            }

            if (null == var9) {
               var9 = var10.field3918;
            }

            var6.method765(var9, var10, var4, this.field1660, true, true);
         } else {
            var4 = var3.field1663[var4];
            class488 var11 = method987(var4 >> 16);
            var4 &= 65535;
            if (var11 == null) {
               return this.method975(var1, var2);
            }

            var6.method766(var11, var4, this.field1669, true);
         }

         if (var7 && var8 != null) {
            var6.method766(var8, var2, this.field1669, false);
         }

         var6.method761();
         return var6;
      }
   }

   class104 method978(class104 var1, int var2, class157 var3, int var4) {
      var2 = this.field1663[var2];
      class488 var6 = method987(var2 >> 16);
      var2 &= 65535;
      if (null == var6) {
         return var3.method975(var1, var4);
      } else {
         var4 = var3.field1663[var4];
         class488 var7 = method987(var4 >> 16);
         var4 &= 65535;
         class104 var8;
         if (var7 == null) {
            var8 = var1.method757(!var6.method2381(var2));
            var8.method783(var6, var2);
            return var8;
         } else {
            var8 = var1.method757(!var6.method2381(var2) & !var7.method2381(var4));
            var8.method775(var6, var2, var7, var4, this.field1669);
            return var8;
         }
      }
   }

   public class104 method979(class104 var1, int var2) {
      if (!this.method983()) {
         int var4 = this.field1663[var2];
         class488 var5 = method987(var4 >> 16);
         var4 &= 65535;
         if (null == var5) {
            return var1.method757(true);
         } else {
            class488 var6 = null;
            int var7 = 0;
            if (this.field1664 != null && var2 < this.field1664.length) {
               var7 = this.field1664[var2];
               var6 = method987(var7 >> 16);
               var7 &= 65535;
            }

            class104 var8;
            if (null != var6 && var7 != 65535) {
               var8 = var1.method757(!var5.method2381(var4) & !var6.method2381(var7));
               var8.method783(var5, var4);
               var8.method783(var6, var7);
               return var8;
            } else {
               var8 = var1.method757(!var5.method2381(var4));
               var8.method783(var5, var4);
               return var8;
            }
         }
      } else {
         return this.method975(var1, var2);
      }
   }

   public boolean method983() {
      return this.field1659 >= 0;
   }

   public int method980() {
      return this.field1662 - this.field1661;
   }

   class495 method981() {
      return this.method983() ? method985(this.field1659) : null;
   }

   public static void method986(class298 var0, class298 var1, class298 var2) {
      class346.field2748 = var0;
      class12.field115 = var1;
      class467.field3604 = var2;
   }

   public static class157 method984(int var0) {
      class157 var2 = (class157)field1666.method1851((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class346.field2748.method1629(12, var0);
         var2 = new class157();
         if (var3 != null) {
            var2.method972(new class184(var3));
         }

         var2.method982();
         field1666.method1850(var2, (long)var0);
         return var2;
      }
   }

   static class488 method987(int var0) {
      class488 var2 = (class488)field1657.method1851((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         var2 = class488.method2382(class12.field115, class467.field3604, var0, false);
         if (var2 != null) {
            field1657.method1850(var2, (long)var0);
         }

         return var2;
      }
   }

   static class495 method985(int var0) {
      return class497.method2431(var0, (byte)6) != 0 ? null : class217.method1313(var0);
   }
}
