import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "th")
public class class267 extends class392 implements class436 {
	@ObfInfo(name = "ao", desc = "Lkg;")
	final class227 field2159;
	@ObfInfo(name = "ae", desc = "Lnu;")
	final class437 field2158;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1843835189)
	final int field2157;

	@ObfInfo(name = "<init>", desc = "(Lns;ILon;Lnu;)V")
	public class267(class174 var1, int var2, class67 var3, class437 var4) {
		super(var1, var3, var4 != null ? var4.method2293(var2) : 0);
		this.field2159 = new class227(64);
		this.field2158 = var4;
		this.field2157 = var2;
	}

	@ObfInfo(name = "au", desc = "(IB)Lrv;", opaqueValue = "1")
	protected class230 method2089(int var1) {
		synchronized(this.field2159) {
			class309 var3 = (class309)this.field2159.method1219((long)var1);
			if (null == var3) {
				var3 = this.method1391(var1);
				this.field2159.method1221(var3, (long)var1);
			}

			return var3;
		}
	}

	@ObfInfo(name = "ab", desc = "(IB)Lrg;", opaqueValue = "0")
	class309 method1391(int var1) {
		byte[] var3 = this.field2158.method2267(this.field2157, var1);
		class309 var4 = new class309(var1);
		if (var3 != null) {
			var4.method1226(new class280(var3));
		}

		return var4;
	}

	@ObfInfo(name = "ag", desc = "(I)V")
	public void method1390() {
		synchronized(this.field2159) {
			this.field2159.method1224();
		}
	}

	@ObfInfo(name = "iterator", desc = "()Ljava/util/Iterator;")
	public Iterator iterator() {
		return new class246(this);
	}
}
