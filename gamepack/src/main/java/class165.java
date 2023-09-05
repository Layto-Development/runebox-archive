import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ss")
public class class165 {
	@ObfInfo(name = "az", desc = "Lnu;")
	static class437 field1560;
	@ObfInfo(name = "ae", desc = "Ljava/lang/Object;")
	public final Object field1561;
	@ObfInfo(name = "au", desc = "Ljava/lang/Object;")
	public final Object field1562;

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/Object;Ljava/lang/Object;)V")
	public class165(Object var1, Object var2) {
		this.field1562 = var1;
		this.field1561 = var2;
	}

	@ObfInfo(name = "toString", desc = "()Ljava/lang/String;")
	public String toString() {
		return this.field1562 + ", " + this.field1561;
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		if (null != var1 && var1 instanceof class165) {
			class165 var2 = (class165)var1;
			if (this.field1562 == null) {
				if (null != var2.field1562) {
					return false;
				}
			} else if (!this.field1562.equals(var2.field1562)) {
				return false;
			}

			if (null == this.field1561) {
				if (var2.field1561 != null) {
					return false;
				}
			} else if (!this.field1561.equals(var2.field1561)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "hashCode", desc = "()I")
	public int hashCode() {
		int var1 = 0;
		if (null != this.field1562) {
			var1 += this.field1562.hashCode();
		}

		if (this.field1561 != null) {
			var1 += 31 * this.field1561.hashCode();
		}

		return var1;
	}
}
