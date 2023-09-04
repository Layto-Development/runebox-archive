public class class271 extends class460 {
   boolean field1906;
   int field1893;
   int field1894;
   int field1895;
   int field1896;
   int field1897;
   int field1898;
   int field1899;
   int field1900;
   int field1901;
   int field1902;
   int field1903;
   int field1904;
   int field1905;
   int field1907;

   class271(class404 var1, int var2, int var3) {
      super.field3651 = var1;
      this.field1901 = var1.field2809;
      this.field1902 = var1.field2807;
      this.field1906 = var1.field2811;
      this.field1894 = var2;
      this.field1895 = var3;
      this.field1896 = 8192;
      this.field1903 = 0;
      this.method1269();
   }

   class271(class404 var1, int var2, int var3, int var4) {
      super.field3651 = var1;
      this.field1901 = var1.field2809;
      this.field1902 = var1.field2807;
      this.field1906 = var1.field2811;
      this.field1894 = var2;
      this.field1895 = var3;
      this.field1896 = var4;
      this.field1903 = 0;
      this.method1269();
   }

   int method2168() {
      int var1 = this.field1897 * 3 >> 6;
      var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
      if (this.field1900 == 0) {
         var1 -= var1 * this.field1903 / (((class404)super.field3651).field2808.length << 8);
      } else if (this.field1900 >= 0) {
         var1 -= var1 * this.field1901 / ((class404)super.field3651).field2808.length;
      }

      return var1 > 255 ? 255 : var1;
   }

   void method1269() {
      this.field1897 = this.field1895;
      this.field1905 = method1261(this.field1895, this.field1896);
      this.field1899 = method1228(this.field1895, this.field1896);
   }

   public synchronized void method1232(int var1) {
      this.field1900 = var1;
   }

   public synchronized void method1233(int var1) {
      this.method1234(var1 << 6, this.method1236());
   }

   synchronized void method1272(int var1) {
      this.method1234(var1, this.method1236());
   }

   synchronized void method1234(int var1, int var2) {
      this.field1895 = var1;
      this.field1896 = var2;
      this.field1904 = 0;
      this.method1269();
   }

   public synchronized int method1235() {
      return this.field1895 == Integer.MIN_VALUE ? 0 : this.field1895;
   }

   public synchronized int method1236() {
      return this.field1896 < 0 ? -1 : this.field1896;
   }

   public synchronized void method1237(int var1) {
      int var2 = ((class404)super.field3651).field2808.length << 8;
      if (var1 < -1) {
         var1 = -1;
      }

      if (var1 > var2) {
         var1 = var2;
      }

      this.field1903 = var1;
   }

   public synchronized void method1265(boolean var1) {
      this.field1894 = (this.field1894 ^ this.field1894 >> 31) + (this.field1894 >>> 31);
      if (var1) {
         this.field1894 = -this.field1894;
      }

   }

   void method1262() {
      if (this.field1904 != 0) {
         if (this.field1895 == Integer.MIN_VALUE) {
            this.field1895 = 0;
         }

         this.field1904 = 0;
         this.method1269();
      }

   }

   public synchronized void method1264(int var1, int var2) {
      this.method1247(var1, var2, this.method1236());
   }

   public synchronized void method1247(int var1, int var2, int var3) {
      if (var1 == 0) {
         this.method1234(var2, var3);
      } else {
         int var4 = method1261(var2, var3);
         int var5 = method1228(var2, var3);
         if (this.field1905 == var4 && this.field1899 == var5) {
            this.field1904 = 0;
         } else {
            int var6 = var2 - this.field1897;
            if (this.field1897 - var2 > var6) {
               var6 = this.field1897 - var2;
            }

            if (var4 - this.field1905 > var6) {
               var6 = var4 - this.field1905;
            }

            if (this.field1905 - var4 > var6) {
               var6 = this.field1905 - var4;
            }

            if (var5 - this.field1899 > var6) {
               var6 = var5 - this.field1899;
            }

            if (this.field1899 - var5 > var6) {
               var6 = this.field1899 - var5;
            }

            if (var1 > var6) {
               var1 = var6;
            }

            this.field1904 = var1;
            this.field1895 = var2;
            this.field1896 = var3;
            this.field1893 = (var2 - this.field1897) / var1;
            this.field1898 = (var4 - this.field1905) / var1;
            this.field1907 = (var5 - this.field1899) / var1;
         }
      }
   }

   public synchronized void method1239(int var1) {
      if (var1 == 0) {
         this.method1272(0);
         this.method295();
      } else if (this.field1905 == 0 && this.field1899 == 0) {
         this.field1904 = 0;
         this.field1895 = 0;
         this.field1897 = 0;
         this.method295();
      } else {
         int var2 = -this.field1897;
         if (this.field1897 > var2) {
            var2 = this.field1897;
         }

         if (-this.field1905 > var2) {
            var2 = -this.field1905;
         }

         if (this.field1905 > var2) {
            var2 = this.field1905;
         }

         if (-this.field1899 > var2) {
            var2 = -this.field1899;
         }

         if (this.field1899 > var2) {
            var2 = this.field1899;
         }

         if (var1 > var2) {
            var1 = var2;
         }

         this.field1904 = var1;
         this.field1895 = Integer.MIN_VALUE;
         this.field1893 = -this.field1897 / var1;
         this.field1898 = -this.field1905 / var1;
         this.field1907 = -this.field1899 / var1;
      }
   }

   public synchronized void method1240(int var1) {
      if (this.field1894 < 0) {
         this.field1894 = -var1;
      } else {
         this.field1894 = var1;
      }

   }

   public synchronized int method1241() {
      return this.field1894 < 0 ? -this.field1894 : this.field1894;
   }

   public boolean method1242() {
      return this.field1903 < 0 || this.field1903 >= ((class404)super.field3651).field2808.length << 8;
   }

   public boolean method1243() {
      return this.field1904 != 0;
   }

   protected class460 method2169() {
      return null;
   }

   protected class460 method2170() {
      return null;
   }

   protected int method2167() {
      return this.field1895 == 0 && this.field1904 == 0 ? 0 : 1;
   }

   public synchronized void method2172(int[] var1, int var2, int var3) {
      if (this.field1895 == 0 && this.field1904 == 0) {
         this.method2171(var3);
      } else {
         class404 var4 = (class404)super.field3651;
         int var5 = this.field1901 << 8;
         int var6 = this.field1902 << 8;
         int var7 = var4.field2808.length << 8;
         int var8 = var6 - var5;
         if (var8 <= 0) {
            this.field1900 = 0;
         }

         int var9 = var2;
         var3 += var2;
         if (this.field1903 < 0) {
            if (this.field1894 <= 0) {
               this.method1262();
               this.method295();
               return;
            }

            this.field1903 = 0;
         }

         if (this.field1903 >= var7) {
            if (this.field1894 >= 0) {
               this.method1262();
               this.method295();
               return;
            }

            this.field1903 = var7 - 1;
         }

         if (this.field1900 < 0) {
            if (this.field1906) {
               if (this.field1894 < 0) {
                  var9 = this.method1249(var1, var2, var5, var3, var4.field2808[this.field1901]);
                  if (this.field1903 >= var5) {
                     return;
                  }

                  this.field1903 = var5 + var5 - 1 - this.field1903;
                  this.field1894 = -this.field1894;
               }

               while(true) {
                  var9 = this.method1263(var1, var9, var6, var3, var4.field2808[this.field1902 - 1]);
                  if (this.field1903 < var6) {
                     return;
                  }

                  this.field1903 = var6 + var6 - 1 - this.field1903;
                  this.field1894 = -this.field1894;
                  var9 = this.method1249(var1, var9, var5, var3, var4.field2808[this.field1901]);
                  if (this.field1903 >= var5) {
                     return;
                  }

                  this.field1903 = var5 + var5 - 1 - this.field1903;
                  this.field1894 = -this.field1894;
               }
            } else if (this.field1894 < 0) {
               while(true) {
                  var9 = this.method1249(var1, var9, var5, var3, var4.field2808[this.field1902 - 1]);
                  if (this.field1903 >= var5) {
                     return;
                  }

                  this.field1903 = var6 - 1 - (var6 - 1 - this.field1903) % var8;
               }
            } else {
               while(true) {
                  var9 = this.method1263(var1, var9, var6, var3, var4.field2808[this.field1901]);
                  if (this.field1903 < var6) {
                     return;
                  }

                  this.field1903 = var5 + (this.field1903 - var5) % var8;
               }
            }
         } else {
            if (this.field1900 > 0) {
               if (this.field1906) {
                  label131: {
                     if (this.field1894 < 0) {
                        var9 = this.method1249(var1, var2, var5, var3, var4.field2808[this.field1901]);
                        if (this.field1903 >= var5) {
                           return;
                        }

                        this.field1903 = var5 + var5 - 1 - this.field1903;
                        this.field1894 = -this.field1894;
                        if (--this.field1900 == 0) {
                           break label131;
                        }
                     }

                     do {
                        var9 = this.method1263(var1, var9, var6, var3, var4.field2808[this.field1902 - 1]);
                        if (this.field1903 < var6) {
                           return;
                        }

                        this.field1903 = var6 + var6 - 1 - this.field1903;
                        this.field1894 = -this.field1894;
                        if (--this.field1900 == 0) {
                           break;
                        }

                        var9 = this.method1249(var1, var9, var5, var3, var4.field2808[this.field1901]);
                        if (this.field1903 >= var5) {
                           return;
                        }

                        this.field1903 = var5 + var5 - 1 - this.field1903;
                        this.field1894 = -this.field1894;
                     } while(--this.field1900 != 0);
                  }
               } else {
                  int var10;
                  if (this.field1894 < 0) {
                     while(true) {
                        var9 = this.method1249(var1, var9, var5, var3, var4.field2808[this.field1902 - 1]);
                        if (this.field1903 >= var5) {
                           return;
                        }

                        var10 = (var6 - 1 - this.field1903) / var8;
                        if (var10 >= this.field1900) {
                           this.field1903 += var8 * this.field1900;
                           this.field1900 = 0;
                           break;
                        }

                        this.field1903 += var8 * var10;
                        this.field1900 -= var10;
                     }
                  } else {
                     while(true) {
                        var9 = this.method1263(var1, var9, var6, var3, var4.field2808[this.field1901]);
                        if (this.field1903 < var6) {
                           return;
                        }

                        var10 = (this.field1903 - var5) / var8;
                        if (var10 >= this.field1900) {
                           this.field1903 -= var8 * this.field1900;
                           this.field1900 = 0;
                           break;
                        }

                        this.field1903 -= var8 * var10;
                        this.field1900 -= var10;
                     }
                  }
               }
            }

            if (this.field1894 < 0) {
               this.method1249(var1, var9, 0, var3, 0);
               if (this.field1903 < 0) {
                  this.field1903 = -1;
                  this.method1262();
                  this.method295();
               }
            } else {
               this.method1263(var1, var9, var7, var3, 0);
               if (this.field1903 >= var7) {
                  this.field1903 = var7;
                  this.method1262();
                  this.method295();
               }
            }

         }
      }
   }

   public synchronized void method2171(int var1) {
      if (this.field1904 > 0) {
         if (var1 >= this.field1904) {
            if (this.field1895 == Integer.MIN_VALUE) {
               this.field1895 = 0;
               this.field1899 = 0;
               this.field1905 = 0;
               this.field1897 = 0;
               this.method295();
               var1 = this.field1904;
            }

            this.field1904 = 0;
            this.method1269();
         } else {
            this.field1897 += this.field1893 * var1;
            this.field1905 += this.field1898 * var1;
            this.field1899 += this.field1907 * var1;
            this.field1904 -= var1;
         }
      }

      class404 var2 = (class404)super.field3651;
      int var3 = this.field1901 << 8;
      int var4 = this.field1902 << 8;
      int var5 = var2.field2808.length << 8;
      int var6 = var4 - var3;
      if (var6 <= 0) {
         this.field1900 = 0;
      }

      if (this.field1903 < 0) {
         if (this.field1894 <= 0) {
            this.method1262();
            this.method295();
            return;
         }

         this.field1903 = 0;
      }

      if (this.field1903 >= var5) {
         if (this.field1894 >= 0) {
            this.method1262();
            this.method295();
            return;
         }

         this.field1903 = var5 - 1;
      }

      this.field1903 += this.field1894 * var1;
      if (this.field1900 < 0) {
         if (!this.field1906) {
            if (this.field1894 < 0) {
               if (this.field1903 >= var3) {
                  return;
               }

               this.field1903 = var4 - 1 - (var4 - 1 - this.field1903) % var6;
            } else {
               if (this.field1903 < var4) {
                  return;
               }

               this.field1903 = var3 + (this.field1903 - var3) % var6;
            }

         } else {
            if (this.field1894 < 0) {
               if (this.field1903 >= var3) {
                  return;
               }

               this.field1903 = var3 + var3 - 1 - this.field1903;
               this.field1894 = -this.field1894;
            }

            while(this.field1903 >= var4) {
               this.field1903 = var4 + var4 - 1 - this.field1903;
               this.field1894 = -this.field1894;
               if (this.field1903 >= var3) {
                  return;
               }

               this.field1903 = var3 + var3 - 1 - this.field1903;
               this.field1894 = -this.field1894;
            }

         }
      } else {
         if (this.field1900 > 0) {
            if (this.field1906) {
               label120: {
                  if (this.field1894 < 0) {
                     if (this.field1903 >= var3) {
                        return;
                     }

                     this.field1903 = var3 + var3 - 1 - this.field1903;
                     this.field1894 = -this.field1894;
                     if (--this.field1900 == 0) {
                        break label120;
                     }
                  }

                  do {
                     if (this.field1903 < var4) {
                        return;
                     }

                     this.field1903 = var4 + var4 - 1 - this.field1903;
                     this.field1894 = -this.field1894;
                     if (--this.field1900 == 0) {
                        break;
                     }

                     if (this.field1903 >= var3) {
                        return;
                     }

                     this.field1903 = var3 + var3 - 1 - this.field1903;
                     this.field1894 = -this.field1894;
                  } while(--this.field1900 != 0);
               }
            } else {
               label152: {
                  int var7;
                  if (this.field1894 < 0) {
                     if (this.field1903 >= var3) {
                        return;
                     }

                     var7 = (var4 - 1 - this.field1903) / var6;
                     if (var7 >= this.field1900) {
                        this.field1903 += var6 * this.field1900;
                        this.field1900 = 0;
                        break label152;
                     }

                     this.field1903 += var6 * var7;
                     this.field1900 -= var7;
                  } else {
                     if (this.field1903 < var4) {
                        return;
                     }

                     var7 = (this.field1903 - var3) / var6;
                     if (var7 >= this.field1900) {
                        this.field1903 -= var6 * this.field1900;
                        this.field1900 = 0;
                        break label152;
                     }

                     this.field1903 -= var6 * var7;
                     this.field1900 -= var7;
                  }

                  return;
               }
            }
         }

         if (this.field1894 < 0) {
            if (this.field1903 < 0) {
               this.field1903 = -1;
               this.method1262();
               this.method295();
            }
         } else if (this.field1903 >= var5) {
            this.field1903 = var5;
            this.method1262();
            this.method295();
         }

      }
   }

   int method1263(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field1904 > 0) {
            int var6 = var2 + this.field1904;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field1904 += var2;
            if (this.field1894 == 256 && (this.field1903 & 255) == 0) {
               if (class62.field496) {
                  var2 = method1256(0, ((class404)super.field3651).field2808, var1, this.field1903, var2, this.field1905, this.field1899, this.field1898, this.field1907, 0, var6, var3, this);
               } else {
                  var2 = method1255(((class404)super.field3651).field2808, var1, this.field1903, var2, this.field1897, this.field1893, 0, var6, var3, this);
               }
            } else if (class62.field496) {
               var2 = method1260(0, 0, ((class404)super.field3651).field2808, var1, this.field1903, var2, this.field1905, this.field1899, this.field1898, this.field1907, 0, var6, var3, this, this.field1894, var5);
            } else {
               var2 = method1259(0, 0, ((class404)super.field3651).field2808, var1, this.field1903, var2, this.field1897, this.field1893, 0, var6, var3, this, this.field1894, var5);
            }

            this.field1904 -= var2;
            if (this.field1904 != 0) {
               return var2;
            }

            if (!this.method1268()) {
               continue;
            }

            return var4;
         }

         if (this.field1894 == 256 && (this.field1903 & 255) == 0) {
            if (class62.field496) {
               return method1250(0, ((class404)super.field3651).field2808, var1, this.field1903, var2, this.field1905, this.field1899, 0, var4, var3, this);
            }

            return method1230(((class404)super.field3651).field2808, var1, this.field1903, var2, this.field1897, 0, var4, var3, this);
         }

         if (class62.field496) {
            return method1253(0, 0, ((class404)super.field3651).field2808, var1, this.field1903, var2, this.field1905, this.field1899, 0, var4, var3, this, this.field1894, var5);
         }

         return method1252(0, 0, ((class404)super.field3651).field2808, var1, this.field1903, var2, this.field1897, 0, var4, var3, this, this.field1894, var5);
      }
   }

   int method1249(int[] var1, int var2, int var3, int var4, int var5) {
      while(true) {
         if (this.field1904 > 0) {
            int var6 = var2 + this.field1904;
            if (var6 > var4) {
               var6 = var4;
            }

            this.field1904 += var2;
            if (this.field1894 == -256 && (this.field1903 & 255) == 0) {
               if (class62.field496) {
                  var2 = method1258(0, ((class404)super.field3651).field2808, var1, this.field1903, var2, this.field1905, this.field1899, this.field1898, this.field1907, 0, var6, var3, this);
               } else {
                  var2 = method1257(((class404)super.field3651).field2808, var1, this.field1903, var2, this.field1897, this.field1893, 0, var6, var3, this);
               }
            } else if (class62.field496) {
               var2 = method1267(0, 0, ((class404)super.field3651).field2808, var1, this.field1903, var2, this.field1905, this.field1899, this.field1898, this.field1907, 0, var6, var3, this, this.field1894, var5);
            } else {
               var2 = method1270(0, 0, ((class404)super.field3651).field2808, var1, this.field1903, var2, this.field1897, this.field1893, 0, var6, var3, this, this.field1894, var5);
            }

            this.field1904 -= var2;
            if (this.field1904 != 0) {
               return var2;
            }

            if (!this.method1268()) {
               continue;
            }

            return var4;
         }

         if (this.field1894 == -256 && (this.field1903 & 255) == 0) {
            if (class62.field496) {
               return method1271(0, ((class404)super.field3651).field2808, var1, this.field1903, var2, this.field1905, this.field1899, 0, var4, var3, this);
            }

            return method1251(((class404)super.field3651).field2808, var1, this.field1903, var2, this.field1897, 0, var4, var3, this);
         }

         if (class62.field496) {
            return method1254(0, 0, ((class404)super.field3651).field2808, var1, this.field1903, var2, this.field1905, this.field1899, 0, var4, var3, this, this.field1894, var5);
         }

         return method1238(0, 0, ((class404)super.field3651).field2808, var1, this.field1903, var2, this.field1897, 0, var4, var3, this, this.field1894, var5);
      }
   }

   boolean method1268() {
      int var1 = this.field1895;
      int var2;
      int var3;
      if (var1 == Integer.MIN_VALUE) {
         var3 = 0;
         var2 = 0;
         var1 = 0;
      } else {
         var2 = method1261(var1, this.field1896);
         var3 = method1228(var1, this.field1896);
      }

      if (this.field1897 == var1 && this.field1905 == var2 && this.field1899 == var3) {
         if (this.field1895 == Integer.MIN_VALUE) {
            this.field1895 = 0;
            this.field1899 = 0;
            this.field1905 = 0;
            this.field1897 = 0;
            this.method295();
            return true;
         } else {
            this.method1269();
            return false;
         }
      } else {
         if (this.field1897 < var1) {
            this.field1893 = 1;
            this.field1904 = var1 - this.field1897;
         } else if (this.field1897 > var1) {
            this.field1893 = -1;
            this.field1904 = this.field1897 - var1;
         } else {
            this.field1893 = 0;
         }

         if (this.field1905 < var2) {
            this.field1898 = 1;
            if (this.field1904 == 0 || this.field1904 > var2 - this.field1905) {
               this.field1904 = var2 - this.field1905;
            }
         } else if (this.field1905 > var2) {
            this.field1898 = -1;
            if (this.field1904 == 0 || this.field1904 > this.field1905 - var2) {
               this.field1904 = this.field1905 - var2;
            }
         } else {
            this.field1898 = 0;
         }

         if (this.field1899 < var3) {
            this.field1907 = 1;
            if (this.field1904 == 0 || this.field1904 > var3 - this.field1899) {
               this.field1904 = var3 - this.field1899;
            }
         } else if (this.field1899 > var3) {
            this.field1907 = -1;
            if (this.field1904 == 0 || this.field1904 > this.field1899 - var3) {
               this.field1904 = this.field1899 - var3;
            }
         } else {
            this.field1907 = 0;
         }

         return false;
      }
   }

   static int method1261(int var0, int var1) {
      return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4) + 0.5);
   }

   static int method1228(int var0, int var1) {
      return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4) + 0.5);
   }

   public static class271 method1266(class404 var0, int var1, int var2) {
      return var0.field2808 != null && var0.field2808.length != 0 ? new class271(var0, (int)((long)var0.field2810 * 256L * (long)var1 / (long)(class62.field481 * 100)), var2 << 6) : null;
   }

   public static class271 method1231(class404 var0, int var1, int var2, int var3) {
      return var0.field2808 != null && var0.field2808.length != 0 ? new class271(var0, var1, var2, var3) : null;
   }

   static int method1230(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class271 var8) {
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

      var8.field1903 = var2 << 8;
      return var3;
   }

   static int method1250(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class271 var10) {
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

      var10.field1903 = var3 << 8;
      return var4 >> 1;
   }

   static int method1251(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class271 var8) {
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

      var8.field1903 = var2 << 8;
      return var3;
   }

   static int method1271(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class271 var10) {
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

      var10.field1903 = var3 << 8;
      return var4 >> 1;
   }

   static int method1252(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class271 var10, int var11, int var12) {
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

      var10.field1903 = var4;
      return var5;
   }

   static int method1253(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class271 var11, int var12, int var13) {
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

      var11.field1903 = var4;
      return var5 >> 1;
   }

   static int method1238(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class271 var10, int var11, int var12) {
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

      var10.field1903 = var4;
      return var5;
   }

   static int method1254(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class271 var11, int var12, int var13) {
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

      var11.field1903 = var4;
      return var5 >> 1;
   }

   static int method1255(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class271 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var8 - var2) > var7) {
         var6 = var7;
      }

      var9.field1905 += var9.field1898 * (var6 - var3);
      var9.field1899 += var9.field1907 * (var6 - var3);

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

      var9.field1897 = var4 >> 2;
      var9.field1903 = var2 << 8;
      return var3;
   }

   static int method1256(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class271 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var11 - var3) > var10) {
         var9 = var10;
      }

      var12.field1897 += var12.field1893 * (var9 - var4);
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

      var12.field1905 = var5 >> 2;
      var12.field1899 = var6 >> 2;
      var12.field1903 = var3 << 8;
      return var4 >> 1;
   }

   static int method1257(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class271 var9) {
      var2 >>= 8;
      var8 >>= 8;
      var4 <<= 2;
      var5 <<= 2;
      if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
         var6 = var7;
      }

      var9.field1905 += var9.field1898 * (var6 - var3);
      var9.field1899 += var9.field1907 * (var6 - var3);

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

      var9.field1897 = var4 >> 2;
      var9.field1903 = var2 << 8;
      return var3;
   }

   static int method1258(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class271 var12) {
      var3 >>= 8;
      var11 >>= 8;
      var5 <<= 2;
      var6 <<= 2;
      var7 <<= 2;
      var8 <<= 2;
      if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
         var9 = var10;
      }

      var12.field1897 += var12.field1893 * (var9 - var4);
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

      var12.field1905 = var5 >> 2;
      var12.field1899 = var6 >> 2;
      var12.field1903 = var3 << 8;
      return var4 >> 1;
   }

   static int method1259(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class271 var11, int var12, int var13) {
      var11.field1905 -= var11.field1898 * var5;
      var11.field1899 -= var11.field1907 * var5;
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

      var11.field1905 += var11.field1898 * var5;
      var11.field1899 += var11.field1907 * var5;
      var11.field1897 = var6;
      var11.field1903 = var4;
      return var5;
   }

   static int method1260(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class271 var13, int var14, int var15) {
      var13.field1897 -= var13.field1893 * var5;
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
      var13.field1897 += var13.field1893 * var5;
      var13.field1905 = var6;
      var13.field1899 = var7;
      var13.field1903 = var4;
      return var5;
   }

   static int method1270(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class271 var11, int var12, int var13) {
      var11.field1905 -= var11.field1898 * var5;
      var11.field1899 -= var11.field1907 * var5;
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

      var11.field1905 += var11.field1898 * var5;
      var11.field1899 += var11.field1907 * var5;
      var11.field1897 = var6;
      var11.field1903 = var4;
      return var5;
   }

   static int method1267(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class271 var13, int var14, int var15) {
      var13.field1897 -= var13.field1893 * var5;
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
      var13.field1897 += var13.field1893 * var5;
      var13.field1905 = var6;
      var13.field1899 = var7;
      var13.field1903 = var4;
      return var5;
   }
}
