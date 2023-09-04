public class class171 {
   static byte[][][] field1082;
   int field1083;
   int field1084;
   int field1085;
   int field1086;

   class171() throws Throwable {
   }

   public String toString() {
      boolean var1 = true;
      int var2 = 10 - Integer.toString(this.field1086).length();
      int var3 = 10 - Integer.toString(this.field1084).length();
      int var4 = 10 - Integer.toString(this.field1083).length();
      String var5 = "          ".substring(10 - var2);
      String var6 = "          ".substring(10 - var3);
      String var7 = "          ".substring(10 - var4);
      return "    Size: " + this.field1086 + var5 + "Created: " + this.field1083 + var7 + "Total used: " + this.field1084 + var6 + "Max-In-Use: " + this.field1085;
   }
}
