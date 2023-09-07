public class class133 {
    public boolean field1165;
    public boolean[] field1176;
    public byte field1167;
    public byte field1168;
    public byte field1169;
    public byte field1179;
    public byte[] field1172;
    public int field1162;
    public int field1163;
    public int field1170;
    public int field1177;
    public int field1178;
    public int[] field1175;
    public String field1166;
    public String[] field1181;
    public String[] field1182;
    boolean field1160;
    boolean field1180;
    class208 field1183;
    int field1164;
    int[] field1173;
    int[] field1174;
    long field1161;
    long[] field1159;
    long[] field1171;

    public class133(class78 var1) {
        this.field1178 = 0;
        this.field1166 = null;
        this.field1164 = 0;
        this.field1177 = -1;
        this.field1162 = -1;
        this.method608(var1);
    }

    void method594(int var1) {
        if (this.field1160) {
            if (null != this.field1159) {
                System.arraycopy(this.field1159, 0, this.field1159 = new long[var1], 0, this.field1170);
            } else {
                this.field1159 = new long[var1];
            }
        }

        if (this.field1180) {
            if (null != this.field1181) {
                System.arraycopy(this.field1181, 0, this.field1181 = new String[var1], 0, this.field1170);
            } else {
                this.field1181 = new String[var1];
            }
        }

        if (null != this.field1172) {
            System.arraycopy(this.field1172, 0, this.field1172 = new byte[var1], 0, this.field1170);
        } else {
            this.field1172 = new byte[var1];
        }

        if (null != this.field1174) {
            System.arraycopy(this.field1174, 0, this.field1174 = new int[var1], 0, this.field1170);
        } else {
            this.field1174 = new int[var1];
        }

        if (this.field1175 != null) {
            System.arraycopy(this.field1175, 0, this.field1175 = new int[var1], 0, this.field1170);
        } else {
            this.field1175 = new int[var1];
        }

        if (null != this.field1176) {
            System.arraycopy(this.field1176, 0, this.field1176 = new boolean[var1], 0, this.field1170);
        } else {
            this.field1176 = new boolean[var1];
        }

    }

    void method595(int var1) {
        if (this.field1160) {
            if (null != this.field1171) {
                System.arraycopy(this.field1171, 0, this.field1171 = new long[var1], 0, this.field1163);
            } else {
                this.field1171 = new long[var1];
            }
        }

        if (this.field1180) {
            if (null != this.field1182) {
                System.arraycopy(this.field1182, 0, this.field1182 = new String[var1], 0, this.field1163);
            } else {
                this.field1182 = new String[var1];
            }
        }

    }

    public int method601(String var1) {
        if (null != var1 && var1.length() != 0) {
            for (int var3 = 0; var3 < this.field1170; ++var3) {
                if (this.field1181[var3].equals(var1)) {
                    return var3;
                }
            }

            return -1;
        } else {
            return -1;
        }
    }

    public int method603(int var1, int var2, int var3) {
        int var5 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
        return (this.field1174[var1] & var5) >>> var2;
    }

    public Integer method596(int var1) {
        if (null == this.field1183) {
            return null;
        } else {
            class70 var3 = this.field1183.method990(var1);
            return null != var3 && var3 instanceof class170 ? Integer.valueOf(((class170) var3).field1437) : null;
        }
    }

    public int[] method597() {
        if (null == this.field1173) {
            String[] var2 = new String[this.field1170];
            this.field1173 = new int[this.field1170];

            for (int var3 = 0; var3 < this.field1170; this.field1173[var3] = var3++) {
                var2[var3] = this.field1181[var3];
                if (null != var2[var3]) {
                    var2[var3] = var2[var3].toLowerCase();
                }
            }

            int[] var4 = this.field1173;
            class240.method1073(var2, var4, 0, var2.length - 1);
        }

        return this.field1173;
    }

    void method609(long var1, String var3, int var4) {
        if (null != var3 && var3.length() == 0) {
            var3 = null;
        }

        if (this.field1160 != var1 > 0L) {
            throw new RuntimeException("");
        } else if (this.field1180 == (null != var3)) {
            throw new RuntimeException("");
        } else {
            if (var1 > 0L && (this.field1159 == null || this.field1170 >= this.field1159.length) || null != var3 && (this.field1181 == null || this.field1170 >= this.field1181.length)) {
                this.method594(this.field1170 + 5);
            }

            if (this.field1159 != null) {
                this.field1159[this.field1170] = var1;
            }

            if (this.field1181 != null) {
                this.field1181[this.field1170] = var3;
            }

            if (this.field1177 == -1) {
                this.field1177 = this.field1170;
                this.field1172[this.field1170] = 126;
            } else {
                this.field1172[this.field1170] = 0;
            }

            this.field1174[this.field1170] = 0;
            this.field1175[this.field1170] = var4;
            this.field1176[this.field1170] = false;
            ++this.field1170;
            this.field1173 = null;
        }
    }

    void method598(int var1) {
        if (var1 >= 0 && var1 < this.field1170) {
            --this.field1170;
            this.field1173 = null;
            if (this.field1170 == 0) {
                this.field1159 = null;
                this.field1181 = null;
                this.field1172 = null;
                this.field1174 = null;
                this.field1175 = null;
                this.field1176 = null;
                this.field1177 = -1;
                this.field1162 = -1;
            } else {
                System.arraycopy(this.field1172, var1 + 1, this.field1172, var1, this.field1170 - var1);
                System.arraycopy(this.field1174, var1 + 1, this.field1174, var1, this.field1170 - var1);
                System.arraycopy(this.field1175, var1 + 1, this.field1175, var1, this.field1170 - var1);
                System.arraycopy(this.field1176, var1 + 1, this.field1176, var1, this.field1170 - var1);
                if (this.field1159 != null) {
                    System.arraycopy(this.field1159, var1 + 1, this.field1159, var1, this.field1170 - var1);
                }

                if (this.field1181 != null) {
                    System.arraycopy(this.field1181, var1 + 1, this.field1181, var1, this.field1170 - var1);
                }

                this.method612();
            }

        } else {
            throw new RuntimeException("");
        }
    }

    void method612() {
        if (this.field1170 == 0) {
            this.field1177 = -1;
            this.field1162 = -1;
        } else {
            this.field1177 = -1;
            this.field1162 = -1;
            int var2 = 0;
            byte var3 = this.field1172[0];

            for (int var4 = 1; var4 < this.field1170; ++var4) {
                if (this.field1172[var4] > var3) {
                    if (var3 == 125) {
                        this.field1162 = var2;
                    }

                    var2 = var4;
                    var3 = this.field1172[var4];
                } else if (this.field1162 == -1 && this.field1172[var4] == 125) {
                    this.field1162 = var4;
                }
            }

            this.field1177 = var2;
            if (this.field1177 != -1) {
                this.field1172[this.field1177] = 126;
            }

        }
    }

    void method599(long var1, String var3) {
        if (var3 != null && var3.length() == 0) {
            var3 = null;
        }

        if (this.field1160 != var1 > 0L) {
            throw new RuntimeException("");
        } else if (var3 == null == this.field1180) {
            throw new RuntimeException("");
        } else {
            if (var1 > 0L && (this.field1171 == null || this.field1163 >= this.field1171.length) || null != var3 && (null == this.field1182 || this.field1163 >= this.field1182.length)) {
                this.method595(this.field1163 + 5);
            }

            if (null != this.field1171) {
                this.field1171[this.field1163] = var1;
            }

            if (this.field1182 != null) {
                this.field1182[this.field1163] = var3;
            }

            ++this.field1163;
        }
    }

    void method600(int var1) {
        --this.field1163;
        if (this.field1163 == 0) {
            this.field1171 = null;
            this.field1182 = null;
        } else {
            if (null != this.field1171) {
                System.arraycopy(this.field1171, var1 + 1, this.field1171, var1, this.field1163 - var1);
            }

            if (this.field1182 != null) {
                System.arraycopy(this.field1182, var1 + 1, this.field1182, var1, this.field1163 - var1);
            }
        }

    }

    int method610(int var1, byte var2) {
        if (var2 != 126 && var2 != 127) {
            if (var1 != this.field1177 || this.field1162 != -1 && this.field1172[this.field1162] >= 125) {
                if (this.field1172[var1] == var2) {
                    return -1;
                } else {
                    this.field1172[var1] = var2;
                    this.method612();
                    return var1;
                }
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    boolean method602(int var1) {
        if (var1 != this.field1177 && this.field1172[var1] != 126) {
            this.field1172[this.field1177] = 125;
            this.field1162 = this.field1177;
            this.field1172[var1] = 126;
            this.field1177 = var1;
            return true;
        } else {
            return false;
        }
    }

    int method611(int var1, boolean var2) {
        if (this.field1176[var1] == var2) {
            return -1;
        } else {
            this.field1176[var1] = var2;
            return var1;
        }
    }

    int method604(int var1, int var2, int var3, int var4) {
        int var6 = (1 << var3) - 1;
        int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
        int var8 = var7 ^ var6;
        var2 <<= var3;
        var2 &= var8;
        int var9 = this.field1174[var1];
        if (var2 == (var9 & var8)) {
            return -1;
        } else {
            var9 &= ~var8;
            this.field1174[var1] = var9 | var2;
            return var1;
        }
    }

    boolean method593(int var1, int var2) {
        if (null != this.field1183) {
            class70 var4 = this.field1183.method990(var1);
            if (null != var4) {
                if (var4 instanceof class170) {
                    class170 var5 = (class170) var4;
                    if (var5.field1437 == var2) {
                        return false;
                    }

                    var5.field1437 = var2;
                    return true;
                }

                var4.method221();
            }
        } else {
            this.field1183 = new class208(4);
        }

        this.field1183.method994(new class170(var2), var1);
        return true;
    }

    boolean method605(int var1, int var2, int var3, int var4) {
        int var6 = (1 << var3) - 1;
        int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
        int var8 = var7 ^ var6;
        var2 <<= var3;
        var2 &= var8;
        if (null != this.field1183) {
            class70 var9 = this.field1183.method990(var1);
            if (null != var9) {
                if (var9 instanceof class170) {
                    class170 var10 = (class170) var9;
                    if (var2 == (var10.field1437 & var8)) {
                        return false;
                    }

                    var10.field1437 &= ~var8;
                    var10.field1437 |= var2;
                    return true;
                }

                var9.method221();
            }
        } else {
            this.field1183 = new class208(4);
        }

        this.field1183.method994(new class170(var2), var1);
        return true;
    }

    boolean method606(int var1, long var2) {
        if (null != this.field1183) {
            class70 var4 = this.field1183.method990(var1);
            if (var4 != null) {
                if (var4 instanceof class282) {
                    class282 var5 = (class282) var4;
                    if (var5.field2052 == var2) {
                        return false;
                    }

                    var5.field2052 = var2;
                    return true;
                }

                var4.method221();
            }
        } else {
            this.field1183 = new class208(4);
        }

        this.field1183.method994(new class282(var2), var1);
        return true;
    }

    boolean method607(int var1, String var2) {
        if (var2 == null) {
            var2 = "";
        } else if (var2.length() > 80) {
            var2 = var2.substring(0, 80);
        }

        if (null != this.field1183) {
            class70 var4 = this.field1183.method990(var1);
            if (null != var4) {
                if (var4 instanceof class371) {
                    class371 var5 = (class371) var4;
                    if (var5.field2646 instanceof String) {
                        if (var2.equals(var5.field2646)) {
                            return false;
                        }

                        var5.method221();
                        this.field1183.method994(new class371(var2), var5.field658);
                        return true;
                    }
                }

                var4.method221();
            }
        } else {
            this.field1183 = new class208(4);
        }

        this.field1183.method994(new class371(var2), var1);
        return true;
    }

    void method608(class78 var1) {
        int var3 = var1.method260();
        if (var3 >= 1 && var3 <= 6) {
            int var4 = var1.method260();
            if ((var4 & 1) != 0) {
                this.field1160 = true;
            }

            if ((var4 & 2) != 0) {
                this.field1180 = true;
            }

            if (!this.field1160) {
                this.field1159 = null;
                this.field1171 = null;
            }

            if (!this.field1180) {
                this.field1181 = null;
                this.field1182 = null;
            }

            this.field1178 = var1.method264();
            this.field1164 = var1.method264();
            if (var3 <= 3 && this.field1164 != 0) {
                this.field1164 += 16912800;
            }

            this.field1170 = var1.method309();
            this.field1163 = var1.method260();
            this.field1166 = var1.method268();
            if (var3 >= 4) {
                var1.method264();
            }

            this.field1165 = var1.method260() == 1;
            this.field1179 = var1.method261();
            this.field1167 = var1.method261();
            this.field1168 = var1.method261();
            this.field1169 = var1.method261();
            int var5;
            if (this.field1170 > 0) {
                if (this.field1160 && (this.field1159 == null || this.field1159.length < this.field1170)) {
                    this.field1159 = new long[this.field1170];
                }

                if (this.field1180 && (this.field1181 == null || this.field1181.length < this.field1170)) {
                    this.field1181 = new String[this.field1170];
                }

                if (this.field1172 == null || this.field1172.length < this.field1170) {
                    this.field1172 = new byte[this.field1170];
                }

                if (null == this.field1174 || this.field1174.length < this.field1170) {
                    this.field1174 = new int[this.field1170];
                }

                if (this.field1175 == null || this.field1175.length < this.field1170) {
                    this.field1175 = new int[this.field1170];
                }

                if (null == this.field1176 || this.field1176.length < this.field1170) {
                    this.field1176 = new boolean[this.field1170];
                }

                for (var5 = 0; var5 < this.field1170; ++var5) {
                    if (this.field1160) {
                        this.field1159[var5] = var1.method265();
                    }

                    if (this.field1180) {
                        this.field1181[var5] = var1.method319();
                    }

                    this.field1172[var5] = var1.method261();
                    if (var3 >= 2) {
                        this.field1174[var5] = var1.method264();
                    }

                    if (var3 >= 5) {
                        this.field1175[var5] = var1.method309();
                    } else {
                        this.field1175[var5] = 0;
                    }

                    if (var3 >= 6) {
                        this.field1176[var5] = var1.method260() == 1;
                    } else {
                        this.field1176[var5] = false;
                    }
                }

                this.method612();
            }

            if (this.field1163 > 0) {
                if (this.field1160 && (this.field1171 == null || this.field1171.length < this.field1163)) {
                    this.field1171 = new long[this.field1163];
                }

                if (this.field1180 && (null == this.field1182 || this.field1182.length < this.field1163)) {
                    this.field1182 = new String[this.field1163];
                }

                for (var5 = 0; var5 < this.field1163; ++var5) {
                    if (this.field1160) {
                        this.field1171[var5] = var1.method265();
                    }

                    if (this.field1180) {
                        this.field1182[var5] = var1.method319();
                    }
                }
            }

            if (var3 >= 3) {
                var5 = var1.method309();
                if (var5 > 0) {
                    this.field1183 = new class208(var5 < 16 ? class82.method332(var5) : 16);

                    while (var5-- > 0) {
                        int var6 = var1.method264();
                        int var7 = var6 & 1073741823;
                        int var8 = var6 >>> 30;
                        if (var8 == 0) {
                            int var9 = var1.method264();
                            this.field1183.method994(new class170(var9), var7);
                        } else if (var8 == 1) {
                            long var11 = var1.method265();
                            this.field1183.method994(new class282(var11), var7);
                        } else if (var8 == 2) {
                            String var12 = var1.method268();
                            this.field1183.method994(new class371(var12), var7);
                        }
                    }
                }
            }

        } else {
            throw new RuntimeException(String.valueOf(var3));
        }
    }
}
