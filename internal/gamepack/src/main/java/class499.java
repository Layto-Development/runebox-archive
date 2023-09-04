import java.util.ArrayList;

public class class499 {
   boolean field3995 = true;
   class419 field3994;
   int field3989 = 0;
   int field3990 = Integer.MAX_VALUE;
   int field3991 = Integer.MAX_VALUE;
   int field3992 = 0;
   int field3993 = 0;
   int field3996 = 0;
   int field3997 = 0;
   ArrayList field3988 = new ArrayList();

   public class325 method2364(int var1) {
      return (class325)this.field3988.get(var1);
   }

   class325 method2346() {
      return this.field3988.size() == 0 ? null : (class325)this.field3988.get(this.field3988.size() - 1);
   }

   public boolean method2383() {
      return this.field3988.size() == 0;
   }

   boolean method2385() {
      return this.field3990 > 1;
   }

   public int method2349() {
      return this.field3988.size();
   }

   public String method2350() {
      if (this.method2383()) {
         return "";
      } else {
         StringBuilder var2 = new StringBuilder(this.method2349());

         for(int var3 = 0; var3 < this.method2349(); ++var3) {
            class325 var4 = this.method2364(var3);
            var2.append(var4.field2431);
         }

         return var2.toString();
      }
   }

   public void method2377(int var1) {
      if (this.field3994 != null && var1 < 2 * this.field3994.field2946) {
         var1 = Integer.MAX_VALUE;
      }

      if (this.field3991 != var1) {
         this.field3991 = var1;
         this.method2384();
      }

   }

   public void method2348(int var1) {
      if (var1 != this.field3990) {
         this.field3990 = var1;
         this.method2384();
      }

   }

   public void method2351(int var1) {
      if (var1 != this.field3997) {
         this.field3997 = var1;
         this.method2384();
      }

   }

   public void method2352(class419 var1) {
      if (var1 != this.field3994) {
         this.field3994 = var1;
         if (null != this.field3994) {
            if (this.field3993 == 0) {
               this.field3993 = this.field3994.field2946;
            }

            if (!this.method2383()) {
               this.method2384();
            }
         }
      }

   }

   public void method2381(int var1) {
      if (this.field3996 != var1) {
         this.field3996 = var1;
         this.method2384();
      }

   }

   public boolean method2353(int var1, int var2) {
      if (var1 != this.field3989 || this.field3992 != var2) {
         this.field3989 = var1;
         this.field3992 = var2;
         this.method2384();
      }

      return true;
   }

   public void method2354(int var1) {
      if (var1 != this.field3993) {
         this.field3993 = var1;
         this.method2384();
      }

   }

   public class61 method2355(int var1, int var2) {
      if (var2 == var1) {
         return new class61(this, 0, 0);
      } else if (var1 <= this.field3988.size() && var2 <= this.field3988.size()) {
         return var2 < var1 ? new class61(this, var2, var1) : new class61(this, var1, var2);
      } else {
         return new class61(this, 0, 0);
      }
   }

   public class511 method2380(char var1, int var2, int var3) {
      return this.method2356(Character.toString(var1), var2, var3);
   }

   public class511 method2356(String var1, int var2, int var3) {
      if (var3 == 0) {
         var3 = Integer.MAX_VALUE;
      }

      int var5 = var2;
      if (this.field3988.size() >= var3) {
         this.method2347(var2, var2);
         return new class511(var2, true);
      } else {
         this.field3988.ensureCapacity(this.field3988.size() + var1.length());

         for(int var6 = 0; var6 < var1.length() && this.field3988.size() < var3; ++var6) {
            class325 var7 = new class325();
            var7.field2431 = var1.charAt(var6);
            this.field3988.add(var5, var7);
            ++var5;
         }

         this.method2347(var2, var5);
         if (this.field3990 != 0 && this.method2379() > this.field3990) {
            while(var5 != var2) {
               --var5;
               this.method2358(var5);
               if (this.method2379() <= this.field3990) {
                  break;
               }
            }

            return new class511(var5, true);
         } else {
            return new class511(var5, false);
         }
      }
   }

   class511 method2378(String var1, int var2) {
      return this.method2356(var1, this.field3988.size(), var2);
   }

   public class511 method2382(String var1) {
      this.method2357();
      return this.method2378(var1, 0);
   }

   void method2357() {
      this.field3988.clear();
   }

   public int method2358(int var1) {
      return this.method2359(var1, var1 + 1);
   }

