import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfInfo(name = "qt")
public abstract class class153 {
	@ObfInfo(name = "ad", desc = "[Lqs;")
	class179[] field1476;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 844754279)
	int field1479;
	@ObfInfo(name = "an", desc = "Ljava/util/Comparator;")
	Comparator field1481;
	@ObfInfo(name = "aq", desc = "Ljava/util/HashMap;")
	HashMap field1477;
	@ObfInfo(name = "al", desc = "Ljava/util/HashMap;")
	HashMap field1480;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 605463463)
	final int field1478;

	@ObfInfo(name = "<init>", desc = "(I)V")
	class153(int var1) {
		this.field1479 = 0;
		this.field1481 = null;
		this.field1478 = var1;
		this.field1476 = this.method896(var1);
		this.field1477 = new HashMap(var1 / 8);
		this.field1480 = new HashMap(var1 / 8);
	}

	@ObfInfo(name = "au", desc = "(I)Lqs;")
	abstract class179 method902();

	@ObfInfo(name = "ae", desc = "(IB)[Lqs;")
	abstract class179[] method896(int var1);

	@ObfInfo(name = "bk", desc = "(I)V")
	public void method884() {
		this.field1479 = 0;
		Arrays.fill(this.field1476, (Object)null);
		this.field1477.clear();
		this.field1480.clear();
	}

	@ObfInfo(name = "bv", desc = "(I)I")
	public int method905() {
		return this.field1479;
	}

	@ObfInfo(name = "bt", desc = "(B)Z", opaqueValue = "-1")
	public boolean method885() {
		return this.field1478 == this.field1479;
	}

	@ObfInfo(name = "bd", desc = "(Luc;I)Z", opaqueValue = "-2025184197")
	public boolean method900(class353 var1) {
		if (!var1.method1936()) {
			return false;
		} else {
			return this.field1477.containsKey(var1) ? true : this.field1480.containsKey(var1);
		}
	}

	@ObfInfo(name = "by", desc = "(Luc;I)Lqs;", opaqueValue = "-1772295639")
	public class179 method886(class353 var1) {
		class179 var3 = this.method887(var1);
		return null != var3 ? var3 : this.method901(var1);
	}

	@ObfInfo(name = "bs", desc = "(Luc;I)Lqs;", opaqueValue = "-1951140700")
	class179 method887(class353 var1) {
		return !var1.method1936() ? null : (class179)this.field1477.get(var1);
	}

	@ObfInfo(name = "bm", desc = "(Luc;S)Lqs;", opaqueValue = "391")
	class179 method901(class353 var1) {
		return !var1.method1936() ? null : (class179)this.field1480.get(var1);
	}

	@ObfInfo(name = "bf", desc = "(Luc;I)Z", opaqueValue = "-810573248")
	public final boolean method903(class353 var1) {
		class179 var3 = this.method887(var1);
		if (null == var3) {
			return false;
		} else {
			this.method888(var3);
			return true;
		}
	}

	@ObfInfo(name = "bq", desc = "(Lqs;I)V", opaqueValue = "628075358")
	final void method888(class179 var1) {
		int var3 = this.method895(var1);
		if (var3 != -1) {
			this.method898(var3);
			this.method893(var1);
		}
	}

	@ObfInfo(name = "ba", desc = "(Luc;B)Lqs;")
	class179 method899(class353 var1) {
		return this.method889(var1, (class353)null);
	}

	@ObfInfo(name = "bl", desc = "(Luc;Luc;B)Lqs;", opaqueValue = "0")
	class179 method889(class353 var1, class353 var2) {
		if (this.method887(var1) != null) {
			throw new IllegalStateException();
		} else {
			class179 var4 = this.method902();
			var4.method1022(var1, var2);
			this.method894(var4);
			this.method890(var4);
			return var4;
		}
	}

	@ObfInfo(name = "bp", desc = "(IB)Lqs;", opaqueValue = "20")
	public final class179 method892(int var1) {
		if (var1 >= 0 && var1 < this.field1479) {
			return this.field1476[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfInfo(name = "bu", desc = "(I)V")
	public final void method906() {
		if (this.field1481 == null) {
			Arrays.sort(this.field1476, 0, this.field1479);
		} else {
			Arrays.sort(this.field1476, 0, this.field1479, this.field1481);
		}

	}

	@ObfInfo(name = "bo", desc = "(Lqs;Luc;Luc;I)V")
	final void method891(class179 var1, class353 var2, class353 var3) {
		this.method893(var1);
		var1.method1022(var2, var3);
		this.method890(var1);
	}

	@ObfInfo(name = "bb", desc = "(Lqs;B)I", opaqueValue = "2")
	final int method895(class179 var1) {
		for (int var3 = 0; var3 < this.field1479; ++var3) {
			if (this.field1476[var3] == var1) {
				return var3;
			}
		}

		return -1;
	}

	@ObfInfo(name = "br", desc = "(Lqs;I)V", opaqueValue = "-1136381607")
	final void method893(class179 var1) {
		if (this.field1477.remove(var1.field1629) == null) {
			throw new IllegalStateException();
		} else {
			if (var1.field1630 != null) {
				this.field1480.remove(var1.field1630);
			}

		}
	}

	@ObfInfo(name = "be", desc = "(Lqs;I)V")
	final void method894(class179 var1) {
		this.field1476[++this.field1479 - 1] = var1;
	}

	@ObfInfo(name = "bi", desc = "(Lqs;B)V", opaqueValue = "6")
	final void method890(class179 var1) {
		this.field1477.put(var1.field1629, var1);
		if (var1.field1630 != null) {
			class179 var3 = (class179)this.field1480.put(var1.field1630, var1);
			if (var3 != null && var3 != var1) {
				var3.field1630 = null;
			}
		}

	}

	@ObfInfo(name = "bz", desc = "(IB)V", opaqueValue = "8")
	final void method898(int var1) {
		--this.field1479;
		if (var1 < this.field1479) {
			System.arraycopy(this.field1476, var1 + 1, this.field1476, var1, this.field1479 - var1);
		}

	}

	@ObfInfo(name = "bx", desc = "(B)V")
	public final void method904() {
		this.field1481 = null;
	}

	@ObfInfo(name = "bn", desc = "(Ljava/util/Comparator;B)V", opaqueValue = "56")
	public final void method897(Comparator var1) {
		if (null == this.field1481) {
			this.field1481 = var1;
		} else if (this.field1481 instanceof class381) {
			((class381)this.field1481).method2030(var1);
		}

	}
}
