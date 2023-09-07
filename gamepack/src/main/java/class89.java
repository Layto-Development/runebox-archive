import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class class89 implements Runnable {
    byte[] field751;
    int field749;
    int field750;
    int field752;
    IOException field753;
    InputStream field754;
    Thread field748;

    class89(InputStream var1, int var2) {
        this.field752 = 0;
        this.field749 = 0;
        this.field754 = var1;
        this.field750 = var2 + 1;
        this.field751 = new byte[this.field750];
        this.field748 = new Thread(this);
        this.field748.setDaemon(true);
        this.field748.start();
    }

    public static void method345(class68 var0) {
        class48.field545 = var0;
    }

    @Override
    public void run() {
        while (true) {
            int var1;
            synchronized (this) {
                while (true) {
                    if (null != this.field753) {
                        return;
                    }

                    if (this.field752 == 0) {
                        var1 = this.field750 - this.field749 - 1;
                    } else if (this.field752 <= this.field749) {
                        var1 = this.field750 - this.field749;
                    } else {
                        var1 = this.field752 - this.field749 - 1;
                    }

                    if (var1 > 0) {
                        break;
                    }

                    try {
                        this.wait();
                    } catch (InterruptedException var9) {
                    }
                }
            }

            int var2;
            try {
                var2 = this.field754.read(this.field751, this.field749, var1);
                if (var2 == -1) {
                    throw new EOFException();
                }
            } catch (IOException var10) {
                IOException var3 = var10;
                synchronized (this) {
                    this.field753 = var3;
                    return;
                }
            }

            synchronized (this) {
                this.field749 = (this.field749 + var2) % this.field750;
            }
        }
    }

    boolean method346(int var1) throws IOException {
        if (var1 == 0) {
            return true;
        } else if (var1 > 0 && var1 < this.field750) {
            synchronized (this) {
                int var4;
                if (this.field752 <= this.field749) {
                    var4 = this.field749 - this.field752;
                } else {
                    var4 = this.field750 - this.field752 + this.field749;
                }

                if (var4 < var1) {
                    if (this.field753 != null) {
                        throw new IOException(this.field753.toString());
                    } else {
                        this.notifyAll();
                        return false;
                    }
                } else {
                    return true;
                }
            }
        } else {
            throw new IOException();
        }
    }

    int method350() throws IOException {
        synchronized (this) {
            int var3;
            if (this.field752 <= this.field749) {
                var3 = this.field749 - this.field752;
            } else {
                var3 = this.field750 - this.field752 + this.field749;
            }

            if (var3 <= 0 && this.field753 != null) {
                throw new IOException(this.field753.toString());
            } else {
                this.notifyAll();
                return var3;
            }
        }
    }

    int method347() throws IOException {
        synchronized (this) {
            if (this.field752 == this.field749) {
                if (this.field753 != null) {
                    throw new IOException(this.field753.toString());
                } else {
                    return -1;
                }
            } else {
                int var3 = this.field751[this.field752] & 255;
                this.field752 = (this.field752 + 1) % this.field750;
                this.notifyAll();
                return var3;
            }
        }
    }

    int method348(byte[] var1, int var2, int var3) throws IOException {
        if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
            synchronized (this) {
                int var6;
                if (this.field752 <= this.field749) {
                    var6 = this.field749 - this.field752;
                } else {
                    var6 = this.field749 + (this.field750 - this.field752);
                }

                if (var3 > var6) {
                    var3 = var6;
                }

                if (var3 == 0 && null != this.field753) {
                    throw new IOException(this.field753.toString());
                } else {
                    if (this.field752 + var3 <= this.field750) {
                        System.arraycopy(this.field751, this.field752, var1, var2, var3);
                    } else {
                        int var7 = this.field750 - this.field752;
                        System.arraycopy(this.field751, this.field752, var1, var2, var7);
                        System.arraycopy(this.field751, 0, var1, var7 + var2, var3 - var7);
                    }

                    this.field752 = (this.field752 + var3) % this.field750;
                    this.notifyAll();
                    return var3;
                }
            }
        } else {
            throw new IOException();
        }
    }

    void method349() {
        synchronized (this) {
            if (null == this.field753) {
                this.field753 = new IOException("");
            }

            this.notifyAll();
        }

        try {
            this.field748.join();
        } catch (InterruptedException var4) {
        }

    }
}
