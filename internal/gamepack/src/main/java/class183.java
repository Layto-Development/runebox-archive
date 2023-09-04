public class class183 extends class306 {
   public static class509 field1458;
   public static class509 field1460;
   public static class509 field1475;
   static class245 field1461 = new class245(64);
   static class245 field1471 = new class245(20);
   static class245 field1479 = new class245(64);
   int field1463 = -1;
   int field1466 = -1;
   int field1467 = -1;
   int field1468 = -1;
   int field1469 = -1;
   int field1477 = -1;
   int field1478 = -1;
   String field1473 = "";
   public int field1459 = -1;
   public int field1462 = 16777215;
   public int field1464 = 0;
   public int field1465 = -1;
   public int field1470 = 0;
   public int field1472 = 70;
   public int field1474 = 0;
   public int[] field1476;

   class183() {
   }

   void method970(class366 var1) {
      while(true) {
         int var3 = var1.method1654();
         if (var3 == 0) {
            return;
         }

         this.method976(var1, var3, (byte)-17);
      }
   }

   void method976(class366 var1, int var2, byte var3) {
      if (var2 == 1) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field1463 = var1.method1702();
      } else if (var2 == 2) {
         this.field1462 = var1.method1710();
      } else if (var2 == 3) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field1466 = var1.method1702();
      } else if (var2 == 4) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field1468 = var1.method1702();
      } else if (var2 == 5) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field1467 = var1.method1702();
      } else if (var2 == 6) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field1469 = var1.method1702();
      } else if (var2 == 7) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field1470 = var1.method1656();
      } else if (var2 == 8) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field1473 = var1.method1704();
      } else if (var2 == 9) {
         if (var3 >= -1) {
            return;
         }

         this.field1472 = var1.method1703();
      } else if (var2 == 10) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field1464 = var1.method1656();
      } else if (var2 == 11) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field1459 = 0;
      } else if (var2 == 12) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         this.field1465 = var1.method1654();
      } else if (var2 == 13) {
         if (var3 >= -1) {
            return;
         }

         this.field1474 = var1.method1656();
      } else if (var2 == 14) {
         this.field1459 = var1.method1703();
      } else {
         if (var2 != 17) {
            if (var3 >= -1) {
               return;
            }

            if (var2 != 18) {
               return;
            }
         }

         this.field1477 = var1.method1703();
         if (65535 == this.field1477) {
            if (var3 >= -1) {
               throw new IllegalStateException();
            }

            this.field1477 = -1;
         }

         this.field1478 = var1.method1703();
         if (65535 == this.field1478) {
            if (var3 >= -1) {
               throw new IllegalStateException();
            }

            this.field1478 = -1;
         }

         int var4 = -1;
         if (var2 == 18) {
            if (var3 >= -1) {
               return;
            }

            var4 = var1.method1703();
            if (var4 == 65535) {
               if (var3 >= -1) {
                  throw new IllegalStateException();
               }

               var4 = -1;
            }
         }

         int var5 = var1.method1654();
         this.field1476 = new int[var5 + 2];

         for(int var6 = 0; var6 <= var5; ++var6) {
            if (var3 >= -1) {
               throw new IllegalStateException();
            }

            this.field1476[var6] = var1.method1703();
            if (65535 == this.field1476[var6]) {
               this.field1476[var6] = -1;
            }
         }

         this.field1476[var5 + 1] = var4;
      }

   }

   public final class183 method971() {
      int var2 = -1;
      if (-1 != this.field1477) {
         var2 = class486.method2324(this.field1477);
      } else if (-1 != this.field1478) {
         var2 = class486.field3907[this.field1478];
      }

      int var3;
      if (var2 >= 0 && var2 < this.field1476.length - 1) {
         var3 = this.field1476[var2];
      } else {
         var3 = this.field1476[this.field1476.length - 1];
      }

      return var3 != -1 ? method978(var3) : null;
   }

   public String method975(int var1) {
      String var3 = this.field1473;

      while(true) {
         int var4 = var3.indexOf("%1");
         if (var4 < 0) {
            return var3;
         }

         var3 = var3.substring(0, var4) + class447.method2079(var1, false) + var3.substring(var4 + 2);
      }
   }

   public class296 method972() {
      if (this.field1466 < 0) {
         return null;
      } else {
         class296 var2 = (class296)field1461.method1183((long)this.field1466);
         if (null != var2) {
            return var2;
         } else {
            var2 = class513.method2454(field1458, this.field1466, 0);
            if (var2 != null) {
               field1461.method1182(var2, (long)this.field1466);
            }

            return var2;
         }
      }
   }

   public class296 method969() {
      if (this.field1467 < 0) {
         return null;
      } else {
         class296 var2 = (class296)field1461.method1183((long)this.field1467);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class513.method2454(field1458, this.field1467, 0);
            if (var2 != null) {
               field1461.method1182(var2, (long)this.field1467);
            }

            return var2;
         }
      }
   }

   public class296 method973() {
      if (this.field1468 < 0) {
         return null;
      } else {
         class296 var2 = (class296)field1461.method1183((long)this.field1468);
         if (null != var2) {
            return var2;
         } else {
            var2 = class513.method2454(field1458, this.field1468, 0);
            if (var2 != null) {
               field1461.method1182(var2, (long)this.field1468);
            }

            return var2;
         }
      }
   }

   public class296 method974() {
      if (this.field1469 < 0) {
         return null;
      } else {
         class296 var2 = (class296)field1461.method1183((long)this.field1469);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class513.method2454(field1458, this.field1469, 0);
            if (null != var2) {
               field1461.method1182(var2, (long)this.field1469);
            }

            return var2;
         }
      }
   }

   public class396 method977() {
      if (this.field1463 == -1) {
         return null;
      } else {
         class396 var2 = (class396)field1471.method1183((long)this.field1463);
         if (null != var2) {
            return var2;
         } else {
            var2 = class382.method1769(field1458, field1460, this.field1463, 0);
            if (var2 != null) {
               field1471.method1182(var2, (long)this.field1463);
            }

            return var2;
         }
      }
   }

   public static class183 method978(int var0) {
      class183 var2 = (class183)field1479.method1183((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = field1475.method2422(32, var0);
         var2 = new class183();
         if (var3 != null) {
            var2.method970(new class366(var3));
         }

         field1479.method1182(var2, (long)var0);
         return var2;
      }
   }

   public static void method979() {
      field1479.method1180();
      field1461.method1180();
      field1471.method1180();
   }
}
