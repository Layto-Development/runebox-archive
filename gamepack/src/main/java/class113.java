import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ow")
public class class113 {
	@ObfInfo(name = "ae", desc = "Lsj;")
	class155 field1029;
	@ObfInfo(name = "au", desc = "Lsj;")
	public class155 field1030;

	@ObfInfo(name = "<init>", desc = "()V")
	public class113() {
		this.field1030 = new class155();
		this.field1030.field1482 = this.field1030;
		this.field1030.field1484 = this.field1030;
	}

	@ObfInfo(name = "au", desc = "()V")
	public void method623() {
		while (true) {
			class155 var1 = this.field1030.field1482;
			if (var1 == this.field1030) {
				this.field1029 = null;
				return;
			}

			var1.method907();
		}
	}

	@ObfInfo(name = "ae", desc = "(Lsj;)V")
	public void method631(class155 var1) {
		if (var1.field1484 != null) {
			var1.method907();
		}

		var1.field1484 = this.field1030.field1484;
		var1.field1482 = this.field1030;
		var1.field1484.field1482 = var1;
		var1.field1482.field1484 = var1;
	}

	@ObfInfo(name = "ao", desc = "(Lsj;)V")
	public void method632(class155 var1) {
		if (var1.field1484 != null) {
			var1.method907();
		}

		var1.field1484 = this.field1030;
		var1.field1482 = this.field1030.field1482;
		var1.field1484.field1482 = var1;
		var1.field1482.field1484 = var1;
	}

	@ObfInfo(name = "ac", desc = "()Lsj;")
	public class155 method625() {
		class155 var1 = this.field1030.field1482;
		if (var1 == this.field1030) {
			return null;
		} else {
			var1.method907();
			return var1;
		}
	}

	@ObfInfo(name = "ai", desc = "()Lsj;")
	public class155 method626() {
		class155 var1 = this.field1030.field1484;
		if (var1 == this.field1030) {
			return null;
		} else {
			var1.method907();
			return var1;
		}
	}

	@ObfInfo(name = "az", desc = "()Lsj;")
	public class155 method627() {
		class155 var1 = this.field1030.field1482;
		if (var1 == this.field1030) {
			this.field1029 = null;
			return null;
		} else {
			this.field1029 = var1.field1482;
			return var1;
		}
	}

	@ObfInfo(name = "ap", desc = "()Lsj;")
	public class155 method628() {
		class155 var1 = this.field1030.field1484;
		if (var1 == this.field1030) {
			this.field1029 = null;
			return null;
		} else {
			this.field1029 = var1.field1484;
			return var1;
		}
	}

	@ObfInfo(name = "aa", desc = "()Lsj;")
	public class155 method629() {
		class155 var1 = this.field1029;
		if (var1 == this.field1030) {
			this.field1029 = null;
			return null;
		} else {
			this.field1029 = var1.field1482;
			return var1;
		}
	}

	@ObfInfo(name = "af", desc = "()Lsj;")
	public class155 method633() {
		class155 var1 = this.field1029;
		if (var1 == this.field1030) {
			this.field1029 = null;
			return null;
		} else {
			this.field1029 = var1.field1484;
			return var1;
		}
	}

	@ObfInfo(name = "ad", desc = "()Z")
	public boolean method630() {
		return this.field1030.field1482 == this.field1030;
	}

	@ObfInfo(name = "at", desc = "(Lsj;Lsj;)V")
	public static void method624(class155 var0, class155 var1) {
		if (var0.field1484 != null) {
			var0.method907();
		}

		var0.field1484 = var1.field1484;
		var0.field1482 = var1;
		var0.field1484.field1482 = var0;
		var0.field1482.field1484 = var0;
	}
}
