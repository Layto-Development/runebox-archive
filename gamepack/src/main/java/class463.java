import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class463 {

	class194[] field3545;

	int field3548;

	Comparator field3550;

	HashMap field3546;

	HashMap field3549;

	final int field3547;

	class463(int var1) {
		this.field3548 = 0;
		this.field3550 = null;
		this.field3547 = var1;
		this.field3545 = this.method2276(var1);
		this.field3546 = new HashMap(var1 / 8);
		this.field3549 = new HashMap(var1 / 8);
	}

	abstract class194 method2282();

	abstract class194[] method2276(int var1);

	public void method2264() {
		this.field3548 = 0;
		Arrays.fill(this.field3545, (Object) null);
		this.field3546.clear();
		this.field3549.clear();
	}

	public int method2285() {
		return this.field3548;
	}

	public boolean method2265() {
		return this.field3547 == this.field3548;
	}

	public boolean method2280(class78 var1) {
		if (!var1.method323()) {
			return false;
		} else {
			return this.field3546.containsKey(var1) ? true : this.field3549.containsKey(var1);
		}
	}

	public class194 method2266(class78 var1) {
		class194 var3 = this.method2267(var1);
		return null != var3 ? var3 : this.method2281(var1);
	}

	class194 method2267(class78 var1) {
		return !var1.method323() ? null : (class194) this.field3546.get(var1);
	}

	class194 method2281(class78 var1) {
		return !var1.method323() ? null : (class194) this.field3549.get(var1);
	}

	public final boolean method2283(class78 var1) {
		class194 var3 = this.method2267(var1);
		if (null == var3) {
			return false;
		} else {
			this.method2268(var3);
			return true;
		}
	}

	final void method2268(class194 var1) {
		int var3 = this.method2275(var1);
		if (var3 != -1) {
			this.method2278(var3);
			this.method2273(var1);
		}
	}

	class194 method2279(class78 var1) {
		return this.method2269(var1, (class78) null);
	}

	class194 method2269(class78 var1, class78 var2) {
		if (this.method2267(var1) != null) {
			throw new IllegalStateException();
		} else {
			class194 var4 = this.method2282();
			var4.method1198(var1, var2);
			this.method2274(var4);
			this.method2270(var4);
			return var4;
		}
	}

	public final class194 method2272(int var1) {
		if (var1 >= 0 && var1 < this.field3548) {
			return this.field3545[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	public final void method2286() {
		if (this.field3550 == null) {
			Arrays.sort(this.field3545, 0, this.field3548);
		} else {
			Arrays.sort(this.field3545, 0, this.field3548, this.field3550);
		}
	}

	final void method2271(class194 var1, class78 var2, class78 var3) {
		this.method2273(var1);
		var1.method1198(var2, var3);
		this.method2270(var1);
	}

	final int method2275(class194 var1) {
		for (int var3 = 0; var3 < this.field3548; ++var3) {
			if (this.field3545[var3] == var1) {
				return var3;
			}
		}
		return -1;
	}

	final void method2273(class194 var1) {
		if (this.field3546.remove(var1.field1858) == null) {
			throw new IllegalStateException();
		} else {
			if (var1.field1859 != null) {
				this.field3549.remove(var1.field1859);
			}
		}
	}

	final void method2274(class194 var1) {
		this.field3545[++this.field3548 - 1] = var1;
	}

	final void method2270(class194 var1) {
		this.field3546.put(var1.field1858, var1);
		if (var1.field1859 != null) {
			class194 var3 = (class194) this.field3549.put(var1.field1859, var1);
			if (var3 != null && var3 != var1) {
				var3.field1859 = null;
			}
		}
	}

	final void method2278(int var1) {
		--this.field3548;
		if (var1 < this.field3548) {
			System.arraycopy(this.field3545, var1 + 1, this.field3545, var1, this.field3548 - var1);
		}
	}

	public final void method2284() {
		this.field3550 = null;
	}

	public final void method2277(Comparator var1) {
		if (null == this.field3550) {
			this.field3550 = var1;
		} else if (this.field3550 instanceof class7) {
			((class7) this.field3550).method18(var1);
		}
	}
}
