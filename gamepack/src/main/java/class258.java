public class class258 {
	static byte[][][] field2367;
	int field2368;
	int field2369;
	int field2370;
	int field2371;

	class258() throws Throwable {
	}

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field2371).length();
		int var3 = 10 - Integer.toString(this.field2369).length();
		int var4 = 10 - Integer.toString(this.field2368).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field2371 + var5 + "Created: " + this.field2368 + var7 + "Total used: " + this.field2369 + var6 + "Max-In-Use: " + this.field2370;
	}
}
