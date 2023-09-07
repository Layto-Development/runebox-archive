import java.util.concurrent.ThreadFactory;

class class426 implements ThreadFactory {
    static class453 field2930;
    // $FF: synthetic field
    final class468 this$0;

    class426(class468 var1) {
        this.this$0 = var1;
    }

    @Override
    public Thread newThread(Runnable var1) {
        return new Thread(var1, "OSRS WAV Load");
    }
}
