import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfInfo(name = "go")
public class class143 extends class155 {
	@ObfInfo(name = "ae", desc = "Z")
	boolean field1433;
	@ObfInfo(name = "au", desc = "Z")
	boolean field1438;
	@ObfInfo(name = "at", desc = "[I")
	int[] field1435;
	@ObfInfo(name = "az", desc = "B")
	public byte field1432;
	@ObfInfo(name = "ap", desc = "B")
	public byte field1436;
	@ObfInfo(name = "ai", desc = "Ljava/lang/String;")
	public String field1437;
	@ObfInfo(name = "ao", desc = "Ljava/util/List;")
	public List field1434;
	@ObfInfo(name = "ac", desc = "J", longMultiplier = -1404514629729281795L)
	public long field1439;

	static {
		new BitSet(65536);
	}

	@ObfInfo(name = "<init>", desc = "(Ltm;)V")
	public class143(class280 var1) {
		this.field1433 = true;
		this.field1437 = null;
		this.method837(var1);
	}

	@ObfInfo(name = "au", desc = "(B)[I", opaqueValue = "1")
	public int[] method836() {
		if (null == this.field1435) {
			String[] var2 = new String[this.field1434.size()];
			this.field1435 = new int[this.field1434.size()];

			for (int var3 = 0; var3 < this.field1434.size(); this.field1435[var3] = var3++) {
				var2[var3] = ((class524)this.field1434.get(var3)).field4198.method1933();
			}

			int[] var4 = this.field1435;
			class330.method1807(var2, var4, 0, var2.length - 1);
		}

		return this.field1435;
	}

	@ObfInfo(name = "ae", desc = "(Lfu;I)V")
	void method832(class524 var1) {
		this.field1434.add(var1);
		this.field1435 = null;
	}

	@ObfInfo(name = "ao", desc = "(II)V")
	void method833(int var1) {
		this.field1434.remove(var1);
		this.field1435 = null;
	}

	@ObfInfo(name = "at", desc = "(B)I")
	public int method834() {
		return this.field1434.size();
	}

	@ObfInfo(name = "ac", desc = "(Ljava/lang/String;S)I", opaqueValue = "179")
	public int method835(String var1) {
		if (!this.field1433) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var3 = 0; var3 < this.field1434.size(); ++var3) {
				if (((class524)this.field1434.get(var3)).field4198.method1935().equalsIgnoreCase(var1)) {
					return var3;
				}
			}

			return -1;
		}
	}

	@ObfInfo(name = "ai", desc = "(Ltm;I)V", opaqueValue = "381864012")
	void method837(class280 var1) {
		int var3 = var1.method1492();
		if ((var3 & 1) != 0) {
			this.field1438 = true;
		}

		if ((var3 & 2) != 0) {
			this.field1433 = true;
		}

		int var4 = 2;
		if ((var3 & 4) != 0) {
			var4 = var1.method1492();
		}

		super.field1483 = var1.method1497();
		this.field1439 = var1.method1497();
		this.field1437 = var1.method1500();
		var1.method1499();
		this.field1436 = var1.method1493();
		this.field1432 = var1.method1493();
		int var5 = var1.method1541();
		if (var5 > 0) {
			this.field1434 = new ArrayList(var5);

			for (int var6 = 0; var6 < var5; ++var6) {
				class524 var7 = new class524();
				if (this.field1438) {
					var1.method1497();
				}

				if (this.field1433) {
					var7.field4198 = new class353(var1.method1500());
				}

				var7.field4199 = var1.method1493();
				var7.field4200 = var1.method1541();
				if (var4 >= 3) {
					var1.method1499();
				}

				this.field1434.add(var6, var7);
			}
		}

	}
}
