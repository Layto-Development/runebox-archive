import java.util.Iterator;
import java.util.LinkedList;

public class class277 {

	static int field2267;

	boolean field2265;

	class402 field2260;

	int field2255;

	int field2257;

	int field2259;

	int field2261;

	int field2262;

	int field2263;

	int field2264;

	String field2256;

	String field2258;

	LinkedList field2266;

	public class277() {
		this.field2264 = -1;
		this.field2262 = -1;
		this.field2259 = -1;
		this.field2260 = null;
		this.field2261 = Integer.MAX_VALUE;
		this.field2255 = 0;
		this.field2263 = Integer.MAX_VALUE;
		this.field2257 = 0;
		this.field2265 = false;
	}

	public void method1533(class187 var1, int var2) {
		this.field2264 = var2;
		this.field2256 = var1.method1104();
		this.field2258 = var1.method1104();
		this.field2260 = new class402(var1.method1100());
		this.field2262 = var1.method1100();
		var1.method1096();
		this.field2265 = var1.method1096() == 1;
		this.field2259 = var1.method1096();
		int var4 = var1.method1096();
		this.field2266 = new LinkedList();
		for (int var5 = 0; var5 < var4; ++var5) {
			this.field2266.add(this.method1549(var1));
		}
		this.method1532();
	}

	class254 method1549(class187 var1) {
		int var3 = var1.method1096();
		class359[] var4 = new class359[] { class359.field2849, class359.field2851, class359.field2850, class359.field2856 };
		class359 var5 = (class359) class433.method2167(var4, var3);
		Object var6 = null;
		switch(var5.field2852) {
			case 0:
				var6 = new class444();
				break;
			case 1:
				var6 = new class464();
				break;
			case 2:
				var6 = new class160();
				break;
			case 3:
				var6 = new class205();
				break;
			default:
				throw new IllegalStateException("");
		}
		((class254) var6).method1448(var1);
		return (class254) var6;
	}

	public boolean method1534(int var1, int var2, int var3) {
		Iterator var5 = this.field2266.iterator();
		class254 var6;
		do {
			if (!var5.hasNext()) {
				return false;
			}
			var6 = (class254) var5.next();
		} while (!var6.method1446(var1, var2, var3));
		return true;
	}

	public boolean method1537(int var1, int var2) {
		int var4 = var1 / 64;
		int var5 = var2 / 64;
		if (var4 >= this.field2261 && var4 <= this.field2255) {
			if (var5 >= this.field2263 && var5 <= this.field2257) {
				Iterator var6 = this.field2266.iterator();
				class254 var7;
				do {
					if (!var6.hasNext()) {
						return false;
					}
					var7 = (class254) var6.next();
				} while (!var7.method1447(var1, var2));
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public int[] method1547(int var1, int var2, int var3) {
		Iterator var5 = this.field2266.iterator();
		class254 var6;
		do {
			if (!var5.hasNext()) {
				return null;
			}
			var6 = (class254) var5.next();
		} while (!var6.method1446(var1, var2, var3));
		return var6.method1449(var1, var2, var3);
	}

	public class402 method1535(int var1, int var2) {
		Iterator var4 = this.field2266.iterator();
		class254 var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}
			var5 = (class254) var4.next();
		} while (!var5.method1447(var1, var2));
		return var5.method1450(var1, var2);
	}

	void method1532() {
		Iterator var2 = this.field2266.iterator();
		while (var2.hasNext()) {
			class254 var3 = (class254) var2.next();
			var3.method1451(this);
		}
	}

	public int method1543() {
		return this.field2264;
	}

	public boolean method1536() {
		return this.field2265;
	}

	public String method1542() {
		return this.field2256;
	}

	public String method1538() {
		return this.field2258;
	}

	int method1539() {
		return this.field2262;
	}

	public int method1540() {
		return this.field2259;
	}

	public int method1541() {
		return this.field2261;
	}

	public int method1552() {
		return this.field2255;
	}

	public int method1550() {
		return this.field2263;
	}

	public int method1548() {
		return this.field2257;
	}

	public int method1551() {
		return this.field2260.field3174;
	}

	public int method1544() {
		return this.field2260.field3175;
	}

	public int method1545() {
		return this.field2260.field3176;
	}

	public class402 method1546() {
		return new class402(this.field2260);
	}
}
