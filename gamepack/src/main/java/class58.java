public class class58 {

	static class186 field639;

	class58() throws Throwable {
	}

	static char method231(char var0, class267 var1) {
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
			if (var0 == 209 && var1 != class267.field2191) {
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
			if (var0 == 241 && var1 != class267.field2191) {
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

	static char method232(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char) (var0 == 339 ? 'e' : '\u0000');
		}
	}

	static int method230(char var0, class267 var1) {
		int var3 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var3 = 1 + (var0 << 4);
		}
		if (var0 == 241 && var1 == class267.field2191) {
			var3 = 1762;
		}
		return var3;
	}

	static void method229(int var0) {
		int var2 = class320.method1710();
		if (var0 == -3) {
			class174.method1042(class55.field365, class55.field366, class55.field511);
		} else if (var0 == -2) {
			class174.method1042(class55.field528, class55.field369, class55.field370);
		} else if (var0 == -1) {
			class174.method1042(class55.field371, class55.field404, class55.field535);
		} else if (var0 == 3) {
			class174.method1030(3);
			class174.field1728 = 1;
		} else if (var0 == 4) {
			class174.method1030(14);
			class174.field1727 = 0;
		} else if (var0 == 5) {
			class174.field1728 = 2;
			class174.method1042(class55.field377, class55.field378, class55.field379);
		} else if (var0 == 68) {
			if (!Client.field909) {
				Client.field909 = true;
				Client.method589();
				return;
			}
			class174.method1042(class55.field380, class55.field381, class55.field349);
		} else if (!Client.field1133 && var0 == 6) {
			class174.method1042(class55.field380, class55.field381, class55.field349);
		} else if (var0 == 7) {
			class174.method1042(class55.field322, class55.field384, class55.field538);
		} else if (var0 == 8) {
			class174.method1042(class55.field386, class55.field387, class55.field460);
		} else if (var0 == 9) {
			class174.method1042(class55.field389, class55.field390, class55.field561);
		} else if (var0 == 10) {
			class174.method1042(class55.field397, class55.field393, class55.field394);
		} else if (var0 == 11) {
			class174.method1042(class55.field395, class55.field396, class55.field594);
		} else if (var0 == 12) {
			class174.method1042(class55.field398, class55.field399, class55.field400);
		} else if (var0 == 13) {
			class174.method1042(class55.field401, class55.field479, class55.field403);
		} else if (var0 == 14) {
			class174.method1042(class55.field598, class55.field405, class55.field406);
		} else if (var0 == 16) {
			class174.method1042(class55.field407, class55.field408, class55.field537);
			class174.method1030(33);
		} else if (var0 == 17) {
			class174.method1042(class55.field449, class55.field565, class55.field412);
		} else if (var0 == 18) {
			class174.method1030(14);
			class174.field1727 = 1;
		} else if (var0 == 19) {
			class174.method1042(class55.field507, class55.field450, class55.field418);
		} else if (var0 == 20) {
			class174.method1042(class55.field521, class55.field420, class55.field446);
		} else if (var0 == 22) {
			class174.method1042(class55.field422, class55.field489, class55.field508);
		} else if (var0 == 23) {
			class174.method1042(class55.field425, class55.field426, class55.field320);
		} else if (var0 == 24) {
			class174.method1042(class55.field428, class55.field429, class55.field490);
		} else if (var0 == 25) {
			class174.method1042(class55.field431, class55.field432, class55.field433);
		} else if (var0 == 26) {
			class174.method1042(class55.field434, class55.field411, class55.field436);
		} else if (var0 == 27) {
			class174.method1042(class55.field588, class55.field438, class55.field416);
		} else if (var0 == 31) {
			class174.method1042(class55.field579, class55.field447, class55.field448);
		} else if (var0 == 32) {
			class174.method1030(14);
			class174.field1727 = 2;
		} else if (var0 == 37) {
			class174.method1042(class55.field452, class55.field481, class55.field596);
		} else if (var0 == 38) {
			class174.method1042(class55.field455, class55.field456, class55.field457);
		} else if (var0 == 55) {
			class174.method1030(8);
		} else {
			if (var0 == 56) {
				class174.method1042(class55.field614, class55.field327, class55.field464);
				Client.method567(11);
				return;
			}
			if (var0 == 57) {
				class174.method1042(class55.field465, class55.field466, class55.field467);
				Client.method567(11);
				return;
			}
			if (var0 == 61) {
				class174.method1042("", "Please enter your date of birth (DD/MM/YYYY)", "");
				class174.method1030(7);
			} else {
				if (var0 == 62) {
					Client.method567(10);
					class174.method1030(9);
					class174.method1042(class55.field487, class55.field461, class55.field470);
					return;
				}
				if (var0 == 63) {
					Client.method567(10);
					class174.method1030(9);
					class174.method1042(class55.field471, class55.field472, class55.field473);
					return;
				}
				if (var0 == 65 || var0 == 67) {
					Client.method567(10);
					class174.method1030(9);
					class174.method1042(class55.field525, class55.field475, class55.field494);
					return;
				}
				if (var0 == 71) {
					Client.method567(10);
					class174.method1030(7);
					class174.method1042("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					Client.method567(10);
					class174.method1030(6);
					class174.method1042(class55.field605, class55.field606, class55.field607);
				} else if (var0 == 72) {
					Client.method567(10);
					class174.method1030(32);
				} else {
					class174.method1042(class55.field477, class55.field339, class55.field385);
				}
			}
		}
		Client.method567(10);
		boolean var3 = var2 != class320.method1710();
		if (!var3 && Client.field943.method2456()) {
			class174.method1030(9);
		}
	}
}
