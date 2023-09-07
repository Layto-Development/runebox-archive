public class class72 extends class17 {

	class490 field728;

	int field727;

	public class72(class17 var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field728 = null;
		this.field727 = 0;
		super.field89 = "FadeOutTask";
		if (var2 < class388.field3090.size()) {
			this.field728 = (class490) class388.field3090.get(var2);
		}
		this.field727 = var4;
	}

	@Override
	public boolean method51() {
		if (this.field728 != null && this.field728.field3956 != null) {
			this.field728.field3961 = true;
			try {
				if (this.field728.field3949 > 0.0F && this.field728.field3956.method274()) {
					float var2 = this.field727 == 0 ? (float) this.field727 : (float) this.field728.field3952 / (float) this.field727;
					class490 var10000 = this.field728;
					var10000.field3949 -= var2 == 0.0F ? (float) this.field728.field3952 : var2;
					if (this.field728.field3949 < 0.0F) {
						this.field728.field3949 = 0.0F;
					}
					this.field728.field3956.method242((int) this.field728.field3949);
					return false;
				}
			} catch (Exception var3) {
				this.method54(var3.getMessage());
				return true;
			}
			this.field728.field3961 = false;
			return true;
		} else {
			return true;
		}
	}
}
