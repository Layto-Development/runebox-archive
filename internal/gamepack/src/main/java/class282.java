public class class282 extends class157 {
   class282() {
   }

   void method1296(class366 var1) {
      int var3 = var1.method1654();
      if (var3 != class387.field2736.field2738) {
         throw new IllegalStateException("");
      } else {
         super.field986 = var1.method1654();
         super.field987 = var1.method1654();
         super.field991 = var1.method1703();
         super.field989 = var1.method1703();
         super.field985 = var1.method1703();
         super.field992 = var1.method1703();
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
      if (class37.field315.field316 != var3) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.method1654();
         int var5 = var1.method1654();
         if (var4 == super.field985 && var5 == super.field992) {
            for(int var6 = 0; var6 < 64; ++var6) {
               for(int var7 = 0; var7 < 64; ++var7) {
                  this.method597(var6, var7, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class282)) {
         return false;
      } else {
         class282 var2 = (class282)var1;
         return super.field985 == var2.field985 && super.field992 == var2.field992;
      }
   }

   public int hashCode() {
      return super.field985 | super.field992 << 8;
   }
}
