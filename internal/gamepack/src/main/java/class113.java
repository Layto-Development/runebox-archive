public class class113 {
   static byte[][] field729;
   public int field726;
   public int field727;
   public int field728;

   public class113(int var1, int var2, int var3) {
      this.field727 = var1;
      this.field726 = var2;
      this.field728 = var3;
   }

   public class113(class113 var1) {
      this.field727 = var1.field727;
      this.field726 = var1.field726;
      this.field728 = var1.field728;
   }

   public class113(int var1) {
      if (var1 == -1) {
         this.field727 = -1;
      } else {
         this.field727 = var1 >> 28 & 3;
         this.field726 = var1 >> 14 & 16383;
         this.field728 = var1 & 16383;
      }

   }

   public int method403() {
      int var3 = this.field727;
      int var4 = this.field726;
      int var5 = this.field728;
      int var2 = var3 << 28 | var4 << 14 | var5;
      return var2;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof class113) ? false : this.method401((class113)var1);
      }
   }

   boolean method401(class113 var1) {
      if (var1.field727 != this.field727) {
         return false;
      } else if (this.field726 != var1.field726) {
         return false;
      } else {
         return var1.field728 == this.field728;
      }
   }

   public int hashCode() {
      return this.method403();
   }

   public String toString() {
      return this.method402(",");
   }

   String method402(String var1) {
      return this.field727 + var1 + (this.field726 >> 6) + var1 + (this.field728 >> 6) + var1 + (this.field726 & 63) + var1 + (this.field728 & 63);
   }
}
