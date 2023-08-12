package io.runebox.internal.asm;

class TestClass1 extends TestClass2
{
	private static int dummy(Object... args)
	{
		return 0;
	}

	private int field1 = -1611704481;
	private int field2;
	private int field3, field4;

	@Override
	public void test()
	{
		TestClass1 tc = new TestClass1(); // to trick executor to call the constructor
		int var = 42;

		if (-1 != this.field1 * 1928543073)
		{
			dummy(this.field1 * 1928543073);
			this.field1 = dummy() * 1611704481;
		}

		if (field2 * 1550405721 > 30000)
		{
			field2 += -1868498967 * var;
		}

		field3 = tc.dummy() * 1510226873;
		field4 = 572701809 * tc.field3;
		if (-1722291303 * field4 >= var)
		{
			var = field4 * -1722291303;
		}
	}

	public void test3() {
		super.test2();
	}
}