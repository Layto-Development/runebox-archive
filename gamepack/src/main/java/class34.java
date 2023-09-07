public class class34 {
    static char[] field488;
    static char[] field489;
    static char[] field490;
    static class372 field491;
    static int[] field487;

    static {
        field489 = new char[64];

        int var0;
        for (var0 = 0; var0 < 26; ++var0) {
            field489[var0] = (char) (var0 + 65);
        }

        for (var0 = 26; var0 < 52; ++var0) {
            field489[var0] = (char) (var0 + 97 - 26);
        }

        for (var0 = 52; var0 < 62; ++var0) {
            field489[var0] = (char) (var0 + 48 - 52);
        }

        field489[62] = '+';
        field489[63] = '/';
        field490 = new char[64];

        for (var0 = 0; var0 < 26; ++var0) {
            field490[var0] = (char) (var0 + 65);
        }

        for (var0 = 26; var0 < 52; ++var0) {
            field490[var0] = (char) (var0 + 97 - 26);
        }

        for (var0 = 52; var0 < 62; ++var0) {
            field490[var0] = (char) (var0 + 48 - 52);
        }

        field490[62] = '*';
        field490[63] = '-';
        field488 = new char[64];

        for (var0 = 0; var0 < 26; ++var0) {
            field488[var0] = (char) (var0 + 65);
        }

        for (var0 = 26; var0 < 52; ++var0) {
            field488[var0] = (char) (var0 + 97 - 26);
        }

        for (var0 = 52; var0 < 62; ++var0) {
            field488[var0] = (char) (var0 + 48 - 52);
        }

        field488[62] = '-';
        field488[63] = '_';
        field487 = new int[128];

        for (var0 = 0; var0 < field487.length; ++var0) {
            field487[var0] = -1;
        }

        for (var0 = 65; var0 <= 90; ++var0) {
            field487[var0] = var0 - 65;
        }

        for (var0 = 97; var0 <= 122; ++var0) {
            field487[var0] = var0 - 97 + 26;
        }

        for (var0 = 48; var0 <= 57; ++var0) {
            field487[var0] = 52 + (var0 - 48);
        }

        int[] var2 = field487;
        field487[43] = 62;
        var2[42] = 62;
        int[] var1 = field487;
        field487[47] = 63;
        var1[45] = 63;
    }

    class34() throws Throwable {
    }

    public static String method99(byte[] var0, int var1, int var2) {
        StringBuilder var4 = new StringBuilder();

        for (int var5 = 0; var5 < var2; var5 += 3) {
            int var6 = var0[var5] & 255;
            var4.append(field489[var6 >>> 2]);
            if (var5 < var2 - 1) {
                int var7 = var0[var5 + 1] & 255;
                var4.append(field489[(var6 & 3) << 4 | var7 >>> 4]);
                if (var5 < var2 - 2) {
                    int var8 = var0[var5 + 2] & 255;
                    var4.append(field489[(var7 & 15) << 2 | var8 >>> 6]).append(field489[var8 & 63]);
                } else {
                    var4.append(field489[(var7 & 15) << 2]).append("=");
                }
            } else {
                var4.append(field489[(var6 & 3) << 4]).append("==");
            }
        }

        return var4.toString();
    }
}
