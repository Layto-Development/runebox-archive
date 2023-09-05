import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "sl")
public class class187 {
	@ObfInfo(name = "au", desc = "Lsl;")
	public static final class187 field1706;
	@ObfInfo(name = "aa", desc = "Lsl;")
	public static final class187 field1708;
	@ObfInfo(name = "ae", desc = "Lsl;")
	static final class187 field1698;
	@ObfInfo(name = "at", desc = "Lsl;")
	static final class187 field1700;
	@ObfInfo(name = "ac", desc = "Lsl;")
	static final class187 field1701;
	@ObfInfo(name = "ai", desc = "Lsl;")
	static final class187 field1702;
	@ObfInfo(name = "az", desc = "Lsl;")
	static final class187 field1703;
	@ObfInfo(name = "ap", desc = "Lsl;")
	static final class187 field1704;
	@ObfInfo(name = "ao", desc = "Lsl;")
	static final class187 field1705;
	@ObfInfo(name = "ad", desc = "Ljava/lang/String;")
	final String field1707;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 1096679751)
	public final int field1699;

	static {
		field1706 = new class187(8, 0, "", "");
		field1698 = new class187(4, 1, "", "");
		field1705 = new class187(1, 2, "", "");
		field1700 = new class187(6, 3, "", "");
		field1701 = new class187(2, 4, "", "");
		field1702 = new class187(0, 5, "", "");
		field1703 = new class187(5, 6, "", "");
		field1704 = new class187(7, 7, "", "");
		field1708 = new class187(3, -1, "", "", true, new class187[]{field1706, field1698, field1705, field1701, field1700});
	}

	@ObfInfo(name = "<init>", desc = "(IILjava/lang/String;Ljava/lang/String;)V")
	class187(int var1, int var2, String var3, String var4) {
		this.field1699 = var1;
		this.field1707 = var4;
	}

	@ObfInfo(name = "<init>", desc = "(IILjava/lang/String;Ljava/lang/String;Z[Lsl;)V")
	class187(int var1, int var2, String var3, String var4, boolean var5, class187[] var6) {
		this.field1699 = var1;
		this.field1707 = var4;
	}

	@ObfInfo(name = "toString", desc = "()Ljava/lang/String;")
	public String toString() {
		return this.field1707;
	}
}
