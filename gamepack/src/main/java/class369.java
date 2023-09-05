import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.net.MalformedURLException;
import java.net.URL;

@ObfInfo(name = "mw")
public class class369 {
	@ObfInfo(name = "qq", desc = "I", intMultiplier = -466560567)
	static int field2869;
	@ObfInfo(name = "ae", desc = "Lui;")
	class150 field2867;
	@ObfInfo(name = "au", desc = "Let;")
	class22 field2868;

	@ObfInfo(name = "<init>", desc = "(Ljava/lang/String;Lev;)V")
	class369(String var1, class265 var2) {
		try {
			this.field2868 = var2.method1384(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field2868 = null;
		}

	}

	@ObfInfo(name = "<init>", desc = "(Let;)V")
	class369(class22 var1) {
		this.field2868 = var1;
	}

	@ObfInfo(name = "au", desc = "(I)Lui;", opaqueValue = "-39928687")
	class150 method1997() {
		if (null == this.field2867 && this.field2868 != null && this.field2868.method334()) {
			if (this.field2868.method336() != null) {
				this.field2867 = class499.method2495(this.field2868.method336());
			}

			this.field2868 = null;
		}

		return this.field2867;
	}
}
