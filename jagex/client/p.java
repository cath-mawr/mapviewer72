// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb space 

package jagex.client;

import jagex.c;
import java.io.*;

// Referenced classes of package jagex.client:
//			a

public class p {

	public p(int i, int j) {
		ev = 1;
		fv = true;
		mv = true;
		nv = false;
		ov = false;
		pv = -1;
		sv = false;
		tv = false;
		uv = false;
		vv = false;
		wv = false;
		bw = 4;
		cw = 0xbc614e;
		ix = 0xbc614e;
		jx = 180;
		kx = 155;
		lx = 95;
		mx = 256;
		nx = 512;
		ox = 32;
		wl(i, j);
		lw = new int[j][1];
		for (int k = 0; k < j; k++)
			lw[k][0] = k;

	}

	public p(int i, int j, boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4) {
		ev = 1;
		fv = true;
		mv = true;
		nv = false;
		ov = false;
		pv = -1;
		sv = false;
		tv = false;
		uv = false;
		vv = false;
		wv = false;
		bw = 4;
		cw = 0xbc614e;
		ix = 0xbc614e;
		jx = 180;
		kx = 155;
		lx = 95;
		mx = 256;
		nx = 512;
		ox = 32;
		sv = flag;
		tv = flag1;
		uv = flag2;
		vv = flag3;
		wv = flag4;
		wl(i, j);
	}

	private void wl(int i, int j) {
		ew = new int[i];
		fw = new int[i];
		gw = new int[i];
		pu = new int[i];
		qu = new byte[i];
		su = new int[j];
		tu = new int[j][];
		uu = new int[j];
		vu = new int[j];
		yu = new int[j];
		xu = new int[j];
		wu = new int[j];
		if (!wv) {
			ku = new int[i];
			lu = new int[i];
			mu = new int[i];
			nu = new int[i];
			ou = new int[i];
		}
		if (!vv) {
			rv = new byte[j];
			qv = new int[j];
		}
		if (sv) {
			hw = ew;
			iw = fw;
			jw = gw;
		} else {
			hw = new int[i];
			iw = new int[i];
			jw = new int[i];
		}
		if (!uv || !tv) {
			zu = new int[j];
			av = new int[j];
			bv = new int[j];
		}
		if (!tv) {
			mw = new int[j];
			nw = new int[j];
			ow = new int[j];
			pw = new int[j];
			qw = new int[j];
			rw = new int[j];
		}
		ru = 0;
		ju = 0;
		dw = i;
		kw = j;
		sw = tw = uw = 0;
		vw = ww = xw = 0;
		yw = zw = ax = 256;
		bx = cx = dx = ex = fx = gx = 256;
		hx = 0;
	}

	public void xl() {
		ku = new int[ju];
		lu = new int[ju];
		mu = new int[ju];
		nu = new int[ju];
		ou = new int[ju];
	}

	public void fm() {
		ru = 0;
		ju = 0;
	}

	public void rl(int i, int j) {
		ru -= i;
		if (ru < 0)
			ru = 0;
		ju -= j;
		if (ju < 0)
			ju = 0;
	}

	public p(byte abyte0[], int i) {
		ev = 1;
		fv = true;
		mv = true;
		nv = false;
		ov = false;
		pv = -1;
		sv = false;
		tv = false;
		uv = false;
		vv = false;
		wv = false;
		bw = 4;
		cw = 0xbc614e;
		ix = 0xbc614e;
		jx = 180;
		kx = 155;
		lx = 95;
		mx = 256;
		nx = 512;
		ox = 32;
		px = abyte0;
		qx = i;
		rx = 0;
		cm(px);
		int j = cm(px);
		int k = cm(px);
		boolean flag = false;
		wl(j, k);
		lw = new int[k][];
		for (int l2 = 0; l2 < j; l2++) {
			int l = cm(px);
			int i1 = cm(px);
			int j1 = cm(px);
			em(l, i1, j1);
		}

		for (int i3 = 0; i3 < k; i3++) {
			int k1 = cm(px);
			int l1 = cm(px);
			int i2 = cm(px);
			int j2 = cm(px);
			nx = cm(px);
			ox = cm(px);
			int k2 = cm(px);
			int ai[] = new int[k1];
			for (int j3 = 0; j3 < k1; j3++)
				ai[j3] = cm(px);

			int ai1[] = new int[j2];
			for (int k3 = 0; k3 < j2; k3++)
				ai1[k3] = cm(px);

			int l3 = gm(k1, ai, l1, i2);
			lw[i3] = ai1;
			if (k2 == 0)
				yu[l3] = 0;
			else
				yu[l3] = cw;
		}

		ev = 1;
	}

