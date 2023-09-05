import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfInfo(name = "pa")
public class class332 extends AbstractQueue {
	@ObfInfo(name = "wh", desc = "Lno;")
	static class414 field2640;
	@ObfInfo(name = "au", desc = "[Lps;")
	class272[] field2637;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1450073607)
	int field2635;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1031831555)
	int field2639;
	@ObfInfo(name = "ae", desc = "Ljava/util/Map;")
	Map field2636;
	@ObfInfo(name = "at", desc = "Ljava/util/Comparator;")
	final Comparator field2638;

	@ObfInfo(name = "<init>", desc = "(I)V")
	public class332(int var1) {
		this(var1, (Comparator)null);
	}

	@ObfInfo(name = "<init>", desc = "(ILjava/util/Comparator;)V")
	public class332(int var1, Comparator var2) {
		this.field2635 = 0;
		this.field2637 = new class272[var1];
		this.field2636 = new HashMap();
		this.field2638 = var2;
	}

	@ObfInfo(name = "au", desc = "(B)V")
	void method1810() {
		int var2 = (this.field2637.length << 1) + 1;
		this.field2637 = (class272[])((class272[])Arrays.copyOf(this.field2637, var2));
	}

	@ObfInfo(name = "size", desc = "()I")
	public int size() {
		return this.field2639;
	}

	@ObfInfo(name = "offer", desc = "(Ljava/lang/Object;)Z")
	public boolean offer(Object var1) {
		if (this.field2636.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field2635;
			int var2 = this.field2639;
			if (var2 >= this.field2637.length) {
				this.method1810();
			}

			++this.field2639;
			if (var2 == 0) {
				this.field2637[0] = new class272(var1, 0);
				this.field2636.put(var1, this.field2637[0]);
			} else {
				this.field2637[var2] = new class272(var1, var2);
				this.field2636.put(var1, this.field2637[var2]);
				this.method1811(var2);
			}

			return true;
		}
	}

	@ObfInfo(name = "peek", desc = "()Ljava/lang/Object;")
	public Object peek() {
		return this.field2639 == 0 ? null : this.field2637[0].field2223;
	}

	@ObfInfo(name = "poll", desc = "()Ljava/lang/Object;")
	public Object poll() {
		if (this.field2639 == 0) {
			return null;
		} else {
			++this.field2635;
			Object var1 = this.field2637[0].field2223;
			this.field2636.remove(var1);
			--this.field2639;
			if (this.field2639 == 0) {
				this.field2637[this.field2639] = null;
			} else {
				this.field2637[0] = this.field2637[this.field2639];
				this.field2637[0].field2222 = 0;
				this.field2637[this.field2639] = null;
				this.method1812(0);
			}

			return var1;
		}
	}

	@ObfInfo(name = "remove", desc = "(Ljava/lang/Object;)Z")
	public boolean remove(Object var1) {
		class272 var2 = (class272)this.field2636.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field2635;
			--this.field2639;
			if (this.field2639 == var2.field2222) {
				this.field2637[this.field2639] = null;
				return true;
			} else {
				class272 var3 = this.field2637[this.field2639];
				this.field2637[this.field2639] = null;
				this.field2637[var2.field2222] = var3;
				this.field2637[var2.field2222].field2222 = var2.field2222;
				this.method1812(var2.field2222);
				if (this.field2637[var2.field2222] == var3) {
					this.method1811(var2.field2222);
				}

				return true;
			}
		}
	}

	@ObfInfo(name = "ae", desc = "(IB)V", opaqueValue = "15")
	void method1811(int var1) {
		class272 var3;
		int var4;
		for (var3 = this.field2637[var1]; var1 > 0; var1 = var4) {
			var4 = var1 - 1 >>> 1;
			class272 var5 = this.field2637[var4];
			if (null != this.field2638) {
				if (this.field2638.compare(var3.field2223, var5.field2223) >= 0) {
					break;
				}
			} else if (((Comparable)var3.field2223).compareTo(var5.field2223) >= 0) {
				break;
			}

			this.field2637[var1] = var5;
			this.field2637[var1].field2222 = var1;
		}

		this.field2637[var1] = var3;
		this.field2637[var1].field2222 = var1;
	}

	@ObfInfo(name = "ao", desc = "(II)V", opaqueValue = "-466589419")
	void method1812(int var1) {
		class272 var3 = this.field2637[var1];

		int var9;
		for (int var4 = this.field2639 >>> 1; var1 < var4; var1 = var9) {
			int var5 = 1 + (var1 << 1);
			class272 var6 = this.field2637[var5];
			int var7 = (var1 << 1) + 2;
			class272 var8 = this.field2637[var7];
			if (this.field2638 != null) {
				if (var7 < this.field2639 && this.field2638.compare(var6.field2223, var8.field2223) > 0) {
					var9 = var7;
				} else {
					var9 = var5;
				}
			} else if (var7 < this.field2639 && ((Comparable)var6.field2223).compareTo(var8.field2223) > 0) {
				var9 = var7;
			} else {
				var9 = var5;
			}

			if (this.field2638 != null) {
				if (this.field2638.compare(var3.field2223, this.field2637[var9].field2223) <= 0) {
					break;
				}
			} else if (((Comparable)var3.field2223).compareTo(this.field2637[var9].field2223) <= 0) {
				break;
			}

			this.field2637[var1] = this.field2637[var9];
			this.field2637[var1].field2222 = var1;
		}

		this.field2637[var1] = var3;
		this.field2637[var1].field2222 = var1;
	}

	@ObfInfo(name = "contains", desc = "(Ljava/lang/Object;)Z")
	public boolean contains(Object var1) {
		return this.field2636.containsKey(var1);
	}

	@ObfInfo(name = "toArray", desc = "()[Ljava/lang/Object;")
	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (null != this.field2638) {
			Arrays.sort(var1, this.field2638);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	@ObfInfo(name = "iterator", desc = "()Ljava/util/Iterator;")
	public Iterator iterator() {
		return new class86(this);
	}
}
