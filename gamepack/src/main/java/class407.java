import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class class407 {
	final class14 field3402;
	final class2 field3399;
	final class2 field3400;
	final int field3403;
	final Comparator field3404;
	final Map field3398;
	final long field3401;

	public class407(int var1, class14 var2) {
		this(-1L, var1, var2);
	}

	class407(long var1, int var3, class14 var4) {
		this.field3404 = new class519(this);
		this.field3401 = var1;
		this.field3403 = var3;
		this.field3402 = var4;
		if (this.field3403 == -1) {
			this.field3398 = new HashMap(64);
			this.field3399 = new class2(64, this.field3404);
			this.field3400 = null;
		} else {
			if (this.field3402 == null) {
				throw new IllegalArgumentException("");
			}

			this.field3398 = new HashMap(this.field3403);
			this.field3399 = new class2(this.field3403, this.field3404);
			this.field3400 = new class2(this.field3403);
		}

	}

	boolean method2100() {
		return this.field3403 != -1;
	}

	public Object method2101(Object var1, byte var2) {
		synchronized(this) {
			if (this.field3401 != -1L) {
				if (var2 == -1) {
					throw new IllegalStateException();
				}

				this.method2103();
			}

			class142 var4 = (class142)this.field3398.get(var1);
			if (var4 == null) {
				if (var2 == -1) {
					throw new IllegalStateException();
				} else {
					return null;
				}
			} else {
				this.method2104(var4, false);
				return var4.field1363;
			}
		}
	}

	public Object method2102(Object var1, Object var2) {
		synchronized(this) {
			if (this.field3401 != -1L) {
				this.method2103();
			}

			class142 var5 = (class142)this.field3398.get(var1);
			if (null != var5) {
				Object var9 = var5.field1363;
				var5.field1363 = var2;
				this.method2104(var5, false);
				return var9;
			} else {
				class142 var6;
				if (this.method2100() && this.field3398.size() == this.field3403) {
					var6 = (class142)this.field3400.remove();
					this.field3398.remove(var6.field1364);
					this.field3399.remove(var6);
				}

				var6 = new class142(var2, var1);
				this.field3398.put(var1, var6);
				this.method2104(var6, true);
				return null;
			}
		}
	}

	void method2104(class142 var1, boolean var2) {
		if (!var2) {
			this.field3399.remove(var1);
			if (this.method2100() && !this.field3400.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field1365 = System.currentTimeMillis();
		if (this.method2100()) {
			switch(this.field3402.field380) {
			case 0:
				var1.field1366 = var1.field1365;
				break;
			case 1:
				++var1.field1366;
			}

			this.field3400.add(var1);
		}

		this.field3399.add(var1);
	}

	void method2103() {
		if (this.field3401 == -1L) {
			throw new IllegalStateException("");
		} else {
			long var2 = System.currentTimeMillis() - this.field3401;

			while (!this.field3399.isEmpty()) {
				class142 var4 = (class142)this.field3399.peek();
				if (var4.field1365 >= var2) {
					return;
				}

				this.field3398.remove(var4.field1364);
				this.field3399.remove(var4);
				if (this.method2100()) {
					this.field3400.remove(var4);
				}
			}

		}
	}

	public void method2099() {
		synchronized(this) {
			this.field3398.clear();
			this.field3399.clear();
			if (this.method2100()) {
				this.field3400.clear();
			}

		}
	}
}
