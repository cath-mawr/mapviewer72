// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb space 

package jagex.client;

import jagex.c;
import jagex.m;
import java.io.IOException;
import java.io.PrintStream;

// Referenced classes of package jagex.client:
//			s, p, n, i, 
//			e, b

public class a {

	public a(i i1, int j1, int k1, int l1) {
		a = 50;
		b = new int[a];
		c = new int[a][256];
		f = 5;
		g = 1000;
		h = 1000;
		i = 20;
		j = 10;
		m = false;
		n = 1.1000000000000001D;
		o = 1;
		p = false;
		t = 100;
		u = new p[t];
		v = new int[t];
		w = 512;
		x = 256;
		y = 192;
		z = 256;
		ab = 256;
		bb = 8;
		cb = 4;
		vc = new int[40];
		wc = new int[40];
		xc = new int[40];
		yc = new int[40];
		zc = new int[40];
		ad = new int[40];
		bd = false;
		qc = i1;
		x = i1.ni / 2;
		y = i1.oi / 2;
		rc = i1.ti;
		jb = 0;
		kb = j1;
		lb = new p[kb];
		mb = new int[kb];
		nb = 0;
		ob = new s[k1];
		for (int i2 = 0; i2 < k1; i2++)
			ob[i2] = new s();

		qb = 0;
		yb = new p(l1 * 2, l1);
		rb = new int[l1];
		vb = new int[l1];
		wb = new int[l1];
		sb = new int[l1];
		tb = new int[l1];
		ub = new int[l1];
		xb = new int[l1];
		if (oc == null)
			oc = new byte[17691];
		db = 0;
		eb = 0;
		fb = 0;
		gb = 0;
		hb = 0;
		ib = 0;
		for (int j2 = 0; j2 < 256; j2++) {
			l[j2] = (int)(Math.sin((double)j2 * 0.02454369D) * 32768D);
			l[j2 + 256] = (int)(Math.cos((double)j2 * 0.02454369D) * 32768D);
		}

		for (int k2 = 0; k2 < 1024; k2++) {
			k[k2] = (int)(Math.sin((double)k2 * 0.00613592315D) * 32768D);
			k[k2 + 1024] = (int)(Math.cos((double)k2 * 0.00613592315D) * 32768D);
		}

	}

	public void hb(p p1) {
		if (jb < kb) {
			mb[jb] = 0;
			lb[jb++] = p1;
		}
	}

	public void bb(p p1) {
		for (int i1 = 0; i1 < jb; i1++)
			if (lb[i1] == p1) {
				jb--;
				for (int j1 = i1; j1 < jb; j1++) {
					lb[j1] = lb[j1 + 1];
					mb[j1] = mb[j1 + 1];
				}

			}

	}

	public void x() {
		pb();
		for (int i1 = 0; i1 < jb; i1++)
			lb[i1] = null;

		jb = 0;
	}

	public void pb() {
		qb = 0;
		yb.fm();
	}

	public void s(int i1) {
		qb -= i1;
		yb.rl(i1, i1 * 2);
		if (qb < 0)
			qb = 0;
	}

	public int sb(int i1, int j1, int k1, int l1, int i2, int j2) {
		rb[qb] = i1;
		sb[qb] = j1;
		tb[qb] = k1;
		ub[qb] = l1;
		vb[qb] = i2;
		wb[qb] = j2;
		xb[qb] = 0;
		int k2 = yb.am(j1, k1, l1);
		int l2 = yb.am(j1, k1 - j2, l1);
		int ai[] = {
			k2, l2
		};
		yb.gm(2, ai, 0, 0);
		yb.rv[qb++] = 0;
		return qb - 1;
	}

	public int z(int i1, int j1, int k1, int l1, int i2, int j2, int k2) {
		rb[qb] = i1;
		sb[qb] = j1;
		tb[qb] = k1;
		ub[qb] = l1;
		vb[qb] = i2;
		wb[qb] = j2;
		xb[qb] = 0;
		int l2 = yb.am(j1, k1, l1);
		int i3 = yb.am(j1, k1 - j2, l1);
		int ai[] = {
			l2, i3
		};
		yb.gm(2, ai, 0, 0);
		yb.qv[qb] = k2;
		yb.rv[qb++] = 0;
		return qb - 1;
	}

	public void ab(int i1) {
		yb.rv[i1] = 1;
	}

	public void ib(int i1, int j1) {
		xb[i1] = j1;
	}

	public void n(int i1, int j1) {
		q = i1 - z;
		r = j1;
		s = 0;
		p = true;
	}

	public int q() {
		return s;
	}

	public int[] k() {
		return v;
	}

	public p[] r() {
		return u;
	}

	public void vb(int i1, int j1, int k1, int l1, int i2, int j2) {
		x = k1;
		y = l1;
		z = i1;
		ab = j1;
		w = i2;
		bb = j2;
		sc = new e[l1 + j1];
		for (int k2 = 0; k2 < l1 + j1; k2++)
			sc[k2] = new e();

	}

	private void f(s as[], int i1, int j1) {
		if (i1 < j1) {
			int k1 = i1 - 1;
			int l1 = j1 + 1;
			int i2 = (i1 + j1) / 2;
			s s1 = as[i2];
			as[i2] = as[i1];
			as[i1] = s1;
			int j2 = s1.smb;
			while (k1 < l1)  {
				do
					l1--;
				while (as[l1].smb < j2);
				do
					k1++;
				while (as[k1].smb > j2);
				if (k1 < l1) {
					s s2 = as[k1];
					as[k1] = as[l1];
					as[l1] = s2;
				}
			}
			f(as, i1, l1);
			f(as, l1 + 1, j1);
		}
	}

	public void c(int i1, s as[], int j1) {
		for (int k1 = 0; k1 <= j1; k1++) {
			as[k1].ymb = false;
			as[k1].zmb = k1;
			as[k1].anb = -1;
		}

		int l1 = 0;
		do {
			while (as[l1].ymb) 
				l1++;
			if (l1 == j1)
				return;
			s s1 = as[l1];
			s1.ymb = true;
			int i2 = l1;
			int j2 = l1 + i1;
			if (j2 >= j1)
				j2 = j1 - 1;
			for (int k2 = j2; k2 >= i2 + 1; k2--) {
				s s2 = as[k2];
				if (s1.kmb < s2.mmb && s2.kmb < s1.mmb && s1.lmb < s2.nmb && s2.lmb < s1.nmb && s1.zmb != s2.anb && !fb(s1, s2) && qb(s2, s1)) {
					d(as, i2, k2);
					if (as[k2] != s2)
						k2++;
					i2 = id;
					s2.anb = s1.zmb;
				}
			}

		} while (true);
	}

	public boolean d(s as[], int i1, int j1) {
		do {
			s s1 = as[i1];
			for (int k1 = i1 + 1; k1 <= j1; k1++) {
				s s2 = as[k1];
				if (!fb(s2, s1))
					break;
				as[i1] = s2;
				as[k1] = s1;
				i1 = k1;
				if (i1 == j1) {
					id = i1;
					jd = i1 - 1;
					return true;
				}
			}

			s s3 = as[j1];
			for (int l1 = j1 - 1; l1 >= i1; l1--) {
				s s4 = as[l1];
				if (!fb(s3, s4))
					break;
				as[j1] = s4;
				as[l1] = s3;
				j1 = l1;
				if (i1 == j1) {
					id = j1 + 1;
					jd = j1;
					return true;
				}
			}

			if (i1 + 1 >= j1) {
				id = i1;
				jd = j1;
				return false;
			}
			if (!d(as, i1 + 1, j1)) {
				id = i1;
				return false;
			}
			j1 = jd;
		} while (true);
	}

	public void nb(int i1, int j1, int k1) {
		int l1 = -gb + 1024 & 0x3ff;
		int i2 = -hb + 1024 & 0x3ff;
		int j2 = -ib + 1024 & 0x3ff;
		if (j2 != 0) {
			int k2 = k[j2];
			int j3 = k[j2 + 1024];
			int i4 = j1 * k2 + i1 * j3 >> 15;
			j1 = j1 * j3 - i1 * k2 >> 15;
			i1 = i4;
		}
		if (l1 != 0) {
			int l2 = k[l1];
			int k3 = k[l1 + 1024];
			int j4 = j1 * k3 - k1 * l2 >> 15;
			k1 = j1 * l2 + k1 * k3 >> 15;
			j1 = j4;
		}
		if (i2 != 0) {
			int i3 = k[i2];
			int l3 = k[i2 + 1024];
			int k4 = k1 * i3 + i1 * l3 >> 15;
			k1 = k1 * l3 - i1 * i3 >> 15;
			i1 = k4;
		}
		if (i1 < cd)
			cd = i1;
		if (i1 > dd)
			dd = i1;
		if (j1 < ed)
			ed = j1;
		if (j1 > fd)
			fd = j1;
		if (k1 < gd)
			gd = k1;
		if (k1 > hd)
			hd = k1;
	}

