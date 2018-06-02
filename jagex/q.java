// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb space 

package jagex;

import java.io.PrintStream;

// Referenced classes of package jagex:
//			h

public class q {

	public static int dn(byte abyte0[], int i, byte abyte1[], int j, int k) {
		h h1 = new h();
		h1.ah = abyte1;
		h1.bh = k;
		h1.fh = abyte0;
		h1.gh = 0;
		h1.ch = j;
		h1.hh = i;
		h1.oh = 0;
		h1.nh = 0;
		h1.dh = 0;
		h1.eh = 0;
		h1.ih = 0;
		h1.jh = 0;
		h1.qh = 0;
		bn(h1);
		i -= h1.hh;
		return i;
	}

	private static void xm(h h1) {
		byte byte4 = h1.kh;
		int i = h1.lh;
		int j = h1.vh;
		int k = h1.th;
		int ai[] = h.yh;
		int l = h1.sh;
		byte abyte0[] = h1.fh;
		int i1 = h1.gh;
		int j1 = h1.hh;
		int k1 = j1;
		int l1 = h1.mi + 1;
label0:
		do {
			if (i > 0) {
				do {
					if (j1 == 0)
						break label0;
					if (i == 1)
						break;
					abyte0[i1] = byte4;
					i--;
					i1++;
					j1--;
				} while (true);
				if (j1 == 0) {
					i = 1;
					break;
				}
				abyte0[i1] = byte4;
				i1++;
				j1--;
			}
			boolean flag = true;
			while (flag)  {
				flag = false;
				if (j == l1) {
					i = 0;
					break label0;
				}
				byte4 = (byte)k;
				l = ai[l];
				byte byte0 = (byte)(l & 0xff);
				l >>= 8;
				j++;
				if (byte0 != k) {
					k = byte0;
					if (j1 == 0) {
						i = 1;
					} else {
						abyte0[i1] = byte4;
						i1++;
						j1--;
						flag = true;
						continue;
					}
					break label0;
				}
				if (j != l1)
					continue;
				if (j1 == 0) {
					i = 1;
					break label0;
				}
				abyte0[i1] = byte4;
				i1++;
				j1--;
				flag = true;
			}
			i = 2;
			l = ai[l];
			byte byte1 = (byte)(l & 0xff);
			l >>= 8;
			if (++j != l1)
				if (byte1 != k) {
					k = byte1;
				} else {
					i = 3;
					l = ai[l];
					byte byte2 = (byte)(l & 0xff);
					l >>= 8;
					if (++j != l1)
						if (byte2 != k) {
							k = byte2;
						} else {
							l = ai[l];
							byte byte3 = (byte)(l & 0xff);
							l >>= 8;
							j++;
							i = (byte3 & 0xff) + 4;
							l = ai[l];
							k = (byte)(l & 0xff);
							l >>= 8;
							j++;
						}
				}
		} while (true);
		int i2 = h1.ih;
		h1.ih += k1 - j1;
		if (h1.ih < i2)
			h1.jh++;
		h1.kh = byte4;
		h1.lh = i;
		h1.vh = j;
		h1.th = k;
		h.yh = ai;
		h1.sh = l;
		h1.fh = abyte0;
		h1.gh = i1;
		h1.hh = j1;
	}

