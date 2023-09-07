import java.util.Comparator;

public abstract class class7 implements Comparator {

	static class84 field25;

	Comparator field26;

	protected class7() {
	}

	final void method18(Comparator var1) {
		if (this.field26 == null) {
			this.field26 = var1;
		} else if (this.field26 instanceof class7) {
			((class7) this.field26).method18(var1);
		}
	}

	protected final int method19(class194 var1, class194 var2) {
		return this.field26 == null ? 0 : this.field26.compare(var1, var2);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
