import io.runebox.internal.deobfuscator.includes.ObfInfo;

@ObfInfo(name = "bn")
public class class28 extends class449 {
	@ObfInfo(name = "ad", desc = "Z")
	boolean field464;
	@ObfInfo(name = "al", desc = "I")
	int field451;
	@ObfInfo(name = "ae", desc = "I")
	int field452;
	@ObfInfo(name = "ao", desc = "I")
	int field453;
	@ObfInfo(name = "at", desc = "I")
	int field454;
	@ObfInfo(name = "ac", desc = "I")
	int field455;
	@ObfInfo(name = "an", desc = "I")
	int field456;
	@ObfInfo(name = "az", desc = "I")
	int field457;
	@ObfInfo(name = "ap", desc = "I")
	int field458;
	@ObfInfo(name = "aa", desc = "I")
	int field459;
	@ObfInfo(name = "af", desc = "I")
	int field460;
	@ObfInfo(name = "au", desc = "I")
	int field461;
	@ObfInfo(name = "aq", desc = "I")
	int field462;
	@ObfInfo(name = "ai", desc = "I")
	int field463;
	@ObfInfo(name = "ar", desc = "I")
	int field465;

	@ObfInfo(name = "<init>", desc = "(Lbu;II)V")
	class28(class62 var1, int var2, int var3) {
		super.field3389 = var1;
		this.field459 = var1.field739;
		this.field460 = var1.field737;
		this.field464 = var1.field741;
		this.field452 = var2;
		this.field453 = var3;
		this.field454 = 8192;
		this.field461 = 0;
		this.method407();
	}

	@ObfInfo(name = "<init>", desc = "(Lbu;III)V")
	class28(class62 var1, int var2, int var3, int var4) {
		super.field3389 = var1;
		this.field459 = var1.field739;
		this.field460 = var1.field737;
		this.field464 = var1.field741;
		this.field452 = var2;
		this.field453 = var3;
		this.field454 = var4;
		this.field461 = 0;
		this.method407();
	}

