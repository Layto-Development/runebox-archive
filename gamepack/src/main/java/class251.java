import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class class251 {
	static final class251 field2335;
	static final class251 field2336;
	static final class251 field2337;
	static final class251 field2338;
	static final class251 field2339;
	static final class251 field2340;
	static final class251 field2341;
	static final class251 field2342;
	static final class251 field2343;
	static final class251 field2344;
	static final class251 field2345;
	static final class251 field2346;
	static final class251 field2347;
	static final class251 field2348;
	static final class251 field2350;
	static final class251 field2351;
	int field2349;

	static {
		field2337 = new class251(0);
		field2336 = new class251(1);
		field2342 = new class251(2);
		field2338 = new class251(3);
		field2335 = new class251(4);
		field2340 = new class251(5);
		field2351 = new class251(6);
		field2341 = new class251(7);
		field2344 = new class251(8);
		field2339 = new class251(9);
		field2345 = new class251(10);
		field2346 = new class251(11);
		field2347 = new class251(12);
		field2348 = new class251(13);
		field2343 = new class251(14);
		field2350 = new class251(15);
	}

	class251(int var1) {
		this.field2349 = var1;
	}

	static void method1484() {
		class116.field1110 = class116.field1110.trim();
		if (class116.field1110.length() == 0) {
			class174.method993(class433.field3801, class433.field3802, class433.field3803);
		} else {
			long var2;
			try {
				URL var4 = new URL(class230.method1326("services", false) + "m=accountappeal/login.ws");
				URLConnection var5 = var4.openConnection();
				var5.setRequestProperty("connection", "close");
				var5.setDoInput(true);
				var5.setDoOutput(true);
				var5.setConnectTimeout(5000);
				OutputStreamWriter var6 = new OutputStreamWriter(var5.getOutputStream());
				var6.write("data1=req");
				var6.flush();
				InputStream var7 = var5.getInputStream();
				class42 var8 = new class42(new byte[1000]);

				while (true) {
					int var9 = var7.read(var8.field525, var8.field527, 1000 - var8.field527);
					if (var9 == -1) {
						var8.field527 = 0;
						long var12 = var8.method283();
						var2 = var12;
						break;
					}

					var8.field527 += var9;
					if (var8.field527 >= 1000) {
						var2 = 0L;
						break;
					}
				}
			} catch (Exception var11) {
				var2 = 0L;
			}

			int var1;
			if (var2 == 0L) {
				var1 = 5;
			} else {
				var1 = class174.method992(var2, class116.field1110);
			}

			switch(var1) {
			case 2:
				class174.method993(class433.field3804, class433.field3805, class433.field3806);
				class337.method1864(6);
				break;
			case 3:
				class174.method993(class433.field3838, class433.field3808, class433.field3613);
				break;
			case 4:
				class174.method993(class433.field3810, class433.field3811, class433.field3795);
				break;
			case 5:
				class174.method993(class433.field3813, class433.field3814, class433.field3807);
				break;
			case 6:
				class174.method993(class433.field3816, class433.field3577, class433.field3680);
				break;
			case 7:
				class174.method993(class433.field3545, class433.field3820, class433.field3644);
			}

		}
	}

	static final void method1485(boolean var0) {
		class77.method535();
		++Client.field68.field2432;
		if (Client.field68.field2432 >= 50 || var0) {
			Client.field68.field2432 = 0;
			if (!Client.field70 && Client.field68.method1573() != null) {
				class160 var2 = class85.method556(class129.field1216, Client.field68.field2426);
				Client.field68.method1570(var2);

				try {
					Client.field68.method1569();
				} catch (IOException var4) {
					Client.field70 = true;
				}
			}

		}
	}
}
