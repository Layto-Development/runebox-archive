public class class408 extends class367 {
   int field3149;
   public boolean field3153;
   public byte[] field3150;
   public int field3151;
   public int field3152;

   class408(int var1, byte[] var2, int var3, int var4) {
      this.field3152 = var1;
      this.field3150 = var2;
      this.field3151 = var3;
      this.field3149 = var4;
   }

   class408(int var1, byte[] var2, int var3, int var4, boolean var5) {
      this.field3152 = var1;
      this.field3150 = var2;
      this.field3151 = var3;
      this.field3149 = var4;
      this.field3153 = var5;
   }

   public class408 method1981(class186 var1) {
      this.field3150 = var1.method1190(this.field3150);
      this.field3152 = var1.method1191(this.field3152);
      if (this.field3151 == this.field3149) {
         this.field3151 = this.field3149 = var1.method1189(this.field3151);
      } else {
         this.field3151 = var1.method1189(this.field3151);
         this.field3149 = var1.method1189(this.field3149);
         if (this.field3151 == this.field3149) {
            --this.field3151;
         }
      }

      return this;
   }
}