	@ObfInfo(name = "br", desc = "()I")
	int method2353() {
		int var1 = this.field455 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.field458 == 0) {
			var1 -= var1 * this.field461 / (((class62)super.field3389).field738.length << 8);
		} else if (this.field458 >= 0) {
			var1 -= var1 * this.field459 / ((class62)super.field3389).field738.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfInfo(name = "ac", desc = "()V")
	void method407() {
		this.field455 = this.field453;
		this.field463 = method399(this.field453, this.field454);
		this.field457 = method366(this.field453, this.field454);
	}

	@ObfInfo(name = "af", desc = "(I)V")
	public synchronized void method370(int var1) {
		this.field458 = var1;
	}

	@ObfInfo(name = "aq", desc = "(I)V")
	public synchronized void method371(int var1) {
		this.method372(var1 << 6, this.method374());
	}

	@ObfInfo(name = "al", desc = "(I)V")
	synchronized void method410(int var1) {
		this.method372(var1, this.method374());
	}

	@ObfInfo(name = "an", desc = "(II)V")
	synchronized void method372(int var1, int var2) {
		this.field453 = var1;
		this.field454 = var2;
		this.field462 = 0;
		this.method407();
	}

	@ObfInfo(name = "ar", desc = "()I")
	public synchronized int method373() {
		return this.field453 == Integer.MIN_VALUE ? 0 : this.field453;
	}

	@ObfInfo(name = "ab", desc = "()I")
	public synchronized int method374() {
		return this.field454 < 0 ? -1 : this.field454;
	}

	@ObfInfo(name = "ag", desc = "(I)V")
	public synchronized void method375(int var1) {
		int var2 = ((class62)super.field3389).field738.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field461 = var1;
	}

	@ObfInfo(name = "am", desc = "(Z)V")
	public synchronized void method403(boolean var1) {
		this.field452 = (this.field452 ^ this.field452 >> 31) + (this.field452 >>> 31);
		if (var1) {
			this.field452 = -this.field452;
		}

	}

	@ObfInfo(name = "ax", desc = "()V")
	void method400() {
		if (this.field462 != 0) {
			if (this.field453 == Integer.MIN_VALUE) {
				this.field453 = 0;
			}

			this.field462 = 0;
			this.method407();
		}

	}

	@ObfInfo(name = "ah", desc = "(II)V")
	public synchronized void method402(int var1, int var2) {
		this.method385(var1, var2, this.method374());
	}

	@ObfInfo(name = "as", desc = "(III)V")
	public synchronized void method385(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method372(var2, var3);
		} else {
			int var4 = method399(var2, var3);
			int var5 = method366(var2, var3);
			if (this.field463 == var4 && this.field457 == var5) {
				this.field462 = 0;
			} else {
				int var6 = var2 - this.field455;
				if (this.field455 - var2 > var6) {
					var6 = this.field455 - var2;
				}

				if (var4 - this.field463 > var6) {
					var6 = var4 - this.field463;
				}

				if (this.field463 - var4 > var6) {
					var6 = this.field463 - var4;
				}

				if (var5 - this.field457 > var6) {
					var6 = var5 - this.field457;
				}

				if (this.field457 - var5 > var6) {
					var6 = this.field457 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field462 = var1;
				this.field453 = var2;
				this.field454 = var3;
				this.field451 = (var2 - this.field455) / var1;
				this.field456 = (var4 - this.field463) / var1;
				this.field465 = (var5 - this.field457) / var1;
			}
		}
	}

	@ObfInfo(name = "ay", desc = "(I)V")
	public synchronized void method377(int var1) {
		if (var1 == 0) {
			this.method410(0);
			this.method907();
		} else if (this.field463 == 0 && this.field457 == 0) {
			this.field462 = 0;
			this.field453 = 0;
			this.field455 = 0;
			this.method907();
		} else {
			int var2 = -this.field455;
			if (this.field455 > var2) {
				var2 = this.field455;
			}

			if (-this.field463 > var2) {
				var2 = -this.field463;
			}

			if (this.field463 > var2) {
				var2 = this.field463;
			}

			if (-this.field457 > var2) {
				var2 = -this.field457;
			}

			if (this.field457 > var2) {
				var2 = this.field457;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field462 = var1;
			this.field453 = Integer.MIN_VALUE;
			this.field451 = -this.field455 / var1;
			this.field456 = -this.field463 / var1;
			this.field465 = -this.field457 / var1;
		}
	}

	@ObfInfo(name = "aj", desc = "(I)V")
	public synchronized void method378(int var1) {
		if (this.field452 < 0) {
			this.field452 = -var1;
		} else {
			this.field452 = var1;
		}

	}

	@ObfInfo(name = "av", desc = "()I")
	public synchronized int method379() {
		return this.field452 < 0 ? -this.field452 : this.field452;
	}

	@ObfInfo(name = "aw", desc = "()Z")
	public boolean method380() {
		return this.field461 < 0 || this.field461 >= ((class62)super.field3389).field738.length << 8;
	}

	@ObfInfo(name = "ak", desc = "()Z")
	public boolean method381() {
		return this.field462 != 0;
	}

	@ObfInfo(name = "ai", desc = "()Lbw;")
	protected class449 method2354() {
		return null;
	}

	@ObfInfo(name = "az", desc = "()Lbw;")
	protected class449 method2355() {
		return null;
	}

	@ObfInfo(name = "ap", desc = "()I")
	protected int method2352() {
		return this.field453 == 0 && this.field462 == 0 ? 0 : 1;
	}

	@ObfInfo(name = "aa", desc = "([III)V")
	public synchronized void method2357(int[] var1, int var2, int var3) {
		if (this.field453 == 0 && this.field462 == 0) {
			this.method2356(var3);
		} else {
			class62 var4 = (class62)super.field3389;
			int var5 = this.field459 << 8;
			int var6 = this.field460 << 8;
			int var7 = var4.field738.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.field458 = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field461 < 0) {
				if (this.field452 <= 0) {
					this.method400();
					this.method907();
					return;
				}

				this.field461 = 0;
			}

			if (this.field461 >= var7) {
				if (this.field452 >= 0) {
					this.method400();
					this.method907();
					return;
				}

				this.field461 = var7 - 1;
			}

			if (this.field458 < 0) {
				if (this.field464) {
					if (this.field452 < 0) {
						var9 = this.method387(var1, var2, var5, var3, var4.field738[this.field459]);
						if (this.field461 >= var5) {
							return;
						}

						this.field461 = var5 + var5 - 1 - this.field461;
						this.field452 = -this.field452;
					}

					while (true) {
						var9 = this.method401(var1, var9, var6, var3, var4.field738[this.field460 - 1]);
						if (this.field461 < var6) {
							return;
						}

						this.field461 = var6 + var6 - 1 - this.field461;
						this.field452 = -this.field452;
						var9 = this.method387(var1, var9, var5, var3, var4.field738[this.field459]);
						if (this.field461 >= var5) {
							return;
						}

						this.field461 = var5 + var5 - 1 - this.field461;
						this.field452 = -this.field452;
					}
				} else if (this.field452 < 0) {
					while (true) {
						var9 = this.method387(var1, var9, var5, var3, var4.field738[this.field460 - 1]);
						if (this.field461 >= var5) {
							return;
						}

						this.field461 = var6 - 1 - (var6 - 1 - this.field461) % var8;
					}
				} else {
					while (true) {
						var9 = this.method401(var1, var9, var6, var3, var4.field738[this.field459]);
						if (this.field461 < var6) {
							return;
						}

						this.field461 = var5 + (this.field461 - var5) % var8;
					}
				}
			} else {
				if (this.field458 > 0) {
					if (this.field464) {
						label131: {
							if (this.field452 < 0) {
								var9 = this.method387(var1, var2, var5, var3, var4.field738[this.field459]);
								if (this.field461 >= var5) {
									return;
								}

								this.field461 = var5 + var5 - 1 - this.field461;
								this.field452 = -this.field452;
								if (--this.field458 == 0) {
									break label131;
								}
							}

							do {
								var9 = this.method401(var1, var9, var6, var3, var4.field738[this.field460 - 1]);
								if (this.field461 < var6) {
									return;
								}

								this.field461 = var6 + var6 - 1 - this.field461;
								this.field452 = -this.field452;
								if (--this.field458 == 0) {
									break;
								}

								var9 = this.method387(var1, var9, var5, var3, var4.field738[this.field459]);
								if (this.field461 >= var5) {
									return;
								}

								this.field461 = var5 + var5 - 1 - this.field461;
								this.field452 = -this.field452;
							} while(--this.field458 != 0);
						}
					} else {
						int var10;
						if (this.field452 < 0) {
							while (true) {
								var9 = this.method387(var1, var9, var5, var3, var4.field738[this.field460 - 1]);
								if (this.field461 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field461) / var8;
								if (var10 >= this.field458) {
									this.field461 += var8 * this.field458;
									this.field458 = 0;
									break;
								}

								this.field461 += var8 * var10;
								this.field458 -= var10;
							}
						} else {
							while (true) {
								var9 = this.method401(var1, var9, var6, var3, var4.field738[this.field459]);
								if (this.field461 < var6) {
									return;
								}

								var10 = (this.field461 - var5) / var8;
								if (var10 >= this.field458) {
									this.field461 -= var8 * this.field458;
									this.field458 = 0;
									break;
								}

								this.field461 -= var8 * var10;
								this.field458 -= var10;
							}
						}
					}
				}

				if (this.field452 < 0) {
					this.method387(var1, var9, 0, var3, 0);
					if (this.field461 < 0) {
						this.field461 = -1;
						this.method400();
						this.method907();
					}
				} else {
					this.method401(var1, var9, var7, var3, 0);
					if (this.field461 >= var7) {
						this.field461 = var7;
						this.method400();
						this.method907();
					}
				}

			}
		}
	}

	@ObfInfo(name = "ad", desc = "(I)V")
	public synchronized void method2356(int var1) {
		if (this.field462 > 0) {
			if (var1 >= this.field462) {
				if (this.field453 == Integer.MIN_VALUE) {
					this.field453 = 0;
					this.field457 = 0;
					this.field463 = 0;
					this.field455 = 0;
					this.method907();
					var1 = this.field462;
				}

				this.field462 = 0;
				this.method407();
			} else {
				this.field455 += this.field451 * var1;
				this.field463 += this.field456 * var1;
				this.field457 += this.field465 * var1;
				this.field462 -= var1;
			}
		}

		class62 var2 = (class62)super.field3389;
		int var3 = this.field459 << 8;
		int var4 = this.field460 << 8;
		int var5 = var2.field738.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.field458 = 0;
		}

		if (this.field461 < 0) {
			if (this.field452 <= 0) {
				this.method400();
				this.method907();
				return;
			}

			this.field461 = 0;
		}

		if (this.field461 >= var5) {
			if (this.field452 >= 0) {
				this.method400();
				this.method907();
				return;
			}

			this.field461 = var5 - 1;
		}

		this.field461 += this.field452 * var1;
		if (this.field458 < 0) {
			if (!this.field464) {
				if (this.field452 < 0) {
					if (this.field461 >= var3) {
						return;
					}

					this.field461 = var4 - 1 - (var4 - 1 - this.field461) % var6;
				} else {
					if (this.field461 < var4) {
						return;
					}

					this.field461 = var3 + (this.field461 - var3) % var6;
				}

			} else {
				if (this.field452 < 0) {
					if (this.field461 >= var3) {
						return;
					}

					this.field461 = var3 + var3 - 1 - this.field461;
					this.field452 = -this.field452;
				}

				while (this.field461 >= var4) {
					this.field461 = var4 + var4 - 1 - this.field461;
					this.field452 = -this.field452;
					if (this.field461 >= var3) {
						return;
					}

					this.field461 = var3 + var3 - 1 - this.field461;
					this.field452 = -this.field452;
				}

			}
		} else {
			if (this.field458 > 0) {
				if (this.field464) {
					label120: {
						if (this.field452 < 0) {
							if (this.field461 >= var3) {
								return;
							}

							this.field461 = var3 + var3 - 1 - this.field461;
							this.field452 = -this.field452;
							if (--this.field458 == 0) {
								break label120;
							}
						}

						do {
							if (this.field461 < var4) {
								return;
							}

							this.field461 = var4 + var4 - 1 - this.field461;
							this.field452 = -this.field452;
							if (--this.field458 == 0) {
								break;
							}

							if (this.field461 >= var3) {
								return;
							}

							this.field461 = var3 + var3 - 1 - this.field461;
							this.field452 = -this.field452;
						} while(--this.field458 != 0);
					}
				} else {
					label152: {
						int var7;
						if (this.field452 < 0) {
							if (this.field461 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field461) / var6;
							if (var7 >= this.field458) {
								this.field461 += var6 * this.field458;
								this.field458 = 0;
								break label152;
							}

							this.field461 += var6 * var7;
							this.field458 -= var7;
						} else {
							if (this.field461 < var4) {
								return;
							}

							var7 = (this.field461 - var3) / var6;
							if (var7 >= this.field458) {
								this.field461 -= var6 * this.field458;
								this.field458 = 0;
								break label152;
							}

							this.field461 -= var6 * var7;
							this.field458 -= var7;
						}

						return;
					}
				}
			}

			if (this.field452 < 0) {
				if (this.field461 < 0) {
					this.field461 = -1;
					this.method400();
					this.method907();
				}
			} else if (this.field461 >= var5) {
				this.field461 = var5;
				this.method400();
				this.method907();
			}

		}
	}