	public p(String s) {
		ev = 1;
		fv = true;
		mv = true;
		nv = false;
		ov = false;
		pv = -1;
		sv = false;
		tv = false;
		uv = false;
		vv = false;
		wv = false;
		bw = 4;
		cw = 0xbc614e;
		ix = 0xbc614e;
		jx = 180;
		kx = 155;
		lx = 95;
		mx = 256;
		nx = 512;
		ox = 32;
		boolean flag = false;
		boolean flag1 = false;
		byte abyte0[] = null;
		try {
			java.io.InputStream inputstream = c.nc(s);
			DataInputStream datainputstream = new DataInputStream(inputstream);
			abyte0 = new byte[3];
			qx = 0;
			rx = 0;
			for (int i = 0; i < 3; i += datainputstream.read(abyte0, i, 3 - i));
			int k = cm(abyte0);
			abyte0 = new byte[k];
			qx = 0;
			rx = 0;
			for (int j = 0; j < k; j += datainputstream.read(abyte0, j, k - j));
			datainputstream.close();
		}
		catch (IOException _ex) {
			ju = 0;
			ru = 0;
			return;
		}
		int l = cm(abyte0);
		int i1 = cm(abyte0);
		boolean flag2 = false;
		wl(l, i1);
		lw = new int[i1][];
		for (int j3 = 0; j3 < l; j3++) {
			int j1 = cm(abyte0);
			int k1 = cm(abyte0);
			int l1 = cm(abyte0);
			em(j1, k1, l1);
		}

		for (int k3 = 0; k3 < i1; k3++) {
			int i2 = cm(abyte0);
			int j2 = cm(abyte0);
			int k2 = cm(abyte0);
			int l2 = cm(abyte0);
			nx = cm(abyte0);
			ox = cm(abyte0);
			int i3 = cm(abyte0);
			int ai[] = new int[i2];
			for (int l3 = 0; l3 < i2; l3++)
				ai[l3] = cm(abyte0);

			int ai1[] = new int[l2];
			for (int i4 = 0; i4 < l2; i4++)
				ai1[i4] = cm(abyte0);

			int j4 = gm(i2, ai, j2, k2);
			lw[k3] = ai1;
			if (i3 == 0)
				yu[j4] = 0;
			else
				yu[j4] = cw;
		}

		ev = 1;
	}

	public p(p ap[], int i, boolean flag, boolean flag1, boolean flag2, boolean flag3) {
		ev = 1;
		fv = true;
		mv = true;
		nv = false;
		ov = false;
		pv = -1;
		sv = false;
		tv = false;
		uv = false;
		vv = false;
		wv = false;
		bw = 4;
		cw = 0xbc614e;
		ix = 0xbc614e;
		jx = 180;
		kx = 155;
		lx = 95;
		mx = 256;
		nx = 512;
		ox = 32;
		sv = flag;
		tv = flag1;
		uv = flag2;
		vv = flag3;
		bm(ap, i, false);
	}

	public p(p ap[], int i) {
		ev = 1;
		fv = true;
		mv = true;
		nv = false;
		ov = false;
		pv = -1;
		sv = false;
		tv = false;
		uv = false;
		vv = false;
		wv = false;
		bw = 4;
		cw = 0xbc614e;
		ix = 0xbc614e;
		jx = 180;
		kx = 155;
		lx = 95;
		mx = 256;
		nx = 512;
		ox = 32;
		bm(ap, i, true);
	}

