import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class class409 extends class218 {
	public static class215 field3412;
	public static class215 field3425;
	public static class344 field3413;
	public static class344 field3414;
	static boolean field3418;
	int field3411;
	int field3415;
	int field3416;
	int field3423;
	int field3424;
	int field3426;
	int field3427;
	short[] field3419;
	short[] field3420;
	short[] field3421;
	short[] field3422;
	public int field3417;

	static {
		field3413 = new class344(64);
		field3414 = new class344(30);
	}

	class409() {
		this.field3417 = -1;
		this.field3411 = 128;
		this.field3423 = 128;
		this.field3424 = 0;
		this.field3416 = 0;
		this.field3426 = 0;
	}

	void method2108(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			this.method2105(var1, var3);
		}
	}

	void method2105(class42 var1, int var2) {
		if (var2 == 1) {
			this.field3427 = var1.method327();
		} else if (var2 == 2) {
			this.field3417 = var1.method327();
		} else if (var2 == 4) {
			this.field3411 = var1.method327();
		} else if (var2 == 5) {
			this.field3423 = var1.method327();
		} else if (var2 == 6) {
			this.field3424 = var1.method327();
		} else if (var2 == 7) {
			this.field3416 = var1.method278();
		} else if (var2 == 8) {
			this.field3426 = var1.method278();
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var4 = var1.method278();
				this.field3422 = new short[var4];
				this.field3419 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field3422[var5] = (short)var1.method327();
					this.field3419[var5] = (short)var1.method327();
				}
			} else if (var2 == 41) {
				var4 = var1.method278();
				this.field3420 = new short[var4];
				this.field3421 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field3420[var5] = (short)var1.method327();
					this.field3421[var5] = (short)var1.method327();
				}
			}
		}

	}

	public final class250 method2106(int var1) {
		class250 var3 = this.method2107();
		class250 var4;
		if (this.field3417 != -1 && var1 != -1) {
			var4 = class114.method702(this.field3417).method2055(var3, var1);
		} else {
			var4 = var3.method1478(true);
		}

		if (this.field3411 != 128 || this.field3423 != 128) {
			var4.method1465(this.field3411, this.field3423, this.field3411);
		}

		if (this.field3424 != 0) {
			if (this.field3424 == 90) {
				var4.method1462();
			}

			if (this.field3424 == 180) {
				var4.method1462();
				var4.method1462();
			}

			if (this.field3424 == 270) {
				var4.method1462();
				var4.method1462();
				var4.method1462();
			}
		}

		return var4;
	}

	public final class250 method2107() {
		class250 var2 = (class250)field3414.method1890((long)this.field3415);
		if (null == var2) {
			class48 var3 = class48.method373(field3412, this.field3427, 0);
			if (var3 == null) {
				return null;
			}

			int var4;
			if (null != this.field3422) {
				for (var4 = 0; var4 < this.field3422.length; ++var4) {
					var3.method372(this.field3422[var4], this.field3419[var4]);
				}
			}

			if (this.field3420 != null) {
				for (var4 = 0; var4 < this.field3420.length; ++var4) {
					var3.method363(this.field3420[var4], this.field3421[var4]);
				}
			}

			var2 = var3.method369(64 + this.field3416, 850 + this.field3426, -30, -50, -30);
			field3414.method1889(var2, (long)this.field3415);
		}

		return var2;
	}

	static Date method2109() throws ParseException {
		SimpleDateFormat var1 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var1.setLenient(false);
		StringBuilder var2 = new StringBuilder();
		String[] var3 = class116.field1105;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			String var5 = var3[var4];
			if (var5 == null) {
				class337.method1864(7);
				class174.method993("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}

			var2.append(var5);
		}

		var2.append("12");
		return var1.parse(var2.toString());
	}
}
