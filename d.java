// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb space 

import jagex.c;
import jagex.client.*;
import java.io.IOException;

public class d {

	public d(a a1, i k) {
		ee = true;
		fe = false;
		ie = 750;
		le = new int[256];
		re = new byte[4][2304];
		se = new byte[4][2304];
		te = new byte[4][2304];
		ue = new byte[4][2304];
		ve = new byte[4][2304];
		we = new byte[4][2304];
		xe = new byte[4][2304];
		ye = new int[4][2304];
		ze = 96;
		af = 96;
		bf = new int[ze * af * 2];
		cf = new int[ze * af * 2];
		df = new int[ze][af];
		ef = new int[ze][af];
		ff = new int[ze][af];
		gf = false;
		hf = new p[64];
		_fldif = new p[4][64];
		jf = new p[4][64];
		he = a1;
		ge = k;
		for (int l = 0; l < 64; l++)
			le[l] = a.lb(255 - l * 4, 255 - (int)((double)l * 1.75D), 255 - l * 4);

		for (int i1 = 0; i1 < 64; i1++)
			le[i1 + 64] = a.lb(i1 * 3, 144, 0);

		for (int j1 = 0; j1 < 64; j1++)
			le[j1 + 128] = a.lb(192 - (int)((double)j1 * 1.5D), 144 - (int)((double)j1 * 1.5D), 0);

		for (int k1 = 0; k1 < 64; k1++)
			le[k1 + 192] = a.lb(96 - (int)((double)k1 * 1.5D), 48 + (int)((double)k1 * 1.5D), 0);

	}

	public int od(int k, int l, int i1, int j1, int k1, int l1, int ai[], 
			int ai1[], boolean flag) {
		for (int i2 = 0; i2 < ze; i2++) {
			for (int j2 = 0; j2 < af; j2++)
				df[i2][j2] = 0;

		}

		int k2 = 0;
		int l2 = 0;
		int i3 = k;
		int j3 = l;
		df[k][l] = 99;
		ai[k2] = k;
		ai1[k2++] = l;
		int k3 = ai.length;
		boolean flag1 = false;
		while (l2 != k2)  {
			i3 = ai[l2];
			j3 = ai1[l2];
			l2 = (l2 + 1) % k3;
			if (i3 >= i1 && i3 <= k1 && j3 >= j1 && j3 <= l1) {
				flag1 = true;
				break;
			}
			if (flag) {
				if (i3 > 0 && i3 - 1 >= i1 && i3 - 1 <= k1 && j3 >= j1 && j3 <= l1 && (ef[i3 - 1][j3] & 8) == 0) {
					flag1 = true;
					break;
				}
				if (i3 < ze - 1 && i3 + 1 >= i1 && i3 + 1 <= k1 && j3 >= j1 && j3 <= l1 && (ef[i3 + 1][j3] & 2) == 0) {
					flag1 = true;
					break;
				}
				if (j3 > 0 && i3 >= i1 && i3 <= k1 && j3 - 1 >= j1 && j3 - 1 <= l1 && (ef[i3][j3 - 1] & 4) == 0) {
					flag1 = true;
					break;
				}
				if (j3 < af - 1 && i3 >= i1 && i3 <= k1 && j3 + 1 >= j1 && j3 + 1 <= l1 && (ef[i3][j3 + 1] & 1) == 0) {
					flag1 = true;
					break;
				}
			}
			if (i3 > 0 && df[i3 - 1][j3] == 0 && (ef[i3 - 1][j3] & 0x78) == 0) {
				ai[k2] = i3 - 1;
				ai1[k2] = j3;
				k2 = (k2 + 1) % k3;
				df[i3 - 1][j3] = 2;
			}
			if (i3 < ze - 1 && df[i3 + 1][j3] == 0 && (ef[i3 + 1][j3] & 0x72) == 0) {
				ai[k2] = i3 + 1;
				ai1[k2] = j3;
				k2 = (k2 + 1) % k3;
				df[i3 + 1][j3] = 8;
			}
			if (j3 > 0 && df[i3][j3 - 1] == 0 && (ef[i3][j3 - 1] & 0x74) == 0) {
				ai[k2] = i3;
				ai1[k2] = j3 - 1;
				k2 = (k2 + 1) % k3;
				df[i3][j3 - 1] = 1;
			}
			if (j3 < af - 1 && df[i3][j3 + 1] == 0 && (ef[i3][j3 + 1] & 0x71) == 0) {
				ai[k2] = i3;
				ai1[k2] = j3 + 1;
				k2 = (k2 + 1) % k3;
				df[i3][j3 + 1] = 4;
			}
			if (i3 > 0 && j3 > 0 && (ef[i3][j3 - 1] & 0x74) == 0 && (ef[i3 - 1][j3] & 0x78) == 0 && (ef[i3 - 1][j3 - 1] & 0x7c) == 0 && df[i3 - 1][j3 - 1] == 0) {
				ai[k2] = i3 - 1;
				ai1[k2] = j3 - 1;
				k2 = (k2 + 1) % k3;
				df[i3 - 1][j3 - 1] = 3;
			}
			if (i3 < ze - 1 && j3 > 0 && (ef[i3][j3 - 1] & 0x74) == 0 && (ef[i3 + 1][j3] & 0x72) == 0 && (ef[i3 + 1][j3 - 1] & 0x76) == 0 && df[i3 + 1][j3 - 1] == 0) {
				ai[k2] = i3 + 1;
				ai1[k2] = j3 - 1;
				k2 = (k2 + 1) % k3;
				df[i3 + 1][j3 - 1] = 9;
			}
			if (i3 > 0 && j3 < af - 1 && (ef[i3][j3 + 1] & 0x71) == 0 && (ef[i3 - 1][j3] & 0x78) == 0 && (ef[i3 - 1][j3 + 1] & 0x79) == 0 && df[i3 - 1][j3 + 1] == 0) {
				ai[k2] = i3 - 1;
				ai1[k2] = j3 + 1;
				k2 = (k2 + 1) % k3;
				df[i3 - 1][j3 + 1] = 6;
			}
			if (i3 < ze - 1 && j3 < af - 1 && (ef[i3][j3 + 1] & 0x71) == 0 && (ef[i3 + 1][j3] & 0x72) == 0 && (ef[i3 + 1][j3 + 1] & 0x73) == 0 && df[i3 + 1][j3 + 1] == 0) {
				ai[k2] = i3 + 1;
				ai1[k2] = j3 + 1;
				k2 = (k2 + 1) % k3;
				df[i3 + 1][j3 + 1] = 12;
			}
		}
		if (!flag1)
			return -1;
		l2 = 0;
		ai[l2] = i3;
		ai1[l2++] = j3;
		int i4;
		for (int l3 = i4 = df[i3][j3]; i3 != k || j3 != l; l3 = df[i3][j3]) {
			if (l3 != i4) {
				i4 = l3;
				ai[l2] = i3;
				ai1[l2++] = j3;
			}
			if ((l3 & 2) != 0)
				i3++;
			else
			if ((l3 & 8) != 0)
				i3--;
			if ((l3 & 1) != 0)
				j3++;
			else
			if ((l3 & 4) != 0)
				j3--;
		}

		return l2;
	}