	public void bm(p ap[], int i, boolean flag) {
		int j = 0;
		int k = 0;
		for (int l = 0; l < i; l++) {
			j += ap[l].ru;
			k += ap[l].ju;
		}

		wl(k, j);
		if (flag)
			lw = new int[j][];
		for (int i1 = 0; i1 < i; i1++) {
			p p1 = ap[i1];
			p1.nl();
			ox = p1.ox;
			nx = p1.nx;
			jx = p1.jx;
			kx = p1.kx;
			lx = p1.lx;
			mx = p1.mx;
			for (int j1 = 0; j1 < p1.ru; j1++) {
				int ai[] = new int[p1.su[j1]];
				int ai1[] = p1.tu[j1];
				for (int k1 = 0; k1 < p1.su[j1]; k1++)
					ai[k1] = em(p1.ew[ai1[k1]], p1.fw[ai1[k1]], p1.gw[ai1[k1]]);

				int l1 = gm(p1.su[j1], ai, p1.uu[j1], p1.vu[j1]);
				yu[l1] = p1.yu[j1];
				xu[l1] = p1.xu[j1];
				wu[l1] = p1.wu[j1];
				if (flag)
					if (i > 1) {
						lw[l1] = new int[p1.lw[j1].length + 1];
						lw[l1][0] = i1;
						for (int i2 = 0; i2 < p1.lw[j1].length; i2++)
							lw[l1][i2 + 1] = p1.lw[j1][i2];

					} else {
						lw[l1] = new int[p1.lw[j1].length];
						for (int j2 = 0; j2 < p1.lw[j1].length; j2++)
							lw[l1][j2] = p1.lw[j1][j2];

					}
			}

		}

		ev = 1;
	}

	public p(int i, int ai[], int ai1[], int ai2[], int j, int k) {
		this(i, 1);
		ju = i;
		for (int l = 0; l < i; l++) {
			ew[l] = ai[l];
			fw[l] = ai1[l];
			gw[l] = ai2[l];
		}

		ru = 1;
		su[0] = i;
		int ai3[] = new int[i];
		for (int i1 = 0; i1 < i; i1++)
			ai3[i1] = i1;

		tu[0] = ai3;
		uu[0] = j;
		vu[0] = k;
		ev = 1;
	}

	public int em(int i, int j, int k) {
		for (int l = 0; l < ju; l++)
			if (ew[l] == i && fw[l] == j && gw[l] == k)
				return l;

		if (ju >= dw) {
			return -1;
		} else {
			ew[ju] = i;
			fw[ju] = j;
			gw[ju] = k;
			return ju++;
		}
	}

	public int am(int i, int j, int k) {
		if (ju >= dw) {
			return -1;
		} else {
			ew[ju] = i;
			fw[ju] = j;
			gw[ju] = k;
			return ju++;
		}
	}

	public int gm(int i, int ai[], int j, int k) {
		if (ru >= kw) {
			return -1;
		} else {
			su[ru] = i;
			tu[ru] = ai;
			uu[ru] = j;
			vu[ru] = k;
			ev = 1;
			return ru++;
		}
	}

	public p[] mm(int i, int j, int k, int l, int i1, int j1, int k1, 
			boolean flag) {
		nl();
		int ai[] = new int[j1];
		int ai1[] = new int[j1];
		for (int l1 = 0; l1 < j1; l1++) {
			ai[l1] = 0;
			ai1[l1] = 0;
		}

		for (int i2 = 0; i2 < ru; i2++) {
			int j2 = 0;
			int k2 = 0;
			int i3 = su[i2];
			int ai2[] = tu[i2];
			for (int i4 = 0; i4 < i3; i4++) {
				j2 += ew[ai2[i4]];
				k2 += gw[ai2[i4]];
			}

			int k4 = j2 / (i3 * k) + (k2 / (i3 * l)) * i1;
			ai[k4] += i3;
			ai1[k4]++;
		}

		p ap[] = new p[j1];
		for (int l2 = 0; l2 < j1; l2++) {
			if (ai[l2] > k1)
				ai[l2] = k1;
			ap[l2] = new p(ai[l2], ai1[l2], true, true, true, flag, true);
			ap[l2].nx = nx;
			ap[l2].ox = ox;
		}

		for (int j3 = 0; j3 < ru; j3++) {
			int k3 = 0;
			int j4 = 0;
			int l4 = su[j3];
			int ai3[] = tu[j3];
			for (int i5 = 0; i5 < l4; i5++) {
				k3 += ew[ai3[i5]];
				j4 += gw[ai3[i5]];
			}

			int j5 = k3 / (l4 * k) + (j4 / (l4 * l)) * i1;
			sl(ap[j5], ai3, l4, j3);
		}

		for (int l3 = 0; l3 < j1; l3++)
			ap[l3].xl();

		return ap;
	}

