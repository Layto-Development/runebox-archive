public final class class231 implements Comparable {

	Object field2007;

	Object field2008;

	long field2009;

	long field2010;

	class231(Object var1, Object var2) {
		this.field2007 = var1;
		this.field2008 = var2;
	}

	int method1364(class231 var1) {
		if (this.field2010 < var1.field2010) {
			return -1;
		} else {
			return this.field2010 > var1.field2010 ? 1 : 0;
		}
	}

	@Override
	public boolean equals(Object var1) {
		if (var1 instanceof class231) {
			return this.field2008.equals(((class231) var1).field2008);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public int hashCode() {
		return this.field2008.hashCode();
	}

	@Override
	public int compareTo(Object var1) {
		return this.method1364((class231) var1);
	}
}
