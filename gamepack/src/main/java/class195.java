import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class195 {
    static String field1612;
    boolean field1610;
    boolean[] field1608;
    /**
     * @deprecated
     */
    @Deprecated
    String[] field1607;
    Map<Integer, Object> field1611;
    long field1609;

    class195() {
        this.field1610 = false;
        int var1 = class162.field1419.method214(19);
        this.field1611 = new HashMap<Integer, Object>();
        this.field1608 = new boolean[var1];

        int var2;
        for (var2 = 0; var2 < var1; ++var2) {
            class102 var3 = class102.method494(var2);
            this.field1608[var2] = var3.field1003;
        }

        var2 = 0;
        if (class162.field1419.method1754(15)) {
            var2 = class162.field1419.method214(15);
        }

        this.field1607 = new String[var2];
        this.method914();
    }

    void method916(int var1, int var2) {
        this.field1611.put(var1, var2);
        if (this.field1608[var1]) {
            this.field1610 = true;
        }

    }

    int method905(int var1) {
        Object var3 = this.field1611.get(var1);
        return var3 instanceof Integer ? (Integer) var3 : -1;
    }

    void method913(int var1, String var2) {
        this.field1611.put(var1, var2);
    }

    String method906(int var1) {
        Object var3 = this.field1611.get(var1);
        return var3 instanceof String ? (String) var3 : "";
    }

    /**
     * @deprecated
     */
    @Deprecated
    void method912(int var1, String var2) {
        this.field1607[var1] = var2;
    }

    /**
     * @deprecated
     */
    @Deprecated
    String method907(int var1) {
        return this.field1607[var1];
    }

    void method915() {
        int var2;
        for (var2 = 0; var2 < this.field1608.length; ++var2) {
            if (!this.field1608[var2]) {
                this.field1611.remove(var2);
            }
        }

        for (var2 = 0; var2 < this.field1607.length; ++var2) {
            this.field1607[var2] = null;
        }

    }

    class119 method908(boolean var1) {
        return class6.method7("2", class350.field2540.field1091, var1);
    }

    void method909() {
        class119 var2 = this.method908(true);

        try {
            int var3 = 3;
            int var4 = 0;
            Iterator<Entry<Integer, Object>> var5 = this.field1611.entrySet().iterator();

            while (var5.hasNext()) {
                Entry<Integer, Object> var6 = var5.next();
                int var7 = var6.getKey();
                if (this.field1608[var7]) {
                    Object var8 = var6.getValue();
                    var3 += 3;
                    if (var8 instanceof Integer) {
                        var3 += 4;
                    } else if (var8 instanceof String) {
                        var3 += class78.method323((String) var8);
                    }

                    ++var4;
                }
            }

            class78 var24 = new class78(var3);
            var24.method249(2);
            var24.method290(var4);
            Iterator<Entry<Integer, Object>> var25 = this.field1611.entrySet().iterator();

            while (var25.hasNext()) {
                Entry<Integer, Object> var26 = var25.next();
                int var27 = var26.getKey();
                if (this.field1608[var27]) {
                    var24.method290(var27);
                    Object var9 = var26.getValue();
                    class432 var10 = class432.method1970(var9.getClass());
                    var24.method249(var10.field2939);
                    Class var12 = var9.getClass();
                    class432 var13 = class432.method1970(var12);
                    if (var13 == null) {
                        throw new IllegalArgumentException();
                    }

                    class84 var11 = var13.field2941;
                    var11.method337(var9, var24);
                }
            }

            var2.method531(var24.field695, 0, var24.field697);
        } catch (Exception var22) {
        } finally {
            try {
                var2.method534();
            } catch (Exception var21) {
            }

        }

        this.field1610 = false;
        this.field1609 = class206.method982();
    }

    void method914() {
        class119 var2 = this.method908(false);

        label220:
        {
            try {
                byte[] var3 = new byte[(int) var2.method532()];

                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var2.method533(var3, var4, var3.length - var4);
                    if (var5 == -1) {
                        throw new EOFException();
                    }
                }

                class78 var25 = new class78(var3);
                if (var25.field695.length - var25.field697 >= 1) {
                    int var6 = var25.method260();
                    if (var6 < 0 || var6 > 2) {
                        return;
                    }

                    int var7;
                    int var8;
                    int var9;
                    int var10;
                    if (var6 >= 2) {
                        var7 = var25.method309();
                        var8 = 0;

                        while (true) {
                            if (var8 >= var7) {
                                break label220;
                            }

                            var9 = var25.method309();
                            var10 = var25.method260();
                            class432 var11 = (class432) class27.method80(class432.method1972(), var10);
                            Object var12 = var11.method1971(var25);
                            if (var9 >= 0 && var9 < this.field1608.length && this.field1608[var9]) {
                                this.field1611.put(var9, var12);
                            }

                            ++var8;
                        }
                    } else {
                        var7 = var25.method309();

                        for (var8 = 0; var8 < var7; ++var8) {
                            var9 = var25.method309();
                            var10 = var25.method264();
                            if (var9 >= 0 && var9 < this.field1608.length && this.field1608[var9]) {
                                this.field1611.put(var9, var10);
                            }
                        }

                        var8 = var25.method309();
                        var9 = 0;

                        while (true) {
                            if (var9 >= var8) {
                                break label220;
                            }

                            var25.method309();
                            var25.method268();
                            ++var9;
                        }
                    }
                }
            } catch (Exception var23) {
                break label220;
            } finally {
                try {
                    var2.method534();
                } catch (Exception var22) {
                }

            }

            return;
        }

        this.field1610 = false;
    }

    void method910() {
        if (this.field1610 && this.field1609 < class206.method982() - 60000L) {
            this.method909();
        }

    }

    boolean method911() {
        return this.field1610;
    }
}
