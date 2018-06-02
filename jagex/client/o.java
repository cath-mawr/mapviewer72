// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb space 

package jagex.client;


// Referenced classes of package jagex.client:
//			i

public class o {

	public o(i j, int k) {
		ot = -1;
		cu = true;
		ps = j;
		rs = k;
		ss = new boolean[k];
		ts = new boolean[k];
		us = new boolean[k];
		vs = new boolean[k];
		at = new boolean[k];
		ws = new int[k];
		xs = new int[k];
		ys = new int[k];
		zs = new int[k];
		bt = new int[k];
		ct = new int[k];
		dt = new int[k];
		et = new int[k];
		ft = new int[k];
		gt = new int[k];
		ht = new int[k];
		it = new String[k];
		jt = new String[k][];
		qt = el(114, 114, 176);
		rt = el(14, 14, 62);
		st = el(200, 208, 232);
		tt = el(96, 129, 184);
		ut = el(53, 95, 115);
		vt = el(117, 142, 171);
		wt = el(98, 122, 158);
		xt = el(86, 100, 136);
		yt = el(135, 146, 179);
		zt = el(97, 112, 151);
		au = el(88, 102, 136);
		bu = el(84, 93, 120);
	}

	public int el(int j, int k, int l) {
		return i.qg((fu * j) / 114, (gu * k) / 114, (hu * l) / 176);
	}

	public void lk() {
		mt = 0;
	}

	public void ik(int j, int k, int l, int i1) {
		kt = j;
		lt = k;
		nt = i1;
		if (l != 0)
			mt = l;
		if (l == 1) {
			for (int j1 = 0; j1 < qs; j1++) {
				if (ss[j1] && dt[j1] == 10 && kt >= bt[j1] && lt >= ct[j1] && kt <= bt[j1] + et[j1] && lt <= ct[j1] + ft[j1])
					vs[j1] = true;
				if (ss[j1] && dt[j1] == 14 && kt >= bt[j1] && lt >= ct[j1] && kt <= bt[j1] + et[j1] && lt <= ct[j1] + ft[j1])
					ys[j1] = 1 - ys[j1];
			}

		}
		if (i1 == 1)
			pt++;
		else
			pt = 0;
		if (l == 1 || pt > 20) {
			for (int k1 = 0; k1 < qs; k1++)
				if (ss[k1] && dt[k1] == 15 && kt >= bt[k1] && lt >= ct[k1] && kt <= bt[k1] + et[k1] && lt <= ct[k1] + ft[k1])
					vs[k1] = true;

			pt -= 5;
		}
	}

	public boolean kk(int j) {
		if (ss[j] && vs[j]) {
			vs[j] = false;
			return true;
		} else {
			return false;
		}
	}

	public void bk(int j) {
		if (j == 0)
			return;
		if (ot != -1 && it[ot] != null && ss[ot]) {
			int k = it[ot].length();
			if (j == 8 && k > 0)
				it[ot] = it[ot].substring(0, k - 1);
			if ((j == 10 || j == 13) && k > 0)
				vs[ot] = true;
			String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
			if (k < gt[ot]) {
				for (int l = 0; l < s.length(); l++)
					if (j == s.charAt(l))
						it[ot] += (char)j;

			}
			if (j == 9) {
				do
					ot = (ot + 1) % qs;
				while (dt[ot] != 5 && dt[ot] != 6);
				return;
			}
		}
	}

