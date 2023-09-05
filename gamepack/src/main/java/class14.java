import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "ci")
public class class14 {
	@ObfInfo(name = "az", desc = "I", intMultiplier = -1624494161)
	int field349;
	@ObfInfo(name = "at", desc = "Lsl;")
	final class187 field348;
	@ObfInfo(name = "ai", desc = "Lqq;")
	public final class262 field350;
	@ObfInfo(name = "ac", desc = "Lqk;")
	public final class467 field351;

	@ObfInfo(name = "<init>", desc = "(Lsl;)V")
	class14(class187 var1) {
		this.field349 = 0;
		this.field348 = var1;
		this.field351 = new class467(var1);
		this.field350 = new class262(var1);
	}

	@ObfInfo(name = "au", desc = "(I)Z", opaqueValue = "17891600")
	boolean method307() {
		return this.field349 == 2;
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	final void method308() {
		this.field349 = 1;
	}

	@ObfInfo(name = "ao", desc = "(Ltm;II)V", opaqueValue = "345121952")
	final void method319(class280 var1, int var2) {
		this.field351.method2403(var1, var2, (byte)-1);
		this.field349 = 2;

		for (int var4 = 0; var4 < class183.field1652; ++var4) {
			class439 var5 = Client.field200[class183.field1653[var4]];
			var5.method2299();
		}

		Iterator var7 = class159.field1504.iterator();

		while (var7.hasNext()) {
			class212 var6 = (class212)var7.next();
			var6.method1181();
		}

		if (class54.field716 != null) {
			class54.field716.method1337();
		}

	}

	@ObfInfo(name = "at", desc = "(I)V", opaqueValue = "-676446193")
	final void method309() {
		for (class47 var2 = (class47)this.field351.field3770.method2249(); var2 != null; var2 = (class47)this.field351.field3770.method2248()) {
			if ((long)var2.field567 < class43.method443() / 1000L - 5L) {
				if (var2.field565 > 0) {
					class159.method914(5, "", var2.field564 + class453.field3558);
				}

				if (var2.field565 == 0) {
					class159.method914(5, "", var2.field564 + class453.field3452);
				}

				var2.method1153();
			}
		}

	}

	@ObfInfo(name = "ac", desc = "(B)V")
	final void method310() {
		this.field349 = 0;
		this.field351.method884();
		this.field350.method884();
	}

	@ObfInfo(name = "ai", desc = "(Luc;ZI)Z", opaqueValue = "496878304")
	final boolean method311(class353 var1, boolean var2) {
		if (null == var1) {
			return false;
		} else if (var1.equals(class126.field1164.field3315)) {
			return true;
		} else {
			return this.field351.method2402(var1, var2);
		}
	}

	@ObfInfo(name = "az", desc = "(Luc;I)Z", opaqueValue = "1978543188")
	final boolean method312(class353 var1) {
		if (null == var1) {
			return false;
		} else {
			return this.field350.method900(var1);
		}
	}

	@ObfInfo(name = "ap", desc = "(Ljava/lang/String;B)V", opaqueValue = "9")
	final void method313(String var1) {
		if (var1 != null) {
			class353 var3 = new class353(var1, this.field348);
			if (var3.method1936()) {
				if (this.method314()) {
					method323(class453.field3577);
				} else if (class126.field1164.field3315.equals(var3)) {
					method325();
				} else if (this.method311(var3, false)) {
					method326(var1);
				} else if (this.method312(var3)) {
					method323(class453.field3583 + var1 + class453.field3584);
				} else {
					method322(var1);
				}
			}
		}
	}

	@ObfInfo(name = "al", desc = "(I)Z", opaqueValue = "636690078")
	final boolean method314() {
		return this.field351.method885() || this.field351.method905() >= 200 && Client.field156 != 1;
	}

	@ObfInfo(name = "an", desc = "(Ljava/lang/String;I)V", opaqueValue = "541901649")
	final void method315(String var1) {
		if (null != var1) {
			class353 var3 = new class353(var1, this.field348);
			if (var3.method1936()) {
				if (this.method318()) {
					method323(class453.field3579);
				} else if (class126.field1164.field3315.equals(var3)) {
					method327();
				} else if (this.method312(var3)) {
					method321(var1);
				} else if (this.method311(var3, false)) {
					method323(class453.field3397 + var1 + class453.field3556);
				} else {
					class121 var4 = class121.method689(class480.field3882, Client.field92.field2665);
					var4.field1141.method1481(class280.method1555(var1));
					var4.field1141.method1484(var1);
					Client.field92.method1821(var4);
				}
			}
		}
	}

	@ObfInfo(name = "ag", desc = "(I)Z", opaqueValue = "901944118")
	final boolean method318() {
		return this.field350.method885() || this.field350.method905() >= 100 && Client.field156 != 1;
	}

	@ObfInfo(name = "am", desc = "(Ljava/lang/String;I)V", opaqueValue = "-595757003")
	final void method316(String var1) {
		if (null != var1) {
			class353 var3 = new class353(var1, this.field348);
			if (var3.method1936()) {
				if (this.field351.method903(var3)) {
					Client.method180();
					class121 var4 = class121.method689(class480.field3862, Client.field92.field2665);
					var4.field1141.method1481(class280.method1555(var1));
					var4.field1141.method1484(var1);
					Client.field92.method1821(var4);
				}

				for (int var6 = 0; var6 < class183.field1652; ++var6) {
					class439 var5 = Client.field200[class183.field1653[var6]];
					var5.method2299();
				}

				Iterator var7 = class159.field1504.iterator();

				while (var7.hasNext()) {
					class212 var8 = (class212)var7.next();
					var8.method1181();
				}

				if (null != class54.field716) {
					class54.field716.method1337();
				}

			}
		}
	}

	@ObfInfo(name = "ax", desc = "(Ljava/lang/String;ZI)V", opaqueValue = "-1861839196")
	public final void method317(String var1, boolean var2) {
		if (null != var1) {
			class353 var4 = new class353(var1, this.field348);
			if (var4.method1936()) {
				if (this.field350.method903(var4)) {
					Client.method180();
					if (var2) {
						class121 var5 = class121.method689(class480.field3884, Client.field92.field2665);
						var5.field1141.method1481(class280.method1555(var1));
						var5.field1141.method1484(var1);
						Client.field92.method1821(var5);
					}
				}

				Client.method272();
			}
		}
	}

	@ObfInfo(name = "as", desc = "(Luc;I)Z", opaqueValue = "1418526490")
	final boolean method320(class353 var1) {
		class317 var3 = (class317)this.field351.method886(var1);
		return null != var3 && var3.method2221();
	}

	@ObfInfo(name = "aa", desc = "(Ljava/lang/String;B)V")
	static final void method323(String var0) {
		class159.method914(30, "", var0);
	}

	@ObfInfo(name = "af", desc = "(Ljava/lang/String;B)V")
	static final void method326(String var0) {
		method323(var0 + class453.field3399);
	}

	@ObfInfo(name = "ad", desc = "(I)V")
	static final void method325() {
		method323(class453.field3581);
	}

	@ObfInfo(name = "aq", desc = "(Ljava/lang/String;I)V")
	static final void method322(String var0) {
		class121 var2 = class121.method689(class480.field3834, Client.field92.field2665);
		var2.field1141.method1481(class280.method1555(var0));
		var2.field1141.method1484(var0);
		Client.field92.method1821(var2);
	}

	@ObfInfo(name = "ar", desc = "(Ljava/lang/String;I)V")
	static final void method321(String var0) {
		method323(var0 + class453.field3580);
	}

	@ObfInfo(name = "ab", desc = "(I)V")
	static final void method327() {
		method323(class453.field3582);
	}

	@ObfInfo(name = "ah", desc = "(Ljava/lang/String;II)V")
	static final void method324(String var0, int var1) {
		class121 var3 = class121.method689(class480.field3901, Client.field92.field2665);
		var3.field1141.method1481(class280.method1555(var0) + 1);
		var3.field1141.method1481(var1);
		var3.field1141.method1484(var0);
		Client.field92.method1821(var3);
	}
}