	@ObfInfo(name = "bh", desc = "([IIIII)I")
	int method401(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field462 > 0) {
				int var6 = var2 + this.field462;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field462 += var2;
				if (this.field452 == 256 && (this.field461 & 255) == 0) {
					if (class429.field3257) {
						var2 = method394(0, ((class62)super.field3389).field738, var1, this.field461, var2, this.field463, this.field457, this.field456, this.field465, 0, var6, var3, this);
					} else {
						var2 = method393(((class62)super.field3389).field738, var1, this.field461, var2, this.field455, this.field451, 0, var6, var3, this);
					}
				} else if (class429.field3257) {
					var2 = method398(0, 0, ((class62)super.field3389).field738, var1, this.field461, var2, this.field463, this.field457, this.field456, this.field465, 0, var6, var3, this, this.field452, var5);
				} else {
					var2 = method397(0, 0, ((class62)super.field3389).field738, var1, this.field461, var2, this.field455, this.field451, 0, var6, var3, this, this.field452, var5);
				}

				this.field462 -= var2;
				if (this.field462 != 0) {
					return var2;
				}

				if (!this.method406()) {
					continue;
				}

				return var4;
			}

			if (this.field452 == 256 && (this.field461 & 255) == 0) {
				if (class429.field3257) {
					return method388(0, ((class62)super.field3389).field738, var1, this.field461, var2, this.field463, this.field457, 0, var4, var3, this);
				}

				return method368(((class62)super.field3389).field738, var1, this.field461, var2, this.field455, 0, var4, var3, this);
			}

