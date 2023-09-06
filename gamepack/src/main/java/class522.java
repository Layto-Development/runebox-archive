public class class522 {
	static class342 field4234;
	byte field4230;
	public int field4228;
	public int field4229;
	public int field4231;
	public int field4232;
	public int field4233;

	public class522() {
	}

	public class522(class42 var1, boolean var2) {
		this.field4230 = var1.method279();
		this.field4229 = var1.method327();
		this.field4233 = var1.method282();
		this.field4231 = var1.method282();
		this.field4232 = var1.method282();
		this.field4228 = var1.method282();
		if (var2) {
			int var4 = 0;
			boolean var5 = false;

			while (true) {
				int var6 = var1.method278();
				if (var6 == 255) {
					Integer var3 = var5 ? var4 : null;
					this.method2533(var3);
					break;
				}

				if (var6 != 0) {
					throw new IllegalStateException("");
				}

				while (true) {
					int var7 = var1.method278();
					if (var7 == 255) {
						break;
					}

					--var1.field527;
					if (var1.method327() != 0) {
						throw new IllegalStateException("");
					}

					if (var5) {
						throw new IllegalStateException("");
					}

					var4 = var1.method282();
					var5 = true;
				}
			}
		}

	}

	void method2533(Integer var1) {
	}

	public int method2534() {
		return this.field4230 & 7;
	}

	public int method2535() {
		return (this.field4230 & 8) == 8 ? 1 : 0;
	}

	void method2532(int var1) {
		this.field4230 &= -8;
		this.field4230 = (byte)(this.field4230 | var1 & 7);
	}

	void method2536(int var1) {
		this.field4230 &= -9;
		if (var1 == 1) {
			this.field4230 = (byte)(this.field4230 | 8);
		}

	}

	static void method2537(int var0) {
		class176.field1696 = var0;
		class176.field1697 = new class176[var0];
		class505.field4176 = 0;
	}
}
