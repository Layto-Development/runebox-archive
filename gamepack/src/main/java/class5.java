import java.io.IOException;

public class class5 {
	public static int field322;
	// $FF: synthetic field
	final class226 this$0;
	public float[] field319;
	public int field318;
	public int field320;
	public int field321;
	public String field323;

	class5(class226 var1) {
		this.this$0 = var1;
		this.field319 = new float[4];
		this.field320 = 1;
		this.field321 = 1;
		this.field318 = 0;
	}

	public static int method52(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}

	static void method53(class42 var0) {
		if (Client.field286 != null) {
			var0.method272(Client.field286, 0, Client.field286.length);
		} else {
			byte[] var3 = new byte[24];

			try {
				class297.field2738.method2126(0L);
				class297.field2738.method2127(var3);

				int var4;
				for (var4 = 0; var4 < 24 && var3[var4] == 0; ++var4) {
				}

				if (var4 >= 24) {
					throw new IOException();
				}
			} catch (Exception var6) {
				for (int var5 = 0; var5 < 24; ++var5) {
					var3[var5] = -1;
				}
			}

			var0.method272(var3, 0, var3.length);
		}
	}
}
