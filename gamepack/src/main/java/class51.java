public final class class51 extends class55 {
   static int field1058;
   int field1057;
   int field1059;
   int field1060;
   int field1061;
   int field1062;
   int field1063;
   int field1064;
   int field1065;
   int field1066;
   int field1067 = 31;
   int field1068 = 0;
   int field1069 = -1;
   int field1070;
   int field1071;

   class51() {
   }

   void method600(int var1) {
      this.field1067 = var1;
   }

   boolean method601(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field1067 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   public static final void method602(long var0) {
      if (var0 > 0L) {
         if (0L == var0 % 10L) {
            class283.method1596(var0 - 1L);
            class283.method1596(1L);
         } else {
            class283.method1596(var0);
         }

      }
   }
}
