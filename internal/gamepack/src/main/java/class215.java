import java.util.concurrent.ThreadFactory;

class class215 implements ThreadFactory {
   static class29 field1651;
   // $FF: synthetic field
   final class5 this$0;

   class215(class5 var1) {
      this.this$0 = var1;
   }

   public Thread newThread(Runnable var1) {
      return new Thread(var1, "OSRS WAV Load");
   }
}
