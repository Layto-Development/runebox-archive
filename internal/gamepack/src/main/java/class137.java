public class class137 {
   static class408 field875;
   boolean field855;
   boolean field857;
   boolean field869;
   boolean field870 = true;
   class108 field856;
   class108 field876;
   class203[] field858;
   float field854;
   float field859;
   float field860;
   float field861;
   float field862;
   float field863;
   float field864;
   float field865;
   float field866;
   float field867;
   float field874;
   float field877;
   float[] field871;
   int field868 = 0;
   int field872;
   int field873;

   class137() {
   }

   int method494(class366 var1, int var2, byte var3) {
      int var4 = var1.method1703();
      int var5 = var1.method1654();
      class228[] var6 = new class228[]{class228.field1699, class228.field1697, class228.field1698, class228.field1702, class228.field1700, class228.field1701, class228.field1696, class228.field1703, class228.field1704};
      class228 var7 = (class228)class1.method2(var6, var5);
      if (null == var7) {
         var7 = class228.field1704;
      }

      this.field856 = class108.method393(var1.method1654());
      this.field876 = class108.method393(var1.method1654());
      boolean var10001;
      if (var1.method1654() != 0) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         var10001 = true;
      } else {
         var10001 = false;
      }

      this.field869 = var10001;
      this.field858 = new class203[var4];
      class203 var9 = null;

      for(int var10 = 0; var10 < var4; ++var10) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         class203 var8 = new class203();
         var8.method1060(var1, var2);
         this.field858[var10] = var8;
         if (null != var9) {
            if (var3 >= -1) {
               throw new IllegalStateException();
            }

            var9.field1569 = var8;
         }

         var9 = var8;
      }

      return var4;
   }

   void method495() {
      this.field872 = this.field858[0].field1563;
      this.field873 = this.field858[this.method499() - 1].field1563;
      this.field871 = new float[this.method501() + 1];

      for(int var2 = this.method497(); var2 <= this.method493(); ++var2) {
         this.field871[var2 - this.method497()] = class129.method481(this, (float)var2);
      }

      this.field858 = null;
      this.field874 = class129.method481(this, (float)(this.method497() - 1));
      this.field865 = class129.method481(this, (float)(this.method493() + 1));
   }

   public float method496(int var1) {
      if (var1 < this.method497()) {
         return this.field874;
      } else {
         return var1 > this.method493() ? this.field865 : this.field871[var1 - this.method497()];
      }
   }

   int method497() {
      return this.field872;
   }

   int method493() {
      return this.field873;
   }

   int method501() {
      return this.method493() - this.method497();
   }

   int method500(float var1) {
      if (this.field868 < 0 || !((float)this.field858[this.field868].field1563 <= var1) || this.field858[this.field868].field1569 != null && !((float)this.field858[this.field868].field1569.field1563 > var1)) {
         if (!(var1 < (float)this.method497()) && !(var1 > (float)this.method493())) {
            int var3 = this.method499();
            int var4 = this.field868;
            if (var3 > 0) {
               int var5 = 0;
               int var6 = var3 - 1;

               do {
                  int var7 = var6 + var5 >> 1;
                  if (var1 < (float)this.field858[var7].field1563) {
                     if (var1 > (float)this.field858[var7 - 1].field1563) {
                        var4 = var7 - 1;
                        break;
                     }

                     var6 = var7 - 1;
                  } else {
                     if (!(var1 > (float)this.field858[var7].field1563)) {
                        var4 = var7;
                        break;
                     }

                     if (var1 < (float)this.field858[var7 + 1].field1563) {
                        var4 = var7;
                        break;
                     }

                     var5 = var7 + 1;
                  }
               } while(var5 <= var6);
            }

            if (this.field868 != var4) {
               this.field868 = var4;
               this.field870 = true;
            }

            return this.field868;
         } else {
            return -1;
         }
      } else {
         return this.field868;
      }
   }

   class203 method498(float var1) {
      int var3 = this.method500(var1);
      return var3 >= 0 && var3 < this.field858.length ? this.field858[var3] : null;
   }

   int method499() {
      return null == this.field858 ? 0 : this.field858.length;
   }
}