	public void rd(int k, int l, int i1) {
		ef[k][l] |= i1;
	}

	public void ud(int k, int l, int i1) {
		ef[k][l] &= 65535 - i1;
	}

	public void ed(int k, int l, int i1, int j1) {
		if (k < 0 || l < 0 || k >= ze - 1 || l >= af - 1)
			return;
		if (j.tn[j1] == 1) {
			if (i1 == 0) {
				ef[k][l] |= 1;
				if (l > 0)
					rd(k, l - 1, 4);
			} else
			if (i1 == 1) {
				ef[k][l] |= 2;
				if (k > 0)
					rd(k - 1, l, 8);
			} else
			if (i1 == 2)
				ef[k][l] |= 0x10;
			else
			if (i1 == 3)
				ef[k][l] |= 0x20;
			kd(k, l, 1, 1);
		}
	}

	public void ke(int k, int l, int i1, int j1) {
		if (k < 0 || l < 0 || k >= ze - 1 || l >= af - 1)
			return;
		if (j.tn[j1] == 1) {
			if (i1 == 0) {
				ef[k][l] &= 0xfffe;
				if (l > 0)
					ud(k, l - 1, 4);
			} else
			if (i1 == 1) {
				ef[k][l] &= 0xfffd;
				if (k > 0)
					ud(k - 1, l, 8);
			} else
			if (i1 == 2)
				ef[k][l] &= 0xffef;
			else
			if (i1 == 3)
				ef[k][l] &= 0xffdf;
			kd(k, l, 1, 1);
		}
	}

	public void jd(int k, int l, int i1) {
		if (k < 0 || l < 0 || k >= ze - 1 || l >= af - 1)
			return;
		if (j.in[i1] == 1 || j.in[i1] == 2) {
			int j1 = td(k, l);
			int k1;
			int l1;
			if (j1 == 0 || j1 == 4) {
				k1 = j.gn[i1];
				l1 = j.hn[i1];
			} else {
				l1 = j.gn[i1];
				k1 = j.hn[i1];
			}
			for (int i2 = k; i2 < k + k1; i2++) {
				for (int j2 = l; j2 < l + l1; j2++)
					if (j.in[i1] == 1)
						ef[i2][j2] |= 0x40;
					else
					if (j1 == 0) {
						ef[i2][j2] |= 2;
						if (i2 > 0)
							rd(i2 - 1, j2, 8);
					} else
					if (j1 == 2) {
						ef[i2][j2] |= 4;
						if (j2 < af - 1)
							rd(i2, j2 + 1, 1);
					} else
					if (j1 == 4) {
						ef[i2][j2] |= 8;
						if (i2 < ze - 1)
							rd(i2 + 1, j2, 2);
					} else
					if (j1 == 6) {
						ef[i2][j2] |= 1;
						if (j2 > 0)
							rd(i2, j2 - 1, 4);
					}

			}

			kd(k, l, k1, l1);
		}
	}

	public void gd(int k, int l, int i1) {
		if (k < 0 || l < 0 || k >= ze - 1 || l >= af - 1)
			return;
		if (j.in[i1] == 1 || j.in[i1] == 2) {
			int j1 = td(k, l);
			int k1;
			int l1;
			if (j1 == 0 || j1 == 4) {
				k1 = j.gn[i1];
				l1 = j.hn[i1];
			} else {
				l1 = j.gn[i1];
				k1 = j.hn[i1];
			}
			for (int i2 = k; i2 < k + k1; i2++) {
				for (int j2 = l; j2 < l + l1; j2++)
					if (j.in[i1] == 1)
						ef[i2][j2] &= 0xffbf;
					else
					if (j1 == 0) {
						ef[i2][j2] &= 0xfffd;
						if (i2 > 0)
							ud(i2 - 1, j2, 8);
					} else
					if (j1 == 2) {
						ef[i2][j2] &= 0xfffb;
						if (j2 < af - 1)
							ud(i2, j2 + 1, 1);
					} else
					if (j1 == 4) {
						ef[i2][j2] &= 0xfff7;
						if (i2 < ze - 1)
							ud(i2 + 1, j2, 2);
					} else
					if (j1 == 6) {
						ef[i2][j2] &= 0xfffe;
						if (j2 > 0)
							ud(i2, j2 - 1, 4);
					}

			}

			kd(k, l, k1, l1);
		}
	}

	public void kd(int k, int l, int i1, int j1) {
		if (k < 1 || l < 1 || k + i1 >= ze || l + j1 >= af)
			return;
		for (int k1 = k; k1 <= k + i1; k1++) {
			for (int l1 = l; l1 <= l + j1; l1++)
				if ((be(k1, l1) & 0x63) != 0 || (be(k1 - 1, l1) & 0x59) != 0 || (be(k1, l1 - 1) & 0x56) != 0 || (be(k1 - 1, l1 - 1) & 0x6c) != 0)
					je(k1, l1, 35);
				else
					je(k1, l1, 0);

		}

	}

	public void je(int k, int l, int i1) {
		int j1 = k / 12;
		int k1 = l / 12;
		int l1 = (k - 1) / 12;
		int i2 = (l - 1) / 12;
		nd(j1, k1, k, l, i1);
		if (j1 != l1)
			nd(l1, k1, k, l, i1);
		if (k1 != i2)
			nd(j1, i2, k, l, i1);
		if (j1 != l1 && k1 != i2)
			nd(l1, i2, k, l, i1);
	}

	public void nd(int k, int l, int i1, int j1, int k1) {
		p p1 = hf[k + l * 8];
		for (int l1 = 0; l1 < p1.ju; l1++)
			if (p1.ew[l1] == i1 * 128 && p1.gw[l1] == j1 * 128) {
				p1.vm(l1, k1);
				return;
			}

	}

	public int be(int k, int l) {
		if (k < 0 || l < 0 || k >= ze || l >= af)
			return 0;
		else
			return ef[k][l];
	}

