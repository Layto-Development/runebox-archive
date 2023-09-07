import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

public final class class26 extends Canvas {

	static class308 field125;

	static class365 field128;

	static int field127;

	static long field126;

	Component field129;

	class26(Component var1) {
		this.field129 = var1;
	}

	@Override
	public final void update(Graphics var1) {
		this.field129.update(var1);
	}

	@Override
	public final void paint(Graphics var1) {
		this.field129.paint(var1);
	}

	static final void method75() {
		int var4;
		for (int var1 = 0; var1 < Client.field1153; ++var1) {
			int var10002 = Client.field1110[var1]--;
			if (Client.field1110[var1] >= -10) {
				class487 var11 = Client.field942[var1];
				if (var11 == null) {
					class487 var10000 = (class487) null;
					var11 = class487.method2346(class73.field730, Client.field1154[var1], 0);
					if (null == var11) {
						continue;
					}
					int[] var19 = Client.field1110;
					var19[var1] += var11.method2345();
					Client.field942[var1] = var11;
				}
				if (Client.field1110[var1] < 0) {
					int var3;
					if (Client.field905[var1] != 0) {
						var4 = 128 * (Client.field905[var1] & 255);
						int var5 = Client.field905[var1] >> 16 & 255;
						int var6 = var5 * 128 + 64 - class431.field3378.field272;
						if (var6 < 0) {
							var6 = -var6;
						}
						int var7 = Client.field905[var1] >> 8 & 255;
						int var8 = 64 + var7 * 128 - class431.field3378.field243;
						if (var8 < 0) {
							var8 = -var8;
						}
						int var9 = var8 + var6 - 128;
						if (var9 > var4) {
							Client.field1110[var1] = -100;
							continue;
						}
						if (var9 < 0) {
							var9 = 0;
						}
						var3 = (var4 - var9) * class83.field841.method1027() / var4;
					} else {
						var3 = class83.field841.method1009();
					}
					if (var3 > 0) {
						class529 var14 = var11.method2344().method2564(class414.field3219);
						class32 var15 = class32.method147(var14, 100, var3);
						var15.method113(Client.field1155[var1] - 1);
						class236.field2028.method893(var15);
					}
					Client.field1110[var1] = -100;
				}
			} else {
				--Client.field1153;
				for (int var2 = var1; var2 < Client.field1153; ++var2) {
					Client.field1154[var2] = Client.field1154[var2 + 1];
					Client.field942[var2] = Client.field942[var2 + 1];
					Client.field1155[var2] = Client.field1155[var2 + 1];
					Client.field1110[var2] = Client.field1110[var2 + 1];
					Client.field905[var2] = Client.field905[var2 + 1];
				}
				--var1;
			}
		}
		if (Client.field1170) {
			boolean var10;
			if (!class388.field3092.isEmpty()) {
				var10 = true;
			} else if (!class388.field3090.isEmpty() && class388.field3090.get(0) != null && ((class490) class388.field3090.get(0)).field3956 != null) {
				var10 = ((class490) class388.field3090.get(0)).field3956.method274();
			} else {
				var10 = false;
			}
			if (!var10) {
				if (class83.field841.method1001() != 0) {
					boolean var12 = !class388.field3091.isEmpty();
					if (var12) {
						class13 var13 = class477.field3744;
						var4 = class83.field841.method1001();
						if (!class388.field3091.isEmpty()) {
							ArrayList var16 = new ArrayList();
							Iterator var17 = class388.field3091.iterator();
							while (var17.hasNext()) {
								class490 var18 = (class490) var17.next();
								var18.field3957 = false;
								var18.field3955 = false;
								var18.field3961 = false;
								var18.field3958 = false;
								var18.field3953 = var13;
								var18.field3952 = var4;
								var18.field3949 = 0.0F;
								var16.add(var18);
							}
							class388.method2015(var16, class388.field3094, class388.field3095, class388.field3096, class388.field3087, false);
						}
					}
				}
				Client.field1170 = false;
			}
		}
	}
}
