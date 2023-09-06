public class class322 {
	public Object field2897;
	public final int field2898;

	public class322(int var1) {
		this.field2898 = var1;
	}

	public class322(int var1, Object var2) {
		this.field2898 = var1;
		this.field2897 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class322)) {
			return false;
		} else {
			class322 var2 = (class322)var1;
			if (null == var2.field2897 && null != this.field2897) {
				return false;
			} else if (null == this.field2897 && var2.field2897 != null) {
				return false;
			} else {
				return var2.field2898 == this.field2898 && var2.field2897.equals(this.field2897);
			}
		}
	}
}
