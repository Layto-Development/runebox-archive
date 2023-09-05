import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Arrays;

@ObfInfo(name = "bj")
public class class435 {
	@ObfInfo(name = "gx", desc = "Ljava/lang/String;")
	static String field3280;
	@ObfInfo(name = "az", desc = "[I")
	int[] field3278;
	@ObfInfo(name = "ap", desc = "[I")
	int[] field3279;

	@ObfInfo(name = "<init>", desc = "()V")
	public class435() {
		this.field3278 = new int[112];
		this.field3279 = new int[192];
		Arrays.fill(this.field3278, 3);
		Arrays.fill(this.field3279, 3);
	}

	@ObfInfo(name = "au", desc = "(IIS)V", opaqueValue = "32766")
	public void method2261(int var1, int var2) {
		if (this.method2266(var1) && this.method2263(var2)) {
			this.field3278[var1] = var2;
		}

	}

	@ObfInfo(name = "ae", desc = "(CIB)V", opaqueValue = "4")
	public void method2264(char var1, int var2) {
		if (this.method2259(var1) && this.method2263(var2)) {
			this.field3279[var1] = var2;
		}

	}

	@ObfInfo(name = "ao", desc = "(II)I")
	public int method2258(int var1) {
		return this.method2266(var1) ? this.field3278[var1] : 0;
	}

	@ObfInfo(name = "at", desc = "(CB)I", opaqueValue = "63")
	public int method2262(char var1) {
		return this.method2259(var1) ? this.field3279[var1] : 0;
	}

	@ObfInfo(name = "ac", desc = "(II)Z", opaqueValue = "-1037418609")
	public boolean method2256(int var1) {
		return this.method2266(var1) && (this.field3278[var1] == 1 || this.field3278[var1] == 3);
	}

	@ObfInfo(name = "ai", desc = "(CB)Z", opaqueValue = "1")
	public boolean method2260(char var1) {
		return this.method2259(var1) && (this.field3279[var1] == 1 || this.field3279[var1] == 3);
	}

	@ObfInfo(name = "az", desc = "(IB)Z", opaqueValue = "31")
	public boolean method2265(int var1) {
		return this.method2266(var1) && (this.field3278[var1] == 2 || this.field3278[var1] == 3);
	}

	@ObfInfo(name = "ap", desc = "(CI)Z", opaqueValue = "-479848257")
	public boolean method2257(char var1) {
		return this.method2259(var1) && (this.field3279[var1] == 2 || this.field3279[var1] == 3);
	}

	@ObfInfo(name = "aa", desc = "(II)Z", opaqueValue = "198143448")
	boolean method2266(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfInfo(name = "af", desc = "(CB)Z", opaqueValue = "9")
	boolean method2259(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfInfo(name = "ad", desc = "(IB)Z", opaqueValue = "93")
	boolean method2263(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}
}
