import java.util.concurrent.ThreadFactory;

class class40 implements ThreadFactory {
   static class14 field923;
   // $FF: synthetic field
   final class448 this$0;

   class40(class448 var1) {
      this.this$0 = var1;
   }

   public Thread newThread(Runnable var1) {
      return new Thread(var1, "OSRS WAV Load");
   }
}
