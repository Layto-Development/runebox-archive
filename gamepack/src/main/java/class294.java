import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "ig")
public class class294 implements class53 {
	@ObfInfo(name = "ae", desc = "Z")
	boolean field2380;
	@ObfInfo(name = "ao", desc = "Z")
	boolean field2382;
	@ObfInfo(name = "au", desc = "Lmi;")
	class131 field2381;

	@ObfInfo(name = "<init>", desc = "()V")
	public class294() {
		this.field2381 = null;
		this.field2380 = false;
		this.field2382 = false;
	}

	@ObfInfo(name = "ar", desc = "(Lmi;I)V", opaqueValue = "241307982")
	public void method1629(class131 var1) {
		this.method1628();
		if (var1 != null) {
			this.field2381 = var1;
			class431 var3 = var1.method738();
			if (null != var3) {
				var3.field3268.method7(true);
				if (var3.field3269 != null) {
					class20 var4 = new class20();
					var4.method332(var1);
					var4.method333(var3.field3269);
					Client.method140().method631(var4);
				}
			}
		}

	}

	@ObfInfo(name = "ab", desc = "(I)Lmi;")
	public class131 method1626() {
		return this.field2381;
	}

	@ObfInfo(name = "ag", desc = "(B)V", opaqueValue = "3")
	public void method1628() {
		if (this.field2381 != null) {
			class431 var2 = this.field2381.method738();
			class131 var3 = this.field2381;
			this.field2381 = null;
			if (var2 != null) {
				var2.field3268.method7(false);
				if (null != var2.field3269) {
					class20 var4 = new class20();
					var4.method332(var3);
					var4.method333(var2.field3269);
					Client.method140().method631(var4);
				}

			}
		}
	}

	@ObfInfo(name = "au", desc = "(II)Z", opaqueValue = "1089015731")
	public boolean method460(int var1) {
		if (this.field2381 == null) {
			return false;
		} else {
			class435 var3 = this.field2381.method727();
			if (null == var3) {
				return false;
			} else {
				if (var3.method2265(var1)) {
					switch(var1) {
					case 81:
						this.field2382 = true;
						break;
					case 82:
						this.field2380 = true;
						break;
					default:
						if (this.method1627(var1)) {
							Client.method213(this.field2381);
						}
					}
				}

				return var3.method2256(var1);
			}
		}
	}

	@ObfInfo(name = "ae", desc = "(II)Z")
	public boolean method458(int var1) {
		switch(var1) {
		case 81:
			this.field2382 = false;
			return false;
		case 82:
			this.field2380 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfInfo(name = "ao", desc = "(CI)Z", opaqueValue = "-1305793592")
	public boolean method459(char var1) {
		if (this.field2381 == null) {
			return false;
		} else {
			boolean var3;
			if (var1 >= ' ' && var1 < 127 || var1 > 127 && var1 < 160 || var1 > 160 && var1 <= 255) {
				var3 = true;
			} else {
				label80: {
					if (var1 != 0) {
						char[] var4 = class244.field2013;

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
				class4 var7 = this.field2381.method751();
				if (null != var7 && var7.method49()) {
					class435 var8 = this.field2381.method727();
					if (null == var8) {
						return false;
					} else {
						if (var8.method2257(var1) && var7.method66(var1)) {
							Client.method213(this.field2381);
						}

						return var8.method2260(var1);
					}
				} else {
					return false;
				}
			}
		}
	}

	@ObfInfo(name = "at", desc = "(ZI)Z")
	public boolean method461(boolean var1) {
		return false;
	}

	@ObfInfo(name = "am", desc = "(IB)Z", opaqueValue = "6")
	boolean method1627(int var1) {
		if (null == this.field2381) {
			return false;
		} else {
			class4 var3 = this.field2381.method751();
			if (null != var3 && var3.method49()) {
				switch(var1) {
				case 13:
					this.method1628();
					return true;
				case 48:
					if (this.field2380) {
						var3.method84();
					}

					return true;
				case 65:
					if (this.field2380) {
						var3.method8(Client.method256());
					}

					return true;
				case 66:
					if (this.field2380) {
						var3.method38(Client.method256());
					}

					return true;
				case 67:
					if (this.field2380) {
						var3.method39(Client.method256());
					}

					return true;
				case 84:
					if (var3.method52() == 0) {
						var3.method66(10);
					} else if (this.field2382 && var3.method70()) {
						var3.method66(10);
					} else {
						class431 var4 = this.field2381.method738();
						class20 var5 = new class20();
						var5.method332(this.field2381);
						var5.method333(var4.field3265);
						Client.method140().method631(var5);
						this.method1628();
					}

					return true;
				case 85:
					if (this.field2380) {
						var3.method23();
					} else {
						var3.method21();
					}

					return true;
				case 96:
					if (this.field2380) {
						var3.method32(this.field2382);
					} else {
						var3.method78(this.field2382);
					}

					return true;
				case 97:
					if (this.field2380) {
						var3.method33(this.field2382);
					} else {
						var3.method31(this.field2382);
					}

					return true;
				case 98:
					if (this.field2380) {
						var3.method79();
					} else {
						var3.method34(this.field2382);
					}

					return true;
				case 99:
					if (this.field2380) {
						var3.method40();
					} else {
						var3.method35(this.field2382);
					}

					return true;
				case 101:
					if (this.field2380) {
						var3.method44();
					} else {
						var3.method22();
					}

					return true;
				case 102:
					if (this.field2380) {
						var3.method29(this.field2382);
					} else {
						var3.method27(this.field2382);
					}

					return true;
				case 103:
					if (this.field2380) {
						var3.method30(this.field2382);
					} else {
						var3.method28(this.field2382);
					}

					return true;
				case 104:
					if (this.field2380) {
						var3.method74(this.field2382);
					} else {
						var3.method36(this.field2382);
					}

					return true;
				case 105:
					if (this.field2380) {
						var3.method73(this.field2382);
					} else {
						var3.method24(this.field2382);
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
