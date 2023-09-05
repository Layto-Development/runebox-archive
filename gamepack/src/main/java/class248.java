import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "qc")
public class class248 extends class153 {
	@ObfInfo(name = "iv", desc = "Lev;")
	static class265 field2079;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -727783247)
	int field2074;
	@ObfInfo(name = "ae", desc = "Lsl;")
	final class187 field2073;
	@ObfInfo(name = "ao", desc = "Lql;")
	final class207 field2078;
	@ObfInfo(name = "ai", desc = "B")
	public byte field2076;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 106239799)
	public int field2077;
	@ObfInfo(name = "at", desc = "Ljava/lang/String;")
	public String field2072;
	@ObfInfo(name = "ac", desc = "Ljava/lang/String;")
	public String field2075;

	@ObfInfo(name = "<init>", desc = "(Lsl;Lql;)V")
	public class248(class187 var1, class207 var2) {
		super(500);
		this.field2072 = null;
		this.field2075 = null;
		this.field2074 = 1;
		this.field2073 = var1;
		this.field2078 = var2;
	}

	@ObfInfo(name = "au", desc = "(I)Lqs;")
	class179 method902() {
		return new class55();
	}

	@ObfInfo(name = "ae", desc = "(IB)[Lqs;")
	class179[] method896(int var1) {
		return new class55[var1];
	}

	@ObfInfo(name = "ao", desc = "(Ljava/lang/String;I)V")
	final void method1333(String var1) {
		this.field2072 = class299.method1641(var1);
	}

	@ObfInfo(name = "az", desc = "(Ljava/lang/String;I)V")
	final void method1334(String var1) {
		this.field2075 = class299.method1641(var1);
	}

	@ObfInfo(name = "ap", desc = "(Ltm;II)V", opaqueValue = "-524626018")
	public final void method1335(class280 var1, int var2) {
		this.method1334(var1.method1500());
		long var4 = var1.method1497();
		long var7 = var4;
		String var6;
		int var9;
		if (var4 > 0L && var4 < 6582952005840035281L) {
			if (var4 % 37L == 0L) {
				var6 = null;
			} else {
				var9 = 0;

				for (long var10 = var4; 0L != var10; var10 /= 37L) {
					++var9;
				}

				StringBuilder var12 = new StringBuilder(var9);

				while (var7 != 0L) {
					long var13 = var7;
					var7 /= 37L;
					var12.append(class299.field2407[(int)(var13 - var7 * 37L)]);
				}

				var6 = var12.reverse().toString();
			}
		} else {
			var6 = null;
		}

		this.method1333(var6);
		this.field2076 = var1.method1493();
		short var15;
		if (var2 == 1) {
			var9 = var1.method1492();
			var15 = 255;
		} else {
			if (var2 != 2) {
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
			}

			var9 = var1.method1504();
			var15 = -1;
		}

		if (var15 != var9) {
			int var11 = var9;
			this.method884();

			for (int var16 = 0; var16 < var11; ++var16) {
				class55 var17 = (class55)this.method899(new class353(var1.method1500(), this.field2073));
				int var14 = var1.method1541();
				var17.method2219(var14, ++this.field2074 - 1);
				var17.field3236 = var1.method1493();
				var1.method1500();
				this.method1338(var17);
			}

		}
	}

	@ObfInfo(name = "aa", desc = "(Ltm;B)V")
	public final void method1336(class280 var1, byte var2) {
		class353 var3 = new class353(var1.method1500(), this.field2073);
		int var4 = var1.method1541();
		byte var5 = var1.method1493();
		boolean var6 = false;
		if (var5 == -128) {
			if (var2 == -1) {
				return;
			}

			var6 = true;
		}

		class55 var7;
		if (var6) {
			if (var2 == -1) {
				throw new IllegalStateException();
			}

			if (this.method905() == 0) {
				if (var2 == -1) {
					throw new IllegalStateException();
				}

				return;
			}

			var7 = (class55)this.method887(var3);
			if (var7 != null) {
				if (var2 == -1) {
					return;
				}

				if (var7.method2220() == var4) {
					if (var2 == -1) {
						throw new IllegalStateException();
					}

					this.method888(var7);
				}
			}
		} else {
			var1.method1500();
			var7 = (class55)this.method887(var3);
			if (null == var7) {
				if (var2 == -1) {
					throw new IllegalStateException();
				}

				if (this.method905() > super.field1478) {
					return;
				}

				var7 = (class55)this.method899(var3);
			}

			var7.method2219(var4, ++this.field2074 - 1);
			var7.field3236 = var5;
			this.method1338(var7);
		}

	}

	@ObfInfo(name = "af", desc = "(B)V", opaqueValue = "0")
	public final void method1337() {
		for (int var2 = 0; var2 < this.method905(); ++var2) {
			((class55)this.method892(var2)).method462();
		}

	}

	@ObfInfo(name = "ad", desc = "(B)V")
	public final void method1332(byte var1) {
		for (int var2 = 0; var2 < this.method905(); ++var2) {
			if (var1 != -1) {
				throw new IllegalStateException();
			}

			((class55)this.method892(var2)).method467();
		}

	}

	@ObfInfo(name = "aq", desc = "(Lqx;I)V", opaqueValue = "-327402440")
	final void method1338(class55 var1) {
		if (var1.method1019().equals(this.field2078.method1155())) {
			this.field2077 = var1.field3236;
		}

	}
}
