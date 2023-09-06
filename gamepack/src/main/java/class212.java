import java.util.LinkedList;

public abstract class class212 {
	boolean field2000;
	boolean field2001;
	byte[][][] field1989;
	byte[][][] field2002;
	class359[][][][] field1999;
	int field1988;
	int field1990;
	int field1991;
	int field1992;
	int field1994;
	int field1996;
	int field1997;
	int field1998;
	short[][][] field1993;
	short[][][] field1995;

	class212() {
		this.field1998 = -1;
		this.field1988 = -1;
		new LinkedList();
		this.field2000 = false;
		this.field2001 = false;
	}

	abstract void method1202(class42 var1);

	boolean method1199() {
		return this.field2000 && this.field2001;
	}

	void method1200(class215 var1) {
		if (!this.method1199()) {
			byte[] var3 = var1.method1212(this.field1998, this.field1988);
			if (var3 != null) {
				this.method1202(new class42(var3));
				this.field2000 = true;
				this.field2001 = true;
			}

		}
	}

	void method1201() {
		this.field1995 = (short[][][])null;
		this.field1993 = (short[][][])null;
		this.field2002 = (byte[][][])null;
		this.field1989 = (byte[][][])null;
		this.field1999 = (class359[][][][])null;
		this.field2000 = false;
		this.field2001 = false;
	}

	void method1204(int var1, int var2, class42 var3) {
		int var5 = var3.method278();
		if (var5 != 0) {
			if ((var5 & 1) != 0) {
				this.method1203(var1, var2, var3, var5);
			} else {
				this.method1208(var1, var2, var3, var5);
			}

		}
	}

	void method1203(int var1, int var2, class42 var3, int var4) {
		boolean var6 = (var4 & 2) != 0;
		if (var6) {
			this.field1993[0][var1][var2] = (short)var3.method327();
		}

		this.field1995[0][var1][var2] = (short)var3.method327();
	}

	void method1208(int var1, int var2, class42 var3, int var4) {
		int var6 = ((var4 & 24) >> 3) + 1;
		boolean var7 = (var4 & 2) != 0;
		boolean var8 = (var4 & 4) != 0;
		this.field1995[0][var1][var2] = (short)var3.method327();
		int var9;
		int var10;
		int var12;
		if (var7) {
			var9 = var3.method278();

			for (var10 = 0; var10 < var9; ++var10) {
				int var11 = var3.method327();
				if (var11 != 0) {
					this.field1993[var10][var1][var2] = (short)var11;
					var12 = var3.method278();
					this.field2002[var10][var1][var2] = (byte)(var12 >> 2);
					this.field1989[var10][var1][var2] = (byte)(var12 & 3);
				}
			}
		}

		if (var8) {
			for (var9 = 0; var9 < var6; ++var9) {
				var10 = var3.method278();
				if (var10 != 0) {
					class359[] var15 = this.field1999[var9][var1][var2] = new class359[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						int var13 = var3.method326();
						int var14 = var3.method278();
						var15[var12] = new class359(var13, var14 >> 2, var14 & 3);
					}
				}
			}
		}

	}

	int method1205() {
		return this.field1990;
	}

	int method1207() {
		return this.field1997;
	}

	static class150[] method1206() {
		return new class150[]{class150.field1403, class150.field1405, class150.field1409, class150.field1410, class150.field1404, class150.field1406};
	}

	public static class411 method1209() {
		return Client.field151;
	}
}
