public abstract class class453 extends class229 implements class14 {

	protected class453(class476 var1, class267 var2, int var3) {
		super(var1, var2, var3);
	}

	protected abstract class20 method2231(int var1);

	public int method2230() {
		return super.field2006;
	}

	@Override
	public Object method47(int var1) {
		class20 var3 = this.method2231(var1);
		return null != var3 && var3.method63() ? var3.method62() : null;
	}

	public class456 method2229(class187 var1) {
		int var3 = var1.method1145();
		class20 var4 = this.method2231(var3);
		class456 var5 = new class456(var3);
		Class var6 = var4.field103.field2232;
		if (var6 == Integer.class) {
			var5.field3480 = var1.method1100();
		} else if (var6 == Long.class) {
			var5.field3480 = var1.method1101();
		} else if (var6 == String.class) {
			var5.field3480 = var1.method1146();
		} else {
			if (!class361.class.isAssignableFrom(var6)) {
				throw new IllegalStateException();
			}
			try {
				class361 var7 = (class361) var6.newInstance();
				var7.method1885(var1);
				var5.field3480 = var7;
			} catch (InstantiationException var8) {
			} catch (IllegalAccessException var9) {
			}
		}
		return var5;
	}
}
