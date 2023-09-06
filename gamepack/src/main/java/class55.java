import java.util.Collection;
import java.util.Iterator;

public class class55 implements Iterable, Collection {
	class462 field606;
	class462 field607;

	public class55() {
		this.field606 = new class462();
		this.field606.field3986 = this.field606;
		this.field606.field3988 = this.field606;
	}

	public void method402() {
		while (this.field606.field3986 != this.field606) {
			this.field606.field3986.method2269();
		}

	}

	public void method403(class462 var1) {
		if (var1.field3988 != null) {
			var1.method2269();
		}

		var1.field3988 = this.field606.field3988;
		var1.field3986 = this.field606;
		var1.field3988.field3986 = var1;
		var1.field3986.field3988 = var1;
	}

	public void method412(class462 var1) {
		if (var1.field3988 != null) {
			var1.method2269();
		}

		var1.field3988 = this.field606;
		var1.field3986 = this.field606.field3986;
		var1.field3988.field3986 = var1;
		var1.field3986.field3988 = var1;
	}

	public class462 method409() {
		return this.method404((class462)null);
	}

	class462 method404(class462 var1) {
		class462 var2;
		if (var1 == null) {
			var2 = this.field606.field3986;
		} else {
			var2 = var1;
		}

		if (var2 == this.field606) {
			this.field607 = null;
			return null;
		} else {
			this.field607 = var2.field3986;
			return var2;
		}
	}

	public class462 method405() {
		class462 var1 = this.field607;
		if (var1 == this.field606) {
			this.field607 = null;
			return null;
		} else {
			this.field607 = var1.field3986;
			return var1;
		}
	}

	int method411() {
		int var1 = 0;

		for (class462 var2 = this.field606.field3986; var2 != this.field606; var2 = var2.field3986) {
			++var1;
		}

		return var1;
	}

	public boolean method407() {
		return this.field606.field3986 == this.field606;
	}

	class462[] method406() {
		class462[] var1 = new class462[this.method411()];
		int var2 = 0;

		for (class462 var3 = this.field606.field3986; var3 != this.field606; var3 = var3.field3986) {
			var1[var2++] = var3;
		}

		return var1;
	}

	public Iterator iterator() {
		return new class412(this);
	}

	public int size() {
		return this.method411();
	}

	public boolean isEmpty() {
		return this.method407();
	}

	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.method406();
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (class462 var3 = this.field606.field3986; var3 != this.field606; var3 = var3.field3986) {
			var1[var2++] = var3;
		}

		return var1;
	}

	boolean method408(class462 var1) {
		this.method403(var1);
		return true;
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public void clear() {
		this.method402();
	}

	public boolean add(Object var1) {
		return this.method408((class462)var1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int hashCode() {
		return super.hashCode();
	}

	public static void method410(class462 var0, class462 var1) {
		if (var0.field3988 != null) {
			var0.method2269();
		}

		var0.field3988 = var1;
		var0.field3986 = var1.field3986;
		var0.field3988.field3986 = var0;
		var0.field3986.field3988 = var0;
	}
}
