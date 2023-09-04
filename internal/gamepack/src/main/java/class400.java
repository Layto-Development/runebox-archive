public class class400 implements class44 {
   boolean field2779 = false;
   boolean field2781 = false;
   class322 field2780 = null;

   public void method1826(class322 var1) {
      this.method1825();
      if (var1 != null) {
         this.field2780 = var1;
         class200 var3 = var1.method1470();
         if (null != var3) {
            var3.field1552.method664(true);
            if (var3.field1553 != null) {
               class64 var4 = new class64();
               var4.method284(var1);
               var4.method285(var3.field1553);
               Client.method796().method1995(var4);
            }
         }
      }

   }

   public class322 method1823() {
      return this.field2780;
   }

   public void method1825() {
      if (this.field2780 != null) {
         class200 var2 = this.field2780.method1470();
         class322 var3 = this.field2780;
         this.field2780 = null;
         if (var2 != null) {
            var2.field1552.method664(false);
            if (null != var2.field1553) {
               class64 var4 = new class64();
               var4.method284(var3);
               var4.method285(var2.field1553);
               Client.method796().method1995(var4);
            }

         }
      }
   }

   public boolean method183(int var1) {
      if (this.field2780 == null) {
         return false;
      } else {
         class166 var3 = this.field2780.method1459();
         if (null == var3) {
            return false;
         } else {
            if (var3.method642(var1)) {
               switch (var1) {
                  case 81:
                     this.field2781 = true;
                     break;
                  case 82:
                     this.field2779 = true;
                     break;
                  default:
                     if (this.method1824(var1)) {
                        Client.method869(this.field2780);
                     }
               }
            }

            return var3.method633(var1);
         }
      }
   }

   public boolean method181(int var1) {
      switch (var1) {
         case 81:
            this.field2781 = false;
            return false;
         case 82:
            this.field2779 = false;
            return false;
         default:
            return false;
      }
   }

   public boolean method182(char var1) {
      if (this.field2780 == null) {
         return false;
      } else {
         boolean var3;
         if (var1 >= ' ' && var1 < 127 || var1 > 127 && var1 < 160 || var1 > 160 && var1 <= 255) {
            var3 = true;
         } else {
            label80: {
               if (var1 != 0) {
                  char[] var4 = class459.field3647;

                  for(int var5 = 0; var5 < var4.length; ++var5) {
                     char var6 = var4[var5];
                     if (var1 == var6) {
                        var3 = true;
                        break label80;
                     }
                  }
               }

               var3 = false;
            }
         }

         if (!var3) {
            return false;
         } else {
            class173 var7 = this.field2780.method1483();
            if (null != var7 && var7.method706()) {
               class166 var8 = this.field2780.method1459();
               if (null == var8) {
                  return false;
               } else {
                  if (var8.method634(var1) && var7.method723(var1)) {
                     Client.method869(this.field2780);
                  }

                  return var8.method637(var1);
               }
            } else {
               return false;
            }
         }
      }
   }

   public boolean method184(boolean var1) {
      return false;
   }

   boolean method1824(int var1) {
      if (null == this.field2780) {
         return false;
      } else {
         class173 var3 = this.field2780.method1483();
         if (null != var3 && var3.method706()) {
            switch (var1) {
               case 13:
                  this.method1825();
                  return true;
               case 48:
                  if (this.field2779) {
                     var3.method741();
                  }

                  return true;
               case 65:
                  if (this.field2779) {
                     var3.method665(Client.method912());
                  }

                  return true;
               case 66:
                  if (this.field2779) {
                     var3.method695(Client.method912());
                  }

                  return true;
               case 67:
                  if (this.field2779) {
                     var3.method696(Client.method912());
                  }

                  return true;
               case 84:
                  if (var3.method709() == 0) {
                     var3.method723(10);
                  } else if (this.field2781 && var3.method727()) {
                     var3.method723(10);
                  } else {
                     class200 var4 = this.field2780.method1470();
                     class64 var5 = new class64();
                     var5.method284(this.field2780);
                     var5.method285(var4.field1549);
                     Client.method796().method1995(var5);
                     this.method1825();
                  }

                  return true;
               case 85:
                  if (this.field2779) {
                     var3.method680();
                  } else {
                     var3.method678();
                  }

                  return true;
               case 96:
                  if (this.field2779) {
                     var3.method689(this.field2781);
                  } else {
                     var3.method735(this.field2781);
                  }

                  return true;
               case 97:
                  if (this.field2779) {
                     var3.method690(this.field2781);
                  } else {
                     var3.method688(this.field2781);
                  }

                  return true;
               case 98:
                  if (this.field2779) {
                     var3.method736();
                  } else {
                     var3.method691(this.field2781);
                  }

                  return true;
               case 99:
                  if (this.field2779) {
                     var3.method697();
                  } else {
                     var3.method692(this.field2781);
                  }

                  return true;
               case 101:
                  if (this.field2779) {
                     var3.method701();
                  } else {
                     var3.method679();
                  }

                  return true;
               case 102:
                  if (this.field2779) {
                     var3.method686(this.field2781);
                  } else {
                     var3.method684(this.field2781);
                  }

                  return true;
               case 103:
                  if (this.field2779) {
                     var3.method687(this.field2781);
                  } else {
                     var3.method685(this.field2781);
                  }

                  return true;
               case 104:
                  if (this.field2779) {
                     var3.method731(this.field2781);
                  } else {
                     var3.method693(this.field2781);
                  }

                  return true;
               case 105:
                  if (this.field2779) {
                     var3.method730(this.field2781);
                  } else {
                     var3.method681(this.field2781);
                  }

                  return true;
               default:
                  return false;
            }
         } else {
            return false;
         }
      }
   }
}
