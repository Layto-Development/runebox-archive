import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class class114 {

	boolean field1395;

	boolean field1397;

	boolean field1406;

	class140 field1405;

	class140 field1410;

	class268 field1391;

	class268 field1394;

	int field1392;

	int field1393;

	int field1396;

	int field1398;

	int field1399;

	int field1400;

	int field1401;

	int field1402;

	int field1403;

	int field1404;

	int field1407;

	int field1408;

	int field1409;

	int field1411;

	class114() {
		this.field1394 = new class268();
		this.field1391 = new class268();
		this.field1406 = false;
		this.field1395 = true;
		this.field1392 = 0;
		this.field1397 = false;
		this.field1398 = 0;
		this.field1411 = 0;
		this.field1400 = 0;
		this.field1402 = 0;
		this.field1401 = 0;
		this.field1403 = 0;
		this.field1404 = 0;
		this.field1393 = Integer.MAX_VALUE;
		this.field1409 = Integer.MAX_VALUE;
		this.field1399 = 0;
		this.field1407 = 0;
		this.field1408 = 0;
		this.field1396 = 0;
		this.field1394.method1506(1);
		this.field1391.method1506(1);
	}

	void method711() {
		this.field1392 = (this.field1392 + 1) % 60;
		if (this.field1404 > 0) {
			--this.field1404;
		}
	}

	public boolean method712(boolean var1) {
		var1 = var1 && this.field1395;
		boolean var3 = this.field1406 != var1;
		this.field1406 = var1;
		if (!this.field1406) {
			this.method731(this.field1402, this.field1402);
		}
		return var3;
	}

	public void method742(boolean var1) {
		this.field1395 = var1;
		this.field1406 = var1 && this.field1406;
	}

	boolean method781(String var1) {
		String var3 = this.field1394.method1475();
		if (!var3.equals(var1)) {
			var1 = this.method756(var1);
			this.field1394.method1507(var1);
			this.method720(this.field1408, this.field1396);
			this.method763();
			this.method768();
			return true;
		} else {
			return false;
		}
	}

	boolean method714(String var1) {
		this.field1391.method1507(var1);
		return true;
	}

	boolean method715(class500 var1) {
		boolean var3 = !this.field1397;
		this.field1394.method1477(var1);
		this.field1391.method1477(var1);
		this.field1397 = true;
		var3 |= this.method720(this.field1408, this.field1396);
		var3 |= this.method731(this.field1401, this.field1402);
		if (this.method763()) {
			this.method768();
			var3 = true;
		}
		return var3;
	}

	public boolean method716(int var1, int var2) {
		boolean var4 = this.field1399 != var1 || this.field1407 != var2;
		this.field1399 = var1;
		this.field1407 = var2;
		var4 |= this.method720(this.field1408, this.field1396);
		return var4;
	}

	public boolean method717(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}
		boolean var3 = var1 == this.field1394.method1511();
		this.field1394.method1502(var1);
		this.field1391.method1502(var1);
		if (this.method763()) {
			this.method768();
			var3 = true;
		}
		return var3;
	}

	public boolean method718(int var1) {
		this.field1394.method1473(var1);
		if (this.method763()) {
			this.method768();
			return true;
		} else {
			return false;
		}
	}

	public boolean method785(int var1) {
		this.field1409 = var1;
		if (this.method763()) {
			this.method768();
			return true;
		} else {
			return false;
		}
	}

	public boolean method720(int var1, int var2) {
		if (!this.method754()) {
			this.field1408 = var1;
			this.field1396 = var2;
			return false;
		} else {
			int var4 = this.field1408;
			int var5 = this.field1396;
			int var6 = Math.max(0, this.field1394.method1486() - this.field1399 + 2);
			int var7 = Math.max(0, this.field1394.method1487() - this.field1407 + 1);
			this.field1408 = Math.max(0, Math.min(var6, var1));
			this.field1396 = Math.max(0, Math.min(var7, var2));
			return var4 != this.field1408 || this.field1396 != var5;
		}
	}

	public boolean method777(int var1, int var2) {
		boolean var4 = true;
		if (var1 < 0 || var1 > 2) {
			var4 = false;
		}
		if (var2 < 0 || var2 > 2) {
			var4 = false;
		}
		return var4 ? this.field1394.method1478(var1, var2) : false;
	}

	public void method721(int var1) {
		this.field1394.method1479(var1);
	}

	public void method722(int var1) {
		this.field1398 = var1;
	}

	public void method791(int var1) {
		this.field1394.method1506(var1);
	}

	public void method790(int var1) {
		this.field1394.method1476(var1);
	}

	public boolean method772(int var1) {
		this.field1400 = var1;
		String var3 = this.field1394.method1475();
		int var4 = var3.length();
		var3 = this.method756(var3);
		if (var3.length() != var4) {
			this.field1394.method1507(var3);
			this.method720(this.field1408, this.field1396);
			this.method763();
			this.method768();
			return true;
		} else {
			return false;
		}
	}

	public void method724() {
		this.field1397 = false;
	}

	public boolean method771(int var1) {
		if (this.method758(var1)) {
			this.method730();
			class257 var3 = this.field1394.method1505((char) var1, this.field1402, this.field1393);
			this.method731(var3.method1455(), var3.method1455());
			this.method763();
			this.method768();
		}
		return true;
	}

	public void method726() {
		if (!this.method730() && this.field1402 > 0) {
			int var2 = this.field1394.method1483(this.field1402 - 1);
			this.method768();
			this.method731(var2, var2);
		}
	}

	public void method727() {
		if (!this.method730() && this.field1402 < this.field1394.method1474()) {
			int var2 = this.field1394.method1483(this.field1402);
			this.method768();
			this.method731(var2, var2);
		}
	}

	public void method728() {
		if (!this.method730() && this.field1402 > 0) {
			class59 var2 = this.method761(this.field1402 - 1);
			int var3 = this.field1394.method1484((Integer) var2.field642, this.field1402);
			this.method768();
			this.method731(var3, var3);
		}
	}

	public void method749() {
		if (!this.method730() && this.field1402 < this.field1394.method1474()) {
			class59 var2 = this.method761(this.field1402);
			int var3 = this.field1394.method1484(this.field1402, (Integer) var2.field641);
			this.method768();
			this.method731(var3, var3);
		}
	}

	boolean method730() {
		if (!this.method759()) {
			return false;
		} else {
			int var2 = this.field1394.method1484(this.field1401, this.field1402);
			this.method768();
			this.method731(var2, var2);
			return true;
		}
	}

	public void method789() {
		this.method731(0, this.field1394.method1474());
	}

	public boolean method731(int var1, int var2) {
		if (!this.method754()) {
			this.field1401 = var1;
			this.field1402 = var2;
			return false;
		} else {
			if (var1 > this.field1394.method1474()) {
				var1 = this.field1394.method1474();
			}
			if (var2 > this.field1394.method1474()) {
				var2 = this.field1394.method1474();
			}
			boolean var4 = this.field1401 != var1 || var2 != this.field1402;
			this.field1401 = var1;
			if (var2 != this.field1402) {
				this.field1402 = var2;
				this.field1392 = 0;
				this.method766();
			}
			if (var4 && null != this.field1405) {
				this.field1405.method880();
			}
			return var4;
		}
	}

	public void method732(boolean var1) {
		class59 var3 = this.method762(this.field1402);
		this.method764((Integer) var3.field642, var1);
	}

	public void method733(boolean var1) {
		class59 var3 = this.method762(this.field1402);
		this.method764((Integer) var3.field641, var1);
	}

	public void method734(boolean var1) {
		this.method764(0, var1);
	}

	public void method735(boolean var1) {
		this.method764(this.field1394.method1474(), var1);
	}

	public void method783(boolean var1) {
		if (this.method759() && !var1) {
			this.method764(Math.min(this.field1401, this.field1402), var1);
		} else if (this.field1402 > 0) {
			this.method764(this.field1402 - 1, var1);
		}
	}

	public void method736(boolean var1) {
		if (this.method759() && !var1) {
			this.method764(Math.max(this.field1401, this.field1402), var1);
		} else if (this.field1402 < this.field1394.method1474()) {
			this.method764(1 + this.field1402, var1);
		}
	}

	public void method737(boolean var1) {
		if (this.field1402 > 0) {
			class59 var3 = this.method761(this.field1402 - 1);
			this.method764((Integer) var3.field642, var1);
		}
	}

	public void method738(boolean var1) {
		if (this.field1402 < this.field1394.method1474()) {
			class59 var3 = this.method761(1 + this.field1402);
			this.method764((Integer) var3.field641, var1);
		}
	}

	public void method739(boolean var1) {
		if (this.field1402 > 0) {
			this.method764(this.field1394.method1485(this.field1402, -1), var1);
		}
	}

	public void method740(boolean var1) {
		if (this.field1402 < this.field1394.method1474()) {
			this.method764(this.field1394.method1485(this.field1402, 1), var1);
		}
	}

	public void method741(boolean var1) {
		if (this.field1402 > 0) {
			int var3 = this.method765();
			this.method764(this.field1394.method1485(this.field1402, -var3), var1);
		}
	}

	public void method729(boolean var1) {
		if (this.field1402 < this.field1394.method1474()) {
			int var3 = this.method765();
			this.method764(this.field1394.method1485(this.field1402, var3), var1);
		}
	}

	public void method779(boolean var1) {
		class200 var3 = this.field1394.method1480(0, this.field1402);
		class59 var4 = var3.method1216();
		this.method764(this.field1394.method1501((Integer) var4.field642, this.field1396), var1);
	}

	public void method778(boolean var1) {
		class200 var3 = this.field1394.method1480(0, this.field1402);
		class59 var4 = var3.method1216();
		this.method764(this.field1394.method1501((Integer) var4.field642, this.field1407 + this.field1396), var1);
	}

	public void method787(int var1, int var2, boolean var3, boolean var4) {
		boolean var6 = false;
		class59 var7;
		int var9;
		if (!this.field1397) {
			var9 = 0;
		} else {
			var1 += this.field1408;
			var2 += this.field1396;
			var7 = this.method769();
			var9 = this.field1394.method1501(var1 - (Integer) var7.field642, var2 - (Integer) var7.field641);
		}
		if (var3 && var4) {
			this.field1411 = 1;
			var7 = this.method761(var9);
			class59 var8 = this.method761(this.field1403);
			this.method760(var8, var7);
		} else if (var3) {
			this.field1411 = 1;
			var7 = this.method761(var9);
			this.method731((Integer) var7.field642, (Integer) var7.field641);
			this.field1403 = (Integer) var7.field642;
		} else if (var4) {
			this.method731(this.field1403, var9);
		} else {
			if (this.field1404 > 0 && var9 == this.field1403) {
				if (this.field1402 == this.field1401) {
					this.field1411 = 1;
					var7 = this.method761(var9);
					this.method731((Integer) var7.field642, (Integer) var7.field641);
				} else {
					this.field1411 = 2;
					var7 = this.method762(var9);
					this.method731((Integer) var7.field642, (Integer) var7.field641);
				}
			} else {
				this.field1411 = 0;
				this.method731(var9, var9);
				this.field1403 = var9;
			}
			this.field1404 = 25;
		}
	}

	public void method770(int var1, int var2) {
		if (this.field1397 && this.method750()) {
			var1 += this.field1408;
			var2 += this.field1396;
			class59 var4 = this.method769();
			int var5 = this.field1394.method1501(var1 - (Integer) var4.field642, var2 - (Integer) var4.field641);
			class59 var6;
			class59 var7;
			switch(this.field1411) {
				case 0:
					this.method731(this.field1401, var5);
					break;
				case 1:
					var6 = this.method761(this.field1403);
					var7 = this.method761(var5);
					this.method760(var6, var7);
					break;
				case 2:
					var6 = this.method762(this.field1403);
					var7 = this.method762(var5);
					this.method760(var6, var7);
			}
		}
	}

	public void method743(Clipboard var1) {
		class200 var3 = this.field1394.method1480(this.field1401, this.field1402);
		if (!var3.method1211()) {
			String var4 = var3.method1210();
			if (!var4.isEmpty()) {
				var1.setContents(new StringSelection(var4), (ClipboardOwner) null);
			}
		}
	}

	public void method713(Clipboard var1) {
		if (this.method759()) {
			this.method743(var1);
			this.method730();
		}
	}

	public void method744(Clipboard var1) {
		Transferable var3 = var1.getContents((Object) null);
		if (null != var3 && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var4 = this.method756((String) var3.getTransferData(DataFlavor.stringFlavor));
				this.method730();
				class257 var5 = this.field1394.method1481(var4, this.field1402, this.field1393);
				this.method731(var5.method1455(), var5.method1455());
				this.method763();
				this.method768();
			} catch (Exception var6) {
			}
		}
	}

	public void method784() {
		this.field1396 = Math.max(0, this.field1396 - this.field1394.method1488());
	}

	public void method745() {
		int var2 = Math.max(0, this.field1394.method1487() - this.field1407);
		this.field1396 = Math.min(var2, this.field1396 + this.field1394.method1488());
	}

	public void method746(class140 var1) {
		this.field1410 = var1;
	}

	public void method747(class140 var1) {
		this.field1405 = var1;
	}

	public class268 method774() {
		return this.field1394;
	}

	public class268 method748() {
		return this.field1391;
	}

	public class200 method723() {
		return this.field1394.method1480(this.field1401, this.field1402);
	}

	public boolean method750() {
		return this.field1406;
	}

	public boolean method751() {
		return this.field1395;
	}

	public boolean method773() {
		return this.method750() && this.field1392 % 60 < 30;
	}

	public int method752() {
		return this.field1402;
	}

	public int method753() {
		return this.field1401;
	}

	public boolean method754() {
		return this.field1397;
	}

	public int method755() {
		return this.field1408;
	}

	public int method780() {
		return this.field1396;
	}

	public int method786() {
		return this.field1394.method1511();
	}

	public int method782() {
		return this.field1394.method1491();
	}

	public int method788() {
		return this.field1409;
	}

	public int method757() {
		return this.field1398;
	}

	public int method725() {
		return this.field1394.method1499();
	}

	public int method776() {
		return this.field1400;
	}

	public int method719() {
		return this.field1394.method1492();
	}

	public boolean method775() {
		return this.method782() > 1;
	}

	boolean method759() {
		return this.field1402 != this.field1401;
	}

	String method756(String var1) {
		StringBuilder var3 = new StringBuilder(var1.length());
		for (int var4 = 0; var4 < var1.length(); ++var4) {
			char var5 = var1.charAt(var4);
			if (this.method758(var5)) {
				var3.append(var5);
			}
		}
		return var3.toString();
	}

	void method760(class59 var1, class59 var2) {
		if ((Integer) var2.field642 < (Integer) var1.field642) {
			this.method731((Integer) var1.field641, (Integer) var2.field642);
		} else {
			this.method731((Integer) var1.field642, (Integer) var2.field641);
		}
	}

	class59 method761(int var1) {
		int var3 = this.field1394.method1474();
		int var4 = 0;
		int var5 = var3;
		int var6;
		for (var6 = var1; var6 > 0; --var6) {
			if (this.method767(this.field1394.method1489(var6 - 1).field1887)) {
				var4 = var6;
				break;
			}
		}
		for (var6 = var1; var6 < var3; ++var6) {
			if (this.method767(this.field1394.method1489(var6).field1887)) {
				var5 = var6;
				break;
			}
		}
		return new class59(var4, var5);
	}

	class59 method762(int var1) {
		int var3 = this.field1394.method1474();
		int var4 = 0;
		int var5 = var3;
		int var6;
		for (var6 = var1; var6 > 0; --var6) {
			if (this.field1394.method1489(var6 - 1).field1887 == '\n') {
				var4 = var6;
				break;
			}
		}
		for (var6 = var1; var6 < var3; ++var6) {
			if (this.field1394.method1489(var6).field1887 == '\n') {
				var5 = var6;
				break;
			}
		}
		return new class59(var4, var5);
	}

	boolean method763() {
		if (!this.method754()) {
			return false;
		} else {
			boolean var2 = false;
			if (this.field1394.method1474() > this.field1409) {
				this.field1394.method1484(this.field1409, this.field1394.method1474());
				var2 = true;
			}
			int var3 = this.method782();
			int var4;
			if (this.field1394.method1504() > var3) {
				var4 = this.field1394.method1485(0, var3) - 1;
				this.field1394.method1484(var4, this.field1394.method1474());
				var2 = true;
			}
			if (var2) {
				var4 = this.field1402;
				int var5 = this.field1401;
				int var6 = this.field1394.method1474();
				if (this.field1402 > var6) {
					var4 = var6;
				}
				if (this.field1401 > var6) {
					var5 = var6;
				}
				this.method731(var5, var4);
			}
			return var2;
		}
	}

	void method764(int var1, boolean var2) {
		if (var2) {
			this.method731(this.field1401, var1);
		} else {
			this.method731(var1, var1);
		}
	}

	int method765() {
		return this.field1407 / this.field1394.method1488();
	}

	void method766() {
		class200 var2 = this.field1394.method1480(0, this.field1402);
		class59 var3 = var2.method1216();
		int var4 = this.field1394.method1488();
		int var5 = (Integer) var3.field642 - 10;
		int var6 = var5 + 20;
		int var7 = (Integer) var3.field641 - 3;
		int var8 = var7 + 6 + var4;
		int var9 = this.field1408;
		int var10 = this.field1399 + var9;
		int var11 = this.field1396;
		int var12 = var11 + this.field1407;
		int var13 = this.field1408;
		int var14 = this.field1396;
		if (var5 < var9) {
			var13 = var5;
		} else if (var6 > var10) {
			var13 = var6 - this.field1399;
		}
		if (var7 < var11) {
			var14 = var7;
		} else if (var8 > var12) {
			var14 = var8 - this.field1407;
		}
		this.method720(var13, var14);
	}

	boolean method767(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	void method768() {
		if (null != this.field1410) {
			this.field1410.method880();
		}
	}

	boolean method758(int var1) {
		switch(this.field1400) {
			case 1:
				return class514.method2480((char) var1);
			case 2:
				return class514.method2474((char) var1);
			case 3:
				return class414.method2089((char) var1);
			case 4:
				char var3 = (char) var1;
				if (class414.method2089(var3)) {
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

	class59 method769() {
		int var2 = this.field1394.method1493(this.field1399);
		int var3 = this.field1394.method1494(this.field1407);
		return new class59(var2, var3);
	}
}
