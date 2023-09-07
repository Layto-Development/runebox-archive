import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class class345 extends class77 {

	boolean field2613;

	boolean field2618;

	int[] field2615;

	public byte field2612;

	public byte field2616;

	public String field2617;

	public List field2614;

	public long field2619;

	static {
		new BitSet(65536);
	}

	public class345(class187 var1) {
		this.field2613 = true;
		this.field2617 = null;
		this.method1803(var1);
	}

	public int[] method1802() {
		if (null == this.field2615) {
			String[] var2 = new String[this.field2614.size()];
			this.field2615 = new int[this.field2614.size()];
			for (int var3 = 0; var3 < this.field2614.size(); this.field2615[var3] = var3++) {
				var2[var3] = ((class162) this.field2614.get(var3)).field1647.method320();
			}
			int[] var4 = this.field2615;
			class295.method1591(var2, var4, 0, var2.length - 1);
		}
		return this.field2615;
	}

	void method1798(class162 var1) {
		this.field2614.add(var1);
		this.field2615 = null;
	}

	void method1799(int var1) {
		this.field2614.remove(var1);
		this.field2615 = null;
	}

	public int method1800() {
		return this.field2614.size();
	}

	public int method1801(String var1) {
		if (!this.field2613) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var3 = 0; var3 < this.field2614.size(); ++var3) {
				if (((class162) this.field2614.get(var3)).field1647.method322().equalsIgnoreCase(var1)) {
					return var3;
				}
			}
			return -1;
		}
	}

	void method1803(class187 var1) {
		int var3 = var1.method1096();
		if ((var3 & 1) != 0) {
			this.field2618 = true;
		}
		if ((var3 & 2) != 0) {
			this.field2613 = true;
		}
		int var4 = 2;
		if ((var3 & 4) != 0) {
			var4 = var1.method1096();
		}
		super.field785 = var1.method1101();
		this.field2619 = var1.method1101();
		this.field2617 = var1.method1104();
		var1.method1103();
		this.field2616 = var1.method1097();
		this.field2612 = var1.method1097();
		int var5 = var1.method1145();
		if (var5 > 0) {
			this.field2614 = new ArrayList(var5);
			for (int var6 = 0; var6 < var5; ++var6) {
				class162 var7 = new class162();
				if (this.field2618) {
					var1.method1101();
				}
				if (this.field2613) {
					var7.field1647 = new class78(var1.method1104());
				}
				var7.field1648 = var1.method1097();
				var7.field1649 = var1.method1145();
				if (var4 >= 3) {
					var1.method1103();
				}
				this.field2614.add(var6, var7);
			}
		}
	}
}
