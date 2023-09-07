public abstract class class72 implements class14 {
    class432 field677;

    class72(int var1) {
    }

    abstract void method224(class78 var1, int var2);

    public void method223(class78 var1) {
        while (true) {
            int var3 = var1.method260();
            if (var3 == 0) {
                return;
            }

            class377 var4 = (class377) class27.method80(class377.method1765(), var3);
            if (var4 != null) {
                switch (var4.field2726) {
                    case 0:
                        int var5 = var1.method260();
                        this.field677 = class406.method1856(var5);
                        if (this.field677 != null) {
                            break;
                        }

                        throw new IllegalStateException("Unknown ScriptVarType ID in VarType.decode: " + var5);
                    case 1:
                        var1.method310();
                        break;
                    case 2:
                        class400[] var6 = new class400[]{class400.field2834, class400.field2831, class400.field2832, class400.field2830};
                        class27.method80(var6, var1.method260());
                        break;
                    default:
                        throw new IllegalStateException("Unrecognised VarTypeEncodingKey - " + var4);
                }
            } else {
                this.method224(var1, var3);
            }
        }
    }

    boolean method226() {
        return this.field677 != null;
    }

    Object method225() {
        if (class432.field2942 == this.field677) {
            return 0;
        } else if (class432.field2943 == this.field677) {
            return -1L;
        } else {
            return class432.field2937 == this.field677 ? "" : null;
        }
    }
}
