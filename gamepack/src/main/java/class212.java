import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "co")
public class class212 extends class180 {
	@ObfInfo(name = "kn", desc = "[Lui;")
	static class150[] field1899;
	@ObfInfo(name = "fn", desc = "Lnk;")
	static class505 field1898;
	@ObfInfo(name = "ac", desc = "Luc;")
	class353 field1893;
	@ObfInfo(name = "ai", desc = "Lqp;")
	class486 field1889;
	@ObfInfo(name = "az", desc = "Lqp;")
	class486 field1895;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1312110651)
	int field1890;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1417053891)
	int field1891;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 892213157)
	int field1894;
	@ObfInfo(name = "at", desc = "Ljava/lang/String;")
	String field1892;
	@ObfInfo(name = "ap", desc = "Ljava/lang/String;")
	String field1896;
	@ObfInfo(name = "aa", desc = "Ljava/lang/String;")
	String field1897;

	@ObfInfo(name = "<init>", desc = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	class212(int var1, String var2, String var3, String var4) {
		this.field1889 = class486.field3958;
		this.field1895 = class486.field3958;
		this.method1183(var1, var2, var3, var4);
	}

	@ObfInfo(name = "au", desc = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
	void method1183(int var1, String var2, String var3, String var4) {
		int var6 = ++class159.field1506 - 1;
		this.field1894 = var6;
		this.field1890 = Client.field330;
		this.field1891 = var1;
		this.field1892 = var2;
		this.method1188();
		this.field1896 = var3;
		this.field1897 = var4;
		this.method1181();
		this.method1185();
	}

	@ObfInfo(name = "ae", desc = "(I)V")
	void method1181() {
		this.field1889 = class486.field3958;
	}

	@ObfInfo(name = "ao", desc = "(B)Z", opaqueValue = "10")
	final boolean method1186() {
		if (this.field1889 == class486.field3958) {
			this.method1182();
		}

		return this.field1889 == class486.field3957;
	}

	@ObfInfo(name = "at", desc = "(B)V", opaqueValue = "-1")
	void method1182() {
		this.field1889 = class331.field2633.field351.method900(this.field1893) ? class486.field3957 : class486.field3956;
	}

	@ObfInfo(name = "ac", desc = "(B)V")
	void method1185() {
		this.field1895 = class486.field3958;
	}

	@ObfInfo(name = "ai", desc = "(I)Z", opaqueValue = "1755097600")
	final boolean method1184() {
		if (class486.field3958 == this.field1895) {
			this.method1187();
		}

		return this.field1895 == class486.field3957;
	}

	@ObfInfo(name = "az", desc = "(I)V", opaqueValue = "1656305683")
	void method1187() {
		this.field1895 = class331.field2633.field350.method900(this.field1893) ? class486.field3957 : class486.field3956;
	}

	@ObfInfo(name = "ap", desc = "(B)V")
	final void method1188() {
		if (this.field1892 != null) {
			this.field1893 = new class353(Client.method208(this.field1892), class67.field769);
		} else {
			this.field1893 = null;
		}

	}
}
