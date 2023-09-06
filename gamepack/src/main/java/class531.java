public abstract class class531 implements class438 {
	class140 field4267;

	class531(int var1) {
	}

	abstract void method2562(class42 var1, int var2);

	public void method2561(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			class468 var4 = (class468)class451.method2249(class330.method1844(), var3);
			if (var4 != null) {
				switch(var4.field4009) {
				case 0:
					int var5 = var1.method278();
					this.field4267 = class393.method2063(var5);
					if (this.field4267 != null) {
						break;
					}

					throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
				case 1:
					var1.method328();
					break;
				case 2:
					class11[] var6 = new class11[]{class11.field363, class11.field360, class11.field361, class11.field359};
					class451.method2249(var6, var1.method278());
					break;
				default:
					throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
				}
			} else {
				this.method2562(var1, var3);
			}
		}
	}

	boolean method2564() {
		return this.field4267 != null;
	}

	Object method2563() {
		if (class140.field1352 == this.field4267) {
			return 0;
		} else if (class140.field1353 == this.field4267) {
			return -1L;
		} else {
			return class140.field1347 == this.field4267 ? "" : null;
		}
	}
}
