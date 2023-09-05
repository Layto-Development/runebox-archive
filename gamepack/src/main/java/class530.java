import io.runebox.internal.deobfuscator.includes.ObfInfo;
import java.applet.Applet;
import netscape.javascript.JSObject;

@ObfInfo(name = "bh")
public class class530 {
	@ObfInfo(name = "<init>", desc = "()V")
	class530() throws Throwable {
	}

	@ObfInfo(name = "au", desc = "(Ljava/applet/Applet;Ljava/lang/String;[Ljava/lang/Object;I)Ljava/lang/Object;")
	public static Object method2576(Applet var0, String var1, Object[] var2) throws Throwable {
		return JSObject.getWindow(var0).call(var1, var2);
	}
}