	public int vd(int k, int l) {
		int i1 = k >> 7;
		int j1 = l >> 7;
		int k1 = k & 0x7f;
		int l1 = l & 0x7f;
		if (i1 < 0 || j1 < 0 || i1 >= ze - 1 || j1 >= af - 1)
			return 0;
		int i2;
		int j2;
		int k2;
		if (k1 <= 128 - l1) {
			i2 = de(i1, j1);
			j2 = de(i1 + 1, j1) - i2;
			k2 = de(i1, j1 + 1) - i2;
		} else {
			i2 = de(i1 + 1, j1 + 1);
			j2 = de(i1, j1 + 1) - i2;
			k2 = de(i1 + 1, j1) - i2;
			k1 = 128 - k1;
			l1 = 128 - l1;
		}
		int l2 = i2 + (j2 * k1) / 128 + (k2 * l1) / 128;
		return l2;
	}

	public int de(int k, int l) {
		if (k < 0 || k >= 96 || l < 0 || l >= 96)
			return 0;
		byte byte0 = 0;
		if (k >= 48 && l < 48) {
			byte0 = 1;
			k -= 48;
		} else
		if (k < 48 && l >= 48) {
			byte0 = 2;
			l -= 48;
		} else
		if (k >= 48 && l >= 48) {
			byte0 = 3;
			k -= 48;
			l -= 48;
		}
		return (re[byte0][k * 48 + l] & 0xff) * 3;
	}

	public int ce(int k, int l) {
		if (k < 0 || k >= 96 || l < 0 || l >= 96)
			return 0;
		byte byte0 = 0;
		if (k >= 48 && l < 48) {
			byte0 = 1;
			k -= 48;
		} else
		if (k < 48 && l >= 48) {
			byte0 = 2;
			l -= 48;
		} else
		if (k >= 48 && l >= 48) {
			byte0 = 3;
			k -= 48;
			l -= 48;
		}
		return se[byte0][k * 48 + l] & 0xff;
	}

	public int fe(int k, int l, int i1) {
		if (k < 0 || k >= 96 || l < 0 || l >= 96)
			return 0;
		byte byte0 = 0;
		if (k >= 48 && l < 48) {
			byte0 = 1;
			k -= 48;
		} else
		if (k < 48 && l >= 48) {
			byte0 = 2;
			l -= 48;
		} else
		if (k >= 48 && l >= 48) {
			byte0 = 3;
			k -= 48;
			l -= 48;
		}
		return we[byte0][k * 48 + l] & 0xff;
	}

	public void sd(int k, int l, int i1) {
		if (k < 0 || k >= 96 || l < 0 || l >= 96)
			return;
		byte byte0 = 0;
		if (k >= 48 && l < 48) {
			byte0 = 1;
			k -= 48;
		} else
		if (k < 48 && l >= 48) {
			byte0 = 2;
			l -= 48;
		} else
		if (k >= 48 && l >= 48) {
			byte0 = 3;
			k -= 48;
			l -= 48;
		}
		we[byte0][k * 48 + l] = (byte)i1;
	}

	public int qd(int k, int l, int i1) {
		int j1 = fe(k, l, i1);
		if (j1 == 0)
			return -1;
		int k1 = j.eo[j1 - 1];
		return k1 != 2 ? 0 : 1;
	}

	public int wd(int k, int l, int i1, int j1) {
		int k1 = fe(k, l, i1);
		if (k1 == 0)
			return j1;
		else
			return j._flddo[k1 - 1];
	}

	public int ee(int k, int l) {
		if (k < 0 || k >= 96 || l < 0 || l >= 96)
			return 0;
		byte byte0 = 0;
		if (k >= 48 && l < 48) {
			byte0 = 1;
			k -= 48;
		} else
		if (k < 48 && l >= 48) {
			byte0 = 2;
			l -= 48;
		} else
		if (k >= 48 && l >= 48) {
			byte0 = 3;
			k -= 48;
			l -= 48;
		}
		return ye[byte0][k * 48 + l];
	}

	public int ge(int k, int l) {
		if (k < 0 || k >= 96 || l < 0 || l >= 96)
			return 0;
		byte byte0 = 0;
		if (k >= 48 && l < 48) {
			byte0 = 1;
			k -= 48;
		} else
		if (k < 48 && l >= 48) {
			byte0 = 2;
			l -= 48;
		} else
		if (k >= 48 && l >= 48) {
			byte0 = 3;
			k -= 48;
			l -= 48;
		}
		return ve[byte0][k * 48 + l];
	}

	public int td(int k, int l) {
		if (k < 0 || k >= 96 || l < 0 || l >= 96)
			return 0;
		byte byte0 = 0;
		if (k >= 48 && l < 48) {
			byte0 = 1;
			k -= 48;
		} else
		if (k < 48 && l >= 48) {
			byte0 = 2;
			l -= 48;
		} else
		if (k >= 48 && l >= 48) {
			byte0 = 3;
			k -= 48;
			l -= 48;
		}
		return xe[byte0][k * 48 + l];
	}

	public boolean ae(int k, int l) {
		return ge(k, l) > 0 || ge(k - 1, l) > 0 || ge(k - 1, l - 1) > 0 || ge(k, l - 1) > 0;
	}

	public boolean zd(int k, int l) {
		return ge(k, l) > 0 && ge(k - 1, l) > 0 && ge(k - 1, l - 1) > 0 && ge(k, l - 1) > 0;
	}

	public int fd(int k, int l) {
		if (k < 0 || k >= 96 || l < 0 || l >= 96)
			return 0;
		byte byte0 = 0;
		if (k >= 48 && l < 48) {
			byte0 = 1;
			k -= 48;
		} else
		if (k < 48 && l >= 48) {
			byte0 = 2;
			l -= 48;
		} else
		if (k >= 48 && l >= 48) {
			byte0 = 3;
			k -= 48;
			l -= 48;
		}
		return ue[byte0][k * 48 + l] & 0xff;
	}

	public int he(int k, int l) {
		if (k < 0 || k >= 96 || l < 0 || l >= 96)
			return 0;
		byte byte0 = 0;
		if (k >= 48 && l < 48) {
			byte0 = 1;
			k -= 48;
		} else
		if (k < 48 && l >= 48) {
			byte0 = 2;
			l -= 48;
		} else
		if (k >= 48 && l >= 48) {
			byte0 = 3;
			k -= 48;
			l -= 48;
		}
		return te[byte0][k * 48 + l] & 0xff;
	}