	public void hk() {
		for (int j = 0; j < qs; j++)
			if (ss[j])
				if (dt[j] == 0)
					jk(j, bt[j], ct[j], it[j], ht[j]);
				else
				if (dt[j] == 1)
					jk(j, bt[j] - ps.mf(it[j], ht[j]) / 2, ct[j], it[j], ht[j]);
				else
				if (dt[j] == 2)
					nk(bt[j], ct[j], et[j], ft[j]);
				else
				if (dt[j] == 3)
					ak(bt[j], ct[j], et[j]);
				else
				if (dt[j] == 4)
					mk(j, bt[j], ct[j], et[j], ft[j], ht[j], jt[j], xs[j], ws[j]);
				else
				if (dt[j] == 5 || dt[j] == 6)
					zk(j, bt[j], ct[j], et[j], ft[j], it[j], ht[j]);
				else
				if (dt[j] == 7)
					xk(j, bt[j], ct[j], ht[j], jt[j]);
				else
				if (dt[j] == 8)
					uk(j, bt[j], ct[j], ht[j], jt[j]);
				else
				if (dt[j] == 9)
					fl(j, bt[j], ct[j], et[j], ft[j], ht[j], jt[j], xs[j], ws[j]);
				else
				if (dt[j] == 11)
					gk(bt[j], ct[j], et[j], ft[j]);
				else
				if (dt[j] == 12)
					gl(bt[j], ct[j], ht[j]);
				else
				if (dt[j] == 14)
					xj(j, bt[j], ct[j], et[j], ft[j]);

		mt = 0;
	}

	protected void xj(int j, int k, int l, int i1, int j1) {
		ps.rg(k, l, i1, j1, 0xffffff);
		ps.sg(k, l, i1, yt);
		ps.kh(k, l, j1, yt);
		ps.sg(k, (l + j1) - 1, i1, bu);
		ps.kh((k + i1) - 1, l, j1, bu);
		if (ys[j] == 1) {
			for (int k1 = 0; k1 < j1; k1++) {
				ps.sg(k + k1, l + k1, 1, 0);
				ps.sg((k + i1) - 1 - k1, l + k1, 1, 0);
			}

		}
	}

	protected void jk(int j, int k, int l, String s, int i1) {
		int j1 = l + ps.of(i1) / 3;
		yk(j, k, j1, s, i1);
	}

	protected void yk(int j, int k, int l, String s, int i1) {
		int j1;
		if (at[j])
			j1 = 0xffffff;
		else
			j1 = 0;
		ps.ah(s, k, l, i1, j1);
	}

	protected void zk(int j, int k, int l, int i1, int j1, String s, int k1) {
		if (us[j]) {
			int l1 = s.length();
			s = "";
			for (int j2 = 0; j2 < l1; j2++)
				s = s + "X";

		}
		if (dt[j] == 5) {
			if (mt == 1 && kt >= k && lt >= l - j1 / 2 && kt <= k + i1 && lt <= l + j1 / 2)
				ot = j;
		} else
		if (dt[j] == 6) {
			if (mt == 1 && kt >= k - i1 / 2 && lt >= l - j1 / 2 && kt <= k + i1 / 2 && lt <= l + j1 / 2)
				ot = j;
			k -= ps.mf(s, k1) / 2;
		}
		if (ot == j)
			s = s + "*";
		int i2 = l + ps.of(k1) / 3;
		yk(j, k, i2, s, k1);
	}

	public void nk(int j, int k, int l, int i1) {
		ps.ch(j, k, j + l, k + i1);
		ps.ih(j, k, l, i1, bu, yt);
		if (du) {
			for (int j1 = j - (k & 0x3f); j1 < j + l; j1 += 128) {
				for (int k1 = k - (k & 0x1f); k1 < k + i1; k1 += 128)
					ps.gg(j1, k1, 6 + eu, 128);

			}

		}
		ps.sg(j, k, l, yt);
		ps.sg(j + 1, k + 1, l - 2, yt);
		ps.sg(j + 2, k + 2, l - 4, zt);
		ps.kh(j, k, i1, yt);
		ps.kh(j + 1, k + 1, i1 - 2, yt);
		ps.kh(j + 2, k + 2, i1 - 4, zt);
		ps.sg(j, (k + i1) - 1, l, bu);
		ps.sg(j + 1, (k + i1) - 2, l - 2, bu);
		ps.sg(j + 2, (k + i1) - 3, l - 4, au);
		ps.kh((j + l) - 1, k, i1, bu);
		ps.kh((j + l) - 2, k + 1, i1 - 2, bu);
		ps.kh((j + l) - 3, k + 2, i1 - 4, au);
		ps.pf();
	}

