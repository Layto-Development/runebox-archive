import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class199 {
	static final class182 field1810;
	static final class182 field1811;
	static final class182 field1858;
	boolean field1834;
	boolean field1845;
	boolean field1850;
	class115 field1857;
	class134 field1820;
	class215 field1809;
	class215 field1815;
	class215 field1856;
	class253 field1813;
	class25[] field1847;
	class29 field1833;
	class8 field1819;
	class8 field1827;
	class8 field1836;
	class97 field1821;
	float field1814;
	float field1826;
	int field1808;
	int field1817;
	int field1818;
	int field1822;
	int field1823;
	int field1824;
	int field1825;
	int field1828;
	int field1829;
	int field1830;
	int field1831;
	int field1832;
	int field1837;
	int field1838;
	int field1839;
	int field1840;
	int field1841;
	int field1843;
	int field1844;
	int field1854;
	int field1855;
	int field1860;
	int field1861;
	HashMap field1849;
	HashMap field1853;
	HashSet field1806;
	HashSet field1816;
	HashSet field1835;
	HashSet field1846;
	HashSet field1848;
	HashSet field1851;
	Iterator field1812;
	List field1852;
	long field1842;
	final int[] field1859;
	public boolean field1807;

	static {
		field1810 = class182.field1715;
		field1811 = class182.field1721;
		field1858 = class182.field1714;
	}

	public class199() {
		this.field1824 = -1;
		this.field1817 = -1;
		this.field1828 = -1;
		this.field1829 = -1;
		this.field1830 = -1;
		this.field1831 = -1;
		this.field1832 = 3;
		this.field1822 = 50;
		this.field1834 = false;
		this.field1835 = null;
		this.field1825 = -1;
		this.field1837 = -1;
		this.field1838 = -1;
		this.field1839 = -1;
		this.field1840 = -1;
		this.field1841 = -1;
		this.field1845 = true;
		this.field1846 = new HashSet();
		this.field1816 = new HashSet();
		this.field1848 = new HashSet();
		this.field1806 = new HashSet();
		this.field1850 = false;
		this.field1808 = 0;
		this.field1859 = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field1851 = new HashSet();
		this.field1833 = null;
		this.field1807 = false;
		this.field1855 = -1;
		this.field1860 = -1;
		this.field1861 = -1;
	}

	public void method1079(class215 var1, class215 var2, class215 var3, class253 var4, HashMap var5, class25[] var6) {
		this.field1847 = var6;
		this.field1856 = var1;
		this.field1815 = var2;
		this.field1809 = var3;
		this.field1813 = var4;
		this.field1853 = new HashMap();
		this.field1853.put(class467.field4007, var5.get(field1810));
		this.field1853.put(class467.field4002, var5.get(field1811));
		this.field1853.put(class467.field4001, var5.get(field1858));
		this.field1821 = new class97(var1);
		int var8 = this.field1856.method1237(class499.field4155.field4154);
		int[] var9 = this.field1856.method1223(var8);
		int var10 = var9 == null ? 0 : var9.length;
		this.field1849 = new HashMap(var10);

		for (int var11 = 0; var11 < var10; ++var11) {
			class42 var12 = new class42(this.field1856.method1212(var8, var9[var11]));
			class8 var13 = new class8();
			var13.method66(var12, var9[var11]);
			this.field1849.put(var13.method76(), var13);
			if (var13.method69()) {
				this.field1827 = var13;
			}
		}

		this.method1092(this.field1827);
		this.field1819 = null;
	}

	public void method1080() {
		class454.method2263();
	}

	public void method1128(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.field1821.method642()) {
			this.method1083();
			this.method1084();
			if (var3) {
				int var9 = (int)Math.ceil((double)((float)var6 / this.field1826));
				int var10 = (int)Math.ceil((double)((float)var7 / this.field1826));
				List var11 = this.field1820.method809(this.field1843 - var9 / 2 - 1, this.field1823 - var10 / 2 - 1, var9 / 2 + this.field1843 + 1, this.field1823 + var10 / 2 + 1, var4, var5, var6, var7, var1, var2);
				HashSet var12 = new HashSet();

				Iterator var13;
				class217 var14;
				class309 var15;
				class113 var16;
				for (var13 = var11.iterator(); var13.hasNext(); class186.method1031(var15)) {
					var14 = (class217)var13.next();
					var12.add(var14);
					var15 = new class309();
					var16 = new class113(var14.method1244(), var14.field2026, var14.field2025);
					var15.method1743(new Object[]{var16, var1, var2});
					if (this.field1851.contains(var14)) {
						var15.method1741(17);
					} else {
						var15.method1741(15);
					}
				}

				var13 = this.field1851.iterator();

				while (var13.hasNext()) {
					var14 = (class217)var13.next();
					if (!var12.contains(var14)) {
						var15 = new class309();
						var16 = new class113(var14.method1244(), var14.field2026, var14.field2025);
						var15.method1743(new Object[]{var16, var1, var2});
						var15.method1741(16);
						class186.method1031(var15);
					}
				}

				this.field1851 = var12;
			}
		}
	}

	public void method1082(int var1, int var2, boolean var3, boolean var4) {
		long var6;
		label33: {
			var6 = class172.method977();
			this.method1135(var1, var2, var4, var6);
			if (!this.method1127() && (var4 || var3)) {
				boolean var8 = Client.field187 != null;
				if (!var8) {
					if (var4) {
						this.field1840 = var1;
						this.field1841 = var2;
						this.field1838 = this.field1843;
						this.field1839 = this.field1823;
					}

					if (this.field1838 != -1) {
						int var9 = var1 - this.field1840;
						int var10 = var2 - this.field1841;
						this.method1095(this.field1838 - (int)((float)var9 / this.field1814), this.field1839 + (int)((float)var10 / this.field1814), false);
					}
					break label33;
				}
			}

			this.method1131();
		}

		if (var4) {
			this.field1842 = var6;
			this.field1854 = var1;
			this.field1818 = var2;
		}

	}

	void method1135(int var1, int var2, boolean var3, long var4) {
		if (this.field1836 != null) {
			int var6 = (int)((float)this.field1843 + ((float)(var1 - this.field1830) - (float)this.method1108() * this.field1826 / 2.0F) / this.field1826);
			int var7 = (int)((float)this.field1823 - ((float)(var2 - this.field1831) - (float)this.method1109() * this.field1826 / 2.0F) / this.field1826);
			this.field1833 = this.field1836.method68(var6 + this.field1836.method74() * 64, var7 + this.field1836.method84() * 64);
			if (null != this.field1833 && var3) {
				class411 var8 = class212.method1209();
				boolean var9 = Client.field91 >= 2;
				if (var9 && var8.method2118(82) && var8.method2118(81)) {
					class102.method673(this.field1833.field460, this.field1833.field462, this.field1833.field461, false);
				} else {
					boolean var10 = true;
					if (this.field1845) {
						int var11 = var1 - this.field1854;
						int var12 = var2 - this.field1818;
						if (var4 - this.field1842 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
							var10 = false;
						}
					}

					if (var10) {
						class160 var13 = class85.method556(class129.field1253, Client.field68.field2426);
						var13.field1483.method333(this.field1833.method213());
						Client.field68.method1570(var13);
						this.field1842 = 0L;
					}
				}
			}
		} else {
			this.field1833 = null;
		}

	}

	void method1083() {
		if (null != class432.field3539) {
			this.field1826 = this.field1814;
		} else {
			if (this.field1826 < this.field1814) {
				this.field1826 = Math.min(this.field1814, this.field1826 / 30.0F + this.field1826);
			}

			if (this.field1826 > this.field1814) {
				this.field1826 = Math.max(this.field1814, this.field1826 - this.field1826 / 30.0F);
			}

		}
	}

	void method1084() {
		if (this.method1127()) {
			int var2 = this.field1824 - this.field1843;
			int var3 = this.field1817 - this.field1823;
			if (var2 != 0) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			if (var3 != 0) {
				var3 /= Math.min(8, Math.abs(var3));
			}

			this.method1095(this.field1843 + var2, var3 + this.field1823, true);
			if (this.field1824 == this.field1843 && this.field1817 == this.field1823) {
				this.field1824 = -1;
				this.field1817 = -1;
			}

		}
	}

	final void method1095(int var1, int var2, boolean var3) {
		this.field1843 = var1;
		this.field1823 = var2;
		class172.method977();
		if (var3) {
			this.method1131();
		}

	}

	final void method1131() {
		this.field1841 = -1;
		this.field1840 = -1;
		this.field1839 = -1;
		this.field1838 = -1;
	}

	boolean method1127() {
		return this.field1824 != -1 && this.field1817 != -1;
	}

	public class8 method1087(int var1, int var2, int var3) {
		Iterator var5 = this.field1849.values().iterator();

		class8 var6;
		do {
			if (!var5.hasNext()) {
				return null;
			}

			var6 = (class8)var5.next();
		} while(!var6.method67(var1, var2, var3));

		return var6;
	}

	public void method1085(int var1, int var2, int var3, boolean var4) {
		class8 var6 = this.method1087(var1, var2, var3);
		if (null == var6) {
			if (!var4) {
				return;
			}

			var6 = this.field1827;
		}

		boolean var7 = false;
		if (this.field1819 != var6 || var4) {
			this.field1819 = var6;
			this.method1092(var6);
			var7 = true;
		}

		if (var7 || var4) {
			this.method1132(var1, var2, var3);
		}

	}

	public void method1089(int var1) {
		class8 var3 = this.method1124(var1);
		if (var3 != null) {
			this.method1092(var3);
		}

	}

	public int method1090() {
		return null == this.field1836 ? -1 : this.field1836.method77();
	}

	public class8 method1091() {
		return this.field1836;
	}

	void method1092(class8 var1) {
		if (this.field1836 == null || this.field1836 != var1) {
			this.method1093(var1);
			this.method1132(-1, -1, -1);
		}
	}

	void method1093(class8 var1) {
		this.field1836 = var1;
		this.field1820 = new class134(this.field1847, this.field1853, this.field1815, this.field1809);
		this.field1821.method640(this.field1836 == null ? null : this.field1836.method76());
	}

	public void method1094(class8 var1, class29 var2, class29 var3, boolean var4) {
		if (null != var1) {
			if (null == this.field1836 || var1 != this.field1836) {
				this.method1093(var1);
			}

			if (!var4 && this.field1836.method67(var2.field461, var2.field460, var2.field462)) {
				this.method1132(var2.field461, var2.field460, var2.field462);
			} else {
				this.method1132(var3.field461, var3.field460, var3.field462);
			}

		}
	}

	void method1132(int var1, int var2, int var3) {
		if (null != this.field1836) {
			int[] var5 = this.field1836.method81(var1, var2, var3);
			if (null == var5) {
				var5 = this.field1836.method81(this.field1836.method78(), this.field1836.method86(), this.field1836.method79());
			}

			this.method1095(var5[0] - this.field1836.method74() * 64, var5[1] - this.field1836.method84() * 64, true);
			this.field1824 = -1;
			this.field1817 = -1;
			this.field1826 = this.method1099(this.field1836.method73());
			this.field1814 = this.field1826;
			this.field1852 = null;
			this.field1812 = null;
			this.field1820.method813();
		}
	}

	public void method1136(int var1, int var2, int var3, int var4, int var5) {
		int[] var7 = new int[4];
		class266.method1544(var7);
		class266.method1555(var1, var2, var3 + var1, var4 + var2);
		class266.method1548(var1, var2, var3, var4, -16777216);
		int var8 = this.field1821.method643();
		if (var8 < 100) {
			this.method1107(var1, var2, var3, var4, var8);
		} else {
			if (!this.field1820.method811()) {
				this.field1820.method805(this.field1856, this.field1836.method76(), Client.field30);
				if (!this.field1820.method811()) {
					return;
				}
			}

			if (this.field1835 != null) {
				++this.field1837;
				if (this.field1837 % this.field1822 == 0) {
					this.field1837 = 0;
					++this.field1825;
				}

				if (this.field1825 >= this.field1832 && !this.field1834) {
					this.field1835 = null;
				}
			}

			int var9 = (int)Math.ceil((double)((float)var3 / this.field1826));
			int var10 = (int)Math.ceil((double)((float)var4 / this.field1826));
			this.field1820.method806(this.field1843 - var9 / 2, this.field1823 - var10 / 2, this.field1843 + var9 / 2, this.field1823 + var10 / 2, var1, var2, var3 + var1, var2 + var4);
			boolean var11;
			if (!this.field1850) {
				var11 = false;
				if (var5 - this.field1808 > 100) {
					this.field1808 = var5;
					var11 = true;
				}

				this.field1820.method807(this.field1843 - var9 / 2, this.field1823 - var10 / 2, this.field1843 + var9 / 2, var10 / 2 + this.field1823, var1, var2, var3 + var1, var4 + var2, this.field1806, this.field1835, this.field1837, this.field1822, var11);
			}

			this.method1097(var1, var2, var3, var4, var9, var10);
			var11 = Client.field91 >= 2;
			if (var11 && this.field1807 && null != this.field1833) {
				this.field1813.method1320("Coord: " + this.field1833, class266.field2409 + 10, class266.field2410 + 20, 16776960, -1);
			}

			this.field1828 = var9;
			this.field1829 = var10;
			this.field1830 = var1;
			this.field1831 = var2;
			class266.method1564(var7);
		}
	}

	boolean method1133(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (null == this.field1857) {
			return true;
		} else if (var1 == this.field1857.field1084 && this.field1857.field1080 == var2) {
			if (this.field1844 != this.field1820.field1312) {
				return true;
			} else if (Client.field126 != this.field1861) {
				return true;
			} else if (var3 <= 0 && var4 <= 0) {
				return var1 + var3 < var5 || var4 + var2 < var6;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	void method1097(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (null != class432.field3539) {
			int var8 = 512 / (this.field1820.field1312 * 2);
			int var9 = var3 + 512;
			int var10 = var4 + 512;
			float var11 = 1.0F;
			var9 = (int)((float)var9 / var11);
			var10 = (int)((float)var10 / var11);
			int var12 = this.method1106() - var5 / 2 - var8;
			int var13 = this.method1129() - var6 / 2 - var8;
			int var14 = var1 - this.field1820.field1312 * (var12 + var8 - this.field1855);
			int var15 = var2 - (var8 - (var13 - this.field1860)) * this.field1820.field1312;
			if (this.method1133(var9, var10, var14, var15, var3, var4)) {
				if (this.field1857 != null && var9 == this.field1857.field1084 && var10 == this.field1857.field1080) {
					Arrays.fill(this.field1857.field1083, 0);
				} else {
					this.field1857 = new class115(var9, var10);
				}

				this.field1855 = this.method1106() - var5 / 2 - var8;
				this.field1860 = this.method1129() - var6 / 2 - var8;
				this.field1844 = this.field1820.field1312;
				class432.field3539.method690(this.field1855, this.field1860, this.field1857, (float)this.field1844 / var11);
				this.field1861 = Client.field126;
				var14 = var1 - this.field1820.field1312 * (var8 + var12 - this.field1855);
				var15 = var2 - this.field1820.field1312 * (var8 - (var13 - this.field1860));
			}

			class266.method1547(var1, var2, var3, var4, 0, 128);
			if (var11 == 1.0F) {
				this.field1857.method736(var14, var15, 192);
			} else {
				this.field1857.method722(var14, var15, (int)((float)var9 * var11), (int)(var11 * (float)var10), 192);
			}
		}

	}

	public void method1126(int var1, int var2, int var3, int var4) {
		if (this.field1821.method642()) {
			if (!this.field1820.method811()) {
				this.field1820.method805(this.field1856, this.field1836.method76(), Client.field30);
				if (!this.field1820.method811()) {
					return;
				}
			}

			this.field1820.method808(var1, var2, var3, var4, this.field1835, this.field1837, this.field1822);
		}
	}

	public void method1098(int var1) {
		this.field1814 = this.method1099(var1);
	}

	void method1107(int var1, int var2, int var3, int var4, int var5) {
		byte var7 = 20;
		int var8 = var3 / 2 + var1;
		int var9 = var2 + var4 / 2 - 18 - var7;
		class266.method1548(var1, var2, var3, var4, -16777216);
		class266.method1551(var8 - 152, var9, 304, 34, -65536);
		class266.method1548(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
		this.field1813.method1299(class433.field3689, var8, var7 + var9, -1, -1);
	}

	float method1099(int var1) {
		if (var1 == 25) {
			return 1.0F;
		} else if (var1 == 37) {
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F;
		} else if (var1 == 75) {
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F;
		}
	}

	public int method1100() {
		if ((double)this.field1814 == 1.0D) {
			return 25;
		} else if (1.5D == (double)this.field1814) {
			return 37;
		} else if ((double)this.field1814 == 2.0D) {
			return 50;
		} else if (3.0D == (double)this.field1814) {
			return 75;
		} else {
			return 4.0D == (double)this.field1814 ? 100 : 200;
		}
	}

	public void method1101() {
		this.field1821.method641();
	}

	public boolean method1130() {
		return this.field1821.method642();
	}

	public class8 method1124(int var1) {
		Iterator var3 = this.field1849.values().iterator();

		class8 var4;
		do {
			if (!var3.hasNext()) {
				return null;
			}

			var4 = (class8)var3.next();
		} while(var4.method77() != var1);

		return var4;
	}

	public void method1102(int var1, int var2) {
		if (this.field1836 != null && this.field1836.method70(var1, var2)) {
			this.field1824 = var1 - this.field1836.method74() * 64;
			this.field1817 = var2 - this.field1836.method84() * 64;
		}
	}

	public void method1103(int var1, int var2) {
		if (this.field1836 != null) {
			this.method1095(var1 - this.field1836.method74() * 64, var2 - this.field1836.method84() * 64, true);
			this.field1824 = -1;
			this.field1817 = -1;
		}
	}

	public void method1104(int var1, int var2, int var3) {
		if (this.field1836 != null) {
			int[] var5 = this.field1836.method81(var1, var2, var3);
			if (null != var5) {
				this.method1102(var5[0], var5[1]);
			}

		}
	}

	public void method1105(int var1, int var2, int var3) {
		if (null != this.field1836) {
			int[] var5 = this.field1836.method81(var1, var2, var3);
			if (null != var5) {
				this.method1103(var5[0], var5[1]);
			}

		}
	}

	public int method1106() {
		return null == this.field1836 ? -1 : this.field1843 + this.field1836.method74() * 64;
	}

	public int method1129() {
		return this.field1836 == null ? -1 : this.field1823 + this.field1836.method84() * 64;
	}

	public class29 method1086() {
		return null == this.field1836 ? null : this.field1836.method68(this.method1106(), this.method1129());
	}

	public int method1108() {
		return this.field1828;
	}

	public int method1109() {
		return this.field1829;
	}

	public void method1110(int var1) {
		if (var1 >= 1) {
			this.field1832 = var1;
		}

	}

	public void method1111() {
		this.field1832 = 3;
	}

	public void method1112(int var1) {
		if (var1 >= 1) {
			this.field1822 = var1;
		}

	}

	public void method1113() {
		this.field1822 = 50;
	}

	public void method1114(boolean var1) {
		this.field1834 = var1;
	}

	public void method1096(int var1) {
		this.field1835 = new HashSet();
		this.field1835.add(var1);
		this.field1825 = 0;
		this.field1837 = 0;
	}

	public void method1115(int var1) {
		this.field1835 = new HashSet();
		this.field1825 = 0;
		this.field1837 = 0;

		for (int var3 = 0; var3 < class96.field958; ++var3) {
			if (class158.method892(var3) != null && class158.method892(var3).field978 == var1) {
				this.field1835.add(class158.method892(var3).field964);
			}
		}

	}

	public void method1116() {
		this.field1835 = null;
	}

	public void method1117(boolean var1) {
		this.field1850 = !var1;
	}

	public void method1125(int var1, boolean var2) {
		if (!var2) {
			this.field1846.add(var1);
		} else {
			this.field1846.remove(var1);
		}

		this.method1120();
	}

	public void method1088(int var1, boolean var2) {
		if (!var2) {
			this.field1816.add(var1);
		} else {
			this.field1816.remove(var1);
		}

		for (int var4 = 0; var4 < class96.field958; ++var4) {
			if (class158.method892(var4) != null && class158.method892(var4).field978 == var1) {
				int var5 = class158.method892(var4).field964;
				if (!var2) {
					this.field1848.add(var5);
				} else {
					this.field1848.remove(var5);
				}
			}
		}

		this.method1120();
	}

	public boolean method1118() {
		return !this.field1850;
	}

	public boolean method1134(int var1) {
		return !this.field1846.contains(var1);
	}

	public boolean method1119(int var1) {
		return !this.field1816.contains(var1);
	}

	void method1120() {
		this.field1806.clear();
		this.field1806.addAll(this.field1846);
		this.field1806.addAll(this.field1848);
	}

	public void method1121(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.field1821.method642()) {
			int var8 = (int)Math.ceil((double)((float)var3 / this.field1826));
			int var9 = (int)Math.ceil((double)((float)var4 / this.field1826));
			List var10 = this.field1820.method809(this.field1843 - var8 / 2 - 1, this.field1823 - var9 / 2 - 1, var8 / 2 + this.field1843 + 1, 1 + this.field1823 + var9 / 2, var1, var2, var3, var4, var5, var6);
			if (!var10.isEmpty()) {
				Iterator var11 = var10.iterator();

				boolean var14;
				do {
					if (!var11.hasNext()) {
						return;
					}

					class217 var12 = (class217)var11.next();
					class96 var13 = class158.method892(var12.method1244());
					var14 = false;

					for (int var15 = this.field1859.length - 1; var15 >= 0; --var15) {
						if (null != var13.field968[var15]) {
							class465.method2277(var13.field968[var15], var13.field960, this.field1859[var15], var12.method1244(), var12.field2026.method213(), var12.field2025.method213());
							var14 = true;
						}
					}
				} while(!var14);

			}
		}
	}

	public class29 method1122(int var1, class29 var2) {
		if (!this.field1821.method642()) {
			return null;
		} else if (!this.field1820.method811()) {
			return null;
		} else if (!this.field1836.method70(var2.field460, var2.field462)) {
			return null;
		} else {
			HashMap var4 = this.field1820.method812();
			List var5 = (List)var4.get(var1);
			if (null != var5 && !var5.isEmpty()) {
				class217 var6 = null;
				int var7 = -1;
				Iterator var8 = var5.iterator();

				while (true) {
					class217 var9;
					int var12;
					do {
						if (!var8.hasNext()) {
							return var6.field2025;
						}

						var9 = (class217)var8.next();
						int var10 = var9.field2025.field460 - var2.field460;
						int var11 = var9.field2025.field462 - var2.field462;
						var12 = var10 * var10 + var11 * var11;
						if (var12 == 0) {
							return var9.field2025;
						}
					} while(var12 >= var7 && null != var6);

					var6 = var9;
					var7 = var12;
				}
			} else {
				return null;
			}
		}
	}

	public void method1137(int var1, int var2, class29 var3, class29 var4) {
		class309 var6 = new class309();
		class113 var7 = new class113(var2, var3, var4);
		var6.method1743(new Object[]{var7});
		switch(var1) {
		case 1008:
			var6.method1741(10);
			break;
		case 1009:
			var6.method1741(11);
			break;
		case 1010:
			var6.method1741(12);
			break;
		case 1011:
			var6.method1741(13);
			break;
		case 1012:
			var6.method1741(14);
		}

		class186.method1031(var6);
	}

	public class217 method1081() {
		if (!this.field1821.method642()) {
			return null;
		} else if (!this.field1820.method811()) {
			return null;
		} else {
			HashMap var2 = this.field1820.method812();
			this.field1852 = new LinkedList();
			Iterator var3 = var2.values().iterator();

			while (var3.hasNext()) {
				List var4 = (List)var3.next();
				this.field1852.addAll(var4);
			}

			this.field1812 = this.field1852.iterator();
			return this.method1123();
		}
	}

	public class217 method1123() {
		if (null == this.field1812) {
			return null;
		} else {
			class217 var2;
			do {
				if (!this.field1812.hasNext()) {
					return null;
				}

				var2 = (class217)this.field1812.next();
			} while(var2.method1244() == -1);

			return var2;
		}
	}

	static final void method1139(class60 var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field693 == null) {
			if (var2 == null) {
				return;
			}

			var0.field693 = new byte[11][];
			var0.field789 = new byte[11][];
			var0.field719 = new int[11];
			var0.field720 = new int[11];
		}

		var0.field693[var1] = var2;
		if (null != var2) {
			var0.field716 = true;
		} else {
			var0.field716 = false;

			for (int var5 = 0; var5 < var0.field693.length; ++var5) {
				if (var0.field693[var5] != null) {
					var0.field716 = true;
					break;
				}
			}
		}

		var0.field789[var1] = var3;
	}

	static final void method1138(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.field7 && var0 != class358.field3038) {
				return;
			}

			long var9 = 0L;
			boolean var11 = true;
			boolean var12 = false;
			boolean var13 = false;
			if (var1 == 0) {
				var9 = class415.field3487.method1790(var0, var2, var3);
			}

			if (var1 == 1) {
				var9 = class415.field3487.method1795(var0, var2, var3);
			}

			if (var1 == 2) {
				var9 = class415.field3487.method1771(var0, var2, var3);
			}

			if (var1 == 3) {
				var9 = class415.field3487.method1804(var0, var2, var3);
			}

			int var14;
			if (var9 != 0L) {
				var14 = class415.field3487.method1772(var0, var2, var3, var9);
				int var38 = class67.method491(var9);
				int var39 = var14 & 31;
				int var40 = var14 >> 6 & 3;
				class235 var15;
				if (var1 == 0) {
					class415.field3487.method1797(var0, var2, var3);
					var15 = class96.method638(var38, (byte)10);
					if (var15.field2123 != 0) {
						Client.field78[var0].method529(var2, var3, var39, var40, var15.field2124);
					}
				}

				if (var1 == 1) {
					class415.field3487.method1765(var0, var2, var3);
				}

				if (var1 == 2) {
					class415.field3487.method1798(var0, var2, var3);
					var15 = class96.method638(var38, (byte)26);
					if (var2 + var15.field2121 > 103 || var3 + var15.field2121 > 103 || var15.field2106 + var2 > 103 || var3 + var15.field2106 > 103) {
						return;
					}

					if (var15.field2123 != 0) {
						Client.field78[var0].method533(var2, var3, var15.field2121, var15.field2106, var40, var15.field2124);
					}
				}

				if (var1 == 3) {
					class415.field3487.method1767(var0, var2, var3);
					var15 = class96.method638(var38, (byte)17);
					if (var15.field2123 == 1) {
						Client.field78[var0].method531(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var14 = var0;
				if (var0 < 3 && (class38.field513[1][var2][var3] & 2) == 2) {
					var14 = var0 + 1;
				}

				class317 var41 = class415.field3487;
				class76 var16 = Client.field78[var0];
				class235 var17 = class96.method638(var4, (byte)76);
				int var18 = var7 >= 0 ? var7 : var17.field2133;
				int var19;
				int var20;
				if (var5 != 1 && var5 != 3) {
					var19 = var17.field2121;
					var20 = var17.field2106;
				} else {
					var19 = var17.field2106;
					var20 = var17.field2121;
				}

				int var21;
				int var22;
				if (var19 + var2 <= 104) {
					var21 = (var19 >> 1) + var2;
					var22 = (var19 + 1 >> 1) + var2;
				} else {
					var21 = var2;
					var22 = var2 + 1;
				}

				int var23;
				int var24;
				if (var20 + var3 <= 104) {
					var23 = (var20 >> 1) + var3;
					var24 = var3 + (var20 + 1 >> 1);
				} else {
					var23 = var3;
					var24 = var3 + 1;
				}

				int[][] var25 = class38.field511[var14];
				int var26 = var25[var22][var23] + var25[var21][var23] + var25[var21][var24] + var25[var22][var24] >> 2;
				int var27 = (var19 << 6) + (var2 << 7);
				int var28 = (var3 << 7) + (var20 << 6);
				long var29 = class182.method1013(var2, var3, 2, var17.field2130 == 0, var4);
				int var31 = (var5 << 6) + var6;
				if (var17.field2146 == 1) {
					var31 += 256;
				}

				Object var32;
				if (var6 == 22) {
					if (var18 == -1 && var17.field2147 == null) {
						var32 = var17.method1349(22, var5, var25, var27, var26, var28);
					} else {
						var32 = new class165(var4, 22, var5, var14, var2, var3, var18, var17.field2138, (class480)null);
					}

					var41.method1759(var0, var2, var3, var26, (class480)var32, var29, var31);
					if (var17.field2123 == 1) {
						var16.method528(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (var18 == -1 && null == var17.field2147) {
							var32 = var17.method1349(var6, var5, var25, var27, var26, var28);
						} else {
							var32 = new class165(var4, var6, var5, var14, var2, var3, var18, var17.field2138, (class480)null);
						}

						var41.method1761(var0, var2, var3, var26, 1, 1, (class480)var32, 0, var29, var31);
						if (var17.field2123 != 0) {
							var16.method526(var2, var3, var19, var20, var17.field2124);
						}
					} else if (var6 == 0) {
						if (var18 == -1 && null == var17.field2147) {
							var32 = var17.method1349(0, var5, var25, var27, var26, var28);
						} else {
							var32 = new class165(var4, 0, var5, var14, var2, var3, var18, var17.field2138, (class480)null);
						}

						var41.method1781(var0, var2, var3, var26, (class480)var32, (class480)null, class38.field506[var5], 0, var29, var31);
						if (var17.field2123 != 0) {
							var16.method525(var2, var3, var6, var5, var17.field2124);
						}
					} else if (var6 == 1) {
						if (var18 == -1 && var17.field2147 == null) {
							var32 = var17.method1349(1, var5, var25, var27, var26, var28);
						} else {
							var32 = new class165(var4, 1, var5, var14, var2, var3, var18, var17.field2138, (class480)null);
						}

						var41.method1781(var0, var2, var3, var26, (class480)var32, (class480)null, class38.field507[var5], 0, var29, var31);
						if (var17.field2123 != 0) {
							var16.method525(var2, var3, var6, var5, var17.field2124);
						}
					} else {
						int var44;
						if (var6 == 2) {
							var44 = var5 + 1 & 3;
							Object var33;
							Object var34;
							if (var18 == -1 && var17.field2147 == null) {
								var33 = var17.method1349(2, var5 + 4, var25, var27, var26, var28);
								var34 = var17.method1349(2, var44, var25, var27, var26, var28);
							} else {
								var33 = new class165(var4, 2, var5 + 4, var14, var2, var3, var18, var17.field2138, (class480)null);
								var34 = new class165(var4, 2, var44, var14, var2, var3, var18, var17.field2138, (class480)null);
							}

							var41.method1781(var0, var2, var3, var26, (class480)var33, (class480)var34, class38.field506[var5], class38.field506[var44], var29, var31);
							if (var17.field2123 != 0) {
								var16.method525(var2, var3, var6, var5, var17.field2124);
							}
						} else if (var6 == 3) {
							if (var18 == -1 && null == var17.field2147) {
								var32 = var17.method1349(3, var5, var25, var27, var26, var28);
							} else {
								var32 = new class165(var4, 3, var5, var14, var2, var3, var18, var17.field2138, (class480)null);
							}

							var41.method1781(var0, var2, var3, var26, (class480)var32, (class480)null, class38.field507[var5], 0, var29, var31);
							if (var17.field2123 != 0) {
								var16.method525(var2, var3, var6, var5, var17.field2124);
							}
						} else if (var6 == 9) {
							if (var18 == -1 && var17.field2147 == null) {
								var32 = var17.method1349(var6, var5, var25, var27, var26, var28);
							} else {
								var32 = new class165(var4, var6, var5, var14, var2, var3, var18, var17.field2138, (class480)null);
							}

							var41.method1761(var0, var2, var3, var26, 1, 1, (class480)var32, 0, var29, var31);
							if (var17.field2123 != 0) {
								var16.method526(var2, var3, var19, var20, var17.field2124);
							}
						} else if (var6 == 4) {
							if (var18 == -1 && null == var17.field2147) {
								var32 = var17.method1349(4, var5, var25, var27, var26, var28);
							} else {
								var32 = new class165(var4, 4, var5, var14, var2, var3, var18, var17.field2138, (class480)null);
							}

							var41.method1796(var0, var2, var3, var26, (class480)var32, (class480)null, class38.field506[var5], 0, 0, 0, var29, var31);
						} else {
							Object var35;
							long var42;
							if (var6 == 5) {
								var44 = 16;
								var42 = var41.method1790(var0, var2, var3);
								if (var42 != 0L) {
									var44 = class96.method638(class67.method491(var42), (byte)-62).field2127;
								}

								if (var18 == -1 && null == var17.field2147) {
									var35 = var17.method1349(4, var5, var25, var27, var26, var28);
								} else {
									var35 = new class165(var4, 4, var5, var14, var2, var3, var18, var17.field2138, (class480)null);
								}

								var41.method1796(var0, var2, var3, var26, (class480)var35, (class480)null, class38.field506[var5], 0, class38.field508[var5] * var44, var44 * class38.field509[var5], var29, var31);
							} else if (var6 == 6) {
								var44 = 8;
								var42 = var41.method1790(var0, var2, var3);
								if (var42 != 0L) {
									var44 = class96.method638(class67.method491(var42), (byte)-48).field2127 / 2;
								}

								if (var18 == -1 && var17.field2147 == null) {
									var35 = var17.method1349(4, var5 + 4, var25, var27, var26, var28);
								} else {
									var35 = new class165(var4, 4, var5 + 4, var14, var2, var3, var18, var17.field2138, (class480)null);
								}

								var41.method1796(var0, var2, var3, var26, (class480)var35, (class480)null, 256, var5, var44 * class38.field514[var5], class38.field512[var5] * var44, var29, var31);
							} else if (var6 == 7) {
								int var43 = var5 + 2 & 3;
								if (var18 == -1 && var17.field2147 == null) {
									var32 = var17.method1349(4, var43 + 4, var25, var27, var26, var28);
								} else {
									var32 = new class165(var4, 4, var43 + 4, var14, var2, var3, var18, var17.field2138, (class480)null);
								}

								var41.method1796(var0, var2, var3, var26, (class480)var32, (class480)null, 256, var43, 0, 0, var29, var31);
							} else if (var6 == 8) {
								var44 = 8;
								var42 = var41.method1790(var0, var2, var3);
								if (0L != var42) {
									var44 = class96.method638(class67.method491(var42), (byte)-82).field2127 / 2;
								}

								int var37 = var5 + 2 & 3;
								Object var36;
								if (var18 == -1 && var17.field2147 == null) {
									var35 = var17.method1349(4, var5 + 4, var25, var27, var26, var28);
									var36 = var17.method1349(4, var37 + 4, var25, var27, var26, var28);
								} else {
									var35 = new class165(var4, 4, var5 + 4, var14, var2, var3, var18, var17.field2138, (class480)null);
									var36 = new class165(var4, 4, var37 + 4, var14, var2, var3, var18, var17.field2138, (class480)null);
								}

								var41.method1796(var0, var2, var3, var26, (class480)var35, (class480)var36, 256, var5, var44 * class38.field514[var5], var44 * class38.field512[var5], var29, var31);
							}
						}
					}
				} else {
					if (var18 == -1 && null == var17.field2147) {
						var32 = var17.method1349(10, var5, var25, var27, var26, var28);
					} else {
						var32 = new class165(var4, 10, var5, var14, var2, var3, var18, var17.field2138, (class480)null);
					}

					if (var32 != null) {
						var41.method1761(var0, var2, var3, var26, var19, var20, (class480)var32, var6 == 11 ? 256 : 0, var29, var31);
					}

					if (var17.field2123 != 0) {
						var16.method526(var2, var3, var19, var20, var17.field2124);
					}
				}
			}
		}

	}
}
