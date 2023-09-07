import java.io.File;
import java.io.RandomAccessFile;

public class class153 {
    public static class435 field1320;
    static class539[] field1321;

    class153() throws Throwable {
    }

    static File method720(String var0) {
        if (!class66.field634) {
            throw new RuntimeException("");
        } else {
            File var2 = class66.field636.get(var0);
            if (var2 != null) {
                return var2;
            } else {
                File var3 = new File(class66.field635, var0);
                RandomAccessFile var4 = null;

                try {
                    File var5 = new File(var3.getParent());
                    if (!var5.exists()) {
                        throw new RuntimeException("");
                    } else {
                        var4 = new RandomAccessFile(var3, "rw");
                        int var6 = var4.read();
                        var4.seek(0L);
                        var4.write(var6);
                        var4.seek(0L);
                        var4.close();
                        class66.field636.put(var0, var3);
                        return var3;
                    }
                } catch (Exception var8) {
                    try {
                        if (var4 != null) {
                            var4.close();
                            var4 = null;
                        }
                    } catch (Exception var7) {
                    }

                    throw new RuntimeException();
                }
            }
        }
    }
}
