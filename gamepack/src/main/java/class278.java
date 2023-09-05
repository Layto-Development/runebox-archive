import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "rj")
public class class278 {
	@ObfInfo(name = "ae", desc = "F")
	float field2247;
	@ObfInfo(name = "au", desc = "F")
	float field2248;
	@ObfInfo(name = "ao", desc = "F")
	float field2249;

	static {
		new class278(0.0F, 0.0F, 0.0F);
		new class278(1.0F, 1.0F, 1.0F);
		new class278(1.0F, 0.0F, 0.0F);
		new class278(0.0F, 1.0F, 0.0F);
		new class278(0.0F, 0.0F, 1.0F);
		method1476(100);
	}

	@ObfInfo(name = "<init>", desc = "(FFF)V")
	class278(float var1, float var2, float var3) {
		this.field2248 = var1;
		this.field2247 = var2;
		this.field2249 = var3;
	}

	@ObfInfo(name = "ae", desc = "(B)F")
	final float method1474() {
		return (float)Math.sqrt((double)(this.field2248 * this.field2248 + this.field2247 * this.field2247 + this.field2249 * this.field2249));
	}

	@ObfInfo(name = "toString", desc = "()Ljava/lang/String;")
	public String toString() {
		return this.field2248 + ", " + this.field2247 + ", " + this.field2249;
	}

	@ObfInfo(name = "au", desc = "(II)V")
	static void method1476(int var0) {
	}

	@ObfInfo(name = "bb", desc = "(ILdh;ZI)I", opaqueValue = "1110270536")
	static int method1475(int var0, class333 var1, boolean var2) {
		if (var0 == 6200) {
			class293.field2375 -= 2;
			Client.field300 = (short)class175.method988(class175.field1621[class293.field2375]);
			if (Client.field300 <= 0) {
				Client.field300 = 256;
			}

			Client.field186 = (short)class175.method988(class175.field1621[class293.field2375 + 1]);
			if (Client.field186 <= 0) {
				Client.field186 = 256;
			}

			return 1;
		} else if (var0 == 6201) {
			class293.field2375 -= 2;
			Client.field302 = (short)class175.field1621[class293.field2375];
			if (Client.field302 <= 0) {
				Client.field302 = 256;
			}

			Client.field303 = (short)class175.field1621[1 + class293.field2375];
			if (Client.field303 <= 0) {
				Client.field303 = 320;
			}

			return 1;
		} else if (var0 == 6202) {
			class293.field2375 -= 4;
			Client.field304 = (short)class175.field1621[class293.field2375];
			if (Client.field304 <= 0) {
				Client.field304 = 1;
			}

			Client.field136 = (short)class175.field1621[1 + class293.field2375];
			if (Client.field136 <= 0) {
				Client.field136 = 32767;
			} else if (Client.field136 < Client.field304) {
				Client.field136 = Client.field304;
			}

			Client.field306 = (short)class175.field1621[2 + class293.field2375];
			if (Client.field306 <= 0) {
				Client.field306 = 1;
			}

			Client.field307 = (short)class175.field1621[3 + class293.field2375];
			if (Client.field307 <= 0) {
				Client.field307 = 32767;
			} else if (Client.field307 < Client.field306) {
				Client.field307 = Client.field306;
			}

			return 1;
		} else if (var0 == 6203) {
			if (Client.field320 != null) {
				class151.method882(0, 0, Client.field320.field1229, Client.field320.field1206, false);
				class175.field1621[++class293.field2375 - 1] = Client.field243;
				class175.field1621[++class293.field2375 - 1] = Client.field118;
			} else {
				class175.field1621[++class293.field2375 - 1] = -1;
				class175.field1621[++class293.field2375 - 1] = -1;
			}

			return 1;
		} else if (var0 == 6204) {
			class175.field1621[++class293.field2375 - 1] = Client.field302;
			class175.field1621[++class293.field2375 - 1] = Client.field303;
			return 1;
		} else if (var0 == 6205) {
			class175.field1621[++class293.field2375 - 1] = class175.method1007(Client.field300);
			class175.field1621[++class293.field2375 - 1] = class175.method1007(Client.field186);
			return 1;
		} else if (var0 == 6220) {
			class175.field1621[++class293.field2375 - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			class175.field1621[++class293.field2375 - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			class175.field1621[++class293.field2375 - 1] = class537.field4270;
			return 1;
		} else if (var0 == 6223) {
			class175.field1621[++class293.field2375 - 1] = class396.field3101;
			return 1;
		} else {
			return 2;
		}
	}
}
