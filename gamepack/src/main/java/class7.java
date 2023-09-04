import java.util.ArrayList;

public class class7 {
   boolean field102 = true;
   class282 field101;
   int field100 = 0;
   int field103 = 0;
   int field104 = 0;
   int field96 = 0;
   int field97 = Integer.MAX_VALUE;
   int field98 = Integer.MAX_VALUE;
   int field99 = 0;
   ArrayList field95 = new ArrayList();

   public class530 method93(int var1) {
      return (class530)this.field95.get(var1);
   }

   class530 method75() {
      return this.field95.size() == 0 ? null : (class530)this.field95.get(this.field95.size() - 1);
   }

   public boolean method112() {
      return this.field95.size() == 0;
   }

   boolean method114() {
      return this.field97 > 1;
   }

   public int method78() {
      return this.field95.size();
   }

   public String method79() {
      if (this.method112()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder(this.method78());

         for(int var3 = 0; var3 < this.method78(); ++var3) {
            class530 var4 = this.method93(var3);
            var2.append(var4.field4170);
         }

         return var2.toString();
      }
   }

   public void method106(int var1) {
      if (this.field101 != null && var1 < 2 * this.field101.field2423) {
         var1 = Integer.MAX_VALUE;
      }

      if (this.field98 != var1) {
         this.field98 = var1;
         this.method113();
      }

   }

   public void method77(int var1) {
      if (var1 != this.field97) {
         this.field97 = var1;
         this.method113();
      }

   }

   public void method80(int var1) {
      if (var1 != this.field104) {
         this.field104 = var1;
         this.method113();
      }

   }

   public void method81(class282 var1) {
      if (var1 != this.field101) {
         this.field101 = var1;
         if (null != this.field101) {
            if (this.field100 == 0) {
               this.field100 = this.field101.field2423;
            }

            if (!this.method112()) {
               this.method113();
            }
         }
      }

   }

   public void method110(int var1) {
      if (this.field103 != var1) {
         this.field103 = var1;
         this.method113();
      }

   }

   public boolean method82(int var1, int var2) {
      if (var1 != this.field96 || this.field99 != var2) {
         this.field96 = var1;
         this.field99 = var2;
         this.method113();
      }

      return true;
   }

   public void method83(int var1) {
      if (var1 != this.field100) {
         this.field100 = var1;
         this.method113();
      }

   }

   public class437 method84(int var1, int var2) {
      if (var2 == var1) {
         return new class437(this, 0, 0);
      } else if (var1 <= this.field95.size() && var2 <= this.field95.size()) {
         return var2 < var1 ? new class437(this, var2, var1) : new class437(this, var1, var2);
      } else {
         return new class437(this, 0, 0);
      }
   }

   public class160 method109(char var1, int var2, int var3) {
      return this.method85(Character.toString(var1), var2, var3);
   }

   public class160 method85(String var1, int var2, int var3) {
      if (var3 == 0) {
         var3 = Integer.MAX_VALUE;
      }

      int var5 = var2;
      if (this.field95.size() >= var3) {
         this.method76(var2, var2);
         return new class160(var2, true);
      } else {
         this.field95.ensureCapacity(this.field95.size() + var1.length());

         for(int var6 = 0; var6 < var1.length() && this.field95.size() < var3; ++var6) {
            class530 var7 = new class530();
            var7.field4170 = var1.charAt(var6);
            this.field95.add(var5, var7);
            ++var5;
         }

         this.method76(var2, var5);
         if (this.field97 != 0 && this.method108() > this.field97) {
            while(var5 != var2) {
               --var5;
               this.method87(var5);
               if (this.method108() <= this.field97) {
                  break;
               }
            }

            return new class160(var5, true);
         } else {
            return new class160(var5, false);
         }
      }
   }

   class160 method107(String var1, int var2) {
      return this.method85(var1, this.field95.size(), var2);
   }

   public class160 method111(String var1) {
      this.method86();
      return this.method107(var1, 0);
   }

   void method86() {
      this.field95.clear();
   }

   public int method87(int var1) {
      return this.method88(var1, var1 + 1);
   }

   public int method88(int var1, int var2) {
      int var4;
      if (var2 < var1) {
         var4 = var2;
         var2 = var1;
         var1 = var4;
      }

      this.field95.subList(var1, var2).clear();
      var4 = var1;
      if (this.method114() && this.field103 == 1) {
         while(var4 > 0) {
            --var4;
            char var5 = ((class530)this.field95.get(var4)).field4170;
            if (var5 == ' ' || var5 == '\t') {
               break;
            }
         }
      }

      this.method76(var4, var2);
      return var1;
   }

