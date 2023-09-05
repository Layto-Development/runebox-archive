import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "pp")
public class class191 extends class236 {
	@ObfInfo(name = "au", desc = "Lnu;")
	class437 field1717;
	@ObfInfo(name = "ae", desc = "Lnu;")
	class437 field1718;
	@ObfInfo(name = "ap", desc = "Lnu;")
	class437 field1719;

	@ObfInfo(name = "<init>", desc = "(Lpm;Lnu;Lnu;Lnu;)V")
	public class191(class236 var1, class437 var2, class437 var3, class437 var4) {
		super(var1);
		this.field1717 = var2;
		this.field1718 = var3;
		this.field1719 = var4;
		super.field1978 = "LoadSongTask";
	}

	@ObfInfo(name = "au", desc = "(I)Z", opaqueValue = "1553685320")
	public boolean method1242() {
		int var2 = 0;
		Iterator var3 = class303.field2447.iterator();

		while (true) {
			while (var3.hasNext()) {
				class503 var4 = (class503)var3.next();
				if (null != var4 && var4.field4063.field1413 > 1 && var4.field4063.method783()) {
					this.method1245("Attempted to load patches of already loading midiplayer!");
					return true;
				}

				if (var4 != null && !var4.field4062) {
					try {
						if (null != var4.field4060 && var4.field4057 != -1 && var4.field4058 != -1) {
							if (null == var4.field4067) {
								var4.field4067 = class352.method1932(var4.field4060, var4.field4057, var4.field4058);
								if (null == var4.field4067) {
									continue;
								}
							}

							if (null == var4.field4066) {
								var4.field4066 = new class293(this.field1719, this.field1718);
							}

							if (var4.field4063.method778(var4.field4067, this.field1717, var4.field4066)) {
								++var2;
								var4.field4062 = true;
								var4.field4063.method779();
							}
						} else {
							++var2;
						}
					} catch (Exception var6) {
						class159.method913((String)null, var6);
						this.method1245(var6.getMessage());
						return true;
					}
				} else {
					++var2;
				}
			}

			if (var2 == class303.field2447.size()) {
				return true;
			}

			return false;
		}
	}
}
