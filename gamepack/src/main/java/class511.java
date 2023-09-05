import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.ArrayList;
import java.util.Iterator;

@ObfInfo(name = "pv")
public class class511 extends class236 {
	@ObfInfo(name = "au", desc = "Ljava/util/ArrayList;")
	ArrayList field4096;

	@ObfInfo(name = "<init>", desc = "(Lpm;Ljava/util/ArrayList;)V")
	public class511(class236 var1, ArrayList var2) {
		super(var1);
		super.field1978 = "ClearRequestTask";
		this.field4096 = var2;
	}

	@ObfInfo(name = "au", desc = "(I)Z", opaqueValue = "1553685320")
	public boolean method1242() {
		if (this.field4096.isEmpty()) {
			return true;
		} else {
			Iterator var2 = this.field4096.iterator();

			while (var2.hasNext()) {
				class503 var3 = (class503)var2.next();

				try {
					if (class303.field2447.contains(var3)) {
						if (null == var3) {
							class303.field2447.remove(var3);
						} else {
							if (var3.field4063.field1413 > 0) {
								--var3.field4063.field1413;
							}

							if (var3.field4063.field1413 == 0) {
								var3.field4063.method814();
								var3.field4063.method812();
								var3.field4063.method777(0);
							}

							int var4 = var3.field4057;
							int var5 = var3.field4058;
							Iterator var6 = class303.field2450.iterator();

							while (var6.hasNext()) {
								class128 var7 = (class128)var6.next();
								var7.method702(var4, var5);
							}

							class303.field2447.remove(var3);
						}
					}
				} catch (Exception var8) {
					class159.method913((String)null, var8);
					this.method1245(var8.getMessage());
					class303.field2447.clear();
					return true;
				}
			}

			return true;
		}
	}
}