	public void i() {
		bd = qc.mj;
		int i4 = x * g >> bb;
		int j4 = y * g >> bb;
		cd = 0;
		dd = 0;
		ed = 0;
		fd = 0;
		gd = 0;
		hd = 0;
		nb(-i4, -j4, g);
		nb(-i4, j4, g);
		nb(i4, -j4, g);
		nb(i4, j4, g);
		nb(-x, -y, 0);
		nb(-x, y, 0);
		nb(x, -y, 0);
		nb(x, y, 0);
		cd += db;
		dd += db;
		ed += eb;
		fd += eb;
		gd += fb;
		hd += fb;
		lb[jb] = yb;
		yb.ev = 2;
		for (int i1 = 0; i1 < jb; i1++)
			lb[i1].km(db, eb, fb, gb, hb, ib, bb, f);

		lb[jb].km(db, eb, fb, gb, hb, ib, bb, f);
		nb = 0;
		for (int k4 = 0; k4 < jb; k4++) {
			p p1 = lb[k4];
			if (p1.fv) {
				for (int j1 = 0; j1 < p1.ru; j1++) {
					int l4 = p1.su[j1];
					int ai1[] = p1.tu[j1];
					boolean flag = false;
					for (int k5 = 0; k5 < l4; k5++) {
						int i2 = p1.mu[ai1[k5]];
						if (i2 <= f || i2 >= g)
							continue;
						flag = true;
						break;
					}

					if (flag) {
						int l2 = 0;
						for (int k6 = 0; k6 < l4; k6++) {
							int j2 = p1.nu[ai1[k6]];
							if (j2 > -x)
								l2 |= 1;
							if (j2 < x)
								l2 |= 2;
							if (l2 == 3)
								break;
						}

						if (l2 == 3) {
							int i3 = 0;
							for (int l7 = 0; l7 < l4; l7++) {
								int k2 = p1.ou[ai1[l7]];
								if (k2 > -y)
									i3 |= 1;
								if (k2 < y)
									i3 |= 2;
								if (i3 == 3)
									break;
							}

							if (i3 == 3) {
								s s2 = ob[nb];
								s2.qmb = p1;
								s2.rmb = j1;
								rb(nb);
								int l9;
								if (s2.wmb < 0)
									l9 = p1.uu[j1];
								else
									l9 = p1.vu[j1];
								if (l9 != 0xbc614e) {
									int j3 = 0;
									for (int l10 = 0; l10 < l4; l10++)
										j3 += p1.mu[ai1[l10]];

									int l3;
									s2.smb = l3 = j3 / l4 + p1.dv;
									s2.xmb = l9;
									nb++;
								}
							}
						}
					}
				}

			}
		}

		p p2 = yb;
		if (p2.fv) {
			for (int k1 = 0; k1 < p2.ru; k1++) {
				int ai[] = p2.tu[k1];
				int j5 = ai[0];
				int l5 = p2.nu[j5];
				int l6 = p2.ou[j5];
				int i8 = p2.mu[j5];
				if (i8 > f && i8 < h) {
					int i9 = (vb[k1] << bb) / i8;
					int i10 = (wb[k1] << bb) / i8;
					if (l5 - i9 / 2 <= x && l5 + i9 / 2 >= -x && l6 - i10 <= y && l6 >= -y) {
						s s3 = ob[nb];
						s3.qmb = p2;
						s3.rmb = k1;
						cb(nb);
						s3.smb = (i8 + p2.mu[ai[1]]) / 2;
						nb++;
					}
				}
			}

		}
		if (nb == 0)
			return;
		e = nb;
		f(ob, 0, nb - 1);
		c(100, ob, nb);
		for (int i5 = 0; i5 < nb; i5++) {
			s s1 = ob[i5];
			p p3 = s1.qmb;
			int l1 = s1.rmb;
			if (p3 == yb) {
				int ai2[] = p3.tu[l1];
				int i7 = ai2[0];
				int j8 = p3.nu[i7];
				int j9 = p3.ou[i7];
				int j10 = p3.mu[i7];
				int i11 = (vb[l1] << bb) / j10;
				int k11 = (wb[l1] << bb) / j10;
				int i12 = j9 - p3.ou[ai2[1]];
				int j12 = ((p3.nu[ai2[1]] - j8) * i12) / k11;
				j12 = p3.nu[ai2[1]] - j8;
				int l12 = j8 - i11 / 2;
				int j13 = (ab + j9) - k11;
				qc.nf(l12 + z, j13, i11, k11, rb[l1], j12, (256 << bb) / j10);
				if (p && s < t) {
					l12 += (xb[l1] << bb) / j10;
					if (r >= j13 && r <= j13 + k11 && q >= l12 && q <= l12 + i11 && !p3.vv && p3.rv[l1] == 0) {
						u[s] = p3;
						v[s] = l1;
						s++;
					}
				}
			} else {
				int k9 = 0;
				int j11 = 0;
				int l11 = p3.su[l1];
				int ai3[] = p3.tu[l1];
				if (p3.yu[l1] != 0xbc614e)
					if (s1.wmb < 0)
						j11 = p3.ox - p3.yu[l1];
					else
						j11 = p3.ox + p3.yu[l1];
				for (int k12 = 0; k12 < l11; k12++) {
					int k3 = ai3[k12];
					yc[k12] = p3.ku[k3];
					zc[k12] = p3.lu[k3];
					ad[k12] = p3.mu[k3];
					if (p3.yu[l1] == 0xbc614e)
						if (s1.wmb < 0)
							j11 = (p3.ox - p3.pu[k3]) + p3.qu[k3];
						else
							j11 = p3.ox + p3.pu[k3] + p3.qu[k3];
					if (p3.mu[k3] >= f) {
						vc[k9] = p3.nu[k3];
						wc[k9] = p3.ou[k3];
						xc[k9] = j11;
						if (p3.mu[k3] > j)
							xc[k9] += (p3.mu[k3] - j) / i;
						k9++;
					} else {
						int k10;
						if (k12 == 0)
							k10 = ai3[l11 - 1];
						else
							k10 = ai3[k12 - 1];
						if (p3.mu[k10] >= f) {
							int k8 = p3.mu[k3] - p3.mu[k10];
							int i6 = p3.ku[k3] - ((p3.ku[k3] - p3.ku[k10]) * (p3.mu[k3] - f)) / k8;
							int j7 = p3.lu[k3] - ((p3.lu[k3] - p3.lu[k10]) * (p3.mu[k3] - f)) / k8;
							vc[k9] = (i6 << bb) / f;
							wc[k9] = (j7 << bb) / f;
							xc[k9] = j11;
							k9++;
						}
						if (k12 == l11 - 1)
							k10 = ai3[0];
						else
							k10 = ai3[k12 + 1];
						if (p3.mu[k10] >= f) {
							int l8 = p3.mu[k3] - p3.mu[k10];
							int j6 = p3.ku[k3] - ((p3.ku[k3] - p3.ku[k10]) * (p3.mu[k3] - f)) / l8;
							int k7 = p3.lu[k3] - ((p3.lu[k3] - p3.lu[k10]) * (p3.mu[k3] - f)) / l8;
							vc[k9] = (j6 << bb) / f;
							wc[k9] = (k7 << bb) / f;
							xc[k9] = j11;
							k9++;
						}
					}
				}

				for (int i13 = 0; i13 < l11; i13++) {
					if (xc[i13] < 0)
						xc[i13] = 0;
					else
					if (xc[i13] > 255)
						xc[i13] = 255;
					if (s1.xmb >= 0)
						if (gc[s1.xmb] == 1)
							xc[i13] <<= 9;
						else
							xc[i13] <<= 6;
				}

				t(0, 0, 0, 0, k9, vc, wc, xc, p3, l1);
				if (uc > tc)
					jb(0, 0, l11, yc, zc, ad, s1.xmb, p3);
			}
		}

		p = false;
	}

	private void t(int i1, int j1, int k1, int l1, int i2, int ai[], int ai1[], 
			int ai2[], p p1, int j2) {
		if (i2 == 3) {
			int k2 = ai1[0] + ab;
			int k3 = ai1[1] + ab;
			int k4 = ai1[2] + ab;
			int k5 = ai[0];
			int l6 = ai[1];
			int j8 = ai[2];
			int l9 = ai2[0];
			int j11 = ai2[1];
			int j12 = ai2[2];
			int j13 = (ab + y) - 1;
			int l13 = 0;
			int j14 = 0;
			int l14 = 0;
			int j15 = 0;
			int l15 = 0xbc614e;
			int j16 = 0xff439eb2;
			if (k4 != k2) {
				j14 = (j8 - k5 << 8) / (k4 - k2);
				j15 = (j12 - l9 << 8) / (k4 - k2);
				if (k2 < k4) {
					l13 = k5 << 8;
					l14 = l9 << 8;
					l15 = k2;
					j16 = k4;
				} else {
					l13 = j8 << 8;
					l14 = j12 << 8;
					l15 = k4;
					j16 = k2;
				}
				if (l15 < 0) {
					l13 -= j14 * l15;
					l14 -= j15 * l15;
					l15 = 0;
				}
				if (j16 > j13)
					j16 = j13;
			}
			int l16 = 0;
			int j17 = 0;
			int l17 = 0;
			int j18 = 0;
			int l18 = 0xbc614e;
			int j19 = 0xff439eb2;
			if (k3 != k2) {
				j17 = (l6 - k5 << 8) / (k3 - k2);
				j18 = (j11 - l9 << 8) / (k3 - k2);
				if (k2 < k3) {
					l16 = k5 << 8;
					l17 = l9 << 8;
					l18 = k2;
					j19 = k3;
				} else {
					l16 = l6 << 8;
					l17 = j11 << 8;
					l18 = k3;
					j19 = k2;
				}
				if (l18 < 0) {
					l16 -= j17 * l18;
					l17 -= j18 * l18;
					l18 = 0;
				}
				if (j19 > j13)
					j19 = j13;
			}
			int l19 = 0;
			int j20 = 0;
			int l20 = 0;
			int j21 = 0;
			int l21 = 0xbc614e;
			int j22 = 0xff439eb2;
			if (k4 != k3) {
				j20 = (j8 - l6 << 8) / (k4 - k3);
				j21 = (j12 - j11 << 8) / (k4 - k3);
				if (k3 < k4) {
					l19 = l6 << 8;
					l20 = j11 << 8;
					l21 = k3;
					j22 = k4;
				} else {
					l19 = j8 << 8;
					l20 = j12 << 8;
					l21 = k4;
					j22 = k3;
				}
				if (l21 < 0) {
					l19 -= j20 * l21;
					l20 -= j21 * l21;
					l21 = 0;
				}
				if (j22 > j13)
					j22 = j13;
			}
			tc = l15;
			if (l18 < tc)
				tc = l18;
			if (l21 < tc)
				tc = l21;
			uc = j16;
			if (j19 > uc)
				uc = j19;
			if (j22 > uc)
				uc = j22;
			int l22 = 0;
			for (k1 = tc; k1 < uc; k1++) {
				if (k1 >= l15 && k1 < j16) {
					i1 = j1 = l13;
					l1 = l22 = l14;
					l13 += j14;
					l14 += j15;
				} else {
					i1 = 0xa0000;
					j1 = 0xfff60000;
				}
				if (k1 >= l18 && k1 < j19) {
					if (l16 < i1) {
						i1 = l16;
						l1 = l17;
					}
					if (l16 > j1) {
						j1 = l16;
						l22 = l17;
					}
					l16 += j17;
					l17 += j18;
				}
				if (k1 >= l21 && k1 < j22) {
					if (l19 < i1) {
						i1 = l19;
						l1 = l20;
					}
					if (l19 > j1) {
						j1 = l19;
						l22 = l20;
					}
					l19 += j20;
					l20 += j21;
				}
				e e7 = sc[k1];
				e7.lf = i1;
				e7.mf = j1;
				e7.nf = l1;
				e7.of = l22;
			}

			if (tc < ab - y)
				tc = ab - y;
		} else
		if (i2 == 4) {
			int l2 = ai1[0] + ab;
			int l3 = ai1[1] + ab;
			int l4 = ai1[2] + ab;
			int l5 = ai1[3] + ab;
			int i7 = ai[0];
			int k8 = ai[1];
			int i10 = ai[2];
			int k11 = ai[3];
			int k12 = ai2[0];
			int k13 = ai2[1];
			int i14 = ai2[2];
			int k14 = ai2[3];
			int i15 = (ab + y) - 1;
			int k15 = 0;
			int i16 = 0;
			int k16 = 0;
			int i17 = 0;
			int k17 = 0xbc614e;
			int i18 = 0xff439eb2;
			if (l5 != l2) {
				i16 = (k11 - i7 << 8) / (l5 - l2);
				i17 = (k14 - k12 << 8) / (l5 - l2);
				if (l2 < l5) {
					k15 = i7 << 8;
					k16 = k12 << 8;
					k17 = l2;
					i18 = l5;
				} else {
					k15 = k11 << 8;
					k16 = k14 << 8;
					k17 = l5;
					i18 = l2;
				}
				if (k17 < 0) {
					k15 -= i16 * k17;
					k16 -= i17 * k17;
					k17 = 0;
				}
				if (i18 > i15)
					i18 = i15;
			}
			int k18 = 0;
			int i19 = 0;
			int k19 = 0;
			int i20 = 0;
			int k20 = 0xbc614e;
			int i21 = 0xff439eb2;
			if (l3 != l2) {
				i19 = (k8 - i7 << 8) / (l3 - l2);
				i20 = (k13 - k12 << 8) / (l3 - l2);
				if (l2 < l3) {
					k18 = i7 << 8;
					k19 = k12 << 8;
					k20 = l2;
					i21 = l3;
				} else {
					k18 = k8 << 8;
					k19 = k13 << 8;
					k20 = l3;
					i21 = l2;
				}
				if (k20 < 0) {
					k18 -= i19 * k20;
					k19 -= i20 * k20;
					k20 = 0;
				}
				if (i21 > i15)
					i21 = i15;
			}
			int k21 = 0;
			int i22 = 0;
			int k22 = 0;
			int i23 = 0;
			int j23 = 0xbc614e;
			int k23 = 0xff439eb2;
			if (l4 != l3) {
				i22 = (i10 - k8 << 8) / (l4 - l3);
				i23 = (i14 - k13 << 8) / (l4 - l3);
				if (l3 < l4) {
					k21 = k8 << 8;
					k22 = k13 << 8;
					j23 = l3;
					k23 = l4;
				} else {
					k21 = i10 << 8;
					k22 = i14 << 8;
					j23 = l4;
					k23 = l3;
				}
				if (j23 < 0) {
					k21 -= i22 * j23;
					k22 -= i23 * j23;
					j23 = 0;
				}
				if (k23 > i15)
					k23 = i15;
			}
			int l23 = 0;
			int i24 = 0;
			int j24 = 0;
			int k24 = 0;
			int l24 = 0xbc614e;
			int i25 = 0xff439eb2;
			if (l5 != l4) {
				i24 = (k11 - i10 << 8) / (l5 - l4);
				k24 = (k14 - i14 << 8) / (l5 - l4);
				if (l4 < l5) {
					l23 = i10 << 8;
					j24 = i14 << 8;
					l24 = l4;
					i25 = l5;
				} else {
					l23 = k11 << 8;
					j24 = k14 << 8;
					l24 = l5;
					i25 = l4;
				}
				if (l24 < 0) {
					l23 -= i24 * l24;
					j24 -= k24 * l24;
					l24 = 0;
				}
				if (i25 > i15)
					i25 = i15;
			}
			tc = k17;
			if (k20 < tc)
				tc = k20;
			if (j23 < tc)
				tc = j23;
			if (l24 < tc)
				tc = l24;
			uc = i18;
			if (i21 > uc)
				uc = i21;
			if (k23 > uc)
				uc = k23;
			if (i25 > uc)
				uc = i25;
			int j25 = 0;
			for (k1 = tc; k1 < uc; k1++) {
				if (k1 >= k17 && k1 < i18) {
					i1 = j1 = k15;
					l1 = j25 = k16;
					k15 += i16;
					k16 += i17;
				} else {
					i1 = 0xa0000;
					j1 = 0xfff60000;
				}
				if (k1 >= k20 && k1 < i21) {
					if (k18 < i1) {
						i1 = k18;
						l1 = k19;
					}
					if (k18 > j1) {
						j1 = k18;
						j25 = k19;
					}
					k18 += i19;
					k19 += i20;
				}
				if (k1 >= j23 && k1 < k23) {
					if (k21 < i1) {
						i1 = k21;
						l1 = k22;
					}
					if (k21 > j1) {
						j1 = k21;
						j25 = k22;
					}
					k21 += i22;
					k22 += i23;
				}
				if (k1 >= l24 && k1 < i25) {
					if (l23 < i1) {
						i1 = l23;
						l1 = j24;
					}
					if (l23 > j1) {
						j1 = l23;
						j25 = j24;
					}
					l23 += i24;
					j24 += k24;
				}
				e e8 = sc[k1];
				e8.lf = i1;
				e8.mf = j1;
				e8.nf = l1;
				e8.of = j25;
			}

			if (tc < ab - y)
				tc = ab - y;
		} else {
			uc = tc = ai1[0] += ab;
			for (k1 = 1; k1 < i2; k1++) {
				int i3;
				if ((i3 = ai1[k1] += ab) < tc)
					tc = i3;
				else
				if (i3 > uc)
					uc = i3;
			}

			if (tc < ab - y)
				tc = ab - y;
			if (uc >= ab + y)
				uc = (ab + y) - 1;
			if (tc >= uc)
				return;
			for (k1 = tc; k1 < uc; k1++) {
				e e1 = sc[k1];
				e1.lf = 0xa0000;
				e1.mf = 0xfff60000;
			}

			int j3 = i2 - 1;
			int i4 = ai1[0];
			int i5 = ai1[j3];
			if (i4 < i5) {
				int i6 = ai[0] << 8;
				int j7 = (ai[j3] - ai[0] << 8) / (i5 - i4);
				int l8 = ai2[0] << 8;
				int j10 = (ai2[j3] - ai2[0] << 8) / (i5 - i4);
				if (i4 < 0) {
					i6 -= j7 * i4;
					l8 -= j10 * i4;
					i4 = 0;
				}
				if (i5 > uc)
					i5 = uc;
				for (k1 = i4; k1 <= i5; k1++) {
					e e3 = sc[k1];
					e3.lf = e3.mf = i6;
					e3.nf = e3.of = l8;
					i6 += j7;
					l8 += j10;
				}

			} else
			if (i4 > i5) {
				int j6 = ai[j3] << 8;
				int k7 = (ai[0] - ai[j3] << 8) / (i4 - i5);
				int i9 = ai2[j3] << 8;
				int k10 = (ai2[0] - ai2[j3] << 8) / (i4 - i5);
				if (i5 < 0) {
					j6 -= k7 * i5;
					i9 -= k10 * i5;
					i5 = 0;
				}
				if (i4 > uc)
					i4 = uc;
				for (k1 = i5; k1 <= i4; k1++) {
					e e4 = sc[k1];
					e4.lf = e4.mf = j6;
					e4.nf = e4.of = i9;
					j6 += k7;
					i9 += k10;
				}

			}
			for (k1 = 0; k1 < j3; k1++) {
				int k6 = k1 + 1;
				int j4 = ai1[k1];
				int j5 = ai1[k6];
				if (j4 < j5) {
					int l7 = ai[k1] << 8;
					int j9 = (ai[k6] - ai[k1] << 8) / (j5 - j4);
					int l10 = ai2[k1] << 8;
					int l11 = (ai2[k6] - ai2[k1] << 8) / (j5 - j4);
					if (j4 < 0) {
						l7 -= j9 * j4;
						l10 -= l11 * j4;
						j4 = 0;
					}
					if (j5 > uc)
						j5 = uc;
					for (int l12 = j4; l12 <= j5; l12++) {
						e e5 = sc[l12];
						if (l7 < e5.lf) {
							e5.lf = l7;
							e5.nf = l10;
						}
						if (l7 > e5.mf) {
							e5.mf = l7;
							e5.of = l10;
						}
						l7 += j9;
						l10 += l11;
					}

				} else
				if (j4 > j5) {
					int i8 = ai[k6] << 8;
					int k9 = (ai[k1] - ai[k6] << 8) / (j4 - j5);
					int i11 = ai2[k6] << 8;
					int i12 = (ai2[k1] - ai2[k6] << 8) / (j4 - j5);
					if (j5 < 0) {
						i8 -= k9 * j5;
						i11 -= i12 * j5;
						j5 = 0;
					}
					if (j4 > uc)
						j4 = uc;
					for (int i13 = j5; i13 <= j4; i13++) {
						e e6 = sc[i13];
						if (i8 < e6.lf) {
							e6.lf = i8;
							e6.nf = i11;
						}
						if (i8 > e6.mf) {
							e6.mf = i8;
							e6.of = i11;
						}
						i8 += k9;
						i11 += i12;
					}

				}
			}

			if (tc < ab - y)
				tc = ab - y;
		}
		if (p && s < t && r >= tc && r < uc) {
			e e2 = sc[r];
			if (q >= e2.lf >> 8 && q <= e2.mf >> 8 && e2.lf <= e2.mf && !p1.vv && p1.rv[j2] == 0) {
				u[s] = p1;
				v[s] = j2;
				s++;
			}
		}
	}

