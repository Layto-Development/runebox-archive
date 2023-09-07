import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public final class class466 extends Canvas {
    static class100 field3310;
    static class352 field3313;
    static int field3312;
    static long field3311;
    Component field3314;

    class466(Component var1) {
        this.field3314 = var1;
    }

    static void method2132() {
        int var4;
        for (int var1 = 0; var1 < Client.field4030; ++var1) {
            int var10002 = Client.field3987[var1]--;
            if (Client.field3987[var1] >= -10) {
                class131 var11 = Client.field3819[var1];
                if (var11 == null) {
                    class131 var10000 = null;
                    var11 = class131.method590(class215.field1739, Client.field4031[var1], 0);
                    if (null == var11) {
                        continue;
                    }

                    int[] var19 = Client.field3987;
                    var19[var1] += var11.method589();
                    Client.field3819[var1] = var11;
                }

                if (Client.field3987[var1] < 0) {
                    int var3;
                    if (Client.field3782[var1] != 0) {
                        var4 = 128 * (Client.field3782[var1] & 255);
                        int var5 = Client.field3782[var1] >> 16 & 255;
                        int var6 = var5 * 128 + 64 - class180.field1528.field4121;
                        if (var6 < 0) {
                            var6 = -var6;
                        }

                        int var7 = Client.field3782[var1] >> 8 & 255;
                        int var8 = 64 + var7 * 128 - class180.field1528.field4092;
                        if (var8 < 0) {
                            var8 = -var8;
                        }

                        int var9 = var8 + var6 - 128;
                        if (var9 > var4) {
                            Client.field3987[var1] = -100;
                            continue;
                        }

                        if (var9 < 0) {
                            var9 = 0;
                        }

                        var3 = (var4 - var9) * class290.field2121.method2555() / var4;
                    } else {
                        var3 = class290.field2121.method2537();
                    }

                    if (var3 > 0) {
                        class433 var14 = var11.method588().method1973(class237.field1833);
                        class409 var15 = class409.method1892(var14, 100, var3);
                        var15.method1862(Client.field4032[var1] - 1);
                        class173.field1454.method1730(var15);
                    }

                    Client.field3987[var1] = -100;
                }
            } else {
                --Client.field4030;

                for (int var2 = var1; var2 < Client.field4030; ++var2) {
                    Client.field4031[var2] = Client.field4031[var2 + 1];
                    Client.field3819[var2] = Client.field3819[var2 + 1];
                    Client.field4032[var2] = Client.field4032[var2 + 1];
                    Client.field3987[var2] = Client.field3987[var2 + 1];
                    Client.field3782[var2] = Client.field3782[var2 + 1];
                }

                --var1;
            }
        }

        if (Client.field4047) {
            boolean var10;
            if (!class141.field1242.isEmpty()) {
                var10 = true;
            } else if (!class141.field1240.isEmpty() && class141.field1240.get(0) != null && class141.field1240.get(0).field4273 != null) {
                var10 = class141.field1240.get(0).field4273.method2162();
            } else {
                var10 = false;
            }

            if (!var10) {
                if (class290.field2121.method2529() != 0) {
                    boolean var12 = !class141.field1241.isEmpty();
                    if (var12) {
                        class372 var13 = class34.field491;
                        var4 = class290.field2121.method2529();
                        if (!class141.field1241.isEmpty()) {
                            ArrayList<class537> var16 = new ArrayList<>();
                            Iterator<class537> var17 = class141.field1241.iterator();

                            while (var17.hasNext()) {
                                class537 var18 = var17.next();
                                var18.field4274 = false;
                                var18.field4272 = false;
                                var18.field4278 = false;
                                var18.field4275 = false;
                                var18.field4270 = var13;
                                var18.field4269 = var4;
                                var18.field4266 = 0.0F;
                                var16.add(var18);
                            }

                            class141.method648(var16, class141.field1244, class141.field1245, class141.field1246, class141.field1237, false);
                        }
                    }
                }

                Client.field4047 = false;
            }
        }

    }

    @Override
    public void update(Graphics var1) {
        this.field3314.update(var1);
    }

    @Override
    public void paint(Graphics var1) {
        this.field3314.paint(var1);
    }
}
