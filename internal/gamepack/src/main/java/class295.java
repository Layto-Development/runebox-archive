import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class295 {
   static int field2024;
   ExecutorService field2022 = Executors.newSingleThreadExecutor();
   Future field2025;
   final class345 field2021;
   final class366 field2023;

   public class295(class366 var1, class345 var2) {
      this.field2023 = var1;
      this.field2021 = var2;
      this.method1334();
   }

   public boolean method1336() {
      return this.field2025.isDone();
   }

   public void method1333() {
      this.field2022.shutdown();
      this.field2022 = null;
   }

   public class366 method1335() {
      try {
         return (class366)this.field2025.get();
      } catch (Exception var3) {
         return null;
      }
   }

   void method1334() {
      this.field2025 = this.field2022.submit(new class85(this, this.field2023, this.field2021));
   }
}
