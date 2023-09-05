import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.concurrent.locks.ReentrantLock;

@ObfInfo(name = "bx")
public class class508 {
	@ObfInfo(name = "bk", desc = "Lnu;")
	public static class437 field4091;
	@ObfInfo(name = "ra", desc = "Lth;")
	static class267 field4090;
	@ObfInfo(name = "jr", desc = "I", intMultiplier = 1819265849)
	static int field4092;
	@ObfInfo(name = "au", desc = "Lcm;")
	class130 field4093;
	@ObfInfo(name = "ae", desc = "Lbu;")
	class62 field4088;
	@ObfInfo(name = "ao", desc = "Ljava/util/concurrent/locks/ReentrantLock;")
	ReentrantLock field4089;

	@ObfInfo(name = "<init>", desc = "(Lcm;Lbu;)V")
	class508(class130 var1, class62 var2) {
		this.field4093 = var1;
		this.field4088 = var2;
		this.field4089 = new ReentrantLock();
	}
}
