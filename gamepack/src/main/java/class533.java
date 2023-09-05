public class class533 extends class496 {
   static int field4194 = 0;
   static int[] field4177;
   static int[] field4196 = new int[10000];
   static int[] field4200;
   static int[] field4214 = new int[10000];
   boolean field4207 = false;
   byte field4191 = 0;
   byte[] field4176;
   byte[] field4186;
   byte[] field4187;
   byte[] field4205;
   byte[] field4208;
   class458[] field4188;
   class458[] field4204;
   class487[] field4202;
   int field4178 = 0;
   int field4185;
   int field4192;
   int field4209;
   int field4210 = 0;
   int field4211;
   int field4212;
   int field4215;
   int[] field4179;
   int[] field4180;
   int[] field4181;
   int[] field4182;
   int[] field4183;
   int[] field4184;
   int[] field4203;
   int[] field4216;
   int[][] field4197;
   int[][] field4198;
   int[][] field4199;
   int[][] field4201;
   short[] field4189;
   short[] field4190;
   short[] field4193;
   short[] field4195;
   short[] field4213;
   public short field4206;
   public short field4217;

   static {
      field4177 = class399.field3109;
      field4200 = class399.field3107;
   }

   class533() {
   }

   class533(byte[] var1) {
      class184 var2 = new class184(10);
      var2.method1155(-2);
      if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
         this.method2540(var1);
      } else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
         this.method2536(var1);
      } else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method2542(var1);
      } else {
         this.method2541(var1);
      }

   }

   public class533(class533[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      this.field4178 = 0;
      this.field4210 = 0;
      this.field4192 = 0;
      this.field4191 = -1;

      int var10;
      class533 var11;
      for(var10 = 0; var10 < var2; ++var10) {
         var11 = var1[var10];
         if (var11 != null) {
            this.field4178 += var11.field4178;
            this.field4210 += var11.field4210;
            this.field4192 += var11.field4192;
            if (var11.field4186 != null) {
               var4 = true;
            } else {
               if (this.field4191 == -1) {
                  this.field4191 = var11.field4191;
               }

               if (this.field4191 != var11.field4191) {
                  var4 = true;
               }
            }

            var3 |= var11.field4208 != null;
            var5 |= var11.field4187 != null;
            var6 |= var11.field4216 != null;
            var7 |= var11.field4190 != null;
            var8 |= var11.field4176 != null;
            var9 |= var11.field4197 != null;
         }
      }

      this.field4179 = new int[this.field4178];
      this.field4180 = new int[this.field4178];
      this.field4181 = new int[this.field4178];
      this.field4203 = new int[this.field4178];
      this.field4182 = new int[this.field4210];
      this.field4183 = new int[this.field4210];
      this.field4184 = new int[this.field4210];
      if (var3) {
         this.field4208 = new byte[this.field4210];
      }

      if (var4) {
         this.field4186 = new byte[this.field4210];
      }

      if (var5) {
         this.field4187 = new byte[this.field4210];
      }

      if (var6) {
         this.field4216 = new int[this.field4210];
      }

      if (var7) {
         this.field4190 = new short[this.field4210];
      }

      if (var8) {
         this.field4176 = new byte[this.field4210];
      }

      if (var9) {
         this.field4197 = new int[this.field4178][];
         this.field4201 = new int[this.field4178][];
      }

      this.field4189 = new short[this.field4210];
      if (this.field4192 > 0) {
         this.field4205 = new byte[this.field4192];
         this.field4193 = new short[this.field4192];
         this.field4195 = new short[this.field4192];
         this.field4213 = new short[this.field4192];
      }

      this.field4178 = 0;
      this.field4210 = 0;
      this.field4192 = 0;

      for(var10 = 0; var10 < var2; ++var10) {
         var11 = var1[var10];
         if (var11 != null) {
            int var12;
            for(var12 = 0; var12 < var11.field4210; ++var12) {
               if (var3 && var11.field4208 != null) {
                  this.field4208[this.field4210] = var11.field4208[var12];
               }

               if (var4) {
                  if (var11.field4186 != null) {
                     this.field4186[this.field4210] = var11.field4186[var12];
                  } else {
                     this.field4186[this.field4210] = var11.field4191;
                  }
               }

               if (var5 && var11.field4187 != null) {
                  this.field4187[this.field4210] = var11.field4187[var12];
               }

               if (var6 && var11.field4216 != null) {
                  this.field4216[this.field4210] = var11.field4216[var12];
               }

               if (var7) {
                  if (var11.field4190 != null) {
                     this.field4190[this.field4210] = var11.field4190[var12];
                  } else {
                     this.field4190[this.field4210] = -1;
                  }
               }

               if (var8) {
                  if (var11.field4176 != null && var11.field4176[var12] != -1) {
                     this.field4176[this.field4210] = (byte)(var11.field4176[var12] + this.field4192);
                  } else {
                     this.field4176[this.field4210] = -1;
                  }
               }

               this.field4189[this.field4210] = var11.field4189[var12];
               this.field4182[this.field4210] = this.method2518(var11, var11.field4182[var12]);
               this.field4183[this.field4210] = this.method2518(var11, var11.field4183[var12]);
               this.field4184[this.field4210] = this.method2518(var11, var11.field4184[var12]);
               ++this.field4210;
            }

            for(var12 = 0; var12 < var11.field4192; ++var12) {
               byte var13 = this.field4205[this.field4192] = var11.field4205[var12];
               if (var13 == 0) {
                  this.field4193[this.field4192] = (short)this.method2518(var11, var11.field4193[var12]);
                  this.field4195[this.field4192] = (short)this.method2518(var11, var11.field4195[var12]);
                  this.field4213[this.field4192] = (short)this.method2518(var11, var11.field4213[var12]);
               }

               ++this.field4192;
            }
         }
      }

   }

   public class533(class533 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.field4178 = var1.field4178;
      this.field4210 = var1.field4210;
      this.field4192 = var1.field4192;
      int var6;
      if (var2) {
         this.field4179 = var1.field4179;
         this.field4180 = var1.field4180;
         this.field4181 = var1.field4181;
      } else {
         this.field4179 = new int[this.field4178];
         this.field4180 = new int[this.field4178];
         this.field4181 = new int[this.field4178];

         for(var6 = 0; var6 < this.field4178; ++var6) {
            this.field4179[var6] = var1.field4179[var6];
            this.field4180[var6] = var1.field4180[var6];
            this.field4181[var6] = var1.field4181[var6];
         }
      }

      if (var3) {
         this.field4189 = var1.field4189;
      } else {
         this.field4189 = new short[this.field4210];

         for(var6 = 0; var6 < this.field4210; ++var6) {
            this.field4189[var6] = var1.field4189[var6];
         }
      }

      if (!var4 && var1.field4190 != null) {
         this.field4190 = new short[this.field4210];

         for(var6 = 0; var6 < this.field4210; ++var6) {
            this.field4190[var6] = var1.field4190[var6];
         }
      } else {
         this.field4190 = var1.field4190;
      }

      if (var5) {
         this.field4187 = var1.field4187;
      } else {
         this.field4187 = new byte[this.field4210];
         if (var1.field4187 == null) {
            for(var6 = 0; var6 < this.field4210; ++var6) {
               this.field4187[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < this.field4210; ++var6) {
               this.field4187[var6] = var1.field4187[var6];
            }
         }
      }

      this.field4182 = var1.field4182;
      this.field4183 = var1.field4183;
      this.field4184 = var1.field4184;
      this.field4208 = var1.field4208;
      this.field4186 = var1.field4186;
      this.field4176 = var1.field4176;
      this.field4191 = var1.field4191;
      this.field4205 = var1.field4205;
      this.field4193 = var1.field4193;
      this.field4195 = var1.field4195;
      this.field4213 = var1.field4213;
      this.field4203 = var1.field4203;
      this.field4216 = var1.field4216;
      this.field4198 = var1.field4198;
      this.field4199 = var1.field4199;
      this.field4188 = var1.field4188;
      this.field4202 = var1.field4202;
      this.field4204 = var1.field4204;
      this.field4197 = var1.field4197;
      this.field4201 = var1.field4201;
      this.field4217 = var1.field4217;
      this.field4206 = var1.field4206;
   }

   void method2540(byte[] var1) {
      class184 var2 = new class184(var1);
      class184 var3 = new class184(var1);
      class184 var4 = new class184(var1);
      class184 var5 = new class184(var1);
      class184 var6 = new class184(var1);
      class184 var7 = new class184(var1);
      class184 var8 = new class184(var1);
      var2.field1818 = var1.length - 26;
      int var9 = var2.method1174();
      int var10 = var2.method1174();
      int var11 = var2.readUnsignedByte();
      int var12 = var2.readUnsignedByte();
      int var13 = var2.readUnsignedByte();
      int var14 = var2.readUnsignedByte();
      int var15 = var2.readUnsignedByte();
      int var16 = var2.readUnsignedByte();
      int var17 = var2.readUnsignedByte();
      int var18 = var2.readUnsignedByte();
      int var19 = var2.method1174();
      int var20 = var2.method1174();
      int var21 = var2.method1174();
      int var22 = var2.method1174();
      int var23 = var2.method1174();
      int var24 = var2.method1174();
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28;
      if (var11 > 0) {
         this.field4205 = new byte[var11];
         var2.field1818 = 0;

         for(var28 = 0; var28 < var11; ++var28) {
            byte var29 = this.field4205[var28] = var2.method1126();
            if (var29 == 0) {
               ++var25;
            }

            if (var29 >= 1 && var29 <= 3) {
               ++var26;
            }

            if (var29 == 2) {
               ++var27;
            }
         }
      }

      var28 = var11 + var9;
      int var30 = var28;
      if (var12 == 1) {
         var28 += var10;
      }

      int var31 = var28;
      var28 += var10;
      int var32 = var28;
      if (var13 == 255) {
         var28 += var10;
      }

      int var33 = var28;
      if (var15 == 1) {
         var28 += var10;
      }

      int var34 = var28;
      var28 += var24;
      int var35 = var28;
      if (var14 == 1) {
         var28 += var10;
      }

      int var36 = var28;
      var28 += var22;
      int var37 = var28;
      if (var16 == 1) {
         var28 += var10 * 2;
      }

      int var38 = var28;
      var28 += var23;
      int var39 = var28;
      var28 += var10 * 2;
      int var40 = var28;
      var28 += var19;
      int var41 = var28;
      var28 += var20;
      int var42 = var28;
      var28 += var21;
      int var43 = var28;
      var28 += var25 * 6;
      int var44 = var28;
      var28 += var26 * 6;
      int var45 = var28;
      var28 += var26 * 6;
      int var46 = var28;
      var28 += var26 * 2;
      int var47 = var28;
      var28 += var26;
      int var48 = var28;
      var28 += var26 * 2 + var27 * 2;
      this.field4178 = var9;
      this.field4210 = var10;
      this.field4192 = var11;
      this.field4179 = new int[var9];
      this.field4180 = new int[var9];
      this.field4181 = new int[var9];
      this.field4182 = new int[var10];
      this.field4183 = new int[var10];
      this.field4184 = new int[var10];
      if (var17 == 1) {
         this.field4203 = new int[var9];
      }

      if (var12 == 1) {
         this.field4208 = new byte[var10];
      }

      if (var13 == 255) {
         this.field4186 = new byte[var10];
      } else {
         this.field4191 = (byte)var13;
      }

      if (var14 == 1) {
         this.field4187 = new byte[var10];
      }

      if (var15 == 1) {
         this.field4216 = new int[var10];
      }

      if (var16 == 1) {
         this.field4190 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field4176 = new byte[var10];
      }

      if (var18 == 1) {
         this.field4197 = new int[var9][];
         this.field4201 = new int[var9][];
      }

      this.field4189 = new short[var10];
      if (var11 > 0) {
         this.field4193 = new short[var11];
         this.field4195 = new short[var11];
         this.field4213 = new short[var11];
      }

      var2.field1818 = var11;
      var3.field1818 = var40;
      var4.field1818 = var41;
      var5.field1818 = var42;
      var6.field1818 = var34;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var53;
      int var54;
      int var55;
      int var56;
      int var57;
      for(var53 = 0; var53 < var9; ++var53) {
         var54 = var2.readUnsignedByte();
         var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.method1136();
         }

         var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.method1136();
         }

         var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.method1136();
         }

         this.field4179[var53] = var50 + var55;
         this.field4180[var53] = var51 + var56;
         this.field4181[var53] = var52 + var57;
         var50 = this.field4179[var53];
         var51 = this.field4180[var53];
         var52 = this.field4181[var53];
         if (var17 == 1) {
            this.field4203[var53] = var6.readUnsignedByte();
         }
      }

      if (var18 == 1) {
         for(var53 = 0; var53 < var9; ++var53) {
            var54 = var6.readUnsignedByte();
            this.field4197[var53] = new int[var54];
            this.field4201[var53] = new int[var54];

            for(var55 = 0; var55 < var54; ++var55) {
               this.field4197[var53][var55] = var6.readUnsignedByte();
               this.field4201[var53][var55] = var6.readUnsignedByte();
            }
         }
      }

      var2.field1818 = var39;
      var3.field1818 = var30;
      var4.field1818 = var32;
      var5.field1818 = var35;
      var6.field1818 = var33;
      var7.field1818 = var37;
      var8.field1818 = var38;

      for(var53 = 0; var53 < var10; ++var53) {
         this.field4189[var53] = (short)var2.method1174();
         if (var12 == 1) {
            this.field4208[var53] = var3.method1126();
         }

         if (var13 == 255) {
            this.field4186[var53] = var4.method1126();
         }

         if (var14 == 1) {
            this.field4187[var53] = var5.method1126();
         }

         if (var15 == 1) {
            this.field4216[var53] = var6.readUnsignedByte();
         }

         if (var16 == 1) {
            this.field4190[var53] = (short)(var7.method1174() - 1);
         }

         if (this.field4176 != null && this.field4190[var53] != -1) {
            this.field4176[var53] = (byte)(var8.readUnsignedByte() - 1);
         }
      }

      var2.field1818 = var36;
      var3.field1818 = var31;
      var53 = 0;
      var54 = 0;
      var55 = 0;
      var56 = 0;

      int var58;
      for(var57 = 0; var57 < var10; ++var57) {
         var58 = var3.readUnsignedByte();
         if (var58 == 1) {
            var53 = var2.method1136() + var56;
            var54 = var2.method1136() + var53;
            var55 = var2.method1136() + var54;
            var56 = var55;
            this.field4182[var57] = var53;
            this.field4183[var57] = var54;
            this.field4184[var57] = var55;
         }

         if (var58 == 2) {
            var54 = var55;
            var55 = var2.method1136() + var56;
            var56 = var55;
            this.field4182[var57] = var53;
            this.field4183[var57] = var54;
            this.field4184[var57] = var55;
         }

         if (var58 == 3) {
            var53 = var55;
            var55 = var2.method1136() + var56;
            var56 = var55;
            this.field4182[var57] = var53;
            this.field4183[var57] = var54;
            this.field4184[var57] = var55;
         }

         if (var58 == 4) {
            int var59 = var53;
            var53 = var54;
            var54 = var59;
            var55 = var2.method1136() + var56;
            var56 = var55;
            this.field4182[var57] = var53;
            this.field4183[var57] = var59;
            this.field4184[var57] = var55;
         }
      }

      var2.field1818 = var43;
      var3.field1818 = var44;
      var4.field1818 = var45;
      var5.field1818 = var46;
      var6.field1818 = var47;
      var7.field1818 = var48;

      for(var57 = 0; var57 < var11; ++var57) {
         var58 = this.field4205[var57] & 255;
         if (var58 == 0) {
            this.field4193[var57] = (short)var2.method1174();
            this.field4195[var57] = (short)var2.method1174();
            this.field4213[var57] = (short)var2.method1174();
         }
      }

      var2.field1818 = var28;
      var57 = var2.readUnsignedByte();
      if (var57 != 0) {
         new class141();
         var2.method1174();
         var2.method1174();
         var2.method1174();
         var2.readInt();
      }

   }

   void method2536(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      class184 var4 = new class184(var1);
      class184 var5 = new class184(var1);
      class184 var6 = new class184(var1);
      class184 var7 = new class184(var1);
      class184 var8 = new class184(var1);
      var4.field1818 = var1.length - 23;
      int var9 = var4.method1174();
      int var10 = var4.method1174();
      int var11 = var4.readUnsignedByte();
      int var12 = var4.readUnsignedByte();
      int var13 = var4.readUnsignedByte();
      int var14 = var4.readUnsignedByte();
      int var15 = var4.readUnsignedByte();
      int var16 = var4.readUnsignedByte();
      int var17 = var4.readUnsignedByte();
      int var18 = var4.method1174();
      int var19 = var4.method1174();
      int var20 = var4.method1174();
      int var21 = var4.method1174();
      int var22 = var4.method1174();
      int var23 = 0;
      byte var24 = (byte)var23;
      var23 += var9;
      int var25 = var23;
      var23 += var10;
      int var26 = var23;
      if (var13 == 255) {
         var23 += var10;
      }

      int var27 = var23;
      if (var15 == 1) {
         var23 += var10;
      }

      int var28 = var23;
      if (var12 == 1) {
         var23 += var10;
      }

      int var29 = var23;
      var23 += var22;
      int var30 = var23;
      if (var14 == 1) {
         var23 += var10;
      }

      int var31 = var23;
      var23 += var21;
      int var32 = var23;
      var23 += var10 * 2;
      int var33 = var23;
      var23 += var11 * 6;
      int var34 = var23;
      var23 += var18;
      int var35 = var23;
      var23 += var19;
      int var10000 = var23 + var20;
      this.field4178 = var9;
      this.field4210 = var10;
      this.field4192 = var11;
      this.field4179 = new int[var9];
      this.field4180 = new int[var9];
      this.field4181 = new int[var9];
      this.field4182 = new int[var10];
      this.field4183 = new int[var10];
      this.field4184 = new int[var10];
      if (var11 > 0) {
         this.field4205 = new byte[var11];
         this.field4193 = new short[var11];
         this.field4195 = new short[var11];
         this.field4213 = new short[var11];
      }

      if (var16 == 1) {
         this.field4203 = new int[var9];
      }

      if (var12 == 1) {
         this.field4208 = new byte[var10];
         this.field4176 = new byte[var10];
         this.field4190 = new short[var10];
      }

      if (var13 == 255) {
         this.field4186 = new byte[var10];
      } else {
         this.field4191 = (byte)var13;
      }

      if (var14 == 1) {
         this.field4187 = new byte[var10];
      }

      if (var15 == 1) {
         this.field4216 = new int[var10];
      }

      if (var17 == 1) {
         this.field4197 = new int[var9][];
         this.field4201 = new int[var9][];
      }

      this.field4189 = new short[var10];
      var4.field1818 = var24;
      var5.field1818 = var34;
      var6.field1818 = var35;
      var7.field1818 = var23;
      var8.field1818 = var29;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.readUnsignedByte();
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.method1136();
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.method1136();
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.method1136();
         }

         this.field4179[var40] = var37 + var42;
         this.field4180[var40] = var38 + var43;
         this.field4181[var40] = var39 + var44;
         var37 = this.field4179[var40];
         var38 = this.field4180[var40];
         var39 = this.field4181[var40];
         if (var16 == 1) {
            this.field4203[var40] = var8.readUnsignedByte();
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.readUnsignedByte();
            this.field4197[var40] = new int[var41];
            this.field4201[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.field4197[var40][var42] = var8.readUnsignedByte();
               this.field4201[var40][var42] = var8.readUnsignedByte();
            }
         }
      }

      var4.field1818 = var32;
      var5.field1818 = var28;
      var6.field1818 = var26;
      var7.field1818 = var30;
      var8.field1818 = var27;

      for(var40 = 0; var40 < var10; ++var40) {
         this.field4189[var40] = (short)var4.method1174();
         if (var12 == 1) {
            var41 = var5.readUnsignedByte();
            if ((var41 & 1) == 1) {
               this.field4208[var40] = 1;
               var2 = true;
            } else {
               this.field4208[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.field4176[var40] = (byte)(var41 >> 2);
               this.field4190[var40] = this.field4189[var40];
               this.field4189[var40] = 127;
               if (this.field4190[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.field4176[var40] = -1;
               this.field4190[var40] = -1;
            }
         }

         if (var13 == 255) {
            this.field4186[var40] = var6.method1126();
         }

         if (var14 == 1) {
            this.field4187[var40] = var7.method1126();
         }

         if (var15 == 1) {
            this.field4216[var40] = var8.readUnsignedByte();
         }
      }

      var4.field1818 = var31;
      var5.field1818 = var25;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.readUnsignedByte();
         if (var45 == 1) {
            var40 = var4.method1136() + var43;
            var41 = var4.method1136() + var40;
            var42 = var4.method1136() + var41;
            var43 = var42;
            this.field4182[var44] = var40;
            this.field4183[var44] = var41;
            this.field4184[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.method1136() + var43;
            var43 = var42;
            this.field4182[var44] = var40;
            this.field4183[var44] = var41;
            this.field4184[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.method1136() + var43;
            var43 = var42;
            this.field4182[var44] = var40;
            this.field4183[var44] = var41;
            this.field4184[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.method1136() + var43;
            var43 = var42;
            this.field4182[var44] = var40;
            this.field4183[var44] = var46;
            this.field4184[var44] = var42;
         }
      }

      var4.field1818 = var33;

      for(var44 = 0; var44 < var11; ++var44) {
         this.field4205[var44] = 0;
         this.field4193[var44] = (short)var4.method1174();
         this.field4195[var44] = (short)var4.method1174();
         this.field4213[var44] = (short)var4.method1174();
      }

      if (this.field4176 != null) {
         boolean var47 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.field4176[var45] & 255;
            if (var46 != 255) {
               if ((this.field4193[var46] & '\uffff') == this.field4182[var45] && (this.field4195[var46] & '\uffff') == this.field4183[var45] && (this.field4213[var46] & '\uffff') == this.field4184[var45]) {
                  this.field4176[var45] = -1;
               } else {
                  var47 = true;
               }
            }
         }

         if (!var47) {
            this.field4176 = null;
         }
      }

      if (!var3) {
         this.field4190 = null;
      }

      if (!var2) {
         this.field4208 = null;
      }

   }

   void method2542(byte[] var1) {
      class184 var2 = new class184(var1);
      class184 var3 = new class184(var1);
      class184 var4 = new class184(var1);
      class184 var5 = new class184(var1);
      class184 var6 = new class184(var1);
      class184 var7 = new class184(var1);
      class184 var8 = new class184(var1);
      var2.field1818 = var1.length - 23;
      int var9 = var2.method1174();
      int var10 = var2.method1174();
      int var11 = var2.readUnsignedByte();
      int var12 = var2.readUnsignedByte();
      int var13 = var2.readUnsignedByte();
      int var14 = var2.readUnsignedByte();
      int var15 = var2.readUnsignedByte();
      int var16 = var2.readUnsignedByte();
      int var17 = var2.readUnsignedByte();
      int var18 = var2.method1174();
      int var19 = var2.method1174();
      int var20 = var2.method1174();
      int var21 = var2.method1174();
      int var22 = var2.method1174();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.field4205 = new byte[var11];
         var2.field1818 = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field4205[var26] = var2.method1126();
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field4178 = var9;
      this.field4210 = var10;
      this.field4192 = var11;
      this.field4179 = new int[var9];
      this.field4180 = new int[var9];
      this.field4181 = new int[var9];
      this.field4182 = new int[var10];
      this.field4183 = new int[var10];
      this.field4184 = new int[var10];
      if (var17 == 1) {
         this.field4203 = new int[var9];
      }

      if (var12 == 1) {
         this.field4208 = new byte[var10];
      }

      if (var13 == 255) {
         this.field4186 = new byte[var10];
      } else {
         this.field4191 = (byte)var13;
      }

      if (var14 == 1) {
         this.field4187 = new byte[var10];
      }

      if (var15 == 1) {
         this.field4216 = new int[var10];
      }

      if (var16 == 1) {
         this.field4190 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field4176 = new byte[var10];
      }

      this.field4189 = new short[var10];
      if (var11 > 0) {
         this.field4193 = new short[var11];
         this.field4195 = new short[var11];
         this.field4213 = new short[var11];
      }

      var2.field1818 = var11;
      var3.field1818 = var38;
      var4.field1818 = var39;
      var5.field1818 = var40;
      var6.field1818 = var32;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.readUnsignedByte();
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.method1136();
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.method1136();
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.method1136();
         }

         this.field4179[var51] = var48 + var53;
         this.field4180[var51] = var49 + var54;
         this.field4181[var51] = var50 + var55;
         var48 = this.field4179[var51];
         var49 = this.field4180[var51];
         var50 = this.field4181[var51];
         if (var17 == 1) {
            this.field4203[var51] = var6.readUnsignedByte();
         }
      }

      var2.field1818 = var37;
      var3.field1818 = var28;
      var4.field1818 = var30;
      var5.field1818 = var33;
      var6.field1818 = var31;
      var7.field1818 = var35;
      var8.field1818 = var36;

      for(var51 = 0; var51 < var10; ++var51) {
         this.field4189[var51] = (short)var2.method1174();
         if (var12 == 1) {
            this.field4208[var51] = var3.method1126();
         }

         if (var13 == 255) {
            this.field4186[var51] = var4.method1126();
         }

         if (var14 == 1) {
            this.field4187[var51] = var5.method1126();
         }

         if (var15 == 1) {
            this.field4216[var51] = var6.readUnsignedByte();
         }

         if (var16 == 1) {
            this.field4190[var51] = (short)(var7.method1174() - 1);
         }

         if (this.field4176 != null && this.field4190[var51] != -1) {
            this.field4176[var51] = (byte)(var8.readUnsignedByte() - 1);
         }
      }

      var2.field1818 = var34;
      var3.field1818 = var29;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.readUnsignedByte();
         if (var56 == 1) {
            var51 = var2.method1136() + var54;
            var52 = var2.method1136() + var51;
            var53 = var2.method1136() + var52;
            var54 = var53;
            this.field4182[var55] = var51;
            this.field4183[var55] = var52;
            this.field4184[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.method1136() + var54;
            var54 = var53;
            this.field4182[var55] = var51;
            this.field4183[var55] = var52;
            this.field4184[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.method1136() + var54;
            var54 = var53;
            this.field4182[var55] = var51;
            this.field4183[var55] = var52;
            this.field4184[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.method1136() + var54;
            var54 = var53;
            this.field4182[var55] = var51;
            this.field4183[var55] = var57;
            this.field4184[var55] = var53;
         }
      }

      var2.field1818 = var41;
      var3.field1818 = var42;
      var4.field1818 = var43;
      var5.field1818 = var44;
      var6.field1818 = var45;
      var7.field1818 = var46;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.field4205[var55] & 255;
         if (var56 == 0) {
            this.field4193[var55] = (short)var2.method1174();
            this.field4195[var55] = (short)var2.method1174();
            this.field4213[var55] = (short)var2.method1174();
         }
      }

      var2.field1818 = var26;
      var55 = var2.readUnsignedByte();
      if (var55 != 0) {
         new class141();
         var2.method1174();
         var2.method1174();
         var2.method1174();
         var2.readInt();
      }

   }

   void method2541(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      class184 var4 = new class184(var1);
      class184 var5 = new class184(var1);
      class184 var6 = new class184(var1);
      class184 var7 = new class184(var1);
      class184 var8 = new class184(var1);
      var4.field1818 = var1.length - 18;
      int var9 = var4.method1174();
      int var10 = var4.method1174();
      int var11 = var4.readUnsignedByte();
      int var12 = var4.readUnsignedByte();
      int var13 = var4.readUnsignedByte();
      int var14 = var4.readUnsignedByte();
      int var15 = var4.readUnsignedByte();
      int var16 = var4.readUnsignedByte();
      int var17 = var4.method1174();
      int var18 = var4.method1174();
      int var19 = var4.method1174();
      int var20 = var4.method1174();
      int var21 = 0;
      byte var22 = (byte)var21;
      var21 += var9;
      int var23 = var21;
      var21 += var10;
      int var24 = var21;
      if (var13 == 255) {
         var21 += var10;
      }

      int var25 = var21;
      if (var15 == 1) {
         var21 += var10;
      }

      int var26 = var21;
      if (var12 == 1) {
         var21 += var10;
      }

      int var27 = var21;
      if (var16 == 1) {
         var21 += var9;
      }

      int var28 = var21;
      if (var14 == 1) {
         var21 += var10;
      }

      int var29 = var21;
      var21 += var20;
      int var30 = var21;
      var21 += var10 * 2;
      int var31 = var21;
      var21 += var11 * 6;
      int var32 = var21;
      var21 += var17;
      int var33 = var21;
      var21 += var18;
      int var10000 = var21 + var19;
      this.field4178 = var9;
      this.field4210 = var10;
      this.field4192 = var11;
      this.field4179 = new int[var9];
      this.field4180 = new int[var9];
      this.field4181 = new int[var9];
      this.field4182 = new int[var10];
      this.field4183 = new int[var10];
      this.field4184 = new int[var10];
      if (var11 > 0) {
         this.field4205 = new byte[var11];
         this.field4193 = new short[var11];
         this.field4195 = new short[var11];
         this.field4213 = new short[var11];
      }

      if (var16 == 1) {
         this.field4203 = new int[var9];
      }

      if (var12 == 1) {
         this.field4208 = new byte[var10];
         this.field4176 = new byte[var10];
         this.field4190 = new short[var10];
      }

      if (var13 == 255) {
         this.field4186 = new byte[var10];
      } else {
         this.field4191 = (byte)var13;
      }

      if (var14 == 1) {
         this.field4187 = new byte[var10];
      }

      if (var15 == 1) {
         this.field4216 = new int[var10];
      }

      this.field4189 = new short[var10];
      var4.field1818 = var22;
      var5.field1818 = var32;
      var6.field1818 = var33;
      var7.field1818 = var21;
      var8.field1818 = var27;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.readUnsignedByte();
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.method1136();
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.method1136();
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.method1136();
         }

         this.field4179[var38] = var35 + var40;
         this.field4180[var38] = var36 + var41;
         this.field4181[var38] = var37 + var42;
         var35 = this.field4179[var38];
         var36 = this.field4180[var38];
         var37 = this.field4181[var38];
         if (var16 == 1) {
            this.field4203[var38] = var8.readUnsignedByte();
         }
      }

      var4.field1818 = var30;
      var5.field1818 = var26;
      var6.field1818 = var24;
      var7.field1818 = var28;
      var8.field1818 = var25;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field4189[var38] = (short)var4.method1174();
         if (var12 == 1) {
            var39 = var5.readUnsignedByte();
            if ((var39 & 1) == 1) {
               this.field4208[var38] = 1;
               var2 = true;
            } else {
               this.field4208[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.field4176[var38] = (byte)(var39 >> 2);
               this.field4190[var38] = this.field4189[var38];
               this.field4189[var38] = 127;
               if (this.field4190[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field4176[var38] = -1;
               this.field4190[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.field4186[var38] = var6.method1126();
         }

         if (var14 == 1) {
            this.field4187[var38] = var7.method1126();
         }

         if (var15 == 1) {
            this.field4216[var38] = var8.readUnsignedByte();
         }
      }

      var4.field1818 = var29;
      var5.field1818 = var23;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.readUnsignedByte();
         if (var43 == 1) {
            var38 = var4.method1136() + var41;
            var39 = var4.method1136() + var38;
            var40 = var4.method1136() + var39;
            var41 = var40;
            this.field4182[var42] = var38;
            this.field4183[var42] = var39;
            this.field4184[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.method1136() + var41;
            var41 = var40;
            this.field4182[var42] = var38;
            this.field4183[var42] = var39;
            this.field4184[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.method1136() + var41;
            var41 = var40;
            this.field4182[var42] = var38;
            this.field4183[var42] = var39;
            this.field4184[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.method1136() + var41;
            var41 = var40;
            this.field4182[var42] = var38;
            this.field4183[var42] = var44;
            this.field4184[var42] = var40;
         }
      }

      var4.field1818 = var31;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field4205[var42] = 0;
         this.field4193[var42] = (short)var4.method1174();
         this.field4195[var42] = (short)var4.method1174();
         this.field4213[var42] = (short)var4.method1174();
      }

      if (this.field4176 != null) {
         boolean var45 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field4176[var43] & 255;
            if (var44 != 255) {
               if ((this.field4193[var44] & '\uffff') == this.field4182[var43] && (this.field4195[var44] & '\uffff') == this.field4183[var43] && (this.field4213[var44] & '\uffff') == this.field4184[var43]) {
                  this.field4176[var43] = -1;
               } else {
                  var45 = true;
               }
            }
         }

         if (!var45) {
            this.field4176 = null;
         }
      }

      if (!var3) {
         this.field4190 = null;
      }

      if (!var2) {
         this.field4208 = null;
      }

   }

   final int method2518(class533 var1, int var2) {
      int var3 = -1;
      int var4 = var1.field4179[var2];
      int var5 = var1.field4180[var2];
      int var6 = var1.field4181[var2];

      for(int var7 = 0; var7 < this.field4178; ++var7) {
         if (var4 == this.field4179[var7] && var5 == this.field4180[var7] && var6 == this.field4181[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.field4179[this.field4178] = var4;
         this.field4180[this.field4178] = var5;
         this.field4181[this.field4178] = var6;
         if (var1.field4203 != null) {
            this.field4203[this.field4178] = var1.field4203[var2];
         }

         if (var1.field4197 != null) {
            this.field4197[this.field4178] = var1.field4197[var2];
            this.field4201[this.field4178] = var1.field4201[var2];
         }

         var3 = this.field4178++;
      }

      return var3;
   }

   public class533 method2519() {
      class533 var1 = new class533();
      if (this.field4208 != null) {
         var1.field4208 = new byte[this.field4210];

         for(int var2 = 0; var2 < this.field4210; ++var2) {
            var1.field4208[var2] = this.field4208[var2];
         }
      }

      var1.field4178 = this.field4178;
      var1.field4210 = this.field4210;
      var1.field4192 = this.field4192;
      var1.field4179 = this.field4179;
      var1.field4180 = this.field4180;
      var1.field4181 = this.field4181;
      var1.field4182 = this.field4182;
      var1.field4183 = this.field4183;
      var1.field4184 = this.field4184;
      var1.field4186 = this.field4186;
      var1.field4187 = this.field4187;
      var1.field4176 = this.field4176;
      var1.field4189 = this.field4189;
      var1.field4190 = this.field4190;
      var1.field4191 = this.field4191;
      var1.field4205 = this.field4205;
      var1.field4193 = this.field4193;
      var1.field4195 = this.field4195;
      var1.field4213 = this.field4213;
      var1.field4203 = this.field4203;
      var1.field4216 = this.field4216;
      var1.field4198 = this.field4198;
      var1.field4199 = this.field4199;
      var1.field4188 = this.field4188;
      var1.field4202 = this.field4202;
      var1.field4217 = this.field4217;
      var1.field4206 = this.field4206;
      return var1;
   }

   public class533 method2520(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method2532();
      int var7 = var2 + this.field4209;
      int var8 = var2 + this.field4185;
      int var9 = var4 + this.field4212;
      int var10 = var4 + this.field4211;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            class533 var11;
            if (var5) {
               var11 = new class533();
               var11.field4178 = this.field4178;
               var11.field4210 = this.field4210;
               var11.field4192 = this.field4192;
               var11.field4179 = this.field4179;
               var11.field4181 = this.field4181;
               var11.field4182 = this.field4182;
               var11.field4183 = this.field4183;
               var11.field4184 = this.field4184;
               var11.field4208 = this.field4208;
               var11.field4186 = this.field4186;
               var11.field4187 = this.field4187;
               var11.field4176 = this.field4176;
               var11.field4189 = this.field4189;
               var11.field4190 = this.field4190;
               var11.field4191 = this.field4191;
               var11.field4205 = this.field4205;
               var11.field4193 = this.field4193;
               var11.field4195 = this.field4195;
               var11.field4213 = this.field4213;
               var11.field4203 = this.field4203;
               var11.field4216 = this.field4216;
               var11.field4198 = this.field4198;
               var11.field4199 = this.field4199;
               var11.field4217 = this.field4217;
               var11.field4206 = this.field4206;
               var11.field4180 = new int[var11.field4178];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.field4178; ++var12) {
                  var13 = this.field4179[var12] + var2;
                  var14 = this.field4181[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field4180[var12] = this.field4180[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field4178; ++var12) {
                  var13 = (-this.field4180[var12] << 16) / super.field3926;
                  if (var13 < var6) {
                     var14 = this.field4179[var12] + var2;
                     var15 = this.field4181[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field4180[var12] = this.field4180[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method2531();
            return var11;
         }
      } else {
         return this;
      }
   }

   void method2521() {
      int[] var1;
      int var2;
      int var10002;
      int var3;
      int var4;
      if (this.field4203 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field4178; ++var3) {
            var4 = this.field4203[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field4198 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field4198[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field4178; this.field4198[var4][var1[var4]++] = var3++) {
            var4 = this.field4203[var3];
         }

         this.field4203 = null;
      }

      if (this.field4216 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field4210; ++var3) {
            var4 = this.field4216[var3];
            var10002 = var1[var4]++;
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field4199 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field4199[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field4210; this.field4199[var4][var1[var4]++] = var3++) {
            var4 = this.field4216[var3];
         }

         this.field4216 = null;
      }

   }

   public void method2522() {
      for(int var1 = 0; var1 < this.field4178; ++var1) {
         int var2 = this.field4179[var1];
         this.field4179[var1] = this.field4181[var1];
         this.field4181[var1] = -var2;
      }

      this.method2531();
   }

   public void method2523() {
      for(int var1 = 0; var1 < this.field4178; ++var1) {
         this.field4179[var1] = -this.field4179[var1];
         this.field4181[var1] = -this.field4181[var1];
      }

      this.method2531();
   }

   public void method2524() {
      for(int var1 = 0; var1 < this.field4178; ++var1) {
         int var2 = this.field4181[var1];
         this.field4181[var1] = this.field4179[var1];
         this.field4179[var1] = -var2;
      }

      this.method2531();
   }

   public void method2525(int var1) {
      int var2 = field4177[var1];
      int var3 = field4200[var1];

      for(int var4 = 0; var4 < this.field4178; ++var4) {
         int var5 = this.field4181[var4] * var2 + this.field4179[var4] * var3 >> 16;
         this.field4181[var4] = this.field4181[var4] * var3 - this.field4179[var4] * var2 >> 16;
         this.field4179[var4] = var5;
      }

      this.method2531();
   }

   public void method2526(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field4178; ++var4) {
         int[] var10000 = this.field4179;
         var10000[var4] += var1;
         var10000 = this.field4180;
         var10000[var4] += var2;
         var10000 = this.field4181;
         var10000[var4] += var3;
      }

      this.method2531();
   }

   public void method2537(short var1, short var2) {
      for(int var3 = 0; var3 < this.field4210; ++var3) {
         if (this.field4189[var3] == var1) {
            this.field4189[var3] = var2;
         }
      }

   }

   public void method2528(short var1, short var2) {
      if (this.field4190 != null) {
         for(int var3 = 0; var3 < this.field4210; ++var3) {
            if (this.field4190[var3] == var1) {
               this.field4190[var3] = var2;
            }
         }

      }
   }

   public void method2527() {
      int var1;
      for(var1 = 0; var1 < this.field4178; ++var1) {
         this.field4181[var1] = -this.field4181[var1];
      }

      for(var1 = 0; var1 < this.field4210; ++var1) {
         int var2 = this.field4182[var1];
         this.field4182[var1] = this.field4184[var1];
         this.field4184[var1] = var2;
      }

      this.method2531();
   }

   public void method2529(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field4178; ++var4) {
         this.field4179[var4] = this.field4179[var4] * var1 / 128;
         this.field4180[var4] = this.field4180[var4] * var2 / 128;
         this.field4181[var4] = this.field4181[var4] * var3 / 128;
      }

      this.method2531();
   }

   public void method2530() {
      if (this.field4188 == null) {
         this.field4188 = new class458[this.field4178];

         int var1;
         for(var1 = 0; var1 < this.field4178; ++var1) {
            this.field4188[var1] = new class458();
         }

         for(var1 = 0; var1 < this.field4210; ++var1) {
            int var2 = this.field4182[var1];
            int var3 = this.field4183[var1];
            int var4 = this.field4184[var1];
            int var5 = this.field4179[var3] - this.field4179[var2];
            int var6 = this.field4180[var3] - this.field4180[var2];
            int var7 = this.field4181[var3] - this.field4181[var2];
            int var8 = this.field4179[var4] - this.field4179[var2];
            int var9 = this.field4180[var4] - this.field4180[var2];
            int var10 = this.field4181[var4] - this.field4181[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.field4208 == null) {
               var15 = 0;
            } else {
               var15 = this.field4208[var1];
            }

            if (var15 == 0) {
               class458 var16 = this.field4188[var2];
               var16.field3565 += var11;
               var16.field3564 += var12;
               var16.field3566 += var13;
               ++var16.field3567;
               var16 = this.field4188[var3];
               var16.field3565 += var11;
               var16.field3564 += var12;
               var16.field3566 += var13;
               ++var16.field3567;
               var16 = this.field4188[var4];
               var16.field3565 += var11;
               var16.field3564 += var12;
               var16.field3566 += var13;
               ++var16.field3567;
            } else if (var15 == 1) {
               if (this.field4202 == null) {
                  this.field4202 = new class487[this.field4210];
               }

               class487 var17 = this.field4202[var1] = new class487();
               var17.field3850 = var11;
               var17.field3849 = var12;
               var17.field3851 = var13;
            }
         }

      }
   }

   void method2531() {
      this.field4188 = null;
      this.field4204 = null;
      this.field4202 = null;
      this.field4207 = false;
   }

   void method2532() {
      if (!this.field4207) {
         super.field3926 = 0;
         this.field4215 = 0;
         this.field4209 = 999999;
         this.field4185 = -999999;
         this.field4211 = -99999;
         this.field4212 = 99999;

         for(int var1 = 0; var1 < this.field4178; ++var1) {
            int var2 = this.field4179[var1];
            int var3 = this.field4180[var1];
            int var4 = this.field4181[var1];
            if (var2 < this.field4209) {
               this.field4209 = var2;
            }

            if (var2 > this.field4185) {
               this.field4185 = var2;
            }

            if (var4 < this.field4212) {
               this.field4212 = var4;
            }

            if (var4 > this.field4211) {
               this.field4211 = var4;
            }

            if (-var3 > super.field3926) {
               super.field3926 = -var3;
            }

            if (var3 > this.field4215) {
               this.field4215 = var3;
            }
         }

         this.field4207 = true;
      }
   }

   public final class104 method2534(int var1, int var2, int var3, int var4, int var5) {
      this.method2530();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      class104 var8 = new class104();
      var8.field1356 = new int[this.field4210];
      var8.field1357 = new int[this.field4210];
      var8.field1358 = new int[this.field4210];
      if (this.field4192 > 0 && this.field4176 != null) {
         int[] var9 = new int[this.field4192];

         int var10;
         for(var10 = 0; var10 < this.field4210; ++var10) {
            if (this.field4176[var10] != -1) {
               ++var9[this.field4176[var10] & 255];
            }
         }

         var8.field1364 = 0;

         for(var10 = 0; var10 < this.field4192; ++var10) {
            if (var9[var10] > 0 && this.field4205[var10] == 0) {
               ++var8.field1364;
            }
         }

         var8.field1365 = new int[var8.field1364];
         var8.field1366 = new int[var8.field1364];
         var8.field1359 = new int[var8.field1364];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field4192; ++var11) {
            if (var9[var11] > 0 && this.field4205[var11] == 0) {
               var8.field1365[var10] = this.field4193[var11] & '\uffff';
               var8.field1366[var10] = this.field4195[var11] & '\uffff';
               var8.field1359[var10] = this.field4213[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field1361 = new byte[this.field4210];

         for(var11 = 0; var11 < this.field4210; ++var11) {
            if (this.field4176[var11] != -1) {
               var8.field1361[var11] = (byte)var9[this.field4176[var11] & 255];
            } else {
               var8.field1361[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.field4210; ++var16) {
         byte var17;
         if (this.field4208 == null) {
            var17 = 0;
         } else {
            var17 = this.field4208[var16];
         }

         byte var18;
         if (this.field4187 == null) {
            var18 = 0;
         } else {
            var18 = this.field4187[var16];
         }

         short var12;
         if (this.field4190 == null) {
            var12 = -1;
         } else {
            var12 = this.field4190[var16];
         }

         if (var18 == -2) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         class458 var13;
         int var14;
         class487 var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.field4202[var16];
                  var14 = var1 + (var3 * var19.field3850 + var4 * var19.field3849 + var5 * var19.field3851) / (var7 + var7 / 2);
                  var8.field1356[var16] = method2539(this.field4189[var16] & '\uffff', var14);
                  var8.field1358[var16] = -1;
               } else if (var17 == 3) {
                  var8.field1356[var16] = 128;
                  var8.field1358[var16] = -1;
               } else {
                  var8.field1358[var16] = -2;
               }
            } else {
               int var15 = this.field4189[var16] & '\uffff';
               if (this.field4204 != null && this.field4204[this.field4182[var16]] != null) {
                  var13 = this.field4204[this.field4182[var16]];
               } else {
                  var13 = this.field4188[this.field4182[var16]];
               }

               var14 = var1 + (var3 * var13.field3565 + var4 * var13.field3564 + var5 * var13.field3566) / (var7 * var13.field3567);
               var8.field1356[var16] = method2539(var15, var14);
               if (this.field4204 != null && this.field4204[this.field4183[var16]] != null) {
                  var13 = this.field4204[this.field4183[var16]];
               } else {
                  var13 = this.field4188[this.field4183[var16]];
               }

               var14 = var1 + (var3 * var13.field3565 + var4 * var13.field3564 + var5 * var13.field3566) / (var7 * var13.field3567);
               var8.field1357[var16] = method2539(var15, var14);
               if (this.field4204 != null && this.field4204[this.field4184[var16]] != null) {
                  var13 = this.field4204[this.field4184[var16]];
               } else {
                  var13 = this.field4188[this.field4184[var16]];
               }

               var14 = var1 + (var3 * var13.field3565 + var4 * var13.field3564 + var5 * var13.field3566) / (var7 * var13.field3567);
               var8.field1358[var16] = method2539(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.field4202[var16];
               var14 = var1 + (var3 * var19.field3850 + var4 * var19.field3849 + var5 * var19.field3851) / (var7 + var7 / 2);
               var8.field1356[var16] = method2535(var14);
               var8.field1358[var16] = -1;
            } else {
               var8.field1358[var16] = -2;
            }
         } else {
            if (this.field4204 != null && this.field4204[this.field4182[var16]] != null) {
               var13 = this.field4204[this.field4182[var16]];
            } else {
               var13 = this.field4188[this.field4182[var16]];
            }

            var14 = var1 + (var3 * var13.field3565 + var4 * var13.field3564 + var5 * var13.field3566) / (var7 * var13.field3567);
            var8.field1356[var16] = method2535(var14);
            if (this.field4204 != null && this.field4204[this.field4183[var16]] != null) {
               var13 = this.field4204[this.field4183[var16]];
            } else {
               var13 = this.field4188[this.field4183[var16]];
            }

            var14 = var1 + (var3 * var13.field3565 + var4 * var13.field3564 + var5 * var13.field3566) / (var7 * var13.field3567);
            var8.field1357[var16] = method2535(var14);
            if (this.field4204 != null && this.field4204[this.field4184[var16]] != null) {
               var13 = this.field4204[this.field4184[var16]];
            } else {
               var13 = this.field4188[this.field4184[var16]];
            }

            var14 = var1 + (var3 * var13.field3565 + var4 * var13.field3564 + var5 * var13.field3566) / (var7 * var13.field3567);
            var8.field1358[var16] = method2535(var14);
         }
      }

      this.method2521();
      var8.field1404 = this.field4178;
      var8.field1350 = this.field4179;
      var8.field1351 = this.field4180;
      var8.field1355 = this.field4181;
      var8.field1352 = this.field4210;
      var8.field1367 = this.field4182;
      var8.field1354 = this.field4183;
      var8.field1412 = this.field4184;
      var8.field1411 = this.field4186;
      var8.field1360 = this.field4187;
      var8.field1363 = this.field4191;
      var8.field1368 = this.field4198;
      var8.field1369 = this.field4199;
      var8.field1362 = this.field4190;
      var8.field1370 = this.field4197;
      var8.field1394 = this.field4201;
      return var8;
   }

   public static class533 method2538(class298 var0, int var1, int var2) {
      byte[] var3 = var0.method1629(var1, var2);
      return var3 == null ? null : new class533(var3);
   }

   static void method2533(class533 var0, class533 var1, int var2, int var3, int var4, boolean var5) {
      var0.method2532();
      var0.method2530();
      var1.method2532();
      var1.method2530();
      ++field4194;
      int var6 = 0;
      int[] var7 = var1.field4179;
      int var8 = var1.field4178;

      int var9;
      for(var9 = 0; var9 < var0.field4178; ++var9) {
         class458 var10 = var0.field4188[var9];
         if (var10.field3567 != 0) {
            int var11 = var0.field4180[var9] - var3;
            if (var11 <= var1.field4215) {
               int var12 = var0.field4179[var9] - var2;
               if (var12 >= var1.field4209 && var12 <= var1.field4185) {
                  int var13 = var0.field4181[var9] - var4;
                  if (var13 >= var1.field4212 && var13 <= var1.field4211) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        class458 var15 = var1.field4188[var14];
                        if (var12 == var7[var14] && var13 == var1.field4181[var14] && var11 == var1.field4180[var14] && var15.field3567 != 0) {
                           if (var0.field4204 == null) {
                              var0.field4204 = new class458[var0.field4178];
                           }

                           if (var1.field4204 == null) {
                              var1.field4204 = new class458[var8];
                           }

                           class458 var16 = var0.field4204[var9];
                           if (var16 == null) {
                              var16 = var0.field4204[var9] = new class458(var10);
                           }

                           class458 var17 = var1.field4204[var14];
                           if (var17 == null) {
                              var17 = var1.field4204[var14] = new class458(var15);
                           }

                           var16.field3565 += var15.field3565;
                           var16.field3564 += var15.field3564;
                           var16.field3566 += var15.field3566;
                           var16.field3567 += var15.field3567;
                           var17.field3565 += var10.field3565;
                           var17.field3564 += var10.field3564;
                           var17.field3566 += var10.field3566;
                           var17.field3567 += var10.field3567;
                           ++var6;
                           field4196[var9] = field4194;
                           field4214[var14] = field4194;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field4210; ++var9) {
            if (field4196[var0.field4182[var9]] == field4194 && field4196[var0.field4183[var9]] == field4194 && field4196[var0.field4184[var9]] == field4194) {
               if (var0.field4208 == null) {
                  var0.field4208 = new byte[var0.field4210];
               }

               var0.field4208[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field4210; ++var9) {
            if (field4214[var1.field4182[var9]] == field4194 && field4214[var1.field4183[var9]] == field4194 && field4214[var1.field4184[var9]] == field4194) {
               if (var1.field4208 == null) {
                  var1.field4208 = new byte[var1.field4210];
               }

               var1.field4208[var9] = 2;
            }
         }

      }
   }

   static final int method2539(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   static final int method2535(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }
}
