import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class class419 extends class462 {
	boolean field3497;
	boolean field3502;
	int[] field3499;
	public byte field3496;
	public byte field3500;
	public String field3501;
	public List field3498;
	public long field3503;

	static {
		new BitSet(65536);
	}

	public class419(class42 var1) {
		this.field3497 = true;
		this.field3501 = null;
		this.method2160(var1);
	}

	public int[] method2159() {
		if (null == this.field3499) {
			String[] var2 = new String[this.field3498.size()];
			this.field3499 = new int[this.field3498.size()];

			for (int var3 = 0; var3 < this.field3498.size(); this.field3499[var3] = var3++) {
				var2[var3] = ((class395)this.field3498.get(var3)).field3320.method2212();
			}

			int[] var4 = this.field3499;
			class334.method1847(var2, var4, 0, var2.length - 1);
		}

		return this.field3499;
	}

	void method2155(class395 var1) {
		this.field3498.add(var1);
		this.field3499 = null;
	}

	void method2156(int var1) {
		this.field3498.remove(var1);
		this.field3499 = null;
	}

	public int method2157() {
		return this.field3498.size();
	}

	public int method2158(String var1) {
		if (!this.field3497) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var3 = 0; var3 < this.field3498.size(); ++var3) {
				if (((class395)this.field3498.get(var3)).field3320.method2214().equalsIgnoreCase(var1)) {
					return var3;
				}
			}

			return -1;
		}
	}

	void method2160(class42 var1) {
		int var3 = var1.method278();
		if ((var3 & 1) != 0) {
			this.field3502 = true;
		}

		if ((var3 & 2) != 0) {
			this.field3497 = true;
		}

		int var4 = 2;
		if ((var3 & 4) != 0) {
			var4 = var1.method278();
		}

		super.field3987 = var1.method283();
		this.field3503 = var1.method283();
		this.field3501 = var1.method286();
		var1.method285();
		this.field3500 = var1.method279();
		this.field3496 = var1.method279();
		int var5 = var1.method327();
		if (var5 > 0) {
			this.field3498 = new ArrayList(var5);

			for (int var6 = 0; var6 < var5; ++var6) {
				class395 var7 = new class395();
				if (this.field3502) {
					var1.method283();
				}

				if (this.field3497) {
					var7.field3320 = new class440(var1.method286());
				}

				var7.field3321 = var1.method279();
				var7.field3322 = var1.method327();
				if (var4 >= 3) {
					var1.method285();
				}

				this.field3498.add(var6, var7);
			}
		}

	}

	public static class404 method2161(int var0) {
		class404 var2 = (class404)class404.field3392.method1890((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class404.field3383.method1212(3, var0);
			var2 = new class404();
			if (var3 != null) {
				var2.method2089(new class42(var3));
			}

			class404.field3392.method1889(var2, (long)var0);
			return var2;
		}
	}

	static void method2162(class333 var0) {
		if (null != var0 && var0.field2923 != null) {
			if (var0.field2923.field763 >= 0) {
				class60 var2 = class366.method1967(var0.field2923.field661);
				if (null == var2 || null == var2.field776 || var2.field776.length == 0 || var0.field2923.field763 >= var2.field776.length || var2.field776[var0.field2923.field763] != var0.field2923) {
					return;
				}
			}

			if (var0.field2923.field646 == 11 && var0.field2920 == 0) {
				if (var0.field2923.method450(var0.field2921, var0.field2922, 0, 0)) {
					switch(var0.field2923.method453()) {
					case 0:
						class289.method1661(var0.field2923.method455(), true, false);
						break;
					case 1:
						int var3 = class447.method2235(var0.field2923);
						boolean var7 = (var3 >> 22 & 1) != 0;
						if (var7) {
							int[] var4 = var0.field2923.method462();
							if (null != var4) {
								class160 var5 = class85.method556(class129.field1193, Client.field68.field2426);
								var5.field1483.method315(var4[1]);
								var5.field1483.method316(var0.field2923.field644);
								var5.field1483.method336(var0.field2923.field763);
								var5.field1483.method333(var0.field2923.method454());
								var5.field1483.method316(var4[2]);
								var5.field1483.method316(var4[0]);
								Client.field68.method1570(var5);
							}
						}
					}
				}
			} else if (var0.field2923.field646 == 12) {
				class477 var6 = var0.field2923.method472();
				if (null != var6 && var6.method2345()) {
					switch(var0.field2920) {
					case 0:
						Client.field242.method1508(var0.field2923);
						var6.method2306(true);
						var6.method2381(var0.field2921, var0.field2922, Client.field151.method2118(82), Client.field151.method2118(81));
						break;
					case 1:
						var6.method2364(var0.field2921, var0.field2922);
					}
				}
			}

		}
	}
}
