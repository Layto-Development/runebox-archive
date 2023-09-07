import java.io.EOFException;
import java.io.IOException;

public final class class27 {

	static byte[] field132;

	class358 field130;

	class358 field131;

	int field133;

	int field134;

	static {
		field132 = new byte[520];
	}

	public class27(int var1, class358 var2, class358 var3, int var4) {
		this.field130 = null;
		this.field131 = null;
		this.field133 = 65000;
		this.field134 = var1;
		this.field130 = var2;
		this.field131 = var3;
		this.field133 = var4;
	}

	public byte[] method76(int var1) {
		synchronized (this.field130) {
			Object var10000;
			try {
				if (this.field131.method1884() < (long) (6 + var1 * 6)) {
					var10000 = null;
					return (byte[]) var10000;
				}
				this.field131.method1878((long) (var1 * 6));
				this.field131.method1880(field132, 0, 6);
				int var4 = (field132[2] & 255) + ((field132[1] & 255) << 8) + ((field132[0] & 255) << 16);
				int var5 = ((field132[4] & 255) << 8) + ((field132[3] & 255) << 16) + (field132[5] & 255);
				if (var4 < 0 || var4 > this.field133) {
					var10000 = null;
					return (byte[]) var10000;
				}
				if (var5 > 0 && (long) var5 <= this.field130.method1884() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							var10000 = null;
							return (byte[]) var10000;
						}
						this.field130.method1878(520L * (long) var5);
						int var9 = var4 - var7;
						int var10;
						int var11;
						int var12;
						int var13;
						byte var14;
						if (var1 > 65535) {
							if (var9 > 510) {
								var9 = 510;
							}
							var14 = 10;
							this.field130.method1880(field132, 0, var9 + 10);
							var10 = ((field132[2] & 255) << 8) + ((field132[1] & 255) << 16) + ((field132[0] & 255) << 24) + (field132[3] & 255);
							var11 = ((field132[4] & 255) << 8) + (field132[5] & 255);
							var12 = (field132[8] & 255) + ((field132[6] & 255) << 16) + ((field132[7] & 255) << 8);
							var13 = field132[9] & 255;
						} else {
							if (var9 > 512) {
								var9 = 512;
							}
							var14 = 8;
							this.field130.method1880(field132, 0, 8 + var9);
							var10 = ((field132[0] & 255) << 8) + (field132[1] & 255);
							var11 = (field132[3] & 255) + ((field132[2] & 255) << 8);
							var12 = (field132[6] & 255) + ((field132[5] & 255) << 8) + ((field132[4] & 255) << 16);
							var13 = field132[7] & 255;
						}
						if (var10 == var1 && var8 == var11 && var13 == this.field134) {
							if (var12 >= 0 && (long) var12 <= this.field130.method1884() / 520L) {
								int var15 = var9 + var14;
								for (int var16 = var14; var16 < var15; ++var16) {
									var6[var7++] = field132[var16];
								}
								var5 = var12;
								++var8;
								continue;
							}
							var10000 = null;
							return (byte[]) var10000;
						}
						var10000 = null;
						return (byte[]) var10000;
					}
					byte[] var20 = var6;
					return var20;
				}
				var10000 = null;
			} catch (IOException var18) {
				return null;
			}
			return (byte[]) var10000;
		}
	}

	public boolean method77(int var1, byte[] var2, int var3) {
		synchronized (this.field130) {
			if (var3 >= 0 && var3 <= this.field133) {
				boolean var6 = this.method78(var1, var2, var3, true);
				if (!var6) {
					var6 = this.method78(var1, var2, var3, false);
				}
				return var6;
			} else {
				throw new IllegalArgumentException("" + this.field134 + ',' + var1 + ',' + var3);
			}
		}
	}

	boolean method78(int var1, byte[] var2, int var3, boolean var4) {
		synchronized (this.field130) {
			try {
				int var7;
				boolean var10000;
				if (var4) {
					if (this.field131.method1884() < (long) (var1 * 6 + 6)) {
						var10000 = false;
						return var10000;
					}
					this.field131.method1878((long) (var1 * 6));
					this.field131.method1880(field132, 0, 6);
					var7 = (field132[5] & 255) + ((field132[3] & 255) << 16) + ((field132[4] & 255) << 8);
					if (var7 <= 0 || (long) var7 > this.field130.method1884() / 520L) {
						var10000 = false;
						return var10000;
					}
				} else {
					var7 = (int) ((this.field130.method1884() + 519L) / 520L);
					if (var7 == 0) {
						var7 = 1;
					}
				}
				field132[0] = (byte) (var3 >> 16);
				field132[1] = (byte) (var3 >> 8);
				field132[2] = (byte) var3;
				field132[3] = (byte) (var7 >> 16);
				field132[4] = (byte) (var7 >> 8);
				field132[5] = (byte) var7;
				this.field131.method1878((long) (var1 * 6));
				this.field131.method1882(field132, 0, 6);
				int var8 = 0;
				int var9 = 0;
				while (true) {
					if (var8 < var3) {
						label154: {
							int var10 = 0;
							int var11;
							if (var4) {
								this.field130.method1878((long) var7 * 520L);
								int var12;
								int var13;
								if (var1 > 65535) {
									try {
										this.field130.method1880(field132, 0, 10);
									} catch (EOFException var17) {
										break label154;
									}
									var11 = ((field132[1] & 255) << 16) + ((field132[0] & 255) << 24) + ((field132[2] & 255) << 8) + (field132[3] & 255);
									var12 = (field132[5] & 255) + ((field132[4] & 255) << 8);
									var10 = ((field132[6] & 255) << 16) + ((field132[7] & 255) << 8) + (field132[8] & 255);
									var13 = field132[9] & 255;
								} else {
									try {
										this.field130.method1880(field132, 0, 8);
									} catch (EOFException var16) {
										break label154;
									}
									var11 = ((field132[0] & 255) << 8) + (field132[1] & 255);
									var12 = ((field132[2] & 255) << 8) + (field132[3] & 255);
									var10 = (field132[6] & 255) + ((field132[5] & 255) << 8) + ((field132[4] & 255) << 16);
									var13 = field132[7] & 255;
								}
								if (var1 != var11 || var12 != var9 || this.field134 != var13) {
									var10000 = false;
									return var10000;
								}
								if (var10 < 0 || (long) var10 > this.field130.method1884() / 520L) {
									var10000 = false;
									return var10000;
								}
							}
							if (var10 == 0) {
								var4 = false;
								var10 = (int) ((this.field130.method1884() + 519L) / 520L);
								if (var10 == 0) {
									++var10;
								}
								if (var10 == var7) {
									++var10;
								}
							}
							if (var1 > 65535) {
								if (var3 - var8 <= 510) {
									var10 = 0;
								}
								field132[0] = (byte) (var1 >> 24);
								field132[1] = (byte) (var1 >> 16);
								field132[2] = (byte) (var1 >> 8);
								field132[3] = (byte) var1;
								field132[4] = (byte) (var9 >> 8);
								field132[5] = (byte) var9;
								field132[6] = (byte) (var10 >> 16);
								field132[7] = (byte) (var10 >> 8);
								field132[8] = (byte) var10;
								field132[9] = (byte) this.field134;
								this.field130.method1878((long) var7 * 520L);
								this.field130.method1882(field132, 0, 10);
								var11 = var3 - var8;
								if (var11 > 510) {
									var11 = 510;
								}
								this.field130.method1882(var2, var8, var11);
								var8 += var11;
							} else {
								if (var3 - var8 <= 512) {
									var10 = 0;
								}
								field132[0] = (byte) (var1 >> 8);
								field132[1] = (byte) var1;
								field132[2] = (byte) (var9 >> 8);
								field132[3] = (byte) var9;
								field132[4] = (byte) (var10 >> 16);
								field132[5] = (byte) (var10 >> 8);
								field132[6] = (byte) var10;
								field132[7] = (byte) this.field134;
								this.field130.method1878(520L * (long) var7);
								this.field130.method1882(field132, 0, 8);
								var11 = var3 - var8;
								if (var11 > 512) {
									var11 = 512;
								}
								this.field130.method1882(var2, var8, var11);
								var8 += var11;
							}
							var7 = var10;
							++var9;
							continue;
						}
					}
					var10000 = true;
					return var10000;
				}
			} catch (IOException var18) {
				return false;
			}
		}
	}

	@Override
	public String toString() {
		return "" + this.field134;
	}
}
