import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.List;

@ObfInfo(name = "hk")
public class class26 extends class180 {
	@ObfInfo(name = "au", desc = "Lnu;")
	public static class437 field425;
	@ObfInfo(name = "dy", desc = "Luk;")
	static class398 field421;
	@ObfInfo(name = "if", desc = "Lgz;")
	static class407 field426;
	@ObfInfo(name = "ae", desc = "Lle;")
	static class7 field422;
	@ObfInfo(name = "wz", desc = "Ljava/util/List;")
	static List field424;
	@ObfInfo(name = "ao", desc = "Z")
	public boolean field423;

	static {
		field422 = new class7(64);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class26() {
		this.field423 = false;
	}

	@ObfInfo(name = "ae", desc = "(Ltm;I)V")
	void method354(class280 var1) {
		while (true) {
			int var3 = var1.method1492();
			if (var3 == 0) {
				return;
			}

			this.method353(var1, var3);
		}
	}

	@ObfInfo(name = "ao", desc = "(Ltm;IB)V")
	void method353(class280 var1, int var2) {
		if (var2 == 2) {
			this.field423 = true;
		}

	}

	@ObfInfo(name = "au", desc = "(II)Lhk;")
	public static class26 method355(int var0) {
		class26 var2 = (class26)field422.method294((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field425.method2267(19, var0);
			var2 = new class26();
			if (null != var3) {
				var2.method354(new class280(var3));
			}

			field422.method293(var2, (long)var0);
			return var2;
		}
	}
}