	private static void bn(h h1) {
		boolean flag = false;
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		boolean flag4 = false;
		boolean flag5 = false;
		boolean flag6 = false;
		boolean flag7 = false;
		boolean flag8 = false;
		boolean flag9 = false;
		boolean flag10 = false;
		boolean flag11 = false;
		boolean flag12 = false;
		boolean flag13 = false;
		boolean flag14 = false;
		boolean flag15 = false;
		boolean flag16 = false;
		boolean flag17 = false;
		boolean flag18 = false;
		int k8 = 0;
		int ai[] = null;
		int ai1[] = null;
		int ai2[] = null;
		h1.ph = 1;
		if (h.yh == null)
			h.yh = new int[h1.ph * 0x186a0];
		boolean flag19 = true;
		while (flag19)  {
			byte byte0 = zm(h1);
			if (byte0 == 23)
				return;
			byte0 = zm(h1);
			byte0 = zm(h1);
			byte0 = zm(h1);
			byte0 = zm(h1);
			byte0 = zm(h1);
			h1.qh++;
			byte0 = zm(h1);
			byte0 = zm(h1);
			byte0 = zm(h1);
			byte0 = zm(h1);
			byte0 = ym(h1);
			if (byte0 != 0)
				h1.mh = true;
			else
				h1.mh = false;
			if (h1.mh)
				System.out.println("PANIC! RANDOMISED BLOCK!");
			h1.rh = 0;
			byte0 = zm(h1);
			h1.rh = h1.rh << 8 | byte0 & 0xff;
			byte0 = zm(h1);
			h1.rh = h1.rh << 8 | byte0 & 0xff;
			byte0 = zm(h1);
			h1.rh = h1.rh << 8 | byte0 & 0xff;
			for (int j = 0; j < 16; j++) {
				byte byte1 = ym(h1);
				if (byte1 == 1)
					h1.bi[j] = true;
				else
					h1.bi[j] = false;
			}

			for (int k = 0; k < 256; k++)
				h1.ai[k] = false;

			for (int l = 0; l < 16; l++)
				if (h1.bi[l]) {
					for (int i3 = 0; i3 < 16; i3++) {
						byte byte2 = ym(h1);
						if (byte2 == 1)
							h1.ai[l * 16 + i3] = true;
					}

				}

			an(h1);
			int i4 = h1.zh + 2;
			int j4 = cn(3, h1);
			int k4 = cn(15, h1);
			for (int i1 = 0; i1 < k4; i1++) {
				int j3 = 0;
				do {
					byte byte3 = ym(h1);
					if (byte3 == 0)
						break;
					j3++;
				} while (true);
				h1.gi[i1] = (byte)j3;
			}

			byte abyte0[] = new byte[6];
			for (byte byte16 = 0; byte16 < j4; byte16++)
				abyte0[byte16] = byte16;

			for (int j1 = 0; j1 < k4; j1++) {
				byte byte17 = h1.gi[j1];
				byte byte15 = abyte0[byte17];
				for (; byte17 > 0; byte17--)
					abyte0[byte17] = abyte0[byte17 - 1];

				abyte0[0] = byte15;
				h1.fi[j1] = byte15;
			}

			for (int k3 = 0; k3 < j4; k3++) {
				int l6 = cn(5, h1);
				for (int k1 = 0; k1 < i4; k1++) {
					do {
						byte byte4 = ym(h1);
						if (byte4 == 0)
							break;
						byte4 = ym(h1);
						if (byte4 == 0)
							l6++;
						else
							l6--;
					} while (true);
					h1.hi[k3][k1] = (byte)l6;
				}

			}

			for (int l3 = 0; l3 < j4; l3++) {
				byte byte8 = 32;
				int i = 0;
				for (int l1 = 0; l1 < i4; l1++) {
					if (h1.hi[l3][l1] > i)
						i = h1.hi[l3][l1];
					if (h1.hi[l3][l1] < byte8)
						byte8 = h1.hi[l3][l1];
				}

				en(h1.ii[l3], h1.ji[l3], h1.ki[l3], h1.hi[l3], byte8, i, i4);
				h1.li[l3] = byte8;
			}

			int l4 = h1.zh + 1;
			int l5 = 0x186a0 * h1.ph;
			int i5 = -1;
			int j5 = 0;
			for (int i2 = 0; i2 <= 255; i2++)
				h1.uh[i2] = 0;

			int j9 = 4095;
			for (int l8 = 15; l8 >= 0; l8--) {
				for (int i9 = 15; i9 >= 0; i9--) {
					h1.di[j9] = (byte)(l8 * 16 + i9);
					j9--;
				}

				h1.ei[l8] = j9 + 1;
			}

			int i6 = 0;
			if (j5 == 0) {
				i5++;
				j5 = 50;
				byte byte12 = h1.fi[i5];
				k8 = h1.li[byte12];
				ai = h1.ii[byte12];
				ai2 = h1.ki[byte12];
				ai1 = h1.ji[byte12];
			}
			j5--;
			int i7 = k8;
			int l7;
			byte byte9;
			for (l7 = cn(i7, h1); l7 > ai[i7]; l7 = l7 << 1 | byte9) {
				i7++;
				byte9 = ym(h1);
			}

			for (int k5 = ai2[l7 - ai1[i7]]; k5 != l4;)
				if (k5 == 0 || k5 == 1) {
					int j6 = -1;
					int k6 = 1;
					do {
						if (k5 == 0)
							j6 += k6;
						else
						if (k5 == 1)
							j6 += 2 * k6;
						k6 *= 2;
						if (j5 == 0) {
							i5++;
							j5 = 50;
							byte byte13 = h1.fi[i5];
							k8 = h1.li[byte13];
							ai = h1.ii[byte13];
							ai2 = h1.ki[byte13];
							ai1 = h1.ji[byte13];
						}
						j5--;
						int j7 = k8;
						int i8;
						byte byte10;
						for (i8 = cn(j7, h1); i8 > ai[j7]; i8 = i8 << 1 | byte10) {
							j7++;
							byte10 = ym(h1);
						}

						k5 = ai2[i8 - ai1[j7]];
					} while (k5 == 0 || k5 == 1);
					j6++;
					byte byte5 = h1.ci[h1.di[h1.ei[0]] & 0xff];
					h1.uh[byte5 & 0xff] += j6;
					for (; j6 > 0; j6--) {
						h.yh[i6] = byte5 & 0xff;
						i6++;
					}

				} else {
					int j11 = k5 - 1;
					byte byte6;
					if (j11 < 16) {
						int j10 = h1.ei[0];
						byte6 = h1.di[j10 + j11];
						for (; j11 > 3; j11 -= 4) {
							int k11 = j10 + j11;
							h1.di[k11] = h1.di[k11 - 1];
							h1.di[k11 - 1] = h1.di[k11 - 2];
							h1.di[k11 - 2] = h1.di[k11 - 3];
							h1.di[k11 - 3] = h1.di[k11 - 4];
						}

						for (; j11 > 0; j11--)
							h1.di[j10 + j11] = h1.di[(j10 + j11) - 1];

						h1.di[j10] = byte6;
					} else {
						int l10 = j11 / 16;
						int i11 = j11 % 16;
						int k10 = h1.ei[l10] + i11;
						byte6 = h1.di[k10];
						for (; k10 > h1.ei[l10]; k10--)
							h1.di[k10] = h1.di[k10 - 1];

						h1.ei[l10]++;
						for (; l10 > 0; l10--) {
							h1.ei[l10]--;
							h1.di[h1.ei[l10]] = h1.di[(h1.ei[l10 - 1] + 16) - 1];
						}

						h1.ei[0]--;
						h1.di[h1.ei[0]] = byte6;
						if (h1.ei[0] == 0) {
							int i10 = 4095;
							for (int k9 = 15; k9 >= 0; k9--) {
								for (int l9 = 15; l9 >= 0; l9--) {
									h1.di[i10] = h1.di[h1.ei[k9] + l9];
									i10--;
								}

								h1.ei[k9] = i10 + 1;
							}

						}
					}
					h1.uh[h1.ci[byte6 & 0xff] & 0xff]++;
					h.yh[i6] = h1.ci[byte6 & 0xff] & 0xff;
					i6++;
					if (j5 == 0) {
						i5++;
						j5 = 50;
						byte byte14 = h1.fi[i5];
						k8 = h1.li[byte14];
						ai = h1.ii[byte14];
						ai2 = h1.ki[byte14];
						ai1 = h1.ji[byte14];
					}
					j5--;
					int k7 = k8;
					int j8;
					byte byte11;
					for (j8 = cn(k7, h1); j8 > ai[k7]; j8 = j8 << 1 | byte11) {
						k7++;
						byte11 = ym(h1);
					}

					k5 = ai2[j8 - ai1[k7]];
				}

			h1.lh = 0;
			h1.kh = 0;
			h1.wh[0] = 0;
			for (int j2 = 1; j2 <= 256; j2++)
				h1.wh[j2] = h1.uh[j2 - 1];

			for (int k2 = 1; k2 <= 256; k2++)
				h1.wh[k2] += h1.wh[k2 - 1];

			for (int l2 = 0; l2 < i6; l2++) {
				byte byte7 = (byte)(h.yh[l2] & 0xff);
				h.yh[h1.wh[byte7 & 0xff]] |= l2 << 8;
				h1.wh[byte7 & 0xff]++;
			}

			h1.sh = h.yh[h1.rh] >> 8;
			h1.vh = 0;
			h1.sh = h.yh[h1.sh];
			h1.th = (byte)(h1.sh & 0xff);
			h1.sh >>= 8;
			h1.vh++;
			h1.mi = i6;
			xm(h1);
			if (h1.vh == h1.mi + 1 && h1.lh == 0)
				flag19 = true;
			else
				flag19 = false;
		}
	}