	public void gk(int j, int k, int l, int i1) {
		ps.rg(j, k, l, i1, 0);
		ps.ag(j, k, l, i1, vt);
		ps.ag(j + 1, k + 1, l - 2, i1 - 2, wt);
		ps.ag(j + 2, k + 2, l - 4, i1 - 4, xt);
		ps.qf(j, k, 2 + eu);
		ps.qf((j + l) - 7, k, 3 + eu);
		ps.qf(j, (k + i1) - 7, 4 + eu);
		ps.qf((j + l) - 7, (k + i1) - 7, 5 + eu);
	}

	protected void gl(int j, int k, int l) {
		ps.qf(j, k, l);
	}

	protected void ak(int j, int k, int l) {
		ps.sg(j, k, l, 0);
	}

	protected void mk(int j, int k, int l, int i1, int j1, int k1, String as[], 
			int l1, int i2) {
		int j2 = j1 / ps.of(k1);
		if (i2 > l1 - j2)
			i2 = l1 - j2;
		if (i2 < 0)
			i2 = 0;
		ws[j] = i2;
		if (j2 < l1) {
			int k2 = (k + i1) - 12;
			int i3 = ((j1 - 27) * j2) / l1;
			if (i3 < 6)
				i3 = 6;
			int k3 = ((j1 - 27 - i3) * i2) / (l1 - j2);
			if (nt == 1 && kt >= k2 && kt <= k2 + 12) {
				if (lt > l && lt < l + 12 && i2 > 0)
					i2--;
				if (lt > (l + j1) - 12 && lt < l + j1 && i2 < l1 - j2)
					i2++;
				ws[j] = i2;
			}
			if (nt == 1 && (kt >= k2 && kt <= k2 + 12 || kt >= k2 - 12 && kt <= k2 + 24 && ts[j])) {
				if (lt > l + 12 && lt < (l + j1) - 12) {
					ts[j] = true;
					int i4 = lt - l - 12 - i3 / 2;
					i2 = (i4 * l1) / (j1 - 24);
					if (i2 > l1 - j2)
						i2 = l1 - j2;
					if (i2 < 0)
						i2 = 0;
					ws[j] = i2;
				}
			} else {
				ts[j] = false;
			}
			k3 = ((j1 - 27 - i3) * i2) / (l1 - j2);
			dl(k, l, i1, j1, k3, i3);
		}
		int l2 = j1 - j2 * ps.of(k1);
		int j3 = l + (ps.of(k1) * 5) / 6 + l2 / 2;
		for (int l3 = i2; l3 < l1; l3++) {
			yk(j, k + 2, j3, as[l3], k1);
			j3 += ps.of(k1) - iu;
			if (j3 >= l + j1)
				return;
		}

	}

	protected void dl(int j, int k, int l, int i1, int j1, int k1) {
		int l1 = (j + l) - 12;
		ps.ag(l1, k, 12, i1, 0);
		ps.qf(l1 + 1, k + 1, eu);
		ps.qf(l1 + 1, (k + i1) - 12, 1 + eu);
		ps.sg(l1, k + 13, 12, 0);
		ps.sg(l1, (k + i1) - 13, 12, 0);
		ps.ih(l1 + 1, k + 14, 11, i1 - 27, qt, rt);
		ps.rg(l1 + 3, j1 + k + 14, 7, k1, tt);
		ps.kh(l1 + 2, j1 + k + 14, k1, st);
		ps.kh(l1 + 2 + 8, j1 + k + 14, k1, ut);
	}

	protected void xk(int j, int k, int l, int i1, String as[]) {
		int j1 = 0;
		int k1 = as.length;
		for (int l1 = 0; l1 < k1; l1++) {
			j1 += ps.mf(as[l1], i1);
			if (l1 < k1 - 1)
				j1 += ps.mf("  ", i1);
		}

		int i2 = k - j1 / 2;
		int j2 = l + ps.of(i1) / 3;
		for (int k2 = 0; k2 < k1; k2++) {
			int l2;
			if (at[j])
				l2 = 0xffffff;
			else
				l2 = 0;
			if (kt >= i2 && kt <= i2 + ps.mf(as[k2], i1) && lt <= j2 && lt > j2 - ps.of(i1)) {
				if (at[j])
					l2 = 0x808080;
				else
					l2 = 0xffffff;
				if (mt == 1) {
					ys[j] = k2;
					vs[j] = true;
				}
			}
			if (ys[j] == k2)
				if (at[j])
					l2 = 0xff0000;
				else
					l2 = 0xc00000;
			ps.ah(as[k2], i2, j2, i1, l2);
			i2 += ps.mf(as[k2] + "  ", i1);
		}

	}

