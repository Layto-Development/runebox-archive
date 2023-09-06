public class class310 {
	float field2803;
	float field2804;
	float field2805;

	static {
		new class310(0.0F, 0.0F, 0.0F);
		new class310(1.0F, 1.0F, 1.0F);
		new class310(1.0F, 0.0F, 0.0F);
		new class310(0.0F, 1.0F, 0.0F);
		new class310(0.0F, 0.0F, 1.0F);
		class8.method88(100);
	}

	class310(float var1, float var2, float var3) {
		this.field2804 = var1;
		this.field2803 = var2;
		this.field2805 = var3;
	}

	final float method1744() {
		return (float)Math.sqrt((double)(this.field2804 * this.field2804 + this.field2803 * this.field2803 + this.field2805 * this.field2805));
	}

	public String toString() {
		return this.field2804 + ", " + this.field2803 + ", " + this.field2805;
	}

	static int method1745(int var0, class167 var1, boolean var2) {
		if (var0 == 6200) {
			class203.field1903 -= 2;
			Client.field276 = (short)class214.method1211(class139.field1344[class203.field1903]);
			if (Client.field276 <= 0) {
				Client.field276 = 256;
			}

			Client.field162 = (short)class214.method1211(class139.field1344[class203.field1903 + 1]);
			if (Client.field162 <= 0) {
				Client.field162 = 256;
			}

			return 1;
		} else if (var0 == 6201) {
			class203.field1903 -= 2;
			Client.field278 = (short)class139.field1344[class203.field1903];
			if (Client.field278 <= 0) {
				Client.field278 = 256;
			}

			Client.field279 = (short)class139.field1344[1 + class203.field1903];
			if (Client.field279 <= 0) {
				Client.field279 = 320;
			}

			return 1;
		} else if (var0 == 6202) {
			class203.field1903 -= 4;
			Client.field280 = (short)class139.field1344[class203.field1903];
			if (Client.field280 <= 0) {
				Client.field280 = 1;
			}

			Client.field112 = (short)class139.field1344[1 + class203.field1903];
			if (Client.field112 <= 0) {
				Client.field112 = 32767;
			} else if (Client.field112 < Client.field280) {
				Client.field112 = Client.field280;
			}

			Client.field282 = (short)class139.field1344[2 + class203.field1903];
			if (Client.field282 <= 0) {
				Client.field282 = 1;
			}

			Client.field283 = (short)class139.field1344[3 + class203.field1903];
			if (Client.field283 <= 0) {
				Client.field283 = 32767;
			} else if (Client.field283 < Client.field282) {
				Client.field283 = Client.field282;
			}

			return 1;
		} else if (var0 == 6203) {
			if (Client.field296 != null) {
				class35.method239(0, 0, Client.field296.field659, Client.field296.field636, false);
				class139.field1344[++class203.field1903 - 1] = Client.field219;
				class139.field1344[++class203.field1903 - 1] = Client.field94;
			} else {
				class139.field1344[++class203.field1903 - 1] = -1;
				class139.field1344[++class203.field1903 - 1] = -1;
			}

			return 1;
		} else if (var0 == 6204) {
			class139.field1344[++class203.field1903 - 1] = Client.field278;
			class139.field1344[++class203.field1903 - 1] = Client.field279;
			return 1;
		} else if (var0 == 6205) {
			class139.field1344[++class203.field1903 - 1] = class245.method1396(Client.field276);
			class139.field1344[++class203.field1903 - 1] = class245.method1396(Client.field162);
			return 1;
		} else if (var0 == 6220) {
			class139.field1344[++class203.field1903 - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			class139.field1344[++class203.field1903 - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			class139.field1344[++class203.field1903 - 1] = class237.field2181;
			return 1;
		} else if (var0 == 6223) {
			class139.field1344[++class203.field1903 - 1] = class5.field322;
			return 1;
		} else {
			return 2;
		}
	}
}
