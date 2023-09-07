public class class414 {
    static class481 field2901;

    class414() throws Throwable {
    }

    static char method1905(char var0, class492 var1) {
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

            if (var0 == 209 && var1 != class492.field3615) {
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

            if (var0 == 241 && var1 != class492.field3615) {
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

    static char method1906(char var0) {
        if (var0 == 198) {
            return 'E';
        } else if (var0 == 230) {
            return 'e';
        } else if (var0 == 223) {
            return 's';
        } else if (var0 == 338) {
            return 'E';
        } else {
            return var0 == 339 ? 'e' : '\u0000';
        }
    }

    static int method1904(char var0, class492 var1) {
        int var3 = var0 << 4;
        if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
            var0 = Character.toLowerCase(var0);
            var3 = 1 + (var0 << 4);
        }

        if (var0 == 241 && var1 == class492.field3615) {
            var3 = 1762;
        }

        return var3;
    }

    static void method1903(int var0) {
        int var2 = class96.method382();
        if (var0 == -3) {
            class500.method2268(class32.field219, class32.field220, class32.field365);
        } else if (var0 == -2) {
            class500.method2268(class32.field382, class32.field223, class32.field224);
        } else if (var0 == -1) {
            class500.method2268(class32.field225, class32.field258, class32.field389);
        } else if (var0 == 3) {
            class500.method2256(3);
            class500.field3664 = 1;
        } else if (var0 == 4) {
            class500.method2256(14);
            class500.field3663 = 0;
        } else if (var0 == 5) {
            class500.field3664 = 2;
            class500.method2268(class32.field231, class32.field232, class32.field233);
        } else if (var0 == 68) {
            if (!Client.field3786) {
                Client.field3786 = true;
                Client.method2481();
                return;
            }

            class500.method2268(class32.field234, class32.field235, class32.field203);
        } else if (!Client.field4010 && var0 == 6) {
            class500.method2268(class32.field234, class32.field235, class32.field203);
        } else if (var0 == 7) {
            class500.method2268(class32.field176, class32.field238, class32.field392);
        } else if (var0 == 8) {
            class500.method2268(class32.field240, class32.field241, class32.field314);
        } else if (var0 == 9) {
            class500.method2268(class32.field243, class32.field244, class32.field415);
        } else if (var0 == 10) {
            class500.method2268(class32.field251, class32.field247, class32.field248);
        } else if (var0 == 11) {
            class500.method2268(class32.field249, class32.field250, class32.field448);
        } else if (var0 == 12) {
            class500.method2268(class32.field252, class32.field253, class32.field254);
        } else if (var0 == 13) {
            class500.method2268(class32.field255, class32.field333, class32.field257);
        } else if (var0 == 14) {
            class500.method2268(class32.field452, class32.field259, class32.field260);
        } else if (var0 == 16) {
            class500.method2268(class32.field261, class32.field262, class32.field391);
            class500.method2256(33);
        } else if (var0 == 17) {
            class500.method2268(class32.field303, class32.field419, class32.field266);
        } else if (var0 == 18) {
            class500.method2256(14);
            class500.field3663 = 1;
        } else if (var0 == 19) {
            class500.method2268(class32.field361, class32.field304, class32.field272);
        } else if (var0 == 20) {
            class500.method2268(class32.field375, class32.field274, class32.field300);
        } else if (var0 == 22) {
            class500.method2268(class32.field276, class32.field343, class32.field362);
        } else if (var0 == 23) {
            class500.method2268(class32.field279, class32.field280, class32.field174);
        } else if (var0 == 24) {
            class500.method2268(class32.field282, class32.field283, class32.field344);
        } else if (var0 == 25) {
            class500.method2268(class32.field285, class32.field286, class32.field287);
        } else if (var0 == 26) {
            class500.method2268(class32.field288, class32.field265, class32.field290);
        } else if (var0 == 27) {
            class500.method2268(class32.field442, class32.field292, class32.field270);
        } else if (var0 == 31) {
            class500.method2268(class32.field433, class32.field301, class32.field302);
        } else if (var0 == 32) {
            class500.method2256(14);
            class500.field3663 = 2;
        } else if (var0 == 37) {
            class500.method2268(class32.field306, class32.field335, class32.field450);
        } else if (var0 == 38) {
            class500.method2268(class32.field309, class32.field310, class32.field311);
        } else if (var0 == 55) {
            class500.method2256(8);
        } else {
            if (var0 == 56) {
                class500.method2268(class32.field468, class32.field181, class32.field318);
                Client.method2459(11);
                return;
            }

            if (var0 == 57) {
                class500.method2268(class32.field319, class32.field320, class32.field321);
                Client.method2459(11);
                return;
            }

            if (var0 == 61) {
                class500.method2268("", "Please enter your date of birth (DD/MM/YYYY)", "");
                class500.method2256(7);
            } else {
                if (var0 == 62) {
                    Client.method2459(10);
                    class500.method2256(9);
                    class500.method2268(class32.field341, class32.field315, class32.field324);
                    return;
                }

                if (var0 == 63) {
                    Client.method2459(10);
                    class500.method2256(9);
                    class500.method2268(class32.field325, class32.field326, class32.field327);
                    return;
                }

                if (var0 == 65 || var0 == 67) {
                    Client.method2459(10);
                    class500.method2256(9);
                    class500.method2268(class32.field379, class32.field329, class32.field348);
                    return;
                }

                if (var0 == 71) {
                    Client.method2459(10);
                    class500.method2256(7);
                    class500.method2268("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
                } else if (var0 == 73) {
                    Client.method2459(10);
                    class500.method2256(6);
                    class500.method2268(class32.field459, class32.field460, class32.field461);
                } else if (var0 == 72) {
                    Client.method2459(10);
                    class500.method2256(32);
                } else {
                    class500.method2268(class32.field331, class32.field193, class32.field239);
                }
            }
        }

        Client.method2459(10);
        boolean var3 = var2 != class96.method382();
        if (!var3 && Client.field3820.method1076()) {
            class500.method2256(9);
        }

    }
}
