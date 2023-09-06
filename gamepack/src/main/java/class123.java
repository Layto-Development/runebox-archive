public class class123 extends class462 {
	boolean field1140;
	boolean field1147;
	int field1136;
	int field1137;
	int field1139;
	int field1141;
	int field1142;
	int field1143;
	int field1144;
	int field1145;
	int field1146;
	int field1152;
	int field1153;
	int field1154;
	int field1155;
	int field1158;
	int field1159;
	int[] field1138;
	String field1148;
	String field1149;
	String field1150;
	String field1151;
	String field1156;
	String field1157;
	String field1160;
	String field1161;

	class123(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field1138 = new int[3];
		this.field1139 = var1;
		this.field1140 = var2;
		this.field1141 = var3;
		this.field1142 = var4;
		this.field1137 = var5;
		this.field1144 = var6;
		this.field1154 = var7;
		this.field1147 = var8;
		this.field1145 = var9;
		this.field1136 = var10;
		this.field1146 = var11;
		this.field1143 = var12;
		this.field1148 = var13;
		this.field1149 = var14;
		this.field1150 = var15;
		this.field1151 = var16;
		this.field1152 = var17;
		this.field1153 = var18;
		this.field1158 = var19;
		this.field1155 = var20;
		this.field1156 = var21;
		this.field1157 = var22;
		this.field1138 = var23;
		this.field1159 = var24;
		this.field1160 = var25;
		this.field1161 = var26;
	}

	public void method758(class42 var1) {
		var1.method267(9);
		var1.method267(this.field1139);
		var1.method267(this.field1140 ? 1 : 0);
		var1.method308(this.field1141);
		var1.method267(this.field1142);
		var1.method267(this.field1137);
		var1.method267(this.field1144);
		var1.method267(this.field1154);
		var1.method267(this.field1147 ? 1 : 0);
		var1.method308(this.field1145);
		var1.method267(this.field1136);
		var1.method319(this.field1146);
		var1.method308(this.field1143);
		var1.method271(this.field1148);
		var1.method271(this.field1149);
		var1.method271(this.field1150);
		var1.method271(this.field1151);
		var1.method267(this.field1153);
		var1.method308(this.field1152);
		var1.method271(this.field1156);
		var1.method271(this.field1157);
		var1.method267(this.field1158);
		var1.method267(this.field1155);

		for (int var3 = 0; var3 < this.field1138.length; ++var3) {
			var1.method333(this.field1138[var3]);
		}

		var1.method333(this.field1159);
		var1.method271(this.field1160);
		var1.method271(this.field1161);
	}

	public int method759() {
		byte var2 = 39;
		String var5 = this.field1148;
		int var4 = var5.length() + 2;
		int var27 = var4 + var2;
		String var8 = this.field1149;
		int var7 = var8.length() + 2;
		var27 += var7;
		String var11 = this.field1150;
		int var10 = var11.length() + 2;
		var27 += var10;
		String var14 = this.field1151;
		int var13 = var14.length() + 2;
		var27 += var13;
		String var17 = this.field1156;
		int var16 = var17.length() + 2;
		var27 += var16;
		String var20 = this.field1157;
		int var19 = var20.length() + 2;
		var27 += var19;
		String var23 = this.field1160;
		int var22 = var23.length() + 2;
		var27 += var22;
		String var26 = this.field1161;
		int var25 = var26.length() + 2;
		var27 += var25;
		return var27;
	}
}
