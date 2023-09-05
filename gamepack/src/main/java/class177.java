public class class177 {
   static class22 field1799;
   byte field1795;
   public int field1793;
   public int field1794;
   public int field1796;
   public int field1797;
   public int field1798;

   public class177() {
   }

   public class177(class184 var1, boolean var2) {
      this.field1795 = var1.method1126();
      this.field1794 = var1.method1174();
      this.field1798 = var1.readInt();
      this.field1796 = var1.readInt();
      this.field1797 = var1.readInt();
      this.field1793 = var1.readInt();
      if (var2) {
         int var4 = 0;
         boolean var5 = false;

         while(true) {
            int var6 = var1.readUnsignedByte();
            if (var6 == 255) {
               Integer var3 = var5 ? var4 : null;
               this.method1099(var3);
               break;
            }

            if (var6 != 0) {
               throw new IllegalStateException("");
            }

            while(true) {
               int var7 = var1.readUnsignedByte();
               if (var7 == 255) {
                  break;
               }

               --var1.field1818;
               if (var1.method1174() != 0) {
                  throw new IllegalStateException("");
               }

               if (var5) {
                  throw new IllegalStateException("");
               }

               var4 = var1.readInt();
               var5 = true;
            }
         }
      }

   }

   void method1099(Integer var1) {
   }

   public int method1100() {
      return this.field1795 & 7;
   }

   public int method1101() {
      return (this.field1795 & 8) == 8 ? 1 : 0;
   }

   void method1098(int var1) {
      this.field1795 &= -8;
      this.field1795 = (byte)(this.field1795 | var1 & 7);
   }

   void method1102(int var1) {
      this.field1795 &= -9;
      if (var1 == 1) {
         this.field1795 = (byte)(this.field1795 | 8);
      }

   }
}
