import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "rp")
public abstract class class392 extends class24 implements class456 {
	@ObfInfo(name = "<init>", desc = "(Lns;Lon;I)V")
	protected class392(class174 var1, class67 var2, int var3) {
		super(var1, var2, var3);
	}

	@ObfInfo(name = "au", desc = "(IB)Lrv;")
	protected abstract class230 method2089(int var1);

	@ObfInfo(name = "ae", desc = "(I)I")
	public int method2088() {
		return super.field409;
	}

	@ObfInfo(name = "ao", desc = "(IB)Ljava/lang/Object;", opaqueValue = "0")
	public Object method2383(int var1) {
		class230 var3 = this.method2089(var1);
		return null != var3 && var3.method1229() ? var3.method1228() : null;
	}

	@ObfInfo(name = "at", desc = "(Ltm;B)Lud;", opaqueValue = "94")
	public class10 method2087(class280 var1) {
		int var3 = var1.method1541();
		class230 var4 = this.method2089(var3);
		class10 var5 = new class10(var3);
		Class var6 = var4.field1961.field577;
		if (var6 == Integer.class) {
			var5.field340 = var1.method1496();
		} else if (var6 == Long.class) {
			var5.field340 = var1.method1497();
		} else if (var6 == String.class) {
			var5.field340 = var1.method1542();
		} else {
			if (!class526.class.isAssignableFrom(var6)) {
				throw new IllegalStateException();
			}

			try {
				class526 var7 = (class526)var6.newInstance();
				var7.method2563(var1);
				var5.field340 = var7;
			} catch (InstantiationException var8) {
			} catch (IllegalAccessException var9) {
			}
		}

		return var5;
	}
}
