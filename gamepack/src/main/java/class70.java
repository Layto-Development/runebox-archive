import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.lang.management.GarbageCollectorMXBean;

@ObfInfo(name = "rr")
public class class70 {
	@ObfInfo(name = "bi", desc = "Ljava/lang/management/GarbageCollectorMXBean;")
	static GarbageCollectorMXBean field779;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 1631909573)
	public int field777;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 698289967)
	public int field778;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 901147751)
	public int field780;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1868418019)
	public int field781;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1437295059)
	public int field782;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -628957467)
	public int field783;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -771646685)
	public int field784;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -214665131)
	public int field785;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1343841741)
	public int field786;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1483300641)
	public int field787;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 680246901)
	public int field788;

	@ObfInfo(name = "<init>", desc = "()V")
	public class70() {
		this.field788 = -1;
		this.field778 = -1;
		this.field781 = -1;
		this.field780 = -1;
		this.field786 = -1;
		this.field777 = -1;
		this.field783 = -1;
		this.field784 = -1;
		this.field785 = -1;
		this.field782 = -1;
		this.field787 = -1;
	}

	@ObfInfo(name = "au", desc = "(Lnu;I)V", opaqueValue = "497895580")
	public void method504(class437 var1) {
		byte[] var3 = var1.method2274(class196.field1792.field1791);
		class280 var4 = new class280(var3);

		while (true) {
			int var5 = var4.method1492();
			if (var5 == 0) {
				return;
			}

			switch(var5) {
			case 1:
				var4.method1548();
				break;
			case 2:
				this.field788 = var4.method1540();
				this.field778 = var4.method1540();
				this.field781 = var4.method1540();
				this.field780 = var4.method1540();
				this.field786 = var4.method1540();
				this.field777 = var4.method1540();
				this.field783 = var4.method1540();
				this.field784 = var4.method1540();
				this.field785 = var4.method1540();
				this.field782 = var4.method1540();
				this.field787 = var4.method1540();
			}
		}
	}
}
