public class class71 extends class151 {
   public static boolean field1140;
   public static class298 field1139;
   public static class364 field1141 = new class364(64);
   public static class364 field1143 = new class364(200);
   public static class364 field1186 = new class364(50);
   static int[] field1192;
   class197 field1187;
   int field1144;
   int field1145;
   int field1153;
   int field1163;
   int field1164;
   int field1165;
   int field1166;
   int field1167;
   int field1168;
   int field1169;
   int field1170;
   int field1171;
   int field1172;
   int field1174;
   int field1175;
   int field1180;
   int field1181;
   int field1182;
   int field1189;
   int field1190;
   int[] field1176;
   int[] field1177;
   public boolean field1148;
   public boolean field1188;
   public int field1136;
   public int field1137;
   public int field1138;
   public int field1142;
   public int field1146;
   public int field1150;
   public int field1151;
   public int field1152;
   public int field1154;
   public int field1155;
   public int field1156;
   public int field1157;
   public int field1158;
   public int field1159;
   public int field1178;
   public int field1183;
   public int field1184;
   public int field1185;
   public int field1191;
   public String field1160;
   public String[] field1161;
   public String[] field1162;
   public short[] field1147;
   public short[] field1149;
   public short[] field1173;
   public short[] field1179;

   class71() {
      this.field1160 = class27.field544;
      this.field1159 = 2000;
      this.field1136 = 0;
      this.field1152 = 0;
      this.field1138 = 0;
      this.field1137 = 0;
      this.field1154 = 0;
      this.field1155 = 0;
      this.field1156 = 1;
      this.field1157 = -1;
      this.field1142 = -1;
      this.field1158 = -1;
      this.field1148 = false;
      this.field1161 = new String[]{null, null, class27.field397, null, null};
      this.field1162 = new String[]{null, null, null, null, class27.field406};
      this.field1163 = -2;
      this.field1190 = -1;
      this.field1165 = -1;
      this.field1166 = 0;
      this.field1167 = -1;
      this.field1168 = -1;
      this.field1169 = 0;
      this.field1189 = -1;
      this.field1171 = -1;
      this.field1170 = -1;
      this.field1174 = -1;
      this.field1153 = -1;
      this.field1175 = -1;
      this.field1178 = -1;
      this.field1151 = -1;
      this.field1180 = 128;
      this.field1181 = 128;
      this.field1182 = 128;
      this.field1183 = 0;
      this.field1184 = 0;
      this.field1185 = 0;
      this.field1146 = 0;
      this.field1188 = false;
      this.field1164 = -1;
      this.field1172 = -1;
      this.field1150 = -1;
      this.field1191 = -1;
   }

   void method678() {
      if (this.field1155 == 1) {
         this.field1146 = 0;
      }

   }

   void method666(class184 var1) {
      while(true) {
         int var3 = var1.method1125();
         if (var3 == 0) {
            return;
         }

         this.method662(var1, var3);
      }
   }