   public int method105(int var1, int var2) {
      if (null == this.field101) {
         return 0;
      } else if (this.method114() && var1 > this.field98) {
         return this.field95.size();
      } else {
         if (!this.field95.isEmpty()) {
            for(int var4 = 0; var4 < this.field95.size(); ++var4) {
               class530 var5 = (class530)this.field95.get(var4);
               if (var2 <= var5.field4172 + this.method92()) {
                  if (var2 < var5.field4172) {
                     break;
                  }

                  if (var1 < var5.field4169) {
                     return var4 > 0 ? var4 - 1 : 0;
                  }

                  if (var4 + 1 != this.field95.size() && ((class530)this.field95.get(var4 + 1)).field4172 != var5.field4172) {
                     int var6 = this.method102((class530)this.field95.get(var4), false);
                     if (var1 < var6 + var5.field4169) {
                        return var4;
                     }

                     if (var2 <= var5.field4172 + this.method92()) {
                        return var4 + 1;
                     }
                  }
               }
            }

            class530 var7 = (class530)this.field95.get(this.field95.size() - 1);
            if (var1 >= var7.field4169 && var1 <= var7.field4169 + this.method94() && var2 >= var7.field4172 && var2 <= var7.field4172 + this.method92()) {
               return this.field95.size() - 1;
            }
         }

         return this.field95.size();
      }
   }

   public int method89(int var1, int var2) {
      if (this.field101 != null && !this.method112() && var1 <= this.field95.size()) {
         byte var4;
         if (var2 > 0) {
            var4 = 1;
         } else {
            var4 = -1;
            var2 = -var2;
         }

         int var5 = 0;
         int var6 = 0;
         if (var1 > 0) {
            class530 var7 = (class530)this.field95.get(var1 - 1);
            var5 = var7.field4169 + this.method99(var1 - 1);
            var6 = var7.field4172;
         } else if (var4 == -1 && var1 == 0) {
            return 0;
         }

         int var15 = 16777215;
         int var8 = 0;
         int var9 = var1;
         int var10 = 16777215;
         int var11 = var4 == 1 ? this.field95.size() + 1 : 0;

         for(int var12 = var4 + var1; var11 != var12; var12 += var4) {
            class530 var13 = (class530)this.field95.get(var12 - 1);
            if (var6 != var13.field4172) {
               ++var8;
               var6 = var13.field4172;
               if (var8 > var2) {
                  return var9;
               }
            }

            if (var2 == var8) {
               int var14 = Math.abs(var13.field4169 + this.method99(var12 - 1) - var5);
               if (var14 >= var10) {
                  return var9;
               }

               var9 = var12;
               var10 = var14;
            }
         }

         if (var4 == 1) {
            return this.field95.size();
         } else {
            if (var6 != 0) {
               ++var8;
            }

            return var10 != 16777215 && (var2 != var8 || var5 >= var10) ? var9 : 0;
         }
      } else {
         return 0;
      }
   }

   public int method90() {
      if (!this.field95.isEmpty() && this.method108() == 1) {
         return this.field95.isEmpty() ? 0 : ((class530)this.field95.get(this.field95.size() - 1)).field4169 + this.method94();
      } else {
         int var2 = -1;
         int var3 = 0;

         for(int var4 = this.field95.size() - 1; var4 >= 0; --var4) {
            class530 var5 = (class530)this.field95.get(var4);
            if (var2 != var5.field4172) {
               int var6 = this.method102(var5, false) + var5.field4169;
               var3 = Math.max(var6, var3);
               var2 = var5.field4172;
            }
         }

         return var3;
      }
   }

   public int method91() {
      return this.method112() ? 0 : this.field101.field2423 + ((class530)this.field95.get(this.field95.size() - 1)).field4172;
   }

   public int method92() {
      return this.field100;
   }

   public int method108() {
      return this.method91() / this.field101.field2423;
   }

   int method94() {
      return this.method112() ? 0 : this.method102((class530)this.field95.get(this.field95.size() - 1), false);
   }

   public int method115() {
      return this.field98;
   }

   public int method95() {
      return this.field97;
   }

   public int method103() {
      return this.field103;
   }

   public int method96() {
      return this.field104;
   }

