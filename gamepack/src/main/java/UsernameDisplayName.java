public class UsernameDisplayName implements Comparable {

	String field787;

	String field788;

	public UsernameDisplayName(String var1) {
		this.field788 = var1;
		class79 var4 = class79.field797;
		String var3;
		if (null == var1) {
			var3 = null;
		} else {
			label66: {
				int var5 = 0;
				int var6;
				for (var6 = var1.length(); var5 < var6 && UsernameTools.isNameSeparator(var1.charAt(var5)); ++var5) {
				}
				while (var6 > var5 && UsernameTools.isNameSeparator(var1.charAt(var6 - 1))) {
					--var6;
				}
				int var7 = var6 - var5;
				if (var7 >= 1) {
					byte var9;
					if (var4 == null) {
						var9 = 12;
					} else {
						switch(var4.field790) {
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
							if (UsernameTools.isNamePart(var10)) {
								char var11 = UsernameTools.formatCharacter(var10);
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
		this.field787 = var3;
	}

	public UsernameDisplayName(String var1, class79 var2) {
		this.field788 = var1;
		String var4;
		if (null == var1) {
			var4 = null;
		} else {
			label66: {
				int var5 = 0;
				int var6;
				for (var6 = var1.length(); var5 < var6 && UsernameTools.isNameSeparator(var1.charAt(var5)); ++var5) {
				}
				while (var6 > var5 && UsernameTools.isNameSeparator(var1.charAt(var6 - 1))) {
					--var6;
				}
				int var7 = var6 - var5;
				if (var7 >= 1) {
					byte var9;
					if (null == var2) {
						var9 = 12;
					} else {
						switch(var2.field790) {
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
							if (UsernameTools.isNamePart(var10)) {
								char var11 = UsernameTools.formatCharacter(var10);
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
		this.field787 = var4;
	}

	public String method322() {
		return this.field788;
	}

	public String method320() {
		return this.field787;
	}

	public boolean method323() {
		return null != this.field787;
	}

	@Override
	public boolean equals(Object var1) {
		if (var1 instanceof UsernameDisplayName) {
			UsernameDisplayName var2 = (UsernameDisplayName) var1;
			if (null == this.field787) {
				return null == var2.field787;
			} else if (null == var2.field787) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.field787.equals(var2.field787);
			}
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return this.field787 == null ? 0 : this.field787.hashCode();
	}

	@Override
	public String toString() {
		return this.method322();
	}

	public int method321(UsernameDisplayName var1) {
		if (this.field787 == null) {
			return null == var1.field787 ? 0 : 1;
		} else {
			return null == var1.field787 ? -1 : this.field787.compareTo(var1.field787);
		}
	}

	@Override
	public int compareTo(Object var1) {
		return this.method321((UsernameDisplayName) var1);
	}
}
