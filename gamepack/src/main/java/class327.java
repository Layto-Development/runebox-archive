import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class327 implements class305 {
	final Map field2905;

	public class327(Map var1) {
		this.field2905 = var1;
	}

	public class272 method1732() {
		return null;
	}

	public byte[] method1731() throws UnsupportedEncodingException {
		return this.method1834().getBytes("UTF-8");
	}

	public String method1834() throws UnsupportedEncodingException {
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = this.field2905.entrySet().iterator();

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

	static void method1833() {
		class337.method1864(24);
		class174.method993(class433.field3787, class433.field3774, class433.field3775);
	}
}
