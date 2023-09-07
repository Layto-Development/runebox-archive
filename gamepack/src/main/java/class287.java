public class class287 {
    boolean field2101;
    int field2093;
    int field2094;
    int field2095;
    int field2096;
    int field2097;
    int field2098;
    int field2099;
    int field2100;
    int field2102;
    int field2103;
    int field2104;
    int field2105;

    public class287() {
        this.field2094 = 0;
        this.field2100 = 0;
    }

    public void method1299(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
        this.field2105 = var1;
        this.field2093 = var2;
        this.field2095 = var3;
        this.field2096 = var4;
        this.field2097 = var5;
        this.field2098 = var6;
        this.field2094 = var7;
        this.field2100 = var8;
        this.field2101 = var9;
    }

    public void method1300(int var1, int var2, int var3, int var4) {
        this.field2102 = var1;
        this.field2103 = var2;
        this.field2104 = var3;
        this.field2099 = var4;
    }

    public void method1301(class353 var1, class413 var2, byte var3) {
        if (var2 != null) {
            int var4 = var2.field1617;
            int var5 = Math.min(this.field2096, (int) ((float) var4 * 0.9F));
            int var6 = var1.method1671(this.field2095);
            int var7 = var1.method1672(this.field2096);
            int var8 = this.field2105 - this.field2097 + var6;
            int var9 = this.field2093 - this.field2098 + var7 + var4;
            class415.method1921(this.field2105, this.field2093, this.field2105 + this.field2095, this.field2096 + this.field2093);
            int var10 = this.field2100;
            int var11 = this.field2094;
            if (var10 > var11) {
                int var12 = var10;
                var10 = var11;
                var11 = var12;
            }

            class145 var22 = var1.method1658(0, var10);
            class145 var13 = var1.method1658(var10, var11);
            class145 var14 = var1.method1658(var11, var1.method1652());
            class145 var15 = var1.method1658(0, this.field2094);
            int var17;
            int var19;
            if (!var13.method665()) {
                int var16 = var2.field1621 + var2.field1622;

                for (var17 = 0; var17 < var13.method666(); ++var17) {
                    class284 var18 = var13.method668(var17);
                    var19 = var8 + var18.field2083;
                    int var20 = var2.method950(var18.field2084);
                    int var21 = var9 + var18.field2086 - var4;
                    class415.method1914(var19, var21, var20, var16, this.field2099);
                }
            }

            if (!var22.method665()) {
                var2.method930(var22, var8, var9, this.field2102, this.field2103, -1);
            }

            if (!var13.method665()) {
                var2.method930(var13, var8, var9, this.field2104, this.field2103, -1);
            }

            if (!var14.method665()) {
                var2.method930(var14, var8, var9, this.field2102, this.field2103, -1);
            }

            if (this.field2101) {
                class260 var23 = var15.method670();
                var17 = var8 + (Integer) var23.field1940;
                int var24 = var9 + (Integer) var23.field1939;
                var19 = var24 - var5;
                class415.method1916(var17, var24, var17, var19, this.field2102);
                if (this.field2103 != -1) {
                    class415.method1916(var17 + 1, var24 + 1, var17 + 1, var19 + 1, this.field2103);
                }
            }

        }
    }
}
