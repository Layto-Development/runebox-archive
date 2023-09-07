import java.util.Collection;
import java.util.Iterator;

public class class292 implements Iterable, Collection {

	class77 field2335;

	class77 field2336;

	public class292() {
		this.field2335 = new class77();
		this.field2335.field784 = this.field2335;
		this.field2335.field786 = this.field2335;
	}

	public void method1578() {
		while (this.field2335.field784 != this.field2335) {
			this.field2335.field784.method318();
		}
	}

	public void method1579(class77 var1) {
		if (var1.field786 != null) {
			var1.method318();
		}
		var1.field786 = this.field2335.field786;
		var1.field784 = this.field2335;
		var1.field786.field784 = var1;
		var1.field784.field786 = var1;
	}

	public void method1588(class77 var1) {
		if (var1.field786 != null) {
			var1.method318();
		}
		var1.field786 = this.field2335;
		var1.field784 = this.field2335.field784;
		var1.field786.field784 = var1;
		var1.field784.field786 = var1;
	}

	public class77 method1585() {
		return this.method1580((class77) null);
	}

	class77 method1580(class77 var1) {
		class77 var2;
		if (var1 == null) {
			var2 = this.field2335.field784;
		} else {
			var2 = var1;
		}
		if (var2 == this.field2335) {
			this.field2336 = null;
			return null;
		} else {
			this.field2336 = var2.field784;
			return var2;
		}
	}

	public class77 method1581() {
		class77 var1 = this.field2336;
		if (var1 == this.field2335) {
			this.field2336 = null;
			return null;
		} else {
			this.field2336 = var1.field784;
			return var1;
		}
	}

	int method1587() {
		int var1 = 0;
		for (class77 var2 = this.field2335.field784; var2 != this.field2335; var2 = var2.field784) {
			++var1;
		}
		return var1;
	}

	public boolean method1583() {
		return this.field2335.field784 == this.field2335;
	}

	class77[] method1582() {
		class77[] var1 = new class77[this.method1587()];
		int var2 = 0;
		for (class77 var3 = this.field2335.field784; var3 != this.field2335; var3 = var3.field784) {
			var1[var2++] = var3;
		}
		return var1;
	}

	@Override
	public Iterator iterator() {
		return new class263(this);
	}

	@Override
	public int size() {
		return this.method1587();
	}

	@Override
	public boolean isEmpty() {
		return this.method1583();
	}

	@Override
	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	@Override
	public Object[] toArray() {
		return this.method1582();
	}

	@Override
	public Object[] toArray(Object[] var1) {
		int var2 = 0;
		for (class77 var3 = this.field2335.field784; var3 != this.field2335; var3 = var3.field784) {
			var1[var2++] = var3;
		}
		return var1;
	}

	boolean method1584(class77 var1) {
		this.method1579(var1);
		return true;
	}

	@Override
	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	@Override
	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	@Override
	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	@Override
	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	@Override
	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	@Override
	public void clear() {
		this.method1578();
	}

	@Override
	public boolean add(Object var1) {
		return this.method1584((class77) var1);
	}

	@Override
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public static void method1586(class77 var0, class77 var1) {
		if (var0.field786 != null) {
			var0.method318();
		}
		var0.field786 = var1;
		var0.field784 = var1.field784;
		var0.field786.field784 = var0;
		var0.field784.field786 = var0;
	}
}