   public int method2359(int var1, int var2) {
      int var4;
      if (var2 < var1) {
         var4 = var2;
         var2 = var1;
         var1 = var4;
      }

      this.field3988.subList(var1, var2).clear();
      var4 = var1;
      if (this.method2385() && this.field3996 == 1) {
         while(var4 > 0) {
            --var4;
            char var5 = ((class325)this.field3988.get(var4)).field2431;
            if (var5 == ' ' || var5 == '\t') {
               break;
            }
         }
      }

      this.method2347(var4, var2);
      return var1;
   }

   public int method2376(int var1, int var2) {
      if (null == this.field3994) {
         return 0;
      } else if (this.method2385() && var1 > this.field3991) {
         return this.field3988.size();
      } else {
         if (!this.field3988.isEmpty()) {
            for(int var4 = 0; var4 < this.field3988.size(); ++var4) {
               class325 var5 = (class325)this.field3988.get(var4);
               if (var2 <= var5.field2433 + this.method2363()) {
                  if (var2 < var5.field2433) {
                     break;
                  }

                  if (var1 < var5.field2430) {
                     return var4 > 0 ? var4 - 1 : 0;
                  }

                  if (var4 + 1 != this.field3988.size() && ((class325)this.field3988.get(var4 + 1)).field2433 != var5.field2433) {
                     int var6 = this.method2373((class325)this.field3988.get(var4), false);
                     if (var1 < var6 + var5.field2430) {
                        return var4;
                     }

                     if (var2 <= var5.field2433 + this.method2363()) {
                        return var4 + 1;
                     }
                  }
               }
            }

            class325 var7 = (class325)this.field3988.get(this.field3988.size() - 1);
            if (var1 >= var7.field2430 && var1 <= var7.field2430 + this.method2365() && var2 >= var7.field2433 && var2 <= var7.field2433 + this.method2363()) {
               return this.field3988.size() - 1;
            }
         }

         return this.field3988.size();
      }
   }

