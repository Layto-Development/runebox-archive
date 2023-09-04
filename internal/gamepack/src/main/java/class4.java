public final class class4 {
   static class497 field36;
   static class4[] field32 = new class4[0];
   static int field31;
   float field30;
   float field33;
   float field34;
   float field35;

   static {
      method13(100);
      new class4();
   }

   class4() {
      this.method9();
   }

   public void method11() {
      synchronized(field32) {
         if (class217.field2020 < field31 - 1) {
            field32[++class217.field2020 - 1] = this;
         }

      }
   }

   void method7(float var1, float var2, float var3, float var4) {
      this.field34 = var1;
      this.field33 = var2;
      this.field35 = var3;
      this.field30 = var4;
   }

   public void method8(float var1, float var2, float var3, float var4) {
      float var6 = (float)Math.sin((double)(var4 * 0.5F));
      float var7 = (float)Math.cos((double)(var4 * 0.5F));
      this.field34 = var6 * var1;
      this.field33 = var2 * var6;
      this.field35 = var6 * var3;
      this.field30 = var7;
   }

   final void method9() {
      this.field35 = 0.0F;
      this.field33 = 0.0F;
      this.field34 = 0.0F;
      this.field30 = 1.0F;
   }

   public final void method10(class4 var1) {
      this.method7(this.field34 * var1.field30 + this.field30 * var1.field34 + this.field35 * var1.field33 - this.field33 * var1.field35, var1.field35 * this.field34 + this.field30 * var1.field33 + (var1.field30 * this.field33 - this.field35 * var1.field34), var1.field35 * this.field30 + (this.field35 * var1.field30 + this.field33 * var1.field34 - var1.field33 * this.field34), this.field30 * var1.field30 - this.field34 * var1.field34 - this.field33 * var1.field33 - var1.field35 * this.field35);
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class4)) {
         return false;
      } else {
         class4 var2 = (class4)var1;
         return var2.field34 == this.field34 && var2.field33 == this.field33 && var2.field35 == this.field35 && this.field30 == var2.field30;
      }
   }

   public int hashCode() {
      boolean var1 = true;
      float var2 = 1.0F;
      var2 = this.field34 + var2 * 31.0F;
      var2 = this.field33 + var2 * 31.0F;
      var2 = this.field35 + var2 * 31.0F;
      var2 = this.field30 + var2 * 31.0F;
      return (int)var2;
   }

   public String toString() {
      return this.field34 + "," + this.field33 + "," + this.field35 + "," + this.field30;
   }

   static void method13(int var0) {
      field31 = var0;
      field32 = new class4[var0];
      class217.field2020 = 0;
   }

   public static class4 method12() {
      synchronized(field32) {
         if (class217.field2020 == 0) {
            return new class4();
         } else {
            field32[--class217.field2020].method9();
            return field32[class217.field2020];
         }
      }
   }
}
