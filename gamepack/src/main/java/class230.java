import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "rv")
public abstract class class230 implements class99 {
	@ObfInfo(name = "au", desc = "Ltb;")
	class49 field1961;

	@ObfInfo(name = "<init>", desc = "(I)V")
	class230(int var1) {
	}

	@ObfInfo(name = "au", desc = "(Ltm;II)V")
	abstract void method1227(class280 var1, int var2);

	@ObfInfo(name = "ac", desc = "(Ltm;B)V", opaqueValue = "0")
	public void method1226(class280 var1) {
		while (true) {
			int var3 = var1.method1492();
			if (var3 == 0) {
				return;
			}

			class311 var4 = (class311)class216.method1198(class311.method1724(), var3);
			if (var4 != null) {
				switch(var4.field2525) {
				case 0:
					int var5 = var1.method1492();
					this.field1961 = class76.method517(var5);
					if (this.field1961 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
				case 1:
					var1.method1542();
					break;
				case 2:
					class100[] var6 = new class100[]{class100.field984, class100.field981, class100.field982, class100.field980};
					class216.method1198(var6, var1.method1492());
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				}
			} else {
				this.method1227(var1, var3);
			}
		}
	}

	@ObfInfo(name = "ai", desc = "(I)Z", opaqueValue = "-2027714469")
	boolean method1229() {
		return this.field1961 != null;
	}

	@ObfInfo(name = "az", desc = "(B)Ljava/lang/Object;", opaqueValue = "-1")
	Object method1228() {
		if (class49.field579 == this.field1961) {
			return 0;
		} else if (class49.field580 == this.field1961) {
			return -1L;
		} else {
			return class49.field574 == this.field1961 ? "" : null;
		}
	}
}
