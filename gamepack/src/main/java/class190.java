public class class190 {
   static byte[] field1873 = new byte[2048];
   static class15 field1876;
   static class184 field1863 = new class184(new byte[5000]);
   static class184[] field1874 = new class184[2048];
   static class423[] field1864 = new class423[2048];
   static int field1862;
   static int field1866 = 0;
   static int field1868 = 0;
   static int field1872 = 0;
   static int[] field1865 = new int[2048];
   static int[] field1867 = new int[2048];
   static int[] field1869 = new int[2048];
   static int[] field1870 = new int[2048];
   static int[] field1871 = new int[2048];
   static int[] field1875 = new int[2048];

   class190() throws Throwable {
   }

   static final void method1198(class164 var0) {
      var0.method1006();
      int var2 = Client.field704;
      class522 var3 = class259.field2281 = Client.field749[var2] = new class522();
      var3.field4095 = var2;
      int var4 = var0.method1004(30);
      byte var5 = (byte)(var4 >> 28);
      int var6 = var4 >> 14 & 16383;
      int var7 = var4 & 16383;
      var3.field4073[0] = var6 - class69.field1134;
      var3.field4028 = (var3.field4073[0] << 7) + (var3.method2482() << 6);
      var3.field4070[0] = var7 - class478.field3659;
      var3.field3999 = (var3.field4070[0] << 7) + (var3.method2482() << 6);
      class192.field1881 = var3.field4116 = var5;
      if (field1874[var2] != null) {
         var3.method2476(field1874[var2]);
      }

      field1866 = 0;
      field1867[++field1866 - 1] = var2;
      field1873[var2] = 0;
      field1868 = 0;

      for(int var8 = 1; var8 < 2048; ++var8) {
         if (var8 != var2) {
            int var9 = var0.method1004(18);
            int var10 = var9 >> 16;
            int var11 = var9 >> 8 & 597;
            int var12 = var9 & 597;
            field1869[var8] = var12 + (var10 << 28) + (var11 << 14);
            field1870[var8] = 0;
            field1871[var8] = -1;
            field1875[++field1868 - 1] = var8;
            field1873[var8] = 0;
         }
      }

      var0.method1007();
   }

   static final void method1199(class164 var0, int var1) {
      int var3 = var0.field1818;
      field1872 = 0;
      int var4 = 0;
      var0.method1006();

      byte[] var10000;
      int var5;
      int var6;
      int var7;
      for(var5 = 0; var5 < field1866; ++var5) {
         var6 = field1867[var5];
         if ((field1873[var6] & 1) == 0) {
            if (var4 > 0) {
               --var4;
               var10000 = field1873;
               var10000[var6] = (byte)(var10000[var6] | 2);
            } else {
               var7 = var0.method1004(1);
               if (var7 == 0) {
                  var4 = class329.method1730(var0);
                  var10000 = field1873;
                  var10000[var6] = (byte)(var10000[var6] | 2);
               } else {
                  method1201(var0, var6);
               }
            }
         }
      }

      var0.method1007();
      if (var4 != 0) {
         throw new RuntimeException();
      } else {
         var0.method1006();

         for(var5 = 0; var5 < field1866; ++var5) {
            var6 = field1867[var5];
            if ((field1873[var6] & 1) != 0) {
               if (var4 > 0) {
                  --var4;
                  var10000 = field1873;
                  var10000[var6] = (byte)(var10000[var6] | 2);
               } else {
                  var7 = var0.method1004(1);
                  if (var7 == 0) {
                     var4 = class329.method1730(var0);
                     var10000 = field1873;
                     var10000[var6] = (byte)(var10000[var6] | 2);
                  } else {
                     method1201(var0, var6);
                  }
               }
            }
         }

         var0.method1007();
         if (var4 != 0) {
            throw new RuntimeException();
         } else {
            var0.method1006();

            for(var5 = 0; var5 < field1868; ++var5) {
               var6 = field1875[var5];
               if ((field1873[var6] & 1) != 0) {
                  if (var4 > 0) {
                     --var4;
                     var10000 = field1873;
                     var10000[var6] = (byte)(var10000[var6] | 2);
                  } else {
                     var7 = var0.method1004(1);
                     if (var7 == 0) {
                        var4 = class329.method1730(var0);
                        var10000 = field1873;
                        var10000[var6] = (byte)(var10000[var6] | 2);
                     } else if (method1200(var0, var6)) {
                        var10000 = field1873;
                        var10000[var6] = (byte)(var10000[var6] | 2);
                     }
                  }
               }
            }

            var0.method1007();
            if (var4 != 0) {
               throw new RuntimeException();
            } else {
               var0.method1006();

               for(var5 = 0; var5 < field1868; ++var5) {
                  var6 = field1875[var5];
                  if ((field1873[var6] & 1) == 0) {
                     if (var4 > 0) {
                        --var4;
                        var10000 = field1873;
                        var10000[var6] = (byte)(var10000[var6] | 2);
                     } else {
                        var7 = var0.method1004(1);
                        if (var7 == 0) {
                           var4 = class329.method1730(var0);
                           var10000 = field1873;
                           var10000[var6] = (byte)(var10000[var6] | 2);
                        } else if (method1200(var0, var6)) {
                           var10000 = field1873;
                           var10000[var6] = (byte)(var10000[var6] | 2);
                        }
                     }
                  }
               }

               var0.method1007();
               if (var4 != 0) {
                  throw new RuntimeException();
               } else {
                  field1866 = 0;
                  field1868 = 0;

                  for(var5 = 1; var5 < 2048; ++var5) {
                     var10000 = field1873;
                     var10000[var5] = (byte)(var10000[var5] >> 1);
                     class522 var8 = Client.field749[var5];
                     if (var8 != null) {
                        field1867[++field1866 - 1] = var5;
                     } else {
                        field1875[++field1868 - 1] = var5;
                     }
                  }

                  method1197(var0);
                  if (var1 != var0.field1818 - var3) {
                     throw new RuntimeException(var0.field1818 - var3 + " " + var1);
                  }
               }
            }
         }
      }
   }

   static void method1201(class164 var0, int var1) {
      boolean var3 = var0.method1004(1) == 1;
      if (var3) {
         field1865[++field1872 - 1] = var1;
      }

      int var4 = var0.method1004(2);
      class522 var5 = Client.field749[var1];
      if (var4 == 0) {
         if (var3) {
            var5.field4121 = false;
         } else if (Client.field704 == var1) {
            throw new RuntimeException();
         } else {
            field1869[var1] = (class69.field1134 + var5.field4073[0] >> 13 << 14) + (var5.field4116 << 28) + (class478.field3659 + var5.field4070[0] >> 13);
            if (var5.field4035 != -1) {
               field1870[var1] = var5.field4035;
            } else {
               field1870[var1] = var5.field4039;
            }

            field1871[var1] = var5.field4033;
            Client.field749[var1] = null;
            if (var0.method1004(1) != 0) {
               method1200(var0, var1);
            }

         }
      } else {
         int var6;
         int var7;
         int var8;
         if (var4 == 1) {
            var6 = var0.method1004(3);
            var7 = var5.field4073[0];
            var8 = var5.field4070[0];
            if (var6 == 0) {
               --var7;
               --var8;
            } else if (var6 == 1) {
               --var8;
            } else if (var6 == 2) {
               ++var7;
               --var8;
            } else if (var6 == 3) {
               --var7;
            } else if (var6 == 4) {
               ++var7;
            } else if (var6 == 5) {
               --var7;
               ++var8;
            } else if (var6 == 6) {
               ++var8;
            } else if (var6 == 7) {
               ++var7;
               ++var8;
            }

            if (var1 != Client.field704 || var5.field4028 >= 1536 && var5.field3999 >= 1536 && var5.field4028 < 11776 && var5.field3999 < 11776) {
               if (var3) {
                  var5.field4121 = true;
                  var5.field4117 = var7;
                  var5.field4123 = var8;
               } else {
                  var5.field4121 = false;
                  var5.method2488(var7, var8, field1864[var1]);
               }
            } else {
               var5.method2485(var7, var8);
               var5.field4121 = false;
            }

         } else if (var4 == 2) {
            var6 = var0.method1004(4);
            var7 = var5.field4073[0];
            var8 = var5.field4070[0];
            if (var6 == 0) {
               var7 -= 2;
               var8 -= 2;
            } else if (var6 == 1) {
               --var7;
               var8 -= 2;
            } else if (var6 == 2) {
               var8 -= 2;
            } else if (var6 == 3) {
               ++var7;
               var8 -= 2;
            } else if (var6 == 4) {
               var7 += 2;
               var8 -= 2;
            } else if (var6 == 5) {
               var7 -= 2;
               --var8;
            } else if (var6 == 6) {
               var7 += 2;
               --var8;
            } else if (var6 == 7) {
               var7 -= 2;
            } else if (var6 == 8) {
               var7 += 2;
            } else if (var6 == 9) {
               var7 -= 2;
               ++var8;
            } else if (var6 == 10) {
               var7 += 2;
               ++var8;
            } else if (var6 == 11) {
               var7 -= 2;
               var8 += 2;
            } else if (var6 == 12) {
               --var7;
               var8 += 2;
            } else if (var6 == 13) {
               var8 += 2;
            } else if (var6 == 14) {
               ++var7;
               var8 += 2;
            } else if (var6 == 15) {
               var7 += 2;
               var8 += 2;
            }

            if (Client.field704 != var1 || var5.field4028 >= 1536 && var5.field3999 >= 1536 && var5.field4028 < 11776 && var5.field3999 < 11776) {
               if (var3) {
                  var5.field4121 = true;
                  var5.field4117 = var7;
                  var5.field4123 = var8;
               } else {
                  var5.field4121 = false;
                  var5.method2488(var7, var8, field1864[var1]);
               }
            } else {
               var5.method2485(var7, var8);
               var5.field4121 = false;
            }

         } else {
            var6 = var0.method1004(1);
            int var9;
            int var10;
            int var11;
            int var12;
            if (var6 == 0) {
               var7 = var0.method1004(12);
               var8 = var7 >> 10;
               var9 = var7 >> 5 & 31;
               if (var9 > 15) {
                  var9 -= 32;
               }

               var10 = var7 & 31;
               if (var10 > 15) {
                  var10 -= 32;
               }

               var11 = var5.field4073[0] + var9;
               var12 = var5.field4070[0] + var10;
               if (var1 != Client.field704 || var5.field4028 >= 1536 && var5.field3999 >= 1536 && var5.field4028 < 11776 && var5.field3999 < 11776) {
                  if (var3) {
                     var5.field4121 = true;
                     var5.field4117 = var11;
                     var5.field4123 = var12;
                  } else {
                     var5.field4121 = false;
                     var5.method2488(var11, var12, field1864[var1]);
                  }
               } else {
                  var5.method2485(var11, var12);
                  var5.field4121 = false;
               }

               var5.field4116 = (byte)(var8 + var5.field4116 & 3);
               if (Client.field704 == var1) {
                  class192.field1881 = var5.field4116;
               }

            } else {
               var7 = var0.method1004(30);
               var8 = var7 >> 28;
               var9 = var7 >> 14 & 16383;
               var10 = var7 & 16383;
               var11 = (var9 + class69.field1134 + var5.field4073[0] & 16383) - class69.field1134;
               var12 = (var10 + var5.field4070[0] + class478.field3659 & 16383) - class478.field3659;
               if (Client.field704 != var1 || var5.field4028 >= 1536 && var5.field3999 >= 1536 && var5.field4028 < 11776 && var5.field3999 < 11776) {
                  if (var3) {
                     var5.field4121 = true;
                     var5.field4117 = var11;
                     var5.field4123 = var12;
                  } else {
                     var5.field4121 = false;
                     var5.method2488(var11, var12, field1864[var1]);
                  }
               } else {
                  var5.method2485(var11, var12);
                  var5.field4121 = false;
               }

               var5.field4116 = (byte)(var5.field4116 + var8 & 3);
               if (Client.field704 == var1) {
                  class192.field1881 = var5.field4116;
               }

            }
         }
      }
   }

   static boolean method1200(class164 var0, int var1) {
      int var3 = var0.method1004(2);
      int var4;
      int var5;
      int var8;
      int var9;
      int var10;
      int var11;
      if (var3 == 0) {
         if (var0.method1004(1) != 0) {
            method1200(var0, var1);
         }

         var4 = var0.method1004(13);
         var5 = var0.method1004(13);
         boolean var12 = var0.method1004(1) == 1;
         if (var12) {
            field1865[++field1872 - 1] = var1;
         }

         if (Client.field749[var1] != null) {
            throw new RuntimeException();
         } else {
            class522 var13 = Client.field749[var1] = new class522();
            var13.field4095 = var1;
            if (null != field1874[var1]) {
               var13.method2476(field1874[var1]);
            }

            var13.field4039 = field1870[var1];
            var13.field4033 = field1871[var1];
            var8 = field1869[var1];
            var9 = var8 >> 28;
            var10 = var8 >> 14 & 255;
            var11 = var8 & 255;
            var13.field4071[0] = field1864[var1];
            var13.field4116 = (byte)var9;
            var13.method2485((var10 << 13) + var4 - class69.field1134, var5 + (var11 << 13) - class478.field3659);
            var13.field4121 = false;
            return true;
         }
      } else if (var3 == 1) {
         var4 = var0.method1004(2);
         var5 = field1869[var1];
         field1869[var1] = (((var5 >> 28) + var4 & 3) << 28) + (var5 & 268435455);
         return false;
      } else {
         int var6;
         int var7;
         if (var3 == 2) {
            var4 = var0.method1004(5);
            var5 = var4 >> 3;
            var6 = var4 & 7;
            var7 = field1869[var1];
            var8 = (var7 >> 28) + var5 & 3;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            if (var6 == 0) {
               --var9;
               --var10;
            }

            if (var6 == 1) {
               --var10;
            }

            if (var6 == 2) {
               ++var9;
               --var10;
            }

            if (var6 == 3) {
               --var9;
            }

            if (var6 == 4) {
               ++var9;
            }

            if (var6 == 5) {
               --var9;
               ++var10;
            }

            if (var6 == 6) {
               ++var10;
            }

            if (var6 == 7) {
               ++var9;
               ++var10;
            }

            field1869[var1] = (var8 << 28) + (var9 << 14) + var10;
            return false;
         } else {
            var4 = var0.method1004(18);
            var5 = var4 >> 16;
            var6 = var4 >> 8 & 255;
            var7 = var4 & 255;
            var8 = field1869[var1];
            var9 = var5 + (var8 >> 28) & 3;
            var10 = (var8 >> 14) + var6 & 255;
            var11 = var8 + var7 & 255;
            field1869[var1] = var11 + (var9 << 28) + (var10 << 14);
            return false;
         }
      }
   }

   static final void method1197(class164 var0) {
      for(int var2 = 0; var2 < field1872; ++var2) {
         int var3 = field1865[var2];
         class522 var4 = Client.field749[var3];
         int var5 = var0.method1125();
         if ((var5 & 1) != 0) {
            var5 += var0.method1125() << 8;
         }

         if ((var5 & '\u8000') != 0) {
            var5 += var0.method1125() << 16;
         }

         method1196(var0, var3, var4, var5);
      }

   }

   static final void method1196(class164 var0, int var1, class522 var2, int var3) {
      byte var5 = class423.field3205.field3208;
      int var6;
      if ((var3 & 8) != 0) {
         var6 = var0.method1125();
         byte[] var7 = new byte[var6];
         class184 var8 = new class184(var7);
         var0.method1179(var7, 0, var6);
         field1874[var1] = var8;
         var2.method2476(var8);
      }

      int var9;
      int var10;
      int var17;
      int var19;
      if ((var3 & 65536) != 0) {
         var6 = var0.method1125();

         for(var17 = 0; var17 < var6; ++var17) {
            var19 = var0.method1146();
            var9 = var0.method1154();
            var10 = var0.method1129();
            var2.method2468(var19, var9, var10 >> 16, var10 & '\uffff');
         }
      }

      if ((var3 & 64) != 0) {
         var2.field4035 = var0.method1154();
         if (var2.field4046 == 0) {
            var2.field4039 = var2.field4035;
            var2.method2474();
         }
      }

      if ((var3 & 16) != 0) {
         var2.field4033 = var0.method1154();
         var2.field4033 += var0.method1146() << 16;
         var6 = 16777215;
         if (var2.field4033 == var6) {
            var2.field4033 = -1;
         }
      }

      int var11;
      int var12;
      if ((var3 & 4096) != 0) {
         var6 = var0.method1154();
         var17 = var6 >> 8;
         var19 = var17 >= 13 && var17 <= 20 ? var17 - 12 : 0;
         class363 var22 = (class363)class341.method1788(class363.method1847(), var0.method1146());
         boolean var25 = var0.method1125() == 1;
         var11 = var0.method1185();
         var12 = var0.field1818;
         if (null != var2.field4112 && null != var2.field4096) {
            boolean var13 = false;
            if (var22.field2833 && class314.field2562.method1482(var2.field4112)) {
               var13 = true;
            }

            if (!var13 && Client.field701 == 0 && !var2.field4115) {
               field1863.field1818 = 0;
               var0.method1179(field1863.field1816, 0, var11);
               field1863.field1818 = 0;
               String var14 = class282.method1579(class330.method1733(class68.method654(field1863)));
               var2.field4069 = var14.trim();
               var2.field4023 = var6 >> 8;
               var2.field4024 = var6 & 255;
               var2.field4022 = 150;
               byte[] var15 = null;
               int var16;
               if (var19 > 0 && var19 <= 8) {
                  var15 = new byte[var19];

                  for(var16 = 0; var16 < var19; ++var16) {
                     var15[var16] = var0.method1149();
                  }
               }

               var2.field4065 = class499.method2443(var15);
               var2.field4020 = var25;
               var2.field4021 = class259.field2281 != var2 && var22.field2833 && !Client.field604.isEmpty() && var14.toLowerCase().indexOf(Client.field604) == -1;
               if (var22.field2849) {
                  var16 = var25 ? 91 : 1;
               } else {
                  var16 = var25 ? 90 : 2;
               }

               if (var22.field2848 != -1) {
                  class194.method1209(var16, class369.method1860(var22.field2848) + var2.field4112.method1458(), var14);
               } else {
                  class194.method1209(var16, var2.field4112.method1458(), var14);
               }
            }
         }

         var0.field1818 = var19 + var11 + var12;
      }

      int var29;
      if ((var3 & 32) != 0) {
         var6 = var0.method1153();
         class363 var20 = (class363)class341.method1788(class363.method1847(), var0.method1185());
         boolean var21 = var0.method1185() == 1;
         var9 = var0.method1125();
         var10 = var0.field1818;
         if (var2.field4112 != null && var2.field4096 != null) {
            boolean var26 = false;
            if (var20.field2833 && class314.field2562.method1482(var2.field4112)) {
               var26 = true;
            }

            if (!var26 && Client.field701 == 0 && !var2.field4115) {
               field1863.field1818 = 0;
               var0.method1179(field1863.field1816, 0, var9);
               field1863.field1818 = 0;
               String var28 = class282.method1579(class330.method1733(class68.method654(field1863)));
               var2.field4069 = var28.trim();
               var2.field4023 = var6 >> 8;
               var2.field4024 = var6 & 255;
               var2.field4022 = 150;
               var2.field4065 = null;
               var2.field4020 = var21;
               var2.field4021 = class259.field2281 != var2 && var20.field2833 && !Client.field604.isEmpty() && var28.toLowerCase().indexOf(Client.field604) == -1;
               if (var20.field2849) {
                  var29 = var21 ? 91 : 1;
               } else {
                  var29 = var21 ? 90 : 2;
               }

               if (var20.field2848 != -1) {
                  class194.method1209(var29, class369.method1860(var20.field2848) + var2.field4112.method1458(), var28);
               } else {
                  class194.method1209(var29, var2.field4112.method1458(), var28);
               }
            }
         }

         var0.field1818 = var9 + var10;
      }

      if ((var3 & 4) != 0) {
         var6 = var0.method1125();
         if (var6 > 0) {
            for(var17 = 0; var17 < var6; ++var17) {
               var9 = -1;
               var10 = -1;
               var11 = -1;
               var19 = var0.method1172();
               if (var19 == 32767) {
                  var19 = var0.method1172();
                  var10 = var0.method1172();
                  var9 = var0.method1172();
                  var11 = var0.method1172();
               } else if (var19 != 32766) {
                  var10 = var0.method1172();
               } else {
                  var19 = -1;
               }

               var12 = var0.method1172();
               var2.method2471(var19, var10, var9, var11, Client.field879, var12);
            }
         }

         var17 = var0.method1125();
         if (var17 > 0) {
            for(var19 = 0; var19 < var17; ++var19) {
               var9 = var0.method1172();
               var10 = var0.method1172();
               if (var10 != 32767) {
                  var11 = var0.method1172();
                  var12 = var0.method1146();
                  var29 = var10 > 0 ? var0.method1125() : var12;
                  var2.method2467(var9, Client.field879, var10, var11, var12, var29);
               } else {
                  var2.method2472(var9);
               }
            }
         }
      }

      if ((var3 & 512) != 0) {
         var2.field4050 = var0.method1149();
         var2.field4052 = var0.method1140();
         var2.field4048 = var0.method1126();
         var2.field4018 = var0.method1126();
         var2.field4054 = var0.method1153() + Client.field879;
         var2.field4055 = var0.method1153() + Client.field879;
         var2.field4056 = var0.method1154();
         if (var2.field4121) {
            var2.field4050 += var2.field4117;
            var2.field4052 += var2.field4123;
            var2.field4048 += var2.field4117;
            var2.field4018 += var2.field4123;
            var2.field4046 = 0;
         } else {
            var2.field4050 += var2.field4073[0];
            var2.field4052 += var2.field4070[0];
            var2.field4048 += var2.field4073[0];
            var2.field4018 += var2.field4070[0];
            var2.field4046 = 1;
         }

         var2.field4062 = 0;
      }

      if ((var3 & 2048) != 0) {
         class423[] var18 = field1864;
         class423[] var27 = new class423[]{class423.field3205, class423.field3206, class423.field3207, class423.field3210};
         var18[var1] = (class423)class341.method1788(var27, var0.method1126());
      }

      if ((var3 & 128) != 0) {
         var2.field4069 = var0.method1133();
         if (var2.field4069.charAt(0) == '~') {
            var2.field4069 = var2.field4069.substring(1);
            class194.method1209(2, var2.field4112.method1458(), var2.field4069);
         } else if (class259.field2281 == var2) {
            class194.method1209(2, var2.field4112.method1458(), var2.field4069);
         }

         var2.field4020 = false;
         var2.field4023 = 0;
         var2.field4024 = 0;
         var2.field4022 = 150;
      }

      if ((var3 & 16384) != 0) {
         var2.field4059 = Client.field879 + var0.method1152();
         var2.field4001 = Client.field879 + var0.method1152();
         var2.field4061 = var0.method1149();
         var2.field4019 = var0.method1148();
         var2.field4013 = var0.method1140();
         var2.field4051 = (byte)var0.method1185();
      }

      if ((var3 & 8192) != 0) {
         for(var6 = 0; var6 < 3; ++var6) {
            var2.field4099[var6] = var0.method1133();
         }
      }

      if ((var3 & 1024) != 0) {
         var5 = var0.method1126();
      }

      if ((var3 & 2) != 0) {
         var6 = var0.method1174();
         if (var6 == 65535) {
            var6 = -1;
         }

         var17 = var0.method1146();
         Client.method554(var2, var6, var17);
      }

      if (var2.field4121) {
         if (var5 == 127) {
            var2.method2485(var2.field4117, var2.field4123);
         } else {
            class423 var23;
            if (class423.field3205.field3208 != var5) {
               class423[] var24 = new class423[]{class423.field3205, class423.field3206, class423.field3207, class423.field3210};
               var23 = (class423)class341.method1788(var24, var5);
            } else {
               var23 = field1864[var1];
            }

            var2.method2488(var2.field4117, var2.field4123, var23);
         }
      }

   }
}
