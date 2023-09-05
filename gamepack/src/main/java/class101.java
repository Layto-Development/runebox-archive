public class class101 extends class151 {
   public static class298 field1336;
   static class364 field1333 = new class364(64);
   public char field1330;
   public char field1331;
   public int field1329;
   public int field1334;
   public int[] field1328;
   public int[] field1337;
   public String field1332;
   public String[] field1335;

   class101() {
      this.field1332 = class27.field544;
      this.field1334 = 0;
   }

   void method749(class184 var1) {
      while(true) {
         int var3 = var1.readUnsignedByte();
         if (var3 == 0) {
            return;
         }

         this.method750(var1, var3);
      }
   }

   void method750(class184 var1, int var2) {
      if (var2 == 1) {
         this.field1330 = (char)var1.readUnsignedByte();
      } else if (var2 == 2) {
         this.field1331 = (char)var1.readUnsignedByte();
      } else if (var2 == 3) {
         this.field1332 = var1.readString();
      } else if (var2 == 4) {
         this.field1329 = var1.readInt();
      } else {
         int var4;
         if (var2 == 5) {
            this.field1334 = var1.method1174();
            this.field1328 = new int[this.field1334];
            this.field1335 = new String[this.field1334];

            for(var4 = 0; var4 < this.field1334; ++var4) {
               this.field1328[var4] = var1.readInt();
               this.field1335[var4] = var1.readString();
            }
         } else if (var2 == 6) {
            this.field1334 = var1.method1174();
            this.field1328 = new int[this.field1334];
            this.field1337 = new int[this.field1334];

            for(var4 = 0; var4 < this.field1334; ++var4) {
               this.field1328[var4] = var1.readInt();
               this.field1337[var4] = var1.readInt();
            }
         }
      }

   }

   public int method748() {
      return this.field1334;
   }

   public static class101 method751(int var0) {
      class101 var2 = (class101)field1333.method1851((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = field1336.method1629(8, var0);
         var2 = new class101();
         if (null != var3) {
            var2.method749(new class184(var3));
         }

         field1333.method1850(var2, (long)var0);
         return var2;
      }
   }
}
