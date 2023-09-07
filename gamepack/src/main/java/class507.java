import java.util.HashMap;

public class class507 {

	static int[] field4073;

	class338 field4072;

	class338 field4074;

	HashMap field4071;

	public class507(class338 var1, class338 var2) {
		this.field4074 = var1;
		this.field4072 = var2;
		this.field4071 = new HashMap();
	}

	public HashMap method2455(class152[] var1) {
		HashMap var3 = new HashMap();
		class152[] var4 = var1;
		for (int var5 = 0; var5 < var4.length; ++var5) {
			class152 var6 = var4[var5];
			if (this.field4071.containsKey(var6)) {
				var3.put(var6, this.field4071.get(var6));
			} else {
				class338 var8 = this.field4074;
				class338 var9 = this.field4072;
				String var10 = var6.field1583;
				class61 var7;
				if (!var8.method1784(var10, "")) {
					var7 = null;
				} else {
					int var11 = var8.method1787(var10);
					int var12 = var8.method1779(var11, "");
					var7 = class494.method2368(var8, var9, var11, var12);
				}
				if (null != var7) {
					this.field4071.put(var6, var7);
					var3.put(var6, var7);
				}
			}
		}
		return var3;
	}
}
