import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class class293 {
   static boolean field2470 = false;
   static File field2471;
   static Hashtable field2472 = new Hashtable(16);

   class293() throws Throwable {
   }

   static void method1615(byte var0) {
      try {
         File var1 = new File(class138.field1581, "random.dat");
         int var3;
         if (var1.exists()) {
            class237.field2171 = new class122(new class472(var1, "rw", 25L), 24, 0);
         } else {
            label46:
            for(int var2 = 0; var2 < class237.field2175.length; ++var2) {
               if (var0 != -1) {
                  throw new IllegalStateException();
               }

               for(var3 = 0; var3 < class524.field4129.length; ++var3) {
                  if (var0 != -1) {
                     throw new IllegalStateException();
                  }

                  File var4 = new File(class524.field4129[var3] + class237.field2175[var2] + File.separatorChar + "random.dat");
                  if (var4.exists()) {
                     if (var0 != -1) {
                        throw new IllegalStateException();
                     }

                     class237.field2171 = new class122(new class472(var4, "rw", 25L), 24, 0);
                     break label46;
                  }
               }
            }
         }

         if (null == class237.field2171) {
            RandomAccessFile var6 = new RandomAccessFile(var1, "rw");
            var3 = var6.read();
            var6.seek(0L);
            var6.write(var3);
            var6.seek(0L);
            var6.close();
            class237.field2171 = new class122(new class472(var1, "rw", 25L), 24, 0);
         }
      } catch (IOException var5) {
      }

   }
}
