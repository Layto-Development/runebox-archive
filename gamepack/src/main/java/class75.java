public class class75 {
   static class175 field1223;
   boolean field1203;
   boolean field1205;
   boolean field1217;
   boolean field1218 = true;
   class169 field1204;
   class169 field1224;
   class359[] field1206;
   float field1202;
   float field1207;
   float field1208;
   float field1209;
   float field1210;
   float field1211;
   float field1212;
   float field1213;
   float field1214;
   float field1215;
   float field1222;
   float field1225;
   float[] field1219;
   int field1216 = 0;
   int field1220;
   int field1221;

   class75() {
   }

   int method688(class184 var1, int var2, byte var3) {
      int var4 = var1.method1174();
      int var5 = var1.readUnsignedByte();
      class328[] var6 = new class328[]{class328.field2643, class328.field2641, class328.field2642, class328.field2646, class328.field2644, class328.field2645, class328.field2640, class328.field2647, class328.field2648};
      class328 var7 = (class328)class341.method1788(var6, var5);
      if (null == var7) {
         var7 = class328.field2648;
      }

      this.field1204 = class169.method1020(var1.readUnsignedByte());
      this.field1224 = class169.method1020(var1.readUnsignedByte());
      boolean var10001;
      if (var1.readUnsignedByte() != 0) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         var10001 = true;
      } else {
         var10001 = false;
      }

      this.field1217 = var10001;
      this.field1206 = new class359[var4];
      class359 var9 = null;

      for(int var10 = 0; var10 < var4; ++var10) {
         if (var3 >= -1) {
            throw new IllegalStateException();
         }

         class359 var8 = new class359();
         var8.method1836(var1, var2);
         this.field1206[var10] = var8;
         if (null != var9) {
            if (var3 >= -1) {
               throw new IllegalStateException();
            }

            var9.field2819 = var8;
         }

         var9 = var8;
      }

      return var4;
   }

   void method689() {
      this.field1220 = this.field1206[0].field2813;
      this.field1221 = this.field1206[this.method693() - 1].field2813;
      this.field1219 = new float[this.method695() + 1];

      for(int var2 = this.method691(); var2 <= this.method687(); ++var2) {
         this.field1219[var2 - this.method691()] = class146.method926(this, (float)var2);
      }

      this.field1206 = null;
      this.field1222 = class146.method926(this, (float)(this.method691() - 1));
      this.field1213 = class146.method926(this, (float)(this.method687() + 1));
   }

   public float method690(int var1) {
      if (var1 < this.method691()) {
         return this.field1222;
      } else {
         return var1 > this.method687() ? this.field1213 : this.field1219[var1 - this.method691()];
      }
   }

   int method691() {
      return this.field1220;
   }

   int method687() {
      return this.field1221;
   }

   int method695() {
      return this.method687() - this.method691();
   }

   int method694(float var1) {
      if (this.field1216 < 0 || !((float)this.field1206[this.field1216].field2813 <= var1) || this.field1206[this.field1216].field2819 != null && !((float)this.field1206[this.field1216].field2819.field2813 > var1)) {
         if (!(var1 < (float)this.method691()) && !(var1 > (float)this.method687())) {
            int var3 = this.method693();
            int var4 = this.field1216;
            if (var3 > 0) {
               int var5 = 0;
               int var6 = var3 - 1;

               do {
                  int var7 = var6 + var5 >> 1;
                  if (var1 < (float)this.field1206[var7].field2813) {
                     if (var1 > (float)this.field1206[var7 - 1].field2813) {
                        var4 = var7 - 1;
                        break;
                     }

                     var6 = var7 - 1;
                  } else {
                     if (!(var1 > (float)this.field1206[var7].field2813)) {
                        var4 = var7;
                        break;
                     }

                     if (var1 < (float)this.field1206[var7 + 1].field2813) {
                        var4 = var7;
                        break;
                     }

                     var5 = var7 + 1;
                  }
               } while(var5 <= var6);
            }

            if (this.field1216 != var4) {
               this.field1216 = var4;
               this.field1218 = true;
            }

            return this.field1216;
         } else {
            return -1;
         }
      } else {
         return this.field1216;
      }
   }

   class359 method692(float var1) {
      int var3 = this.method694(var1);
      return var3 >= 0 && var3 < this.field1206.length ? this.field1206[var3] : null;
   }

   int method693() {
      return null == this.field1206 ? 0 : this.field1206.length;
   }
}
