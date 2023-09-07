import java.util.concurrent.ThreadFactory;

class class401 implements ThreadFactory {

	static class9 field3173;

	// $FF: synthetic field
	final class62 this$0;

	class401(class62 var1) {
		this.this$0 = var1;
	}

	@Override
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}
}
