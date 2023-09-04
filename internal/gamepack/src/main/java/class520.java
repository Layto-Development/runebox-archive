public class class520 implements Runnable {
   static int field4086;
   boolean field4085 = true;
   int field4081 = 0;
   int[] field4082 = new int[500];
   int[] field4083 = new int[500];
   Object field4080 = new Object();
   long[] field4084 = new long[500];

   class520() {
   }

   public void run() {
      for(; this.field4085; class51.method602(50L)) {
         synchronized(this.field4080) {
            if (this.field4081 < 500) {
               this.field4082[this.field4081] = class441.field3349;
               this.field4083[this.field4081] = class441.field3332;
               this.field4084[this.field4081] = class441.field3340;
               ++this.field4081;
            }
         }
      }

   }
}
