import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class class5 extends class460 {
   static ThreadPoolExecutor field36 = null;
   static AtomicBoolean field39 = null;
   boolean field32;
   class251[][] field26 = new class251[16][128];
   class251[][] field30 = new class251[16][128];
   class313 field40 = new class313(128);
   class39 field31 = new class39();
   class500 field37 = new class500(this);
   int field12 = 256;
   int field20 = 1000000;
   int field33;
   int field34;
   int[] field11 = new int[16];
   int[] field13 = new int[16];
   int[] field14 = new int[16];
   int[] field15 = new int[16];
   int[] field16 = new int[16];
   int[] field17 = new int[16];
   int[] field18 = new int[16];
   int[] field19 = new int[16];
   int[] field22 = new int[16];
   int[] field23 = new int[16];
   int[] field24 = new int[16];
   int[] field25 = new int[16];
   int[] field27 = new int[16];
   int[] field29 = new int[16];
   int[] field38 = new int[16];
   PriorityQueue field21 = new PriorityQueue(5, new class364());
   long field28;
   long field35;
   public int field41 = 0;

   public class5() {
      this.method26();
   }

   public synchronized void method10(int var1) {
      this.field12 = var1;
   }

   public int method37() {
      return this.field12;
   }

   public synchronized boolean method11(class147 var1, class509 var2, class41 var3) {
      boolean var5 = true;
      synchronized(this.field21) {
         this.field21.clear();
      }

      for(class40 var6 = (class40)var1.field941.method1432(); var6 != null; var6 = (class40)var1.field941.method1433()) {
         int var7 = (int)var6.field531;
         class162 var8 = (class162)this.field40.method1431((long)var7);
         if (null == var8) {
            byte[] var10 = var2.method2429(var7);
            class162 var9;
            if (var10 == null) {
               var9 = null;
            } else {
               var9 = new class162(var10);
            }

            var8 = var9;
            if (null == var9) {
               var5 = false;
               continue;
            }

            this.field40.method1434(var9, (long)var7);
         }

         if (!var8.method618(var3, var6.field339)) {
            var5 = false;
         } else if (null != this.field21) {
            synchronized(this.field21) {
               Iterator var15 = var8.field1032.iterator();

               while(var15.hasNext()) {
                  class202 var11 = (class202)var15.next();
                  this.field21.add(new class229(var6.field340, var11));
               }
            }
         }
      }

      return var5;
   }

   public void method12() {
      if (null != this.field21) {
         if (field39 != null) {
            field39.set(true);
         }

         field39 = new AtomicBoolean(false);
         AtomicBoolean var2 = field39;
         if (field36 == null) {
            int var3 = Runtime.getRuntime().availableProcessors();
            field36 = new ThreadPoolExecutor(0, var3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class215(this));
         }

         field36.submit(new class81(this, var2));
      }
   }

   public synchronized void method13() {
      for(class162 var2 = (class162)this.field40.method1432(); null != var2; var2 = (class162)this.field40.method1433()) {
         var2.method619();
      }

   }

   public synchronized void method45() {
      for(class162 var2 = (class162)this.field40.method1432(); var2 != null; var2 = (class162)this.field40.method1433()) {
         var2.method295();
      }

   }

   public synchronized void method15(class147 var1, boolean var2) {
      this.method47();
      this.field31.method172(var1.field940);
      this.field32 = var2;
      this.field35 = 0L;
      int var4 = this.field31.method160();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field31.method161(var5);
         this.field31.method164(var5);
         this.field31.method162(var5);
      }

      this.field33 = this.field31.method168();
      this.field34 = this.field31.field333[this.field33];
      this.field28 = this.field31.method171(this.field34);
   }

   public synchronized void method47() {
      this.field31.method159();
      this.method26();
   }

   public synchronized boolean method42() {
      return this.field31.method173();
   }

   public synchronized boolean method16() {
      return this.field40.method1430() > 0;
   }

   public synchronized void method33(int var1, int var2) {
      this.method38(var1, var2);
   }

   void method38(int var1, int var2) {
      this.field17[var1] = var2;
      this.field23[var1] = var2 & -128;
      this.method17(var1, var2);
   }

   void method17(int var1, int var2) {
      if (var2 != this.field18[var1]) {
         this.field18[var1] = var2;

         for(int var4 = 0; var4 < 128; ++var4) {
            this.field30[var1][var4] = null;
         }
      }

   }

   void method18(int var1, int var2, int var3) {
      this.method19(var1, var2, 64);
      if (0 != (this.field11[var1] & 2)) {
         for(class251 var5 = (class251)this.field37.field4002.method1992(); var5 != null; var5 = (class251)this.field37.field4002.method1997()) {
            if (var5.field1813 == var1 && var5.field1817 < 0) {
               this.field26[var1][var5.field1808] = null;
               this.field26[var1][var2] = var5;
               int var6 = var5.field1807 + (var5.field1812 * var5.field1815 >> 12);
               var5.field1807 += var2 - var5.field1808 << 8;
               var5.field1812 = var6 - var5.field1807;
               var5.field1815 = 4096;
               var5.field1808 = var2;
               return;
            }
         }
      }

      class162 var9 = (class162)this.field40.method1431((long)this.field18[var1]);
      if (null != var9) {
         if (null != var9.field1025[var2]) {
            class404 var10 = var9.field1025[var2].method1058();
            if (var10 != null) {
               class251 var7 = new class251();
               var7.field1813 = var1;
               var7.field1804 = var9;
               var7.field1805 = var10;
               var7.field1806 = var9.field1029[var2];
               var7.field1819 = var9.field1030[var2];
               var7.field1808 = var2;
               var7.field1809 = var9.field1027[var2] * var9.field1031 * var3 * var3 + 1024 >> 11;
               var7.field1810 = var9.field1028[var2] & 255;
               var7.field1807 = (var2 << 8) - (var9.field1026[var2] & 32767);
               var7.field1814 = 0;
               var7.field1821 = 0;
               var7.field1816 = 0;
               var7.field1817 = -1;
               var7.field1818 = 0;
               if (0 == this.field13[var1]) {
                  var7.field1811 = class271.method1231(var10, this.method40(var7), this.method41(var7), this.method30(var7));
               } else {
                  var7.field1811 = class271.method1231(var10, this.method40(var7), 0, this.method30(var7));
                  this.method29(var7, var9.field1026[var2] < 0);
               }

               if (var9.field1026[var2] < 0) {
                  var7.field1811.method1232(-1);
               }

               if (var7.field1819 >= 0) {
                  class251 var8 = this.field30[var1][var7.field1819];
                  if (null != var8 && var8.field1817 < 0) {
                     this.field26[var1][var8.field1808] = null;
                     var8.field1817 = 0;
                  }

                  this.field30[var1][var7.field1819] = var7;
               }

               this.field37.field4002.method1995(var7);
               this.field26[var1][var2] = var7;
            }
         }
      }
   }

   void method29(class251 var1, boolean var2) {
      int var4 = var1.field1805.field2808.length;
      int var5;
      if (var2 && var1.field1805.field2811) {
         int var6 = var4 + var4 - var1.field1805.field2809;
         var5 = (int)((long)var6 * (long)this.field13[var1.field1813] >> 6);
         var4 <<= 8;
         if (var5 >= var4) {
            var5 = var4 + var4 - 1 - var5;
            var1.field1811.method1265(true);
         }
      } else {
         var5 = (int)((long)var4 * (long)this.field13[var1.field1813] >> 6);
      }

      var1.field1811.method1237(var5);
   }

   void method19(int var1, int var2, int var3) {
      class251 var5 = this.field26[var1][var2];
      if (var5 != null) {
         this.field26[var1][var2] = null;
         if ((this.field11[var1] & 2) != 0) {
            for(class251 var6 = (class251)this.field37.field4002.method1991(); var6 != null; var6 = (class251)this.field37.field4002.method1993()) {
               if (var6.field1813 == var5.field1813 && var6.field1817 < 0 && var5 != var6) {
                  var5.field1817 = 0;
                  break;
               }
            }
         } else {
            var5.field1817 = 0;
         }

      }
   }

   void method20(int var1, int var2, int var3) {
   }

   void method21(int var1, int var2) {
   }

   void method22(int var1, int var2) {
      this.field29[var1] = var2;
   }

   void method44(int var1) {
      for(class251 var3 = (class251)this.field37.field4002.method1991(); var3 != null; var3 = (class251)this.field37.field4002.method1993()) {
         if (var1 < 0 || var1 == var3.field1813) {
            if (null != var3.field1811) {
               var3.field1811.method1239(class62.field481 / 100);
               if (var3.field1811.method1243()) {
                  this.field37.field4000.method586(var3.field1811);
               }

               var3.method1194();
            }

            if (var3.field1817 < 0) {
               this.field26[var3.field1813][var3.field1808] = null;
            }

            var3.method295();
         }
      }

   }

   void method23(int var1) {
      if (var1 >= 0) {
         this.field14[var1] = 12800;
         this.field15[var1] = 8192;
         this.field16[var1] = 16383;
         this.field29[var1] = 8192;
         this.field19[var1] = 0;
         this.field22[var1] = 8192;
         this.method25(var1);
         this.method39(var1);
         this.field11[var1] = 0;
         this.field24[var1] = 32767;
         this.field25[var1] = 256;
         this.field13[var1] = 0;
         this.method27(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method23(var1);
         }

      }
   }

   void method24(int var1) {
      for(class251 var3 = (class251)this.field37.field4002.method1991(); null != var3; var3 = (class251)this.field37.field4002.method1993()) {
         if ((var1 < 0 || var3.field1813 == var1) && var3.field1817 < 0) {
            this.field26[var3.field1813][var3.field1808] = null;
            var3.field1817 = 0;
         }
      }

   }

   void method26() {
      this.method44(-1);
      this.method23(-1);

      int var2;
      for(var2 = 0; var2 < 16; ++var2) {
         this.field18[var2] = this.field17[var2];
      }

      for(var2 = 0; var2 < 16; ++var2) {
         this.field23[var2] = this.field17[var2] & -128;
      }

   }

   void method25(int var1) {
      if (0 != (this.field11[var1] & 2)) {
         for(class251 var3 = (class251)this.field37.field4002.method1991(); var3 != null; var3 = (class251)this.field37.field4002.method1993()) {
            if (var3.field1813 == var1 && null == this.field26[var1][var3.field1808] && var3.field1817 < 0) {
               var3.field1817 = 0;
            }
         }
      }

   }

   void method39(int var1) {
      if (0 != (this.field11[var1] & 4)) {
         for(class251 var3 = (class251)this.field37.field4002.method1991(); var3 != null; var3 = (class251)this.field37.field4002.method1993()) {
            if (var1 == var3.field1813) {
               var3.field1823 = 0;
            }
         }
      }

   }

   void method28(int var1) {
      int var3 = var1 & 240;
      int var4;
      int var5;
      int var6;
      if (var3 == 128) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method19(var4, var5, var6);
      } else if (var3 == 144) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var6 > 0) {
            this.method18(var4, var5, var6);
         } else {
            this.method19(var4, var5, 64);
         }

      } else if (var3 == 160) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method20(var4, var5, var6);
      } else if (var3 == 176) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var5 == 0) {
            this.field23[var4] = (this.field23[var4] & -2080769) + (var6 << 14);
         }

         if (var5 == 32) {
            this.field23[var4] = (var6 << 7) + (this.field23[var4] & -16257);
         }

         if (var5 == 1) {
            this.field19[var4] = (var6 << 7) + (this.field19[var4] & -16257);
         }

         if (var5 == 33) {
            this.field19[var4] = var6 + (this.field19[var4] & -128);
         }

         if (var5 == 5) {
            this.field22[var4] = (var6 << 7) + (this.field22[var4] & -16257);
         }

         if (var5 == 37) {
            this.field22[var4] = var6 + (this.field22[var4] & -128);
         }

         if (var5 == 7) {
            this.field14[var4] = (this.field14[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 39) {
            this.field14[var4] = (this.field14[var4] & -128) + var6;
         }

         if (var5 == 10) {
            this.field15[var4] = (this.field15[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 42) {
            this.field15[var4] = var6 + (this.field15[var4] & -128);
         }

         if (var5 == 11) {
            this.field16[var4] = (this.field16[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 43) {
            this.field16[var4] = var6 + (this.field16[var4] & -128);
         }

         int[] var10000;
         if (var5 == 64) {
            if (var6 >= 64) {
               var10000 = this.field11;
               var10000[var4] |= 1;
            } else {
               var10000 = this.field11;
               var10000[var4] &= -2;
            }
         }

         if (var5 == 65) {
            if (var6 >= 64) {
               var10000 = this.field11;
               var10000[var4] |= 2;
            } else {
               this.method25(var4);
               var10000 = this.field11;
               var10000[var4] &= -3;
            }
         }

         if (var5 == 99) {
            this.field24[var4] = (var6 << 7) + (this.field24[var4] & 127);
         }

         if (var5 == 98) {
            this.field24[var4] = var6 + (this.field24[var4] & 16256);
         }

         if (var5 == 101) {
            this.field24[var4] = (var6 << 7) + (this.field24[var4] & 127) + 16384;
         }

         if (var5 == 100) {
            this.field24[var4] = 16384 + (this.field24[var4] & 16256) + var6;
         }

         if (var5 == 120) {
            this.method44(var4);
         }

         if (var5 == 121) {
            this.method23(var4);
         }

         if (var5 == 123) {
            this.method24(var4);
         }

         int var7;
         if (var5 == 6) {
            var7 = this.field24[var4];
            if (var7 == 16384) {
               this.field25[var4] = (var6 << 7) + (this.field25[var4] & -16257);
            }
         }

         if (var5 == 38) {
            var7 = this.field24[var4];
            if (var7 == 16384) {
               this.field25[var4] = (this.field25[var4] & -128) + var6;
            }
         }

         if (var5 == 16) {
            this.field13[var4] = (var6 << 7) + (this.field13[var4] & -16257);
         }

         if (var5 == 48) {
            this.field13[var4] = (this.field13[var4] & -128) + var6;
         }

         if (var5 == 81) {
            if (var6 >= 64) {
               var10000 = this.field11;
               var10000[var4] |= 4;
            } else {
               this.method39(var4);
               var10000 = this.field11;
               var10000[var4] &= -5;
            }
         }

         if (var5 == 17) {
            this.method27(var4, (this.field27[var4] & -16257) + (var6 << 7));
         }

         if (var5 == 49) {
            this.method27(var4, (this.field27[var4] & -128) + var6);
         }

      } else if (var3 == 192) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method17(var4, this.field23[var4] + var5);
      } else if (var3 == 208) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method21(var4, var5);
      } else if (var3 == 224) {
         var4 = var1 & 15;
         var5 = (var1 >> 9 & 16256) + (var1 >> 8 & 127);
         this.method22(var4, var5);
      } else {
         var3 = var1 & 255;
         if (var3 == 255) {
            this.method26();
         }
      }
   }

   void method27(int var1, int var2) {
      this.field27[var1] = var2;
      this.field38[var1] = (int)(2097152.0 * Math.pow(2.0, 5.4931640625E-4 * (double)var2) + 0.5);
   }

   int method40(class251 var1) {
      int var3 = var1.field1807 + (var1.field1815 * var1.field1812 >> 12);
      var3 += (this.field29[var1.field1813] - 8192) * this.field25[var1.field1813] >> 12;
      class38 var4 = var1.field1806;
      int var5;
      if (var4.field325 > 0 && (var4.field324 > 0 || this.field19[var1.field1813] > 0)) {
         var5 = var4.field324 << 2;
         int var6 = var4.field326 << 1;
         if (var1.field1803 < var6) {
            var5 = var5 * var1.field1803 / var6;
         }

         var5 += this.field19[var1.field1813] >> 7;
         double var7 = Math.sin(0.01227184630308513 * (double)(var1.field1820 & 511));
         var3 += (int)((double)var5 * var7);
      }

      var5 = (int)((double)(var1.field1805.field2810 * 256) * Math.pow(2.0, (double)var3 * 3.255208333333333E-4) / (double)class62.field481 + 0.5);
      return var5 < 1 ? 1 : var5;
   }

   int method41(class251 var1) {
      class38 var3 = var1.field1806;
      int var4 = 4096 + this.field14[var1.field1813] * this.field16[var1.field1813] >> 13;
      var4 = 16384 + var4 * var4 >> 15;
      var4 = var4 * var1.field1809 + 16384 >> 15;
      var4 = var4 * this.field12 + 128 >> 8;
      if (var3.field321 > 0) {
         var4 = (int)((double)var4 * Math.pow(0.5, 1.953125E-5 * (double)var1.field1814 * (double)var3.field321) + 0.5);
      }

      int var5;
      int var6;
      int var7;
      int var8;
      if (var3.field323 != null) {
         var5 = var1.field1821;
         var6 = var3.field323[var1.field1816 + 1];
         if (var1.field1816 < var3.field323.length - 2) {
            var7 = (var3.field323[var1.field1816] & 255) << 8;
            var8 = (var3.field323[var1.field1816 + 2] & 255) << 8;
            var6 += (var3.field323[3 + var1.field1816] - var6) * (var5 - var7) / (var8 - var7);
         }

         var4 = var6 * var4 + 32 >> 6;
      }

      if (var1.field1817 > 0 && null != var3.field328) {
         var5 = var1.field1817;
         var6 = var3.field328[var1.field1818 + 1];
         if (var1.field1818 < var3.field328.length - 2) {
            var7 = (var3.field328[var1.field1818] & 255) << 8;
            var8 = (var3.field328[var1.field1818 + 2] & 255) << 8;
            var6 += (var5 - var7) * (var3.field328[3 + var1.field1818] - var6) / (var8 - var7);
         }

         var4 = 32 + var4 * var6 >> 6;
      }

      return var4;
   }

   int method30(class251 var1) {
      int var3 = this.field15[var1.field1813];
      return var3 < 8192 ? var1.field1810 * var3 + 32 >> 6 : 16384 - (32 + (16384 - var3) * (128 - var1.field1810) >> 6);
   }

   protected synchronized class460 method2169() {
      return this.field37;
   }

   protected synchronized class460 method2170() {
      return null;
   }

   protected synchronized int method2167() {
      return 0;
   }

   protected synchronized void method2172(int[] var1, int var2, int var3) {
      if (this.field31.method173()) {
         int var4 = this.field31.field330 * this.field20 / class62.field481;

         do {
            long var5 = (long)var4 * (long)var3 + this.field35;
            if (this.field28 - var5 >= 0L) {
               this.field35 = var5;
               break;
            }

            int var7 = (int)(((long)var4 + (this.field28 - this.field35) - 1L) / (long)var4);
            this.field35 += (long)var4 * (long)var7;
            this.field37.method2172(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method35();
         } while(this.field31.method173());
      }

      this.field37.method2172(var1, var2, var3);
   }

   protected synchronized void method2171(int var1) {
      if (this.field31.method173()) {
         int var2 = this.field20 * this.field31.field330 / class62.field481;

         do {
            long var3 = this.field35 + (long)var1 * (long)var2;
            if (this.field28 - var3 >= 0L) {
               this.field35 = var3;
               break;
            }

            int var5 = (int)(((long)var2 + (this.field28 - this.field35) - 1L) / (long)var2);
            this.field35 += (long)var2 * (long)var5;
            this.field37.method2171(var5);
            var1 -= var5;
            this.method35();
         } while(this.field31.method173());
      }

      this.field37.method2171(var1);
   }

   void method35() {
      int var2 = this.field33;
      int var3 = this.field34;

      long var4;
      for(var4 = this.field28; this.field34 == var3; var4 = this.field31.method171(var3)) {
         while(this.field31.field333[var2] == var3) {
            this.field31.method161(var2);
            int var6 = this.field31.method165(var2);
            if (var6 == 1) {
               this.field31.method163();
               this.field31.method162(var2);
               if (this.field31.method169()) {
                  if (!this.field32 || var3 == 0) {
                     this.method26();
                     this.field31.method159();
                     return;
                  }

                  this.field31.method170(var4);
               }
               break;
            }

            if ((var6 & 128) != 0) {
               this.method28(var6);
            }

            this.field31.method164(var2);
            this.field31.method162(var2);
         }

         var2 = this.field31.method168();
         var3 = this.field31.field333[var2];
      }

      this.field33 = var2;
      this.field34 = var3;
      this.field28 = var4;
   }

   boolean method46(class251 var1) {
      if (null == var1.field1811) {
         if (var1.field1817 >= 0) {
            var1.method295();
            if (var1.field1819 > 0 && this.field30[var1.field1813][var1.field1819] == var1) {
               this.field30[var1.field1813][var1.field1819] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   boolean method36(class251 var1, int[] var2, int var3, int var4) {
      var1.field1822 = class62.field481 / 100;
      if (var1.field1817 < 0 || null != var1.field1811 && !var1.field1811.method1242()) {
         int var6 = var1.field1815;
         if (var6 > 0) {
            var6 -= (int)(16.0 * Math.pow(2.0, 4.921259842519685E-4 * (double)this.field22[var1.field1813]) + 0.5);
            if (var6 < 0) {
               var6 = 0;
            }

            var1.field1815 = var6;
         }

         var1.field1811.method1240(this.method40(var1));
         class38 var7 = var1.field1806;
         boolean var8 = false;
         ++var1.field1803;
         var1.field1820 += var7.field325;
         double var9 = 5.086263020833333E-6 * (double)((var1.field1812 * var1.field1815 >> 12) + (var1.field1808 - 60 << 8));
         if (var7.field321 > 0) {
            if (var7.field319 > 0) {
               var1.field1814 += (int)(128.0 * Math.pow(2.0, (double)var7.field319 * var9) + 0.5);
            } else {
               var1.field1814 += 128;
            }
         }

         if (var7.field323 != null) {
            if (var7.field320 > 0) {
               var1.field1821 += (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field320) + 0.5);
            } else {
               var1.field1821 += 128;
            }

            while(var1.field1816 < var7.field323.length - 2 && var1.field1821 > (var7.field323[var1.field1816 + 2] & 255) << 8) {
               var1.field1816 += 2;
            }

            if (var1.field1816 == var7.field323.length - 2 && 0 == var7.field323[var1.field1816 + 1]) {
               var8 = true;
            }
         }

         if (var1.field1817 >= 0 && var7.field328 != null && (this.field11[var1.field1813] & 1) == 0 && (var1.field1819 < 0 || var1 != this.field30[var1.field1813][var1.field1819])) {
            if (var7.field322 > 0) {
               var1.field1817 += (int)(128.0 * Math.pow(2.0, var9 * (double)var7.field322) + 0.5);
            } else {
               var1.field1817 += 128;
            }

            while(var1.field1818 < var7.field328.length - 2 && var1.field1817 > (var7.field328[2 + var1.field1818] & 255) << 8) {
               var1.field1818 += 2;
            }

            if (var1.field1818 == var7.field328.length - 2) {
               var8 = true;
            }
         }

         if (var8) {
            var1.field1811.method1239(var1.field1822);
            if (null != var2) {
               var1.field1811.method2172(var2, var3, var4);
            } else {
               var1.field1811.method2171(var4);
            }

            if (var1.field1811.method1243()) {
               this.field37.field4000.method586(var1.field1811);
            }

            var1.method1194();
            if (var1.field1817 >= 0) {
               var1.method295();
               if (var1.field1819 > 0 && this.field30[var1.field1813][var1.field1819] == var1) {
                  this.field30[var1.field1813][var1.field1819] = null;
               }
            }

            return true;
         } else {
            var1.field1811.method1247(var1.field1822, this.method41(var1), this.method30(var1));
            return false;
         }
      } else {
         var1.method1194();
         var1.method295();
         if (var1.field1819 > 0 && this.field30[var1.field1813][var1.field1819] == var1) {
            this.field30[var1.field1813][var1.field1819] = null;
         }

         return true;
      }
   }
}
