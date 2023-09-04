import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class class322 extends class70 {
   public static boolean field2157;
   static class172 field2155;
   static class172 field2267;
   static class245 field2147 = new class245(8);
   static class245 field2153 = new class245(50);
   static class245 field2154 = new class245(20);
   static class245 field2264 = new class245(200);
   class200 field2235;
   class505 field2224;
   int field2202;
   int field2203;
   int field2268;
   HashMap field2260;
   HashMap field2283;
   public boolean field2148;
   public boolean field2176 = false;
   public boolean field2178;
   public boolean field2190;
   public boolean field2195;
   public boolean field2198;
   public boolean field2199;
   public boolean field2216;
   public boolean field2220 = false;
   public boolean field2230;
   public boolean field2231;
   public boolean field2238 = false;
   public boolean field2239;
   public boolean field2241;
   public boolean field2292;
   public boolean field2300;
   public boolean field2301;
   public boolean field2302;
   public byte[][] field2207;
   public byte[][] field2303;
   public class206 field2214;
   public class322 field2257;
   public class322[] field2290;
   public class448 field2186;
   public int field2150 = 0;
   public int field2158 = -1;
   public int field2159 = 0;
   public int field2160;
   public int field2161 = 0;
   public int field2163 = 0;
   public int field2164 = 0;
   public int field2165 = 0;
   public int field2166 = 0;
   public int field2167 = 0;
   public int field2168 = 0;
   public int field2169 = 0;
   public int field2170 = 0;
   public int field2171;
   public int field2172 = 0;
   public int field2173 = 0;
   public int field2174 = 1;
   public int field2175 = -1;
   public int field2177 = 0;
   public int field2179;
   public int field2180 = 0;
   public int field2181 = 0;
   public int field2182 = 0;
   public int field2184 = 0;
   public int field2185 = 0;
   public int field2188;
   public int field2189;
   public int field2191 = 0;
   public int field2192;
   public int field2194;
   public int field2196;
   public int field2197;
   public int field2200;
   public int field2201;
   public int field2204;
   public int field2206;
   public int field2208;
   public int field2211;
   public int field2212;
   public int field2213;
   public int field2217;
   public int field2221;
   public int field2226;
   public int field2227;
   public int field2228 = 0;
   public int field2229;
   public int field2244;
   public int field2245 = 0;
   public int field2249;
   public int field2254;
   public int field2263;
   public int field2273;
   public int field2274 = 1;
   public int field2277 = -1;
   public int field2278;
   public int field2279;
   public int field2280;
   public int field2282;
   public int field2286;
   public int field2287;
   public int field2288;
   public int field2289;
   public int field2294;
   public int field2295;
   public int field2296;
   public int field2297;
   public int field2298;
   public int[] field2187;
   public int[] field2233;
   public int[] field2234;
   public int[] field2255;
   public int[] field2259;
   public int[] field2281;
   public int[] field2284;
   public int[] field2285;
   public int[] field2293;
   public int[] field2299;
   public int[][] field2222;
   public Object[] field2149;
   public Object[] field2151;
   public Object[] field2152;
   public Object[] field2156;
   public Object[] field2183;
   public Object[] field2205;
   public Object[] field2210;
   public Object[] field2215;
   public Object[] field2219;
   public Object[] field2223;
   public Object[] field2225;
   public Object[] field2232;
   public Object[] field2237;
   public Object[] field2242;
   public Object[] field2243;
   public Object[] field2246;
   public Object[] field2247;
   public Object[] field2248;
   public Object[] field2250;
   public Object[] field2251;
   public Object[] field2252;
   public Object[] field2253;
   public Object[] field2256;
   public Object[] field2258;
   public Object[] field2261;
   public Object[] field2262;
   public Object[] field2265;
   public Object[] field2269;
   public Object[] field2270;
   public Object[] field2271;
   public Object[] field2272;
   public Object[] field2275;
   public Object[] field2276;
   public Object[] field2291;
   public String field2146;
   public String field2162;
   public String field2193;
   public String field2209;
   public String field2218;
   public String field2240;
   public String field2266;
   public String[] field2236;

   static {
      field2155 = new class172(10, class418.field2939);
      field2267 = new class172(10, class418.field2939);
      field2157 = false;
   }

   public class322() {
      this.field2186 = class448.field3546;
      this.field2179 = 0;
      this.field2188 = 0;
      this.field2189 = 1;
      this.field2190 = false;
      this.field2244 = -1;
      this.field2192 = -1;
      this.field2194 = 0;
      this.field2195 = false;
      this.field2196 = 0;
      this.field2197 = 0;
      this.field2200 = 1;
      this.field2201 = -1;
      this.field2202 = 1;
      this.field2203 = -1;
      this.field2204 = -1;
      this.field2278 = -1;
      this.field2206 = 0;
      this.field2280 = 0;
      this.field2208 = 0;
      this.field2226 = 0;
      this.field2273 = 0;
      this.field2211 = 100;
      this.field2212 = 0;
      this.field2249 = 0;
      this.field2231 = false;
      this.field2216 = false;
      this.field2217 = 2;
      this.field2263 = -1;
      this.field2218 = "";
      this.field2146 = "";
      this.field2254 = 0;
      this.field2221 = 0;
      this.field2279 = 0;
      this.field2148 = false;
      this.field2268 = -1;
      this.field2229 = 0;
      this.field2230 = false;
      this.field2162 = "";
      this.field2257 = null;
      this.field2171 = 0;
      this.field2213 = 0;
      this.field2239 = false;
      this.field2240 = "";
      this.field2241 = false;
      this.field2282 = -1;
      this.field2266 = "";
      this.field2209 = class424.field3005;
      this.field2286 = -1;
      this.field2287 = 0;
      this.field2288 = 0;
      this.field2289 = 0;
      this.field2178 = false;
      this.field2292 = false;
      this.field2227 = -1;
      this.field2294 = 0;
      this.field2295 = 0;
      this.field2296 = 0;
      this.field2297 = -1;
      this.field2298 = -1;
      this.field2300 = false;
      this.field2301 = false;
      this.field2302 = false;
   }

   void method1447(class366 var1) {
      this.field2238 = false;
      this.field2160 = var1.method1654();
      this.field2161 = var1.method1654();
      this.field2184 = var1.method1703();
      this.field2167 = var1.method1656();
      this.field2168 = var1.method1656();
      this.field2169 = var1.method1703();
      this.field2170 = var1.method1703();
      this.field2179 = var1.method1654();
      this.field2175 = var1.method1703();
      if (65535 == this.field2175) {
         this.field2175 = -1;
      } else {
         this.field2175 += this.field2158 & -65536;
      }

      this.field2282 = var1.method1703();
      if (this.field2282 == 65535) {
         this.field2282 = -1;
      }

      int var3 = var1.method1654();
      int var4;
      if (var3 > 0) {
         this.field2293 = new int[var3];
         this.field2281 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2293[var4] = var1.method1654();
            this.field2281[var4] = var1.method1703();
         }
      }

      var4 = var1.method1654();
      int var5;
      if (var4 > 0) {
         this.field2222 = new int[var4][];

         for(var5 = 0; var5 < var4; ++var5) {
            int var6 = var1.method1703();
            this.field2222[var5] = new int[var6];

            for(int var7 = 0; var7 < var6; ++var7) {
               this.field2222[var5][var7] = var1.method1703();
               if (65535 == this.field2222[var5][var7]) {
                  this.field2222[var5][var7] = -1;
               }
            }
         }
      }

      if (0 == this.field2160) {
         this.field2180 = var1.method1703();
         this.field2176 = var1.method1654() == 1;
      }

      if (this.field2160 == 1) {
         var1.method1703();
         var1.method1654();
      }

      if (3 == this.field2160) {
         this.field2220 = var1.method1654() == 1;
      }

      if (4 == this.field2160 || 1 == this.field2160) {
         this.field2221 = var1.method1654();
         this.field2279 = var1.method1654();
         this.field2254 = var1.method1654();
         this.field2263 = var1.method1703();
         if (this.field2263 == 65535) {
            this.field2263 = -1;
         }

         this.field2148 = var1.method1654() == 1;
      }

      if (this.field2160 == 4) {
         this.field2218 = var1.method1662();
         this.field2146 = var1.method1662();
      }

      if (this.field2160 == 1 || 3 == this.field2160 || this.field2160 == 4) {
         this.field2181 = var1.method1658();
      }

      if (this.field2160 == 3 || 4 == this.field2160) {
         this.field2182 = var1.method1658();
         this.field2185 = var1.method1658();
         this.field2228 = var1.method1658();
      }

      if (5 == this.field2160) {
         this.field2244 = var1.method1658();
         this.field2192 = var1.method1658();
      }

      if (6 == this.field2160) {
         this.field2200 = 1;
         this.field2201 = var1.method1703();
         if (65535 == this.field2201) {
            this.field2201 = -1;
         }

         this.field2202 = 1;
         this.field2203 = var1.method1703();
         if (65535 == this.field2203) {
            this.field2203 = -1;
         }

         this.field2204 = var1.method1703();
         if (this.field2204 == 65535) {
            this.field2204 = -1;
         }

         this.field2278 = var1.method1703();
         if (65535 == this.field2278) {
            this.field2278 = -1;
         }

         this.field2211 = var1.method1703();
         this.field2208 = var1.method1703();
         this.field2226 = var1.method1703();
      }

      if (8 == this.field2160) {
         this.field2218 = var1.method1662();
      }

      if (2 == this.field2161) {
         this.field2240 = var1.method1662();
         this.field2266 = var1.method1662();
         var5 = var1.method1703() & 63;
         this.field2229 |= var5 << 11;
      }

      if (1 == this.field2161 || this.field2161 == 4 || this.field2161 == 5 || 6 == this.field2161) {
         this.field2209 = var1.method1662();
         if (this.field2209.length() == 0) {
            if (this.field2161 == 1) {
               this.field2209 = class424.field3005;
            }

            if (this.field2161 == 4) {
               this.field2209 = class424.field3283;
            }

            if (this.field2161 == 5) {
               this.field2209 = class424.field3283;
            }

            if (6 == this.field2161) {
               this.field2209 = class424.field3007;
            }
         }
      }

      if (1 == this.field2161 || this.field2161 == 4 || 5 == this.field2161) {
         this.field2229 |= 4194304;
      }

      if (this.field2161 == 6) {
         this.field2229 |= 1;
      }

   }

   void method1448(class366 var1) {
      var1.method1654();
      this.field2238 = true;
      this.field2160 = var1.method1654();
      this.field2184 = var1.method1703();
      this.field2167 = var1.method1656();
      this.field2168 = var1.method1656();
      this.field2169 = var1.method1703();
      if (9 == this.field2160) {
         this.field2170 = var1.method1656();
      } else {
         this.field2170 = var1.method1703();
      }

      this.field2165 = var1.method1655();
      this.field2166 = var1.method1655();
      this.field2163 = var1.method1655();
      this.field2164 = var1.method1655();
      this.field2175 = var1.method1703();
      if (65535 == this.field2175) {
         this.field2175 = -1;
      } else {
         this.field2175 += this.field2158 & -65536;
      }

      this.field2176 = var1.method1654() == 1;
      if (this.field2160 == 0) {
         this.field2245 = var1.method1703();
         this.field2180 = var1.method1703();
         this.field2300 = var1.method1654() == 1;
      }

      if (5 == this.field2160) {
         this.field2244 = var1.method1658();
         this.field2194 = var1.method1703();
         this.field2195 = var1.method1654() == 1;
         this.field2179 = var1.method1654();
         this.field2196 = var1.method1654();
         this.field2197 = var1.method1658();
         this.field2198 = var1.method1654() == 1;
         this.field2199 = var1.method1654() == 1;
      }

      if (this.field2160 == 6) {
         this.field2200 = 1;
         this.field2201 = var1.method1703();
         if (this.field2201 == 65535) {
            this.field2201 = -1;
         }

         this.field2206 = var1.method1656();
         this.field2280 = var1.method1656();
         this.field2208 = var1.method1703();
         this.field2226 = var1.method1703();
         this.field2273 = var1.method1703();
         this.field2211 = var1.method1703();
         this.field2204 = var1.method1703();
         if (this.field2204 == 65535) {
            this.field2204 = -1;
         }

         this.field2231 = var1.method1654() == 1;
         var1.method1703();
         if (0 != this.field2165) {
            this.field2212 = var1.method1703();
         }

         if (0 != this.field2166) {
            var1.method1703();
         }
      }

      if (this.field2160 == 4) {
         this.field2263 = var1.method1703();
         if (this.field2263 == 65535) {
            this.field2263 = -1;
         }

         this.field2218 = var1.method1662();
         this.field2254 = var1.method1654();
         this.field2221 = var1.method1654();
         this.field2279 = var1.method1654();
         this.field2148 = var1.method1654() == 1;
         this.field2181 = var1.method1658();
      }

      if (3 == this.field2160) {
         this.field2181 = var1.method1658();
         this.field2220 = var1.method1654() == 1;
         this.field2179 = var1.method1654();
      }

      if (9 == this.field2160) {
         this.field2189 = var1.method1654();
         this.field2181 = var1.method1658();
         this.field2190 = var1.method1654() == 1;
      }

      this.field2229 = var1.method1710();
      this.field2162 = var1.method1662();
      int var3 = var1.method1654();
      if (var3 > 0) {
         this.field2236 = new String[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.field2236[var4] = var1.method1662();
         }
      }

      this.field2171 = var1.method1654();
      this.field2213 = var1.method1654();
      this.field2239 = var1.method1654() == 1;
      this.field2240 = var1.method1662();
      this.field2242 = this.method1449(var1);
      this.field2247 = this.method1449(var1);
      this.field2219 = this.method1449(var1);
      this.field2253 = this.method1449(var1);
      this.field2252 = this.method1449(var1);
      this.field2225 = this.method1449(var1);
      this.field2256 = this.method1449(var1);
      this.field2258 = this.method1449(var1);
      this.field2151 = this.method1449(var1);
      this.field2261 = this.method1449(var1);
      this.field2248 = this.method1449(var1);
      this.field2210 = this.method1449(var1);
      this.field2156 = this.method1449(var1);
      this.field2243 = this.method1449(var1);
      this.field2246 = this.method1449(var1);
      this.field2250 = this.method1449(var1);
      this.field2251 = this.method1449(var1);
      this.field2183 = this.method1449(var1);
      this.field2255 = this.method1450(var1);
      this.field2187 = this.method1450(var1);
      this.field2259 = this.method1450(var1);
   }

   Object[] method1449(class366 var1) {
      int var3 = var1.method1654();
      if (var3 == 0) {
         return null;
      } else {
         Object[] var4 = new Object[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = var1.method1654();
            if (var6 == 0) {
               var4[var5] = new Integer(var1.method1658());
            } else if (var6 == 1) {
               var4[var5] = var1.method1662();
            }
         }

         this.field2241 = true;
         return var4;
      }
   }

   int[] method1450(class366 var1) {
      int var3 = var1.method1654();
      if (var3 == 0) {
         return null;
      } else {
         int[] var4 = new int[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            var4[var5] = var1.method1658();
         }

         return var4;
      }
   }

   public class296 method1474(boolean var1, class36 var2) {
      field2157 = false;
      if (null != this.field2193) {
         class296 var4 = this.method1451(var2);
         if (var4 != null) {
            return var4;
         }
      }

      int var8;
      if (var1) {
         var8 = this.field2192;
      } else {
         var8 = this.field2244;
      }

      if (var8 == -1) {
         return null;
      } else {
         long var5 = ((long)this.field2197 << 40) + ((this.field2198 ? 1L : 0L) << 38) + ((long)this.field2196 << 36) + (long)var8 + ((this.field2199 ? 1L : 0L) << 39);
         class296 var7 = (class296)field2264.method1183(var5);
         if (var7 != null) {
            return var7;
         } else {
            var7 = class513.method2454(class103.field685, var8, 0);
            if (var7 == null) {
               field2157 = true;
               return null;
            } else {
               this.method1476(var7);
               field2264.method1182(var7, var5);
               return var7;
            }
         }
      }
   }

   class296 method1451(class36 var1) {
      if (!this.method1452()) {
         return this.method1475(var1);
      } else {
         String var3 = this.field2193 + (this.field2198 ? 1 : 0) + (this.field2199 ? 1 : 0) + this.field2196 + this.field2197;
         class296 var4 = (class296)field2267.method659(var3, (byte)2);
         if (var4 == null) {
            class296 var5 = this.method1475(var1);
            if (var5 != null) {
               var4 = var5.method1339();
               this.method1476(var4);
               field2267.method660(var3, var4);
            }
         }

         return var4;
      }
   }

   class296 method1475(class36 var1) {
      if (null != this.field2193 && var1 != null) {
         class259 var3 = (class259)field2155.method659(this.field2193, (byte)24);
         if (var3 == null) {
            var3 = new class259(this.field2193, var1);
            field2155.method660(this.field2193, var3);
         }

         return var3.method1204();
      } else {
         return null;
      }
   }

   boolean method1452() {
      return this.field2198 || this.field2199 || 0 != this.field2196 || this.field2197 != 0;
   }

   void method1476(class296 var1) {
      if (this.field2198) {
         var1.method1367();
      }

      if (this.field2199) {
         var1.method1343();
      }

      if (this.field2196 > 0) {
         var1.method1342(this.field2196);
      }

      if (this.field2196 >= 1) {
         var1.method1344(1);
      }

      if (this.field2196 >= 2) {
         var1.method1344(16777215);
      }

      if (0 != this.field2197) {
         var1.method1345(this.field2197);
      }

   }

   public class396 method1453() {
      field2157 = false;
      if (this.field2263 == -1) {
         return null;
      } else {
         class396 var2 = (class396)field2154.method1183((long)this.field2263);
         if (null != var2) {
            return var2;
         } else {
            var2 = class382.method1769(class103.field685, class279.field1952, this.field2263, 0);
            if (var2 != null) {
               field2154.method1182(var2, (long)this.field2263);
            } else {
               field2157 = true;
            }

            return var2;
         }
      }
   }

   public class485 method1454(class464 var1, int var2, boolean var3, class206 var4, class90 var5, class350 var6) {
      field2157 = false;
      int var8;
      int var9;
      if (var3) {
         var8 = this.field2202;
         var9 = this.field2203;
      } else {
         var8 = this.field2200;
         var9 = this.field2201;
      }

      if (var8 == 6) {
         if (null == var5) {
            return null;
         }

         var9 = var5.field615;
      }

      if (var8 == 0) {
         return null;
      } else if (var8 == 1 && var9 == -1) {
         return null;
      } else {
         if (null != var6 && var6.field2574 && var8 == 6) {
            var8 = 3;
         }

         long var10 = (long)(var9 + (var8 << 16));
         if (null != var6) {
            var10 |= var6.field2572 << 20;
         }

         class485 var12 = (class485)field2153.method1183(var10);
         if (var12 == null) {
            class327 var13 = null;
            int var14 = 64;
            int var15 = 768;
            switch (var8) {
               case 1:
                  var13 = class327.method1514(class525.field4174, var9, 0);
                  break;
               case 2:
                  var13 = class90.method359(var9).method348((class350)null);
                  break;
               case 3:
                  var13 = null != var4 ? var4.method1077() : null;
                  break;
               case 4:
                  class47 var16 = class47.method213(var9);
                  var13 = var16.method203(10);
                  var14 += var16.field403;
                  var15 += var16.field404;
               case 5:
               default:
                  break;
               case 6:
                  var13 = class90.method359(var9).method348(var6);
            }

            if (var13 == null) {
               field2157 = true;
               return null;
            }

            var12 = var13.method1510(var14, var15, -50, -10, -50);
            field2153.method1182(var12, var10);
         }

         if (null != var1) {
            var12 = var1.method2195(var12, var2);
         }

         return var12;
      }
   }

   public class536 method1455(boolean var1) {
      if (-1 == this.field2192) {
         var1 = false;
      }

      int var3 = var1 ? this.field2192 : this.field2244;
      if (var3 == -1) {
         return null;
      } else {
         long var4 = ((long)this.field2197 << 40) + ((long)this.field2196 << 36) + (long)var3 + ((this.field2198 ? 1L : 0L) << 38) + ((this.field2199 ? 1L : 0L) << 39);
         class536 var6 = (class536)field2147.method1183(var4);
         if (null != var6) {
            return var6;
         } else {
            class296 var7 = this.method1474(var1, (class36)null);
            if (var7 == null) {
               return null;
            } else {
               class296 var8 = var7.method1355();
               int[] var9 = new int[var8.field2028];
               int[] var10 = new int[var8.field2028];

               for(int var11 = 0; var11 < var8.field2028; ++var11) {
                  int var12 = 0;
                  int var13 = var8.field2032;

                  int var14;
                  for(var14 = 0; var14 < var8.field2032; ++var14) {
                     if (var8.field2031[var11 * var8.field2032 + var14] == 0) {
                        var12 = var14;
                        break;
                     }
                  }

                  for(var14 = var8.field2032 - 1; var14 >= var12; --var14) {
                     if (var8.field2031[var8.field2032 * var11 + var14] == 0) {
                        var13 = var14 + 1;
                        break;
                     }
                  }

                  var9[var11] = var12;
                  var10[var11] = var13 - var12;
               }

               var6 = new class536(var8.field2032, var8.field2028, var10, var9, var3);
               field2147.method1182(var6, var4);
               return var6;
            }
         }
      }
   }

   public void method1456(int var1, String var2) {
      if (this.field2236 == null || this.field2236.length <= var1) {
         String[] var4 = new String[var1 + 1];
         if (this.field2236 != null) {
            for(int var5 = 0; var5 < this.field2236.length; ++var5) {
               var4[var5] = this.field2236[var5];
            }
         }

         this.field2236 = var4;
      }

      this.field2236[var1] = var2;
   }

   public boolean method1457() {
      return !this.field2238 || 0 == this.field2160 || 11 == this.field2160 || this.field2241 || 1338 == this.field2184 || this.field2160 == 12;
   }

   public boolean method1458() {
      return 11 == this.field2160 || 12 == this.field2160;
   }

   public void method1481(String var1, class36 var2, long var3) {
      if (11 == this.field2160 && var3 != -1L) {
         var1 = var1.replaceAll("%userid%", Long.toString(var3));
         this.field2224 = new class505();
         if (!this.field2224.method2399(var1, var2)) {
            this.field2224 = null;
         } else {
            if (null == this.field2283 || this.field2260 == null) {
               this.method1482();
            }

         }
      }
   }

   public void method1479(String var1, class36 var2) {
      if (this.field2160 == 11 && null != var1) {
         this.field2224 = new class505();
         this.field2224.method2411(var1, var2);
      }
   }

   void method1482() {
      this.field2283 = new HashMap();
      this.field2260 = new HashMap();
   }

   public void method1477(int var1, int var2) {
      if (this.field2160 == 11) {
         if (this.field2283 == null) {
            this.method1482();
         }

         this.field2283.put(var1, var2);
      }
   }

   public void method1460(String var1, int var2) {
      if (11 == this.field2160) {
         if (this.field2260 == null) {
            this.method1482();
         }

         this.field2260.put(var1, var2);
      }
   }

   public boolean method1461(int var1, int var2, int var3, int var4) {
      if (11 == this.field2160 && null != this.field2224 && this.method1480()) {
         var1 -= var3;
         var2 -= var4;
         int var6 = (int)(this.field2224.method2403()[0] * (float)this.field2173);
         int var7 = (int)(this.field2224.method2403()[1] * (float)this.field2150);
         int var8 = var6 + (int)(this.field2224.method2403()[2] * (float)this.field2173);
         int var9 = var7 + (int)(this.field2224.method2403()[3] * (float)this.field2150);
         return var1 >= var6 && var2 >= var7 && var1 < var8 && var2 < var9;
      } else {
         return false;
      }
   }

   public boolean method1480() {
      return 2 == this.field2268;
   }

   public int method1462(String var1) {
      return 11 == this.field2160 && this.field2224 != null && this.method1480() ? this.field2224.method2401(var1) : -1;
   }

   public String method1463(String var1) {
      return this.field2160 == 11 && null != this.field2224 && this.method1480() ? this.field2224.method2415(var1) : null;
   }

   public int method1464() {
      return this.field2260 != null && this.field2260.size() > 0 ? 1 : 0;
   }

   public int method1465() {
      if (11 == this.field2160 && null != this.field2224 && null != this.field2260 && !this.field2260.isEmpty()) {
         String var2 = this.field2224.method2404();
         return var2 != null && this.field2260.containsKey(this.field2224.method2404()) ? (Integer)this.field2260.get(var2) : -1;
      } else {
         return -1;
      }
   }

   public String method1466() {
      if (11 == this.field2160 && null != this.field2224) {
         String var2 = this.field2224.method2404();
         Iterator var3 = this.field2224.method2405().iterator();

         while(var3.hasNext()) {
            class369 var4 = (class369)var3.next();
            String var5 = String.format("%%%S%%", var4.method1727());
            if (var4.method1730() == 0) {
               var2.replaceAll(var5, Integer.toString(var4.method1729()));
            } else {
               var2.replaceAll(var5, var4.method1728());
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   public int[] method1473() {
      if (this.field2160 == 11 && this.field2224 != null) {
         int[] var2 = new int[3];
         int var3 = 0;
         Iterator var4 = this.field2224.method2405().iterator();

         while(var4.hasNext()) {
            class369 var5 = (class369)var4.next();
            if (!var5.method1727().equals("user_id")) {
               if (var5.method1730() != 0) {
                  return null;
               }

               var2[var3++] = var5.method1729();
               if (var3 > 3) {
                  return null;
               }
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   public boolean method1478(class36 var1) {
      if (11 == this.field2160 && this.field2224 != null) {
         this.field2224.method2413(var1);
         if (this.field2224.method2400() != this.field2268) {
            this.field2268 = this.field2224.method2400();
            if (this.field2268 >= 100) {
               return true;
            }

            if (this.field2268 == 2) {
               this.method1467();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   void method1467() {
      this.field2300 = true;
      ArrayList var2 = this.field2224.method2402();
      ArrayList var3 = this.field2224.method2416();
      int var4 = var2.size() + var3.size();
      this.field2290 = new class322[var4];
      int var5 = 0;

      Iterator var6;
      float[] var10;
      class322 var11;
      for(var6 = var2.iterator(); var6.hasNext(); this.field2290[var5++] = var11) {
         class27 var7 = (class27)var6.next();
         var10 = var7.field265;
         var11 = new class322();
         var11.field2160 = 5;
         var11.field2175 = this.field2158;
         var11.field2277 = var5;
         var11.field2238 = true;
         var11.field2163 = 0;
         var11.field2164 = 0;
         var11.field2165 = 0;
         var11.field2166 = 0;
         var11.field2167 = (int)(var10[0] * (float)this.field2173);
         var11.field2168 = (int)(var10[1] * (float)this.field2150);
         var11.field2169 = (int)(var10[2] * (float)this.field2173);
         var11.field2170 = (int)((float)this.field2150 * var10[3]);
         var11.field2193 = var7.field264.method1087();
         class259 var12 = new class259(var7.field264);
         field2155.method660(var11.field2193, var12);
      }

      for(var6 = var3.iterator(); var6.hasNext(); this.field2290[var5++] = var11) {
         class394 var13 = (class394)var6.next();
         var10 = var13.field2758;
         var11 = new class322();
         var11.field2160 = 4;
         var11.field2175 = this.field2158;
         var11.field2277 = var5;
         var11.field2238 = true;
         var11.field2163 = 0;
         var11.field2164 = 0;
         var11.field2165 = 0;
         var11.field2166 = 0;
         var11.field2167 = (int)(var10[0] * (float)this.field2173);
         var11.field2168 = (int)(var10[1] * (float)this.field2150);
         var11.field2169 = (int)((float)this.field2173 * var10[2]);
         var11.field2170 = (int)(var10[3] * (float)this.field2150);
         var11.field2218 = var13.field2762;
         var11.field2263 = (Integer)this.field2283.get(var13.field2757);
         var11.field2221 = var13.field2759;
         var11.field2279 = var13.field2760;
      }

   }

   public void method1468() {
      this.field2235 = new class200();

      for(int var2 = 1; var2 <= 12; ++var2) {
         this.field2235.field1555.method638(var2, 0);
      }

      for(char var3 = 0; var3 < ' '; ++var3) {
         this.field2235.field1555.method641(var3, 0);
      }

      this.field2235.field1555.method641('\u0080', 0);
      this.field2235.field1555.method638(82, 2);
      this.field2235.field1555.method638(81, 2);
      this.field2235.field1555.method638(86, 2);
   }

   public class173 method1483() {
      return null != this.field2235 ? this.field2235.field1552 : null;
   }

   public class326 method1469() {
      return null != this.field2235 ? this.field2235.field1550 : null;
   }

   public class166 method1459() {
      return null != this.field2235 ? this.field2235.field1555 : null;
   }

   public class200 method1470() {
      return this.field2235;
   }

   boolean method1471(class173 var1) {
      boolean var3 = false;
      if (this.field2218 != null && !this.field2218.isEmpty()) {
         var3 |= var1.method733(class447.method2084(this.field2218));
         this.field2218 = "";
      }

      if (null != this.field2146 && !this.field2146.isEmpty()) {
         var3 |= var1.method666(class447.method2084(this.field2146));
         this.field2146 = "";
      }

      return var3;
   }

   public boolean method1472() {
      class173 var2 = this.method1483();
      if (var2 == null) {
         return false;
      } else {
         boolean var3 = false;
         if (!var2.method706() && this.field2263 != -1) {
            int var4 = var2.method707();
            int var5 = var2.method732();
            int var6 = var2.method705();
            int var7 = var2.method704();
            class396 var8 = this.method1453();
            if (var8 != null) {
               var3 |= var2.method667(var8);
               var3 |= this.method1471(var2);
               var3 |= var2.method672(var4, var5);
               var3 |= var2.method683(var6, var7);
            }
         } else if (var2.method706()) {
            var3 |= this.method1471(var2);
         }

         var2.method663();
         return var3;
      }
   }

   public static class322 method1488(int var0) {
      int var2 = var0 >> 16;
      int var3 = var0 & '\uffff';
      if (null == class53.field436[var2] || class53.field436[var2][var3] == null) {
         boolean var4 = method1492(var2);
         if (!var4) {
            return null;
         }
      }

      return class53.field436[var2][var3];
   }

   public static class322 method1485(int var0, int var1) {
      class322 var3 = method1488(var0);
      if (var1 == -1) {
         return var3;
      } else {
         return var3 != null && var3.field2290 != null && var1 < var3.field2290.length ? var3.field2290[var1] : null;
      }
   }

   public static boolean method1492(int var0) {
      if (class364.field2616[var0]) {
         return true;
      } else if (!class399.field2774.method2426(var0)) {
         return false;
      } else {
         int var2 = class399.field2774.method2448(var0);
         if (var2 == 0) {
            class364.field2616[var0] = true;
            return true;
         } else {
            if (null == class53.field436[var0]) {
               class53.field436[var0] = new class322[var2];
            }

            for(int var3 = 0; var3 < var2; ++var3) {
               if (null == class53.field436[var0][var3]) {
                  byte[] var4 = class399.field2774.method2422(var0, var3);
                  if (null != var4) {
                     class53.field436[var0][var3] = new class322();
                     class53.field436[var0][var3].field2158 = var3 + (var0 << 16);
                     if (var4[0] == -1) {
                        class53.field436[var0][var3].method1448(new class366(var4));
                     } else {
                        class53.field436[var0][var3].method1447(new class366(var4));
                     }
                  }
               }
            }

            class364.field2616[var0] = true;
            return true;
         }
      }
   }

   public static void method1490(int var0) {
      if (var0 != -1) {
         if (class364.field2616[var0]) {
            class399.field2774.method2436(var0);
            if (null != class53.field436[var0]) {
               for(int var2 = 0; var2 < class53.field436[var0].length; ++var2) {
                  if (null != class53.field436[var0][var2]) {
                     class53.field436[var0][var2] = null;
                  }
               }

               class53.field436[var0] = null;
               class364.field2616[var0] = false;
            }
         }
      }
   }

   public static void method1491() {
      field2264.method1180();
      field2153.method1180();
      field2154.method1180();
      field2147.method1180();
   }

   public static void method1489(class322 var0, int var1, int var2) {
      class206 var4 = var0.field2214;
      boolean var5 = var4.field1583 != var2;
      var4.field1583 = var2;
      if (var5) {
         int var6;
         int var7;
         if (var4.field1583 == var1) {
            for(var6 = 0; var6 < class206.field1590.length; ++var6) {
               var7 = class206.field1590[var6];
               if (var4.field1581[var7] > 0 && var4.field1581[var7] < 512) {
                  var4.field1581[var7] = var4.field1594[var7];
               }
            }
         } else {
            if (var4.field1581[0] < 512 || method1486(var4)) {
               var4.field1581[class252.field1834.field1830] = 1;
            }

            for(var6 = 0; var6 < 7; ++var6) {
               var7 = class206.field1590[var6];
               if (var4.field1581[var7] > 0 && var4.field1581[var7] < 512) {
                  int[] var8 = var4.field1581;

                  for(int var9 = 0; var9 < class21.field218; ++var9) {
                     class21 var10 = class21.method117(var9);
                     if (null != var10 && !var10.field225 && var6 + (var2 == 1 ? 7 : 0) == var10.field219) {
                        var8[class206.field1590[var6]] = var9 + 256;
                        break;
                     }
                  }
               }
            }
         }
      }

      var4.method1079();
   }

   static boolean method1486(class206 var0) {
      if (var0.field1581[0] < 512) {
         return false;
      } else {
         class47 var2 = class47.method213(var0.field1581[0] - 512);
         return class252.field1834.field1830 != var2.field362 && var2.field378 != class252.field1834.field1830;
      }
   }

   public static void method1487(class322 var0, int var1, int var2) {
      var0.field2214.field1582[var1] = var2;
      var0.field2214.method1079();
   }

   public static void method1484(class322 var0, int var1) {
      class47 var3 = class47.method213(var1);
      var0.field2214.field1581[var3.field377] = var1 + 512;
      if (-1 != var3.field362) {
         var0.field2214.field1581[var3.field362] = 0;
      }

      if (-1 != var3.field378) {
         var0.field2214.field1581[var3.field378] = 0;
      }

      var0.field2214.method1079();
   }
}
