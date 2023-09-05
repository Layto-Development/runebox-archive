import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfInfo(name = "rt")
public class class168 implements class167 {
	@ObfInfo(name = "au", desc = "Ljava/util/Map;")
	final Map field1582;

	@ObfInfo(name = "<init>", desc = "(Ljava/util/Map;)V")
	public class168(Map var1) {
		this.field1582 = var1;
	}

	@ObfInfo(name = "au", desc = "(I)Lre;")
	public class329 method949() {
		return null;
	}

	@ObfInfo(name = "ae", desc = "(I)[B")
	public byte[] method948() throws UnsupportedEncodingException {
		return this.method950().getBytes("UTF-8");
	}

	@ObfInfo(name = "ai", desc = "(I)Ljava/lang/String;", opaqueValue = "-56724135")
	public String method950() throws UnsupportedEncodingException {
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = this.field1582.entrySet().iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			String var5 = URLEncoder.encode((String)var4.getKey(), "UTF-8");
			String var6 = URLEncoder.encode((String)var4.getValue(), "UTF-8");
			var2.append(var5).append("=").append(var6).append("&");
		}

		if (var2.length() == 0) {
			return "";
		} else {
			var2.deleteCharAt(var2.length() - 1);
			var2.insert(0, "?");
			return var2.toString();
		}
	}
}
