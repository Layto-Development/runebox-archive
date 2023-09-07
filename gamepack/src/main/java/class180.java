public class class180 extends class17 {

	static class335 field1776;

	public class180(class17 var1) {
		super(var1);
		super.field89 = "SwapSongTask";
	}

	@Override
	public boolean method51() {
		if (class388.field3090.size() > 1 && class388.field3090.get(0) != null && ((class490) class388.field3090.get(0)).field3956.method274() && class388.field3090.get(1) != null && ((class490) class388.field3090.get(1)).field3956.method274()) {
			class490 var2 = (class490) class388.field3090.get(0);
			class388.field3090.set(0, class388.field3090.get(1));
			class388.field3090.set(1, var2);
		}
		return true;
	}
}