	public void id(int k, int l, int i1, int j1) {
		String s = "m" + i1 + k / 10 + k % 10 + l / 10 + l % 10;
		int k1;
		try {
			byte abyte0[];
			if (ee) {
				abyte0 = c.lc(s + ".jm", 0, qe);
				if (abyte0 == null || abyte0.length == 0)
					throw new IOException("Map not defined");
			} else {
				abyte0 = new byte[20736];
				c.xc("../gamedata/maps/" + s + ".jm", abyte0, 20736);
			}
			int l1 = 0;
			int i2 = 0;
			for (int j2 = 0; j2 < 2304; j2++) {
				l1 = l1 + abyte0[i2++] & 0xff;
				re[j1][j2] = (byte)l1;
			}

			l1 = 0;
			for (int k2 = 0; k2 < 2304; k2++) {
				l1 = l1 + abyte0[i2++] & 0xff;
				se[j1][k2] = (byte)l1;
			}

			for (int l2 = 0; l2 < 2304; l2++)
				te[j1][l2] = abyte0[i2++];

			for (int i3 = 0; i3 < 2304; i3++)
				ue[j1][i3] = abyte0[i2++];

			for (int j3 = 0; j3 < 2304; j3++) {
				ye[j1][j3] = (abyte0[i2] & 0xff) * 256 + (abyte0[i2 + 1] & 0xff);
				i2 += 2;
			}

			for (int k3 = 0; k3 < 2304; k3++)
				ve[j1][k3] = abyte0[i2++];

			for (int l3 = 0; l3 < 2304; l3++)
				we[j1][l3] = abyte0[i2++];

			for (int i4 = 0; i4 < 2304; i4++)
				xe[j1][i4] = abyte0[i2++];

			return;
		}
		catch (IOException _ex) {
			k1 = 0;
		}
		for (; k1 < 2304; k1++) {
			re[j1][k1] = 0;
			se[j1][k1] = 0;
			te[j1][k1] = 0;
			ue[j1][k1] = 0;
			ye[j1][k1] = 0;
			ve[j1][k1] = 0;
			we[j1][k1] = 0;
			if (i1 == 0)
				we[j1][k1] = -6;
			if (i1 == 3)
				we[j1][k1] = 8;
			xe[j1][k1] = 0;
		}

	}

	public void ie() {
		he.x();
		for (int k = 0; k < 64; k++) {
			hf[k] = null;
			for (int l = 0; l < 4; l++)
				_fldif[l][k] = null;

			for (int i1 = 0; i1 < 4; i1++)
				jf[i1][k] = null;

		}

		System.gc();
	}

	public void md(int k, int l, int i1) {
		ie();
		int j1 = (k + 24) / 48;
		int k1 = (l + 24) / 48;
		pd(k, l, i1, true);
		if (i1 == 0) {
			pd(k, l, 1, false);
			pd(k, l, 2, false);
			id(j1 - 1, k1 - 1, i1, 0);
			id(j1, k1 - 1, i1, 1);
			id(j1 - 1, k1, i1, 2);
			id(j1, k1, i1, 3);
			le();
		}
	}

	public void le() {
		for (int k = 0; k < 96; k++) {
			for (int l = 0; l < 96; l++)
				if (fe(k, l, 0) == 250)
					if (k == 47 && fe(k + 1, l, 0) != 250 && fe(k + 1, l, 0) != 2)
						sd(k, l, 9);
					else
					if (l == 47 && fe(k, l + 1, 0) != 250 && fe(k, l + 1, 0) != 2)
						sd(k, l, 9);
					else
						sd(k, l, 2);

		}

	}

	public void xd(int k, int l, int i1, int j1, int k1) {
		int l1 = k * 3;
		int i2 = l * 3;
		int j2 = he.e(j1);
		int k2 = he.e(k1);
		j2 = j2 >> 1 & 0x7f7f7f;
		k2 = k2 >> 1 & 0x7f7f7f;
		if (i1 == 0) {
			ge.sg(l1, i2, 3, j2);
			ge.sg(l1, i2 + 1, 2, j2);
			ge.sg(l1, i2 + 2, 1, j2);
			ge.sg(l1 + 2, i2 + 1, 1, k2);
			ge.sg(l1 + 1, i2 + 2, 2, k2);
			return;
		}
		if (i1 == 1) {
			ge.sg(l1, i2, 3, k2);
			ge.sg(l1 + 1, i2 + 1, 2, k2);
			ge.sg(l1 + 2, i2 + 2, 1, k2);
			ge.sg(l1, i2 + 1, 1, j2);
			ge.sg(l1, i2 + 2, 2, j2);
		}
	}

