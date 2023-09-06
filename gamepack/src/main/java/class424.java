public abstract class class424 extends class45 implements class390 {
	protected class424(class460 var1, class168 var2, int var3) {
		super(var1, var2, var3);
	}

	protected abstract class531 method2171(int var1);

	public int method2170() {
		return super.field538;
	}

	public Object method2048(int var1) {
		class531 var3 = this.method2171(var1);
		return null != var3 && var3.method2564() ? var3.method2563() : null;
	}

	public class322 method2169(class42 var1) {
		int var3 = var1.method327();
		class531 var4 = this.method2171(var3);
		class322 var5 = new class322(var3);
		Class var6 = var4.field4267.field1350;
		if (var6 == Integer.class) {
			var5.field2897 = var1.method282();
		} else if (var6 == Long.class) {
			var5.field2897 = var1.method283();
		} else if (var6 == String.class) {
			var5.field2897 = var1.method328();
		} else {
			if (!class103.class.isAssignableFrom(var6)) {
				throw new IllegalStateException();
			}

			try {
				class103 var7 = (class103)var6.newInstance();
				var7.method674(var1);
				var5.field2897 = var7;
			} catch (InstantiationException var8) {
			} catch (IllegalAccessException var9) {
			}
		}

		return var5;
	}
}
