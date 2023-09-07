import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class505 extends AbstractQueue {

	static class458 field4054;

	class364[] field4051;

	int field4049;

	int field4053;

	Map field4050;

	final Comparator field4052;

	public class505(int var1) {
		this(var1, (Comparator) null);
	}

	public class505(int var1, Comparator var2) {
		this.field4049 = 0;
		this.field4051 = new class364[var1];
		this.field4050 = new HashMap();
		this.field4052 = var2;
	}

	void method2440() {
		int var2 = (this.field4051.length << 1) + 1;
		this.field4051 = (class364[]) (class364[]) Arrays.copyOf(this.field4051, var2);
	}

	@Override
	public int size() {
		return this.field4053;
	}

	@Override
	public boolean offer(Object var1) {
		if (this.field4050.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4049;
			int var2 = this.field4053;
			if (var2 >= this.field4051.length) {
				this.method2440();
			}
			++this.field4053;
			if (var2 == 0) {
				this.field4051[0] = new class364(var1, 0);
				this.field4050.put(var1, this.field4051[0]);
			} else {
				this.field4051[var2] = new class364(var1, var2);
				this.field4050.put(var1, this.field4051[var2]);
				this.method2441(var2);
			}
			return true;
		}
	}

	@Override
	public Object peek() {
		return this.field4053 == 0 ? null : this.field4051[0].field2922;
	}

	@Override
	public Object poll() {
		if (this.field4053 == 0) {
			return null;
		} else {
			++this.field4049;
			Object var1 = this.field4051[0].field2922;
			this.field4050.remove(var1);
			--this.field4053;
			if (this.field4053 == 0) {
				this.field4051[this.field4053] = null;
			} else {
				this.field4051[0] = this.field4051[this.field4053];
				this.field4051[0].field2921 = 0;
				this.field4051[this.field4053] = null;
				this.method2442(0);
			}
			return var1;
		}
	}

	@Override
	public boolean remove(Object var1) {
		class364 var2 = (class364) this.field4050.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4049;
			--this.field4053;
			if (this.field4053 == var2.field2921) {
				this.field4051[this.field4053] = null;
				return true;
			} else {
				class364 var3 = this.field4051[this.field4053];
				this.field4051[this.field4053] = null;
				this.field4051[var2.field2921] = var3;
				this.field4051[var2.field2921].field2921 = var2.field2921;
				this.method2442(var2.field2921);
				if (this.field4051[var2.field2921] == var3) {
					this.method2441(var2.field2921);
				}
				return true;
			}
		}
	}

	void method2441(int var1) {
		class364 var3;
		int var4;
		for (var3 = this.field4051[var1]; var1 > 0; var1 = var4) {
			var4 = var1 - 1 >>> 1;
			class364 var5 = this.field4051[var4];
			if (null != this.field4052) {
				if (this.field4052.compare(var3.field2922, var5.field2922) >= 0) {
					break;
				}
			} else if (((Comparable) var3.field2922).compareTo(var5.field2922) >= 0) {
				break;
			}
			this.field4051[var1] = var5;
			this.field4051[var1].field2921 = var1;
		}
		this.field4051[var1] = var3;
		this.field4051[var1].field2921 = var1;
	}

	void method2442(int var1) {
		class364 var3 = this.field4051[var1];
		int var9;
		for (int var4 = this.field4053 >>> 1; var1 < var4; var1 = var9) {
			int var5 = 1 + (var1 << 1);
			class364 var6 = this.field4051[var5];
			int var7 = (var1 << 1) + 2;
			class364 var8 = this.field4051[var7];
			if (this.field4052 != null) {
				if (var7 < this.field4053 && this.field4052.compare(var6.field2922, var8.field2922) > 0) {
					var9 = var7;
				} else {
					var9 = var5;
				}
			} else if (var7 < this.field4053 && ((Comparable) var6.field2922).compareTo(var8.field2922) > 0) {
				var9 = var7;
			} else {
				var9 = var5;
			}
			if (this.field4052 != null) {
				if (this.field4052.compare(var3.field2922, this.field4051[var9].field2922) <= 0) {
					break;
				}
			} else if (((Comparable) var3.field2922).compareTo(this.field4051[var9].field2922) <= 0) {
				break;
			}
			this.field4051[var1] = this.field4051[var9];
			this.field4051[var1].field2921 = var1;
		}
		this.field4051[var1] = var3;
		this.field4051[var1].field2921 = var1;
	}

	@Override
	public boolean contains(Object var1) {
		return this.field4050.containsKey(var1);
	}

	@Override
	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (null != this.field4052) {
			Arrays.sort(var1, this.field4052);
		} else {
			Arrays.sort(var1);
		}
		return var1;
	}

	@Override
	public Iterator iterator() {
		return new class143(this);
	}
}
