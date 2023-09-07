public class class135 extends class70 {
    boolean field1188;
    boolean field1195;
    int field1184;
    int field1185;
    int field1187;
    int field1189;
    int field1190;
    int field1191;
    int field1192;
    int field1193;
    int field1194;
    int field1200;
    int field1201;
    int field1202;
    int field1203;
    int field1206;
    int field1207;
    int[] field1186;
    String field1196;
    String field1197;
    String field1198;
    String field1199;
    String field1204;
    String field1205;
    String field1208;
    String field1209;

    class135(int var1, boolean var2, int var3, int var4, int var5, int var6, int var7, boolean var8, int var9, int var10, int var11, int var12, String var13, String var14, String var15, String var16, int var17, int var18, int var19, int var20, String var21, String var22, int[] var23, int var24, String var25, String var26) {
        this.field1186 = new int[3];
        this.field1187 = var1;
        this.field1188 = var2;
        this.field1189 = var3;
        this.field1190 = var4;
        this.field1185 = var5;
        this.field1192 = var6;
        this.field1202 = var7;
        this.field1195 = var8;
        this.field1193 = var9;
        this.field1184 = var10;
        this.field1194 = var11;
        this.field1191 = var12;
        this.field1196 = var13;
        this.field1197 = var14;
        this.field1198 = var15;
        this.field1199 = var16;
        this.field1200 = var17;
        this.field1201 = var18;
        this.field1206 = var19;
        this.field1203 = var20;
        this.field1204 = var21;
        this.field1205 = var22;
        this.field1186 = var23;
        this.field1207 = var24;
        this.field1208 = var25;
        this.field1209 = var26;
    }

    public void method617(class78 var1) {
        var1.method249(9);
        var1.method249(this.field1187);
        var1.method249(this.field1188 ? 1 : 0);
        var1.method290(this.field1189);
        var1.method249(this.field1190);
        var1.method249(this.field1185);
        var1.method249(this.field1192);
        var1.method249(this.field1202);
        var1.method249(this.field1195 ? 1 : 0);
        var1.method290(this.field1193);
        var1.method249(this.field1184);
        var1.method301(this.field1194);
        var1.method290(this.field1191);
        var1.method253(this.field1196);
        var1.method253(this.field1197);
        var1.method253(this.field1198);
        var1.method253(this.field1199);
        var1.method249(this.field1201);
        var1.method290(this.field1200);
        var1.method253(this.field1204);
        var1.method253(this.field1205);
        var1.method249(this.field1206);
        var1.method249(this.field1203);

        for (int var3 = 0; var3 < this.field1186.length; ++var3) {
            var1.method315(this.field1186[var3]);
        }

        var1.method315(this.field1207);
        var1.method253(this.field1208);
        var1.method253(this.field1209);
    }

    public int method618() {
        boolean var2 = true;
        boolean var3 = true;
        String var5 = this.field1196;
        int var4 = var5.length() + 2;
        int var27 = var4 + 39;
        String var8 = this.field1197;
        int var7 = var8.length() + 2;
        var27 += var7;
        String var11 = this.field1198;
        int var10 = var11.length() + 2;
        var27 += var10;
        String var14 = this.field1199;
        int var13 = var14.length() + 2;
        var27 += var13;
        String var17 = this.field1204;
        int var16 = var17.length() + 2;
        var27 += var16;
        String var20 = this.field1205;
        int var19 = var20.length() + 2;
        var27 += var19;
        String var23 = this.field1208;
        int var22 = var23.length() + 2;
        var27 += var22;
        String var26 = this.field1209;
        int var25 = var26.length() + 2;
        var27 += var25;
        return var27;
    }
}
