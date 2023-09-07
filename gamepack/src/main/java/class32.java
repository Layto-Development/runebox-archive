public class class32 extends class182 {

	boolean field165;

	int field152;

	int field153;

	int field154;

	int field155;

	int field156;

	int field157;

	int field158;

	int field159;

	int field160;

	int field161;

	int field162;

	int field163;

	int field164;

	int field166;

	class32(class529 var1, int var2, int var3) {
		super.field1786 = var1;
		this.field160 = var1.field4189;
		this.field161 = var1.field4187;
		this.field165 = var1.field4191;
		this.field153 = var2;
		this.field154 = var3;
		this.field155 = 8192;
		this.field162 = 0;
		this.method150();
	}

	class32(class529 var1, int var2, int var3, int var4) {
		super.field1786 = var1;
		this.field160 = var1.field4189;
		this.field161 = var1.field4187;
		this.field165 = var1.field4191;
		this.field153 = var2;
		this.field154 = var3;
		this.field155 = var4;
		this.field162 = 0;
		this.method150();
	}

	@Override
	int method1065() {
		int var1 = this.field156 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.field159 == 0) {
			var1 -= var1 * this.field162 / (((class529) super.field1786).field4188.length << 8);
		} else if (this.field159 >= 0) {
			var1 -= var1 * this.field160 / ((class529) super.field1786).field4188.length;
		}
		return var1 > 255 ? 255 : var1;
	}

	void method150() {
		this.field156 = this.field154;
		this.field164 = method142(this.field154, this.field155);
		this.field158 = method109(this.field154, this.field155);
	}

	public synchronized void method113(int var1) {
		this.field159 = var1;
	}

	public synchronized void method114(int var1) {
		this.method115(var1 << 6, this.method117());
	}

	synchronized void method153(int var1) {
		this.method115(0, this.method117());
	}

	synchronized void method115(int var1, int var2) {
		this.field154 = var1;
		this.field155 = var2;
		this.field163 = 0;
		this.method150();
	}

	public synchronized int method116() {
		return this.field154 == Integer.MIN_VALUE ? 0 : this.field154;
	}

	public synchronized int method117() {
		return this.field155 < 0 ? -1 : this.field155;
	}

	public synchronized void method118(int var1) {
		int var2 = ((class529) super.field1786).field4188.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}
		if (var1 > var2) {
			var1 = var2;
		}
		this.field162 = var1;
	}

	public synchronized void method146(boolean var1) {
		this.field153 = (this.field153 ^ this.field153 >> 31) + (this.field153 >>> 31);
		this.field153 = -this.field153;
	}

	void method143() {
		if (this.field163 != 0) {
			if (this.field154 == Integer.MIN_VALUE) {
				this.field154 = 0;
			}
			this.field163 = 0;
			this.method150();
		}
	}

	public synchronized void method145(int var1, int var2) {
		this.method128(var1, var2, this.method117());
	}

	public synchronized void method128(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method115(var2, var3);
		} else {
			int var4 = method142(var2, var3);
			int var5 = method109(var2, var3);
			if (this.field164 == var4 && this.field158 == var5) {
				this.field163 = 0;
			} else {
				int var6 = var2 - this.field156;
				if (this.field156 - var2 > var6) {
					var6 = this.field156 - var2;
				}
				if (var4 - this.field164 > var6) {
					var6 = var4 - this.field164;
				}
				if (this.field164 - var4 > var6) {
					var6 = this.field164 - var4;
				}
				if (var5 - this.field158 > var6) {
					var6 = var5 - this.field158;
				}
				if (this.field158 - var5 > var6) {
					var6 = this.field158 - var5;
				}
				if (var1 > var6) {
					var1 = var6;
				}
				this.field163 = var1;
				this.field154 = var2;
				this.field155 = var3;
				this.field152 = (var2 - this.field156) / var1;
				this.field157 = (var4 - this.field164) / var1;
				this.field166 = (var5 - this.field158) / var1;
			}
		}
	}

	public synchronized void method120(int var1) {
		if (var1 == 0) {
			this.method153(0);
			this.method318();
		} else if (this.field164 == 0 && this.field158 == 0) {
			this.field163 = 0;
			this.field154 = 0;
			this.field156 = 0;
			this.method318();
		} else {
			int var2 = -this.field156;
			if (this.field156 > var2) {
				var2 = this.field156;
			}
			if (-this.field164 > var2) {
				var2 = -this.field164;
			}
			if (this.field164 > var2) {
				var2 = this.field164;
			}
			if (-this.field158 > var2) {
				var2 = -this.field158;
			}
			if (this.field158 > var2) {
				var2 = this.field158;
			}
			if (var1 > var2) {
				var1 = var2;
			}
			this.field163 = var1;
			this.field154 = Integer.MIN_VALUE;
			this.field152 = -this.field156 / var1;
			this.field157 = -this.field164 / var1;
			this.field166 = -this.field158 / var1;
		}
	}

	public synchronized void method121(int var1) {
		if (this.field153 < 0) {
			this.field153 = -var1;
		} else {
			this.field153 = var1;
		}
	}

	public synchronized int method122() {
		return this.field153 < 0 ? -this.field153 : this.field153;
	}

	public boolean method123() {
		return this.field162 < 0 || this.field162 >= ((class529) super.field1786).field4188.length << 8;
	}

	public boolean method124() {
		return this.field163 != 0;
	}

	@Override
	protected class182 method1066() {
		return null;
	}

	@Override
	protected class182 method1067() {
		return null;
	}

	@Override
	protected int method1064() {
		return this.field154 == 0 && this.field163 == 0 ? 0 : 1;
	}

	@Override
	public synchronized void method1069(int[] var1, int var2, int var3) {
		if (this.field154 == 0 && this.field163 == 0) {
			this.method1068(var3);
		} else {
			class529 var4 = (class529) super.field1786;
			int var5 = this.field160 << 8;
			int var6 = this.field161 << 8;
			int var7 = var4.field4188.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.field159 = 0;
			}
			int var9 = var2;
			var3 += var2;
			if (this.field162 < 0) {
				if (this.field153 <= 0) {
					this.method143();
					this.method318();
					return;
				}
				this.field162 = 0;
			}
			if (this.field162 >= var7) {
				if (this.field153 >= 0) {
					this.method143();
					this.method318();
					return;
				}
				this.field162 = var7 - 1;
			}
			if (this.field159 < 0) {
				if (this.field165) {
					if (this.field153 < 0) {
						var9 = this.method130(var1, var2, var5, var3, var4.field4188[this.field160]);
						if (this.field162 >= var5) {
							return;
						}
						this.field162 = var5 + var5 - 1 - this.field162;
						this.field153 = -this.field153;
					}
					while (true) {
						var9 = this.method144(var1, var9, var6, var3, var4.field4188[this.field161 - 1]);
						if (this.field162 < var6) {
							return;
						}
						this.field162 = var6 + var6 - 1 - this.field162;
						this.field153 = -this.field153;
						var9 = this.method130(var1, var9, var5, var3, var4.field4188[this.field160]);
						if (this.field162 >= var5) {
							return;
						}
						this.field162 = var5 + var5 - 1 - this.field162;
						this.field153 = -this.field153;
					}
				} else if (this.field153 < 0) {
					while (true) {
						var9 = this.method130(var1, var9, var5, var3, var4.field4188[this.field161 - 1]);
						if (this.field162 >= var5) {
							return;
						}
						this.field162 = var6 - 1 - (var6 - 1 - this.field162) % var8;
					}
				} else {
					while (true) {
						var9 = this.method144(var1, var9, var6, var3, var4.field4188[this.field160]);
						if (this.field162 < var6) {
							return;
						}
						this.field162 = var5 + (this.field162 - var5) % var8;
					}
				}
			} else {
				if (this.field159 > 0) {
					if (this.field165) {
						label131: {
							if (this.field153 < 0) {
								var9 = this.method130(var1, var2, var5, var3, var4.field4188[this.field160]);
								if (this.field162 >= var5) {
									return;
								}
								this.field162 = var5 + var5 - 1 - this.field162;
								this.field153 = -this.field153;
								if (--this.field159 == 0) {
									break label131;
								}
							}
							do {
								var9 = this.method144(var1, var9, var6, var3, var4.field4188[this.field161 - 1]);
								if (this.field162 < var6) {
									return;
								}
								this.field162 = var6 + var6 - 1 - this.field162;
								this.field153 = -this.field153;
								if (--this.field159 == 0) {
									break;
								}
								var9 = this.method130(var1, var9, var5, var3, var4.field4188[this.field160]);
								if (this.field162 >= var5) {
									return;
								}
								this.field162 = var5 + var5 - 1 - this.field162;
								this.field153 = -this.field153;
							} while (--this.field159 != 0);
						}
					} else {
						int var10;
						if (this.field153 < 0) {
							while (true) {
								var9 = this.method130(var1, var9, var5, var3, var4.field4188[this.field161 - 1]);
								if (this.field162 >= var5) {
									return;
								}
								var10 = (var6 - 1 - this.field162) / var8;
								if (var10 >= this.field159) {
									this.field162 += var8 * this.field159;
									this.field159 = 0;
									break;
								}
								this.field162 += var8 * var10;
								this.field159 -= var10;
							}
						} else {
							while (true) {
								var9 = this.method144(var1, var9, var6, var3, var4.field4188[this.field160]);
								if (this.field162 < var6) {
									return;
								}
								var10 = (this.field162 - var5) / var8;
								if (var10 >= this.field159) {
									this.field162 -= var8 * this.field159;
									this.field159 = 0;
									break;
								}
								this.field162 -= var8 * var10;
								this.field159 -= var10;
							}
						}
					}
				}
				if (this.field153 < 0) {
					this.method130(var1, var9, 0, var3, 0);
					if (this.field162 < 0) {
						this.field162 = -1;
						this.method143();
						this.method318();
					}
				} else {
					this.method144(var1, var9, var7, var3, 0);
					if (this.field162 >= var7) {
						this.field162 = var7;
						this.method143();
						this.method318();
					}
				}
			}
		}
	}

	@Override
	public synchronized void method1068(int var1) {
		if (this.field163 > 0) {
			if (var1 >= this.field163) {
				if (this.field154 == Integer.MIN_VALUE) {
					this.field154 = 0;
					this.field158 = 0;
					this.field164 = 0;
					this.field156 = 0;
					this.method318();
					var1 = this.field163;
				}
				this.field163 = 0;
				this.method150();
			} else {
				this.field156 += this.field152 * var1;
				this.field164 += this.field157 * var1;
				this.field158 += this.field166 * var1;
				this.field163 -= var1;
			}
		}
		class529 var2 = (class529) super.field1786;
		int var3 = this.field160 << 8;
		int var4 = this.field161 << 8;
		int var5 = var2.field4188.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.field159 = 0;
		}
		if (this.field162 < 0) {
			if (this.field153 <= 0) {
				this.method143();
				this.method318();
				return;
			}
			this.field162 = 0;
		}
		if (this.field162 >= var5) {
			if (this.field153 >= 0) {
				this.method143();
				this.method318();
				return;
			}
			this.field162 = var5 - 1;
		}
		this.field162 += this.field153 * var1;
		if (this.field159 < 0) {
			if (!this.field165) {
				if (this.field153 < 0) {
					if (this.field162 >= var3) {
						return;
					}
					this.field162 = var4 - 1 - (var4 - 1 - this.field162) % var6;
				} else {
					if (this.field162 < var4) {
						return;
					}
					this.field162 = var3 + (this.field162 - var3) % var6;
				}
			} else {
				if (this.field153 < 0) {
					if (this.field162 >= var3) {
						return;
					}
					this.field162 = var3 + var3 - 1 - this.field162;
					this.field153 = -this.field153;
				}
				while (this.field162 >= var4) {
					this.field162 = var4 + var4 - 1 - this.field162;
					this.field153 = -this.field153;
					if (this.field162 >= var3) {
						return;
					}
					this.field162 = var3 + var3 - 1 - this.field162;
					this.field153 = -this.field153;
				}
			}
		} else {
			if (this.field159 > 0) {
				if (this.field165) {
					label120: {
						if (this.field153 < 0) {
							if (this.field162 >= var3) {
								return;
							}
							this.field162 = var3 + var3 - 1 - this.field162;
							this.field153 = -this.field153;
							if (--this.field159 == 0) {
								break label120;
							}
						}
						do {
							if (this.field162 < var4) {
								return;
							}
							this.field162 = var4 + var4 - 1 - this.field162;
							this.field153 = -this.field153;
							if (--this.field159 == 0) {
								break;
							}
							if (this.field162 >= var3) {
								return;
							}
							this.field162 = var3 + var3 - 1 - this.field162;
							this.field153 = -this.field153;
						} while (--this.field159 != 0);
					}
				} else {
					label152: {
						int var7;
						if (this.field153 < 0) {
							if (this.field162 >= var3) {
								return;
							}
							var7 = (var4 - 1 - this.field162) / var6;
							if (var7 >= this.field159) {
								this.field162 += var6 * this.field159;
								this.field159 = 0;
								break label152;
							}
							this.field162 += var6 * var7;
							this.field159 -= var7;
						} else {
							if (this.field162 < var4) {
								return;
							}
							var7 = (this.field162 - var3) / var6;
							if (var7 >= this.field159) {
								this.field162 -= var6 * this.field159;
								this.field159 = 0;
								break label152;
							}
							this.field162 -= var6 * var7;
							this.field159 -= var7;
						}
						return;
					}
				}
			}
			if (this.field153 < 0) {
				if (this.field162 < 0) {
					this.field162 = -1;
					this.method143();
					this.method318();
				}
			} else if (this.field162 >= var5) {
				this.field162 = var5;
				this.method143();
				this.method318();
			}
		}
	}

	int method144(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field163 > 0) {
				int var6 = var2 + this.field163;
				if (var6 > var4) {
					var6 = var4;
				}
				this.field163 += var2;
				if (this.field153 == 256 && (this.field162 & 255) == 0) {
					if (class537.field4232) {
						var2 = method137(0, ((class529) super.field1786).field4188, var1, this.field162, var2, this.field164, this.field158, this.field157, this.field166, 0, var6, var3, this);
					} else {
						var2 = method136(((class529) super.field1786).field4188, var1, this.field162, var2, this.field156, this.field152, 0, var6, var3, this);
					}
				} else if (class537.field4232) {
					var2 = method141(0, 0, ((class529) super.field1786).field4188, var1, this.field162, var2, this.field164, this.field158, this.field157, this.field166, 0, var6, var3, this, this.field153, var5);
				} else {
					var2 = method140(0, 0, ((class529) super.field1786).field4188, var1, this.field162, var2, this.field156, this.field152, 0, var6, var3, this, this.field153, var5);
				}
				this.field163 -= var2;
				if (this.field163 != 0) {
					return var2;
				}
				if (!this.method149()) {
					continue;
				}
				return var4;
			}
			if (this.field153 == 256 && (this.field162 & 255) == 0) {
				if (class537.field4232) {
					return method131(0, ((class529) super.field1786).field4188, var1, this.field162, var2, this.field164, this.field158, 0, var4, var3, this);
				}
				return method111(((class529) super.field1786).field4188, var1, this.field162, var2, this.field156, 0, var4, var3, this);
			}
			if (class537.field4232) {
				return method134(0, 0, ((class529) super.field1786).field4188, var1, this.field162, var2, this.field164, this.field158, 0, var4, var3, this, this.field153, var5);
			}
			return method133(0, 0, ((class529) super.field1786).field4188, var1, this.field162, var2, this.field156, 0, var4, var3, this, this.field153, var5);
		}
	}

	int method130(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field163 > 0) {
				int var6 = var2 + this.field163;
				if (var6 > var4) {
					var6 = var4;
				}
				this.field163 += var2;
				if (this.field153 == -256 && (this.field162 & 255) == 0) {
					if (class537.field4232) {
						var2 = method139(0, ((class529) super.field1786).field4188, var1, this.field162, var2, this.field164, this.field158, this.field157, this.field166, 0, var6, var3, this);
					} else {
						var2 = method138(((class529) super.field1786).field4188, var1, this.field162, var2, this.field156, this.field152, 0, var6, var3, this);
					}
				} else if (class537.field4232) {
					var2 = method148(0, 0, ((class529) super.field1786).field4188, var1, this.field162, var2, this.field164, this.field158, this.field157, this.field166, 0, var6, var3, this, this.field153, var5);
				} else {
					var2 = method151(0, 0, ((class529) super.field1786).field4188, var1, this.field162, var2, this.field156, this.field152, 0, var6, var3, this, this.field153, var5);
				}
				this.field163 -= var2;
				if (this.field163 != 0) {
					return var2;
				}
				if (!this.method149()) {
					continue;
				}
				return var4;
			}
			if (this.field153 == -256 && (this.field162 & 255) == 0) {
				if (class537.field4232) {
					return method152(0, ((class529) super.field1786).field4188, var1, this.field162, var2, this.field164, this.field158, 0, var4, var3, this);
				}
				return method132(((class529) super.field1786).field4188, var1, this.field162, var2, this.field156, 0, var4, var3, this);
			}
			if (class537.field4232) {
				return method135(0, 0, ((class529) super.field1786).field4188, var1, this.field162, var2, this.field164, this.field158, 0, var4, var3, this, this.field153, var5);
			}
			return method119(0, 0, ((class529) super.field1786).field4188, var1, this.field162, var2, this.field156, 0, var4, var3, this, this.field153, var5);
		}
	}

	boolean method149() {
		int var1 = this.field154;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method142(var1, this.field155);
			var3 = method109(var1, this.field155);
		}
		if (this.field156 == var1 && this.field164 == var2 && this.field158 == var3) {
			if (this.field154 == Integer.MIN_VALUE) {
				this.field154 = 0;
				this.field158 = 0;
				this.field164 = 0;
				this.field156 = 0;
				this.method318();
				return true;
			} else {
				this.method150();
				return false;
			}
		} else {
			if (this.field156 < var1) {
				this.field152 = 1;
				this.field163 = var1 - this.field156;
			} else if (this.field156 > var1) {
				this.field152 = -1;
				this.field163 = this.field156 - var1;
			} else {
				this.field152 = 0;
			}
			if (this.field164 < var2) {
				this.field157 = 1;
				if (this.field163 == 0 || this.field163 > var2 - this.field164) {
					this.field163 = var2 - this.field164;
				}
			} else if (this.field164 > var2) {
				this.field157 = -1;
				if (this.field163 == 0 || this.field163 > this.field164 - var2) {
					this.field163 = this.field164 - var2;
				}
			} else {
				this.field157 = 0;
			}
			if (this.field158 < var3) {
				this.field166 = 1;
				if (this.field163 == 0 || this.field163 > var3 - this.field158) {
					this.field163 = var3 - this.field158;
				}
			} else if (this.field158 > var3) {
				this.field166 = -1;
				if (this.field163 == 0 || this.field163 > this.field158 - var3) {
					this.field163 = this.field158 - var3;
				}
			} else {
				this.field166 = 0;
			}
			return false;
		}
	}

	static int method142(int var0, int var1) {
		return var1 < 0 ? var0 : (int) ((double) var0 * Math.sqrt((double) (16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	static int method109(int var0, int var1) {
		return var1 < 0 ? -var0 : (int) ((double) var0 * Math.sqrt((double) var1 * 1.220703125E-4D) + 0.5D);
	}

	public static class32 method147(class529 var0, int var1, int var2) {
		return var0.field4188 != null && var0.field4188.length != 0 ? new class32(var0, (int) ((long) var0.field4190 * 256L * (long) 100 / (long) (class537.field4217 * 100)), var2 << 6) : null;
	}

	public static class32 method112(class529 var0, int var1, int var2, int var3) {
		return var0.field4188 != null && var0.field4188.length != 0 ? new class32(var0, var1, var2, var3) : null;
	}

	static int method111(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class32 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}
		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}
		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}
		var8.field162 = var2 << 8;
		return var3;
	}

	static int method131(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class32 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}
		var4 <<= 1;
		var7 <<= 1;
		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}
		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}
		var10.field162 = var3 << 8;
		return var4 >> 1;
	}

	static int method132(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class32 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}
		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}
		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}
		var8.field162 = var2 << 8;
		return var3;
	}

	static int method152(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class32 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var3 - (var9 - 1)) > var8) {
			var7 = var8;
		}
		var4 <<= 1;
		var7 <<= 1;
		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}
		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}
		var10.field162 = var3 << 8;
		return var4 >> 1;
	}

	static int method133(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class32 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 257) / var11) > var8) {
			var7 = var8;
		}
		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}
		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11 - 1) / var11) > var8) {
			var7 = var8;
		}
		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}
		var10.field162 = var4;
		return var5;
	}

	static int method134(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class32 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}
		var5 <<= 1;
		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}
		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}
		var8 <<= 1;
		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}
		var11.field162 = var4;
		return var5 >> 1;
	}

	static int method119(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class32 var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var9 + 256 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}
		if (var11 == 0 || (var7 = var5 + (var9 - var4 + var11) / var11) > var8) {
			var7 = var8;
		}
		var0 = var12;
		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}
		var10.field162 = var4;
		return var5;
	}

	static int method135(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class32 var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}
		var5 <<= 1;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var14 << 8) + (var2[var1] - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}
		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}
		var8 <<= 1;
		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}
		var11.field162 = var4;
		return var5 >> 1;
	}

	static int method136(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class32 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}
		var9.field164 += var9.field157 * (var6 - var3);
		var9.field158 += var9.field166 * (var6 - var3);
		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}
		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}
		var9.field156 = var4 >> 2;
		var9.field162 = var2 << 8;
		return var3;
	}

	static int method137(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class32 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}
		var12.field156 += var12.field152 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;
		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}
		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}
		var12.field164 = var5 >> 2;
		var12.field158 = var6 >> 2;
		var12.field162 = var3 << 8;
		return var4 >> 1;
	}

	static int method138(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class32 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}
		var9.field164 += var9.field157 * (var6 - var3);
		var9.field158 += var9.field166 * (var6 - var3);
		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}
		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}
		var9.field156 = var4 >> 2;
		var9.field162 = var2 << 8;
		return var3;
	}

	static int method139(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class32 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}
		var12.field156 += var12.field152 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;
		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}
		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}
		var12.field164 = var5 >> 2;
		var12.field158 = var6 >> 2;
		var12.field162 = var3 << 8;
		return var4 >> 1;
	}

	static int method140(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class32 var11, int var12, int var13) {
		var11.field164 -= var11.field157 * var5;
		var11.field158 -= var11.field166 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}
		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}
		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}
		var11.field164 += var11.field157 * var5;
		var11.field158 += var11.field166 * var5;
		var11.field156 = var6;
		var11.field162 = var4;
		return var5;
	}

	static int method141(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class32 var13, int var14, int var15) {
		var13.field156 -= var13.field152 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}
		var5 <<= 1;
		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var2[var1 + 1] - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}
		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}
		var10 <<= 1;
		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}
		var5 >>= 1;
		var13.field156 += var13.field152 * var5;
		var13.field164 = var6;
		var13.field158 = var7;
		var13.field162 = var4;
		return var5;
	}

	static int method151(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class32 var11, int var12, int var13) {
		var11.field164 -= var11.field157 * var5;
		var11.field158 -= var11.field166 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}
		var0 = var13;
		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}
		var11.field164 += var11.field157 * var5;
		var11.field158 += var11.field166 * var5;
		var11.field156 = var6;
		var11.field162 = var4;
		return var5;
	}

	static int method148(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class32 var13, int var14, int var15) {
		var13.field156 -= var13.field152 * var5;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}
		var5 <<= 1;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var16 << 8) + (var2[var1] - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}
		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}
		var10 <<= 1;
		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var2[var4 >> 8] - var1) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}
		var5 >>= 1;
		var13.field156 += var13.field152 * var5;
		var13.field164 = var6;
		var13.field158 = var7;
		var13.field162 = var4;
		return var5;
	}
}
