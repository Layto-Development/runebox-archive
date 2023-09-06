public class class54 {
	static class342 field605;
	static short[][][] field604;
	class34[] field602;
	int field603;

	class54(class42 var1, int var2) {
		this.field602 = new class34[var2];
		this.field603 = var1.method278();

		for (int var3 = 0; var3 < this.field602.length; ++var3) {
			class34 var4 = new class34(this.field603, var1, false);
			this.field602[var3] = var4;
		}

		this.method399();
	}

	void method399() {
		class34[] var2 = this.field602;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class34 var4 = var2[var3];
			if (var4.field484 >= 0) {
				var4.field494 = this.field602[var4.field484];
			}
		}

	}

	public int method392() {
		return this.field602.length;
	}

	class34 method393(int var1) {
		return var1 >= this.method392() ? null : this.field602[var1];
	}

	class34[] method394() {
		return this.field602;
	}

	void method395(class429 var1, int var2) {
		this.method396(var1, var2, (boolean[])null, false);
	}

	void method396(class429 var1, int var2, boolean[] var3, boolean var4) {
		int var6 = var1.method2182();
		int var7 = 0;
		class34[] var8 = this.method394();

		for (int var9 = 0; var9 < var8.length; ++var9) {
			class34 var10 = var8[var9];
			if (null == var3 || var4 == var3[var7]) {
				var1.method2184(var2, var10, var7, var6);
			}

			++var7;
		}

	}

	public static class285 method397(int var0) {
		class285 var2 = (class285)class285.field2516.method1890((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class285.field2519.method1212(19, var0);
			var2 = new class285();
			if (null != var3) {
				var2.method1626(new class42(var3));
			}

			class285.field2516.method1889(var2, (long)var0);
			return var2;
		}
	}

	public static void method401(class215 var0, class215 var1, class215 var2) {
		class3.field314 = var0;
		class243.field2218 = var1;
		class180.field1710 = var2;
	}

	static class199 method398() {
		return class306.field2771;
	}

	static final void method400(class60 var0, int var1, int var2) {
		if (null == Client.field187 && !Client.field116) {
			if (null != var0 && class467.method2284(var0) != null) {
				Client.field187 = var0;
				Client.field206 = class467.method2284(var0);
				Client.field189 = var1;
				Client.field262 = var2;
				class40.field519 = 0;
				Client.field198 = false;
				int var4 = Client.field152 - 1;
				if (var4 != -1) {
					class148.field1397 = new class132();
					class148.field1397.field1282 = Client.field153[var4];
					class148.field1397.field1285 = Client.field154[var4];
					class148.field1397.field1283 = Client.field196[var4];
					class148.field1397.field1284 = Client.field156[var4];
					class148.field1397.field1281 = Client.field157[var4];
					class148.field1397.field1286 = Client.field158[var4];
					class148.field1397.field1287 = Client.field277[var4];
				}

			}
		}
	}
}
