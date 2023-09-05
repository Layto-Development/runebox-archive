import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "ou")
public class class133 implements Iterable {
	@ObfInfo(name = "ae", desc = "Lsq;")
	class180 field1368;
	@ObfInfo(name = "au", desc = "Lsq;")
	public class180 field1369;

	@ObfInfo(name = "<init>", desc = "()V")
	public class133() {
		this.field1369 = new class180();
		this.field1369.field1632 = this.field1369;
		this.field1369.field1633 = this.field1369;
	}

	@ObfInfo(name = "au", desc = "()V")
	public void method767() {
		while (this.field1369.field1632 != this.field1369) {
			this.field1369.field1632.method1024();
		}

	}

	@ObfInfo(name = "ae", desc = "(Lsq;)V")
	public void method761(class180 var1) {
		if (var1.field1633 != null) {
			var1.method1024();
		}

		var1.field1633 = this.field1369.field1633;
		var1.field1632 = this.field1369;
		var1.field1633.field1632 = var1;
		var1.field1632.field1633 = var1;
	}

	@ObfInfo(name = "at", desc = "()Lsq;")
	public class180 method763() {
		class180 var1 = this.field1369.field1632;
		if (var1 == this.field1369) {
			return null;
		} else {
			var1.method1024();
			return var1;
		}
	}

	@ObfInfo(name = "ac", desc = "()Lsq;")
	public class180 method764() {
		return this.method765((class180)null);
	}

	@ObfInfo(name = "ai", desc = "(Lsq;)Lsq;")
	class180 method765(class180 var1) {
		class180 var2;
		if (var1 == null) {
			var2 = this.field1369.field1632;
		} else {
			var2 = var1;
		}

		if (var2 == this.field1369) {
			this.field1368 = null;
			return null;
		} else {
			this.field1368 = var2.field1632;
			return var2;
		}
	}

	@ObfInfo(name = "az", desc = "()Lsq;")
	public class180 method766() {
		class180 var1 = this.field1368;
		if (var1 == this.field1369) {
			this.field1368 = null;
			return null;
		} else {
			this.field1368 = var1.field1632;
			return var1;
		}
	}

	@ObfInfo(name = "iterator", desc = "()Ljava/util/Iterator;")
	public Iterator iterator() {
		return new class225(this);
	}

	@ObfInfo(name = "ao", desc = "(Lsq;Lsq;)V")
	public static void method762(class180 var0, class180 var1) {
		if (var0.field1633 != null) {
			var0.method1024();
		}

		var0.field1633 = var1;
		var0.field1632 = var1.field1632;
		var0.field1633.field1632 = var0;
		var0.field1632.field1633 = var0;
	}
}