	public void sl(p p1, int ai[], int i, int j) {
		int ai1[] = new int[i];
		for (int k = 0; k < i; k++) {
			int l = ai1[k] = p1.em(ew[ai[k]], fw[ai[k]], gw[ai[k]]);
			p1.pu[l] = pu[ai[k]];
			p1.qu[l] = qu[ai[k]];
		}

		int i1 = p1.gm(i, ai1, uu[j], vu[j]);
		if (!p1.vv && !vv)
			p1.qv[i1] = qv[j];
		p1.yu[i1] = yu[j];
		p1.xu[i1] = xu[j];
		p1.wu[i1] = wu[j];
	}

	public void nm(boolean flag, int i, int j, int k, int l, int i1) {
		ox = 256 - i * 4;
		nx = (64 - j) * 16 + 128;
		if (uv)
			return;
		for (int j1 = 0; j1 < ru; j1++)
			if (flag)
				yu[j1] = cw;
			else
				yu[j1] = 0;

		jx = k;
		kx = l;
		lx = i1;
		mx = (int)Math.sqrt(k * k + l * l + i1 * i1);
		rm();
	}

	public void um(int i, int j, int k) {
		if (uv) {
			return;
		} else {
			jx = i;
			kx = j;
			lx = k;
			mx = (int)Math.sqrt(i * i + j * j + k * k);
			rm();
			return;
		}
	}

	public void vm(int i, int j) {
		qu[i] = (byte)j;
	}

	public void qm(int i, int j, int k) {
		vw = vw + i & 0xff;
		ww = ww + j & 0xff;
		xw = xw + k & 0xff;
		sm();
		ev = 1;
	}

	public void tl(int i, int j, int k) {
		vw = i & 0xff;
		ww = j & 0xff;
		xw = k & 0xff;
		sm();
		ev = 1;
	}

	public void dm(int i, int j, int k) {
		sw += i;
		tw += j;
		uw += k;
		sm();
		ev = 1;
	}

	public void pl(int i, int j, int k) {
		sw = i;
		tw = j;
		uw = k;
		sm();
		ev = 1;
	}

	public int om() {
		return sw;
	}

	public void tm(int i, int j, int k) {
		yw = i;
		zw = j;
		ax = k;
		sm();
		ev = 1;
	}

	public void vl(int i, int j, int k, int l, int i1, int j1) {
		bx = i;
		cx = j;
		dx = k;
		ex = l;
		fx = i1;
		gx = j1;
		sm();
		ev = 1;
	}

	private void sm() {
		if (bx != 256 || cx != 256 || dx != 256 || ex != 256 || fx != 256 || gx != 256) {
			hx = 4;
			return;
		}
		if (yw != 256 || zw != 256 || ax != 256) {
			hx = 3;
			return;
		}
		if (vw != 0 || ww != 0 || xw != 0) {
			hx = 2;
			return;
		}
		if (sw != 0 || tw != 0 || uw != 0) {
			hx = 1;
			return;
		} else {
			hx = 0;
			return;
		}
	}

	private void pm(int i, int j, int k) {
		for (int l = 0; l < ju; l++) {
			hw[l] += i;
			iw[l] += j;
			jw[l] += k;
		}

	}

	private void ol(int i, int j, int k) {
		for (int i3 = 0; i3 < ju; i3++) {
			if (k != 0) {
				int l = xv[k];
				int k1 = xv[k + 256];
				int j2 = iw[i3] * l + hw[i3] * k1 >> 15;
				iw[i3] = iw[i3] * k1 - hw[i3] * l >> 15;
				hw[i3] = j2;
			}
			if (i != 0) {
				int i1 = xv[i];
				int l1 = xv[i + 256];
				int k2 = iw[i3] * l1 - jw[i3] * i1 >> 15;
				jw[i3] = iw[i3] * i1 + jw[i3] * l1 >> 15;
				iw[i3] = k2;
			}
			if (j != 0) {
				int j1 = xv[j];
				int i2 = xv[j + 256];
				int l2 = jw[i3] * j1 + hw[i3] * i2 >> 15;
				jw[i3] = jw[i3] * i2 - hw[i3] * j1 >> 15;
				hw[i3] = l2;
			}
		}

	}

