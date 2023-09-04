public class class508 {
   static class405 field3972;

   class508() throws Throwable {
   }

   static char method2460(char var0, class121 var1) {
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

         if (var0 == 209 && var1 != class121.field1494) {
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

         if (var0 == 241 && var1 != class121.field1494) {
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

   static char method2461(char var0) {
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

   static int method2459(char var0, class121 var1) {
      int var3 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var3 = 1 + (var0 << 4);
      }

      if (var0 == 241 && var1 == class121.field1494) {
         var3 = 1762;
      }

      return var3;
   }

   static void method2458(int var0) {
      int var2 = class393.method1904();
      if (var0 == -3) {
         class534.method2555(class27.field280, class27.field281, class27.field426);
      } else if (var0 == -2) {
         class534.method2555(class27.field443, class27.field284, class27.field285);
      } else if (var0 == -1) {
         class534.method2555(class27.field286, class27.field319, class27.field450);
      } else if (var0 == 3) {
         class534.method2543(3);
         class534.field4229 = 1;
      } else if (var0 == 4) {
         class534.method2543(14);
         class534.field4228 = 0;
      } else if (var0 == 5) {
         class534.field4229 = 2;
         class534.method2555(class27.field292, class27.field293, class27.field294);
      } else if (var0 == 68) {
         if (!Client.field587) {
            Client.field587 = true;
            Client.method542();
            return;
         }

         class534.method2555(class27.field295, class27.field296, class27.field264);
      } else if (!Client.field811 && var0 == 6) {
         class534.method2555(class27.field295, class27.field296, class27.field264);
      } else if (var0 == 7) {
         class534.method2555(class27.field237, class27.field299, class27.field453);
      } else if (var0 == 8) {
         class534.method2555(class27.field301, class27.field302, class27.field375);
      } else if (var0 == 9) {
         class534.method2555(class27.field304, class27.field305, class27.field476);
      } else if (var0 == 10) {
         class534.method2555(class27.field312, class27.field308, class27.field309);
      } else if (var0 == 11) {
         class534.method2555(class27.field310, class27.field311, class27.field509);
      } else if (var0 == 12) {
         class534.method2555(class27.field313, class27.field314, class27.field315);
      } else if (var0 == 13) {
         class534.method2555(class27.field316, class27.field394, class27.field318);
      } else if (var0 == 14) {
         class534.method2555(class27.field513, class27.field320, class27.field321);
      } else if (var0 == 16) {
         class534.method2555(class27.field322, class27.field323, class27.field452);
         class534.method2543(33);
      } else if (var0 == 17) {
         class534.method2555(class27.field364, class27.field480, class27.field327);
      } else if (var0 == 18) {
         class534.method2543(14);
         class534.field4228 = 1;
      } else if (var0 == 19) {
         class534.method2555(class27.field422, class27.field365, class27.field333);
      } else if (var0 == 20) {
         class534.method2555(class27.field436, class27.field335, class27.field361);
      } else if (var0 == 22) {
         class534.method2555(class27.field337, class27.field404, class27.field423);
      } else if (var0 == 23) {
         class534.method2555(class27.field340, class27.field341, class27.field235);
      } else if (var0 == 24) {
         class534.method2555(class27.field343, class27.field344, class27.field405);
      } else if (var0 == 25) {
         class534.method2555(class27.field346, class27.field347, class27.field348);
      } else if (var0 == 26) {
         class534.method2555(class27.field349, class27.field326, class27.field351);
      } else if (var0 == 27) {
         class534.method2555(class27.field503, class27.field353, class27.field331);
      } else if (var0 == 31) {
         class534.method2555(class27.field494, class27.field362, class27.field363);
      } else if (var0 == 32) {
         class534.method2543(14);
         class534.field4228 = 2;
      } else if (var0 == 37) {
         class534.method2555(class27.field367, class27.field396, class27.field511);
      } else if (var0 == 38) {
         class534.method2555(class27.field370, class27.field371, class27.field372);
      } else if (var0 == 55) {
         class534.method2543(8);
      } else {
         if (var0 == 56) {
            class534.method2555(class27.field529, class27.field242, class27.field379);
            Client.method520(11);
            return;
         }

         if (var0 == 57) {
            class534.method2555(class27.field380, class27.field381, class27.field382);
            Client.method520(11);
            return;
         }

         if (var0 == 61) {
            class534.method2555("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class534.method2543(7);
         } else {
            if (var0 == 62) {
               Client.method520(10);
               class534.method2543(9);
               class534.method2555(class27.field402, class27.field376, class27.field385);
               return;
            }

            if (var0 == 63) {
               Client.method520(10);
               class534.method2543(9);
               class534.method2555(class27.field386, class27.field387, class27.field388);
               return;
            }

            if (var0 == 65 || var0 == 67) {
               Client.method520(10);
               class534.method2543(9);
               class534.method2555(class27.field440, class27.field390, class27.field409);
               return;
            }

            if (var0 == 71) {
               Client.method520(10);
               class534.method2543(7);
               class534.method2555("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
            } else if (var0 == 73) {
               Client.method520(10);
               class534.method2543(6);
               class534.method2555(class27.field520, class27.field521, class27.field522);
            } else if (var0 == 72) {
               Client.method520(10);
               class534.method2543(32);
            } else {
               class534.method2555(class27.field392, class27.field254, class27.field300);
            }
         }
      }

      Client.method520(10);
      boolean var3 = var2 != class393.method1904();
      if (!var3 && Client.field621.method912()) {
         class534.method2543(9);
      }

   }
}
