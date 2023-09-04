public class class355 implements class188 {
   public static final class355 field2786 = new class355(1, "GET", true, false);
   public static final class355 field2787 = new class355(0, "POST", true, true);
   static class468 field2793;
   static String field2794;
   static final class355 field2788 = new class355(3, "PATCH", false, true);
   static final class355 field2789 = new class355(4, "DELETE", false, true);
   static final class355 field2790 = new class355(2, "PUT", false, true);
   boolean field2792;
   boolean field2795;
   int field2785;
   String field2791;

   class355(int var1, String var2, boolean var3, boolean var4) {
      this.field2785 = var1;
      this.field2791 = var2;
      this.field2795 = var3;
      this.field2792 = var4;
   }

   boolean method1825() {
      return this.field2795;
   }

   public String method1823() {
      return this.field2791;
   }

   boolean method1824() {
      return this.field2792;
   }

   public int method1195() {
      return this.field2785;
   }

   static final void method1826(class480[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var9 = 0; var9 < var0.length; ++var9) {
         class480 var10 = var0[var9];
         if (null != var10 && var1 == var10.field3691 && (var10.method2324() || Client.method481(var10) != 0 || var10 == Client.field779)) {
            if (var10.field3754) {
               if (Client.method458(var10)) {
                  continue;
               }
            } else if (var10.field3676 == 0 && class315.field2564 != var10 && Client.method458(var10)) {
               continue;
            }

            if (var10.field3676 == 11) {
               if (var10.method2345(class19.field209)) {
                  if (var10.method2347()) {
                     Client.method485(var10);
                     Client.method424(var10.field3806, var10, true);
                  }

                  if (var10.field3739 != null) {
                     class208 var11 = new class208();
                     var11.field1951 = var10;
                     var11.field1954 = var10.field3739;
                     Client.field791.method1240(var11);
                  }
               }
            } else if (var10.field3676 == 12 && var10.method2339()) {
               Client.method485(var10);
            }

            int var27 = var10.field3675 + var6;
            int var12 = var7 + var10.field3688;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var10.field3676 == 9) {
               var17 = var27;
               var18 = var12;
               var19 = var27 + var10.field3689;
               int var20 = var10.field3666 + var12;
               if (var19 < var27) {
                  var17 = var19;
                  var19 = var27;
               }

               if (var20 < var12) {
                  var18 = var20;
                  var20 = var12;
               }

               ++var19;
               ++var20;
               var13 = var17 > var2 ? var17 : var2;
               var14 = var18 > var3 ? var18 : var3;
               var15 = var19 < var4 ? var19 : var4;
               var16 = var20 < var5 ? var20 : var5;
            } else {
               var17 = var27 + var10.field3689;
               var18 = var10.field3666 + var12;
               var13 = var27 > var2 ? var27 : var2;
               var14 = var12 > var3 ? var12 : var3;
               var15 = var17 < var4 ? var17 : var4;
               var16 = var18 < var5 ? var18 : var5;
            }

            if (Client.field760 == var10) {
               Client.field812 = true;
               Client.field614 = var27;
               Client.field686 = var12;
            }

            boolean var28 = false;
            if (var10.field3746) {
               switch (Client.field590) {
                  case 0:
                     var28 = true;
                  case 1:
                  default:
                     break;
                  case 2:
                     if (var10.field3674 >>> 16 == Client.field751) {
                        var28 = true;
                     }
                     break;
                  case 3:
                     if (Client.field751 == var10.field3674) {
                        var28 = true;
                     }
               }
            }

            if (var28 || !var10.field3754 || var13 < var15 && var14 < var16) {
               if (var10.field3754) {
                  class208 var29;
                  if (var10.field3816) {
                     if (class441.field3349 >= var13 && class441.field3332 >= var14 && class441.field3349 < var15 && class441.field3332 < var16) {
                        for(var29 = (class208)Client.field791.method1236(); var29 != null; var29 = (class208)Client.field791.method1238()) {
                           if (var29.field1962) {
                              var29.method605();
                              var29.field1951.field3694 = false;
                           }
                        }

                        Client.method556();
                        if (class531.field4173 == 0) {
                           Client.field760 = null;
                           Client.field779 = null;
                        }

                        if (!Client.field689) {
                           Client.method525();
                        }
                     }
                  } else if (var10.field3817 && class441.field3349 >= var13 && class441.field3332 >= var14 && class441.field3349 < var15 && class441.field3332 < var16) {
                     for(var29 = (class208)Client.field791.method1236(); null != var29; var29 = (class208)Client.field791.method1238()) {
                        if (var29.field1962 && var29.field1951.field3699 == var29.field1954) {
                           var29.method605();
                        }
                     }
                  }
               }

               var18 = class441.field3349;
               var19 = class441.field3332;
               if (class441.field3343 != 0) {
                  var18 = class441.field3344;
                  var19 = class441.field3345;
               }

               boolean var30 = var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
               if (var10.field3700 == 1337) {
                  if (!Client.field589 && !Client.field689 && var30) {
                     Client.method455(var18, var19, var13, var14);
                  }
               } else if (var10.field3700 == 1338) {
                  Client.method529(var10, var27, var12);
               } else {
                  if (var10.field3700 == 1400) {
                     class477.field3650.method65(class441.field3349, class441.field3332, var30, var27, var12, var10.field3689, var10.field3666);
                  }

                  if (!Client.field689 && var30) {
                     if (var10.field3700 == 1400) {
                        class477.field3650.method58(var27, var12, var10.field3689, var10.field3666, var18, var19);
                     } else {
                        Client.method462(var10);
                     }
                  }

                  boolean var22;
                  int var24;
                  if (var28) {
                     for(int var21 = 0; var21 < var10.field3723.length; ++var21) {
                        var22 = false;
                        boolean var23 = false;
                        if (!var22 && null != var10.field3723[var21]) {
                           for(var24 = 0; var24 < var10.field3723[var21].length; ++var24) {
                              boolean var25 = false;
                              if (null != var10.field3815) {
                                 var25 = Client.field724.method171(var10.field3723[var21][var24]);
                              }

                              if (Client.method538(var10.field3723[var21][var24]) || var25) {
                                 var22 = true;
                                 if (var10.field3815 != null && var10.field3815[var21] > Client.field879) {
                                    break;
                                 }

                                 byte var26 = var10.field3819[var21][var24];
                                 if (var26 == 0 || ((var26 & 8) == 0 || !Client.field724.method171(86) && !Client.field724.method171(82) && !Client.field724.method171(81)) && ((var26 & 2) == 0 || Client.field724.method171(86)) && ((var26 & 1) == 0 || Client.field724.method171(82)) && ((var26 & 4) == 0 || Client.field724.method171(81))) {
                                    var23 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var23) {
                           if (var21 < 10) {
                              Client.method414(var21 + 1, var10.field3674, var10.field3793, var10.field3802, "");
                           } else if (var21 == 10) {
                              class58.method613();
                              Client.method519(var10.field3674, var10.field3793, class392.method1898(Client.method481(var10)), var10.field3802);
                              Client.field759 = Client.method511(var10);
                              if (null == Client.field759) {
                                 Client.field759 = class27.field544;
                              }

                              Client.field770 = var10.field3678 + class357.method1829(16777215);
                           }

                           var24 = var10.field3749[var21];
                           if (var10.field3815 == null) {
                              var10.field3815 = new int[var10.field3723.length];
                           }

                           if (var10.field3750 == null) {
                              var10.field3750 = new int[var10.field3723.length];
                           }

                           if (var24 != 0) {
                              if (var10.field3815[var21] == 0) {
                                 var10.field3815[var21] = var10.field3750[var21] + var24 + Client.field879;
                              } else {
                                 var10.field3815[var21] = Client.field879 + var24;
                              }
                           } else {
                              var10.field3815[var21] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var22 && null != var10.field3815) {
                           var10.field3815[var21] = 0;
                        }
                     }
                  }

                  if (var10.field3754) {
                     if (class441.field3349 >= var13 && class441.field3332 >= var14 && class441.field3349 < var15 && class441.field3332 < var16) {
                        var30 = true;
                     } else {
                        var30 = false;
                     }

                     boolean var31 = false;
                     if ((class441.field3339 == 1 || !class136.field1574 && class441.field3339 == 4) && var30) {
                        var31 = true;
                     }

                     var22 = false;
                     if ((class441.field3343 == 1 || !class136.field1574 && class441.field3343 == 4) && class441.field3344 >= var13 && class441.field3345 >= var14 && class441.field3344 < var15 && class441.field3345 < var16) {
                        var22 = true;
                     }

                     if (var22) {
                        Client.method488(var10, class441.field3344 - var27, class441.field3345 - var12);
                     }

                     if (var10.method2325()) {
                        if (var22) {
                           Client.field830.method1240(new class166(0, class441.field3349 - var27, class441.field3332 - var12, var10));
                        }

                        if (var31) {
                           Client.field830.method1240(new class166(1, class441.field3349 - var27, class441.field3332 - var12, var10));
                        }
                     }

                     if (var10.field3700 == 1400) {
                        class477.field3650.method19(var18, var19, var30 & var31, var30 & var22);
                     }

                     if (null != Client.field760 && Client.field760 != var10 && var30 && class392.method1899(Client.method481(var10))) {
                        Client.field764 = var10;
                     }

                     if (Client.field779 == var10) {
                        Client.field765 = true;
                        Client.field766 = var27;
                        Client.field767 = var12;
                     }

                     if (var10.field3757) {
                        class208 var32;
                        if (var30 && Client.field789 != 0 && var10.field3699 != null) {
                           var32 = new class208();
                           var32.field1962 = true;
                           var32.field1951 = var10;
                           var32.field1955 = Client.field789;
                           var32.field1954 = var10.field3699;
                           Client.field791.method1240(var32);
                        }

                        if (Client.field760 != null || Client.field689) {
                           var22 = false;
                           var31 = false;
                           var30 = false;
                        }

                        if (!var10.field3808 && var22) {
                           var10.field3808 = true;
                           if (var10.field3726 != null) {
                              var32 = new class208();
                              var32.field1962 = true;
                              var32.field1951 = var10;
                              var32.field1952 = class441.field3344 - var27;
                              var32.field1955 = class441.field3345 - var12;
                              var32.field1954 = var10.field3726;
                              Client.field791.method1240(var32);
                           }
                        }

                        if (var10.field3808 && var31 && var10.field3672 != null) {
                           var32 = new class208();
                           var32.field1962 = true;
                           var32.field1951 = var10;
                           var32.field1952 = class441.field3349 - var27;
                           var32.field1955 = class441.field3332 - var12;
                           var32.field1954 = var10.field3672;
                           Client.field791.method1240(var32);
                        }

                        if (var10.field3808 && !var31) {
                           var10.field3808 = false;
                           if (var10.field3759 != null) {
                              var32 = new class208();
                              var32.field1962 = true;
                              var32.field1951 = var10;
                              var32.field1952 = class441.field3349 - var27;
                              var32.field1955 = class441.field3332 - var12;
                              var32.field1954 = var10.field3759;
                              Client.field793.method1240(var32);
                           }
                        }

                        if (var31 && null != var10.field3762) {
                           var32 = new class208();
                           var32.field1962 = true;
                           var32.field1951 = var10;
                           var32.field1952 = class441.field3349 - var27;
                           var32.field1955 = class441.field3332 - var12;
                           var32.field1954 = var10.field3762;
                           Client.field791.method1240(var32);
                        }

                        if (!var10.field3694 && var30) {
                           var10.field3694 = true;
                           if (null != var10.field3763) {
                              var32 = new class208();
                              var32.field1962 = true;
                              var32.field1951 = var10;
                              var32.field1952 = class441.field3349 - var27;
                              var32.field1955 = class441.field3332 - var12;
                              var32.field1954 = var10.field3763;
                              Client.field791.method1240(var32);
                           }
                        }

                        if (var10.field3694 && var30 && null != var10.field3764) {
                           var32 = new class208();
                           var32.field1962 = true;
                           var32.field1951 = var10;
                           var32.field1952 = class441.field3349 - var27;
                           var32.field1955 = class441.field3332 - var12;
                           var32.field1954 = var10.field3764;
                           Client.field791.method1240(var32);
                        }

                        if (var10.field3694 && !var30) {
                           var10.field3694 = false;
                           if (null != var10.field3735) {
                              var32 = new class208();
                              var32.field1962 = true;
                              var32.field1951 = var10;
                              var32.field1952 = class441.field3349 - var27;
                              var32.field1955 = class441.field3332 - var12;
                              var32.field1954 = var10.field3735;
                              Client.field793.method1240(var32);
                           }
                        }

                        if (var10.field3667 != null) {
                           var32 = new class208();
                           var32.field1951 = var10;
                           var32.field1954 = var10.field3667;
                           Client.field777.method1240(var32);
                        }

                        int var35;
                        class208 var37;
                        int var38;
                        if (var10.field3741 != null && Client.field774 > var10.field3810) {
                           if (var10.field3771 != null && Client.field774 - var10.field3810 <= 32) {
                              label643:
                              for(var38 = var10.field3810; var38 < Client.field774; ++var38) {
                                 var24 = Client.field773[var38 & 31];

                                 for(var35 = 0; var35 < var10.field3771.length; ++var35) {
                                    if (var10.field3771[var35] == var24) {
                                       var37 = new class208();
                                       var37.field1951 = var10;
                                       var37.field1954 = var10.field3741;
                                       Client.field791.method1240(var37);
                                       break label643;
                                    }
                                 }
                              }
                           } else {
                              var32 = new class208();
                              var32.field1951 = var10;
                              var32.field1954 = var10.field3741;
                              Client.field791.method1240(var32);
                           }

                           var10.field3810 = Client.field774;
                        }

                        if (null != var10.field3772 && Client.field776 > var10.field3811) {
                           if (null != var10.field3703 && Client.field776 - var10.field3811 <= 32) {
                              label619:
                              for(var38 = var10.field3811; var38 < Client.field776; ++var38) {
                                 var24 = Client.field775[var38 & 31];

                                 for(var35 = 0; var35 < var10.field3703.length; ++var35) {
                                    if (var24 == var10.field3703[var35]) {
                                       var37 = new class208();
                                       var37.field1951 = var10;
                                       var37.field1954 = var10.field3772;
                                       Client.field791.method1240(var37);
                                       break label619;
                                    }
                                 }
                              }
                           } else {
                              var32 = new class208();
                              var32.field1951 = var10;
                              var32.field1954 = var10.field3772;
                              Client.field791.method1240(var32);
                           }

                           var10.field3811 = Client.field776;
                        }

                        if (null != var10.field3774 && Client.field778 > var10.field3812) {
                           if (null != var10.field3775 && Client.field778 - var10.field3812 <= 32) {
                              label595:
                              for(var38 = var10.field3812; var38 < Client.field778; ++var38) {
                                 var24 = Client.field700[var38 & 31];

                                 for(var35 = 0; var35 < var10.field3775.length; ++var35) {
                                    if (var24 == var10.field3775[var35]) {
                                       var37 = new class208();
                                       var37.field1951 = var10;
                                       var37.field1954 = var10.field3774;
                                       Client.field791.method1240(var37);
                                       break label595;
                                    }
                                 }
                              }
                           } else {
                              var32 = new class208();
                              var32.field1951 = var10;
                              var32.field1954 = var10.field3774;
                              Client.field791.method1240(var32);
                           }

                           var10.field3812 = Client.field778;
                        }

                        if (Client.field781 > var10.field3743 && null != var10.field3665) {
                           var32 = new class208();
                           var32.field1951 = var10;
                           var32.field1954 = var10.field3665;
                           Client.field791.method1240(var32);
                        }

                        if (Client.field782 > var10.field3743 && var10.field3731 != null) {
                           var32 = new class208();
                           var32.field1951 = var10;
                           var32.field1954 = var10.field3731;
                           Client.field791.method1240(var32);
                        }

                        if (Client.field783 > var10.field3743 && var10.field3785 != null) {
                           var32 = new class208();
                           var32.field1951 = var10;
                           var32.field1954 = var10.field3785;
                           Client.field791.method1240(var32);
                        }

                        if (Client.field784 > var10.field3743 && var10.field3786 != null) {
                           var32 = new class208();
                           var32.field1951 = var10;
                           var32.field1954 = var10.field3786;
                           Client.field791.method1240(var32);
                        }

                        if (Client.field785 > var10.field3743 && var10.field3787 != null) {
                           var32 = new class208();
                           var32.field1951 = var10;
                           var32.field1954 = var10.field3787;
                           Client.field791.method1240(var32);
                        }

                        if (Client.field786 > var10.field3743 && var10.field3792 != null) {
                           var32 = new class208();
                           var32.field1951 = var10;
                           var32.field1954 = var10.field3792;
                           Client.field791.method1240(var32);
                        }

                        if (Client.field647 > var10.field3743 && var10.field3807 != null) {
                           var32 = new class208();
                           var32.field1951 = var10;
                           var32.field1954 = var10.field3807;
                           Client.field791.method1240(var32);
                        }

                        if (Client.field628 > var10.field3743 && null != var10.field3788) {
                           var32 = new class208();
                           var32.field1951 = var10;
                           var32.field1954 = var10.field3788;
                           Client.field791.method1240(var32);
                        }

                        var10.field3743 = Client.field578;
                        if (var10.field3781 != null) {
                           for(var38 = 0; var38 < Client.field816; ++var38) {
                              class208 var36 = new class208();
                              var36.field1951 = var10;
                              var36.field1953 = Client.field818[var38];
                              var36.field1959 = Client.field817[var38];
                              var36.field1954 = var10.field3781;
                              Client.field791.method1240(var36);
                           }
                        }

                        class208 var39;
                        int[] var40;
                        if (null != var10.field3791) {
                           var40 = Client.field724.method168();

                           for(var24 = 0; var24 < var40.length; ++var24) {
                              var39 = new class208();
                              var39.field1951 = var10;
                              var39.field1953 = var40[var24];
                              var39.field1954 = var10.field3791;
                              Client.field791.method1240(var39);
                           }
                        }

                        if (var10.field3748 != null) {
                           var40 = Client.field724.method169();

                           for(var24 = 0; var24 < var40.length; ++var24) {
                              var39 = new class208();
                              var39.field1951 = var10;
                              var39.field1953 = var40[var24];
                              var39.field1954 = var10.field3748;
                              Client.field791.method1240(var39);
                           }
                        }
                     }
                  }

                  if (!var10.field3754) {
                     if (null != Client.field760 || Client.field689) {
                        continue;
                     }

                     if ((var10.field3798 >= 0 || var10.field3701 != 0) && class441.field3349 >= var13 && class441.field3332 >= var14 && class441.field3349 < var15 && class441.field3332 < var16) {
                        if (var10.field3798 >= 0) {
                           class315.field2564 = var0[var10.field3798];
                        } else {
                           class315.field2564 = var10;
                        }
                     }

                     if (var10.field3676 == 8 && class441.field3349 >= var13 && class441.field3332 >= var14 && class441.field3349 < var15 && class441.field3332 < var16) {
                        class254.field2235 = var10;
                     }

                     if (var10.field3696 > var10.field3666) {
                        Client.method539(var10, var10.field3689 + var27, var12, var10.field3666, var10.field3696, class441.field3349, class441.field3332);
                     }
                  }

                  if (var10.field3676 == 0) {
                     method1826(var0, var10.field3674, var13, var14, var15, var16, var27 - var10.field3693, var12 - var10.field3707);
                     if (var10.field3806 != null) {
                        method1826(var10.field3806, var10.field3674, var13, var14, var15, var16, var27 - var10.field3693, var12 - var10.field3707);
                     }

                     class49 var33 = (class49)Client.field597.method709((long)var10.field3674);
                     if (null != var33) {
                        if (var33.field1045 == 0 && class441.field3349 >= var13 && class441.field3332 >= var14 && class441.field3349 < var15 && class441.field3332 < var16 && !Client.field689) {
                           for(class208 var34 = (class208)Client.field791.method1236(); var34 != null; var34 = (class208)Client.field791.method1238()) {
                              if (var34.field1962) {
                                 var34.method605();
                                 var34.field1951.field3694 = false;
                              }
                           }

                           if (class531.field4173 == 0) {
                              Client.field760 = null;
                              Client.field779 = null;
                           }

                           if (!Client.field689) {
                              Client.method525();
                           }
                        }

                        Client.method425(var33.field1047, var13, var14, var15, var16, var27, var12);
                     }
                  }
               }
            }
         }
      }

   }
}
