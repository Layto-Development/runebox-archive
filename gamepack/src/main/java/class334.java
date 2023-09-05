import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "dt")
public class class334 implements Runnable {
	@ObfInfo(name = "ja", desc = "I", intMultiplier = 1283573311)
	static int field2657;
	@ObfInfo(name = "au", desc = "Z")
	boolean field2656;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1540170903)
	int field2652;
	@ObfInfo(name = "at", desc = "[I")
	int[] field2653;
	@ObfInfo(name = "ac", desc = "[I")
	int[] field2654;
	@ObfInfo(name = "ae", desc = "Ljava/lang/Object;")
	Object field2651;
	@ObfInfo(name = "ai", desc = "[J")
	long[] field2655;

	@ObfInfo(name = "<init>", desc = "()V")
	class334() {
		this.field2656 = true;
		this.field2651 = new Object();
		this.field2652 = 0;
		this.field2653 = new int[500];
		this.field2654 = new int[500];
		this.field2655 = new long[500];
	}

	@ObfInfo(name = "run", desc = "()V")
	public void run() {
		for (; this.field2656; class296.method1638(50L)) {
			synchronized(this.field2651) {
				if (this.field2652 < 500) {
					this.field2653[this.field2652] = class166.field1580;
					this.field2654[this.field2652] = class166.field1563;
					this.field2655[this.field2652] = class166.field1571;
					++this.field2652;
				}
			}
		}

	}
}
