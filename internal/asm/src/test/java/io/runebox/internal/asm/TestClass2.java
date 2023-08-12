package io.runebox.internal.asm;

class TestClass2 extends TestClass3
{
    int field2863;
    int array[];

    public void test()
    {
        TestClass2 tc = new TestClass2();

        field2863 = -1446933277;

        array[378529589 * tc.field2863] = 1;

        int var = 32;

        tc.field2863 = var * 1446933277;

        array[378529589 * tc.field2863] = 1;
    }
}