import java.util.Arrays;

public class class479 implements class188 {

	boolean[] field3749;

	boolean[] field3757;

	boolean[] field3758;

	char[] field3755;

	int field3753;

	int field3754;

	int field3756;

	int field3760;

	int[] field3752;

	int[] field3759;

	public char field3748;

	public int field3751;

	public int field3761;

	public int[] field3750;

	public class479() {
		this.field3755 = new char[128];
		this.field3759 = new int[128];
		this.field3750 = new int[128];
		this.field3751 = 0;
		this.field3752 = new int[128];
		this.field3753 = 0;
		this.field3760 = 0;
		this.field3754 = 0;
		this.field3756 = 0;
		this.field3757 = new boolean[112];
		this.field3758 = new boolean[112];
		this.field3749 = new boolean[112];
	}

	@Override
	public boolean method1162(int var1) {
		this.method2325(var1);
		this.field3757[var1] = true;
		this.field3758[var1] = true;
		this.field3749[var1] = false;
		this.field3750[++this.field3751 - 1] = var1;
		return true;
	}

	@Override
	public boolean method1160(int var1) {
		this.field3757[var1] = false;
		this.field3758[var1] = false;
		this.field3749[var1] = true;
		this.field3752[++this.field3753 - 1] = var1;
		return true;
	}

	@Override
	public boolean method1161(char var1) {
		int var3 = 1 + this.field3754 & 127;
		if (this.field3760 != var3) {
			this.field3759[this.field3754] = -1;
			this.field3755[this.field3754] = var1;
			this.field3754 = var3;
		}
		return false;
	}

	void method2325(int var1) {
		int var3 = this.field3754 + 1 & 127;
		if (this.field3760 != var3) {
			this.field3759[this.field3754] = var1;
			this.field3755[this.field3754] = 0;
			this.field3754 = var3;
		}
	}

	@Override
	public boolean method1163(boolean var1) {
		return false;
	}

	public void method2319() {
		this.field3760 = this.field3756;
		this.field3756 = this.field3754;
		this.field3751 = 0;
		this.field3753 = 0;
		Arrays.fill(this.field3758, false);
		Arrays.fill(this.field3749, false);
	}

	public final boolean method2324() {
		if (this.field3760 == this.field3756) {
			return false;
		} else {
			this.field3761 = this.field3759[this.field3760];
			this.field3748 = this.field3755[this.field3760];
			this.field3760 = 1 + this.field3760 & 127;
			return true;
		}
	}

	public boolean method2320(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3758[var1] : false;
	}

	public boolean method2323(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3757[var1] : false;
	}

	public boolean method2318(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field3749[var1] : false;
	}

	public int[] method2321() {
		int[] var2 = new int[this.field3751];
		for (int var3 = 0; var3 < this.field3751; ++var3) {
			var2[var3] = this.field3750[var3];
		}
		return var2;
	}

	public int[] method2322() {
		int[] var2 = new int[this.field3753];
		for (int var3 = 0; var3 < this.field3753; ++var3) {
			var2[var3] = this.field3752[var3];
		}
		return var2;
	}
}
