import java.util.Iterator;

public class class139 implements Iterable {

	class310 field1533;

	public class310 field1534;

	public class139() {
		this.field1534 = new class310();
		this.field1534.field2427 = this.field1534;
		this.field1534.field2428 = this.field1534;
	}

	public void method879() {
		while (this.field1534.field2427 != this.field1534) {
			this.field1534.field2427.method1674();
		}
	}

	public void method873(class310 var1) {
		if (var1.field2428 != null) {
			var1.method1674();
		}
		var1.field2428 = this.field1534.field2428;
		var1.field2427 = this.field1534;
		var1.field2428.field2427 = var1;
		var1.field2427.field2428 = var1;
	}

	public class310 method875() {
		class310 var1 = this.field1534.field2427;
		if (var1 == this.field1534) {
			return null;
		} else {
			var1.method1674();
			return var1;
		}
	}

	public class310 method876() {
		return this.method877((class310) null);
	}

	class310 method877(class310 var1) {
		class310 var2;
		if (var1 == null) {
			var2 = this.field1534.field2427;
		} else {
			var2 = var1;
		}
		if (var2 == this.field1534) {
			this.field1533 = null;
			return null;
		} else {
			this.field1533 = var2.field2427;
			return var2;
		}
	}

	public class310 method878() {
		class310 var1 = this.field1533;
		if (var1 == this.field1534) {
			this.field1533 = null;
			return null;
		} else {
			this.field1533 = var1.field2427;
			return var1;
		}
	}

	@Override
	public Iterator iterator() {
		return new class376(this);
	}

	public static void method874(class310 var0, class310 var1) {
		if (var0.field2428 != null) {
			var0.method1674();
		}
		var0.field2428 = var1;
		var0.field2427 = var1.field2427;
		var0.field2428.field2427 = var0;
		var0.field2427.field2428 = var0;
	}
}
