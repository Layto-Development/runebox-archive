import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class class60 extends class462 {
	public static boolean field643;
	static class344 field633;
	static class344 field639;
	static class344 field640;
	static class344 field750;
	static class407 field641;
	static class407 field753;
	class108 field721;
	class226 field710;
	int field688;
	int field689;
	int field754;
	HashMap field746;
	HashMap field769;
	public boolean field634;
	public boolean field662;
	public boolean field664;
	public boolean field676;
	public boolean field681;
	public boolean field684;
	public boolean field685;
	public boolean field702;
	public boolean field706;
	public boolean field716;
	public boolean field717;
	public boolean field724;
	public boolean field725;
	public boolean field727;
	public boolean field778;
	public boolean field786;
	public boolean field787;
	public boolean field788;
	public byte[][] field693;
	public byte[][] field789;
	public class363 field700;
	public class385 field672;
	public class60 field743;
	public class60[] field776;
	public int field636;
	public int field644;
	public int field645;
	public int field646;
	public int field647;
	public int field649;
	public int field650;
	public int field651;
	public int field652;
	public int field653;
	public int field654;
	public int field655;
	public int field656;
	public int field657;
	public int field658;
	public int field659;
	public int field660;
	public int field661;
	public int field663;
	public int field665;
	public int field666;
	public int field667;
	public int field668;
	public int field670;
	public int field671;
	public int field674;
	public int field675;
	public int field677;
	public int field678;
	public int field680;
	public int field682;
	public int field683;
	public int field686;
	public int field687;
	public int field690;
	public int field692;
	public int field694;
	public int field697;
	public int field698;
	public int field699;
	public int field703;
	public int field707;
	public int field712;
	public int field713;
	public int field714;
	public int field715;
	public int field730;
	public int field731;
	public int field735;
	public int field740;
	public int field749;
	public int field759;
	public int field760;
	public int field763;
	public int field764;
	public int field765;
	public int field766;
	public int field768;
	public int field772;
	public int field773;
	public int field774;
	public int field775;
	public int field780;
	public int field781;
	public int field782;
	public int field783;
	public int field784;
	public int[] field673;
	public int[] field719;
	public int[] field720;
	public int[] field741;
	public int[] field745;
	public int[] field767;
	public int[] field770;
	public int[] field771;
	public int[] field779;
	public int[] field785;
	public int[][] field708;
	public Object[] field635;
	public Object[] field637;
	public Object[] field638;
	public Object[] field642;
	public Object[] field669;
	public Object[] field691;
	public Object[] field696;
	public Object[] field701;
	public Object[] field705;
	public Object[] field709;
	public Object[] field711;
	public Object[] field718;
	public Object[] field723;
	public Object[] field728;
	public Object[] field729;
	public Object[] field732;
	public Object[] field733;
	public Object[] field734;
	public Object[] field736;
	public Object[] field737;
	public Object[] field738;
	public Object[] field739;
	public Object[] field742;
	public Object[] field744;
	public Object[] field747;
	public Object[] field748;
	public Object[] field751;
	public Object[] field755;
	public Object[] field756;
	public Object[] field757;
	public Object[] field758;
	public Object[] field761;
	public Object[] field762;
	public Object[] field777;
	public String field632;
	public String field648;
	public String field679;
	public String field695;
	public String field704;
	public String field726;
	public String field752;
	public String[] field722;

	static {
		field750 = new class344(200);
		field639 = new class344(50);
		field640 = new class344(20);
		field633 = new class344(8);
		field641 = new class407(10, class14.field379);
		field753 = new class407(10, class14.field379);
		field643 = false;
	}

	public class60() {
		this.field724 = false;
		this.field644 = -1;
		this.field763 = -1;
		this.field647 = 0;
		this.field670 = 0;
		this.field649 = 0;
		this.field650 = 0;
		this.field651 = 0;
		this.field652 = 0;
		this.field653 = 0;
		this.field654 = 0;
		this.field655 = 0;
		this.field656 = 0;
		this.field645 = 0;
		this.field658 = 0;
		this.field659 = 0;
		this.field636 = 0;
		this.field760 = 1;
		this.field660 = 1;
		this.field661 = -1;
		this.field662 = false;
		this.field663 = 0;
		this.field677 = 0;
		this.field731 = 0;
		this.field666 = 0;
		this.field667 = 0;
		this.field668 = 0;
		this.field671 = 0;
		this.field714 = 0;
		this.field706 = false;
		this.field672 = class385.field3241;
		this.field665 = 0;
		this.field674 = 0;
		this.field675 = 1;
		this.field676 = false;
		this.field730 = -1;
		this.field678 = -1;
		this.field680 = 0;
		this.field681 = false;
		this.field682 = 0;
		this.field683 = 0;
		this.field686 = 1;
		this.field687 = -1;
		this.field688 = 1;
		this.field689 = -1;
		this.field690 = -1;
		this.field764 = -1;
		this.field692 = 0;
		this.field766 = 0;
		this.field694 = 0;
		this.field712 = 0;
		this.field759 = 0;
		this.field697 = 100;
		this.field698 = 0;
		this.field735 = 0;
		this.field717 = false;
		this.field702 = false;
		this.field703 = 2;
		this.field749 = -1;
		this.field704 = "";
		this.field632 = "";
		this.field740 = 0;
		this.field707 = 0;
		this.field765 = 0;
		this.field634 = false;
		this.field754 = -1;
		this.field715 = 0;
		this.field716 = false;
		this.field648 = "";
		this.field743 = null;
		this.field657 = 0;
		this.field699 = 0;
		this.field725 = false;
		this.field726 = "";
		this.field727 = false;
		this.field768 = -1;
		this.field752 = "";
		this.field695 = class433.field3544;
		this.field772 = -1;
		this.field773 = 0;
		this.field774 = 0;
		this.field775 = 0;
		this.field664 = false;
		this.field778 = false;
		this.field713 = -1;
		this.field780 = 0;
		this.field781 = 0;
		this.field782 = 0;
		this.field783 = -1;
		this.field784 = -1;
		this.field786 = false;
		this.field787 = false;
		this.field788 = false;
	}

	void method436(class42 var1) {
		this.field724 = false;
		this.field646 = var1.method278();
		this.field647 = var1.method278();
		this.field670 = var1.method327();
		this.field653 = var1.method280();
		this.field654 = var1.method280();
		this.field655 = var1.method327();
		this.field656 = var1.method327();
		this.field665 = var1.method278();
		this.field661 = var1.method327();
		if (this.field661 == 65535) {
			this.field661 = -1;
		} else {
			this.field661 += this.field644 & -65536;
		}

		this.field768 = var1.method327();
		if (this.field768 == 65535) {
			this.field768 = -1;
		}

		int var3 = var1.method278();
		int var4;
		if (var3 > 0) {
			this.field779 = new int[var3];
			this.field767 = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field779[var4] = var1.method278();
				this.field767[var4] = var1.method327();
			}
		}

		var4 = var1.method278();
		int var5;
		if (var4 > 0) {
			this.field708 = new int[var4][];

			for (var5 = 0; var5 < var4; ++var5) {
				int var6 = var1.method327();
				this.field708[var5] = new int[var6];

				for (int var7 = 0; var7 < var6; ++var7) {
					this.field708[var5][var7] = var1.method327();
					if (this.field708[var5][var7] == 65535) {
						this.field708[var5][var7] = -1;
					}
				}
			}
		}

		if (this.field646 == 0) {
			this.field666 = var1.method327();
			this.field662 = var1.method278() == 1;
		}

		if (this.field646 == 1) {
			var1.method327();
			var1.method278();
		}

		if (this.field646 == 3) {
			this.field706 = var1.method278() == 1;
		}

		if (this.field646 == 4 || this.field646 == 1) {
			this.field707 = var1.method278();
			this.field765 = var1.method278();
			this.field740 = var1.method278();
			this.field749 = var1.method327();
			if (this.field749 == 65535) {
				this.field749 = -1;
			}

			this.field634 = var1.method278() == 1;
		}

		if (this.field646 == 4) {
			this.field704 = var1.method286();
			this.field632 = var1.method286();
		}

		if (this.field646 == 1 || this.field646 == 3 || this.field646 == 4) {
			this.field667 = var1.method282();
		}

		if (this.field646 == 3 || this.field646 == 4) {
			this.field668 = var1.method282();
			this.field671 = var1.method282();
			this.field714 = var1.method282();
		}

		if (this.field646 == 5) {
			this.field730 = var1.method282();
			this.field678 = var1.method282();
		}

		if (this.field646 == 6) {
			this.field686 = 1;
			this.field687 = var1.method327();
			if (this.field687 == 65535) {
				this.field687 = -1;
			}

			this.field688 = 1;
			this.field689 = var1.method327();
			if (this.field689 == 65535) {
				this.field689 = -1;
			}

			this.field690 = var1.method327();
			if (this.field690 == 65535) {
				this.field690 = -1;
			}

			this.field764 = var1.method327();
			if (this.field764 == 65535) {
				this.field764 = -1;
			}

			this.field697 = var1.method327();
			this.field694 = var1.method327();
			this.field712 = var1.method327();
		}

		if (this.field646 == 8) {
			this.field704 = var1.method286();
		}

		if (this.field647 == 2) {
			this.field726 = var1.method286();
			this.field752 = var1.method286();
			var5 = var1.method327() & 63;
			this.field715 |= var5 << 11;
		}

		if (this.field647 == 1 || this.field647 == 4 || this.field647 == 5 || this.field647 == 6) {
			this.field695 = var1.method286();
			if (this.field695.length() == 0) {
				if (this.field647 == 1) {
					this.field695 = class433.field3544;
				}

				if (this.field647 == 4) {
					this.field695 = class433.field3822;
				}

				if (this.field647 == 5) {
					this.field695 = class433.field3822;
				}

				if (this.field647 == 6) {
					this.field695 = class433.field3546;
				}
			}
		}

		if (this.field647 == 1 || this.field647 == 4 || this.field647 == 5) {
			this.field715 |= 4194304;
		}

		if (this.field647 == 6) {
			this.field715 |= 1;
		}

	}

	void method437(class42 var1) {
		var1.method278();
		this.field724 = true;
		this.field646 = var1.method278();
		this.field670 = var1.method327();
		this.field653 = var1.method280();
		this.field654 = var1.method280();
		this.field655 = var1.method327();
		if (this.field646 == 9) {
			this.field656 = var1.method280();
		} else {
			this.field656 = var1.method327();
		}

		this.field651 = var1.method279();
		this.field652 = var1.method279();
		this.field649 = var1.method279();
		this.field650 = var1.method279();
		this.field661 = var1.method327();
		if (this.field661 == 65535) {
			this.field661 = -1;
		} else {
			this.field661 += this.field644 & -65536;
		}

		this.field662 = var1.method278() == 1;
		if (this.field646 == 0) {
			this.field731 = var1.method327();
			this.field666 = var1.method327();
			this.field786 = var1.method278() == 1;
		}

		if (this.field646 == 5) {
			this.field730 = var1.method282();
			this.field680 = var1.method327();
			this.field681 = var1.method278() == 1;
			this.field665 = var1.method278();
			this.field682 = var1.method278();
			this.field683 = var1.method282();
			this.field684 = var1.method278() == 1;
			this.field685 = var1.method278() == 1;
		}

		if (this.field646 == 6) {
			this.field686 = 1;
			this.field687 = var1.method327();
			if (this.field687 == 65535) {
				this.field687 = -1;
			}

			this.field692 = var1.method280();
			this.field766 = var1.method280();
			this.field694 = var1.method327();
			this.field712 = var1.method327();
			this.field759 = var1.method327();
			this.field697 = var1.method327();
			this.field690 = var1.method327();
			if (this.field690 == 65535) {
				this.field690 = -1;
			}

			this.field717 = var1.method278() == 1;
			var1.method327();
			if (this.field651 != 0) {
				this.field698 = var1.method327();
			}

			if (this.field652 != 0) {
				var1.method327();
			}
		}

		if (this.field646 == 4) {
			this.field749 = var1.method327();
			if (this.field749 == 65535) {
				this.field749 = -1;
			}

			this.field704 = var1.method286();
			this.field740 = var1.method278();
			this.field707 = var1.method278();
			this.field765 = var1.method278();
			this.field634 = var1.method278() == 1;
			this.field667 = var1.method282();
		}

		if (this.field646 == 3) {
			this.field667 = var1.method282();
			this.field706 = var1.method278() == 1;
			this.field665 = var1.method278();
		}

		if (this.field646 == 9) {
			this.field675 = var1.method278();
			this.field667 = var1.method282();
			this.field676 = var1.method278() == 1;
		}

		this.field715 = var1.method334();
		this.field648 = var1.method286();
		int var3 = var1.method278();
		if (var3 > 0) {
			this.field722 = new String[var3];

			for (int var4 = 0; var4 < var3; ++var4) {
				this.field722[var4] = var1.method286();
			}
		}

		this.field657 = var1.method278();
		this.field699 = var1.method278();
		this.field725 = var1.method278() == 1;
		this.field726 = var1.method286();
		this.field728 = this.method438(var1);
		this.field733 = this.method438(var1);
		this.field705 = this.method438(var1);
		this.field739 = this.method438(var1);
		this.field738 = this.method438(var1);
		this.field711 = this.method438(var1);
		this.field742 = this.method438(var1);
		this.field744 = this.method438(var1);
		this.field637 = this.method438(var1);
		this.field747 = this.method438(var1);
		this.field734 = this.method438(var1);
		this.field696 = this.method438(var1);
		this.field642 = this.method438(var1);
		this.field729 = this.method438(var1);
		this.field732 = this.method438(var1);
		this.field736 = this.method438(var1);
		this.field737 = this.method438(var1);
		this.field669 = this.method438(var1);
		this.field741 = this.method439(var1);
		this.field673 = this.method439(var1);
		this.field745 = this.method439(var1);
	}

	Object[] method438(class42 var1) {
		int var3 = var1.method278();
		if (var3 == 0) {
			return null;
		} else {
			Object[] var4 = new Object[var3];

			for (int var5 = 0; var5 < var3; ++var5) {
				int var6 = var1.method278();
				if (var6 == 0) {
					var4[var5] = new Integer(var1.method282());
				} else if (var6 == 1) {
					var4[var5] = var1.method286();
				}
			}

			this.field727 = true;
			return var4;
		}
	}

	int[] method439(class42 var1) {
		int var3 = var1.method278();
		if (var3 == 0) {
			return null;
		} else {
			int[] var4 = new int[var3];

			for (int var5 = 0; var5 < var3; ++var5) {
				var4[var5] = var1.method282();
			}

			return var4;
		}
	}

	public class115 method463(boolean var1, class296 var2) {
		field643 = false;
		if (null != this.field679) {
			class115 var4 = this.method440(var2);
			if (var4 != null) {
				return var4;
			}
		}

		int var8;
		if (var1) {
			var8 = this.field678;
		} else {
			var8 = this.field730;
		}

		if (var8 == -1) {
			return null;
		} else {
			long var5 = ((long)this.field683 << 40) + ((this.field684 ? 1L : 0L) << 38) + ((long)this.field682 << 36) + (long)var8 + ((this.field685 ? 1L : 0L) << 39);
			class115 var7 = (class115)field750.method1890(var5);
			if (var7 != null) {
				return var7;
			} else {
				var7 = class38.method253(class168.field1631, var8, 0);
				if (var7 == null) {
					field643 = true;
					return null;
				} else {
					this.method465(var7);
					field750.method1889(var7, var5);
					return var7;
				}
			}
		}
	}

	class115 method440(class296 var1) {
		if (!this.method441()) {
			return this.method464(var1);
		} else {
			String var3 = this.field679 + (this.field684 ? 1 : 0) + (this.field685 ? 1 : 0) + this.field682 + this.field683;
			class115 var4 = (class115)field753.method2101(var3, (byte)2);
			if (var4 == null) {
				class115 var5 = this.method464(var1);
				if (var5 != null) {
					var4 = var5.method705();
					this.method465(var4);
					field753.method2102(var3, var4);
				}
			}

			return var4;
		}
	}

	class115 method464(class296 var1) {
		if (null != this.field679 && var1 != null) {
			class44 var3 = (class44)field641.method2101(this.field679, (byte)24);
			if (var3 == null) {
				var3 = new class44(this.field679, var1);
				field641.method2102(this.field679, var3);
			}

			return var3.method345();
		} else {
			return null;
		}
	}

	boolean method441() {
		return this.field684 || this.field685 || this.field682 != 0 || this.field683 != 0;
	}

	void method465(class115 var1) {
		if (this.field684) {
			var1.method733();
		}

		if (this.field685) {
			var1.method709();
		}

		if (this.field682 > 0) {
			var1.method708(this.field682);
		}

		if (this.field682 >= 1) {
			var1.method710(1);
		}

		if (this.field682 >= 2) {
			var1.method710(16777215);
		}

		if (this.field683 != 0) {
			var1.method711(this.field683);
		}

	}

	public class253 method442() {
		field643 = false;
		if (this.field749 == -1) {
			return null;
		} else {
			class253 var2 = (class253)field640.method1890((long)this.field749);
			if (null != var2) {
				return var2;
			} else {
				var2 = class528.method2553(class168.field1631, class214.field2006, this.field749, 0);
				if (var2 != null) {
					field640.method1889(var2, (long)this.field749);
				} else {
					field643 = true;
				}

				return var2;
			}
		}
	}

	public class250 method443(class393 var1, int var2, boolean var3, class363 var4, class375 var5, class447 var6) {
		field643 = false;
		int var8;
		int var9;
		if (var3) {
			var8 = this.field688;
			var9 = this.field689;
		} else {
			var8 = this.field686;
			var9 = this.field687;
		}

		if (var8 == 6) {
			if (null == var5) {
				return null;
			}

			var9 = var5.field3148;
		}

		if (var8 == 0) {
			return null;
		} else if (var8 == 1 && var9 == -1) {
			return null;
		} else {
			if (null != var6 && var6.field3936 && var8 == 6) {
				var8 = 3;
			}

			long var10 = (long)(var9 + (var8 << 16));
			if (null != var6) {
				var10 |= var6.field3934 << 20;
			}

			class250 var12 = (class250)field639.method1890(var10);
			if (var12 == null) {
				class48 var13 = null;
				int var14 = 64;
				int var15 = 768;
				switch(var8) {
				case 1:
					var13 = class48.method373(class164.field1605, var9, 0);
					break;
				case 2:
					var13 = class150.method861(var9).method2000((class447)null);
					break;
				case 3:
					var13 = null != var4 ? var4.method1957() : null;
					break;
				case 4:
					class210 var16 = class67.method492(var9);
					var13 = var16.method1190(10);
					var14 += var16.field1977;
					var15 += var16.field1978;
				case 5:
				default:
					break;
				case 6:
					var13 = class150.method861(var9).method2000(var6);
				}

				if (var13 == null) {
					field643 = true;
					return null;
				}

				var12 = var13.method369(var14, var15, -50, -10, -50);
				field639.method1889(var12, var10);
			}

			if (null != var1) {
				var12 = var1.method2058(var12, var2);
			}

			return var12;
		}
	}

	public class420 method444(boolean var1) {
		if (this.field678 == -1) {
			var1 = false;
		}

		int var3 = var1 ? this.field678 : this.field730;
		if (var3 == -1) {
			return null;
		} else {
			long var4 = ((long)this.field683 << 40) + ((long)this.field682 << 36) + (long)var3 + ((this.field684 ? 1L : 0L) << 38) + ((this.field685 ? 1L : 0L) << 39);
			class420 var6 = (class420)field633.method1890(var4);
			if (null != var6) {
				return var6;
			} else {
				class115 var7 = this.method463(var1, (class296)null);
				if (var7 == null) {
					return null;
				} else {
					class115 var8 = var7.method721();
					int[] var9 = new int[var8.field1080];
					int[] var10 = new int[var8.field1080];

					for (int var11 = 0; var11 < var8.field1080; ++var11) {
						int var12 = 0;
						int var13 = var8.field1084;

						int var14;
						for (var14 = 0; var14 < var8.field1084; ++var14) {
							if (var8.field1083[var11 * var8.field1084 + var14] == 0) {
								var12 = var14;
								break;
							}
						}

						for (var14 = var8.field1084 - 1; var14 >= var12; --var14) {
							if (var8.field1083[var8.field1084 * var11 + var14] == 0) {
								var13 = var14 + 1;
								break;
							}
						}

						var9[var11] = var12;
						var10[var11] = var13 - var12;
					}

					var6 = new class420(var8.field1084, var8.field1080, var10, var9, var3);
					field633.method1889(var6, var4);
					return var6;
				}
			}
		}
	}

	public void method445(int var1, String var2) {
		if (this.field722 == null || this.field722.length <= var1) {
			String[] var4 = new String[var1 + 1];
			if (this.field722 != null) {
				for (int var5 = 0; var5 < this.field722.length; ++var5) {
					var4[var5] = this.field722[var5];
				}
			}

			this.field722 = var4;
		}

		this.field722[var1] = var2;
	}

	public boolean method446() {
		return !this.field724 || this.field646 == 0 || this.field646 == 11 || this.field727 || this.field670 == 1338 || this.field646 == 12;
	}

	public boolean method447() {
		return this.field646 == 11 || this.field646 == 12;
	}

	public void method470(String var1, class296 var2, long var3) {
		if (this.field646 == 11 && var3 != -1L) {
			var1 = var1.replaceAll("%userid%", Long.toString(var3));
			this.field710 = new class226();
			if (!this.field710.method1267(var1, var2)) {
				this.field710 = null;
			} else {
				if (null == this.field769 || this.field746 == null) {
					this.method471();
				}

			}
		}
	}

	public void method468(String var1, class296 var2) {
		if (this.field646 == 11 && null != var1) {
			this.field710 = new class226();
			this.field710.method1279(var1, var2);
		}
	}

	void method471() {
		this.field769 = new HashMap();
		this.field746 = new HashMap();
	}

	public void method466(int var1, int var2) {
		if (this.field646 == 11) {
			if (this.field769 == null) {
				this.method471();
			}

			this.field769.put(var1, var2);
		}
	}

	public void method449(String var1, int var2) {
		if (this.field646 == 11) {
			if (this.field746 == null) {
				this.method471();
			}

			this.field746.put(var1, var2);
		}
	}

	public boolean method450(int var1, int var2, int var3, int var4) {
		if (this.field646 == 11 && null != this.field710 && this.method469()) {
			var1 -= var3;
			var2 -= var4;
			int var6 = (int)(this.field710.method1271()[0] * (float)this.field659);
			int var7 = (int)(this.field710.method1271()[1] * (float)this.field636);
			int var8 = var6 + (int)(this.field710.method1271()[2] * (float)this.field659);
			int var9 = var7 + (int)(this.field710.method1271()[3] * (float)this.field636);
			return var1 >= var6 && var2 >= var7 && var1 < var8 && var2 < var9;
		} else {
			return false;
		}
	}

	public boolean method469() {
		return this.field754 == 2;
	}

	public int method451(String var1) {
		return this.field646 == 11 && this.field710 != null && this.method469() ? this.field710.method1269(var1) : -1;
	}

	public String method452(String var1) {
		return this.field646 == 11 && null != this.field710 && this.method469() ? this.field710.method1283(var1) : null;
	}

	public int method453() {
		return this.field746 != null && this.field746.size() > 0 ? 1 : 0;
	}

	public int method454() {
		if (this.field646 == 11 && null != this.field710 && null != this.field746 && !this.field746.isEmpty()) {
			String var2 = this.field710.method1272();
			return var2 != null && this.field746.containsKey(this.field710.method1272()) ? (Integer)this.field746.get(var2) : -1;
		} else {
			return -1;
		}
	}

	public String method455() {
		if (this.field646 == 11 && null != this.field710) {
			String var2 = this.field710.method1272();
			Iterator var3 = this.field710.method1273().iterator();

			while (var3.hasNext()) {
				class1 var4 = (class1)var3.next();
				String var5 = String.format("%%%S%%", var4.method1());
				if (var4.method4() == 0) {
					var2.replaceAll(var5, Integer.toString(var4.method3()));
				} else {
					var2.replaceAll(var5, var4.method2());
				}
			}

			return var2;
		} else {
			return null;
		}
	}

	public int[] method462() {
		if (this.field646 == 11 && this.field710 != null) {
			int[] var2 = new int[3];
			int var3 = 0;
			Iterator var4 = this.field710.method1273().iterator();

			while (var4.hasNext()) {
				class1 var5 = (class1)var4.next();
				if (!var5.method1().equals("user_id")) {
					if (var5.method4() != 0) {
						return null;
					}

					var2[var3++] = var5.method3();
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

	public boolean method467(class296 var1) {
		if (this.field646 == 11 && this.field710 != null) {
			this.field710.method1281(var1);
			if (this.field710.method1268() != this.field754) {
				this.field754 = this.field710.method1268();
				if (this.field754 >= 100) {
					return true;
				}

				if (this.field754 == 2) {
					this.method456();
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

	void method456() {
		this.field786 = true;
		ArrayList var2 = this.field710.method1270();
		ArrayList var3 = this.field710.method1284();
		int var4 = var2.size() + var3.size();
		this.field776 = new class60[var4];
		int var5 = 0;

		Iterator var6;
		float[] var10;
		class60 var11;
		for (var6 = var2.iterator(); var6.hasNext(); this.field776[var5++] = var11) {
			class225 var7 = (class225)var6.next();
			var10 = var7.field2046;
			var11 = new class60();
			var11.field646 = 5;
			var11.field661 = this.field644;
			var11.field763 = var5;
			var11.field724 = true;
			var11.field649 = 0;
			var11.field650 = 0;
			var11.field651 = 0;
			var11.field652 = 0;
			var11.field653 = (int)(var10[0] * (float)this.field659);
			var11.field654 = (int)(var10[1] * (float)this.field636);
			var11.field655 = (int)(var10[2] * (float)this.field659);
			var11.field656 = (int)((float)this.field636 * var10[3]);
			var11.field679 = var7.field2045.method1917();
			class44 var12 = new class44(var7.field2045);
			field641.method2102(var11.field679, var12);
		}

		for (var6 = var3.iterator(); var6.hasNext(); this.field776[var5++] = var11) {
			class5 var13 = (class5)var6.next();
			var10 = var13.field319;
			var11 = new class60();
			var11.field646 = 4;
			var11.field661 = this.field644;
			var11.field763 = var5;
			var11.field724 = true;
			var11.field649 = 0;
			var11.field650 = 0;
			var11.field651 = 0;
			var11.field652 = 0;
			var11.field653 = (int)(var10[0] * (float)this.field659);
			var11.field654 = (int)(var10[1] * (float)this.field636);
			var11.field655 = (int)((float)this.field659 * var10[2]);
			var11.field656 = (int)(var10[3] * (float)this.field636);
			var11.field704 = var13.field323;
			var11.field749 = (Integer)this.field769.get(var13.field318);
			var11.field707 = var13.field320;
			var11.field765 = var13.field321;
		}

	}

	public void method457() {
		this.field721 = new class108();

		for (int var2 = 1; var2 <= 12; ++var2) {
			this.field721.field1046.method1372(var2, 0);
		}

		for (char var3 = 0; var3 < ' '; ++var3) {
			this.field721.field1046.method1375(var3, 0);
		}

		this.field721.field1046.method1375('\u0080', 0);
		this.field721.field1046.method1372(82, 2);
		this.field721.field1046.method1372(81, 2);
		this.field721.field1046.method1372(86, 2);
	}

	public class477 method472() {
		return null != this.field721 ? this.field721.field1043 : null;
	}

	public class62 method458() {
		return null != this.field721 ? this.field721.field1041 : null;
	}

	public class240 method448() {
		return null != this.field721 ? this.field721.field1046 : null;
	}

	public class108 method459() {
		return this.field721;
	}

	boolean method460(class477 var1) {
		boolean var3 = false;
		if (this.field704 != null && !this.field704.isEmpty()) {
			var3 |= var1.method2375(class248.method1444(this.field704));
			this.field704 = "";
		}

		if (null != this.field632 && !this.field632.isEmpty()) {
			var3 |= var1.method2308(class248.method1444(this.field632));
			this.field632 = "";
		}

		return var3;
	}

	public boolean method461() {
		class477 var2 = this.method472();
		if (var2 == null) {
			return false;
		} else {
			boolean var3 = false;
			if (!var2.method2348() && this.field749 != -1) {
				int var4 = var2.method2349();
				int var5 = var2.method2374();
				int var6 = var2.method2347();
				int var7 = var2.method2346();
				class253 var8 = this.method442();
				if (var8 != null) {
					var3 |= var2.method2309(var8);
					var3 |= this.method460(var2);
					var3 |= var2.method2314(var4, var5);
					var3 |= var2.method2325(var6, var7);
				}
			} else if (var2.method2348()) {
				var3 |= this.method460(var2);
			}

			var2.method2305();
			return var3;
		}
	}

	public static int method473(int var0, int var1, int var2) {
		int var4 = class443.method2222(var2 - var1 + 1);
		var4 <<= var1;
		var0 |= var4;
		return var0;
	}
}
