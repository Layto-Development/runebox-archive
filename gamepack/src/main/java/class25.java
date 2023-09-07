public class class25 {

	static int[] field124;

	class25() throws Throwable {
	}

	static final void method74(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}
		if (class283.field2296 < var0) {
			class283.field2296 += class319.field2503 * (var0 - class283.field2296) / 1000 + class474.field3730;
			if (class283.field2296 > var0) {
				class283.field2296 = var0;
			}
		} else if (class283.field2296 > var0) {
			class283.field2296 -= class474.field3730 + (class283.field2296 - var0) * class319.field2503 / 1000;
			if (class283.field2296 < var0) {
				class283.field2296 = var0;
			}
		}
		var1 &= 2047;
		int var3 = var1 - class511.field4085;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}
		if (var3 > 0) {
			class511.field4085 += var3 * class319.field2503 / 1000 + class474.field3730;
			class511.field4085 &= 2047;
		} else if (var3 < 0) {
			class511.field4085 -= -var3 * class319.field2503 / 1000 + class474.field3730;
			class511.field4085 &= 2047;
		}
		int var4 = var1 - class511.field4085;
		if (var4 > 1024) {
			var4 -= 2048;
		} else if (var4 < -1024) {
			var4 += 2048;
		}
		if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
			class511.field4085 = var1;
		}
	}
}
