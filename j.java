// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb space 

import jagex.c;
import jagex.m;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

public class j {

	public static void ci() {
		try {
			ei(new m("../gamedata/config/projectile.txt"));
			di(new m("../gamedata/config/entity.txt"));
			ph(new m("../gamedata/config/objects.txt"));
			oh(new m("../gamedata/config/npc.txt"));
			yh(new m("../gamedata/config/location.txt"));
			th(new m("../gamedata/config/boundary.txt"));
			bi(new m("../gamedata/config/roof.txt"));
			fi(new m("../gamedata/config/floor.txt"));
			zh(new m("../gamedata/config/spells.txt"));
			wh(new m("../gamedata/config/shop.txt"));
			rh(new m("../gamedata/config/prayers.txt"));
			uh();
			return;
		}
		catch (IOException ioexception) {
			System.out.println("Error loading config files");
			ioexception.printStackTrace();
			return;
		}
	}

	public static void xh(byte abyte0[]) {
		try {
			ei(new m(abyte0, c.wc("projectile.txt", abyte0)));
			di(new m(abyte0, c.wc("entity.txt", abyte0)));
			ph(new m(abyte0, c.wc("objects.txt", abyte0)));
			oh(new m(abyte0, c.wc("npc.txt", abyte0)));
			yh(new m(abyte0, c.wc("location.txt", abyte0)));
			th(new m(abyte0, c.wc("boundary.txt", abyte0)));
			bi(new m(abyte0, c.wc("roof.txt", abyte0)));
			fi(new m(abyte0, c.wc("floor.txt", abyte0)));
			zh(new m(abyte0, c.wc("spells.txt", abyte0)));
			wh(new m(abyte0, c.wc("shop.txt", abyte0)));
			rh(new m(abyte0, c.wc("prayers.txt", abyte0)));
			uh();
			return;
		}
		catch (IOException ioexception) {
			System.out.println("Error loading config files");
			ioexception.printStackTrace();
			return;
		}
	}

	public static void wh(m m1) throws IOException {
		m1.li();
		int i = m1.mi();
		yo = i;
		System.out.println("Found " + i + " shops");
		zo = new String[i];
		ap = new int[i];
		ep = new int[i];
		bp = new int[i];
		cp = new int[i];
		dp = new int[i];
		fp = new int[i][40];
		gp = new int[i][40];
		hp = new int[i][40];
		for (int k = 0; k < i; k++) {
			m1.li();
			zo[k] = m1.ni();
			int l = ap[k] = m1.mi();
			bp[k] = m1.mi();
			cp[k] = m1.mi();
			dp[k] = m1.mi();
			ep[k] = m1.mi();
			for (int i1 = 0; i1 < l; i1++) {
				m1.li();
				fp[k][i1] = qh(m1.ni());
				gp[k][i1] = m1.mi();
				hp[k][i1] = m1.mi();
			}

		}

	}

	public static void zh(m m1) throws IOException {
		m1.li();
		int i = m1.mi() + 3; /* XXX */
		qo = i;
		System.out.println("Found " + i + " spells");
		ro = new String[i];
		so = new String[i];
		to = new int[i];
		vo = new int[i];
		uo = new int[i];
		wo = new int[i][];
		xo = new int[i][];
		for (int k = 0; k < i; k++) {
			m1.li();
			ro[k] = m1.ni();
			to[k] = m1.mi();
			so[k] = m1.ni();
			vo[k] = m1.mi();
			m1.li();
			int l = uo[k] = m1.mi();
			wo[k] = new int[l];
			xo[k] = new int[l];
			for (int i1 = 0; i1 < l; i1++) {
				wo[k][i1] = qh(m1.ni());
				xo[k][i1] = m1.mi();
			}

		}

		m1.qi();
	}

	public static void rh(m m1) throws IOException {
		m1.li();
		int i = m1.mi();
		ip = i;
		System.out.println("Found " + i + " prayers");
		jp = new String[i];
		kp = new String[i];
		lp = new int[i];
		mp = new int[i];
		for (int k = 0; k < i; k++) {
			m1.li();
			jp[k] = m1.ni();
			lp[k] = m1.mi();
			kp[k] = m1.ni();
			mp[k] = m1.mi();
		}

		m1.qi();
	}

