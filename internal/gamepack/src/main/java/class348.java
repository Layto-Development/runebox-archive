import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class class348 {
   static boolean field2565 = false;
   static File field2566;
   static Hashtable field2567 = new Hashtable(16);

   class348() throws Throwable {
   }

   static void method1595(byte var0) {
      try {
         File var1 = new File(class177.field1432, "random.dat");
         int var3;
         if (var1.exists()) {
            class269.field1883 = new class493(new class390(var1, "rw", 25L), 24, 0);
         } else {
            label46:
            for(int var2 = 0; var2 < class269.field1887.length; ++var2) {
               if (var0 != -1) {
                  throw new IllegalStateException();
               }

               for(var3 = 0; var3 < class407.field2819.length; ++var3) {
                  if (var0 != -1) {
                     throw new IllegalStateException();
                  }

                  File var4 = new File(class407.field2819[var3] + class269.field1887[var2] + File.separatorChar + "random.dat");
                  if (var4.exists()) {
                     if (var0 != -1) {
                        throw new IllegalStateException();
                     }

                     class269.field1883 = new class493(new class390(var4, "rw", 25L), 24, 0);
                     break label46;
                  }
               }
            }
         }

         if (null == class269.field1883) {
            RandomAccessFile var6 = new RandomAccessFile(var1, "rw");
            var3 = var6.read();
            var6.seek(0L);
            var6.write(var3);
            var6.seek(0L);
            var6.close();
            class269.field1883 = new class493(new class390(var1, "rw", 25L), 24, 0);
         }
      } catch (IOException var5) {
      }

   }
}
