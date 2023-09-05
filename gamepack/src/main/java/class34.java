import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

@ObfInfo(name = "av")
public final class class34 extends Canvas {
	@ObfInfo(name = "wb", desc = "Lsi;")
	static class245 field483;
	@ObfInfo(name = "af", desc = "Lbe;")
	static class279 field486;
	@ObfInfo(name = "pr", desc = "I", intMultiplier = -395313837)
	static int field485;
	@ObfInfo(name = "ae", desc = "J", longMultiplier = 6865685735894550463L)
	static long field484;
	@ObfInfo(name = "au", desc = "Ljava/awt/Component;")
	Component field487;

	@ObfInfo(name = "<init>", desc = "(Ljava/awt/Component;)V")
	class34(Component var1) {
		this.field487 = var1;
	}

	@ObfInfo(name = "update", desc = "(Ljava/awt/Graphics;)V")
	public final void update(Graphics var1) {
		this.field487.update(var1);
	}

	@ObfInfo(name = "paint", desc = "(Ljava/awt/Graphics;)V")
	public final void paint(Graphics var1) {
		this.field487.paint(var1);
	}

	@ObfInfo(name = "hr", desc = "(I)V", opaqueValue = "954063172")
	static final void method419() {
		int var4;
		for (int var1 = 0; var1 < Client.field282; ++var1) {
			int var10002 = Client.field239[var1]--;
			if (Client.field239[var1] >= -10) {
				class538 var11 = Client.field71[var1];
				if (var11 == null) {
					class538 var10000 = (class538)null;
					var11 = class538.method2590(class310.field2523, Client.field283[var1], 0);
					if (null == var11) {
						continue;
					}

					int[] var19 = Client.field239;
					var19[var1] += var11.method2589();
					Client.field71[var1] = var11;
				}

				if (Client.field239[var1] < 0) {
					int var3;
					if (Client.field34[var1] != 0) {
						var4 = 128 * (Client.field34[var1] & 255);
						int var5 = Client.field34[var1] >> 16 & 255;
						int var6 = var5 * 128 + 64 - class126.field1164.field1061;
						if (var6 < 0) {
							var6 = -var6;
						}

						int var7 = Client.field34[var1] >> 8 & 255;
						int var8 = 64 + var7 * 128 - class126.field1164.field1032;
						if (var8 < 0) {
							var8 = -var8;
						}

						int var9 = var8 + var6 - 128;
						if (var9 > var4) {
							Client.field239[var1] = -100;
							continue;
						}

						if (var9 < 0) {
							var9 = 0;
						}

						var3 = (var4 - var9) * class281.field2262.method1772() / var4;
					} else {
						var3 = class281.field2262.method1754();
					}

					if (var3 > 0) {
						class62 var14 = var11.method2588().method486(class105.field1016);
						class28 var15 = class28.method404(var14, 100, var3);
						var15.method370(Client.field284[var1] - 1);
						class164.field1556.method1990(var15);
					}

					Client.field239[var1] = -100;
				}
			} else {
				--Client.field282;

				for (int var2 = var1; var2 < Client.field282; ++var2) {
					Client.field283[var2] = Client.field283[var2 + 1];
					Client.field71[var2] = Client.field71[var2 + 1];
					Client.field284[var2] = Client.field284[var2 + 1];
					Client.field239[var2] = Client.field239[var2 + 1];
					Client.field34[var2] = Client.field34[var2 + 1];
				}

				--var1;
			}
		}

		if (Client.field299) {
			boolean var10;
			if (!class303.field2449.isEmpty()) {
				var10 = true;
			} else if (!class303.field2447.isEmpty() && class303.field2447.get(0) != null && ((class503)class303.field2447.get(0)).field4063 != null) {
				var10 = ((class503)class303.field2447.get(0)).field4063.method809();
			} else {
				var10 = false;
			}

			if (!var10) {
				if (class281.field2262.method1746() != 0) {
					boolean var12 = !class303.field2448.isEmpty();
					if (var12) {
						class505 var13 = class323.field2609;
						var4 = class281.field2262.method1746();
						if (!class303.field2448.isEmpty()) {
							ArrayList var16 = new ArrayList();
							Iterator var17 = class303.field2448.iterator();

							while (var17.hasNext()) {
								class503 var18 = (class503)var17.next();
								var18.field4064 = false;
								var18.field4062 = false;
								var18.field4068 = false;
								var18.field4065 = false;
								var18.field4060 = var13;
								var18.field4059 = var4;
								var18.field4056 = 0.0F;
								var16.add(var18);
							}

							class303.method1677(var16, class303.field2451, class303.field2452, class303.field2453, class303.field2444, false);
						}
					}
				}

				Client.field299 = false;
			}
		}

	}
}