	public static void ei(m m1) throws IOException {
		m1.li();
		int i = m1.mi();
		go = i;
		System.out.println("Found " + i + " projectiles");
		io = new String[i];
		jo = new String[i];
		ko = new int[i];
		lo = new int[i];
		mo = new int[i];
		no = new int[i];
		oo = new int[i];
		po = new int[i];
		for (int k = 0; k < i; k++) {
			m1.li();
			io[k] = m1.ni();
			ko[k] = m1.mi();
			lo[k] = m1.mi();
			mo[k] = m1.mi();
			no[k] = m1.mi();
			jo[k] = m1.ni();
			po[k] = m1.mi();
			if (ko[k] + 1 > ho)
				ho = ko[k] + 1;
		}

		m1.qi();
	}

	public static void uh() {
		for (int i = 0; i < go; i++)
			oo[i] = qh(jo[i]);

	}

	public static void di(m m1) throws IOException {
		m1.li();
		int i = m1.mi();
		sm = i;
		System.out.println("Found " + i + " entities");
		tm = new String[i];
		um = new String[i];
		wm = new int[i];
		vm = new int[i];
		xm = new int[i];
		ym = new int[i];
		zm = new int[i];
		for (int k = 0; k < i; k++) {
			m1.li();
			tm[k] = m1.ni();
			um[k] = m1.ni();
			vm[k] = m1.pi();
			wm[k] = m1.mi();
			xm[k] = m1.mi();
			ym[k] = m1.mi();
		}

		m1.qi();
	}

	public static void oh(m m1) throws IOException {
		m1.li();
		int i = m1.mi();
		ol = i;
		System.out.println("Found " + i + " npcs");
		pl = new String[i][];
		ql = new String[i];
		rl = new int[i];
		sl = new int[i];
		tl = new int[i];
		ul = new int[i];
		vl = new int[i];
		wl = new int[i];
		xl = new int[i];
		yl = new int[i];
		zl = new int[i];
		am = new int[i];
		bm = new int[i];
		cm = new int[i];
		dm = new int[i];
		em = new int[i];
		fm = new int[i];
		gm = new int[i][12];
		hm = new int[i];
		im = new int[i];
		jm = new int[i];
		km = new int[i];
		lm = new int[i];
		mm = new int[i];
		nm = new int[i];
		om = new int[i];
		pm = new int[i];
		qm = new int[i][];
		rm = new int[i][];
		for (int k = 0; k < i; k++) {
			m1.li();
			int l = m1.mi();
			pl[k] = new String[l];
			for (int i1 = 0; i1 < l; i1++)
				pl[k][i1] = m1.ni();

			ql[k] = m1.ni();
			m1.li();
			rl[k] = m1.mi();
			sl[k] = m1.mi();
			tl[k] = m1.mi();
			ul[k] = m1.mi();
			vl[k] = m1.mi();
			wl[k] = m1.mi();
			xl[k] = m1.mi();
			yl[k] = m1.mi();
			zl[k] = m1.mi();
			am[k] = m1.mi();
			bm[k] = m1.mi();
			cm[k] = m1.mi();
			dm[k] = m1.mi();
			em[k] = m1.mi();
			fm[k] = m1.mi();
			m1.li();
			for (int j1 = 0; j1 < 12; j1++)
				gm[k][j1] = vh(m1.ni());

			hm[k] = m1.pi();
			im[k] = m1.pi();
			jm[k] = m1.pi();
			km[k] = m1.pi();
			m1.li();
			lm[k] = m1.mi();
			mm[k] = m1.mi();
			nm[k] = m1.mi();
			om[k] = m1.mi();
			pm[k] = m1.mi();
			m1.li();
			int k1 = m1.mi();
			qm[k] = new int[k1];
			rm[k] = new int[k1];
			for (int l1 = 0; l1 < k1; l1++) {
				qm[k][l1] = qh(m1.ni());
				rm[k][l1] = m1.mi();
			}

		}

		m1.qi();
	}

