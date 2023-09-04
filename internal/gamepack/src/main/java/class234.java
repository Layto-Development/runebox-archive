public class class234 extends class397 {
   static class36 field1727;
   int field1722 = 1;
   final class263 field1726;
   final class516 field1721;
   public byte field1724;
   public int field1725;
   public String field1720 = null;
   public String field1723 = null;

   public class234(class516 var1, class263 var2) {
      super(500);
      this.field1721 = var1;
      this.field1726 = var2;
   }

   class57 method1811() {
      return new class246();
   }

   class57[] method1805(int var1) {
      return new class246[var1];
   }

   final void method1142(String var1) {
      this.field1720 = class520.method2506(var1);
   }

   final void method1143(String var1) {
      this.field1723 = class520.method2506(var1);
   }

   public final void method1144(class366 var1, int var2) {
      this.method1143(var1.method1662());
      long var4 = var1.method1659();
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
               var12.append(class520.field4156[(int)(var13 - var7 * 37L)]);
            }

            var6 = var12.reverse().toString();
         }
      } else {
         var6 = null;
      }

      this.method1142(var6);
      this.field1724 = var1.method1655();
      short var15;
      if (var2 == 1) {
         var9 = var1.method1654();
         var15 = 255;
      } else {
         if (var2 != 2) {
            throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
         }

         var9 = var1.method1666();
         var15 = -1;
      }

      if (var15 != var9) {
         int var11 = var9;
         this.method1793();

         for(int var16 = 0; var16 < var11; ++var16) {
            class246 var17 = (class246)this.method1808(new class349(var1.method1662(), this.field1721));
            int var14 = var1.method1703();
            var17.method2581(var14, ++this.field1722 - 1);
            var17.field4285 = var1.method1655();
            var1.method1662();
            this.method1147(var17);
         }

      }
   }

   public final void method1145(class366 var1, byte var2) {
      class349 var3 = new class349(var1.method1662(), this.field1721);
      int var4 = var1.method1703();
      byte var5 = var1.method1655();
      boolean var6 = false;
      if (var5 == -128) {
         if (var2 == -1) {
            return;
         }

         var6 = true;
      }

      class246 var7;
      if (var6) {
         if (var2 == -1) {
            throw new IllegalStateException();
         }

         if (this.method1814() == 0) {
            if (var2 == -1) {
               throw new IllegalStateException();
            }

            return;
         }

         var7 = (class246)this.method1796(var3);
         if (var7 != null) {
            if (var2 == -1) {
               return;
            }

            if (var7.method2582() == var4) {
               if (var2 == -1) {
                  throw new IllegalStateException();
               }

               this.method1797(var7);
            }
         }
      } else {
         var1.method1662();
         var7 = (class246)this.method1796(var3);
         if (null == var7) {
            if (var2 == -1) {
               throw new IllegalStateException();
            }

            if (this.method1814() > super.field2767) {
               return;
            }

            var7 = (class246)this.method1808(var3);
         }

         var7.method2581(var4, ++this.field1722 - 1);
         var7.field4285 = var5;
         this.method1147(var7);
      }

   }

   public final void method1146() {
      for(int var2 = 0; var2 < this.method1814(); ++var2) {
         ((class246)this.method1801(var2)).method1184();
      }

   }

   public final void method1141(byte var1) {
      for(int var2 = 0; var2 < this.method1814(); ++var2) {
         if (var1 != -1) {
            throw new IllegalStateException();
         }

         ((class246)this.method1801(var2)).method1189();
      }

   }

   final void method1147(class246 var1) {
      if (var1.method242().equals(this.field1726.method1209())) {
         this.field1725 = var1.field4285;
      }

   }
}
