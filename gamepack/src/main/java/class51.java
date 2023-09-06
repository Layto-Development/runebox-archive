import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class51 extends class268 {
	static byte[][] field592;
	final boolean field591;

	public class51(boolean var1) {
		this.field591 = var1;
	}

	int method382(class304 var1, class304 var2) {
		if (var1.field2769 != 0) {
			if (var2.field2769 == 0) {
				return this.field591 ? -1 : 1;
			}
		} else if (var2.field2769 != 0) {
			return this.field591 ? 1 : -1;
		}

		return this.method1568(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.method382((class304)var1, (class304)var2);
	}

	static float[] method384(JSONObject var0, String var1) throws JSONException {
		float[] var3 = new float[4];

		try {
			JSONArray var4 = var0.getJSONArray(var1);
			var3[0] = (float)var4.optDouble(0, 0.0D);
			var3[1] = (float)var4.optDouble(1, 0.0D);
			var3[2] = (float)var4.optDouble(2, 1.0D);
			var3[3] = (float)var4.optDouble(3, 1.0D);
		} catch (JSONException var5) {
			var3[0] = 0.0F;
			var3[1] = 0.0F;
			var3[2] = 1.0F;
			var3[3] = 1.0F;
		}

		return var3;
	}

	static final void method383(class163 var0) {
		var0.field1533 = false;
		if (var0.field1538 != -1) {
			class393 var2 = class114.method702(var0.field1538);
			if (null != var2) {
				if (!var2.method2062() && null != var2.field3296) {
					++var0.field1568;
					if (var0.field1525 < var2.field3296.length && var0.field1568 > var2.field3307[var0.field1525]) {
						var0.field1568 = 1;
						++var0.field1525;
						class209.method1178(var2, var0.field1525, var0.field1555, var0.field1526);
					}

					if (var0.field1525 >= var2.field3296.length) {
						if (var2.field3300 > 0) {
							var0.field1525 -= var2.field3300;
							if (var2.field3308) {
								++var0.field1569;
							}

							if (var0.field1525 < 0 || var0.field1525 >= var2.field3296.length || var2.field3308 && var0.field1569 >= var2.field3289) {
								var0.field1568 = 0;
								var0.field1525 = 0;
								var0.field1569 = 0;
							}
						} else {
							var0.field1568 = 0;
							var0.field1525 = 0;
						}

						class209.method1178(var2, var0.field1525, var0.field1555, var0.field1526);
					}
				} else if (var2.method2062()) {
					++var0.field1525;
					int var3 = var2.method2059();
					if (var0.field1525 < var3) {
						class206.method1153(var2, var0.field1525, var0.field1555, var0.field1526);
					} else {
						if (var2.field3300 > 0) {
							var0.field1525 -= var2.field3300;
							if (var2.field3308) {
								++var0.field1569;
							}

							if (var0.field1525 < 0 || var0.field1525 >= var3 || var2.field3308 && var0.field1569 >= var2.field3289) {
								var0.field1525 = 0;
								var0.field1568 = 0;
								var0.field1569 = 0;
							}
						} else {
							var0.field1568 = 0;
							var0.field1525 = 0;
						}

						class206.method1153(var2, var0.field1525, var0.field1555, var0.field1526);
					}
				} else {
					var0.field1538 = -1;
				}
			} else {
				var0.field1538 = -1;
			}
		}

		class301 var7 = new class301(var0.method903());

		int var4;
		for (class508 var8 = (class508)var7.method1698(); null != var8; var8 = (class508)var7.next()) {
			if (var8.field4185 != -1 && Client.field306 >= var8.field4184) {
				var4 = class63.method481(var8.field4185).field3417;
				if (var4 == -1) {
					var8.method2269();
					--var0.field1576;
				} else {
					var8.field4182 = Math.max(var8.field4182, 0);
					class393 var5 = class114.method702(var4);
					if (null != var5.field3296 && !var5.method2062()) {
						++var8.field4181;
						if (var8.field4182 < var5.field3296.length && var8.field4181 > var5.field3307[var8.field4182]) {
							var8.field4181 = 1;
							++var8.field4182;
							class209.method1178(var5, var8.field4182, var0.field1555, var0.field1526);
						}

						if (var8.field4182 >= var5.field3296.length) {
							var8.method2269();
							--var0.field1576;
						}
					} else if (var5.method2062()) {
						++var8.field4182;
						int var6 = var5.method2059();
						if (var8.field4182 < var6) {
							class206.method1153(var5, var8.field4182, var0.field1555, var0.field1526);
						} else {
							var8.method2269();
							--var0.field1576;
						}
					} else {
						var8.method2269();
						--var0.field1576;
					}
				}
			}
		}

		class393 var9;
		if (var0.field1570 != -1 && var0.field1587 <= 1) {
			var9 = class114.method702(var0.field1570);
			if (var9.field3309 == 1 && var0.field1589 > 0 && var0.field1581 <= Client.field306 && var0.field1582 < Client.field306) {
				var0.field1587 = 1;
				return;
			}
		}

		if (var0.field1570 != -1 && var0.field1587 == 0) {
			var9 = class114.method702(var0.field1570);
			if (var9 != null) {
				if (!var9.method2062() && var9.field3296 != null) {
					++var0.field1572;
					if (var0.field1571 < var9.field3296.length && var0.field1572 > var9.field3307[var0.field1571]) {
						var0.field1572 = 1;
						++var0.field1571;
						class209.method1178(var9, var0.field1571, var0.field1555, var0.field1526);
					}

					if (var0.field1571 >= var9.field3296.length) {
						var0.field1571 -= var9.field3300;
						++var0.field1552;
						if (var0.field1552 >= var9.field3289) {
							var0.field1570 = -1;
						} else if (var0.field1571 >= 0 && var0.field1571 < var9.field3296.length) {
							class209.method1178(var9, var0.field1571, var0.field1555, var0.field1526);
						} else {
							var0.field1570 = -1;
						}
					}

					var0.field1533 = var9.field3303;
				} else if (var9.method2062()) {
					++var0.field1571;
					var4 = var9.method2059();
					if (var0.field1571 < var4) {
						class206.method1153(var9, var0.field1571, var0.field1555, var0.field1526);
					} else {
						var0.field1571 -= var9.field3300;
						++var0.field1552;
						if (var0.field1552 >= var9.field3289) {
							var0.field1570 = -1;
						} else if (var0.field1571 >= 0 && var0.field1571 < var4) {
							class206.method1153(var9, var0.field1571, var0.field1555, var0.field1526);
						} else {
							var0.field1570 = -1;
						}
					}
				} else {
					var0.field1570 = -1;
				}
			} else {
				var0.field1570 = -1;
			}
		}

		if (var0.field1587 > 0) {
			--var0.field1587;
		}

	}
}