	protected void uk(int j, int k, int l, int i1, String as[]) {
		int j1 = as.length;
		int k1 = l - (ps.of(i1) * (j1 - 1)) / 2;
		for (int l1 = 0; l1 < j1; l1++) {
			int i2;
			if (at[j])
				i2 = 0xffffff;
			else
				i2 = 0;
			int j2 = ps.mf(as[l1], i1);
			if (kt >= k - j2 / 2 && kt <= k + j2 / 2 && lt - 2 <= k1 && lt - 2 > k1 - ps.of(i1)) {
				if (at[j])
					i2 = 0x808080;
				else
					i2 = 0xffffff;
				if (mt == 1) {
					ys[j] = l1;
					vs[j] = true;
				}
			}
			if (ys[j] == l1)
				if (at[j])
					i2 = 0xff0000;
				else
					i2 = 0xc00000;
			ps.ah(as[l1], k - j2 / 2, k1, i1, i2);
			k1 += ps.of(i1);
		}

	}

	protected void fl(int j, int k, int l, int i1, int j1, int k1, String as[], 
			int l1, int i2) {
		int j2 = j1 / ps.of(k1);
		if (j2 < l1) {
			int k2 = (k + i1) - 12;
			int i3 = ((j1 - 27) * j2) / l1;
			if (i3 < 6)
				i3 = 6;
			int k3 = ((j1 - 27 - i3) * i2) / (l1 - j2);
			if (nt == 1 && kt >= k2 && kt <= k2 + 12) {
				if (lt > l && lt < l + 12 && i2 > 0)
					i2--;
				if (lt > (l + j1) - 12 && lt < l + j1 && i2 < l1 - j2)
					i2++;
				ws[j] = i2;
			}
			if (nt == 1 && (kt >= k2 && kt <= k2 + 12 || kt >= k2 - 12 && kt <= k2 + 24 && ts[j])) {
				if (lt > l + 12 && lt < (l + j1) - 12) {
					ts[j] = true;
					int i4 = lt - l - 12 - i3 / 2;
					i2 = (i4 * l1) / (j1 - 24);
					if (i2 < 0)
						i2 = 0;
					if (i2 > l1 - j2)
						i2 = l1 - j2;
					ws[j] = i2;
				}
			} else {
				ts[j] = false;
			}
			k3 = ((j1 - 27 - i3) * i2) / (l1 - j2);
			dl(k, l, i1, j1, k3, i3);
		} else {
			i2 = 0;
			ws[j] = 0;
		}
		zs[j] = -1;
		int l2 = j1 - j2 * ps.of(k1);
		int j3 = l + (ps.of(k1) * 5) / 6 + l2 / 2;
		for (int l3 = i2; l3 < l1; l3++) {
			int j4;
			if (at[j])
				j4 = 0xffffff;
			else
				j4 = 0;
			if (kt >= k + 2 && kt <= k + 2 + ps.mf(as[l3], k1) && lt - 2 <= j3 && lt - 2 > j3 - ps.of(k1)) {
				if (at[j])
					j4 = 0x808080;
				else
					j4 = 0xffffff;
				zs[j] = l3;
				if (mt == 1) {
					ys[j] = l3;
					vs[j] = true;
				}
			}
			if (ys[j] == l3 && cu)
				j4 = 0xff0000;
			ps.ah(as[l3], k + 2, j3, k1, j4);
			j3 += ps.of(k1);
			if (j3 >= l + j1)
				return;
		}

	}

	public int sk(int j, int k, String s, int l, boolean flag) {
		dt[qs] = 0;
		ss[qs] = true;
		vs[qs] = false;
		ht[qs] = l;
		at[qs] = flag;
		bt[qs] = j;
		ct[qs] = k;
		it[qs] = s;
		return qs++;
	}

