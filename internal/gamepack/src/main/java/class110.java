public class class110 extends class157 {
   int field714;
   int field715;
   int field716;
   int field717;

   class110() {
   }

   void method395(class366 var1) {
      int var3 = var1.method1654();
      if (class387.field2737.field2738 != var3) {
         throw new IllegalStateException("");
      } else {
         super.field986 = var1.method1654();
         super.field987 = var1.method1654();
         super.field991 = var1.method1703();
         super.field989 = var1.method1703();
         this.field715 = var1.method1654();
         this.field716 = var1.method1654();
         super.field985 = var1.method1703();
         super.field992 = var1.method1703();
         this.field714 = var1.method1654();
         this.field717 = var1.method1654();
         super.field993 = var1.method1702();
         super.field983 = var1.method1702();
      }
   }

   void method595(class366 var1) {
      super.field987 = Math.min(super.field987, 4);
      super.field990 = new short[1][64][64];
      super.field988 = new short[super.field987][64][64];
      super.field997 = new byte[super.field987][64][64];
      super.field984 = new byte[super.field987][64][64];
      super.field994 = new class152[super.field987][64][64][];
      int var3 = var1.method1654();
      if (class37.field317.field316 != var3) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.method1654();
         int var5 = var1.method1654();
         int var6 = var1.method1654();
         int var7 = var1.method1654();
         if (super.field985 == var4 && var5 == super.field992 && var6 == this.field714 && this.field717 == var7) {
            for(int var8 = 0; var8 < 8; ++var8) {
               for(int var9 = 0; var9 < 8; ++var9) {
                  this.method597(var8 + this.field714 * 8, var9 + this.field717 * 8, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class110)) {
         return false;
      } else {
         class110 var2 = (class110)var1;
         if (super.field985 == var2.field985 && var2.field992 == super.field992) {
            return var2.field714 == this.field714 && this.field717 == var2.field717;
         } else {
            return false;
         }
      }
   }

   public int hashCode() {
      return super.field985 | super.field992 << 8 | this.field714 << 16 | this.field717 << 24;
   }

   int method398() {
      return this.field715;
   }

   int method399() {
      return this.field716;
   }

   int method397() {
      return this.field714;
   }

   int method396() {
      return this.field717;
   }
}
