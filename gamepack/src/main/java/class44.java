import java.net.MalformedURLException;
import java.net.URL;

public class class44 {
	static int field537;
	class115 field535;
	class349 field536;

	class44(String var1, class296 var2) {
		try {
			this.field536 = var2.method1684(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field536 = null;
		}

	}

	class44(class349 var1) {
		this.field536 = var1;
	}

	class115 method345() {
		if (null == this.field535 && this.field536 != null && this.field536.method1916()) {
			if (this.field536.method1918() != null) {
				this.field535 = class418.method2149(this.field536.method1918());
			}

			this.field536 = null;
		}

		return this.field535;
	}

	public static void method346(class215 var0) {
		class207.field1922 = var0;
	}

	static int method347(int var0, class167 var1, boolean var2) {
		class60 var4;
		if (var0 == 2700) {
			var4 = class366.method1967(class139.field1344[--class203.field1903]);
			class139.field1344[++class203.field1903 - 1] = var4.field772;
			return 1;
		} else if (var0 == 2701) {
			var4 = class366.method1967(class139.field1344[--class203.field1903]);
			if (var4.field772 != -1) {
				class139.field1344[++class203.field1903 - 1] = var4.field773;
			} else {
				class139.field1344[++class203.field1903 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2702) {
			int var6 = class139.field1344[--class203.field1903];
			class534 var5 = (class534)Client.field24.method1492((long)var6);
			if (var5 != null) {
				class139.field1344[++class203.field1903 - 1] = 1;
			} else {
				class139.field1344[++class203.field1903 - 1] = 0;
			}

			return 1;
		} else if (var0 == 2706) {
			class139.field1344[++class203.field1903 - 1] = Client.field175;
			return 1;
		} else if (var0 == 2707) {
			var4 = class366.method1967(class139.field1344[--class203.field1903]);
			class139.field1344[++class203.field1903 - 1] = var4.method469() ? 1 : 0;
			return 1;
		} else if (var0 == 2708) {
			var4 = class366.method1967(class139.field1344[--class203.field1903]);
			return class359.method1943(var4);
		} else if (var0 == 2709) {
			var4 = class366.method1967(class139.field1344[--class203.field1903]);
			return class432.method2197(var4);
		} else {
			return 2;
		}
	}
}
