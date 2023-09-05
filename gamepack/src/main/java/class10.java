import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ud")
public class class10 {
	@ObfInfo(name = "ae", desc = "Ljava/lang/Object;")
	public Object field340;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 1988875325)
	public final int field341;

	@ObfInfo(name = "<init>", desc = "(I)V")
	public class10(int var1) {
		this.field341 = var1;
	}

	@ObfInfo(name = "<init>", desc = "(ILjava/lang/Object;)V")
	public class10(int var1, Object var2) {
		this.field341 = var1;
		this.field340 = var2;
	}

	@ObfInfo(name = "hashCode", desc = "()I")
	public int hashCode() {
		return super.hashCode();
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		if (!(var1 instanceof class10)) {
			return false;
		} else {
			class10 var2 = (class10)var1;
			if (null == var2.field340 && null != this.field340) {
				return false;
			} else if (null == this.field340 && var2.field340 != null) {
				return false;
			} else {
				return var2.field341 == this.field341 && var2.field340.equals(this.field340);
			}
		}
	}
}
