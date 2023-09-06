import java.util.Iterator;

public class class233 extends class232 {
	static class337 field2104;

	public class233(class232 var1) {
		super(var1);
		super.field2101 = "AddRequestTask";
	}

	public boolean method1330() {
		while (!class92.field910.isEmpty()) {
			class104 var2 = (class104)class92.field910.peek();
			if (var2 == null) {
				class92.field910.pop();
			} else {
				var2.field1032 = this.method1338();
				class92.field903.add(var2);
				class92.field910.pop();
			}
		}

		return true;
	}

	class18 method1338() {
		class18 var2 = null;
		Iterator var3 = class92.field901.iterator();

		while (true) {
			class18 var4;
			do {
				do {
					if (!var3.hasNext()) {
						if (null != var2) {
							++var2.field431;
							if (var2.method158() == 0 && var2.method163()) {
								var2.method168();
								var2.method166();
								var2.method130(0);
							}
						}

						return var2;
					}

					var4 = (class18)var3.next();
				} while(var4 == null);
			} while(null != var2 && var2.field431 <= var4.field431 && (var4.method158() != 0 || !var4.method163()));

			var2 = var4;
		}
	}

	static final void method1339() {
		if (class524.field4239) {
			for (int var1 = 0; var1 < class481.field4085; ++var1) {
				class287 var2 = Client.field176[class481.field4086[var1]];
				var2.method1645();
			}

			class524.field4239 = false;
		}

	}
}