   public int method2360(int var1, int var2) {
      if (this.field3994 != null && !this.method2383() && var1 <= this.field3988.size()) {
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
            class325 var7 = (class325)this.field3988.get(var1 - 1);
            var5 = var7.field2430 + this.method2370(var1 - 1);
            var6 = var7.field2433;
         } else if (var4 == -1 && var1 == 0) {
            return 0;
         }

         int var15 = 16777215;
         int var8 = 0;
         int var9 = var1;
         int var10 = 16777215;
         int var11 = var4 == 1 ? this.field3988.size() + 1 : 0;

         for(int var12 = var4 + var1; var11 != var12; var12 += var4) {
            class325 var13 = (class325)this.field3988.get(var12 - 1);
            if (var6 != var13.field2433) {
               ++var8;
               var6 = var13.field2433;
               if (var8 > var2) {
                  return var9;
               }
            }

            if (var2 == var8) {
               int var14 = Math.abs(var13.field2430 + this.method2370(var12 - 1) - var5);
               if (var14 >= var10) {
                  return var9;
               }

               var9 = var12;
               var10 = var14;
            }
         }

         if (var4 == 1) {
            return this.field3988.size();
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

   public int method2361() {
      if (!this.field3988.isEmpty() && this.method2379() == 1) {
         return this.field3988.isEmpty() ? 0 : ((class325)this.field3988.get(this.field3988.size() - 1)).field2430 + this.method2365();
      } else {
         int var2 = -1;
         int var3 = 0;

         for(int var4 = this.field3988.size() - 1; var4 >= 0; --var4) {
            class325 var5 = (class325)this.field3988.get(var4);
            if (var2 != var5.field2433) {
               int var6 = this.method2373(var5, false) + var5.field2430;
               var3 = Math.max(var6, var3);
               var2 = var5.field2433;
            }
         }

         return var3;
      }
   }

   public int method2362() {
      return this.method2383() ? 0 : this.field3994.field2946 + ((class325)this.field3988.get(this.field3988.size() - 1)).field2433;
   }

   public int method2363() {
      return this.field3993;
   }

   public int method2379() {
      return this.method2362() / this.field3994.field2946;
   }

   int method2365() {
      return this.method2383() ? 0 : this.method2373((class325)this.field3988.get(this.field3988.size() - 1), false);
   }

   public int method2386() {
      return this.field3991;
   }

   public int method2366() {
      return this.field3990;
   }

   public int method2374() {
      return this.field3996;
   }

   public int method2367() {
      return this.field3997;
   }

   public int method2368(int var1) {
      switch (this.field3989) {
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

   public int method2369(int var1) {
      switch (this.field3992) {
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

   void method2384() {
      this.method2347(0, this.field3988.size());
   }

   void method2347(int var1, int var2) {
      if (!this.method2383() && null != this.field3994) {
         class510 var4 = this.method2371(var1, var2);
         boolean var5 = (Integer)var4.field4081 == 0 && (Integer)var4.field4080 == this.field3988.size();
         int var6 = (Integer)var4.field4081;
         int var7 = 0;
         int var8 = var5 ? 0 : ((class325)this.field3988.get((Integer)var4.field4081)).field2433;
         int var9 = 0;

         int var10;
         for(var10 = (Integer)var4.field4081; var10 <= (Integer)var4.field4080; ++var10) {
            boolean var11 = var10 >= this.field3988.size();
            class325 var12 = (class325)this.field3988.get(!var11 ? var10 : this.field3988.size() - 1);
            int var13 = !var11 ? this.method2373(var12, false) : 0;
            boolean var14 = !var11 && var12.field2431 == '\n';
            boolean var15 = !var11 && this.method2385() && var13 + var7 > this.field3991;
            if (var14 || var15 || var11) {
               int var16 = var10;
               int var17 = 0;
               int var18;
               int var19;
               class325 var20;
               if (var15) {
                  var18 = 0;
                  if (this.field3996 == 1) {
                     for(var19 = var10; var19 > var6; --var19) {
                        var20 = (class325)this.field3988.get(var19);
                        var18 += var19 < var16 ? this.method2373(var20, false) : 0;
                        if (var20.field2431 == ' ' || var20.field2431 == '\n') {
                           var16 = var19;
                           var7 -= var18;
                           var17 = var18;
                           break;
                        }
                     }
                  }
               }

               var18 = -this.method2368(var7);

               for(var19 = var6; var19 < var16; ++var19) {
                  var20 = (class325)this.field3988.get(var19);
                  int var21 = this.method2373(var20, false);
                  var20.field2430 = var18;
                  var20.field2433 = var8;
                  var18 += var21;
               }

               var6 = var16;
               var7 = var17;
               var8 += this.method2363();
               ++var9;
            }

            var7 += !var11 ? var13 : 0;
         }

         if (0 != this.field3992 && var5) {
            var10 = var9 * this.method2363();
            int var22 = this.method2369(var10);

            for(int var23 = 0; var23 < this.field3988.size(); ++var23) {
               class325 var24 = (class325)this.field3988.get(var23);
               var24.field2433 -= var22;
            }
         }

      }
   }

   int method2370(int var1) {
      return var1 < this.field3988.size() ? this.method2373((class325)this.field3988.get(var1), false) : 0;
   }

   int method2373(class325 var1, boolean var2) {
      if (var1.field2431 == '\n') {
         return 0;
      } else if (!var2 && 0 != this.field3997) {
         return this.field3994.field2949[42];
      } else {
         int var4 = this.field3994.field2949[var1.field2431];
         if (var4 == 0) {
            return var1.field2431 == '\t' ? this.field3994.field2949[32] * 3 : this.field3994.field2949[32];
         } else {
            return var4;
         }
      }
   }

   class510 method2371(int var1, int var2) {
      int var4 = Math.min(var1, var2);
      int var5 = Math.max(var1, var2);
      int var6 = this.field3988.size();
      if (var4 == 0 && var5 == var6) {
         return new class510(0, var6);
      } else {
         int var7 = this.method2372(var4, false);
         int var8 = this.method2375(var5, false);
         int var9;
         switch (this.field3992) {
            case 0:
               if (this.field3989 == 0) {
                  return new class510(var7, var6);
               }

               var9 = this.method2372(var4, true);
               return new class510(var9, var6);
            case 1:
               return new class510(0, var6);
            case 2:
               if (2 == this.field3989) {
                  return new class510(0, var8);
               }

               var9 = this.method2375(var5, true);
               return new class510(0, var9);
            default:
               return new class510(0, var6);
         }
      }
   }

   int method2372(int var1, boolean var2) {
      if (var1 < this.field3988.size()) {
         int var4 = ((class325)this.field3988.get(var1)).field2433;

         for(int var5 = var1; var5 > 0; --var5) {
            if (((class325)this.field3988.get(var5 - 1)).field2433 < var4) {
               if (!var2) {
                  return var5;
               }

               var2 = false;
               var4 = ((class325)this.field3988.get(var5 - 1)).field2433;
            }
         }
      }

      return 0;
   }

   int method2375(int var1, boolean var2) {
      if (var1 < this.field3988.size()) {
         int var4 = ((class325)this.field3988.get(var1)).field2433;

         for(int var5 = var1; var5 < this.field3988.size() - 1; ++var5) {
            if (((class325)this.field3988.get(var5 + 1)).field2433 > var4) {
               if (!var2) {
                  return var5;
               }

               var2 = false;
               var4 = ((class325)this.field3988.get(var5 + 1)).field2433;
            }
         }
      }

      return this.field3988.size();
   }
}