	public void pd(int k, int l, int i1, boolean flag) {
		int j1 = (k + 24) / 48;
		int k1 = (l + 24) / 48;
		id(j1 - 1, k1 - 1, i1, 0);
		id(j1, k1 - 1, i1, 1);
		id(j1 - 1, k1, i1, 2);
		id(j1, k1, i1, 3);
		le();
		if (kf == null)
			kf = new p(ze * af * 2 + 256, ze * af * 2 + 256, true, true, false, false, true);
		if (flag) {
			ge.zf();
			for (int l1 = 0; l1 < 96; l1++) {
				for (int j2 = 0; j2 < 96; j2++)
					ef[l1][j2] = 0;

			}

			p p1 = kf;
			p1.fm();
			for (int l2 = 0; l2 < 96; l2++) {
				for (int k3 = 0; k3 < 96; k3++) {
					int k4 = -de(l2, k3);
					if (fe(l2, k3, i1) > 0 && j.eo[fe(l2, k3, i1) - 1] == 4)
						k4 = 0;
					if (fe(l2 - 1, k3, i1) > 0 && j.eo[fe(l2 - 1, k3, i1) - 1] == 4)
						k4 = 0;
					if (fe(l2, k3 - 1, i1) > 0 && j.eo[fe(l2, k3 - 1, i1) - 1] == 4)
						k4 = 0;
					if (fe(l2 - 1, k3 - 1, i1) > 0 && j.eo[fe(l2 - 1, k3 - 1, i1) - 1] == 4)
						k4 = 0;
					int l5 = p1.em(l2 * 128, k4, k3 * 128);
					int l7 = (int)(Math.random() * 10D) - 5;
					p1.vm(l5, l7);
				}

			}

			for (int l3 = 0; l3 < 95; l3++) {
				for (int l4 = 0; l4 < 95; l4++) {
					int i6 = ce(l3, l4);
					int i8 = le[i6];
					int k10 = i8;
					int i13 = i8;
					int j15 = 0;
					if (i1 == 1 || i1 == 2) {
						i8 = 0xbc614e;
						k10 = 0xbc614e;
						i13 = 0xbc614e;
					}
					if (fe(l3, l4, i1) > 0) {
						int j17 = fe(l3, l4, i1);
						int j6 = j.eo[j17 - 1];
						int k19 = qd(l3, l4, i1);
						i8 = k10 = j._flddo[j17 - 1];
						if (j6 == 4) {
							i8 = 1;
							k10 = 1;
						}
						if (j6 == 5) {
							if (ee(l3, l4) > 0 && ee(l3, l4) < 24000)
								if (wd(l3 - 1, l4, i1, i13) != 0xbc614e && wd(l3, l4 - 1, i1, i13) != 0xbc614e) {
									i8 = wd(l3 - 1, l4, i1, i13);
									j15 = 0;
								} else
								if (wd(l3 + 1, l4, i1, i13) != 0xbc614e && wd(l3, l4 + 1, i1, i13) != 0xbc614e) {
									k10 = wd(l3 + 1, l4, i1, i13);
									j15 = 0;
								} else
								if (wd(l3 + 1, l4, i1, i13) != 0xbc614e && wd(l3, l4 - 1, i1, i13) != 0xbc614e) {
									k10 = wd(l3 + 1, l4, i1, i13);
									j15 = 1;
								} else
								if (wd(l3 - 1, l4, i1, i13) != 0xbc614e && wd(l3, l4 + 1, i1, i13) != 0xbc614e) {
									i8 = wd(l3 - 1, l4, i1, i13);
									j15 = 1;
								}
						} else
						if (j6 != 2 || ee(l3, l4) > 0 && ee(l3, l4) < 24000)
							if (qd(l3 - 1, l4, i1) != k19 && qd(l3, l4 - 1, i1) != k19) {
								i8 = i13;
								j15 = 0;
							} else
							if (qd(l3 + 1, l4, i1) != k19 && qd(l3, l4 + 1, i1) != k19) {
								k10 = i13;
								j15 = 0;
							} else
							if (qd(l3 + 1, l4, i1) != k19 && qd(l3, l4 - 1, i1) != k19) {
								k10 = i13;
								j15 = 1;
							} else
							if (qd(l3 - 1, l4, i1) != k19 && qd(l3, l4 + 1, i1) != k19) {
								i8 = i13;
								j15 = 1;
							}
						if (j.fo[j17 - 1] != 0)
							ef[l3][l4] |= 0x40;
						if (j.eo[j17 - 1] == 2)
							ef[l3][l4] |= 0x80;
					}
					xd(l3, l4, j15, i8, k10);
					int k17 = ((de(l3 + 1, l4 + 1) - de(l3 + 1, l4)) + de(l3, l4 + 1)) - de(l3, l4);
					if (i8 != k10 || k17 != 0) {
						int ai[] = new int[3];
						int ai7[] = new int[3];
						if (j15 == 0) {
							if (i8 != 0xbc614e) {
								ai[0] = l4 + l3 * ze + ze;
								ai[1] = l4 + l3 * ze;
								ai[2] = l4 + l3 * ze + 1;
								int j22 = p1.gm(3, ai, 0xbc614e, i8);
								bf[j22] = l3;
								cf[j22] = l4;
								p1.qv[j22] = 0x30d40 + j22;
							}
							if (k10 != 0xbc614e) {
								ai7[0] = l4 + l3 * ze + 1;
								ai7[1] = l4 + l3 * ze + ze + 1;
								ai7[2] = l4 + l3 * ze + ze;
								int k22 = p1.gm(3, ai7, 0xbc614e, k10);
								bf[k22] = l3;
								cf[k22] = l4;
								p1.qv[k22] = 0x30d40 + k22;
							}
						} else {
							if (i8 != 0xbc614e) {
								ai[0] = l4 + l3 * ze + 1;
								ai[1] = l4 + l3 * ze + ze + 1;
								ai[2] = l4 + l3 * ze;
								int l22 = p1.gm(3, ai, 0xbc614e, i8);
								bf[l22] = l3;
								cf[l22] = l4;
								p1.qv[l22] = 0x30d40 + l22;
							}
							if (k10 != 0xbc614e) {
								ai7[0] = l4 + l3 * ze + ze;
								ai7[1] = l4 + l3 * ze;
								ai7[2] = l4 + l3 * ze + ze + 1;
								int i23 = p1.gm(3, ai7, 0xbc614e, k10);
								bf[i23] = l3;
								cf[i23] = l4;
								p1.qv[i23] = 0x30d40 + i23;
							}
						}
					} else
					if (i8 != 0xbc614e) {
						int ai1[] = new int[4];
						ai1[0] = l4 + l3 * ze + ze;
						ai1[1] = l4 + l3 * ze;
						ai1[2] = l4 + l3 * ze + 1;
						ai1[3] = l4 + l3 * ze + ze + 1;
						int j20 = p1.gm(4, ai1, 0xbc614e, i8);
						bf[j20] = l3;
						cf[j20] = l4;
						p1.qv[j20] = 0x30d40 + j20;
					}
				}

			}

			for (int i5 = 1; i5 < 95; i5++) {
				for (int k6 = 1; k6 < 95; k6++)
					if (fe(i5, k6, i1) > 0 && j.eo[fe(i5, k6, i1) - 1] == 4) {
						int j8 = j._flddo[fe(i5, k6, i1) - 1];
						int l10 = p1.em(i5 * 128, -de(i5, k6), k6 * 128);
						int j13 = p1.em((i5 + 1) * 128, -de(i5 + 1, k6), k6 * 128);
						int k15 = p1.em((i5 + 1) * 128, -de(i5 + 1, k6 + 1), (k6 + 1) * 128);
						int l17 = p1.em(i5 * 128, -de(i5, k6 + 1), (k6 + 1) * 128);
						int ai2[] = {
							l10, j13, k15, l17
						};
						int k20 = p1.gm(4, ai2, j8, 0xbc614e);
						bf[k20] = i5;
						cf[k20] = k6;
						p1.qv[k20] = 0x30d40 + k20;
						xd(i5, k6, 0, j8, j8);
					} else
					if (fe(i5, k6, i1) == 0 || j.eo[fe(i5, k6, i1) - 1] != 3) {
						if (fe(i5, k6 + 1, i1) > 0 && j.eo[fe(i5, k6 + 1, i1) - 1] == 4) {
							int k8 = j._flddo[fe(i5, k6 + 1, i1) - 1];
							int i11 = p1.em(i5 * 128, -de(i5, k6), k6 * 128);
							int k13 = p1.em((i5 + 1) * 128, -de(i5 + 1, k6), k6 * 128);
							int l15 = p1.em((i5 + 1) * 128, -de(i5 + 1, k6 + 1), (k6 + 1) * 128);
							int i18 = p1.em(i5 * 128, -de(i5, k6 + 1), (k6 + 1) * 128);
							int ai3[] = {
								i11, k13, l15, i18
							};
							int l20 = p1.gm(4, ai3, k8, 0xbc614e);
							bf[l20] = i5;
							cf[l20] = k6;
							p1.qv[l20] = 0x30d40 + l20;
							xd(i5, k6, 0, k8, k8);
						}
						if (fe(i5, k6 - 1, i1) > 0 && j.eo[fe(i5, k6 - 1, i1) - 1] == 4) {
							int l8 = j._flddo[fe(i5, k6 - 1, i1) - 1];
							int j11 = p1.em(i5 * 128, -de(i5, k6), k6 * 128);
							int l13 = p1.em((i5 + 1) * 128, -de(i5 + 1, k6), k6 * 128);
							int i16 = p1.em((i5 + 1) * 128, -de(i5 + 1, k6 + 1), (k6 + 1) * 128);
							int j18 = p1.em(i5 * 128, -de(i5, k6 + 1), (k6 + 1) * 128);
							int ai4[] = {
								j11, l13, i16, j18
							};
							int i21 = p1.gm(4, ai4, l8, 0xbc614e);
							bf[i21] = i5;
							cf[i21] = k6;
							p1.qv[i21] = 0x30d40 + i21;
							xd(i5, k6, 0, l8, l8);
						}
						if (fe(i5 + 1, k6, i1) > 0 && j.eo[fe(i5 + 1, k6, i1) - 1] == 4) {
							int i9 = j._flddo[fe(i5 + 1, k6, i1) - 1];
							int k11 = p1.em(i5 * 128, -de(i5, k6), k6 * 128);
							int i14 = p1.em((i5 + 1) * 128, -de(i5 + 1, k6), k6 * 128);
							int j16 = p1.em((i5 + 1) * 128, -de(i5 + 1, k6 + 1), (k6 + 1) * 128);
							int k18 = p1.em(i5 * 128, -de(i5, k6 + 1), (k6 + 1) * 128);
							int ai5[] = {
								k11, i14, j16, k18
							};
							int j21 = p1.gm(4, ai5, i9, 0xbc614e);
							bf[j21] = i5;
							cf[j21] = k6;
							p1.qv[j21] = 0x30d40 + j21;
							xd(i5, k6, 0, i9, i9);
						}
						if (fe(i5 - 1, k6, i1) > 0 && j.eo[fe(i5 - 1, k6, i1) - 1] == 4) {
							int j9 = j._flddo[fe(i5 - 1, k6, i1) - 1];
							int l11 = p1.em(i5 * 128, -de(i5, k6), k6 * 128);
							int j14 = p1.em((i5 + 1) * 128, -de(i5 + 1, k6), k6 * 128);
							int k16 = p1.em((i5 + 1) * 128, -de(i5 + 1, k6 + 1), (k6 + 1) * 128);
							int l18 = p1.em(i5 * 128, -de(i5, k6 + 1), (k6 + 1) * 128);
							int ai6[] = {
								l11, j14, k16, l18
							};
							int k21 = p1.gm(4, ai6, j9, 0xbc614e);
							bf[k21] = i5;
							cf[k21] = k6;
							p1.qv[k21] = 0x30d40 + k21;
							xd(i5, k6, 0, j9, j9);
						}
					}

			}

			p1.nm(true, 40, 48, -50, -10, -50);
			hf = kf.mm(0, 0, 1536, 1536, 8, 64, 233, false);
			for (int l6 = 0; l6 < 64; l6++)
				he.hb(hf[l6]);

			for (int k9 = 0; k9 < 96; k9++) {
				for (int i12 = 0; i12 < 96; i12++)
					ff[k9][i12] = de(k9, i12);

			}

		}
		kf.fm();
		int i2 = 0x606060;
		for (int k2 = 0; k2 < 95; k2++) {
			for (int i3 = 0; i3 < 95; i3++) {
				int i4 = fd(k2, i3);
				if (i4 > 0 && (j.vn[i4 - 1] == 0 || fe)) {
					hd(kf, i4 - 1, k2, i3, k2 + 1, i3);
					if (flag && j.tn[i4 - 1] != 0) {
						ef[k2][i3] |= 1;
						if (i3 > 0)
							rd(k2, i3 - 1, 4);
					}
					if (flag)
						ge.sg(k2 * 3, i3 * 3, 3, i2);
				}
				i4 = he(k2, i3);
				if (i4 > 0 && (j.vn[i4 - 1] == 0 || fe)) {
					hd(kf, i4 - 1, k2, i3, k2, i3 + 1);
					if (flag && j.tn[i4 - 1] != 0) {
						ef[k2][i3] |= 2;
						if (k2 > 0)
							rd(k2 - 1, i3, 8);
					}
					if (flag)
						ge.kh(k2 * 3, i3 * 3, 3, i2);
				}
				i4 = ee(k2, i3);
				if (i4 > 0 && i4 < 12000 && (j.vn[i4 - 1] == 0 || fe)) {
					hd(kf, i4 - 1, k2, i3, k2 + 1, i3 + 1);
					if (flag && j.tn[i4 - 1] != 0)
						ef[k2][i3] |= 0x20;
					if (flag) {
						ge.xg(k2 * 3, i3 * 3, i2);
						ge.xg(k2 * 3 + 1, i3 * 3 + 1, i2);
						ge.xg(k2 * 3 + 2, i3 * 3 + 2, i2);
					}
				}
				if (i4 > 12000 && i4 < 24000 && (j.vn[i4 - 12001] == 0 || fe)) {
					hd(kf, i4 - 12001, k2 + 1, i3, k2, i3 + 1);
					if (flag && j.tn[i4 - 12001] != 0)
						ef[k2][i3] |= 0x10;
					if (flag) {
						ge.xg(k2 * 3 + 2, i3 * 3, i2);
						ge.xg(k2 * 3 + 1, i3 * 3 + 1, i2);
						ge.xg(k2 * 3, i3 * 3 + 2, i2);
					}
				}
			}

		}

		if (flag)
			ge.jg(ie - 1, 0, 0, 285, 285);
		kf.nm(false, 60, 24, -50, -10, -50);
		if (i1 == -1) return;
		_fldif[i1] = kf.mm(0, 0, 1536, 1536, 8, 64, 338, true);
		for (int j3 = 0; j3 < 64; j3++)
			he.hb(_fldif[i1][j3]);

		for (int j4 = 0; j4 < 95; j4++) {
			for (int j5 = 0; j5 < 95; j5++) {
				int i7 = fd(j4, j5);
				if (i7 > 0)
					ld(i7 - 1, j4, j5, j4 + 1, j5);
				i7 = he(j4, j5);
				if (i7 > 0)
					ld(i7 - 1, j4, j5, j4, j5 + 1);
				i7 = ee(j4, j5);
				if (i7 > 0 && i7 < 12000)
					ld(i7 - 1, j4, j5, j4 + 1, j5 + 1);
				if (i7 > 12000 && i7 < 24000)
					ld(i7 - 12001, j4 + 1, j5, j4, j5 + 1);
			}

		}

		for (int k5 = 1; k5 < 95; k5++) {
			for (int j7 = 1; j7 < 95; j7++) {
				int l9 = ge(k5, j7);
				if (l9 > 0) {
					int j12 = k5;
					int k14 = j7;
					int l16 = k5 + 1;
					int i19 = j7;
					int l19 = k5 + 1;
					int l21 = j7 + 1;
					int j23 = k5;
					int l23 = j7 + 1;
					int j24 = 0;
					int l24 = ff[j12][k14];
					int j25 = ff[l16][i19];
					int l25 = ff[l19][l21];
					int j26 = ff[j23][l23];
					if (l24 > 0x13880)
						l24 -= 0x13880;
					if (j25 > 0x13880)
						j25 -= 0x13880;
					if (l25 > 0x13880)
						l25 -= 0x13880;
					if (j26 > 0x13880)
						j26 -= 0x13880;
					if (l24 > j24)
						j24 = l24;
					if (j25 > j24)
						j24 = j25;
					if (l25 > j24)
						j24 = l25;
					if (j26 > j24)
						j24 = j26;
					if (j24 >= 0x13880)
						j24 -= 0x13880;
					if (l24 < 0x13880)
						ff[j12][k14] = j24;
					else
						ff[j12][k14] -= 0x13880;
					if (j25 < 0x13880)
						ff[l16][i19] = j24;
					else
						ff[l16][i19] -= 0x13880;
					if (l25 < 0x13880)
						ff[l19][l21] = j24;
					else
						ff[l19][l21] -= 0x13880;
					if (j26 < 0x13880)
						ff[j23][l23] = j24;
					else
						ff[j23][l23] -= 0x13880;
				}
			}

		}

		kf.fm();
		for (int k7 = 1; k7 < 95; k7++) {
			for (int i10 = 1; i10 < 95; i10++) {
				int k12 = ge(k7, i10);
				if (k12 > 0) {
					int l14 = k7;
					int i17 = i10;
					int j19 = k7 + 1;
					int i20 = i10;
					int i22 = k7 + 1;
					int k23 = i10 + 1;
					int i24 = k7;
					int k24 = i10 + 1;
					int i25 = k7 * 128;
					int k25 = i10 * 128;
					int i26 = i25 + 128;
					int k26 = k25 + 128;
					int l26 = i25;
					int i27 = k25;
					int j27 = i26;
					int k27 = k26;
					int l27 = ff[l14][i17];
					int i28 = ff[j19][i20];
					int j28 = ff[i22][k23];
					int k28 = ff[i24][k24];
					int l28 = j.yn[k12 - 1];
					if (zd(l14, i17) && l27 < 0x13880) {
						l27 += l28 + 0x13880;
						ff[l14][i17] = l27;
					}
					if (zd(j19, i20) && i28 < 0x13880) {
						i28 += l28 + 0x13880;
						ff[j19][i20] = i28;
					}
					if (zd(i22, k23) && j28 < 0x13880) {
						j28 += l28 + 0x13880;
						ff[i22][k23] = j28;
					}
					if (zd(i24, k24) && k28 < 0x13880) {
						k28 += l28 + 0x13880;
						ff[i24][k24] = k28;
					}
					if (l27 >= 0x13880)
						l27 -= 0x13880;
					if (i28 >= 0x13880)
						i28 -= 0x13880;
					if (j28 >= 0x13880)
						j28 -= 0x13880;
					if (k28 >= 0x13880)
						k28 -= 0x13880;
					byte byte0 = 16;
					if (!ae(l14 - 1, i17))
						i25 -= byte0;
					if (!ae(l14 + 1, i17))
						i25 += byte0;
					if (!ae(l14, i17 - 1))
						k25 -= byte0;
					if (!ae(l14, i17 + 1))
						k25 += byte0;
					if (!ae(j19 - 1, i20))
						i26 -= byte0;
					if (!ae(j19 + 1, i20))
						i26 += byte0;
					if (!ae(j19, i20 - 1))
						i27 -= byte0;
					if (!ae(j19, i20 + 1))
						i27 += byte0;
					if (!ae(i22 - 1, k23))
						j27 -= byte0;
					if (!ae(i22 + 1, k23))
						j27 += byte0;
					if (!ae(i22, k23 - 1))
						k26 -= byte0;
					if (!ae(i22, k23 + 1))
						k26 += byte0;
					if (!ae(i24 - 1, k24))
						l26 -= byte0;
					if (!ae(i24 + 1, k24))
						l26 += byte0;
					if (!ae(i24, k24 - 1))
						k27 -= byte0;
					if (!ae(i24, k24 + 1))
						k27 += byte0;
					k12 = j.ao[k12 - 1];
					l27 = -l27;
					i28 = -i28;
					j28 = -j28;
					k28 = -k28;
					if (ee(k7, i10) > 12000 && ee(k7, i10) < 24000 && ge(k7 - 1, i10 - 1) == 0) {
						int ai8[] = new int[3];
						ai8[0] = kf.em(j27, j28, k26);
						ai8[1] = kf.em(l26, k28, k27);
						ai8[2] = kf.em(i26, i28, i27);
						kf.gm(3, ai8, k12, 0xbc614e);
					} else
					if (ee(k7, i10) > 12000 && ee(k7, i10) < 24000 && ge(k7 + 1, i10 + 1) == 0) {
						int ai9[] = new int[3];
						ai9[0] = kf.em(i25, l27, k25);
						ai9[1] = kf.em(i26, i28, i27);
						ai9[2] = kf.em(l26, k28, k27);
						kf.gm(3, ai9, k12, 0xbc614e);
					} else
					if (ee(k7, i10) > 0 && ee(k7, i10) < 12000 && ge(k7 + 1, i10 - 1) == 0) {
						int ai10[] = new int[3];
						ai10[0] = kf.em(l26, k28, k27);
						ai10[1] = kf.em(i25, l27, k25);
						ai10[2] = kf.em(j27, j28, k26);
						kf.gm(3, ai10, k12, 0xbc614e);
					} else
					if (ee(k7, i10) > 0 && ee(k7, i10) < 12000 && ge(k7 - 1, i10 + 1) == 0) {
						int ai11[] = new int[3];
						ai11[0] = kf.em(i26, i28, i27);
						ai11[1] = kf.em(j27, j28, k26);
						ai11[2] = kf.em(i25, l27, k25);
						kf.gm(3, ai11, k12, 0xbc614e);
					} else
					if (l27 == i28 && j28 == k28) {
						int ai12[] = new int[4];
						ai12[0] = kf.em(i25, l27, k25);
						ai12[1] = kf.em(i26, i28, i27);
						ai12[2] = kf.em(j27, j28, k26);
						ai12[3] = kf.em(l26, k28, k27);
						kf.gm(4, ai12, k12, 0xbc614e);
					} else
					if (l27 == k28 && i28 == j28) {
						int ai13[] = new int[4];
						ai13[0] = kf.em(l26, k28, k27);
						ai13[1] = kf.em(i25, l27, k25);
						ai13[2] = kf.em(i26, i28, i27);
						ai13[3] = kf.em(j27, j28, k26);
						kf.gm(4, ai13, k12, 0xbc614e);
					} else {
						boolean flag1 = true;
						if (ge(k7 - 1, i10 - 1) > 0)
							flag1 = false;
						if (ge(k7 + 1, i10 + 1) > 0)
							flag1 = false;
						if (!flag1) {
							int ai14[] = new int[3];
							ai14[0] = kf.em(i26, i28, i27);
							ai14[1] = kf.em(j27, j28, k26);
							ai14[2] = kf.em(i25, l27, k25);
							kf.gm(3, ai14, k12, 0xbc614e);
							int ai16[] = new int[3];
							ai16[0] = kf.em(l26, k28, k27);
							ai16[1] = kf.em(i25, l27, k25);
							ai16[2] = kf.em(j27, j28, k26);
							kf.gm(3, ai16, k12, 0xbc614e);
						} else {
							int ai15[] = new int[3];
							ai15[0] = kf.em(i25, l27, k25);
							ai15[1] = kf.em(i26, i28, i27);
							ai15[2] = kf.em(l26, k28, k27);
							kf.gm(3, ai15, k12, 0xbc614e);
							int ai17[] = new int[3];
							ai17[0] = kf.em(j27, j28, k26);
							ai17[1] = kf.em(l26, k28, k27);
							ai17[2] = kf.em(i26, i28, i27);
							kf.gm(3, ai17, k12, 0xbc614e);
						}
					}
				}
			}

		}

		kf.nm(true, 50, 50, -50, -10, -50);
		jf[i1] = kf.mm(0, 0, 1536, 1536, 8, 64, 169, true);
		for (int j10 = 0; j10 < 64; j10++)
			he.hb(jf[i1][j10]);

		for (int l12 = 0; l12 < 96; l12++) {
			for (int i15 = 0; i15 < 96; i15++)
				if (ff[l12][i15] >= 0x13880)
					ff[l12][i15] -= 0x13880;

		}

	}

