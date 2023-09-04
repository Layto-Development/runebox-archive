public class class89 {
   static byte[][] field1276;
   public int field1273;
   public int field1274;
   public int field1275;

   public class89(int var1, int var2, int var3) {
      this.field1274 = var1;
      this.field1273 = var2;
      this.field1275 = var3;
   }

   public class89(class89 var1) {
      this.field1274 = var1.field1274;
      this.field1273 = var1.field1273;
      this.field1275 = var1.field1275;
   }

   public class89(int var1) {
      if (var1 == -1) {
         this.field1274 = -1;
      } else {
         this.field1274 = var1 >> 28 & 3;
         this.field1273 = var1 >> 14 & 16383;
         this.field1275 = var1 & 16383;
      }

   }

   public int method721() {
      int var3 = this.field1274;
      int var4 = this.field1273;
      int var5 = this.field1275;
      int var2 = var3 << 28 | var4 << 14 | var5;
      return var2;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class89) ? false : this.method719((class89)var1);
      }
   }

   boolean method719(class89 var1) {
      if (var1.field1274 != this.field1274) {
         return false;
      } else if (this.field1273 != var1.field1273) {
         return false;
      } else {
         return var1.field1275 == this.field1275;
      }
   }

   public int hashCode() {
      return this.method721();
   }

   public String toString() {
      return this.method720(",");
   }

   String method720(String var1) {
      return this.field1274 + var1 + (this.field1273 >> 6) + var1 + (this.field1275 >> 6) + var1 + (this.field1273 & 63) + var1 + (this.field1275 & 63);
   }
}
