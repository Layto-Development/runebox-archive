import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@ObfInfo(name = "ha")
public class class460 extends class180 {
	@ObfInfo(name = "ae", desc = "Lnu;")
	public static class437 field3729;
	@ObfInfo(name = "au", desc = "Lnu;")
	public static class437 field3742;
	@ObfInfo(name = "ao", desc = "Lle;")
	public static class7 field3730;
	@ObfInfo(name = "at", desc = "Lle;")
	public static class7 field3731;
	@ObfInfo(name = "sl", desc = "Z")
	static boolean field3735;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 2044410789)
	int field3728;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1143254317)
	int field3732;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = 115934601)
	int field3733;
	@ObfInfo(name = "al", desc = "I", intMultiplier = 1484714697)
	int field3740;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -1490600117)
	int field3741;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 472229573)
	int field3743;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 13212181)
	int field3744;
	@ObfInfo(name = "aa", desc = "[S")
	short[] field3736;
	@ObfInfo(name = "af", desc = "[S")
	short[] field3737;
	@ObfInfo(name = "ad", desc = "[S")
	short[] field3738;
	@ObfInfo(name = "ap", desc = "[S")
	short[] field3739;
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1431367329)
	public int field3734;

	static {
		field3730 = new class7(64);
		field3731 = new class7(30);
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class460() {
		this.field3734 = -1;
		this.field3728 = 128;
		this.field3740 = 128;
		this.field3741 = 0;
		this.field3733 = 0;
		this.field3743 = 0;
	}

	@ObfInfo(name = "ae", desc = "(Ltm;B)V", opaqueValue = "2")
	void method2391(class280 var1) {
		while (true) {
			int var3 = var1.method1492();
			if (var3 == 0) {
				return;
			}

			this.method2388(var1, var3);
		}
	}

	@ObfInfo(name = "ao", desc = "(Ltm;IB)V", opaqueValue = "27")
	void method2388(class280 var1, int var2) {
		if (var2 == 1) {
			this.field3744 = var1.method1541();
		} else if (var2 == 2) {
			this.field3734 = var1.method1541();
		} else if (var2 == 4) {
			this.field3728 = var1.method1541();
		} else if (var2 == 5) {
			this.field3740 = var1.method1541();
		} else if (var2 == 6) {
			this.field3741 = var1.method1541();
		} else if (var2 == 7) {
			this.field3733 = var1.method1492();
		} else if (var2 == 8) {
			this.field3743 = var1.method1492();
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var4 = var1.method1492();
				this.field3739 = new short[var4];
				this.field3736 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field3739[var5] = (short)var1.method1541();
					this.field3736[var5] = (short)var1.method1541();
				}
			} else if (var2 == 41) {
				var4 = var1.method1492();
				this.field3737 = new short[var4];
				this.field3738 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field3737[var5] = (short)var1.method1541();
					this.field3738[var5] = (short)var1.method1541();
				}
			}
		}

	}

	@ObfInfo(name = "at", desc = "(II)Ljr;", opaqueValue = "-359824266")
	public final class384 method2389(int var1) {
		class384 var3 = this.method2390();
		class384 var4;
		if (this.field3734 != -1 && var1 != -1) {
			var4 = class202.method1149(this.field3734).method1141(var3, var1);
		} else {
			var4 = var3.method2071(true);
		}

		if (this.field3728 != 128 || this.field3740 != 128) {
			var4.method2058(this.field3728, this.field3740, this.field3728);
		}

		if (this.field3741 != 0) {
			if (this.field3741 == 90) {
				var4.method2055();
			}

			if (this.field3741 == 180) {
				var4.method2055();
				var4.method2055();
			}

			if (this.field3741 == 270) {
				var4.method2055();
				var4.method2055();
				var4.method2055();
			}
		}

		return var4;
	}

	@ObfInfo(name = "ac", desc = "(B)Ljr;", opaqueValue = "11")
	public final class384 method2390() {
		class384 var2 = (class384)field3731.method294((long)this.field3732);
		if (null == var2) {
			class445 var3 = class445.method2341(field3729, this.field3744, 0);
			if (var3 == null) {
				return null;
			}

			int var4;
			if (null != this.field3739) {
				for (var4 = 0; var4 < this.field3739.length; ++var4) {
					var3.method2340(this.field3739[var4], this.field3736[var4]);
				}
			}

			if (this.field3737 != null) {
				for (var4 = 0; var4 < this.field3737.length; ++var4) {
					var3.method2331(this.field3737[var4], this.field3738[var4]);
				}
			}

			var2 = var3.method2337(64 + this.field3733, 850 + this.field3743, -30, -50, -30);
			field3731.method293(var2, (long)this.field3732);
		}

		return var2;
	}

	@ObfInfo(name = "au", desc = "(IS)Lha;")
	public static class460 method2393(int var0) {
		class460 var2 = (class460)field3730.method294((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field3742.method2267(13, var0);
			var2 = new class460();
			var2.field3732 = var0;
			if (var3 != null) {
				var2.method2391(new class280(var3));
			}

			field3730.method293(var2, (long)var0);
			return var2;
		}
	}

	@ObfInfo(name = "aa", desc = "(I)Ljava/util/Date;", opaqueValue = "188290060")
	static Date method2392() throws ParseException {
		SimpleDateFormat var1 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
		var1.setLenient(false);
		StringBuilder var2 = new StringBuilder();
		String[] var3 = class162.field1539;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			String var5 = var3[var4];
			if (var5 == null) {
				class162.method924(7);
				class162.method936("Date not valid.", "Please ensure all characters are populated.", "");
				return null;
			}

			var2.append(var5);
		}

		var2.append("12");
		return var1.parse(var2.toString());
	}
}