	private void im(int i, int j, int k, int l, int i1, int j1) {
		for (int k1 = 0; k1 < ju; k1++) {
			if (i != 0)
				hw[k1] += iw[k1] * i >> 8;
			if (j != 0)
				jw[k1] += iw[k1] * j >> 8;
			if (k != 0)
				hw[k1] += jw[k1] * k >> 8;
			if (l != 0)
				iw[k1] += jw[k1] * l >> 8;
			if (i1 != 0)
				jw[k1] += hw[k1] * i1 >> 8;
			if (j1 != 0)
				iw[k1] += hw[k1] * j1 >> 8;
		}

	}

	private void ul(int i, int j, int k) {
		for (int l = 0; l < ju; l++) {
			hw[l] = hw[l] * i >> 8;
			iw[l] = iw[l] * j >> 8;
			jw[l] = jw[l] * k >> 8;
		}

	}

	private void ql() {
		gv = iv = kv = 0xf423f;
		ix = hv = jv = lv = 0xfff0bdc1;
		for (int i = 0; i < ru; i++) {
			int ai[] = tu[i];
			int k = ai[0];
			int i1 = su[i];
			int j1;
			int k1 = j1 = hw[k];
			int l1;
			int i2 = l1 = iw[k];
			int j2;
			int k2 = j2 = jw[k];
			for (int j = 0; j < i1; j++) {
				int l = ai[j];
				if (hw[l] < j1)
					j1 = hw[l];
				else
				if (hw[l] > k1)
					k1 = hw[l];
				if (iw[l] < l1)
					l1 = iw[l];
				else
				if (iw[l] > i2)
					i2 = iw[l];
				if (jw[l] < j2)
					j2 = jw[l];
				else
				if (jw[l] > k2)
					k2 = jw[l];
			}

			if (!tv) {
				mw[i] = j1;
				nw[i] = k1;
				ow[i] = l1;
				pw[i] = i2;
				qw[i] = j2;
				rw[i] = k2;
			}
			if (k1 - j1 > ix)
				ix = k1 - j1;
			if (i2 - l1 > ix)
				ix = i2 - l1;
			if (k2 - j2 > ix)
				ix = k2 - j2;
			if (j1 < gv)
				gv = j1;
			if (k1 > hv)
				hv = k1;
			if (l1 < iv)
				iv = l1;
			if (i2 > jv)
				jv = i2;
			if (j2 < kv)
				kv = j2;
			if (k2 > lv)
				lv = k2;
		}

	}

	public void rm() {
		if (uv)
			return;
		int i = nx * mx >> 8;
		for (int j = 0; j < ru; j++)
			if (yu[j] != cw)
				yu[j] = (zu[j] * jx + av[j] * kx + bv[j] * lx) / i;

		int ai[] = new int[ju];
		int ai1[] = new int[ju];
		int ai2[] = new int[ju];
		int ai3[] = new int[ju];
		for (int k = 0; k < ju; k++) {
			ai[k] = 0;
			ai1[k] = 0;
			ai2[k] = 0;
			ai3[k] = 0;
		}

		for (int l = 0; l < ru; l++)
			if (yu[l] == cw) {
				for (int i1 = 0; i1 < su[l]; i1++) {
					int k1 = tu[l][i1];
					ai[k1] += zu[l];
					ai1[k1] += av[l];
					ai2[k1] += bv[l];
					ai3[k1]++;
				}

			}

		for (int j1 = 0; j1 < ju; j1++)
			if (ai3[j1] > 0)
				pu[j1] = (ai[j1] * jx + ai1[j1] * kx + ai2[j1] * lx) / (i * ai3[j1]);

	}

