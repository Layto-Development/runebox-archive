public class class399 {

	int field3163;

	int field3165;

	int field3166;

	int field3167;

	long field3159;

	long field3160;

	long field3161;

	long field3162;

	long field3168;

	public boolean field3164;

	public class399() {
		this.field3160 = -1L;
		this.field3159 = -1L;
		this.field3164 = false;
		this.field3161 = 0L;
		this.field3162 = 0L;
		this.field3168 = 0L;
		this.field3163 = 0;
		this.field3165 = 0;
		this.field3166 = 0;
		this.field3167 = 0;
	}

	public void method2051() {
		this.field3160 = class48.method197();
	}

	public void method2056() {
		if (-1L != this.field3160) {
			this.field3162 = class48.method197() - this.field3160;
			this.field3160 = -1L;
		}
	}

	public void method2052(int var1) {
		this.field3159 = class48.method197();
		this.field3163 = var1;
	}

	public void method2053() {
		if (-1L != this.field3159) {
			this.field3161 = class48.method197() - this.field3159;
			this.field3159 = -1L;
		}
		++this.field3166;
		this.field3164 = true;
	}

	public void method2054() {
		this.field3164 = false;
		this.field3165 = 0;
	}

	public void method2050() {
		this.method2053();
	}

	public void method2055(class187 var1) {
		method2057(var1, this.field3162);
		method2057(var1, this.field3161);
		method2057(var1, this.field3168);
		var1.method1126(this.field3163);
		var1.method1126(this.field3165);
		var1.method1126(this.field3166);
		var1.method1126(this.field3167);
	}

	static void method2057(class187 var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}
		var0.method1126((int) var1);
	}
}
