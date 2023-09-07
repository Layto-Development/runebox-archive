public final class class39 extends class77 {

	static int field187;

	int field186;

	int field188;

	int field189;

	int field190;

	int field191;

	int field192;

	int field193;

	int field194;

	int field195;

	int field196;

	int field197;

	int field198;

	int field199;

	int field200;

	class39() {
		this.field196 = 31;
		this.field197 = 0;
		this.field198 = -1;
	}

	void method169(int var1) {
		this.field196 = var1;
	}

	boolean method170(int var1) {
		if (var1 >= 0 && var1 <= 4) {
			return (this.field196 & 1 << var1) != 0;
		} else {
			return true;
		}
	}

	public static final void method171(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				class230.method1363(var0 - 1L);
				class230.method1363(1L);
			} else {
				class230.method1363(var0);
			}
		}
	}
}
