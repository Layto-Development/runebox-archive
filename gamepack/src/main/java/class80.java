import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class class80 extends class310 {

	class272[] field800;

	List field801;

	public class80(class338 var1, int var2, int var3) {
		byte[] var4 = var1.method1762(var2, var3 + 1);
		this.method324(new class187(var4));
	}

	public class80(class338 var1, int var2) {
		byte[] var3 = var1.method1762(var2, 0);
		this.method324(new class187(var3));
	}

	void method324(class187 var1) {
		int var3 = var1.method1112();
		this.field800 = new class272[var3];
		this.field801 = new ArrayList(var3);
		for (int var4 = 0; var4 < var3; ++var4) {
			this.field800[var4] = (class272) class433.method2167(class272.method1518(), var1.method1096());
			int var5 = var1.method1112();
			HashMap var6 = new HashMap(var5);
			while (var5-- > 0) {
				Object var7 = this.field800[var4].method1517(var1);
				int var8 = var1.method1112();
				ArrayList var9 = new ArrayList();
				while (var8-- > 0) {
					int var10 = var1.method1112();
					var9.add(var10);
				}
				var6.put(var7, var9);
			}
			this.field801.add(var4, var6);
		}
	}

	public List method325(Object var1, int var2) {
		if (var2 < 0) {
			var2 = 0;
		}
		Map var4 = (Map) this.field801.get(var2);
		return (List) var4.get(var1);
	}
}
