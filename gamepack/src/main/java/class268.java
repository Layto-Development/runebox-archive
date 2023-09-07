import java.util.ArrayList;

public class class268 {

	boolean field2207;

	class500 field2206;

	int field2201;

	int field2202;

	int field2203;

	int field2204;

	int field2205;

	int field2208;

	int field2209;

	ArrayList field2200;

	public class268() {
		this.field2203 = Integer.MAX_VALUE;
		this.field2202 = Integer.MAX_VALUE;
		this.field2201 = 0;
		this.field2204 = 0;
		this.field2205 = 0;
		this.field2207 = true;
		this.field2200 = new ArrayList();
		this.field2208 = 0;
		this.field2209 = 0;
	}

	public class201 method1489(int var1) {
		return (class201) this.field2200.get(var1);
	}

	class201 method1471() {
		return this.field2200.size() == 0 ? null : (class201) this.field2200.get(this.field2200.size() - 1);
	}

	public boolean method1508() {
		return this.field2200.size() == 0;
	}

	boolean method1510() {
		return this.field2202 > 1;
	}

	public int method1474() {
		return this.field2200.size();
	}

	public String method1475() {
		if (this.method1508()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.method1474());
			for (int var3 = 0; var3 < this.method1474(); ++var3) {
				class201 var4 = this.method1489(var3);
				var2.append(var4.field1887);
			}
			return var2.toString();
		}
	}

	public void method1502(int var1) {
		if (this.field2206 != null && var1 < 2 * this.field2206.field4005) {
			var1 = Integer.MAX_VALUE;
		}
		if (this.field2203 != var1) {
			this.field2203 = var1;
			this.method1509();
		}
	}

	public void method1473(int var1) {
		if (var1 != this.field2202) {
			this.field2202 = var1;
			this.method1509();
		}
	}

	public void method1476(int var1) {
		if (var1 != this.field2209) {
			this.field2209 = var1;
			this.method1509();
		}
	}

	public void method1477(class500 var1) {
		if (var1 != this.field2206) {
			this.field2206 = var1;
			if (null != this.field2206) {
				if (this.field2205 == 0) {
					this.field2205 = this.field2206.field4005;
				}
				if (!this.method1508()) {
					this.method1509();
				}
			}
		}
	}

	public void method1506(int var1) {
		if (this.field2208 != var1) {
			this.field2208 = var1;
			this.method1509();
		}
	}

	public boolean method1478(int var1, int var2) {
		if (var1 != this.field2201 || this.field2204 != var2) {
			this.field2201 = var1;
			this.field2204 = var2;
			this.method1509();
		}
		return true;
	}

	public void method1479(int var1) {
		if (var1 != this.field2205) {
			this.field2205 = var1;
			this.method1509();
		}
	}

	public class200 method1480(int var1, int var2) {
		if (var2 == var1) {
			return new class200(this, 0, 0);
		} else if (var1 <= this.field2200.size() && var2 <= this.field2200.size()) {
			return var2 < var1 ? new class200(this, var2, var1) : new class200(this, var1, var2);
		} else {
			return new class200(this, 0, 0);
		}
	}

	public class257 method1505(char var1, int var2, int var3) {
		return this.method1481(Character.toString(var1), var2, var3);
	}

	public class257 method1481(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}
		int var5 = var2;
		if (this.field2200.size() >= var3) {
			this.method1472(var2, var2);
			return new class257(var2, true);
		} else {
			this.field2200.ensureCapacity(this.field2200.size() + var1.length());
			for (int var6 = 0; var6 < var1.length() && this.field2200.size() < var3; ++var6) {
				class201 var7 = new class201();
				var7.field1887 = var1.charAt(var6);
				this.field2200.add(var5, var7);
				++var5;
			}
			this.method1472(var2, var5);
			if (this.field2202 != 0 && this.method1504() > this.field2202) {
				while (var5 != var2) {
					--var5;
					this.method1483(var5);
					if (this.method1504() <= this.field2202) {
						break;
					}
				}
				return new class257(var5, true);
			} else {
				return new class257(var5, false);
			}
		}
	}

	class257 method1503(String var1, int var2) {
		return this.method1481(var1, this.field2200.size(), 0);
	}

	public class257 method1507(String var1) {
		this.method1482();
		return this.method1503(var1, 0);
	}

	void method1482() {
		this.field2200.clear();
	}

	public int method1483(int var1) {
		return this.method1484(var1, var1 + 1);
	}

	public int method1484(int var1, int var2) {
		int var4;
		if (var2 < var1) {
			var4 = var2;
			var2 = var1;
			var1 = var4;
		}
		this.field2200.subList(var1, var2).clear();
		var4 = var1;
		if (this.method1510() && this.field2208 == 1) {
			while (var4 > 0) {
				--var4;
				char var5 = ((class201) this.field2200.get(var4)).field1887;
				if (var5 == ' ' || var5 == '\t') {
					break;
				}
			}
		}
		this.method1472(var4, var2);
		return var1;
	}

	public int method1501(int var1, int var2) {
		if (null == this.field2206) {
			return 0;
		} else if (this.method1510() && var1 > this.field2203) {
			return this.field2200.size();
		} else {
			if (!this.field2200.isEmpty()) {
				for (int var4 = 0; var4 < this.field2200.size(); ++var4) {
					class201 var5 = (class201) this.field2200.get(var4);
					if (var2 <= var5.field1889 + this.method1488()) {
						if (var2 < var5.field1889) {
							break;
						}
						if (var1 < var5.field1886) {
							return var4 > 0 ? var4 - 1 : 0;
						}
						if (var4 + 1 != this.field2200.size() && ((class201) this.field2200.get(var4 + 1)).field1889 != var5.field1889) {
							int var6 = this.method1498((class201) this.field2200.get(var4), false);
							if (var1 < var6 + var5.field1886) {
								return var4;
							}
							if (var2 <= var5.field1889 + this.method1488()) {
								return var4 + 1;
							}
						}
					}
				}
				class201 var7 = (class201) this.field2200.get(this.field2200.size() - 1);
				if (var1 >= var7.field1886 && var1 <= var7.field1886 + this.method1490() && var2 >= var7.field1889 && var2 <= var7.field1889 + this.method1488()) {
					return this.field2200.size() - 1;
				}
			}
			return this.field2200.size();
		}
	}

	public int method1485(int var1, int var2) {
		if (this.field2206 != null && !this.method1508() && var1 <= this.field2200.size()) {
			byte var4;
			if (var2 > 0) {
				var4 = 1;
			} else {
				var4 = -1;
				var2 = -var2;
			}
			int var5 = 0;
			int var6 = 0;
			if (var1 > 0) {
				class201 var7 = (class201) this.field2200.get(var1 - 1);
				var5 = var7.field1886 + this.method1495(var1 - 1);
				var6 = var7.field1889;
			} else if (var4 == -1 && var1 == 0) {
				return 0;
			}
			int var15 = 16777215;
			int var8 = 0;
			int var9 = var1;
			int var10 = 16777215;
			int var11 = var4 == 1 ? this.field2200.size() + 1 : 0;
			for (int var12 = var4 + var1; var11 != var12; var12 += var4) {
				class201 var13 = (class201) this.field2200.get(var12 - 1);
				if (var6 != var13.field1889) {
					++var8;
					var6 = var13.field1889;
					if (var8 > var2) {
						return var9;
					}
				}
				if (var2 == var8) {
					int var14 = Math.abs(var13.field1886 + this.method1495(var12 - 1) - var5);
					if (var14 >= var10) {
						return var9;
					}
					var9 = var12;
					var10 = var14;
				}
			}
			if (var4 == 1) {
				return this.field2200.size();
			} else {
				if (var6 != 0) {
					++var8;
				}
				return var10 != 16777215 && (var2 != var8 || var5 >= var10) ? var9 : 0;
			}
		} else {
			return 0;
		}
	}

	public int method1486() {
		if (!this.field2200.isEmpty() && this.method1504() == 1) {
			return this.field2200.isEmpty() ? 0 : ((class201) this.field2200.get(this.field2200.size() - 1)).field1886 + this.method1490();
		} else {
			int var2 = -1;
			int var3 = 0;
			for (int var4 = this.field2200.size() - 1; var4 >= 0; --var4) {
				class201 var5 = (class201) this.field2200.get(var4);
				if (var2 != var5.field1889) {
					int var6 = this.method1498(var5, false) + var5.field1886;
					var3 = Math.max(var6, var3);
					var2 = var5.field1889;
				}
			}
			return var3;
		}
	}

	public int method1487() {
		return this.method1508() ? 0 : this.field2206.field4005 + ((class201) this.field2200.get(this.field2200.size() - 1)).field1889;
	}

	public int method1488() {
		return this.field2205;
	}

	public int method1504() {
		return this.method1487() / this.field2206.field4005;
	}

	int method1490() {
		return this.method1508() ? 0 : this.method1498((class201) this.field2200.get(this.field2200.size() - 1), false);
	}

	public int method1511() {
		return this.field2203;
	}

	public int method1491() {
		return this.field2202;
	}

	public int method1499() {
		return this.field2208;
	}

	public int method1492() {
		return this.field2209;
	}

	public int method1493(int var1) {
		switch(this.field2201) {
			case 0:
				return 0;
			case 1:
				return var1 / 2;
			case 2:
				return var1;
			default:
				return 0;
		}
	}

	public int method1494(int var1) {
		switch(this.field2204) {
			case 0:
				return 0;
			case 1:
				return var1 / 2;
			case 2:
				return var1;
			default:
				return 0;
		}
	}

	void method1509() {
		this.method1472(0, this.field2200.size());
	}

	void method1472(int var1, int var2) {
		if (!this.method1508() && null != this.field2206) {
			class59 var4 = this.method1496(var1, var2);
			boolean var5 = (Integer) var4.field642 == 0 && (Integer) var4.field641 == this.field2200.size();
			int var6 = (Integer) var4.field642;
			int var7 = 0;
			int var8 = var5 ? 0 : ((class201) this.field2200.get((Integer) var4.field642)).field1889;
			int var9 = 0;
			int var10;
			for (var10 = (Integer) var4.field642; var10 <= (Integer) var4.field641; ++var10) {
				boolean var11 = var10 >= this.field2200.size();
				class201 var12 = (class201) this.field2200.get(!var11 ? var10 : this.field2200.size() - 1);
				int var13 = !var11 ? this.method1498(var12, false) : 0;
				boolean var14 = !var11 && var12.field1887 == '\n';
				boolean var15 = !var11 && this.method1510() && var13 + var7 > this.field2203;
				if (var14 || var15 || var11) {
					int var16 = var10;
					int var17 = 0;
					int var18;
					int var19;
					class201 var20;
					if (var15) {
						var18 = 0;
						if (this.field2208 == 1) {
							for (var19 = var10; var19 > var6; --var19) {
								var20 = (class201) this.field2200.get(var19);
								var18 += var19 < var16 ? this.method1498(var20, false) : 0;
								if (var20.field1887 == ' ' || var20.field1887 == '\n') {
									var16 = var19;
									var7 -= var18;
									var17 = var18;
									break;
								}
							}
						}
					}
					var18 = -this.method1493(var7);
					for (var19 = var6; var19 < var16; ++var19) {
						var20 = (class201) this.field2200.get(var19);
						int var21 = this.method1498(var20, false);
						var20.field1886 = var18;
						var20.field1889 = var8;
						var18 += var21;
					}
					var6 = var16;
					var7 = var17;
					var8 += this.method1488();
					++var9;
				}
				var7 += !var11 ? var13 : 0;
			}
			if (this.field2204 != 0 && var5) {
				var10 = var9 * this.method1488();
				int var22 = this.method1494(var10);
				for (int var23 = 0; var23 < this.field2200.size(); ++var23) {
					class201 var24 = (class201) this.field2200.get(var23);
					var24.field1889 -= var22;
				}
			}
		}
	}

	int method1495(int var1) {
		return var1 < this.field2200.size() ? this.method1498((class201) this.field2200.get(var1), false) : 0;
	}

	int method1498(class201 var1, boolean var2) {
		if (var1.field1887 == '\n') {
			return 0;
		} else if (this.field2209 == 0) {
			int var4 = this.field2206.field4008[var1.field1887];
			if (var4 == 0) {
				return var1.field1887 == '\t' ? this.field2206.field4008[32] * 3 : this.field2206.field4008[32];
			} else {
				return var4;
			}
		} else {
			return this.field2206.field4008[42];
		}
	}

	class59 method1496(int var1, int var2) {
		int var4 = Math.min(var1, var2);
		int var5 = Math.max(var1, var2);
		int var6 = this.field2200.size();
		if (var4 == 0 && var5 == var6) {
			return new class59(0, var6);
		} else {
			int var7 = this.method1497(var4, false);
			int var8 = this.method1500(var5, false);
			int var9;
			switch(this.field2204) {
				case 0:
					if (this.field2201 == 0) {
						return new class59(var7, var6);
					}
					var9 = this.method1497(var4, true);
					return new class59(var9, var6);
				case 1:
					return new class59(0, var6);
				case 2:
					if (this.field2201 == 2) {
						return new class59(0, var8);
					}
					var9 = this.method1500(var5, true);
					return new class59(0, var9);
				default:
					return new class59(0, var6);
			}
		}
	}

	int method1497(int var1, boolean var2) {
		if (var1 < this.field2200.size()) {
			int var4 = ((class201) this.field2200.get(var1)).field1889;
			for (int var5 = var1; var5 > 0; --var5) {
				if (((class201) this.field2200.get(var5 - 1)).field1889 < var4) {
					if (!var2) {
						return var5;
					}
					var2 = false;
					var4 = ((class201) this.field2200.get(var5 - 1)).field1889;
				}
			}
		}
		return 0;
	}

	int method1500(int var1, boolean var2) {
		if (var1 < this.field2200.size()) {
			int var4 = ((class201) this.field2200.get(var1)).field1889;
			for (int var5 = var1; var5 < this.field2200.size() - 1; ++var5) {
				if (((class201) this.field2200.get(var5 + 1)).field1889 > var4) {
					if (!var2) {
						return var5;
					}
					var2 = false;
					var4 = ((class201) this.field2200.get(var5 + 1)).field1889;
				}
			}
		}
		return this.field2200.size();
	}
}
