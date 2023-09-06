import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class class303 {
	class71[] field2762;
	int field2765;
	Comparator field2767;
	HashMap field2763;
	HashMap field2766;
	final int field2764;

	class303(int var1) {
		this.field2765 = 0;
		this.field2767 = null;
		this.field2764 = var1;
		this.field2762 = this.method1715(var1);
		this.field2763 = new HashMap(var1 / 8);
		this.field2766 = new HashMap(var1 / 8);
	}

	abstract class71 method1721();

	abstract class71[] method1715(int var1);

	public void method1703() {
		this.field2765 = 0;
		Arrays.fill(this.field2762, (Object)null);
		this.field2763.clear();
		this.field2766.clear();
	}

	public int method1724() {
		return this.field2765;
	}

	public boolean method1704() {
		return this.field2764 == this.field2765;
	}

	public boolean method1719(class440 var1) {
		if (!var1.method2215()) {
			return false;
		} else {
			return this.field2763.containsKey(var1) ? true : this.field2766.containsKey(var1);
		}
	}

	public class71 method1705(class440 var1) {
		class71 var3 = this.method1706(var1);
		return null != var3 ? var3 : this.method1720(var1);
	}

	class71 method1706(class440 var1) {
		return !var1.method2215() ? null : (class71)this.field2763.get(var1);
	}

	class71 method1720(class440 var1) {
		return !var1.method2215() ? null : (class71)this.field2766.get(var1);
	}

	public final boolean method1722(class440 var1) {
		class71 var3 = this.method1706(var1);
		if (null == var3) {
			return false;
		} else {
			this.method1707(var3);
			return true;
		}
	}

	final void method1707(class71 var1) {
		int var3 = this.method1714(var1);
		if (var3 != -1) {
			this.method1717(var3);
			this.method1712(var1);
		}
	}

	class71 method1718(class440 var1) {
		return this.method1708(var1, (class440)null);
	}

	class71 method1708(class440 var1, class440 var2) {
		if (this.method1706(var1) != null) {
			throw new IllegalStateException();
		} else {
			class71 var4 = this.method1721();
			var4.method511(var1, var2);
			this.method1713(var4);
			this.method1709(var4);
			return var4;
		}
	}

	public final class71 method1711(int var1) {
		if (var1 >= 0 && var1 < this.field2765) {
			return this.field2762[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	public final void method1725() {
		if (this.field2767 == null) {
			Arrays.sort(this.field2762, 0, this.field2765);
		} else {
			Arrays.sort(this.field2762, 0, this.field2765, this.field2767);
		}

	}

	final void method1710(class71 var1, class440 var2, class440 var3) {
		this.method1712(var1);
		var1.method511(var2, var3);
		this.method1709(var1);
	}

	final int method1714(class71 var1) {
		for (int var3 = 0; var3 < this.field2765; ++var3) {
			if (this.field2762[var3] == var1) {
				return var3;
			}
		}

		return -1;
	}

	final void method1712(class71 var1) {
		if (this.field2763.remove(var1.field816) == null) {
			throw new IllegalStateException();
		} else {
			if (var1.field817 != null) {
				this.field2766.remove(var1.field817);
			}

		}
	}

	final void method1713(class71 var1) {
		this.field2762[++this.field2765 - 1] = var1;
	}

	final void method1709(class71 var1) {
		this.field2763.put(var1.field816, var1);
		if (var1.field817 != null) {
			class71 var3 = (class71)this.field2766.put(var1.field817, var1);
			if (var3 != null && var3 != var1) {
				var3.field817 = null;
			}
		}

	}

	final void method1717(int var1) {
		--this.field2765;
		if (var1 < this.field2765) {
			System.arraycopy(this.field2762, var1 + 1, this.field2762, var1, this.field2765 - var1);
		}

	}

	public final void method1723() {
		this.field2767 = null;
	}

	public final void method1716(Comparator var1) {
		if (null == this.field2767) {
			this.field2767 = var1;
		} else if (this.field2767 instanceof class268) {
			((class268)this.field2767).method1567(var1);
		}

	}

	static int method1726(int var0, class167 var1, boolean var2) {
		int var4;
		int var5;
		int var7;
		if (var0 == 3400) {
			class203.field1903 -= 2;
			var4 = class139.field1344[class203.field1903];
			var5 = class139.field1344[1 + class203.field1903];
			class114 var11 = class368.method1973(var4);
			if (var11.field1071 != 's') {
			}

			for (var7 = 0; var7 < var11.field1074; ++var7) {
				if (var11.field1068[var7] == var5) {
					class139.field1331[++class429.field3529 - 1] = var11.field1075[var7];
					var11 = null;
					break;
				}
			}

			if (null != var11) {
				class139.field1331[++class429.field3529 - 1] = var11.field1072;
			}

			return 1;
		} else if (var0 != 3408) {
			if (var0 == 3411) {
				var4 = class139.field1344[--class203.field1903];
				class114 var10 = class368.method1973(var4);
				class139.field1344[++class203.field1903 - 1] = var10.method699();
				return 1;
			} else {
				return 2;
			}
		} else {
			class203.field1903 -= 4;
			var4 = class139.field1344[class203.field1903];
			var5 = class139.field1344[class203.field1903 + 1];
			int var6 = class139.field1344[class203.field1903 + 2];
			var7 = class139.field1344[class203.field1903 + 3];
			class114 var8 = class368.method1973(var6);
			if (var8.field1070 == var4 && var8.field1071 == var5) {
				for (int var9 = 0; var9 < var8.field1074; ++var9) {
					if (var8.field1068[var9] == var7) {
						if (var5 == 115) {
							class139.field1331[++class429.field3529 - 1] = var8.field1075[var9];
						} else {
							class139.field1344[++class203.field1903 - 1] = var8.field1077[var9];
						}

						var8 = null;
						break;
					}
				}

				if (null != var8) {
					if (var5 == 115) {
						class139.field1331[++class429.field3529 - 1] = var8.field1072;
					} else {
						class139.field1344[++class203.field1903 - 1] = var8.field1069;
					}
				}

				return 1;
			} else {
				if (var5 == 115) {
					class139.field1331[++class429.field3529 - 1] = class433.field3850;
				} else {
					class139.field1344[++class203.field1903 - 1] = 0;
				}

				return 1;
			}
		}
	}

	static final boolean method1727() {
		return Client.field116;
	}
}
