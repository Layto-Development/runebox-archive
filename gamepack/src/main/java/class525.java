import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "sf")
public final class class525 implements Iterable {
	@ObfInfo(name = "ao", desc = "Lsj;")
	class155 field4203;
	@ObfInfo(name = "at", desc = "Lsj;")
	class155 field4204;
	@ObfInfo(name = "ae", desc = "[Lsj;")
	class155[] field4202;
	@ObfInfo(name = "au", desc = "I")
	int field4201;
	@ObfInfo(name = "ac", desc = "I")
	int field4205;

	@ObfInfo(name = "<init>", desc = "(I)V")
	public class525(int var1) {
		this.field4205 = 0;
		this.field4201 = var1;
		this.field4202 = new class155[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			class155 var3 = this.field4202[var2] = new class155();
			var3.field1482 = var3;
			var3.field1484 = var3;
		}

	}

	@ObfInfo(name = "au", desc = "(J)Lsj;")
	public class155 method2558(long var1) {
		class155 var3 = this.field4202[(int)(var1 & (long)(this.field4201 - 1))];

		for (this.field4203 = var3.field1482; this.field4203 != var3; this.field4203 = this.field4203.field1482) {
			if (this.field4203.field1483 == var1) {
				class155 var4 = this.field4203;
				this.field4203 = this.field4203.field1482;
				return var4;
			}
		}

		this.field4203 = null;
		return null;
	}

	@ObfInfo(name = "ae", desc = "(Lsj;J)V")
	public void method2562(class155 var1, long var2) {
		if (var1.field1484 != null) {
			var1.method907();
		}

		class155 var4 = this.field4202[(int)(var2 & (long)(this.field4201 - 1))];
		var1.field1484 = var4.field1484;
		var1.field1482 = var4;
		var1.field1484.field1482 = var1;
		var1.field1482.field1484 = var1;
		var1.field1483 = var2;
	}

	@ObfInfo(name = "ao", desc = "()V")
	public void method2559() {
		for (int var1 = 0; var1 < this.field4201; ++var1) {
			class155 var2 = this.field4202[var1];

			while (true) {
				class155 var3 = var2.field1482;
				if (var3 == var2) {
					break;
				}

				var3.method907();
			}
		}

		this.field4203 = null;
		this.field4204 = null;
	}

	@ObfInfo(name = "at", desc = "()Lsj;")
	public class155 method2560() {
		this.field4205 = 0;
		return this.method2561();
	}

	@ObfInfo(name = "ac", desc = "()Lsj;")
	public class155 method2561() {
		class155 var1;
		if (this.field4205 > 0 && this.field4204 != this.field4202[this.field4205 - 1]) {
			var1 = this.field4204;
			this.field4204 = var1.field1482;
			return var1;
		} else {
			do {
				if (this.field4205 >= this.field4201) {
					return null;
				}

				var1 = this.field4202[this.field4205++].field1482;
			} while(var1 == this.field4202[this.field4205 - 1]);

			this.field4204 = var1.field1482;
			return var1;
		}
	}

	@ObfInfo(name = "iterator", desc = "()Ljava/util/Iterator;")
	public Iterator iterator() {
		return new class234(this);
	}
}
