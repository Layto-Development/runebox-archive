public class class521 extends class454 {
   long field4159 = System.nanoTime();

   public void method2112() {
      this.field4159 = System.nanoTime();
   }

   public int method2113(int var1, int var2) {
      long var4 = 1000000L * (long)var2;
      long var6 = this.field4159 - System.nanoTime();
      if (var6 < var4) {
         var6 = var4;
      }

      class415.method1902(var6 / 1000000L);
      long var8 = System.nanoTime();

      int var10;
      for(var10 = 0; var10 < 10 && (var10 < 1 || this.field4159 < var8); this.field4159 += 1000000L * (long)var1) {
         ++var10;
      }

      if (this.field4159 < var8) {
         this.field4159 = var8;
      }

      return var10;
   }
}
