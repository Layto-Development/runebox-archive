public class class456 {

	public Object field3480;

	public final int field3481;

	public class456(int var1) {
		this.field3481 = var1;
	}

	public class456(int var1, Object var2) {
		this.field3481 = var1;
		this.field3480 = var2;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object var1) {
		if (!(var1 instanceof class456)) {
			return false;
		} else {
			class456 var2 = (class456) var1;
			if (null == var2.field3480 && null != this.field3480) {
				return false;
			} else if (null == this.field3480 && var2.field3480 != null) {
				return false;
			} else {
				return var2.field3481 == this.field3481 && var2.field3480.equals(this.field3480);
			}
		}
	}
}
