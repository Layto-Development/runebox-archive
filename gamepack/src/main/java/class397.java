public class class397 {

	boolean field3153;

	int field3145;

	int field3146;

	int field3147;

	int field3148;

	int field3149;

	int field3150;

	int field3151;

	int field3152;

	int field3154;

	int field3155;

	int field3156;

	int field3157;

	public class397() {
		this.field3146 = 0;
		this.field3152 = 0;
	}

	public void method2047(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
		this.field3157 = var1;
		this.field3145 = var2;
		this.field3147 = var3;
		this.field3148 = var4;
		this.field3149 = var5;
		this.field3150 = var6;
		this.field3146 = var7;
		this.field3152 = var8;
		this.field3153 = var9;
	}

	public void method2048(int var1, int var2, int var3, int var4) {
		this.field3154 = var1;
		this.field3155 = var2;
		this.field3156 = var3;
		this.field3151 = var4;
	}

	public void method2049(class268 var1, class61 var2, byte var3) {
		if (var2 != null) {
			int var4 = var2.field4005;
			int var5 = Math.min(this.field3148, (int) ((float) var4 * 0.9F));
			int var6 = var1.method1493(this.field3147);
			int var7 = var1.method1494(this.field3148);
			int var8 = this.field3157 - this.field3149 + var6;
			int var9 = this.field3145 - this.field3150 + var7 + var4;
			class206.method1243(this.field3157, this.field3145, this.field3157 + this.field3147, this.field3148 + this.field3145);
			int var10 = this.field3152;
			int var11 = this.field3146;
			if (var10 > var11) {
				int var12 = var10;
				var10 = var11;
				var11 = var12;
			}
			class200 var22 = var1.method1480(0, var10);
			class200 var13 = var1.method1480(var10, var11);
			class200 var14 = var1.method1480(var11, var1.method1474());
			class200 var15 = var1.method1480(0, this.field3146);
			int var17;
			int var19;
			if (!var13.method1211()) {
				int var16 = var2.field4009 + var2.field4010;
				for (var17 = 0; var17 < var13.method1212(); ++var17) {
					class201 var18 = var13.method1214(var17);
					var19 = var8 + var18.field1886;
					int var20 = var2.method2415(var18.field1887);
					int var21 = var9 + var18.field1889 - var4;
					class206.method1236(var19, var21, var20, var16, this.field3151);
				}
			}
			if (!var22.method1211()) {
				var2.method2395(var22, var8, var9, this.field3154, this.field3155, -1);
			}
			if (!var13.method1211()) {
				var2.method2395(var13, var8, var9, this.field3156, this.field3155, -1);
			}
			if (!var14.method1211()) {
				var2.method2395(var14, var8, var9, this.field3154, this.field3155, -1);
			}
			if (this.field3153) {
				class59 var23 = var15.method1216();
				var17 = var8 + (Integer) var23.field642;
				int var24 = var9 + (Integer) var23.field641;
				var19 = var24 - var5;
				class206.method1238(var17, var24, var17, var19, this.field3154);
				if (this.field3155 != -1) {
					class206.method1238(var17 + 1, var24 + 1, var17 + 1, var19 + 1, this.field3155);
				}
			}
		}
	}
}
