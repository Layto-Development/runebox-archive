import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "pd")
public class class404 extends class236 {
	@ObfInfo(name = "ae", desc = "Z")
	static boolean field3128;

	@ObfInfo(name = "<init>", desc = "(Lpm;)V")
	public class404(class236 var1) {
		super(var1);
		super.field1978 = "StartSongTask";
	}

	@ObfInfo(name = "au", desc = "(I)Z", opaqueValue = "1553685320")
	public boolean method1242() {
		Iterator var2 = class303.field2447.iterator();

		while (var2.hasNext()) {
			class503 var3 = (class503)var2.next();
			if (null != var3 && !var3.field4064 && null != var3.field4063) {
				try {
					var3.field4063.method780();
					var3.field4063.method777(0);
					if (var3.field4067 != null) {
						var3.field4063.method782(var3.field4067, var3.field4061);
					}

					var3.field4067 = null;
					var3.field4066 = null;
					var3.field4060 = null;
					var3.field4064 = true;
				} catch (Exception var5) {
					class159.method913((String)null, var5);
					this.method1245(var5.getMessage());
					return true;
				}
			}
		}

		super.field1980 = true;
		return true;
	}
}
