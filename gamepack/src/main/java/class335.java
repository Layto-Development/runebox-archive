import java.util.Iterator;

public class class335 extends class453 implements class470 {

	final class190 field2561;

	final class338 field2560;

	final int field2559;

	public class335(class476 var1, int var2, class267 var3, class338 var4) {
		super(var1, var3, var4 != null ? var4.method1788(var2) : 0);
		this.field2561 = new class190(64);
		this.field2560 = var4;
		this.field2559 = var2;
	}

	@Override
	protected class20 method2231(int var1) {
		synchronized (this.field2561) {
			class56 var3 = (class56) this.field2561.method1166((long) var1);
			if (null == var3) {
				var3 = this.method1755(var1);
				this.field2561.method1168(var3, (long) var1);
			}
			return var3;
		}
	}

	class56 method1755(int var1) {
		byte[] var3 = this.field2560.method1762(this.field2559, var1);
		class56 var4 = new class56(var1);
		if (var3 != null) {
			var4.method60(new class187(var3));
		}
		return var4;
	}

	public void method1754() {
		synchronized (this.field2561) {
			this.field2561.method1171();
		}
	}

	@Override
	public Iterator iterator() {
		return new class525(this);
	}
}
