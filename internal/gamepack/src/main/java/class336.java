public class class336 {
   static class169 field2515;

   class336() throws Throwable {
   }

   static char method1569(char var0, class103 var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (var0 == 199) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (var0 == 209 && var1 != class103.field687) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (var0 == 221) {
            return 'Y';
         }

         if (var0 == 223) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (var0 == 231) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (var0 == 241 && var1 != class103.field687) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (var0 == 253 || var0 == 255) {
            return 'y';
         }
      }

      if (var0 == 338) {
         return 'O';
      } else if (var0 == 339) {
         return 'o';
      } else {
         return var0 == 376 ? 'Y' : var0;
      }
   }

   static char method1570(char var0) {
      if (var0 == 198) {
         return 'E';
      } else if (var0 == 230) {
         return 'e';
      } else if (var0 == 223) {
         return 's';
      } else if (var0 == 338) {
         return 'E';
      } else {
         return (char)(var0 == 339 ? 'e' : '\u0000');
      }
   }

   static int method1568(char var0, class103 var1) {
      int var3 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var3 = 1 + (var0 << 4);
      }

      if (var0 == 241 && var1 == class103.field687) {
         var3 = 1762;
      }

      return var3;
   }

   static void method1567(int var0) {
      int var2 = class56.method241();
      if (var0 == -3) {
         class292.method1328(class424.field3047, class424.field3048, class424.field3193);
      } else if (var0 == -2) {
         class292.method1328(class424.field3210, class424.field3051, class424.field3052);
      } else if (var0 == -1) {
         class292.method1328(class424.field3053, class424.field3086, class424.field3217);
      } else if (var0 == 3) {
         class292.method1316(3);
         class292.field1993 = 1;
      } else if (var0 == 4) {
         class292.method1316(14);
         class292.field1992 = 0;
      } else if (var0 == 5) {
         class292.field1993 = 2;
         class292.method1328(class424.field3059, class424.field3060, class424.field3061);
      } else if (var0 == 68) {
         if (!Client.field1127) {
            Client.field1127 = true;
            Client.method926();
            return;
         }

         class292.method1328(class424.field3062, class424.field3063, class424.field3031);
      } else if (!Client.field1351 && var0 == 6) {
         class292.method1328(class424.field3062, class424.field3063, class424.field3031);
      } else if (var0 == 7) {
         class292.method1328(class424.field3004, class424.field3066, class424.field3220);
      } else if (var0 == 8) {
         class292.method1328(class424.field3068, class424.field3069, class424.field3142);
      } else if (var0 == 9) {
         class292.method1328(class424.field3071, class424.field3072, class424.field3243);
      } else if (var0 == 10) {
         class292.method1328(class424.field3079, class424.field3075, class424.field3076);
      } else if (var0 == 11) {
         class292.method1328(class424.field3077, class424.field3078, class424.field3276);
      } else if (var0 == 12) {
         class292.method1328(class424.field3080, class424.field3081, class424.field3082);
      } else if (var0 == 13) {
         class292.method1328(class424.field3083, class424.field3161, class424.field3085);
      } else if (var0 == 14) {
         class292.method1328(class424.field3280, class424.field3087, class424.field3088);
      } else if (var0 == 16) {
         class292.method1328(class424.field3089, class424.field3090, class424.field3219);
         class292.method1316(33);
      } else if (var0 == 17) {
         class292.method1328(class424.field3131, class424.field3247, class424.field3094);
      } else if (var0 == 18) {
         class292.method1316(14);
         class292.field1992 = 1;
      } else if (var0 == 19) {
         class292.method1328(class424.field3189, class424.field3132, class424.field3100);
      } else if (var0 == 20) {
         class292.method1328(class424.field3203, class424.field3102, class424.field3128);
      } else if (var0 == 22) {
         class292.method1328(class424.field3104, class424.field3171, class424.field3190);
      } else if (var0 == 23) {
         class292.method1328(class424.field3107, class424.field3108, class424.field3002);
      } else if (var0 == 24) {
         class292.method1328(class424.field3110, class424.field3111, class424.field3172);
      } else if (var0 == 25) {
         class292.method1328(class424.field3113, class424.field3114, class424.field3115);
      } else if (var0 == 26) {
         class292.method1328(class424.field3116, class424.field3093, class424.field3118);
      } else if (var0 == 27) {
         class292.method1328(class424.field3270, class424.field3120, class424.field3098);
      } else if (var0 == 31) {
         class292.method1328(class424.field3261, class424.field3129, class424.field3130);
      } else if (var0 == 32) {
         class292.method1316(14);
         class292.field1992 = 2;
      } else if (var0 == 37) {
         class292.method1328(class424.field3134, class424.field3163, class424.field3278);
      } else if (var0 == 38) {
         class292.method1328(class424.field3137, class424.field3138, class424.field3139);
      } else if (var0 == 55) {
         class292.method1316(8);
      } else {
         if (var0 == 56) {
            class292.method1328(class424.field3296, class424.field3009, class424.field3146);
            Client.method904(11);
            return;
         }

         if (var0 == 57) {
            class292.method1328(class424.field3147, class424.field3148, class424.field3149);
            Client.method904(11);
            return;
         }

         if (var0 == 61) {
            class292.method1328("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class292.method1316(7);
         } else {
            if (var0 == 62) {
               Client.method904(10);
               class292.method1316(9);
               class292.method1328(class424.field3169, class424.field3143, class424.field3152);
               return;
            }

            if (var0 == 63) {
               Client.method904(10);
               class292.method1316(9);
               class292.method1328(class424.field3153, class424.field3154, class424.field3155);
               return;
            }

            if (var0 == 65 || var0 == 67) {
               Client.method904(10);
               class292.method1316(9);
               class292.method1328(class424.field3207, class424.field3157, class424.field3176);
               return;
            }

            if (var0 == 71) {
               Client.method904(10);
               class292.method1316(7);
               class292.method1328("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
            } else if (var0 == 73) {
               Client.method904(10);
               class292.method1316(6);
               class292.method1328(class424.field3287, class424.field3288, class424.field3289);
            } else if (var0 == 72) {
               Client.method904(10);
               class292.method1316(32);
            } else {
               class292.method1328(class424.field3159, class424.field3021, class424.field3067);
            }
         }
      }

      Client.method904(10);
      boolean var3 = var2 != class56.method241();
      if (!var3 && Client.field1161.method1199()) {
         class292.method1316(9);
      }

   }
}
