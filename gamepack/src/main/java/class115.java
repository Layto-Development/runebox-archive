import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "pf")
public class class115 extends class236 {
	@ObfInfo(name = "tw", desc = "Lbb;")
	static class429 field1108;

	@ObfInfo(name = "<init>", desc = "(Lpm;)V")
	public class115(class236 var1) {
		super(var1);
		super.field1978 = "AddRequestTask";
	}

	@ObfInfo(name = "au", desc = "(I)Z", opaqueValue = "1553685320")
	public boolean method1242() {
		while (!class303.field2454.isEmpty()) {
			class503 var2 = (class503)class303.field2454.peek();
			if (var2 == null) {
				class303.field2454.pop();
			} else {
				var2.field4063 = this.method645();
				class303.field2447.add(var2);
				class303.field2454.pop();
			}
		}

		return true;
	}

	@ObfInfo(name = "ae", desc = "(B)Llf;", opaqueValue = "0")
	class137 method645() {
		class137 var2 = null;
		Iterator var3 = class303.field2445.iterator();

		while (true) {
			class137 var4;
			do {
				do {
					if (!var3.hasNext()) {
						if (null != var2) {
							++var2.field1413;
							if (var2.method804() == 0 && var2.method809()) {
								var2.method814();
								var2.method812();
								var2.method777(0);
							}
						}

						return var2;
					}

					var4 = (class137)var3.next();
				} while(var4 == null);
			} while(null != var2 && var2.field1413 <= var4.field1413 && (var4.method804() != 0 || !var4.method809()));

			var2 = var4;
		}
	}
}
