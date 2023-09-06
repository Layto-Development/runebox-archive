public final class class176 {
	static class176[] field1697;
	static class516 field1701;
	static int field1696;
	float field1695;
	float field1698;
	float field1699;
	float field1700;

	static {
		field1697 = new class176[0];
		class522.method2537(100);
		new class176();
	}

	class176() {
		this.method999();
	}

	public void method1001() {
		synchronized(field1697) {
			if (class505.field4176 < field1696 - 1) {
				field1697[++class505.field4176 - 1] = this;
			}

		}
	}

	void method997(float var1, float var2, float var3, float var4) {
		this.field1699 = var1;
		this.field1698 = var2;
		this.field1700 = var3;
		this.field1695 = var4;
	}

	public void method998(float var1, float var2, float var3, float var4) {
		float var6 = (float)Math.sin((double)(var4 * 0.5F));
		float var7 = (float)Math.cos((double)(var4 * 0.5F));
		this.field1699 = var6 * var1;
		this.field1698 = var2 * var6;
		this.field1700 = var6 * var3;
		this.field1695 = var7;
	}

	final void method999() {
		this.field1700 = 0.0F;
		this.field1698 = 0.0F;
		this.field1699 = 0.0F;
		this.field1695 = 1.0F;
	}

	public final void method1000(class176 var1) {
		this.method997(this.field1699 * var1.field1695 + this.field1695 * var1.field1699 + this.field1700 * var1.field1698 - this.field1698 * var1.field1700, var1.field1700 * this.field1699 + this.field1695 * var1.field1698 + (var1.field1695 * this.field1698 - this.field1700 * var1.field1699), var1.field1700 * this.field1695 + (this.field1700 * var1.field1695 + this.field1698 * var1.field1699 - var1.field1698 * this.field1699), this.field1695 * var1.field1695 - this.field1699 * var1.field1699 - this.field1698 * var1.field1698 - var1.field1700 * this.field1700);
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class176)) {
			return false;
		} else {
			class176 var2 = (class176)var1;
			return var2.field1699 == this.field1699 && var2.field1698 == this.field1698 && var2.field1700 == this.field1700 && this.field1695 == var2.field1695;
		}
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field1699 + var2 * 31.0F;
		var2 = this.field1698 + var2 * 31.0F;
		var2 = this.field1700 + var2 * 31.0F;
		var2 = this.field1695 + var2 * 31.0F;
		return (int)var2;
	}

	public String toString() {
		return this.field1699 + "," + this.field1698 + "," + this.field1700 + "," + this.field1695;
	}
}
