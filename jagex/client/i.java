// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb space 

package jagex.client;

import java.awt.*;
import java.awt.image.*;
import java.io.PrintStream;

public class i
	implements ImageProducer, ImageObserver {

	public i(int j, int k, int l, Component component) {
		hj = true;
		mj = false;
		qj = false;
		vi = component;
		jj = k;
		lj = j;
		qi = ni = j;
		ri = oi = k;
		pi = j * k;
		ti = new int[j * k];
		xi = new int[l][];
		gj = new boolean[l];
		yi = new byte[l][];
		zi = new int[l][];
		aj = new int[l];
		bj = new int[l];
		ej = new int[l];
		fj = new int[l];
		cj = new int[l];
		dj = new int[l];
		if (j > 1 && k > 1 && component != null) {
			si = new DirectColorModel(32, 0xff0000, 65280, 255);
			int i1 = ni * oi;
			for (int j1 = 0; j1 < i1; j1++)
				ti[j1] = 0;

			wi = component.createImage(this);
			dh();
			component.prepareImage(wi, component);
			dh();
			component.prepareImage(wi, component);
			dh();
			component.prepareImage(wi, component);
		}
	}

	public synchronized void mh(int j, int k) {
		if (ni > qi)
			ni = qi;
		if (oi > ri)
			oi = ri;
		ni = j;
		oi = k;
		pi = j * k;
	}

	public synchronized void addConsumer(ImageConsumer imageconsumer) {
		ui = imageconsumer;
		imageconsumer.setDimensions(ni, oi);
		imageconsumer.setProperties(null);
		imageconsumer.setColorModel(si);
		imageconsumer.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer imageconsumer) {
		return ui == imageconsumer;
	}

	public synchronized void removeConsumer(ImageConsumer imageconsumer) {
		if (ui == imageconsumer)
			ui = null;
	}

	public void startProduction(ImageConsumer imageconsumer) {
		addConsumer(imageconsumer);
	}

	public void requestTopDownLeftRightResend(ImageConsumer imageconsumer) {
		System.out.println("TDLR");
	}

	public synchronized void dh() {
		if (ui == null) {
			return;
		} else {
			ui.setPixels(0, 0, ni, oi, si, ti, 0, ni);
			ui.imageComplete(2);
			return;
		}
	}

	public void ch(int j, int k, int l, int i1) {
		if (j < 0)
			j = 0;
		if (k < 0)
			k = 0;
		if (l > ni)
			l = ni;
		if (i1 > oi)
			i1 = oi;
		kj = j;
		ij = k;
		lj = l;
		jj = i1;
	}

	public void pf() {
		kj = 0;
		ij = 0;
		lj = ni;
		jj = oi;
	}

	public void dg(Graphics g, int j, int k) {
		dh();
		g.drawImage(wi, j, k, this);
	}

	public void zf() {
		int j = ni * oi;
		if (!mj) {
			for (int k = 0; k < j; k++)
				ti[k] = 0;

			return;
		}
		int l = 0;
		for (int i1 = -oi; i1 < 0; i1 += 2) {
			for (int j1 = -ni; j1 < 0; j1++)
				ti[l++] = 0;

			l += ni;
		}

	}

	public void nh(int j, int k, int l, int i1, int j1) {
		int k1 = 256 - j1;
		int l1 = (i1 >> 16 & 0xff) * j1;
		int i2 = (i1 >> 8 & 0xff) * j1;
		int j2 = (i1 & 0xff) * j1;
		int j3 = k - l;
		if (j3 < 0)
			j3 = 0;
		int k3 = k + l;
		if (k3 >= oi)
			k3 = oi - 1;
		byte byte0 = 1;
		if (mj) {
			byte0 = 2;
			if ((j3 & 1) != 0)
				j3++;
		}
		for (int l3 = j3; l3 <= k3; l3 += byte0) {
			int i4 = l3 - k;
			int j4 = (int)Math.sqrt(l * l - i4 * i4);
			int k4 = j - j4;
			if (k4 < 0)
				k4 = 0;
			int l4 = j + j4;
			if (l4 >= ni)
				l4 = ni - 1;
			int i5 = k4 + l3 * ni;
			for (int j5 = k4; j5 <= l4; j5++) {
				int k2 = (ti[i5] >> 16 & 0xff) * k1;
				int l2 = (ti[i5] >> 8 & 0xff) * k1;
				int i3 = (ti[i5] & 0xff) * k1;
				int k5 = ((l1 + k2 >> 8) << 16) + ((i2 + l2 >> 8) << 8) + (j2 + i3 >> 8);
				ti[i5++] = k5;
			}

		}

	}

	public void fh(int j, int k, int l, int i1, int j1, int k1) {
		if (j < kj) {
			l -= kj - j;
			j = kj;
		}
		if (k < ij) {
			i1 -= ij - k;
			k = ij;
		}
		if (j + l > lj)
			l = lj - j;
		if (k + i1 > jj)
			i1 = jj - k;
		int l1 = 256 - k1;
		int i2 = (j1 >> 16 & 0xff) * k1;
		int j2 = (j1 >> 8 & 0xff) * k1;
		int k2 = (j1 & 0xff) * k1;
		int k3 = ni - l;
		byte byte0 = 1;
		if (mj) {
			byte0 = 2;
			k3 += ni;
			if ((k & 1) != 0) {
				k++;
				i1--;
			}
		}
		int l3 = j + k * ni;
		for (int i4 = 0; i4 < i1; i4 += byte0) {
			for (int j4 = -l; j4 < 0; j4++) {
				int l2 = (ti[l3] >> 16 & 0xff) * l1;
				int i3 = (ti[l3] >> 8 & 0xff) * l1;
				int j3 = (ti[l3] & 0xff) * l1;
				int k4 = ((i2 + l2 >> 8) << 16) + ((j2 + i3 >> 8) << 8) + (k2 + j3 >> 8);
				ti[l3++] = k4;
			}

			l3 += k3;
		}

	}

	public void ih(int j, int k, int l, int i1, int j1, int k1) {
		if (j < kj) {
			l -= kj - j;
			j = kj;
		}
		if (j + l > lj)
			l = lj - j;
		int l1 = k1 >> 16 & 0xff;
		int i2 = k1 >> 8 & 0xff;
		int j2 = k1 & 0xff;
		int k2 = j1 >> 16 & 0xff;
		int l2 = j1 >> 8 & 0xff;
		int i3 = j1 & 0xff;
		int j3 = ni - l;
		byte byte0 = 1;
		if (mj) {
			byte0 = 2;
			j3 += ni;
			if ((k & 1) != 0) {
				k++;
				i1--;
			}
		}
		int k3 = j + k * ni;
		for (int l3 = 0; l3 < i1; l3 += byte0)
			if (l3 + k >= ij && l3 + k < jj) {
				int i4 = ((l1 * l3 + k2 * (i1 - l3)) / i1 << 16) + ((i2 * l3 + l2 * (i1 - l3)) / i1 << 8) + (j2 * l3 + i3 * (i1 - l3)) / i1;
				for (int j4 = -l; j4 < 0; j4++)
					ti[k3++] = i4;

				k3 += j3;
			} else {
				k3 += ni;
			}

	}

	public void rg(int j, int k, int l, int i1, int j1) {
		if (j < kj) {
			l -= kj - j;
			j = kj;
		}
		if (k < ij) {
			i1 -= ij - k;
			k = ij;
		}
		if (j + l > lj)
			l = lj - j;
		if (k + i1 > jj)
			i1 = jj - k;
		int k1 = ni - l;
		byte byte0 = 1;
		if (mj) {
			byte0 = 2;
			k1 += ni;
			if ((k & 1) != 0) {
				k++;
				i1--;
			}
		}
		int l1 = j + k * ni;
		for (int i2 = -i1; i2 < 0; i2 += byte0) {
			for (int j2 = -l; j2 < 0; j2++)
				ti[l1++] = j1;

			l1 += k1;
		}

	}

	public void ag(int j, int k, int l, int i1, int j1) {
		sg(j, k, l, j1);
		sg(j, (k + i1) - 1, l, j1);
		kh(j, k, i1, j1);
		kh((j + l) - 1, k, i1, j1);
	}

	public void sg(int j, int k, int l, int i1) {
		if (k < ij || k >= jj)
			return;
		if (j < kj) {
			l -= kj - j;
			j = kj;
		}
		if (j + l > lj)
			l = lj - j;
		int j1 = j + k * ni;
		for (int k1 = 0; k1 < l; k1++)
			ti[j1 + k1] = i1;

	}

	public void kh(int j, int k, int l, int i1) {
		if (j < kj || j >= lj)
			return;
		if (k < ij) {
			l -= ij - k;
			k = ij;
		}
		if (k + l > lj)
			l = jj - k;
		int j1 = j + k * ni;
		for (int k1 = 0; k1 < l; k1++)
			ti[j1 + k1 * ni] = i1;

	}

	public void xg(int j, int k, int l) {
		if (j < kj || k < ij || j >= lj || k >= jj) {
			return;
		} else {
			ti[j + k * ni] = l;
			return;
		}
	}

	public void ig() {
		int l = ni * oi;
		for (int k = 0; k < l; k++) {
			int j = ti[k] & 0xffffff;
			ti[k] = (j >>> 1 & 0x7f7f7f) + (j >>> 2 & 0x3f3f3f) + (j >>> 3 & 0x1f1f1f) + (j >>> 4 & 0xf0f0f);
		}

	}

	public void og(int j, int k, int l, int i1, int j1, int k1) {
		for (int l1 = l; l1 < l + j1; l1++) {
			for (int i2 = i1; i2 < i1 + k1; i2++) {
				int j2 = 0;
				int k2 = 0;
				int l2 = 0;
				int i3 = 0;
				for (int j3 = l1 - j; j3 <= l1 + j; j3++)
					if (j3 >= 0 && j3 < ni) {
						for (int k3 = i2 - k; k3 <= i2 + k; k3++)
							if (k3 >= 0 && k3 < oi) {
								int l3 = ti[j3 + ni * k3];
								j2 += l3 >> 16 & 0xff;
								k2 += l3 >> 8 & 0xff;
								l2 += l3 & 0xff;
								i3++;
							}

					}

				ti[l1 + ni * i2] = (j2 / i3 << 16) + (k2 / i3 << 8) + l2 / i3;
			}

		}

	}

	public static int qg(int j, int k, int l) {
		return (j << 16) + (k << 8) + l;
	}

	public void wg() {
		for (int j = 0; j < xi.length; j++) {
			xi[j] = null;
			aj[j] = 0;
			bj[j] = 0;
			yi[j] = null;
			zi[j] = null;
		}

	}

	public void pg(byte abyte0[], int j, int k, boolean flag, boolean flag1) {
		eh(abyte0, j, k, flag, 1, 1, flag1);
	}

	public void mg(byte abyte0[], int j, int k, boolean flag, int l, boolean flag1) {
		eh(abyte0, j, k, flag, l, 1, flag1);
	}

	public void eh(byte abyte0[], int j, int k, boolean flag, int l, int i1, boolean flag1) {
		int j1 = (abyte0[13 + j] & 0xff) * 256 + (abyte0[12 + j] & 0xff);
		int k1 = (abyte0[15 + j] & 0xff) * 256 + (abyte0[14 + j] & 0xff);
		int l1 = -1;
		int ai[] = new int[256];
		for (int i2 = 0; i2 < 256; i2++) {
			ai[i2] = 0xff000000 + ((abyte0[j + 20 + i2 * 3] & 0xff) << 16) + ((abyte0[j + 19 + i2 * 3] & 0xff) << 8) + (abyte0[j + 18 + i2 * 3] & 0xff);
			if (ai[i2] == -65281)
				l1 = i2;
		}

		if (l1 == -1)
			flag = false;
		if (flag1 && flag)
			ai[l1] = ai[0];
		int j2 = j1 / l;
		int k2 = k1 / i1;
		int ai1[] = new int[j2 * k2];
		for (int l2 = 0; l2 < i1; l2++) {
			for (int i3 = 0; i3 < l; i3++) {
				int j3 = 0;
				for (int k3 = k2 * l2; k3 < k2 * (l2 + 1); k3++) {
					for (int l3 = j2 * i3; l3 < j2 * (i3 + 1); l3++)
						if (flag1)
							ai1[j3++] = abyte0[j + 786 + l3 + (k1 - k3 - 1) * j1] & 0xff;
						else
							ai1[j3++] = ai[abyte0[j + 786 + l3 + (k1 - k3 - 1) * j1] & 0xff];

				}

				if (flag1)
					tf(ai1, j2, k2, k++, flag, ai, l1);
				else
					tf(ai1, j2, k2, k++, flag, null, -65281);
			}

		}

	}

	private void tf(int ai[], int j, int k, int l, boolean flag, int ai1[], int i1) {
		int j1 = 0;
		int k1 = 0;
		int l1 = j;
		int i2 = k;
		if (flag && hj) {
label0:
			for (int j2 = 0; j2 < k; j2++) {
				for (int i3 = 0; i3 < j; i3++) {
					int i4 = ai[i3 + j2 * j];
					if (i4 == i1)
						continue;
					k1 = j2;
					break label0;
				}

			}

label1:
			for (int j3 = 0; j3 < j; j3++) {
				for (int j4 = 0; j4 < k; j4++) {
					int j5 = ai[j3 + j4 * j];
					if (j5 == i1)
						continue;
					j1 = j3;
					break label1;
				}

			}

label2:
			for (int k4 = k - 1; k4 >= 0; k4--) {
				for (int k5 = 0; k5 < j; k5++) {
					int k6 = ai[k5 + k4 * j];
					if (k6 == i1)
						continue;
					i2 = k4 + 1;
					break label2;
				}

			}

label3:
			for (int l5 = j - 1; l5 >= 0; l5--) {
				for (int l6 = 0; l6 < k; l6++) {
					int i7 = ai[l5 + l6 * j];
					if (i7 == i1)
						continue;
					l1 = l5 + 1;
					break label3;
				}

			}

		}
		aj[l] = l1 - j1;
		bj[l] = i2 - k1;
		gj[l] = flag;
		cj[l] = j1;
		dj[l] = k1;
		ej[l] = j;
		fj[l] = k;
		if (ai1 == null) {
			xi[l] = new int[(l1 - j1) * (i2 - k1)];
			int k2 = 0;
			for (int k3 = k1; k3 < i2; k3++) {
				for (int l4 = j1; l4 < l1; l4++) {
					int i6 = ai[l4 + k3 * j];
					if (flag) {
						if (i6 == i1)
							i6 = 0;
						if (i6 == 0xff000000)
							i6 = 0xff010101;
					}
					xi[l][k2++] = i6 & 0xffffff;
				}

			}

			return;
		}
		yi[l] = new byte[(l1 - j1) * (i2 - k1)];
		zi[l] = ai1;
		int l2 = 0;
		for (int l3 = k1; l3 < i2; l3++) {
			for (int i5 = j1; i5 < l1; i5++) {
				int j6 = ai[i5 + l3 * j];
				if (flag)
					if (j6 == i1)
						j6 = 0;
					else
					if (j6 == 0)
						j6 = i1;
				yi[l][l2++] = (byte)j6;
			}

		}

	}

	public void cg(int j, int k, int l, int i1, int j1) {
		int ai[] = new int[32768];
		int k1 = k + l * ni;
		for (int l1 = l; l1 < l + j1; l1++) {
			for (int i2 = k; i2 < k + i1; i2++) {
				int j2 = ti[k1++];
				ai[((j2 & 0xf80000) >> 9) + ((j2 & 0xf800) >> 6) + ((j2 & 0xf8) >> 3)]++;
			}

			k1 += ni - i1;
		}

		int ai1[] = new int[256];
		int ai2[] = new int[256];
		for (int k2 = 0; k2 < 32768; k2++) {
			int l2 = ai[k2];
			if (l2 > ai2[255]) {
				for (int j3 = 1; j3 < 256; j3++) {
					if (l2 <= ai2[j3])
						continue;
					for (int k3 = 255; k3 > j3; k3--) {
						ai1[k3] = ai1[k3 - 1];
						ai2[k3] = ai2[k3 - 1];
					}

					ai1[j3] = ((k2 & 0x7c00) << 9) + ((k2 & 0x3e0) << 6) + ((k2 & 0x1f) << 3) + 0x40404;
					ai2[j3] = l2;
					break;
				}

			}
			ai[k2] = 0;
		}

		int i3 = i1 * j1;
		k1 = 0;
		byte abyte0[] = new byte[i3];
		for (int l3 = l; l3 < l + j1; l3++) {
			for (int i4 = k; i4 < k + i1; i4++) {
				int j4 = ti[i4 + l3 * ni];
				int k4 = ((j4 & 0xf80000) >> 9) + ((j4 & 0xf800) >> 6) + ((j4 & 0xf8) >> 3);
				int l4 = ai[k4];
				if (l4 == 0) {
					int i5 = 0x3b9ac9ff;
					int j5 = j4 >> 16 & 0xff;
					int k5 = j4 >> 8 & 0xff;
					int l5 = j4 & 0xff;
					for (int i6 = 1; i6 < 256; i6++) {
						int j6 = ai1[i6];
						int k6 = j6 >> 16 & 0xff;
						int l6 = j6 >> 8 & 0xff;
						int i7 = j6 & 0xff;
						int j7 = (j5 - k6) * (j5 - k6) + (k5 - l6) * (k5 - l6) + (l5 - i7) * (l5 - i7);
						if (j7 < i5) {
							i5 = j7;
							l4 = i6;
						}
					}

					ai[k4] = l4;
				}
				abyte0[k1++] = (byte)l4;
			}

		}

		aj[j] = i1;
		bj[j] = j1;
		gj[j] = false;
		cj[j] = 0;
		dj[j] = 0;
		ej[j] = i1;
		fj[j] = j1;
		yi[j] = abyte0;
		zi[j] = ai1;
		xi[j] = null;
	}

	public void jg(int j, int k, int l, int i1, int j1) {
		aj[j] = i1;
		bj[j] = j1;
		gj[j] = false;
		cj[j] = 0;
		dj[j] = 0;
		ej[j] = i1;
		fj[j] = j1;
		int k1 = i1 * j1;
		int l1 = 0;
		xi[j] = new int[k1];
		for (int i2 = k; i2 < k + i1; i2++) {
			for (int j2 = l; j2 < l + j1; j2++)
				xi[j][l1++] = ti[i2 + j2 * ni];

		}

	}

	public void qf(int j, int k, int l) {
		if (gj[l]) {
			j += cj[l];
			k += dj[l];
		}
		int i1 = j + k * ni;
		int j1 = 0;
		int k1 = bj[l];
		int l1 = aj[l];
		int i2 = ni - l1;
		int j2 = 0;
		if (k < ij) {
			int k2 = ij - k;
			k1 -= k2;
			k = ij;
			j1 += k2 * l1;
			i1 += k2 * ni;
		}
		if (k + k1 >= jj)
			k1 -= ((k + k1) - jj) + 1;
		if (j < kj) {
			int l2 = kj - j;
			l1 -= l2;
			j = kj;
			j1 += l2;
			i1 += l2;
			j2 += l2;
			i2 += l2;
		}
		if (j + l1 >= lj) {
			int i3 = ((j + l1) - lj) + 1;
			l1 -= i3;
			j2 += i3;
			i2 += i3;
		}
		if (l1 <= 0 || k1 <= 0)
			return;
		byte byte0 = 1;
		if (mj) {
			byte0 = 2;
			i2 += ni;
			j2 += aj[l];
			if ((k & 1) != 0) {
				i1 += ni;
				k1--;
			}
		}
		if (xi[l] == null) {
			xf(ti, yi[l], zi[l], j1, i1, l1, k1, i2, j2, byte0);
			return;
		} else {
			lg(ti, xi[l], 0, j1, i1, l1, k1, i2, j2, byte0);
			return;
		}
	}

	public void ug(int j, int k, int l, int i1, int j1) {
		try {
			int k1 = aj[j1];
			int l1 = bj[j1];
			int i2 = 0;
			int j2 = 0;
			int k2 = (k1 << 16) / l;
			int l2 = (l1 << 16) / i1;
			if (gj[j1]) {
				int i3 = ej[j1];
				int k3 = fj[j1];
				k2 = (i3 << 16) / l;
				l2 = (k3 << 16) / i1;
				j += ((cj[j1] * l + i3) - 1) / i3;
				k += ((dj[j1] * i1 + k3) - 1) / k3;
				if ((cj[j1] * l) % i3 != 0)
					i2 = (i3 - (cj[j1] * l) % i3 << 16) / l;
				if ((dj[j1] * i1) % k3 != 0)
					j2 = (k3 - (dj[j1] * i1) % k3 << 16) / i1;
				l = (l * (aj[j1] - (i2 >> 16))) / i3;
				i1 = (i1 * (bj[j1] - (j2 >> 16))) / k3;
			}
			int j3 = j + k * ni;
			int l3 = ni - l;
			if (k < ij) {
				int i4 = ij - k;
				i1 -= i4;
				k = 0;
				j3 += i4 * ni;
				j2 += l2 * i4;
			}
			if (k + i1 >= jj)
				i1 -= ((k + i1) - jj) + 1;
			if (j < kj) {
				int j4 = kj - j;
				l -= j4;
				j = 0;
				j3 += j4;
				i2 += k2 * j4;
				l3 += j4;
			}
			if (j + l >= lj) {
				int k4 = ((j + l) - lj) + 1;
				l -= k4;
				l3 += k4;
			}
			byte byte0 = 1;
			if (mj) {
				byte0 = 2;
				l3 += ni;
				l2 += l2;
				if ((k & 1) != 0) {
					j3 += ni;
					i1--;
				}
			}
			bg(ti, xi[j1], 0, i2, j2, j3, l3, l, i1, k2, l2, k1, byte0);
			return;
		}
		catch (Exception _ex) {
			System.out.println("error in sprite clipping routine");
		}
	}

	public void gg(int j, int k, int l, int i1) {
		if (gj[l]) {
			j += cj[l];
			k += dj[l];
		}
		int j1 = j + k * ni;
		int k1 = 0;
		int l1 = bj[l];
		int i2 = aj[l];
		int j2 = ni - i2;
		int k2 = 0;
		if (k < ij) {
			int l2 = ij - k;
			l1 -= l2;
			k = ij;
			k1 += l2 * i2;
			j1 += l2 * ni;
		}
		if (k + l1 >= jj)
			l1 -= ((k + l1) - jj) + 1;
		if (j < kj) {
			int i3 = kj - j;
			i2 -= i3;
			j = kj;
			k1 += i3;
			j1 += i3;
			k2 += i3;
			j2 += i3;
		}
		if (j + i2 >= lj) {
			int j3 = ((j + i2) - lj) + 1;
			i2 -= j3;
			k2 += j3;
			j2 += j3;
		}
		if (i2 <= 0 || l1 <= 0)
			return;
		byte byte0 = 1;
		if (mj) {
			byte0 = 2;
			j2 += ni;
			k2 += aj[l];
			if ((k & 1) != 0) {
				j1 += ni;
				l1--;
			}
		}
		if (xi[l] == null) {
			vg(ti, yi[l], zi[l], k1, j1, i2, l1, j2, k2, byte0, i1);
			return;
		} else {
			sf(ti, xi[l], 0, k1, j1, i2, l1, j2, k2, byte0, i1);
			return;
		}
	}

	public void yf(int j, int k, int l, int i1, int j1, int k1) {
		try {
			int l1 = aj[j1];
			int i2 = bj[j1];
			int j2 = 0;
			int k2 = 0;
			int l2 = (l1 << 16) / l;
			int i3 = (i2 << 16) / i1;
			if (gj[j1]) {
				int j3 = ej[j1];
				int l3 = fj[j1];
				l2 = (j3 << 16) / l;
				i3 = (l3 << 16) / i1;
				j += ((cj[j1] * l + j3) - 1) / j3;
				k += ((dj[j1] * i1 + l3) - 1) / l3;
				if ((cj[j1] * l) % j3 != 0)
					j2 = (j3 - (cj[j1] * l) % j3 << 16) / l;
				if ((dj[j1] * i1) % l3 != 0)
					k2 = (l3 - (dj[j1] * i1) % l3 << 16) / i1;
				l = (l * (aj[j1] - (j2 >> 16))) / j3;
				i1 = (i1 * (bj[j1] - (k2 >> 16))) / l3;
			}
			int k3 = j + k * ni;
			int i4 = ni - l;
			if (k < ij) {
				int j4 = ij - k;
				i1 -= j4;
				k = 0;
				k3 += j4 * ni;
				k2 += i3 * j4;
			}
			if (k + i1 >= jj)
				i1 -= ((k + i1) - jj) + 1;
			if (j < kj) {
				int k4 = kj - j;
				l -= k4;
				j = 0;
				k3 += k4;
				j2 += l2 * k4;
				i4 += k4;
			}
			if (j + l >= lj) {
				int l4 = ((j + l) - lj) + 1;
				l -= l4;
				i4 += l4;
			}
			byte byte0 = 1;
			if (mj) {
				byte0 = 2;
				i4 += ni;
				i3 += i3;
				if ((k & 1) != 0) {
					k3 += ni;
					i1--;
				}
			}
			vf(ti, xi[j1], 0, j2, k2, k3, i4, l, i1, l2, i3, l1, byte0, k1);
			return;
		}
		catch (Exception _ex) {
			System.out.println("error in sprite clipping routine");
		}
	}

	public void hh(int j, int k, int l, int i1, int j1, int k1) {
		try {
			int l1 = aj[j1];
			int i2 = bj[j1];
			int j2 = 0;
			int k2 = 0;
			int l2 = (l1 << 16) / l;
			int i3 = (i2 << 16) / i1;
			if (gj[j1]) {
				int j3 = ej[j1];
				int l3 = fj[j1];
				l2 = (j3 << 16) / l;
				i3 = (l3 << 16) / i1;
				j += ((cj[j1] * l + j3) - 1) / j3;
				k += ((dj[j1] * i1 + l3) - 1) / l3;
				if ((cj[j1] * l) % j3 != 0)
					j2 = (j3 - (cj[j1] * l) % j3 << 16) / l;
				if ((dj[j1] * i1) % l3 != 0)
					k2 = (l3 - (dj[j1] * i1) % l3 << 16) / i1;
				l = (l * (aj[j1] - (j2 >> 16))) / j3;
				i1 = (i1 * (bj[j1] - (k2 >> 16))) / l3;
			}
			int k3 = j + k * ni;
			int i4 = ni - l;
			if (k < ij) {
				int j4 = ij - k;
				i1 -= j4;
				k = 0;
				k3 += j4 * ni;
				k2 += i3 * j4;
			}
			if (k + i1 >= jj)
				i1 -= ((k + i1) - jj) + 1;
			if (j < kj) {
				int k4 = kj - j;
				l -= k4;
				j = 0;
				k3 += k4;
				j2 += l2 * k4;
				i4 += k4;
			}
			if (j + l >= lj) {
				int l4 = ((j + l) - lj) + 1;
				l -= l4;
				i4 += l4;
			}
			byte byte0 = 1;
			if (mj) {
				byte0 = 2;
				i4 += ni;
				i3 += i3;
				if ((k & 1) != 0) {
					k3 += ni;
					i1--;
				}
			}
			wf(ti, xi[j1], 0, j2, k2, k3, i4, l, i1, l2, i3, l1, byte0, k1);
			return;
		}
		catch (Exception _ex) {
			System.out.println("error in sprite clipping routine");
		}
	}

	private void lg(int ai[], int ai1[], int j, int k, int l, int i1, int j1, 
			int k1, int l1, int i2) {
		int j2 = -(i1 >> 2);
		i1 = -(i1 & 3);
		for (int k2 = -j1; k2 < 0; k2 += i2) {
			for (int l2 = j2; l2 < 0; l2++) {
				j = ai1[k++];
				if (j != 0)
					ai[l++] = j;
				else
					l++;
				j = ai1[k++];
				if (j != 0)
					ai[l++] = j;
				else
					l++;
				j = ai1[k++];
				if (j != 0)
					ai[l++] = j;
				else
					l++;
				j = ai1[k++];
				if (j != 0)
					ai[l++] = j;
				else
					l++;
			}

			for (int i3 = i1; i3 < 0; i3++) {
				j = ai1[k++];
				if (j != 0)
					ai[l++] = j;
				else
					l++;
			}

			l += k1;
			k += l1;
		}

	}

	private void xf(int ai[], byte abyte0[], int ai1[], int j, int k, int l, int i1, 
			int j1, int k1, int l1) {
		int i2 = -(l >> 2);
		l = -(l & 3);
		for (int j2 = -i1; j2 < 0; j2 += l1) {
			for (int k2 = i2; k2 < 0; k2++) {
				byte byte0 = abyte0[j++];
				if (byte0 != 0)
					ai[k++] = ai1[byte0 & 0xff];
				else
					k++;
				byte0 = abyte0[j++];
				if (byte0 != 0)
					ai[k++] = ai1[byte0 & 0xff];
				else
					k++;
				byte0 = abyte0[j++];
				if (byte0 != 0)
					ai[k++] = ai1[byte0 & 0xff];
				else
					k++;
				byte0 = abyte0[j++];
				if (byte0 != 0)
					ai[k++] = ai1[byte0 & 0xff];
				else
					k++;
			}

			for (int l2 = l; l2 < 0; l2++) {
				byte byte1 = abyte0[j++];
				if (byte1 != 0)
					ai[k++] = ai1[byte1 & 0xff];
				else
					k++;
			}

			k += j1;
			j += k1;
		}

	}

	private void bg(int ai[], int ai1[], int j, int k, int l, int i1, int j1, 
			int k1, int l1, int i2, int j2, int k2, int l2) {
		try {
			int i3 = k;
			for (int j3 = -l1; j3 < 0; j3 += l2) {
				int k3 = (l >> 16) * k2;
				for (int l3 = -k1; l3 < 0; l3++) {
					j = ai1[(k >> 16) + k3];
					if (j != 0)
						ai[i1++] = j;
					else
						i1++;
					k += i2;
				}

				l += j2;
				k = i3;
				i1 += j1;
			}

			return;
		}
		catch (Exception _ex) {
			System.out.println("error in plot_scale");
		}
	}

	private void sf(int ai[], int ai1[], int j, int k, int l, int i1, int j1, 
			int k1, int l1, int i2, int j2) {
		int k2 = 256 - j2;
		for (int l2 = -j1; l2 < 0; l2 += i2) {
			for (int i3 = -i1; i3 < 0; i3++) {
				j = ai1[k++];
				if (j != 0) {
					int j3 = ai[l];
					ai[l++] = ((j & 0xff00ff) * j2 + (j3 & 0xff00ff) * k2 & 0xff00ff00) + ((j & 0xff00) * j2 + (j3 & 0xff00) * k2 & 0xff0000) >> 8;
				} else {
					l++;
				}
			}

			l += k1;
			k += l1;
		}

	}

	private void vg(int ai[], byte abyte0[], int ai1[], int j, int k, int l, int i1, 
			int j1, int k1, int l1, int i2) {
		int j2 = 256 - i2;
		for (int k2 = -i1; k2 < 0; k2 += l1) {
			for (int l2 = -l; l2 < 0; l2++) {
				int i3 = abyte0[j++];
				if (i3 != 0) {
					i3 = ai1[i3 & 0xff];
					int j3 = ai[k];
					ai[k++] = ((i3 & 0xff00ff) * i2 + (j3 & 0xff00ff) * j2 & 0xff00ff00) + ((i3 & 0xff00) * i2 + (j3 & 0xff00) * j2 & 0xff0000) >> 8;
				} else {
					k++;
				}
			}

			k += j1;
			j += k1;
		}

	}

	private void vf(int ai[], int ai1[], int j, int k, int l, int i1, int j1, 
			int k1, int l1, int i2, int j2, int k2, int l2, int i3) {
		int j3 = 256 - i3;
		try {
			int k3 = k;
			for (int l3 = -l1; l3 < 0; l3 += l2) {
				int i4 = (l >> 16) * k2;
				for (int j4 = -k1; j4 < 0; j4++) {
					j = ai1[(k >> 16) + i4];
					if (j != 0) {
						int k4 = ai[i1];
						ai[i1++] = ((j & 0xff00ff) * i3 + (k4 & 0xff00ff) * j3 & 0xff00ff00) + ((j & 0xff00) * i3 + (k4 & 0xff00) * j3 & 0xff0000) >> 8;
					} else {
						i1++;
					}
					k += i2;
				}

				l += j2;
				k = k3;
				i1 += j1;
			}

			return;
		}
		catch (Exception _ex) {
			System.out.println("error in tran_scale");
		}
	}

	private void wf(int ai[], int ai1[], int j, int k, int l, int i1, int j1, 
			int k1, int l1, int i2, int j2, int k2, int l2, int i3) {
		int j3 = i3 >> 16 & 0xff;
		int k3 = i3 >> 8 & 0xff;
		int l3 = i3 & 0xff;
		try {
			int i4 = k;
			for (int j4 = -l1; j4 < 0; j4 += l2) {
				int k4 = (l >> 16) * k2;
				for (int l4 = -k1; l4 < 0; l4++) {
					j = ai1[(k >> 16) + k4];
					if (j != 0) {
						int i5 = j >> 16 & 0xff;
						int j5 = j >> 8 & 0xff;
						int k5 = j & 0xff;
						if (i5 == j5 && j5 == k5)
							ai[i1++] = ((i5 * j3 >> 8) << 16) + ((j5 * k3 >> 8) << 8) + (k5 * l3 >> 8);
						else
							ai[i1++] = j;
					} else {
						i1++;
					}
					k += i2;
				}

				l += j2;
				k = i4;
				i1 += j1;
			}

			return;
		}
		catch (Exception _ex) {
			System.out.println("error in plot_scale");
		}
	}

	public void eg(int j, int k, int l, int i1, int j1) {
		int k1 = ni;
		int l1 = oi;
		if (rj == null) {
			rj = new int[512];
			for (int i2 = 0; i2 < 256; i2++) {
				rj[i2] = (int)(Math.sin((double)i2 * 0.02454369D) * 32768D);
				rj[i2 + 256] = (int)(Math.cos((double)i2 * 0.02454369D) * 32768D);
			}

		}
		int j2 = -ej[l] / 2;
		int k2 = -fj[l] / 2;
		if (gj[l]) {
			j2 += cj[l];
			k2 += dj[l];
		}
		int l2 = j2 + aj[l];
		int i3 = k2 + bj[l];
		int j3 = l2;
		int k3 = k2;
		int l3 = j2;
		int i4 = i3;
		i1 &= 0xff;
		int j4 = rj[i1] * j1;
		int k4 = rj[i1 + 256] * j1;
		int l4 = j + (k2 * j4 + j2 * k4 >> 22);
		int i5 = k + (k2 * k4 - j2 * j4 >> 22);
		int j5 = j + (k3 * j4 + j3 * k4 >> 22);
		int k5 = k + (k3 * k4 - j3 * j4 >> 22);
		int l5 = j + (i3 * j4 + l2 * k4 >> 22);
		int i6 = k + (i3 * k4 - l2 * j4 >> 22);
		int j6 = j + (i4 * j4 + l3 * k4 >> 22);
		int k6 = k + (i4 * k4 - l3 * j4 >> 22);
		int l6 = i5;
		int i7 = i5;
		if (k5 < l6)
			l6 = k5;
		else
		if (k5 > i7)
			i7 = k5;
		if (i6 < l6)
			l6 = i6;
		else
		if (i6 > i7)
			i7 = i6;
		if (k6 < l6)
			l6 = k6;
		else
		if (k6 > i7)
			i7 = k6;
		if (l6 < ij)
			l6 = ij;
		if (i7 > jj)
			i7 = jj;
		if (sj == null || sj.length != l1 + 1) {
			sj = new int[l1 + 1];
			tj = new int[l1 + 1];
			uj = new int[l1 + 1];
			vj = new int[l1 + 1];
			wj = new int[l1 + 1];
			xj = new int[l1 + 1];
		}
		for (int j7 = l6; j7 <= i7; j7++) {
			sj[j7] = 0x5f5e0ff;
			tj[j7] = 0xfa0a1f01;
		}

		int j8 = 0;
		int l8 = 0;
		int j9 = 0;
		int k9 = aj[l];
		int l9 = bj[l];
		j2 = 0;
		k2 = 0;
		j3 = k9 - 1;
		k3 = 0;
		l2 = k9 - 1;
		i3 = l9 - 1;
		l3 = 0;
		i4 = l9 - 1;
		if (k6 != i5) {
			j8 = (j6 - l4 << 8) / (k6 - i5);
			j9 = (i4 - k2 << 8) / (k6 - i5);
		}
		int k7;
		int l7;
		int i8;
		int i9;
		if (i5 > k6) {
			i8 = j6 << 8;
			i9 = i4 << 8;
			k7 = k6;
			l7 = i5;
		} else {
			i8 = l4 << 8;
			i9 = k2 << 8;
			k7 = i5;
			l7 = k6;
		}
		if (k7 < 0) {
			i8 -= j8 * k7;
			i9 -= j9 * k7;
			k7 = 0;
		}
		if (l7 > l1 - 1)
			l7 = l1 - 1;
		for (int i10 = k7; i10 <= l7; i10++) {
			sj[i10] = tj[i10] = i8;
			i8 += j8;
			uj[i10] = vj[i10] = 0;
			wj[i10] = xj[i10] = i9;
			i9 += j9;
		}

		if (k5 != i5) {
			j8 = (j5 - l4 << 8) / (k5 - i5);
			l8 = (j3 - j2 << 8) / (k5 - i5);
		}
		int k8;
		if (i5 > k5) {
			i8 = j5 << 8;
			k8 = j3 << 8;
			k7 = k5;
			l7 = i5;
		} else {
			i8 = l4 << 8;
			k8 = j2 << 8;
			k7 = i5;
			l7 = k5;
		}
		if (k7 < 0) {
			i8 -= j8 * k7;
			k8 -= l8 * k7;
			k7 = 0;
		}
		if (l7 > l1 - 1)
			l7 = l1 - 1;
		for (int j10 = k7; j10 <= l7; j10++) {
			if (i8 < sj[j10]) {
				sj[j10] = i8;
				uj[j10] = k8;
				wj[j10] = 0;
			}
			if (i8 > tj[j10]) {
				tj[j10] = i8;
				vj[j10] = k8;
				xj[j10] = 0;
			}
			i8 += j8;
			k8 += l8;
		}

		if (i6 != k5) {
			j8 = (l5 - j5 << 8) / (i6 - k5);
			j9 = (i3 - k3 << 8) / (i6 - k5);
		}
		if (k5 > i6) {
			i8 = l5 << 8;
			k8 = l2 << 8;
			i9 = i3 << 8;
			k7 = i6;
			l7 = k5;
		} else {
			i8 = j5 << 8;
			k8 = j3 << 8;
			i9 = k3 << 8;
			k7 = k5;
			l7 = i6;
		}
		if (k7 < 0) {
			i8 -= j8 * k7;
			i9 -= j9 * k7;
			k7 = 0;
		}
		if (l7 > l1 - 1)
			l7 = l1 - 1;
		for (int k10 = k7; k10 <= l7; k10++) {
			if (i8 < sj[k10]) {
				sj[k10] = i8;
				uj[k10] = k8;
				wj[k10] = i9;
			}
			if (i8 > tj[k10]) {
				tj[k10] = i8;
				vj[k10] = k8;
				xj[k10] = i9;
			}
			i8 += j8;
			i9 += j9;
		}

		if (k6 != i6) {
			j8 = (j6 - l5 << 8) / (k6 - i6);
			l8 = (l3 - l2 << 8) / (k6 - i6);
		}
		if (i6 > k6) {
			i8 = j6 << 8;
			k8 = l3 << 8;
			i9 = i4 << 8;
			k7 = k6;
			l7 = i6;
		} else {
			i8 = l5 << 8;
			k8 = l2 << 8;
			i9 = i3 << 8;
			k7 = i6;
			l7 = k6;
		}
		if (k7 < 0) {
			i8 -= j8 * k7;
			k8 -= l8 * k7;
			k7 = 0;
		}
		if (l7 > l1 - 1)
			l7 = l1 - 1;
		for (int l10 = k7; l10 <= l7; l10++) {
			if (i8 < sj[l10]) {
				sj[l10] = i8;
				uj[l10] = k8;
				wj[l10] = i9;
			}
			if (i8 > tj[l10]) {
				tj[l10] = i8;
				vj[l10] = k8;
				xj[l10] = i9;
			}
			i8 += j8;
			k8 += l8;
		}

		int i11 = l6 * k1;
		int ai[] = xi[l];
		for (int j11 = l6; j11 < i7; j11++) {
			int k11 = sj[j11] >> 8;
			int l11 = tj[j11] >> 8;
			if (l11 - k11 <= 0) {
				i11 += k1;
			} else {
				int i12 = uj[j11] << 9;
				int j12 = ((vj[j11] << 9) - i12) / (l11 - k11);
				int k12 = wj[j11] << 9;
				int l12 = ((xj[j11] << 9) - k12) / (l11 - k11);
				if (k11 < kj) {
					i12 += (kj - k11) * j12;
					k12 += (kj - k11) * l12;
					k11 = kj;
				}
				if (l11 > lj)
					l11 = lj;
				if (!mj || (j11 & 1) == 0)
					if (!gj[l])
						hg(ti, ai, 0, i11 + k11, i12, k12, j12, l12, k11 - l11, k9);
					else
						bh(ti, ai, 0, i11 + k11, i12, k12, j12, l12, k11 - l11, k9);
				i11 += k1;
			}
		}

	}

	private void hg(int ai[], int ai1[], int j, int k, int l, int i1, int j1, 
			int k1, int l1, int i2) {
		for (j = l1; j < 0; j++) {
			ti[k++] = ai1[(l >> 17) + (i1 >> 17) * i2];
			l += j1;
			i1 += k1;
		}

	}

	private void bh(int ai[], int ai1[], int j, int k, int l, int i1, int j1, 
			int k1, int l1, int i2) {
		for (int j2 = l1; j2 < 0; j2++) {
			j = ai1[(l >> 17) + (i1 >> 17) * i2];
			if (j != 0)
				ti[k++] = j;
			else
				k++;
			l += j1;
			i1 += k1;
		}

	}

	public void nf(int j, int k, int l, int i1, int j1, int k1, int l1) {
		ug(j, k, l, i1, j1);
	}

	public void lh(int j, int k, int l, int i1, int j1, int k1, int l1, 
			int i2, boolean flag) {
		try {
			if (k1 == 0)
				k1 = 0xffffff;
			if (l1 == 0)
				l1 = 0xffffff;
			int j2 = aj[j1];
			int k2 = bj[j1];
			int l2 = 0;
			int i3 = 0;
			int j3 = i2 << 16;
			int k3 = (j2 << 16) / l;
			int l3 = (k2 << 16) / i1;
			int i4 = -(i2 << 16) / i1;
			if (gj[j1]) {
				int j4 = ej[j1];
				int l4 = fj[j1];
				k3 = (j4 << 16) / l;
				l3 = (l4 << 16) / i1;
				int k5 = cj[j1];
				int l5 = dj[j1];
				if (flag)
					k5 = j4 - aj[j1] - k5;
				j += ((k5 * l + j4) - 1) / j4;
				int i6 = ((l5 * i1 + l4) - 1) / l4;
				k += i6;
				j3 += i6 * i4;
				if ((k5 * l) % j4 != 0)
					l2 = (j4 - (k5 * l) % j4 << 16) / l;
				if ((l5 * i1) % l4 != 0)
					i3 = (l4 - (l5 * i1) % l4 << 16) / i1;
				l = ((((aj[j1] << 16) - l2) + k3) - 1) / k3;
				i1 = ((((bj[j1] << 16) - i3) + l3) - 1) / l3;
			}
			int k4 = k * ni;
			j3 += j << 16;
			if (k < ij) {
				int i5 = ij - k;
				i1 -= i5;
				k = ij;
				k4 += i5 * ni;
				i3 += l3 * i5;
				j3 += i4 * i5;
			}
			if (k + i1 >= jj)
				i1 -= ((k + i1) - jj) + 1;
			int j5 = k4 / ni & 1;
			if (!mj)
				j5 = 2;
			if (l1 == 0xffffff) {
				if (xi[j1] != null)
					if (!flag) {
						ng(ti, xi[j1], 0, l2, i3, k4, l, i1, k3, l3, j2, k1, j3, i4, j5);
						return;
					} else {
						ng(ti, xi[j1], 0, (aj[j1] << 16) - l2 - 1, i3, k4, l, i1, -k3, l3, j2, k1, j3, i4, j5);
						return;
					}
				if (!flag) {
					yg(ti, yi[j1], zi[j1], 0, l2, i3, k4, l, i1, k3, l3, j2, k1, j3, i4, j5);
					return;
				} else {
					yg(ti, yi[j1], zi[j1], 0, (aj[j1] << 16) - l2 - 1, i3, k4, l, i1, -k3, l3, j2, k1, j3, i4, j5);
					return;
				}
			}
			if (xi[j1] != null)
				if (!flag) {
					zg(ti, xi[j1], 0, l2, i3, k4, l, i1, k3, l3, j2, k1, l1, j3, i4, j5);
					return;
				} else {
					zg(ti, xi[j1], 0, (aj[j1] << 16) - l2 - 1, i3, k4, l, i1, -k3, l3, j2, k1, l1, j3, i4, j5);
					return;
				}
			if (!flag) {
				gh(ti, yi[j1], zi[j1], 0, l2, i3, k4, l, i1, k3, l3, j2, k1, l1, j3, i4, j5);
				return;
			} else {
				gh(ti, yi[j1], zi[j1], 0, (aj[j1] << 16) - l2 - 1, i3, k4, l, i1, -k3, l3, j2, k1, l1, j3, i4, j5);
				return;
			}
		}
		catch (Exception _ex) {
			System.out.println("error in sprite clipping routine");
		}
	}

	private void ng(int ai[], int ai1[], int j, int k, int l, int i1, int j1, 
			int k1, int l1, int i2, int j2, int k2, int l2, int i3, 
			int j3) {
		int j4 = k2 >> 16 & 0xff;
		int k4 = k2 >> 8 & 0xff;
		int l4 = k2 & 0xff;
		try {
			int i5 = k;
			for (int j5 = -k1; j5 < 0; j5++) {
				int k5 = (l >> 16) * j2;
				int l5 = l2 >> 16;
				int i6 = j1;
				if (l5 < kj) {
					int j6 = kj - l5;
					i6 -= j6;
					l5 = kj;
					k += l1 * j6;
				}
				if (l5 + i6 >= lj) {
					int k6 = (l5 + i6) - lj;
					i6 -= k6;
				}
				j3 = 1 - j3;
				if (j3 != 0) {
					for (int l6 = l5; l6 < l5 + i6; l6++) {
						j = ai1[(k >> 16) + k5];
						if (j != 0) {
							int k3 = j >> 16 & 0xff;
							int l3 = j >> 8 & 0xff;
							int i4 = j & 0xff;
							if (k3 == l3 && l3 == i4)
								ai[l6 + i1] = ((k3 * j4 >> 8) << 16) + ((l3 * k4 >> 8) << 8) + (i4 * l4 >> 8);
							else
								ai[l6 + i1] = j;
						}
						k += l1;
					}

				}
				l += i2;
				k = i5;
				i1 += ni;
				l2 += i3;
			}

			return;
		}
		catch (Exception _ex) {
			System.out.println("error in transparent sprite plot routine");
		}
	}

	private void zg(int ai[], int ai1[], int j, int k, int l, int i1, int j1, 
			int k1, int l1, int i2, int j2, int k2, int l2, int i3, 
			int j3, int k3) {
		int k4 = k2 >> 16 & 0xff;
		int l4 = k2 >> 8 & 0xff;
		int i5 = k2 & 0xff;
		int j5 = l2 >> 16 & 0xff;
		int k5 = l2 >> 8 & 0xff;
		int l5 = l2 & 0xff;
		try {
			int i6 = k;
			for (int j6 = -k1; j6 < 0; j6++) {
				int k6 = (l >> 16) * j2;
				int l6 = i3 >> 16;
				int i7 = j1;
				if (l6 < kj) {
					int j7 = kj - l6;
					i7 -= j7;
					l6 = kj;
					k += l1 * j7;
				}
				if (l6 + i7 >= lj) {
					int k7 = (l6 + i7) - lj;
					i7 -= k7;
				}
				k3 = 1 - k3;
				if (k3 != 0) {
					for (int l7 = l6; l7 < l6 + i7; l7++) {
						j = ai1[(k >> 16) + k6];
						if (j != 0) {
							int l3 = j >> 16 & 0xff;
							int i4 = j >> 8 & 0xff;
							int j4 = j & 0xff;
							if (l3 == i4 && i4 == j4)
								ai[l7 + i1] = ((l3 * k4 >> 8) << 16) + ((i4 * l4 >> 8) << 8) + (j4 * i5 >> 8);
							else
							if (l3 == 255 && i4 == j4)
								ai[l7 + i1] = ((l3 * j5 >> 8) << 16) + ((i4 * k5 >> 8) << 8) + (j4 * l5 >> 8);
							else
								ai[l7 + i1] = j;
						}
						k += l1;
					}

				}
				l += i2;
				k = i6;
				i1 += ni;
				i3 += j3;
			}

			return;
		}
		catch (Exception _ex) {
			System.out.println("error in transparent sprite plot routine");
		}
	}

	private void yg(int ai[], byte abyte0[], int ai1[], int j, int k, int l, int i1, 
			int j1, int k1, int l1, int i2, int j2, int k2, int l2, 
			int i3, int j3) {
		int j4 = k2 >> 16 & 0xff;
		int k4 = k2 >> 8 & 0xff;
		int l4 = k2 & 0xff;
		try {
			int i5 = k;
			for (int j5 = -k1; j5 < 0; j5++) {
				int k5 = (l >> 16) * j2;
				int l5 = l2 >> 16;
				int i6 = j1;
				if (l5 < kj) {
					int j6 = kj - l5;
					i6 -= j6;
					l5 = kj;
					k += l1 * j6;
				}
				if (l5 + i6 >= lj) {
					int k6 = (l5 + i6) - lj;
					i6 -= k6;
				}
				j3 = 1 - j3;
				if (j3 != 0) {
					for (int l6 = l5; l6 < l5 + i6; l6++) {
						j = abyte0[(k >> 16) + k5] & 0xff;
						if (j != 0) {
							j = ai1[j];
							int k3 = j >> 16 & 0xff;
							int l3 = j >> 8 & 0xff;
							int i4 = j & 0xff;
							if (k3 == l3 && l3 == i4)
								ai[l6 + i1] = ((k3 * j4 >> 8) << 16) + ((l3 * k4 >> 8) << 8) + (i4 * l4 >> 8);
							else
								ai[l6 + i1] = j;
						}
						k += l1;
					}

				}
				l += i2;
				k = i5;
				i1 += ni;
				l2 += i3;
			}

			return;
		}
		catch (Exception _ex) {
			System.out.println("error in transparent sprite plot routine");
		}
	}

	private void gh(int ai[], byte abyte0[], int ai1[], int j, int k, int l, int i1, 
			int j1, int k1, int l1, int i2, int j2, int k2, int l2, 
			int i3, int j3, int k3) {
		int k4 = k2 >> 16 & 0xff;
		int l4 = k2 >> 8 & 0xff;
		int i5 = k2 & 0xff;
		int j5 = l2 >> 16 & 0xff;
		int k5 = l2 >> 8 & 0xff;
		int l5 = l2 & 0xff;
		try {
			int i6 = k;
			for (int j6 = -k1; j6 < 0; j6++) {
				int k6 = (l >> 16) * j2;
				int l6 = i3 >> 16;
				int i7 = j1;
				if (l6 < kj) {
					int j7 = kj - l6;
					i7 -= j7;
					l6 = kj;
					k += l1 * j7;
				}
				if (l6 + i7 >= lj) {
					int k7 = (l6 + i7) - lj;
					i7 -= k7;
				}
				k3 = 1 - k3;
				if (k3 != 0) {
					for (int l7 = l6; l7 < l6 + i7; l7++) {
						j = abyte0[(k >> 16) + k6] & 0xff;
						if (j != 0) {
							j = ai1[j];
							int l3 = j >> 16 & 0xff;
							int i4 = j >> 8 & 0xff;
							int j4 = j & 0xff;
							if (l3 == i4 && i4 == j4)
								ai[l7 + i1] = ((l3 * k4 >> 8) << 16) + ((i4 * l4 >> 8) << 8) + (j4 * i5 >> 8);
							else
							if (l3 == 255 && i4 == j4)
								ai[l7 + i1] = ((l3 * j5 >> 8) << 16) + ((i4 * k5 >> 8) << 8) + (j4 * l5 >> 8);
							else
								ai[l7 + i1] = j;
						}
						k += l1;
					}

				}
				l += i2;
				k = i6;
				i1 += ni;
				i3 += j3;
			}

			return;
		}
		catch (Exception _ex) {
			System.out.println("error in transparent sprite plot routine");
		}
	}

	public static int rf(byte abyte0[]) {
		nj[pj] = abyte0;
		return pj++;
	}

	public void kg(String s, int j, int k, int l, int i1) {
		ah(s, j - mf(s, l), k, l, i1);
	}

	public void tg(String s, int j, int k, int l, int i1) {
		ah(s, j - mf(s, l) / 2, k, l, i1);
	}

	public void fg(String s, int j, int k, int l, int i1, int j1) {
		int k1 = 0;
		byte abyte0[] = nj[l];
		int l1 = 0;
		int i2 = 0;
		for (int j2 = 0; j2 < s.length(); j2++) {
			if (s.charAt(j2) == '@' && j2 + 4 < s.length() && s.charAt(j2 + 4) == '@')
				j2 += 4;
			else
			if (s.charAt(j2) == '~' && j2 + 4 < s.length() && s.charAt(j2 + 4) == '~')
				j2 += 4;
			else
				k1 += abyte0[oj[s.charAt(j2)] + 7];
			if (s.charAt(j2) == ' ')
				i2 = j2;
			if (k1 > j1) {
				if (i2 <= l1)
					i2 = j2;
				tg(s.substring(l1, i2), j, k, l, i1);
				k1 = 0;
				l1 = j2 = i2 + 1;
				k += of(l);
			}
		}

		if (k1 > 0)
			tg(s.substring(l1), j, k, l, i1);
	}

	public void ah(String s, int j, int k, int l, int i1) {
		byte abyte0[] = nj[l];
		for (int j1 = 0; j1 < s.length(); j1++)
			if (s.charAt(j1) == '@' && j1 + 4 < s.length() && s.charAt(j1 + 4) == '@') {
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("red"))
					i1 = 0xff0000;
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("lre"))
					i1 = 0xff9040;
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("yel"))
					i1 = 0xffff00;
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("gre"))
					i1 = 65280;
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("blu"))
					i1 = 255;
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("cya"))
					i1 = 65535;
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("mag"))
					i1 = 0xff00ff;
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("whi"))
					i1 = 0xffffff;
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("bla"))
					i1 = 0;
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("dre"))
					i1 = 0xc00000;
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("ora"))
					i1 = 0xff9040;
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("ran"))
					i1 = (int)(Math.random() * 16777215D);
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("or1"))
					i1 = 0xffb000;
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("or2"))
					i1 = 0xff7000;
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("or3"))
					i1 = 0xff3000;
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("gr1"))
					i1 = 0xc0ff00;
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("gr2"))
					i1 = 0x80ff00;
				else
				if (s.substring(j1 + 1, j1 + 4).equalsIgnoreCase("gr3"))
					i1 = 0x40ff00;
				j1 += 4;
			} else
			if (s.charAt(j1) == '~' && j1 + 4 < s.length() && s.charAt(j1 + 4) == '~') {
				char c = s.charAt(j1 + 1);
				char c1 = s.charAt(j1 + 2);
				char c2 = s.charAt(j1 + 3);
				if (c >= '0' && c <= '9' && c1 >= '0' && c1 <= '9' && c2 >= '0' && c2 <= '9')
					j = Integer.parseInt(s.substring(j1 + 1, j1 + 4));
				j1 += 4;
			} else {
				int k1 = oj[s.charAt(j1)];
				if (qj && i1 != 0)
					jh(k1, j + 1, k, 0, abyte0);
				if (qj && i1 != 0)
					jh(k1, j, k + 1, 0, abyte0);
				jh(k1, j, k, i1, abyte0);
				j += abyte0[k1 + 7];
			}

	}

	private void jh(int j, int k, int l, int i1, byte abyte0[]) {
		int j1 = k + abyte0[j + 5];
		int k1 = l - abyte0[j + 6];
		int l1 = abyte0[j + 3];
		int i2 = abyte0[j + 4];
		int j2 = abyte0[j] * 16384 + abyte0[j + 1] * 128 + abyte0[j + 2];
		int k2 = j1 + k1 * ni;
		int l2 = ni - l1;
		int i3 = 0;
		if (k1 < ij) {
			int j3 = ij - k1;
			i2 -= j3;
			k1 = ij;
			j2 += j3 * l1;
			k2 += j3 * ni;
		}
		if (k1 + i2 >= jj)
			i2 -= ((k1 + i2) - jj) + 1;
		if (j1 < kj) {
			int k3 = kj - j1;
			l1 -= k3;
			j1 = kj;
			j2 += k3;
			k2 += k3;
			i3 += k3;
			l2 += k3;
		}
		if (j1 + l1 >= lj) {
			int l3 = ((j1 + l1) - lj) + 1;
			l1 -= l3;
			i3 += l3;
			l2 += l3;
		}
		if (l1 > 0 && i2 > 0)
			uf(ti, abyte0, i1, j2, k2, l1, i2, l2, i3);
	}

	private void uf(int ai[], byte abyte0[], int j, int k, int l, int i1, int j1, 
			int k1, int l1) {
		int i2 = -(i1 >> 2);
		i1 = -(i1 & 3);
		for (int j2 = -j1; j2 < 0; j2++) {
			for (int k2 = i2; k2 < 0; k2++) {
				if (abyte0[k++] != 0)
					ai[l++] = j;
				else
					l++;
				if (abyte0[k++] != 0)
					ai[l++] = j;
				else
					l++;
				if (abyte0[k++] != 0)
					ai[l++] = j;
				else
					l++;
				if (abyte0[k++] != 0)
					ai[l++] = j;
				else
					l++;
			}

			for (int l2 = i1; l2 < 0; l2++)
				if (abyte0[k++] != 0)
					ai[l++] = j;
				else
					l++;

			l += k1;
			k += l1;
		}

	}

	public int of(int j) {
		if (j == 0)
			return nj[j][8] - 2;
		else
			return nj[j][8] - 1;
	}

	public int mf(String s, int j) {
		int k = 0;
		byte abyte0[] = nj[j];
		for (int l = 0; l < s.length(); l++)
			if (s.charAt(l) == '@' && l + 4 < s.length() && s.charAt(l + 4) == '@')
				l += 4;
			else
			if (s.charAt(l) == '~' && l + 4 < s.length() && s.charAt(l + 4) == '~')
				l += 4;
			else
				k += abyte0[oj[s.charAt(l)] + 7];

		return k;
	}

	public boolean imageUpdate(Image image, int j, int k, int l, int i1, int j1) {
		return true;
	}

	public int ni;
	public int oi;
	public int pi;
	public int qi;
	public int ri;
	ColorModel si;
	public int ti[];
	ImageConsumer ui;
	private Component vi;
	public Image wi;
	private int xi[][];
	private byte yi[][];
	private int zi[][];
	public int aj[];
	public int bj[];
	public int cj[];
	public int dj[];
	public int ej[];
	public int fj[];
	public boolean gj[];
	private boolean hj;
	private int ij;
	private int jj;
	private int kj;
	private int lj;
	public boolean mj;
	static byte nj[][] = new byte[50][];
	static int oj[];
	static int pj;
	public boolean qj;
	int rj[];
	int sj[];
	int tj[];
	int uj[];
	int vj[];
	int wj[];
	int xj[];
	public static final int yj = 0;
	public static final int zj = 0xffffff;
	public static final int ak = 0xff0000;
	public static final int bk = 0xc00000;
	public static final int ck = 65280;
	public static final int dk = 255;
	public static final int ek = 0xffff00;
	public static final int fk = 65535;
	public static final int gk = 0xff00ff;
	public static final int hk = 0xc0c0c0;
	public static final int ik = 0x808080;
	public static final int jk = 0x404040;
	public static final int kk = 0;
	public static final int lk = 1;
	public static final int mk = 2;
	public static final int nk = 3;
	public static final int ok = 4;
	public static final int pk = 5;
	public static final int qk = 6;
	public static final int rk = 7;

	static  {
		String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
		oj = new int[256];
		for (int j = 0; j < 256; j++) {
			int k = s.indexOf(j);
			if (k == -1)
				k = 74;
			oj[j] = k * 9;
		}

	}
}
