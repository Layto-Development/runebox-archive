import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class class138 extends class310 {

	public static class106 field1518;

	public static class106 field1519;

	public static class338 field1517;

	public static class338 field1530;

	static boolean field1523;

	int field1516;

	int field1520;

	int field1521;

	int field1528;

	int field1529;

	int field1531;

	int field1532;

	short[] field1524;

	short[] field1525;

	short[] field1526;

	short[] field1527;

	public int field1522;

	static {
		field1518 = new class106(64);
		field1519 = new class106(30);
	}

	class138() {
		this.field1522 = -1;
		this.field1516 = 128;
		this.field1528 = 128;
		this.field1529 = 0;
		this.field1521 = 0;
		this.field1531 = 0;
	}

	void method870(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method867(var1, var3);
		}
	}

	void method867(class187 var1, int var2) {
		if (var2 == 1) {
			this.field1532 = var1.method1145();
		} else if (var2 == 2) {
			this.field1522 = var1.method1145();
		} else if (var2 == 4) {
			this.field1516 = var1.method1145();
		} else if (var2 == 5) {
			this.field1528 = var1.method1145();
		} else if (var2 == 6) {
			this.field1529 = var1.method1145();
		} else if (var2 == 7) {
			this.field1521 = var1.method1096();
		} else if (var2 == 8) {
			this.field1531 = var1.method1096();
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var4 = var1.method1096();
				this.field1527 = new short[var4];
				this.field1524 = new short[var4];
				for (var5 = 0; var5 < var4; ++var5) {
					this.field1527[var5] = (short) var1.method1145();
					this.field1524[var5] = (short) var1.method1145();
				}
			} else if (var2 == 41) {
				var4 = var1.method1096();
				this.field1525 = new short[var4];
				this.field1526 = new short[var4];
				for (var5 = 0; var5 < var4; ++var5) {
					this.field1525[var5] = (short) var1.method1145();
					this.field1526[var5] = (short) var1.method1145();
				}
			}
		}
	}

	public final class113 method868(int var1) {
		class113 var3 = this.method869();
		class113 var4;
		if (this.field1522 != -1 && var1 != -1) {
			var4 = class67.method308(this.field1522).method300(var3, var1);
		} else {
			var4 = var3.method705(true);
		}
		if (this.field1516 != 128 || this.field1528 != 128) {
			var4.method692(this.field1516, this.field1528, this.field1516);
		}
		if (this.field1529 != 0) {
			if (this.field1529 == 90) {
				var4.method689();
			}
			if (this.field1529 == 180) {
				var4.method689();
				var4.method689();
			}
			if (this.field1529 == 270) {
				var4.method689();
				var4.method689();
				var4.method689();
			}
		}
		return var4;
	}

	public final class113 method869() {
		class113 var2 = (class113) field1519.method648((long) this.field1520);
		if (null == var2) {
			class462 var3 = class462.method2259(field1517, this.field1532, 0);
			if (var3 == null) {
				return null;
			}
			int var4;
			if (null != this.field1527) {
				for (var4 = 0; var4 < this.field1527.length; ++var4) {
					var3.method2258(this.field1527[var4], this.field1524[var4]);
				}
			}
			if (this.field1525 != null) {
				for (var4 = 0; var4 < this.field1525.length; ++var4) {
					var3.method2249(this.field1525[var4], this.field1526[var4]);
				}
			}
			var2 = var3.method2255(64 + this.field1521, 850 + this.field1531, -30, -50, -30);
			field1519.method647(var2, (long) this.field1520);
		}
		return var2;
	}

	public static class138 method872(int var0) {
		class138 var2 = (class138) field1518.method648((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field1530.method1762(13, var0);
			var2 = new class138();
			var2.field1520 = var0;
			if (var3 != null) {
				var2.method870(new class187(var3));
			}
			field1518.method647(var2, (long) var0);
			return var2;
		}
	}

	static Date method871() throws ParseException {
		SimpleDateFormat var1 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var1.setLenient(false);
		StringBuilder var2 = new StringBuilder();
		String[] var3 = class174.field1737;
		for (int var4 = 0; var4 < var3.length; ++var4) {
			String var5 = var3[var4];
			if (var5 == null) {
				class174.method1030(7);
				class174.method1042("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}
			var2.append(var5);
		}
		var2.append("12");
		return var1.parse(var2.toString());
	}
}
