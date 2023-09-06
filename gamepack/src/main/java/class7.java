import java.util.ArrayList;

public class class7 {
	int field329;
	int field331;
	int field332;
	int field333;
	long field325;
	long field326;
	long field327;
	long field328;
	long field334;
	public boolean field330;

	public class7() {
		this.field326 = -1L;
		this.field325 = -1L;
		this.field330 = false;
		this.field327 = 0L;
		this.field328 = 0L;
		this.field334 = 0L;
		this.field329 = 0;
		this.field331 = 0;
		this.field332 = 0;
		this.field333 = 0;
	}

	public void method58() {
		this.field326 = class172.method977();
	}

	public void method64() {
		if (-1L != this.field326) {
			this.field328 = class172.method977() - this.field326;
			this.field326 = -1L;
		}

	}

	public void method59(int var1) {
		this.field325 = class172.method977();
		this.field329 = var1;
	}

	public void method60() {
		if (-1L != this.field325) {
			this.field327 = class172.method977() - this.field325;
			this.field325 = -1L;
		}

		++this.field332;
		this.field330 = true;
	}

	public void method61() {
		this.field330 = false;
		this.field331 = 0;
	}

	public void method57() {
		this.method60();
	}

	public void method63(class42 var1) {
		class516.method2498(var1, this.field328);
		class516.method2498(var1, this.field327);
		class516.method2498(var1, this.field334);
		var1.method308(this.field329);
		var1.method308(this.field331);
		var1.method308(this.field332);
		var1.method308(this.field333);
	}

	static void method62(class215 var0, class215 var1, boolean var2, int var3) {
		if (class216.field2024) {
			if (var3 == 4) {
				class337.method1864(4);
			}

		} else {
			if (var3 == 0) {
				class143.method846(var2);
			} else {
				class337.method1864(var3);
			}

			class266.method1545();
			byte[] var5 = var0.method1231("title.jpg", "");
			class116.field1090 = class418.method2149(var5);
			class169.field1646 = class116.field1090.method704();
			int var6 = Client.field4;
			if ((var6 & class162.field1520.method1970()) != 0) {
				class474.field4030 = class439.method2208(var1, "logo_deadman_mode", "");
			} else if ((var6 & class162.field1521.method1970()) != 0) {
				class474.field4030 = class439.method2208(var1, "logo_seasonal_mode", "");
			} else if ((var6 & class162.field1499.method1970()) != 0) {
				class474.field4030 = class439.method2208(var1, "logo_speedrunning", "");
			} else {
				class474.field4030 = class439.method2208(var1, "logo", "");
			}

			class116.field1088 = class439.method2208(var1, "titlebox", "");
			class466.field4000 = class439.method2208(var1, "titlebutton", "");
			class116.field1089 = class439.method2208(var1, "titlebutton_large", "");
			class281.field2507 = class439.method2208(var1, "play_now_text", "");
			class439.method2208(var1, "titlebutton_wide42,1", "");
			class116.field1087 = class466.method2281(var1, "runes", "");
			class149.field1401 = class466.method2281(var1, "title_mute", "");
			class116.field1085 = class439.method2208(var1, "options_radio_buttons,0", "");
			class341.field2959 = class439.method2208(var1, "options_radio_buttons,4", "");
			class73.field821 = class439.method2208(var1, "options_radio_buttons,2", "");
			class334.field2929 = class439.method2208(var1, "options_radio_buttons,6", "");
			class458.field3972 = class116.field1085.field450;
			class71.field818 = class116.field1085.field451;
			class196.field1790 = new class95(class116.field1087);
			if (var2) {
				class116.field1110 = "";
				class116.field1103 = "";
				class116.field1105 = new String[8];
				class116.field1102 = 0;
			}

			class242.field2213 = 0;
			class110.field1061 = "";
			class116.field1107 = true;
			class116.field1111 = false;
			if (!class176.field1701.method2509()) {
				ArrayList var7 = new ArrayList();
				var7.add(new class104(class465.field3998, "scape main", "", 255, false));
				class81.method545(var7, 0, 0, 0, 100, false);
			} else {
				class167.method924(0, 0);
			}

			class296.method1689();
			class76.method534().method1648(false);
			class216.field2024 = true;
			class116.field1086 = (class237.field2181 - 765) / 2;
			class116.field1092 = 202 + class116.field1086;
			class315.field2826 = 180 + class116.field1092;
			class116.field1090.method712(class116.field1086, 0);
			class169.field1646.method712(382 + class116.field1086, 0);
			class474.field4030.method207(class116.field1086 + 382 - class474.field4030.field450 / 2, 18);
		}
	}
}