	private void jb(int i1, int j1, int k1, int ai[], int ai1[], int ai2[], int l1, 
			p p1) {
		if (l1 >= 0) {
			if (l1 >= dc)
				l1 = 0;
			u(l1);
			int i2 = ai[0];
			int k2 = ai1[0];
			int j3 = ai2[0];
			int i4 = i2 - ai[1];
			int k4 = k2 - ai1[1];
			int i5 = j3 - ai2[1];
			k1--;
			int i7 = ai[k1] - i2;
			int j8 = ai1[k1] - k2;
			int k9 = ai2[k1] - j3;
			if (gc[l1] == 1) {
				int l10 = i7 * k2 - j8 * i2 << 12;
				int k11 = j8 * j3 - k9 * k2 << (5 - bb) + 7 + 4;
				int i12 = k9 * i2 - i7 * j3 << (5 - bb) + 7;
				int k12 = i4 * k2 - k4 * i2 << 12;
				int i13 = k4 * j3 - i5 * k2 << (5 - bb) + 7 + 4;
				int k13 = i5 * i2 - i4 * j3 << (5 - bb) + 7;
				int i14 = k4 * i7 - i4 * j8 << 5;
				int k14 = i5 * j8 - k4 * k9 << (5 - bb) + 4;
				int i15 = i4 * k9 - i5 * i7 >> bb - 5;
				int k15 = k11 >> 4;
				int i16 = i13 >> 4;
				int k16 = k14 >> 4;
				int i17 = tc - ab;
				int k17 = w;
				int i18 = z + tc * k17;
				byte byte1 = 1;
				l10 += i12 * i17;
				k12 += k13 * i17;
				i14 += i15 * i17;
				if (bd) {
					if ((tc & 1) == 1) {
						tc++;
						l10 += i12;
						k12 += k13;
						i14 += i15;
						i18 += k17;
					}
					i12 <<= 1;
					k13 <<= 1;
					i15 <<= 1;
					k17 <<= 1;
					byte1 = 2;
				}
				if (p1.nv) {
					for (i1 = tc; i1 < uc; i1 += byte1) {
						e e4 = sc[i1];
						j1 = e4.lf >> 8;
						int k18 = e4.mf >> 8;
						int k21 = k18 - j1;
						if (k21 <= 0) {
							l10 += i12;
							k12 += k13;
							i14 += i15;
							i18 += k17;
						} else {
							int i23 = e4.nf;
							int k24 = (e4.of - i23) / k21;
							if (j1 < -x) {
								i23 += (-x - j1) * k24;
								j1 = -x;
								k21 = k18 - j1;
							}
							if (k18 > x) {
								int l18 = x;
								k21 = l18 - j1;
							}
							y(rc, jc[l1], 0, 0, l10 + k15 * j1, k12 + i16 * j1, i14 + k16 * j1, k11, i13, k14, k21, i18 + j1, i23, k24 << 2);
							l10 += i12;
							k12 += k13;
							i14 += i15;
							i18 += k17;
						}
					}

					return;
				}
				if (!ic[l1]) {
					for (i1 = tc; i1 < uc; i1 += byte1) {
						e e5 = sc[i1];
						j1 = e5.lf >> 8;
						int i19 = e5.mf >> 8;
						int l21 = i19 - j1;
						if (l21 <= 0) {
							l10 += i12;
							k12 += k13;
							i14 += i15;
							i18 += k17;
						} else {
							int j23 = e5.nf;
							int l24 = (e5.of - j23) / l21;
							if (j1 < -x) {
								j23 += (-x - j1) * l24;
								j1 = -x;
								l21 = i19 - j1;
							}
							if (i19 > x) {
								int j19 = x;
								l21 = j19 - j1;
							}
							db(rc, jc[l1], 0, 0, l10 + k15 * j1, k12 + i16 * j1, i14 + k16 * j1, k11, i13, k14, l21, i18 + j1, j23, l24 << 2);
							l10 += i12;
							k12 += k13;
							i14 += i15;
							i18 += k17;
						}
					}

					return;
				}
				for (i1 = tc; i1 < uc; i1 += byte1) {
					e e6 = sc[i1];
					j1 = e6.lf >> 8;
					int k19 = e6.mf >> 8;
					int i22 = k19 - j1;
					if (i22 <= 0) {
						l10 += i12;
						k12 += k13;
						i14 += i15;
						i18 += k17;
					} else {
						int k23 = e6.nf;
						int i25 = (e6.of - k23) / i22;
						if (j1 < -x) {
							k23 += (-x - j1) * i25;
							j1 = -x;
							i22 = k19 - j1;
						}
						if (k19 > x) {
							int l19 = x;
							i22 = l19 - j1;
						}
						w(rc, 0, 0, 0, jc[l1], l10 + k15 * j1, k12 + i16 * j1, i14 + k16 * j1, k11, i13, k14, i22, i18 + j1, k23, i25);
						l10 += i12;
						k12 += k13;
						i14 += i15;
						i18 += k17;
					}
				}

				return;
			}
			int i11 = i7 * k2 - j8 * i2 << 11;
			int l11 = j8 * j3 - k9 * k2 << (5 - bb) + 6 + 4;
			int j12 = k9 * i2 - i7 * j3 << (5 - bb) + 6;
			int l12 = i4 * k2 - k4 * i2 << 11;
			int j13 = k4 * j3 - i5 * k2 << (5 - bb) + 6 + 4;
			int l13 = i5 * i2 - i4 * j3 << (5 - bb) + 6;
			int j14 = k4 * i7 - i4 * j8 << 5;
			int l14 = i5 * j8 - k4 * k9 << (5 - bb) + 4;
			int j15 = i4 * k9 - i5 * i7 >> bb - 5;
			int l15 = l11 >> 4;
			int j16 = j13 >> 4;
			int l16 = l14 >> 4;
			int j17 = tc - ab;
			int l17 = w;
			int j18 = z + tc * l17;
			byte byte2 = 1;
			i11 += j12 * j17;
			l12 += l13 * j17;
			j14 += j15 * j17;
			if (bd) {
				if ((tc & 1) == 1) {
					tc++;
					i11 += j12;
					l12 += l13;
					j14 += j15;
					j18 += l17;
				}
				j12 <<= 1;
				l13 <<= 1;
				j15 <<= 1;
				l17 <<= 1;
				byte2 = 2;
			}
			if (p1.nv) {
				for (i1 = tc; i1 < uc; i1 += byte2) {
					e e7 = sc[i1];
					j1 = e7.lf >> 8;
					int i20 = e7.mf >> 8;
					int j22 = i20 - j1;
					if (j22 <= 0) {
						i11 += j12;
						l12 += l13;
						j14 += j15;
						j18 += l17;
					} else {
						int l23 = e7.nf;
						int j25 = (e7.of - l23) / j22;
						if (j1 < -x) {
							l23 += (-x - j1) * j25;
							j1 = -x;
							j22 = i20 - j1;
						}
						if (i20 > x) {
							int j20 = x;
							j22 = j20 - j1;
						}
						b(rc, jc[l1], 0, 0, i11 + l15 * j1, l12 + j16 * j1, j14 + l16 * j1, l11, j13, l14, j22, j18 + j1, l23, j25);
						i11 += j12;
						l12 += l13;
						j14 += j15;
						j18 += l17;
					}
				}

				return;
			}
			if (!ic[l1]) {
				for (i1 = tc; i1 < uc; i1 += byte2) {
					e e8 = sc[i1];
					j1 = e8.lf >> 8;
					int k20 = e8.mf >> 8;
					int k22 = k20 - j1;
					if (k22 <= 0) {
						i11 += j12;
						l12 += l13;
						j14 += j15;
						j18 += l17;
					} else {
						int i24 = e8.nf;
						int k25 = (e8.of - i24) / k22;
						if (j1 < -x) {
							i24 += (-x - j1) * k25;
							j1 = -x;
							k22 = k20 - j1;
						}
						if (k20 > x) {
							int l20 = x;
							k22 = l20 - j1;
						}
						v(rc, jc[l1], 0, 0, i11 + l15 * j1, l12 + j16 * j1, j14 + l16 * j1, l11, j13, l14, k22, j18 + j1, i24, k25);
						i11 += j12;
						l12 += l13;
						j14 += j15;
						j18 += l17;
					}
				}

				return;
			}
			for (i1 = tc; i1 < uc; i1 += byte2) {
				e e9 = sc[i1];
				j1 = e9.lf >> 8;
				int i21 = e9.mf >> 8;
				int l22 = i21 - j1;
				if (l22 <= 0) {
					i11 += j12;
					l12 += l13;
					j14 += j15;
					j18 += l17;
				} else {
					int j24 = e9.nf;
					int l25 = (e9.of - j24) / l22;
					if (j1 < -x) {
						j24 += (-x - j1) * l25;
						j1 = -x;
						l22 = i21 - j1;
					}
					if (i21 > x) {
						int j21 = x;
						l22 = j21 - j1;
					}
					j(rc, 0, 0, 0, jc[l1], i11 + l15 * j1, l12 + j16 * j1, j14 + l16 * j1, l11, j13, l14, l22, j18 + j1, j24, l25);
					i11 += j12;
					l12 += l13;
					j14 += j15;
					j18 += l17;
				}
			}

			return;
		}
		for (int j2 = 0; j2 < a; j2++) {
			if (b[j2] == l1) {
				d = c[j2];
				break;
			}
			if (j2 == a - 1) {
				int l2 = (int)(Math.random() * (double)a);
				b[l2] = l1;
				l1 = -1 - l1;
				int k3 = (l1 >> 10 & 0x1f) * 8;
				int j4 = (l1 >> 5 & 0x1f) * 8;
				int l4 = (l1 & 0x1f) * 8;
				for (int j5 = 0; j5 < 256; j5++) {
					int j7 = j5 * j5;
					int k8 = (k3 * j7) / 0x10000;
					int l9 = (j4 * j7) / 0x10000;
					int j11 = (l4 * j7) / 0x10000;
					c[l2][255 - j5] = (k8 << 16) + (l9 << 8) + j11;
				}

				d = c[l2];
			}
		}

		int i3 = w;
		int l3 = z + tc * i3;
		byte byte0 = 1;
		if (bd) {
			if ((tc & 1) == 1) {
				tc++;
				l3 += i3;
			}
			i3 <<= 1;
			byte0 = 2;
		}
		if (p1.ov) {
			for (i1 = tc; i1 < uc; i1 += byte0) {
				e e1 = sc[i1];
				j1 = e1.lf >> 8;
				int k5 = e1.mf >> 8;
				int k7 = k5 - j1;
				if (k7 <= 0) {
					l3 += i3;
				} else {
					int l8 = e1.nf;
					int i10 = (e1.of - l8) / k7;
					if (j1 < -x) {
						l8 += (-x - j1) * i10;
						j1 = -x;
						k7 = k5 - j1;
					}
					if (k5 > x) {
						int l5 = x;
						k7 = l5 - j1;
					}
					gb(rc, -k7, l3 + j1, 0, d, l8, i10);
					l3 += i3;
				}
			}

			return;
		}
		if (m) {
			for (i1 = tc; i1 < uc; i1 += byte0) {
				e e2 = sc[i1];
				j1 = e2.lf >> 8;
				int i6 = e2.mf >> 8;
				int l7 = i6 - j1;
				if (l7 <= 0) {
					l3 += i3;
				} else {
					int i9 = e2.nf;
					int j10 = (e2.of - i9) / l7;
					if (j1 < -x) {
						i9 += (-x - j1) * j10;
						j1 = -x;
						l7 = i6 - j1;
					}
					if (i6 > x) {
						int j6 = x;
						l7 = j6 - j1;
					}
					p(rc, -l7, l3 + j1, 0, d, i9, j10);
					l3 += i3;
				}
			}

			return;
		}
		for (i1 = tc; i1 < uc; i1 += byte0) {
			e e3 = sc[i1];
			j1 = e3.lf >> 8;
			int k6 = e3.mf >> 8;
			int i8 = k6 - j1;
			if (i8 <= 0) {
				l3 += i3;
			} else {
				int j9 = e3.nf;
				int k10 = (e3.of - j9) / i8;
				if (j1 < -x) {
					j9 += (-x - j1) * k10;
					j1 = -x;
					i8 = k6 - j1;
				}
				if (k6 > x) {
					int l6 = x;
					i8 = l6 - j1;
				}
				mb(rc, -i8, l3 + j1, 0, d, j9, k10);
				l3 += i3;
			}
		}

	}

