public class class130 {
    static byte[][][] field1151;
    int field1152;
    int field1153;
    int field1154;
    int field1155;

    class130() throws Throwable {
    }

    @Override
    public String toString() {
        boolean var1 = true;
        int var2 = 10 - Integer.toString(this.field1155).length();
        int var3 = 10 - Integer.toString(this.field1153).length();
        int var4 = 10 - Integer.toString(this.field1152).length();
        String var5 = "          ".substring(10 - var2);
        String var6 = "          ".substring(10 - var3);
        String var7 = "          ".substring(10 - var4);
        return "    Size: " + this.field1155 + var5 + "Created: " + this.field1152 + var7 + "Total used: " + this.field1153 + var6 + "Max-In-Use: " + this.field1154;
    }
}