	public void yd(p ap[]) {
		for (int k = 0; k < ze - 2; k++) {
			for (int l = 0; l < af - 2; l++)
				if (ee(k, l) > 48000 && ee(k, l) < 60000) {
					int i1 = ee(k, l) - 48001;
					int j1 = td(k, l);
					int k1;
					int l1;
					if (j1 == 0 || j1 == 4) {
						k1 = j.gn[i1];
						l1 = j.hn[i1];
					} else {
						l1 = j.gn[i1];
						k1 = j.hn[i1];
					}
					jd(k, l, i1);
					p p1 = ap[j.fn[i1]].yl(false, true, false, false);
					int i2 = ((k + k + k1) * 128) / 2;
					int k2 = ((l + l + l1) * 128) / 2;
					p1.dm(i2, -vd(i2, k2), k2);
					p1.tl(0, td(k, l) * 32, 0);
					he.hb(p1);
					p1.nm(true, 48, 48, -50, -10, -50);
					if (k1 > 1 || l1 > 1) {
						for (int i3 = k; i3 < k + k1; i3++) {
							for (int j3 = l; j3 < l + l1; j3++)
								if ((i3 > k || j3 > l) && ee(i3, j3) - 48001 == i1) {
									int j2 = i3;
									int l2 = j3;
									byte byte0 = 0;
									if (j2 >= 48 && l2 < 48) {
										byte0 = 1;
										j2 -= 48;
									} else
									if (j2 < 48 && l2 >= 48) {
										byte0 = 2;
										l2 -= 48;
									} else
									if (j2 >= 48 && l2 >= 48) {
										byte0 = 3;
										j2 -= 48;
										l2 -= 48;
									}
									ye[byte0][j2 * 48 + l2] = 0;
								}

						}

					}
				}

		}

	}

