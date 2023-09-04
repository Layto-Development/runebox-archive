import java.math.BigInteger;

public class class366 extends class70 {
   public static int[] field2651 = new int[256];
   static long[] field2653;
   public byte[] field2650;
   public int field2652;

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

         field2651[var1] = var0;
      }

      field2653 = new long[256];

      for(var2 = 0; var2 < 256; ++var2) {
         long var4 = (long)var2;

         for(int var3 = 0; var3 < 8; ++var3) {
            if ((var4 & 1L) == 1L) {
               var4 = var4 >>> 1 ^ -3932672073523589310L;
            } else {
               var4 >>>= 1;
            }
         }

         field2653[var2] = var4;
      }

   }

   public class366(int var1) {
      this.field2650 = class159.method610(var1);
      this.field2652 = 0;
   }

   public class366(int var1, boolean var2) {
      this.field2650 = class159.method608(var1, var2);
   }

   public class366(byte[] var1) {
      this.field2650 = var1;
      this.field2652 = 0;
   }

   public void method1642() {
      if (this.field2650 != null) {
         class159.method612(this.field2650);
      }

      this.field2650 = null;
   }

   public void method1643(int var1) {
      this.field2650[++this.field2652 - 1] = (byte)var1;
   }

   public void method1684(int var1) {
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 8);
      this.field2650[++this.field2652 - 1] = (byte)var1;
   }

   public void method1695(int var1) {
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 16);
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 8);
      this.field2650[++this.field2652 - 1] = (byte)var1;
   }

   public void method1709(int var1) {
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 24);
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 16);
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 8);
      this.field2650[++this.field2652 - 1] = (byte)var1;
   }

   public void method1644(long var1) {
      this.field2650[++this.field2652 - 1] = (byte)((int)(var1 >> 40));
      this.field2650[++this.field2652 - 1] = (byte)((int)(var1 >> 32));
      this.field2650[++this.field2652 - 1] = (byte)((int)(var1 >> 24));
      this.field2650[++this.field2652 - 1] = (byte)((int)(var1 >> 16));
      this.field2650[++this.field2652 - 1] = (byte)((int)(var1 >> 8));
      this.field2650[++this.field2652 - 1] = (byte)((int)var1);
   }

   public void method1680(long var1) {
      this.field2650[++this.field2652 - 1] = (byte)((int)(var1 >> 56));
      this.field2650[++this.field2652 - 1] = (byte)((int)(var1 >> 48));
      this.field2650[++this.field2652 - 1] = (byte)((int)(var1 >> 40));
      this.field2650[++this.field2652 - 1] = (byte)((int)(var1 >> 32));
      this.field2650[++this.field2652 - 1] = (byte)((int)(var1 >> 24));
      this.field2650[++this.field2652 - 1] = (byte)((int)(var1 >> 16));
      this.field2650[++this.field2652 - 1] = (byte)((int)(var1 >> 8));
      this.field2650[++this.field2652 - 1] = (byte)((int)var1);
   }

   public void method1645(boolean var1) {
      this.method1643(var1 ? 1 : 0);
   }

   public void method1646(String var1) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field2652 += class459.method2164(var1, 0, var1.length(), this.field2650, this.field2652);
         this.field2650[++this.field2652 - 1] = 0;
      }
   }

   public void method1647(String var1) {
      int var3 = var1.indexOf(0);
      if (var3 >= 0) {
         throw new IllegalArgumentException("");
      } else {
         this.field2650[++this.field2652 - 1] = 0;
         this.field2652 += class459.method2164(var1, 0, var1.length(), this.field2650, this.field2652);
         this.field2650[++this.field2652 - 1] = 0;
      }
   }

   public void method1640(CharSequence var1) {
      int var3 = class94.method363(var1);
      this.field2650[++this.field2652 - 1] = 0;
      this.method1653(var3);
      this.field2652 += class94.method364(this.field2650, this.field2652, var1);
   }

   public void method1648(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var2 + var3; ++var5) {
         this.field2650[++this.field2652 - 1] = var1[var5];
      }

   }

   public void method1649(class366 var1) {
      this.method1648(var1.field2650, 0, var1.field2652);
   }

   public void method1650(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException();
      } else {
         this.field2650[this.field2652 - var1 - 4] = (byte)(var1 >> 24);
         this.field2650[this.field2652 - var1 - 3] = (byte)(var1 >> 16);
         this.field2650[this.field2652 - var1 - 2] = (byte)(var1 >> 8);
         this.field2650[this.field2652 - var1 - 1] = (byte)var1;
      }
   }

   public void method1651(int var1) {
      if (var1 >= 0 && var1 <= 65535) {
         this.field2650[this.field2652 - var1 - 2] = (byte)(var1 >> 8);
         this.field2650[this.field2652 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method1652(int var1) {
      if (var1 >= 0 && var1 <= 255) {
         this.field2650[this.field2652 - var1 - 1] = (byte)var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method1698(int var1) {
      if (var1 >= 0 && var1 < 128) {
         this.method1643(var1);
      } else if (var1 >= 0 && var1 < 32768) {
         this.method1684(var1 + '\u8000');
      } else {
         throw new IllegalArgumentException();
      }
   }

   public void method1653(int var1) {
      if (0 != (var1 & -128)) {
         if (0 != (var1 & -16384)) {
            if (0 != (var1 & -2097152)) {
               if (0 != (var1 & -268435456)) {
                  this.method1643(var1 >>> 28 | 128);
               }

               this.method1643(var1 >>> 21 | 128);
            }

            this.method1643(var1 >>> 14 | 128);
         }

         this.method1643(var1 >>> 7 | 128);
      }

      this.method1643(var1 & 127);
   }

   public int method1654() {
      return this.field2650[++this.field2652 - 1] & 255;
   }

   public byte method1655() {
      return this.field2650[++this.field2652 - 1];
   }

   public int method1703() {
      this.field2652 += 2;
      return (this.field2650[this.field2652 - 1] & 255) + ((this.field2650[this.field2652 - 2] & 255) << 8);
   }

   public int method1656() {
      this.field2652 += 2;
      int var2 = (this.field2650[this.field2652 - 1] & 255) + ((this.field2650[this.field2652 - 2] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int method1710() {
      this.field2652 += 3;
      return ((this.field2650[this.field2652 - 2] & 255) << 8) + ((this.field2650[this.field2652 - 3] & 255) << 16) + (this.field2650[this.field2652 - 1] & 255);
   }

   public int method1700() {
      this.field2652 += 3;
      int var2 = (this.field2650[this.field2652 - 1] & 255) + ((this.field2650[this.field2652 - 2] & 255) << 8) + ((this.field2650[this.field2652 - 3] & 255) << 16);
      if (var2 > 8388607) {
         var2 -= 16777216;
      }

      return var2;
   }

   public int method1658() {
      this.field2652 += 4;
      return ((this.field2650[this.field2652 - 3] & 255) << 16) + ((this.field2650[this.field2652 - 4] & 255) << 24) + ((this.field2650[this.field2652 - 2] & 255) << 8) + (this.field2650[this.field2652 - 1] & 255);
   }

   public long method1659() {
      long var2 = (long)this.method1658() & 4294967295L;
      long var4 = (long)this.method1658() & 4294967295L;
      return var4 + (var2 << 32);
   }

   public float method1660() {
      return Float.intBitsToFloat(this.method1658());
   }

   public boolean method1661() {
      return (this.method1654() & 1) == 1;
   }

   public String method1713() {
      if (0 == this.field2650[this.field2652]) {
         ++this.field2652;
         return null;
      } else {
         return this.method1662();
      }
   }

   public String method1662() {
      int var2 = this.field2652;

      while(this.field2650[++this.field2652 - 1] != 0) {
      }

      int var3 = this.field2652 - var2 - 1;
      return var3 == 0 ? "" : class459.method2165(this.field2650, var2, var3);
   }

   public String method1704() {
      byte var2 = this.field2650[++this.field2652 - 1];
      if (var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.field2652;

         while(this.field2650[++this.field2652 - 1] != 0) {
         }

         int var4 = this.field2652 - var3 - 1;
         return var4 == 0 ? "" : class459.method2165(this.field2650, var3, var4);
      }
   }

   public String method1696() {
      byte var2 = this.field2650[++this.field2652 - 1];
      if (var2 != 0) {
         throw new IllegalStateException("");
      } else {
         int var3 = this.method1641();
         if (this.field2652 + var3 > this.field2650.length) {
            throw new IllegalStateException("");
         } else {
            byte[] var5 = this.field2650;
            int var6 = this.field2652;
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
                  if (var9 < var10 && 128 == (var5[var9] & 192)) {
                     var12 = (var11 & 31) << 6 | var5[var9++] & 63;
                     if (var12 < 128) {
                        var12 = 65533;
                     }
                  } else {
                     var12 = 65533;
                  }
               } else if (var11 < 240) {
                  if (var9 + 1 < var10 && 128 == (var5[var9] & 192) && 128 == (var5[var9 + 1] & 192)) {
                     var12 = (var11 & 15) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
                     if (var12 < 2048) {
                        var12 = 65533;
                     }
                  } else {
                     var12 = 65533;
                  }
               } else if (var11 < 248) {
                  if (var9 + 2 < var10 && 128 == (var5[var9] & 192) && (var5[var9 + 1] & 192) == 128 && 128 == (var5[var9 + 2] & 192)) {
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
            this.field2652 += var3;
            return var4;
         }
      }
   }

   public void method1664(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var3 + var2; ++var5) {
         var1[var5] = this.field2650[++this.field2652 - 1];
      }

   }

   public int method1665() {
      int var2 = this.field2650[this.field2652] & 255;
      return var2 < 128 ? this.method1654() - 64 : this.method1703() - '\uc000';
   }

   public int method1701() {
      int var2 = this.field2650[this.field2652] & 255;
      return var2 < 128 ? this.method1654() : this.method1703() - '\u8000';
   }

   public int method1666() {
      int var2 = this.field2650[this.field2652] & 255;
      return var2 < 128 ? this.method1654() - 1 : this.method1703() - '\u8001';
   }

   public int method1667() {
      int var2 = 0;

      int var3;
      for(var3 = this.method1701(); var3 == 32767; var3 = this.method1701()) {
         var2 += 32767;
      }

      var2 += var3;
      return var2;
   }

   public int method1668() {
      return this.field2650[this.field2652] < 0 ? this.method1658() & Integer.MAX_VALUE : this.method1703();
   }

   public int method1702() {
      if (this.field2650[this.field2652] < 0) {
         return this.method1658() & Integer.MAX_VALUE;
      } else {
         int var2 = this.method1703();
         return var2 == 32767 ? -1 : var2;
      }
   }

   public int method1641() {
      byte var2 = this.field2650[++this.field2652 - 1];

      int var3;
      for(var3 = 0; var2 < 0; var2 = this.field2650[++this.field2652 - 1]) {
         var3 = (var3 | var2 & 127) << 7;
      }

      return var3 | var2;
   }

   public int method1670() {
      int var3 = 0;
      int var4 = 0;

      int var2;
      do {
         var2 = this.method1654();
         var3 |= (var2 & 127) << var4;
         var4 += 7;
      } while(var2 > 127);

      return var3;
   }

   public void method1671(int[] var1) {
      int var3 = this.field2652 / 8;
      this.field2652 = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.method1658();
         int var6 = this.method1658();
         int var7 = 0;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3]) {
            var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
            var7 += var8;
         }

         this.field2652 -= 8;
         this.method1709(var5);
         this.method1709(var6);
      }

   }

   public void method1715(int[] var1) {
      int var3 = this.field2652 / 8;
      this.field2652 = 0;

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = this.method1658();
         int var6 = this.method1658();
         int var7 = -957401312;
         int var8 = -1640531527;

         for(int var9 = 32; var9-- > 0; var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var7 + var1[var7 & 3]) {
            var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var7 + var1[var7 >>> 11 & 3];
            var7 -= var8;
         }

         this.field2652 -= 8;
         this.method1709(var5);
         this.method1709(var6);
      }

   }

   public void method1697(int[] var1, int var2, int var3) {
      int var5 = this.field2652;
      this.field2652 = var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.method1658();
         int var9 = this.method1658();
         int var10 = 0;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var1[var10 >>> 11 & 3] + var10) {
            var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10;
            var10 += var11;
         }

         this.field2652 -= 8;
         this.method1709(var8);
         this.method1709(var9);
      }

      this.field2652 = var5;
   }

   public void method1705(int[] var1, int var2, int var3) {
      int var5 = this.field2652;
      this.field2652 = var2;
      int var6 = (var3 - var2) / 8;

      for(int var7 = 0; var7 < var6; ++var7) {
         int var8 = this.method1658();
         int var9 = this.method1658();
         int var10 = -957401312;
         int var11 = -1640531527;

         for(int var12 = 32; var12-- > 0; var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3]) {
            var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
            var10 -= var11;
         }

         this.field2652 -= 8;
         this.method1709(var8);
         this.method1709(var9);
      }

      this.field2652 = var5;
   }

   public void method1687(BigInteger var1, BigInteger var2) {
      int var4 = this.field2652;
      this.field2652 = 0;
      byte[] var5 = new byte[var4];
      this.method1664(var5, 0, var4);
      BigInteger var6 = new BigInteger(var5);
      BigInteger var7 = var6.modPow(var1, var2);
      byte[] var8 = var7.toByteArray();
      this.field2652 = 0;
      this.method1684(var8.length);
      this.method1648(var8, 0, var8.length);
   }

   public int method1672(int var1) {
      byte[] var4 = this.field2650;
      int var5 = this.field2652;
      int var6 = -1;

      for(int var7 = var1; var7 < var5; ++var7) {
         var6 = var6 >>> 8 ^ field2651[(var6 ^ var4[var7]) & 255];
      }

      var6 = ~var6;
      this.method1709(var6);
      return var6;
   }

   public boolean method1673() {
      this.field2652 -= 4;
      byte[] var3 = this.field2650;
      int var4 = this.field2652;
      int var5 = -1;

      int var6;
      for(var6 = 0; var6 < var4; ++var6) {
         var5 = var5 >>> 8 ^ field2651[(var5 ^ var3[var6]) & 255];
      }

      var5 = ~var5;
      var6 = this.method1658();
      return var6 == var5;
   }

   public void method1674(int var1) {
      this.field2650[++this.field2652 - 1] = (byte)(var1 + 128);
   }

   public void method1716(int var1) {
      this.field2650[++this.field2652 - 1] = (byte)(0 - var1);
   }

   public void method1690(int var1) {
      this.field2650[++this.field2652 - 1] = (byte)(128 - var1);
   }

   public int method1675() {
      return this.field2650[++this.field2652 - 1] - 128 & 255;
   }

   public int method1714() {
      return 0 - this.field2650[++this.field2652 - 1] & 255;
   }

   public int method1676() {
      return 128 - this.field2650[++this.field2652 - 1] & 255;
   }

   public byte method1669() {
      return (byte)(this.field2650[++this.field2652 - 1] - 128);
   }

   public byte method1677() {
      return (byte)(0 - this.field2650[++this.field2652 - 1]);
   }

   public byte method1678() {
      return (byte)(128 - this.field2650[++this.field2652 - 1]);
   }

   public void method1712(int var1) {
      this.field2650[++this.field2652 - 1] = (byte)var1;
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 8);
   }

   public void method1679(int var1) {
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 8);
      this.field2650[++this.field2652 - 1] = (byte)(var1 + 128);
   }

   public void method1706(int var1) {
      this.field2650[++this.field2652 - 1] = (byte)(var1 + 128);
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 8);
   }

   public int method1681() {
      this.field2652 += 2;
      return (this.field2650[this.field2652 - 2] & 255) + ((this.field2650[this.field2652 - 1] & 255) << 8);
   }

   public int method1682() {
      this.field2652 += 2;
      return (this.field2650[this.field2652 - 1] - 128 & 255) + ((this.field2650[this.field2652 - 2] & 255) << 8);
   }

   public int method1683() {
      this.field2652 += 2;
      return (this.field2650[this.field2652 - 2] - 128 & 255) + ((this.field2650[this.field2652 - 1] & 255) << 8);
   }

   public int method1657() {
      this.field2652 += 2;
      int var2 = (this.field2650[this.field2652 - 2] & 255) + ((this.field2650[this.field2652 - 1] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public int method1685() {
      this.field2652 += 2;
      int var2 = (this.field2650[this.field2652 - 1] - 128 & 255) + ((this.field2650[this.field2652 - 2] & 255) << 8);
      if (var2 > 32767) {
         var2 -= 65536;
      }

      return var2;
   }

   public void method1686(int var1) {
      this.field2650[++this.field2652 - 1] = (byte)var1;
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 8);
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 16);
   }

   public int method1711() {
      this.field2652 += 3;
      return ((this.field2650[this.field2652 - 1] & 255) << 8) + ((this.field2650[this.field2652 - 3] & 255) << 16) + (this.field2650[this.field2652 - 2] & 255);
   }

   public int method1707() {
      this.field2652 += 3;
      return ((this.field2650[this.field2652 - 3] & 255) << 8) + ((this.field2650[this.field2652 - 2] & 255) << 16) + (this.field2650[this.field2652 - 1] & 255);
   }

   public int method1688() {
      this.field2652 += 3;
      int var2 = ((this.field2650[this.field2652 - 1] & 255) << 16) + ((this.field2650[this.field2652 - 2] & 255) << 8) + (this.field2650[this.field2652 - 3] & 255);
      if (var2 > 8388607) {
         var2 -= 16777216;
      }

      return var2;
   }

   public int method1689() {
      this.field2652 += 3;
      int var2 = ((this.field2650[this.field2652 - 3] & 255) << 16) + ((this.field2650[this.field2652 - 1] & 255) << 8) + (this.field2650[this.field2652 - 2] & 255);
      if (var2 > 8388607) {
         var2 -= 16777216;
      }

      return var2;
   }

   public void method1663(int var1) {
      this.field2650[++this.field2652 - 1] = (byte)var1;
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 8);
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 16);
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 24);
   }

   public void method1691(int var1) {
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 8);
      this.field2650[++this.field2652 - 1] = (byte)var1;
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 24);
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 16);
   }

   public void method1692(int var1) {
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 16);
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 24);
      this.field2650[++this.field2652 - 1] = (byte)var1;
      this.field2650[++this.field2652 - 1] = (byte)(var1 >> 8);
   }

   public int method1699() {
      this.field2652 += 4;
      return (this.field2650[this.field2652 - 4] & 255) + ((this.field2650[this.field2652 - 2] & 255) << 16) + ((this.field2650[this.field2652 - 1] & 255) << 24) + ((this.field2650[this.field2652 - 3] & 255) << 8);
   }

   public int method1693() {
      this.field2652 += 4;
      return (this.field2650[this.field2652 - 3] & 255) + ((this.field2650[this.field2652 - 1] & 255) << 16) + ((this.field2650[this.field2652 - 2] & 255) << 24) + ((this.field2650[this.field2652 - 4] & 255) << 8);
   }

   public int method1694() {
      this.field2652 += 4;
      return ((this.field2650[this.field2652 - 4] & 255) << 16) + ((this.field2650[this.field2652 - 3] & 255) << 24) + ((this.field2650[this.field2652 - 1] & 255) << 8) + (this.field2650[this.field2652 - 2] & 255);
   }

   public void method1708(byte[] var1, int var2, int var3) {
      for(int var5 = var2; var5 < var2 + var3; ++var5) {
         var1[var5] = (byte)(this.field2650[++this.field2652 - 1] - 128);
      }

   }

   public static int method1717(String var0) {
      return var0.length() + 1;
   }
}
