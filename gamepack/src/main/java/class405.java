public class class405 {

	float field3178;

	float field3179;

	float field3180;

	static {
		new class405(0.0F, 0.0F, 0.0F);
		new class405(1.0F, 1.0F, 1.0F);
		new class405(1.0F, 0.0F, 0.0F);
		new class405(0.0F, 1.0F, 0.0F);
		new class405(0.0F, 0.0F, 1.0F);
		method2067(100);
	}

	class405(float var1, float var2, float var3) {
		this.field3179 = var1;
		this.field3178 = var2;
		this.field3180 = var3;
	}

	final float method2065() {
		return (float) Math.sqrt((double) (this.field3179 * this.field3179 + this.field3178 * this.field3178 + this.field3180 * this.field3180));
	}

	@Override
	public String toString() {
		return this.field3179 + ", " + this.field3178 + ", " + this.field3180;
	}

	static void method2067(int var0) {
	}

	static int method2066(int var0, class436 var1, boolean var2) {
		if (var0 == 6200) {
			class439.field3437 -= 2;
			Client.field1171 = (short) class221.method1326(class221.field1982[class439.field3437]);
			if (Client.field1171 <= 0) {
				Client.field1171 = 256;
			}
			Client.field1057 = (short) class221.method1326(class221.field1982[class439.field3437 + 1]);
			if (Client.field1057 <= 0) {
				Client.field1057 = 256;
			}
			return 1;
		} else if (var0 == 6201) {
			class439.field3437 -= 2;
			Client.field1173 = (short) class221.field1982[class439.field3437];
			if (Client.field1173 <= 0) {
				Client.field1173 = 256;
			}
			Client.field1174 = (short) class221.field1982[1 + class439.field3437];
			if (Client.field1174 <= 0) {
				Client.field1174 = 320;
			}
			return 1;
		} else if (var0 == 6202) {
			class439.field3437 -= 4;
			Client.field1175 = (short) class221.field1982[class439.field3437];
			if (Client.field1175 <= 0) {
				Client.field1175 = 1;
			}
			Client.field1007 = (short) class221.field1982[1 + class439.field3437];
			if (Client.field1007 <= 0) {
				Client.field1007 = 32767;
			} else if (Client.field1007 < Client.field1175) {
				Client.field1007 = Client.field1175;
			}
			Client.field1177 = (short) class221.field1982[2 + class439.field3437];
			if (Client.field1177 <= 0) {
				Client.field1177 = 1;
			}
			Client.field1178 = (short) class221.field1982[3 + class439.field3437];
			if (Client.field1178 <= 0) {
				Client.field1178 = 32767;
			} else if (Client.field1178 < Client.field1177) {
				Client.field1178 = Client.field1177;
			}
			return 1;
		} else if (var0 == 6203) {
			if (Client.field1191 != null) {
				class204.method1220(0, 0, Client.field1191.field2703, Client.field1191.field2680, false);
				class221.field1982[++class439.field3437 - 1] = Client.field1114;
				class221.field1982[++class439.field3437 - 1] = Client.field989;
			} else {
				class221.field1982[++class439.field3437 - 1] = -1;
				class221.field1982[++class439.field3437 - 1] = -1;
			}
			return 1;
		} else if (var0 == 6204) {
			class221.field1982[++class439.field3437 - 1] = Client.field1173;
			class221.field1982[++class439.field3437 - 1] = Client.field1174;
			return 1;
		} else if (var0 == 6205) {
			class221.field1982[++class439.field3437 - 1] = class221.method1345(Client.field1171);
			class221.field1982[++class439.field3437 - 1] = class221.method1345(Client.field1057);
			return 1;
		} else if (var0 == 6220) {
			class221.field1982[++class439.field3437 - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			class221.field1982[++class439.field3437 - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			class221.field1982[++class439.field3437 - 1] = class86.field856;
			return 1;
		} else if (var0 == 6223) {
			class221.field1982[++class439.field3437 - 1] = class271.field2226;
			return 1;
		} else {
			return 2;
		}
	}
}
