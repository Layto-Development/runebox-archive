import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

@ObfInfo(name = "qf")
public class class59 {
	@ObfInfo(name = "nx", desc = "I", intMultiplier = 183418913)
	static int field731;
	@ObfInfo(name = "ai", desc = "Ljava/text/DecimalFormat;")
	final DecimalFormat field728;
	@ObfInfo(name = "at", desc = "Ljava/util/Map;")
	final Map field729;
	@ObfInfo(name = "ac", desc = "Ljava/util/Map;")
	final Map field730;

	@ObfInfo(name = "<init>", desc = "()V")
	public class59() {
		this.field729 = new HashMap();
		this.field730 = new HashMap();
		this.field728 = new DecimalFormat();
		this.field728.setMaximumFractionDigits(2);
	}

	@ObfInfo(name = "au", desc = "(Ljavax/net/ssl/HttpsURLConnection;B)V")
	public void method471(HttpsURLConnection var1) {
		Iterator var3 = this.field729.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			var1.setRequestProperty((String)var4.getKey(), (String)var4.getValue());
		}

	}

	@ObfInfo(name = "ae", desc = "(I)Ljava/util/Map;")
	public Map method472() {
		return this.field729;
	}

	@ObfInfo(name = "ao", desc = "(Ljava/lang/String;Ljava/lang/String;I)V", opaqueValue = "2091196892")
	public void method473(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.field729.put(var1, var2 != null ? var2 : "");
		}

	}

	@ObfInfo(name = "at", desc = "(Ljava/lang/String;I)V", opaqueValue = "446806952")
	public void method482(String var1) {
		if (null != var1 && !var1.isEmpty()) {
			this.field729.remove(var1);
		}

	}

	@ObfInfo(name = "ac", desc = "(Lqn;Ljava/lang/String;B)V")
	void method478(class271 var1, String var2) {
		String var4 = String.format("%s %s", var1.method1425(), var2);
		this.method473("Authorization", var4);
	}

	@ObfInfo(name = "ai", desc = "(Ljava/lang/String;I)V")
	public void method474(String var1) {
		this.method478(class271.field2219, var1);
	}

	@ObfInfo(name = "az", desc = "(Ljava/lang/String;I)V")
	public void method483(String var1) {
		this.method478(class271.field2220, var1);
	}

	@ObfInfo(name = "ap", desc = "(Lre;I)V")
	public void method477(class329 var1) {
		this.field729.put("Content-Type", var1.method1805());
	}

	@ObfInfo(name = "aa", desc = "(B)V")
	public void method475() {
		this.field729.remove("Content-Type");
	}

	@ObfInfo(name = "af", desc = "(Lre;B)V")
	public void method476(class329 var1) {
		this.method480(var1, 1.0F);
	}

	@ObfInfo(name = "ad", desc = "(Lre;FI)V")
	void method480(class329 var1, float var2) {
		this.field730.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.method479();
	}

	@ObfInfo(name = "aq", desc = "(I)V")
	void method479() {
		this.field729.remove("Accept");
		if (!this.field730.isEmpty()) {
			this.field729.put("Accept", this.method481());
		}

	}

	@ObfInfo(name = "al", desc = "(B)Ljava/lang/String;", opaqueValue = "0")
	String method481() {
		ArrayList var2 = new ArrayList(this.field730.entrySet());
		Collections.sort(var2, new class118(this));
		StringBuilder var3 = new StringBuilder();
		Iterator var4 = var2.iterator();

		while (var4.hasNext()) {
			Entry var5 = (Entry)var4.next();
			if (var3.length() > 0) {
				var3.append(",");
			}

			var3.append(((class329)var5.getKey()).method1805());
			float var6 = (Float)var5.getValue();
			if (var6 < 1.0F) {
				String var7 = this.field728.format((double)var6);
				var3.append(";q=").append(var7);
			}
		}

		return var3.toString();
	}
}
