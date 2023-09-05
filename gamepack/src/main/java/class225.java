import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "ol")
public class class225 implements Iterator {
	@ObfInfo(name = "au", desc = "Lou;")
	class133 field1943;
	@ObfInfo(name = "ae", desc = "Lsq;")
	class180 field1944;
	@ObfInfo(name = "ao", desc = "Lsq;")
	class180 field1945;

	@ObfInfo(name = "<init>", desc = "(Lou;)V")
	class225(class133 var1) {
		this.field1945 = null;
		this.field1943 = var1;
		this.field1944 = this.field1943.field1369.field1632;
		this.field1945 = null;
	}

	@ObfInfo(name = "next", desc = "()Ljava/lang/Object;")
	public Object next() {
		class180 var1 = this.field1944;
		if (var1 == this.field1943.field1369) {
			var1 = null;
			this.field1944 = null;
		} else {
			this.field1944 = var1.field1632;
		}

		this.field1945 = var1;
		return var1;
	}

	@ObfInfo(name = "hasNext", desc = "()Z")
	public boolean hasNext() {
		return this.field1944 != this.field1943.field1369;
	}

	@ObfInfo(name = "remove", desc = "()V")
	public void remove() {
		if (this.field1945 == null) {
			throw new IllegalStateException();
		} else {
			this.field1945.method1024();
			this.field1945 = null;
		}
	}
}
