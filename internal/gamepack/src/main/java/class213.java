public class class213 implements class203 {
   boolean field2012 = false;
   boolean field2014 = false;
   class480 field2013 = null;

   public void method1308(class480 var1) {
      this.method1307();
      if (var1 != null) {
         this.field2013 = var1;
         class269 var3 = var1.method2337();
         if (null != var3) {
            var3.field2309.method270(true);
            if (var3.field2310 != null) {
               class208 var4 = new class208();
               var4.method1262(var1);
               var4.method1263(var3.field2310);
               Client.method412().method1240(var4);
            }
         }
      }

   }

   public class480 method1305() {
      return this.field2013;
   }

   public void method1307() {
      if (this.field2013 != null) {
         class269 var2 = this.field2013.method2337();
         class480 var3 = this.field2013;
         this.field2013 = null;
         if (var2 != null) {
            var2.field2309.method270(false);
            if (null != var2.field2310) {
               class208 var4 = new class208();
               var4.method1262(var3);
               var4.method1263(var2.field2310);
               Client.method412().method1240(var4);
            }

         }
      }
   }

   public boolean method1246(int var1) {
      if (this.field2013 == null) {
         return false;
      } else {
         class297 var3 = this.field2013.method2326();
         if (null == var3) {
            return false;
         } else {
            if (var3.method1627(var1)) {
               switch (var1) {
                  case 81:
                     this.field2014 = true;
                     break;
                  case 82:
                     this.field2012 = true;
                     break;
                  default:
                     if (this.method1306(var1)) {
                        Client.method485(this.field2013);
                     }
               }
            }

            return var3.method1618(var1);
         }
      }
   }

   public boolean method1244(int var1) {
      switch (var1) {
         case 81:
            this.field2014 = false;
            return false;
         case 82:
            this.field2012 = false;
            return false;
         default:
            return false;
      }
   }

   public boolean method1245(char var1) {
      if (this.field2013 == null) {
         return false;
      } else {
         boolean var3;
         if (var1 >= ' ' && var1 < 127 || var1 > 127 && var1 < 160 || var1 > 160 && var1 <= 255) {
            var3 = true;
         } else {
            label80: {
               if (var1 != 0) {
                  char[] var4 = class162.field1691;

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
            class28 var7 = this.field2013.method2350();
            if (null != var7 && var7.method312()) {
               class297 var8 = this.field2013.method2326();
               if (null == var8) {
                  return false;
               } else {
                  if (var8.method1619(var1) && var7.method329(var1)) {
                     Client.method485(this.field2013);
                  }

                  return var8.method1622(var1);
               }
            } else {
               return false;
            }
         }
      }
   }

   public boolean method1247(boolean var1) {
      return false;
   }

   boolean method1306(int var1) {
      if (null == this.field2013) {
         return false;
      } else {
         class28 var3 = this.field2013.method2350();
         if (null != var3 && var3.method312()) {
            switch (var1) {
               case 13:
                  this.method1307();
                  return true;
               case 48:
                  if (this.field2012) {
                     var3.method347();
                  }

                  return true;
               case 65:
                  if (this.field2012) {
                     var3.method271(Client.method528());
                  }

                  return true;
               case 66:
                  if (this.field2012) {
                     var3.method301(Client.method528());
                  }

                  return true;
               case 67:
                  if (this.field2012) {
                     var3.method302(Client.method528());
                  }

                  return true;
               case 84:
                  if (var3.method315() == 0) {
                     var3.method329(10);
                  } else if (this.field2014 && var3.method333()) {
                     var3.method329(10);
                  } else {
                     class269 var4 = this.field2013.method2337();
                     class208 var5 = new class208();
                     var5.method1262(this.field2013);
                     var5.method1263(var4.field2306);
                     Client.method412().method1240(var5);
                     this.method1307();
                  }

                  return true;
               case 85:
                  if (this.field2012) {
                     var3.method286();
                  } else {
                     var3.method284();
                  }

                  return true;
               case 96:
                  if (this.field2012) {
                     var3.method295(this.field2014);
                  } else {
                     var3.method341(this.field2014);
                  }

                  return true;
               case 97:
                  if (this.field2012) {
                     var3.method296(this.field2014);
                  } else {
                     var3.method294(this.field2014);
                  }

                  return true;
               case 98:
                  if (this.field2012) {
                     var3.method342();
                  } else {
                     var3.method297(this.field2014);
                  }

                  return true;
               case 99:
                  if (this.field2012) {
                     var3.method303();
                  } else {
                     var3.method298(this.field2014);
                  }

                  return true;
               case 101:
                  if (this.field2012) {
                     var3.method307();
                  } else {
                     var3.method285();
                  }

                  return true;
               case 102:
                  if (this.field2012) {
                     var3.method292(this.field2014);
                  } else {
                     var3.method290(this.field2014);
                  }

                  return true;
               case 103:
                  if (this.field2012) {
                     var3.method293(this.field2014);
                  } else {
                     var3.method291(this.field2014);
                  }

                  return true;
               case 104:
                  if (this.field2012) {
                     var3.method337(this.field2014);
                  } else {
                     var3.method299(this.field2014);
                  }

                  return true;
               case 105:
                  if (this.field2012) {
                     var3.method336(this.field2014);
                  } else {
                     var3.method287(this.field2014);
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
