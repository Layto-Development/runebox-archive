public class class517 {
   static class534 field4141;
   byte field4137;
   public int field4135;
   public int field4136;
   public int field4138;
   public int field4139;
   public int field4140;

   public class517() {
   }

   public class517(class366 var1, boolean var2) {
      this.field4137 = var1.method1655();
      this.field4136 = var1.method1703();
      this.field4140 = var1.method1658();
      this.field4138 = var1.method1658();
      this.field4139 = var1.method1658();
      this.field4135 = var1.method1658();
      if (var2) {
         int var4 = 0;
         boolean var5 = false;

         while(true) {
            int var6 = var1.method1654();
            if (var6 == 255) {
               Integer var3 = var5 ? var4 : null;
               this.method2476(var3);
               break;
            }

            if (var6 != 0) {
               throw new IllegalStateException("");
            }

            while(true) {
               int var7 = var1.method1654();
               if (var7 == 255) {
                  break;
               }

               --var1.field2652;
               if (var1.method1703() != 0) {
                  throw new IllegalStateException("");
               }

               if (var5) {
                  throw new IllegalStateException("");
               }

               var4 = var1.method1658();
               var5 = true;
            }
         }
      }

   }

   void method2476(Integer var1) {
   }

   public int method2477() {
      return this.field4137 & 7;
   }

   public int method2478() {
      return 8 == (this.field4137 & 8) ? 1 : 0;
   }

   void method2475(int var1) {
      this.field4137 &= -8;
      this.field4137 = (byte)(this.field4137 | var1 & 7);
   }

   void method2479(int var1) {
      this.field4137 &= -9;
      if (var1 == 1) {
         this.field4137 = (byte)(this.field4137 | 8);
      }

   }
}
