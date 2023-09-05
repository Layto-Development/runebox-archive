public class class430 extends class129 {
   class430() {
   }

   void method2071(class184 var1) {
      int var3 = var1.readUnsignedByte();
      if (var3 != class483.field3835.field3837) {
         throw new IllegalStateException("");
      } else {
         super.field1532 = var1.readUnsignedByte();
         super.field1533 = var1.readUnsignedByte();
         super.field1537 = var1.method1174();
         super.field1535 = var1.method1174();
         super.field1531 = var1.method1174();
         super.field1538 = var1.method1174();
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
      if (class353.field2774.field2775 != var3) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.readUnsignedByte();
         int var5 = var1.readUnsignedByte();
         if (var4 == super.field1531 && var5 == super.field1538) {
            for(int var6 = 0; var6 < 64; ++var6) {
               for(int var7 = 0; var7 < 64; ++var7) {
                  this.method885(var6, var7, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class430)) {
         return false;
      } else {
         class430 var2 = (class430)var1;
         return super.field1531 == var2.field1531 && super.field1538 == var2.field1538;
      }
   }

   public int hashCode() {
      return super.field1531 | super.field1538 << 8;
   }
}
