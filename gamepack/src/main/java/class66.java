import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class class66 {
    static boolean field634;
    static File field635;
    static Hashtable<String, File> field636;

    static {
        field634 = false;
        field636 = new Hashtable<String, File>(16);
    }

    class66() throws Throwable {
    }

    static void method186(byte var0) {
        try {
            File var1 = new File(class15.field59, "random.dat");
            int var3;
            if (var1.exists()) {
                class6.field32 = new class267(new class119(var1, "rw", 25L), 24, 0);
            } else {
                label37:
                for (int var2 = 0; var2 < class6.field36.length; ++var2) {
                    for (var3 = 0; var3 < class416.field2912.length; ++var3) {
                        File var4 = new File(class416.field2912[var3] + class6.field36[var2] + File.separatorChar + "random.dat");
                        if (var4.exists()) {
                            class6.field32 = new class267(new class119(var4, "rw", 25L), 24, 0);
                            break label37;
                        }
                    }
                }
            }

            if (null == class6.field32) {
                RandomAccessFile var6 = new RandomAccessFile(var1, "rw");
                var3 = var6.read();
                var6.seek(0L);
                var6.write(var3);
                var6.seek(0L);
                var6.close();
                class6.field32 = new class267(new class119(var1, "rw", 25L), 24, 0);
            }
        } catch (IOException var5) {
        }

    }
}
