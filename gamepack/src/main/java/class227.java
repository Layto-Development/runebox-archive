import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "kg")
public final class class227 {
	@ObfInfo(name = "at", desc = "Lou;")
	class133 field1952;
	@ObfInfo(name = "ac", desc = "Lkh;")
	class368 field1950;
	@ObfInfo(name = "ao", desc = "Lsf;")
	class525 field1951;
	@ObfInfo(name = "ae", desc = "I")
	int field1949;
	@ObfInfo(name = "au", desc = "I")
	int field1953;

	@ObfInfo(name = "<init>", desc = "(I)V")
	public class227(int var1) {
		this(var1, var1);
	}

	@ObfInfo(name = "<init>", desc = "(II)V")
	public class227(int var1, int var2) {
		this.field1952 = new class133();
		this.field1953 = var1;
		this.field1949 = var1;

		int var3;
		for (var3 = 1; var3 + var3 < var1 && var3 < var2; var3 += var3) {
		}

		this.field1951 = new class525(var3);
	}

	@ObfInfo(name = "au", desc = "(J)Ljava/lang/Object;")
	public Object method1219(long var1) {
		class370 var3 = (class370)this.field1951.method2558(var1);
		if (var3 == null) {
			return null;
		} else {
			Object var4 = var3.method1999();
			if (var4 == null) {
				var3.method907();
				var3.method1024();
				this.field1949 += var3.field2870;
				return null;
			} else {
				if (var3.method1998()) {
					class476 var5 = new class476(var4, var3.field2870);
					this.field1951.method2562(var5, var3.field1483);
					this.field1952.method761(var5);
					var5.field1634 = 0L;
					var3.method907();
					var3.method1024();
				} else {
					this.field1952.method761(var3);
					var3.field1634 = 0L;
				}

				return var4;
			}
		}
	}

	@ObfInfo(name = "ae", desc = "(J)V")
	void method1225(long var1) {
		class370 var3 = (class370)this.field1951.method2558(var1);
		this.method1220(var3);
	}

	@ObfInfo(name = "ao", desc = "(Llo;)V")
	void method1220(class370 var1) {
		if (var1 != null) {
			var1.method907();
			var1.method1024();
			this.field1949 += var1.field2870;
		}

	}

	@ObfInfo(name = "at", desc = "(Ljava/lang/Object;J)V")
	public void method1221(Object var1, long var2) {
		this.method1222(var1, var2, 1);
	}

	@ObfInfo(name = "ac", desc = "(Ljava/lang/Object;JI)V")
	public void method1222(Object var1, long var2, int var4) {
		if (var4 > this.field1953) {
			throw new IllegalStateException();
		} else {
			this.method1225(var2);
			this.field1949 -= var4;

			while (this.field1949 < 0) {
				class370 var5 = (class370)this.field1952.method763();
				if (var5 == null) {
					throw new RuntimeException("");
				}

				if (!var5.method1998()) {
				}

				this.method1220(var5);
				if (this.field1950 != null) {
					this.field1950.method1996(var5.method1999());
				}
			}

			class476 var6 = new class476(var1, var4);
			this.field1951.method2562(var6, var2);
			this.field1952.method761(var6);
			var6.field1634 = 0L;
		}
	}

	@ObfInfo(name = "ai", desc = "(I)V")
	public void method1223(int var1) {
		for (class370 var2 = (class370)this.field1952.method764(); var2 != null; var2 = (class370)this.field1952.method766()) {
			if (var2.method1998()) {
				if (var2.method1999() == null) {
					var2.method907();
					var2.method1024();
					this.field1949 += var2.field2870;
				}
			} else if (++var2.field1634 > (long)var1) {
				class94 var3 = new class94(var2.method1999(), var2.field2870);
				this.field1951.method2562(var3, var2.field1483);
				class133.method762(var3, var2);
				var2.method907();
				var2.method1024();
			}
		}

	}

	@ObfInfo(name = "az", desc = "()V")
	public void method1224() {
		this.field1952.method767();
		this.field1951.method2559();
		this.field1949 = this.field1953;
	}
}
