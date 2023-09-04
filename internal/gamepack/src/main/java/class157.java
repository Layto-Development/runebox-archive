import java.util.LinkedList;

public abstract class class157 {
   boolean field995;
   boolean field996;
   byte[][][] field984;
   byte[][][] field997;
   class152[][][][] field994;
   int field983 = -1;
   int field985;
   int field986;
   int field987;
   int field989;
   int field991;
   int field992;
   int field993 = -1;
   short[][][] field988;
   short[][][] field990;

   class157() {
      new LinkedList();
      this.field995 = false;
      this.field996 = false;
   }

   abstract void method595(class366 var1);

   boolean method592() {
      return this.field995 && this.field996;
   }

   void method593(class509 var1) {
      if (!this.method592()) {
         byte[] var3 = var1.method2422(this.field993, this.field983);
         if (var3 != null) {
            this.method595(new class366(var3));
            this.field995 = true;
            this.field996 = true;
         }

      }
   }

   void method594() {
      this.field990 = (short[][][])null;
      this.field988 = (short[][][])null;
      this.field997 = (byte[][][])null;
      this.field984 = (byte[][][])null;
      this.field994 = (class152[][][][])null;
      this.field995 = false;
      this.field996 = false;
   }

   void method597(int var1, int var2, class366 var3) {
      int var5 = var3.method1654();
      if (var5 != 0) {
         if (0 != (var5 & 1)) {
            this.method596(var1, var2, var3, var5);
         } else {
            this.method600(var1, var2, var3, var5);
         }

      }
   }

   void method596(int var1, int var2, class366 var3, int var4) {
      boolean var6 = 0 != (var4 & 2);
      if (var6) {
         this.field988[0][var1][var2] = (short)var3.method1703();
      }

      this.field990[0][var1][var2] = (short)var3.method1703();
   }

   void method600(int var1, int var2, class366 var3, int var4) {
      int var6 = ((var4 & 24) >> 3) + 1;
      boolean var7 = (var4 & 2) != 0;
      boolean var8 = (var4 & 4) != 0;
      this.field990[0][var1][var2] = (short)var3.method1703();
      int var9;
      int var10;
      int var12;
      if (var7) {
         var9 = var3.method1654();

         for(var10 = 0; var10 < var9; ++var10) {
            int var11 = var3.method1703();
            if (var11 != 0) {
               this.field988[var10][var1][var2] = (short)var11;
               var12 = var3.method1654();
               this.field997[var10][var1][var2] = (byte)(var12 >> 2);
               this.field984[var10][var1][var2] = (byte)(var12 & 3);
            }
         }
      }

      if (var8) {
         for(var9 = 0; var9 < var6; ++var9) {
            var10 = var3.method1654();
            if (var10 != 0) {
               class152[] var15 = this.field994[var9][var1][var2] = new class152[var10];

               for(var12 = 0; var12 < var10; ++var12) {
                  int var13 = var3.method1702();
                  int var14 = var3.method1654();
                  var15[var12] = new class152(var13, var14 >> 2, var14 & 3);
               }
            }
         }
      }

   }

   int method598() {
      return this.field985;
   }

   int method599() {
      return this.field992;
   }
}
