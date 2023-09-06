import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class448 extends class218 {
	class140[] field3938;
	List field3939;

	public class448(class215 var1, int var2, int var3) {
		byte[] var4 = var1.method1212(var2, var3 + 1);
		this.method2237(new class42(var4));
	}

	public class448(class215 var1, int var2) {
		byte[] var3 = var1.method1212(var2, 0);
		this.method2237(new class42(var3));
	}

	void method2237(class42 var1) {
		int var3 = var1.method294();
		this.field3938 = new class140[var3];
		this.field3939 = new ArrayList(var3);

		for (int var4 = 0; var4 < var3; ++var4) {
			this.field3938[var4] = (class140)class451.method2249(class140.method841(), var1.method278());
			int var5 = var1.method294();
			HashMap var6 = new HashMap(var5);

			while (var5-- > 0) {
				Object var7 = this.field3938[var4].method840(var1);
				int var8 = var1.method294();
				ArrayList var9 = new ArrayList();

				while (var8-- > 0) {
					int var10 = var1.method294();
					var9.add(var10);
				}

				var6.put(var7, var9);
			}

			this.field3939.add(var4, var6);
		}

	}

	public List method2238(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var4 = (Map)this.field3939.get(var2);
		return (List)var4.get(var1);
	}
}
