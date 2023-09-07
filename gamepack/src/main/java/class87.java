import java.util.LinkedList;

public abstract class class87 {

	boolean field871;

	boolean field872;

	byte[][][] field860;

	byte[][][] field873;

	class133[][][][] field870;

	int field859;

	int field861;

	int field862;

	int field863;

	int field865;

	int field867;

	int field868;

	int field869;

	short[][][] field864;

	short[][][] field866;

	class87() {
		this.field869 = -1;
		this.field859 = -1;
		new LinkedList();
		this.field871 = false;
		this.field872 = false;
	}

	abstract void method392(class187 var1);

	boolean method389() {
		return this.field871 && this.field872;
	}

	void method390(class338 var1) {
		if (!this.method389()) {
			byte[] var3 = var1.method1762(this.field869, this.field859);
			if (var3 != null) {
				this.method392(new class187(var3));
				this.field871 = true;
				this.field872 = true;
			}
		}
	}

	void method391() {
		this.field866 = (short[][][]) null;
		this.field864 = (short[][][]) null;
		this.field873 = (byte[][][]) null;
		this.field860 = (byte[][][]) null;
		this.field870 = (class133[][][][]) null;
		this.field871 = false;
		this.field872 = false;
	}

	void method394(int var1, int var2, class187 var3) {
		int var5 = var3.method1096();
		if (var5 != 0) {
			if ((var5 & 1) != 0) {
				this.method393(var1, var2, var3, var5);
			} else {
				this.method397(var1, var2, var3, var5);
			}
		}
	}

	void method393(int var1, int var2, class187 var3, int var4) {
		boolean var6 = (var4 & 2) != 0;
		if (var6) {
			this.field864[0][var1][var2] = (short) var3.method1145();
		}
		this.field866[0][var1][var2] = (short) var3.method1145();
	}

	void method397(int var1, int var2, class187 var3, int var4) {
		int var6 = ((var4 & 24) >> 3) + 1;
		boolean var7 = (var4 & 2) != 0;
		boolean var8 = (var4 & 4) != 0;
		this.field866[0][var1][var2] = (short) var3.method1145();
		int var9;
		int var10;
		int var12;
		if (var7) {
			var9 = var3.method1096();
			for (var10 = 0; var10 < var9; ++var10) {
				int var11 = var3.method1145();
				if (var11 != 0) {
					this.field864[var10][var1][var2] = (short) var11;
					var12 = var3.method1096();
					this.field873[var10][var1][var2] = (byte) (var12 >> 2);
					this.field860[var10][var1][var2] = (byte) (var12 & 3);
				}
			}
		}
		if (var8) {
			for (var9 = 0; var9 < var6; ++var9) {
				var10 = var3.method1096();
				if (var10 != 0) {
					class133[] var15 = this.field870[var9][var1][var2] = new class133[var10];
					for (var12 = 0; var12 < var10; ++var12) {
						int var13 = var3.method1144();
						int var14 = var3.method1096();
						var15[var12] = new class133(var13, var14 >> 2, var14 & 3);
					}
				}
			}
		}
	}

	int method395() {
		return this.field861;
	}

	int method396() {
		return this.field868;
	}
}
