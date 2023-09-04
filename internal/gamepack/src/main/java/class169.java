import java.lang.management.GarbageCollectorMXBean;

public class class169 {
   static GarbageCollectorMXBean field1071;
   public int field1069 = -1;
   public int field1070 = -1;
   public int field1072 = -1;
   public int field1073 = -1;
   public int field1074 = -1;
   public int field1075 = -1;
   public int field1076 = -1;
   public int field1077 = -1;
   public int field1078 = -1;
   public int field1079 = -1;
   public int field1080 = -1;

   public void method655(class509 var1) {
      byte[] var3 = var1.method2429(class138.field879.field878);
      class366 var4 = new class366(var3);

      while(true) {
         int var5 = var4.method1654();
         if (var5 == 0) {
            return;
         }

         switch (var5) {
            case 1:
               var4.method1710();
               break;
            case 2:
               this.field1080 = var4.method1702();
               this.field1070 = var4.method1702();
               this.field1073 = var4.method1702();
               this.field1072 = var4.method1702();
               this.field1078 = var4.method1702();
               this.field1069 = var4.method1702();
               this.field1075 = var4.method1702();
               this.field1076 = var4.method1702();
               this.field1077 = var4.method1702();
               this.field1074 = var4.method1702();
               this.field1079 = var4.method1702();
         }
      }
   }
}
