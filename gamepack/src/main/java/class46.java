import java.util.Iterator;

public class class46 extends class232 {
	class215 field539;
	class215 field540;
	class215 field541;

	public class46(class232 var1, class215 var2, class215 var3, class215 var4) {
		super(var1);
		this.field539 = var2;
		this.field540 = var3;
		this.field541 = var4;
		super.field2101 = "LoadSongTask";
	}

	public boolean method1330() {
		int var2 = 0;
		Iterator var3 = class92.field903.iterator();

		while (true) {
			while (var3.hasNext()) {
				class104 var4 = (class104)var3.next();
				if (null != var4 && var4.field1032.field431 > 1 && var4.field1032.method136()) {
					this.method1333("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var4 != null && !var4.field1031) {
					try {
						if (null != var4.field1029 && var4.field1026 != -1 && var4.field1027 != -1) {
							if (null == var4.field1036) {
								var4.field1036 = class179.method1009(var4.field1029, var4.field1026, var4.field1027);
								if (null == var4.field1036) {
									continue;
								}
							}

							if (null == var4.field1035) {
								var4.field1035 = new class203(this.field541, this.field540);
							}

							if (var4.field1032.method131(var4.field1036, this.field539, var4.field1035)) {
								++var2;
								var4.field1031 = true;
								var4.field1032.method132();
							}
						} else {
							++var2;
						}
					} catch (Exception var6) {
						class41.method263((String)null, var6);
						this.method1333(var6.getMessage());
						return true;
					}
				} else {
					++var2;
				}
			}

			if (var2 == class92.field903.size()) {
				return true;
			}

			return false;
		}
	}

	static final void method348(int var0, int var1, int var2, int var3, class115 var4, class420 var5) {
		int var7 = var2 * var2 + var3 * var3;
		if (var7 > 4225 && var7 < 90000) {
			int var8 = Client.field181 & 2047;
			int var9 = class133.field1291[var8];
			int var10 = class133.field1289[var8];
			int var11 = var9 * var3 + var2 * var10 >> 16;
			int var12 = var10 * var3 - var2 * var9 >> 16;
			double var13 = Math.atan2((double)var11, (double)var12);
			int var15 = var5.field3506 / 2 - 25;
			int var16 = (int)(Math.sin(var13) * (double)var15);
			int var17 = (int)(Math.cos(var13) * (double)var15);
			byte var18 = 20;
			class527.field4251.method703(var16 + (var5.field3506 / 2 + var0 - var18 / 2), var1 + var5.field3505 / 2 - var18 / 2 - var17 - 10, var18, var18, 15, 15, var13, 256);
		} else {
			class257.method1509(var0, var1, var2, var3, var4, var5);
		}

	}
}
