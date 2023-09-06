public class class440 implements Comparable {
	String field3869;
	String field3870;

	public class440(String var1) {
		this.field3870 = var1;
		class392 var4 = class392.field3285;
		String var3;
		if (null == var1) {
			var3 = null;
		} else {
			label66: {
				int var5 = 0;

				int var6;
				for (var6 = var1.length(); var5 < var6 && class146.method851(var1.charAt(var5)); ++var5) {
				}

				while (var6 > var5 && class146.method851(var1.charAt(var6 - 1))) {
					--var6;
				}

				int var7 = var6 - var5;
				if (var7 >= 1) {
					byte var9;
					if (var4 == null) {
						var9 = 12;
					} else {
						switch(var4.field3278) {
						case 0:
							var9 = 20;
							break;
						default:
							var9 = 12;
						}
					}

					if (var7 <= var9) {
						StringBuilder var8 = new StringBuilder(var7);

						for (int var12 = var5; var12 < var6; ++var12) {
							char var10 = var1.charAt(var12);
							if (class516.method2518(var10)) {
								char var11 = class451.method2250(var10);
								if (var11 != 0) {
									var8.append(var11);
								}
							}
						}

						if (var8.length() == 0) {
							var3 = null;
						} else {
							var3 = var8.toString();
						}
						break label66;
					}
				}

				var3 = null;
			}
		}

		this.field3869 = var3;
	}

	public class440(String var1, class392 var2) {
		this.field3870 = var1;
		String var4;
		if (null == var1) {
			var4 = null;
		} else {
			label66: {
				int var5 = 0;

				int var6;
				for (var6 = var1.length(); var5 < var6 && class146.method851(var1.charAt(var5)); ++var5) {
				}

				while (var6 > var5 && class146.method851(var1.charAt(var6 - 1))) {
					--var6;
				}

				int var7 = var6 - var5;
				if (var7 >= 1) {
					byte var9;
					if (null == var2) {
						var9 = 12;
					} else {
						switch(var2.field3278) {
						case 0:
							var9 = 20;
							break;
						default:
							var9 = 12;
						}
					}

					if (var7 <= var9) {
						StringBuilder var8 = new StringBuilder(var7);

						for (int var12 = var5; var12 < var6; ++var12) {
							char var10 = var1.charAt(var12);
							if (class516.method2518(var10)) {
								char var11 = class451.method2250(var10);
								if (var11 != 0) {
									var8.append(var11);
								}
							}
						}

						if (var8.length() == 0) {
							var4 = null;
						} else {
							var4 = var8.toString();
						}
						break label66;
					}
				}

				var4 = null;
			}
		}

		this.field3869 = var4;
	}

	public String method2214() {
		return this.field3870;
	}

	public String method2212() {
		return this.field3869;
	}

	public boolean method2215() {
		return null != this.field3869;
	}

	public boolean equals(Object var1) {
		if (var1 instanceof class440) {
			class440 var2 = (class440)var1;
			if (null == this.field3869) {
				return null == var2.field3869;
			} else if (null == var2.field3869) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.field3869.equals(var2.field3869);
			}
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.field3869 == null ? 0 : this.field3869.hashCode();
	}

	public String toString() {
		return this.method2214();
	}

	public int method2213(class440 var1) {
		if (this.field3869 == null) {
			return null == var1.field3869 ? 0 : 1;
		} else {
			return null == var1.field3869 ? -1 : this.field3869.compareTo(var1.field3869);
		}
	}

	public int compareTo(Object var1) {
		return this.method2213((class440)var1);
	}
}
