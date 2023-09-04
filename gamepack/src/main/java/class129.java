import java.util.LinkedList;

public abstract class class129 {
   boolean field1541;
   boolean field1542;
   byte[][][] field1530;
   byte[][][] field1543;
   class207[][][][] field1540;
   int field1529 = -1;
   int field1531;
   int field1532;
   int field1533;
   int field1535;
   int field1537;
   int field1538;
   int field1539 = -1;
   short[][][] field1534;
   short[][][] field1536;

   class129() {
      new LinkedList();
      this.field1541 = false;
      this.field1542 = false;
   }

   abstract void method883(class184 var1);

   boolean method880() {
      return this.field1541 && this.field1542;
   }

   void method881(class298 var1) {
      if (!this.method880()) {
         byte[] var3 = var1.method1629(this.field1539, this.field1529);
         if (var3 != null) {
            this.method883(new class184(var3));
            this.field1541 = true;
            this.field1542 = true;
         }

      }
   }

   void method882() {
      this.field1536 = (short[][][])null;
      this.field1534 = (short[][][])null;
      this.field1543 = (byte[][][])null;
      this.field1530 = (byte[][][])null;
      this.field1540 = (class207[][][][])null;
      this.field1541 = false;
      this.field1542 = false;
   }

   void method885(int var1, int var2, class184 var3) {
      int var5 = var3.method1125();
      if (var5 != 0) {
         if ((var5 & 1) != 0) {
            this.method884(var1, var2, var3, var5);
         } else {
            this.method888(var1, var2, var3, var5);
         }

      }
   }

   void method884(int var1, int var2, class184 var3, int var4) {
      boolean var6 = (var4 & 2) != 0;
      if (var6) {
         this.field1534[0][var1][var2] = (short)var3.method1174();
      }

      this.field1536[0][var1][var2] = (short)var3.method1174();
   }

   void method888(int var1, int var2, class184 var3, int var4) {
      int var6 = ((var4 & 24) >> 3) + 1;
      boolean var7 = (var4 & 2) != 0;
      boolean var8 = (var4 & 4) != 0;
      this.field1536[0][var1][var2] = (short)var3.method1174();
      int var9;
      int var10;
      int var12;
      if (var7) {
         var9 = var3.method1125();

         for(var10 = 0; var10 < var9; ++var10) {
            int var11 = var3.method1174();
            if (var11 != 0) {
               this.field1534[var10][var1][var2] = (short)var11;
               var12 = var3.method1125();
               this.field1543[var10][var1][var2] = (byte)(var12 >> 2);
               this.field1530[var10][var1][var2] = (byte)(var12 & 3);
            }
         }
      }

      if (var8) {
         for(var9 = 0; var9 < var6; ++var9) {
            var10 = var3.method1125();
            if (var10 != 0) {
               class207[] var15 = this.field1540[var9][var1][var2] = new class207[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  int var13 = var3.method1173();
                  int var14 = var3.method1125();
                  var15[var12] = new class207(var13, var14 >> 2, var14 & 3);
               }
            }
         }
      }

   }

   int method886() {
      return this.field1531;
   }

   int method887() {
      return this.field1538;
   }
}
