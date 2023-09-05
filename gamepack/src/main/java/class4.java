import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

@ObfInfo(name = "mb")
public class class4 {
	@ObfInfo(name = "aj", desc = "Z")
	boolean field11;
	@ObfInfo(name = "ah", desc = "Z")
	boolean field20;
	@ObfInfo(name = "as", desc = "Z")
	boolean field9;
	@ObfInfo(name = "ba", desc = "Lmf;")
	class284 field19;
	@ObfInfo(name = "bq", desc = "Lmf;")
	class284 field24;
	@ObfInfo(name = "ax", desc = "Lpj;")
	class338 field5;
	@ObfInfo(name = "am", desc = "Lpj;")
	class338 field8;
	@ObfInfo(name = "bf", desc = "I", intMultiplier = 1187411399)
	int field10;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -351339173)
	int field12;
	@ObfInfo(name = "by", desc = "I", intMultiplier = -1556928317)
	int field13;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1633191951)
	int field14;
	@ObfInfo(name = "bj", desc = "I", intMultiplier = -961539401)
	int field15;
	@ObfInfo(name = "bh", desc = "I", intMultiplier = -972960841)
	int field16;
	@ObfInfo(name = "bk", desc = "I", intMultiplier = 1144432645)
	int field17;
	@ObfInfo(name = "bv", desc = "I", intMultiplier = 1912313197)
	int field18;
	@ObfInfo(name = "bs", desc = "I", intMultiplier = 1288731127)
	int field21;
	@ObfInfo(name = "bm", desc = "I", intMultiplier = 687942875)
	int field22;
	@ObfInfo(name = "bd", desc = "I", intMultiplier = -878896123)
	int field23;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = 204432917)
	int field25;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = -431478779)
	int field6;
	@ObfInfo(name = "bt", desc = "I", intMultiplier = -363578579)
	int field7;

	@ObfInfo(name = "<init>", desc = "()V")
	class4() {
		this.field8 = new class338();
		this.field5 = new class338();
		this.field20 = false;
		this.field9 = true;
		this.field6 = 0;
		this.field11 = false;
		this.field12 = 0;
		this.field25 = 0;
		this.field14 = 0;
		this.field16 = 0;
		this.field15 = 0;
		this.field17 = 0;
		this.field18 = 0;
		this.field7 = Integer.MAX_VALUE;
		this.field23 = Integer.MAX_VALUE;
		this.field13 = 0;
		this.field21 = 0;
		this.field22 = 0;
		this.field10 = 0;
		this.field8.method1862(1);
		this.field5.method1862(1);
	}

	@ObfInfo(name = "au", desc = "(B)V", opaqueValue = "3")
	void method6() {
		this.field6 = (this.field6 + 1) % 60;
		if (this.field18 > 0) {
			--this.field18;
		}

	}

	@ObfInfo(name = "ae", desc = "(ZI)Z", opaqueValue = "-701814801")
	public boolean method7(boolean var1) {
		var1 = var1 && this.field9;
		boolean var3 = this.field20 != var1;
		this.field20 = var1;
		if (!this.field20) {
			this.method26(this.field16, this.field16);
		}

		return var3;
	}

	@ObfInfo(name = "ao", desc = "(ZI)V", opaqueValue = "1100012972")
	public void method37(boolean var1) {
		this.field9 = var1;
		this.field20 = var1 && this.field20;
	}

	@ObfInfo(name = "at", desc = "(Ljava/lang/String;I)Z", opaqueValue = "-764154033")
	boolean method76(String var1) {
		String var3 = this.field8.method1831();
		if (!var3.equals(var1)) {
			var1 = this.method51(var1);
			this.field8.method1863(var1);
			this.method15(this.field22, this.field10);
			this.method58();
			this.method63();
			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ac", desc = "(Ljava/lang/String;B)Z")
	boolean method9(String var1) {
		this.field5.method1863(var1);
		return true;
	}

	@ObfInfo(name = "ai", desc = "(Lpk;B)Z", opaqueValue = "2")
	boolean method10(class300 var1) {
		boolean var3 = !this.field11;
		this.field8.method1833(var1);
		this.field5.method1833(var1);
		this.field11 = true;
		var3 |= this.method15(this.field22, this.field10);
		var3 |= this.method26(this.field15, this.field16);
		if (this.method58()) {
			this.method63();
			var3 = true;
		}

		return var3;
	}

	@ObfInfo(name = "az", desc = "(IIB)Z", opaqueValue = "-1")
	public boolean method11(int var1, int var2) {
		boolean var4 = this.field13 != var1 || this.field21 != var2;
		this.field13 = var1;
		this.field21 = var2;
		var4 |= this.method15(this.field22, this.field10);
		return var4;
	}

	@ObfInfo(name = "ap", desc = "(II)Z", opaqueValue = "1183077231")
	public boolean method12(int var1) {
		if (var1 < 0) {
			var1 = Integer.MAX_VALUE;
		}

		boolean var3 = var1 == this.field8.method1867();
		this.field8.method1858(var1);
		this.field5.method1858(var1);
		if (this.method58()) {
			this.method63();
			var3 = true;
		}

		return var3;
	}

	@ObfInfo(name = "aa", desc = "(II)Z")
	public boolean method13(int var1) {
		this.field8.method1829(var1);
		if (this.method58()) {
			this.method63();
			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "af", desc = "(IB)Z", opaqueValue = "4")
	public boolean method80(int var1) {
		this.field23 = var1;
		if (this.method58()) {
			this.method63();
			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ad", desc = "(III)Z", opaqueValue = "-1972063997")
	public boolean method15(int var1, int var2) {
		if (!this.method49()) {
			this.field22 = var1;
			this.field10 = var2;
			return false;
		} else {
			int var4 = this.field22;
			int var5 = this.field10;
			int var6 = Math.max(0, this.field8.method1842() - this.field13 + 2);
			int var7 = Math.max(0, this.field8.method1843() - this.field21 + 1);
			this.field22 = Math.max(0, Math.min(var6, var1));
			this.field10 = Math.max(0, Math.min(var7, var2));
			return var4 != this.field22 || this.field10 != var5;
		}
	}

	@ObfInfo(name = "aq", desc = "(IIS)Z", opaqueValue = "8225")
	public boolean method72(int var1, int var2) {
		boolean var4 = true;
		if (var1 < 0 || var1 > 2) {
			var4 = false;
		}

		if (var2 < 0 || var2 > 2) {
			var4 = false;
		}

		return var4 ? this.field8.method1834(var1, var2) : false;
	}

	@ObfInfo(name = "al", desc = "(IB)V")
	public void method16(int var1) {
		this.field8.method1835(var1);
	}

	@ObfInfo(name = "an", desc = "(II)V")
	public void method17(int var1) {
		this.field12 = var1;
	}

	@ObfInfo(name = "ar", desc = "(II)V")
	public void method86(int var1) {
		this.field8.method1862(var1);
	}

	@ObfInfo(name = "ab", desc = "(IB)V")
	public void method85(int var1) {
		this.field8.method1832(var1);
	}

	@ObfInfo(name = "ag", desc = "(II)Z", opaqueValue = "1211505863")
	public boolean method67(int var1) {
		this.field14 = var1;
		String var3 = this.field8.method1831();
		int var4 = var3.length();
		var3 = this.method51(var3);
		if (var3.length() != var4) {
			this.field8.method1863(var3);
			this.method15(this.field22, this.field10);
			this.method58();
			this.method63();
			return true;
		} else {
			return false;
		}
	}

	@ObfInfo(name = "am", desc = "(I)V")
	public void method19() {
		this.field11 = false;
	}

	@ObfInfo(name = "ax", desc = "(IB)Z")
	public boolean method66(int var1) {
		if (this.method53(var1)) {
			this.method25();
			class472 var3 = this.field8.method1861((char)var1, this.field16, this.field7);
			this.method26(var3.method2427(), var3.method2427());
			this.method58();
			this.method63();
		}

		return true;
	}

	@ObfInfo(name = "ah", desc = "(I)V", opaqueValue = "-1833500314")
	public void method21() {
		if (!this.method25() && this.field16 > 0) {
			int var2 = this.field8.method1839(this.field16 - 1);
			this.method63();
			this.method26(var2, var2);
		}

	}

	@ObfInfo(name = "as", desc = "(B)V", opaqueValue = "14")
	public void method22() {
		if (!this.method25() && this.field16 < this.field8.method1830()) {
			int var2 = this.field8.method1839(this.field16);
			this.method63();
			this.method26(var2, var2);
		}

	}

	@ObfInfo(name = "ay", desc = "(B)V", opaqueValue = "-1")
	public void method23() {
		if (!this.method25() && this.field16 > 0) {
			class165 var2 = this.method56(this.field16 - 1);
			int var3 = this.field8.method1840((Integer)var2.field1562, this.field16);
			this.method63();
			this.method26(var3, var3);
		}

	}

	@ObfInfo(name = "aj", desc = "(B)V", opaqueValue = "0")
	public void method44() {
		if (!this.method25() && this.field16 < this.field8.method1830()) {
			class165 var2 = this.method56(this.field16);
			int var3 = this.field8.method1840(this.field16, (Integer)var2.field1561);
			this.method63();
			this.method26(var3, var3);
		}

	}

	@ObfInfo(name = "av", desc = "(I)Z", opaqueValue = "-1331192655")
	boolean method25() {
		if (!this.method54()) {
			return false;
		} else {
			int var2 = this.field8.method1840(this.field15, this.field16);
			this.method63();
			this.method26(var2, var2);
			return true;
		}
	}

	@ObfInfo(name = "aw", desc = "(B)V")
	public void method84() {
		this.method26(0, this.field8.method1830());
	}

	@ObfInfo(name = "ak", desc = "(III)Z", opaqueValue = "-1788304482")
	public boolean method26(int var1, int var2) {
		if (!this.method49()) {
			this.field15 = var1;
			this.field16 = var2;
			return false;
		} else {
			if (var1 > this.field8.method1830()) {
				var1 = this.field8.method1830();
			}

			if (var2 > this.field8.method1830()) {
				var2 = this.field8.method1830();
			}

			boolean var4 = this.field15 != var1 || var2 != this.field16;
			this.field15 = var1;
			if (var2 != this.field16) {
				this.field16 = var2;
				this.field6 = 0;
				this.method61();
			}

			if (var4 && null != this.field19) {
				this.field19.method1569();
			}

			return var4;
		}
	}

	@ObfInfo(name = "bh", desc = "(ZB)V")
	public void method27(boolean var1) {
		class165 var3 = this.method57(this.field16);
		this.method59((Integer)var3.field1562, var1);
	}

	@ObfInfo(name = "bj", desc = "(ZB)V")
	public void method28(boolean var1) {
		class165 var3 = this.method57(this.field16);
		this.method59((Integer)var3.field1561, var1);
	}

	@ObfInfo(name = "bk", desc = "(ZB)V")
	public void method29(boolean var1) {
		this.method59(0, var1);
	}

	@ObfInfo(name = "bv", desc = "(ZI)V")
	public void method30(boolean var1) {
		this.method59(this.field8.method1830(), var1);
	}

	@ObfInfo(name = "bt", desc = "(ZI)V", opaqueValue = "-767384801")
	public void method78(boolean var1) {
		if (this.method54() && !var1) {
			this.method59(Math.min(this.field15, this.field16), var1);
		} else if (this.field16 > 0) {
			this.method59(this.field16 - 1, var1);
		}

	}

	@ObfInfo(name = "bd", desc = "(ZI)V", opaqueValue = "-1263469110")
	public void method31(boolean var1) {
		if (this.method54() && !var1) {
			this.method59(Math.max(this.field15, this.field16), var1);
		} else if (this.field16 < this.field8.method1830()) {
			this.method59(1 + this.field16, var1);
		}

	}

	@ObfInfo(name = "by", desc = "(ZS)V", opaqueValue = "399")
	public void method32(boolean var1) {
		if (this.field16 > 0) {
			class165 var3 = this.method56(this.field16 - 1);
			this.method59((Integer)var3.field1562, var1);
		}

	}

	@ObfInfo(name = "bs", desc = "(ZI)V", opaqueValue = "-858055040")
	public void method33(boolean var1) {
		if (this.field16 < this.field8.method1830()) {
			class165 var3 = this.method56(1 + this.field16);
			this.method59((Integer)var3.field1561, var1);
		}

	}

	@ObfInfo(name = "bm", desc = "(ZI)V", opaqueValue = "1844961543")
	public void method34(boolean var1) {
		if (this.field16 > 0) {
			this.method59(this.field8.method1841(this.field16, -1), var1);
		}

	}

	@ObfInfo(name = "bf", desc = "(ZI)V")
	public void method35(boolean var1) {
		if (this.field16 < this.field8.method1830()) {
			this.method59(this.field8.method1841(this.field16, 1), var1);
		}

	}

	@ObfInfo(name = "bq", desc = "(ZB)V")
	public void method36(boolean var1) {
		if (this.field16 > 0) {
			int var3 = this.method60();
			this.method59(this.field8.method1841(this.field16, -var3), var1);
		}

	}

	@ObfInfo(name = "ba", desc = "(ZI)V")
	public void method24(boolean var1) {
		if (this.field16 < this.field8.method1830()) {
			int var3 = this.method60();
			this.method59(this.field8.method1841(this.field16, var3), var1);
		}

	}

	@ObfInfo(name = "bl", desc = "(ZS)V")
	public void method74(boolean var1) {
		class474 var3 = this.field8.method1836(0, this.field16);
		class165 var4 = var3.method2435();
		this.method59(this.field8.method1857((Integer)var4.field1562, this.field10), var1);
	}

	@ObfInfo(name = "bp", desc = "(ZI)V")
	public void method73(boolean var1) {
		class474 var3 = this.field8.method1836(0, this.field16);
		class165 var4 = var3.method2435();
		this.method59(this.field8.method1857((Integer)var4.field1562, this.field21 + this.field10), var1);
	}

	@ObfInfo(name = "bu", desc = "(IIZZI)V", opaqueValue = "983031654")
	public void method82(int var1, int var2, boolean var3, boolean var4) {
		boolean var6 = false;
		class165 var7;
		int var9;
		if (!this.field11) {
			var9 = 0;
		} else {
			var1 += this.field22;
			var2 += this.field10;
			var7 = this.method64();
			var9 = this.field8.method1857(var1 - (Integer)var7.field1562, var2 - (Integer)var7.field1561);
		}

		if (var3 && var4) {
			this.field25 = 1;
			var7 = this.method56(var9);
			class165 var8 = this.method56(this.field17);
			this.method55(var8, var7);
		} else if (var3) {
			this.field25 = 1;
			var7 = this.method56(var9);
			this.method26((Integer)var7.field1562, (Integer)var7.field1561);
			this.field17 = (Integer)var7.field1562;
		} else if (var4) {
			this.method26(this.field17, var9);
		} else {
			if (this.field18 > 0 && var9 == this.field17) {
				if (this.field16 == this.field15) {
					this.field25 = 1;
					var7 = this.method56(var9);
					this.method26((Integer)var7.field1562, (Integer)var7.field1561);
				} else {
					this.field25 = 2;
					var7 = this.method57(var9);
					this.method26((Integer)var7.field1562, (Integer)var7.field1561);
				}
			} else {
				this.field25 = 0;
				this.method26(var9, var9);
				this.field17 = var9;
			}

			this.field18 = 25;
		}

	}

	@ObfInfo(name = "bo", desc = "(IIB)V", opaqueValue = "0")
	public void method65(int var1, int var2) {
		if (this.field11 && this.method45()) {
			var1 += this.field22;
			var2 += this.field10;
			class165 var4 = this.method64();
			int var5 = this.field8.method1857(var1 - (Integer)var4.field1562, var2 - (Integer)var4.field1561);
			class165 var6;
			class165 var7;
			switch(this.field25) {
			case 0:
				this.method26(this.field15, var5);
				break;
			case 1:
				var6 = this.method56(this.field17);
				var7 = this.method56(var5);
				this.method55(var6, var7);
				break;
			case 2:
				var6 = this.method57(this.field17);
				var7 = this.method57(var5);
				this.method55(var6, var7);
			}
		}

	}

	@ObfInfo(name = "bb", desc = "(Ljava/awt/datatransfer/Clipboard;I)V", opaqueValue = "-1723140286")
	public void method38(Clipboard var1) {
		class474 var3 = this.field8.method1836(this.field15, this.field16);
		if (!var3.method2430()) {
			String var4 = var3.method2429();
			if (!var4.isEmpty()) {
				var1.setContents(new StringSelection(var4), (ClipboardOwner)null);
			}
		}

	}

	@ObfInfo(name = "br", desc = "(Ljava/awt/datatransfer/Clipboard;I)V")
	public void method8(Clipboard var1) {
		if (this.method54()) {
			this.method38(var1);
			this.method25();
		}

	}

	@ObfInfo(name = "be", desc = "(Ljava/awt/datatransfer/Clipboard;I)V", opaqueValue = "-2095920262")
	public void method39(Clipboard var1) {
		Transferable var3 = var1.getContents((Object)null);
		if (null != var3 && var3.isDataFlavorSupported(DataFlavor.stringFlavor)) {
			try {
				String var4 = this.method51((String)var3.getTransferData(DataFlavor.stringFlavor));
				this.method25();
				class472 var5 = this.field8.method1837(var4, this.field16, this.field7);
				this.method26(var5.method2427(), var5.method2427());
				this.method58();
				this.method63();
			} catch (Exception var6) {
			}
		}

	}

	@ObfInfo(name = "bi", desc = "(B)V")
	public void method79() {
		this.field10 = Math.max(0, this.field10 - this.field8.method1844());
	}

	@ObfInfo(name = "bz", desc = "(B)V")
	public void method40() {
		int var2 = Math.max(0, this.field8.method1843() - this.field21);
		this.field10 = Math.min(var2, this.field10 + this.field8.method1844());
	}

	@ObfInfo(name = "bx", desc = "(Lmf;I)V")
	public void method41(class284 var1) {
		this.field24 = var1;
	}

	@ObfInfo(name = "bn", desc = "(Lmf;I)V")
	public void method42(class284 var1) {
		this.field19 = var1;
	}

	@ObfInfo(name = "bw", desc = "(I)Lpj;")
	public class338 method69() {
		return this.field8;
	}

	@ObfInfo(name = "bc", desc = "(I)Lpj;")
	public class338 method43() {
		return this.field5;
	}

	@ObfInfo(name = "bg", desc = "(I)Lpl;")
	public class474 method18() {
		return this.field8.method1836(this.field15, this.field16);
	}

	@ObfInfo(name = "cw", desc = "(I)Z")
	public boolean method45() {
		return this.field20;
	}

	@ObfInfo(name = "cf", desc = "(I)Z")
	public boolean method46() {
		return this.field9;
	}

	@ObfInfo(name = "cm", desc = "(B)Z", opaqueValue = "111")
	public boolean method68() {
		return this.method45() && this.field6 % 60 < 30;
	}

	@ObfInfo(name = "cn", desc = "(B)I")
	public int method47() {
		return this.field16;
	}

	@ObfInfo(name = "cs", desc = "(B)I")
	public int method48() {
		return this.field15;
	}

	@ObfInfo(name = "cx", desc = "(B)Z")
	public boolean method49() {
		return this.field11;
	}

	@ObfInfo(name = "cr", desc = "(I)I")
	public int method50() {
		return this.field22;
	}

	@ObfInfo(name = "cd", desc = "(I)I")
	public int method75() {
		return this.field10;
	}

	@ObfInfo(name = "ce", desc = "(I)I")
	public int method81() {
		return this.field8.method1867();
	}

	@ObfInfo(name = "cq", desc = "(I)I")
	public int method77() {
		return this.field8.method1847();
	}

	@ObfInfo(name = "cp", desc = "(B)I")
	public int method83() {
		return this.field23;
	}

	@ObfInfo(name = "cv", desc = "(S)I")
	public int method52() {
		return this.field12;
	}

	@ObfInfo(name = "co", desc = "(I)I")
	public int method20() {
		return this.field8.method1855();
	}

	@ObfInfo(name = "cl", desc = "(B)I")
	public int method71() {
		return this.field14;
	}

	@ObfInfo(name = "cu", desc = "(I)I")
	public int method14() {
		return this.field8.method1848();
	}

	@ObfInfo(name = "ch", desc = "(B)Z", opaqueValue = "0")
	public boolean method70() {
		return this.method77() > 1;
	}

	@ObfInfo(name = "ci", desc = "(I)Z", opaqueValue = "-1178545129")
	boolean method54() {
		return this.field16 != this.field15;
	}

	@ObfInfo(name = "ca", desc = "(Ljava/lang/String;B)Ljava/lang/String;", opaqueValue = "4")
	String method51(String var1) {
		StringBuilder var3 = new StringBuilder(var1.length());

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			char var5 = var1.charAt(var4);
			if (this.method53(var5)) {
				var3.append(var5);
			}
		}

		return var3.toString();
	}

	@ObfInfo(name = "cb", desc = "(Lss;Lss;B)V", opaqueValue = "1")
	void method55(class165 var1, class165 var2) {
		if ((Integer)var2.field1562 < (Integer)var1.field1562) {
			this.method26((Integer)var1.field1561, (Integer)var2.field1562);
		} else {
			this.method26((Integer)var1.field1562, (Integer)var2.field1561);
		}

	}

	@ObfInfo(name = "cg", desc = "(IB)Lss;", opaqueValue = "1")
	class165 method56(int var1) {
		int var3 = this.field8.method1830();
		int var4 = 0;
		int var5 = var3;

		int var6;
		for (var6 = var1; var6 > 0; --var6) {
			if (this.method62(this.field8.method1845(var6 - 1).field3716)) {
				var4 = var6;
				break;
			}
		}

		for (var6 = var1; var6 < var3; ++var6) {
			if (this.method62(this.field8.method1845(var6).field3716)) {
				var5 = var6;
				break;
			}
		}

		return new class165(var4, var5);
	}

	@ObfInfo(name = "cj", desc = "(II)Lss;", opaqueValue = "657439906")
	class165 method57(int var1) {
		int var3 = this.field8.method1830();
		int var4 = 0;
		int var5 = var3;

		int var6;
		for (var6 = var1; var6 > 0; --var6) {
			if (this.field8.method1845(var6 - 1).field3716 == '\n') {
				var4 = var6;
				break;
			}
		}

		for (var6 = var1; var6 < var3; ++var6) {
			if (this.field8.method1845(var6).field3716 == '\n') {
				var5 = var6;
				break;
			}
		}

		return new class165(var4, var5);
	}

	@ObfInfo(name = "cz", desc = "(I)Z", opaqueValue = "-2078239234")
	boolean method58() {
		if (!this.method49()) {
			return false;
		} else {
			boolean var2 = false;
			if (this.field8.method1830() > this.field23) {
				this.field8.method1840(this.field23, this.field8.method1830());
				var2 = true;
			}

			int var3 = this.method77();
			int var4;
			if (this.field8.method1860() > var3) {
				var4 = this.field8.method1841(0, var3) - 1;
				this.field8.method1840(var4, this.field8.method1830());
				var2 = true;
			}

			if (var2) {
				var4 = this.field16;
				int var5 = this.field15;
				int var6 = this.field8.method1830();
				if (this.field16 > var6) {
					var4 = var6;
				}

				if (this.field15 > var6) {
					var5 = var6;
				}

				this.method26(var5, var4);
			}

			return var2;
		}
	}

	@ObfInfo(name = "ct", desc = "(IZI)V", opaqueValue = "1507563097")
	void method59(int var1, boolean var2) {
		if (var2) {
			this.method26(this.field15, var1);
		} else {
			this.method26(var1, var1);
		}

	}

	@ObfInfo(name = "cy", desc = "(B)I")
	int method60() {
		return this.field21 / this.field8.method1844();
	}

	@ObfInfo(name = "ck", desc = "(I)V", opaqueValue = "-676768049")
	void method61() {
		class474 var2 = this.field8.method1836(0, this.field16);
		class165 var3 = var2.method2435();
		int var4 = this.field8.method1844();
		int var5 = (Integer)var3.field1562 - 10;
		int var6 = var5 + 20;
		int var7 = (Integer)var3.field1561 - 3;
		int var8 = var7 + 6 + var4;
		int var9 = this.field22;
		int var10 = this.field13 + var9;
		int var11 = this.field10;
		int var12 = var11 + this.field21;
		int var13 = this.field22;
		int var14 = this.field10;
		if (var5 < var9) {
			var13 = var5;
		} else if (var6 > var10) {
			var13 = var6 - this.field13;
		}

		if (var7 < var11) {
			var14 = var7;
		} else if (var8 > var12) {
			var14 = var8 - this.field21;
		}

		this.method15(var13, var14);
	}

	@ObfInfo(name = "cc", desc = "(II)Z", opaqueValue = "-369704395")
	boolean method62(int var1) {
		return var1 == 32 || var1 == 10 || var1 == 9;
	}

	@ObfInfo(name = "dh", desc = "(I)V", opaqueValue = "1612814624")
	void method63() {
		if (null != this.field24) {
			this.field24.method1569();
		}

	}

	@ObfInfo(name = "dj", desc = "(II)Z", opaqueValue = "-1879887797")
	boolean method53(int var1) {
		switch(this.field14) {
		case 1:
			return class455.method2382((char)var1);
		case 2:
			return class455.method2376((char)var1);
		case 3:
			return class105.method608((char)var1);
		case 4:
			char var3 = (char)var1;
			if (class105.method608(var3)) {
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

	@ObfInfo(name = "di", desc = "(I)Lss;")
	class165 method64() {
		int var2 = this.field8.method1849(this.field13);
		int var3 = this.field8.method1850(this.field21);
		return new class165(var2, var3);
	}
}
