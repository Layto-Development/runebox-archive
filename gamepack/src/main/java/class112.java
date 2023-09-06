import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

class class112 implements SSLSession {
	// $FF: synthetic field
	final class391 this$1;

	class112(class391 var1) {
		this.this$1 = var1;
	}

	public int getApplicationBufferSize() {
		return 0;
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field3276;
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	public int getPeerPort() {
		return 0;
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}

	static final void method697(int var0, int var1, int var2, int var3) {
		for (int var5 = var1; var5 <= var1 + var3; ++var5) {
			for (int var6 = var0; var6 <= var0 + var2; ++var6) {
				if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
					class394.field3316[0][var6][var5] = 127;
					if (var6 == var0 && var6 > 0) {
						class38.field511[0][var6][var5] = class38.field511[0][var6 - 1][var5];
					}

					if (var6 == var2 + var0 && var6 < 103) {
						class38.field511[0][var6][var5] = class38.field511[0][var6 + 1][var5];
					}

					if (var5 == var1 && var5 > 0) {
						class38.field511[0][var6][var5] = class38.field511[0][var6][var5 - 1];
					}

					if (var5 == var3 + var1 && var5 < 103) {
						class38.field511[0][var6][var5] = class38.field511[0][var6][var5 + 1];
					}
				}
			}
		}

	}

	static final void method696(int var0) {
		int[] var2 = class268.field2420.field1083;
		int var3 = var2.length;

		int var4;
		for (var4 = 0; var4 < var3; ++var4) {
			var2[var4] = 0;
		}

		int var5;
		int var6;
		for (var4 = 1; var4 < 103; ++var4) {
			var5 = 2048 * (103 - var4) + 24628;

			for (var6 = 1; var6 < 103; ++var6) {
				if ((class38.field513[var0][var6][var4] & 24) == 0) {
					class415.field3487.method1777(var2, var5, 512, var0, var6, var4);
				}

				if (var0 < 3 && (class38.field513[var0 + 1][var6][var4] & 8) != 0) {
					class415.field3487.method1777(var2, var5, 512, var0 + 1, var6, var4);
				}

				var5 += 4;
			}
		}

		var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
		var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
		class268.field2420.method706();

		int var7;
		for (var6 = 1; var6 < 103; ++var6) {
			for (var7 = 1; var7 < 103; ++var7) {
				if ((class38.field513[var0][var7][var6] & 24) == 0) {
					class434.method2201(var0, var7, var6, var4, var5);
				}

				if (var0 < 3 && (class38.field513[var0 + 1][var7][var6] & 8) != 0) {
					class434.method2201(var0 + 1, var7, var6, var4, var5);
				}
			}
		}

		Client.field250 = 0;

		for (var6 = 0; var6 < 104; ++var6) {
			for (var7 = 0; var7 < 104; ++var7) {
				long var8 = class415.field3487.method1804(class358.field3038, var6, var7);
				if (0L != var8) {
					int var10 = class67.method491(var8);
					int var11 = class96.method638(var10, (byte)46).field2140;
					if (var11 >= 0 && class158.method892(var11).field967) {
						Client.field261[Client.field250] = class158.method892(var11).method635(false);
						Client.field251[Client.field250] = var6;
						Client.field252[Client.field250] = var7;
						++Client.field250;
					}
				}
			}
		}

		class94.field937.method607();
	}
}
