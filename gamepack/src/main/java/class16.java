public class class16 extends class232 {
	class104 field386;
	int field385;

	public class16(class232 var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field386 = null;
		this.field385 = 0;
		super.field2101 = "FadeOutTask";
		if (var2 >= 0) {
			if (var3 && var2 < class92.field910.size()) {
				this.field386 = (class104)class92.field910.get(var2);
			} else if (!var3 && var2 < class92.field903.size()) {
				this.field386 = (class104)class92.field903.get(var2);
			}

			this.field385 = var4;
		}
	}

	public boolean method1330() {
		if (this.field386 != null && this.field386.field1032 != null) {
			this.field386.field1037 = true;

			try {
				if (this.field386.field1025 > 0.0F && this.field386.field1032.method163()) {
					float var2 = this.field385 == 0 ? (float)this.field385 : (float)this.field386.field1028 / (float)this.field385;
					class104 var10000 = this.field386;
					var10000.field1025 -= var2 == 0.0F ? (float)this.field386.field1028 : var2;
					if (this.field386.field1025 < 0.0F) {
						this.field386.field1025 = 0.0F;
					}

					this.field386.field1032.method130((int)this.field386.field1025);
					return false;
				}
			} catch (Exception var3) {
				this.method1333(var3.getMessage());
				return true;
			}

			this.field386.field1037 = false;
			return true;
		} else {
			return true;
		}
	}
}
