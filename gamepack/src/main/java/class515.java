public class class515 extends class372 {
	boolean field4206;
	int field4193;
	int field4194;
	int field4195;
	int field4196;
	int field4197;
	int field4198;
	int field4199;
	int field4200;
	int field4201;
	int field4202;
	int field4203;
	int field4204;
	int field4205;
	int field4207;

	class515(class352 var1, int var2, int var3) {
		super.field3110 = var1;
		this.field4201 = var1.field3011;
		this.field4202 = var1.field3009;
		this.field4206 = var1.field3013;
		this.field4194 = var2;
		this.field4195 = var3;
		this.field4196 = 8192;
		this.field4203 = 0;
		this.method2480();
	}

	class515(class352 var1, int var2, int var3, int var4) {
		super.field3110 = var1;
		this.field4201 = var1.field3011;
		this.field4202 = var1.field3009;
		this.field4206 = var1.field3013;
		this.field4194 = var2;
		this.field4195 = var3;
		this.field4196 = var4;
		this.field4203 = 0;
		this.method2480();
	}

	int method1979() {
		int var1 = this.field4197 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.field4200 == 0) {
			var1 -= var1 * this.field4203 / (((class352)super.field3110).field3010.length << 8);
		} else if (this.field4200 >= 0) {
			var1 -= var1 * this.field4201 / ((class352)super.field3110).field3010.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	void method2480() {
		this.field4197 = this.field4195;
		this.field4205 = method2472(this.field4195, this.field4196);
		this.field4199 = method2444(this.field4195, this.field4196);
	}

	public synchronized void method2447(int var1) {
		this.field4200 = var1;
	}

	public synchronized void method2448(int var1) {
		this.method2449(var1 << 6, this.method2451());
	}

	synchronized void method2483(int var1) {
		this.method2449(var1, this.method2451());
	}

	synchronized void method2449(int var1, int var2) {
		this.field4195 = var1;
		this.field4196 = var2;
		this.field4204 = 0;
		this.method2480();
	}

	public synchronized int method2450() {
		return this.field4195 == Integer.MIN_VALUE ? 0 : this.field4195;
	}

	public synchronized int method2451() {
		return this.field4196 < 0 ? -1 : this.field4196;
	}

	public synchronized void method2452(int var1) {
		int var2 = ((class352)super.field3110).field3010.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field4203 = var1;
	}

	public synchronized void method2476(boolean var1) {
		this.field4194 = (this.field4194 ^ this.field4194 >> 31) + (this.field4194 >>> 31);
		if (var1) {
			this.field4194 = -this.field4194;
		}

	}

	void method2473() {
		if (this.field4204 != 0) {
			if (this.field4195 == Integer.MIN_VALUE) {
				this.field4195 = 0;
			}

			this.field4204 = 0;
			this.method2480();
		}

	}

	public synchronized void method2475(int var1, int var2) {
		this.method2459(var1, var2, this.method2451());
	}

	public synchronized void method2459(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method2449(var2, var3);
		} else {
			int var4 = method2472(var2, var3);
			int var5 = method2444(var2, var3);
			if (this.field4205 == var4 && this.field4199 == var5) {
				this.field4204 = 0;
			} else {
				int var6 = var2 - this.field4197;
				if (this.field4197 - var2 > var6) {
					var6 = this.field4197 - var2;
				}

				if (var4 - this.field4205 > var6) {
					var6 = var4 - this.field4205;
				}

				if (this.field4205 - var4 > var6) {
					var6 = this.field4205 - var4;
				}

				if (var5 - this.field4199 > var6) {
					var6 = var5 - this.field4199;
				}

				if (this.field4199 - var5 > var6) {
					var6 = this.field4199 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field4204 = var1;
				this.field4195 = var2;
				this.field4196 = var3;
				this.field4193 = (var2 - this.field4197) / var1;
				this.field4198 = (var4 - this.field4205) / var1;
				this.field4207 = (var5 - this.field4199) / var1;
			}
		}
	}

	public synchronized void method2454(int var1) {
		if (var1 == 0) {
			this.method2483(0);
			this.method2269();
		} else if (this.field4205 == 0 && this.field4199 == 0) {
			this.field4204 = 0;
			this.field4195 = 0;
			this.field4197 = 0;
			this.method2269();
		} else {
			int var2 = -this.field4197;
			if (this.field4197 > var2) {
				var2 = this.field4197;
			}

			if (-this.field4205 > var2) {
				var2 = -this.field4205;
			}

			if (this.field4205 > var2) {
				var2 = this.field4205;
			}

			if (-this.field4199 > var2) {
				var2 = -this.field4199;
			}

			if (this.field4199 > var2) {
				var2 = this.field4199;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field4204 = var1;
			this.field4195 = Integer.MIN_VALUE;
			this.field4193 = -this.field4197 / var1;
			this.field4198 = -this.field4205 / var1;
			this.field4207 = -this.field4199 / var1;
		}
	}

	public synchronized void method2455(int var1) {
		if (this.field4194 < 0) {
			this.field4194 = -var1;
		} else {
			this.field4194 = var1;
		}

	}

	public synchronized int method2456() {
		return this.field4194 < 0 ? -this.field4194 : this.field4194;
	}

	public boolean method2457() {
		return this.field4203 < 0 || this.field4203 >= ((class352)super.field3110).field3010.length << 8;
	}

	public boolean method2458() {
		return this.field4204 != 0;
	}

	protected class372 method1980() {
		return null;
	}

	protected class372 method1981() {
		return null;
	}

	protected int method1978() {
		return this.field4195 == 0 && this.field4204 == 0 ? 0 : 1;
	}

	public synchronized void method1983(int[] var1, int var2, int var3) {
		if (this.field4195 == 0 && this.field4204 == 0) {
			this.method1982(var3);
		} else {
			class352 var4 = (class352)super.field3110;
			int var5 = this.field4201 << 8;
			int var6 = this.field4202 << 8;
			int var7 = var4.field3010.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.field4200 = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field4203 < 0) {
				if (this.field4194 <= 0) {
					this.method2473();
					this.method2269();
					return;
				}

				this.field4203 = 0;
			}

			if (this.field4203 >= var7) {
				if (this.field4194 >= 0) {
					this.method2473();
					this.method2269();
					return;
				}

				this.field4203 = var7 - 1;
			}

			if (this.field4200 < 0) {
				if (this.field4206) {
					if (this.field4194 < 0) {
						var9 = this.method2460(var1, var2, var5, var3, var4.field3010[this.field4201]);
						if (this.field4203 >= var5) {
							return;
						}

						this.field4203 = var5 + var5 - 1 - this.field4203;
						this.field4194 = -this.field4194;
					}

					while (true) {
						var9 = this.method2474(var1, var9, var6, var3, var4.field3010[this.field4202 - 1]);
						if (this.field4203 < var6) {
							return;
						}

						this.field4203 = var6 + var6 - 1 - this.field4203;
						this.field4194 = -this.field4194;
						var9 = this.method2460(var1, var9, var5, var3, var4.field3010[this.field4201]);
						if (this.field4203 >= var5) {
							return;
						}

						this.field4203 = var5 + var5 - 1 - this.field4203;
						this.field4194 = -this.field4194;
					}
				} else if (this.field4194 < 0) {
					while (true) {
						var9 = this.method2460(var1, var9, var5, var3, var4.field3010[this.field4202 - 1]);
						if (this.field4203 >= var5) {
							return;
						}

						this.field4203 = var6 - 1 - (var6 - 1 - this.field4203) % var8;
					}
				} else {
					while (true) {
						var9 = this.method2474(var1, var9, var6, var3, var4.field3010[this.field4201]);
						if (this.field4203 < var6) {
							return;
						}

						this.field4203 = var5 + (this.field4203 - var5) % var8;
					}
				}
			} else {
				if (this.field4200 > 0) {
					if (this.field4206) {
						label131: {
							if (this.field4194 < 0) {
								var9 = this.method2460(var1, var2, var5, var3, var4.field3010[this.field4201]);
								if (this.field4203 >= var5) {
									return;
								}

								this.field4203 = var5 + var5 - 1 - this.field4203;
								this.field4194 = -this.field4194;
								if (--this.field4200 == 0) {
									break label131;
								}
							}

							do {
								var9 = this.method2474(var1, var9, var6, var3, var4.field3010[this.field4202 - 1]);
								if (this.field4203 < var6) {
									return;
								}

								this.field4203 = var6 + var6 - 1 - this.field4203;
								this.field4194 = -this.field4194;
								if (--this.field4200 == 0) {
									break;
								}

								var9 = this.method2460(var1, var9, var5, var3, var4.field3010[this.field4201]);
								if (this.field4203 >= var5) {
									return;
								}

								this.field4203 = var5 + var5 - 1 - this.field4203;
								this.field4194 = -this.field4194;
							} while(--this.field4200 != 0);
						}
					} else {
						int var10;
						if (this.field4194 < 0) {
							while (true) {
								var9 = this.method2460(var1, var9, var5, var3, var4.field3010[this.field4202 - 1]);
								if (this.field4203 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field4203) / var8;
								if (var10 >= this.field4200) {
									this.field4203 += var8 * this.field4200;
									this.field4200 = 0;
									break;
								}

								this.field4203 += var8 * var10;
								this.field4200 -= var10;
							}
						} else {
							while (true) {
								var9 = this.method2474(var1, var9, var6, var3, var4.field3010[this.field4201]);
								if (this.field4203 < var6) {
									return;
								}

								var10 = (this.field4203 - var5) / var8;
								if (var10 >= this.field4200) {
									this.field4203 -= var8 * this.field4200;
									this.field4200 = 0;
									break;
								}

								this.field4203 -= var8 * var10;
								this.field4200 -= var10;
							}
						}
					}
				}

				if (this.field4194 < 0) {
					this.method2460(var1, var9, 0, var3, 0);
					if (this.field4203 < 0) {
						this.field4203 = -1;
						this.method2473();
						this.method2269();
					}
				} else {
					this.method2474(var1, var9, var7, var3, 0);
					if (this.field4203 >= var7) {
						this.field4203 = var7;
						this.method2473();
						this.method2269();
					}
				}

			}
		}
	}

	public synchronized void method1982(int var1) {
		if (this.field4204 > 0) {
			if (var1 >= this.field4204) {
				if (this.field4195 == Integer.MIN_VALUE) {
					this.field4195 = 0;
					this.field4199 = 0;
					this.field4205 = 0;
					this.field4197 = 0;
					this.method2269();
					var1 = this.field4204;
				}

				this.field4204 = 0;
				this.method2480();
			} else {
				this.field4197 += this.field4193 * var1;
				this.field4205 += this.field4198 * var1;
				this.field4199 += this.field4207 * var1;
				this.field4204 -= var1;
			}
		}

		class352 var2 = (class352)super.field3110;
		int var3 = this.field4201 << 8;
		int var4 = this.field4202 << 8;
		int var5 = var2.field3010.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.field4200 = 0;
		}

		if (this.field4203 < 0) {
			if (this.field4194 <= 0) {
				this.method2473();
				this.method2269();
				return;
			}

			this.field4203 = 0;
		}

		if (this.field4203 >= var5) {
			if (this.field4194 >= 0) {
				this.method2473();
				this.method2269();
				return;
			}

			this.field4203 = var5 - 1;
		}

		this.field4203 += this.field4194 * var1;
		if (this.field4200 < 0) {
			if (!this.field4206) {
				if (this.field4194 < 0) {
					if (this.field4203 >= var3) {
						return;
					}

					this.field4203 = var4 - 1 - (var4 - 1 - this.field4203) % var6;
				} else {
					if (this.field4203 < var4) {
						return;
					}

					this.field4203 = var3 + (this.field4203 - var3) % var6;
				}

			} else {
				if (this.field4194 < 0) {
					if (this.field4203 >= var3) {
						return;
					}

					this.field4203 = var3 + var3 - 1 - this.field4203;
					this.field4194 = -this.field4194;
				}

				while (this.field4203 >= var4) {
					this.field4203 = var4 + var4 - 1 - this.field4203;
					this.field4194 = -this.field4194;
					if (this.field4203 >= var3) {
						return;
					}

					this.field4203 = var3 + var3 - 1 - this.field4203;
					this.field4194 = -this.field4194;
				}

			}
		} else {
			if (this.field4200 > 0) {
				if (this.field4206) {
					label120: {
						if (this.field4194 < 0) {
							if (this.field4203 >= var3) {
								return;
							}

							this.field4203 = var3 + var3 - 1 - this.field4203;
							this.field4194 = -this.field4194;
							if (--this.field4200 == 0) {
								break label120;
							}
						}

						do {
							if (this.field4203 < var4) {
								return;
							}

							this.field4203 = var4 + var4 - 1 - this.field4203;
							this.field4194 = -this.field4194;
							if (--this.field4200 == 0) {
								break;
							}

							if (this.field4203 >= var3) {
								return;
							}

							this.field4203 = var3 + var3 - 1 - this.field4203;
							this.field4194 = -this.field4194;
						} while(--this.field4200 != 0);
					}
				} else {
					label152: {
						int var7;
						if (this.field4194 < 0) {
							if (this.field4203 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field4203) / var6;
							if (var7 >= this.field4200) {
								this.field4203 += var6 * this.field4200;
								this.field4200 = 0;
								break label152;
							}

							this.field4203 += var6 * var7;
							this.field4200 -= var7;
						} else {
							if (this.field4203 < var4) {
								return;
							}

							var7 = (this.field4203 - var3) / var6;
							if (var7 >= this.field4200) {
								this.field4203 -= var6 * this.field4200;
								this.field4200 = 0;
								break label152;
							}

							this.field4203 -= var6 * var7;
							this.field4200 -= var7;
						}

						return;
					}
				}
			}

			if (this.field4194 < 0) {
				if (this.field4203 < 0) {
					this.field4203 = -1;
					this.method2473();
					this.method2269();
				}
			} else if (this.field4203 >= var5) {
				this.field4203 = var5;
				this.method2473();
				this.method2269();
			}

		}
	}

	int method2474(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field4204 > 0) {
				int var6 = var2 + this.field4204;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field4204 += var2;
				if (this.field4194 == 256 && (this.field4203 & 255) == 0) {
					if (class337.field2949) {
						var2 = method2467(0, ((class352)super.field3110).field3010, var1, this.field4203, var2, this.field4205, this.field4199, this.field4198, this.field4207, 0, var6, var3, this);
					} else {
						var2 = method2466(((class352)super.field3110).field3010, var1, this.field4203, var2, this.field4197, this.field4193, 0, var6, var3, this);
					}
				} else if (class337.field2949) {
					var2 = method2471(0, 0, ((class352)super.field3110).field3010, var1, this.field4203, var2, this.field4205, this.field4199, this.field4198, this.field4207, 0, var6, var3, this, this.field4194, var5);
				} else {
					var2 = method2470(0, 0, ((class352)super.field3110).field3010, var1, this.field4203, var2, this.field4197, this.field4193, 0, var6, var3, this, this.field4194, var5);
				}

				this.field4204 -= var2;
				if (this.field4204 != 0) {
					return var2;
				}

				if (!this.method2479()) {
					continue;
				}

				return var4;
			}

			if (this.field4194 == 256 && (this.field4203 & 255) == 0) {
				if (class337.field2949) {
					return method2461(0, ((class352)super.field3110).field3010, var1, this.field4203, var2, this.field4205, this.field4199, 0, var4, var3, this);
				}

				return method2445(((class352)super.field3110).field3010, var1, this.field4203, var2, this.field4197, 0, var4, var3, this);
			}

			if (class337.field2949) {
				return method2464(0, 0, ((class352)super.field3110).field3010, var1, this.field4203, var2, this.field4205, this.field4199, 0, var4, var3, this, this.field4194, var5);
			}

			return method2463(0, 0, ((class352)super.field3110).field3010, var1, this.field4203, var2, this.field4197, 0, var4, var3, this, this.field4194, var5);
		}
	}

	int method2460(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field4204 > 0) {
				int var6 = var2 + this.field4204;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field4204 += var2;
				if (this.field4194 == -256 && (this.field4203 & 255) == 0) {
					if (class337.field2949) {
						var2 = method2469(0, ((class352)super.field3110).field3010, var1, this.field4203, var2, this.field4205, this.field4199, this.field4198, this.field4207, 0, var6, var3, this);
					} else {
						var2 = method2468(((class352)super.field3110).field3010, var1, this.field4203, var2, this.field4197, this.field4193, 0, var6, var3, this);
					}
				} else if (class337.field2949) {
					var2 = method2478(0, 0, ((class352)super.field3110).field3010, var1, this.field4203, var2, this.field4205, this.field4199, this.field4198, this.field4207, 0, var6, var3, this, this.field4194, var5);
				} else {
					var2 = method2481(0, 0, ((class352)super.field3110).field3010, var1, this.field4203, var2, this.field4197, this.field4193, 0, var6, var3, this, this.field4194, var5);
				}

				this.field4204 -= var2;
				if (this.field4204 != 0) {
					return var2;
				}

				if (!this.method2479()) {
					continue;
				}

				return var4;
			}

			if (this.field4194 == -256 && (this.field4203 & 255) == 0) {
				if (class337.field2949) {
					return method2482(0, ((class352)super.field3110).field3010, var1, this.field4203, var2, this.field4205, this.field4199, 0, var4, var3, this);
				}

				return method2462(((class352)super.field3110).field3010, var1, this.field4203, var2, this.field4197, 0, var4, var3, this);
			}

			if (class337.field2949) {
				return method2465(0, 0, ((class352)super.field3110).field3010, var1, this.field4203, var2, this.field4205, this.field4199, 0, var4, var3, this, this.field4194, var5);
			}

			return method2453(0, 0, ((class352)super.field3110).field3010, var1, this.field4203, var2, this.field4197, 0, var4, var3, this, this.field4194, var5);
		}
	}

	boolean method2479() {
		int var1 = this.field4195;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method2472(var1, this.field4196);
			var3 = method2444(var1, this.field4196);
		}

		if (this.field4197 == var1 && this.field4205 == var2 && this.field4199 == var3) {
			if (this.field4195 == Integer.MIN_VALUE) {
				this.field4195 = 0;
				this.field4199 = 0;
				this.field4205 = 0;
				this.field4197 = 0;
				this.method2269();
				return true;
			} else {
				this.method2480();
				return false;
			}
		} else {
			if (this.field4197 < var1) {
				this.field4193 = 1;
				this.field4204 = var1 - this.field4197;
			} else if (this.field4197 > var1) {
				this.field4193 = -1;
				this.field4204 = this.field4197 - var1;
			} else {
				this.field4193 = 0;
			}

			if (this.field4205 < var2) {
				this.field4198 = 1;
				if (this.field4204 == 0 || this.field4204 > var2 - this.field4205) {
					this.field4204 = var2 - this.field4205;
				}
			} else if (this.field4205 > var2) {
				this.field4198 = -1;
				if (this.field4204 == 0 || this.field4204 > this.field4205 - var2) {
					this.field4204 = this.field4205 - var2;
				}
			} else {
				this.field4198 = 0;
			}

			if (this.field4199 < var3) {
				this.field4207 = 1;
				if (this.field4204 == 0 || this.field4204 > var3 - this.field4199) {
					this.field4204 = var3 - this.field4199;
				}
			} else if (this.field4199 > var3) {
				this.field4207 = -1;
				if (this.field4204 == 0 || this.field4204 > this.field4199 - var3) {
					this.field4204 = this.field4199 - var3;
				}
			} else {
				this.field4207 = 0;
			}

			return false;
		}
	}

	static int method2472(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	static int method2444(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	public static class515 method2477(class352 var0, int var1, int var2) {
		return var0.field3010 != null && var0.field3010.length != 0 ? new class515(var0, (int)((long)var0.field3012 * 256L * (long)var1 / (long)(class337.field2934 * 100)), var2 << 6) : null;
	}

	public static class515 method2446(class352 var0, int var1, int var2, int var3) {
		return var0.field3010 != null && var0.field3010.length != 0 ? new class515(var0, var1, var2, var3) : null;
	}

	static int method2445(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class515 var8) {
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

		var8.field4203 = var2 << 8;
		return var3;
	}

	static int method2461(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class515 var10) {
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

		var10.field4203 = var3 << 8;
		return var4 >> 1;
	}

	static int method2462(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class515 var8) {
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

		var8.field4203 = var2 << 8;
		return var3;
	}

	static int method2482(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class515 var10) {
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

		var10.field4203 = var3 << 8;
		return var4 >> 1;
	}

	static int method2463(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class515 var10, int var11, int var12) {
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

		var10.field4203 = var4;
		return var5;
	}

	static int method2464(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class515 var11, int var12, int var13) {
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

		var11.field4203 = var4;
		return var5 >> 1;
	}

	static int method2453(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class515 var10, int var11, int var12) {
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

		var10.field4203 = var4;
		return var5;
	}

	static int method2465(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class515 var11, int var12, int var13) {
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

		var11.field4203 = var4;
		return var5 >> 1;
	}

	static int method2466(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class515 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field4205 += var9.field4198 * (var6 - var3);
		var9.field4199 += var9.field4207 * (var6 - var3);

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

		var9.field4197 = var4 >> 2;
		var9.field4203 = var2 << 8;
		return var3;
	}

	static int method2467(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class515 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}

		var12.field4197 += var12.field4193 * (var9 - var4);
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

		var12.field4205 = var5 >> 2;
		var12.field4199 = var6 >> 2;
		var12.field4203 = var3 << 8;
		return var4 >> 1;
	}

	static int method2468(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class515 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field4205 += var9.field4198 * (var6 - var3);
		var9.field4199 += var9.field4207 * (var6 - var3);

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

		var9.field4197 = var4 >> 2;
		var9.field4203 = var2 << 8;
		return var3;
	}

	static int method2469(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class515 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field4197 += var12.field4193 * (var9 - var4);
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

		var12.field4205 = var5 >> 2;
		var12.field4199 = var6 >> 2;
		var12.field4203 = var3 << 8;
		return var4 >> 1;
	}

	static int method2470(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class515 var11, int var12, int var13) {
		var11.field4205 -= var11.field4198 * var5;
		var11.field4199 -= var11.field4207 * var5;
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

		var11.field4205 += var11.field4198 * var5;
		var11.field4199 += var11.field4207 * var5;
		var11.field4197 = var6;
		var11.field4203 = var4;
		return var5;
	}

	static int method2471(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class515 var13, int var14, int var15) {
		var13.field4197 -= var13.field4193 * var5;
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
		var13.field4197 += var13.field4193 * var5;
		var13.field4205 = var6;
		var13.field4199 = var7;
		var13.field4203 = var4;
		return var5;
	}

	static int method2481(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class515 var11, int var12, int var13) {
		var11.field4205 -= var11.field4198 * var5;
		var11.field4199 -= var11.field4207 * var5;
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

		var11.field4205 += var11.field4198 * var5;
		var11.field4199 += var11.field4207 * var5;
		var11.field4197 = var6;
		var11.field4203 = var4;
		return var5;
	}

	static int method2478(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class515 var13, int var14, int var15) {
		var13.field4197 -= var13.field4193 * var5;
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
		var13.field4197 += var13.field4193 * var5;
		var13.field4205 = var6;
		var13.field4199 = var7;
		var13.field4203 = var4;
		return var5;
	}
}
