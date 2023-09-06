import java.lang.ref.SoftReference;

public class class331 extends class191 {
	SoftReference field2914;

	class331(Object var1, int var2) {
		super(var2);
		this.field2914 = new SoftReference(var1);
	}

	Object method1046() {
		return this.field2914.get();
	}

	boolean method1045() {
		return true;
	}
}
