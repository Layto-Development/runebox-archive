import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

public final class class306 extends Canvas {
	static class199 field2771;
	static class474 field2774;
	static int field2773;
	static long field2772;
	Component field2775;

	class306(Component var1) {
		this.field2775 = var1;
	}

	public final void update(Graphics var1) {
		this.field2775.update(var1);
	}

	public final void paint(Graphics var1) {
		this.field2775.paint(var1);
	}

	static final void method1733() {
		int var4;
		for (int var1 = 0; var1 < Client.field258; ++var1) {
			int var10002 = Client.field215[var1]--;
			if (Client.field215[var1] >= -10) {
				class84 var11 = Client.field47[var1];
				if (var11 == null) {
					class84 var10000 = (class84)null;
					var11 = class84.method552(class15.field383, Client.field259[var1], 0);
					if (null == var11) {
						continue;
					}

					int[] var19 = Client.field215;
					var19[var1] += var11.method551();
					Client.field47[var1] = var11;
				}

				if (Client.field215[var1] < 0) {
					int var3;
					if (Client.field10[var1] != 0) {
						var4 = 128 * (Client.field10[var1] & 255);
						int var5 = Client.field10[var1] >> 16 & 255;
						int var6 = var5 * 128 + 64 - class82.field863.field1555;
						if (var6 < 0) {
							var6 = -var6;
						}

						int var7 = Client.field10[var1] >> 8 & 255;
						int var8 = 64 + var7 * 128 - class82.field863.field1526;
						if (var8 < 0) {
							var8 = -var8;
						}

						int var9 = var8 + var6 - 128;
						if (var9 > var4) {
							Client.field215[var1] = -100;
							continue;
						}

						if (var9 < 0) {
							var9 = 0;
						}

						var3 = (var4 - var9) * class176.field1701.method2517() / var4;
					} else {
						var3 = class176.field1701.method2496();
					}

					if (var3 > 0) {
						class352 var14 = var11.method550().method1922(class231.field2098);
						class515 var15 = class515.method2477(var14, 100, var3);
						var15.method2447(Client.field260[var1] - 1);
						class539.field4277.method2045(var15);
					}

					Client.field215[var1] = -100;
				}
			} else {
				--Client.field258;

				for (int var2 = var1; var2 < Client.field258; ++var2) {
					Client.field259[var2] = Client.field259[var2 + 1];
					Client.field47[var2] = Client.field47[var2 + 1];
					Client.field260[var2] = Client.field260[var2 + 1];
					Client.field215[var2] = Client.field215[var2 + 1];
					Client.field10[var2] = Client.field10[var2 + 1];
				}

				--var1;
			}
		}

		if (Client.field275) {
			boolean var10;
			if (!class92.field905.isEmpty()) {
				var10 = true;
			} else if (!class92.field903.isEmpty() && class92.field903.get(0) != null && ((class104)class92.field903.get(0)).field1032 != null) {
				var10 = ((class104)class92.field903.get(0)).field1032.method163();
			} else {
				var10 = false;
			}

			if (!var10) {
				if (class176.field1701.method2488() != 0) {
					boolean var12 = !class92.field904.isEmpty();
					if (var12) {
						class342 var13 = class465.field3998;
						var4 = class176.field1701.method2488();
						if (!class92.field904.isEmpty()) {
							ArrayList var16 = new ArrayList();
							Iterator var17 = class92.field904.iterator();

							while (var17.hasNext()) {
								class104 var18 = (class104)var17.next();
								var18.field1033 = false;
								var18.field1031 = false;
								var18.field1037 = false;
								var18.field1034 = false;
								var18.field1029 = var13;
								var18.field1028 = var4;
								var18.field1025 = 0.0F;
								var16.add(var18);
							}

							class81.method545(var16, class92.field907, class92.field908, class92.field909, class92.field900, false);
						}
					}
				}

				Client.field275 = false;
			}
		}

	}
}
