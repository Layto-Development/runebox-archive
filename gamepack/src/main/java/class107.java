public class class107 extends class463 {

	int field1292;

	final class79 field1291;

	public class104 field1290;

	public class107(class79 var1) {
		super(400);
		this.field1292 = 1;
		this.field1290 = new class104();
		this.field1291 = var1;
	}

	@Override
	class194 method2282() {
		return new class175();
	}

	@Override
	class194[] method2276(int var1) {
		return new class175[var1];
	}

	public boolean method651(UsernameDisplayName var1, boolean var2) {
		class175 var4 = (class175) this.method2266(var1);
		return null != var4;
	}

	public void method652(class187 var1, int var2, byte var3) {
		while (true) {
			if (var1.field1832 < var2) {
				boolean var4 = var1.method1096() == 1;
				UsernameDisplayName var5 = new UsernameDisplayName(var1.method1104(), this.field1291);
				UsernameDisplayName var6 = new UsernameDisplayName(var1.method1104(), this.field1291);
				int var7 = var1.method1145();
				int var8 = var1.method1096();
				int var9 = var1.method1096();
				boolean var10 = (var9 & 2) != 0;
				boolean var11 = (var9 & 1) != 0;
				if (var7 > 0) {
					var1.method1104();
					var1.method1096();
					var1.method1100();
				}
				var1.method1104();
				if (var5 != null && var5.method323()) {
					class175 var12 = (class175) this.method2267(var5);
					if (var4) {
						class175 var13 = (class175) this.method2267(var6);
						if (var13 != null && var13 != var12) {
							if (var12 != null) {
								this.method2268(var13);
							} else {
								var12 = var13;
							}
						}
					}
					if (null != var12) {
						this.method2271(var12, var5, var6);
						if (var12.field1577 != var7) {
							boolean var15 = true;
							for (class280 var14 = (class280) this.field1290.method642(); null != var14; var14 = (class280) this.field1290.method641()) {
								if (var14.field2282.equals(var5)) {
									if (var7 != 0 && var14.field2283 == 0) {
										var14.method926();
										var15 = false;
									} else if (var7 == 0 && var14.field2283 != 0) {
										var14.method926();
										var15 = false;
									}
								}
							}
							if (var15) {
								this.field1290.method640(new class280(var5, var7));
							}
						}
					} else {
						if (this.method2285() >= 400) {
							continue;
						}
						var12 = (class175) this.method2269(var5, var6);
					}
					if (var7 != var12.field1577) {
						var12.field1576 = ++this.field1292 - 1;
						if (var12.field1577 == -1 && var7 == 0) {
							var12.field1576 = -(var12.field1576 * -1297576351) * -585067103;
						}
						var12.field1577 = var7;
					}
					var12.field1578 = var8;
					var12.field1753 = var10;
					var12.field1754 = var11;
					continue;
				}
				throw new IllegalStateException();
			}
			this.method2286();
			return;
		}
	}
}
