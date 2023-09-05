public class class337 extends class151 {
   public static class298 field2693;
   public static class298 field2695;
   public static class298 field2710;
   static class364 field2696 = new class364(64);
   static class364 field2706 = new class364(20);
   static class364 field2714 = new class364(64);
   int field2698 = -1;
   int field2701 = -1;
   int field2702 = -1;
   int field2703 = -1;
   int field2704 = -1;
   int field2712 = -1;
   int field2713 = -1;
   String field2708 = "";
   public int field2694 = -1;
   public int field2697 = 16777215;
   public int field2699 = 0;
   public int field2700 = -1;
   public int field2705 = 0;
   public int field2707 = 70;
   public int field2709 = 0;
   public int[] field2711;

   class337() {
   }

   void method1776(class184 var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method1782(var1, var3, (byte)-17);
      }
   }

   void method1782(class184 var1, int var2, byte var3) {
      if (var2 == 1) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field2698 = var1.method1173();
      } else if (var2 == 2) {
         this.field2697 = var1.method1181();
      } else if (var2 == 3) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field2701 = var1.method1173();
      } else if (var2 == 4) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field2703 = var1.method1173();
      } else if (var2 == 5) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field2702 = var1.method1173();
      } else if (var2 == 6) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field2704 = var1.method1173();
      } else if (var2 == 7) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field2705 = var1.method1127();
      } else if (var2 == 8) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field2708 = var1.method1175();
      } else if (var2 == 9) {
         if (var3 >= -1) {
            return;
         }

         this.field2707 = var1.method1174();
      } else if (var2 == 10) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field2699 = var1.method1127();
      } else if (var2 == 11) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field2694 = 0;
      } else if (var2 == 12) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field2700 = var1.readUnsignedByte();
      } else if (var2 == 13) {
         if (var3 >= -1) {
            return;
         }

         this.field2709 = var1.method1127();
      } else if (var2 == 14) {
         this.field2694 = var1.method1174();
      } else {
         if (var2 != 17) {
            if (var3 >= -1) {
               return;
            }

            if (var2 != 18) {
               return;
            }
         }

         this.field2712 = var1.method1174();
         if (this.field2712 == 65535) {
            if (var3 >= -1) {
               throw new IllegalStateException();
            }

            this.field2712 = -1;
         }

         this.field2713 = var1.method1174();
         if (this.field2713 == 65535) {
            if (var3 >= -1) {
               throw new IllegalStateException();
            }

            this.field2713 = -1;
         }

         int var4 = -1;
         if (var2 == 18) {
            if (var3 >= -1) {
               return;
            }

            var4 = var1.method1174();
            if (var4 == 65535) {
               if (var3 >= -1) {
                  throw new IllegalStateException();
               }

               var4 = -1;
            }
         }

         int var5 = var1.readUnsignedByte();
         this.field2711 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            if (var3 >= -1) {
               throw new IllegalStateException();
            }

            this.field2711[var6] = var1.method1174();
            if (this.field2711[var6] == 65535) {
               this.field2711[var6] = -1;
            }
         }

         this.field2711[var5 + 1] = var4;
      }

   }

   public final class337 method1777() {
      int var2 = -1;
      if (this.field2712 != -1) {
         var2 = class10.method123(this.field2712);
      } else if (this.field2713 != -1) {
         var2 = class10.field107[this.field2713];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field2711.length - 1) {
         var3 = this.field2711[var2];
      } else {
         var3 = this.field2711[this.field2711.length - 1];
      }

      return var3 != -1 ? method1784(var3) : null;
   }

   public String method1781(int var1) {
      String var3 = this.field2708;

      while(true) {
         int var4 = var3.indexOf("%1");
         if (var4 < 0) {
            return var3;
         }

         var3 = var3.substring(0, var4) + class330.method1732(var1, false) + var3.substring(var4 + 2);
      }
   }

   public class427 method1778() {
      if (this.field2701 < 0) {
         return null;
      } else {
         class427 var2 = (class427)field2696.method1851((long)this.field2701);
         if (null != var2) {
            return var2;
         } else {
            var2 = class526.method2492(field2693, this.field2701, 0);
            if (var2 != null) {
               field2696.method1850(var2, (long)this.field2701);
            }

            return var2;
         }
      }
   }

   public class427 method1775() {
      if (this.field2702 < 0) {
         return null;
      } else {
         class427 var2 = (class427)field2696.method1851((long)this.field2702);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class526.method2492(field2693, this.field2702, 0);
            if (var2 != null) {
               field2696.method1850(var2, (long)this.field2702);
            }

            return var2;
         }
      }
   }

   public class427 method1779() {
      if (this.field2703 < 0) {
         return null;
      } else {
         class427 var2 = (class427)field2696.method1851((long)this.field2703);
         if (null != var2) {
            return var2;
         } else {
            var2 = class526.method2492(field2693, this.field2703, 0);
            if (var2 != null) {
               field2696.method1850(var2, (long)this.field2703);
            }

            return var2;
         }
      }
   }

   public class427 method1780() {
      if (this.field2704 < 0) {
         return null;
      } else {
         class427 var2 = (class427)field2696.method1851((long)this.field2704);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class526.method2492(field2693, this.field2704, 0);
            if (null != var2) {
               field2696.method1850(var2, (long)this.field2704);
            }

            return var2;
         }
      }
   }

   public class460 method1783() {
      if (this.field2698 == -1) {
         return null;
      } else {
         class460 var2 = (class460)field2706.method1851((long)this.field2698);
         if (null != var2) {
            return var2;
         } else {
            var2 = class398.method1929(field2693, field2695, this.field2698, 0);
            if (var2 != null) {
               field2706.method1850(var2, (long)this.field2698);
            }

            return var2;
         }
      }
   }

   public static class337 method1784(int var0) {
      class337 var2 = (class337)field2714.method1851((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = field2710.method1629(32, var0);
         var2 = new class337();
         if (var3 != null) {
            var2.method1776(new class184(var3));
         }

         field2714.method1850(var2, (long)var0);
         return var2;
      }
   }

   public static void method1785() {
      field2714.method1848();
      field2696.method1848();
      field2706.method1848();
   }
}
