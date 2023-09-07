public class class371 extends class17 {

	class490 field2960;

	int field2959;

	public class371(class17 var1, int var2, boolean var3, int var4) {
		super(var1);
		this.field2960 = null;
		this.field2959 = 0;
		super.field89 = "FadeInTask";
		if (var3 && var2 < class388.field3097.size()) {
			this.field2960 = (class490) class388.field3097.get(var2);
		} else if (!var3 && var2 < class388.field3090.size()) {
			this.field2960 = (class490) class388.field3090.get(var2);
		}
		this.field2959 = var4;
	}

	@Override
	public boolean method51() {
		if (this.field2960 != null && null != this.field2960.field3956) {
			this.field2960.field3961 = true;
			try {
				if (this.field2960.field3949 < (float) this.field2960.field3952 && this.field2960.field3956.method274()) {
					float var2 = this.field2959 == 0 ? (float) this.field2959 : (float) this.field2960.field3952 / (float) this.field2959;
					class490 var10000 = this.field2960;
					var10000.field3949 += 0.0F == var2 ? (float) this.field2960.field3952 : var2;
					if (this.field2960.field3949 > (float) this.field2960.field3952) {
						this.field2960.field3949 = (float) this.field2960.field3952;
					}
					this.field2960.field3956.method242((int) this.field2960.field3949);
					return false;
				}
			} catch (Exception var3) {
				this.method54(var3.getMessage());
				return true;
			}
			this.field2960.field3961 = false;
			return true;
		} else {
			return true;
		}
	}
}