	public void hm() {
		if (uv && tv)
			return;
		for (int i = 0; i < ru; i++) {
			int ai[] = tu[i];
			int j = hw[ai[0]];
			int k = iw[ai[0]];
			int l = jw[ai[0]];
			int i1 = hw[ai[1]] - j;
			int j1 = iw[ai[1]] - k;
			int k1 = jw[ai[1]] - l;
			int l1 = hw[ai[2]] - j;
			int i2 = iw[ai[2]] - k;
			int j2 = jw[ai[2]] - l;
			int k2 = j1 * j2 - i2 * k1;
			int l2 = k1 * l1 - j2 * i1;
			int i3;
			for (i3 = i1 * i2 - l1 * j1; k2 > 8192 || l2 > 8192 || i3 > 8192 || k2 < -8192 || l2 < -8192 || i3 < -8192; i3 >>= 1) {
				k2 >>= 1;
				l2 >>= 1;
			}

			int j3 = (int)(256D * Math.sqrt(k2 * k2 + l2 * l2 + i3 * i3));
			if (j3 <= 0)
				j3 = 1;
			zu[i] = (k2 * 0x10000) / j3;
			av[i] = (l2 * 0x10000) / j3;
			bv[i] = (i3 * 65535) / j3;
			xu[i] = -1;
		}

		rm();
	}

	public void lm() {
		if (ev == 2) {
			ev = 0;
			for (int i = 0; i < ju; i++) {
				hw[i] = ew[i];
				iw[i] = fw[i];
				jw[i] = gw[i];
			}

			gv = iv = kv = 0xff676981;
			ix = hv = jv = lv = 0x98967f;
			return;
		}
		if (ev == 1) {
			ev = 0;
			for (int j = 0; j < ju; j++) {
				hw[j] = ew[j];
				iw[j] = fw[j];
				jw[j] = gw[j];
			}

			if (hx >= 2)
				ol(vw, ww, xw);
			if (hx >= 3)
				ul(yw, zw, ax);
			if (hx >= 4)
				im(bx, cx, dx, ex, fx, gx);
			if (hx >= 1)
				pm(sw, tw, uw);
			ql();
			hm();
		}
	}

	public void km(int i, int j, int k, int l, int i1, int j1, int k1, 
			int l1) {
		lm();
		if (kv > a.hd || lv < a.gd || gv > a.dd || hv < a.cd || iv > a.fd || jv < a.ed) {
			fv = false;
			return;
		}
		fv = true;
		int l2 = 0;
		int i3 = 0;
		int j3 = 0;
		int k3 = 0;
		int l3 = 0;
		int i4 = 0;
		if (j1 != 0) {
			l2 = yv[j1];
			i3 = yv[j1 + 1024];
		}
		if (i1 != 0) {
			l3 = yv[i1];
			i4 = yv[i1 + 1024];
		}
		if (l != 0) {
			j3 = yv[l];
			k3 = yv[l + 1024];
		}
		for (int j4 = 0; j4 < ju; j4++) {
			int k4 = hw[j4] - i;
			int l4 = iw[j4] - j;
			int i5 = jw[j4] - k;
			if (j1 != 0) {
				int i2 = l4 * l2 + k4 * i3 >> 15;
				l4 = l4 * i3 - k4 * l2 >> 15;
				k4 = i2;
			}
			if (i1 != 0) {
				int j2 = i5 * l3 + k4 * i4 >> 15;
				i5 = i5 * i4 - k4 * l3 >> 15;
				k4 = j2;
			}
			if (l != 0) {
				int k2 = l4 * k3 - i5 * j3 >> 15;
				i5 = l4 * j3 + i5 * k3 >> 15;
				l4 = k2;
			}
			if (i5 >= l1)
				nu[j4] = (k4 << k1) / i5;
			else
				nu[j4] = k4 << k1;
			if (i5 >= l1)
				ou[j4] = (l4 << k1) / i5;
			else
				ou[j4] = l4 << k1;
			ku[j4] = k4;
			lu[j4] = l4;
			mu[j4] = i5;
		}

	}

	public void nl() {
		lm();
		for (int i = 0; i < ju; i++) {
			ew[i] = hw[i];
			fw[i] = iw[i];
			gw[i] = jw[i];
		}

		sw = tw = uw = 0;
		vw = ww = xw = 0;
		yw = zw = ax = 256;
		bx = cx = dx = ex = fx = gx = 256;
		hx = 0;
	}

