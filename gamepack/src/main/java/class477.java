import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class class477 {
	boolean field4047;
	boolean field4049;
	boolean field4058;
	class246 field4043;
	class246 field4046;
	class65 field4057;
	class65 field4062;
	int field4044;
	int field4045;
	int field4048;
	int field4050;
	int field4051;
	int field4052;
	int field4053;
	int field4054;
	int field4055;
	int field4056;
	int field4059;
	int field4060;
	int field4061;
	int field4063;

	class477() {
		this.field4046 = new class246();
		this.field4043 = new class246();
		this.field4058 = false;
		this.field4047 = true;
		this.field4044 = 0;
		this.field4049 = false;
		this.field4050 = 0;
		this.field4063 = 0;
		this.field4052 = 0;
		this.field4054 = 0;
		this.field4053 = 0;
		this.field4055 = 0;
		this.field4056 = 0;
		this.field4045 = Integer.MAX_VALUE;
		this.field4061 = Integer.MAX_VALUE;
		this.field4051 = 0;
		this.field4059 = 0;
		this.field4060 = 0;
		this.field4048 = 0;
		this.field4046.method1432(1);
		this.field4043.method1432(1);
	}

	void method2305() {
		this.field4044 = (this.field4044 + 1) % 60;
		if (this.field4056 > 0) {
			--this.field4056;
		}

	}

	public boolean method2306(boolean var1) {
		var1 = var1 && this.field4047;
		boolean var3 = this.field4058 != var1;
		this.field4058 = var1;
		if (!this.field4058) {
			this.method2325(this.field4054, this.field4054);
		}

		return var3;
	}

	public void method2336(boolean var1) {
		this.field4047 = var1;
		this.field4058 = var1 && this.field4058;
	}

	boolean method2375(String var1) {
		String var3 = this.field4046.method1401();
		if (!var3.equals(var1)) {
			var1 = this.method2350(var1);
			this.field4046.method1433(var1);
			this.method2314(this.field4060, this.field4048);
			this.method2357();
			this.method2362();
			return true;
		} else {
			return false;
		}
	}

	boolean method2308(String var1) {
		this.field4043.method1433(var1);
		return true;
	}

	boolean method2309(class228 var1) {
		boolean var3 = !this.field4049;
		this.field4046.method1403(var1);
		this.field4043.method1403(var1);
		this.field4049 = true;
		var3 |= this.method2314(this.field4060, this.field4048);
		var3 |= this.method2325(this.field4053, this.field4054);
		if (this.method2357()) {
			this.method2362();
			var3 = true;
		}

		return var3;
	}

	public boolean method2310(int var1, int var2) {
		boolean var4 = this.field4051 != var1 || this.field4059 != var2;
		this.field4051 = var1;
		this.field4059 = var2;
		var4 |= this.method2314(this.field4060, this.field4048);
		return var4;
	}

	public boolean method2311(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var3 = var1 == this.field4046.method1438();
		this.field4046.method1428(var1);
		this.field4043.method1428(var1);
		if (this.method2357()) {
			this.method2362();
			var3 = true;
		}

		return var3;
	}

	public boolean method2312(int var1) {
		this.field4046.method1399(var1);
		if (this.method2357()) {
			this.method2362();
			return true;
		} else {
			return false;
		}
	}

	public boolean method2379(int var1) {
		this.field4061 = var1;
		if (this.method2357()) {
			this.method2362();
			return true;
		} else {
			return false;
		}
	}

	public boolean method2314(int var1, int var2) {
		if (!this.method2348()) {
			this.field4060 = var1;
			this.field4048 = var2;
			return false;
		} else {
			int var4 = this.field4060;
			int var5 = this.field4048;
			int var6 = Math.max(0, this.field4046.method1412() - this.field4051 + 2);
			int var7 = Math.max(0, this.field4046.method1413() - this.field4059 + 1);
			this.field4060 = Math.max(0, Math.min(var6, var1));
			this.field4048 = Math.max(0, Math.min(var7, var2));
			return var4 != this.field4060 || this.field4048 != var5;
		}
	}

	public boolean method2371(int var1, int var2) {
		boolean var4 = true;
		if (var1 < 0 || var1 > 2) {
			var4 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var4 = false;
		}

		return var4 ? this.field4046.method1404(var1, var2) : false;
	}

	public void method2315(int var1) {
		this.field4046.method1405(var1);
	}

	public void method2316(int var1) {
		this.field4050 = var1;
	}

	public void method2385(int var1) {
		this.field4046.method1432(var1);
	}

	public void method2384(int var1) {
		this.field4046.method1402(var1);
	}

	public boolean method2366(int var1) {
		this.field4052 = var1;
		String var3 = this.field4046.method1401();
		int var4 = var3.length();
		var3 = this.method2350(var3);
		if (var3.length() != var4) {
			this.field4046.method1433(var3);
			this.method2314(this.field4060, this.field4048);
			this.method2357();
			this.method2362();
			return true;
		} else {
			return false;
		}
	}

	public void method2318() {
		this.field4049 = false;
	}

	public boolean method2365(int var1) {
		if (this.method2352(var1)) {
			this.method2324();
			class470 var3 = this.field4046.method1431((char)var1, this.field4054, this.field4045);
			this.method2325(var3.method2288(), var3.method2288());
			this.method2357();
			this.method2362();
		}

		return true;
	}

	public void method2320() {
		if (!this.method2324() && this.field4054 > 0) {
			int var2 = this.field4046.method1409(this.field4054 - 1);
			this.method2362();
			this.method2325(var2, var2);
		}

	}

	public void method2321() {
		if (!this.method2324() && this.field4054 < this.field4046.method1400()) {
			int var2 = this.field4046.method1409(this.field4054);
			this.method2362();
			this.method2325(var2, var2);
		}

	}

	public void method2322() {
		if (!this.method2324() && this.field4054 > 0) {
			class180 var2 = this.method2355(this.field4054 - 1);
			int var3 = this.field4046.method1410((Integer)var2.field1712, this.field4054);
			this.method2362();
			this.method2325(var3, var3);
		}

	}

	public void method2343() {
		if (!this.method2324() && this.field4054 < this.field4046.method1400()) {
			class180 var2 = this.method2355(this.field4054);
			int var3 = this.field4046.method1410(this.field4054, (Integer)var2.field1711);
			this.method2362();
			this.method2325(var3, var3);
		}

	}

	boolean method2324() {
		if (!this.method2353()) {
			return false;
		} else {
			int var2 = this.field4046.method1410(this.field4053, this.field4054);
			this.method2362();
			this.method2325(var2, var2);
			return true;
		}
	}

	public void method2383() {
		this.method2325(0, this.field4046.method1400());
	}

	public boolean method2325(int var1, int var2) {
		if (!this.method2348()) {
			this.field4053 = var1;
			this.field4054 = var2;
			return false;
		} else {
			if (var1 > this.field4046.method1400()) {
				var1 = this.field4046.method1400();
			}

			if (var2 > this.field4046.method1400()) {
				var2 = this.field4046.method1400();
			}

			boolean var4 = this.field4053 != var1 || var2 != this.field4054;
			this.field4053 = var1;
			if (var2 != this.field4054) {
				this.field4054 = var2;
				this.field4044 = 0;
				this.method2360();
			}

			if (var4 && null != this.field4057) {
				this.field4057.method486();
			}

			return var4;
		}
	}

	public void method2326(boolean var1) {
		class180 var3 = this.method2356(this.field4054);
		this.method2358((Integer)var3.field1712, var1);
	}

	public void method2327(boolean var1) {
		class180 var3 = this.method2356(this.field4054);
		this.method2358((Integer)var3.field1711, var1);
	}

	public void method2328(boolean var1) {
		this.method2358(0, var1);
	}

	public void method2329(boolean var1) {
		this.method2358(this.field4046.method1400(), var1);
	}

	public void method2377(boolean var1) {
		if (this.method2353() && !var1) {
			this.method2358(Math.min(this.field4053, this.field4054), var1);
		} else if (this.field4054 > 0) {
			this.method2358(this.field4054 - 1, var1);
		}

	}

	public void method2330(boolean var1) {
		if (this.method2353() && !var1) {
			this.method2358(Math.max(this.field4053, this.field4054), var1);
		} else if (this.field4054 < this.field4046.method1400()) {
			this.method2358(1 + this.field4054, var1);
		}

	}

	public void method2331(boolean var1) {
		if (this.field4054 > 0) {
			class180 var3 = this.method2355(this.field4054 - 1);
			this.method2358((Integer)var3.field1712, var1);
		}

	}

	public void method2332(boolean var1) {
		if (this.field4054 < this.field4046.method1400()) {
			class180 var3 = this.method2355(1 + this.field4054);
			this.method2358((Integer)var3.field1711, var1);
		}

	}

	public void method2333(boolean var1) {
		if (this.field4054 > 0) {
			this.method2358(this.field4046.method1411(this.field4054, -1), var1);
		}

	}

	public void method2334(boolean var1) {
		if (this.field4054 < this.field4046.method1400()) {
			this.method2358(this.field4046.method1411(this.field4054, 1), var1);
		}

	}

	public void method2335(boolean var1) {
		if (this.field4054 > 0) {
			int var3 = this.method2359();
			this.method2358(this.field4046.method1411(this.field4054, -var3), var1);
		}

	}

	public void method2323(boolean var1) {
		if (this.field4054 < this.field4046.method1400()) {
			int var3 = this.method2359();
			this.method2358(this.field4046.method1411(this.field4054, var3), var1);
		}

	}

	public void method2373(boolean var1) {
		class506 var3 = this.field4046.method1406(0, this.field4054);
		class180 var4 = var3.method2438();
		this.method2358(this.field4046.method1427((Integer)var4.field1712, this.field4048), var1);
	}

	public void method2372(boolean var1) {
		class506 var3 = this.field4046.method1406(0, this.field4054);
		class180 var4 = var3.method2438();
		this.method2358(this.field4046.method1427((Integer)var4.field1712, this.field4059 + this.field4048), var1);
	}

	public void method2381(int var1, int var2, boolean var3, boolean var4) {
		boolean var6 = false;
		class180 var7;
		int var9;
		if (!this.field4049) {
			var9 = 0;
		} else {
			var1 += this.field4060;
			var2 += this.field4048;
			var7 = this.method2363();
			var9 = this.field4046.method1427(var1 - (Integer)var7.field1712, var2 - (Integer)var7.field1711);
		}

		if (var3 && var4) {
			this.field4063 = 1;
			var7 = this.method2355(var9);
			class180 var8 = this.method2355(this.field4055);
			this.method2354(var8, var7);
		} else if (var3) {
			this.field4063 = 1;
			var7 = this.method2355(var9);
			this.method2325((Integer)var7.field1712, (Integer)var7.field1711);
			this.field4055 = (Integer)var7.field1712;
		} else if (var4) {
			this.method2325(this.field4055, var9);
		} else {
			if (this.field4056 > 0 && var9 == this.field4055) {
				if (this.field4054 == this.field4053) {
					this.field4063 = 1;
					var7 = this.method2355(var9);
					this.method2325((Integer)var7.field1712, (Integer)var7.field1711);
				} else {
					this.field4063 = 2;
					var7 = this.method2356(var9);
					this.method2325((Integer)var7.field1712, (Integer)var7.field1711);
				}
			} else {
				this.field4063 = 0;
				this.method2325(var9, var9);
				this.field4055 = var9;
			}

			this.field4056 = 25;
		}

	}

	public void method2364(int var1, int var2) {
		if (this.field4049 && this.method2344()) {
			var1 += this.field4060;
			var2 += this.field4048;
			class180 var4 = this.method2363();
			int var5 = this.field4046.method1427(var1 - (Integer)var4.field1712, var2 - (Integer)var4.field1711);
			class180 var6;
			class180 var7;
			switch(this.field4063) {
			case 0:
				this.method2325(this.field4053, var5);
				break;
			case 1:
				var6 = this.method2355(this.field4055);
				var7 = this.method2355(var5);
				this.method2354(var6, var7);
				break;
			case 2:
				var6 = this.method2356(this.field4055);
				var7 = this.method2356(var5);
				this.method2354(var6, var7);
			}
		}

	}

	public void method2337(Clipboard var1) {
		class506 var3 = this.field4046.method1406(this.field4053, this.field4054);
		if (!var3.method2433()) {
			String var4 = var3.method2432();
			if (!var4.isEmpty()) {
				var1.setContents(new StringSelection(var4), (ClipboardOwner)null);
			}
		}

	}

	public void method2307(Clipboard var1) {
		if (this.method2353()) {
			this.method2337(var1);
			this.method2324();
		}

	}

	public void method2338(Clipboard var1) {
		Transferable var3 = var1.getContents((Object)null);
		if (null != var3 && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var4 = this.method2350((String)var3.getTransferData(DataFlavor.stringFlavor));
				this.method2324();
				class470 var5 = this.field4046.method1407(var4, this.field4054, this.field4045);
				this.method2325(var5.method2288(), var5.method2288());
				this.method2357();
				this.method2362();
			} catch (Exception var6) {
			}
		}

	}

	public void method2378() {
		this.field4048 = Math.max(0, this.field4048 - this.field4046.method1414());
	}

	public void method2339() {
		int var2 = Math.max(0, this.field4046.method1413() - this.field4059);
		this.field4048 = Math.min(var2, this.field4048 + this.field4046.method1414());
	}

	public void method2340(class65 var1) {
		this.field4062 = var1;
	}

	public void method2341(class65 var1) {
		this.field4057 = var1;
	}

	public class246 method2368() {
		return this.field4046;
	}

	public class246 method2342() {
		return this.field4043;
	}

	public class506 method2317() {
		return this.field4046.method1406(this.field4053, this.field4054);
	}

	public boolean method2344() {
		return this.field4058;
	}

	public boolean method2345() {
		return this.field4047;
	}

	public boolean method2367() {
		return this.method2344() && this.field4044 % 60 < 30;
	}

	public int method2346() {
		return this.field4054;
	}

	public int method2347() {
		return this.field4053;
	}

	public boolean method2348() {
		return this.field4049;
	}

	public int method2349() {
		return this.field4060;
	}

	public int method2374() {
		return this.field4048;
	}

	public int method2380() {
		return this.field4046.method1438();
	}

	public int method2376() {
		return this.field4046.method1417();
	}

	public int method2382() {
		return this.field4061;
	}

	public int method2351() {
		return this.field4050;
	}

	public int method2319() {
		return this.field4046.method1425();
	}

	public int method2370() {
		return this.field4052;
	}

	public int method2313() {
		return this.field4046.method1418();
	}

	public boolean method2369() {
		return this.method2376() > 1;
	}

	boolean method2353() {
		return this.field4054 != this.field4053;
	}

	String method2350(String var1) {
		StringBuilder var3 = new StringBuilder(var1.length());

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			char var5 = var1.charAt(var4);
			if (this.method2352(var5)) {
				var3.append(var5);
			}
		}

		return var3.toString();
	}

	void method2354(class180 var1, class180 var2) {
		if ((Integer)var2.field1712 < (Integer)var1.field1712) {
			this.method2325((Integer)var1.field1711, (Integer)var2.field1712);
		} else {
			this.method2325((Integer)var1.field1712, (Integer)var2.field1711);
		}

	}

	class180 method2355(int var1) {
		int var3 = this.field4046.method1400();
		int var4 = 0;
		int var5 = var3;

		int var6;
		for (var6 = var1; var6 > 0; --var6) {
			if (this.method2361(this.field4046.method1415(var6 - 1).field4025)) {
				var4 = var6;
				break;
			}
		}

		for (var6 = var1; var6 < var3; ++var6) {
			if (this.method2361(this.field4046.method1415(var6).field4025)) {
				var5 = var6;
				break;
			}
		}

		return new class180(var4, var5);
	}

	class180 method2356(int var1) {
		int var3 = this.field4046.method1400();
		int var4 = 0;
		int var5 = var3;

		int var6;
		for (var6 = var1; var6 > 0; --var6) {
			if (this.field4046.method1415(var6 - 1).field4025 == '\n') {
				var4 = var6;
				break;
			}
		}

		for (var6 = var1; var6 < var3; ++var6) {
			if (this.field4046.method1415(var6).field4025 == '\n') {
				var5 = var6;
				break;
			}
		}

		return new class180(var4, var5);
	}

	boolean method2357() {
		if (!this.method2348()) {
			return false;
		} else {
			boolean var2 = false;
			if (this.field4046.method1400() > this.field4061) {
				this.field4046.method1410(this.field4061, this.field4046.method1400());
				var2 = true;
			}

			int var3 = this.method2376();
			int var4;
			if (this.field4046.method1430() > var3) {
				var4 = this.field4046.method1411(0, var3) - 1;
				this.field4046.method1410(var4, this.field4046.method1400());
				var2 = true;
			}

			if (var2) {
				var4 = this.field4054;
				int var5 = this.field4053;
				int var6 = this.field4046.method1400();
				if (this.field4054 > var6) {
					var4 = var6;
				}

				if (this.field4053 > var6) {
					var5 = var6;
				}

				this.method2325(var5, var4);
			}

			return var2;
		}
	}

	void method2358(int var1, boolean var2) {
		if (var2) {
			this.method2325(this.field4053, var1);
		} else {
			this.method2325(var1, var1);
		}

	}

	int method2359() {
		return this.field4059 / this.field4046.method1414();
	}

	void method2360() {
		class506 var2 = this.field4046.method1406(0, this.field4054);
		class180 var3 = var2.method2438();
		int var4 = this.field4046.method1414();
		int var5 = (Integer)var3.field1712 - 10;
		int var6 = var5 + 20;
		int var7 = (Integer)var3.field1711 - 3;
		int var8 = var7 + 6 + var4;
		int var9 = this.field4060;
		int var10 = this.field4051 + var9;
		int var11 = this.field4048;
		int var12 = var11 + this.field4059;
		int var13 = this.field4060;
		int var14 = this.field4048;
		if (var5 < var9) {
			var13 = var5;
		} else if (var6 > var10) {
			var13 = var6 - this.field4051;
		}

		if (var7 < var11) {
			var14 = var7;
		} else if (var8 > var12) {
			var14 = var8 - this.field4059;
		}

		this.method2314(var13, var14);
	}

	boolean method2361(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	void method2362() {
		if (null != this.field4062) {
			this.field4062.method486();
		}

	}

	boolean method2352(int var1) {
		switch(this.field4052) {
		case 1:
			return class197.method1076((char)var1);
		case 2:
			return class518.method2526((char)var1);
		case 3:
			return class231.method1328((char)var1);
		case 4:
			char var3 = (char)var1;
			if (class231.method1328(var3)) {
				return true;
			} else {
				if (var3 != 'k' && var3 != 'K' && var3 != 'm' && var3 != 'M' && var3 != 'b' && var3 != 'B') {
					return false;
				}

				return true;
			}
		default:
			return true;
		}
	}

	class180 method2363() {
		int var2 = this.field4046.method1419(this.field4051);
		int var3 = this.field4046.method1420(this.field4059);
		return new class180(var2, var3);
	}
}
