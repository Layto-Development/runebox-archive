public class class19 extends class428 {
   static class69 field209;
   int field204 = 1;
   final class161 field208;
   final class246 field203;
   public byte field206;
   public int field207;
   public String field202 = null;
   public String field205 = null;

   public class19(class246 var1, class161 var2) {
      super(500);
      this.field203 = var1;
      this.field208 = var2;
   }

   class332 method2055() {
      return new class498();
   }

   class332[] method2049(int var1) {
      return new class498[var1];
   }

   final void method230(String var1) {
      this.field202 = class360.method1838(var1);
   }

   final void method231(String var1) {
      this.field205 = class360.method1838(var1);
   }

   public final void method232(class184 var1, int var2) {
      this.method231(var1.method1133());
      long var4 = var1.method1130();
      long var7 = var4;
      String var6;
      int var9;
      if (var4 > 0L && var4 < 6582952005840035281L) {
         if (var4 % 37L == 0L) {
            var6 = null;
         } else {
            var9 = 0;

            for(long var10 = var4; 0L != var10; var10 /= 37L) {
               ++var9;
            }

            StringBuilder var12 = new StringBuilder(var9);

            while(var7 != 0L) {
               long var13 = var7;
               var7 /= 37L;
               var12.append(class360.field2823[(int)(var13 - var7 * 37L)]);
            }

            var6 = var12.reverse().toString();
         }
      } else {
         var6 = null;
      }

      this.method230(var6);
      this.field206 = var1.method1126();
      short var15;
      if (var2 == 1) {
         var9 = var1.method1125();
         var15 = 255;
      } else {
         if (var2 != 2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var9 = var1.method1137();
         var15 = -1;
      }

      if (var15 != var9) {
         int var11 = var9;
         this.method2037();

         for(int var16 = 0; var16 < var11; ++var16) {
            class498 var17 = (class498)this.method2052(new class251(var1.method1133(), this.field203));
            int var14 = var1.method1174();
            var17.method1983(var14, ++this.field204 - 1);
            var17.field3158 = var1.method1126();
            var1.method1133();
            this.method235(var17);
         }

      }
   }

   public final void method233(class184 var1, byte var2) {
      class251 var3 = new class251(var1.method1133(), this.field203);
      int var4 = var1.method1174();
      byte var5 = var1.method1126();
      boolean var6 = false;
      if (var5 == -128) {
         if (var2 == -1) {
            return;
         }

         var6 = true;
      }

      class498 var7;
      if (var6) {
         if (var2 == -1) {
            throw new IllegalStateException();
         }

         if (this.method2058() == 0) {
            if (var2 == -1) {
               throw new IllegalStateException();
            }

            return;
         }

         var7 = (class498)this.method2040(var3);
         if (var7 != null) {
            if (var2 == -1) {
               return;
            }

            if (var7.method1984() == var4) {
               if (var2 == -1) {
                  throw new IllegalStateException();
               }

               this.method2041(var7);
            }
         }
      } else {
         var1.method1133();
         var7 = (class498)this.method2040(var3);
         if (null == var7) {
            if (var2 == -1) {
               throw new IllegalStateException();
            }

            if (this.method2058() > super.field3240) {
               return;
            }

            var7 = (class498)this.method2052(var3);
         }

         var7.method1983(var4, ++this.field204 - 1);
         var7.field3158 = var5;
         this.method235(var7);
      }

   }

   public final void method234() {
      for(int var2 = 0; var2 < this.method2058(); ++var2) {
         ((class498)this.method2045(var2)).method2435();
      }

   }

   public final void method229(byte var1) {
      for(int var2 = 0; var2 < this.method2058(); ++var2) {
         if (var1 != -1) {
            throw new IllegalStateException();
         }

         ((class498)this.method2045(var2)).method2440();
      }

   }

   final void method235(class498 var1) {
      if (var1.method1765().equals(this.field208.method990())) {
         this.field207 = var1.field3158;
      }

   }
}
