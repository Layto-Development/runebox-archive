import java.util.HashMap;

public class class155 {
	static int[] field1455;
	class215 field1454;
	class215 field1456;
	HashMap field1453;

	public class155(class215 var1, class215 var2) {
		this.field1456 = var1;
		this.field1454 = var2;
		this.field1453 = new HashMap();
	}

	public HashMap method887(class182[] var1) {
		HashMap var3 = new HashMap();
		class182[] var4 = var1;

		for (int var5 = 0; var5 < var4.length; ++var5) {
			class182 var6 = var4[var5];
			if (this.field1453.containsKey(var6)) {
				var3.put(var6, this.field1453.get(var6));
			} else {
				class215 var8 = this.field1456;
				class215 var9 = this.field1454;
				String var10 = var6.field1718;
				class253 var7;
				if (!var8.method1234(var10, "")) {
					var7 = null;
				} else {
					int var11 = var8.method1237(var10);
					int var12 = var8.method1229(var11, "");
					var7 = class528.method2553(var8, var9, var11, var12);
				}

				if (null != var7) {
					this.field1453.put(var6, var7);
					var3.put(var6, var7);
				}
			}
		}

		return var3;
	}
}
