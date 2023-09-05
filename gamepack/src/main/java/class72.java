import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "tg")
final class class72 implements class422 {
	@ObfInfo(name = "ai", desc = "(Ljava/lang/Long;Ltm;B)V")
	void method507(Long var1, class280 var2) {
		var2.method1518(var1);
	}

	@ObfInfo(name = "ae", desc = "(Ltm;I)Ljava/lang/Object;")
	public Object method2209(class280 var1) {
		return var1.method1497();
	}

	@ObfInfo(name = "au", desc = "(Ljava/lang/Object;Ltm;I)V")
	public void method2210(Object var1, class280 var2) {
		this.method507((Long)var1, var2);
	}
}
