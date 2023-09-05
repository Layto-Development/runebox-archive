import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.concurrent.Future;

@ObfInfo(name = "ax")
public class class282 {
	@ObfInfo(name = "ba", desc = "Ljava/lang/String;")
	protected static String field2263;
	@ObfInfo(name = "vg", desc = "Lsm;")
	static class521 field2265;
	@ObfInfo(name = "ae", desc = "Ljava/lang/String;")
	String field2264;
	@ObfInfo(name = "au", desc = "Ljava/util/concurrent/Future;")
	Future field2266;

	@ObfInfo(name = "<init>", desc = "(Ljava/util/concurrent/Future;)V")
	class282(Future var1) {
		this.field2266 = var1;
	}

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/String;)V")
	class282(String var1) {
		this.method1563(var1);
	}

	@ObfInfo(name = "au", desc = "(Ljava/lang/String;I)V", opaqueValue = "-1361517715")
	void method1563(String var1) {
		if (null == var1) {
			var1 = "";
		}

		this.field2264 = var1;
		if (null != this.field2266) {
			this.field2266.cancel(true);
			this.field2266 = null;
		}

	}

	@ObfInfo(name = "ae", desc = "(I)Ljava/lang/String;")
	public final String method1567() {
		return this.field2264;
	}

	@ObfInfo(name = "ao", desc = "(I)Z", opaqueValue = "-1247601864")
	public boolean method1565() {
		return null != this.field2264 || this.field2266 == null;
	}

	@ObfInfo(name = "at", desc = "(B)Z", opaqueValue = "1")
	public final boolean method1564() {
		return this.method1565() ? true : this.field2266.isDone();
	}

	@ObfInfo(name = "ac", desc = "(I)Las;", opaqueValue = "-47538599")
	public final class403 method1566() {
		if (this.method1565()) {
			return new class403(this.field2264);
		} else if (!this.method1564()) {
			return null;
		} else {
			try {
				return (class403)this.field2266.get();
			} catch (Exception var4) {
				String var3 = "Error retrieving REST request reply";
				System.err.println(var3 + "\r\n" + var4);
				this.method1563(var3);
				return new class403(var3);
			}
		}
	}
}
