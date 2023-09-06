import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

class class391 extends SSLSocket {
	static class294 field3275;
	static int field3273;
	static int field3274;
	Certificate[] field3276;
	// $FF: synthetic field
	final class21 this$0;
	// $FF: synthetic field
	final String val$host;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;

	class391(class21 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public boolean getEnableSessionCreation() {
		return false;
	}

	public String[] getEnabledCipherSuites() {
		return null;
	}

	public String[] getEnabledProtocols() {
		return null;
	}

	public boolean getNeedClientAuth() {
		return false;
	}

	public SSLSession getSession() {
		return new class112(this);
	}

	public String[] getSupportedProtocols() {
		return null;
	}

	public String[] getSupportedCipherSuites() {
		return null;
	}

	public boolean getUseClientMode() {
		return false;
	}

	public boolean getWantClientAuth() {
		return false;
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public void setEnableSessionCreation(boolean var1) {
	}

	public void setEnabledCipherSuites(String[] var1) {
	}

	public void setEnabledProtocols(String[] var1) {
	}

	public void setNeedClientAuth(boolean var1) {
	}

	public void setUseClientMode(boolean var1) {
	}

	public void setWantClientAuth(boolean var1) {
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class149(this));
	}

	static int method2049(int var0, class167 var1, boolean var2) {
		boolean var4 = true;
		class60 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = class366.method1967(class139.field1344[--class203.field1903]);
			var4 = false;
		} else {
			var5 = var2 ? class491.field4134 : class52.field599;
		}

		int var10;
		if (var0 == 1300) {
			var10 = class139.field1344[--class203.field1903] - 1;
			if (var10 >= 0 && var10 <= 9) {
				var5.method445(var10, class139.field1331[--class429.field3529]);
				return 1;
			} else {
				--class429.field3529;
				return 1;
			}
		} else {
			int var11;
			if (var0 == 1301) {
				class203.field1903 -= 2;
				var10 = class139.field1344[class203.field1903];
				var11 = class139.field1344[class203.field1903 + 1];
				var5.field743 = class203.method1149(var10, var11);
				return 1;
			} else if (var0 == 1302) {
				var5.field725 = class139.field1344[--class203.field1903] == 1;
				return 1;
			} else if (var0 == 1303) {
				var5.field657 = class139.field1344[--class203.field1903];
				return 1;
			} else if (var0 == 1304) {
				var5.field699 = class139.field1344[--class203.field1903];
				return 1;
			} else if (var0 == 1305) {
				var5.field648 = class139.field1331[--class429.field3529];
				return 1;
			} else if (var0 == 1306) {
				var5.field726 = class139.field1331[--class429.field3529];
				return 1;
			} else if (var0 == 1307) {
				var5.field722 = null;
				return 1;
			} else if (var0 == 1308) {
				var5.field788 = class139.field1344[--class203.field1903] == 1;
				return 1;
			} else if (var0 == 1309) {
				--class203.field1903;
				return 1;
			} else {
				byte[] var7;
				int var8;
				if (var0 != 1350) {
					byte var9;
					if (var0 == 1351) {
						class203.field1903 -= 2;
						var9 = 10;
						var7 = new byte[]{(byte)class139.field1344[class203.field1903]};
						byte[] var12 = new byte[]{(byte)class139.field1344[1 + class203.field1903]};
						class199.method1139(var5, var9, var7, var12);
						return 1;
					} else if (var0 == 1352) {
						class203.field1903 -= 3;
						var10 = class139.field1344[class203.field1903] - 1;
						var11 = class139.field1344[class203.field1903 + 1];
						var8 = class139.field1344[2 + class203.field1903];
						if (var10 >= 0 && var10 <= 9) {
							class525.method2539(var5, var10, var11, var8);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1353) {
						var9 = 10;
						var11 = class139.field1344[--class203.field1903];
						var8 = class139.field1344[--class203.field1903];
						class525.method2539(var5, var9, var11, var8);
						return 1;
					} else if (var0 == 1354) {
						--class203.field1903;
						var10 = class139.field1344[class203.field1903] - 1;
						if (var10 >= 0 && var10 <= 9) {
							class398.method2079(var5, var10);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1355) {
						var9 = 10;
						class398.method2079(var5, var9);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var6 = null;
					var7 = null;
					if (var4) {
						class203.field1903 -= 10;

						for (var8 = 0; var8 < 10 && class139.field1344[class203.field1903 + var8] >= 0; var8 += 2) {
						}

						if (var8 > 0) {
							var6 = new byte[var8 / 2];
							var7 = new byte[var8 / 2];

							for (var8 -= 2; var8 >= 0; var8 -= 2) {
								var6[var8 / 2] = (byte)class139.field1344[class203.field1903 + var8];
								var7[var8 / 2] = (byte)class139.field1344[1 + class203.field1903 + var8];
							}
						}
					} else {
						class203.field1903 -= 2;
						var6 = new byte[]{(byte)class139.field1344[class203.field1903]};
						var7 = new byte[]{(byte)class139.field1344[1 + class203.field1903]};
					}

					var8 = class139.field1344[--class203.field1903] - 1;
					if (var8 >= 0 && var8 <= 9) {
						class199.method1139(var5, var8, var6, var7);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}
}
