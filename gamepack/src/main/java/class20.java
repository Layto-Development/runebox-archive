public abstract class class20 implements class395 {

	class272 field103;

	class20(int var1) {
	}

	abstract void method61(class187 var1, int var2);

	public void method60(class187 var1) {
		while (true) {
			int var3 = var1.method1096();
			if (var3 == 0) {
				return;
			}
			class172 var4 = (class172) class433.method2167(class172.method996(), var3);
			if (var4 != null) {
				switch(var4.field1698) {
					case 0:
						int var5 = var1.method1096();
						this.field103 = class367.method1901(var5);
						if (this.field103 != null) {
							break;
						}
						throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
					case 1:
						var1.method1146();
						break;
					case 2:
						class468[] var6 = new class468[] { class468.field3711, class468.field3708, class468.field3709, class468.field3707 };
						class433.method2167(var6, var1.method1096());
						break;
					default:
						throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				}
			} else {
				this.method61(var1, var3);
			}
		}
	}

	boolean method63() {
		return this.field103 != null;
	}

	Object method62() {
		if (class272.field2234 == this.field103) {
			return 0;
		} else if (class272.field2235 == this.field103) {
			return -1L;
		} else {
			return class272.field2229 == this.field103 ? "" : null;
		}
	}
}