	public void hd(p p1, int k, int l, int i1, int j1, int k1) {
		je(l, i1, 40);
		je(j1, k1, 40);
		int l1 = j.qn[k];
		int i2 = j.rn[k];
		int j2 = j.sn[k];
		int k2 = l * 128;
		int l2 = i1 * 128;
		int i3 = j1 * 128;
		int j3 = k1 * 128;
		int k3 = p1.em(k2, -ff[l][i1], l2);
		int l3 = p1.em(k2, -ff[l][i1] - l1, l2);
		int i4 = p1.em(i3, -ff[j1][k1] - l1, j3);
		int j4 = p1.em(i3, -ff[j1][k1], j3);
		int ai[] = {
			k3, l3, i4, j4
		};
		int k4 = p1.gm(4, ai, i2, j2);
		if (j.vn[k] == 5) {
			p1.qv[k4] = 30000 + k;
			return;
		} else {
			p1.qv[k4] = 0;
			return;
		}
	}

	public void ld(int k, int l, int i1, int j1, int k1) {
		int l1 = j.qn[k];
		if (ff[l][i1] < 0x13880)
			ff[l][i1] += 0x13880 + l1;
		if (ff[j1][k1] < 0x13880)
			ff[j1][k1] += 0x13880 + l1;
	}

	boolean ee;
	boolean fe;
	i ge;
	a he;
	int ie;
	final int je = 0xbc614e;
	final int ke = 128;
	int le[];
	int me;
	int ne[];
	int oe[];
	int pe[];
	byte qe[];
	byte re[][];
	byte se[][];
	byte te[][];
	byte ue[][];
	byte ve[][];
	byte we[][];
	byte xe[][];
	int ye[][];
	int ze;
	int af;
	int bf[];
	int cf[];
	int df[][];
	int ef[][];
	int ff[][];
	boolean gf;
	p hf[];
	p _fldif[][];
	p jf[][];
	p kf;
}
