import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "au")
public class class71 implements class84 {
	@ObfInfo(name = "au", desc = "(Ltm;)Ltm;")
	public class280 method560(class280 var1) {
		class280 var2 = new class280(100);
		this.method505(var1, var2);
		return var2;
	}

	@ObfInfo(name = "ae", desc = "(Ltm;Ltm;)V")
	void method505(class280 var1, class280 var2) {
		class184 var3 = new class184(var1);
		class6 var4 = new class6(var3);

		long var5;
		for (var5 = 0L; !var4.method290(var3.method1035(), var3.method1036(), var5); ++var5) {
		}

		var2.method1518(var5);
	}
}
