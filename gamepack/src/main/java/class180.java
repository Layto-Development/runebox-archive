public class class180 {
	static class215 field1710;
	public final Object field1711;
	public final Object field1712;

	public class180(Object var1, Object var2) {
		this.field1712 = var1;
		this.field1711 = var2;
	}

	public String toString() {
		return this.field1712 + ", " + this.field1711;
	}

	public boolean equals(Object var1) {
		if (null != var1 && var1 instanceof class180) {
			class180 var2 = (class180)var1;
			if (this.field1712 == null) {
				if (null != var2.field1712) {
					return false;
				}
			} else if (!this.field1712.equals(var2.field1712)) {
				return false;
			}

			if (null == this.field1711) {
				if (var2.field1711 != null) {
					return false;
				}
			} else if (!this.field1711.equals(var2.field1711)) {
				return false;
			}

			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		int var1 = 0;
		if (null != this.field1712) {
			var1 += this.field1712.hashCode();
		}

		if (this.field1711 != null) {
			var1 += 31 * this.field1711.hashCode();
		}

		return var1;
	}
}