   void method662(class184 var1, int var2) {
      if (var2 == 1) {
         this.field1145 = var1.method1174();
      } else if (var2 == 2) {
         this.field1160 = var1.method1133();
      } else if (var2 == 4) {
         this.field1159 = var1.method1174();
      } else if (var2 == 5) {
         this.field1136 = var1.method1174();
      } else if (var2 == 6) {
         this.field1152 = var1.method1174();
      } else if (var2 == 7) {
         this.field1137 = var1.method1174();
         if (this.field1137 > 32767) {
            this.field1137 -= 65536;
         }
      } else if (var2 == 8) {
         this.field1154 = var1.method1174();
         if (this.field1154 > 32767) {
            this.field1154 -= 65536;
         }
      } else if (var2 == 9) {
         var1.method1133();
      } else if (var2 == 11) {
         this.field1155 = 1;
      } else if (var2 == 12) {
         this.field1156 = var1.method1129();
      } else if (var2 == 13) {
         this.field1157 = var1.method1125();
      } else if (var2 == 14) {
         this.field1142 = var1.method1125();
      } else if (var2 == 16) {
         this.field1148 = true;
      } else if (var2 == 23) {
         this.field1190 = var1.method1174();
         this.field1166 = var1.method1125();
      } else if (var2 == 24) {
         this.field1165 = var1.method1174();
      } else if (var2 == 25) {
         this.field1167 = var1.method1174();
         this.field1169 = var1.method1125();
      } else if (var2 == 26) {
         this.field1168 = var1.method1174();
      } else if (var2 == 27) {
         this.field1158 = var1.method1125();
      } else if (var2 >= 30 && var2 < 35) {
         this.field1161[var2 - 30] = var1.method1133();
         if (this.field1161[var2 - 30].equalsIgnoreCase(class27.field486)) {
            this.field1161[var2 - 30] = null;
         }
      } else if (var2 >= 35 && var2 < 40) {
         this.field1162[var2 - 35] = var1.method1133();
      } else {
         int var4;
         int var5;
         if (var2 == 40) {
            var4 = var1.method1125();
            this.field1179 = new short[var4];
            this.field1147 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1179[var5] = (short)var1.method1174();
               this.field1147[var5] = (short)var1.method1174();
            }
         } else if (var2 == 41) {
            var4 = var1.method1125();
            this.field1173 = new short[var4];
            this.field1149 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field1173[var5] = (short)var1.method1174();
               this.field1149[var5] = (short)var1.method1174();
            }
         } else if (var2 == 42) {
            this.field1163 = var1.method1126();
         } else if (var2 == 65) {
            this.field1188 = true;
         } else if (var2 == 75) {
            this.field1146 = var1.method1127();
         } else if (var2 == 78) {
            this.field1189 = var1.method1174();
         } else if (var2 == 79) {
            this.field1171 = var1.method1174();
         } else if (var2 == 90) {
            this.field1170 = var1.method1174();
         } else if (var2 == 91) {
            this.field1153 = var1.method1174();
         } else if (var2 == 92) {
            this.field1174 = var1.method1174();
         } else if (var2 == 93) {
            this.field1175 = var1.method1174();
         } else if (var2 == 94) {
            var1.method1174();
         } else if (var2 == 95) {
            this.field1138 = var1.method1174();
         } else if (var2 == 97) {
            this.field1178 = var1.method1174();
         } else if (var2 == 98) {
            this.field1151 = var1.method1174();
         } else if (var2 >= 100 && var2 < 110) {
            if (this.field1176 == null) {
               this.field1176 = new int[10];
               this.field1177 = new int[10];
            }

            this.field1176[var2 - 100] = var1.method1174();
            this.field1177[var2 - 100] = var1.method1174();
         } else if (var2 == 110) {
            this.field1180 = var1.method1174();
         } else if (var2 == 111) {
            this.field1181 = var1.method1174();
         } else if (var2 == 112) {
            this.field1182 = var1.method1174();
         } else if (var2 == 113) {
            this.field1183 = var1.method1126();
         } else if (var2 == 114) {
            this.field1184 = var1.method1126() * 5;
         } else if (var2 == 115) {
            this.field1185 = var1.method1125();
         } else if (var2 == 139) {
            this.field1164 = var1.method1174();
         } else if (var2 == 140) {
            this.field1172 = var1.method1174();
         } else if (var2 == 148) {
            this.field1150 = var1.method1174();
         } else if (var2 == 149) {
            this.field1191 = var1.method1174();
         } else if (var2 == 249) {
            this.field1187 = class83.method717(var1, this.field1187);
         }
      }

   }

   void method663(class71 var1, class71 var2) {
      this.field1145 = var1.field1145;
      this.field1159 = var1.field1159;
      this.field1136 = var1.field1136;
      this.field1152 = var1.field1152;
      this.field1138 = var1.field1138;
      this.field1137 = var1.field1137;
      this.field1154 = var1.field1154;
      this.field1179 = var1.field1179;
      this.field1147 = var1.field1147;
      this.field1173 = var1.field1173;
      this.field1149 = var1.field1149;
      this.field1160 = var2.field1160;
      this.field1148 = var2.field1148;
      this.field1156 = var2.field1156;
      this.field1155 = 1;
   }

   void method677(class71 var1, class71 var2) {
      this.field1145 = var1.field1145;
      this.field1159 = var1.field1159;
      this.field1136 = var1.field1136;
      this.field1152 = var1.field1152;
      this.field1138 = var1.field1138;
      this.field1137 = var1.field1137;
      this.field1154 = var1.field1154;
      this.field1179 = var2.field1179;
      this.field1147 = var2.field1147;
      this.field1173 = var2.field1173;
      this.field1149 = var2.field1149;
      this.field1160 = var2.field1160;
      this.field1148 = var2.field1148;
      this.field1155 = var2.field1155;
      this.field1157 = var2.field1157;
      this.field1142 = var2.field1142;
      this.field1158 = var2.field1158;
      this.field1190 = var2.field1190;
      this.field1165 = var2.field1165;
      this.field1189 = var2.field1189;
      this.field1167 = var2.field1167;
      this.field1168 = var2.field1168;
      this.field1171 = var2.field1171;
      this.field1170 = var2.field1170;
      this.field1174 = var2.field1174;
      this.field1153 = var2.field1153;
      this.field1175 = var2.field1175;
      this.field1185 = var2.field1185;
      this.field1161 = var2.field1161;
      this.field1146 = var2.field1146;
      this.field1162 = new String[5];
      if (null != var2.field1162) {
         for(int var4 = 0; var4 < 4; ++var4) {
            this.field1162[var4] = var2.field1162[var4];
         }
      }

      this.field1162[4] = class27.field272;
      this.field1156 = 0;
   }

   void method665(class71 var1, class71 var2) {
      this.field1145 = var1.field1145;
      this.field1159 = var1.field1159;
      this.field1136 = var1.field1136;
      this.field1152 = var1.field1152;
      this.field1138 = var1.field1138;
      this.field1137 = var1.field1137;
      this.field1154 = var1.field1154;
      this.field1179 = var1.field1179;
      this.field1147 = var1.field1147;
      this.field1173 = var1.field1173;
      this.field1149 = var1.field1149;
      this.field1155 = var1.field1155;
      this.field1160 = var2.field1160;
      this.field1156 = 0;
      this.field1148 = false;
      this.field1188 = false;
   }

   public final class533 method672(int var1) {
      int var4;
      if (null != this.field1176 && var1 > 1) {
         int var3 = -1;

         for(var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field1177[var4] && this.field1177[var4] != 0) {
               var3 = this.field1176[var4];
            }
         }

         if (var3 != -1) {
            return method682(var3).method672(1);
         }
      }

      class533 var5 = class533.method2538(field1139, this.field1145, 0);
      if (null == var5) {
         return null;
      } else {
         if (this.field1180 != 128 || this.field1181 != 128 || this.field1182 != 128) {
            var5.method2529(this.field1180, this.field1181, this.field1182);
         }

         if (this.field1179 != null) {
            for(var4 = 0; var4 < this.field1179.length; ++var4) {
               var5.method2537(this.field1179[var4], this.field1147[var4]);
            }
         }

         if (null != this.field1173) {
            for(var4 = 0; var4 < this.field1173.length; ++var4) {
               var5.method2528(this.field1173[var4], this.field1149[var4]);
            }
         }

         return var5;
      }
   }

   public final class104 method667(int var1) {
      if (null != this.field1176 && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field1177[var4] && this.field1177[var4] != 0) {
               var3 = this.field1176[var4];
            }
         }

         if (var3 != -1) {
            return method682(var3).method667(1);
         }
      }

      class104 var6 = (class104)field1186.method1851((long)this.field1144);
      if (var6 != null) {
         return var6;
      } else {
         class533 var7 = class533.method2538(field1139, this.field1145, 0);
         if (var7 == null) {
            return null;
         } else {
            if (this.field1180 != 128 || this.field1181 != 128 || this.field1182 != 128) {
               var7.method2529(this.field1180, this.field1181, this.field1182);
            }

            int var5;
            if (null != this.field1179) {
               for(var5 = 0; var5 < this.field1179.length; ++var5) {
                  var7.method2537(this.field1179[var5], this.field1147[var5]);
               }
            }

            if (null != this.field1173) {
               for(var5 = 0; var5 < this.field1173.length; ++var5) {
                  var7.method2528(this.field1173[var5], this.field1149[var5]);
               }
            }

            var6 = var7.method2534(this.field1183 + 64, this.field1184 + 768, -50, -10, -50);
            var6.field1353 = true;
            field1186.method1850(var6, (long)this.field1144);
            return var6;
         }
      }
   }

   public class71 method668(int var1) {
      if (null != this.field1176 && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field1177[var4] && this.field1177[var4] != 0) {
               var3 = this.field1176[var4];
            }
         }

         if (var3 != -1) {
            return method682(var3);
         }
      }

      return this;
   }

   public final boolean method669(int var1) {
      int var3 = this.field1190;
      int var4 = this.field1165;
      int var5 = this.field1189;
      if (var1 == 1) {
         var3 = this.field1167;
         var4 = this.field1168;
         var5 = this.field1171;
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var6 = true;
         if (!field1139.method1631(var3, 0)) {
            var6 = false;
         }

         if (var4 != -1 && !field1139.method1631(var4, 0)) {
            var6 = false;
         }

         if (var5 != -1 && !field1139.method1631(var5, 0)) {
            var6 = false;
         }

         return var6;
      }
   }

   public final class533 method670(int var1) {
      int var3 = this.field1190;
      int var4 = this.field1165;
      int var5 = this.field1189;
      if (var1 == 1) {
         var3 = this.field1167;
         var4 = this.field1168;
         var5 = this.field1171;
      }

      if (var3 == -1) {
         return null;
      } else {
         class533 var6 = class533.method2538(field1139, var3, 0);
         if (var4 != -1) {
            class533 var7 = class533.method2538(field1139, var4, 0);
            if (var5 != -1) {
               class533 var8 = class533.method2538(field1139, var5, 0);
               class533[] var9 = new class533[]{var6, var7, var8};
               var6 = new class533(var9, 3);
            } else {
               class533[] var11 = new class533[]{var6, var7};
               var6 = new class533(var11, 2);
            }
         }

         if (var1 == 0 && this.field1166 != 0) {
            var6.method2526(0, this.field1166, 0);
         }

         if (var1 == 1 && this.field1169 != 0) {
            var6.method2526(0, this.field1169, 0);
         }

         int var10;
         if (this.field1179 != null) {
            for(var10 = 0; var10 < this.field1179.length; ++var10) {
               var6.method2537(this.field1179[var10], this.field1147[var10]);
            }
         }

         if (this.field1173 != null) {
            for(var10 = 0; var10 < this.field1173.length; ++var10) {
               var6.method2528(this.field1173[var10], this.field1149[var10]);
            }
         }

         return var6;
      }
   }

   public final boolean method671(int var1) {
      int var3 = this.field1170;
      int var4 = this.field1174;
      if (var1 == 1) {
         var3 = this.field1153;
         var4 = this.field1175;
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if (!field1139.method1631(var3, 0)) {
            var5 = false;
         }

         if (var4 != -1 && !field1139.method1631(var4, 0)) {
            var5 = false;
         }

         return var5;
      }
   }

   public final class533 method674(int var1) {
      int var3 = this.field1170;
      int var4 = this.field1174;
      if (var1 == 1) {
         var3 = this.field1153;
         var4 = this.field1175;
      }

      if (var3 == -1) {
         return null;
      } else {
         class533 var5 = class533.method2538(field1139, var3, 0);
         if (var4 != -1) {
            class533 var6 = class533.method2538(field1139, var4, 0);
            class533[] var7 = new class533[]{var5, var6};
            var5 = new class533(var7, 2);
         }

         int var8;
         if (this.field1179 != null) {
            for(var8 = 0; var8 < this.field1179.length; ++var8) {
               var5.method2537(this.field1179[var8], this.field1147[var8]);
            }
         }

         if (null != this.field1173) {
            for(var8 = 0; var8 < this.field1173.length; ++var8) {
               var5.method2528(this.field1173[var8], this.field1149[var8]);
            }
         }

         return var5;
      }
   }

   public int method673(int var1, int var2) {
      return class83.method716(this.field1187, var1, var2);
   }

   public String method664(int var1, String var2) {
      class197 var5 = this.field1187;
      String var4;
      if (null == var5) {
         var4 = var2;
      } else {
         class183 var6 = (class183)var5.method1222((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = (String)var6.field1815;
         }
      }

      return var4;
   }

   public int method675() {
      if (this.field1163 != -1 && null != this.field1162) {
         if (this.field1163 >= 0) {
            return this.field1162[this.field1163] != null ? this.field1163 : -1;
         } else {
            return class27.field406.equalsIgnoreCase(this.field1162[4]) ? 4 : -1;
         }
      } else {
         return -1;
      }
   }

   boolean method679() {
      return this.field1147 != null;
   }

   boolean method676() {
      return this.field1149 != null;
   }

   public static class71 method682(int var0) {
      class71 var2 = (class71)field1141.method1851((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class162.field1690.method1629(10, var0);
         var2 = new class71();
         var2.field1144 = var0;
         if (null != var3) {
            var2.method666(new class184(var3));
         }

         var2.method678();
         if (var2.field1151 != -1) {
            var2.method663(method682(var2.field1151), method682(var2.field1178));
         }

         if (var2.field1172 != -1) {
            var2.method677(method682(var2.field1172), method682(var2.field1164));
         }

         if (var2.field1191 != -1) {
            var2.method665(method682(var2.field1191), method682(var2.field1150));
         }

         if (!field1140 && var2.field1148) {
            if (var2.field1151 == -1 && var2.field1172 == -1 && var2.field1191 == -1) {
               var2.field1160 = var2.field1160 + class27.field463;
            }

            var2.field1188 = false;

            int var4;
            for(var4 = 0; var4 < var2.field1161.length; ++var4) {
               var2.field1161[var4] = null;
            }

            for(var4 = 0; var4 < var2.field1162.length; ++var4) {
               if (var4 != 4) {
                  var2.field1162[var4] = null;
               }
            }

            var2.field1163 = -2;
            var2.field1185 = 0;
            if (null != var2.field1187) {
               boolean var7 = false;

               for(class55 var5 = var2.field1187.method1224(); var5 != null; var5 = var2.field1187.method1225()) {
                  class206 var6 = class206.method1260((int)var5.field1078);
                  if (var6.field1942) {
                     var5.method605();
                  } else {
                     var7 = true;
                  }
               }

               if (!var7) {
                  var2.field1187 = null;
               }
            }
         }

         field1141.method1850(var2, (long)var0);
         return var2;
      }
   }

   public static final class427 method680(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if (var1 == -1) {
         var4 = 0;
      } else if (var4 == 2 && var1 != 1) {
         var4 = 1;
      }

      long var7 = ((long)var4 << 40) + ((long)var2 << 38) + ((long)var1 << 16) + (long)var0 + ((long)var3 << 42);
      class427 var9;
      if (!var5) {
         var9 = (class427)field1143.method1851(var7);
         if (var9 != null) {
            return var9;
         }
      }

      class71 var10 = method682(var0);
      if (var1 > 1 && null != var10.field1176) {
         int var11 = -1;

         for(int var12 = 0; var12 < 10; ++var12) {
            if (var1 >= var10.field1177[var12] && var10.field1177[var12] != 0) {
               var11 = var10.field1176[var12];
            }
         }

         if (var11 != -1) {
            var10 = method682(var11);
         }
      }

      class104 var23 = var10.method667(1);
      if (var23 == null) {
         return null;
      } else {
         class427 var24 = null;
         if (var10.field1151 != -1) {
            var24 = method680(var10.field1178, 10, 1, 0, 0, true);
            if (null == var24) {
               return null;
            }
         } else if (var10.field1172 != -1) {
            var24 = method680(var10.field1164, var1, var2, var3, 0, false);
            if (var24 == null) {
               return null;
            }
         } else if (var10.field1191 != -1) {
            var24 = method680(var10.field1150, var1, 0, 0, 0, false);
            if (null == var24) {
               return null;
            }
         }

         int[] var13 = class156.field1650;
         int var14 = class156.field1648;
         int var15 = class156.field1649;
         float[] var16 = class156.field1651;
         int[] var17 = new int[4];
         class156.method950(var17);
         var9 = new class427(36, 32);
         class399.method1943(var9.field3236, 36, 32, (float[])null);
         class156.method951();
         class399.method1944();
         class399.method1955(16, 16);
         class399.field3111.field2238 = false;
         if (var10.field1191 != -1) {
            var24.method2032(0, 0);
         }

         int var18 = var10.field1159;
         if (var5) {
            var18 = (int)((double)var18 * 1.5);
         } else if (var2 == 2) {
            var18 = (int)((double)var18 * 1.04);
         }

         int var19 = class399.field3109[var10.field1136] * var18 >> 16;
         int var20 = class399.field3107[var10.field1136] * var18 >> 16;
         var23.method758();
         var23.method764(0, var10.field1152, var10.field1138, var10.field1136, var10.field1137, var19 + var23.field3926 / 2 + var10.field1154, var10.field1154 + var20);
         if (var10.field1172 != -1) {
            var24.method2032(0, 0);
         }

         if (var2 >= 1) {
            var9.method2010(1);
         }

         if (var2 >= 2) {
            var9.method2010(16777215);
         }

         if (var3 != 0) {
            var9.method2011(var3);
         }

         class399.method1943(var9.field3236, 36, 32, (float[])null);
         if (var10.field1151 != -1) {
            var24.method2032(0, 0);
         }

         if (var4 == 1 || var4 == 2 && var10.field1155 == 1) {
            class460 var21 = class241.field2192;
            String var22;
            if (var1 < 100000) {
               var22 = "<col=ffff00>" + var1 + "</col>";
            } else if (var1 < 10000000) {
               var22 = "<col=ffffff>" + var1 / 1000 + class27.field412 + "</col>";
            } else {
               var22 = "<col=00ff80>" + var1 / 1000000 + class27.field410 + "</col>";
            }

            var21.method1594(var22, 0, 9, 16776960, 1);
         }

         if (!var5) {
            field1143.method1850(var9, var7);
         }

         class399.method1943(var13, var14, var15, var16);
         class156.method970(var17);
         class399.method1944();
         class399.field3111.field2238 = true;
         return var9;
      }
   }

   public static void method681() {
      field1143.method1848();
   }
}
