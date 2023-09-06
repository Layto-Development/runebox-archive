import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class class2 extends AbstractQueue {
	static class227 field312;
	class432[] field309;
	int field307;
	int field311;
	Map field308;
	final Comparator field310;

	public class2(int var1) {
		this(var1, (Comparator)null);
	}

	public class2(int var1, Comparator var2) {
		this.field307 = 0;
		this.field309 = new class432[var1];
		this.field308 = new HashMap();
		this.field310 = var2;
	}

	void method41() {
		int var2 = (this.field309.length << 1) + 1;
		this.field309 = (class432[])((class432[])Arrays.copyOf(this.field309, var2));
	}

	public int size() {
		return this.field311;
	}

	public boolean offer(Object var1) {
		if (this.field308.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field307;
			int var2 = this.field311;
			if (var2 >= this.field309.length) {
				this.method41();
			}

			++this.field311;
			if (var2 == 0) {
				this.field309[0] = new class432(var1, 0);
				this.field308.put(var1, this.field309[0]);
			} else {
				this.field309[var2] = new class432(var1, var2);
				this.field308.put(var1, this.field309[var2]);
				this.method42(var2);
			}

			return true;
		}
	}

	public Object peek() {
		return this.field311 == 0 ? null : this.field309[0].field3538;
	}

	public Object poll() {
		if (this.field311 == 0) {
			return null;
		} else {
			++this.field307;
			Object var1 = this.field309[0].field3538;
			this.field308.remove(var1);
			--this.field311;
			if (this.field311 == 0) {
				this.field309[this.field311] = null;
			} else {
				this.field309[0] = this.field309[this.field311];
				this.field309[0].field3537 = 0;
				this.field309[this.field311] = null;
				this.method43(0);
			}

			return var1;
		}
	}

	public boolean remove(Object var1) {
		class432 var2 = (class432)this.field308.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field307;
			--this.field311;
			if (this.field311 == var2.field3537) {
				this.field309[this.field311] = null;
				return true;
			} else {
				class432 var3 = this.field309[this.field311];
				this.field309[this.field311] = null;
				this.field309[var2.field3537] = var3;
				this.field309[var2.field3537].field3537 = var2.field3537;
				this.method43(var2.field3537);
				if (this.field309[var2.field3537] == var3) {
					this.method42(var2.field3537);
				}

				return true;
			}
		}
	}

	void method42(int var1) {
		class432 var3;
		int var4;
		for (var3 = this.field309[var1]; var1 > 0; var1 = var4) {
			var4 = var1 - 1 >>> 1;
			class432 var5 = this.field309[var4];
			if (null != this.field310) {
				if (this.field310.compare(var3.field3538, var5.field3538) >= 0) {
					break;
				}
			} else if (((Comparable)var3.field3538).compareTo(var5.field3538) >= 0) {
				break;
			}

			this.field309[var1] = var5;
			this.field309[var1].field3537 = var1;
		}

		this.field309[var1] = var3;
		this.field309[var1].field3537 = var1;
	}

	void method43(int var1) {
		class432 var3 = this.field309[var1];

		int var9;
		for (int var4 = this.field311 >>> 1; var1 < var4; var1 = var9) {
			int var5 = 1 + (var1 << 1);
			class432 var6 = this.field309[var5];
			int var7 = (var1 << 1) + 2;
			class432 var8 = this.field309[var7];
			if (this.field310 != null) {
				if (var7 < this.field311 && this.field310.compare(var6.field3538, var8.field3538) > 0) {
					var9 = var7;
				} else {
					var9 = var5;
				}
			} else if (var7 < this.field311 && ((Comparable)var6.field3538).compareTo(var8.field3538) > 0) {
				var9 = var7;
			} else {
				var9 = var5;
			}

			if (this.field310 != null) {
				if (this.field310.compare(var3.field3538, this.field309[var9].field3538) <= 0) {
					break;
				}
			} else if (((Comparable)var3.field3538).compareTo(this.field309[var9].field3538) <= 0) {
				break;
			}

			this.field309[var1] = this.field309[var9];
			this.field309[var1].field3537 = var1;
		}

		this.field309[var1] = var3;
		this.field309[var1].field3537 = var1;
	}

	public boolean contains(Object var1) {
		return this.field308.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (null != this.field310) {
			Arrays.sort(var1, this.field310);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new class387(this);
	}
}
