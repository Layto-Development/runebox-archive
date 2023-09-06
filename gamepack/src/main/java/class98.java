import java.net.URL;

public class class98 {
	static int field988;
	static int field993;
	static long field994;
	class98 field992;
	float field987;
	float field989;
	float field990;
	float field991;
	float field995;
	int field986;

	class98() {
		this.field995 = Float.MAX_VALUE;
		this.field987 = Float.MAX_VALUE;
		this.field990 = Float.MAX_VALUE;
		this.field991 = Float.MAX_VALUE;
	}

	void method645(class42 var1, int var2) {
		this.field986 = var1.method280();
		this.field989 = var1.method284();
		this.field995 = var1.method284();
		this.field987 = var1.method284();
		this.field990 = var1.method284();
		this.field991 = var1.method284();
	}

	static boolean method647() {
		try {
			if (class467.field4008 == null) {
				class467.field4008 = class136.field1326.method1684(new URL(class518.field4224));
			} else if (class467.field4008.method1916()) {
				byte[] var1 = class467.field4008.method1918();
				class42 var2 = new class42(var1);
				var2.method282();
				class12.field369 = var2.method327();
				class225.field2044 = new class12[class12.field369];

				class12 var4;
				for (int var3 = 0; var3 < class12.field369; var4.field374 = var3++) {
					var4 = class225.field2044[var3] = new class12();
					var4.field368 = var2.method327();
					var4.field364 = var2.method282();
					var4.field371 = var2.method286();
					var4.field372 = var2.method286();
					var4.field373 = var2.method278();
					var4.field370 = var2.method280();
				}

				class172.method978(class225.field2044, 0, class225.field2044.length - 1, class12.field367, class12.field366);
				class467.field4008 = null;
				return true;
			}
		} catch (Exception var5) {
			var5.printStackTrace();
			class467.field4008 = null;
		}

		return false;
	}

	public static synchronized byte[] method646(int var0) {
		return class312.method1748(var0, false);
	}
}