	public int pk(int j, int k, String s, int l, boolean flag) {
		dt[qs] = 1;
		ss[qs] = true;
		vs[qs] = false;
		ht[qs] = l;
		at[qs] = flag;
		bt[qs] = j;
		ct[qs] = k;
		it[qs] = s;
		return qs++;
	}

	public int vj(int j, int k, int l, int i1) {
		dt[qs] = 2;
		ss[qs] = true;
		vs[qs] = false;
		bt[qs] = j - l / 2;
		ct[qs] = k - i1 / 2;
		et[qs] = l;
		ft[qs] = i1;
		return qs++;
	}

	public int cl(int j, int k, int l, int i1) {
		dt[qs] = 11;
		ss[qs] = true;
		vs[qs] = false;
		bt[qs] = j;
		ct[qs] = k;
		et[qs] = l;
		ft[qs] = i1;
		return qs++;
	}

	public int yj(int j, int k, int l, int i1) {
		dt[qs] = 11;
		ss[qs] = true;
		vs[qs] = false;
		bt[qs] = j - l / 2;
		ct[qs] = k - i1 / 2;
		et[qs] = l;
		ft[qs] = i1;
		return qs++;
	}

	public int fk(int j, int k, int l) {
		int i1 = ps.aj[l];
		int j1 = ps.bj[l];
		dt[qs] = 12;
		ss[qs] = true;
		vs[qs] = false;
		bt[qs] = j - i1 / 2;
		ct[qs] = k - j1 / 2;
		et[qs] = i1;
		ft[qs] = j1;
		ht[qs] = l;
		return qs++;
	}

	public int tj(int j, int k, int l, int i1, int j1, int k1, boolean flag) {
		dt[qs] = 4;
		ss[qs] = true;
		vs[qs] = false;
		bt[qs] = j;
		ct[qs] = k;
		et[qs] = l;
		ft[qs] = i1;
		at[qs] = flag;
		ht[qs] = j1;
		gt[qs] = k1;
		xs[qs] = 0;
		ws[qs] = 0;
		jt[qs] = new String[k1];
		return qs++;
	}

	public int bl(int j, int k, int l, int i1, int j1, int k1, boolean flag, 
			boolean flag1) {
		dt[qs] = 5;
		ss[qs] = true;
		us[qs] = flag;
		vs[qs] = false;
		ht[qs] = j1;
		at[qs] = flag1;
		bt[qs] = j;
		ct[qs] = k;
		et[qs] = l;
		ft[qs] = i1;
		gt[qs] = k1;
		it[qs] = "";
		return qs++;
	}

	public int sj(int j, int k, int l, int i1, int j1, int k1, boolean flag, 
			boolean flag1) {
		dt[qs] = 6;
		ss[qs] = true;
		us[qs] = flag;
		vs[qs] = false;
		ht[qs] = j1;
		at[qs] = flag1;
		bt[qs] = j;
		ct[qs] = k;
		et[qs] = l;
		ft[qs] = i1;
		gt[qs] = k1;
		it[qs] = "";
		return qs++;
	}

	public int wj(int j, int k, String as[], int l, boolean flag) {
		dt[qs] = 7;
		ss[qs] = true;
		vs[qs] = false;
		ht[qs] = l;
		at[qs] = flag;
		bt[qs] = j;
		ct[qs] = k;
		jt[qs] = as;
		ys[qs] = 0;
		return qs++;
	}

	public int ck(int j, int k, String as[], int l, boolean flag) {
		dt[qs] = 8;
		ss[qs] = true;
		vs[qs] = false;
		ht[qs] = l;
		at[qs] = flag;
		bt[qs] = j;
		ct[qs] = k;
		jt[qs] = as;
		ys[qs] = 0;
		return qs++;
	}

