import java.io.IOException;
import java.io.OutputStream;

public class class118 implements Runnable {
    boolean field1077;
    byte[] field1078;
    int field1075;
    int field1079;
    int field1080;
    IOException field1081;
    OutputStream field1076;
    Thread field1082;

    class118(OutputStream var1, int var2) {
        this.field1079 = 0;
        this.field1080 = 0;
        this.field1076 = var1;
        this.field1075 = var2 + 1;
        this.field1078 = new byte[this.field1075];
        this.field1082 = new Thread(this);
        this.field1082.setDaemon(true);
        this.field1082.start();
    }

    boolean method529() {
        if (this.field1077) {
            try {
                this.field1076.close();
                if (null == this.field1081) {
                    this.field1081 = new IOException("");
                }
            } catch (IOException var3) {
                if (null == this.field1081) {
                    this.field1081 = new IOException(var3);
                }
            }

            return true;
        } else {
            return false;
        }
    }

    @Override
    public void run() {
        do {
            int var1;
            synchronized (this) {
                while (true) {
                    if (this.field1081 != null) {
                        return;
                    }

                    if (this.field1079 <= this.field1080) {
                        var1 = this.field1080 - this.field1079;
                    } else {
                        var1 = this.field1080 + (this.field1075 - this.field1079);
                    }

                    if (var1 > 0) {
                        break;
                    }

                    try {
                        this.field1076.flush();
                    } catch (IOException var10) {
                        this.field1081 = var10;
                        return;
                    }

                    if (this.method529()) {
                        return;
                    }

                    try {
                        this.wait();
                    } catch (InterruptedException var11) {
                    }
                }
            }

            try {
                if (var1 + this.field1079 <= this.field1075) {
                    this.field1076.write(this.field1078, this.field1079, var1);
                } else {
                    int var13 = this.field1075 - this.field1079;
                    this.field1076.write(this.field1078, this.field1079, var13);
                    this.field1076.write(this.field1078, 0, var1 - var13);
                }
            } catch (IOException var9) {
                IOException var2 = var9;
                synchronized (this) {
                    this.field1081 = var2;
                    return;
                }
            }

            synchronized (this) {
                this.field1079 = (var1 + this.field1079) % this.field1075;
            }
        } while (!this.method529());

    }

    void method528(byte[] var1, int var2, int var3) throws IOException {
        if (var3 >= 0 && var3 <= var1.length) {
            synchronized (this) {
                if (this.field1081 != null) {
                    throw new IOException(this.field1081.toString());
                } else {
                    int var6;
                    if (this.field1079 <= this.field1080) {
                        var6 = this.field1075 - this.field1080 + this.field1079 - 1;
                    } else {
                        var6 = this.field1079 - this.field1080 - 1;
                    }

                    if (var6 < var3) {
                        throw new IOException("");
                    } else {
                        if (this.field1080 + var3 <= this.field1075) {
                            System.arraycopy(var1, 0, this.field1078, this.field1080, var3);
                        } else {
                            int var7 = this.field1075 - this.field1080;
                            System.arraycopy(var1, 0, this.field1078, this.field1080, var7);
                            System.arraycopy(var1, var7, this.field1078, 0, var3 - var7);
                        }

                        this.field1080 = (this.field1080 + var3) % this.field1075;
                        this.notifyAll();
                    }
                }
            }
        } else {
            throw new IOException();
        }
    }

    void method527() {
        synchronized (this) {
            this.field1077 = true;
            this.notifyAll();
        }

        try {
            this.field1082.join();
        } catch (InterruptedException var4) {
        }

    }
}
