public class class59 {

	static class338 field640;

	public final Object field641;

	public final Object field642;

	public class59(Object var1, Object var2) {
		this.field642 = var1;
		this.field641 = var2;
	}

	@Override
	public String toString() {
		return this.field642 + ", " + this.field641;
	}

	@Override
	public boolean equals(Object var1) {
		if (null != var1 && var1 instanceof class59) {
			class59 var2 = (class59) var1;
			if (this.field642 == null) {
				if (null != var2.field642) {
					return false;
				}
			} else if (!this.field642.equals(var2.field642)) {
				return false;
			}
			if (null == this.field641) {
				if (var2.field641 != null) {
					return false;
				}
			} else if (!this.field641.equals(var2.field641)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int var1 = 0;
		if (null != this.field642) {
			var1 += this.field642.hashCode();
		}
		if (this.field641 != null) {
			var1 += 31 * this.field641.hashCode();
		}
		return var1;
	}
}
