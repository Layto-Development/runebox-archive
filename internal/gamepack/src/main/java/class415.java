public final class class415 extends class70 {
   static int field2917;
   int field2916;
   int field2918;
   int field2919;
   int field2920;
   int field2921;
   int field2922;
   int field2923;
   int field2924;
   int field2925;
   int field2926 = 31;
   int field2927 = 0;
   int field2928 = -1;
   int field2929;
   int field2930;

   class415() {
   }

   void method1900(int var1) {
      this.field2926 = var1;
   }

   boolean method1901(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field2926 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   public static final void method1902(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            class96.method372(var0 - 1L);
            class96.method372(1L);
         } else {
            class96.method372(var0);
         }

      }
   }
}
