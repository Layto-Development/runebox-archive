import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "sm")
public class class521 extends class155 {
	@ObfInfo(name = "bs", desc = "Z")
	boolean field4163;
	@ObfInfo(name = "bp", desc = "Z")
	boolean field4170;
	@ObfInfo(name = "bo", desc = "I", intMultiplier = 518352535)
	int field4159;
	@ObfInfo(name = "bq", desc = "I", intMultiplier = -187483369)
	int field4160;
	@ObfInfo(name = "by", desc = "I", intMultiplier = -1904420251)
	int field4162;
	@ObfInfo(name = "bm", desc = "I", intMultiplier = 264065611)
	int field4164;
	@ObfInfo(name = "bf", desc = "I", intMultiplier = -1187086541)
	int field4165;
	@ObfInfo(name = "be", desc = "I", intMultiplier = -1985636101)
	int field4166;
	@ObfInfo(name = "ba", desc = "I", intMultiplier = -996711977)
	int field4167;
	@ObfInfo(name = "bu", desc = "I", intMultiplier = 1266013031)
	int field4168;
	@ObfInfo(name = "br", desc = "I", intMultiplier = -1184785821)
	int field4169;
	@ObfInfo(name = "bw", desc = "I", intMultiplier = 1565841435)
	int field4175;
	@ObfInfo(name = "bc", desc = "I", intMultiplier = 1567483585)
	int field4176;
	@ObfInfo(name = "bl", desc = "I", intMultiplier = -1640138069)
	int field4177;
	@ObfInfo(name = "cw", desc = "I", intMultiplier = -632448413)
	int field4178;
	@ObfInfo(name = "bg", desc = "I", intMultiplier = -1642110207)
	int field4181;
	@ObfInfo(name = "cs", desc = "I", intMultiplier = -742143585)
	int field4182;
	@ObfInfo(name = "cn", desc = "[I")
	int[] field4161;
	@ObfInfo(name = "bi", desc = "Ljava/lang/String;")
	String field4171;
	@ObfInfo(name = "bz", desc = "Ljava/lang/String;")
	String field4172;
	@ObfInfo(name = "bx", desc = "Ljava/lang/String;")
	String field4173;
	@ObfInfo(name = "bn", desc = "Ljava/lang/String;")
	String field4174;
	@ObfInfo(name = "cf", desc = "Ljava/lang/String;")
	String field4179;
	@ObfInfo(name = "cm", desc = "Ljava/lang/String;")
	String field4180;
	@ObfInfo(name = "cx", desc = "Ljava/lang/String;")
	String field4183;
	@ObfInfo(name = "cr", desc = "Ljava/lang/String;")
	String field4184;

	@ObfInfo(name = "<init>", desc = "(IZIIIIIZIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;Ljava/lang/String;[IILjava/lang/String;Ljava/lang/String;)V")
	class521(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
		this.field4161 = new int[3];
		this.field4162 = var1;
		this.field4163 = var2;
		this.field4164 = var3;
		this.field4165 = var4;
		this.field4160 = var5;
		this.field4167 = var6;
		this.field4177 = var7;
		this.field4170 = var8;
		this.field4168 = var9;
		this.field4159 = var10;
		this.field4169 = var11;
		this.field4166 = var12;
		this.field4171 = var13;
		this.field4172 = var14;
		this.field4173 = var15;
		this.field4174 = var16;
		this.field4175 = var17;
		this.field4176 = var18;
		this.field4181 = var19;
		this.field4178 = var20;
		this.field4179 = var21;
		this.field4180 = var22;
		this.field4161 = var23;
		this.field4182 = var24;
		this.field4183 = var25;
		this.field4184 = var26;
	}

	@ObfInfo(name = "au", desc = "(Ltm;B)V", opaqueValue = "33")
	public void method2550(class280 var1) {
		var1.method1481(9);
		var1.method1481(this.field4162);
		var1.method1481(this.field4163 ? 1 : 0);
		var1.method1522(this.field4164);
		var1.method1481(this.field4165);
		var1.method1481(this.field4160);
		var1.method1481(this.field4167);
		var1.method1481(this.field4177);
		var1.method1481(this.field4170 ? 1 : 0);
		var1.method1522(this.field4168);
		var1.method1481(this.field4159);
		var1.method1533(this.field4169);
		var1.method1522(this.field4166);
		var1.method1485(this.field4171);
		var1.method1485(this.field4172);
		var1.method1485(this.field4173);
		var1.method1485(this.field4174);
		var1.method1481(this.field4176);
		var1.method1522(this.field4175);
		var1.method1485(this.field4179);
		var1.method1485(this.field4180);
		var1.method1481(this.field4181);
		var1.method1481(this.field4178);

		for (int var3 = 0; var3 < this.field4161.length; ++var3) {
			var1.method1547(this.field4161[var3]);
		}

		var1.method1547(this.field4182);
		var1.method1485(this.field4183);
		var1.method1485(this.field4184);
	}

	@ObfInfo(name = "ae", desc = "(I)I")
	public int method2551() {
		byte var2 = 39;
		String var5 = this.field4171;
		int var4 = var5.length() + 2;
		int var27 = var4 + var2;
		String var8 = this.field4172;
		int var7 = var8.length() + 2;
		var27 += var7;
		String var11 = this.field4173;
		int var10 = var11.length() + 2;
		var27 += var10;
		String var14 = this.field4174;
		int var13 = var14.length() + 2;
		var27 += var13;
		String var17 = this.field4179;
		int var16 = var17.length() + 2;
		var27 += var16;
		String var20 = this.field4180;
		int var19 = var20.length() + 2;
		var27 += var19;
		String var23 = this.field4183;
		int var22 = var23.length() + 2;
		var27 += var22;
		String var26 = this.field4184;
		int var25 = var26.length() + 2;
		var27 += var25;
		return var27;
	}
}