			if (class429.field3257) {
				return method391(0, 0, ((class62)super.field3389).field738, var1, this.field461, var2, this.field463, this.field457, 0, var4, var3, this, this.field452, var5);
			}

			return method390(0, 0, ((class62)super.field3389).field738, var1, this.field461, var2, this.field455, 0, var4, var3, this, this.field452, var5);
		}
	}

	@ObfInfo(name = "bm", desc = "([IIIII)I")
	int method387(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field462 > 0) {
				int var6 = var2 + this.field462;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field462 += var2;
				if (this.field452 == -256 && (this.field461 & 255) == 0) {
					if (class429.field3257) {
						var2 = method396(0, ((class62)super.field3389).field738, var1, this.field461, var2, this.field463, this.field457, this.field456, this.field465, 0, var6, var3, this);
					} else {
						var2 = method395(((class62)super.field3389).field738, var1, this.field461, var2, this.field455, this.field451, 0, var6, var3, this);
					}
				} else if (class429.field3257) {
					var2 = method405(0, 0, ((class62)super.field3389).field738, var1, this.field461, var2, this.field463, this.field457, this.field456, this.field465, 0, var6, var3, this, this.field452, var5);
				} else {
					var2 = method408(0, 0, ((class62)super.field3389).field738, var1, this.field461, var2, this.field455, this.field451, 0, var6, var3, this, this.field452, var5);
				}

				this.field462 -= var2;
				if (this.field462 != 0) {
					return var2;
				}

				if (!this.method406()) {
					continue;
				}

				return var4;
			}

			if (this.field452 == -256 && (this.field461 & 255) == 0) {
				if (class429.field3257) {
					return method409(0, ((class62)super.field3389).field738, var1, this.field461, var2, this.field463, this.field457, 0, var4, var3, this);
				}

				return method389(((class62)super.field3389).field738, var1, this.field461, var2, this.field455, 0, var4, var3, this);
			}

			if (class429.field3257) {
				return method392(0, 0, ((class62)super.field3389).field738, var1, this.field461, var2, this.field463, this.field457, 0, var4, var3, this, this.field452, var5);
			}

			return method376(0, 0, ((class62)super.field3389).field738, var1, this.field461, var2, this.field455, 0, var4, var3, this, this.field452, var5);
		}
	}

	@ObfInfo(name = "bf", desc = "()Z")
	boolean method406() {
		int var1 = this.field453;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method399(var1, this.field454);
			var3 = method366(var1, this.field454);
		}

		if (this.field455 == var1 && this.field463 == var2 && this.field457 == var3) {
			if (this.field453 == Integer.MIN_VALUE) {
				this.field453 = 0;
				this.field457 = 0;
				this.field463 = 0;
				this.field455 = 0;
				this.method907();
				return true;
			} else {
				this.method407();
				return false;
			}
		} else {
			if (this.field455 < var1) {
				this.field451 = 1;
				this.field462 = var1 - this.field455;
			} else if (this.field455 > var1) {
				this.field451 = -1;
				this.field462 = this.field455 - var1;
			} else {
				this.field451 = 0;
			}

			if (this.field463 < var2) {
				this.field456 = 1;
				if (this.field462 == 0 || this.field462 > var2 - this.field463) {
					this.field462 = var2 - this.field463;
				}
			} else if (this.field463 > var2) {
				this.field456 = -1;
				if (this.field462 == 0 || this.field462 > this.field463 - var2) {
					this.field462 = this.field463 - var2;
				}
			} else {
				this.field456 = 0;
			}

			if (this.field457 < var3) {
				this.field465 = 1;
				if (this.field462 == 0 || this.field462 > var3 - this.field457) {
					this.field462 = var3 - this.field457;
				}
			} else if (this.field457 > var3) {
				this.field465 = -1;
				if (this.field462 == 0 || this.field462 > this.field457 - var3) {
					this.field462 = this.field457 - var3;
				}
			} else {
				this.field465 = 0;
			}

			return false;
		}
	}

	@ObfInfo(name = "au", desc = "(II)I")
	static int method399(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfInfo(name = "ae", desc = "(II)I")
	static int method366(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfInfo(name = "ao", desc = "(Lbu;II)Lbn;")
	public static class28 method404(class62 var0, int var1, int var2) {
		return var0.field738 != null && var0.field738.length != 0 ? new class28(var0, (int)((long)var0.field740 * 256L * (long)var1 / (long)(class429.field3242 * 100)), var2 << 6) : null;
	}

	@ObfInfo(name = "at", desc = "(Lbu;III)Lbn;")
	public static class28 method369(class62 var0, int var1, int var2, int var3) {
		return var0.field738 != null && var0.field738.length != 0 ? new class28(var0, var1, var2, var3) : null;
	}

	@ObfInfo(name = "bq", desc = "([B[IIIIIIILbn;)I")
	static int method368(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class28 var8) {
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

		var8.field461 = var2 << 8;
		return var3;
	}

	@ObfInfo(name = "ba", desc = "(I[B[IIIIIIIILbn;)I")
	static int method388(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class28 var10) {
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

		var10.field461 = var3 << 8;
		return var4 >> 1;
	}

	@ObfInfo(name = "bl", desc = "([B[IIIIIIILbn;)I")
	static int method389(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, class28 var8) {
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

		var8.field461 = var2 << 8;
		return var3;
	}

	@ObfInfo(name = "be", desc = "(I[B[IIIIIIIILbn;)I")
	static int method409(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, class28 var10) {
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

		var10.field461 = var3 << 8;
		return var4 >> 1;
	}

	@ObfInfo(name = "bi", desc = "(II[B[IIIIIIILbn;II)I")
	static int method390(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class28 var10, int var11, int var12) {
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

		var10.field461 = var4;
		return var5;
	}

	@ObfInfo(name = "bz", desc = "(II[B[IIIIIIIILbn;II)I")
	static int method391(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class28 var11, int var12, int var13) {
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

		var11.field461 = var4;
		return var5 >> 1;
	}

	@ObfInfo(name = "bx", desc = "(II[B[IIIIIIILbn;II)I")
	static int method376(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, class28 var10, int var11, int var12) {
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

		var10.field461 = var4;
		return var5;
	}

	@ObfInfo(name = "bn", desc = "(II[B[IIIIIIIILbn;II)I")
	static int method392(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class28 var11, int var12, int var13) {
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

		var11.field461 = var4;
		return var5 >> 1;
	}

	@ObfInfo(name = "bw", desc = "([B[IIIIIIIILbn;)I")
	static int method393(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class28 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field463 += var9.field456 * (var6 - var3);
		var9.field457 += var9.field465 * (var6 - var3);

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

		var9.field455 = var4 >> 2;
		var9.field461 = var2 << 8;
		return var3;
	}

	@ObfInfo(name = "bc", desc = "(I[B[IIIIIIIIIILbn;)I")
	static int method394(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class28 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var11 - var3) > var10) {
			var9 = var10;
		}

		var12.field455 += var12.field451 * (var9 - var4);
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

		var12.field463 = var5 >> 2;
		var12.field457 = var6 >> 2;
		var12.field461 = var3 << 8;
		return var4 >> 1;
	}

	@ObfInfo(name = "bg", desc = "([B[IIIIIIIILbn;)I")
	static int method395(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class28 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field463 += var9.field456 * (var6 - var3);
		var9.field457 += var9.field465 * (var6 - var3);

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

		var9.field455 = var4 >> 2;
		var9.field461 = var2 << 8;
		return var3;
	}

	@ObfInfo(name = "cw", desc = "(I[B[IIIIIIIIIILbn;)I")
	static int method396(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, class28 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var4 + var3 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field455 += var12.field451 * (var9 - var4);
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

		var12.field463 = var5 >> 2;
		var12.field457 = var6 >> 2;
		var12.field461 = var3 << 8;
		return var4 >> 1;
	}

	@ObfInfo(name = "cf", desc = "(II[B[IIIIIIIILbn;II)I")
	static int method397(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class28 var11, int var12, int var13) {
		var11.field463 -= var11.field456 * var5;
		var11.field457 -= var11.field465 * var5;
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

		var11.field463 += var11.field456 * var5;
		var11.field457 += var11.field465 * var5;
		var11.field455 = var6;
		var11.field461 = var4;
		return var5;
	}

	@ObfInfo(name = "cm", desc = "(II[B[IIIIIIIIIILbn;II)I")
	static int method398(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class28 var13, int var14, int var15) {
		var13.field455 -= var13.field451 * var5;
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
		var13.field455 += var13.field451 * var5;
		var13.field463 = var6;
		var13.field457 = var7;
		var13.field461 = var4;
		return var5;
	}

	@ObfInfo(name = "cn", desc = "(II[B[IIIIIIIILbn;II)I")
	static int method408(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, class28 var11, int var12, int var13) {
		var11.field463 -= var11.field456 * var5;
		var11.field457 -= var11.field465 * var5;
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

		var11.field463 += var11.field456 * var5;
		var11.field457 += var11.field465 * var5;
		var11.field455 = var6;
		var11.field461 = var4;
		return var5;
	}

	@ObfInfo(name = "cs", desc = "(II[B[IIIIIIIIIILbn;II)I")
	static int method405(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, class28 var13, int var14, int var15) {
		var13.field455 -= var13.field451 * var5;
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
		var13.field455 += var13.field451 * var5;
		var13.field463 = var6;
		var13.field457 = var7;
		var13.field461 = var4;
		return var5;
	}
}
