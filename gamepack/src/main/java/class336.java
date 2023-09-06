import java.util.concurrent.ThreadFactory;

class class336 implements ThreadFactory {
	static class288 field2933;
	// $FF: synthetic field
	final class18 this$0;

	class336(class18 var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}
}
