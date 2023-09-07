import java.util.Iterator;

public class class493 extends class17 {

	static class537 field3983;

	public class493(class17 var1) {
		super(var1);
		super.field89 = "AddRequestTask";
	}

	@Override
	public boolean method51() {
		while (!class388.field3097.isEmpty()) {
			class490 var2 = (class490) class388.field3097.peek();
			if (var2 == null) {
				class388.field3097.pop();
			} else {
				var2.field3956 = this.method2357();
				class388.field3090.add(var2);
				class388.field3097.pop();
			}
		}
		return true;
	}

	class62 method2357() {
		class62 var2 = null;
		Iterator var3 = class388.field3088.iterator();
		while (true) {
			class62 var4;
			do {
				do {
					if (!var3.hasNext()) {
						if (null != var2) {
							++var2.field679;
							if (var2.method269() == 0 && var2.method274()) {
								var2.method279();
								var2.method277();
								var2.method242(0);
							}
						}
						return var2;
					}
					var4 = (class62) var3.next();
				} while (var4 == null);
			} while (null != var2 && var2.field679 <= var4.field679 && (var4.method269() != 0 || !var4.method274()));
			var2 = var4;
		}
	}
}
