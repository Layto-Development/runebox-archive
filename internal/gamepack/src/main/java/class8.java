public class class8 {
   boolean field54;
   boolean field74;
   class524 field77;
   int field58 = 0;
   int[] field67;
   int[] field68;
   long field55;
   long[] field53;
   long[] field65;
   public boolean field59;
   public boolean[] field70;
   public byte field61;
   public byte field62;
   public byte field63;
   public byte field73;
   public byte[] field66;
   public int field56 = -1;
   public int field57;
   public int field64;
   public int field71 = -1;
   public int field72 = 0;
   public int[] field69;
   public String field60 = null;
   public String[] field75;
   public String[] field76;

   public class8(class366 var1) {
      this.method70(var1);
   }

   void method56(int var1) {
      if (this.field54) {
         if (null != this.field53) {
            System.arraycopy(this.field53, 0, this.field53 = new long[var1], 0, this.field64);
         } else {
            this.field53 = new long[var1];
         }
      }

      if (this.field74) {
         if (null != this.field75) {
            System.arraycopy(this.field75, 0, this.field75 = new String[var1], 0, this.field64);
         } else {
            this.field75 = new String[var1];
         }
      }

      if (null != this.field66) {
         System.arraycopy(this.field66, 0, this.field66 = new byte[var1], 0, this.field64);
      } else {
         this.field66 = new byte[var1];
      }

      if (null != this.field68) {
         System.arraycopy(this.field68, 0, this.field68 = new int[var1], 0, this.field64);
      } else {
         this.field68 = new int[var1];
      }

      if (this.field69 != null) {
         System.arraycopy(this.field69, 0, this.field69 = new int[var1], 0, this.field64);
      } else {
         this.field69 = new int[var1];
      }

      if (null != this.field70) {
         System.arraycopy(this.field70, 0, this.field70 = new boolean[var1], 0, this.field64);
      } else {
         this.field70 = new boolean[var1];
      }

   }

   void method57(int var1) {
      if (this.field54) {
         if (null != this.field65) {
            System.arraycopy(this.field65, 0, this.field65 = new long[var1], 0, this.field57);
         } else {
            this.field65 = new long[var1];
         }
      }

      if (this.field74) {
         if (null != this.field76) {
            System.arraycopy(this.field76, 0, this.field76 = new String[var1], 0, this.field57);
         } else {
            this.field76 = new String[var1];
         }
      }

   }

   public int method63(String var1) {
      if (null != var1 && var1.length() != 0) {
         for(int var3 = 0; var3 < this.field64; ++var3) {
            if (this.field75[var3].equals(var1)) {
               return var3;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public int method65(int var1, int var2, int var3) {
      int var5 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
      return (this.field68[var1] & var5) >>> var2;
   }

   public Integer method58(int var1) {
      if (null == this.field77) {
         return null;
      } else {
         class70 var3 = this.field77.method2509((long)var1);
         return null != var3 && var3 instanceof class323 ? new Integer(((class323)var3).field2304) : null;
      }
   }

   public int[] method59() {
      if (null == this.field67) {
         String[] var2 = new String[this.field64];
         this.field67 = new int[this.field64];

         for(int var3 = 0; var3 < this.field64; this.field67[var3] = var3++) {
            var2[var3] = this.field75[var3];
            if (null != var2[var3]) {
               var2[var3] = var2[var3].toLowerCase();
            }
         }

         int[] var4 = this.field67;
         class134.method491(var2, var4, 0, var2.length - 1);
      }

      return this.field67;
   }

   void method71(long var1, String var3, int var4) {
      if (null != var3 && var3.length() == 0) {
         var3 = null;
      }

      if (this.field54 != var1 > 0L) {
         throw new RuntimeException("");
      } else if (this.field74 != (null != var3)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.field53 == null || this.field64 >= this.field53.length) || null != var3 && (this.field75 == null || this.field64 >= this.field75.length)) {
            this.method56(this.field64 + 5);
         }

         if (this.field53 != null) {
            this.field53[this.field64] = var1;
         }

         if (this.field75 != null) {
            this.field75[this.field64] = var3;
         }

         if (-1 == this.field71) {
            this.field71 = this.field64;
            this.field66[this.field64] = 126;
         } else {
            this.field66[this.field64] = 0;
         }

         this.field68[this.field64] = 0;
         this.field69[this.field64] = var4;
         this.field70[this.field64] = false;
         ++this.field64;
         this.field67 = null;
      }
   }

   void method60(int var1) {
      if (var1 >= 0 && var1 < this.field64) {
         --this.field64;
         this.field67 = null;
         if (0 == this.field64) {
            this.field53 = null;
            this.field75 = null;
            this.field66 = null;
            this.field68 = null;
            this.field69 = null;
            this.field70 = null;
            this.field71 = -1;
            this.field56 = -1;
         } else {
            System.arraycopy(this.field66, var1 + 1, this.field66, var1, this.field64 - var1);
            System.arraycopy(this.field68, var1 + 1, this.field68, var1, this.field64 - var1);
            System.arraycopy(this.field69, var1 + 1, this.field69, var1, this.field64 - var1);
            System.arraycopy(this.field70, var1 + 1, this.field70, var1, this.field64 - var1);
            if (this.field53 != null) {
               System.arraycopy(this.field53, var1 + 1, this.field53, var1, this.field64 - var1);
            }

            if (this.field75 != null) {
               System.arraycopy(this.field75, var1 + 1, this.field75, var1, this.field64 - var1);
            }

            this.method74();
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method74() {
      if (0 == this.field64) {
         this.field71 = -1;
         this.field56 = -1;
      } else {
         this.field71 = -1;
         this.field56 = -1;
         int var2 = 0;
         byte var3 = this.field66[0];

         for(int var4 = 1; var4 < this.field64; ++var4) {
            if (this.field66[var4] > var3) {
               if (var3 == 125) {
                  this.field56 = var2;
               }

               var2 = var4;
               var3 = this.field66[var4];
            } else if (this.field56 == -1 && 125 == this.field66[var4]) {
               this.field56 = var4;
            }
         }

         this.field71 = var2;
         if (-1 != this.field71) {
            this.field66[this.field71] = 126;
         }

      }
   }

   void method61(long var1, String var3) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (this.field54 != var1 > 0L) {
         throw new RuntimeException("");
      } else if (var3 != null != this.field74) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.field65 == null || this.field57 >= this.field65.length) || null != var3 && (null == this.field76 || this.field57 >= this.field76.length)) {
            this.method57(this.field57 + 5);
         }

         if (null != this.field65) {
            this.field65[this.field57] = var1;
         }

         if (this.field76 != null) {
            this.field76[this.field57] = var3;
         }

         ++this.field57;
      }
   }

   void method62(int var1) {
      --this.field57;
      if (0 == this.field57) {
         this.field65 = null;
         this.field76 = null;
      } else {
         if (null != this.field65) {
            System.arraycopy(this.field65, var1 + 1, this.field65, var1, this.field57 - var1);
         }

         if (this.field76 != null) {
            System.arraycopy(this.field76, var1 + 1, this.field76, var1, this.field57 - var1);
         }
      }

   }

   int method72(int var1, byte var2) {
      if (var2 != 126 && var2 != 127) {
         if (var1 != this.field71 || this.field56 != -1 && this.field66[this.field56] >= 125) {
            if (this.field66[var1] == var2) {
               return -1;
            } else {
               this.field66[var1] = var2;
               this.method74();
               return var1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   boolean method64(int var1) {
      if (var1 != this.field71 && 126 != this.field66[var1]) {
         this.field66[this.field71] = 125;
         this.field56 = this.field71;
         this.field66[var1] = 126;
         this.field71 = var1;
         return true;
      } else {
         return false;
      }
   }

   int method73(int var1, boolean var2) {
      if (this.field70[var1] == var2) {
         return -1;
      } else {
         this.field70[var1] = var2;
         return var1;
      }
   }

   int method66(int var1, int var2, int var3, int var4) {
      int var6 = (1 << var3) - 1;
      int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      int var9 = this.field68[var1];
      if (var2 == (var9 & var8)) {
         return -1;
      } else {
         var9 &= ~var8;
         this.field68[var1] = var9 | var2;
         return var1;
      }
   }

   boolean method55(int var1, int var2) {
      if (null != this.field77) {
         class70 var4 = this.field77.method2509((long)var1);
         if (null != var4) {
            if (var4 instanceof class323) {
               class323 var5 = (class323)var4;
               if (var5.field2304 == var2) {
                  return false;
               }

               var5.field2304 = var2;
               return true;
            }

            var4.method295();
         }
      } else {
         this.field77 = new class524(4);
      }

      this.field77.method2513(new class323(var2), (long)var1);
      return true;
   }

   boolean method67(int var1, int var2, int var3, int var4) {
      int var6 = (1 << var3) - 1;
      int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      if (null != this.field77) {
         class70 var9 = this.field77.method2509((long)var1);
         if (null != var9) {
            if (var9 instanceof class323) {
               class323 var10 = (class323)var9;
               if (var2 == (var10.field2304 & var8)) {
                  return false;
               }

               var10.field2304 &= ~var8;
               var10.field2304 |= var2;
               return true;
            }

            var9.method295();
         }
      } else {
         this.field77 = new class524(4);
      }

      this.field77.method2513(new class323(var2), (long)var1);
      return true;
   }

   boolean method68(int var1, long var2) {
      if (null != this.field77) {
         class70 var4 = this.field77.method2509((long)var1);
         if (var4 != null) {
            if (var4 instanceof class264) {
               class264 var5 = (class264)var4;
               if (var5.field1864 == var2) {
                  return false;
               }

               var5.field1864 = var2;
               return true;
            }

            var4.method295();
         }
      } else {
         this.field77 = new class524(4);
      }

      this.field77.method2513(new class264(var2), (long)var1);
      return true;
   }

   boolean method69(int var1, String var2) {
      if (var2 == null) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (null != this.field77) {
         class70 var4 = this.field77.method2509((long)var1);
         if (null != var4) {
            if (var4 instanceof class88) {
               class88 var5 = (class88)var4;
               if (var5.field608 instanceof String) {
                  if (var2.equals(var5.field608)) {
                     return false;
                  }

                  var5.method295();
                  this.field77.method2513(new class88(var2), var5.field531);
                  return true;
               }
            }

            var4.method295();
         }
      } else {
         this.field77 = new class524(4);
      }

      this.field77.method2513(new class88(var2), (long)var1);
      return true;
   }

   void method70(class366 var1) {
      int var3 = var1.method1654();
      if (var3 >= 1 && var3 <= 6) {
         int var4 = var1.method1654();
         if (0 != (var4 & 1)) {
            this.field54 = true;
         }

         if (0 != (var4 & 2)) {
            this.field74 = true;
         }

         if (!this.field54) {
            this.field53 = null;
            this.field65 = null;
         }

         if (!this.field74) {
            this.field75 = null;
            this.field76 = null;
         }

         this.field72 = var1.method1658();
         this.field58 = var1.method1658();
         if (var3 <= 3 && this.field58 != 0) {
            this.field58 += 16912800;
         }

         this.field64 = var1.method1703();
         this.field57 = var1.method1654();
         this.field60 = var1.method1662();
         if (var3 >= 4) {
            var1.method1658();
         }

         this.field59 = var1.method1654() == 1;
         this.field73 = var1.method1655();
         this.field61 = var1.method1655();
         this.field62 = var1.method1655();
         this.field63 = var1.method1655();
         int var5;
         if (this.field64 > 0) {
            if (this.field54 && (this.field53 == null || this.field53.length < this.field64)) {
               this.field53 = new long[this.field64];
            }

            if (this.field74 && (this.field75 == null || this.field75.length < this.field64)) {
               this.field75 = new String[this.field64];
            }

            if (this.field66 == null || this.field66.length < this.field64) {
               this.field66 = new byte[this.field64];
            }

            if (null == this.field68 || this.field68.length < this.field64) {
               this.field68 = new int[this.field64];
            }

            if (this.field69 == null || this.field69.length < this.field64) {
               this.field69 = new int[this.field64];
            }

            if (null == this.field70 || this.field70.length < this.field64) {
               this.field70 = new boolean[this.field64];
            }

            for(var5 = 0; var5 < this.field64; ++var5) {
               if (this.field54) {
                  this.field53[var5] = var1.method1659();
               }

               if (this.field74) {
                  this.field75[var5] = var1.method1713();
               }

               this.field66[var5] = var1.method1655();
               if (var3 >= 2) {
                  this.field68[var5] = var1.method1658();
               }

               if (var3 >= 5) {
                  this.field69[var5] = var1.method1703();
               } else {
                  this.field69[var5] = 0;
               }

               if (var3 >= 6) {
                  this.field70[var5] = var1.method1654() == 1;
               } else {
                  this.field70[var5] = false;
               }
            }

            this.method74();
         }

         if (this.field57 > 0) {
            if (this.field54 && (this.field65 == null || this.field65.length < this.field57)) {
               this.field65 = new long[this.field57];
            }

            if (this.field74 && (null == this.field76 || this.field76.length < this.field57)) {
               this.field76 = new String[this.field57];
            }

            for(var5 = 0; var5 < this.field57; ++var5) {
               if (this.field54) {
                  this.field65[var5] = var1.method1659();
               }

               if (this.field74) {
                  this.field76[var5] = var1.method1713();
               }
            }
         }

         if (var3 >= 3) {
            var5 = var1.method1703();
            if (var5 > 0) {
               this.field77 = new class524(var5 < 16 ? class32.method143(var5) : 16);

               while(var5-- > 0) {
                  int var6 = var1.method1658();
                  int var7 = var6 & 1073741823;
                  int var8 = var6 >>> 30;
                  if (var8 == 0) {
                     int var9 = var1.method1658();
                     this.field77.method2513(new class323(var9), (long)var7);
                  } else if (var8 == 1) {
                     long var11 = var1.method1659();
                     this.field77.method2513(new class264(var11), (long)var7);
                  } else if (var8 == 2) {
                     String var12 = var1.method1662();
                     this.field77.method2513(new class88(var12), (long)var7);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var3);
      }
   }
}
