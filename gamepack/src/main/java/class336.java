import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.IOException;

@ObfInfo(name = "er")
public class class336 {
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1913648071)
	static int field2661;
	@ObfInfo(name = "aa", desc = "Z")
	boolean field2669;
	@ObfInfo(name = "au", desc = "Lqi;")
	class112 field2675;
	@ObfInfo(name = "ai", desc = "Lto;")
	class259 field2666;
	@ObfInfo(name = "at", desc = "Ltm;")
	class280 field2664;
	@ObfInfo(name = "ae", desc = "Loc;")
	class471 field2670;
	@ObfInfo(name = "az", desc = "Llg;")
	class52 field2662;
	@ObfInfo(name = "aq", desc = "Llg;")
	class52 field2667;
	@ObfInfo(name = "al", desc = "Llg;")
	class52 field2673;
	@ObfInfo(name = "an", desc = "Llg;")
	class52 field2674;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -1761871959)
	int field2663;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -218156893)
	int field2668;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1043697015)
	int field2671;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 807217953)
	int field2672;
	@ObfInfo(name = "ac", desc = "Lux;")
	public class199 field2665;

	@ObfInfo(name = "<init>", desc = "()V")
	class336() {
		this.field2670 = new class471();
		this.field2663 = 0;
		this.field2664 = new class280(5000);
		this.field2666 = new class259(40000);
		this.field2662 = null;
		this.field2668 = 0;
		this.field2669 = true;
		this.field2672 = 0;
		this.field2671 = 0;
	}

	@ObfInfo(name = "au", desc = "(I)V")
	final void method1826() {
		this.field2670.method2416();
		this.field2663 = 0;
	}

	@ObfInfo(name = "ae", desc = "(B)V", opaqueValue = "0")
	final void method1820() throws IOException {
		if (this.field2675 != null && this.field2663 > 0) {
			this.field2664.field2254 = 0;

			while (true) {
				class121 var2 = (class121)this.field2670.method2423();
				if (null == var2 || var2.field1138 > this.field2664.field2252.length - this.field2664.field2254) {
					this.field2675.method620(this.field2664.field2252, 0, this.field2664.field2254);
					this.field2671 = 0;
					break;
				}

				this.field2664.method1486(var2.field1141.field2252, 0, var2.field1138);
				this.field2663 -= var2.field1138;
				var2.method907();
				var2.field1141.method1480();
				var2.method687();
			}
		}

	}

	@ObfInfo(name = "ao", desc = "(Lly;B)V")
	public final void method1821(class121 var1) {
		this.field2670.method2417(var1);
		var1.field1138 = var1.field1141.field2254;
		var1.field1141.field2254 = 0;
		this.field2663 += var1.field1138;
	}

	@ObfInfo(name = "at", desc = "(Lqi;B)V")
	void method1822(class112 var1) {
		this.field2675 = var1;
	}

	@ObfInfo(name = "ac", desc = "(I)V", opaqueValue = "1660698829")
	void method1825() {
		if (this.field2675 != null) {
			this.field2675.method622();
			this.field2675 = null;
		}

	}

	@ObfInfo(name = "ai", desc = "(I)V")
	void method1823() {
		this.field2675 = null;
	}

	@ObfInfo(name = "az", desc = "(I)Lqi;")
	class112 method1824() {
		return this.field2675;
	}
}
