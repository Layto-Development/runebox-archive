import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "or")
public class class261 {
	@ObfInfo(name = "gw", desc = "Lrr;")
	static class70 field2118;

	@ObfInfo(name = "<init>", desc = "()V")
	class261() throws Throwable {
	}

	@ObfInfo(name = "ae", desc = "(CLon;B)C")
	static char method1368(char var0, class67 var1) {
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

			if (var0 == 209 && var1 != class67.field762) {
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

			if (var0 == 241 && var1 != class67.field762) {
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

	@ObfInfo(name = "ao", desc = "(CI)C")
	static char method1369(char var0) {
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

	@ObfInfo(name = "at", desc = "(CLon;B)I")
	static int method1367(char var0, class67 var1) {
		int var3 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var3 = 1 + (var0 << 4);
		}

		if (var0 == 241 && var1 == class67.field762) {
			var3 = 1762;
		}

		return var3;
	}

	@ObfInfo(name = "ha", desc = "(IB)V", opaqueValue = "0")
	static void method1366(int var0) {
		int var2 = class285.method1573();
		if (var0 == -3) {
			class162.method936(class453.field3443, class453.field3444, class453.field3589);
		} else if (var0 == -2) {
			class162.method936(class453.field3606, class453.field3447, class453.field3448);
		} else if (var0 == -1) {
			class162.method936(class453.field3449, class453.field3482, class453.field3613);
		} else if (var0 == 3) {
			class162.method924(3);
			class162.field1530 = 1;
		} else if (var0 == 4) {
			class162.method924(14);
			class162.field1529 = 0;
		} else if (var0 == 5) {
			class162.field1530 = 2;
			class162.method936(class453.field3455, class453.field3456, class453.field3457);
		} else if (var0 == 68) {
			if (!Client.field38) {
				Client.field38 = true;
				Client.method270();
				return;
			}

			class162.method936(class453.field3458, class453.field3459, class453.field3427);
		} else if (!Client.field262 && var0 == 6) {
			class162.method936(class453.field3458, class453.field3459, class453.field3427);
		} else if (var0 == 7) {
			class162.method936(class453.field3400, class453.field3462, class453.field3616);
		} else if (var0 == 8) {
			class162.method936(class453.field3464, class453.field3465, class453.field3538);
		} else if (var0 == 9) {
			class162.method936(class453.field3467, class453.field3468, class453.field3639);
		} else if (var0 == 10) {
			class162.method936(class453.field3475, class453.field3471, class453.field3472);
		} else if (var0 == 11) {
			class162.method936(class453.field3473, class453.field3474, class453.field3672);
		} else if (var0 == 12) {
			class162.method936(class453.field3476, class453.field3477, class453.field3478);
		} else if (var0 == 13) {
			class162.method936(class453.field3479, class453.field3557, class453.field3481);
		} else if (var0 == 14) {
			class162.method936(class453.field3676, class453.field3483, class453.field3484);
		} else if (var0 == 16) {
			class162.method936(class453.field3485, class453.field3486, class453.field3615);
			class162.method924(33);
		} else if (var0 == 17) {
			class162.method936(class453.field3527, class453.field3643, class453.field3490);
		} else if (var0 == 18) {
			class162.method924(14);
			class162.field1529 = 1;
		} else if (var0 == 19) {
			class162.method936(class453.field3585, class453.field3528, class453.field3496);
		} else if (var0 == 20) {
			class162.method936(class453.field3599, class453.field3498, class453.field3524);
		} else if (var0 == 22) {
			class162.method936(class453.field3500, class453.field3567, class453.field3586);
		} else if (var0 == 23) {
			class162.method936(class453.field3503, class453.field3504, class453.field3398);
		} else if (var0 == 24) {
			class162.method936(class453.field3506, class453.field3507, class453.field3568);
		} else if (var0 == 25) {
			class162.method936(class453.field3509, class453.field3510, class453.field3511);
		} else if (var0 == 26) {
			class162.method936(class453.field3512, class453.field3489, class453.field3514);
		} else if (var0 == 27) {
			class162.method936(class453.field3666, class453.field3516, class453.field3494);
		} else if (var0 == 31) {
			class162.method936(class453.field3657, class453.field3525, class453.field3526);
		} else if (var0 == 32) {
			class162.method924(14);
			class162.field1529 = 2;
		} else if (var0 == 37) {
			class162.method936(class453.field3530, class453.field3559, class453.field3674);
		} else if (var0 == 38) {
			class162.method936(class453.field3533, class453.field3534, class453.field3535);
		} else if (var0 == 55) {
			class162.method924(8);
		} else {
			if (var0 == 56) {
				class162.method936(class453.field3692, class453.field3405, class453.field3542);
				Client.method248(11);
				return;
			}

			if (var0 == 57) {
				class162.method936(class453.field3543, class453.field3544, class453.field3545);
				Client.method248(11);
				return;
			}

			if (var0 == 61) {
				class162.method936("", "Please enter your date of birth (DD/MM/YYYY)", "");
				class162.method924(7);
			} else {
				if (var0 == 62) {
					Client.method248(10);
					class162.method924(9);
					class162.method936(class453.field3565, class453.field3539, class453.field3548);
					return;
				}

				if (var0 == 63) {
					Client.method248(10);
					class162.method924(9);
					class162.method936(class453.field3549, class453.field3550, class453.field3551);
					return;
				}

				if (var0 == 65 || var0 == 67) {
					Client.method248(10);
					class162.method924(9);
					class162.method936(class453.field3603, class453.field3553, class453.field3572);
					return;
				}

				if (var0 == 71) {
					Client.method248(10);
					class162.method924(7);
					class162.method936("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					Client.method248(10);
					class162.method924(6);
					class162.method936(class453.field3683, class453.field3684, class453.field3685);
				} else if (var0 == 72) {
					Client.method248(10);
					class162.method924(32);
				} else {
					class162.method936(class453.field3555, class453.field3417, class453.field3463);
				}
			}
		}

		Client.method248(10);
		boolean var3 = var2 != class285.method1573();
		if (!var3 && Client.field72.method1921()) {
			class162.method924(9);
		}

	}
}
