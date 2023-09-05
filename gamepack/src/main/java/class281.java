import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ro")
public final class class281 {
	@ObfInfo(name = "au", desc = "[Lro;")
	static class281[] field2258;
	@ObfInfo(name = "wp", desc = "Ldp;")
	static class318 field2262;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -1516333537)
	static int field2257;
	@ObfInfo(name = "az", desc = "F")
	float field2256;
	@ObfInfo(name = "ac", desc = "F")
	float field2259;
	@ObfInfo(name = "at", desc = "F")
	float field2260;
	@ObfInfo(name = "ai", desc = "F")
	float field2261;

	static {
		field2258 = new class281[0];
		method1562(100);
		new class281();
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class281() {
		this.method1558();
	}

	@ObfInfo(name = "ao", desc = "(I)V", opaqueValue = "-1271779629")
	public void method1560() {
		synchronized(field2258) {
			if (class19.field376 < field2257 - 1) {
				field2258[++class19.field376 - 1] = this;
			}

		}
	}

	@ObfInfo(name = "at", desc = "(FFFFI)V")
	void method1556(float var1, float var2, float var3, float var4) {
		this.field2260 = var1;
		this.field2259 = var2;
		this.field2261 = var3;
		this.field2256 = var4;
	}

	@ObfInfo(name = "ac", desc = "(FFFFI)V")
	public void method1557(float var1, float var2, float var3, float var4) {
		float var6 = (float)Math.sin((double)(var4 * 0.5F));
		float var7 = (float)Math.cos((double)(var4 * 0.5F));
		this.field2260 = var6 * var1;
		this.field2259 = var2 * var6;
		this.field2261 = var6 * var3;
		this.field2256 = var7;
	}

	@ObfInfo(name = "ai", desc = "(B)V")
	final void method1558() {
		this.field2261 = 0.0F;
		this.field2259 = 0.0F;
		this.field2260 = 0.0F;
		this.field2256 = 1.0F;
	}

	@ObfInfo(name = "az", desc = "(Lro;B)V")
	public final void method1559(class281 var1) {
		this.method1556(this.field2260 * var1.field2256 + this.field2256 * var1.field2260 + this.field2261 * var1.field2259 - this.field2259 * var1.field2261, var1.field2261 * this.field2260 + this.field2256 * var1.field2259 + (var1.field2256 * this.field2259 - this.field2261 * var1.field2260), var1.field2261 * this.field2256 + (this.field2261 * var1.field2256 + this.field2259 * var1.field2260 - var1.field2259 * this.field2260), this.field2256 * var1.field2256 - this.field2260 * var1.field2260 - this.field2259 * var1.field2259 - var1.field2261 * this.field2261);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		if (!(var1 instanceof class281)) {
			return false;
		} else {
			class281 var2 = (class281)var1;
			return var2.field2260 == this.field2260 && var2.field2259 == this.field2259 && var2.field2261 == this.field2261 && this.field2256 == var2.field2256;
		}
	}

	@ObfInfo(name = "hashCode", desc = "()I")
	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field2260 + var2 * 31.0F;
		var2 = this.field2259 + var2 * 31.0F;
		var2 = this.field2261 + var2 * 31.0F;
		var2 = this.field2256 + var2 * 31.0F;
		return (int)var2;
	}

	@ObfInfo(name = "toString", desc = "()Ljava/lang/String;")
	public String toString() {
		return this.field2260 + "," + this.field2259 + "," + this.field2261 + "," + this.field2256;
	}

	@ObfInfo(name = "au", desc = "(IS)V")
	static void method1562(int var0) {
		field2257 = var0;
		field2258 = new class281[var0];
		class19.field376 = 0;
	}

	@ObfInfo(name = "ae", desc = "(I)Lro;")
	public static class281 method1561() {
		synchronized(field2258) {
			if (class19.field376 == 0) {
				return new class281();
			} else {
				field2258[--class19.field376].method1558();
				return field2258[class19.field376];
			}
		}
	}
}