	public static void ph(m m1) throws IOException {
		m1.li();
		int i = m1.mi();
		tk = i;
		System.out.println("Found " + i + " objects");
		vk = new String[i][];
		wk = new String[i];
		yk = new String[i];
		zk = new int[i];
		al = new int[i];
		bl = new int[i];
		cl = new int[i];
		dl = new int[i];
		el = new int[i];
		fl = new int[i];
		gl = new int[i];
		hl = new int[i];
		il = new int[i];
		jl = new int[i];
		kl = new int[i];
		ll = new int[i];
		ml = new int[i];
		nl = new int[i];
		for (int k = 0; k < i; k++) {
			m1.li();
			int l = m1.mi();
			vk[k] = new String[l];
			for (int i1 = 0; i1 < l; i1++)
				vk[k][i1] = m1.ni();

			wk[k] = m1.ni();
			System.out.println(k + ": " +
				Arrays.toString(vk[k]) + " - " + wk[k]);
			m1.li();
			zk[k] = m1.mi();
			if (zk[k] >= uk)
				uk = zk[k] + 1;
			al[k] = m1.mi();
			bl[k] = m1.mi();
			yk[k] = m1.ni();
			m1.li();
			cl[k] = m1.mi();
			dl[k] = m1.mi();
			el[k] = m1.mi();
			fl[k] = m1.mi();
			gl[k] = m1.mi();
			hl[k] = m1.mi();
			il[k] = ai(m1.ni()) + 1;
			m1.li();
			jl[k] = m1.mi();
			kl[k] = vh(m1.ni());
			ll[k] = m1.pi();
			ml[k] = m1.mi();
			nl[k] = m1.mi();
		}

		m1.qi();
	}

	public static void yh(m m1) throws IOException {
		m1.li();
		int i = m1.mi();
		an = i;
		System.out.println("Found " + i + " locations");
		bn = new String[i][];
		cn = new String[i];
		dn = new String[i];
		en = new String[i];
		fn = new int[i];
		gn = new int[i];
		hn = new int[i];
		in = new int[i];
		jn = new int[i];
		kn = new int[i];
		for (int k = 0; k < i; k++) {
			m1.li();
			int l = m1.mi();
			bn[k] = new String[l];
			for (int i1 = 0; i1 < l; i1++)
				bn[k][i1] = m1.ni();

			cn[k] = m1.ni();
			m1.li();
			fn[k] = sh(m1.ni());
			gn[k] = m1.mi();
			hn[k] = m1.mi();
			in[k] = m1.mi();
			jn[k] = m1.mi();
			dn[k] = m1.ni();
			if (dn[k].equals("_"))
				dn[k] = "WalkTo";
			en[k] = m1.ni();
			if (en[k].equals("_"))
				en[k] = "Examine";
			kn[k] = m1.mi();
		}

		m1.qi();
	}

	public static void th(m m1) throws IOException {
		m1.li();
		int i = m1.mi();
		ln = i;
		System.out.println("Found " + i + " boundaries");
		mn = new String[i][];
		nn = new String[i];
		on = new String[i];
		pn = new String[i];
		qn = new int[i];
		rn = new int[i];
		sn = new int[i];
		tn = new int[i];
		un = new int[i];
		vn = new int[i];
		for (int k = 0; k < i; k++) {
			m1.li();
			int l = m1.mi();
			mn[k] = new String[l];
			for (int i1 = 0; i1 < l; i1++)
				mn[k][i1] = m1.ni();

			nn[k] = m1.ni();
			m1.li();
			qn[k] = m1.mi();
			rn[k] = m1.mi();
			sn[k] = m1.mi();
			tn[k] = m1.mi();
			un[k] = m1.mi();
			vn[k] = m1.mi();
			on[k] = m1.ni();
			if (on[k].equals("_"))
				on[k] = "WalkTo";
			pn[k] = m1.ni();
			if (pn[k].equals("_"))
				pn[k] = "Examine";
		}

		m1.qi();
	}

	public static void bi(m m1) throws IOException {
		m1.li();
		int i = m1.mi();
		wn = i;
		System.out.println("Found " + i + " roofs");
		xn = new String[i];
		yn = new int[i];
		zn = new int[i];
		ao = new int[i];
		for (int k = 0; k < i; k++) {
			m1.li();
			xn[k] = m1.ni();
			yn[k] = m1.mi();
			zn[k] = m1.mi();
			ao[k] = m1.mi();
		}

		m1.qi();
	}

	public static void fi(m m1) throws IOException {
		m1.li();
		int i = m1.mi();
		bo = i;
		System.out.println("Found " + i + " floors");
		co = new String[i];
		_flddo = new int[i];
		eo = new int[i];
		fo = new int[i];
		for (int k = 0; k < i; k++) {
			m1.li();
			co[k] = m1.ni();
			_flddo[k] = m1.mi();
			eo[k] = m1.mi();
			fo[k] = m1.mi();
		}

		m1.qi();
	}