	private static void db(int ai[], int ai1[], int i1, int j1, int k1, int l1, int i2, int j2, 
			int k2, int l2, int i3, int j3, int k3, int l3) {
		if (i3 <= 0)
			return;
		int i4 = 0;
		int j4 = 0;
		int i5 = 0;
		if (i2 != 0) {
			i1 = k1 / i2 << 7;
			j1 = l1 / i2 << 7;
		}
		if (i1 < 0)
			i1 = 0;
		else
		if (i1 > 16256)
			i1 = 16256;
		k1 += j2;
		l1 += k2;
		i2 += l2;
		if (i2 != 0) {
			i4 = k1 / i2 << 7;
			j4 = l1 / i2 << 7;
		}
		if (i4 < 0)
			i4 = 0;
		else
		if (i4 > 16256)
			i4 = 16256;
		int k4 = i4 - i1 >> 4;
		int l4 = j4 - j1 >> 4;
		for (int j5 = i3 >> 4; j5 > 0; j5--) {
			i1 += k3 & 0x600000;
			i5 = k3 >> 23;
			k3 += l3;
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 += k4;
			j1 += l4;
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 += k4;
			j1 += l4;
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 += k4;
			j1 += l4;
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 += k4;
			j1 += l4;
			i1 = (i1 & 0x3fff) + (k3 & 0x600000);
			i5 = k3 >> 23;
			k3 += l3;
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 += k4;
			j1 += l4;
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 += k4;
			j1 += l4;
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 += k4;
			j1 += l4;
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 += k4;
			j1 += l4;
			i1 = (i1 & 0x3fff) + (k3 & 0x600000);
			i5 = k3 >> 23;
			k3 += l3;
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 += k4;
			j1 += l4;
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 += k4;
			j1 += l4;
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 += k4;
			j1 += l4;
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 += k4;
			j1 += l4;
			i1 = (i1 & 0x3fff) + (k3 & 0x600000);
			i5 = k3 >> 23;
			k3 += l3;
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 += k4;
			j1 += l4;
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 += k4;
			j1 += l4;
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 += k4;
			j1 += l4;
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 = i4;
			j1 = j4;
			k1 += j2;
			l1 += k2;
			i2 += l2;
			if (i2 != 0) {
				i4 = k1 / i2 << 7;
				j4 = l1 / i2 << 7;
			}
			if (i4 < 0)
				i4 = 0;
			else
			if (i4 > 16256)
				i4 = 16256;
			k4 = i4 - i1 >> 4;
			l4 = j4 - j1 >> 4;
		}

		for (int k5 = 0; k5 < (i3 & 0xf); k5++) {
			if ((k5 & 3) == 0) {
				i1 = (i1 & 0x3fff) + (k3 & 0x600000);
				i5 = k3 >> 23;
				k3 += l3;
			}
			ai[j3++] = ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5;
			i1 += k4;
			j1 += l4;
		}

	}

	private static void y(int ai[], int ai1[], int i1, int j1, int k1, int l1, int i2, int j2, 
			int k2, int l2, int i3, int j3, int k3, int l3) {
		if (i3 <= 0)
			return;
		int i4 = 0;
		int j4 = 0;
		int i5 = 0;
		if (i2 != 0) {
			i1 = k1 / i2 << 7;
			j1 = l1 / i2 << 7;
		}
		if (i1 < 0)
			i1 = 0;
		else
		if (i1 > 16256)
			i1 = 16256;
		k1 += j2;
		l1 += k2;
		i2 += l2;
		if (i2 != 0) {
			i4 = k1 / i2 << 7;
			j4 = l1 / i2 << 7;
		}
		if (i4 < 0)
			i4 = 0;
		else
		if (i4 > 16256)
			i4 = 16256;
		int k4 = i4 - i1 >> 4;
		int l4 = j4 - j1 >> 4;
		for (int j5 = i3 >> 4; j5 > 0; j5--) {
			i1 += k3 & 0x600000;
			i5 = k3 >> 23;
			k3 += l3;
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 += k4;
			j1 += l4;
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 += k4;
			j1 += l4;
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 += k4;
			j1 += l4;
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 += k4;
			j1 += l4;
			i1 = (i1 & 0x3fff) + (k3 & 0x600000);
			i5 = k3 >> 23;
			k3 += l3;
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 += k4;
			j1 += l4;
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 += k4;
			j1 += l4;
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 += k4;
			j1 += l4;
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 += k4;
			j1 += l4;
			i1 = (i1 & 0x3fff) + (k3 & 0x600000);
			i5 = k3 >> 23;
			k3 += l3;
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 += k4;
			j1 += l4;
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 += k4;
			j1 += l4;
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 += k4;
			j1 += l4;
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 += k4;
			j1 += l4;
			i1 = (i1 & 0x3fff) + (k3 & 0x600000);
			i5 = k3 >> 23;
			k3 += l3;
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 += k4;
			j1 += l4;
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 += k4;
			j1 += l4;
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 += k4;
			j1 += l4;
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 = i4;
			j1 = j4;
			k1 += j2;
			l1 += k2;
			i2 += l2;
			if (i2 != 0) {
				i4 = k1 / i2 << 7;
				j4 = l1 / i2 << 7;
			}
			if (i4 < 0)
				i4 = 0;
			else
			if (i4 > 16256)
				i4 = 16256;
			k4 = i4 - i1 >> 4;
			l4 = j4 - j1 >> 4;
		}

		for (int k5 = 0; k5 < (i3 & 0xf); k5++) {
			if ((k5 & 3) == 0) {
				i1 = (i1 & 0x3fff) + (k3 & 0x600000);
				i5 = k3 >> 23;
				k3 += l3;
			}
			ai[j3++] = (ai1[(j1 & 0x3f80) + (i1 >> 7)] >>> i5) + (ai[j3] >> 1 & 0x7f7f7f);
			i1 += k4;
			j1 += l4;
		}

	}

