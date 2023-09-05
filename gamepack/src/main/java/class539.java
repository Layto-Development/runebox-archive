import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.util.Calendar;
import java.util.TimeZone;

@ObfInfo(name = "mo")
public class class539 {
	@ObfInfo(name = "ao", desc = "Ljava/util/Calendar;")
	public static Calendar field4277;
	@ObfInfo(name = "ae", desc = "[Ljava/lang/String;")
	public static final String[] field4276;
	@ObfInfo(name = "au", desc = "[[Ljava/lang/String;")
	public static final String[][] field4278;

	static {
		field4278 = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
		field4276 = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		Calendar.getInstance();
		field4277 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	@ObfInfo(name = "<init>", desc = "()V")
	class539() throws Throwable {
	}
}
