import java.util.Comparator;

public class class502 implements Comparator {
   static int field3955;
   final boolean field3956;

   public class502(boolean var1) {
      this.field3956 = var1;
   }

   int method2444(class410 var1, class410 var2) {
      return this.field3956 ? var1.field3156 - var2.field3156 : var2.field3156 - var1.field3156;
   }

   public int compare(Object var1, Object var2) {
      return this.method2444((class410)var1, (class410)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }
}