	public static int vh(String s) {
		if (s.equalsIgnoreCase("na"))
			return -1;
		for (int i = 0; i < sm; i++)
			if (s.equalsIgnoreCase(tm[i]))
				return i;

		System.out.println("WARNING: unable to match entity " + s);
		return 0;
	}

	public static int sh(String s) {
		if (s.equalsIgnoreCase("na"))
			return 0;
		for (int i = 0; i < pp; i++)
			if (qp[i].equalsIgnoreCase(s))
				return i;

		qp[pp++] = s;
		return pp - 1;
	}

	public static int qh(String s) {
		if (s.equalsIgnoreCase("na"))
			return 0;
		for (int i = 0; i < tk; i++) {
			for (int k = 0; k < vk[i].length; k++)
				if (vk[i][k].equalsIgnoreCase(s))
					return i;

		}

		System.out.println("WARNING: unable to match object: " + s);
		return 0;
	}

	public static int ai(String s) {
		if (s.equals("_"))
			return -1;
		for (int i = 0; i < go; i++)
			if (io[i].equalsIgnoreCase(s))
				return i;

		System.out.println("WARNING: unable to match projectile: " + s);
		return -1;
	}

	public j() {
	}

	public final int sk = 0xbc614e;
	public static int tk;
	public static int uk;
	public static String vk[][];
	public static String wk[];
	public static String xk[];
	public static String yk[];
	public static int zk[];
	public static int al[];
	public static int bl[];
	public static int cl[];
	public static int dl[];
	public static int el[];
	public static int fl[];
	public static int gl[];
	public static int hl[];
	public static int il[];
	public static int jl[];
	public static int kl[];
	public static int ll[];
	public static int ml[];
	public static int nl[];
	public static int ol;
	public static String pl[][];
	public static String ql[];
	public static int rl[];
	public static int sl[];
	public static int tl[];
	public static int ul[];
	public static int vl[];
	public static int wl[];
	public static int xl[];
	public static int yl[];
	public static int zl[];
	public static int am[];
	public static int bm[];
	public static int cm[];
	public static int dm[];
	public static int em[];
	public static int fm[];
	public static int gm[][];
	public static int hm[];
	public static int im[];
	public static int jm[];
	public static int km[];
	public static int lm[];
	public static int mm[];
	public static int nm[];
	public static int om[];
	public static int pm[];
	public static int qm[][];
	public static int rm[][];
	public static int sm;
	public static String tm[];
	public static String um[];
	public static int vm[];
	public static int wm[];
	public static int xm[];
	public static int ym[];
	public static int zm[];
	public static int an;
	public static String bn[][];
	public static String cn[];
	public static String dn[];
	public static String en[];
	public static int fn[];
	public static int gn[];
	public static int hn[];
	public static int in[];
	public static int jn[];
	public static int kn[];
	public static int ln;
	public static String mn[][];
	public static String nn[];
	public static String on[];
	public static String pn[];
	public static int qn[];
	public static int rn[];
	public static int sn[];
	public static int tn[];
	public static int un[];
	public static int vn[];
	public static int wn;
	public static String xn[];
	public static int yn[];
	public static int zn[];
	public static int ao[];
	public static int bo;
	public static String co[];
	public static int _flddo[];
	public static int eo[];
	public static int fo[];
	public static int go;
	public static int ho;
	public static String io[];
	public static String jo[];
	public static int ko[];
	public static int lo[];
	public static int mo[];
	public static int no[];
	public static int oo[];
	public static int po[];
	public static int qo;
	public static String ro[];
	public static String so[];
	public static int to[];
	public static int uo[];
	public static int vo[];
	public static int wo[][];
	public static int xo[][];
	public static int yo;
	public static String zo[];
	public static int ap[];
	public static int bp[];
	public static int cp[];
	public static int dp[];
	public static int ep[];
	public static int fp[][];
	public static int gp[][];
	public static int hp[][];
	public static int ip;
	public static String jp[];
	public static String kp[];
	public static int lp[];
	public static int mp[];
	static String np[] = {
		"attack", "defense", "strength", "hits", "ranged", "prayer", "magic", "cooking", "woodcutting", "fletching", 
		"fishing", "firemaking", "crafting", "smithing", "mining", "herblaw"
	};
	public static String op[] = {
		"attack", "defense", "strength", "hits", "aggression", "bravery", "regenerate", "perception"
	};
	public static int pp;
	public static String qp[] = new String[200];

}
