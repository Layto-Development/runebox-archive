public final class class142 implements Comparable {
	Object field1363;
	Object field1364;
	long field1365;
	long field1366;

	class142(Object var1, Object var2) {
		this.field1363 = var1;
		this.field1364 = var2;
	}

	int method843(class142 var1) {
		if (this.field1366 < var1.field1366) {
			return -1;
		} else {
			return this.field1366 > var1.field1366 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class142) {
			return this.field1364.equals(((class142)var1).field1364);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field1364.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method843((class142)var1);
	}
}
