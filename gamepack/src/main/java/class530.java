import java.io.IOException;
import java.net.Socket;

public class class530 extends class75 {
    static int[][][] field4225;
    class118 field4222;
    class89 field4223;
    Socket field4224;

    public class530(Socket var1, int var2, int var3) throws IOException {
        this.field4224 = var1;
        this.field4224.setSoTimeout(30000);
        this.field4224.setTcpNoDelay(true);
        this.field4224.setReceiveBufferSize(65536);
        this.field4224.setSendBufferSize(65536);
        this.field4223 = new class89(this.field4224.getInputStream(), var2);
        this.field4222 = new class118(this.field4224.getOutputStream(), var3);
    }

    @Override
    public boolean method227(int var1) throws IOException {
        return this.field4223.method346(var1);
    }

    @Override
    public int method229() throws IOException {
        return this.field4223.method350();
    }

    @Override
    public int method231() throws IOException {
        return this.field4223.method347();
    }

    @Override
    public int method228(byte[] var1, int var2, int var3) throws IOException {
        return this.field4223.method348(var1, var2, var3);
    }

    @Override
    public void method230(byte[] var1, int var2, int var3) throws IOException {
        this.field4222.method528(var1, 0, var3);
    }

    @Override
    public void method232() {
        this.field4222.method527();

        try {
            this.field4224.close();
        } catch (IOException var3) {
        }

        this.field4223.method349();
    }

    @Override
    protected void finalize() {
        this.method232();
    }
}
