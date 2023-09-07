public class class463 implements class200 {
    boolean field3182;
    boolean field3184;
    class97 field3183;

    public class463() {
        this.field3183 = null;
        this.field3182 = false;
        this.field3184 = false;
    }

    public void method2124(class97 var1) {
        this.method2123();
        if (var1 != null) {
            this.field3183 = var1;
            class265 var3 = var1.method406();
            if (null != var3) {
                var3.field1958.method1443(true);
                if (var3.field1959 != null) {
                    class26 var4 = new class26();
                    var4.method77(var1);
                    var4.method78(var3.field1959);
                    Client.method2351().method126(var4);
                }
            }
        }

    }

    public class97 method2121() {
        return this.field3183;
    }

    public void method2123() {
        if (this.field3183 != null) {
            class265 var2 = this.field3183.method406();
            class97 var3 = this.field3183;
            this.field3183 = null;
            if (var2 != null) {
                var2.field1958.method1443(false);
                if (null != var2.field1959) {
                    class26 var4 = new class26();
                    var4.method77(var3);
                    var4.method78(var2.field1959);
                    Client.method2351().method126(var4);
                }

            }
        }
    }

    @Override
    public boolean method965(int var1) {
        if (this.field3183 == null) {
            return false;
        } else {
            class323 var3 = this.field3183.method395();
            if (null == var3) {
                return false;
            } else {
                if (var3.method1432(var1)) {
                    switch (var1) {
                        case 81:
                            this.field3184 = true;
                            break;
                        case 82:
                            this.field3182 = true;
                            break;
                        default:
                            if (this.method2122(var1)) {
                                Client.method2424(this.field3183);
                            }
                    }
                }

                return var3.method1423(var1);
            }
        }
    }

    @Override
    public boolean method963(int var1) {
        switch (var1) {
            case 81:
                this.field3184 = false;
                return false;
            case 82:
                this.field3182 = false;
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean method964(char var1) {
        if (this.field3183 == null) {
            return false;
        } else {
            boolean var3;
            if (var1 >= ' ' && var1 < 127 || var1 > 127 && var1 < 160 || var1 > 160 && var1 <= 255) {
                var3 = true;
            } else {
                label80:
                {
                    if (var1 != 0) {
                        char[] var4 = class209.field1685;

                        for (int var5 = 0; var5 < var4.length; ++var5) {
                            char var6 = var4[var5];
                            if (var1 == var6) {
                                var3 = true;
                                break label80;
                            }
                        }
                    }

                    var3 = false;
                }
            }

            if (!var3) {
                return false;
            } else {
                class327 var7 = this.field3183.method419();
                if (null != var7 && var7.method1485()) {
                    class323 var8 = this.field3183.method395();
                    if (null == var8) {
                        return false;
                    } else {
                        if (var8.method1424(var1) && var7.method1502(var1)) {
                            Client.method2424(this.field3183);
                        }

                        return var8.method1427(var1);
                    }
                } else {
                    return false;
                }
            }
        }
    }

    @Override
    public boolean method966(boolean var1) {
        return false;
    }

    boolean method2122(int var1) {
        if (null == this.field3183) {
            return false;
        } else {
            class327 var3 = this.field3183.method419();
            if (null != var3 && var3.method1485()) {
                switch (var1) {
                    case 13:
                        this.method2123();
                        return true;
                    case 48:
                        if (this.field3182) {
                            var3.method1520();
                        }

                        return true;
                    case 65:
                        if (this.field3182) {
                            var3.method1444(Client.method2467());
                        }

                        return true;
                    case 66:
                        if (this.field3182) {
                            var3.method1474(Client.method2467());
                        }

                        return true;
                    case 67:
                        if (this.field3182) {
                            var3.method1475(Client.method2467());
                        }

                        return true;
                    case 84:
                        if (var3.method1488() == 0) {
                            var3.method1502(10);
                        } else if (this.field3184 && var3.method1506()) {
                            var3.method1502(10);
                        } else {
                            class265 var4 = this.field3183.method406();
                            class26 var5 = new class26();
                            var5.method77(this.field3183);
                            var5.method78(var4.field1955);
                            Client.method2351().method126(var5);
                            this.method2123();
                        }

                        return true;
                    case 85:
                        if (this.field3182) {
                            var3.method1459();
                        } else {
                            var3.method1457();
                        }

                        return true;
                    case 96:
                        if (this.field3182) {
                            var3.method1468(this.field3184);
                        } else {
                            var3.method1514(this.field3184);
                        }

                        return true;
                    case 97:
                        if (this.field3182) {
                            var3.method1469(this.field3184);
                        } else {
                            var3.method1467(this.field3184);
                        }

                        return true;
                    case 98:
                        if (this.field3182) {
                            var3.method1515();
                        } else {
                            var3.method1470(this.field3184);
                        }

                        return true;
                    case 99:
                        if (this.field3182) {
                            var3.method1476();
                        } else {
                            var3.method1471(this.field3184);
                        }

                        return true;
                    case 101:
                        if (this.field3182) {
                            var3.method1480();
                        } else {
                            var3.method1458();
                        }

                        return true;
                    case 102:
                        if (this.field3182) {
                            var3.method1465(this.field3184);
                        } else {
                            var3.method1463(this.field3184);
                        }

                        return true;
                    case 103:
                        if (this.field3182) {
                            var3.method1466(this.field3184);
                        } else {
                            var3.method1464(this.field3184);
                        }

                        return true;
                    case 104:
                        if (this.field3182) {
                            var3.method1510(this.field3184);
                        } else {
                            var3.method1472(this.field3184);
                        }

                        return true;
                    case 105:
                        if (this.field3182) {
                            var3.method1509(this.field3184);
                        } else {
                            var3.method1460(this.field3184);
                        }

                        return true;
                    default:
                        return false;
                }
            } else {
                return false;
            }
        }
    }
}
