import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;

class class179 extends DefaultTlsClient {
    static class539[] field1520;
    static class68 field1519;
    // $FF: synthetic field
    final class264 this$1;

    class179(class264 var1) {
        this.this$1 = var1;
    }

    @Override
    public Hashtable getClientExtensions() throws IOException {
        Hashtable var1 = super.getClientExtensions();
        if (var1 == null) {
            var1 = new Hashtable();
        }

        byte[] var2 = this.this$1.val$host.getBytes();
        ByteArrayOutputStream var3 = new ByteArrayOutputStream();
        DataOutputStream var4 = new DataOutputStream(var3);
        var4.writeShort(var2.length + 3);
        var4.writeByte(0);
        var4.writeShort(var2.length);
        var4.write(var2);
        var4.close();
        var1.put(0, var3.toByteArray());
        return var1;
    }

    @Override
    public TlsAuthentication getAuthentication() throws IOException {
        return new class126(this);
    }
}
