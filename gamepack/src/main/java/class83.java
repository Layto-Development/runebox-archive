public final class class83 {

	static class173 field841;

	static class83[] field837;

	static int field836;

	float field835;

	float field838;

	float field839;

	float field840;

	static {
		field837 = new class83[0];
		method350(100);
		new class83();
	}

	class83() {
		this.method346();
	}

	public void method348() {
		synchronized (field837) {
			if (class392.field3110 < field836 - 1) {
				field837[++class392.field3110 - 1] = this;
			}
		}
	}

	void method344(float var1, float var2, float var3, float var4) {
		this.field839 = var1;
		this.field838 = var2;
		this.field840 = var3;
		this.field835 = var4;
	}

	public void method345(float var1, float var2, float var3, float var4) {
		float var6 = (float) Math.sin((double) (var4 * 0.5F));
		float var7 = (float) Math.cos((double) (var4 * 0.5F));
		this.field839 = var6 * var1;
		this.field838 = var2 * var6;
		this.field840 = var6 * var3;
		this.field835 = var7;
	}

	final void method346() {
		this.field840 = 0.0F;
		this.field838 = 0.0F;
		this.field839 = 0.0F;
		this.field835 = 1.0F;
	}

	public final void method347(class83 var1) {
		this.method344(this.field839 * var1.field835 + this.field835 * var1.field839 + this.field840 * var1.field838 - this.field838 * var1.field840, var1.field840 * this.field839 + this.field835 * var1.field838 + (var1.field835 * this.field838 - this.field840 * var1.field839), var1.field840 * this.field835 + (this.field840 * var1.field835 + this.field838 * var1.field839 - var1.field838 * this.field839), this.field835 * var1.field835 - this.field839 * var1.field839 - this.field838 * var1.field838 - var1.field840 * this.field840);
	}

	@Override
	public boolean equals(Object var1) {
		if (!(var1 instanceof class83)) {
			return false;
		} else {
			class83 var2 = (class83) var1;
			return var2.field839 == this.field839 && var2.field838 == this.field838 && var2.field840 == this.field840 && this.field835 == var2.field835;
		}
	}

	@Override
	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field839 + var2 * 31.0F;
		var2 = this.field838 + var2 * 31.0F;
		var2 = this.field840 + var2 * 31.0F;
		var2 = this.field835 + var2 * 31.0F;
		return (int) var2;
	}

	@Override
	public String toString() {
		return this.field839 + "," + this.field838 + "," + this.field840 + "," + this.field835;
	}

	static void method350(int var0) {
		field836 = 100;
		field837 = new class83[100];
		class392.field3110 = 0;
	}

	public static class83 method349() {
		synchronized (field837) {
			if (class392.field3110 == 0) {
				return new class83();
			} else {
				field837[--class392.field3110].method346();
				return field837[class392.field3110];
			}
		}
	}
}
