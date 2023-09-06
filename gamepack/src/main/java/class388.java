public class class388 extends class372 {
	class86 field3267;
	class86 field3270;
	int field3268;
	int field3269;

	public class388() {
		this.field3270 = new class86();
		this.field3267 = new class86();
		this.field3269 = 0;
		this.field3268 = -1;
	}

	public final synchronized void method2045(class372 var1) {
		this.field3270.method568(var1);
	}

	public final synchronized void method2040(class372 var1) {
		var1.method2269();
	}

	void method2041() {
		if (this.field3269 > 0) {
			for (class27 var1 = (class27)this.field3267.method563(); var1 != null; var1 = (class27)this.field3267.method565()) {
				var1.field459 -= this.field3269;
			}

			this.field3268 -= this.field3269;
			this.field3269 = 0;
		}

	}

	void method2042(class462 var1, class27 var2) {
		while (var1 != this.field3267.field868 && ((class27)var1).field459 <= var2.field459) {
			var1 = var1.field3986;
		}

		class86.method560(var2, var1);
		this.field3268 = ((class27)this.field3267.field868.field3986).field459;
	}

	void method2043(class27 var1) {
		var1.method2269();
		var1.method209();
		class462 var2 = this.field3267.field868.field3986;
		if (var2 == this.field3267.field868) {
			this.field3268 = -1;
		} else {
			this.field3268 = ((class27)var2).field459;
		}

	}

	protected class372 method1980() {
		return (class372)this.field3270.method563();
	}

	protected class372 method1981() {
		return (class372)this.field3270.method565();
	}

	protected int method1978() {
		return 0;
	}

	public final synchronized void method1983(int[] var1, int var2, int var3) {
		do {
			if (this.field3268 < 0) {
				this.method2044(var1, var2, var3);
				return;
			}

			if (this.field3269 + var3 < this.field3268) {
				this.field3269 += var3;
				this.method2044(var1, var2, var3);
				return;
			}

			int var4 = this.field3268 - this.field3269;
			this.method2044(var1, var2, var4);
			var2 += var4;
			var3 -= var4;
			this.field3269 += var4;
			this.method2041();
			class27 var5 = (class27)this.field3267.method563();
			synchronized(var5) {
				int var7 = var5.method210(this);
				if (var7 < 0) {
					var5.field459 = 0;
					this.method2043(var5);
				} else {
					var5.field459 = var7;
					this.method2042(var5.field3986, var5);
				}
			}
		} while(var3 != 0);

	}

	void method2044(int[] var1, int var2, int var3) {
		for (class372 var4 = (class372)this.field3270.method563(); var4 != null; var4 = (class372)this.field3270.method565()) {
			var4.method1984(var1, var2, var3);
		}

	}

	public final synchronized void method1982(int var1) {
		do {
			if (this.field3268 < 0) {
				this.method2046(var1);
				return;
			}

			if (this.field3269 + var1 < this.field3268) {
				this.field3269 += var1;
				this.method2046(var1);
				return;
			}

			int var2 = this.field3268 - this.field3269;
			this.method2046(var2);
			var1 -= var2;
			this.field3269 += var2;
			this.method2041();
			class27 var3 = (class27)this.field3267.method563();
			synchronized(var3) {
				int var5 = var3.method210(this);
				if (var5 < 0) {
					var3.field459 = 0;
					this.method2043(var3);
				} else {
					var3.field459 = var5;
					this.method2042(var3.field3986, var3);
				}
			}
		} while(var1 != 0);

	}

	void method2046(int var1) {
		for (class372 var2 = (class372)this.field3270.method563(); var2 != null; var2 = (class372)this.field3270.method565()) {
			var2.method1982(var1);
		}

	}
}
