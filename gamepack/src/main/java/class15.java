public class class15 {
   boolean field144;
   boolean field164;
   class197 field167;
   int field148 = 0;
   int[] field157;
   int[] field158;
   long field145;
   long[] field143;
   long[] field155;
   public boolean field149;
   public boolean[] field160;
   public byte field151;
   public byte field152;
   public byte field153;
   public byte field163;
   public byte[] field156;
   public int field146 = -1;
   public int field147;
   public int field154;
   public int field161 = -1;
   public int field162 = 0;
   public int[] field159;
   public String field150 = null;
   public String[] field165;
   public String[] field166;

   public class15(class184 var1) {
      this.method157(var1);
   }

   void method143(int var1) {
      if (this.field144) {
         if (null != this.field143) {
            System.arraycopy(this.field143, 0, this.field143 = new long[var1], 0, this.field154);
         } else {
            this.field143 = new long[var1];
         }
      }

      if (this.field164) {
         if (null != this.field165) {
            System.arraycopy(this.field165, 0, this.field165 = new String[var1], 0, this.field154);
         } else {
            this.field165 = new String[var1];
         }
      }

      if (null != this.field156) {
         System.arraycopy(this.field156, 0, this.field156 = new byte[var1], 0, this.field154);
      } else {
         this.field156 = new byte[var1];
      }

      if (null != this.field158) {
         System.arraycopy(this.field158, 0, this.field158 = new int[var1], 0, this.field154);
      } else {
         this.field158 = new int[var1];
      }

      if (this.field159 != null) {
         System.arraycopy(this.field159, 0, this.field159 = new int[var1], 0, this.field154);
      } else {
         this.field159 = new int[var1];
      }

      if (null != this.field160) {
         System.arraycopy(this.field160, 0, this.field160 = new boolean[var1], 0, this.field154);
      } else {
         this.field160 = new boolean[var1];
      }

   }

   void method144(int var1) {
      if (this.field144) {
         if (null != this.field155) {
            System.arraycopy(this.field155, 0, this.field155 = new long[var1], 0, this.field147);
         } else {
            this.field155 = new long[var1];
         }
      }

      if (this.field164) {
         if (null != this.field166) {
            System.arraycopy(this.field166, 0, this.field166 = new String[var1], 0, this.field147);
         } else {
            this.field166 = new String[var1];
         }
      }

   }

   public int method150(String var1) {
      if (null != var1 && var1.length() != 0) {
         for(int var3 = 0; var3 < this.field154; ++var3) {
            if (this.field165[var3].equals(var1)) {
               return var3;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public int method152(int var1, int var2, int var3) {
      int var5 = var3 == 31 ? -1 : (1 << var3 + 1) - 1;
      return (this.field158[var1] & var5) >>> var2;
   }

   public Integer method145(int var1) {
      if (null == this.field167) {
         return null;
      } else {
         class55 var3 = this.field167.method1222((long)var1);
         return null != var3 && var3 instanceof class118 ? new Integer(((class118)var3).field1481) : null;
      }
   }

   public int[] method146() {
      if (null == this.field157) {
         String[] var2 = new String[this.field154];
         this.field157 = new int[this.field154];

         for(int var3 = 0; var3 < this.field154; this.field157[var3] = var3++) {
            var2[var3] = this.field165[var3];
            if (null != var2[var3]) {
               var2[var3] = var2[var3].toLowerCase();
            }
         }

         int[] var4 = this.field157;
         class379.method1886(var2, var4, 0, var2.length - 1);
      }

      return this.field157;
   }

   void method158(long var1, String var3, int var4) {
      if (null != var3 && var3.length() == 0) {
         var3 = null;
      }

      if (this.field144 != var1 > 0L) {
         throw new RuntimeException("");
      } else if (this.field164 != (null != var3)) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.field143 == null || this.field154 >= this.field143.length) || null != var3 && (this.field165 == null || this.field154 >= this.field165.length)) {
            this.method143(this.field154 + 5);
         }

         if (this.field143 != null) {
            this.field143[this.field154] = var1;
         }

         if (this.field165 != null) {
            this.field165[this.field154] = var3;
         }

         if (this.field161 == -1) {
            this.field161 = this.field154;
            this.field156[this.field154] = 126;
         } else {
            this.field156[this.field154] = 0;
         }

         this.field158[this.field154] = 0;
         this.field159[this.field154] = var4;
         this.field160[this.field154] = false;
         ++this.field154;
         this.field157 = null;
      }
   }

   void method147(int var1) {
      if (var1 >= 0 && var1 < this.field154) {
         --this.field154;
         this.field157 = null;
         if (this.field154 == 0) {
            this.field143 = null;
            this.field165 = null;
            this.field156 = null;
            this.field158 = null;
            this.field159 = null;
            this.field160 = null;
            this.field161 = -1;
            this.field146 = -1;
         } else {
            System.arraycopy(this.field156, var1 + 1, this.field156, var1, this.field154 - var1);
            System.arraycopy(this.field158, var1 + 1, this.field158, var1, this.field154 - var1);
            System.arraycopy(this.field159, var1 + 1, this.field159, var1, this.field154 - var1);
            System.arraycopy(this.field160, var1 + 1, this.field160, var1, this.field154 - var1);
            if (this.field143 != null) {
               System.arraycopy(this.field143, var1 + 1, this.field143, var1, this.field154 - var1);
            }

            if (this.field165 != null) {
               System.arraycopy(this.field165, var1 + 1, this.field165, var1, this.field154 - var1);
            }

            this.method161();
         }

      } else {
         throw new RuntimeException("");
      }
   }

   void method161() {
      if (this.field154 == 0) {
         this.field161 = -1;
         this.field146 = -1;
      } else {
         this.field161 = -1;
         this.field146 = -1;
         int var2 = 0;
         byte var3 = this.field156[0];

         for(int var4 = 1; var4 < this.field154; ++var4) {
            if (this.field156[var4] > var3) {
               if (var3 == 125) {
                  this.field146 = var2;
               }

               var2 = var4;
               var3 = this.field156[var4];
            } else if (this.field146 == -1 && this.field156[var4] == 125) {
               this.field146 = var4;
            }
         }

         this.field161 = var2;
         if (this.field161 != -1) {
            this.field156[this.field161] = 126;
         }

      }
   }

   void method148(long var1, String var3) {
      if (var3 != null && var3.length() == 0) {
         var3 = null;
      }

      if (this.field144 != var1 > 0L) {
         throw new RuntimeException("");
      } else if (var3 != null != this.field164) {
         throw new RuntimeException("");
      } else {
         if (var1 > 0L && (this.field155 == null || this.field147 >= this.field155.length) || null != var3 && (null == this.field166 || this.field147 >= this.field166.length)) {
            this.method144(this.field147 + 5);
         }

         if (null != this.field155) {
            this.field155[this.field147] = var1;
         }

         if (this.field166 != null) {
            this.field166[this.field147] = var3;
         }

         ++this.field147;
      }
   }

   void method149(int var1) {
      --this.field147;
      if (this.field147 == 0) {
         this.field155 = null;
         this.field166 = null;
      } else {
         if (null != this.field155) {
            System.arraycopy(this.field155, var1 + 1, this.field155, var1, this.field147 - var1);
         }

         if (this.field166 != null) {
            System.arraycopy(this.field166, var1 + 1, this.field166, var1, this.field147 - var1);
         }
      }

   }

   int method159(int var1, byte var2) {
      if (var2 != 126 && var2 != 127) {
         if (var1 != this.field161 || this.field146 != -1 && this.field156[this.field146] >= 125) {
            if (this.field156[var1] == var2) {
               return -1;
            } else {
               this.field156[var1] = var2;
               this.method161();
               return var1;
            }
         } else {
            return -1;
         }
      } else {
         return -1;
      }
   }

   boolean method151(int var1) {
      if (var1 != this.field161 && this.field156[var1] != 126) {
         this.field156[this.field161] = 125;
         this.field146 = this.field161;
         this.field156[var1] = 126;
         this.field161 = var1;
         return true;
      } else {
         return false;
      }
   }

   int method160(int var1, boolean var2) {
      if (this.field160[var1] == var2) {
         return -1;
      } else {
         this.field160[var1] = var2;
         return var1;
      }
   }

   int method153(int var1, int var2, int var3, int var4) {
      int var6 = (1 << var3) - 1;
      int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      int var9 = this.field158[var1];
      if (var2 == (var9 & var8)) {
         return -1;
      } else {
         var9 &= ~var8;
         this.field158[var1] = var9 | var2;
         return var1;
      }
   }

   boolean method142(int var1, int var2) {
      if (null != this.field167) {
         class55 var4 = this.field167.method1222((long)var1);
         if (null != var4) {
            if (var4 instanceof class118) {
               class118 var5 = (class118)var4;
               if (var5.field1481 == var2) {
                  return false;
               }

               var5.field1481 = var2;
               return true;
            }

            var4.method605();
         }
      } else {
         this.field167 = new class197(4);
      }

      this.field167.method1226(new class118(var2), (long)var1);
      return true;
   }

   boolean method154(int var1, int var2, int var3, int var4) {
      int var6 = (1 << var3) - 1;
      int var7 = var4 == 31 ? -1 : (1 << var4 + 1) - 1;
      int var8 = var7 ^ var6;
      var2 <<= var3;
      var2 &= var8;
      if (null != this.field167) {
         class55 var9 = this.field167.method1222((long)var1);
         if (null != var9) {
            if (var9 instanceof class118) {
               class118 var10 = (class118)var9;
               if (var2 == (var10.field1481 & var8)) {
                  return false;
               }

               var10.field1481 &= ~var8;
               var10.field1481 |= var2;
               return true;
            }

            var9.method605();
         }
      } else {
         this.field167 = new class197(4);
      }

      this.field167.method1226(new class118(var2), (long)var1);
      return true;
   }

   boolean method155(int var1, long var2) {
      if (null != this.field167) {
         class55 var4 = this.field167.method1222((long)var1);
         if (var4 != null) {
            if (var4 instanceof class391) {
               class391 var5 = (class391)var4;
               if (var5.field3076 == var2) {
                  return false;
               }

               var5.field3076 = var2;
               return true;
            }

            var4.method605();
         }
      } else {
         this.field167 = new class197(4);
      }

      this.field167.method1226(new class391(var2), (long)var1);
      return true;
   }

   boolean method156(int var1, String var2) {
      if (var2 == null) {
         var2 = "";
      } else if (var2.length() > 80) {
         var2 = var2.substring(0, 80);
      }

      if (null != this.field167) {
         class55 var4 = this.field167.method1222((long)var1);
         if (null != var4) {
            if (var4 instanceof class183) {
               class183 var5 = (class183)var4;
               if (var5.field1815 instanceof String) {
                  if (var2.equals(var5.field1815)) {
                     return false;
                  }

                  var5.method605();
                  this.field167.method1226(new class183(var2), var5.field1078);
                  return true;
               }
            }

            var4.method605();
         }
      } else {
         this.field167 = new class197(4);
      }

      this.field167.method1226(new class183(var2), (long)var1);
      return true;
   }

   void method157(class184 var1) {
      int var3 = var1.method1125();
      if (var3 >= 1 && var3 <= 6) {
         int var4 = var1.method1125();
         if ((var4 & 1) != 0) {
            this.field144 = true;
         }

         if ((var4 & 2) != 0) {
            this.field164 = true;
         }

         if (!this.field144) {
            this.field143 = null;
            this.field155 = null;
         }

         if (!this.field164) {
            this.field165 = null;
            this.field166 = null;
         }

         this.field162 = var1.method1129();
         this.field148 = var1.method1129();
         if (var3 <= 3 && this.field148 != 0) {
            this.field148 += 16912800;
         }

         this.field154 = var1.method1174();
         this.field147 = var1.method1125();
         this.field150 = var1.method1133();
         if (var3 >= 4) {
            var1.method1129();
         }

         this.field149 = var1.method1125() == 1;
         this.field163 = var1.method1126();
         this.field151 = var1.method1126();
         this.field152 = var1.method1126();
         this.field153 = var1.method1126();
         int var5;
         if (this.field154 > 0) {
            if (this.field144 && (this.field143 == null || this.field143.length < this.field154)) {
               this.field143 = new long[this.field154];
            }

            if (this.field164 && (this.field165 == null || this.field165.length < this.field154)) {
               this.field165 = new String[this.field154];
            }

            if (this.field156 == null || this.field156.length < this.field154) {
               this.field156 = new byte[this.field154];
            }

            if (null == this.field158 || this.field158.length < this.field154) {
               this.field158 = new int[this.field154];
            }

            if (this.field159 == null || this.field159.length < this.field154) {
               this.field159 = new int[this.field154];
            }

            if (null == this.field160 || this.field160.length < this.field154) {
               this.field160 = new boolean[this.field154];
            }

            for(var5 = 0; var5 < this.field154; ++var5) {
               if (this.field144) {
                  this.field143[var5] = var1.method1130();
               }

               if (this.field164) {
                  this.field165[var5] = var1.method1184();
               }

               this.field156[var5] = var1.method1126();
               if (var3 >= 2) {
                  this.field158[var5] = var1.method1129();
               }

               if (var3 >= 5) {
                  this.field159[var5] = var1.method1174();
               } else {
                  this.field159[var5] = 0;
               }

               if (var3 >= 6) {
                  this.field160[var5] = var1.method1125() == 1;
               } else {
                  this.field160[var5] = false;
               }
            }

            this.method161();
         }

         if (this.field147 > 0) {
            if (this.field144 && (this.field155 == null || this.field155.length < this.field147)) {
               this.field155 = new long[this.field147];
            }

            if (this.field164 && (null == this.field166 || this.field166.length < this.field147)) {
               this.field166 = new String[this.field147];
            }

            for(var5 = 0; var5 < this.field147; ++var5) {
               if (this.field144) {
                  this.field155[var5] = var1.method1130();
               }

               if (this.field164) {
                  this.field166[var5] = var1.method1184();
               }
            }
         }

         if (var3 >= 3) {
            var5 = var1.method1174();
            if (var5 > 0) {
               this.field167 = new class197(var5 < 16 ? class349.method1808(var5) : 16);

               while(var5-- > 0) {
                  int var6 = var1.method1129();
                  int var7 = var6 & 1073741823;
                  int var8 = var6 >>> 30;
                  if (var8 == 0) {
                     int var9 = var1.method1129();
                     this.field167.method1226(new class118(var9), (long)var7);
                  } else if (var8 == 1) {
                     long var11 = var1.method1130();
                     this.field167.method1226(new class391(var11), (long)var7);
                  } else if (var8 == 2) {
                     String var12 = var1.method1133();
                     this.field167.method1226(new class183(var12), (long)var7);
                  }
               }
            }
         }

      } else {
         throw new RuntimeException("" + var3);
      }
   }
}
