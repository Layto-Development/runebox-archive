public class class151 extends class218 {
	public static class215 field1411;
	public static class215 field1413;
	public static class215 field1428;
	static class344 field1414;
	static class344 field1424;
	static class344 field1432;
	int field1416;
	int field1419;
	int field1420;
	int field1421;
	int field1422;
	int field1430;
	int field1431;
	String field1426;
	public int field1412;
	public int field1415;
	public int field1417;
	public int field1418;
	public int field1423;
	public int field1425;
	public int field1427;
	public int[] field1429;

	static {
		field1432 = new class344(64);
		field1414 = new class344(64);
		field1424 = new class344(20);
	}

	class151() {
		this.field1416 = -1;
		this.field1415 = 16777215;
		this.field1425 = 70;
		this.field1419 = -1;
		this.field1420 = -1;
		this.field1421 = -1;
		this.field1422 = -1;
		this.field1423 = 0;
		this.field1417 = 0;
		this.field1412 = -1;
		this.field1426 = "";
		this.field1418 = -1;
		this.field1427 = 0;
		this.field1430 = -1;
		this.field1431 = -1;
	}

	void method864(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			this.method871(var1, var3, (byte)-17);
		}
	}

	void method871(class42 var1, int var2, byte var3) {
		if (var2 == 1) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field1416 = var1.method326();
		} else if (var2 == 2) {
			this.field1415 = var1.method334();
		} else if (var2 == 3) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field1419 = var1.method326();
		} else if (var2 == 4) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field1421 = var1.method326();
		} else if (var2 == 5) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field1420 = var1.method326();
		} else if (var2 == 6) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field1422 = var1.method326();
		} else if (var2 == 7) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field1423 = var1.method280();
		} else if (var2 == 8) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field1426 = var1.method328();
		} else if (var2 == 9) {
			if (var3 >= -1) {
				return;
			}

			this.field1425 = var1.method327();
		} else if (var2 == 10) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field1417 = var1.method280();
		} else if (var2 == 11) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field1412 = 0;
		} else if (var2 == 12) {
			if (var3 >= -1) {
				throw new IllegalStateException();
			}

			this.field1418 = var1.method278();
		} else if (var2 == 13) {
			if (var3 >= -1) {
				return;
			}

			this.field1427 = var1.method280();
		} else if (var2 == 14) {
			this.field1412 = var1.method327();
		} else {
			if (var2 != 17) {
				if (var3 >= -1) {
					return;
				}

				if (var2 != 18) {
					return;
				}
			}

			this.field1430 = var1.method327();
			if (this.field1430 == 65535) {
				if (var3 >= -1) {
					throw new IllegalStateException();
				}

				this.field1430 = -1;
			}

			this.field1431 = var1.method327();
			if (this.field1431 == 65535) {
				if (var3 >= -1) {
					throw new IllegalStateException();
				}

				this.field1431 = -1;
			}

			int var4 = -1;
			if (var2 == 18) {
				if (var3 >= -1) {
					return;
				}

				var4 = var1.method327();
				if (var4 == 65535) {
					if (var3 >= -1) {
						throw new IllegalStateException();
					}

					var4 = -1;
				}
			}

			int var5 = var1.method278();
			this.field1429 = new int[var5 + 2];

			for (int var6 = 0; var6 <= var5; ++var6) {
				if (var3 >= -1) {
					throw new IllegalStateException();
				}

				this.field1429[var6] = var1.method327();
				if (this.field1429[var6] == 65535) {
					this.field1429[var6] = -1;
				}
			}

			this.field1429[var5 + 1] = var4;
		}

	}

	public final class151 method865() {
		int var2 = -1;
		if (this.field1430 != -1) {
			var2 = class516.method2516(this.field1430);
		} else if (this.field1431 != -1) {
			var2 = class23.field443[this.field1431];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field1429.length - 1) {
			var3 = this.field1429[var2];
		} else {
			var3 = this.field1429[this.field1429.length - 1];
		}

		return var3 != -1 ? class499.method2417(var3) : null;
	}

	public String method870(int var1) {
		String var3 = this.field1426;

		while (true) {
			int var4 = var3.indexOf("%1");
			if (var4 < 0) {
				return var3;
			}

			var3 = var3.substring(0, var4) + class326.method1832(var1, false) + var3.substring(var4 + 2);
		}
	}

	public class115 method866() {
		if (this.field1419 < 0) {
			return null;
		} else {
			class115 var2 = (class115)field1414.method1890((long)this.field1419);
			if (null != var2) {
				return var2;
			} else {
				var2 = class38.method253(field1411, this.field1419, 0);
				if (var2 != null) {
					field1414.method1889(var2, (long)this.field1419);
				}

				return var2;
			}
		}
	}

	public class115 method863() {
		if (this.field1420 < 0) {
			return null;
		} else {
			class115 var2 = (class115)field1414.method1890((long)this.field1420);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class38.method253(field1411, this.field1420, 0);
				if (var2 != null) {
					field1414.method1889(var2, (long)this.field1420);
				}

				return var2;
			}
		}
	}

	public class115 method867() {
		if (this.field1421 < 0) {
			return null;
		} else {
			class115 var2 = (class115)field1414.method1890((long)this.field1421);
			if (null != var2) {
				return var2;
			} else {
				var2 = class38.method253(field1411, this.field1421, 0);
				if (var2 != null) {
					field1414.method1889(var2, (long)this.field1421);
				}

				return var2;
			}
		}
	}

	public class115 method868() {
		if (this.field1422 < 0) {
			return null;
		} else {
			class115 var2 = (class115)field1414.method1890((long)this.field1422);
			if (var2 != null) {
				return var2;
			} else {
				var2 = class38.method253(field1411, this.field1422, 0);
				if (null != var2) {
					field1414.method1889(var2, (long)this.field1422);
				}

				return var2;
			}
		}
	}

	public class253 method872() {
		if (this.field1416 == -1) {
			return null;
		} else {
			class253 var2 = (class253)field1424.method1890((long)this.field1416);
			if (null != var2) {
				return var2;
			} else {
				var2 = class528.method2553(field1411, field1413, this.field1416, 0);
				if (var2 != null) {
					field1424.method1889(var2, (long)this.field1416);
				}

				return var2;
			}
		}
	}

	static int method873(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var4 = var2 / 2 + (var1 / 32 << 7) + (var0 / 4 << 10);
		return var4;
	}

	static class167 method869(byte[] var0) {
		class167 var2 = new class167();
		class42 var3 = new class42(var0);
		var3.field527 = var3.field525.length - 2;
		int var4 = var3.method327();
		int var5 = var3.field525.length - 2 - var4 - 12;
		var3.field527 = var5;
		int var6 = var3.method282();
		var2.field1623 = var3.method327();
		var2.field1627 = var3.method327();
		var2.field1625 = var3.method327();
		var2.field1626 = var3.method327();
		int var7 = var3.method278();
		int var8;
		int var9;
		if (var7 > 0) {
			var2.field1628 = var2.method922(var7);

			for (var8 = 0; var8 < var7; ++var8) {
				var9 = var3.method327();
				class526 var10 = new class526(var9 > 0 ? class476.method2304(var9) : 1);
				var2.field1628[var8] = var10;

				while (var9-- > 0) {
					int var11 = var3.method282();
					int var12 = var3.method282();
					var10.method2547(new class380(var12), (long)var11);
				}
			}
		}

		var3.field527 = 0;
		var2.field1624 = var3.method337();
		var2.field1620 = new int[var6];
		var2.field1621 = new int[var6];
		var2.field1622 = new String[var6];

		for (var8 = 0; var3.field527 < var5; var2.field1620[var8++] = var9) {
			var9 = var3.method327();
			if (var9 == 3) {
				var2.field1622[var8] = var3.method286();
			} else if (var9 < 100 && var9 != 21 && var9 != 38 && var9 != 39) {
				var2.field1621[var8] = var3.method282();
			} else {
				var2.field1621[var8] = var3.method278();
			}
		}

		return var2;
	}
}