   public int method97(int var1) {
      switch (this.field96) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            return 0;
      }
   }

   public int method98(int var1) {
      switch (this.field99) {
         case 0:
            return 0;
         case 1:
            return var1 / 2;
         case 2:
            return var1;
         default:
            return 0;
      }
   }

   void method113() {
      this.method76(0, this.field95.size());
   }

   void method76(int var1, int var2) {
      if (!this.method112() && null != this.field101) {
         class467 var4 = this.method100(var1, var2);
         boolean var5 = (Integer)var4.field3606 == 0 && (Integer)var4.field3605 == this.field95.size();
         int var6 = (Integer)var4.field3606;
         int var7 = 0;
         int var8 = var5 ? 0 : ((class530)this.field95.get((Integer)var4.field3606)).field4172;
         int var9 = 0;

         int var10;
         for(var10 = (Integer)var4.field3606; var10 <= (Integer)var4.field3605; ++var10) {
            boolean var11 = var10 >= this.field95.size();
            class530 var12 = (class530)this.field95.get(!var11 ? var10 : this.field95.size() - 1);
            int var13 = !var11 ? this.method102(var12, false) : 0;
            boolean var14 = !var11 && var12.field4170 == '\n';
            boolean var15 = !var11 && this.method114() && var13 + var7 > this.field98;
            if (var14 || var15 || var11) {
               int var16 = var10;
               int var17 = 0;
               int var18;
               int var19;
               class530 var20;
               if (var15) {
                  var18 = 0;
                  if (this.field103 == 1) {
                     for(var19 = var10; var19 > var6; --var19) {
                        var20 = (class530)this.field95.get(var19);
                        var18 += var19 < var16 ? this.method102(var20, false) : 0;
                        if (var20.field4170 == ' ' || var20.field4170 == '\n') {
                           var16 = var19;
                           var7 -= var18;
                           var17 = var18;
                           break;
                        }
                     }
                  }
               }

               var18 = -this.method97(var7);

               for(var19 = var6; var19 < var16; ++var19) {
                  var20 = (class530)this.field95.get(var19);
                  int var21 = this.method102(var20, false);
                  var20.field4169 = var18;
                  var20.field4172 = var8;
                  var18 += var21;
               }

               var6 = var16;
               var7 = var17;
               var8 += this.method92();
               ++var9;
            }

            var7 += !var11 ? var13 : 0;
         }

         if (this.field99 != 0 && var5) {
            var10 = var9 * this.method92();
            int var22 = this.method98(var10);

            for(int var23 = 0; var23 < this.field95.size(); ++var23) {
               class530 var24 = (class530)this.field95.get(var23);
               var24.field4172 -= var22;
            }
         }

      }
   }

   int method99(int var1) {
      return var1 < this.field95.size() ? this.method102((class530)this.field95.get(var1), false) : 0;
   }

   int method102(class530 var1, boolean var2) {
      if (var1.field4170 == '\n') {
         return 0;
      } else if (!var2 && this.field104 != 0) {
         return this.field101.field2426[42];
      } else {
         int var4 = this.field101.field2426[var1.field4170];
         if (var4 == 0) {
            return var1.field4170 == '\t' ? this.field101.field2426[32] * 3 : this.field101.field2426[32];
         } else {
            return var4;
         }
      }
   }

   class467 method100(int var1, int var2) {
      int var4 = Math.min(var1, var2);
      int var5 = Math.max(var1, var2);
      int var6 = this.field95.size();
      if (var4 == 0 && var5 == var6) {
         return new class467(0, var6);
      } else {
         int var7 = this.method101(var4, false);
         int var8 = this.method104(var5, false);
         int var9;
         switch (this.field99) {
            case 0:
               if (this.field96 == 0) {
                  return new class467(var7, var6);
               }

               var9 = this.method101(var4, true);
               return new class467(var9, var6);
            case 1:
               return new class467(0, var6);
            case 2:
               if (this.field96 == 2) {
                  return new class467(0, var8);
               }

               var9 = this.method104(var5, true);
               return new class467(0, var9);
            default:
               return new class467(0, var6);
         }
      }
   }

   int method101(int var1, boolean var2) {
      if (var1 < this.field95.size()) {
         int var4 = ((class530)this.field95.get(var1)).field4172;

         for(int var5 = var1; var5 > 0; --var5) {
            if (((class530)this.field95.get(var5 - 1)).field4172 < var4) {
               if (!var2) {
                  return var5;
               }

               var2 = false;
               var4 = ((class530)this.field95.get(var5 - 1)).field4172;
            }
         }
      }

      return 0;
   }

   int method104(int var1, boolean var2) {
      if (var1 < this.field95.size()) {
         int var4 = ((class530)this.field95.get(var1)).field4172;

         for(int var5 = var1; var5 < this.field95.size() - 1; ++var5) {
            if (((class530)this.field95.get(var5 + 1)).field4172 > var4) {
               if (!var2) {
                  return var5;
               }

               var2 = false;
               var4 = ((class530)this.field95.get(var5 + 1)).field4172;
            }
         }
      }

      return this.field95.size();
   }
}