	private static void w(int ai[], int i1, int j1, int k1, int ai1[], int l1, int i2, int j2, 
			int k2, int l2, int i3, int j3, int k3, int l3, int i4) {
		if (j3 <= 0)
			return;
		int j4 = 0;
		int k4 = 0;
		i4 <<= 2;
		if (j2 != 0) {
			j4 = l1 / j2 << 7;
			k4 = i2 / j2 << 7;
		}
		if (j4 < 0)
			j4 = 0;
		else
		if (j4 > 16256)
			j4 = 16256;
		for (int j5 = j3; j5 > 0; j5 -= 16) {
			l1 += k2;
			i2 += l2;
			j2 += i3;
			j1 = j4;
			k1 = k4;
			if (j2 != 0) {
				j4 = l1 / j2 << 7;
				k4 = i2 / j2 << 7;
			}
			if (j4 < 0)
				j4 = 0;
			else
			if (j4 > 16256)
				j4 = 16256;
			int l4 = j4 - j1 >> 4;
			int i5 = k4 - k1 >> 4;
			int k5 = l3 >> 23;
			j1 += l3 & 0x600000;
			l3 += i4;
			if (j5 < 16) {
				for (int l5 = 0; l5 < j5; l5++) {
					if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
						ai[k3] = i1;
					k3++;
					j1 += l4;
					k1 += i5;
					if ((l5 & 3) == 3) {
						j1 = (j1 & 0x3fff) + (l3 & 0x600000);
						k5 = l3 >> 23;
						l3 += i4;
					}
				}

			} else {
				if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				j1 = (j1 & 0x3fff) + (l3 & 0x600000);
				k5 = l3 >> 23;
				l3 += i4;
				if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				j1 = (j1 & 0x3fff) + (l3 & 0x600000);
				k5 = l3 >> 23;
				l3 += i4;
				if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				j1 = (j1 & 0x3fff) + (l3 & 0x600000);
				k5 = l3 >> 23;
				l3 += i4;
				if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0x3f80) + (j1 >> 7)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
			}
		}

	}

	private static void v(int ai[], int ai1[], int i1, int j1, int k1, int l1, int i2, int j2, 
			int k2, int l2, int i3, int j3, int k3, int l3) {
		if (i3 <= 0)
			return;
		int i4 = 0;
		int j4 = 0;
		l3 <<= 2;
		if (i2 != 0) {
			i4 = k1 / i2 << 6;
			j4 = l1 / i2 << 6;
		}
		if (i4 < 0)
			i4 = 0;
		else
		if (i4 > 4032)
			i4 = 4032;
		for (int i5 = i3; i5 > 0; i5 -= 16) {
			k1 += j2;
			l1 += k2;
			i2 += l2;
			i1 = i4;
			j1 = j4;
			if (i2 != 0) {
				i4 = k1 / i2 << 6;
				j4 = l1 / i2 << 6;
			}
			if (i4 < 0)
				i4 = 0;
			else
			if (i4 > 4032)
				i4 = 4032;
			int k4 = i4 - i1 >> 4;
			int l4 = j4 - j1 >> 4;
			int j5 = k3 >> 20;
			i1 += k3 & 0xc0000;
			k3 += l3;
			if (i5 < 16) {
				for (int k5 = 0; k5 < i5; k5++) {
					ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
					i1 += k4;
					j1 += l4;
					if ((k5 & 3) == 3) {
						i1 = (i1 & 0xfff) + (k3 & 0xc0000);
						j5 = k3 >> 20;
						k3 += l3;
					}
				}

			} else {
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				i1 = (i1 & 0xfff) + (k3 & 0xc0000);
				j5 = k3 >> 20;
				k3 += l3;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				i1 = (i1 & 0xfff) + (k3 & 0xc0000);
				j5 = k3 >> 20;
				k3 += l3;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				i1 = (i1 & 0xfff) + (k3 & 0xc0000);
				j5 = k3 >> 20;
				k3 += l3;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
				i1 += k4;
				j1 += l4;
				ai[j3++] = ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5;
			}
		}

	}

	private static void b(int ai[], int ai1[], int i1, int j1, int k1, int l1, int i2, int j2, 
			int k2, int l2, int i3, int j3, int k3, int l3) {
		if (i3 <= 0)
			return;
		int i4 = 0;
		int j4 = 0;
		l3 <<= 2;
		if (i2 != 0) {
			i4 = k1 / i2 << 6;
			j4 = l1 / i2 << 6;
		}
		if (i4 < 0)
			i4 = 0;
		else
		if (i4 > 4032)
			i4 = 4032;
		for (int i5 = i3; i5 > 0; i5 -= 16) {
			k1 += j2;
			l1 += k2;
			i2 += l2;
			i1 = i4;
			j1 = j4;
			if (i2 != 0) {
				i4 = k1 / i2 << 6;
				j4 = l1 / i2 << 6;
			}
			if (i4 < 0)
				i4 = 0;
			else
			if (i4 > 4032)
				i4 = 4032;
			int k4 = i4 - i1 >> 4;
			int l4 = j4 - j1 >> 4;
			int j5 = k3 >> 20;
			i1 += k3 & 0xc0000;
			k3 += l3;
			if (i5 < 16) {
				for (int k5 = 0; k5 < i5; k5++) {
					ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
					i1 += k4;
					j1 += l4;
					if ((k5 & 3) == 3) {
						i1 = (i1 & 0xfff) + (k3 & 0xc0000);
						j5 = k3 >> 20;
						k3 += l3;
					}
				}

			} else {
				ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
				i1 += k4;
				j1 += l4;
				ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
				i1 += k4;
				j1 += l4;
				ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
				i1 += k4;
				j1 += l4;
				ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
				i1 += k4;
				j1 += l4;
				i1 = (i1 & 0xfff) + (k3 & 0xc0000);
				j5 = k3 >> 20;
				k3 += l3;
				ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
				i1 += k4;
				j1 += l4;
				ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
				i1 += k4;
				j1 += l4;
				ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
				i1 += k4;
				j1 += l4;
				ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
				i1 += k4;
				j1 += l4;
				i1 = (i1 & 0xfff) + (k3 & 0xc0000);
				j5 = k3 >> 20;
				k3 += l3;
				ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
				i1 += k4;
				j1 += l4;
				ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
				i1 += k4;
				j1 += l4;
				ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
				i1 += k4;
				j1 += l4;
				ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
				i1 += k4;
				j1 += l4;
				i1 = (i1 & 0xfff) + (k3 & 0xc0000);
				j5 = k3 >> 20;
				k3 += l3;
				ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
				i1 += k4;
				j1 += l4;
				ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
				i1 += k4;
				j1 += l4;
				ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
				i1 += k4;
				j1 += l4;
				ai[j3++] = (ai1[(j1 & 0xfc0) + (i1 >> 6)] >>> j5) + (ai[j3] >> 1 & 0x7f7f7f);
			}
		}

	}

	private static void j(int ai[], int i1, int j1, int k1, int ai1[], int l1, int i2, int j2, 
			int k2, int l2, int i3, int j3, int k3, int l3, int i4) {
		if (j3 <= 0)
			return;
		int j4 = 0;
		int k4 = 0;
		i4 <<= 2;
		if (j2 != 0) {
			j4 = l1 / j2 << 6;
			k4 = i2 / j2 << 6;
		}
		if (j4 < 0)
			j4 = 0;
		else
		if (j4 > 4032)
			j4 = 4032;
		for (int j5 = j3; j5 > 0; j5 -= 16) {
			l1 += k2;
			i2 += l2;
			j2 += i3;
			j1 = j4;
			k1 = k4;
			if (j2 != 0) {
				j4 = l1 / j2 << 6;
				k4 = i2 / j2 << 6;
			}
			if (j4 < 0)
				j4 = 0;
			else
			if (j4 > 4032)
				j4 = 4032;
			int l4 = j4 - j1 >> 4;
			int i5 = k4 - k1 >> 4;
			int k5 = l3 >> 20;
			j1 += l3 & 0xc0000;
			l3 += i4;
			if (j5 < 16) {
				for (int l5 = 0; l5 < j5; l5++) {
					if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
						ai[k3] = i1;
					k3++;
					j1 += l4;
					k1 += i5;
					if ((l5 & 3) == 3) {
						j1 = (j1 & 0xfff) + (l3 & 0xc0000);
						k5 = l3 >> 20;
						l3 += i4;
					}
				}

			} else {
				if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				j1 = (j1 & 0xfff) + (l3 & 0xc0000);
				k5 = l3 >> 20;
				l3 += i4;
				if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				j1 = (j1 & 0xfff) + (l3 & 0xc0000);
				k5 = l3 >> 20;
				l3 += i4;
				if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				j1 = (j1 & 0xfff) + (l3 & 0xc0000);
				k5 = l3 >> 20;
				l3 += i4;
				if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
				j1 += l4;
				k1 += i5;
				if ((i1 = ai1[(k1 & 0xfc0) + (j1 >> 6)] >>> k5) != 0)
					ai[k3] = i1;
				k3++;
			}
		}

	}

	private static void p(int ai[], int i1, int j1, int k1, int ai1[], int l1, int i2) {
		if (i1 >= 0)
			return;
		i2 <<= 1;
		k1 = ai1[l1 >> 8 & 0xff];
		l1 += i2;
		int j2 = i1 / 8;
		for (int k2 = j2; k2 < 0; k2++) {
			ai[j1++] = k1;
			ai[j1++] = k1;
			k1 = ai1[l1 >> 8 & 0xff];
			l1 += i2;
			ai[j1++] = k1;
			ai[j1++] = k1;
			k1 = ai1[l1 >> 8 & 0xff];
			l1 += i2;
			ai[j1++] = k1;
			ai[j1++] = k1;
			k1 = ai1[l1 >> 8 & 0xff];
			l1 += i2;
			ai[j1++] = k1;
			ai[j1++] = k1;
			k1 = ai1[l1 >> 8 & 0xff];
			l1 += i2;
		}

		j2 = -(i1 % 8);
		for (int l2 = 0; l2 < j2; l2++) {
			ai[j1++] = k1;
			if ((l2 & 1) == 1) {
				k1 = ai1[l1 >> 8 & 0xff];
				l1 += i2;
			}
		}

	}

	private static void gb(int ai[], int i1, int j1, int k1, int ai1[], int l1, int i2) {
		if (i1 >= 0)
			return;
		i2 <<= 2;
		k1 = ai1[l1 >> 8 & 0xff];
		l1 += i2;
		int j2 = i1 / 16;
		for (int k2 = j2; k2 < 0; k2++) {
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			k1 = ai1[l1 >> 8 & 0xff];
			l1 += i2;
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			k1 = ai1[l1 >> 8 & 0xff];
			l1 += i2;
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			k1 = ai1[l1 >> 8 & 0xff];
			l1 += i2;
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			k1 = ai1[l1 >> 8 & 0xff];
			l1 += i2;
		}

		j2 = -(i1 % 16);
		for (int l2 = 0; l2 < j2; l2++) {
			ai[j1++] = k1 + (ai[j1] >> 1 & 0x7f7f7f);
			if ((l2 & 3) == 3) {
				k1 = ai1[l1 >> 8 & 0xff];
				l1 += i2;
				l1 += i2;
			}
		}

	}

	private static void mb(int ai[], int i1, int j1, int k1, int ai1[], int l1, int i2) {
		if (i1 >= 0)
			return;
		i2 <<= 2;
		k1 = ai1[l1 >> 8 & 0xff];
		l1 += i2;
		int j2 = i1 / 16;
		for (int k2 = j2; k2 < 0; k2++) {
			ai[j1++] = k1;
			ai[j1++] = k1;
			ai[j1++] = k1;
			ai[j1++] = k1;
			k1 = ai1[l1 >> 8 & 0xff];
			l1 += i2;
			ai[j1++] = k1;
			ai[j1++] = k1;
			ai[j1++] = k1;
			ai[j1++] = k1;
			k1 = ai1[l1 >> 8 & 0xff];
			l1 += i2;
			ai[j1++] = k1;
			ai[j1++] = k1;
			ai[j1++] = k1;
			ai[j1++] = k1;
			k1 = ai1[l1 >> 8 & 0xff];
			l1 += i2;
			ai[j1++] = k1;
			ai[j1++] = k1;
			ai[j1++] = k1;
			ai[j1++] = k1;
			k1 = ai1[l1 >> 8 & 0xff];
			l1 += i2;
		}

		j2 = -(i1 % 16);
		for (int l2 = 0; l2 < j2; l2++) {
			ai[j1++] = k1;
			if ((l2 & 3) == 3) {
				k1 = ai1[l1 >> 8 & 0xff];
				l1 += i2;
			}
		}

	}

	public void g(int i1, int j1, int k1, int l1, int i2, int j2, int k2) {
		gb = 1024 - l1 & 0x3ff;
		hb = 1024 - i2 & 0x3ff;
		ib = 1024 - j2 & 0x3ff;
		int l2 = 0;
		int i3 = 0;
		int j3 = k2;
		if (l1 != 0) {
			int k3 = k[l1];
			int j4 = k[l1 + 1024];
			int i5 = i3 * j4 - j3 * k3 >> 15;
			j3 = i3 * k3 + j3 * j4 >> 15;
			i3 = i5;
		}
		if (i2 != 0) {
			int l3 = k[i2];
			int k4 = k[i2 + 1024];
			int j5 = j3 * l3 + l2 * k4 >> 15;
			j3 = j3 * k4 - l2 * l3 >> 15;
			l2 = j5;
		}
		if (j2 != 0) {
			int i4 = k[j2];
			int l4 = k[j2 + 1024];
			int k5 = i3 * i4 + l2 * l4 >> 15;
			i3 = i3 * l4 - l2 * i4 >> 15;
			l2 = k5;
		}
		db = i1 - l2;
		eb = j1 - i3;
		fb = k1 - j3;
	}

	private void rb(int i1) {
		s s1 = ob[i1];
		p p1 = s1.qmb;
		int j1 = s1.rmb;
		int ai[] = p1.tu[j1];
		int k1 = p1.su[j1];
		int l1 = p1.xu[j1];
		int j2 = p1.ku[ai[0]];
		int k2 = p1.lu[ai[0]];
		int l2 = p1.mu[ai[0]];
		int i3 = p1.ku[ai[1]] - j2;
		int j3 = p1.lu[ai[1]] - k2;
		int k3 = p1.mu[ai[1]] - l2;
		int l3 = p1.ku[ai[2]] - j2;
		int i4 = p1.lu[ai[2]] - k2;
		int j4 = p1.mu[ai[2]] - l2;
		int k4 = j3 * j4 - i4 * k3;
		int l4 = k3 * l3 - j4 * i3;
		int i5 = i3 * i4 - l3 * j3;
		if (l1 == -1) {
			l1 = 0;
			for (; k4 > 25000 || l4 > 25000 || i5 > 25000 || k4 < -25000 || l4 < -25000 || i5 < -25000; i5 >>= 1) {
				l1++;
				k4 >>= 1;
				l4 >>= 1;
			}

			p1.xu[j1] = l1;
			p1.wu[j1] = (int)((double)cb * Math.sqrt(k4 * k4 + l4 * l4 + i5 * i5));
		} else {
			k4 >>= l1;
			l4 >>= l1;
			i5 >>= l1;
		}
		s1.wmb = j2 * k4 + k2 * l4 + l2 * i5;
		s1.tmb = k4;
		s1.umb = l4;
		s1.vmb = i5;
		int j5 = p1.mu[ai[0]];
		int k5 = j5;
		int l5 = p1.nu[ai[0]];
		int i6 = l5;
		int j6 = p1.ou[ai[0]];
		int k6 = j6;
		for (int l6 = 1; l6 < k1; l6++) {
			int i2 = p1.mu[ai[l6]];
			if (i2 > k5)
				k5 = i2;
			else
			if (i2 < j5)
				j5 = i2;
			i2 = p1.nu[ai[l6]];
			if (i2 > i6)
				i6 = i2;
			else
			if (i2 < l5)
				l5 = i2;
			i2 = p1.ou[ai[l6]];
			if (i2 > k6)
				k6 = i2;
			else
			if (i2 < j6)
				j6 = i2;
		}

		s1.omb = j5;
		s1.pmb = k5;
		s1.kmb = l5;
		s1.mmb = i6;
		s1.lmb = j6;
		s1.nmb = k6;
	}

	private void cb(int i1) {
		s s1 = ob[i1];
		p p1 = s1.qmb;
		int j1 = s1.rmb;
		int ai[] = p1.tu[j1];
		int l1 = 0;
		int i2 = 0;
		int j2 = 1;
		int k2 = p1.ku[ai[0]];
		int l2 = p1.lu[ai[0]];
		int i3 = p1.mu[ai[0]];
		p1.wu[j1] = 1;
		p1.xu[j1] = 0;
		s1.wmb = k2 * l1 + l2 * i2 + i3 * j2;
		s1.tmb = l1;
		s1.umb = i2;
		s1.vmb = j2;
		int j3 = p1.mu[ai[0]];
		int k3 = j3;
		int l3 = p1.nu[ai[0]];
		int i4 = l3;
		if (p1.nu[ai[1]] < l3)
			l3 = p1.nu[ai[1]];
		else
			i4 = p1.nu[ai[1]];
		int j4 = p1.ou[ai[1]];
		int k4 = p1.ou[ai[0]];
		int k1 = p1.mu[ai[1]];
		if (k1 > k3)
			k3 = k1;
		else
		if (k1 < j3)
			j3 = k1;
		k1 = p1.nu[ai[1]];
		if (k1 > i4)
			i4 = k1;
		else
		if (k1 < l3)
			l3 = k1;
		k1 = p1.ou[ai[1]];
		if (k1 > k4)
			k4 = k1;
		else
		if (k1 < j4)
			j4 = k1;
		s1.omb = j3;
		s1.pmb = k3;
		s1.kmb = l3 - 20;
		s1.mmb = i4 + 20;
		s1.lmb = j4;
		s1.nmb = k4;
	}

	private boolean fb(s s1, s s2) {
		if (s1.kmb >= s2.mmb)
			return true;
		if (s2.kmb >= s1.mmb)
			return true;
		if (s1.lmb >= s2.nmb)
			return true;
		if (s2.lmb >= s1.nmb)
			return true;
		if (s1.omb >= s2.pmb)
			return true;
		if (s2.omb > s1.pmb)
			return false;
		p p1 = s1.qmb;
		p p2 = s2.qmb;
		int i1 = s1.rmb;
		int j1 = s2.rmb;
		int ai[] = p1.tu[i1];
		int ai1[] = p2.tu[j1];
		int k1 = p1.su[i1];
		int l1 = p2.su[j1];
		int k3 = p2.ku[ai1[0]];
		int l3 = p2.lu[ai1[0]];
		int i4 = p2.mu[ai1[0]];
		int j4 = s2.tmb;
		int k4 = s2.umb;
		int l4 = s2.vmb;
		int i5 = p2.wu[j1];
		int j5 = s2.wmb;
		boolean flag = false;
		for (int k5 = 0; k5 < k1; k5++) {
			int i2 = ai[k5];
			int i3 = (k3 - p1.ku[i2]) * j4 + (l3 - p1.lu[i2]) * k4 + (i4 - p1.mu[i2]) * l4;
			if ((i3 >= -i5 || j5 >= 0) && (i3 <= i5 || j5 <= 0))
				continue;
			flag = true;
			break;
		}

		if (!flag)
			return true;
		k3 = p1.ku[ai[0]];
		l3 = p1.lu[ai[0]];
		i4 = p1.mu[ai[0]];
		j4 = s1.tmb;
		k4 = s1.umb;
		l4 = s1.vmb;
		i5 = p1.wu[i1];
		j5 = s1.wmb;
		flag = false;
		for (int l5 = 0; l5 < l1; l5++) {
			int j2 = ai1[l5];
			int j3 = (k3 - p2.ku[j2]) * j4 + (l3 - p2.lu[j2]) * k4 + (i4 - p2.mu[j2]) * l4;
			if ((j3 >= -i5 || j5 <= 0) && (j3 <= i5 || j5 >= 0))
				continue;
			flag = true;
			break;
		}

		if (!flag)
			return true;
		int ai2[];
		int ai3[];
		if (k1 == 2) {
			ai2 = new int[4];
			ai3 = new int[4];
			int i6 = ai[0];
			int k2 = ai[1];
			ai2[0] = p1.nu[i6] - 20;
			ai2[1] = p1.nu[k2] - 20;
			ai2[2] = p1.nu[k2] + 20;
			ai2[3] = p1.nu[i6] + 20;
			ai3[0] = ai3[3] = p1.ou[i6];
			ai3[1] = ai3[2] = p1.ou[k2];
		} else {
			ai2 = new int[k1];
			ai3 = new int[k1];
			for (int j6 = 0; j6 < k1; j6++) {
				int i7 = ai[j6];
				ai2[j6] = p1.nu[i7];
				ai3[j6] = p1.ou[i7];
			}

		}
		int ai4[];
		int ai5[];
		if (l1 == 2) {
			ai4 = new int[4];
			ai5 = new int[4];
			int k6 = ai1[0];
			int l2 = ai1[1];
			ai4[0] = p2.nu[k6] - 20;
			ai4[1] = p2.nu[l2] - 20;
			ai4[2] = p2.nu[l2] + 20;
			ai4[3] = p2.nu[k6] + 20;
			ai5[0] = ai5[3] = p2.ou[k6];
			ai5[1] = ai5[2] = p2.ou[l2];
		} else {
			ai4 = new int[l1];
			ai5 = new int[l1];
			for (int l6 = 0; l6 < l1; l6++) {
				int j7 = ai1[l6];
				ai4[l6] = p2.nu[j7];
				ai5[l6] = p2.ou[j7];
			}

		}
		return !l(ai2, ai3, ai4, ai5);
	}

	private boolean qb(s s1, s s2) {
		p p1 = s1.qmb;
		p p2 = s2.qmb;
		int i1 = s1.rmb;
		int j1 = s2.rmb;
		int ai[] = p1.tu[i1];
		int ai1[] = p2.tu[j1];
		int k1 = p1.su[i1];
		int l1 = p2.su[j1];
		int i3 = p2.ku[ai1[0]];
		int j3 = p2.lu[ai1[0]];
		int k3 = p2.mu[ai1[0]];
		int l3 = s2.tmb;
		int i4 = s2.umb;
		int j4 = s2.vmb;
		int k4 = p2.wu[j1];
		int l4 = s2.wmb;
		boolean flag = false;
		for (int i5 = 0; i5 < k1; i5++) {
			int i2 = ai[i5];
			int k2 = (i3 - p1.ku[i2]) * l3 + (j3 - p1.lu[i2]) * i4 + (k3 - p1.mu[i2]) * j4;
			if ((k2 >= -k4 || l4 >= 0) && (k2 <= k4 || l4 <= 0))
				continue;
			flag = true;
			break;
		}

		if (!flag)
			return true;
		i3 = p1.ku[ai[0]];
		j3 = p1.lu[ai[0]];
		k3 = p1.mu[ai[0]];
		l3 = s1.tmb;
		i4 = s1.umb;
		j4 = s1.vmb;
		k4 = p1.wu[i1];
		l4 = s1.wmb;
		flag = false;
		for (int j5 = 0; j5 < l1; j5++) {
			int j2 = ai1[j5];
			int l2 = (i3 - p2.ku[j2]) * l3 + (j3 - p2.lu[j2]) * i4 + (k3 - p2.mu[j2]) * j4;
			if ((l2 >= -k4 || l4 <= 0) && (l2 <= k4 || l4 >= 0))
				continue;
			flag = true;
			break;
		}

		return !flag;
	}

	public void a(String s1, int i1, int j1, int k1, n n1) {
		try {
			lc = n1.wi(s1, "textures", k1);
			byte abyte0[] = jagex.c.lc("textures.txt", 0, lc);
			b b1 = new b(abyte0);
			b1.li();
			dc = b1.mi();
			ec = new String[dc];
			ic = new boolean[dc];
			hc = new long[dc];
			fc = new int[dc];
			gc = new int[dc];
			jc = new int[dc][];
			for (int l1 = 0; l1 < dc; l1++) {
				b1.li();
				ec[l1] = b1.ni();
				fc[l1] = b1.pi();
				gc[l1] = b1.mi();
				ic[l1] = false;
				jc[l1] = null;
				hc[l1] = 0L;
			}

			kc = 0L;
			mc = new int[i1][];
			nc = new int[j1][];
			for (int i2 = 0; i2 < dc; i2++)
				u(i2);

			return;
		}
		catch (IOException _ex) {
			System.out.println("Error loading texture set");
		}
	}

	public void tb(int i1) {
		if (jc[i1] == null)
			return;
		int ai[] = jc[i1];
		for (int j1 = 0; j1 < 64; j1++) {
			int k1 = j1 + 4032;
			int l1 = ai[k1];
			for (int j2 = 0; j2 < 63; j2++) {
				ai[k1] = ai[k1 - 64];
				k1 -= 64;
			}

			jc[i1][k1] = l1;
		}

		char c1 = '\u1000';
		for (int i2 = 0; i2 < c1; i2++) {
			int k2 = ai[i2];
			ai[c1 + i2] = k2 - (k2 >>> 3) & 0xf8f8ff;
			ai[c1 * 2 + i2] = k2 - (k2 >>> 2) & 0xf8f8ff;
			ai[c1 * 3 + i2] = k2 - (k2 >>> 2) - (k2 >>> 3) & 0xf8f8ff;
		}

	}

	public void u(int i1) {
		if (i1 < 0)
			return;
		hc[i1] = kc++;
		if (jc[i1] != null)
			return;
		if (gc[i1] == 0) {
			for (int j1 = 0; j1 < mc.length; j1++)
				if (mc[j1] == null) {
					mc[j1] = new int[16384];
					jc[i1] = mc[j1];
					jagex.c.sc(ec[i1] + ".tga", 0, lc, oc);
					o(i1);
					return;
				}

			long l1 = 1L << 30;
			int i2 = 0;
			for (int k2 = 0; k2 < dc; k2++)
				if (k2 != i1 && gc[k2] == 0 && jc[k2] != null && hc[k2] < l1) {
					l1 = hc[k2];
					i2 = k2;
				}

			jc[i1] = jc[i2];
			jc[i2] = null;
			jagex.c.sc(ec[i1] + ".tga", 0, lc, oc);
			o(i1);
			return;
		}
		for (int k1 = 0; k1 < nc.length; k1++)
			if (nc[k1] == null) {
				nc[k1] = new int[0x10000];
				jc[i1] = nc[k1];
				jagex.c.sc(ec[i1] + ".tga", 0, lc, oc);
				o(i1);
				return;
			}

		long l2 = 1L << 30;
		int j2 = 0;
		for (int i3 = 0; i3 < dc; i3++)
			if (i3 != i1 && gc[i3] == 1 && jc[i3] != null && hc[i3] < l2) {
				l2 = hc[i3];
				j2 = i3;
			}

		jc[i1] = jc[j2];
		jc[j2] = null;
		jagex.c.sc(ec[i1] + ".tga", 0, lc, oc);
		o(i1);
	}

	public void eb(String s1) {
		try {
			b b1 = new b(s1 + "/textures.txt");
			b1.li();
			dc = b1.mi();
			ec = new String[dc];
			ic = new boolean[dc];
			hc = new long[dc];
			fc = new int[dc];
			gc = new int[dc];
			jc = new int[dc][];
			for (int i1 = 0; i1 < dc; i1++) {
				b1.li();
				ec[i1] = b1.ni();
				fc[i1] = b1.pi();
				gc[i1] = b1.mi();
				ic[i1] = false;
			}

			b1.qi();
			for (int j1 = 0; j1 < dc; j1++) {
				char c1;
				if (gc[j1] == 0)
					c1 = '\u151B';
				else
					c1 = '\u451B';
				char c2;
				if (gc[j1] == 0)
					c2 = '@';
				else
					c2 = '\200';
				jc[j1] = new int[c2 * c2 * 4];
				jagex.c.xc(s1 + "/" + ec[j1] + ".tga", oc, c1);
				o(j1);
			}

			return;
		}
		catch (IOException _ex) {
			System.out.println("Error loading texture set");
		}
	}

	private void o(int i1) {
		char c1;
		if (gc[i1] == 0)
			c1 = '@';
		else
			c1 = '\200';
		int ai[] = jc[i1];
		int j1 = 0;
		for (int k1 = 0; k1 < 256; k1++)
			pc[k1] = ((oc[20 + k1 * 3] & 0xff) << 16) + ((oc[19 + k1 * 3] & 0xff) << 8) + (oc[18 + k1 * 3] & 0xff);

		for (int l1 = c1 - 1; l1 >= 0; l1--) {
			for (int i2 = 0; i2 < c1; i2++) {
				int k2 = pc[oc[786 + i2 + l1 * c1] & 0xff];
				if (k2 != 0xff00ff && fc[i1] != 0) {
					int i3 = k2 >> 16 & 0xff;
					int j3 = k2 >> 8 & 0xff;
					int k3 = k2 & 0xff;
					if (i3 == j3 && j3 == k3) {
						int l3 = fc[i1] >> 16 & 0xff;
						int i4 = fc[i1] >> 8 & 0xff;
						int j4 = fc[i1] & 0xff;
						k2 = ((i3 * l3 >> 8) << 16) + ((j3 * i4 >> 8) << 8) + (k3 * j4 >> 8);
					}
				}
				k2 &= 0xf8f8ff;
				if (k2 == 0)
					k2 = 1;
				else
				if (k2 == 0xf800ff) {
					k2 = 0;
					ic[i1] = true;
				}
				ai[j1++] = k2;
			}

		}

		for (int j2 = 0; j2 < j1; j2++) {
			int l2 = ai[j2];
			ai[j1 + j2] = l2 - (l2 >>> 3) & 0xf8f8ff;
			ai[j1 * 2 + j2] = l2 - (l2 >>> 2) & 0xf8f8ff;
			ai[j1 * 3 + j2] = l2 - (l2 >>> 2) - (l2 >>> 3) & 0xf8f8ff;
		}

	}

	public int e(int i1) {
		if (i1 == 0xbc614e)
			return 0;
		u(i1);
		if (i1 >= 0)
			return jc[i1][0];
		if (i1 < 0) {
			i1 = -(i1 + 1);
			int j1 = i1 >> 10 & 0x1f;
			int k1 = i1 >> 5 & 0x1f;
			int l1 = i1 & 0x1f;
			return (j1 << 19) + (k1 << 11) + (l1 << 3);
		} else {
			return 0;
		}
	}

	public void m(int i1, int j1, int k1) {
		if (i1 == 0 && j1 == 0 && k1 == 0)
			i1 = 32;
		for (int l1 = 0; l1 < jb; l1++)
			lb[l1].um(i1, j1, k1);

	}

	public void ub(boolean flag, int i1, int j1, int k1, int l1, int i2) {
		if (k1 == 0 && l1 == 0 && i2 == 0)
			k1 = 32;
		for (int j2 = 0; j2 < jb; j2++)
			lb[j2].nm(flag, i1, j1, k1, l1, i2);

	}

	public static int lb(int i1, int j1, int k1) {
		return -1 - (i1 / 8) * 1024 - (j1 / 8) * 32 - k1 / 8;
	}

	public int h(int i1, int j1, int k1, int l1, int i2) {
		if (l1 == j1)
			return i1;
		else
			return i1 + ((k1 - i1) * (i2 - j1)) / (l1 - j1);
	}

	public boolean ob(int i1, int j1, int k1, int l1, boolean flag) {
		if (flag && i1 <= k1 || i1 < k1) {
			if (i1 > l1)
				return true;
			if (j1 > k1)
				return true;
			if (j1 > l1)
				return true;
			return !flag;
		}
		if (i1 < l1)
			return true;
		if (j1 < k1)
			return true;
		if (j1 < l1)
			return true;
		else
			return flag;
	}

	public boolean kb(int i1, int j1, int k1, boolean flag) {
		if (flag && i1 <= k1 || i1 < k1) {
			if (j1 > k1)
				return true;
			return !flag;
		}
		if (j1 < k1)
			return true;
		else
			return flag;
	}

	public boolean l(int ai[], int ai1[], int ai2[], int ai3[]) {
		int i1 = ai.length;
		int j1 = ai2.length;
		byte byte0 = 0;
		int i21;
		int k21 = i21 = ai1[0];
		int k1 = 0;
		int j21;
		int l21 = j21 = ai3[0];
		int i2 = 0;
		for (int i22 = 1; i22 < i1; i22++)
			if (ai1[i22] < i21) {
				i21 = ai1[i22];
				k1 = i22;
			} else
			if (ai1[i22] > k21)
				k21 = ai1[i22];

		for (int j22 = 1; j22 < j1; j22++)
			if (ai3[j22] < j21) {
				j21 = ai3[j22];
				i2 = j22;
			} else
			if (ai3[j22] > l21)
				l21 = ai3[j22];

		if (j21 >= k21)
			return false;
		if (i21 >= l21)
			return false;
		int l1;
		int j2;
		boolean flag;
		if (ai1[k1] < ai3[i2]) {
			for (l1 = k1; ai1[l1] < ai3[i2]; l1 = (l1 + 1) % i1);
			for (; ai1[k1] < ai3[i2]; k1 = ((k1 - 1) + i1) % i1);
			int k2 = h(ai[(k1 + 1) % i1], ai1[(k1 + 1) % i1], ai[k1], ai1[k1], ai3[i2]);
			int k7 = h(ai[((l1 - 1) + i1) % i1], ai1[((l1 - 1) + i1) % i1], ai[l1], ai1[l1], ai3[i2]);
			int l11 = ai2[i2];
			flag = (k2 < l11) | (k7 < l11);
			if (kb(k2, k7, l11, flag))
				return true;
			j2 = (i2 + 1) % j1;
			i2 = ((i2 - 1) + j1) % j1;
			if (k1 == l1)
				byte0 = 1;
		} else {
			for (j2 = i2; ai3[j2] < ai1[k1]; j2 = (j2 + 1) % j1);
			for (; ai3[i2] < ai1[k1]; i2 = ((i2 - 1) + j1) % j1);
			int l2 = ai[k1];
			int i12 = h(ai2[(i2 + 1) % j1], ai3[(i2 + 1) % j1], ai2[i2], ai3[i2], ai1[k1]);
			int l16 = h(ai2[((j2 - 1) + j1) % j1], ai3[((j2 - 1) + j1) % j1], ai2[j2], ai3[j2], ai1[k1]);
			flag = (l2 < i12) | (l2 < l16);
			if (kb(i12, l16, l2, !flag))
				return true;
			l1 = (k1 + 1) % i1;
			k1 = ((k1 - 1) + i1) % i1;
			if (i2 == j2)
				byte0 = 2;
		}
		while (byte0 == 0) 
			if (ai1[k1] < ai1[l1]) {
				if (ai1[k1] < ai3[i2]) {
					if (ai1[k1] < ai3[j2]) {
						int i3 = ai[k1];
						int l7 = h(ai[((l1 - 1) + i1) % i1], ai1[((l1 - 1) + i1) % i1], ai[l1], ai1[l1], ai1[k1]);
						int j12 = h(ai2[(i2 + 1) % j1], ai3[(i2 + 1) % j1], ai2[i2], ai3[i2], ai1[k1]);
						int i17 = h(ai2[((j2 - 1) + j1) % j1], ai3[((j2 - 1) + j1) % j1], ai2[j2], ai3[j2], ai1[k1]);
						if (ob(i3, l7, j12, i17, flag))
							return true;
						k1 = ((k1 - 1) + i1) % i1;
						if (k1 == l1)
							byte0 = 1;
					} else {
						int j3 = h(ai[(k1 + 1) % i1], ai1[(k1 + 1) % i1], ai[k1], ai1[k1], ai3[j2]);
						int i8 = h(ai[((l1 - 1) + i1) % i1], ai1[((l1 - 1) + i1) % i1], ai[l1], ai1[l1], ai3[j2]);
						int k12 = h(ai2[(i2 + 1) % j1], ai3[(i2 + 1) % j1], ai2[i2], ai3[i2], ai3[j2]);
						int j17 = ai2[j2];
						if (ob(j3, i8, k12, j17, flag))
							return true;
						j2 = (j2 + 1) % j1;
						if (i2 == j2)
							byte0 = 2;
					}
				} else
				if (ai3[i2] < ai3[j2]) {
					int k3 = h(ai[(k1 + 1) % i1], ai1[(k1 + 1) % i1], ai[k1], ai1[k1], ai3[i2]);
					int j8 = h(ai[((l1 - 1) + i1) % i1], ai1[((l1 - 1) + i1) % i1], ai[l1], ai1[l1], ai3[i2]);
					int l12 = ai2[i2];
					int k17 = h(ai2[((j2 - 1) + j1) % j1], ai3[((j2 - 1) + j1) % j1], ai2[j2], ai3[j2], ai3[i2]);
					if (ob(k3, j8, l12, k17, flag))
						return true;
					i2 = ((i2 - 1) + j1) % j1;
					if (i2 == j2)
						byte0 = 2;
				} else {
					int l3 = h(ai[(k1 + 1) % i1], ai1[(k1 + 1) % i1], ai[k1], ai1[k1], ai3[j2]);
					int k8 = h(ai[((l1 - 1) + i1) % i1], ai1[((l1 - 1) + i1) % i1], ai[l1], ai1[l1], ai3[j2]);
					int i13 = h(ai2[(i2 + 1) % j1], ai3[(i2 + 1) % j1], ai2[i2], ai3[i2], ai3[j2]);
					int l17 = ai2[j2];
					if (ob(l3, k8, i13, l17, flag))
						return true;
					j2 = (j2 + 1) % j1;
					if (i2 == j2)
						byte0 = 2;
				}
			} else
			if (ai1[l1] < ai3[i2]) {
				if (ai1[l1] < ai3[j2]) {
					int i4 = h(ai[(k1 + 1) % i1], ai1[(k1 + 1) % i1], ai[k1], ai1[k1], ai1[l1]);
					int l8 = ai[l1];
					int j13 = h(ai2[(i2 + 1) % j1], ai3[(i2 + 1) % j1], ai2[i2], ai3[i2], ai1[l1]);
					int i18 = h(ai2[((j2 - 1) + j1) % j1], ai3[((j2 - 1) + j1) % j1], ai2[j2], ai3[j2], ai1[l1]);
					if (ob(i4, l8, j13, i18, flag))
						return true;
					l1 = (l1 + 1) % i1;
					if (k1 == l1)
						byte0 = 1;
				} else {
					int j4 = h(ai[(k1 + 1) % i1], ai1[(k1 + 1) % i1], ai[k1], ai1[k1], ai3[j2]);
					int i9 = h(ai[((l1 - 1) + i1) % i1], ai1[((l1 - 1) + i1) % i1], ai[l1], ai1[l1], ai3[j2]);
					int k13 = h(ai2[(i2 + 1) % j1], ai3[(i2 + 1) % j1], ai2[i2], ai3[i2], ai3[j2]);
					int j18 = ai2[j2];
					if (ob(j4, i9, k13, j18, flag))
						return true;
					j2 = (j2 + 1) % j1;
					if (i2 == j2)
						byte0 = 2;
				}
			} else
			if (ai3[i2] < ai3[j2]) {
				int k4 = h(ai[(k1 + 1) % i1], ai1[(k1 + 1) % i1], ai[k1], ai1[k1], ai3[i2]);
				int j9 = h(ai[((l1 - 1) + i1) % i1], ai1[((l1 - 1) + i1) % i1], ai[l1], ai1[l1], ai3[i2]);
				int l13 = ai2[i2];
				int k18 = h(ai2[((j2 - 1) + j1) % j1], ai3[((j2 - 1) + j1) % j1], ai2[j2], ai3[j2], ai3[i2]);
				if (ob(k4, j9, l13, k18, flag))
					return true;
				i2 = ((i2 - 1) + j1) % j1;
				if (i2 == j2)
					byte0 = 2;
			} else {
				int l4 = h(ai[(k1 + 1) % i1], ai1[(k1 + 1) % i1], ai[k1], ai1[k1], ai3[j2]);
				int k9 = h(ai[((l1 - 1) + i1) % i1], ai1[((l1 - 1) + i1) % i1], ai[l1], ai1[l1], ai3[j2]);
				int i14 = h(ai2[(i2 + 1) % j1], ai3[(i2 + 1) % j1], ai2[i2], ai3[i2], ai3[j2]);
				int l18 = ai2[j2];
				if (ob(l4, k9, i14, l18, flag))
					return true;
				j2 = (j2 + 1) % j1;
				if (i2 == j2)
					byte0 = 2;
			}
		while (byte0 == 1) 
			if (ai1[k1] < ai3[i2]) {
				if (ai1[k1] < ai3[j2]) {
					int i5 = ai[k1];
					int j14 = h(ai2[(i2 + 1) % j1], ai3[(i2 + 1) % j1], ai2[i2], ai3[i2], ai1[k1]);
					int i19 = h(ai2[((j2 - 1) + j1) % j1], ai3[((j2 - 1) + j1) % j1], ai2[j2], ai3[j2], ai1[k1]);
					return kb(j14, i19, i5, !flag);
				}
				int j5 = h(ai[(k1 + 1) % i1], ai1[(k1 + 1) % i1], ai[k1], ai1[k1], ai3[j2]);
				int l9 = h(ai[((l1 - 1) + i1) % i1], ai1[((l1 - 1) + i1) % i1], ai[l1], ai1[l1], ai3[j2]);
				int k14 = h(ai2[(i2 + 1) % j1], ai3[(i2 + 1) % j1], ai2[i2], ai3[i2], ai3[j2]);
				int j19 = ai2[j2];
				if (ob(j5, l9, k14, j19, flag))
					return true;
				j2 = (j2 + 1) % j1;
				if (i2 == j2)
					byte0 = 0;
			} else
			if (ai3[i2] < ai3[j2]) {
				int k5 = h(ai[(k1 + 1) % i1], ai1[(k1 + 1) % i1], ai[k1], ai1[k1], ai3[i2]);
				int i10 = h(ai[((l1 - 1) + i1) % i1], ai1[((l1 - 1) + i1) % i1], ai[l1], ai1[l1], ai3[i2]);
				int l14 = ai2[i2];
				int k19 = h(ai2[((j2 - 1) + j1) % j1], ai3[((j2 - 1) + j1) % j1], ai2[j2], ai3[j2], ai3[i2]);
				if (ob(k5, i10, l14, k19, flag))
					return true;
				i2 = ((i2 - 1) + j1) % j1;
				if (i2 == j2)
					byte0 = 0;
			} else {
				int l5 = h(ai[(k1 + 1) % i1], ai1[(k1 + 1) % i1], ai[k1], ai1[k1], ai3[j2]);
				int j10 = h(ai[((l1 - 1) + i1) % i1], ai1[((l1 - 1) + i1) % i1], ai[l1], ai1[l1], ai3[j2]);
				int i15 = h(ai2[(i2 + 1) % j1], ai3[(i2 + 1) % j1], ai2[i2], ai3[i2], ai3[j2]);
				int l19 = ai2[j2];
				if (ob(l5, j10, i15, l19, flag))
					return true;
				j2 = (j2 + 1) % j1;
				if (i2 == j2)
					byte0 = 0;
			}
		while (byte0 == 2) 
			if (ai3[i2] < ai1[k1]) {
				if (ai3[i2] < ai1[l1]) {
					int i6 = h(ai[(k1 + 1) % i1], ai1[(k1 + 1) % i1], ai[k1], ai1[k1], ai3[i2]);
					int k10 = h(ai[((l1 - 1) + i1) % i1], ai1[((l1 - 1) + i1) % i1], ai[l1], ai1[l1], ai3[i2]);
					int j15 = ai2[i2];
					return kb(i6, k10, j15, flag);
				}
				int j6 = h(ai[(k1 + 1) % i1], ai1[(k1 + 1) % i1], ai[k1], ai1[k1], ai1[l1]);
				int l10 = ai[l1];
				int k15 = h(ai2[(i2 + 1) % j1], ai3[(i2 + 1) % j1], ai2[i2], ai3[i2], ai1[l1]);
				int i20 = h(ai2[((j2 - 1) + j1) % j1], ai3[((j2 - 1) + j1) % j1], ai2[j2], ai3[j2], ai1[l1]);
				if (ob(j6, l10, k15, i20, flag))
					return true;
				l1 = (l1 + 1) % i1;
				if (k1 == l1)
					byte0 = 0;
			} else
			if (ai1[k1] < ai1[l1]) {
				int k6 = ai[k1];
				int i11 = h(ai[((l1 - 1) + i1) % i1], ai1[((l1 - 1) + i1) % i1], ai[l1], ai1[l1], ai1[k1]);
				int l15 = h(ai2[(i2 + 1) % j1], ai3[(i2 + 1) % j1], ai2[i2], ai3[i2], ai1[k1]);
				int j20 = h(ai2[((j2 - 1) + j1) % j1], ai3[((j2 - 1) + j1) % j1], ai2[j2], ai3[j2], ai1[k1]);
				if (ob(k6, i11, l15, j20, flag))
					return true;
				k1 = ((k1 - 1) + i1) % i1;
				if (k1 == l1)
					byte0 = 0;
			} else {
				int l6 = h(ai[(k1 + 1) % i1], ai1[(k1 + 1) % i1], ai[k1], ai1[k1], ai1[l1]);
				int j11 = ai[l1];
				int i16 = h(ai2[(i2 + 1) % j1], ai3[(i2 + 1) % j1], ai2[i2], ai3[i2], ai1[l1]);
				int k20 = h(ai2[((j2 - 1) + j1) % j1], ai3[((j2 - 1) + j1) % j1], ai2[j2], ai3[j2], ai1[l1]);
				if (ob(l6, j11, i16, k20, flag))
					return true;
				l1 = (l1 + 1) % i1;
				if (k1 == l1)
					byte0 = 0;
			}
		if (ai1[k1] < ai3[i2]) {
			int i7 = ai[k1];
			int j16 = h(ai2[(i2 + 1) % j1], ai3[(i2 + 1) % j1], ai2[i2], ai3[i2], ai1[k1]);
			int l20 = h(ai2[((j2 - 1) + j1) % j1], ai3[((j2 - 1) + j1) % j1], ai2[j2], ai3[j2], ai1[k1]);
			return kb(j16, l20, i7, !flag);
		}
		int j7 = h(ai[(k1 + 1) % i1], ai1[(k1 + 1) % i1], ai[k1], ai1[k1], ai3[i2]);
		int k11 = h(ai[((l1 - 1) + i1) % i1], ai1[((l1 - 1) + i1) % i1], ai[l1], ai1[l1], ai3[i2]);
		int k16 = ai2[i2];
		return kb(j7, k11, k16, flag);
	}

	int a;
	int b[];
	int c[][];
	int d[];
	public int e;
	public int f;
	public int g;
	public int h;
	public int i;
	public int j;
	public static int k[] = new int[2048];
	private static int l[] = new int[512];
	public boolean m;
	public double n;
	public int o;
	private boolean p;
	private int q;
	private int r;
	private int s;
	private int t;
	private p u[];
	private int v[];
	private int w;
	private int x;
	private int y;
	private int z;
	private int ab;
	private int bb;
	private int cb;
	private int db;
	private int eb;
	private int fb;
	private int gb;
	private int hb;
	private int ib;
	private int jb;
	private int kb;
	private p lb[];
	private int mb[];
	private int nb;
	private s ob[];
	private int pb;
	private int qb;
	private int rb[];
	private int sb[];
	private int tb[];
	private int ub[];
	private int vb[];
	private int wb[];
	private int xb[];
	public p yb;
	private static final int zb = 16;
	private static final int ac = 4;
	private static final int bc = 5;
	private static final int cc = 0xbc614e;
	int dc;
	String ec[];
	int fc[];
	int gc[];
	long hc[];
	boolean ic[];
	int jc[][];
	private static long kc;
	byte lc[];
	int mc[][];
	int nc[][];
	private static byte oc[];
	private static int pc[] = new int[256];
	i qc;
	public int rc[];
	e sc[];
	int tc;
	int uc;
	int vc[];
	int wc[];
	int xc[];
	int yc[];
	int zc[];
	int ad[];
	boolean bd;
	static int cd;
	static int dd;
	static int ed;
	static int fd;
	static int gd;
	static int hd;
	int id;
	int jd;

}
