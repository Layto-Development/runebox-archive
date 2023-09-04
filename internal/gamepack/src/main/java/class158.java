public final class class158 {
   static class142 field1004;
   static class158[] field1000 = new class158[0];
   static int field999;
   float field1001;
   float field1002;
   float field1003;
   float field998;

   static {
      method607(100);
      new class158();
   }

   class158() {
      this.method603();
   }

   public void method605() {
      synchronized(field1000) {
         if (class130.field812 < field999 - 1) {
            field1000[++class130.field812 - 1] = this;
         }

      }
   }

   void method601(float var1, float var2, float var3, float var4) {
      this.field1002 = var1;
      this.field1001 = var2;
      this.field1003 = var3;
      this.field998 = var4;
   }

   public void method602(float var1, float var2, float var3, float var4) {
      float var6 = (float)Math.sin((double)(var4 * 0.5F));
      float var7 = (float)Math.cos((double)(var4 * 0.5F));
      this.field1002 = var6 * var1;
      this.field1001 = var2 * var6;
      this.field1003 = var6 * var3;
      this.field998 = var7;
   }

   final void method603() {
      this.field1003 = 0.0F;
      this.field1001 = 0.0F;
      this.field1002 = 0.0F;
      this.field998 = 1.0F;
   }

   public final void method604(class158 var1) {
      this.method601(this.field1002 * var1.field998 + this.field998 * var1.field1002 + this.field1003 * var1.field1001 - this.field1001 * var1.field1003, var1.field1003 * this.field1002 + this.field998 * var1.field1001 + (var1.field998 * this.field1001 - this.field1003 * var1.field1002), var1.field1003 * this.field998 + (this.field1003 * var1.field998 + this.field1001 * var1.field1002 - var1.field1001 * this.field1002), this.field998 * var1.field998 - this.field1002 * var1.field1002 - this.field1001 * var1.field1001 - var1.field1003 * this.field1003);
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class158)) {
         return false;
      } else {
         class158 var2 = (class158)var1;
         return var2.field1002 == this.field1002 && var2.field1001 == this.field1001 && var2.field1003 == this.field1003 && this.field998 == var2.field998;
      }
   }

   public int hashCode() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = this.field1002 + var2 * 31.0F;
      var2 = this.field1001 + var2 * 31.0F;
      var2 = this.field1003 + var2 * 31.0F;
      var2 = this.field998 + var2 * 31.0F;
      return (int)var2;
   }

   public String toString() {
      return this.field1002 + "," + this.field1001 + "," + this.field1003 + "," + this.field998;
   }

   static void method607(int var0) {
      field999 = var0;
      field1000 = new class158[var0];
      class130.field812 = 0;
   }

   public static class158 method606() {
      synchronized(field1000) {
         if (0 == class130.field812) {
            return new class158();
         } else {
            field1000[--class130.field812].method603();
            return field1000[class130.field812];
         }
      }
   }
}
