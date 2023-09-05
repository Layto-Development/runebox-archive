import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "qj")
public final class class275 implements Comparable {
	@ObfInfo(name = "au", desc = "Ljava/lang/Object;")
	Object field2229;
	@ObfInfo(name = "ae", desc = "Ljava/lang/Object;")
	Object field2230;
	@ObfInfo(name = "ao", desc = "J", longMultiplier = 7811919619489354263L)
	long field2231;
	@ObfInfo(name = "at", desc = "J", longMultiplier = -5410299538867077373L)
	long field2232;

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/Object;Ljava/lang/Object;)V")
	class275(Object var1, Object var2) {
		this.field2229 = var1;
		this.field2230 = var2;
	}

	@ObfInfo(name = "au", desc = "(Lqj;B)I", opaqueValue = "1")
	int method1441(class275 var1) {
		if (this.field2232 < var1.field2232) {
			return -1;
		} else {
			return this.field2232 > var1.field2232 ? 1 : 0;
		}
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		if (var1 instanceof class275) {
			return this.field2230.equals(((class275)var1).field2230);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(name = "hashCode", desc = "()I")
	public int hashCode() {
		return this.field2230.hashCode();
	}

	@ObfInfo(name = "compareTo", desc = "(Ljava/lang/Object;)I")
	public int compareTo(Object var1) {
		return this.method1441((class275)var1);
	}
}
