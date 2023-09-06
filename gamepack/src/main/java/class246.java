import java.util.ArrayList;

public class class246 {
	boolean field2232;
	class228 field2231;
	int field2226;
	int field2227;
	int field2228;
	int field2229;
	int field2230;
	int field2233;
	int field2234;
	ArrayList field2225;

	public class246() {
		this.field2228 = Integer.MAX_VALUE;
		this.field2227 = Integer.MAX_VALUE;
		this.field2226 = 0;
		this.field2229 = 0;
		this.field2230 = 0;
		this.field2232 = true;
		this.field2225 = new ArrayList();
		this.field2233 = 0;
		this.field2234 = 0;
	}

	public class472 method1415(int var1) {
		return (class472)this.field2225.get(var1);
	}

	class472 method1397() {
		return this.field2225.size() == 0 ? null : (class472)this.field2225.get(this.field2225.size() - 1);
	}

	public boolean method1434() {
		return this.field2225.size() == 0;
	}

	boolean method1437() {
		return this.field2227 > 1;
	}

	public int method1400() {
		return this.field2225.size();
	}

	public String method1401() {
		if (this.method1434()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.method1400());

			for (int var3 = 0; var3 < this.method1400(); ++var3) {
				class472 var4 = this.method1415(var3);
				var2.append(var4.field4025);
			}

			return var2.toString();
		}
	}

	public void method1428(int var1) {
		if (this.field2231 != null && var1 < 2 * this.field2231.field2066) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field2228 != var1) {
			this.field2228 = var1;
			this.method1436();
		}

	}

	public void method1399(int var1) {
		if (var1 != this.field2227) {
			this.field2227 = var1;
			this.method1436();
		}

	}

	public void method1402(int var1) {
		if (var1 != this.field2234) {
			this.field2234 = var1;
			this.method1436();
		}

	}

	public void method1403(class228 var1) {
		if (var1 != this.field2231) {
			this.field2231 = var1;
			if (null != this.field2231) {
				if (this.field2230 == 0) {
					this.field2230 = this.field2231.field2066;
				}

				if (!this.method1434()) {
					this.method1436();
				}
			}
		}

	}

	public void method1432(int var1) {
		if (this.field2233 != var1) {
			this.field2233 = var1;
			this.method1436();
		}

	}

	public boolean method1404(int var1, int var2) {
		if (var1 != this.field2226 || this.field2229 != var2) {
			this.field2226 = var1;
			this.field2229 = var2;
			this.method1436();
		}

		return true;
	}

	public void method1405(int var1) {
		if (var1 != this.field2230) {
			this.field2230 = var1;
			this.method1436();
		}

	}

	public class506 method1406(int var1, int var2) {
		if (var2 == var1) {
			return new class506(this, 0, 0);
		} else if (var1 <= this.field2225.size() && var2 <= this.field2225.size()) {
			return var2 < var1 ? new class506(this, var2, var1) : new class506(this, var1, var2);
		} else {
			return new class506(this, 0, 0);
		}
	}

	public class470 method1431(char var1, int var2, int var3) {
		return this.method1407(Character.toString(var1), var2, var3);
	}

	public class470 method1407(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var5 = var2;
		if (this.field2225.size() >= var3) {
			this.method1398(var2, var2);
			return new class470(var2, true);
		} else {
			this.field2225.ensureCapacity(this.field2225.size() + var1.length());

			for (int var6 = 0; var6 < var1.length() && this.field2225.size() < var3; ++var6) {
				class472 var7 = new class472();
				var7.field4025 = var1.charAt(var6);
				this.field2225.add(var5, var7);
				++var5;
			}

			this.method1398(var2, var5);
			if (this.field2227 != 0 && this.method1430() > this.field2227) {
				while (var5 != var2) {
					--var5;
					this.method1409(var5);
					if (this.method1430() <= this.field2227) {
						break;
					}
				}

				return new class470(var5, true);
			} else {
				return new class470(var5, false);
			}
		}
	}

	class470 method1429(String var1, int var2) {
		return this.method1407(var1, this.field2225.size(), var2);
	}

	public class470 method1433(String var1) {
		this.method1408();
		return this.method1429(var1, 0);
	}

	void method1408() {
		this.field2225.clear();
	}

	public int method1409(int var1) {
		return this.method1410(var1, var1 + 1);
	}

	public int method1410(int var1, int var2) {
		int var4;
		if (var2 < var1) {
			var4 = var2;
			var2 = var1;
			var1 = var4;
		}

		this.field2225.subList(var1, var2).clear();
		var4 = var1;
		if (this.method1437() && this.field2233 == 1) {
			while (var4 > 0) {
				--var4;
				char var5 = ((class472)this.field2225.get(var4)).field4025;
				if (var5 == ' ' || var5 == '\t') {
					break;
				}
			}
		}

		this.method1398(var4, var2);
		return var1;
	}

	public int method1427(int var1, int var2) {
		if (null == this.field2231) {
			return 0;
		} else if (this.method1437() && var1 > this.field2228) {
			return this.field2225.size();
		} else {
			if (!this.field2225.isEmpty()) {
				for (int var4 = 0; var4 < this.field2225.size(); ++var4) {
					class472 var5 = (class472)this.field2225.get(var4);
					if (var2 <= var5.field4027 + this.method1414()) {
						if (var2 < var5.field4027) {
							break;
						}

						if (var1 < var5.field4024) {
							return var4 > 0 ? var4 - 1 : 0;
						}

						if (var4 + 1 != this.field2225.size() && ((class472)this.field2225.get(var4 + 1)).field4027 != var5.field4027) {
							int var6 = this.method1424((class472)this.field2225.get(var4), false);
							if (var1 < var6 + var5.field4024) {
								return var4;
							}

							if (var2 <= var5.field4027 + this.method1414()) {
								return var4 + 1;
							}
						}
					}
				}

				class472 var7 = (class472)this.field2225.get(this.field2225.size() - 1);
				if (var1 >= var7.field4024 && var1 <= var7.field4024 + this.method1416() && var2 >= var7.field4027 && var2 <= var7.field4027 + this.method1414()) {
					return this.field2225.size() - 1;
				}
			}

			return this.field2225.size();
		}
	}

	public int method1411(int var1, int var2) {
		if (this.field2231 != null && !this.method1434() && var1 <= this.field2225.size()) {
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
				class472 var7 = (class472)this.field2225.get(var1 - 1);
				var5 = var7.field4024 + this.method1421(var1 - 1);
				var6 = var7.field4027;
			} else if (var4 == -1 && var1 == 0) {
				return 0;
			}

			int var15 = 16777215;
			int var8 = 0;
			int var9 = var1;
			int var10 = 16777215;
			int var11 = var4 == 1 ? this.field2225.size() + 1 : 0;

			for (int var12 = var4 + var1; var11 != var12; var12 += var4) {
				class472 var13 = (class472)this.field2225.get(var12 - 1);
				if (var6 != var13.field4027) {
					++var8;
					var6 = var13.field4027;
					if (var8 > var2) {
						return var9;
					}
				}

				if (var2 == var8) {
					int var14 = Math.abs(var13.field4024 + this.method1421(var12 - 1) - var5);
					if (var14 >= var10) {
						return var9;
					}

					var9 = var12;
					var10 = var14;
				}
			}

			if (var4 == 1) {
				return this.field2225.size();
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

	public int method1412() {
		if (!this.field2225.isEmpty() && this.method1430() == 1) {
			return this.field2225.isEmpty() ? 0 : ((class472)this.field2225.get(this.field2225.size() - 1)).field4024 + this.method1416();
		} else {
			int var2 = -1;
			int var3 = 0;

			for (int var4 = this.field2225.size() - 1; var4 >= 0; --var4) {
				class472 var5 = (class472)this.field2225.get(var4);
				if (var2 != var5.field4027) {
					int var6 = this.method1424(var5, false) + var5.field4024;
					var3 = Math.max(var6, var3);
					var2 = var5.field4027;
				}
			}

			return var3;
		}
	}

	public int method1413() {
		return this.method1434() ? 0 : this.field2231.field2066 + ((class472)this.field2225.get(this.field2225.size() - 1)).field4027;
	}

	public int method1414() {
		return this.field2230;
	}

	public int method1430() {
		return this.method1413() / this.field2231.field2066;
	}

	int method1416() {
		return this.method1434() ? 0 : this.method1424((class472)this.field2225.get(this.field2225.size() - 1), false);
	}

	public int method1438() {
		return this.field2228;
	}

	public int method1417() {
		return this.field2227;
	}

	public int method1425() {
		return this.field2233;
	}

	public int method1418() {
		return this.field2234;
	}

	public int method1419(int var1) {
		switch(this.field2226) {
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

	public int method1420(int var1) {
		switch(this.field2229) {
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

	void method1436() {
		this.method1398(0, this.field2225.size());
	}

	void method1398(int var1, int var2) {
		if (!this.method1434() && null != this.field2231) {
			class180 var4 = this.method1422(var1, var2);
			boolean var5 = (Integer)var4.field1712 == 0 && (Integer)var4.field1711 == this.field2225.size();
			int var6 = (Integer)var4.field1712;
			int var7 = 0;
			int var8 = var5 ? 0 : ((class472)this.field2225.get((Integer)var4.field1712)).field4027;
			int var9 = 0;

			int var10;
			for (var10 = (Integer)var4.field1712; var10 <= (Integer)var4.field1711; ++var10) {
				boolean var11 = var10 >= this.field2225.size();
				class472 var12 = (class472)this.field2225.get(!var11 ? var10 : this.field2225.size() - 1);
				int var13 = !var11 ? this.method1424(var12, false) : 0;
				boolean var14 = !var11 && var12.field4025 == '\n';
				boolean var15 = !var11 && this.method1437() && var13 + var7 > this.field2228;
				if (var14 || var15 || var11) {
					int var16 = var10;
					int var17 = 0;
					int var18;
					int var19;
					class472 var20;
					if (var15) {
						var18 = 0;
						if (this.field2233 == 1) {
							for (var19 = var10; var19 > var6; --var19) {
								var20 = (class472)this.field2225.get(var19);
								var18 += var19 < var16 ? this.method1424(var20, false) : 0;
								if (var20.field4025 == ' ' || var20.field4025 == '\n') {
									var16 = var19;
									var7 -= var18;
									var17 = var18;
									break;
								}
							}
						}
					}

					var18 = -this.method1419(var7);

					for (var19 = var6; var19 < var16; ++var19) {
						var20 = (class472)this.field2225.get(var19);
						int var21 = this.method1424(var20, false);
						var20.field4024 = var18;
						var20.field4027 = var8;
						var18 += var21;
					}

					var6 = var16;
					var7 = var17;
					var8 += this.method1414();
					++var9;
				}

				var7 += !var11 ? var13 : 0;
			}

			if (this.field2229 != 0 && var5) {
				var10 = var9 * this.method1414();
				int var22 = this.method1420(var10);

				for (int var23 = 0; var23 < this.field2225.size(); ++var23) {
					class472 var24 = (class472)this.field2225.get(var23);
					var24.field4027 -= var22;
				}
			}

		}
	}

	int method1421(int var1) {
		return var1 < this.field2225.size() ? this.method1424((class472)this.field2225.get(var1), false) : 0;
	}

	int method1424(class472 var1, boolean var2) {
		if (var1.field4025 == '\n') {
			return 0;
		} else if (!var2 && this.field2234 != 0) {
			return this.field2231.field2069[42];
		} else {
			int var4 = this.field2231.field2069[var1.field4025];
			if (var4 == 0) {
				return var1.field4025 == '\t' ? this.field2231.field2069[32] * 3 : this.field2231.field2069[32];
			} else {
				return var4;
			}
		}
	}

	class180 method1422(int var1, int var2) {
		int var4 = Math.min(var1, var2);
		int var5 = Math.max(var1, var2);
		int var6 = this.field2225.size();
		if (var4 == 0 && var5 == var6) {
			return new class180(0, var6);
		} else {
			int var7 = this.method1423(var4, false);
			int var8 = this.method1426(var5, false);
			int var9;
			switch(this.field2229) {
			case 0:
				if (this.field2226 == 0) {
					return new class180(var7, var6);
				}

				var9 = this.method1423(var4, true);
				return new class180(var9, var6);
			case 1:
				return new class180(0, var6);
			case 2:
				if (this.field2226 == 2) {
					return new class180(0, var8);
				}

				var9 = this.method1426(var5, true);
				return new class180(0, var9);
			default:
				return new class180(0, var6);
			}
		}
	}

	int method1423(int var1, boolean var2) {
		if (var1 < this.field2225.size()) {
			int var4 = ((class472)this.field2225.get(var1)).field4027;

			for (int var5 = var1; var5 > 0; --var5) {
				if (((class472)this.field2225.get(var5 - 1)).field4027 < var4) {
					if (!var2) {
						return var5;
					}

					var2 = false;
					var4 = ((class472)this.field2225.get(var5 - 1)).field4027;
				}
			}
		}

		return 0;
	}

	int method1426(int var1, boolean var2) {
		if (var1 < this.field2225.size()) {
			int var4 = ((class472)this.field2225.get(var1)).field4027;

			for (int var5 = var1; var5 < this.field2225.size() - 1; ++var5) {
				if (((class472)this.field2225.get(var5 + 1)).field4027 > var4) {
					if (!var2) {
						return var5;
					}

					var2 = false;
					var4 = ((class472)this.field2225.get(var5 + 1)).field4027;
				}
			}
		}

		return this.field2225.size();
	}

	public static void method1435() {
		class151.field1432.method1887();
		class151.field1414.method1887();
		class151.field1424.method1887();
	}
}
