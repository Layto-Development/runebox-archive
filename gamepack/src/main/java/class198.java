public class class198 extends class129 {
   int field1925;
   int field1926;
   int field1927;
   int field1928;

   class198() {
   }

   void method1227(class184 var1) {
      int var3 = var1.readUnsignedByte();
      if (class483.field3836.field3837 != var3) {
         throw new IllegalStateException("");
      } else {
         super.field1532 = var1.readUnsignedByte();
         super.field1533 = var1.readUnsignedByte();
         super.field1537 = var1.method1174();
         super.field1535 = var1.method1174();
         this.field1926 = var1.readUnsignedByte();
         this.field1927 = var1.readUnsignedByte();
         super.field1531 = var1.method1174();
         super.field1538 = var1.method1174();
         this.field1925 = var1.readUnsignedByte();
         this.field1928 = var1.readUnsignedByte();
         super.field1539 = var1.method1173();
         super.field1529 = var1.method1173();
      }
   }

   void method883(class184 var1) {
      super.field1533 = Math.min(super.field1533, 4);
      super.field1536 = new short[1][64][64];
      super.field1534 = new short[super.field1533][64][64];
      super.field1543 = new byte[super.field1533][64][64];
      super.field1530 = new byte[super.field1533][64][64];
      super.field1540 = new class207[super.field1533][64][64][];
      int var3 = var1.readUnsignedByte();
      if (class353.field2776.field2775 != var3) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.readUnsignedByte();
         int var5 = var1.readUnsignedByte();
         int var6 = var1.readUnsignedByte();
         int var7 = var1.readUnsignedByte();
         if (super.field1531 == var4 && var5 == super.field1538 && var6 == this.field1925 && this.field1928 == var7) {
            for(int var8 = 0; var8 < 8; ++var8) {
               for(int var9 = 0; var9 < 8; ++var9) {
                  this.method885(var8 + this.field1925 * 8, var9 + this.field1928 * 8, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class198)) {
         return false;
      } else {
         class198 var2 = (class198)var1;
         if (super.field1531 == var2.field1531 && var2.field1538 == super.field1538) {
            return var2.field1925 == this.field1925 && this.field1928 == var2.field1928;
         } else {
            return false;
         }
      }
   }

   public int hashCode() {
      return super.field1531 | super.field1538 << 8 | this.field1925 << 16 | this.field1928 << 24;
   }

   int method1230() {
      return this.field1926;
   }

   int method1231() {
      return this.field1927;
   }

   int method1229() {
      return this.field1925;
   }

   int method1228() {
      return this.field1928;
   }
}
