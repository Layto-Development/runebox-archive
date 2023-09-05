import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "sa")
public class class234 implements Iterator {
	@ObfInfo(name = "ae", desc = "Lsj;")
	class155 field1967;
	@ObfInfo(name = "at", desc = "Lsj;")
	class155 field1969;
	@ObfInfo(name = "au", desc = "Lsf;")
	class525 field1966;
	@ObfInfo(name = "ao", desc = "I")
	int field1968;

	@ObfInfo(name = "<init>", desc = "(Lsf;)V")
	public class234(class525 var1) {
		this.field1969 = null;
		this.field1966 = var1;
		this.method1232();
	}

	@ObfInfo(name = "au", desc = "()V")
	void method1232() {
		this.field1967 = this.field1966.field4202[0].field1482;
		this.field1968 = 1;
		this.field1969 = null;
	}

	@ObfInfo(name = "ae", desc = "()Lsj;")
	public class155 method1233() {
		this.method1232();
		return (class155)this.next();
	}

	@ObfInfo(name = "next", desc = "()Ljava/lang/Object;")
	public Object next() {
		class155 var1;
		if (this.field1967 != this.field1966.field4202[this.field1968 - 1]) {
			var1 = this.field1967;
			this.field1967 = var1.field1482;
			this.field1969 = var1;
			return var1;
		} else {
			do {
				if (this.field1968 >= this.field1966.field4201) {
					return null;
				}

				var1 = this.field1966.field4202[this.field1968++].field1482;
			} while(var1 == this.field1966.field4202[this.field1968 - 1]);

			this.field1967 = var1.field1482;
			this.field1969 = var1;
			return var1;
		}
	}

	@ObfInfo(name = "hasNext", desc = "()Z")
	public boolean hasNext() {
		if (this.field1967 != this.field1966.field4202[this.field1968 - 1]) {
			return true;
		} else {
			while (this.field1968 < this.field1966.field4201) {
				if (this.field1966.field4202[this.field1968++].field1482 != this.field1966.field4202[this.field1968 - 1]) {
					this.field1967 = this.field1966.field4202[this.field1968 - 1].field1482;
					return true;
				}

				this.field1967 = this.field1966.field4202[this.field1968 - 1];
			}

			return false;
		}
	}

	@ObfInfo(name = "remove", desc = "()V")
	public void remove() {
		if (this.field1969 == null) {
			throw new IllegalStateException();
		} else {
			this.field1969.method907();
			this.field1969 = null;
		}
	}
}
