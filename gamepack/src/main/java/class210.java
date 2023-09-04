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

public abstract class class210 extends Applet implements Runnable, FocusListener, WindowListener {
   protected static class113 field1997 = new class113();
   protected static class93 field1969;
   protected static int field1974 = 0;
   static boolean field1976 = false;
   static class210 field1980 = null;
   static int field1966 = 0;
   static int field1970;
   static int field1971 = 20;
   static int field1972 = 1;
   static int field1989 = 500;
   static Image field1991;
   static long field1968 = -1L;
   static long field1992 = 0L;
   static long field1999 = -1L;
   static long[] field1967 = new long[32];
   static long[] field1975 = new long[32];
   static volatile boolean field1996 = true;
   boolean field1964 = false;
   boolean field1990 = false;
   class435 field1993;
   int field1965;
   int field1978 = 0;
   int field1981;
   int field1983;
   int field1987;
   int field1998 = 0;
   Canvas field1986;
   Frame field1985;
   Clipboard field1994;
   final EventQueue field1995;
   protected boolean field1984 = false;
   protected int field1982;
   protected int field1988;
   volatile boolean field1973 = false;
   volatile boolean field1977 = true;
   volatile long field1979 = 0L;

   protected class210() {
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
      }

      this.field1995 = var1;
      class279 var2 = new class279();
      class189.field1855 = var2;
   }

   protected abstract void method1267();

   protected abstract void method1275();

   protected abstract void method1286(boolean var1);

   protected abstract void method1290();

   protected abstract void method1296();

   protected abstract void method1297();

   public abstract void init();

   protected final void method1266(int var1, int var2) {
      if (var1 != this.field1987 || this.field1983 != var2) {
         this.method1284();
      }

      this.field1987 = var1;
      this.field1983 = var2;
   }

   final void method1292(Object var1) {
      if (this.field1995 != null) {
         for(int var3 = 0; var3 < 50 && this.field1995.peekEvent() != null; ++var3) {
            class51.method602(1L);
         }

         if (var1 != null) {
            this.field1995.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   protected class457 method1300() {
      if (null == this.field1993) {
         this.field1993 = new class435();
         this.field1993.method2134(this.field1986);
      }

      return this.field1993;
   }

   protected void method1268() {
      this.field1994 = this.getToolkit().getSystemClipboard();
   }

   protected void method1269(String var1) {
      this.field1994.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   protected Clipboard method1270() {
      return this.field1994;
   }

   protected final void method1271() {
      if (class93.field1298.toLowerCase().indexOf("microsoft") != -1) {
         class57.field1080[186] = 57;
         class57.field1080[187] = 27;
         class57.field1080[188] = 71;
         class57.field1080[189] = 26;
         class57.field1080[190] = 72;
         class57.field1080[191] = 73;
         class57.field1080[192] = 58;
         class57.field1080[219] = 42;
         class57.field1080[220] = 74;
         class57.field1080[221] = 43;
         class57.field1080[222] = 59;
         class57.field1080[223] = 28;
      } else {
         class57.field1080[44] = 71;
         class57.field1080[45] = 26;
         class57.field1080[46] = 72;
         class57.field1080[47] = 73;
         class57.field1080[59] = 57;
         class57.field1080[61] = 27;
         class57.field1080[91] = 42;
         class57.field1080[92] = 74;
         class57.field1080[93] = 43;
         class57.field1080[192] = 28;
         class57.field1080[222] = 58;
         class57.field1080[520] = 59;
      }

      field1997.method809(this.field1986);
   }

   protected final void method1272() {
      field1997.method813();
   }

   protected void method1298(class203 var1, int var2) {
      field1997.method810(var1, var2);
   }

   protected final void method1273() {
      Canvas var2 = this.field1986;
      var2.addMouseListener(class441.field3346);
      var2.addMouseMotionListener(class441.field3346);
      var2.addFocusListener(class441.field3346);
   }

   final void method1274() {
      Container var2 = this.method1288();
      if (var2 != null) {
         class119 var3 = this.method1289();
         this.field1982 = Math.max(var3.field1484, this.field1965);
         this.field1988 = Math.max(var3.field1482, this.field1981);
         if (this.field1982 <= 0) {
            this.field1982 = 1;
         }

         if (this.field1988 <= 0) {
            this.field1988 = 1;
         }

         class426.field3228 = Math.min(this.field1982, this.field1987);
         class456.field3562 = Math.min(this.field1988, this.field1983);
         this.field1978 = (this.field1982 - class426.field3228) / 2;
         this.field1998 = 0;
         this.field1986.setSize(class426.field3228, class456.field3562);
         class300.field2508 = new class62(class426.field3228, class456.field3562, this.field1986, this.field1984);
         if (this.field1985 == var2) {
            Insets var4 = this.field1985.getInsets();
            this.field1986.setLocation(var4.left + this.field1978, var4.top + this.field1998);
         } else {
            this.field1986.setLocation(this.field1978, this.field1998);
         }

         this.field1977 = true;
         this.method1275();
      }
   }

   void method1294() {
      int var2 = this.field1978;
      int var3 = this.field1998;
      int var4 = this.field1982 - class426.field3228 - var2;
      int var5 = this.field1988 - class456.field3562 - var3;
      if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
         try {
            Container var6 = this.method1288();
            int var7 = 0;
            int var8 = 0;
            if (var6 == this.field1985) {
               Insets var9 = this.field1985.getInsets();
               var7 = var9.left;
               var8 = var9.top;
            }

            Graphics var11 = var6.getGraphics();
            var11.setColor(Color.black);
            if (var2 > 0) {
               var11.fillRect(var7, var8, var2, this.field1988);
            }

            if (var3 > 0) {
               var11.fillRect(var7, var8, this.field1982, var3);
            }

            if (var4 > 0) {
               var11.fillRect(var7 + this.field1982 - var4, var8, var4, this.field1988);
            }

            if (var5 > 0) {
               var11.fillRect(var7, this.field1988 + var8 - var5, this.field1982, var5);
            }
         } catch (Exception var10) {
         }
      }

   }

   final void method1295() {
      field1997.method812(this.field1986);
      Canvas var2 = this.field1986;
      var2.removeMouseListener(class441.field3346);
      var2.removeMouseMotionListener(class441.field3346);
      var2.removeFocusListener(class441.field3346);
      class441.field3335 = 0;
      if (this.field1993 != null) {
         this.field1993.method2136(this.field1986);
      }

      this.method1276();
      field1997.method809(this.field1986);
      Canvas var3 = this.field1986;
      var3.addMouseListener(class441.field3346);
      var3.addMouseMotionListener(class441.field3346);
      var3.addFocusListener(class441.field3346);
      if (this.field1993 != null) {
         this.field1993.method2134(this.field1986);
      }

      this.method1284();
   }

   protected final void method1285(int var1, int var2, int var3, int var4) {
      try {
         if (field1980 != null) {
            ++field1966;
            if (field1966 >= 3) {
               this.method1287("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         field1980 = this;
         class426.field3228 = var1;
         class456.field3562 = var2;
         class340.field2727 = var3;
         class340.field2723 = var4;
         class340.field2721 = this;
         if (field1969 == null) {
            field1969 = new class93();
         }

         field1969.method727(this, 1);
      } catch (Exception var7) {
         class194.method1208((String)null, var7);
         this.method1287("crash");
      }

   }

   final synchronized void method1276() {
      Container var2 = this.method1288();
      if (this.field1986 != null) {
         this.field1986.removeFocusListener(this);
         var2.remove(this.field1986);
      }

      class426.field3228 = Math.max(var2.getWidth(), this.field1965);
      class456.field3562 = Math.max(var2.getHeight(), this.field1981);
      Insets var3;
      if (this.field1985 != null) {
         var3 = this.field1985.getInsets();
         class426.field3228 -= var3.right + var3.left;
         class456.field3562 -= var3.bottom + var3.top;
      }

      this.field1986 = new class477(this);
      var2.setBackground(Color.BLACK);
      var2.setLayout((LayoutManager)null);
      var2.add(this.field1986);
      this.field1986.setSize(class426.field3228, class456.field3562);
      this.field1986.setVisible(true);
      this.field1986.setBackground(Color.BLACK);
      if (var2 == this.field1985) {
         var3 = this.field1985.getInsets();
         this.field1986.setLocation(this.field1978 + var3.left, this.field1998 + var3.top);
      } else {
         this.field1986.setLocation(this.field1978, this.field1998);
      }

      this.field1986.addFocusListener(this);
      this.field1986.requestFocus();
      this.field1977 = true;
      if (null != class300.field2508 && class300.field2508.field1615 == class426.field3228 && class456.field3562 == class300.field2508.field1617) {
         ((class62)class300.field2508).method631(this.field1986);
         class300.field2508.method929(0, 0);
      } else {
         class300.field2508 = new class62(class426.field3228, class456.field3562, this.field1986, this.field1984);
      }

      this.field1973 = false;
      this.field1979 = class80.method713();
   }

   protected void method1277(boolean var1) {
      if (var1 != this.field1984) {
         this.field1984 = var1;
         class300.field2508.method931(var1);
         class300.field2508.method932();
      }

   }

   protected final boolean method1293() {
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
                  this.method1287("invalidhost");
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
         if (class93.field1298 != null) {
            String var1 = class93.field1298.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = class523.field4125;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.method1287("wrongjava");
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class519.method2475(var2.charAt(var3)); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if (class330.method1742(var4) && class330.method1736(var4) < 10) {
                     this.method1287("wrongjava");
                     return;
                  }
               }

               field1972 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method1276();
         this.method1296();

         Object var7;
         try {
            var7 = new class29();
         } catch (Throwable var5) {
            var7 = new class67();
         }

         class392.field3077 = (class308)var7;

         while(0L == field1992 || class80.method713() < field1992) {
            field1970 = class392.field3077.method1672(field1971, field1972);

            for(int var8 = 0; var8 < field1970; ++var8) {
               this.method1278();
            }

            this.method1280();
            this.method1292(this.field1986);
         }
      } catch (Exception var6) {
         class194.method1208((String)null, var6);
         this.method1287("crash");
      }

      this.method1282();
   }

   void method1278() {
      long var2 = class80.method713();
      long var4 = field1975[class348.field2754];
      field1975[class348.field2754] = var2;
      class348.field2754 = class348.field2754 + 1 & 31;
      if (0L != var4 && var2 > var4) {
      }

      synchronized(this) {
         class163.field1694 = field1996;
      }

      this.method1297();
   }

   protected final void method1279() {
      this.field1977 = true;
   }

   void method1280() {
      Container var2 = this.method1288();
      long var3 = class80.method713();
      long var5 = field1967[class206.field1947];
      field1967[class206.field1947] = var3;
      class206.field1947 = class206.field1947 + 1 & 31;
      if (var5 != 0L && var3 > var5) {
         int var7 = (int)(var3 - var5);
         field1974 = ((var7 >> 1) + 32000) / var7;
      }

      if (++field1989 - 1 > 50) {
         field1989 -= 50;
         this.field1977 = true;
         this.field1986.setSize(class426.field3228, class456.field3562);
         this.field1986.setVisible(true);
         if (var2 == this.field1985) {
            Insets var8 = this.field1985.getInsets();
            this.field1986.setLocation(this.field1978 + var8.left, this.field1998 + var8.top);
         } else {
            this.field1986.setLocation(this.field1978, this.field1998);
         }
      }

      if (this.field1973) {
         this.method1295();
      }

      this.method1281();
      this.method1286(this.field1977);
      if (this.field1977) {
         this.method1294();
      }

      this.field1977 = false;
   }

   final void method1281() {
      class119 var2 = this.method1289();
      if (this.field1982 != var2.field1484 || this.field1988 != var2.field1482 || this.field1990) {
         this.method1274();
         this.field1990 = false;
      }

   }

   final void method1284() {
      this.field1990 = true;
   }

   final synchronized void method1282() {
      if (!field1976) {
         field1976 = true;

         try {
            this.field1986.removeFocusListener(this);
         } catch (Exception var6) {
         }

         try {
            this.method1267();
         } catch (Exception var5) {
         }

         if (this.field1985 != null) {
            try {
               System.exit(0);
            } catch (Throwable var4) {
            }
         }

         if (field1969 != null) {
            try {
               field1969.method729();
            } catch (Exception var3) {
            }
         }

         this.method1290();
      }
   }

   public final void start() {
      if (field1980 == this && !field1976) {
         field1992 = 0L;
      }
   }

   public final void stop() {
      if (this == field1980 && !field1976) {
         field1992 = class80.method713() + 4000L;
      }
   }

   public final void destroy() {
      if (field1980 == this && !field1976) {
         field1992 = class80.method713();
         class51.method602(5000L);
         this.method1282();
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final synchronized void paint(Graphics var1) {
      if (this == field1980 && !field1976) {
         this.field1977 = true;
         if (class80.method713() - this.field1979 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (null == var2 || var2.width >= class426.field3228 && var2.height >= class456.field3562) {
               this.field1973 = true;
            }
         }

      }
   }

   public final void focusGained(FocusEvent var1) {
      field1996 = true;
      this.field1977 = true;
   }

   public final void focusLost(FocusEvent var1) {
      field1996 = false;
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

   protected final void method1283(int var1, String var2, boolean var3) {
      try {
         Graphics var5 = this.field1986.getGraphics();
         if (null == class372.field2919) {
            class372.field2919 = new Font("Helvetica", 1, 13);
            class52.field1072 = this.field1986.getFontMetrics(class372.field2919);
         }

         if (var3) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, class426.field3228, class456.field3562);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (null == field1991) {
               field1991 = this.field1986.createImage(304, 34);
            }

            Graphics var7 = field1991.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, var1 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, 31);
            var7.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
            var7.setFont(class372.field2919);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - class52.field1072.stringWidth(var2)) / 2, 22);
            var5.drawImage(field1991, class426.field3228 / 2 - 152, class456.field3562 / 2 - 18, (ImageObserver)null);
         } catch (Exception var10) {
            int var8 = class426.field3228 / 2 - 152;
            int var9 = class456.field3562 / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 303, 33);
            var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
            var5.setColor(Color.black);
            var5.drawRect(var8 + 1, var9 + 1, 301, 31);
            var5.fillRect(var8 + 2 + var1 * 3, var9 + 2, 300 - var1 * 3, 30);
            var5.setFont(class372.field2919);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - class52.field1072.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.field1986.repaint();
      }

   }

   protected final void method1299() {
      field1991 = null;
      class372.field2919 = null;
      class52.field1072 = null;
   }

   protected void method1287(String var1) {
      if (!this.field1964) {
         this.field1964 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var4) {
         }

      }
   }

   Container method1288() {
      return (Container)(null != this.field1985 ? this.field1985 : this);
   }

   class119 method1289() {
      Container var2 = this.method1288();
      int var3 = Math.max(var2.getWidth(), this.field1965);
      int var4 = Math.max(var2.getHeight(), this.field1981);
      if (null != this.field1985) {
         Insets var5 = this.field1985.getInsets();
         var3 -= var5.right + var5.left;
         var4 -= var5.top + var5.bottom;
      }

      return new class119(var3, var4);
   }

   protected final boolean method1291() {
      return null != this.field1985;
   }

   protected static final void method1301() {
      class392.field3077.method1671();

      int var1;
      for(var1 = 0; var1 < 32; ++var1) {
         field1967[var1] = 0L;
      }

      for(var1 = 0; var1 < 32; ++var1) {
         field1975[var1] = 0L;
      }

      field1970 = 0;
   }

   protected static int method1302() {
      int var1 = 0;
      if (class405.field3126 == null || !class405.field3126.isValid()) {
         try {
            Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

            while(var2.hasNext()) {
               GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
               if (var3.isValid()) {
                  class405.field3126 = var3;
                  field1999 = -1L;
                  field1968 = -1L;
               }
            }
         } catch (Throwable var10) {
         }
      }

      if (class405.field3126 != null) {
         long var11 = class80.method713();
         long var4 = class405.field3126.getCollectionTime();
         if (field1968 != -1L) {
            long var6 = var4 - field1968;
            long var8 = var11 - field1999;
            if (var8 != 0L) {
               var1 = (int)(var6 * 100L / var8);
            }
         }

         field1968 = var4;
         field1999 = var11;
      }

      return var1;
   }
}
