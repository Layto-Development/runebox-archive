public class class203 {
    class203() throws Throwable {
    }

    public static String method972(CharSequence var0) {
        int var2 = var0.length();
        StringBuilder var3 = new StringBuilder(var2);

        for (int var4 = 0; var4 < var2; ++var4) {
            char var5 = var0.charAt(var4);
            if ((var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z') && (var5 < '0' || var5 > '9') && var5 != '.' && var5 != '-' && var5 != '*' && var5 != '_') {
                if (var5 == ' ') {
                    var3.append('+');
                } else {
                    byte var6 = class209.method1000(var5);
                    var3.append('%');
                    int var7 = var6 >> 4 & 15;
                    if (var7 >= 10) {
                        var3.append((char) (var7 + 55));
                    } else {
                        var3.append((char) (var7 + 48));
                    }

                    var7 = var6 & 15;
                    if (var7 >= 10) {
                        var3.append((char) (var7 + 55));
                    } else {
                        var3.append((char) (var7 + 48));
                    }
                }
            } else {
                var3.append(var5);
            }
        }

        return var3.toString();
    }
}
