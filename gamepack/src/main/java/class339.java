import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfInfo(name = "qv")
public final class class339 {
	@ObfInfo(name = "ao", desc = "Lpa;")
	final class332 field2690;
	@ObfInfo(name = "at", desc = "Lpa;")
	final class332 field2691;
	@ObfInfo(name = "ai", desc = "Lqm;")
	final class337 field2693;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -139737171)
	final int field2694;
	@ObfInfo(name = "au", desc = "Ljava/util/Comparator;")
	final Comparator field2695;
	@ObfInfo(name = "ae", desc = "Ljava/util/Map;")
	final Map field2689;
	@ObfInfo(name = "ac", desc = "J", longMultiplier = 1657733685024468239L)
	final long field2692;

	@ObfInfo(name = "<init>", desc = "(ILqm;)V")
	public class339(int var1, class337 var2) {
		this(-1L, var1, var2);
	}

	@ObfInfo(name = "<init>", desc = "(JILqm;)V")
	class339(long var1, int var3, class337 var4) {
		this.field2695 = new class56(this);
		this.field2692 = var1;
		this.field2694 = var3;
		this.field2693 = var4;
		if (this.field2694 == -1) {
			this.field2689 = new HashMap(64);
			this.field2690 = new class332(64, this.field2695);
			this.field2691 = null;
		} else {
			if (this.field2693 == null) {
				throw new IllegalArgumentException("");
			}

			this.field2689 = new HashMap(this.field2694);
			this.field2690 = new class332(this.field2694, this.field2695);
			this.field2691 = new class332(this.field2694);
		}

	}

	@ObfInfo(name = "au", desc = "(I)Z", opaqueValue = "-1834943151")
	boolean method1869() {
		return this.field2694 != -1;
	}

	@ObfInfo(name = "ae", desc = "(Ljava/lang/Object;B)Ljava/lang/Object;")
	public Object method1870(Object var1, byte var2) {
		synchronized(this) {
			if (this.field2692 != -1L) {
				if (var2 == -1) {
					throw new IllegalStateException();
				}

				this.method1872();
			}

			class275 var4 = (class275)this.field2689.get(var1);
			if (var4 == null) {
				if (var2 == -1) {
					throw new IllegalStateException();
				} else {
					return null;
				}
			} else {
				this.method1873(var4, false);
				return var4.field2229;
			}
		}
	}

	@ObfInfo(name = "ao", desc = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;", opaqueValue = "-469047339")
	public Object method1871(Object var1, Object var2) {
		synchronized(this) {
			if (this.field2692 != -1L) {
				this.method1872();
			}

			class275 var5 = (class275)this.field2689.get(var1);
			if (null != var5) {
				Object var9 = var5.field2229;
				var5.field2229 = var2;
				this.method1873(var5, false);
				return var9;
			} else {
				class275 var6;
				if (this.method1869() && this.field2689.size() == this.field2694) {
					var6 = (class275)this.field2691.remove();
					this.field2689.remove(var6.field2230);
					this.field2690.remove(var6);
				}

				var6 = new class275(var2, var1);
				this.field2689.put(var1, var6);
				this.method1873(var6, true);
				return null;
			}
		}
	}

	@ObfInfo(name = "at", desc = "(Lqj;ZB)V", opaqueValue = "5")
	void method1873(class275 var1, boolean var2) {
		if (!var2) {
			this.field2690.remove(var1);
			if (this.method1869() && !this.field2691.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field2231 = System.currentTimeMillis();
		if (this.method1869()) {
			switch(this.field2693.field2677) {
			case 0:
				var1.field2232 = var1.field2231;
				break;
			case 1:
				++var1.field2232;
			}

			this.field2691.add(var1);
		}

		this.field2690.add(var1);
	}

	@ObfInfo(name = "ac", desc = "(I)V", opaqueValue = "1646688910")
	void method1872() {
		if (this.field2692 == -1L) {
			throw new IllegalStateException("");
		} else {
			long var2 = System.currentTimeMillis() - this.field2692;

			while (!this.field2690.isEmpty()) {
				class275 var4 = (class275)this.field2690.peek();
				if (var4.field2231 >= var2) {
					return;
				}

				this.field2689.remove(var4.field2230);
				this.field2690.remove(var4);
				if (this.method1869()) {
					this.field2691.remove(var4);
				}
			}

		}
	}

	@ObfInfo(name = "ai", desc = "(B)V", opaqueValue = "5")
	public void method1868() {
		synchronized(this) {
			this.field2689.clear();
			this.field2690.clear();
			if (this.method1869()) {
				this.field2691.clear();
			}

		}
	}
}
