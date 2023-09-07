import java.util.List;

public class class29 extends class310 {

	public static class338 field147;

	static class106 field144;

	static class214 field143;

	static class250 field148;

	static List field146;

	public boolean field145;

	static {
		field144 = new class106(64);
	}

	class29() {
		this.field145 = false;
	}

	void method89(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			this.method88(var1, var3);
		}
	}

	void method88(class187 var1, int var2) {
		if (var2 == 2) {
			this.field145 = true;
		}
	}

	public static class29 method90(int var0) {
		class29 var2 = (class29) field144.method648((long) var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field147.method1762(19, var0);
			var2 = new class29();
			if (null != var3) {
				var2.method89(new class187(var3));
			}
			field144.method647(var2, (long) var0);
			return var2;
		}
	}
}
