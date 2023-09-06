import java.util.Comparator;

public abstract class class268 implements Comparator {
	static class115 field2420;
	Comparator field2421;

	protected class268() {
	}

	final void method1567(Comparator var1) {
		if (this.field2421 == null) {
			this.field2421 = var1;
		} else if (this.field2421 instanceof class268) {
			((class268)this.field2421).method1567(var1);
		}

	}

	protected final int method1568(class71 var1, class71 var2) {
		return this.field2421 == null ? 0 : this.field2421.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
