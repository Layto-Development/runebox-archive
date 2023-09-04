public class class29 extends class308 {
   long field566 = System.nanoTime();

   public void method1671() {
      this.field566 = System.nanoTime();
   }

   public int method1672(int var1, int var2) {
      long var4 = 1000000L * (long)var2;
      long var6 = this.field566 - System.nanoTime();
      if (var6 < var4) {
         var6 = var4;
      }

      class51.method602(var6 / 1000000L);
      long var8 = System.nanoTime();

      int var10;
      for(var10 = 0; var10 < 10 && (var10 < 1 || this.field566 < var8); this.field566 += 1000000L * (long)var1) {
         ++var10;
      }

      if (this.field566 < var8) {
         this.field566 = var8;
      }

      return var10;
   }
}
