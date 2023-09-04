public class class323 {
   static byte[][][] field2608;
   int field2609;
   int field2610;
   int field2611;
   int field2612;

   class323() throws Throwable {
   }

   public String toString() {
      boolean var1 = true;
      int var2 = 10 - Integer.toString(this.field2612).length();
      int var3 = 10 - Integer.toString(this.field2610).length();
      int var4 = 10 - Integer.toString(this.field2609).length();
      String var5 = "          ".substring(10 - var2);
      String var6 = "          ".substring(10 - var3);
      String var7 = "          ".substring(10 - var4);
      return "    Size: " + this.field2612 + var5 + "Created: " + this.field2609 + var7 + "Total used: " + this.field2610 + var6 + "Max-In-Use: " + this.field2611;
   }
}