	private static byte zm(h h1) {
		return (byte)cn(8, h1);
	}

	private static byte ym(h h1) {
		return (byte)cn(1, h1);
	}

	private static int cn(int i, h h1) {
		int j;
		do {
			if (h1.oh >= i) {
				int k = h1.nh >> h1.oh - i & (1 << i) - 1;
				h1.oh -= i;
				j = k;
				break;
			}
			h1.nh = h1.nh << 8 | h1.ah[h1.bh] & 0xff;
			h1.oh += 8;
			h1.bh++;
			h1.ch--;
			h1.dh++;
			if (h1.dh == 0)
				h1.eh++;
		} while (true);
		return j;
	}

	private static int wm(int i, int ai[]) {
		int j = 0;
		int k = 256;
		do {
			int l = j + k >> 1;
			if (i >= ai[l])
				j = l;
			else
				k = l;
		} while (k - j != 1);
		return j;
	}

	private static void an(h h1) {
		h1.zh = 0;
		for (int i = 0; i < 256; i++)
			if (h1.ai[i]) {
				h1.ci[h1.zh] = (byte)i;
				h1.zh++;
			}

	}

	private static void en(int ai[], int ai1[], int ai2[], byte abyte0[], int i, int j, int k) {
		int l = 0;
		for (int i1 = i; i1 <= j; i1++) {
			for (int l2 = 0; l2 < k; l2++)
				if (abyte0[l2] == i1) {
					ai2[l] = l2;
					l++;
				}

		}

		for (int j1 = 0; j1 < 23; j1++)
			ai1[j1] = 0;

		for (int k1 = 0; k1 < k; k1++)
			ai1[abyte0[k1] + 1]++;

		for (int l1 = 1; l1 < 23; l1++)
			ai1[l1] += ai1[l1 - 1];

		for (int i2 = 0; i2 < 23; i2++)
			ai[i2] = 0;

		int i3 = 0;
		for (int j2 = i; j2 <= j; j2++) {
			i3 += ai1[j2 + 1] - ai1[j2];
			ai[j2] = i3 - 1;
			i3 <<= 1;
		}

		for (int k2 = i + 1; k2 <= j; k2++)
			ai1[k2] = (ai[k2 - 1] + 1 << 1) - ai1[k2];

	}

	public q() {
	}

	static final int sx = 1;
	static final int tx = 2;
	static final int ux = 10;
	static final int vx = 14;
	static final int wx = 0;
	static final int xx = 4;
	static final int yx = 4096;
	static final int zx = 16;
	static final int ay = 258;
	static final int by = 23;
	static final int cy = 0;
	static final int dy = 1;
	static final int ey = 6;
	static final int fy = 50;
	static final int gy = 4;
	static final int hy = 18002;
}
