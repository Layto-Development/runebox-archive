public class class200 extends class232 {
	class104 field1863;
	int field1862;

	public class200(class232 var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field1863 = null;
		this.field1862 = 0;
		super.field2101 = "FadeInTask";
		if (var2 >= 0) {
			if (var3 && var2 < class92.field910.size()) {
				this.field1863 = (class104)class92.field910.get(var2);
			} else if (!var3 && var2 < class92.field903.size()) {
				this.field1863 = (class104)class92.field903.get(var2);
			}

			this.field1862 = var4;
		}
	}

	public boolean method1330() {
		if (this.field1863 != null && null != this.field1863.field1032) {
			this.field1863.field1037 = true;

			try {
				if (this.field1863.field1025 < (float)this.field1863.field1028 && this.field1863.field1032.method163()) {
					float var2 = this.field1862 == 0 ? (float)this.field1862 : (float)this.field1863.field1028 / (float)this.field1862;
					class104 var10000 = this.field1863;
					var10000.field1025 += 0.0F == var2 ? (float)this.field1863.field1028 : var2;
					if (this.field1863.field1025 > (float)this.field1863.field1028) {
						this.field1863.field1025 = (float)this.field1863.field1028;
					}

					this.field1863.field1032.method130((int)this.field1863.field1025);
					return false;
				}
			} catch (Exception var3) {
				this.method1333(var3.getMessage());
				return true;
			}

			this.field1863.field1037 = false;
			return true;
		} else {
			return true;
		}
	}

	static final void method1140(String var0, boolean var1) {
		if (Client.field129) {
			byte var3 = 4;
			int var4 = var3 + 6;
			int var5 = var3 + 6;
			int var6 = class324.field2900.method1315(var0, 250);
			int var7 = class324.field2900.method1294(var0, 250) * 13;
			class266.method1548(var4 - var3, var5 - var3, var6 + var3 + var3, var7 + var3 + var3, 0);
			class266.method1551(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 16777215);
			class324.field2900.method1291(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
			int var8 = var4 - var3;
			int var9 = var5 - var3;
			int var10 = var3 + var6 + var3;
			int var11 = var3 + var7 + var3;

			for (int var12 = 0; var12 < Client.field174; ++var12) {
				if (Client.field228[var12] + Client.field230[var12] > var8 && Client.field228[var12] < var10 + var8 && Client.field229[var12] + Client.field231[var12] > var9 && Client.field229[var12] < var11 + var9) {
					Client.field13[var12] = true;
				}
			}

			if (var1) {
				class94.field937.method604(0, 0);
			} else {
				class492.method2410(var4, var5, var6, var7);
			}

		}
	}
}
