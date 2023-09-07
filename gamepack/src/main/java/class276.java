import java.lang.ref.SoftReference;

public class class276 extends class290 {

	SoftReference field2254;

	class276(Object var1, int var2) {
		super(var2);
		this.field2254 = new SoftReference(var1);
	}

	@Override
	Object method1573() {
		return this.field2254.get();
	}

	@Override
	boolean method1572() {
		return true;
	}
}
