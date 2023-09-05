import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.concurrent.ThreadFactory;

@ObfInfo(name = "hj")
final class class327 implements ThreadFactory {
	@ObfInfo(name = "newThread", desc = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}
}
