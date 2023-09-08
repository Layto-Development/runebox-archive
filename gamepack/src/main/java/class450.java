public class class450 extends class463 {

	final class79 field3469;

	public class450(class79 var1) {
		super(400);
		this.field3469 = var1;
	}

	@Override
	class194 method2282() {
		return new class95();
	}

	@Override
	class194[] method2276(int var1) {
		return new class95[var1];
	}

	public void method2226(class187 var1, int var2) {
		while (var1.field1832 < var2) {
			int var4 = var1.method1096();
			if (var4 == 4) {
				UsernameDisplayName var10 = new UsernameDisplayName(var1.method1104(), this.field3469);
				if (!var10.method323()) {
					throw new IllegalStateException();
				}
				boolean var11 = false;
				class147.field1555.method949(var10.method322(), false);
			} else {
				boolean var5 = (var4 & 1) != 0;
				UsernameDisplayName var6 = new UsernameDisplayName(var1.method1104(), this.field3469);
				UsernameDisplayName var7 = new UsernameDisplayName(var1.method1104(), this.field3469);
				var1.method1104();
				if (!var6.method323()) {
					throw new IllegalStateException();
				}
				class95 var8 = (class95) this.method2267(var6);
				if (var5) {
					class95 var9 = (class95) this.method2267(var7);
					if (null != var9 && var8 != var9) {
						if (var8 != null) {
							this.method2268(var9);
						} else {
							var8 = var9;
						}
					}
				}
				if (null != var8) {
					this.method2271(var8, var6, var7);
				} else if (this.method2285() < 400) {
					int var12 = this.method2285();
					var8 = (class95) this.method2269(var6, var7);
					var8.field1217 = var12;
				}
			}
		}
	}
}
