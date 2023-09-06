public class class210 extends class218 {
	public static boolean field1934;
	public static class215 field1933;
	public static class344 field1935;
	public static class344 field1937;
	public static class344 field1980;
	static int[] field1986;
	class526 field1981;
	int field1938;
	int field1939;
	int field1947;
	int field1957;
	int field1958;
	int field1959;
	int field1960;
	int field1961;
	int field1962;
	int field1963;
	int field1964;
	int field1965;
	int field1966;
	int field1968;
	int field1969;
	int field1974;
	int field1975;
	int field1976;
	int field1983;
	int field1984;
	int[] field1970;
	int[] field1971;
	public boolean field1942;
	public boolean field1982;
	public int field1930;
	public int field1931;
	public int field1932;
	public int field1936;
	public int field1940;
	public int field1944;
	public int field1945;
	public int field1946;
	public int field1948;
	public int field1949;
	public int field1950;
	public int field1951;
	public int field1952;
	public int field1953;
	public int field1972;
	public int field1977;
	public int field1978;
	public int field1979;
	public int field1985;
	public String field1954;
	public String[] field1955;
	public String[] field1956;
	public short[] field1941;
	public short[] field1943;
	public short[] field1967;
	public short[] field1973;

	static {
		field1935 = new class344(64);
		field1980 = new class344(50);
		field1937 = new class344(200);
	}

	class210() {
		this.field1954 = class433.field3850;
		this.field1953 = 2000;
		this.field1930 = 0;
		this.field1946 = 0;
		this.field1932 = 0;
		this.field1931 = 0;
		this.field1948 = 0;
		this.field1949 = 0;
		this.field1950 = 1;
		this.field1951 = -1;
		this.field1936 = -1;
		this.field1952 = -1;
		this.field1942 = false;
		this.field1955 = new String[]{null, null, class433.field3703, null, null};
		this.field1956 = new String[]{null, null, null, null, class433.field3712};
		this.field1957 = -2;
		this.field1984 = -1;
		this.field1959 = -1;
		this.field1960 = 0;
		this.field1961 = -1;
		this.field1962 = -1;
		this.field1963 = 0;
		this.field1983 = -1;
		this.field1965 = -1;
		this.field1964 = -1;
		this.field1968 = -1;
		this.field1947 = -1;
		this.field1969 = -1;
		this.field1972 = -1;
		this.field1945 = -1;
		this.field1974 = 128;
		this.field1975 = 128;
		this.field1976 = 128;
		this.field1977 = 0;
		this.field1978 = 0;
		this.field1979 = 0;
		this.field1940 = 0;
		this.field1982 = false;
		this.field1958 = -1;
		this.field1966 = -1;
		this.field1944 = -1;
		this.field1985 = -1;
	}

	void method1196() {
		if (this.field1949 == 1) {
			this.field1940 = 0;
		}

	}

	void method1184(class42 var1) {
		while (true) {
			int var3 = var1.method278();
			if (var3 == 0) {
				return;
			}

			this.method1180(var1, var3);
		}
	}

	void method1180(class42 var1, int var2) {
		if (var2 == 1) {
			this.field1939 = var1.method327();
		} else if (var2 == 2) {
			this.field1954 = var1.method286();
		} else if (var2 == 4) {
			this.field1953 = var1.method327();
		} else if (var2 == 5) {
			this.field1930 = var1.method327();
		} else if (var2 == 6) {
			this.field1946 = var1.method327();
		} else if (var2 == 7) {
			this.field1931 = var1.method327();
			if (this.field1931 > 32767) {
				this.field1931 -= 65536;
			}
		} else if (var2 == 8) {
			this.field1948 = var1.method327();
			if (this.field1948 > 32767) {
				this.field1948 -= 65536;
			}
		} else if (var2 == 9) {
			var1.method286();
		} else if (var2 == 11) {
			this.field1949 = 1;
		} else if (var2 == 12) {
			this.field1950 = var1.method282();
		} else if (var2 == 13) {
			this.field1951 = var1.method278();
		} else if (var2 == 14) {
			this.field1936 = var1.method278();
		} else if (var2 == 16) {
			this.field1942 = true;
		} else if (var2 == 23) {
			this.field1984 = var1.method327();
			this.field1960 = var1.method278();
		} else if (var2 == 24) {
			this.field1959 = var1.method327();
		} else if (var2 == 25) {
			this.field1961 = var1.method327();
			this.field1963 = var1.method278();
		} else if (var2 == 26) {
			this.field1962 = var1.method327();
		} else if (var2 == 27) {
			this.field1952 = var1.method278();
		} else if (var2 >= 30 && var2 < 35) {
			this.field1955[var2 - 30] = var1.method286();
			if (this.field1955[var2 - 30].equalsIgnoreCase(class433.field3792)) {
				this.field1955[var2 - 30] = null;
			}
		} else if (var2 >= 35 && var2 < 40) {
			this.field1956[var2 - 35] = var1.method286();
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var4 = var1.method278();
				this.field1973 = new short[var4];
				this.field1941 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field1973[var5] = (short)var1.method327();
					this.field1941[var5] = (short)var1.method327();
				}
			} else if (var2 == 41) {
				var4 = var1.method278();
				this.field1967 = new short[var4];
				this.field1943 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field1967[var5] = (short)var1.method327();
					this.field1943[var5] = (short)var1.method327();
				}
			} else if (var2 == 42) {
				this.field1957 = var1.method279();
			} else if (var2 == 65) {
				this.field1982 = true;
			} else if (var2 == 75) {
				this.field1940 = var1.method280();
			} else if (var2 == 78) {
				this.field1983 = var1.method327();
			} else if (var2 == 79) {
				this.field1965 = var1.method327();
			} else if (var2 == 90) {
				this.field1964 = var1.method327();
			} else if (var2 == 91) {
				this.field1947 = var1.method327();
			} else if (var2 == 92) {
				this.field1968 = var1.method327();
			} else if (var2 == 93) {
				this.field1969 = var1.method327();
			} else if (var2 == 94) {
				var1.method327();
			} else if (var2 == 95) {
				this.field1932 = var1.method327();
			} else if (var2 == 97) {
				this.field1972 = var1.method327();
			} else if (var2 == 98) {
				this.field1945 = var1.method327();
			} else if (var2 >= 100 && var2 < 110) {
				if (this.field1970 == null) {
					this.field1970 = new int[10];
					this.field1971 = new int[10];
				}

				this.field1970[var2 - 100] = var1.method327();
				this.field1971[var2 - 100] = var1.method327();
			} else if (var2 == 110) {
				this.field1974 = var1.method327();
			} else if (var2 == 111) {
				this.field1975 = var1.method327();
			} else if (var2 == 112) {
				this.field1976 = var1.method327();
			} else if (var2 == 113) {
				this.field1977 = var1.method279();
			} else if (var2 == 114) {
				this.field1978 = var1.method279() * 5;
			} else if (var2 == 115) {
				this.field1979 = var1.method278();
			} else if (var2 == 139) {
				this.field1958 = var1.method327();
			} else if (var2 == 140) {
				this.field1966 = var1.method327();
			} else if (var2 == 148) {
				this.field1944 = var1.method327();
			} else if (var2 == 149) {
				this.field1985 = var1.method327();
			} else if (var2 == 249) {
				this.field1981 = class475.method2299(var1, this.field1981);
			}
		}

	}

	void method1181(class210 var1, class210 var2) {
		this.field1939 = var1.field1939;
		this.field1953 = var1.field1953;
		this.field1930 = var1.field1930;
		this.field1946 = var1.field1946;
		this.field1932 = var1.field1932;
		this.field1931 = var1.field1931;
		this.field1948 = var1.field1948;
		this.field1973 = var1.field1973;
		this.field1941 = var1.field1941;
		this.field1967 = var1.field1967;
		this.field1943 = var1.field1943;
		this.field1954 = var2.field1954;
		this.field1942 = var2.field1942;
		this.field1950 = var2.field1950;
		this.field1949 = 1;
	}

	void method1195(class210 var1, class210 var2) {
		this.field1939 = var1.field1939;
		this.field1953 = var1.field1953;
		this.field1930 = var1.field1930;
		this.field1946 = var1.field1946;
		this.field1932 = var1.field1932;
		this.field1931 = var1.field1931;
		this.field1948 = var1.field1948;
		this.field1973 = var2.field1973;
		this.field1941 = var2.field1941;
		this.field1967 = var2.field1967;
		this.field1943 = var2.field1943;
		this.field1954 = var2.field1954;
		this.field1942 = var2.field1942;
		this.field1949 = var2.field1949;
		this.field1951 = var2.field1951;
		this.field1936 = var2.field1936;
		this.field1952 = var2.field1952;
		this.field1984 = var2.field1984;
		this.field1959 = var2.field1959;
		this.field1983 = var2.field1983;
		this.field1961 = var2.field1961;
		this.field1962 = var2.field1962;
		this.field1965 = var2.field1965;
		this.field1964 = var2.field1964;
		this.field1968 = var2.field1968;
		this.field1947 = var2.field1947;
		this.field1969 = var2.field1969;
		this.field1979 = var2.field1979;
		this.field1955 = var2.field1955;
		this.field1940 = var2.field1940;
		this.field1956 = new String[5];
		if (null != var2.field1956) {
			for (int var4 = 0; var4 < 4; ++var4) {
				this.field1956[var4] = var2.field1956[var4];
			}
		}

		this.field1956[4] = class433.field3578;
		this.field1950 = 0;
	}

	void method1183(class210 var1, class210 var2) {
		this.field1939 = var1.field1939;
		this.field1953 = var1.field1953;
		this.field1930 = var1.field1930;
		this.field1946 = var1.field1946;
		this.field1932 = var1.field1932;
		this.field1931 = var1.field1931;
		this.field1948 = var1.field1948;
		this.field1973 = var1.field1973;
		this.field1941 = var1.field1941;
		this.field1967 = var1.field1967;
		this.field1943 = var1.field1943;
		this.field1949 = var1.field1949;
		this.field1954 = var2.field1954;
		this.field1950 = 0;
		this.field1942 = false;
		this.field1982 = false;
	}

	public final class48 method1190(int var1) {
		int var4;
		if (null != this.field1970 && var1 > 1) {
			int var3 = -1;

			for (var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field1971[var4] && this.field1971[var4] != 0) {
					var3 = this.field1970[var4];
				}
			}

			if (var3 != -1) {
				return class67.method492(var3).method1190(1);
			}
		}

		class48 var5 = class48.method373(field1933, this.field1939, 0);
		if (null == var5) {
			return null;
		} else {
			if (this.field1974 != 128 || this.field1975 != 128 || this.field1976 != 128) {
				var5.method364(this.field1974, this.field1975, this.field1976);
			}

			if (this.field1973 != null) {
				for (var4 = 0; var4 < this.field1973.length; ++var4) {
					var5.method372(this.field1973[var4], this.field1941[var4]);
				}
			}

			if (null != this.field1967) {
				for (var4 = 0; var4 < this.field1967.length; ++var4) {
					var5.method363(this.field1967[var4], this.field1943[var4]);
				}
			}

			return var5;
		}
	}

	public final class250 method1185(int var1) {
		if (null != this.field1970 && var1 > 1) {
			int var3 = -1;

			for (int var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field1971[var4] && this.field1971[var4] != 0) {
					var3 = this.field1970[var4];
				}
			}

			if (var3 != -1) {
				return class67.method492(var3).method1185(1);
			}
		}

		class250 var6 = (class250)field1980.method1890((long)this.field1938);
		if (var6 != null) {
			return var6;
		} else {
			class48 var7 = class48.method373(field1933, this.field1939, 0);
			if (var7 == null) {
				return null;
			} else {
				if (this.field1974 != 128 || this.field1975 != 128 || this.field1976 != 128) {
					var7.method364(this.field1974, this.field1975, this.field1976);
				}

				int var5;
				if (null != this.field1973) {
					for (var5 = 0; var5 < this.field1973.length; ++var5) {
						var7.method372(this.field1973[var5], this.field1941[var5]);
					}
				}

				if (null != this.field1967) {
					for (var5 = 0; var5 < this.field1967.length; ++var5) {
						var7.method363(this.field1967[var5], this.field1943[var5]);
					}
				}

				var6 = var7.method369(this.field1977 + 64, this.field1978 + 768, -50, -10, -50);
				var6.field2272 = true;
				field1980.method1889(var6, (long)this.field1938);
				return var6;
			}
		}
	}

	public class210 method1186(int var1) {
		if (null != this.field1970 && var1 > 1) {
			int var3 = -1;

			for (int var4 = 0; var4 < 10; ++var4) {
				if (var1 >= this.field1971[var4] && this.field1971[var4] != 0) {
					var3 = this.field1970[var4];
				}
			}

			if (var3 != -1) {
				return class67.method492(var3);
			}
		}

		return this;
	}

	public final boolean method1187(int var1) {
		int var3 = this.field1984;
		int var4 = this.field1959;
		int var5 = this.field1983;
		if (var1 == 1) {
			var3 = this.field1961;
			var4 = this.field1962;
			var5 = this.field1965;
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var6 = true;
			if (!field1933.method1214(var3, 0)) {
				var6 = false;
			}

			if (var4 != -1 && !field1933.method1214(var4, 0)) {
				var6 = false;
			}

			if (var5 != -1 && !field1933.method1214(var5, 0)) {
				var6 = false;
			}

			return var6;
		}
	}

	public final class48 method1188(int var1) {
		int var3 = this.field1984;
		int var4 = this.field1959;
		int var5 = this.field1983;
		if (var1 == 1) {
			var3 = this.field1961;
			var4 = this.field1962;
			var5 = this.field1965;
		}

		if (var3 == -1) {
			return null;
		} else {
			class48 var6 = class48.method373(field1933, var3, 0);
			if (var4 != -1) {
				class48 var7 = class48.method373(field1933, var4, 0);
				if (var5 != -1) {
					class48 var8 = class48.method373(field1933, var5, 0);
					class48[] var9 = new class48[]{var6, var7, var8};
					var6 = new class48(var9, 3);
				} else {
					class48[] var11 = new class48[]{var6, var7};
					var6 = new class48(var11, 2);
				}
			}

			if (var1 == 0 && this.field1960 != 0) {
				var6.method361(0, this.field1960, 0);
			}

			if (var1 == 1 && this.field1963 != 0) {
				var6.method361(0, this.field1963, 0);
			}

			int var10;
			if (this.field1973 != null) {
				for (var10 = 0; var10 < this.field1973.length; ++var10) {
					var6.method372(this.field1973[var10], this.field1941[var10]);
				}
			}

			if (this.field1967 != null) {
				for (var10 = 0; var10 < this.field1967.length; ++var10) {
					var6.method363(this.field1967[var10], this.field1943[var10]);
				}
			}

			return var6;
		}
	}

	public final boolean method1189(int var1) {
		int var3 = this.field1964;
		int var4 = this.field1968;
		if (var1 == 1) {
			var3 = this.field1947;
			var4 = this.field1969;
		}

		if (var3 == -1) {
			return true;
		} else {
			boolean var5 = true;
			if (!field1933.method1214(var3, 0)) {
				var5 = false;
			}

			if (var4 != -1 && !field1933.method1214(var4, 0)) {
				var5 = false;
			}

			return var5;
		}
	}

	public final class48 method1192(int var1) {
		int var3 = this.field1964;
		int var4 = this.field1968;
		if (var1 == 1) {
			var3 = this.field1947;
			var4 = this.field1969;
		}

		if (var3 == -1) {
			return null;
		} else {
			class48 var5 = class48.method373(field1933, var3, 0);
			if (var4 != -1) {
				class48 var6 = class48.method373(field1933, var4, 0);
				class48[] var7 = new class48[]{var5, var6};
				var5 = new class48(var7, 2);
			}

			int var8;
			if (this.field1973 != null) {
				for (var8 = 0; var8 < this.field1973.length; ++var8) {
					var5.method372(this.field1973[var8], this.field1941[var8]);
				}
			}

			if (null != this.field1967) {
				for (var8 = 0; var8 < this.field1967.length; ++var8) {
					var5.method363(this.field1967[var8], this.field1943[var8]);
				}
			}

			return var5;
		}
	}

	public int method1191(int var1, int var2) {
		return class57.method420(this.field1981, var1, var2);
	}

	public String method1182(int var1, String var2) {
		class526 var5 = this.field1981;
		String var4;
		if (null == var5) {
			var4 = var2;
		} else {
			class509 var6 = (class509)var5.method2543((long)var1);
			if (var6 == null) {
				var4 = var2;
			} else {
				var4 = (String)var6.field4186;
			}
		}

		return var4;
	}

	public int method1193() {
		if (this.field1957 != -1 && null != this.field1956) {
			if (this.field1957 >= 0) {
				return this.field1956[this.field1957] != null ? this.field1957 : -1;
			} else {
				return class433.field3712.equalsIgnoreCase(this.field1956[4]) ? 4 : -1;
			}
		} else {
			return -1;
		}
	}

	boolean method1197() {
		return this.field1941 != null;
	}

	boolean method1194() {
		return this.field1943 != null;
	}

	public static int method1198(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}
}
