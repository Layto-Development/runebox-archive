import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Arrays;

@ObfInfo(name = "iz")
public class class320 implements class53 {
	@ObfInfo(name = "aq", desc = "[Z")
	boolean[] field2589;
	@ObfInfo(name = "af", desc = "[Z")
	boolean[] field2597;
	@ObfInfo(name = "ad", desc = "[Z")
	boolean[] field2598;
	@ObfInfo(name = "au", desc = "[C")
	char[] field2595;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = 2074848823)
	int field2593;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1576200325)
	int field2594;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -399975453)
	int field2596;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 2039492397)
	int field2600;
	@ObfInfo(name = "ac", desc = "[I")
	int[] field2592;
	@ObfInfo(name = "ae", desc = "[I")
	int[] field2599;
	@ObfInfo(name = "al", desc = "C")
	public char field2588;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -2122790357)
	public int field2591;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 36436435)
	public int field2601;
	@ObfInfo(name = "ao", desc = "[I")
	public int[] field2590;

	@ObfInfo(name = "<init>", desc = "()V")
	public class320() {
		this.field2595 = new char[128];
		this.field2599 = new int[128];
		this.field2590 = new int[128];
		this.field2591 = 0;
		this.field2592 = new int[128];
		this.field2593 = 0;
		this.field2600 = 0;
		this.field2594 = 0;
		this.field2596 = 0;
		this.field2597 = new boolean[112];
		this.field2598 = new boolean[112];
		this.field2589 = new boolean[112];
	}

	@ObfInfo(name = "au", desc = "(II)Z")
	public boolean method460(int var1) {
		this.method1785(var1);
		this.field2597[var1] = true;
		this.field2598[var1] = true;
		this.field2589[var1] = false;
		this.field2590[++this.field2591 - 1] = var1;
		return true;
	}

	@ObfInfo(name = "ae", desc = "(II)Z")
	public boolean method458(int var1) {
		this.field2597[var1] = false;
		this.field2598[var1] = false;
		this.field2589[var1] = true;
		this.field2592[++this.field2593 - 1] = var1;
		return true;
	}

	@ObfInfo(name = "ao", desc = "(CI)Z", opaqueValue = "-1305793592")
	public boolean method459(char var1) {
		int var3 = 1 + this.field2594 & 127;
		if (this.field2600 != var3) {
			this.field2599[this.field2594] = -1;
			this.field2595[this.field2594] = var1;
			this.field2594 = var3;
		}

		return false;
	}

	@ObfInfo(name = "ar", desc = "(IB)V", opaqueValue = "11")
	void method1785(int var1) {
		int var3 = this.field2594 + 1 & 127;
		if (this.field2600 != var3) {
			this.field2599[this.field2594] = var1;
			this.field2595[this.field2594] = 0;
			this.field2594 = var3;
		}

	}

	@ObfInfo(name = "at", desc = "(ZI)Z")
	public boolean method461(boolean var1) {
		return false;
	}

	@ObfInfo(name = "ab", desc = "(I)V")
	public void method1779() {
		this.field2600 = this.field2596;
		this.field2596 = this.field2594;
		this.field2591 = 0;
		this.field2593 = 0;
		Arrays.fill(this.field2598, false);
		Arrays.fill(this.field2589, false);
	}

	@ObfInfo(name = "ag", desc = "(I)Z", opaqueValue = "-1344001483")
	public final boolean method1784() {
		if (this.field2600 == this.field2596) {
			return false;
		} else {
			this.field2601 = this.field2599[this.field2600];
			this.field2588 = this.field2595[this.field2600];
			this.field2600 = 1 + this.field2600 & 127;
			return true;
		}
	}

	@ObfInfo(name = "am", desc = "(II)Z", opaqueValue = "179310078")
	public boolean method1780(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2598[var1] : false;
	}

	@ObfInfo(name = "ax", desc = "(II)Z", opaqueValue = "-1070806225")
	public boolean method1783(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2597[var1] : false;
	}

	@ObfInfo(name = "ah", desc = "(IB)Z", opaqueValue = "9")
	public boolean method1778(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2589[var1] : false;
	}

	@ObfInfo(name = "as", desc = "(I)[I", opaqueValue = "899492950")
	public int[] method1781() {
		int[] var2 = new int[this.field2591];

		for (int var3 = 0; var3 < this.field2591; ++var3) {
			var2[var3] = this.field2590[var3];
		}

		return var2;
	}

	@ObfInfo(name = "ay", desc = "(B)[I", opaqueValue = "14")
	public int[] method1782() {
		int[] var2 = new int[this.field2593];

		for (int var3 = 0; var3 < this.field2593; ++var3) {
			var2[var3] = this.field2592[var3];
		}

		return var2;
	}
}
