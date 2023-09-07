public class class330 implements class188 {

	boolean field2539;

	boolean field2541;

	class354 field2540;

	public class330() {
		this.field2540 = null;
		this.field2539 = false;
		this.field2541 = false;
	}

	public void method1733(class354 var1) {
		this.method1732();
		if (var1 != null) {
			this.field2540 = var1;
			class409 var3 = var1.method1842();
			if (null != var3) {
				var3.field3193.method712(true);
				if (var3.field3194 != null) {
					class165 var4 = new class165();
					var4.method966(var1);
					var4.method967(var3.field3194);
					Client.method459().method2222(var4);
				}
			}
		}
	}

	public class354 method1730() {
		return this.field2540;
	}

	public void method1732() {
		if (this.field2540 != null) {
			class409 var2 = this.field2540.method1842();
			class354 var3 = this.field2540;
			this.field2540 = null;
			if (var2 != null) {
				var2.field3193.method712(false);
				if (null != var2.field3194) {
					class165 var4 = new class165();
					var4.method966(var3);
					var4.method967(var2.field3194);
					Client.method459().method2222(var4);
				}
			}
		}
	}

	@Override
	public boolean method1162(int var1) {
		if (this.field2540 == null) {
			return false;
		} else {
			class530 var3 = this.field2540.method1831();
			if (null == var3) {
				return false;
			} else {
				if (var3.method2574(var1)) {
					switch(var1) {
						case 81:
							this.field2541 = true;
							break;
						case 82:
							this.field2539 = true;
							break;
						default:
							if (this.method1731(var1)) {
								Client.method532(this.field2540);
							}
					}
				}
				return var3.method2565(var1);
			}
		}
	}

	@Override
	public boolean method1160(int var1) {
		switch(var1) {
			case 81:
				this.field2541 = false;
				return false;
			case 82:
				this.field2539 = false;
				return false;
			default:
				return false;
		}
	}

	@Override
	public boolean method1161(char var1) {
		if (this.field2540 == null) {
			return false;
		} else {
			boolean var3;
			if (var1 >= ' ' && var1 < 127 || var1 > 127 && var1 < 160 || var1 > 160 && var1 <= 255) {
				var3 = true;
			} else {
				label80: {
					if (var1 != 0) {
						char[] var4 = class111.field1317;
						for (int var5 = 0; var5 < var4.length; ++var5) {
							char var6 = var4[var5];
							if (var1 == var6) {
								var3 = true;
								break label80;
							}
						}
					}
					var3 = false;
				}
			}
			if (!var3) {
				return false;
			} else {
				class114 var7 = this.field2540.method1855();
				if (null != var7 && var7.method754()) {
					class530 var8 = this.field2540.method1831();
					if (null == var8) {
						return false;
					} else {
						if (var8.method2566(var1) && var7.method771(var1)) {
							Client.method532(this.field2540);
						}
						return var8.method2569(var1);
					}
				} else {
					return false;
				}
			}
		}
	}

	@Override
	public boolean method1163(boolean var1) {
		return false;
	}

	boolean method1731(int var1) {
		if (null == this.field2540) {
			return false;
		} else {
			class114 var3 = this.field2540.method1855();
			if (null != var3 && var3.method754()) {
				switch(var1) {
					case 13:
						this.method1732();
						return true;
					case 48:
						if (this.field2539) {
							var3.method789();
						}
						return true;
					case 65:
						if (this.field2539) {
							var3.method713(Client.method575());
						}
						return true;
					case 66:
						if (this.field2539) {
							var3.method743(Client.method575());
						}
						return true;
					case 67:
						if (this.field2539) {
							var3.method744(Client.method575());
						}
						return true;
					case 84:
						if (var3.method757() == 0) {
							var3.method771(10);
						} else if (this.field2541 && var3.method775()) {
							var3.method771(10);
						} else {
							class409 var4 = this.field2540.method1842();
							class165 var5 = new class165();
							var5.method966(this.field2540);
							var5.method967(var4.field3190);
							Client.method459().method2222(var5);
							this.method1732();
						}
						return true;
					case 85:
						if (this.field2539) {
							var3.method728();
						} else {
							var3.method726();
						}
						return true;
					case 96:
						if (this.field2539) {
							var3.method737(this.field2541);
						} else {
							var3.method783(this.field2541);
						}
						return true;
					case 97:
						if (this.field2539) {
							var3.method738(this.field2541);
						} else {
							var3.method736(this.field2541);
						}
						return true;
					case 98:
						if (this.field2539) {
							var3.method784();
						} else {
							var3.method739(this.field2541);
						}
						return true;
					case 99:
						if (this.field2539) {
							var3.method745();
						} else {
							var3.method740(this.field2541);
						}
						return true;
					case 101:
						if (this.field2539) {
							var3.method749();
						} else {
							var3.method727();
						}
						return true;
					case 102:
						if (this.field2539) {
							var3.method734(this.field2541);
						} else {
							var3.method732(this.field2541);
						}
						return true;
					case 103:
						if (this.field2539) {
							var3.method735(this.field2541);
						} else {
							var3.method733(this.field2541);
						}
						return true;
					case 104:
						if (this.field2539) {
							var3.method779(this.field2541);
						} else {
							var3.method741(this.field2541);
						}
						return true;
					case 105:
						if (this.field2539) {
							var3.method778(this.field2541);
						} else {
							var3.method729(this.field2541);
						}
						return true;
					default:
						return false;
				}
			} else {
				return false;
			}
		}
	}
}
