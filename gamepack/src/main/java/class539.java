import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class539 implements class252 {

	final Map field4242;

	public class539(Map var1) {
		this.field4242 = var1;
	}

	@Override
	public class533 method1444() {
		return null;
	}

	@Override
	public byte[] method1443() throws UnsupportedEncodingException {
		return this.method2604().getBytes("UTF-8");
	}

	public String method2604() throws UnsupportedEncodingException {
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = this.field4242.entrySet().iterator();
		while (var3.hasNext()) {
			Entry var4 = (Entry) var3.next();
			String var5 = URLEncoder.encode((String) var4.getKey(), "UTF-8");
			String var6 = URLEncoder.encode((String) var4.getValue(), "UTF-8");
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
