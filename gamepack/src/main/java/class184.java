import java.math.BigInteger;

public class class184 extends class55 {
   public static int[] field1817 = new int[256];
   static long[] field1819;
   public byte[] field1816;
   public int field1818;

   static {
      int var2;
      for(int var1 = 0; var1 < 256; ++var1) {
         int var0 = var1;

         for(var2 = 0; var2 < 8; ++var2) {
            if ((var0 & 1) == 1) {
               var0 = var0 >>> 1 ^ -306674912;
            } else {
               var0 >>>= 1;
            }
         }

         field1817[var1] = var0;
      }

      field1819 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var4 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if ((var4 & 1L) == 1L) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field1819[var2] = var4;
      }

   }

   public class184(int var1) {
      this.field1816 = class218.method1316(var1);
      this.field1818 = 0;
   }

   public class184(int var1, boolean var2) {
      this.field1816 = class218.method1314(var1, var2);
   }

   public class184(byte[] var1) {
      this.field1816 = var1;
      this.field1818 = 0;
   }

   public void method1113() {
      if (this.field1816 != null) {
         class218.method1318(this.field1816);
      }

      this.field1816 = null;
   }

   public void method1114(int var1) {
      this.field1816[++this.field1818 - 1] = (byte)var1;
   }

   public void method1155(int var1) {
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 8);
      this.field1816[++this.field1818 - 1] = (byte)var1;
   }

   public void method1166(int var1) {
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 16);
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 8);
      this.field1816[++this.field1818 - 1] = (byte)var1;
   }

   public void method1180(int var1) {
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 24);
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 16);
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 8);
      this.field1816[++this.field1818 - 1] = (byte)var1;
   }

   public void method1115(long var1) {
      this.field1816[++this.field1818 - 1] = (byte)((int)(var1 >> 40));
      this.field1816[++this.field1818 - 1] = (byte)((int)(var1 >> 32));
      this.field1816[++this.field1818 - 1] = (byte)((int)(var1 >> 24));
      this.field1816[++this.field1818 - 1] = (byte)((int)(var1 >> 16));
      this.field1816[++this.field1818 - 1] = (byte)((int)(var1 >> 8));
      this.field1816[++this.field1818 - 1] = (byte)((int)var1);
   }

   public void method1151(long var1) {
      this.field1816[++this.field1818 - 1] = (byte)((int)(var1 >> 56));
      this.field1816[++this.field1818 - 1] = (byte)((int)(var1 >> 48));
      this.field1816[++this.field1818 - 1] = (byte)((int)(var1 >> 40));
      this.field1816[++this.field1818 - 1] = (byte)((int)(var1 >> 32));
      this.field1816[++this.field1818 - 1] = (byte)((int)(var1 >> 24));
      this.field1816[++this.field1818 - 1] = (byte)((int)(var1 >> 16));
      this.field1816[++this.field1818 - 1] = (byte)((int)(var1 >> 8));
      this.field1816[++this.field1818 - 1] = (byte)((int)var1);
   }

   public void method1116(boolean var1) {
      this.method1114(var1 ? 1 : 0);
   }

   public void method1117(String var1) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field1818 += class162.method994(var1, 0, var1.length(), this.field1816, this.field1818);
         this.field1816[++this.field1818 - 1] = 0;
      }
   }

   public void method1118(String var1) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field1816[++this.field1818 - 1] = 0;
         this.field1818 += class162.method994(var1, 0, var1.length(), this.field1816, this.field1818);
         this.field1816[++this.field1818 - 1] = 0;
      }
   }

   public void method1111(CharSequence var1) {
      int var3 = class319.method1693(var1);
      this.field1816[++this.field1818 - 1] = 0;
      this.method1124(var3);
      this.field1818 += class319.method1694(this.field1816, this.field1818, var1);
   }

   public void method1119(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var2 + var3; ++var5) {
         this.field1816[++this.field1818 - 1] = var1[var5];
      }

   }

   public void method1120(class184 var1) {
      this.method1119(var1.field1816, 0, var1.field1818);
   }

   public void method1121(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.field1816[this.field1818 - var1 - 4] = (byte)(var1 >> 24);
         this.field1816[this.field1818 - var1 - 3] = (byte)(var1 >> 16);
         this.field1816[this.field1818 - var1 - 2] = (byte)(var1 >> 8);
         this.field1816[this.field1818 - var1 - 1] = (byte)var1;
      }
   }

   public void method1122(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.field1816[this.field1818 - var1 - 2] = (byte)(var1 >> 8);
         this.field1816[this.field1818 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method1123(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.field1816[this.field1818 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method1169(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.method1114(var1);
      } else if (var1 >= 0 && var1 < 32768) {
         this.method1155(var1 + '\u8000');
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method1124(int var1) {
      if ((var1 & -128) != 0) {
         if ((var1 & -16384) != 0) {
            if ((var1 & -2097152) != 0) {
               if ((var1 & -268435456) != 0) {
                  this.method1114(var1 >>> 28 | 128);
               }

               this.method1114(var1 >>> 21 | 128);
            }

            this.method1114(var1 >>> 14 | 128);
         }

         this.method1114(var1 >>> 7 | 128);
      }

      this.method1114(var1 & 127);
   }

   public int method1125() {
      return this.field1816[++this.field1818 - 1] & 255;
   }

   public byte method1126() {
      return this.field1816[++this.field1818 - 1];
   }

   public int method1174() {
      this.field1818 += 2;
      return (this.field1816[this.field1818 - 1] & 255) + ((this.field1816[this.field1818 - 2] & 255) << 8);
   }

   public int method1127() {
      this.field1818 += 2;
      int var2 = (this.field1816[this.field1818 - 1] & 255) + ((this.field1816[this.field1818 - 2] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int method1181() {
      this.field1818 += 3;
      return ((this.field1816[this.field1818 - 2] & 255) << 8) + ((this.field1816[this.field1818 - 3] & 255) << 16) + (this.field1816[this.field1818 - 1] & 255);
   }

   public int method1171() {
      this.field1818 += 3;
      int var2 = (this.field1816[this.field1818 - 1] & 255) + ((this.field1816[this.field1818 - 2] & 255) << 8) + ((this.field1816[this.field1818 - 3] & 255) << 16);
      if (var2 > 8388607) {
         var2 -= 16777216;
      }

      return var2;
   }

   public int method1129() {
      this.field1818 += 4;
      return ((this.field1816[this.field1818 - 3] & 255) << 16) + ((this.field1816[this.field1818 - 4] & 255) << 24) + ((this.field1816[this.field1818 - 2] & 255) << 8) + (this.field1816[this.field1818 - 1] & 255);
   }

   public long method1130() {
      long var2 = (long)this.method1129() & 4294967295L;
      long var4 = (long)this.method1129() & 4294967295L;
      return var4 + (var2 << 32);
   }

   public float method1131() {
      return Float.intBitsToFloat(this.method1129());
   }

   public boolean method1132() {
      return (this.method1125() & 1) == 1;
   }

   public String method1184() {
      if (this.field1816[this.field1818] == 0) {
         ++this.field1818;
         return null;
      } else {
         return this.method1133();
      }
   }

   public String method1133() {
      int var2 = this.field1818;

      while(this.field1816[++this.field1818 - 1] != 0) {
      }

      int var3 = this.field1818 - var2 - 1;
      return var3 == 0 ? "" : class162.method995(this.field1816, var2, var3);
   }

   public String method1175() {
      byte var2 = this.field1816[++this.field1818 - 1];
      if (var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.field1818;

         while(this.field1816[++this.field1818 - 1] != 0) {
         }

         int var4 = this.field1818 - var3 - 1;
         return var4 == 0 ? "" : class162.method995(this.field1816, var3, var4);
      }
   }

   public String method1167() {
      byte var2 = this.field1816[++this.field1818 - 1];
      if (var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.method1112();
         if (this.field1818 + var3 > this.field1816.length) {
            throw new IllegalStateException("");
         } else {
            byte[] var5 = this.field1816;
            int var6 = this.field1818;
            char[] var7 = new char[var3];
            int var8 = 0;
            int var9 = var6;

            int var12;
            for(int var10 = var3 + var6; var9 < var10; var7[var8++] = (char)var12) {
               int var11 = var5[var9++] & 255;
               if (var11 < 128) {
                  if (var11 == 0) {
                     var12 = 65533;
                  } else {
                     var12 = var11;
                  }
               } else if (var11 < 192) {
                  var12 = 65533;
               } else if (var11 < 224) {
                  if (var9 < var10 && (var5[var9] & 192) == 128) {
                     var12 = (var11 & 31) << 6 | var5[var9++] & 63;
                     if (var12 < 128) {
                        var12 = 65533;
                     }
                  } else {
                     var12 = 65533;
                  }
               } else if (var11 < 240) {
                  if (var9 + 1 < var10 && (var5[var9] & 192) == 128 && (var5[var9 + 1] & 192) == 128) {
                     var12 = (var11 & 15) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
                     if (var12 < 2048) {
                        var12 = 65533;
                     }
                  } else {
                     var12 = 65533;
                  }
               } else if (var11 < 248) {
                  if (var9 + 2 < var10 && (var5[var9] & 192) == 128 && (var5[var9 + 1] & 192) == 128 && (var5[var9 + 2] & 192) == 128) {
                     var12 = (var11 & 7) << 18 | (var5[var9++] & 63) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
                     if (var12 >= 65536 && var12 <= 1114111) {
                        var12 = 65533;
                     } else {
                        var12 = 65533;
                     }
                  } else {
                     var12 = 65533;
                  }
               } else {
                  var12 = 65533;
               }
            }

            String var4 = new String(var7, 0, var8);
            this.field1818 += var3;
            return var4;
         }
      }
   }

   public void method1135(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         var1[var5] = this.field1816[++this.field1818 - 1];
      }

   }

   public int method1136() {
      int var2 = this.field1816[this.field1818] & 255;
      return var2 < 128 ? this.method1125() - 64 : this.method1174() - '\uc000';
   }

   public int method1172() {
      int var2 = this.field1816[this.field1818] & 255;
      return var2 < 128 ? this.method1125() : this.method1174() - '\u8000';
   }

   public int method1137() {
      int var2 = this.field1816[this.field1818] & 255;
      return var2 < 128 ? this.method1125() - 1 : this.method1174() - '\u8001';
   }

   public int method1138() {
      int var2 = 0;

      int var3;
      for(var3 = this.method1172(); var3 == 32767; var3 = this.method1172()) {
         var2 += 32767;
      }

      var2 += var3;
      return var2;
   }

   public int method1139() {
      return this.field1816[this.field1818] < 0 ? this.method1129() & Integer.MAX_VALUE : this.method1174();
   }

   public int method1173() {
      if (this.field1816[this.field1818] < 0) {
         return this.method1129() & Integer.MAX_VALUE;
      } else {
         int var2 = this.method1174();
         return var2 == 32767 ? -1 : var2;
      }
   }

   public int method1112() {
      byte var2 = this.field1816[++this.field1818 - 1];

      int var3;
      for(var3 = 0; var2 < 0; var2 = this.field1816[++this.field1818 - 1]) {
         var3 = (var3 | var2 & 127) << 7;
      }

      return var3 | var2;
   }

   public int method1141() {
      int var3 = 0;
      int var4 = 0;

      int var2;
      do {
         var2 = this.method1125();
         var3 |= (var2 & 127) << var4;
         var4 += 7;
      } while(var2 > 127);

      return var3;
   }

   public void method1142(int[] var1) {
      int var3 = this.field1818 / 8;
      this.field1818 = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.method1129();
         int var6 = this.method1129();
         int var7 = 0;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3]) {
            var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
            var7 += var8;
         }

         this.field1818 -= 8;
         this.method1180(var5);
         this.method1180(var6);
      }

   }

   public void method1186(int[] var1) {
      int var3 = this.field1818 / 8;
      this.field1818 = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.method1129();
         int var6 = this.method1129();
         int var7 = -957401312;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3]) {
            var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var7 + var1[var7 >>> 11 & 3];
            var7 -= var8;
         }

         this.field1818 -= 8;
         this.method1180(var5);
         this.method1180(var6);
      }

   }

   public void method1168(int[] var1, int var2, int var3) {
      int var5 = this.field1818;
      this.field1818 = var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.method1129();
         int var9 = this.method1129();
         int var10 = 0;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10) {
            var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10;
            var10 += var11;
         }

         this.field1818 -= 8;
         this.method1180(var8);
         this.method1180(var9);
      }

      this.field1818 = var5;
   }

   public void method1176(int[] var1, int var2, int var3) {
      int var5 = this.field1818;
      this.field1818 = var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.method1129();
         int var9 = this.method1129();
         int var10 = -957401312;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3]) {
            var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
            var10 -= var11;
         }

         this.field1818 -= 8;
         this.method1180(var8);
         this.method1180(var9);
      }

      this.field1818 = var5;
   }

   public void method1158(BigInteger var1, BigInteger var2) {
      int var4 = this.field1818;
      this.field1818 = 0;
      byte[] var5 = new byte[var4];
      this.method1135(var5, 0, var4);
      BigInteger var6 = new BigInteger(var5);
      BigInteger var7 = var6.modPow(var1, var2);
      byte[] var8 = var7.toByteArray();
      this.field1818 = 0;
      this.method1155(var8.length);
      this.method1119(var8, 0, var8.length);
   }

   public int method1143(int var1) {
      byte[] var4 = this.field1816;
      int var5 = this.field1818;
      int var6 = -1;

      for(int var7 = var1; var7 < var5; ++var7) {
         var6 = var6 >>> 8 ^ field1817[(var6 ^ var4[var7]) & 255];
      }

      var6 = ~var6;
      this.method1180(var6);
      return var6;
   }

   public boolean method1144() {
      this.field1818 -= 4;
      byte[] var3 = this.field1816;
      int var4 = this.field1818;
      int var5 = -1;

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         var5 = var5 >>> 8 ^ field1817[(var5 ^ var3[var6]) & 255];
      }

      var5 = ~var5;
      var6 = this.method1129();
      return var6 == var5;
   }

   public void method1145(int var1) {
      this.field1816[++this.field1818 - 1] = (byte)(var1 + 128);
   }

   public void method1187(int var1) {
      this.field1816[++this.field1818 - 1] = (byte)(0 - var1);
   }

   public void method1161(int var1) {
      this.field1816[++this.field1818 - 1] = (byte)(128 - var1);
   }

   public int method1146() {
      return this.field1816[++this.field1818 - 1] - 128 & 255;
   }

   public int method1185() {
      return 0 - this.field1816[++this.field1818 - 1] & 255;
   }

   public int method1147() {
      return 128 - this.field1816[++this.field1818 - 1] & 255;
   }

   public byte method1140() {
      return (byte)(this.field1816[++this.field1818 - 1] - 128);
   }

   public byte method1148() {
      return (byte)(0 - this.field1816[++this.field1818 - 1]);
   }

   public byte method1149() {
      return (byte)(128 - this.field1816[++this.field1818 - 1]);
   }

   public void method1183(int var1) {
      this.field1816[++this.field1818 - 1] = (byte)var1;
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 8);
   }

   public void method1150(int var1) {
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 8);
      this.field1816[++this.field1818 - 1] = (byte)(var1 + 128);
   }

   public void method1177(int var1) {
      this.field1816[++this.field1818 - 1] = (byte)(var1 + 128);
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 8);
   }

   public int method1152() {
      this.field1818 += 2;
      return (this.field1816[this.field1818 - 2] & 255) + ((this.field1816[this.field1818 - 1] & 255) << 8);
   }

   public int method1153() {
      this.field1818 += 2;
      return (this.field1816[this.field1818 - 1] - 128 & 255) + ((this.field1816[this.field1818 - 2] & 255) << 8);
   }

   public int method1154() {
      this.field1818 += 2;
      return (this.field1816[this.field1818 - 2] - 128 & 255) + ((this.field1816[this.field1818 - 1] & 255) << 8);
   }

   public int method1128() {
      this.field1818 += 2;
      int var2 = (this.field1816[this.field1818 - 2] & 255) + ((this.field1816[this.field1818 - 1] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int method1156() {
      this.field1818 += 2;
      int var2 = (this.field1816[this.field1818 - 1] - 128 & 255) + ((this.field1816[this.field1818 - 2] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public void method1157(int var1) {
      this.field1816[++this.field1818 - 1] = (byte)var1;
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 8);
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 16);
   }

   public int method1182() {
      this.field1818 += 3;
      return ((this.field1816[this.field1818 - 1] & 255) << 8) + ((this.field1816[this.field1818 - 3] & 255) << 16) + (this.field1816[this.field1818 - 2] & 255);
   }

   public int method1178() {
      this.field1818 += 3;
      return ((this.field1816[this.field1818 - 3] & 255) << 8) + ((this.field1816[this.field1818 - 2] & 255) << 16) + (this.field1816[this.field1818 - 1] & 255);
   }

   public int method1159() {
      this.field1818 += 3;
      int var2 = ((this.field1816[this.field1818 - 1] & 255) << 16) + ((this.field1816[this.field1818 - 2] & 255) << 8) + (this.field1816[this.field1818 - 3] & 255);
      if (var2 > 8388607) {
         var2 -= 16777216;
      }

      return var2;
   }

   public int method1160() {
      this.field1818 += 3;
      int var2 = ((this.field1816[this.field1818 - 3] & 255) << 16) + ((this.field1816[this.field1818 - 1] & 255) << 8) + (this.field1816[this.field1818 - 2] & 255);
      if (var2 > 8388607) {
         var2 -= 16777216;
      }

      return var2;
   }

   public void method1134(int var1) {
      this.field1816[++this.field1818 - 1] = (byte)var1;
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 8);
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 16);
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 24);
   }

   public void method1162(int var1) {
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 8);
      this.field1816[++this.field1818 - 1] = (byte)var1;
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 24);
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 16);
   }

   public void method1163(int var1) {
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 16);
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 24);
      this.field1816[++this.field1818 - 1] = (byte)var1;
      this.field1816[++this.field1818 - 1] = (byte)(var1 >> 8);
   }

   public int method1170() {
      this.field1818 += 4;
      return (this.field1816[this.field1818 - 4] & 255) + ((this.field1816[this.field1818 - 2] & 255) << 16) + ((this.field1816[this.field1818 - 1] & 255) << 24) + ((this.field1816[this.field1818 - 3] & 255) << 8);
   }

   public int method1164() {
      this.field1818 += 4;
      return (this.field1816[this.field1818 - 3] & 255) + ((this.field1816[this.field1818 - 1] & 255) << 16) + ((this.field1816[this.field1818 - 2] & 255) << 24) + ((this.field1816[this.field1818 - 4] & 255) << 8);
   }

   public int method1165() {
      this.field1818 += 4;
      return ((this.field1816[this.field1818 - 4] & 255) << 16) + ((this.field1816[this.field1818 - 3] & 255) << 24) + ((this.field1816[this.field1818 - 1] & 255) << 8) + (this.field1816[this.field1818 - 2] & 255);
   }

   public void method1179(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var2 + var3; ++var5) {
         var1[var5] = (byte)(this.field1816[++this.field1818 - 1] - 128);
      }

   }

   public static int method1188(String var0) {
      return var0.length() + 1;
   }
}
