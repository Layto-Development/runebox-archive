public class class94 {

	static byte[][][] field1212;

	int field1213;

	int field1214;

	int field1215;

	int field1216;

	class94() throws Throwable {
	}

	@Override
	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field1216).length();
		int var3 = 10 - Integer.toString(this.field1214).length();
		int var4 = 10 - Integer.toString(this.field1213).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field1216 + var5 + "Created: " + this.field1213 + var7 + "Total used: " + this.field1214 + var6 + "Max-In-Use: " + this.field1215;
	}
}
