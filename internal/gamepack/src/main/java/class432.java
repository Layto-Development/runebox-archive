public class class432 extends class124 {
   boolean field3276;
   int field3263;
   int field3264;
   int field3265;
   int field3266;
   int field3267;
   int field3268;
   int field3269;
   int field3270;
   int field3271;
   int field3272;
   int field3273;
   int field3274;
   int field3275;
   int field3277;

   class432(class408 var1, int var2, int var3) {
      super.field1517 = var1;
      this.field3271 = var1.field3151;
      this.field3272 = var1.field3149;
      this.field3276 = var1.field3153;
      this.field3264 = var2;
      this.field3265 = var3;
      this.field3266 = 8192;
      this.field3273 = 0;
      this.method2108();
   }

   class432(class408 var1, int var2, int var3, int var4) {
      super.field1517 = var1;
      this.field3271 = var1.field3151;
      this.field3272 = var1.field3149;
      this.field3276 = var1.field3153;
      this.field3264 = var2;
      this.field3265 = var3;
      this.field3266 = var4;
      this.field3273 = 0;
      this.method2108();
   }

   int method865() {
      int var1 = this.field3267 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.field3270 == 0) {
         var1 -= var1 * this.field3273 / (((class408)super.field1517).field3150.length << 8);
      } else if (this.field3270 >= 0) {
         var1 -= var1 * this.field3271 / ((class408)super.field1517).field3150.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   void method2108() {
      this.field3267 = this.field3265;
      this.field3275 = method2100(this.field3265, this.field3266);
      this.field3269 = method2072(this.field3265, this.field3266);
   }

   public synchronized void method2075(int var1) {
      this.field3270 = var1;
   }

   public synchronized void method2076(int var1) {
      this.method2077(var1 << 6, this.method2079());
   }

   synchronized void method2111(int var1) {
      this.method2077(var1, this.method2079());
   }

   synchronized void method2077(int var1, int var2) {
      this.field3265 = var1;
      this.field3266 = var2;
      this.field3274 = 0;
      this.method2108();
   }

   public synchronized int method2078() {
      return this.field3265 == Integer.MIN_VALUE ? 0 : this.field3265;
   }

   public synchronized int method2079() {
      return this.field3266 < 0 ? -1 : this.field3266;
   }

   public synchronized void method2080(int var1) {
      int var2 = ((class408)super.field1517).field3150.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.field3273 = var1;
   }

   public synchronized void method2104(boolean var1) {
      this.field3264 = (this.field3264 ^ this.field3264 >> 31) + (this.field3264 >>> 31);
      if (var1) {
         this.field3264 = -this.field3264;
      }

   }

   void method2101() {
      if (this.field3274 != 0) {
         if (this.field3265 == Integer.MIN_VALUE) {
            this.field3265 = 0;
         }

         this.field3274 = 0;
         this.method2108();
      }

   }

   public synchronized void method2103(int var1, int var2) {
      this.method2087(var1, var2, this.method2079());
   }

   public synchronized void method2087(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method2077(var2, var3);
      } else {
         int var4 = method2100(var2, var3);
         int var5 = method2072(var2, var3);
         if (this.field3275 == var4 && this.field3269 == var5) {
            this.field3274 = 0;
         } else {
            int var6 = var2 - this.field3267;
            if (this.field3267 - var2 > var6) {
               var6 = this.field3267 - var2;
            }

            if (var4 - this.field3275 > var6) {
               var6 = var4 - this.field3275;
            }

            if (this.field3275 - var4 > var6) {
               var6 = this.field3275 - var4;
            }

            if (var5 - this.field3269 > var6) {
               var6 = var5 - this.field3269;
            }

            if (this.field3269 - var5 > var6) {
               var6 = this.field3269 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field3274 = var1;
            this.field3265 = var2;
            this.field3266 = var3;
            this.field3263 = (var2 - this.field3267) / var1;
            this.field3268 = (var4 - this.field3275) / var1;
            this.field3277 = (var5 - this.field3269) / var1;
         }
      }
   }

   public synchronized void method2082(int var1) {
      if (var1 == 0) {
         this.method2111(0);
         this.method605();
      } else if (this.field3275 == 0 && this.field3269 == 0) {
         this.field3274 = 0;
         this.field3265 = 0;
         this.field3267 = 0;
         this.method605();
      } else {
         int var2 = -this.field3267;
         if (this.field3267 > var2) {
            var2 = this.field3267;
         }

         if (-this.field3275 > var2) {
            var2 = -this.field3275;
         }

         if (this.field3275 > var2) {
            var2 = this.field3275;
         }

         if (-this.field3269 > var2) {
            var2 = -this.field3269;
         }

         if (this.field3269 > var2) {
            var2 = this.field3269;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field3274 = var1;
         this.field3265 = Integer.MIN_VALUE;
         this.field3263 = -this.field3267 / var1;
         this.field3268 = -this.field3275 / var1;
         this.field3277 = -this.field3269 / var1;
      }
   }

   public synchronized void method2083(int var1) {
      if (this.field3264 < 0) {
         this.field3264 = -var1;
      } else {
         this.field3264 = var1;
      }

   }

   public synchronized int method2084() {
      return this.field3264 < 0 ? -this.field3264 : this.field3264;
   }

   public boolean method2085() {
      return this.field3273 < 0 || this.field3273 >= ((class408)super.field1517).field3150.length << 8;
   }

   public boolean method2086() {
      return this.field3274 != 0;
   }

   protected class124 method866() {
      return null;
   }

   protected class124 method867() {
      return null;
   }

   protected int method864() {
      return this.field3265 == 0 && this.field3274 == 0 ? 0 : 1;
   }

   public synchronized void method869(int[] var1, int var2, int var3) {
      if (this.field3265 == 0 && this.field3274 == 0) {
         this.method868(var3);
      } else {
         class408 var4 = (class408)super.field1517;
         int var5 = this.field3271 << 8;
         int var6 = this.field3272 << 8;
         int var7 = var4.field3150.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field3270 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.field3273 < 0) {
            if (this.field3264 <= 0) {
               this.method2101();
               this.method605();
               return;
            }

            this.field3273 = 0;
         }

         if (this.field3273 >= var7) {
            if (this.field3264 >= 0) {
               this.method2101();
               this.method605();
               return;
            }

            this.field3273 = var7 - 1;
         }

         if (this.field3270 < 0) {
            if (this.field3276) {
               if (this.field3264 < 0) {
                  var9 = this.method2088(var1, var2, var5, var3, var4.field3150[this.field3271]);
                  if (this.field3273 >= var5) {
                     return;
                  }

                  this.field3273 = var5 + var5 - 1 - this.field3273;
                  this.field3264 = -this.field3264;
               }

               while(true) {
                  var9 = this.method2102(var1, var9, var6, var3, var4.field3150[this.field3272 - 1]);
                  if (this.field3273 < var6) {
                     return;
                  }

                  this.field3273 = var6 + var6 - 1 - this.field3273;
                  this.field3264 = -this.field3264;
                  var9 = this.method2088(var1, var9, var5, var3, var4.field3150[this.field3271]);
                  if (this.field3273 >= var5) {
                     return;
                  }

                  this.field3273 = var5 + var5 - 1 - this.field3273;
                  this.field3264 = -this.field3264;
               }
            } else if (this.field3264 < 0) {
               while(true) {
                  var9 = this.method2088(var1, var9, var5, var3, var4.field3150[this.field3272 - 1]);
                  if (this.field3273 >= var5) {
                     return;
                  }

                  this.field3273 = var6 - 1 - (var6 - 1 - this.field3273) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method2102(var1, var9, var6, var3, var4.field3150[this.field3271]);
                  if (this.field3273 < var6) {
                     return;
                  }

                  this.field3273 = var5 + (this.field3273 - var5) % var8;
               }
            }
         } else {
            if (this.field3270 > 0) {
               if (this.field3276) {
                  label131: {
                     if (this.field3264 < 0) {
                        var9 = this.method2088(var1, var2, var5, var3, var4.field3150[this.field3271]);
                        if (this.field3273 >= var5) {
                           return;
                        }

                        this.field3273 = var5 + var5 - 1 - this.field3273;
                        this.field3264 = -this.field3264;
                        if (--this.field3270 == 0) {
                           break label131;
                        }
                     }

                     do {
                        var9 = this.method2102(var1, var9, var6, var3, var4.field3150[this.field3272 - 1]);
                        if (this.field3273 < var6) {
                           return;
                        }

                        this.field3273 = var6 + var6 - 1 - this.field3273;
                        this.field3264 = -this.field3264;
                        if (--this.field3270 == 0) {
                           break;
                        }

                        var9 = this.method2088(var1, var9, var5, var3, var4.field3150[this.field3271]);
                        if (this.field3273 >= var5) {
                           return;
                        }

                        this.field3273 = var5 + var5 - 1 - this.field3273;
                        this.field3264 = -this.field3264;
                     } while(--this.field3270 != 0);
                  }
               } else {
                  int var10;
                  if (this.field3264 < 0) {
                     while(true) {
                        var9 = this.method2088(var1, var9, var5, var3, var4.field3150[this.field3272 - 1]);
                        if (this.field3273 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field3273) / var8;
                        if (var10 >= this.field3270) {
                           this.field3273 += var8 * this.field3270;
                           this.field3270 = 0;
                           break;
                        }

                        this.field3273 += var8 * var10;
                        this.field3270 -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method2102(var1, var9, var6, var3, var4.field3150[this.field3271]);
                        if (this.field3273 < var6) {
                           return;
                        }

                        var10 = (this.field3273 - var5) / var8;
                        if (var10 >= this.field3270) {
                           this.field3273 -= var8 * this.field3270;
                           this.field3270 = 0;
                           break;
                        }

                        this.field3273 -= var8 * var10;
                        this.field3270 -= var10;
                     }
                  }
               }
            }

            if (this.field3264 < 0) {
               this.method2088(var1, var9, 0, var3, 0);
               if (this.field3273 < 0) {
                  this.field3273 = -1;
                  this.method2101();
                  this.method605();
               }
            } else {
               this.method2102(var1, var9, var7, var3, 0);
               if (this.field3273 >= var7) {
                  this.field3273 = var7;
                  this.method2101();
                  this.method605();
               }
            }

         }
      }
   }

   public synchronized void method868(int var1) {
      if (this.field3274 > 0) {
         if (var1 >= this.field3274) {
            if (this.field3265 == Integer.MIN_VALUE) {
               this.field3265 = 0;
               this.field3269 = 0;
               this.field3275 = 0;
               this.field3267 = 0;
               this.method605();
               var1 = this.field3274;
            }

            this.field3274 = 0;
            this.method2108();
         } else {
            this.field3267 += this.field3263 * var1;
            this.field3275 += this.field3268 * var1;
            this.field3269 += this.field3277 * var1;
            this.field3274 -= var1;
         }
      }

      class408 var2 = (class408)super.field1517;
      int var3 = this.field3271 << 8;
      int var4 = this.field3272 << 8;
      int var5 = var2.field3150.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field3270 = 0;
      }

      if (this.field3273 < 0) {
         if (this.field3264 <= 0) {
            this.method2101();
            this.method605();
            return;
         }

         this.field3273 = 0;
      }

      if (this.field3273 >= var5) {
         if (this.field3264 >= 0) {
            this.method2101();
            this.method605();
            return;
         }

         this.field3273 = var5 - 1;
      }

      this.field3273 += this.field3264 * var1;
      if (this.field3270 < 0) {
         if (!this.field3276) {
            if (this.field3264 < 0) {
               if (this.field3273 >= var3) {
                  return;
               }

               this.field3273 = var4 - 1 - (var4 - 1 - this.field3273) % var6;
            } else {
               if (this.field3273 < var4) {
                  return;
               }

               this.field3273 = var3 + (this.field3273 - var3) % var6;
            }

         } else {
            if (this.field3264 < 0) {
               if (this.field3273 >= var3) {
                  return;
               }

               this.field3273 = var3 + var3 - 1 - this.field3273;
               this.field3264 = -this.field3264;
            }

            while(this.field3273 >= var4) {
               this.field3273 = var4 + var4 - 1 - this.field3273;
               this.field3264 = -this.field3264;
               if (this.field3273 >= var3) {
                  return;
               }

               this.field3273 = var3 + var3 - 1 - this.field3273;
               this.field3264 = -this.field3264;
            }

         }
      } else {
         if (this.field3270 > 0) {
            if (this.field3276) {
               label120: {
                  if (this.field3264 < 0) {
                     if (this.field3273 >= var3) {
                        return;
                     }

                     this.field3273 = var3 + var3 - 1 - this.field3273;
                     this.field3264 = -this.field3264;
                     if (--this.field3270 == 0) {
                        break label120;
                     }
                  }

                  do {
                     if (this.field3273 < var4) {
                        return;
                     }

                     this.field3273 = var4 + var4 - 1 - this.field3273;
                     this.field3264 = -this.field3264;
                     if (--this.field3270 == 0) {
                        break;
                     }

                     if (this.field3273 >= var3) {
                        return;
                     }

                     this.field3273 = var3 + var3 - 1 - this.field3273;
                     this.field3264 = -this.field3264;
                  } while(--this.field3270 != 0);
               }
            } else {
               label152: {
                  int var7;
                  if (this.field3264 < 0) {
                     if (this.field3273 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field3273) / var6;
                     if (var7 >= this.field3270) {
                        this.field3273 += var6 * this.field3270;
                        this.field3270 = 0;
                        break label152;
                     }

                     this.field3273 += var6 * var7;
                     this.field3270 -= var7;
                  } else {
                     if (this.field3273 < var4) {
                        return;
                     }

                     var7 = (this.field3273 - var3) / var6;
                     if (var7 >= this.field3270) {
                        this.field3273 -= var6 * this.field3270;
                        this.field3270 = 0;
                        break label152;
                     }

                     this.field3273 -= var6 * var7;
                     this.field3270 -= var7;
                  }

                  return;
               }
            }
         }

         if (this.field3264 < 0) {
            if (this.field3273 < 0) {
               this.field3273 = -1;
               this.method2101();
               this.method605();
            }
         } else if (this.field3273 >= var5) {
            this.field3273 = var5;
            this.method2101();
            this.method605();
         }

      }
   }

   int method2102(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field3274 > 0) {
            int var6 = var2 + this.field3274;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field3274 += var2;
            if (this.field3264 == 256 && (this.field3273 & 255) == 0) {
               if (class331.field2670) {
                  var2 = method2095(0, ((class408)super.field1517).field3150, var1, this.field3273, var2, this.field3275, this.field3269, this.field3268, this.field3277, 0, var6, var3, this);
               } else {
                  var2 = method2094(((class408)super.field1517).field3150, var1, this.field3273, var2, this.field3267, this.field3263, 0, var6, var3, this);
               }
            } else if (class331.field2670) {
               var2 = method2099(0, 0, ((class408)super.field1517).field3150, var1, this.field3273, var2, this.field3275, this.field3269, this.field3268, this.field3277, 0, var6, var3, this, this.field3264, var5);
            } else {
               var2 = method2098(0, 0, ((class408)super.field1517).field3150, var1, this.field3273, var2, this.field3267, this.field3263, 0, var6, var3, this, this.field3264, var5);
            }

            this.field3274 -= var2;
            if (this.field3274 != 0) {
               return var2;
            }

            if (!this.method2107()) {
               continue;
            }

            return var4;
         }

         if (this.field3264 == 256 && (this.field3273 & 255) == 0) {
            if (class331.field2670) {
               return method2089(0, ((class408)super.field1517).field3150, var1, this.field3273, var2, this.field3275, this.field3269, 0, var4, var3, this);
            }

            return method2073(((class408)super.field1517).field3150, var1, this.field3273, var2, this.field3267, 0, var4, var3, this);
         }

         if (class331.field2670) {
            return method2092(0, 0, ((class408)super.field1517).field3150, var1, this.field3273, var2, this.field3275, this.field3269, 0, var4, var3, this, this.field3264, var5);
         }

         return method2091(0, 0, ((class408)super.field1517).field3150, var1, this.field3273, var2, this.field3267, 0, var4, var3, this, this.field3264, var5);
      }
   }

   int method2088(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field3274 > 0) {
            int var6 = var2 + this.field3274;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field3274 += var2;
            if (this.field3264 == -256 && (this.field3273 & 255) == 0) {
               if (class331.field2670) {
                  var2 = method2097(0, ((class408)super.field1517).field3150, var1, this.field3273, var2, this.field3275, this.field3269, this.field3268, this.field3277, 0, var6, var3, this);
               } else {
                  var2 = method2096(((class408)super.field1517).field3150, var1, this.field3273, var2, this.field3267, this.field3263, 0, var6, var3, this);
               }
            } else if (class331.field2670) {
               var2 = method2106(0, 0, ((class408)super.field1517).field3150, var1, this.field3273, var2, this.field3275, this.field3269, this.field3268, this.field3277, 0, var6, var3, this, this.field3264, var5);
            } else {
               var2 = method2109(0, 0, ((class408)super.field1517).field3150, var1, this.field3273, var2, this.field3267, this.field3263, 0, var6, var3, this, this.field3264, var5);
            }

            this.field3274 -= var2;
            if (this.field3274 != 0) {
               return var2;
            }

            if (!this.method2107()) {
               continue;
            }

            return var4;
         }

         if (this.field3264 == -256 && (this.field3273 & 255) == 0) {
            if (class331.field2670) {
               return method2110(0, ((class408)super.field1517).field3150, var1, this.field3273, var2, this.field3275, this.field3269, 0, var4, var3, this);
            }

            return method2090(((class408)super.field1517).field3150, var1, this.field3273, var2, this.field3267, 0, var4, var3, this);
         }

         if (class331.field2670) {
            return method2093(0, 0, ((class408)super.field1517).field3150, var1, this.field3273, var2, this.field3275, this.field3269, 0, var4, var3, this, this.field3264, var5);
         }

         return method2081(0, 0, ((class408)super.field1517).field3150, var1, this.field3273, var2, this.field3267, 0, var4, var3, this, this.field3264, var5);
      }
   }

   boolean method2107() {
      int var1 = this.field3265;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method2100(var1, this.field3266);
         var3 = method2072(var1, this.field3266);
      }

      if (this.field3267 == var1 && this.field3275 == var2 && this.field3269 == var3) {
         if (this.field3265 == Integer.MIN_VALUE) {
            this.field3265 = 0;
            this.field3269 = 0;
            this.field3275 = 0;
            this.field3267 = 0;
            this.method605();
            return true;
         } else {
            this.method2108();
            return false;
         }
      } else {
         if (this.field3267 < var1) {
            this.field3263 = 1;
            this.field3274 = var1 - this.field3267;
         } else if (this.field3267 > var1) {
            this.field3263 = -1;
            this.field3274 = this.field3267 - var1;
         } else {
            this.field3263 = 0;
         }

         if (this.field3275 < var2) {
            this.field3268 = 1;
            if (this.field3274 == 0 || this.field3274 > var2 - this.field3275) {
               this.field3274 = var2 - this.field3275;
            }
         } else if (this.field3275 > var2) {
            this.field3268 = -1;
            if (this.field3274 == 0 || this.field3274 > this.field3275 - var2) {
               this.field3274 = this.field3275 - var2;
            }
         } else {
            this.field3268 = 0;
         }

         if (this.field3269 < var3) {
            this.field3277 = 1;
            if (this.field3274 == 0 || this.field3274 > var3 - this.field3269) {
               this.field3274 = var3 - this.field3269;
            }
         } else if (this.field3269 > var3) {
            this.field3277 = -1;
            if (this.field3274 == 0 || this.field3274 > this.field3269 - var3) {
               this.field3274 = this.field3269 - var3;
            }
         } else {
            this.field3277 = 0;
         }

         return false;
      }
   }

   static int method2100(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4) + 0.5);
   }

   static int method2072(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4) + 0.5);
   }

   public static class432 method2105(class408 var0, int var1, int var2) {
      return var0.field3150 != null && var0.field3150.length != 0 ? new class432(var0, (int)((long)var0.field3152 * 256L * (long)var1 / (long)(class331.field2655 * 100)), var2 << 6) : null;
   }

   public static class432 method2074(class408 var0, int var1, int var2, int var3) {
      return var0.field3150 != null && var0.field3150.length != 0 ? new class432(var0, var1, var2, var3) : null;
   }

   static int method2073(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class432 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var7 - var2) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
         var10001 = var3++;
      }

      var8.field3273 = var2 << 8;
      return var3;
   }

   static int method2089(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class432 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var9 - var3) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field3273 = var3 << 8;
      return var4 >> 1;
   }

   static int method2090(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class432 var8) {
      var2 >>= 8;
      var7 >>= 8;
      var4 <<= 2;
      if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
         var5 = var6;
      }

      int var10001;
      for(var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var10001 = var3++;
      }

      for(var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
         var10001 = var3++;
      }

      var8.field3273 = var2 << 8;
      return var3;
   }

   static int method2110(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class432 var10) {
      var3 >>= 8;
      var9 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
         var7 = var8;
      }

      var4 <<= 1;
      var7 <<= 1;

      int var10001;
      byte var11;
      for(var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
         var2[var10001] += var11 * var6;
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      for(var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
         var11 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var11 * var5;
         var10001 = var4++;
      }

      var10.field3273 = var3 << 8;
      return var4 >> 1;
   }

   static int method2091(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class432 var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
         var7 = var8;
      }

      byte var13;
      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         var13 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
         var7 = var8;
      }

      for(var1 = var12; var5 < var7; var4 += var11) {
         var13 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
      }

      var10.field3273 = var4;
      return var5;
   }

   static int method2092(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class432 var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      byte var14;
      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field3273 = var4;
      return var5 >> 1;
   }

   static int method2081(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class432 var10, int var11, int var12) {
      if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      int var10001;
      while(var5 < var7) {
         var1 = var4 >> 8;
         byte var13 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
         var4 += var11;
      }

      if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
         var7 = var8;
      }

      var0 = var12;

      for(var1 = var11; var5 < var7; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
      }

      var10.field3273 = var4;
      return var5;
   }

   static int method2093(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class432 var11, int var12, int var13) {
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var5 <<= 1;

      int var10001;
      for(var8 <<= 1; var5 < var8; var4 += var12) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var8 <<= 1;

      for(var1 = var13; var5 < var8; var4 += var12) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
      }

      var11.field3273 = var4;
      return var5 >> 1;
   }

   static int method2094(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class432 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field3275 += var9.field3268 * (var6 - var3);
      var9.field3269 += var9.field3277 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2++] * var4;
      }

      var9.field3267 = var4 >> 2;
      var9.field3273 = var2 << 8;
      return var3;
   }

   static int method2095(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class432 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field3267 += var12.field3263 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3++];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field3275 = var5 >> 2;
      var12.field3269 = var6 >> 2;
      var12.field3273 = var3 << 8;
      return var4 >> 1;
   }

   static int method2096(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class432 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field3275 += var9.field3268 * (var6 - var3);
      var9.field3269 += var9.field3277 * (var6 - var3);

      int var10001;
      for(var6 -= 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
         var4 += var5;
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      for(var6 += 3; var3 < var6; var4 += var5) {
         var10001 = var3++;
         var1[var10001] += var0[var2--] * var4;
      }

      var9.field3267 = var4 >> 2;
      var9.field3273 = var2 << 8;
      return var3;
   }

   static int method2097(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class432 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field3267 += var12.field3263 * (var9 - var4);
      var4 <<= 1;
      var9 <<= 1;

      byte var13;
      int var10001;
      for(var9 -= 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
         var6 += var8;
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      for(var9 += 6; var4 < var9; var6 += var8) {
         var13 = var1[var3--];
         var10001 = var4++;
         var2[var10001] += var13 * var5;
         var5 += var7;
         var10001 = var4++;
         var2[var10001] += var13 * var6;
      }

      var12.field3275 = var5 >> 2;
      var12.field3269 = var6 >> 2;
      var12.field3273 = var3 << 8;
      return var4 >> 1;
   }

   static int method2098(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class432 var11, int var12, int var13) {
      var11.field3275 -= var11.field3268 * var5;
      var11.field3269 -= var11.field3277 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
         var8 = var9;
      }

      byte var14;
      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         var14 = var2[var1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
         var8 = var9;
      }

      for(var1 = var13; var5 < var8; var4 += var12) {
         var14 = var2[var4 >> 8];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field3275 += var11.field3268 * var5;
      var11.field3269 += var11.field3277 * var5;
      var11.field3267 = var6;
      var11.field3273 = var4;
      return var5;
   }

   static int method2099(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class432 var13, int var14, int var15) {
      var13.field3267 -= var13.field3263 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      byte var16;
      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         var16 = var2[var1];
         var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var16 = var2[var4 >> 8];
         var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field3267 += var13.field3263 * var5;
      var13.field3275 = var6;
      var13.field3269 = var7;
      var13.field3273 = var4;
      return var5;
   }

   static int method2109(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class432 var11, int var12, int var13) {
      var11.field3275 -= var11.field3268 * var5;
      var11.field3269 -= var11.field3277 * var5;
      if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      int var10001;
      while(var5 < var8) {
         var1 = var4 >> 8;
         byte var14 = var2[var1 - 1];
         var10001 = var5++;
         var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
         var4 += var12;
      }

      if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
         var8 = var9;
      }

      var0 = var13;

      for(var1 = var12; var5 < var8; var4 += var1) {
         var10001 = var5++;
         var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
         var6 += var7;
      }

      var11.field3275 += var11.field3268 * var5;
      var11.field3269 += var11.field3277 * var5;
      var11.field3267 = var6;
      var11.field3273 = var4;
      return var5;
   }

   static int method2106(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class432 var13, int var14, int var15) {
      var13.field3267 -= var13.field3263 * var5;
      if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var5 <<= 1;

      int var10001;
      for(var10 <<= 1; var5 < var10; var4 += var14) {
         var1 = var4 >> 8;
         byte var16 = var2[var1 - 1];
         var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
         var10 = var11;
      }

      var10 <<= 1;

      for(var1 = var15; var5 < var10; var4 += var14) {
         var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
         var10001 = var5++;
         var3[var10001] += var0 * var6 >> 6;
         var6 += var8;
         var10001 = var5++;
         var3[var10001] += var0 * var7 >> 6;
         var7 += var9;
      }

      var5 >>= 1;
      var13.field3267 += var13.field3263 * var5;
      var13.field3275 = var6;
      var13.field3269 = var7;
      var13.field3273 = var4;
      return var5;
   }
}