	public p zl() {
		p ap[] = new p[1];
		ap[0] = this;
		p p1 = new p(ap, 1);
		p1.dv = dv;
		return p1;
	}

	public p yl(boolean flag, boolean flag1, boolean flag2, boolean flag3) {
		p ap[] = new p[1];
		ap[0] = this;
		p p1 = new p(ap, 1, flag, flag1, flag2, flag3);
		p1.dv = dv;
		return p1;
	}

	public void jm(p p1) {
		vw = p1.vw;
		ww = p1.ww;
		xw = p1.xw;
		sw = p1.sw;
		tw = p1.tw;
		uw = p1.uw;
		sm();
		ev = 1;
	}

	public int cm(byte abyte0[]) {
		for (; abyte0[qx] == 10 || abyte0[qx] == 13; qx++);
		int i = aw[abyte0[qx++] & 0xff];
		int j = aw[abyte0[qx++] & 0xff];
		int k = aw[abyte0[qx++] & 0xff];
		int l = (i * 4096 + j * 64 + k) - 0x20000;
		if (l == 0x1e240)
			l = cw;
		return l;
	}

	public int ju;
	public int ku[];
	public int lu[];
	public int mu[];
	public int nu[];
	public int ou[];
	public int pu[];
	public byte qu[];
	public int ru;
	public int su[];
	public int tu[][];
	public int uu[];
	public int vu[];
	public int wu[];
	public int xu[];
	public int yu[];
	public int zu[];
	public int av[];
	public int bv[];
	public int cv;
	public int dv;
	public int ev;
	public boolean fv;
	public int gv;
	public int hv;
	public int iv;
	public int jv;
	public int kv;
	public int lv;
	public boolean mv;
	public boolean nv;
	public boolean ov;
	public int pv;
	public int qv[];
	public byte rv[];
	private boolean sv;
	public boolean tv;
	public boolean uv;
	public boolean vv;
	public boolean wv;
	private static int xv[];
	private static int yv[];
	private static byte zv[];
	private static int aw[];
	private int bw;
	private int cw;
	public int dw;
	public int ew[];
	public int fw[];
	public int gw[];
	public int hw[];
	public int iw[];
	public int jw[];
	private int kw;
	private int lw[][];
	private int mw[];
	private int nw[];
	private int ow[];
	private int pw[];
	private int qw[];
	private int rw[];
	private int sw;
	private int tw;
	private int uw;
	private int vw;
	private int ww;
	private int xw;
	private int yw;
	private int zw;
	private int ax;
	private int bx;
	private int cx;
	private int dx;
	private int ex;
	private int fx;
	private int gx;
	private int hx;
	private int ix;
	private int jx;
	private int kx;
	private int lx;
	private int mx;
	protected int nx;
	protected int ox;
	private byte px[];
	private int qx;
	private int rx;

	static  {
		xv = new int[512];
		yv = new int[2048];
		zv = new byte[64];
		aw = new int[256];
		for (int i = 0; i < 256; i++) {
			xv[i] = (int)(Math.sin((double)i * 0.02454369D) * 32768D);
			xv[i + 256] = (int)(Math.cos((double)i * 0.02454369D) * 32768D);
		}

		for (int j = 0; j < 1024; j++) {
			yv[j] = (int)(Math.sin((double)j * 0.00613592315D) * 32768D);
			yv[j + 1024] = (int)(Math.cos((double)j * 0.00613592315D) * 32768D);
		}

		for (int k = 0; k < 10; k++)
			zv[k] = (byte)(48 + k);

		for (int l = 0; l < 26; l++)
			zv[l + 10] = (byte)(65 + l);

		for (int i1 = 0; i1 < 26; i1++)
			zv[i1 + 36] = (byte)(97 + i1);

		zv[62] = -93;
		zv[63] = 36;
		for (int j1 = 0; j1 < 10; j1++)
			aw[48 + j1] = j1;

		for (int k1 = 0; k1 < 26; k1++)
			aw[65 + k1] = k1 + 10;

		for (int l1 = 0; l1 < 26; l1++)
			aw[97 + l1] = l1 + 36;

		aw[163] = 62;
		aw[36] = 63;
	}
}
