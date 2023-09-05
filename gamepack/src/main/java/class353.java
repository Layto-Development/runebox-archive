import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "uc")
public class class353 implements Comparable {
	@ObfInfo(name = "ae", desc = "Ljava/lang/String;")
	String field2798;
	@ObfInfo(name = "au", desc = "Ljava/lang/String;")
	String field2799;

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/String;)V")
	public class353(String var1) {
		this.field2799 = var1;
		class187 var4 = class187.field1706;
		String var3;
		if (null == var1) {
			var3 = null;
		} else {
			label66: {
				int var5 = 0;

				int var6;
				for (var6 = var1.length(); var5 < var6 && class477.method2440(var1.charAt(var5)); ++var5) {
				}

				while (var6 > var5 && class477.method2440(var1.charAt(var6 - 1))) {
					--var6;
				}

				int var7 = var6 - var5;
				if (var7 >= 1) {
					byte var9;
					if (var4 == null) {
						var9 = 12;
					} else {
						switch(var4.field1699) {
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
							if (class477.method2438(var10)) {
								char var11 = class477.method2437(var10);
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

		this.field2798 = var3;
	}

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/String;Lsl;)V")
	public class353(String var1, class187 var2) {
		this.field2799 = var1;
		String var4;
		if (null == var1) {
			var4 = null;
		} else {
			label66: {
				int var5 = 0;

				int var6;
				for (var6 = var1.length(); var5 < var6 && class477.method2440(var1.charAt(var5)); ++var5) {
				}

				while (var6 > var5 && class477.method2440(var1.charAt(var6 - 1))) {
					--var6;
				}

				int var7 = var6 - var5;
				if (var7 >= 1) {
					byte var9;
					if (null == var2) {
						var9 = 12;
					} else {
						switch(var2.field1699) {
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
							if (class477.method2438(var10)) {
								char var11 = class477.method2437(var10);
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

		this.field2798 = var4;
	}

	@ObfInfo(name = "au", desc = "(I)Ljava/lang/String;")
	public String method1935() {
		return this.field2799;
	}

	@ObfInfo(name = "ae", desc = "(B)Ljava/lang/String;")
	public String method1933() {
		return this.field2798;
	}

	@ObfInfo(name = "ao", desc = "(I)Z", opaqueValue = "-1910650752")
	public boolean method1936() {
		return null != this.field2798;
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		if (var1 instanceof class353) {
			class353 var2 = (class353)var1;
			if (null == this.field2798) {
				return null == var2.field2798;
			} else if (null == var2.field2798) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.field2798.equals(var2.field2798);
			}
		} else {
			return false;
		}
	}

	@ObfInfo(name = "hashCode", desc = "()I")
	public int hashCode() {
		return this.field2798 == null ? 0 : this.field2798.hashCode();
	}

	@ObfInfo(name = "toString", desc = "()Ljava/lang/String;")
	public String toString() {
		return this.method1935();
	}

	@ObfInfo(name = "at", desc = "(Luc;I)I", opaqueValue = "-2077400310")
	public int method1934(class353 var1) {
		if (this.field2798 == null) {
			return null == var1.field2798 ? 0 : 1;
		} else {
			return null == var1.field2798 ? -1 : this.field2798.compareTo(var1.field2798);
		}
	}

	@ObfInfo(name = "compareTo", desc = "(Ljava/lang/Object;)I")
	public int compareTo(Object var1) {
		return this.method1934((class353)var1);
	}
}
