import java.io.*;

public final class class119 {
    final long field1084;
    RandomAccessFile field1083;
    long field1085;

    public class119(File var1, String var2, long var3) throws IOException {
        if (var3 == -1L) {
            var3 = Long.MAX_VALUE;
        }

        if (var1.length() > var3) {
            var1.delete();
        }

        this.field1083 = new RandomAccessFile(var1, var2);
        this.field1084 = var3;
        this.field1085 = 0L;
        int var5 = this.field1083.read();
        if (var5 != -1 && !var2.equals("r")) {
            this.field1083.seek(0L);
            this.field1083.write(var5);
        }

        this.field1083.seek(0L);
    }

    void method530(long var1) throws IOException {
        this.field1083.seek(var1);
        this.field1085 = var1;
    }

    public void method531(byte[] var1, int var2, int var3) throws IOException {
        if ((long) var3 + this.field1085 > this.field1084) {
            this.field1083.seek(this.field1084);
            this.field1083.write(1);
            throw new EOFException();
        } else {
            this.field1083.write(var1, var2, var3);
            this.field1085 += var3;
        }
    }

    public void method534() throws IOException {
        this.method535(false);
    }

    public void method535(boolean var1) throws IOException {
        if (null != this.field1083) {
            if (var1) {
                try {
                    this.field1083.getFD().sync();
                } catch (SyncFailedException var4) {
                }
            }

            this.field1083.close();
            this.field1083 = null;
        }

    }

    public long method532() throws IOException {
        return this.field1083.length();
    }

    public int method533(byte[] var1, int var2, int var3) throws IOException {
        int var5 = this.field1083.read(var1, var2, var3);
        if (var5 > 0) {
            this.field1085 += var5;
        }

        return var5;
    }

    @Override
    protected void finalize() throws Throwable {
        if (this.field1083 != null) {
            System.out.println();
            this.method534();
        }

    }
}
