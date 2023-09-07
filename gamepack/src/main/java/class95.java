import java.util.regex.Pattern;

@class50
public final class class95 {
    static {
        Pattern.compile("^\\D*(\\d+)\\D*$");
    }

    class95() throws Throwable {
    }

    public static String method377(CharSequence[] var0, int var1, int var2) {
        if (var2 == 0) {
            return "";
        } else if (var2 == 1) {
            CharSequence var9 = var0[var1];
            return var9 == null ? "null" : var9.toString();
        } else {
            int var4 = var2 + var1;
            int var5 = 0;

            for (int var6 = var1; var6 < var4; ++var6) {
                CharSequence var7 = var0[var6];
                if (var7 == null) {
                    var5 += 4;
                } else {
                    var5 += var7.length();
                }
            }

            StringBuilder var10 = new StringBuilder(var5);

            for (int var11 = var1; var11 < var4; ++var11) {
                CharSequence var8 = var0[var11];
                if (null == var8) {
                    var10.append("null");
                } else {
                    var10.append(var8);
                }
            }

            return var10.toString();
        }
    }

    public static boolean method374(CharSequence var0) {
        return method375(var0, 10, true);
    }

    static boolean method375(CharSequence var0, int var1, boolean var2) {
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = var0.length();

        for (int var8 = 0; var8 < var7; ++var8) {
            char var9 = var0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }

                if (var9 == '+') {
                    continue;
                }
            }

            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else {
                if (var9 < 'a' || var9 > 'z') {
                    return false;
                }

                var11 = var9 - 'W';
            }

            if (var11 >= 10) {
                return false;
            }

            if (var4) {
                var11 = -var11;
            }

            int var10 = var11 + 10 * var6;
            if (var6 != var10 / 10) {
                return false;
            }

            var6 = var10;
            var5 = true;
        }

        return var5;
    }

    public static int method368(CharSequence var0) {
        return method363(var0, 10, true);
    }

    public static int method363(CharSequence var0, int var1, boolean var2) {
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = var0.length();

        for (int var8 = 0; var8 < var7; ++var8) {
            char var9 = var0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }

                if (var9 == '+') {
                    continue;
                }
            }

            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else {
                if (var9 < 'a' || var9 > 'z') {
                    throw new NumberFormatException();
                }

                var11 = var9 - 'W';
            }

            if (var11 >= var1) {
                throw new NumberFormatException();
            }

            if (var4) {
                var11 = -var11;
            }

            int var10 = var6 * var1 + var11;
            if (var6 != var10 / var1) {
                throw new NumberFormatException();
            }

            var6 = var10;
            var5 = true;
        }

        if (!var5) {
            throw new NumberFormatException();
        } else {
            return var6;
        }
    }

    public static String method364(int var0, boolean var1) {
        return var1 && var0 >= 0 ? method367(var0, 10, var1) : Integer.toString(var0);
    }

    static String method367(int var0, int var1, boolean var2) {
        if (var2 && var0 >= 0) {
            int var4 = 2;

            for (int var5 = var0 / 10; var5 != 0; ++var4) {
                var5 /= 10;
            }

            char[] var6 = new char[var4];
            var6[0] = '+';

            for (int var7 = var4 - 1; var7 > 0; --var7) {
                int var8 = var0;
                var0 /= 10;
                int var9 = var8 - 10 * var0;
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }

            return new String(var6);
        } else {
            return Integer.toString(var0, 10);
        }
    }

    public static int method371(CharSequence var0) {
        int var2 = var0.length();
        int var3 = 0;

        for (int var4 = 0; var4 < var2; ++var4) {
            var3 = (var3 << 5) - var3 + class209.method1000(var0.charAt(var4));
        }

        return var3;
    }

    public static int method370(CharSequence var0) {
        int var2 = var0.length();
        int var3 = 0;

        for (int var4 = 0; var4 < var2; ++var4) {
            var3 = (var3 << 5) - var3 + var0.charAt(var4);
        }

        return var3;
    }

    public static boolean method372(char var0) {
        return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
    }

    public static boolean method378(char var0) {
        return var0 >= '0' && var0 <= '9' || var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
    }

    public static String method369(String var0) {
        StringBuilder var2 = new StringBuilder(var0.length());
        int var3 = 0;
        int var4 = -1;

        for (int var5 = 0; var5 < var0.length(); ++var5) {
            char var6 = var0.charAt(var5);
            if (var6 == '<') {
                var2.append(var0, var3, var5);
                var4 = var5;
            } else if (var6 == '>' && var4 != -1) {
                String var7 = var0.substring(var4 + 1, var5);
                var4 = -1;
                if (var7.equals("lt")) {
                    var2.append("<");
                } else if (var7.equals("gt")) {
                    var2.append(">");
                } else if (var7.equals("br")) {
                    var2.append("\n");
                }

                var3 = var5 + 1;
            }
        }

        if (var3 < var0.length()) {
            var2.append(var0.substring(var3));
        }

        return var2.toString();
    }

    public static String method365(String var0) {
        int var2 = var0.length();
        char[] var3 = new char[var2];
        byte var4 = 2;

        for (int var5 = 0; var5 < var2; ++var5) {
            char var6 = var0.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class209.method996(var6);
            }

            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 != '.' && var6 != '?' && var6 != '!') {
                if (Character.isSpaceChar(var6)) {
                    if (var4 != 2) {
                        var4 = 1;
                    }
                } else {
                    var4 = 1;
                }
            } else {
                var4 = 2;
            }

            var3[var5] = var6;
        }

        return new String(var3);
    }

    public static String method376(char var0, int var1) {
        char[] var3 = new char[var1];

        for (int var4 = 0; var4 < var1; ++var4) {
            var3[var4] = '*';
        }

        return new String(var3);
    }

    public static boolean method366(char var0) {
        if (var0 >= ' ' && var0 <= '~') {
            return true;
        } else if (var0 >= 160 && var0 <= 255) {
            return true;
        } else {
            return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
        }
    }

    public static int method373(int var0) {
        if (var0 > 0) {
            return 1;
        } else {
            return var0 < 0 ? -1 : 0;
        }
    }
}
