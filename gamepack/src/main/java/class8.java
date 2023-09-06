import java.util.Iterator;
import java.util.LinkedList;

public class class8 {
	static int field347;
	boolean field345;
	class29 field340;
	int field335;
	int field337;
	int field339;
	int field341;
	int field342;
	int field343;
	int field344;
	String field336;
	String field338;
	LinkedList field346;

	public class8() {
		this.field344 = -1;
		this.field342 = -1;
		this.field339 = -1;
		this.field340 = null;
		this.field341 = Integer.MAX_VALUE;
		this.field335 = 0;
		this.field343 = Integer.MAX_VALUE;
		this.field337 = 0;
		this.field345 = false;
	}

	public void method66(class42 var1, int var2) {
		this.field344 = var2;
		this.field336 = var1.method286();
		this.field338 = var1.method286();
		this.field340 = new class29(var1.method282());
		this.field342 = var1.method282();
		var1.method278();
		this.field345 = var1.method278() == 1;
		this.field339 = var1.method278();
		int var4 = var1.method278();
		this.field346 = new LinkedList();

		for (int var5 = 0; var5 < var4; ++var5) {
			this.field346.add(this.method83(var1));
		}

		this.method65();
	}

	class405 method83(class42 var1) {
		int var3 = var1.method278();
		class498[] var4 = new class498[]{class498.field4142, class498.field4144, class498.field4143, class498.field4149};
		class498 var5 = (class498)class451.method2249(var4, var3);
		Object var6 = null;
		switch(var5.field4145) {
		case 0:
			var6 = new class414();
			break;
		case 1:
			var6 = new class59();
			break;
		case 2:
			var6 = new class117();
			break;
		case 3:
			var6 = new class186();
			break;
		default:
			throw new IllegalStateException("");
		}

		((class405)var6).method2095(var1);
		return (class405)var6;
	}

	public boolean method67(int var1, int var2, int var3) {
		Iterator var5 = this.field346.iterator();

		class405 var6;
		do {
			if (!var5.hasNext()) {
				return false;
			}

			var6 = (class405)var5.next();
		} while(!var6.method2093(var1, var2, var3));

		return true;
	}

	public boolean method70(int var1, int var2) {
		int var4 = var1 / 64;
		int var5 = var2 / 64;
		if (var4 >= this.field341 && var4 <= this.field335) {
			if (var5 >= this.field343 && var5 <= this.field337) {
				Iterator var6 = this.field346.iterator();

				class405 var7;
				do {
					if (!var6.hasNext()) {
						return false;
					}

					var7 = (class405)var6.next();
				} while(!var7.method2094(var1, var2));

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public int[] method81(int var1, int var2, int var3) {
		Iterator var5 = this.field346.iterator();

		class405 var6;
		do {
			if (!var5.hasNext()) {
				return null;
			}

			var6 = (class405)var5.next();
		} while(!var6.method2093(var1, var2, var3));

		return var6.method2096(var1, var2, var3);
	}

	public class29 method68(int var1, int var2) {
		Iterator var4 = this.field346.iterator();

		class405 var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (class405)var4.next();
		} while(!var5.method2094(var1, var2));

		return var5.method2097(var1, var2);
	}

	void method65() {
		Iterator var2 = this.field346.iterator();

		while (var2.hasNext()) {
			class405 var3 = (class405)var2.next();
			var3.method2098(this);
		}

	}

	public int method77() {
		return this.field344;
	}

	public boolean method69() {
		return this.field345;
	}

	public String method76() {
		return this.field336;
	}

	public String method71() {
		return this.field338;
	}

	int method72() {
		return this.field342;
	}

	public int method73() {
		return this.field339;
	}

	public int method74() {
		return this.field341;
	}

	public int method87() {
		return this.field335;
	}

	public int method84() {
		return this.field343;
	}

	public int method82() {
		return this.field337;
	}

	public int method86() {
		return this.field340.field460;
	}

	public int method78() {
		return this.field340.field461;
	}

	public int method79() {
		return this.field340.field462;
	}

	public class29 method80() {
		return new class29(this.field340);
	}

	static void method88(int var0) {
	}

	public static boolean method85() {
		boolean var1 = false;
		boolean var2 = false;
		if (!class92.field905.isEmpty()) {
			class232 var3 = (class232)class92.field905.get(0);
			if (var3 == null) {
				class92.field905.remove(0);
			} else if (var3.method1330()) {
				if (var3.method1331()) {
					System.out.println("Error in midimanager.service: " + var3.method1329());
					var1 = true;
				} else {
					if (var3.method1332() != null) {
						class92.field905.add(1, var3.method1332());
					}

					var2 = var3.method1334();
				}

				class92.field905.remove(0);
			} else {
				var2 = var3.method1334();
			}
		}

		if (var1) {
			class92.field905.clear();
			class312.method1747();
		}

		return var2;
	}

	static void method75(class60 var0, int var1, int var2) {
		if (var0.field649 == 0) {
			var0.field645 = var0.field653;
		} else if (var0.field649 == 1) {
			var0.field645 = (var1 - var0.field659) / 2 + var0.field653;
		} else if (var0.field649 == 2) {
			var0.field645 = var1 - var0.field659 - var0.field653;
		} else if (var0.field649 == 3) {
			var0.field645 = var0.field653 * var1 >> 14;
		} else if (var0.field649 == 4) {
			var0.field645 = (var1 * var0.field653 >> 14) + (var1 - var0.field659) / 2;
		} else {
			var0.field645 = var1 - var0.field659 - (var1 * var0.field653 >> 14);
		}

		if (var0.field650 == 0) {
			var0.field658 = var0.field654;
		} else if (var0.field650 == 1) {
			var0.field658 = var0.field654 + (var2 - var0.field636) / 2;
		} else if (var0.field650 == 2) {
			var0.field658 = var2 - var0.field636 - var0.field654;
		} else if (var0.field650 == 3) {
			var0.field658 = var0.field654 * var2 >> 14;
		} else if (var0.field650 == 4) {
			var0.field658 = (var0.field654 * var2 >> 14) + (var2 - var0.field636) / 2;
		} else {
			var0.field658 = var2 - var0.field636 - (var2 * var0.field654 >> 14);
		}

	}
}
