public class class28 extends class463 {

	static class346 field142;

	int field137;

	final class297 field141;

	final class79 field136;

	public byte field139;

	public int field140;

	public String field135;

	public String field138;

	public class28(class79 var1, class297 var2) {
		super(500);
		this.field135 = null;
		this.field138 = null;
		this.field137 = 1;
		this.field136 = var1;
		this.field141 = var2;
	}

	@Override
	class194 method2282() {
		return new class65();
	}

	@Override
	class194[] method2276(int var1) {
		return new class65[var1];
	}

	final void method80(String var1) {
		this.field135 = class337.method1761(var1);
	}

	final void method81(String var1) {
		this.field138 = class337.method1761(var1);
	}

	public final void method82(class187 var1, int var2) {
		this.method81(var1.method1104());
		long var4 = var1.method1101();
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
					var12.append(class337.field2566[(int) (var13 - var7 * 37L)]);
				}
				var6 = var12.reverse().toString();
			}
		} else {
			var6 = null;
		}
		this.method80(var6);
		this.field139 = var1.method1097();
		short var15;
		if (var2 == 1) {
			var9 = var1.method1096();
			var15 = 255;
		} else {
			if (var2 != 2) {
				throw new IllegalArgumentException("Invalid friend chat full update version: " + var2);
			}
			var9 = var1.method1108();
			var15 = -1;
		}
		if (var15 != var9) {
			int var11 = var9;
			this.method2264();
			for (int var16 = 0; var16 < var11; ++var16) {
				class65 var17 = (class65) this.method2279(new class78(var1.method1104(), this.field136));
				int var14 = var1.method1145();
				var17.method905(var14, ++this.field137 - 1);
				var17.field1578 = var1.method1097();
				var1.method1104();
				this.method85(var17);
			}
		}
	}

	public final void method83(class187 var1, byte var2) {
		class78 var3 = new class78(var1.method1104(), this.field136);
		int var4 = var1.method1145();
		byte var5 = var1.method1097();
		boolean var6 = false;
		if (var5 == -128) {
			var6 = true;
		}
		class65 var7;
		if (var6) {
			if (this.method2285() == 0) {
				return;
			}
			var7 = (class65) this.method2267(var3);
			if (var7 != null && var7.method906() == var4) {
				this.method2268(var7);
			}
		} else {
			var1.method1104();
			var7 = (class65) this.method2267(var3);
			if (null == var7) {
				if (this.method2285() > super.field3547) {
					return;
				}
				var7 = (class65) this.method2279(var3);
			}
			var7.method905(var4, ++this.field137 - 1);
			var7.field1578 = var5;
			this.method85(var7);
		}
	}

	public final void method84() {
		for (int var2 = 0; var2 < this.method2285(); ++var2) {
			((class65) this.method2272(var2)).method286();
		}
	}

	public final void method79(byte var1) {
		for (int var2 = 0; var2 < this.method2285(); ++var2) {
			((class65) this.method2272(var2)).method291();
		}
	}

	final void method85(class65 var1) {
		if (var1.method1195().equals(this.field141.method1594())) {
			this.field140 = var1.field1578;
		}
	}
}
