import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ObfInfo(name = "tx")
public class class328 extends class180 {
	@ObfInfo(name = "at", desc = "[Ltb;")
	class49[] field2628;
	@ObfInfo(name = "ac", desc = "Ljava/util/List;")
	List field2629;

	@ObfInfo(name = "<init>", desc = "(Lnu;II)V")
	public class328(class437 var1, int var2, int var3) {
		byte[] var4 = var1.method2267(var2, var3 + 1);
		this.method1803(new class280(var4));
	}

	@ObfInfo(name = "<init>", desc = "(Lnu;I)V")
	public class328(class437 var1, int var2) {
		byte[] var3 = var1.method2267(var2, 0);
		this.method1803(new class280(var3));
	}

	@ObfInfo(name = "au", desc = "(Ltm;I)V", opaqueValue = "1059234847")
	void method1803(class280 var1) {
		int var3 = var1.method1508();
		this.field2628 = new class49[var3];
		this.field2629 = new ArrayList(var3);

		for (int var4 = 0; var4 < var3; ++var4) {
			this.field2628[var4] = (class49)class216.method1198(class49.method452(), var1.method1492());
			int var5 = var1.method1508();
			HashMap var6 = new HashMap(var5);

			while (var5-- > 0) {
				Object var7 = this.field2628[var4].method451(var1);
				int var8 = var1.method1508();
				ArrayList var9 = new ArrayList();

				while (var8-- > 0) {
					int var10 = var1.method1508();
					var9.add(var10);
				}

				var6.put(var7, var9);
			}

			this.field2629.add(var4, var6);
		}

	}

	@ObfInfo(name = "ae", desc = "(Ljava/lang/Object;IB)Ljava/util/List;")
	public List method1804(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}

		Map var4 = (Map)this.field2629.get(var2);
		return (List)var4.get(var1);
	}
}
