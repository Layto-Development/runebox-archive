public class class112 implements Runnable {
   static int field725;
   boolean field724 = true;
   int field720 = 0;
   int[] field721 = new int[500];
   int[] field722 = new int[500];
   Object field719 = new Object();
   long[] field723 = new long[500];

   class112() {
   }

   public void run() {
      for(; this.field724; class415.method1902(50L)) {
         synchronized(this.field719) {
            if (this.field720 < 500) {
               this.field721[this.field720] = class496.field3977;
               this.field722[this.field720] = class496.field3960;
               this.field723[this.field720] = class496.field3968;
               ++this.field720;
            }
         }
      }

   }
}