	public int ml(int j, int k, int l, int i1, int j1, int k1, boolean flag) {
		dt[qs] = 9;
		ss[qs] = true;
		vs[qs] = false;
		ht[qs] = j1;
		at[qs] = flag;
		bt[qs] = j;
		ct[qs] = k;
		et[qs] = l;
		ft[qs] = i1;
		gt[qs] = k1;
		jt[qs] = new String[k1];
		xs[qs] = 0;
		ws[qs] = 0;
		ys[qs] = -1;
		zs[qs] = -1;
		return qs++;
	}

	public int ll(int j, int k, int l, int i1, int j1, int k1, boolean flag) {
		dt[qs] = 9;
		ss[qs] = true;
		vs[qs] = false;
		ht[qs] = j1;
		at[qs] = flag;
		bt[qs] = j - l / 2;
		ct[qs] = k - i1 / 2;
		et[qs] = l;
		ft[qs] = i1;
		gt[qs] = k1;
		jt[qs] = new String[k1];
		xs[qs] = 0;
		ws[qs] = 0;
		ys[qs] = -1;
		return qs++;
	}

	public int vk(int j, int k, int l, int i1) {
		dt[qs] = 10;
		ss[qs] = true;
		vs[qs] = false;
		bt[qs] = j - l / 2;
		ct[qs] = k - i1 / 2;
		et[qs] = l;
		ft[qs] = i1;
		return qs++;
	}

	public int uj(int j, int k, int l) {
		dt[qs] = 14;
		ss[qs] = true;
		vs[qs] = false;
		bt[qs] = j;
		ct[qs] = k;
		et[qs] = l;
		ft[qs] = l;
		return qs++;
	}

	public int al(int j, int k, int l) {
		dt[qs] = 14;
		ss[qs] = true;
		vs[qs] = false;
		bt[qs] = j - l / 2;
		ct[qs] = k - l / 2;
		et[qs] = l;
		ft[qs] = l;
		return qs++;
	}

	public int hl(int j, int k, int l, int i1) {
		dt[qs] = 15;
		ss[qs] = true;
		vs[qs] = false;
		bt[qs] = j - l / 2;
		ct[qs] = k - i1 / 2;
		et[qs] = l;
		ft[qs] = i1;
		return qs++;
	}

	public void ek(int j) {
		xs[j] = 0;
	}

	public void tk(int j) {
		ws[j] = 0;
		zs[j] = -1;
	}

	public void kl(int j, int k, String s) {
		jt[j][k] = s;
		if (k + 1 > xs[j])
			xs[j] = k + 1;
	}

	public void ok(int j, String s, boolean flag) {
		int k = xs[j]++;
		if (k >= gt[j]) {
			k--;
			xs[j]--;
			for (int l = 0; l < k; l++)
				jt[j][l] = jt[j][l + 1];

		}
		jt[j][k] = s;
		if (flag)
			ws[j] = 0xf423f;
	}

	public void zj(int j, String s) {
		it[j] = s;
	}

	public String jl(int j) {
		if (it[j] == null)
			return "null";
		else
			return it[j];
	}

	public void dk(int j) {
		ss[j] = true;
	}

	public void wk(int j) {
		ss[j] = false;
	}

	public void rk(int j) {
		ot = j;
	}

	public int rj(int j) {
		return ys[j];
	}

	public int il(int j) {
		int k = zs[j];
		return k;
	}

	public void qk(int j, int k) {
		ys[j] = k;
	}

	protected i ps;
	int qs;
	int rs;
	boolean ss[];
	boolean ts[];
	boolean us[];
	boolean vs[];
	public int ws[];
	public int xs[];
	public int ys[];
	public int zs[];
	boolean at[];
	int bt[];
	int ct[];
	int dt[];
	int et[];
	int ft[];
	int gt[];
	int ht[];
	String it[];
	String jt[][];
	int kt;
	int lt;
	int mt;
	int nt;
	int ot;
	int pt;
	int qt;
	int rt;
	int st;
	int tt;
	int ut;
	int vt;
	int wt;
	int xt;
	int yt;
	int zt;
	int au;
	int bu;
	public boolean cu;
	public static boolean du = true;
	public static int eu;
	public static int fu = 114;
	public static int gu = 114;
	public static int hu = 176;
	public static int iu;

}
