import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.Iterator;

public abstract class class535 extends Applet implements Runnable, FocusListener, WindowListener {
   protected static class238 field4270 = new class238();
   protected static class250 field4242;
   protected static int field4247 = 0;
   static boolean field4249 = false;
   static class535 field4253 = null;
   static int field4239 = 0;
   static int field4243;
   static int field4244 = 20;
   static int field4245 = 1;
   static int field4262 = 500;
   static Image field4264;
   static long field4241 = -1L;
   static long field4265 = 0L;
   static long field4272 = -1L;
   static long[] field4240 = new long[32];
   static long[] field4248 = new long[32];
   static volatile boolean field4269 = true;
   boolean field4237 = false;
   boolean field4263 = false;
   class253 field4266;
   int field4238;
   int field4251 = 0;
   int field4254;
   int field4256;
   int field4260;
   int field4271 = 0;
   Canvas field4259;
   Frame field4258;
   Clipboard field4267;
   final EventQueue field4268;
   protected boolean field4257 = false;
   protected int field4255;
   protected int field4261;
   volatile boolean field4246 = false;
   volatile boolean field4250 = true;
   volatile long field4252 = 0L;

   protected class535() {
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
      }

      this.field4268 = var1;
      class392 var2 = new class392();
      class514.field4103 = var2;
   }

   protected abstract void method2537();

   protected abstract void method2545();

   protected abstract void method2556(boolean var1);

   protected abstract void method2560();

   protected abstract void method2566();

   protected abstract void method2567();

   public abstract void init();

   protected final void method2536(int var1, int var2) {
      if (var1 != this.field4260 || this.field4256 != var2) {
         this.method2554();
      }

      this.field4260 = var1;
      this.field4256 = var2;
   }

   final void method2562(Object var1) {
      if (this.field4268 != null) {
         for(int var3 = 0; var3 < 50 && this.field4268.peekEvent() != null; ++var3) {
            class415.method1902(1L);
         }

         if (var1 != null) {
            this.field4268.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   protected class45 method2570() {
      if (null == this.field4266) {
         this.field4266 = new class253();
         this.field4266.method1195(this.field4259);
      }

      return this.field4266;
   }

   protected void method2538() {
      this.field4267 = this.getToolkit().getSystemClipboard();
   }

   protected void method2539(String var1) {
      this.field4267.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   protected Clipboard method2540() {
      return this.field4267;
   }

   protected final void method2541() {
      if (class250.field1802.toLowerCase().indexOf("microsoft") != -1) {
         class150.field959[186] = 57;
         class150.field959[187] = 27;
         class150.field959[188] = 71;
         class150.field959[189] = 26;
         class150.field959[190] = 72;
         class150.field959[191] = 73;
         class150.field959[192] = 58;
         class150.field959[219] = 42;
         class150.field959[220] = 74;
         class150.field959[221] = 43;
         class150.field959[222] = 59;
         class150.field959[223] = 28;
      } else {
         class150.field959[44] = 71;
         class150.field959[45] = 26;
         class150.field959[46] = 72;
         class150.field959[47] = 73;
         class150.field959[59] = 57;
         class150.field959[61] = 27;
         class150.field959[91] = 42;
         class150.field959[92] = 74;
         class150.field959[93] = 43;
         class150.field959[192] = 28;
         class150.field959[222] = 58;
         class150.field959[520] = 59;
      }

      field4270.method1158(this.field4259);
   }

   protected final void method2542() {
      field4270.method1162();
   }

   protected void method2568(class44 var1, int var2) {
      field4270.method1159(var1, var2);
   }

   protected final void method2543() {
      Canvas var2 = this.field4259;
      var2.addMouseListener(class496.field3974);
      var2.addMouseMotionListener(class496.field3974);
      var2.addFocusListener(class496.field3974);
   }

   final void method2544() {
      Container var2 = this.method2558();
      if (var2 != null) {
         class205 var3 = this.method2559();
         this.field4255 = Math.max(var3.field1577, this.field4238);
         this.field4261 = Math.max(var3.field1575, this.field4254);
         if (this.field4255 <= 0) {
            this.field4255 = 1;
         }

         if (this.field4261 <= 0) {
            this.field4261 = 1;
         }

         class114.field730 = Math.min(this.field4255, this.field4260);
         class394.field2761 = Math.min(this.field4261, this.field4256);
         this.field4251 = (this.field4255 - class114.field730) / 2;
         this.field4271 = 0;
         this.field4259.setSize(class114.field730, class394.field2761);
         class143.field899 = new class442(class114.field730, class394.field2761, this.field4259, this.field4257);
         if (this.field4258 == var2) {
            Insets var4 = this.field4258.getInsets();
            this.field4259.setLocation(var4.left + this.field4251, var4.top + this.field4271);
         } else {
            this.field4259.setLocation(this.field4251, this.field4271);
         }

         this.field4250 = true;
         this.method2545();
      }
   }

   void method2564() {
      int var2 = this.field4251;
      int var3 = this.field4271;
      int var4 = this.field4255 - class114.field730 - var2;
      int var5 = this.field4261 - class394.field2761 - var3;
      if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
         try {
            Container var6 = this.method2558();
            int var7 = 0;
            int var8 = 0;
            if (var6 == this.field4258) {
               Insets var9 = this.field4258.getInsets();
               var7 = var9.left;
               var8 = var9.top;
            }

            Graphics var11 = var6.getGraphics();
            var11.setColor(Color.black);
            if (var2 > 0) {
               var11.fillRect(var7, var8, var2, this.field4261);
            }

            if (var3 > 0) {
               var11.fillRect(var7, var8, this.field4255, var3);
            }

            if (var4 > 0) {
               var11.fillRect(var7 + this.field4255 - var4, var8, var4, this.field4261);
            }

            if (var5 > 0) {
               var11.fillRect(var7, this.field4261 + var8 - var5, this.field4255, var5);
            }
         } catch (Exception var10) {
         }
      }

   }

   final void method2565() {
      field4270.method1161(this.field4259);
      Canvas var2 = this.field4259;
      var2.removeMouseListener(class496.field3974);
      var2.removeMouseMotionListener(class496.field3974);
      var2.removeFocusListener(class496.field3974);
      class496.field3963 = 0;
      if (this.field4266 != null) {
         this.field4266.method1196(this.field4259);
      }

      this.method2546();
      field4270.method1158(this.field4259);
      Canvas var3 = this.field4259;
      var3.addMouseListener(class496.field3974);
      var3.addMouseMotionListener(class496.field3974);
      var3.addFocusListener(class496.field3974);
      if (this.field4266 != null) {
         this.field4266.method1195(this.field4259);
      }

      this.method2554();
   }

   protected final void method2555(int var1, int var2, int var3, int var4) {
      try {
         if (field4253 != null) {
            ++field4239;
            if (field4239 >= 3) {
               this.method2557("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         field4253 = this;
         class114.field730 = var1;
         class394.field2761 = var2;
         class425.field3319 = var3;
         class425.field3315 = var4;
         class425.field3313 = this;
         if (field4242 == null) {
            field4242 = new class250();
         }

         field4242.method1191(this, 1);
      } catch (Exception var7) {
         class431.method2006((String)null, var7);
         this.method2557("crash");
      }

   }

   final synchronized void method2546() {
      Container var2 = this.method2558();
      if (this.field4259 != null) {
         this.field4259.removeFocusListener(this);
         var2.remove(this.field4259);
      }

      class114.field730 = Math.max(var2.getWidth(), this.field4238);
      class394.field2761 = Math.max(var2.getHeight(), this.field4254);
      Insets var3;
      if (this.field4258 != null) {
         var3 = this.field4258.getInsets();
         class114.field730 -= var3.right + var3.left;
         class394.field2761 -= var3.bottom + var3.top;
      }

      this.field4259 = new class512(this);
      var2.setBackground(Color.BLACK);
      var2.setLayout((LayoutManager)null);
      var2.add(this.field4259);
      this.field4259.setSize(class114.field730, class394.field2761);
      this.field4259.setVisible(true);
      this.field4259.setBackground(Color.BLACK);
      if (var2 == this.field4258) {
         var3 = this.field4258.getInsets();
         this.field4259.setLocation(this.field4251 + var3.left, this.field4271 + var3.top);
      } else {
         this.field4259.setLocation(this.field4251, this.field4271);
      }

      this.field4259.addFocusListener(this);
      this.field4259.requestFocus();
      this.field4250 = true;
      if (null != class143.field899 && class143.field899.field2135 == class114.field730 && class394.field2761 == class143.field899.field2137) {
         ((class442)class143.field899).method2046(this.field4259);
         class143.field899.method1442(0, 0);
      } else {
         class143.field899 = new class442(class114.field730, class394.field2761, this.field4259, this.field4257);
      }

      this.field4246 = false;
      this.field4252 = class123.method471();
   }

   protected void method2547(boolean var1) {
      if (var1 != this.field4257) {
         this.field4257 = var1;
         class143.field899.method1444(var1);
         class143.field899.method1445();
      }

   }

   protected final boolean method2563() {
      String var2 = this.getDocumentBase().getHost().toLowerCase();
      if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
         if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
            if (var2.endsWith("127.0.0.1")) {
               return true;
            } else {
               while(var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                  var2 = var2.substring(0, var2.length() - 1);
               }

               if (var2.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.method2557("invalidhost");
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public void run() {
      try {
         if (class250.field1802 != null) {
            String var1 = class250.field1802.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = class529.field4180;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method2557("wrongjava");
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class193.method991(var2.charAt(var3)); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if (class447.method2089(var4) && class447.method2083(var4) < 10) {
                     this.method2557("wrongjava");
                     return;
                  }
               }

               field4245 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method2546();
         this.method2566();

         Object var7;
         try {
            var7 = new class521();
         } catch (Throwable var5) {
            var7 = new class286();
         }

         class125.field798 = (class454)var7;

         while(0L == field4265 || class123.method471() < field4265) {
            field4243 = class125.field798.method2113(field4244, field4245);

            for(int var8 = 0; var8 < field4243; ++var8) {
               this.method2548();
            }

            this.method2550();
            this.method2562(this.field4259);
         }
      } catch (Exception var6) {
         class431.method2006((String)null, var6);
         this.method2557("crash");
      }

      this.method2552();
   }

   void method2548() {
      long var2 = class123.method471();
      long var4 = field4248[class479.field3777];
      field4248[class479.field3777] = var2;
      class479.field3777 = class479.field3777 + 1 & 31;
      if (0L != var4 && var2 > var4) {
      }

      synchronized(this) {
         class28.field268 = field4269;
      }

      this.method2567();
   }

   protected final void method2549() {
      this.field4250 = true;
   }

   void method2550() {
      Container var2 = this.method2558();
      long var3 = class123.method471();
      long var5 = field4240[class58.field469];
      field4240[class58.field469] = var3;
      class58.field469 = class58.field469 + 1 & 31;
      if (var5 != 0L && var3 > var5) {
         int var7 = (int)(var3 - var5);
         field4247 = ((var7 >> 1) + 32000) / var7;
      }

      if (++field4262 - 1 > 50) {
         field4262 -= 50;
         this.field4250 = true;
         this.field4259.setSize(class114.field730, class394.field2761);
         this.field4259.setVisible(true);
         if (var2 == this.field4258) {
            Insets var8 = this.field4258.getInsets();
            this.field4259.setLocation(this.field4251 + var8.left, this.field4271 + var8.top);
         } else {
            this.field4259.setLocation(this.field4251, this.field4271);
         }
      }

      if (this.field4246) {
         this.method2565();
      }

      this.method2551();
      this.method2556(this.field4250);
      if (this.field4250) {
         this.method2564();
      }

      this.field4250 = false;
   }

   final void method2551() {
      class205 var2 = this.method2559();
      if (this.field4255 != var2.field1577 || this.field4261 != var2.field1575 || this.field4263) {
         this.method2544();
         this.field4263 = false;
      }

   }

   final void method2554() {
      this.field4263 = true;
   }

   final synchronized void method2552() {
      if (!field4249) {
         field4249 = true;

         try {
            this.field4259.removeFocusListener(this);
         } catch (Exception var6) {
         }

         try {
            this.method2537();
         } catch (Exception var5) {
         }

         if (this.field4258 != null) {
            try {
               System.exit(0);
            } catch (Throwable var4) {
            }
         }

         if (field4242 != null) {
            try {
               field4242.method1193();
            } catch (Exception var3) {
            }
         }

         this.method2560();
      }
   }

   public final void start() {
      if (field4253 == this && !field4249) {
         field4265 = 0L;
      }
   }

   public final void stop() {
      if (this == field4253 && !field4249) {
         field4265 = class123.method471() + 4000L;
      }
   }

   public final void destroy() {
      if (field4253 == this && !field4249) {
         field4265 = class123.method471();
         class415.method1902(5000L);
         this.method2552();
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final synchronized void paint(Graphics var1) {
      if (this == field4253 && !field4249) {
         this.field4250 = true;
         if (class123.method471() - this.field4252 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (null == var2 || var2.width >= class114.field730 && var2.height >= class394.field2761) {
               this.field4246 = true;
            }
         }

      }
   }

   public final void focusGained(FocusEvent var1) {
      field4269 = true;
      this.field4250 = true;
   }

   public final void focusLost(FocusEvent var1) {
      field4269 = false;
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   protected final void method2553(int var1, String var2, boolean var3) {
      try {
         Graphics var5 = this.field4259.getGraphics();
         if (null == class307.field2085) {
            class307.field2085 = new Font("Helvetica", 1, 13);
            class204.field1573 = this.field4259.getFontMetrics(class307.field2085);
         }

         if (var3) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, class114.field730, class394.field2761);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (null == field4264) {
               field4264 = this.field4259.createImage(304, 34);
            }

            Graphics var7 = field4264.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, var1 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, 31);
            var7.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
            var7.setFont(class307.field2085);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - class204.field1573.stringWidth(var2)) / 2, 22);
            var5.drawImage(field4264, class114.field730 / 2 - 152, class394.field2761 / 2 - 18, (ImageObserver)null);
         } catch (Exception var10) {
            int var8 = class114.field730 / 2 - 152;
            int var9 = class394.field2761 / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 303, 33);
            var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
            var5.setColor(Color.black);
            var5.drawRect(var8 + 1, var9 + 1, 301, 31);
            var5.fillRect(var8 + 2 + var1 * 3, var9 + 2, 300 - var1 * 3, 30);
            var5.setFont(class307.field2085);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - class204.field1573.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.field4259.repaint();
      }

   }

   protected final void method2569() {
      field4264 = null;
      class307.field2085 = null;
      class204.field1573 = null;
   }

   protected void method2557(String var1) {
      if (!this.field4237) {
         this.field4237 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var4) {
         }

      }
   }

   Container method2558() {
      return (Container)(null != this.field4258 ? this.field4258 : this);
   }

   class205 method2559() {
      Container var2 = this.method2558();
      int var3 = Math.max(var2.getWidth(), this.field4238);
      int var4 = Math.max(var2.getHeight(), this.field4254);
      if (null != this.field4258) {
         Insets var5 = this.field4258.getInsets();
         var3 -= var5.right + var5.left;
         var4 -= var5.top + var5.bottom;
      }

      return new class205(var3, var4);
   }

   protected final boolean method2561() {
      return null != this.field4258;
   }

   protected static final void method2571() {
      class125.field798.method2112();

      int var1;
      for(var1 = 0; var1 < 32; ++var1) {
         field4240[var1] = 0L;
      }

      for(var1 = 0; var1 < 32; ++var1) {
         field4248[var1] = 0L;
      }

      field4243 = 0;
   }

   protected static int method2572() {
      int var1 = 0;
      if (class169.field1071 == null || !class169.field1071.isValid()) {
         try {
            Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var2.hasNext()) {
               GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
               if (var3.isValid()) {
                  class169.field1071 = var3;
                  field4272 = -1L;
                  field4241 = -1L;
               }
            }
         } catch (Throwable var10) {
         }
      }

      if (class169.field1071 != null) {
         long var11 = class123.method471();
         long var4 = class169.field1071.getCollectionTime();
         if (field4241 != -1L) {
            long var6 = var4 - field4241;
            long var8 = var11 - field4272;
            if (var8 != 0L) {
               var1 = (int)(var6 * 100L / var8);
            }
         }

         field4241 = var4;
         field4272 = var11;
      }

      return var1;
   }
}
