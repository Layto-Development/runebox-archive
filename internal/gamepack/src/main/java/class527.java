import java.util.concurrent.Callable;

class class527 implements Callable {
   static int field4177;
   // $FF: synthetic field
   final class272 this$0;
   // $FF: synthetic field
   final class366 val$p;
   // $FF: synthetic field
   final int val$version;

   class527(class272 var1, class366 var2, int var3) {
      this.this$0 = var1;
      this.val$p = var2;
      this.val$version = var3;
   }

   public Object call() {
      this.this$0.method1274(this.val$p, this.val$version);
      return null;
   }

   static long method2514(CharSequence var0) {
      long var2 = 0L;
      int var4 = var0.length();

      for(int var5 = 0; var5 < var4; ++var5) {
         var2 *= 37L;
         char var6 = var0.charAt(var5);
         if (var6 >= 'A' && var6 <= 'Z') {
            var2 += (long)(var6 + 1 - 65);
         } else if (var6 >= 'a' && var6 <= 'z') {
            var2 += (long)(var6 + 1 - 97);
         } else if (var6 >= '0' && var6 <= '9') {
            var2 += (long)(var6 + 27 - 48);
         }

         if (var2 >= 177917621779460413L) {
            break;
         }
      }

      while(var2 % 37L == 0L && var2 != 0L) {
         var2 /= 37L;
      }

      return var2;
   }
}
