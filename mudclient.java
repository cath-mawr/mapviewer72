// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb space 

import jagex.c;
import jagex.client.*;
import java.applet.Applet;
import java.awt.*;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;

public class mudclient extends f {

	public static void main(String as[]) {
		mudclient mudclient1 = new mudclient();
		mudclient1.xz = false;
		mudclient1.oj(mudclient1.lab, mudclient1.mab + 22, "Runescape by Andrew Gower", false);
		mudclient1.cs = 10;
	}

	public void ui() {
		if (xz) {
			String s = getDocumentBase().getHost().toLowerCase();
			if (!s.endsWith("jagex.com") && !s.endsWith("jagex.co.uk") && !s.endsWith("runescape.com") && !s.endsWith("runescape.co.uk") && !s.endsWith("runescape.net") && !s.endsWith("runescape.org") && !s.endsWith("64.23.81.81") && !s.endsWith("64.23.81.89") && !s.endsWith("penguin.local") && !s.endsWith("puffin.local") && !s.endsWith("jagex.dnsalias.com")) {
				vz = true;
				return;
			}
		}
		super.wf = 43594;
		super.ir = -11;
		f.rf = 1000;
		f.qf = false;
		f.tf = k.sp;
		yn();
		pab = 2000;
		oab = pab + 100;
		tcb = oab + 50;
		rab = tcb + 300;
		eab = getGraphics();
		hj(50);
		gab = new g(lab, mab + 12, 2600, this);
		gab.pg = this;
		gab.ch(0, 0, lab, mab + 12);
		o.du = false;
		o.eu = oab;
		deb = new o(gab, 5);
		int l = ((i) (gab)).ni - 199;
		byte byte0 = 36;
		eeb = deb.ml(l, byte0 + 24, 196, 90, 1, 500, true);
		heb = new o(gab, 5);
		ieb = heb.ml(l, byte0 + 40, 196, 126, 1, 500, true);
		leb = new o(gab, 5);
		meb = leb.ml(l, byte0 + 24, 196, 182, 1, 500, true);
		ao();
		qp(true);
		fab = new a(gab, 15000, 15000, 1000);
		fab.vb(lab / 2, mab / 2, lab / 2, mab / 2, lab, nab);
		fab.g = 2400;
		fab.h = 2400;
		fab.i = 1;
		fab.j = 2300;
		fab.m(-50, -10, -50);
		abb = new d(fab, gab);
		abb.ie = pab;
		ho();
		uo();
		zn();
		si(100, "Starting game...");
		un();
		qo();
		ro();
		ip();
		pp();
		vn();
		xi();
		ln();
	}

	public void yn() {
		if (/*vi()*/true) {
			byte abyte0[] = null;
			try {
				abyte0 = wi("config" + k.tp + ".jag", "Configuration", 10);
			}
			catch (IOException ioexception) {
				System.out.println("Load error:" + ioexception);
			}
			j.xh(abyte0);
			return;
		} else {
			kj(10, "Loading configuration");
			j.ci();
			return;
		}
	}

	public void ao() {
		if (/*vi()*/true) {
			byte abyte0[] = null;
			try {
				abyte0 = wi("media" + k.vp + ".jag", "2d graphics", 20);
			}
			catch (IOException ioexception) {
				System.out.println("Load error:" + ioexception);
			}
			gab.pg(abyte0, c.wc("inv1.tga", abyte0), pab, true, false);
			gab.eh(abyte0, c.wc("inv2.tga", abyte0), pab + 1, true, 1, 6, false);
			gab.pg(abyte0, c.wc("bubble.tga", abyte0), pab + 9, true, false);
			gab.pg(abyte0, c.wc("runescape.tga", abyte0), pab + 10, true, false);
			gab.mg(abyte0, c.wc("splat.tga", abyte0), pab + 11, true, 3, false);
			gab.eh(abyte0, c.wc("icon.tga", abyte0), pab + 14, true, 4, 2, false);
			gab.pg(abyte0, c.wc("hbar.tga", abyte0), pab + 22, false, false);
			gab.pg(abyte0, c.wc("hbar2.tga", abyte0), pab + 23, true, false);
			gab.pg(abyte0, c.wc("compass.tga", abyte0), pab + 24, true, false);
			gab.mg(abyte0, c.wc("scrollbar.tga", abyte0), oab, true, 2, false);
			gab.mg(abyte0, c.wc("corners.tga", abyte0), oab + 2, true, 4, false);
			gab.mg(abyte0, c.wc("arrows.tga", abyte0), oab + 6, true, 2, false);
			hab = ij(c.lc("hbar.tga", 0, abyte0));
			int l = j.uk;
			for (int j1 = 1; l > 0; j1++) {
				int l1 = l;
				l -= 30;
				if (l1 > 30)
					l1 = 30;
				gab.eh(abyte0, c.wc("objects" + j1 + ".tga", abyte0), tcb + (j1 - 1) * 30, true, 10, (l1 + 9) / 10, false);
			}

			gab.mg(abyte0, c.wc("projectile.tga", abyte0), rab, true, j.ho, false);
			return;
		}
		byte abyte1[] = new byte[0x186a0];
		si(20, "Loading 2d graphics");
		try {
			c.xc("../gamedata/media/inv1.tga", abyte1, 0x186a0);
			gab.pg(abyte1, 0, pab, true, false);
			c.xc("../gamedata/media/inv2.tga", abyte1, 0x186a0);
			gab.eh(abyte1, 0, pab + 1, true, 1, 6, false);
			c.xc("../gamedata/media/bubble.tga", abyte1, 0x186a0);
			gab.pg(abyte1, 0, pab + 9, true, false);
			c.xc("../gamedata/media/runescape.tga", abyte1, 0x186a0);
			gab.pg(abyte1, 0, pab + 10, true, false);
			c.xc("../gamedata/media/splat.tga", abyte1, 0x186a0);
			gab.mg(abyte1, 0, pab + 11, true, 3, false);
			c.xc("../gamedata/media/icon.tga", abyte1, 0x186a0);
			gab.eh(abyte1, 0, pab + 14, true, 4, 2, false);
			c.xc("../gamedata/media/hbar.tga", abyte1, 0x186a0);
			gab.pg(abyte1, 0, pab + 22, false, false);
			hab = ij(abyte1);
			c.xc("../gamedata/media/hbar2.tga", abyte1, 0x186a0);
			gab.pg(abyte1, 0, pab + 23, true, false);
			c.xc("../gamedata/media/compass.tga", abyte1, 0x186a0);
			gab.pg(abyte1, 0, pab + 24, true, false);
			c.xc("../gamedata/media/scrollbar.tga", abyte1, 0x186a0);
			gab.mg(abyte1, 0, oab, true, 2, false);
			c.xc("../gamedata/media/corners.tga", abyte1, 0x186a0);
			gab.mg(abyte1, 0, oab + 2, true, 4, false);
			c.xc("../gamedata/media/arrows.tga", abyte1, 0x186a0);
			gab.mg(abyte1, 0, oab + 6, true, 2, false);
			int i1 = j.uk;
			for (int k1 = 1; i1 > 0; k1++) {
				int i2 = i1;
				i1 -= 30;
				if (i2 > 30)
					i2 = 30;
				c.xc("../gamedata/media/objects" + k1 + ".tga", abyte1, 0x186a0);
				gab.eh(abyte1, 0, tcb + (k1 - 1) * 30, true, 10, (i2 + 9) / 10, false);
			}

			c.xc("../gamedata/media/projectile.tga", abyte1, 0x186a0);
			gab.mg(abyte1, 0, rab, true, j.ho, false);
			return;
		}
		catch (IOException _ex) {
			System.out.println("ERROR: in raw media loader");
		}
	}

	public void qp(boolean flag) {
		rlb = 0;
		slb = rlb;
		byte abyte0[] = null;
		if (/*vi()*/true && flag) {
			String s = "entity" + k.yp + ".jag";
			try {
				abyte0 = wi(s, "people and monsters", 30);
			}
			catch (IOException ioexception) {
				System.out.println("Load error:" + ioexception);
			}
		} else {
			si(30, "Loading people and monsters");
		}
		int l = 0;
label0:
		for (int i1 = 0; i1 < j.sm; i1++) {
			String s1 = j.um[i1];
			for (int j1 = 0; j1 < i1; j1++) {
				if (!j.um[j1].equalsIgnoreCase(s1))
					continue;
				j.zm[i1] = j.zm[j1];
				continue label0;
			}

			if (flag)
				if (/*vi()*/true) {
					boolean flag1 = true;
					if (j.wm[i1] != 0)
						flag1 = false;
					gab.mg(c.lc(s1 + ".tga", 0, abyte0), 0, slb, true, 15, flag1);
					l += 15;
					if (j.xm[i1] == 1) {
						gab.mg(c.lc(s1 + "a.tga", 0, abyte0), 0, slb + 15, true, 3, true);
						l += 3;
					}
					if (j.ym[i1] == 1) {
						gab.mg(c.lc(s1 + "f.tga", 0, abyte0), 0, slb + 18, true, 9, true);
						l += 9;
					}
				} else {
					try {
						byte abyte1[] = new byte[0x493e0];
						c.xc("../gamedata/entity/" + s1 + ".tga", abyte1, 0x493e0);
						l += 15;
						boolean flag2 = true;
						if (j.wm[i1] != 0)
							flag2 = false;
						gab.mg(abyte1, 0, slb, true, 15, flag2);
						if (j.xm[i1] == 1) {
							c.xc("../gamedata/entity/" + s1 + "a.tga", abyte1, 0x493e0);
							l += 3;
							gab.mg(abyte1, 0, slb + 15, true, 3, true);
						}
						if (j.ym[i1] == 1) {
							c.xc("../gamedata/entity/" + s1 + "f.tga", abyte1, 0x493e0);
							l += 9;
							gab.mg(abyte1, 0, slb + 18, true, 9, true);
						}
					}
					catch (IOException _ex) {
						System.out.println("ERROR: in raw entity loader - no:" + i1 + " " + s1);
					}
				}
			j.zm[i1] = slb;
			slb += 27;
		}

		System.out.println("Loaded: " + l + " frames of animation");
	}

	public void ho() {
		if (/*vi()*/true) {
			fab.a("textures" + k.xp + ".jag", 7, 11, 50, this);
			return;
		} else {
			si(50, "Loading textures");
			fab.eb("../gamedata/textures");
			return;
		}
	}

	public void uo() {
		j.sh("torcha2");
		j.sh("torcha3");
		j.sh("torcha4");
		j.sh("skulltorcha2");
		j.sh("skulltorcha3");
		j.sh("skulltorcha4");
		j.sh("firea2");
		j.sh("firea3");
		if (/*vi()*/true) {
			byte abyte0[] = null;
			try {
				abyte0 = wi("models" + k.wp + ".jag", "3d models", 70);
			}
			catch (IOException ioexception) {
				System.out.println("Load error:" + ioexception);
			}
			for (int i1 = 0; i1 < j.pp; i1++) {
				int j1 = c.wc(j.qp[i1] + ".ob2", abyte0);
				if (j1 != 0)
					fdb[i1] = new p(abyte0, j1);
				else
					fdb[i1] = new p(1, 1);
			}

			return;
		}
		si(70, "Loading 3d models");
		for (int l = 0; l < j.pp; l++)
			fdb[l] = new p("../gamedata/models/" + j.qp[l] + ".ob2");

	}

	public void zn() {
		if (/*vi()*/true) {
			abb.qe = null;
			try {
				abb.qe = wi("maps" + k.up + ".jag", "map", 90);
				return;
			}
			catch (IOException ioexception) {
				System.out.println("Load error:" + ioexception);
			}
			return;
		} else {
			abb.ee = false;
			return;
		}
	}

	public void un() {
		qfb = new o(gab, 10);
		rfb = qfb.tj(5, 269, 502, 56, 1, 20, true);
		sfb = qfb.bl(7, 324, 498, 14, 1, 80, false, true);
		tfb = qfb.tj(5, 269, 502, 56, 1, 20, true);
		ufb = qfb.tj(5, 269, 502, 56, 1, 20, true);
		qfb.rk(sfb);
	}

	public void ej() {
		if (vz)
			return;
		if (wz)
			return;
		try {
			yz++;
			if (kab == 0) {
				super.jr = 0;
				ep();
			}
			if (kab == 1) {
				khb++;
				super.jr++;
				so();
			}
			if (tz > 0)
				tz--;
			if (sz && tz == 0) {
				sz = false;
				super.zf.yb();
				tz = 24;
			}
			super.gs = 0;
			super.is = 0;
			if (mfb > 0)
				mfb--;
			if (nfb > 0)
				nfb--;
			if (ofb > 0)
				ofb--;
			if (pfb > 0) {
				pfb--;
				return;
			}
		}
		catch (OutOfMemoryError _ex) {
			ap();
			wz = true;
		}
	}

	public void nj() {
		if (vz) {
			Graphics g1 = getGraphics();
			g1.setColor(Color.black);
			g1.fillRect(0, 0, 512, 356);
			g1.setFont(new Font("Helvetica", 1, 20));
			g1.setColor(Color.white);
			g1.drawString("Error - unable to load game!", 50, 50);
			g1.drawString("To play RuneScape make sure you play from", 50, 100);
			g1.drawString("http://www.runescape.com", 50, 150);
			hj(1);
			return;
		}
		if (wz) {
			Graphics g2 = getGraphics();
			g2.setColor(Color.black);
			g2.fillRect(0, 0, 512, 356);
			g2.setFont(new Font("Helvetica", 1, 20));
			g2.setColor(Color.white);
			g2.drawString("Error - out of memory!", 50, 50);
			g2.drawString("Close ALL unnecessary programs", 50, 100);
			g2.drawString("and windows before loading the game", 50, 150);
			g2.drawString("RuneScape needs about 48meg of spare RAM", 50, 200);
			hj(1);
			return;
		}
		/* XXX */
		/*try {
			if (kab == 0) {
				gab.qj = false;
				kp();
			}
			if (kab == 1) {
				gab.qj = true;
				nn();
				return;
			}
		}
		catch (OutOfMemoryError _ex) {
			ap();
			wz = true;
		}*/
		rdb = 0;
		sdb[rdb++] = 81;
		sdb[rdb++] = 112;
		sdb[rdb++] = 400;
		sdb[rdb++] = 402;
		sdb[rdb++] = 404;
		sdb[rdb++] = 93;
		sdb[rdb++] = 316;
		sdb[rdb++] = 221;
		sdb[rdb++] = 210;
		sdb[rdb++] = 188;
		tdb[rdb] = 1000;
		sdb[rdb++] = 11;
		sdb[rdb++] = 59;
		tdb[rdb] = 1000;
		sdb[rdb++] = 190;
		sdb[rdb++] = 156;
		sdb[rdb++] = 154;
		sdb[rdb++] = 155;
		sdb[rdb++] = 155;
		sdb[rdb++] = 155;

		if (super.as) {
			view_x = (int)(Math.random() * 200D);
			view_y = 400 + (int)(Math.random() * 300D);
			vbb = 128;
		}
		if (super.wr) {
			++view_x;
			vbb = 128;
		}
		if (super.xr) {
			--view_x;
			vbb = 128;
		}
		if (super.yr) {
			--view_y;
			vbb = 128;
		}
		if (super.zr) {
			++view_y;
			vbb = 128;
		}
		if (super.ur) {
			vbb = vbb + 2 & 0xff;
		}
		if (super.vr) {
			vbb = vbb - 2 & 0xff;
		}
		if (super.bs) {
			view_y = (view_y + 944) % (944 * 4);
		}
		if (super.as || super.wr || super.xr || super.yr || super.zr ||
		    super.bs) {
			bbb = 2304;
			cbb = 1776;
			dbb = 944;
			hbb = view_y / 944;
			cbb -= hbb * dbb;
			abb.fe = true;
			if (bo(view_x, view_y)) {
				abb.yd(fdb);
			}
			for (int l = 0; l < 64; l++) {
				fab.bb(abb.jf[ebb][l]);
				if (ebb == 0) {
					fab.bb(abb._fldif[1][l]);
					fab.bb(abb.jf[1][l]);
					fab.bb(abb._fldif[2][l]);
					fab.bb(abb.jf[2][l]);
				}
				qbb = true;
				int lx = view_x - fbb;
				int ly = view_y - gbb;
				if (ebb == 0 && (abb.ef[lx][ly] & 0x80) == 0) {
					fab.hb(abb.jf[ebb][l]);
					if (ebb == 0) {
						fab.hb(abb._fldif[1][l]);
						fab.hb(abb.jf[1][l]);
						fab.hb(abb._fldif[2][l]);
						fab.hb(abb.jf[2][l]);
					}
					qbb = false;
				}
			}
			System.out.printf("%d %d\n", view_x, view_y);
		}
		pbb = 750;
		rbb = ((view_x - fbb) * 128) + 64;
		sbb = ((view_y - gbb) * 128) + 64;
		fcb.my = rbb;
		fcb.ny = sbb;
		gab.qj = true;
		gab.zf();
		fab.g(rbb, -abb.vd(rbb, sbb), sbb, 912, vbb * 4, 0, pbb * 2);
		fab.i();
		gab.gg(((i) (gab)).ni - 3 - 197, 3, pab, 128);
		_mthdo();
		gab.qj = false;
		kn();
		gab.dg(eab, 0, 11);
		if (super.gs == 1)
			aab = 1;
		else if (super.gs == 2)
			aab = 2;
	}

	private int view_x;
	private int view_y;

	public void qj() {
		ve();
		ap();
	}

	public void ap() {
		try {
			if (gab != null) {
				gab.wg();
				gab.ti = null;
				gab = null;
			}
			if (fab != null) {
				fab.x();
				fab = null;
			}
			fdb = null;
			adb = null;
			jdb = null;
			ccb = null;
			dcb = null;
			ncb = null;
			ocb = null;
			fcb = null;
			if (abb != null) {
				abb.hf = null;
				abb._fldif = null;
				abb.jf = null;
				abb.kf = null;
				abb = null;
			}
			System.gc();
			return;
		}
		catch (Exception _ex) {
			return;
		}
	}

	public void xi() {
		eab.drawImage(hab, 0, 0, this);
	}

	public void gj(int l) {
		if (kab == 0) {
			if (nhb == 0)
				ohb.bk(l);
			if (nhb == 1)
				rhb.bk(l);
			if (nhb == 2)
				aib.bk(l);
		}
		if (kab == 1) {
			if (djb == 1) {
				ejb.bk(l);
				return;
			}
			if (djb == 2) {
				fjb.bk(l);
				return;
			}
			if (djb == 3) {
				gjb.bk(l);
				return;
			}
			if (djb == 4) {
				hjb.bk(l);
				return;
			}
			if (ulb) {
				nib.bk(l);
				return;
			}
			if (rkb) {
				if (vkb == -1)
					skb.bk(l);
				return;
			}
			if (ghb == 0 && fhb == 0)
				qfb.bk(l);
			if (ghb == 3 || ghb == 4 || ghb == 5)
				ghb = 0;
		}
	}

	public void on() {
		super.zf.kc();
		sz = true;
		ze();
	}

	public void vn() {
		kab = 0;
		nhb = 0;
		lib = "";
		mib = "";
		jib = "Please enter a username:";
		kib = "*" + lib + "*";
		zbb = 0;
		lcb = 0;
	}

	public void cp() {
		super.ms = "";
		super.ns = "";
	}

	public void trylogout() {
		if (kab == 0)
			return;
		if (jhb > 450) {
			sp("@cya@You can't logout during combat!", 3);
			return;
		}
		if (jhb > 0) {
			sp("@cya@You can't logout for 10 seconds after combat", 3);
			return;
		} else {
			super.zf.gc(6);
			super.zf.jc();
			ihb = 1000;
			return;
		}
	}

	public void pp() {
		skb = new o(gab, 100);
		int l = 8;
		tkb = skb.pk(256, l, "@yel@Please provide 5 security questions in case you lose your password", 1, true);
		l += 22;
		skb.pk(256, l, "If you ever lose your password, you will need these to prove you own your account.", 1, true);
		l += 13;
		skb.pk(256, l, "Your answers are encrypted and are ONLY used for password recovery purposes.", 1, true);
		l += 22;
		skb.pk(256, l, "@ora@IMPORTANT:@whi@ To recover your password you must give the EXACT same answers you", 1, true);
		l += 13;
		skb.pk(256, l, "give here. If you think you might forget an answer, or someone else could guess the", 1, true);
		l += 13;
		skb.pk(256, l, "answer, then press the 'different question' button to get a better question.", 1, true);
		l += 35;
		for (int i1 = 0; i1 < 5; i1++) {
			skb.vj(170, l, 310, 30);
			blb[i1] = "~:" + alb[i1];
			wkb[i1] = skb.pk(170, l - 7, (i1 + 1) + ": " + jmb[alb[i1]], 1, true);
			xkb[i1] = skb.sj(170, l + 7, 310, 30, 1, 80, false, true);
			skb.vj(370, l, 80, 30);
			skb.pk(370, l - 7, "Different", 1, true);
			skb.pk(370, l + 7, "Question", 1, true);
			ykb[i1] = skb.vk(370, l, 80, 30);
			skb.vj(455, l, 80, 30);
			skb.pk(455, l - 7, "Enter own", 1, true);
			skb.pk(455, l + 7, "Question", 1, true);
			zkb[i1] = skb.vk(455, l, 80, 30);
			l += 35;
		}

		skb.rk(xkb[0]);
		l += 10;
		skb.vj(256, l, 250, 30);
		skb.pk(256, l, "Click here when finished", 4, true);
		ukb = skb.vk(256, l, 250, 30);
	}

	public void mp() {
		if (vkb != -1) {
			if (super.ns.length() > 0) {
				blb[vkb] = super.ns;
				skb.zj(wkb[vkb], (vkb + 1) + ": " + blb[vkb]);
				skb.zj(xkb[vkb], "");
				vkb = -1;
			}
			return;
		}
		skb.ik(super.ds, super.es, super.gs, super.fs);
		for (int l = 0; l < 5; l++)
			if (skb.kk(ykb[l])) {
				for (boolean flag = false; !flag;) {
					alb[l] = (alb[l] + 1) % jmb.length;
					flag = true;
					for (int j1 = 0; j1 < 5; j1++)
						if (j1 != l && alb[j1] == alb[l])
							flag = false;

				}

				blb[l] = "~:" + alb[l];
				skb.zj(wkb[l], (l + 1) + ": " + jmb[alb[l]]);
				skb.zj(xkb[l], "");
			}

		for (int i1 = 0; i1 < 5; i1++)
			if (skb.kk(zkb[i1])) {
				vkb = i1;
				super.ms = "";
				super.ns = "";
			}

		if (skb.kk(ukb)) {
			for (int k1 = 0; k1 < 5; k1++) {
				String s = skb.jl(xkb[k1]);
				if (s == null || s.length() < 3) {
					skb.zj(tkb, "@yel@Please provide a longer answer to question: " + (k1 + 1));
					return;
				}
			}

			for (int l1 = 0; l1 < 5; l1++) {
				String s1 = skb.jl(xkb[l1]);
				for (int j2 = 0; j2 < l1; j2++) {
					String s3 = skb.jl(xkb[j2]);
					if (s1.equalsIgnoreCase(s3)) {
						skb.zj(tkb, "@yel@Each question must have a different answer");
						return;
					}
				}

			}

			super.zf.gc(208);
			for (int i2 = 0; i2 < 5; i2++) {
				String s2 = blb[i2];
				if (s2 == null || s2.length() == 0)
					s2 = String.valueOf(i2 + 1);
				if (s2.length() > 50)
					s2 = s2.substring(0, 50);
				super.zf.fc(s2.length());
				super.zf.zb(s2);
				super.zf.wb(c.mc(skb.jl(xkb[i2])));
			}

			super.zf.jc();
			for (int k2 = 0; k2 < 5; k2++) {
				alb[k2] = k2;
				blb[k2] = "~:" + alb[k2];
				skb.zj(xkb[k2], "");
				skb.zj(wkb[k2], (k2 + 1) + ": " + jmb[alb[k2]]);
			}

			gab.zf();
			rkb = false;
		}
	}

	public void rp() {
		gab.mj = false;
		gab.zf();
		skb.hk();
		if (vkb != -1) {
			int l = 150;
			gab.rg(26, l, 460, 60, 0);
			gab.ag(26, l, 460, 60, 0xffffff);
			l += 22;
			gab.tg("Please enter your question", 256, l, 4, 0xffffff);
			l += 25;
			gab.tg(super.ms + "*", 256, l, 4, 0xffffff);
		}
		gab.qf(0, mab, pab + 22);
		gab.dg(eab, 0, 11);
	}

	public void ip() {
		ejb = new o(gab, 100);
		ejb.pk(256, 10, "Carry 5 extra objects at once in RuneScape!", 4, true);
		int l = 45;
		int i1 = 15;
		ejb.yj(256, (l + i1 * 7) - 4, 400, (int)((double)i1 * 16.5D - 9D));
		ejb.pk(256, l, "Please consider taking the time to answer a few questions and", 1, true);
		l += i1;
		ejb.pk(256, l, "sign up for some great email offers with Yoptin. It's free!", 1, true);
		l += i1;
		l += 12;
		ejb.pk(256, l, "You will be sent the information YOU want about products,", 1, true);
		l += i1;
		ejb.pk(256, l, "services, and special-offers that fit your interests.", 1, true);
		l += i1;
		ejb.pk(256, l, "Should you ever decide that you don't want", 1, true);
		l += i1;
		ejb.pk(256, l, "to receive any additional Yoptin email, you can simply optout.", 1, true);
		l += i1;
		l += 12;
		ejb.pk(256, l, "@yel@Signing up will help us to continue to run the game for", 1, true);
		l += i1;
		ejb.pk(256, l, "@yel@free. So as a special thank-you, as long as you are a yoptin", 1, true);
		l += i1;
		ejb.pk(256, l, "@yel@member your player will be able to carry 5 extra items at once!", 1, true);
		l += i1;
		l += 12;
		ejb.pk(256, l, "After you have signed up we will email you a special personalised", 1, true);
		l += i1;
		ejb.pk(256, l, "code which you can use to active this bonus, so be sure to enter all", 1, true);
		l += i1;
		ejb.pk(256, l, "your details correctly.", 1, true);
		l += i1;
		l += 30;
		ejb.vj(160, l, 150, 35);
		ejb.pk(160, l, "Yes, sounds great!", 1, true);
		xjb = ejb.vk(160, l, 150, 35);
		ejb.vj(352, l, 150, 35);
		ejb.pk(352, l, "No thank-you", 1, true);
		yjb = ejb.vk(352, l, 150, 35);
		l += 30;
		ejb.pk(256, l, "View Yoptin Privacy Statement", 1, true);
		zjb = ejb.vk(256, l, 250, 20);
		fjb = new o(gab, 100);
		jjb = fjb.pk(256, 5, "Please fill in the details below", 4, true);
		char c1 = 'U';
		char c2 = '\233';
		l = 39;
		String as[] = {
			"Mr", "Ms", "Miss", "Mrs"
		};
		fjb.yj(c1, l, c2, 35);
		kjb = fjb.wj(c1, l, as, 1, true);
		l += 39;
		fjb.yj(c1, l, c2, 35);
		fjb.pk(c1, l - 9, "First Name", 1, true);
		ljb = fjb.sj(c1, l + 9, c2, 20, 1, 30, false, true);
		fjb.rk(ljb);
		l += 39;
		c1 = '\367';
		c2 = '\233';
		l = 39;
		fjb.yj(c1, l, c2, 35);
		fjb.pk(c1, l - 9, "Surname", 1, true);
		mjb = fjb.sj(c1, l + 9, c2, 20, 1, 30, false, true);
		l += 39;
		fjb.yj(c1, l, c2, 35);
		fjb.pk(c1, l - 9, "Postcode", 1, true);
		njb = fjb.sj(c1, l + 9, c2, 20, 1, 20, false, true);
		l += 39;
		c1 = '\245';
		c2 = '\u013B';
		String as1[] = {
			"None", "1", "2", "3", "4", "5", "6 or more"
		};
		fjb.yj(c1, l, c2, 35);
		fjb.pk(c1, l - 9, "How many children live in your household?", 1, true);
		ojb = fjb.wj(c1, l + 9, as1, 1, true);
		l += 39;
		String as2[] = {
			"0", "1-50", "51-100", "101-250", "51-500", "500+"
		};
		fjb.yj(c1, l, c2, 35);
		fjb.pk(c1, l - 9, "What is the size of your company?", 1, true);
		pjb = fjb.wj(c1, l + 9, as2, 1, true);
		l += 39;
		fjb.yj(c1, l, c2, 35);
		fkb = 15;
		fjb.fk(c1 - 95 - 25, l + 6, o.eu + 7);
		ikb = fjb.hl(c1 - 95 - 25, l + 6, 20, 20);
		okb = fjb.pk(c1 - 95, l + 6, "15th", 1, true);
		fjb.fk((c1 - 95) + 25, l + 6, o.eu + 6);
		lkb = fjb.hl((c1 - 95) + 25, l + 6, 20, 20);
		gkb = 6;
		fjb.fk(c1 - 40, l + 6, o.eu + 7);
		jkb = fjb.hl(c1 - 40, l + 6, 20, 20);
		pkb = fjb.pk(c1, l + 6, "June", 1, true);
		fjb.fk(c1 + 40, l + 6, o.eu + 6);
		mkb = fjb.hl(c1 + 40, l + 6, 20, 20);
		hkb = 1980;
		fjb.fk((c1 + 95) - 30, l + 6, o.eu + 7);
		kkb = fjb.hl((c1 + 95) - 30, l + 6, 20, 20);
		qkb = fjb.pk(c1 + 95, l + 6, "1980", 1, true);
		fjb.fk(c1 + 95 + 30, l + 6, o.eu + 6);
		nkb = fjb.hl(c1 + 95 + 30, l + 6, 20, 20);
		fjb.pk(c1, l - 9, "Date of birth", 1, true);
		l += 39;
		String as3[] = {
			"Would consider", "Have done already", "No"
		};
		fjb.yj(c1, l, c2, 35);
		fjb.pk(c1, l - 9, "Would you consider buying over the internet?", 1, true);
		qjb = fjb.wj(c1, l + 9, as3, 1, true);
		l += 39;
		fjb.yj(c1, l, c2, 35);
		fjb.pk(c1, l - 9, "Your email address", 1, true);
		rjb = fjb.sj(c1, l + 9, c2, 20, 0, 80, false, true);
		l += 39;
		c1 = 'U';
		c2 = '\233';
		String as4[] = {
			"Text", "Html", "AOL"
		};
		fjb.yj(c1, l, c2, 35);
		fjb.pk(c1, l - 9, "You receive email in", 1, true);
		sjb = fjb.wj(c1, l + 9, as4, 1, true);
		c1 = '\367';
		c2 = '\233';
		fjb.vj(c1, l, c2, 35);
		fjb.pk(c1, l, "Register me", 4, false);
		tjb = fjb.vk(c1, l, c2, 35);
		c1 = '\u01A4';
		l = 27;
		c2 = '\257';
		fjb.pk(c1, l - 11, "Country", 1, true);
		l += 40;
		String as5[] = {
			"Albania", "Andorra", "Armenia", "Austria", "Azerbaijan", "Belgium", "Bosnia and Herzogvina", "Belarus", "Bulgaria", "Canada", 
			"Croatia", "Cyprus", "Czech Republic", "Denmark", "Finland", "France", "Georgia", "Germany", "Gibraltar", "Greece", 
			"Hungary", "Iceland", "Ireland", "Italy", "Latvia", "LIechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Malta", 
			"Moldova", "Monaco", "Netherlands", "Norway", "Portugal", "Romania", "Russia", "Slovakia", "Slovenia", "Spain", 
			"Sweden", "Switzerland", "Turkey", "Ukraine", "United Kingdom", "United States", "Vatican", "Yugoslavia", "Other Country"
		};
		fjb.yj(c1, l, c2, 90);
		ujb = fjb.ll(c1 + 3, l, c2 - 6, 90, 0, 50, true);
		for (int j1 = 0; j1 < as5.length; j1++)
			fjb.kl(ujb, j1, as5[j1]);

		fjb.qk(ujb, as5.length - 5);
		fjb.ws[ujb] = as5.length - 7;
		l += 70;
		fjb.pk(c1, l - 11, "Your Profession", 1, true);
		l += 40;
		String as6[] = {
			"Craftsman/Tradesman", "Farmer", "Housewife", "Manual/Factory worker", "Middle Manager/Technician", "Office/Clerical", "Profession/Senior Manager", "Self-employed/Business owner", "Shop worker", "Student", 
			"Other"
		};
		fjb.yj(c1, l, c2, 90);
		vjb = fjb.ll(c1 + 3, l, c2 - 6, 90, 0, 50, true);
		for (int k1 = 0; k1 < as6.length; k1++)
			fjb.kl(vjb, k1, as6[k1]);

		fjb.qk(vjb, 0);
		l += 70;
		fjb.pk(c1, l - 11, "Industry sector", 1, true);
		l += 40;
		String as7[] = {
			"Agriculture", "Bank/Finance", "Computers/Software/Internet", "Construction", "Corporate Services/Consulting", "Health", "Legal/Insurance", "Manufacturing/Industries", "Marketing/Advertising", "News/Media", 
			"Supply/Trade", "Telecommunications/Networks", "Travel/Transportation", "Other"
		};
		fjb.yj(c1, l, c2, 90);
		wjb = fjb.ll(c1 + 3, l, c2 - 6, 90, 0, 50, true);
		for (int l1 = 0; l1 < as7.length; l1++)
			fjb.kl(wjb, l1, as7[l1]);

		fjb.qk(wjb, 0);
		l += 70;
		String as8[] = {
			"Home computing", "Internet", "Telecommunication, IT", "CD-Rom, Games", "Music, CD, Video, DVD", "Books, Newspapers", "Sport", "Beauty, Health, Fitness", "Food and Wine", "Gifts, Flowers", 
			"Pets", "Fashion, Clothing", "DIY, Interior Design, Gardening", "Cars, Motorbikes", "Leisure activities", "Travel, Holidays, Short Breaks", "Charity, Voluntary work", "Finances, Insurance", "Career, Jobs", "Lottery, Gambling, Betting"
		};
		gjb = new o(gab, 100);
		akb = gjb.pk(256, 10, "@yel@Please indicate your interests", 4, true);
		gjb.pk(256, 25, "Your bonus code will then be emailed to you", 4, true);
		c1 = ' ';
		l = 60;
		for (int i2 = 0; i2 < 20; i2++) {
			ckb[i2] = gjb.uj(c1, l - 9, 16);
			gjb.sk(c1 + 20, l, as8[i2], 3, true);
			l += 23;
			if (i2 == 9) {
				c1 = '\u0100';
				l = 60;
			}
		}

		gjb.vj(256, 310, 100, 32);
		gjb.pk(256, 310, "Ok", 4, true);
		bkb = gjb.vk(256, 310, 100, 32);
		hjb = new o(gab, 50);
		int j2 = 20;
		hjb.pk(250, j2, "Yoptin Privacy Statement", 5, true);
		j2 += 30;
		hjb.cl(40, j2 - 10, 420, 220);
		dkb = hjb.tj(50, j2, 400, 200, 1, 1000, true);
		j2 += 240;
		hjb.vj(256, j2, 170, 40);
		hjb.pk(256, j2, "Ok", 1, false);
		ekb = hjb.vk(256, j2, 170, 40);
		o o1 = hjb;
		int k2 = dkb;
		o1.ok(k2, "@yel@Privacy statement", false);
		o1.ok(k2, "Yoptin is a service offered by Consodata UK Ltd., a company that", false);
		o1.ok(k2, "specialises in the collection of households' and Internet users", false);
		o1.ok(k2, "consumption patterns. At Yoptin, we are committed to maintaining", false);
		o1.ok(k2, "your privacy. If we make changes to this policy, we will", false);
		o1.ok(k2, "immediately notify you by updating this statement on this web site.", false);
		o1.ok(k2, "", false);
		o1.ok(k2, "@yel@What will the data be used for?", false);
		o1.ok(k2, "Yoptin collects data about you, your interests and the subjects you", false);
		o1.ok(k2, "would like to receive email communications about. We use the", false);
		o1.ok(k2, "information you give us to make sure that what is sent to you is", false);
		o1.ok(k2, "relevant and as useful as possible. We may also merge the data we", false);
		o1.ok(k2, "gain from you with other data sources for profiling and marketing", false);
		o1.ok(k2, "purposes. Yoptin will manage the data under the guidelines of the", false);
		o1.ok(k2, "Data Protection Act 1988 and all information is processed in", false);
		o1.ok(k2, "accordance with the principles laid down by the Act.", false);
		o1.ok(k2, "Consodata UK Ltd will act as data controller and may pass the", false);
		o1.ok(k2, "information you provide to other companies, who will use the data", false);
		o1.ok(k2, "for their own market research and analysis purposes. These", false);
		o1.ok(k2, "carefully chosen companies may send you, by mail or other media,", false);
		o1.ok(k2, "details of their products and services where you have indicated", false);
		o1.ok(k2, "that you are happy to receive such communications.", false);
		o1.ok(k2, "", false);
		o1.ok(k2, "We comply with the standards, procedures and requirements laid", false);
		o1.ok(k2, "down by the UK Data Protection Act 1988, to ensure that the", false);
		o1.ok(k2, "personal information you give us is kept secure and processed", false);
		o1.ok(k2, "fairly and lawfully.", false);
		o1.ok(k2, "", false);
		o1.ok(k2, "@yel@Security", false);
		o1.ok(k2, "Your information is held on secure internal servers and is not", false);
		o1.ok(k2, "publicly available through this site.", false);
		o1.ok(k2, "", false);
		o1.ok(k2, "@yel@Your Feedback", false);
		o1.ok(k2, "By subscribing to this site, you consent to the information you", false);
		o1.ok(k2, "give us being processed for any of the purposes we have explained", false);
		o1.ok(k2, "above except where we have received your 'unsubscribe message'.", false);
		o1.ok(k2, "To unsubscribe simply send an email entitled UNSUBSCRIBE to us", false);
		o1.ok(k2, "at unsubscribe_uk@yoptin.com. If you have any queries or", false);
		o1.ok(k2, "complaints relating to our privacy policy, please email", false);
		o1.ok(k2, "membercare_uk@yoptin.com.", false);
		o1.ok(k2, "", false);
		o1.ok(k2, "Updated: 18 may 2001", false);
		o1.ok(k2, "To be reviewed: 18th October 2001", false);
	}

	public void co() {
		gab.mj = false;
		gab.zf();
		if (djb == 1)
			ejb.hk();
		if (djb == 2)
			fjb.hk();
		if (djb == 3)
			gjb.hk();
		if (djb == 4)
			hjb.hk();
		gab.qf(0, mab, pab + 22);
		gab.dg(eab, 0, 11);
	}

	public void wn() {
		if (djb == 1) {
			ejb.ik(super.ds, super.es, super.gs, super.fs);
			if (ejb.kk(xjb))
				djb = 2;
			if (ejb.kk(yjb)) {
				gab.zf();
				djb = 0;
				super.zf.gc(209);
				super.zf.jc();
			}
			if (ejb.kk(zjb)) {
				djb = 4;
				return;
			}
		} else
		if (djb == 2) {
			String as[] = {
				"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", 
				"November", "December"
			};
			fjb.ik(super.ds, super.es, super.gs, super.fs);
			if (fjb.kk(ikb) && fkb > 1) {
				fkb--;
				if (fkb == 1)
					fjb.zj(okb, "1st");
				else
				if (fkb == 2)
					fjb.zj(okb, "2nd");
				else
					fjb.zj(okb, fkb + "th");
			}
			if (fjb.kk(lkb) && fkb < 31) {
				fkb++;
				if (fkb == 1)
					fjb.zj(okb, "1st");
				else
				if (fkb == 2)
					fjb.zj(okb, "2nd");
				else
					fjb.zj(okb, fkb + "th");
			}
			if (fjb.kk(jkb) && gkb > 1) {
				gkb--;
				fjb.zj(pkb, as[gkb - 1]);
			}
			if (fjb.kk(mkb) && gkb < 12) {
				gkb++;
				fjb.zj(pkb, as[gkb - 1]);
			}
			if (fjb.kk(kkb) && hkb > 1900) {
				hkb--;
				fjb.zj(qkb, String.valueOf(hkb));
			}
			if (fjb.kk(nkb) && hkb < 2000) {
				hkb++;
				fjb.zj(qkb, String.valueOf(hkb));
			}
			if (fjb.kk(tjb))
				if (fjb.jl(ljb) != null && fjb.jl(ljb).length() == 0 || fjb.jl(mjb) != null && fjb.jl(mjb).length() == 0 || fjb.jl(njb) != null && fjb.jl(njb).length() == 0 || fjb.jl(rjb) != null && fjb.jl(rjb).length() == 0 || fjb.rj(kjb) == -1 || fjb.rj(ojb) == -1 || fjb.rj(pjb) == -1 || fjb.rj(qjb) == -1 || fjb.rj(sjb) == -1 || fjb.rj(ujb) == -1 || fjb.rj(vjb) == -1 || fjb.rj(wjb) == -1) {
					fjb.zj(jjb, "@yel@Please fill in ALL requested details");
					return;
				} else {
					djb = 3;
					return;
				}
		} else
		if (djb == 3) {
			gjb.ik(super.ds, super.es, super.gs, super.fs);
			if (gjb.kk(bkb)) {
				boolean flag = false;
				for (int l = 0; l < 20; l++)
					if (gjb.rj(ckb[l]) == 1)
						flag = true;

				if (!flag) {
					gjb.zj(akb, "@red@Use the tickboxes below to indicate your interests");
					return;
				}
				super.zf.gc(210);
				super.zf.zb(c.yc(fjb.jl(ljb), 30));
				super.zf.zb(c.yc(fjb.jl(mjb), 30));
				super.zf.zb(c.yc(fjb.jl(njb), 20));
				super.zf.zb(c.yc(fjb.jl(rjb), 80));
				super.zf.fc(fjb.rj(kjb));
				super.zf.fc(fjb.rj(ojb));
				super.zf.fc(fjb.rj(pjb));
				super.zf.fc(fjb.rj(qjb));
				super.zf.fc(fjb.rj(sjb));
				super.zf.fc(fjb.rj(ujb));
				super.zf.fc(fjb.rj(vjb));
				super.zf.fc(fjb.rj(wjb));
				super.zf.fc(fkb);
				super.zf.fc(gkb);
				super.zf.ec(hkb);
				for (int i1 = 0; i1 < 20; i1++)
					super.zf.fc(gjb.rj(ckb[i1]));

				super.zf.jc();
				djb = 0;
				return;
			}
		} else
		if (djb == 4) {
			hjb.ik(super.ds, super.es, super.gs, super.fs);
			if (hjb.kk(ekb))
				djb = 1;
		}
	}

	public void ro() {
		nib = new o(gab, 100);
		nib.pk(256, 10, "Design Your Character", 4, true);
		char c1 = '\214';
		int l = 34;
		nib.vj(c1, l, 200, 25);
		nib.pk(c1, l, "Appearance", 4, false);
		l += 15;
		nib.pk(c1 - 55, l + 110, "Front", 3, true);
		nib.pk(c1, l + 110, "Side", 3, true);
		nib.pk(c1 + 55, l + 110, "Back", 3, true);
		byte byte0 = 54;
		l += 145;
		nib.yj(c1 - byte0, l, 53, 41);
		nib.pk(c1 - byte0, l - 8, "Head", 1, true);
		nib.pk(c1 - byte0, l + 8, "Type", 1, true);
		nib.fk(c1 - byte0 - 40, l, o.eu + 7);
		oib = nib.vk(c1 - byte0 - 40, l, 20, 20);
		nib.fk((c1 - byte0) + 40, l, o.eu + 6);
		pib = nib.vk((c1 - byte0) + 40, l, 20, 20);
		nib.yj(c1 + byte0, l, 53, 41);
		nib.pk(c1 + byte0, l - 8, "Hair", 1, true);
		nib.pk(c1 + byte0, l + 8, "Color", 1, true);
		nib.fk((c1 + byte0) - 40, l, o.eu + 7);
		qib = nib.vk((c1 + byte0) - 40, l, 20, 20);
		nib.fk(c1 + byte0 + 40, l, o.eu + 6);
		rib = nib.vk(c1 + byte0 + 40, l, 20, 20);
		l += 50;
		nib.yj(c1 - byte0, l, 53, 41);
		nib.pk(c1 - byte0, l, "Gender", 1, true);
		nib.fk(c1 - byte0 - 40, l, o.eu + 7);
		sib = nib.vk(c1 - byte0 - 40, l, 20, 20);
		nib.fk((c1 - byte0) + 40, l, o.eu + 6);
		tib = nib.vk((c1 - byte0) + 40, l, 20, 20);
		nib.yj(c1 + byte0, l, 53, 41);
		nib.pk(c1 + byte0, l - 8, "Top", 1, true);
		nib.pk(c1 + byte0, l + 8, "Color", 1, true);
		nib.fk((c1 + byte0) - 40, l, o.eu + 7);
		uib = nib.vk((c1 + byte0) - 40, l, 20, 20);
		nib.fk(c1 + byte0 + 40, l, o.eu + 6);
		vib = nib.vk(c1 + byte0 + 40, l, 20, 20);
		l += 50;
		nib.yj(c1 - byte0, l, 53, 41);
		nib.pk(c1 - byte0, l - 8, "Skin", 1, true);
		nib.pk(c1 - byte0, l + 8, "Color", 1, true);
		nib.fk(c1 - byte0 - 40, l, o.eu + 7);
		wib = nib.vk(c1 - byte0 - 40, l, 20, 20);
		nib.fk((c1 - byte0) + 40, l, o.eu + 6);
		xib = nib.vk((c1 - byte0) + 40, l, 20, 20);
		nib.yj(c1 + byte0, l, 53, 41);
		nib.pk(c1 + byte0, l - 8, "Bottom", 1, true);
		nib.pk(c1 + byte0, l + 8, "Color", 1, true);
		nib.fk((c1 + byte0) - 40, l, o.eu + 7);
		yib = nib.vk((c1 + byte0) - 40, l, 20, 20);
		nib.fk(c1 + byte0 + 40, l, o.eu + 6);
		zib = nib.vk(c1 + byte0 + 40, l, 20, 20);
		c1 = '\u0174';
		l = 35;
		nib.vj(c1, l, 200, 25);
		nib.pk(c1, l, "Character Type", 4, false);
		l += 22;
		nib.pk(c1, l, "Each character type has different starting", 0, true);
		l += 13;
		nib.pk(c1, l, "bonuses. But the choice you make here", 0, true);
		l += 13;
		nib.pk(c1, l, "isn't permanent, and will change depending", 0, true);
		l += 13;
		nib.pk(c1, l, "on how you play the game.", 0, true);
		l += 73;
		nib.yj(c1, l, 215, 125);
		String as[] = {
			"Adventurer", "Warrior", "Wizard", "Ranger", "Miner"
		};
		bjb = nib.ck(c1, l + 2, as, 3, true);
		l += 75;
		nib.yj(c1, l + 21, 215, 60);
		nib.pk(c1, l, "Do you wish to be able to fight with other", 0, true);
		l += 13;
		nib.pk(c1, l, "players? Warning! If you choose 'yes' then", 0, true);
		l += 13;
		nib.pk(c1, l, "other players will be able to attack you too!", 0, true);
		l += 13;
		String as1[] = {
			"No thanks", "Yes I'll fight"
		};
		cjb = nib.wj(c1, l, as1, 1, true);
		l += 32;
		nib.vj(c1, l, 200, 30);
		nib.pk(c1, l, "Start Game", 4, false);
		ajb = nib.vk(c1, l, 200, 30);
	}

	public void vp() {
		gab.mj = false;
		gab.zf();
		nib.hk();
		char c1 = '\214';
		byte byte0 = 50;
		gab.hh(c1 - 32 - 55, byte0, 64, 102, j.zm[xlb], dmb[amb]);
		gab.lh(c1 - 32 - 55, byte0, 64, 102, j.zm[wlb], dmb[zlb], fmb[bmb], 0, false);
		gab.lh(c1 - 32 - 55, byte0, 64, 102, j.zm[vlb], emb[ylb], fmb[bmb], 0, false);
		gab.hh(c1 - 32, byte0, 64, 102, j.zm[xlb] + 6, dmb[amb]);
		gab.lh(c1 - 32, byte0, 64, 102, j.zm[wlb] + 6, dmb[zlb], fmb[bmb], 0, false);
		gab.lh(c1 - 32, byte0, 64, 102, j.zm[vlb] + 6, emb[ylb], fmb[bmb], 0, false);
		gab.hh((c1 - 32) + 55, byte0, 64, 102, j.zm[xlb] + 12, dmb[amb]);
		gab.lh((c1 - 32) + 55, byte0, 64, 102, j.zm[wlb] + 12, dmb[zlb], fmb[bmb], 0, false);
		gab.lh((c1 - 32) + 55, byte0, 64, 102, j.zm[vlb] + 12, emb[ylb], fmb[bmb], 0, false);
		gab.qf(0, mab, pab + 22);
		gab.dg(eab, 0, 11);
	}

	public void eo() {
		nib.ik(super.ds, super.es, super.gs, super.fs);
		if (nib.kk(oib))
			do
				vlb = ((vlb - 1) + j.sm) % j.sm;
			while ((j.wm[vlb] & 3) != 1 || (j.wm[vlb] & 4 * cmb) == 0);
		if (nib.kk(pib))
			do
				vlb = (vlb + 1) % j.sm;
			while ((j.wm[vlb] & 3) != 1 || (j.wm[vlb] & 4 * cmb) == 0);
		if (nib.kk(qib))
			ylb = ((ylb - 1) + emb.length) % emb.length;
		if (nib.kk(rib))
			ylb = (ylb + 1) % emb.length;
		if (nib.kk(sib) || nib.kk(tib)) {
			for (cmb = 3 - cmb; (j.wm[vlb] & 3) != 1 || (j.wm[vlb] & 4 * cmb) == 0; vlb = (vlb + 1) % j.sm);
			for (; (j.wm[wlb] & 3) != 2 || (j.wm[wlb] & 4 * cmb) == 0; wlb = (wlb + 1) % j.sm);
		}
		if (nib.kk(uib))
			zlb = ((zlb - 1) + dmb.length) % dmb.length;
		if (nib.kk(vib))
			zlb = (zlb + 1) % dmb.length;
		if (nib.kk(wib))
			bmb = ((bmb - 1) + fmb.length) % fmb.length;
		if (nib.kk(xib))
			bmb = (bmb + 1) % fmb.length;
		if (nib.kk(yib))
			amb = ((amb - 1) + dmb.length) % dmb.length;
		if (nib.kk(zib))
			amb = (amb + 1) % dmb.length;
		if (nib.kk(ajb)) {
			super.zf.gc(236);
			super.zf.fc(cmb);
			super.zf.fc(vlb);
			super.zf.fc(wlb);
			super.zf.fc(xlb);
			super.zf.fc(ylb);
			super.zf.fc(zlb);
			super.zf.fc(amb);
			super.zf.fc(bmb);
			super.zf.fc(nib.rj(bjb));
			super.zf.fc(nib.rj(cjb));
			super.zf.jc();
			gab.zf();
			ulb = false;
		}
	}

	public void qo() {
		ohb = new o(gab, 50);
		int l = 40;
		ohb.pk(256, 200 + l, "Click on an option", 5, true);
		ohb.vj(156, 240 + l, 120, 35);
		ohb.vj(356, 240 + l, 120, 35);
		ohb.pk(156, 240 + l, "New User", 5, false);
		ohb.pk(356, 240 + l, "Existing User", 5, false);
		phb = ohb.vk(156, 240 + l, 120, 35);
		qhb = ohb.vk(356, 240 + l, 120, 35);
		rhb = new o(gab, 50);
		l = 5;
		shb = rhb.pk(256, l + 8, "To create an account please enter all the requested details", 4, true);
		l += 25;
		rhb.vj(256, l + 17, 250, 34);
		rhb.pk(256, l + 8, "Choose a Username", 4, false);
		whb = rhb.sj(256, l + 25, 200, 40, 4, 12, false, false);
		rhb.rk(whb);
		l += 40;
		rhb.vj(141, l + 17, 220, 34);
		rhb.pk(141, l + 8, "Choose a Password", 4, false);
		xhb = rhb.sj(141, l + 25, 220, 40, 4, 20, true, false);
		rhb.vj(371, l + 17, 220, 34);
		rhb.pk(371, l + 8, "Confirm Password", 4, false);
		yhb = rhb.sj(371, l + 25, 220, 40, 4, 20, true, false);
		l += 40;
		rhb.cl(46, l, 420, 150);
		thb = rhb.tj(56, l + 5, 400, 140, 1, 1000, true);
		wo(rhb, thb);
		l += 160;
		zhb = rhb.al(120, l, 14);
		rhb.sk(135, l, "I agree to the terms+conditions above", 4, true);
		l += 20;
		rhb.vj(156, l + 17, 150, 34);
		rhb.pk(156, l + 17, "Submit", 5, false);
		vhb = rhb.vk(156, l + 17, 150, 34);
		rhb.vj(356, l + 17, 150, 34);
		rhb.pk(356, l + 17, "Cancel", 5, false);
		uhb = rhb.vk(356, l + 17, 150, 34);
		aib = new o(gab, 50);
		l = 230;
		bib = aib.pk(256, l - 10, "Please enter your username and password", 4, true);
		l += 28;
		aib.vj(146, l, 200, 40);
		aib.pk(146, l - 10, "Username:", 4, false);
		cib = aib.sj(146, l + 10, 200, 40, 4, 12, false, false);
		l += 47;
		aib.vj(195, l, 200, 40);
		aib.pk(195, l - 10, "Password:", 4, false);
		dib = aib.sj(195, l + 10, 200, 40, 4, 20, true, false);
		l -= 45;
		aib.vj(410, l, 110, 25);
		aib.pk(410, l, "Ok", 4, false);
		eib = aib.vk(410, l, 110, 25);
		l += 30;
		aib.vj(410, l, 110, 25);
		aib.pk(410, l, "Cancel", 4, false);
		fib = aib.vk(410, l, 110, 25);
		aib.rk(cib);
	}

	public void kp() {
		gab.mj = false;
		gab.zf();
		if (nhb == 0 || nhb == 2) {
			int l = (yz * 2) % 3072;
			if (l < 1024) {
				gab.qf(0, 10, 2500);
				if (l > 768)
					gab.gg(0, 10, 2501, l - 768);
			} else
			if (l < 2048) {
				gab.qf(0, 10, 2501);
				if (l > 1792)
					gab.gg(0, 10, pab + 10, l - 1792);
			} else {
				gab.qf(0, 10, pab + 10);
				if (l > 2816)
					gab.gg(0, 10, 2500, l - 2816);
			}
		}
		if (nhb == 0)
			ohb.hk();
		if (nhb == 1)
			rhb.hk();
		if (nhb == 2)
			aib.hk();
		gab.qf(0, mab, pab + 22);
		gab.dg(eab, 0, 11);
	}

	public void ln() {
		int l = 0;
		byte byte0 = 50;
		byte byte1 = 50;
		abb.md(byte0 * 48 + 23, byte1 * 48 + 23, l);
		abb.yd(fdb);
		char c1 = '\u2600';
		char c2 = '\u1900';
		char c3 = '\u044C';
		char c4 = '\u0378';
		fab.g = 4100;
		fab.h = 4100;
		fab.i = 1;
		fab.j = 4000;
		fab.g(c1, -abb.vd(c1, c2), c2, 912, /*c4*/0, 0, c3 * 2);
		fab.i();
		gab.ig();
		gab.ig();
		gab.rg(0, 0, 512, 6, 0);
		for (int i1 = 6; i1 >= 1; i1--)
			gab.og(0, i1, 0, i1, 512, 8);

		gab.rg(0, 194, 512, 20, 0);
		for (int j1 = 6; j1 >= 1; j1--)
			gab.og(0, j1, 0, 194 - j1, 512, 8);

		gab.qf(15, 15, pab + 10);
		gab.cg(2500, 0, 0, /*512*/lab, /*200*/mab);
		c1 = '\u2400';
		c2 = '\u2400';
		c3 = '\u044C';
		c4 = '\u0378';
		fab.g = 4100;
		fab.h = 4100;
		fab.i = 1;
		fab.j = 4000;
		fab.g(c1, -abb.vd(c1, c2), c2, 912, /*c4*/0, 0, c3 * 2);
		fab.i();
		gab.ig();
		gab.ig();
		gab.rg(0, 0, 512, 6, 0);
		for (int k1 = 6; k1 >= 1; k1--)
			gab.og(0, k1, 0, k1, 512, 8);

		gab.rg(0, 194, 512, 20, 0);
		for (int l1 = 6; l1 >= 1; l1--)
			gab.og(0, l1, 0, 194 - l1, 512, 8);

		gab.qf(15, 15, pab + 10);
		gab.cg(2501, 0, 0, 512, 200);
		for (int i2 = 0; i2 < 64; i2++) {
			fab.bb(abb.jf[0][i2]);
			fab.bb(abb._fldif[1][i2]);
			fab.bb(abb.jf[1][i2]);
			fab.bb(abb._fldif[2][i2]);
			fab.bb(abb.jf[2][i2]);
		}

		c1 = '\u2B80';
		c2 = '\u2880';
		c3 = '\u01F4';
		c4 = '\u0178';
		fab.g = 4100;
		fab.h = 4100;
		fab.i = 1;
		fab.j = 4000;
		fab.g(c1, -abb.vd(c1, c2), c2, 912, /*c4*/0, 0, c3 * 2);
		fab.i();
		gab.ig();
		gab.ig();
		gab.rg(0, 0, 512, 6, 0);
		for (int j2 = 6; j2 >= 1; j2--)
			gab.og(0, j2, 0, j2, 512, 8);

		gab.rg(0, 194, 512, 20, 0);
		for (int k2 = 6; k2 >= 1; k2--)
			gab.og(0, k2, 0, 194, 512, 8);

		gab.qf(15, 15, pab + 10);
		gab.cg(pab + 10, 0, 0, 512, 200);
	}

	public void ep() {
		if (nhb == 0) {
			ohb.ik(super.ds, super.es, super.gs, super.fs);
			if (ohb.kk(phb)) {
				nhb = 1;
				rhb.zj(whb, "");
				rhb.zj(xhb, "");
				rhb.zj(yhb, "");
				rhb.rk(whb);
				rhb.qk(zhb, 0);
				rhb.zj(shb, "To create an account please enter all the requested details");
			}
			if (ohb.kk(qhb)) {
				nhb = 2;
				aib.zj(bib, "Please enter your username and password");
				aib.zj(cib, "");
				aib.zj(dib, "");
				aib.rk(cib);
				return;
			}
		} else
		if (nhb == 1) {
			rhb.ik(super.ds, super.es, super.gs, super.fs);
			if (rhb.kk(whb))
				rhb.rk(xhb);
			if (rhb.kk(xhb))
				rhb.rk(yhb);
			if (rhb.kk(yhb))
				rhb.rk(whb);
			if (rhb.kk(uhb))
				nhb = 0;
			if (rhb.kk(vhb)) {
				if (rhb.jl(whb) == null || rhb.jl(whb).length() == 0 || rhb.jl(xhb) == null || rhb.jl(xhb).length() == 0) {
					rhb.zj(shb, "@yel@Please fill in ALL requested information to continue!");
					return;
				}
				if (!rhb.jl(xhb).equalsIgnoreCase(rhb.jl(yhb))) {
					rhb.zj(shb, "@yel@The two passwords entered are not the same as each other!");
					return;
				}
				if (rhb.jl(xhb).length() < 5) {
					rhb.zj(shb, "@yel@Your password must be at least 5 letters long");
					return;
				}
				if (rhb.rj(zhb) == 0) {
					rhb.zj(shb, "@yel@You must agree to the terms+conditions to continue");
					return;
				} else {
					rhb.zj(shb, "Please wait... Creating new account");
					kp();
					pj();
					String s = rhb.jl(whb);
					String s1 = rhb.jl(xhb);
					oe(s, s1, "null", 0, 0, 0);
					return;
				}
			}
		} else
		if (nhb == 2) {
			aib.ik(super.ds, super.es, super.gs, super.fs);
			if (aib.kk(fib))
				nhb = 0;
			if (aib.kk(cib))
				aib.rk(dib);
			if (aib.kk(dib) || aib.kk(eib)) {
				lib = aib.jl(cib);
				mib = aib.jl(dib);
				me(lib, mib);
			}
		}
	}

	public void gf(String s, String s1) {
		if (nhb == 1)
			rhb.zj(shb, s + " " + s1);
		if (nhb == 2)
			aib.zj(bib, s + " " + s1);
		kib = s1;
		kp();
		pj();
	}

	public void ff() {
		ne();
	}

	public void ef() {
		ihb = 0;
		sp("@cya@Sorry, you can't logout at the moment", 3);
	}

	public void jf() {
		if (ihb != 0) {
			lib = "";
			mib = "";
			ye();
			return;
		} else {
			System.out.println("Lost connection");
			kf(lib, mib);
			return;
		}
	}

	public void ye() {
		nhb = 0;
		kab = 0;
		ihb = 0;
	}

	public void ne() {
		chb = 0;
		ihb = 0;
		nhb = 0;
		kab = 1;
		cp();
		gab.zf();
		gab.dg(eab, 0, 11);
		for (int l = 0; l < zcb; l++) {
			fab.bb(adb[l]);
			abb.gd(bdb[l], cdb[l], ddb[l]);
		}

		for (int i1 = 0; i1 < idb; i1++) {
			fab.bb(jdb[i1]);
			abb.ke(kdb[i1], ldb[i1], mdb[i1], ndb[i1]);
		}

		zcb = 0;
		idb = 0;
		scb = 0;
		zbb = 0;
		for (int j1 = 0; j1 < xbb; j1++)
			ccb[j1] = null;

		for (int k1 = 0; k1 < ybb; k1++)
			dcb[k1] = null;

		lcb = 0;
		for (int l1 = 0; l1 < jcb; l1++)
			ncb[l1] = null;

		for (int i2 = 0; i2 < kcb; i2++)
			ocb[i2] = null;

		for (int j2 = 0; j2 < 50; j2++)
			reb[j2] = false;

		aab = 0;
		super.gs = 0;
		super.fs = 0;
	}

	public void xe() {
		String s = rhb.jl(whb);
		String s1 = rhb.jl(xhb);
		nhb = 2;
		aib.zj(bib, "Please enter your username and password");
		aib.zj(cib, s);
		aib.zj(dib, s1);
		kp();
		pj();
		me(s, s1);
	}

	public void wo(o o1, int l) {
		o1.ok(l, "Runescape rules of use", false);
		o1.ok(l, "", false);
		o1.ok(l, "In order to keep runescape enjoyable for everyone there are a few", false);
		o1.ok(l, "rules you must observe. You must agree to these rules to play", false);
		o1.ok(l, "", false);
		o1.ok(l, "When using the built in chat facility you must not use any language", false);
		o1.ok(l, "which may be considered by others to be offensive, racist or", false);
		o1.ok(l, "obscene. You must not use the chat facility to harass, threaten or", false);
		o1.ok(l, "deceive other players.", false);
		o1.ok(l, "", false);
		o1.ok(l, "You must not exploit any cheats or errors which you find in the", false);
		o1.ok(l, "game, to give yourself an unfair advantage. Any exploits which you", false);
		o1.ok(l, "find must be immediately reported to Jagex Software.", false);
		o1.ok(l, "", false);
		o1.ok(l, "You must not attempt to use other programs in conjunction with", false);
		o1.ok(l, "RuneScape to give yourself an unfair advantage at the game. You", false);
		o1.ok(l, "may not use any bots or macros to control your character for you.", false);
		o1.ok(l, "When you are not playing the game you must log-out. You may not", false);
		o1.ok(l, "circumvent any of our mechanisms designed to log out inactive", false);
		o1.ok(l, "players automatically.", false);
		o1.ok(l, "", false);
		o1.ok(l, "You must not create multiple characters and use them to help each", false);
		o1.ok(l, "other. You may create more than one character, but if you do, you", false);
		o1.ok(l, "may not log in more than one at any time, and they must not interact", false);
		o1.ok(l, "with each other in any way. If you wish to form an adventuring", false);
		o1.ok(l, "party you should do so by cooperating with other players in the game", false);
		o1.ok(l, "", false);
		o1.ok(l, "Terms and conditions", false);
		o1.ok(l, "", false);
		o1.ok(l, "You agree that your character and account in runescape, is the", false);
		o1.ok(l, "property of, and remains the property of Jagex Software. You may", false);
		o1.ok(l, "not sell, transfer, or lend your character to anyone else. We may", false);
		o1.ok(l, "delete or modify your character at any time for any reason.", false);
		o1.ok(l, "For instance failing to follow the rules above may be cause for", false);
		o1.ok(l, "IMMEDIATE DELETION of all your characters.", false);
		o1.ok(l, "", false);
		o1.ok(l, "You agree that for purposes such as preventing offensive language", false);
		o1.ok(l, "we may automatically or manually censor the chat as we see fit,", false);
		o1.ok(l, "and that we may record the chat to help us identify offenders.", false);
		o1.ok(l, "", false);
		o1.ok(l, "No Warranty is supplied with this Software. All implied warranties", false);
		o1.ok(l, "conditions or terms are excluded to the fullest extent permitted by", false);
		o1.ok(l, "law. We do not warrant that the operation of the Software will be", false);
		o1.ok(l, "uninterrupted or error free. We accept no responsibility for any", false);
		o1.ok(l, "consequential or indirect loss or damages. You use this software at", false);
		o1.ok(l, "your own risk, and assume full responsibility for any and all real,", false);
		o1.ok(l, "claimed, or supposed damages that may occur as a result of running", false);
		o1.ok(l, "this software.", false);
		o1.ok(l, "", false);
		o1.ok(l, "We reserve all rights related to the runescape name, logo, web site,", false);
		o1.ok(l, "and game. All materials associated with runescape are protected", false);
		o1.ok(l, "by UK copyright laws and all other applicable national laws, and", false);
		o1.ok(l, "may not be copied, reproduced, republished, uploaded, posted,", false);
		o1.ok(l, "transmitted, or distributed in any way without our prior written", false);
		o1.ok(l, "consent. We reserve the right to modify or remove this game at any", false);
		o1.ok(l, "time. You agree that we may change this service, and these terms", false);
		o1.ok(l, "and conditions, as and when we deem necessary.", false);
		o1.ok(l, "", false);
		o1.ok(l, "We accept no responsibility for the actions of other users of our", false);
		o1.ok(l, "website. You acknowledge that it is inpractical for us to control", false);
		o1.ok(l, "and monitor everything that users do in our game or post on our", false);
		o1.ok(l, "message boards, and that we therefore cannot be held responsible", false);
		o1.ok(l, "for any abusive or inappropriate content which appears on our site", false);
		o1.ok(l, "as a result.", false);
		o1.ok(l, "", false);
		o1.ok(l, "Occasionally we may accept ideas and game additions from the", false);
		o1.ok(l, "players. You agree that by submitting material for inclusion in", false);
		o1.ok(l, "runescape you are giving us a non-exclusive, perpetual, worldwide,", false);
		o1.ok(l, "royalty-free license to use or modify the submission as we see", false);
		o1.ok(l, "fit. You agree that you will not withdraw the submission or attempt", false);
		o1.ok(l, "to make a charge for its use. Furthermore you warrant that you", false);
		o1.ok(l, "are the exclusive copyright holder of the submission, and that the", false);
		o1.ok(l, "submission in no way violates any other person or entity's rights", false);
		o1.ok(l, "", false);
		o1.ok(l, "These Terms shall be governed by the laws of England, and the", false);
		o1.ok(l, "courts of England shall have exclusive jurisdiction in all matters", false);
		o1.ok(l, "arising.", false);
	}

	public void so() {
		re();
		if (ihb > 0)
			ihb--;
		if (super.jr > 4500 && jhb == 0 && ihb == 0) {
			super.jr -= 500;
			trylogout();
			return;
		}
		if (fcb.qy == 8 || fcb.qy == 9)
			jhb = 500;
		if (jhb > 0)
			jhb--;
		if (djb != 0) {
			wn();
			return;
		}
		if (ulb) {
			eo();
			return;
		}
		if (rkb) {
			mp();
			return;
		}
		for (int l = 0; l < zbb; l++) {
			r r1 = dcb[l];
			int j1 = (r1.ty + 1) % 10;
			if (r1.sy != j1) {
				int l1 = -1;
				int k3 = r1.sy;
				int k4;
				if (k3 < j1)
					k4 = j1 - k3;
				else
					k4 = (10 + j1) - k3;
				int j5 = 4;
				if (k4 > 2)
					j5 = (k4 - 1) * 4;
				if (r1.uy[k3] - r1.my > jab * 3 || r1.vy[k3] - r1.ny > jab * 3 || r1.uy[k3] - r1.my < -jab * 3 || r1.vy[k3] - r1.ny < -jab * 3 || k4 > 8) {
					r1.my = r1.uy[k3];
					r1.ny = r1.vy[k3];
				} else {
					if (r1.my < r1.uy[k3]) {
						r1.my += j5;
						r1.py++;
						l1 = 2;
					} else
					if (r1.my > r1.uy[k3]) {
						r1.my -= j5;
						r1.py++;
						l1 = 6;
					}
					if (r1.my - r1.uy[k3] < j5 && r1.my - r1.uy[k3] > -j5)
						r1.my = r1.uy[k3];
					if (r1.ny < r1.vy[k3]) {
						r1.ny += j5;
						r1.py++;
						if (l1 == -1)
							l1 = 4;
						else
						if (l1 == 2)
							l1 = 3;
						else
							l1 = 5;
					} else
					if (r1.ny > r1.vy[k3]) {
						r1.ny -= j5;
						r1.py++;
						if (l1 == -1)
							l1 = 0;
						else
						if (l1 == 2)
							l1 = 1;
						else
							l1 = 7;
					}
					if (r1.ny - r1.vy[k3] < j5 && r1.ny - r1.vy[k3] > -j5)
						r1.ny = r1.vy[k3];
				}
				if (l1 != -1)
					r1.qy = l1;
				if (r1.my == r1.uy[k3] && r1.ny == r1.vy[k3])
					r1.sy = (k3 + 1) % 10;
			} else {
				r1.qy = r1.ry;
			}
			if (r1.yy > 0)
				r1.yy--;
			if (r1.az > 0)
				r1.az--;
			if (r1.ez > 0)
				r1.ez--;
			if (mhb > 0) {
				mhb--;
				if (mhb == 0)
					sp("You have been granted another life. Be more careful this time!", 3);
				if (mhb == 0)
					sp("You retain your skills. Unless you attacked another player recently,", 3);
				if (mhb == 0)
					sp("you also keep your best 3 items. Everything else lands where you died.", 3);
			}
		}

		for (int i1 = 0; i1 < lcb; i1++) {
			r r2 = ocb[i1];
			int i2 = (r2.ty + 1) % 10;
			if (r2.sy != i2) {
				int l3 = -1;
				int l4 = r2.sy;
				int k5;
				if (l4 < i2)
					k5 = i2 - l4;
				else
					k5 = (10 + i2) - l4;
				int l5 = 4;
				if (k5 > 2)
					l5 = (k5 - 1) * 4;
				if (r2.uy[l4] - r2.my > jab * 3 || r2.vy[l4] - r2.ny > jab * 3 || r2.uy[l4] - r2.my < -jab * 3 || r2.vy[l4] - r2.ny < -jab * 3 || k5 > 8) {
					r2.my = r2.uy[l4];
					r2.ny = r2.vy[l4];
				} else {
					if (r2.my < r2.uy[l4]) {
						r2.my += l5;
						r2.py++;
						l3 = 2;
					} else
					if (r2.my > r2.uy[l4]) {
						r2.my -= l5;
						r2.py++;
						l3 = 6;
					}
					if (r2.my - r2.uy[l4] < l5 && r2.my - r2.uy[l4] > -l5)
						r2.my = r2.uy[l4];
					if (r2.ny < r2.vy[l4]) {
						r2.ny += l5;
						r2.py++;
						if (l3 == -1)
							l3 = 4;
						else
						if (l3 == 2)
							l3 = 3;
						else
							l3 = 5;
					} else
					if (r2.ny > r2.vy[l4]) {
						r2.ny -= l5;
						r2.py++;
						if (l3 == -1)
							l3 = 0;
						else
						if (l3 == 2)
							l3 = 1;
						else
							l3 = 7;
					}
					if (r2.ny - r2.vy[l4] < l5 && r2.ny - r2.vy[l4] > -l5)
						r2.ny = r2.vy[l4];
				}
				if (l3 != -1)
					r2.qy = l3;
				if (r2.my == r2.uy[l4] && r2.ny == r2.vy[l4])
					r2.sy = (l4 + 1) % 10;
			} else {
				r2.qy = r2.ry;
			}
			if (r2.yy > 0)
				r2.yy--;
			if (r2.az > 0)
				r2.az--;
			if (r2.ez > 0)
				r2.ez--;
		}

		for (int k1 = 0; k1 < zbb; k1++) {
			r r3 = dcb[k1];
			if (r3.oz > 0)
				r3.oz--;
		}

		if (seb) {
			if (rbb - fcb.my < -500 || rbb - fcb.my > 500 || sbb - fcb.ny < -500 || sbb - fcb.ny > 500) {
				rbb = fcb.my;
				sbb = fcb.ny;
			}
		} else {
			if (rbb - fcb.my < -500 || rbb - fcb.my > 500 || sbb - fcb.ny < -500 || sbb - fcb.ny > 500) {
				rbb = fcb.my;
				sbb = fcb.ny;
			}
			if (rbb != fcb.my)
				rbb += (fcb.my - rbb) / (16 + (pbb - 500) / 15);
			if (sbb != fcb.ny)
				sbb += (fcb.ny - sbb) / (16 + (pbb - 500) / 15);
			if (teb) {
				int j2 = tbb * 32;
				int i4 = j2 - vbb;
				byte byte0 = 1;
				if (i4 != 0) {
					ubb++;
					if (i4 > 128) {
						byte0 = -1;
						i4 = 256 - i4;
					} else
					if (i4 > 0)
						byte0 = 1;
					else
					if (i4 < -128) {
						byte0 = 1;
						i4 = 256 + i4;
					} else
					if (i4 < 0) {
						byte0 = -1;
						i4 = -i4;
					}
					vbb += ((ubb * i4 + 255) / 256) * byte0;
					vbb &= 0xff;
				} else {
					ubb = 0;
				}
			}
		}
		if (super.es > mab - 4) {
			if (super.ds > 15 && super.ds < 96 && super.gs == 1)
				vfb = 0;
			if (super.ds > 110 && super.ds < 194 && super.gs == 1) {
				vfb = 1;
				qfb.ws[rfb] = 0xf423f;
			}
			if (super.ds > 215 && super.ds < 295 && super.gs == 1) {
				vfb = 2;
				qfb.ws[tfb] = 0xf423f;
			}
			if (super.ds > 315 && super.ds < 395 && super.gs == 1) {
				vfb = 3;
				qfb.ws[ufb] = 0xf423f;
			}
			super.gs = 0;
			super.fs = 0;
		}
		qfb.ik(super.ds, super.es, super.gs, super.fs);
		if (vfb > 0 && super.ds >= 494 && super.es >= mab - 66)
			super.gs = 0;
		if (qfb.kk(sfb)) {
			String s = qfb.jl(sfb);
			qfb.zj(sfb, "");
			if (s.equalsIgnoreCase("lostcon99") && !xz)
				super.zf.qi();
			else
			if (s.equalsIgnoreCase("closecon99") && !xz)
				ve();
			else
			if (!_mthif(s)) {
				fcb.yy = 150;
				fcb.xy = s;
				sp(fcb.jy + ": " + s, 2);
			}
		}
		if (vfb == 0) {
			for (int k2 = 0; k2 < wfb; k2++)
				if (yfb[k2] > 0)
					yfb[k2]--;

		}
		if (mhb != 0)
			super.gs = 0;
		if (zfb) {
			if (super.fs != 0)
				jgb++;
			else
				jgb = 0;
			if (jgb > 300)
				kgb += 50;
			else
			if (jgb > 150)
				kgb += 5;
			else
			if (jgb > 50)
				kgb++;
			else
			if (jgb > 20 && (jgb & 5) == 0)
				kgb++;
		} else {
			jgb = 0;
			kgb = 0;
		}
		if (super.gs == 1)
			aab = 1;
		else
		if (super.gs == 2)
			aab = 2;
		fab.n(super.ds, super.es);
		super.gs = 0;
		if (teb) {
			if (ubb == 0 || seb) {
				if (super.wr) {
					tbb = tbb + 1 & 7;
					super.wr = false;
					if (!qbb) {
						if ((tbb & 1) == 0)
							tbb = tbb + 1 & 7;
						for (int l2 = 0; l2 < 8; l2++) {
							if (xp(tbb))
								break;
							tbb = tbb + 1 & 7;
						}

					}
				}
				if (super.xr) {
					tbb = tbb + 7 & 7;
					super.xr = false;
					if (!qbb) {
						if ((tbb & 1) == 0)
							tbb = tbb + 7 & 7;
						for (int i3 = 0; i3 < 8; i3++) {
							if (xp(tbb))
								break;
							tbb = tbb + 7 & 7;
						}

					}
				}
			}
		} else
		if (super.wr)
			vbb = vbb + 2 & 0xff;
		else
		if (super.xr)
			vbb = vbb - 2 & 0xff;
		if (qbb && pbb > 550)
			pbb -= 4;
		else
		if (!qbb && pbb < 750)
			pbb += 4;
		if (xab > 0)
			xab--;
		else
		if (xab < 0)
			xab++;
		fab.tb(17);
		sab++;
		if (sab > 5) {
			sab = 0;
			tab = tab + 1 & 3;
			uab = (uab + 1) % 3;
		}
		for (int j3 = 0; j3 < zcb; j3++) {
			int j4 = bdb[j3];
			int i5 = cdb[j3];
			if (j4 >= 0 && i5 >= 0 && j4 < 96 && i5 < 96 && ddb[j3] == 74)
				adb[j3].qm(1, 0, 0);
		}

	}

	public void sp(String s, int l) {
		if (l == 2 || l == 4 || l == 6) {
			for (; s.length() > 5 && s.charAt(0) == '@' && s.charAt(4) == '@'; s = s.substring(5));
			int i1 = s.indexOf(":");
			if (i1 != -1) {
				String s1 = s.substring(0, i1);
				long l1 = c.dd(s1);
				for (int k1 = 0; k1 < super.ig; k1++)
					if (super.jg[k1] == l1)
						return;

			}
		}
		if (l == 2)
			s = "@yel@" + s;
		if (l == 3 || l == 4)
			s = "@whi@" + s;
		if (l == 6)
			s = "@cya@" + s;
		if (vfb != 0) {
			if (l == 4 || l == 3)
				mfb = 200;
			if (l == 2 && vfb != 1)
				nfb = 200;
			if (l == 5 && vfb != 2)
				ofb = 200;
			if (l == 6 && vfb != 3)
				pfb = 200;
			if (l == 3 && vfb != 0)
				vfb = 0;
			if (l == 6 && vfb != 3 && vfb != 0)
				vfb = 3;
		}
		for (int j1 = wfb - 1; j1 > 0; j1--) {
			xfb[j1] = xfb[j1 - 1];
			yfb[j1] = yfb[j1 - 1];
		}

		xfb[0] = s;
		yfb[0] = 300;
		if (l == 2)
			if (qfb.ws[rfb] == qfb.xs[rfb] - 4)
				qfb.ok(rfb, s, true);
			else
				qfb.ok(rfb, s, false);
		if (l == 5)
			if (qfb.ws[tfb] == qfb.xs[tfb] - 4)
				qfb.ok(tfb, s, true);
			else
				qfb.ok(tfb, s, false);
		if (l == 6) {
			if (qfb.ws[ufb] == qfb.xs[ufb] - 4) {
				qfb.ok(ufb, s, true);
				return;
			}
			qfb.ok(ufb, s, false);
		}
	}

	public void af(String s) {
		if (s.startsWith("@cha@")) {
			sp(s, 2);
			return;
		}
		if (s.startsWith("@bor@")) {
			sp(s, 4);
			return;
		}
		if (s.startsWith("@que@")) {
			sp("@whi@" + s, 5);
			return;
		}
		if (s.startsWith("@pri@")) {
			sp(s, 6);
			return;
		} else {
			sp(s, 3);
			return;
		}
	}

	public r hn(int l, int i1, int j1, int k1) {
		if (ccb[l] == null) {
			ccb[l] = new r();
			ccb[l].ky = l;
			ccb[l].ly = 0;
		}
		r r1 = ccb[l];
		boolean flag = false;
		for (int l1 = 0; l1 < acb; l1++) {
			if (ecb[l1].ky != l)
				continue;
			flag = true;
			break;
		}

		if (flag) {
			r1.ry = k1;
			int i2 = r1.ty;
			if (i1 != r1.uy[i2] || j1 != r1.vy[i2]) {
				r1.ty = i2 = (i2 + 1) % 10;
				r1.uy[i2] = i1;
				r1.vy[i2] = j1;
			}
		} else {
			r1.ky = l;
			r1.sy = 0;
			r1.ty = 0;
			r1.uy[0] = r1.my = i1;
			r1.vy[0] = r1.ny = j1;
			r1.ry = r1.qy = k1;
			r1.py = 0;
		}
		dcb[zbb++] = r1;
		return r1;
	}

	public r dp(int l, int i1, int j1, int k1, int l1) {
		if (ncb[l] == null) {
			ncb[l] = new r();
			ncb[l].ky = l;
		}
		r r1 = ncb[l];
		boolean flag = false;
		for (int i2 = 0; i2 < mcb; i2++) {
			if (pcb[i2].ky != l)
				continue;
			flag = true;
			break;
		}

		if (flag) {
			r1.oy = l1;
			r1.ry = k1;
			int j2 = r1.ty;
			if (i1 != r1.uy[j2] || j1 != r1.vy[j2]) {
				r1.ty = j2 = (j2 + 1) % 10;
				r1.uy[j2] = i1;
				r1.vy[j2] = j1;
			}
		} else {
			r1.ky = l;
			r1.sy = 0;
			r1.ty = 0;
			r1.uy[0] = r1.my = i1;
			r1.vy[0] = r1.ny = j1;
			r1.oy = l1;
			r1.ry = r1.qy = k1;
			r1.py = 0;
		}
		ocb[lcb++] = r1;
		return r1;
	}

	public void we(int l, int i1, byte abyte0[]) {
		try {
			if (l == 255) {
				acb = zbb;
				for (int j1 = 0; j1 < acb; j1++)
					ecb[j1] = dcb[j1];

				int i6 = 8;
				gcb = c.qc(abyte0, i6, 10);
				i6 += 10;
				hcb = c.qc(abyte0, i6, 12);
				i6 += 12;
				int k10 = c.qc(abyte0, i6, 4);
				i6 += 4;
				boolean flag = bo(gcb, hcb);
				gcb -= fbb;
				hcb -= gbb;
				int i18 = gcb * jab + 64;
				int i21 = hcb * jab + 64;
				if (flag) {
					fcb.ty = 0;
					fcb.sy = 0;
					fcb.my = fcb.uy[0] = i18;
					fcb.ny = fcb.vy[0] = i21;
				}
				zbb = 0;
				fcb = hn(icb, i18, i21, k10);
				int j24 = c.qc(abyte0, i6, 8);
				i6 += 8;
				for (int i29 = 0; i29 < j24; i29++) {
					r r4 = ecb[i29 + 1];
					int l34 = c.qc(abyte0, i6, 1);
					i6++;
					if (l34 != 0) {
						int l36 = c.qc(abyte0, i6, 1);
						i6++;
						if (l36 == 0) {
							int i38 = c.qc(abyte0, i6, 3);
							i6 += 3;
							int i39 = r4.ty;
							int k39 = r4.uy[i39];
							int l39 = r4.vy[i39];
							if (i38 == 2 || i38 == 1 || i38 == 3)
								k39 += jab;
							if (i38 == 6 || i38 == 5 || i38 == 7)
								k39 -= jab;
							if (i38 == 4 || i38 == 3 || i38 == 5)
								l39 += jab;
							if (i38 == 0 || i38 == 1 || i38 == 7)
								l39 -= jab;
							r4.ry = i38;
							r4.ty = i39 = (i39 + 1) % 10;
							r4.uy[i39] = k39;
							r4.vy[i39] = l39;
						} else {
							int j38 = c.qc(abyte0, i6, 4);
							if ((j38 & 0xc) == 12) {
								i6 += 2;
								continue;
							}
							r4.ry = c.qc(abyte0, i6, 4);
							i6 += 4;
						}
					}
					dcb[zbb++] = r4;
				}

				int j32 = 0;
				while (i6 + 24 < i1 * 8)  {
					int i35 = c.qc(abyte0, i6, 11);
					i6 += 11;
					int i37 = c.qc(abyte0, i6, 5);
					i6 += 5;
					if (i37 > 15)
						i37 -= 32;
					int k38 = c.qc(abyte0, i6, 5);
					i6 += 5;
					if (k38 > 15)
						k38 -= 32;
					int l10 = c.qc(abyte0, i6, 4);
					i6 += 4;
					int j39 = c.qc(abyte0, i6, 1);
					i6++;
					int j18 = (gcb + i37) * jab + 64;
					int j21 = (hcb + k38) * jab + 64;
					hn(i35, j18, j21, l10);
					if (j39 == 0)
						qcb[j32++] = i35;
				}
				if (j32 > 0) {
					super.zf.gc(254);
					super.zf.ec(j32);
					for (int j35 = 0; j35 < j32; j35++) {
						r r5 = ccb[qcb[j35]];
						super.zf.ec(r5.ky);
						super.zf.ec(r5.ly);
					}

					super.zf.jc();
					j32 = 0;
					return;
				}
			} else {
				if (l == 254) {
					for (int k1 = 1; k1 < i1;)
						if (c.tc(abyte0[k1]) == 255) {
							int j6 = 0;
							int i11 = gcb + abyte0[k1 + 1] >> 3;
							int l14 = hcb + abyte0[k1 + 2] >> 3;
							k1 += 3;
							for (int k18 = 0; k18 < scb; k18++) {
								int k21 = (ucb[k18] >> 3) - i11;
								int k24 = (vcb[k18] >> 3) - l14;
								if (k21 != 0 || k24 != 0) {
									if (k18 != j6) {
										ucb[j6] = ucb[k18];
										vcb[j6] = vcb[k18];
										wcb[j6] = wcb[k18];
										xcb[j6] = xcb[k18];
									}
									j6++;
								}
							}

							scb = j6;
						} else {
							int k6 = c.vc(abyte0, k1);
							k1 += 2;
							int j11 = gcb + abyte0[k1++];
							int i15 = hcb + abyte0[k1++];
							if ((k6 & 0x8000) == 0) {
								ucb[scb] = j11;
								vcb[scb] = i15;
								wcb[scb] = k6;
								xcb[scb] = 0;
								for (int l18 = 0; l18 < zcb; l18++) {
									if (bdb[l18] != j11 || cdb[l18] != i15)
										continue;
									xcb[scb] = j.kn[ddb[l18]];
									break;
								}

								scb++;
							} else {
								k6 &= 0x7fff;
								int i19 = 0;
								for (int l21 = 0; l21 < scb; l21++)
									if (ucb[l21] != j11 || vcb[l21] != i15 || wcb[l21] != k6) {
										if (l21 != i19) {
											ucb[i19] = ucb[l21];
											vcb[i19] = vcb[l21];
											wcb[i19] = wcb[l21];
											xcb[i19] = xcb[l21];
										}
										i19++;
									} else {
										k6 = -123;
									}

								scb = i19;
							}
						}

					return;
				}
				if (l == 253) {
					for (int l1 = 1; l1 < i1;)
						if (c.tc(abyte0[l1]) == 255) {
							int l6 = 0;
							int k11 = gcb + abyte0[l1 + 1] >> 3;
							int j15 = hcb + abyte0[l1 + 2] >> 3;
							l1 += 3;
							for (int j19 = 0; j19 < zcb; j19++) {
								int i22 = (bdb[j19] >> 3) - k11;
								int l24 = (cdb[j19] >> 3) - j15;
								if (i22 != 0 || l24 != 0) {
									if (j19 != l6) {
										adb[l6] = adb[j19];
										adb[l6].pv = l6;
										bdb[l6] = bdb[j19];
										cdb[l6] = cdb[j19];
										ddb[l6] = ddb[j19];
										edb[l6] = edb[j19];
									}
									l6++;
								} else {
									fab.bb(adb[j19]);
									abb.gd(bdb[j19], cdb[j19], ddb[j19]);
								}
							}

							zcb = l6;
						} else {
							int i7 = c.vc(abyte0, l1);
							l1 += 2;
							int l11 = gcb + abyte0[l1++];
							int k15 = hcb + abyte0[l1++];
							int k19 = 0;
							for (int j22 = 0; j22 < zcb; j22++)
								if (bdb[j22] != l11 || cdb[j22] != k15) {
									if (j22 != k19) {
										adb[k19] = adb[j22];
										adb[k19].pv = k19;
										bdb[k19] = bdb[j22];
										cdb[k19] = cdb[j22];
										ddb[k19] = ddb[j22];
										edb[k19] = edb[j22];
									}
									k19++;
								} else {
									fab.bb(adb[j22]);
									abb.gd(bdb[j22], cdb[j22], ddb[j22]);
								}

							zcb = k19;
							if (i7 != 60000) {
								int i25 = abb.td(l11, k15);
								int j29;
								int k32;
								if (i25 == 0 || i25 == 4) {
									j29 = j.gn[i7];
									k32 = j.hn[i7];
								} else {
									k32 = j.gn[i7];
									j29 = j.hn[i7];
								}
								int k35 = ((l11 + l11 + j29) * jab) / 2;
								int j37 = ((k15 + k15 + k32) * jab) / 2;
								int l38 = j.fn[i7];
								p p2 = fdb[l38].zl();
								fab.hb(p2);
								p2.pv = zcb;
								p2.qm(0, i25 * 32, 0);
								p2.dm(k35, -abb.vd(k35, j37), j37);
								p2.nm(true, 48, 48, -50, -10, -50);
								abb.jd(l11, k15, i7);
								if (i7 == 74)
									p2.dm(0, -480, 0);
								bdb[zcb] = l11;
								cdb[zcb] = k15;
								ddb[zcb] = i7;
								edb[zcb] = i25;
								adb[zcb++] = p2;
							}
						}

					return;
				}
				if (l == 252) {
					rdb = 0;
					for (int i2 = 8; i2 + 9 < i1 * 8;) {
						int j7 = c.qc(abyte0, i2, 10);
						i2 += 10;
						int i12 = 0;
						if (j.jl[j7] != 0) {
							i12 = c.qc(abyte0, i2, 1);
							i2++;
						}
						int l15 = 1;
						if (j.bl[j7] == 0) {
							l15 = c.qc(abyte0, i2, 16);
							i2 += 16;
						}
						sdb[rdb] = j7;
						udb[rdb] = i12;
						tdb[rdb] = l15;
						rdb++;
					}

					return;
				}
				if (l == 250) {
					int j2 = c.vc(abyte0, 1);
					int k7 = 3;
					for (int j12 = 0; j12 < j2; j12++) {
						int i16 = c.vc(abyte0, k7);
						k7 += 2;
						r r1 = ccb[i16];
						byte byte4 = abyte0[k7];
						k7++;
						if (byte4 == 0) {
							int j25 = c.vc(abyte0, k7);
							k7 += 2;
							if (r1 != null) {
								r1.az = 150;
								r1.zy = j25;
							}
						} else
						if (byte4 == 1) {
							byte byte5 = abyte0[k7];
							k7++;
							if (r1 != null) {
								String s1 = new String(abyte0, k7, byte5);
								if (s1.startsWith("@que@")) {
									r1.yy = 150;
									r1.xy = s1;
									if (r1 == fcb)
										sp("@yel@" + r1.jy + ": " + r1.xy, 5);
								} else
								if (r1 != fcb) {
									boolean flag3 = false;
									for (int l35 = 0; l35 < super.ig; l35++)
										if (super.jg[l35] == r1.iy)
											flag3 = true;

									if (!flag3) {
										s1 = c.rc(s1, true);
										r1.yy = 150;
										r1.xy = s1;
										sp(r1.jy + ": " + r1.xy, 2);
									}
								}
							}
							k7 += byte5;
						} else
						if (byte4 == 2) {
							int k25 = c.tc(abyte0[k7]);
							k7++;
							int k29 = c.tc(abyte0[k7]);
							k7++;
							int l32 = c.tc(abyte0[k7]);
							k7++;
							if (r1 != null) {
								r1.bz = k25;
								r1.cz = k29;
								r1.dz = l32;
								r1.ez = 200;
								if (r1 == fcb) {
									xdb[3] = k29;
									ydb[3] = l32;
								}
							}
						} else
						if (byte4 == 3) {
							int l25 = c.vc(abyte0, k7);
							k7 += 2;
							int l29 = c.vc(abyte0, k7);
							k7 += 2;
							if (r1 != null) {
								r1.lz = l25;
								r1.nz = l29;
								r1.mz = -1;
								r1.oz = qab;
							}
						} else
						if (byte4 == 4) {
							int i26 = c.vc(abyte0, k7);
							k7 += 2;
							int i30 = c.vc(abyte0, k7);
							k7 += 2;
							if (r1 != null) {
								r1.lz = i26;
								r1.mz = i30;
								r1.nz = -1;
								r1.oz = qab;
							}
						} else
						if (byte4 == 5)
							if (r1 != null) {
								r1.ly = c.vc(abyte0, k7);
								k7 += 2;
								r1.iy = c.pc(abyte0, k7);
								k7 += 8;
								r1.jy = c.zc(r1.iy);
								int j26 = c.tc(abyte0[k7]);
								k7++;
								for (int j30 = 0; j30 < j26; j30++) {
									r1.wy[j30] = c.tc(abyte0[k7]);
									k7++;
								}

								for (int i33 = j26; i33 < 12; i33++)
									r1.wy[i33] = 0;

								r1.hz = abyte0[k7++] & 0xff;
								r1.iz = abyte0[k7++] & 0xff;
								r1.jz = abyte0[k7++] & 0xff;
								r1.kz = abyte0[k7++] & 0xff;
								r1.fz = abyte0[k7++] & 0xff;
								r1.gz = abyte0[k7++] & 0xff;
								r1.rz = abyte0[k7++] & 0xff;
							} else {
								k7 += 14;
								int k26 = c.tc(abyte0[k7]);
								k7 += k26 + 1;
							}
					}

					return;
				}
				if (l == 249) {
					for (int k2 = 1; k2 < i1;)
						if (c.tc(abyte0[k2]) == 255) {
							int l7 = 0;
							int k12 = gcb + abyte0[k2 + 1] >> 3;
							int j16 = hcb + abyte0[k2 + 2] >> 3;
							k2 += 3;
							for (int l19 = 0; l19 < idb; l19++) {
								int k22 = (kdb[l19] >> 3) - k12;
								int l26 = (ldb[l19] >> 3) - j16;
								if (k22 != 0 || l26 != 0) {
									if (l19 != l7) {
										jdb[l7] = jdb[l19];
										jdb[l7].pv = l7 + 10000;
										kdb[l7] = kdb[l19];
										ldb[l7] = ldb[l19];
										mdb[l7] = mdb[l19];
										ndb[l7] = ndb[l19];
									}
									l7++;
								} else {
									fab.bb(jdb[l19]);
									abb.ke(kdb[l19], ldb[l19], mdb[l19], ndb[l19]);
								}
							}

							idb = l7;
						} else {
							int i8 = c.vc(abyte0, k2);
							k2 += 2;
							int l12 = gcb + abyte0[k2++];
							int k16 = hcb + abyte0[k2++];
							byte byte3 = abyte0[k2++];
							int l22 = 0;
							for (int i27 = 0; i27 < idb; i27++)
								if (kdb[i27] != l12 || ldb[i27] != k16 || mdb[i27] != byte3) {
									if (i27 != l22) {
										jdb[l22] = jdb[i27];
										jdb[l22].pv = l22 + 10000;
										kdb[l22] = kdb[i27];
										ldb[l22] = ldb[i27];
										mdb[l22] = mdb[i27];
										ndb[l22] = ndb[i27];
									}
									l22++;
								} else {
									fab.bb(jdb[i27]);
									abb.ke(kdb[i27], ldb[i27], mdb[i27], ndb[i27]);
								}

							idb = l22;
							if (i8 != 65535) {
								abb.ed(l12, k16, byte3, i8);
								p p1 = fn(l12, k16, byte3, i8, idb);
								jdb[idb] = p1;
								kdb[idb] = l12;
								ldb[idb] = k16;
								ndb[idb] = i8;
								mdb[idb++] = byte3;
							}
						}

					return;
				}
				if (l == 248) {
					mcb = lcb;
					lcb = 0;
					for (int l2 = 0; l2 < mcb; l2++)
						pcb[l2] = ocb[l2];

					int j8 = 8;
					int i13 = c.qc(abyte0, j8, 8);
					j8 += 8;
					for (int l16 = 0; l16 < i13; l16++) {
						r r2 = pcb[l16];
						int i23 = c.qc(abyte0, j8, 1);
						j8++;
						if (i23 != 0) {
							int j27 = c.qc(abyte0, j8, 1);
							j8++;
							if (j27 == 0) {
								int k30 = c.qc(abyte0, j8, 3);
								j8 += 3;
								int j33 = r2.ty;
								int i36 = r2.uy[j33];
								int k37 = r2.vy[j33];
								if (k30 == 2 || k30 == 1 || k30 == 3)
									i36 += jab;
								if (k30 == 6 || k30 == 5 || k30 == 7)
									i36 -= jab;
								if (k30 == 4 || k30 == 3 || k30 == 5)
									k37 += jab;
								if (k30 == 0 || k30 == 1 || k30 == 7)
									k37 -= jab;
								r2.ry = k30;
								r2.ty = j33 = (j33 + 1) % 10;
								r2.uy[j33] = i36;
								r2.vy[j33] = k37;
							} else {
								int l30 = c.qc(abyte0, j8, 4);
								if ((l30 & 0xc) == 12) {
									j8 += 2;
									continue;
								}
								r2.ry = c.qc(abyte0, j8, 4);
								j8 += 4;
							}
						}
						ocb[lcb++] = r2;
					}

					while (j8 + 31 < i1 * 8)  {
						int i20 = c.qc(abyte0, j8, 10);
						j8 += 10;
						int j23 = c.qc(abyte0, j8, 5);
						j8 += 5;
						if (j23 > 15)
							j23 -= 32;
						int k27 = c.qc(abyte0, j8, 5);
						j8 += 5;
						if (k27 > 15)
							k27 -= 32;
						int i31 = c.qc(abyte0, j8, 4);
						j8 += 4;
						int k33 = (gcb + j23) * jab + 64;
						int j36 = (hcb + k27) * jab + 64;
						int l37 = c.qc(abyte0, j8, 8);
						j8 += 8;
						if (l37 >= j.ol)
							l37 = 24;
						dp(i20, k33, j36, i31, l37);
					}
					return;
				}
				if (l == 247) {
					int i3 = c.vc(abyte0, 1);
					int k8 = 3;
					for (int j13 = 0; j13 < i3; j13++) {
						int i17 = c.vc(abyte0, k8);
						k8 += 2;
						r r3 = ncb[i17];
						int k23 = c.tc(abyte0[k8]);
						k8++;
						if (k23 == 1) {
							int l27 = c.vc(abyte0, k8);
							k8 += 2;
							byte byte6 = abyte0[k8];
							k8++;
							if (r3 != null) {
								String s2 = new String(abyte0, k8, byte6);
								r3.yy = 150;
								r3.xy = s2;
								if (l27 == fcb.ky)
									sp("@yel@" + j.pl[r3.oy][0] + ": " + r3.xy, 5);
							}
							k8 += byte6;
						} else
						if (k23 == 2) {
							int i28 = c.tc(abyte0[k8]);
							k8++;
							int j31 = c.tc(abyte0[k8]);
							k8++;
							int l33 = c.tc(abyte0[k8]);
							k8++;
							if (r3 != null) {
								r3.bz = i28;
								r3.cz = j31;
								r3.dz = l33;
								r3.ez = 200;
							}
						}
					}

					return;
				}
				if (l == 246) {
					zgb = true;
					int j3 = c.tc(abyte0[1]);
					ahb = j3;
					int l8 = 2;
					for (int k13 = 0; k13 < j3; k13++) {
						int j17 = c.tc(abyte0[l8]);
						l8++;
						bhb[k13] = new String(abyte0, l8, j17);
						l8 += j17;
					}

					return;
				}
				if (l == 245) {
					zgb = false;
					return;
				}
				if (l == 244) {
					icb = c.vc(abyte0, 1);
					bbb = c.vc(abyte0, 3);
					cbb = c.vc(abyte0, 5);
					hbb = c.vc(abyte0, 7);
					dbb = c.vc(abyte0, 9);
					cbb -= hbb * dbb;
					return;
				}
				if (l == 243) {
					int k3 = 1;
					for (int i9 = 0; i9 < 16; i9++)
						xdb[i9] = c.tc(abyte0[k3++]);

					for (int l13 = 0; l13 < 16; l13++)
						ydb[l13] = c.tc(abyte0[k3++]);

					aeb = c.tc(abyte0[k3++]);
					return;
				}
				if (l == 242) {
					for (int l3 = 0; l3 < 5; l3++)
						zdb[l3] = c.tc(abyte0[1 + l3]);

					return;
				}
				if (l == 241) {
					mhb = 250;
					return;
				}
				if (l == 240) {
					int i4 = (i1 - 1) / 4;
					for (int j9 = 0; j9 < i4; j9++) {
						int i14 = gcb + c.bd(abyte0, 1 + j9 * 4) >> 3;
						int k17 = hcb + c.bd(abyte0, 3 + j9 * 4) >> 3;
						int j20 = 0;
						for (int l23 = 0; l23 < scb; l23++) {
							int j28 = (ucb[l23] >> 3) - i14;
							int k31 = (vcb[l23] >> 3) - k17;
							if (j28 != 0 || k31 != 0) {
								if (l23 != j20) {
									ucb[j20] = ucb[l23];
									vcb[j20] = vcb[l23];
									wcb[j20] = wcb[l23];
									xcb[j20] = xcb[l23];
								}
								j20++;
							}
						}

						scb = j20;
						j20 = 0;
						for (int k28 = 0; k28 < zcb; k28++) {
							int l31 = (bdb[k28] >> 3) - i14;
							int i34 = (cdb[k28] >> 3) - k17;
							if (l31 != 0 || i34 != 0) {
								if (k28 != j20) {
									adb[j20] = adb[k28];
									adb[j20].pv = j20;
									bdb[j20] = bdb[k28];
									cdb[j20] = cdb[k28];
									ddb[j20] = ddb[k28];
									edb[j20] = edb[k28];
								}
								j20++;
							} else {
								fab.bb(adb[k28]);
								abb.gd(bdb[k28], cdb[k28], ddb[k28]);
							}
						}

						zcb = j20;
						j20 = 0;
						for (int i32 = 0; i32 < idb; i32++) {
							int j34 = (kdb[i32] >> 3) - i14;
							int k36 = (ldb[i32] >> 3) - k17;
							if (j34 != 0 || k36 != 0) {
								if (i32 != j20) {
									jdb[j20] = jdb[i32];
									jdb[j20].pv = j20 + 10000;
									kdb[j20] = kdb[i32];
									ldb[j20] = ldb[i32];
									mdb[j20] = mdb[i32];
									ndb[j20] = ndb[i32];
								}
								j20++;
							} else {
								fab.bb(jdb[i32]);
								abb.ke(kdb[i32], ldb[i32], mdb[i32], ndb[i32]);
							}
						}

						idb = j20;
					}

					return;
				}
				if (l == 239) {
					ulb = true;
					return;
				}
				if (l == 238) {
					int j4 = c.vc(abyte0, 1);
					if (ccb[j4] != null)
						agb = ccb[j4].jy;
					zfb = true;
					hgb = false;
					igb = false;
					bgb = 0;
					egb = 0;
					return;
				}
				if (l == 237) {
					zfb = false;
					return;
				}
				if (l == 236) {
					egb = abyte0[1] & 0xff;
					int k4 = 2;
					for (int k9 = 0; k9 < egb; k9++) {
						fgb[k9] = c.vc(abyte0, k4);
						k4 += 2;
						ggb[k9] = c.vc(abyte0, k4);
						k4 += 2;
					}

					hgb = false;
					igb = false;
					return;
				}
				if (l == 235) {
					byte byte0 = abyte0[1];
					if (byte0 == 1) {
						hgb = true;
						return;
					} else {
						hgb = false;
						return;
					}
				}
				if (l == 234) {
					lgb = true;
					int l4 = 1;
					int l9 = abyte0[l4++] & 0xff;
					byte byte2 = abyte0[l4++];
					mgb = abyte0[l4++] & 0xff;
					ngb = abyte0[l4++] & 0xff;
					for (int l17 = 0; l17 < 40; l17++)
						ogb[l17] = -1;

					for (int k20 = 0; k20 < l9; k20++) {
						ogb[k20] = c.vc(abyte0, l4);
						l4 += 2;
						pgb[k20] = c.vc(abyte0, l4);
						l4 += 2;
						qgb[k20] = abyte0[l4++];
					}

					if (byte2 == 1) {
						int i24 = 39;
						for (int l28 = 0; l28 < rdb; l28++) {
							if (i24 < l9)
								break;
							boolean flag2 = false;
							for (int k34 = 0; k34 < 40; k34++) {
								if (ogb[k34] != sdb[l28])
									continue;
								flag2 = true;
								break;
							}

							if (sdb[l28] == 10)
								flag2 = true;
							if (!flag2) {
								ogb[i24] = sdb[l28] & 0x7fff;
								pgb[i24] = 0;
								qgb[i24] = 0;
								i24--;
							}
						}

					}
					if (rgb >= 0 && rgb < 40 && ogb[rgb] != sgb) {
						rgb = -1;
						sgb = -2;
						return;
					}
				} else {
					if (l == 233) {
						lgb = false;
						return;
					}
					if (l == 229) {
						byte byte1 = abyte0[1];
						if (byte1 == 1) {
							igb = true;
							return;
						} else {
							igb = false;
							return;
						}
					}
					if (l == 228) {
						System.out.println("Got config");
						ueb = c.tc(abyte0[1]) == 1;
						teb = c.tc(abyte0[2]) == 1;
						dhb = c.tc(abyte0[3]);
						cfb = c.tc(abyte0[4]) == 1;
						return;
					}
					if (l == 227) {
						for (int i5 = 0; i5 < i1 - 1; i5++)
							reb[i5] = abyte0[i5 + 1] == 1;

						return;
					}
					if (l == 226) {
						for (int j5 = 0; j5 < oeb; j5++)
							qeb[j5] = abyte0[j5 + 1] == 1;

						return;
					}
					if (l == 225) {
						djb = 1;
						return;
					}
					if (l == 224) {
						rkb = true;
						for (int k5 = 0; k5 < 5; k5++) {
							alb[k5] = k5;
							blb[k5] = "~:" + alb[k5];
							skb.zj(xkb[k5], "");
							skb.zj(wkb[k5], (k5 + 1) + ": " + jmb[alb[k5]]);
						}

						return;
					}
					if (l == 223) {
						qdb = abyte0[1] & 0xff;
						return;
					}
					if (l == 222) {
						tgb = true;
						ugb = 0;
						for (int l5 = 8; l5 + 9 < i1 * 8;) {
							vgb[ugb] = c.qc(abyte0, l5, 10);
							l5 += 10;
							int i10 = c.qc(abyte0, l5, 1);
							l5++;
							if (i10 == 0) {
								wgb[ugb] = c.qc(abyte0, l5, 8);
								l5 += 8;
							} else {
								wgb[ugb] = c.qc(abyte0, l5, 24);
								l5 += 24;
							}
							ugb++;
						}

						for (int j10 = 0; j10 < rdb; j10++) {
							if (ugb >= 48)
								break;
							int j14 = sdb[j10];
							boolean flag1 = false;
							for (int l20 = 0; l20 < ugb; l20++) {
								if (vgb[l20] != j14)
									continue;
								flag1 = true;
								break;
							}

							if (!flag1) {
								vgb[ugb] = j14;
								wgb[ugb] = 0;
								ugb++;
							}
						}

						return;
					}
					if (l == 221)
						tgb = false;
				}
			}
			return;
		}
		catch (RuntimeException runtimeexception) {
			if (uz < 3) {
				super.zf.gc(17);
				super.zf.zb(runtimeexception.toString());
				on();
				super.zf.gc(17);
				super.zf.zb("p-type:" + l + " p-size:" + i1);
				on();
				super.zf.gc(17);
				super.zf.zb("rx:" + gcb + " ry:" + hcb + " num3l:" + zcb);
				on();
				String s = "";
				for (int k14 = 0; k14 < 80 && k14 < i1; k14++)
					s = s + abyte0[k14] + " ";

				super.zf.gc(17);
				super.zf.zb(s);
				on();
				uz++;
			}
		}
	}

	public boolean xp(int l) {
		int i1 = fcb.my / 128;
		int j1 = fcb.ny / 128;
		for (int k1 = 2; k1 >= 1; k1--) {
			if (l == 1 && ((abb.ef[i1][j1 - k1] & 0x80) == 128 || (abb.ef[i1 - k1][j1] & 0x80) == 128 || (abb.ef[i1 - k1][j1 - k1] & 0x80) == 128))
				return false;
			if (l == 3 && ((abb.ef[i1][j1 + k1] & 0x80) == 128 || (abb.ef[i1 - k1][j1] & 0x80) == 128 || (abb.ef[i1 - k1][j1 + k1] & 0x80) == 128))
				return false;
			if (l == 5 && ((abb.ef[i1][j1 + k1] & 0x80) == 128 || (abb.ef[i1 + k1][j1] & 0x80) == 128 || (abb.ef[i1 + k1][j1 + k1] & 0x80) == 128))
				return false;
			if (l == 7 && ((abb.ef[i1][j1 - k1] & 0x80) == 128 || (abb.ef[i1 + k1][j1] & 0x80) == 128 || (abb.ef[i1 + k1][j1 - k1] & 0x80) == 128))
				return false;
			if (l == 0 && (abb.ef[i1][j1 - k1] & 0x80) == 128)
				return false;
			if (l == 2 && (abb.ef[i1 - k1][j1] & 0x80) == 128)
				return false;
			if (l == 4 && (abb.ef[i1][j1 + k1] & 0x80) == 128)
				return false;
			if (l == 6 && (abb.ef[i1 + k1][j1] & 0x80) == 128)
				return false;
		}

		return true;
	}

	public void sn() {
		if ((tbb & 1) == 1 && xp(tbb))
			return;
		if ((tbb & 1) == 0 && xp(tbb)) {
			if (xp(tbb + 1 & 7)) {
				tbb = tbb + 1 & 7;
				return;
			}
			if (xp(tbb + 7 & 7))
				tbb = tbb + 7 & 7;
			return;
		}
		int ai[] = {
			1, -1, 2, -2, 3, -3, 4
		};
		for (int l = 0; l < 7; l++) {
			if (!xp(tbb + ai[l] + 8 & 7))
				continue;
			tbb = tbb + ai[l] + 8 & 7;
			break;
		}

		if ((tbb & 1) == 0 && xp(tbb)) {
			if (xp(tbb + 1 & 7)) {
				tbb = tbb + 1 & 7;
				return;
			}
			if (xp(tbb + 7 & 7))
				tbb = tbb + 7 & 7;
			return;
		} else {
			return;
		}
	}

	public void nn() {
		if (mhb != 0) {
			gab.ig();
			gab.tg("Oh dear! You are dead...", lab / 2, mab / 2, 7, 0xff0000);
			kn();
			gab.dg(eab, 0, 11);
			return;
		}
		if (djb != 0) {
			co();
			return;
		}
		if (ulb) {
			vp();
			return;
		}
		if (rkb) {
			rp();
			return;
		}
		if (!abb.gf)
			return;
		for (int l = 0; l < 64; l++) {
			fab.bb(abb.jf[ebb][l]);
			if (ebb == 0) {
				fab.bb(abb._fldif[1][l]);
				fab.bb(abb.jf[1][l]);
				fab.bb(abb._fldif[2][l]);
				fab.bb(abb.jf[2][l]);
			}
			qbb = true;
			if (ebb == 0 && (abb.ef[fcb.my / 128][fcb.ny / 128] & 0x80) == 0) {
				fab.hb(abb.jf[ebb][l]);
				if (ebb == 0) {
					fab.hb(abb._fldif[1][l]);
					fab.hb(abb.jf[1][l]);
					fab.hb(abb._fldif[2][l]);
					fab.hb(abb.jf[2][l]);
				}
				qbb = false;
			}
		}

		if (tab != vab) {
			vab = tab;
			for (int i1 = 0; i1 < zcb; i1++) {
				if (ddb[i1] == 51) {
					int l1 = bdb[i1];
					int l2 = cdb[i1];
					int i4 = l1 - fcb.my / 128;
					int j5 = l2 - fcb.ny / 128;
					byte byte0 = 7;
					if (l1 >= 0 && l2 >= 0 && l1 < 96 && l2 < 96 && i4 > -byte0 && i4 < byte0 && j5 > -byte0 && j5 < byte0) {
						fab.bb(adb[i1]);
						String s1 = "torcha" + (tab + 1);
						int k9 = j.sh(s1);
						p p1 = fdb[k9].zl();
						fab.hb(p1);
						p1.nm(true, 48, 48, -50, -10, -50);
						p1.jm(adb[i1]);
						p1.pv = i1;
						adb[i1] = p1;
					}
				}
				if (ddb[i1] == 143) {
					int i2 = bdb[i1];
					int i3 = cdb[i1];
					int j4 = i2 - fcb.my / 128;
					int k5 = i3 - fcb.ny / 128;
					byte byte1 = 7;
					if (i2 >= 0 && i3 >= 0 && i2 < 96 && i3 < 96 && j4 > -byte1 && j4 < byte1 && k5 > -byte1 && k5 < byte1) {
						fab.bb(adb[i1]);
						String s2 = "skulltorcha" + (tab + 1);
						int l9 = j.sh(s2);
						p p2 = fdb[l9].zl();
						fab.hb(p2);
						p2.nm(true, 48, 48, -50, -10, -50);
						p2.jm(adb[i1]);
						p2.pv = i1;
						adb[i1] = p2;
					}
				}
			}

		}
		if (uab != wab) {
			wab = uab;
			for (int j1 = 0; j1 < zcb; j1++)
				if (ddb[j1] == 97) {
					int j2 = bdb[j1];
					int j3 = cdb[j1];
					int k4 = j2 - fcb.my / 128;
					int l5 = j3 - fcb.ny / 128;
					byte byte2 = 9;
					if (j2 >= 0 && j3 >= 0 && j2 < 96 && j3 < 96 && k4 > -byte2 && k4 < byte2 && l5 > -byte2 && l5 < byte2) {
						fab.bb(adb[j1]);
						String s3 = "firea" + (uab + 1);
						int i10 = j.sh(s3);
						p p3 = fdb[i10].zl();
						fab.hb(p3);
						p3.nm(true, 48, 48, -50, -10, -50);
						p3.jm(adb[j1]);
						p3.pv = j1;
						adb[j1] = p3;
					}
				}

		}
		fab.s(bcb);
		bcb = 0;
		for (int k1 = 0; k1 < zbb; k1++) {
			r r1 = dcb[k1];
			if (r1.jz != 255) {
				int k3 = r1.my;
				int l4 = r1.ny;
				int i6 = -abb.vd(k3, l4);
				int l7 = fab.z(5000 + k1, k3, i6, l4, 145, 220, k1 + 10000);
				bcb++;
				if (r1 == fcb)
					fab.ab(l7);
				if (r1.qy == 8)
					fab.ib(l7, -30);
				if (r1.qy == 9)
					fab.ib(l7, 30);
			}
		}

		for (int k2 = 0; k2 < zbb; k2++) {
			r r2 = dcb[k2];
			if (r2.oz > 0) {
				r r3 = null;
				if (r2.nz != -1)
					r3 = ncb[r2.nz];
				else
				if (r2.mz != -1)
					r3 = ccb[r2.mz];
				if (r3 != null) {
					int j6 = r2.my;
					int i8 = r2.ny;
					int i9 = -abb.vd(j6, i8) - 110;
					int j10 = r3.my;
					int l10 = r3.ny;
					int i11 = -abb.vd(j10, l10) - j.mm[r3.oy] / 2;
					int j11 = (j6 * r2.oz + j10 * (qab - r2.oz)) / qab;
					int k11 = (i9 * r2.oz + i11 * (qab - r2.oz)) / qab;
					int l11 = (i8 * r2.oz + l10 * (qab - r2.oz)) / qab;
					fab.z(rab + r2.lz, j11, k11, l11, 32, 32, 0);
					bcb++;
				}
			}
		}

		for (int l3 = 0; l3 < lcb; l3++) {
			r r4 = ocb[l3];
			int k6 = r4.my;
			int j8 = r4.ny;
			int j9 = -abb.vd(k6, j8);
			int k10 = fab.z(20000 + l3, k6, j9, j8, j.lm[r4.oy], j.mm[r4.oy], l3 + 30000);
			bcb++;
			if (r4.qy == 8)
				fab.ib(k10, -30);
			if (r4.qy == 9)
				fab.ib(k10, 30);
		}

		for (int i5 = 0; i5 < scb; i5++) {
			int l6 = ucb[i5] * jab + 64;
			int k8 = vcb[i5] * jab + 64;
			fab.z(40000 + wcb[i5], l6, -abb.vd(l6, k8) - xcb[i5], k8, 96, 64, i5 + 20000);
			bcb++;
		}

		gab.mj = false;
		gab.zf();
		gab.mj = super.js;
		if (ebb == 3) {
			int i7 = 40 + (int)(Math.random() * 3D);
			int l8 = 40 + (int)(Math.random() * 7D);
			fab.ub(true, i7, l8, -50, -10, -50);
		}
		ilb = 0;
		clb = 0;
		nlb = 0;
		if (seb) {
			if (teb && !qbb) {
				int j7 = tbb;
				sn();
				if (tbb != j7) {
					rbb = fcb.my;
					sbb = fcb.ny;
				}
			}
			fab.g = 3000;
			fab.h = 3000;
			fab.i = 1;
			fab.j = 2800;
			vbb = tbb * 32;
			fab.g(rbb, -abb.vd(rbb, sbb), sbb, 912, vbb * 4, 0, 2000);
		} else {
			if (teb && !qbb)
				sn();
			if (!super.js) {
				fab.g = 2400;
				fab.h = 2400;
				fab.i = 1;
				fab.j = 2300;
			} else {
				fab.g = 2200;
				fab.h = 2200;
				fab.i = 1;
				fab.j = 2100;
			}
			fab.g(rbb, -abb.vd(rbb, sbb), sbb, 912, vbb * 4, 0, pbb * 2);
		}
		fab.i();
		bp();
		if (xab > 0)
			gab.qf(yab - 8, zab - 8, pab + 14 + (24 - xab) / 6);
		if (xab < 0)
			gab.qf(yab - 8, zab - 8, pab + 18 + (24 + xab) / 6);
		gab.ah("Fps: " + super.os, 450, mab - 10, 1, 0xffff00);
		if (vfb == 0) {
			for (int k7 = 0; k7 < wfb; k7++)
				if (yfb[k7] > 0) {
					String s = xfb[k7];
					gab.ah(s, 7, mab - 18 - k7 * 12, 1, 0xffff00);
				}

		}
		qfb.wk(rfb);
		qfb.wk(tfb);
		qfb.wk(ufb);
		if (vfb == 1)
			qfb.dk(rfb);
		else
		if (vfb == 2)
			qfb.dk(tfb);
		else
		if (vfb == 3)
			qfb.dk(ufb);
		o.iu = 2;
		qfb.hk();
		o.iu = 0;
		gab.gg(((i) (gab)).ni - 3 - 197, 3, pab, 128);
		_mthdo();
		gab.qj = false;
		kn();
		gab.dg(eab, 0, 11);
	}

	public void kn() {
		gab.qf(0, mab - 4, pab + 23);
		int l = i.qg(200, 200, 255);
		if (vfb == 0)
			l = i.qg(255, 200, 50);
		if (mfb % 30 > 15)
			l = i.qg(255, 50, 50);
		gab.tg("All messages", 54, mab + 6, 0, l);
		l = i.qg(200, 200, 255);
		if (vfb == 1)
			l = i.qg(255, 200, 50);
		if (nfb % 30 > 15)
			l = i.qg(255, 50, 50);
		gab.tg("Chat history", 155, mab + 6, 0, l);
		l = i.qg(200, 200, 255);
		if (vfb == 2)
			l = i.qg(255, 200, 50);
		if (ofb % 30 > 15)
			l = i.qg(255, 50, 50);
		gab.tg("Quest history", 255, mab + 6, 0, l);
		l = i.qg(200, 200, 255);
		if (vfb == 3)
			l = i.qg(255, 200, 50);
		if (pfb % 30 > 15)
			l = i.qg(255, 50, 50);
		gab.tg("Private history", 355, mab + 6, 0, l);
	}

	public void op(int l, int i1, int j1, int k1, int l1, int i2, int j2) {
		int k2 = j.zk[l1] + tcb;
		int l2 = j.ll[l1];
		gab.lh(l, i1, j1, k1, k2, l2, 0, 0, false);
	}

	public void gp(int l, int i1, int j1, int k1, int l1, int i2, int j2) {
		r r1 = ocb[l1];
		int k2 = r1.qy + (vbb + 16) / 32 & 7;
		boolean flag = false;
		int l2 = k2;
		if (l2 == 5) {
			l2 = 3;
			flag = true;
		} else
		if (l2 == 6) {
			l2 = 2;
			flag = true;
		} else
		if (l2 == 7) {
			l2 = 1;
			flag = true;
		}
		int i3 = l2 * 3 + gmb[(r1.py / j.nm[r1.oy]) % 4];
		if (r1.qy == 8) {
			l2 = 5;
			byte byte0 = 2;
			flag = false;
			l -= (j.pm[r1.oy] * j2) / 100;
			i3 = l2 * 3 + hmb[(yz / (j.om[r1.oy] - 1)) % 8];
		} else
		if (r1.qy == 9) {
			l2 = 5;
			byte byte1 = 2;
			flag = true;
			l += (j.pm[r1.oy] * j2) / 100;
			i3 = l2 * 3 + imb[(yz / j.om[r1.oy]) % 8];
		}
		for (int j3 = 0; j3 < 12; j3++) {
			int k3 = tlb[l2][j3];
			int j4 = j.gm[r1.oy][k3];
			if (j4 >= 0) {
				int l4 = 0;
				int i5 = 0;
				int j5 = i3;
				if (flag && l2 >= 1 && l2 <= 3 && j.ym[j4] == 1)
					j5 += 15;
				if (l2 != 5 || j.xm[j4] == 1) {
					int k5 = j5 + j.zm[j4];
					l4 = (l4 * j1) / ((i) (gab)).ej[k5];
					i5 = (i5 * k1) / ((i) (gab)).fj[k5];
					int l5 = (j1 * ((i) (gab)).ej[k5]) / ((i) (gab)).ej[j.zm[j4]];
					l4 -= (l5 - j1) / 2;
					int i6 = j.vm[j4];
					int j6 = 0;
					if (i6 == 1) {
						i6 = j.hm[r1.oy];
						j6 = j.km[r1.oy];
					} else
					if (i6 == 2) {
						i6 = j.im[r1.oy];
						j6 = j.km[r1.oy];
					} else
					if (i6 == 3) {
						i6 = j.jm[r1.oy];
						j6 = j.km[r1.oy];
					}
					gab.lh(l + l4, i1 + i5, l5, k1, k5, i6, j6, i2, flag);
				}
			}
		}

		if (r1.yy > 0) {
			glb[clb] = gab.mf(r1.xy, 1) / 2;
			hlb[clb] = gab.of(1);
			if (glb[clb] > 300) {
				glb[clb] = 300;
				hlb[clb] *= 2;
			}
			elb[clb] = l + j1 / 2;
			flb[clb] = i1;
			dlb[clb++] = r1.xy;
		}
		if (r1.qy == 8 || r1.qy == 9 || r1.ez != 0) {
			if (r1.ez > 0) {
				int l3 = l;
				if (r1.qy == 8)
					l3 -= (20 * j2) / 100;
				else
				if (r1.qy == 9)
					l3 += (20 * j2) / 100;
				int k4 = (r1.cz * 30) / r1.dz;
				olb[nlb] = l3 + j1 / 2;
				plb[nlb] = i1;
				qlb[nlb++] = k4;
			}
			if (r1.ez > 150) {
				int i4 = l;
				if (r1.qy == 8)
					i4 -= (10 * j2) / 100;
				else
				if (r1.qy == 9)
					i4 += (10 * j2) / 100;
				gab.qf((i4 + j1 / 2) - 12, (i1 + k1 / 2) - 12, pab + 12);
				gab.tg(String.valueOf(r1.bz), (i4 + j1 / 2) - 1, i1 + k1 / 2 + 5, 3, 0xffffff);
			}
		}
	}

	public void ko(int l, int i1, int j1, int k1, int l1, int i2, int j2) {
		r r1 = dcb[l1];
		if (r1.jz == 255)
			return;
		int k2 = r1.qy + (vbb + 16) / 32 & 7;
		boolean flag = false;
		int l2 = k2;
		if (l2 == 5) {
			l2 = 3;
			flag = true;
		} else
		if (l2 == 6) {
			l2 = 2;
			flag = true;
		} else
		if (l2 == 7) {
			l2 = 1;
			flag = true;
		}
		int i3 = l2 * 3 + gmb[(r1.py / 6) % 4];
		if (r1.qy == 8) {
			l2 = 5;
			k2 = 2;
			flag = false;
			l -= (5 * j2) / 100;
			i3 = l2 * 3 + hmb[(yz / 5) % 8];
		} else
		if (r1.qy == 9) {
			l2 = 5;
			k2 = 2;
			flag = true;
			l += (5 * j2) / 100;
			i3 = l2 * 3 + imb[(yz / 6) % 8];
		}
		for (int j3 = 0; j3 < 12; j3++) {
			int k3 = tlb[k2][j3];
			int k4 = r1.wy[k3] - 1;
			if (k4 >= 0) {
				int j5 = 0;
				int l5 = 0;
				int i6 = i3;
				if (flag && l2 >= 1 && l2 <= 3)
					if (j.ym[k4] == 1)
						i6 += 15;
					else
					if (k3 == 4 && l2 == 1) {
						j5 = -22;
						l5 = -3;
						i6 = l2 * 3 + gmb[(2 + r1.py / 6) % 4];
					} else
					if (k3 == 4 && l2 == 2) {
						j5 = 0;
						l5 = -8;
						i6 = l2 * 3 + gmb[(2 + r1.py / 6) % 4];
					} else
					if (k3 == 4 && l2 == 3) {
						j5 = 26;
						l5 = -5;
						i6 = l2 * 3 + gmb[(2 + r1.py / 6) % 4];
					} else
					if (k3 == 3 && l2 == 1) {
						j5 = 22;
						l5 = 3;
						i6 = l2 * 3 + gmb[(2 + r1.py / 6) % 4];
					} else
					if (k3 == 3 && l2 == 2) {
						j5 = 0;
						l5 = 8;
						i6 = l2 * 3 + gmb[(2 + r1.py / 6) % 4];
					} else
					if (k3 == 3 && l2 == 3) {
						j5 = -26;
						l5 = 5;
						i6 = l2 * 3 + gmb[(2 + r1.py / 6) % 4];
					}
				if (l2 != 5 || j.xm[k4] == 1) {
					int j6 = i6 + j.zm[k4];
					j5 = (j5 * j1) / ((i) (gab)).ej[j6];
					l5 = (l5 * k1) / ((i) (gab)).fj[j6];
					int k6 = (j1 * ((i) (gab)).ej[j6]) / ((i) (gab)).ej[j.zm[k4]];
					j5 -= (k6 - j1) / 2;
					int l6 = j.vm[k4];
					int i7 = fmb[r1.kz];
					if (l6 == 1)
						l6 = emb[r1.hz];
					else
					if (l6 == 2)
						l6 = dmb[r1.iz];
					else
					if (l6 == 3)
						l6 = dmb[r1.jz];
					gab.lh(l + j5, i1 + l5, k6, k1, j6, l6, i7, i2, flag);
				}
			}
		}

		if (r1.yy > 0) {
			glb[clb] = gab.mf(r1.xy, 1) / 2;
			hlb[clb] = gab.of(1);
			if (glb[clb] > 300) {
				glb[clb] = 300;
				hlb[clb] *= 2;
			}
			elb[clb] = l + j1 / 2;
			flb[clb] = i1;
			dlb[clb++] = r1.xy;
		}
		if (r1.az > 0) {
			jlb[ilb] = l + j1 / 2;
			klb[ilb] = i1;
			llb[ilb] = j2;
			mlb[ilb++] = r1.zy;
		}
		if (r1.qy == 8 || r1.qy == 9 || r1.ez != 0) {
			if (r1.ez > 0) {
				int l3 = l;
				if (r1.qy == 8)
					l3 -= (20 * j2) / 100;
				else
				if (r1.qy == 9)
					l3 += (20 * j2) / 100;
				int l4 = (r1.cz * 30) / r1.dz;
				olb[nlb] = l3 + j1 / 2;
				plb[nlb] = i1;
				qlb[nlb++] = l4;
			}
			if (r1.ez > 150) {
				int i4 = l;
				if (r1.qy == 8)
					i4 -= (10 * j2) / 100;
				else
				if (r1.qy == 9)
					i4 += (10 * j2) / 100;
				gab.qf((i4 + j1 / 2) - 12, (i1 + k1 / 2) - 12, pab + 11);
				gab.tg(String.valueOf(r1.bz), (i4 + j1 / 2) - 1, i1 + k1 / 2 + 5, 3, 0xffffff);
			}
		}
		if (r1.rz == 1 && r1.az == 0) {
			int j4 = i2 + l + j1 / 2;
			if (r1.qy == 8)
				j4 -= (20 * j2) / 100;
			else
			if (r1.qy == 9)
				j4 += (20 * j2) / 100;
			int i5 = (16 * j2) / 100;
			int k5 = (16 * j2) / 100;
			gab.ug(j4 - i5 / 2, i1 - k5 / 2 - (10 * j2) / 100, i5, k5, pab + 13);
		}
	}

	public void bp() {
		for (int l = 0; l < clb; l++) {
			int i1 = elb[l];
			int k1 = flb[l];
			int j2 = glb[l];
			int i3 = hlb[l];
			boolean flag = true;
			while (flag)  {
				flag = false;
				for (int j4 = 0; j4 < l; j4++)
					if (k1 > flb[j4] - hlb[j4] && k1 - i3 < flb[j4] && i1 - j2 < elb[j4] + glb[j4] && i1 + j2 > elb[j4] - glb[j4]) {
						k1 = flb[j4] - i3;
						flag = true;
					}

			}
			flb[l] = k1;
			gab.fg(dlb[l], i1, k1, 1, 0xffff00, 300);
		}

		for (int j1 = 0; j1 < ilb; j1++) {
			int l1 = jlb[j1];
			int k2 = klb[j1];
			int j3 = llb[j1];
			int l3 = mlb[j1];
			int k4 = (39 * j3) / 100;
			int l4 = (27 * j3) / 100;
			int i5 = k2 - l4;
			gab.yf(l1 - k4 / 2, i5, k4, l4, pab + 9, 85);
			int j5 = (36 * j3) / 100;
			int k5 = (24 * j3) / 100;
			gab.lh(l1 - j5 / 2, (i5 + l4 / 2) - k5 / 2, j5, k5, j.zk[l3] + tcb, j.ll[l3], 0, 0, false);
		}

		for (int i2 = 0; i2 < nlb; i2++) {
			int l2 = olb[i2];
			int k3 = plb[i2];
			int i4 = qlb[i2];
			gab.fh(l2 - 15, k3 - 3, i4, 5, 65280, 192);
			gab.fh((l2 - 15) + i4, k3 - 3, 30 - i4, 5, 0xff0000, 192);
		}

	}

	public int po(int l) {
		int i1 = 0;
		for (int j1 = 0; j1 < rdb; j1++)
			if (sdb[j1] == l)
				if (j.bl[l] == 1)
					i1++;
				else
					i1 += tdb[j1];

		return i1;
	}

	public boolean pn(int l, int i1) {
		if (l == 31 && io(197))
			return true;
		if (l == 32 && io(102))
			return true;
		if (l == 33 && io(101))
			return true;
		if (l == 34 && io(103))
			return true;
		return po(l) >= i1;
	}

	public boolean io(int l) {
		for (int i1 = 0; i1 < rdb; i1++)
			if (sdb[i1] == l && udb[i1] == 1)
				return true;

		return false;
	}

	public void jn(int l, int i1, int j1) {
		gab.xg(l, i1, j1);
		gab.xg(l - 1, i1, j1);
		gab.xg(l + 1, i1, j1);
		gab.xg(l, i1 - 1, j1);
		gab.xg(l, i1 + 1, j1);
	}

	public void lp(int l, int i1, int j1, int k1, boolean flag) {
		jo(l, i1, j1, k1, j1, k1, false, flag);
	}

	public void xn(int l, int i1, int j1, int k1, boolean flag) {
		if (jo(l, i1, j1, k1, j1, k1, false, flag)) {
			return;
		} else {
			jo(l, i1, j1, k1, j1, k1, true, flag);
			return;
		}
	}

	public void np(int l, int i1, int j1, int k1) {
		int l1;
		int i2;
		if (j1 == 0 || j1 == 4) {
			l1 = j.gn[k1];
			i2 = j.hn[k1];
		} else {
			i2 = j.gn[k1];
			l1 = j.hn[k1];
		}
		if (j.in[k1] == 2 || j.in[k1] == 3) {
			if (j1 == 0) {
				l--;
				l1++;
			}
			if (j1 == 2)
				i2++;
			if (j1 == 4)
				l1++;
			if (j1 == 6) {
				i1--;
				i2++;
			}
			jo(gcb, hcb, l, i1, (l + l1) - 1, (i1 + i2) - 1, false, true);
			return;
		} else {
			jo(gcb, hcb, l, i1, (l + l1) - 1, (i1 + i2) - 1, true, true);
			return;
		}
	}

	public void jp(int l, int i1, int j1) {
		if (j1 == 0) {
			jo(gcb, hcb, l, i1 - 1, l, i1, false, true);
			return;
		}
		if (j1 == 1) {
			jo(gcb, hcb, l - 1, i1, l, i1, false, true);
			return;
		} else {
			jo(gcb, hcb, l, i1, l, i1, true, true);
			return;
		}
	}

	public boolean jo(int l, int i1, int j1, int k1, int l1, int i2, boolean flag, 
			boolean flag1) {
		int j2 = abb.od(l, i1, j1, k1, l1, i2, cab, dab, flag);
		if (j2 == -1)
			return false;
		j2--;
		l = cab[j2];
		i1 = dab[j2];
		j2--;
		if (flag1)
			super.zf.gc(215);
		else
			super.zf.gc(255);
		super.zf.ec(l + fbb);
		super.zf.ec(i1 + gbb);
		for (int k2 = j2; k2 >= 0 && k2 > j2 - 25; k2--) {
			super.zf.fc(cab[k2] - l);
			super.zf.fc(dab[k2] - i1);
		}

		on();
		xab = -24;
		yab = super.ds;
		zab = super.es;
		return true;
	}

	public boolean bo(int l, int i1) {
		if (mhb != 0) {
			abb.gf = false;
			return false;
		}
		l += bbb;
		i1 += cbb;
		if (ebb == hbb && l > ibb && l < kbb && i1 > jbb && i1 < lbb) {
			abb.gf = true;
			return false;
		}
		gab.tg("Loading... Please wait", 256, 192, 1, 0xffffff);
		kn();
		gab.dg(eab, 0, 11);
		int j1 = fbb;
		int k1 = gbb;
		int l1 = (l + 24) / 48;
		int i2 = (i1 + 24) / 48;
		ebb = hbb;
		fbb = l1 * 48 - 48;
		gbb = i2 * 48 - 48;
		ibb = l1 * 48 - 32;
		jbb = i2 * 48 - 32;
		kbb = l1 * 48 + 32;
		lbb = i2 * 48 + 32;
		abb.md(l, i1, ebb);
		fbb -= bbb;
		gbb -= cbb;
		int j2 = fbb - j1;
		int k2 = gbb - k1;
		for (int l2 = 0; l2 < zcb; l2++) {
			bdb[l2] -= j2;
			cdb[l2] -= k2;
			int i3 = bdb[l2];
			int k3 = cdb[l2];
			int j4 = ddb[l2];
			p p1 = adb[l2];
			try {
				int k5 = edb[l2];
				int j6;
				int l6;
				if (k5 == 0 || k5 == 4) {
					j6 = j.gn[j4];
					l6 = j.hn[j4];
				} else {
					l6 = j.gn[j4];
					j6 = j.hn[j4];
				}
				int i7 = ((i3 + i3 + j6) * jab) / 2;
				int j7 = ((k3 + k3 + l6) * jab) / 2;
				if (i3 >= 0 && k3 >= 0 && i3 < 96 && k3 < 96) {
					fab.hb(p1);
					p1.pl(i7, -abb.vd(i7, j7), j7);
					abb.jd(i3, k3, j4);
					if (j4 == 74)
						p1.dm(0, -480, 0);
				}
			}
			catch (RuntimeException runtimeexception) {
				System.out.println("Loc Error: " + runtimeexception.getMessage());
				System.out.println("i:" + l2 + " obj:" + p1);
				runtimeexception.printStackTrace();
			}
		}

		for (int j3 = 0; j3 < idb; j3++) {
			kdb[j3] -= j2;
			ldb[j3] -= k2;
			int l3 = kdb[j3];
			int k4 = ldb[j3];
			int i5 = ndb[j3];
			int l5 = mdb[j3];
			try {
				abb.ed(l3, k4, l5, i5);
				p p2 = fn(l3, k4, l5, i5, j3);
				jdb[j3] = p2;
			}
			catch (RuntimeException runtimeexception1) {
				System.out.println("Bound Error: " + runtimeexception1.getMessage());
				runtimeexception1.printStackTrace();
			}
		}

		for (int i4 = 0; i4 < scb; i4++) {
			ucb[i4] -= j2;
			vcb[i4] -= k2;
		}

		for (int l4 = 0; l4 < zbb; l4++) {
			r r1 = dcb[l4];
			r1.my -= j2 * jab;
			r1.ny -= k2 * jab;
			for (int i6 = 0; i6 <= r1.ty; i6++) {
				r1.uy[i6] -= j2 * jab;
				r1.vy[i6] -= k2 * jab;
			}

		}

		for (int j5 = 0; j5 < lcb; j5++) {
			r r2 = ocb[j5];
			r2.my -= j2 * jab;
			r2.ny -= k2 * jab;
			for (int k6 = 0; k6 <= r2.ty; k6++) {
				r2.uy[k6] -= j2 * jab;
				r2.vy[k6] -= k2 * jab;
			}

		}

		abb.gf = true;
		return true;
	}

	public p fn(int l, int i1, int j1, int k1, int l1) {
		int i2 = l;
		int j2 = i1;
		int k2 = l;
		int l2 = i1;
		int i3 = j.rn[k1];
		int j3 = j.sn[k1];
		int k3 = j.qn[k1];
		p p1 = new p(4, 1);
		if (j1 == 0)
			k2 = l + 1;
		if (j1 == 1)
			l2 = i1 + 1;
		if (j1 == 2) {
			i2 = l + 1;
			l2 = i1 + 1;
		}
		if (j1 == 3) {
			k2 = l + 1;
			l2 = i1 + 1;
		}
		i2 *= jab;
		j2 *= jab;
		k2 *= jab;
		l2 *= jab;
		int l3 = p1.em(i2, -abb.vd(i2, j2), j2);
		int i4 = p1.em(i2, -abb.vd(i2, j2) - k3, j2);
		int j4 = p1.em(k2, -abb.vd(k2, l2) - k3, l2);
		int k4 = p1.em(k2, -abb.vd(k2, l2), l2);
		int ai[] = {
			l3, i4, j4, k4
		};
		p1.gm(4, ai, i3, j3);
		p1.nm(false, 60, 24, -50, -10, -50);
		if (l >= 0 && i1 >= 0 && l < 96 && i1 < 96)
			fab.hb(p1);
		p1.pv = l1 + 10000;
		return p1;
	}

	public void _mthdo() {
		if (ihb != 0)
			yo();
		else
		if (tgb && jhb == 0)
			mo();
		else
		if (lgb && jhb == 0)
			lo();
		else
		if (zfb)
			wp();
		else
		if (ghb != 0)
			xo();
		else
		if (fhb != 0)
			tn();
		else
		if (ehb == 1)
			hp();
		else
		if (!lhb && khb > 0x2bf20 && jhb == 0) {
			fo();
		} else {
			if (zgb)
				vo();
			if (fcb.ez > 0)
				zo();
			up();
			boolean flag = !zgb && !veb;
			if (flag)
				afb = 0;
			if (pdb == 0 && flag)
				gn();
			if (pdb == 1)
				oo(flag);
			if (pdb == 2)
				rn(flag);
			if (pdb == 3)
				in(flag);
			if (pdb == 4)
				go(flag);
			if (pdb == 5)
				mn(flag);
			if (pdb == 6)
				to(flag);
			if (!veb && !zgb)
				no();
			if (veb && !zgb)
				tp();
		}
		aab = 0;
	}

	public void vo() {
		if (aab != 0) {
			for (int l = 0; l < ahb; l++) {
				if (super.ds >= gab.mf(bhb[l], 1) || super.es <= l * 12 || super.es >= 12 + l * 12)
					continue;
				super.zf.gc(237);
				super.zf.fc(l);
				on();
				break;
			}

			aab = 0;
			zgb = false;
			return;
		}
		for (int i1 = 0; i1 < ahb; i1++) {
			int j1 = 65535;
			if (super.ds < gab.mf(bhb[i1], 1) && super.es > i1 * 12 && super.es < 12 + i1 * 12)
				j1 = 0xff0000;
			gab.ah(bhb[i1], 6, 12 + i1 * 12, 1, j1);
		}

	}

	public void zo() {
		byte byte0 = 7;
		byte byte1 = 15;
		char c1 = '\257';
		if (aab != 0) {
			for (int l = 0; l < 5; l++) {
				if (l <= 0 || super.ds <= byte0 || super.ds >= byte0 + c1 || super.es <= byte1 + l * 20 || super.es >= byte1 + l * 20 + 20)
					continue;
				chb = l - 1;
				aab = 0;
				super.zf.gc(231);
				super.zf.fc(chb);
				on();
				break;
			}

		}
		for (int i1 = 0; i1 < 5; i1++) {
			if (i1 == chb + 1)
				gab.fh(byte0, byte1 + i1 * 20, c1, 20, i.qg(255, 0, 0), 128);
			else
				gab.fh(byte0, byte1 + i1 * 20, c1, 20, i.qg(190, 190, 190), 128);
			gab.sg(byte0, byte1 + i1 * 20, c1, 0);
			gab.sg(byte0, byte1 + i1 * 20 + 20, c1, 0);
		}

		gab.tg("Select combat style", byte0 + c1 / 2, byte1 + 16, 3, 0xffffff);
		gab.tg("Controlled (+1 of each)", byte0 + c1 / 2, byte1 + 36, 3, 0);
		gab.tg("Aggressive (+3 strength)", byte0 + c1 / 2, byte1 + 56, 3, 0);
		gab.tg("Accurate   (+3 attack)", byte0 + c1 / 2, byte1 + 76, 3, 0);
		gab.tg("Defensive  (+3 defense)", byte0 + c1 / 2, byte1 + 96, 3, 0);
	}

	public void fo() {
		if (aab != 0) {
			aab = 0;
			if (super.ds > 200 && super.ds < 300 && super.es > 230 && super.es < 253) {
				lhb = true;
				return;
			}
		}
		int l = 90;
		gab.rg(106, 70, 300, 190, 0);
		gab.ag(106, 70, 300, 190, 0xffffff);
		gab.tg("You have been playing for", 256, l, 4, 0xffffff);
		l += 20;
		gab.tg("over 1 hour. Please consider", 256, l, 4, 0xffffff);
		l += 20;
		gab.tg("visiting our advertiser if you", 256, l, 4, 0xffffff);
		l += 20;
		gab.tg("see an advert which interests you.", 256, l, 4, 0xffffff);
		l += 40;
		gab.tg("Doing so will help ensure", 256, l, 4, 0xffffff);
		l += 20;
		gab.tg("Runescape remains free.", 256, l, 4, 0xffffff);
		l += 40;
		int i1 = 0xffffff;
		if (super.ds > 200 && super.ds < 300 && super.es > l - 20 && super.es < l + 3)
			i1 = 0xffff00;
		gab.tg("Close", 256, l, 4, i1);
	}

	public void hp() {
		if (aab != 0) {
			aab = 0;
			char c1 = '\372';
			if (super.ds < 56 || super.es < 70 || super.ds > 456 || super.es > 260) {
				ehb = 0;
				return;
			}
			if (super.ds > 250 && super.ds < 350 && super.es > c1 - 20 && super.es < c1 + 3) {
				ehb = 0;
				return;
			}
			if (super.ds > 150 && super.ds < 250 && super.es > c1 - 20 && super.es < c1 + 3) {
				ueb = !ueb;
				super.zf.gc(213);
				super.zf.fc(1);
				super.zf.fc(ueb ? 1 : 0);
				super.zf.jc();
				ehb = 0;
				return;
			}
		}
		gab.rg(56, 70, 400, 190, 0);
		gab.ag(56, 70, 400, 190, 0xffffff);
		int l = 90;
		if (!ueb) {
			gab.tg("Are you sure you want to change", 256, l, 4, 0xffffff);
			l += 20;
			gab.tg("to being able to fight other players?", 256, l, 4, 0xffffff);
			l += 40;
			gab.tg("If you do other players will be able to", 256, l, 4, 0xffffff);
			l += 20;
			gab.tg("attack you, and you will probably die", 256, l, 4, 0xffffff);
			l += 20;
			gab.tg("much more often.", 256, l, 4, 0xffffff);
			l += 40;
		}
		if (ueb) {
			gab.tg("Are you sure you want to change", 256, l, 4, 0xffffff);
			l += 20;
			gab.tg("to not fighting other players?", 256, l, 4, 0xffffff);
			l += 40;
			gab.tg("This will make you safe from attack,", 256, l, 4, 0xffffff);
			l += 20;
			gab.tg("but will also preventing you from attacking", 256, l, 4, 0xffffff);
			l += 20;
			gab.tg("others (except in the arena - coming soon)", 256, l, 4, 0xffffff);
			l += 40;
		}
		if (dhb == 2) {
			gab.tg("You can only change a total of 2 times", 256, l, 4, 0xffffff);
			l += 20;
		}
		if (dhb == 1) {
			gab.tg("You will not be allowed to change back again", 256, l, 4, 0xffffff);
			l += 20;
		}
		l = 250;
		int i1 = 0xffffff;
		if (super.ds > 150 && super.ds < 250 && super.es > l - 20 && super.es < l + 3)
			i1 = 0xffff00;
		gab.tg("Yes I'm sure", 200, l, 4, i1);
		i1 = 0xffffff;
		if (super.ds > 250 && super.ds < 350 && super.es > l - 20 && super.es < l + 3)
			i1 = 0xffff00;
		gab.tg("No thanks", 300, l, 4, i1);
	}

	public void yo() {
		gab.rg(126, 137, 260, 60, 0);
		gab.ag(126, 137, 260, 60, 0xffffff);
		gab.tg("Logging out...", 256, 173, 5, 0xffffff);
	}

	public void xo() {
		if (aab != 0) {
			aab = 0;
			if (super.ds < 106 || super.es < 150 || super.ds > 406 || super.es > 210) {
				ghb = 0;
				return;
			}
		}
		int l = 150;
		gab.rg(106, l, 300, 60, 0);
		gab.ag(106, l, 300, 60, 0xffffff);
		l += 22;
		if (ghb == 1) {
			gab.tg("Please enter your new password", 256, l, 4, 0xffffff);
			l += 25;
			String s = "*";
			for (int i1 = 0; i1 < super.ks.length(); i1++)
				s = "X" + s;

			gab.tg(s, 256, l, 4, 0xffffff);
			if (super.ls.length() > 0) {
				hhb = super.ls;
				super.ks = "";
				super.ls = "";
				if (hhb.length() >= 5) {
					ghb = 2;
					return;
				} else {
					ghb = 5;
					return;
				}
			}
		} else
		if (ghb == 2) {
			gab.tg("Enter password again to confirm", 256, l, 4, 0xffffff);
			l += 25;
			String s1 = "*";
			for (int j1 = 0; j1 < super.ks.length(); j1++)
				s1 = "X" + s1;

			gab.tg(s1, 256, l, 4, 0xffffff);
			if (super.ls.length() > 0)
				if (super.ls.equalsIgnoreCase(hhb)) {
					ghb = 4;
					cf(hhb);
					return;
				} else {
					ghb = 3;
					return;
				}
		} else {
			if (ghb == 3) {
				gab.tg("Passwords do not match!", 256, l, 4, 0xffffff);
				l += 25;
				gab.tg("Press any key to close", 256, l, 4, 0xffffff);
				return;
			}
			if (ghb == 4) {
				gab.tg("Ok, your request has been sent", 256, l, 4, 0xffffff);
				l += 25;
				gab.tg("Press any key to close", 256, l, 4, 0xffffff);
				return;
			}
			if (ghb == 5) {
				gab.tg("Password must be at", 256, l, 4, 0xffffff);
				l += 25;
				gab.tg("least 5 letters long", 256, l, 4, 0xffffff);
			}
		}
	}

	public void tn() {
		if (aab != 0) {
			aab = 0;
			if (fhb == 1 && (super.ds < 106 || super.es < 145 || super.ds > 406 || super.es > 215)) {
				fhb = 0;
				return;
			}
			if (fhb == 2 && (super.ds < 6 || super.es < 145 || super.ds > 506 || super.es > 215)) {
				fhb = 0;
				return;
			}
			if (fhb == 3 && (super.ds < 106 || super.es < 145 || super.ds > 406 || super.es > 215)) {
				fhb = 0;
				return;
			}
			if (super.ds > 236 && super.ds < 276 && super.es > 193 && super.es < 213) {
				fhb = 0;
				return;
			}
		}
		int l = 145;
		if (fhb == 1) {
			gab.rg(106, l, 300, 70, 0);
			gab.ag(106, l, 300, 70, 0xffffff);
			l += 20;
			gab.tg("Enter name to add to friends list", 256, l, 4, 0xffffff);
			l += 20;
			gab.tg(super.ks + "*", 256, l, 4, 0xffffff);
			if (super.ls.length() > 0) {
				String s = super.ls.trim();
				super.ks = "";
				super.ls = "";
				fhb = 0;
				if (s.length() > 0 && c.dd(s) != fcb.iy)
					hf(s);
			}
		}
		if (fhb == 2) {
			gab.rg(6, l, 500, 70, 0);
			gab.ag(6, l, 500, 70, 0xffffff);
			l += 20;
			gab.tg("Enter message to send to " + c.zc(keb), 256, l, 4, 0xffffff);
			l += 20;
			gab.tg(super.ms + "*", 256, l, 4, 0xffffff);
			if (super.ns.length() > 0) {
				String s1 = super.ns;
				super.ms = "";
				super.ns = "";
				fhb = 0;
				qe(keb, s1);
			}
		}
		if (fhb == 3) {
			gab.rg(106, l, 300, 70, 0);
			gab.ag(106, l, 300, 70, 0xffffff);
			l += 20;
			gab.tg("Enter name to add to ignore list", 256, l, 4, 0xffffff);
			l += 20;
			gab.tg(super.ks + "*", 256, l, 4, 0xffffff);
			if (super.ls.length() > 0) {
				String s2 = super.ls.trim();
				super.ks = "";
				super.ls = "";
				fhb = 0;
				if (s2.length() > 0 && c.dd(s2) != fcb.iy)
					df(s2);
			}
		}
		int i1 = 0xffffff;
		if (super.ds > 236 && super.ds < 276 && super.es > 193 && super.es < 213)
			i1 = 0xffff00;
		gab.tg("Cancel", 256, 208, 1, i1);
	}

	public void mo() {
		char c1 = '\u0198';
		char c2 = '\u014E';
		if (xgb >= ugb)
			xgb = -1;
		if (xgb >= 0 && xgb < 48 && vgb[xgb] != ygb) {
			xgb = -1;
			ygb = -2;
		}
		if (aab != 0) {
			aab = 0;
			int l = super.ds - (256 - c1 / 2);
			int j1 = super.es - (170 - c2 / 2);
			if (l >= 0 && j1 >= 12 && l < 408 && j1 < 280) {
				int l1 = 0;
				for (int k2 = 0; k2 < 6; k2++) {
					for (int i6 = 0; i6 < 8; i6++) {
						int l6 = 7 + i6 * 49;
						int k7 = 28 + k2 * 34;
						if (l > l6 && l < l6 + 49 && j1 > k7 && j1 < k7 + 34 && l1 < ugb && vgb[l1] != -1) {
							ygb = vgb[l1];
							xgb = l1;
						}
						l1++;
					}

				}

				l = 256 - c1 / 2;
				j1 = 170 - c2 / 2;
				int j6;
				if (xgb < 0)
					j6 = -1;
				else
					j6 = vgb[xgb];
				if (j6 != -1) {
					int i2 = wgb[xgb];
					if (j.bl[j6] == 1 && i2 > 1)
						i2 = 1;
					if (i2 >= 1 && super.ds >= l + 220 && super.es >= j1 + 238 && super.ds < l + 250 && super.es <= j1 + 249) {
						super.zf.gc(206);
						super.zf.ec(j6);
						super.zf.ec(1);
						on();
					}
					if (i2 >= 5 && super.ds >= l + 250 && super.es >= j1 + 238 && super.ds < l + 280 && super.es <= j1 + 249) {
						super.zf.gc(206);
						super.zf.ec(j6);
						super.zf.ec(5);
						on();
					}
					if (i2 >= 25 && super.ds >= l + 280 && super.es >= j1 + 238 && super.ds < l + 305 && super.es <= j1 + 249) {
						super.zf.gc(206);
						super.zf.ec(j6);
						super.zf.ec(25);
						on();
					}
					if (i2 >= 100 && super.ds >= l + 305 && super.es >= j1 + 238 && super.ds < l + 335 && super.es <= j1 + 249) {
						super.zf.gc(206);
						super.zf.ec(j6);
						super.zf.ec(100);
						on();
					}
					if (i2 >= 500 && super.ds >= l + 335 && super.es >= j1 + 238 && super.ds < l + 368 && super.es <= j1 + 249) {
						super.zf.gc(206);
						super.zf.ec(j6);
						super.zf.ec(500);
						on();
					}
					if (i2 >= 2500 && super.ds >= l + 370 && super.es >= j1 + 238 && super.ds < l + 400 && super.es <= j1 + 249) {
						super.zf.gc(206);
						super.zf.ec(j6);
						super.zf.ec(2500);
						on();
					}
					if (po(j6) >= 1 && super.ds >= l + 220 && super.es >= j1 + 263 && super.ds < l + 250 && super.es <= j1 + 274) {
						super.zf.gc(205);
						super.zf.ec(j6);
						super.zf.ec(1);
						on();
					}
					if (po(j6) >= 5 && super.ds >= l + 250 && super.es >= j1 + 263 && super.ds < l + 280 && super.es <= j1 + 274) {
						super.zf.gc(205);
						super.zf.ec(j6);
						super.zf.ec(5);
						on();
					}
					if (po(j6) >= 25 && super.ds >= l + 280 && super.es >= j1 + 263 && super.ds < l + 305 && super.es <= j1 + 274) {
						super.zf.gc(205);
						super.zf.ec(j6);
						super.zf.ec(25);
						on();
					}
					if (po(j6) >= 100 && super.ds >= l + 305 && super.es >= j1 + 263 && super.ds < l + 335 && super.es <= j1 + 274) {
						super.zf.gc(205);
						super.zf.ec(j6);
						super.zf.ec(100);
						on();
					}
					if (po(j6) >= 500 && super.ds >= l + 335 && super.es >= j1 + 263 && super.ds < l + 368 && super.es <= j1 + 274) {
						super.zf.gc(205);
						super.zf.ec(j6);
						super.zf.ec(500);
						on();
					}
					if (po(j6) >= 2500 && super.ds >= l + 370 && super.es >= j1 + 263 && super.ds < l + 400 && super.es <= j1 + 274) {
						super.zf.gc(205);
						super.zf.ec(j6);
						super.zf.ec(2500);
						on();
					}
				}
			} else {
				super.zf.gc(207);
				on();
				tgb = false;
				return;
			}
		}
		int i1 = 256 - c1 / 2;
		int k1 = 170 - c2 / 2;
		gab.rg(i1, k1, 408, 12, 192);
		int j2 = 0x989898;
		gab.fh(i1, k1 + 12, 408, 17, j2, 160);
		gab.fh(i1, k1 + 29, 8, 204, j2, 160);
		gab.fh(i1 + 399, k1 + 29, 9, 204, j2, 160);
		gab.fh(i1, k1 + 233, 408, 47, j2, 160);
		gab.ah("Bank", i1 + 1, k1 + 10, 1, 0xffffff);
		int l2 = 0xffffff;
		if (super.ds > i1 + 320 && super.es >= k1 && super.ds < i1 + 408 && super.es < k1 + 12)
			l2 = 0xff0000;
		gab.kg("Close window", i1 + 406, k1 + 10, 1, l2);
		gab.ah("Number in bank in green", i1 + 7, k1 + 24, 1, 65280);
		gab.ah("Number held in blue", i1 + 289, k1 + 24, 1, 65535);
		int k6 = 0xd0d0d0;
		int i7 = 0;
		for (int l7 = 0; l7 < 6; l7++) {
			for (int i8 = 0; i8 < 8; i8++) {
				int k8 = i1 + 7 + i8 * 49;
				int l8 = k1 + 28 + l7 * 34;
				if (xgb == i7)
					gab.fh(k8, l8, 49, 34, 0xff0000, 160);
				else
					gab.fh(k8, l8, 49, 34, k6, 160);
				gab.ag(k8, l8, 50, 35, 0);
				if (i7 < ugb && vgb[i7] != -1) {
					gab.lh(k8, l8, 48, 32, tcb + j.zk[vgb[i7]], j.ll[vgb[i7]], 0, 0, false);
					gab.ah(String.valueOf(wgb[i7]), k8 + 1, l8 + 10, 1, 65280);
					gab.kg(String.valueOf(po(vgb[i7])), k8 + 47, l8 + 29, 1, 65535);
				}
				i7++;
			}

		}

		gab.sg(i1 + 5, k1 + 256, 398, 0);
		if (xgb == -1) {
			gab.tg("Select an object to withdraw or deposit", i1 + 204, k1 + 248, 3, 0xffff00);
			return;
		}
		int j8;
		if (xgb < 0)
			j8 = -1;
		else
			j8 = vgb[xgb];
		if (j8 != -1) {
			int j7 = wgb[xgb];
			if (j.bl[j8] == 1 && j7 > 1)
				j7 = 1;
			if (j7 > 0) {
				gab.ah("Withdraw " + j.vk[j8][0], i1 + 2, k1 + 248, 1, 0xffffff);
				int i3 = 0xffffff;
				if (super.ds >= i1 + 220 && super.es >= k1 + 238 && super.ds < i1 + 250 && super.es <= k1 + 249)
					i3 = 0xff0000;
				gab.ah("One", i1 + 222, k1 + 248, 1, i3);
				if (j7 >= 5) {
					int j3 = 0xffffff;
					if (super.ds >= i1 + 250 && super.es >= k1 + 238 && super.ds < i1 + 280 && super.es <= k1 + 249)
						j3 = 0xff0000;
					gab.ah("Five", i1 + 252, k1 + 248, 1, j3);
				}
				if (j7 >= 25) {
					int k3 = 0xffffff;
					if (super.ds >= i1 + 280 && super.es >= k1 + 238 && super.ds < i1 + 305 && super.es <= k1 + 249)
						k3 = 0xff0000;
					gab.ah("25", i1 + 282, k1 + 248, 1, k3);
				}
				if (j7 >= 100) {
					int l3 = 0xffffff;
					if (super.ds >= i1 + 305 && super.es >= k1 + 238 && super.ds < i1 + 335 && super.es <= k1 + 249)
						l3 = 0xff0000;
					gab.ah("100", i1 + 307, k1 + 248, 1, l3);
				}
				if (j7 >= 500) {
					int i4 = 0xffffff;
					if (super.ds >= i1 + 335 && super.es >= k1 + 238 && super.ds < i1 + 368 && super.es <= k1 + 249)
						i4 = 0xff0000;
					gab.ah("500", i1 + 337, k1 + 248, 1, i4);
				}
				if (j7 >= 2500) {
					int j4 = 0xffffff;
					if (super.ds >= i1 + 370 && super.es >= k1 + 238 && super.ds < i1 + 400 && super.es <= k1 + 249)
						j4 = 0xff0000;
					gab.ah("2500", i1 + 370, k1 + 248, 1, j4);
				}
			}
			if (po(j8) > 0) {
				gab.ah("Deposit " + j.vk[j8][0], i1 + 2, k1 + 273, 1, 0xffffff);
				int k4 = 0xffffff;
				if (super.ds >= i1 + 220 && super.es >= k1 + 263 && super.ds < i1 + 250 && super.es <= k1 + 274)
					k4 = 0xff0000;
				gab.ah("One", i1 + 222, k1 + 273, 1, k4);
				if (po(j8) >= 5) {
					int l4 = 0xffffff;
					if (super.ds >= i1 + 250 && super.es >= k1 + 263 && super.ds < i1 + 280 && super.es <= k1 + 274)
						l4 = 0xff0000;
					gab.ah("Five", i1 + 252, k1 + 273, 1, l4);
				}
				if (po(j8) >= 25) {
					int i5 = 0xffffff;
					if (super.ds >= i1 + 280 && super.es >= k1 + 263 && super.ds < i1 + 305 && super.es <= k1 + 274)
						i5 = 0xff0000;
					gab.ah("25", i1 + 282, k1 + 273, 1, i5);
				}
				if (po(j8) >= 100) {
					int j5 = 0xffffff;
					if (super.ds >= i1 + 305 && super.es >= k1 + 263 && super.ds < i1 + 335 && super.es <= k1 + 274)
						j5 = 0xff0000;
					gab.ah("100", i1 + 307, k1 + 273, 1, j5);
				}
				if (po(j8) >= 500) {
					int k5 = 0xffffff;
					if (super.ds >= i1 + 335 && super.es >= k1 + 263 && super.ds < i1 + 368 && super.es <= k1 + 274)
						k5 = 0xff0000;
					gab.ah("500", i1 + 337, k1 + 273, 1, k5);
				}
				if (po(j8) >= 2500) {
					int l5 = 0xffffff;
					if (super.ds >= i1 + 370 && super.es >= k1 + 263 && super.ds < i1 + 400 && super.es <= k1 + 274)
						l5 = 0xff0000;
					gab.ah("2500", i1 + 370, k1 + 273, 1, l5);
				}
			}
		}
	}

	public void lo() {
		if (aab != 0) {
			aab = 0;
			int l = super.ds - 52;
			int i1 = super.es - 44;
			if (l >= 0 && i1 >= 12 && l < 408 && i1 < 246) {
				int j1 = 0;
				for (int l1 = 0; l1 < 5; l1++) {
					for (int l2 = 0; l2 < 8; l2++) {
						int k3 = 7 + l2 * 49;
						int k4 = 28 + l1 * 34;
						if (l > k3 && l < k3 + 49 && i1 > k4 && i1 < k4 + 34 && ogb[j1] != -1) {
							rgb = j1;
							sgb = ogb[j1];
						}
						j1++;
					}

				}

				if (rgb >= 0) {
					int i3 = ogb[rgb];
					if (i3 != -1) {
						if (pgb[rgb] > 0 && l > 298 && i1 >= 204 && l < 408 && i1 <= 215) {
							int l3 = ngb + qgb[rgb];
							if (l3 < 10)
								l3 = 10;
							int l4 = (l3 * j.al[i3]) / 100;
							super.zf.gc(217);
							super.zf.ec(ogb[rgb]);
							super.zf.ec(l4);
							on();
						}
						if (po(i3) > 0 && l > 2 && i1 >= 229 && l < 112 && i1 <= 240) {
							int i4 = mgb + qgb[rgb];
							if (i4 < 10)
								i4 = 10;
							int i5 = (i4 * j.al[i3]) / 100;
							super.zf.gc(216);
							super.zf.ec(ogb[rgb]);
							super.zf.ec(i5);
							on();
						}
					}
				}
			} else {
				super.zf.gc(218);
				on();
				lgb = false;
				return;
			}
		}
		byte byte0 = 52;
		byte byte1 = 44;
		gab.rg(byte0, byte1, 408, 12, 192);
		int k1 = 0x989898;
		gab.fh(byte0, byte1 + 12, 408, 17, k1, 160);
		gab.fh(byte0, byte1 + 29, 8, 170, k1, 160);
		gab.fh(byte0 + 399, byte1 + 29, 9, 170, k1, 160);
		gab.fh(byte0, byte1 + 199, 408, 47, k1, 160);
		gab.ah("Buying and selling items", byte0 + 1, byte1 + 10, 1, 0xffffff);
		int i2 = 0xffffff;
		if (super.ds > byte0 + 320 && super.es >= byte1 && super.ds < byte0 + 408 && super.es < byte1 + 12)
			i2 = 0xff0000;
		gab.kg("Close window", byte0 + 406, byte1 + 10, 1, i2);
		gab.ah("Shops stock in green", byte0 + 2, byte1 + 24, 1, 65280);
		gab.ah("Number you own in blue", byte0 + 135, byte1 + 24, 1, 65535);
		gab.ah("Your money: " + po(10) + "gp", byte0 + 280, byte1 + 24, 1, 0xffff00);
		int j3 = 0xd0d0d0;
		int j4 = 0;
		for (int j5 = 0; j5 < 5; j5++) {
			for (int k5 = 0; k5 < 8; k5++) {
				int i6 = byte0 + 7 + k5 * 49;
				int l6 = byte1 + 28 + j5 * 34;
				if (rgb == j4)
					gab.fh(i6, l6, 49, 34, 0xff0000, 160);
				else
					gab.fh(i6, l6, 49, 34, j3, 160);
				gab.ag(i6, l6, 50, 35, 0);
				if (ogb[j4] != -1) {
					gab.lh(i6, l6, 48, 32, tcb + j.zk[ogb[j4]], j.ll[ogb[j4]], 0, 0, false);
					gab.ah(String.valueOf(pgb[j4]), i6 + 1, l6 + 10, 1, 65280);
					gab.kg(String.valueOf(po(ogb[j4])), i6 + 47, l6 + 10, 1, 65535);
				}
				j4++;
			}

		}

		gab.sg(byte0 + 5, byte1 + 222, 398, 0);
		if (rgb == -1) {
			gab.tg("Select an object to buy or sell", byte0 + 204, byte1 + 214, 3, 0xffff00);
			return;
		}
		int l5 = ogb[rgb];
		if (l5 != -1) {
			if (pgb[rgb] > 0) {
				int j6 = ngb + qgb[rgb];
				if (j6 < 10)
					j6 = 10;
				int i7 = (j6 * j.al[l5]) / 100;
				gab.ah("Buy a new " + j.vk[l5][0] + " for " + i7 + "gp", byte0 + 2, byte1 + 214, 1, 0xffff00);
				int j2 = 0xffffff;
				if (super.ds > byte0 + 298 && super.es >= byte1 + 204 && super.ds < byte0 + 408 && super.es <= byte1 + 215)
					j2 = 0xff0000;
				gab.kg("Click here to buy", byte0 + 405, byte1 + 214, 3, j2);
			} else {
				gab.tg("This item is not currently available to buy", byte0 + 204, byte1 + 214, 3, 0xffff00);
			}
			if (po(l5) > 0) {
				int k6 = mgb + qgb[rgb];
				if (k6 < 10)
					k6 = 10;
				int j7 = (k6 * j.al[l5]) / 100;
				gab.kg("Sell your " + j.vk[l5][0] + " for " + j7 + "gp", byte0 + 405, byte1 + 239, 1, 0xffff00);
				int k2 = 0xffffff;
				if (super.ds > byte0 + 2 && super.es >= byte1 + 229 && super.ds < byte0 + 112 && super.es <= byte1 + 240)
					k2 = 0xff0000;
				gab.ah("Click here to sell", byte0 + 2, byte1 + 239, 3, k2);
				return;
			}
			gab.tg("You do not have any of this item to sell", byte0 + 204, byte1 + 239, 3, 0xffff00);
		}
	}

	public void wp() {
		if (aab != 0 && kgb == 0)
			kgb = 1;
		if (kgb > 0) {
			int l = super.ds - 22;
			int i1 = super.es - 36;
			if (l >= 0 && i1 >= 0 && l < 468 && i1 < 262) {
				if (l > 216 && i1 > 30 && l < 462 && i1 < 235) {
					int j1 = (l - 217) / 49 + ((i1 - 31) / 34) * 5;
					if (j1 >= 0 && j1 < rdb) {
						boolean flag = false;
						int k2 = 0;
						int j3 = sdb[j1];
						for (int j4 = 0; j4 < bgb; j4++)
							if (cgb[j4] == j3)
								if (j.bl[j3] == 0) {
									for (int l4 = 0; l4 < kgb; l4++) {
										if (dgb[j4] < tdb[j1])
											dgb[j4]++;
										flag = true;
									}

								} else {
									k2++;
								}

						if (po(j3) <= k2)
							flag = true;
						if (!flag && bgb < 12) {
							cgb[bgb] = j3;
							dgb[bgb] = 1;
							bgb++;
							flag = true;
						}
						if (flag) {
							super.zf.gc(234);
							super.zf.fc(bgb);
							for (int i5 = 0; i5 < bgb; i5++) {
								super.zf.ec(cgb[i5]);
								super.zf.ec(dgb[i5]);
							}

							on();
							hgb = false;
							igb = false;
						}
					}
				}
				if (l > 8 && i1 > 30 && l < 205 && i1 < 133) {
					int k1 = (l - 9) / 49 + ((i1 - 31) / 34) * 4;
					if (k1 >= 0 && k1 < bgb) {
						int i2 = cgb[k1];
						for (int l2 = 0; l2 < kgb; l2++) {
							if (j.bl[i2] == 0 && dgb[k1] > 1) {
								dgb[k1]--;
								continue;
							}
							bgb--;
							jgb = 0;
							for (int k3 = k1; k3 < bgb; k3++) {
								cgb[k3] = cgb[k3 + 1];
								dgb[k3] = dgb[k3 + 1];
							}

							break;
						}

						super.zf.gc(234);
						super.zf.fc(bgb);
						for (int l3 = 0; l3 < bgb; l3++) {
							super.zf.ec(cgb[l3]);
							super.zf.ec(dgb[l3]);
						}

						on();
						hgb = false;
						igb = false;
					}
				}
				if (l > 143 && i1 > 141 && l < 154 && i1 < 152) {
					igb = !igb;
					super.zf.gc(232);
					super.zf.fc(igb ? 1 : 0);
					on();
				}
				if (l > 413 && i1 > 237 && l < 462 && i1 < 258) {
					zfb = false;
					super.zf.gc(233);
					on();
				}
			} else
			if (aab != 0) {
				zfb = false;
				super.zf.gc(233);
				on();
			}
			aab = 0;
			kgb = 0;
		}
		if (!zfb)
			return;
		byte byte0 = 22;
		byte byte1 = 36;
		gab.rg(byte0, byte1, 468, 12, 192);
		int l1 = 0x989898;
		gab.fh(byte0, byte1 + 12, 468, 18, l1, 160);
		gab.fh(byte0, byte1 + 30, 8, 248, l1, 160);
		gab.fh(byte0 + 205, byte1 + 30, 11, 248, l1, 160);
		gab.fh(byte0 + 462, byte1 + 30, 6, 248, l1, 160);
		gab.fh(byte0 + 8, byte1 + 133, 197, 22, l1, 160);
		gab.fh(byte0 + 8, byte1 + 258, 197, 20, l1, 160);
		gab.fh(byte0 + 216, byte1 + 235, 246, 43, l1, 160);
		int j2 = 0xd0d0d0;
		gab.fh(byte0 + 8, byte1 + 30, 197, 103, j2, 160);
		gab.fh(byte0 + 8, byte1 + 155, 197, 103, j2, 160);
		gab.fh(byte0 + 216, byte1 + 30, 246, 205, j2, 160);
		for (int i3 = 0; i3 < 4; i3++)
			gab.sg(byte0 + 8, byte1 + 30 + i3 * 34, 197, 0);

		for (int i4 = 0; i4 < 4; i4++)
			gab.sg(byte0 + 8, byte1 + 155 + i4 * 34, 197, 0);

		for (int k4 = 0; k4 < 7; k4++)
			gab.sg(byte0 + 216, byte1 + 30 + k4 * 34, 246, 0);

		for (int j5 = 0; j5 < 6; j5++) {
			if (j5 < 5)
				gab.kh(byte0 + 8 + j5 * 49, byte1 + 30, 103, 0);
			if (j5 < 5)
				gab.kh(byte0 + 8 + j5 * 49, byte1 + 155, 103, 0);
			gab.kh(byte0 + 216 + j5 * 49, byte1 + 30, 205, 0);
		}

		gab.ah("Trading with: " + agb, byte0 + 1, byte1 + 10, 1, 0xffffff);
		gab.ah("Your Offer", byte0 + 9, byte1 + 27, 4, 0xffffff);
		gab.ah("Opponent's Offer", byte0 + 9, byte1 + 152, 4, 0xffffff);
		gab.ah("Your Inventory", byte0 + 216, byte1 + 27, 4, 0xffffff);
		gab.kg("Accepted", byte0 + 204, byte1 + 27, 4, 65280);
		gab.ag(byte0 + 125, byte1 + 16, 11, 11, 65280);
		if (hgb)
			gab.rg(byte0 + 127, byte1 + 18, 7, 7, 65280);
		gab.kg("Accept", byte0 + 204, byte1 + 152, 4, 65280);
		gab.ag(byte0 + 143, byte1 + 141, 11, 11, 65280);
		if (igb)
			gab.rg(byte0 + 145, byte1 + 143, 7, 7, 65280);
		gab.kg("Close", byte0 + 408 + 49, byte1 + 251, 4, 0xc00000);
		gab.ag(byte0 + 364 + 49, byte1 + 237, 49, 21, 0xc00000);
		for (int k5 = 0; k5 < rdb; k5++) {
			int l5 = 217 + byte0 + (k5 % 5) * 49;
			int j6 = 31 + byte1 + (k5 / 5) * 34;
			gab.lh(l5, j6, 48, 32, tcb + j.zk[sdb[k5]], j.ll[sdb[k5]], 0, 0, false);
			if (j.bl[sdb[k5]] == 0)
				gab.ah(String.valueOf(tdb[k5]), l5 + 1, j6 + 10, 1, 0xffff00);
		}

		for (int i6 = 0; i6 < bgb; i6++) {
			int k6 = 9 + byte0 + (i6 % 4) * 49;
			int i7 = 31 + byte1 + (i6 / 4) * 34;
			gab.lh(k6, i7, 48, 32, tcb + j.zk[cgb[i6]], j.ll[cgb[i6]], 0, 0, false);
			if (j.bl[cgb[i6]] == 0)
				gab.ah(String.valueOf(dgb[i6]), k6 + 1, i7 + 10, 1, 0xffff00);
			if (super.ds > k6 && super.ds < k6 + 48 && super.es > i7 && super.es < i7 + 32)
				gab.ah(j.vk[cgb[i6]][0] + ": @whi@" + j.wk[cgb[i6]], byte0 + 8, byte1 + 273, 1, 0xffff00);
		}

		for (int l6 = 0; l6 < egb; l6++) {
			int j7 = 9 + byte0 + (l6 % 4) * 49;
			int k7 = 156 + byte1 + (l6 / 4) * 34;
			gab.lh(j7, k7, 48, 32, tcb + j.zk[fgb[l6]], j.ll[fgb[l6]], 0, 0, false);
			if (j.bl[fgb[l6]] == 0)
				gab.ah(String.valueOf(ggb[l6]), j7 + 1, k7 + 10, 1, 0xffff00);
			if (super.ds > j7 && super.ds < j7 + 48 && super.es > k7 && super.es < k7 + 32)
				gab.ah(j.vk[fgb[l6]][0] + ": @whi@" + j.wk[fgb[l6]], byte0 + 8, byte1 + 273, 1, 0xffff00);
		}

	}

	public void up() {
		if (pdb == 0 && super.ds >= ((i) (gab)).ni - 35 && super.es >= 3 && super.ds < ((i) (gab)).ni - 3 && super.es < 35)
			pdb = 1;
		if (pdb == 0 && super.ds >= ((i) (gab)).ni - 35 - 33 && super.es >= 3 && super.ds < ((i) (gab)).ni - 3 - 33 && super.es < 35)
			pdb = 2;
		if (pdb == 0 && super.ds >= ((i) (gab)).ni - 35 - 66 && super.es >= 3 && super.ds < ((i) (gab)).ni - 3 - 66 && super.es < 35)
			pdb = 3;
		if (pdb == 0 && super.ds >= ((i) (gab)).ni - 35 - 99 && super.es >= 3 && super.ds < ((i) (gab)).ni - 3 - 99 && super.es < 35)
			pdb = 4;
		if (pdb == 0 && super.ds >= ((i) (gab)).ni - 35 - 132 && super.es >= 3 && super.ds < ((i) (gab)).ni - 3 - 132 && super.es < 35)
			pdb = 5;
		if (pdb == 0 && super.ds >= ((i) (gab)).ni - 35 - 165 && super.es >= 3 && super.ds < ((i) (gab)).ni - 3 - 165 && super.es < 35)
			pdb = 6;
		if (pdb != 0 && super.ds >= ((i) (gab)).ni - 35 && super.es >= 3 && super.ds < ((i) (gab)).ni - 3 && super.es < 26)
			pdb = 1;
		if (pdb != 0 && super.ds >= ((i) (gab)).ni - 35 - 33 && super.es >= 3 && super.ds < ((i) (gab)).ni - 3 - 33 && super.es < 26)
			pdb = 2;
		if (pdb != 0 && super.ds >= ((i) (gab)).ni - 35 - 66 && super.es >= 3 && super.ds < ((i) (gab)).ni - 3 - 66 && super.es < 26)
			pdb = 3;
		if (pdb != 0 && super.ds >= ((i) (gab)).ni - 35 - 99 && super.es >= 3 && super.ds < ((i) (gab)).ni - 3 - 99 && super.es < 26)
			pdb = 4;
		if (pdb != 0 && super.ds >= ((i) (gab)).ni - 35 - 132 && super.es >= 3 && super.ds < ((i) (gab)).ni - 3 - 132 && super.es < 26)
			pdb = 5;
		if (pdb != 0 && super.ds >= ((i) (gab)).ni - 35 - 165 && super.es >= 3 && super.ds < ((i) (gab)).ni - 3 - 165 && super.es < 26)
			pdb = 6;
		if (pdb == 1 && (super.ds < ((i) (gab)).ni - 248 || super.es > 36 + (qdb / 5) * 34))
			pdb = 0;
		if (pdb >= 2 && pdb <= 5 && (super.ds < ((i) (gab)).ni - 199 || super.es > 240))
			pdb = 0;
		if (pdb == 6 && (super.ds < ((i) (gab)).ni - 199 || super.es > 267))
			pdb = 0;
	}

	public void oo(boolean flag) {
		int l = ((i) (gab)).ni - 248;
		gab.qf(l, 3, pab + 1);
		for (int i1 = 0; i1 < qdb; i1++) {
			int j1 = l + (i1 % 5) * 49;
			int l1 = 36 + (i1 / 5) * 34;
			if (i1 < rdb && udb[i1] == 1)
				gab.fh(j1, l1, 49, 34, 0xff0000, 128);
			else
				gab.fh(j1, l1, 49, 34, i.qg(181, 181, 181), 128);
			if (i1 < rdb) {
				gab.lh(j1, l1, 48, 32, tcb + j.zk[sdb[i1]], j.ll[sdb[i1]], 0, 0, false);
				if (j.bl[sdb[i1]] == 0)
					gab.ah(String.valueOf(tdb[i1]), j1 + 1, l1 + 10, 1, 0xffff00);
			}
		}

		for (int k1 = 1; k1 <= 4; k1++)
			gab.kh(l + k1 * 49, 36, (qdb / 5) * 34, 0);

		for (int i2 = 1; i2 <= qdb / 5 - 1; i2++)
			gab.sg(l, 36 + i2 * 34, 245, 0);

		if (!flag)
			return;
		l = super.ds - (((i) (gab)).ni - 248);
		int j2 = super.es - 36;
		if (l >= 0 && j2 >= 0 && l < 248 && j2 < (qdb / 5) * 34) {
			int k2 = l / 49 + (j2 / 34) * 5;
			if (k2 < rdb) {
				int l2 = sdb[k2];
				if (geb >= 0) {
					if (j.vo[geb] == 3) {
						efb[afb] = "Cast " + j.ro[geb] + " on";
						dfb[afb] = "@lre@" + j.vk[l2][0];
						ffb[afb] = 600;
						ifb[afb] = k2;
						jfb[afb] = geb;
						afb++;
						return;
					}
				} else {
					if (vdb >= 0) {
						efb[afb] = "Use " + wdb + " with";
						dfb[afb] = "@lre@" + j.vk[l2][0];
						ffb[afb] = 610;
						ifb[afb] = k2;
						jfb[afb] = vdb;
						afb++;
						return;
					}
					if (udb[k2] == 1) {
						efb[afb] = "Remove";
						dfb[afb] = "@lre@" + j.vk[l2][0];
						ffb[afb] = 620;
						ifb[afb] = k2;
						afb++;
					} else
					if (j.jl[l2] != 0) {
						if ((j.jl[l2] & 0x18) != 0)
							efb[afb] = "Wield";
						else
							efb[afb] = "Wear";
						dfb[afb] = "@lre@" + j.vk[l2][0];
						ffb[afb] = 630;
						ifb[afb] = k2;
						afb++;
					}
					if (!j.yk[l2].equals("_")) {
						efb[afb] = j.yk[l2];
						dfb[afb] = "@lre@" + j.vk[l2][0];
						ffb[afb] = 640;
						ifb[afb] = k2;
						afb++;
					}
					efb[afb] = "Use";
					dfb[afb] = "@lre@" + j.vk[l2][0];
					ffb[afb] = 650;
					ifb[afb] = k2;
					afb++;
					efb[afb] = "Drop";
					dfb[afb] = "@lre@" + j.vk[l2][0];
					ffb[afb] = 660;
					ifb[afb] = k2;
					afb++;
					efb[afb] = "Examine";
					dfb[afb] = "@lre@" + j.vk[l2][0];
					ffb[afb] = 3600;
					ifb[afb] = l2;
					afb++;
				}
			}
		}
	}

	public void rn(boolean flag) {
		int l = ((i) (gab)).ni - 199;
		char c1 = '\234';
		char c3 = '\230';
		gab.qf(l - 49, 3, pab + 2);
		l += 40;
		gab.rg(l, 36, c1, c3, 0);
		gab.ch(l, 36, l + c1, 36 + c3);
		char c5 = '\300';
		int j1 = ((fcb.my - 6040) * 3 * c5) / 2048;
		int l2 = ((fcb.ny - 6040) * 3 * c5) / 2048;
		int j4 = a.k[1024 - vbb * 4 & 0x3ff];
		int l4 = a.k[(1024 - vbb * 4 & 0x3ff) + 1024];
		int j5 = l2 * j4 + j1 * l4 >> 18;
		l2 = l2 * l4 - j1 * j4 >> 18;
		j1 = j5;
		gab.eg((l + c1 / 2) - j1, 36 + c3 / 2 + l2, pab - 1, vbb + 64 & 0xff, c5);
		for (int l6 = 0; l6 < zcb; l6++) {
			int k1 = (((bdb[l6] * jab + 64) - fcb.my) * 3 * c5) / 2048;
			int i3 = (((cdb[l6] * jab + 64) - fcb.ny) * 3 * c5) / 2048;
			int k5 = i3 * j4 + k1 * l4 >> 18;
			i3 = i3 * l4 - k1 * j4 >> 18;
			k1 = k5;
			jn(l + c1 / 2 + k1, (36 + c3 / 2) - i3, 65535);
		}

		for (int i7 = 0; i7 < scb; i7++) {
			int l1 = (((ucb[i7] * jab + 64) - fcb.my) * 3 * c5) / 2048;
			int j3 = (((vcb[i7] * jab + 64) - fcb.ny) * 3 * c5) / 2048;
			int l5 = j3 * j4 + l1 * l4 >> 18;
			j3 = j3 * l4 - l1 * j4 >> 18;
			l1 = l5;
			jn(l + c1 / 2 + l1, (36 + c3 / 2) - j3, 0xff0000);
		}

		for (int j7 = 0; j7 < lcb; j7++) {
			r r1 = ocb[j7];
			int i2 = ((r1.my - fcb.my) * 3 * c5) / 2048;
			int k3 = ((r1.ny - fcb.ny) * 3 * c5) / 2048;
			int i6 = k3 * j4 + i2 * l4 >> 18;
			k3 = k3 * l4 - i2 * j4 >> 18;
			i2 = i6;
			jn(l + c1 / 2 + i2, (36 + c3 / 2) - k3, 0xffff00);
		}

		for (int k7 = 0; k7 < zbb; k7++) {
			r r2 = dcb[k7];
			int j2 = ((r2.my - fcb.my) * 3 * c5) / 2048;
			int l3 = ((r2.ny - fcb.ny) * 3 * c5) / 2048;
			int j6 = l3 * j4 + j2 * l4 >> 18;
			l3 = l3 * l4 - j2 * j4 >> 18;
			j2 = j6;
			jn(l + c1 / 2 + j2, (36 + c3 / 2) - l3, 0xffffff);
		}

		gab.nh(l + c1 / 2, 36 + c3 / 2, 2, 0xffffff, 255);
		gab.eg(l + 19, 55, pab + 24, vbb + 128 & 0xff, 128);
		gab.ch(0, 0, lab, mab + 12);
		if (!flag)
			return;
		l = super.ds - (((i) (gab)).ni - 199);
		int l7 = super.es - 36;
		if (l >= 40 && l7 >= 0 && l < 196 && l7 < 152) {
			char c2 = '\234';
			char c4 = '\230';
			char c6 = '\300';
			int i1 = ((i) (gab)).ni - 199;
			i1 += 40;
			int k2 = ((super.ds - (i1 + c2 / 2)) * 16384) / (3 * c6);
			int i4 = ((super.es - (36 + c4 / 2)) * 16384) / (3 * c6);
			int k4 = a.k[1024 - vbb * 4 & 0x3ff];
			int i5 = a.k[(1024 - vbb * 4 & 0x3ff) + 1024];
			int k6 = i4 * k4 + k2 * i5 >> 15;
			i4 = i4 * i5 - k2 * k4 >> 15;
			k2 = k6;
			k2 += fcb.my;
			i4 = fcb.ny - i4;
			if (aab == 1)
				lp(gcb, hcb, k2 / 128, i4 / 128, false);
			aab = 0;
		}
	}

	public void in(boolean flag) {
		int l = ((i) (gab)).ni - 199;
		int i1 = 36;
		gab.qf(l - 49, 3, pab + 3);
		char c1 = '\304';
		char c2 = '\316';
		int k1;
		int j1 = k1 = i.qg(160, 160, 160);
		if (neb == 0)
			j1 = i.qg(220, 220, 220);
		else
			k1 = i.qg(220, 220, 220);
		gab.fh(l, i1, c1 / 2, 24, j1, 128);
		gab.fh(l + c1 / 2, i1, c1 / 2, 24, k1, 128);
		gab.fh(l, i1 + 24, c1, c2 - 24, i.qg(220, 220, 220), 128);
		gab.sg(l, i1 + 24, c1, 0);
		gab.kh(l + c1 / 2, i1, 24, 0);
		gab.tg("Stats", l + c1 / 4, i1 + 16, 4, 0);
		gab.tg("Quests", l + c1 / 4 + c1 / 2, i1 + 16, 4, 0);
		if (neb == 0) {
			int l1 = 72;
			gab.ah("Skills", l + 5, l1, 3, 0xffff00);
			l1 += 13;
			for (int j2 = 0; j2 < 8; j2++) {
				gab.ah(beb[j2] + ":@yel@" + xdb[j2] + "/" + ydb[j2], l + 5, l1, 1, 0xffffff);
				gab.ah(beb[j2 + 8] + ":@yel@" + xdb[j2 + 8] + "/" + ydb[j2 + 8], (l + c1 / 2) - 8, l1 - 13, 1, 0xffffff);
				l1 += 13;
			}

			gab.ah("Quest Points:@yel@" + aeb, (l + c1 / 2) - 8, l1 - 13, 1, 0xffffff);
			l1 += 8;
			gab.ah("Equipment Status", l + 5, l1, 3, 0xffff00);
			l1 += 12;
			for (int k2 = 0; k2 < 3; k2++) {
				gab.ah(ceb[k2] + ":@yel@" + zdb[k2], l + 5, l1, 1, 0xffffff);
				if (k2 < 2)
					gab.ah(ceb[k2 + 3] + ":@yel@" + zdb[k2 + 3], l + c1 / 2 + 25, l1, 1, 0xffffff);
				l1 += 13;
			}

		}
		if (neb == 1) {
			leb.ek(meb);
			leb.kl(meb, 0, "@whi@Quest-list (green=completed)");
			for (int i2 = 0; i2 < oeb; i2++)
				leb.kl(meb, i2 + 1, (qeb[i2] ? "@gre@" : "@red@") + peb[i2]);

			leb.hk();
		}
		if (!flag)
			return;
		l = super.ds - (((i) (gab)).ni - 199);
		i1 = super.es - 36;
		if (l >= 0 && i1 >= 0 && l < c1 && i1 < c2) {
			if (neb == 1)
				leb.ik(l + (((i) (gab)).ni - 199), i1 + 36, super.gs, super.fs);
			if (i1 <= 24 && aab == 1) {
				if (l < 98) {
					neb = 0;
					return;
				}
				if (l > 98)
					neb = 1;
			}
		}
	}

	public void go(boolean flag) {
		int l = ((i) (gab)).ni - 199;
		int i1 = 36;
		gab.qf(l - 49, 3, pab + 4);
		char c1 = '\304';
		char c2 = '\266';
		int k1;
		int j1 = k1 = i.qg(160, 160, 160);
		if (feb == 0)
			j1 = i.qg(220, 220, 220);
		else
			k1 = i.qg(220, 220, 220);
		gab.fh(l, i1, c1 / 2, 24, j1, 128);
		gab.fh(l + c1 / 2, i1, c1 / 2, 24, k1, 128);
		gab.fh(l, i1 + 24, c1, 90, i.qg(220, 220, 220), 128);
		gab.fh(l, i1 + 24 + 90, c1, c2 - 90 - 24, i.qg(160, 160, 160), 128);
		gab.sg(l, i1 + 24, c1, 0);
		gab.kh(l + c1 / 2, i1, 24, 0);
		gab.sg(l, i1 + 113, c1, 0);
		gab.tg("Magic", l + c1 / 4, i1 + 16, 4, 0);
		gab.tg("Prayers", l + c1 / 4 + c1 / 2, i1 + 16, 4, 0);
		if (feb == 0) {
			deb.ek(eeb);
			int l1 = 0;
			for (int l2 = 0; l2 < j.qo; l2++) {
				String s = "@yel@";
				for (int k4 = 0; k4 < j.uo[l2]; k4++) {
					int j5 = j.wo[l2][k4];
					if (pn(j5, j.xo[l2][k4]))
						continue;
					s = "@whi@";
					break;
				}

				int k5 = xdb[6];
				if (j.to[l2] > k5)
					s = "@bla@";
				deb.kl(eeb, l1++, s + "Level " + j.to[l2] + ": " + j.ro[l2]);
			}

			deb.hk();
			int l3 = deb.il(eeb);
			if (l3 != -1) {
				gab.ah("Level " + j.to[l3] + ": " + j.ro[l3], l + 2, i1 + 124, 1, 0xffff00);
				gab.ah(j.so[l3], l + 2, i1 + 136, 0, 0xffffff);
				for (int l4 = 0; l4 < j.uo[l3]; l4++) {
					int l5 = j.wo[l3][l4];
					gab.qf(l + 2 + l4 * 44, i1 + 150, tcb + j.zk[l5]);
					int i6 = po(l5);
					int j6 = j.xo[l3][l4];
					String s2 = "@red@";
					if (pn(l5, j6))
						s2 = "@gre@";
					gab.ah(s2 + i6 + "/" + j6, l + 2 + l4 * 44, i1 + 150, 1, 0xffffff);
				}

			} else {
				gab.ah("Point at a spell for a description", l + 2, i1 + 124, 1, 0);
			}
		}
		if (feb == 1) {
			deb.ek(eeb);
			int i2 = 0;
			for (int i3 = 0; i3 < j.ip; i3++) {
				String s1 = "@whi@";
				if (j.lp[i3] > ydb[5])
					s1 = "@bla@";
				if (reb[i3])
					s1 = "@gre@";
				deb.kl(eeb, i2++, s1 + "Level " + j.lp[i3] + ": " + j.jp[i3]);
			}

			deb.hk();
			int i4 = deb.il(eeb);
			if (i4 != -1) {
				gab.tg("Level " + j.lp[i4] + ": " + j.jp[i4], l + c1 / 2, i1 + 130, 1, 0xffff00);
				gab.tg(j.kp[i4], l + c1 / 2, i1 + 145, 0, 0xffffff);
				gab.tg("Drain rate: " + j.mp[i4], l + c1 / 2, i1 + 160, 1, 0);
			} else {
				gab.ah("Point at a prayer for a description", l + 2, i1 + 124, 1, 0);
			}
		}
		if (!flag)
			return;
		l = super.ds - (((i) (gab)).ni - 199);
		i1 = super.es - 36;
		if (l >= 0 && i1 >= 0 && l < 196 && i1 < 182) {
			deb.ik(l + (((i) (gab)).ni - 199), i1 + 36, super.gs, super.fs);
			if (i1 <= 24 && aab == 1)
				if (l < 98 && feb == 1) {
					feb = 0;
					deb.tk(eeb);
				} else
				if (l > 98 && feb == 0) {
					feb = 1;
					deb.tk(eeb);
				}
			if (aab == 1 && feb == 0) {
				int j2 = deb.il(eeb);
				if (j2 != -1) {
					int j3 = xdb[6];
					if (j.to[j2] > j3) {
						sp("Your magic ability is not high enough for this spell", 3);
					} else {
						int j4;
						for (j4 = 0; j4 < j.uo[j2]; j4++) {
							int i5 = j.wo[j2][j4];
							if (pn(i5, j.xo[j2][j4]))
								continue;
							sp("You don't have all the reagents you need for this spell", 3);
							j4 = -1;
							break;
						}

						if (j4 == j.uo[j2]) {
							geb = j2;
							vdb = -1;
						}
					}
				}
			}
			if (aab == 1 && feb == 1) {
				int k2 = deb.il(eeb);
				if (k2 != -1) {
					int k3 = ydb[5];
					if (j.lp[k2] > k3)
						sp("Your prayer ability is not high enough for this prayer", 3);
					else
					if (xdb[5] == 0)
						sp("You have run out of prayer points. Return to a church to recharge", 3);
					else
					if (reb[k2]) {
						super.zf.gc(211);
						super.zf.fc(k2);
						super.zf.jc();
						reb[k2] = false;
					} else {
						super.zf.gc(212);
						super.zf.fc(k2);
						super.zf.jc();
						reb[k2] = true;
					}
				}
			}
			aab = 0;
		}
	}

	public void mn(boolean flag) {
		int l = ((i) (gab)).ni - 199;
		int i1 = 36;
		gab.qf(l - 49, 3, pab + 5);
		char c1 = '\304';
		char c2 = '\266';
		int k1;
		int j1 = k1 = i.qg(160, 160, 160);
		if (jeb == 0)
			j1 = i.qg(220, 220, 220);
		else
			k1 = i.qg(220, 220, 220);
		gab.fh(l, i1, c1 / 2, 24, j1, 128);
		gab.fh(l + c1 / 2, i1, c1 / 2, 24, k1, 128);
		gab.fh(l, i1 + 24, c1, c2 - 24, i.qg(220, 220, 220), 128);
		gab.sg(l, i1 + 24, c1, 0);
		gab.kh(l + c1 / 2, i1, 24, 0);
		gab.sg(l, (i1 + c2) - 16, c1, 0);
		gab.tg("Friends", l + c1 / 4, i1 + 16, 4, 0);
		gab.tg("Ignore", l + c1 / 4 + c1 / 2, i1 + 16, 4, 0);
		heb.ek(ieb);
		if (jeb == 0) {
			for (int l1 = 0; l1 < super.fg; l1++) {
				String s;
				if (super.hg[l1] == 2)
					s = "@gre@";
				else
				if (super.hg[l1] == 1)
					s = "@yel@";
				else
					s = "@red@";
				heb.kl(ieb, l1, s + c.zc(super.gg[l1]) + "~439~@whi@Remove         WWWWWWWWWW");
			}

		}
		if (jeb == 1) {
			for (int i2 = 0; i2 < super.ig; i2++)
				heb.kl(ieb, i2, "@yel@" + c.zc(super.jg[i2]) + "~439~@whi@Remove         WWWWWWWWWW");

		}
		heb.hk();
		if (jeb == 0) {
			int j2 = heb.il(ieb);
			if (j2 >= 0 && super.ds < 489) {
				if (super.ds > 429)
					gab.tg("Click to remove " + c.zc(super.gg[j2]), l + c1 / 2, i1 + 35, 1, 0xffffff);
				else
				if (super.hg[j2] == 2)
					gab.tg("Click to message " + c.zc(super.gg[j2]), l + c1 / 2, i1 + 35, 1, 0xffffff);
				else
				if (super.hg[j2] == 1)
					gab.tg(c.zc(super.gg[j2]) + " is on a different server", l + c1 / 2, i1 + 35, 1, 0xffffff);
				else
					gab.tg(c.zc(super.gg[j2]) + " is offline", l + c1 / 2, i1 + 35, 1, 0xffffff);
			} else {
				gab.tg("Click a name to send a message", l + c1 / 2, i1 + 35, 1, 0xffffff);
			}
			int j3;
			if (super.ds > l && super.ds < l + c1 && super.es > (i1 + c2) - 16 && super.es < i1 + c2)
				j3 = 0xffff00;
			else
				j3 = 0xffffff;
			gab.tg("Click here to add a friend", l + c1 / 2, (i1 + c2) - 3, 1, j3);
		}
		if (jeb == 1) {
			int k2 = heb.il(ieb);
			if (k2 >= 0 && super.ds < 489 && super.ds > 429) {
				if (super.ds > 429)
					gab.tg("Click to remove " + c.zc(super.jg[k2]), l + c1 / 2, i1 + 35, 1, 0xffffff);
			} else {
				gab.tg("Blocking messages from:", l + c1 / 2, i1 + 35, 1, 0xffffff);
			}
			int k3;
			if (super.ds > l && super.ds < l + c1 && super.es > (i1 + c2) - 16 && super.es < i1 + c2)
				k3 = 0xffff00;
			else
				k3 = 0xffffff;
			gab.tg("Click here to add a name", l + c1 / 2, (i1 + c2) - 3, 1, k3);
		}
		if (!flag)
			return;
		l = super.ds - (((i) (gab)).ni - 199);
		i1 = super.es - 36;
		if (l >= 0 && i1 >= 0 && l < 196 && i1 < 182) {
			heb.ik(l + (((i) (gab)).ni - 199), i1 + 36, super.gs, super.fs);
			if (i1 <= 24 && aab == 1)
				if (l < 98 && jeb == 1) {
					jeb = 0;
					heb.tk(ieb);
				} else
				if (l > 98 && jeb == 0) {
					jeb = 1;
					heb.tk(ieb);
				}
			if (aab == 1 && jeb == 0) {
				int l2 = heb.il(ieb);
				if (l2 >= 0 && super.ds < 489)
					if (super.ds > 429)
						te(super.gg[l2]);
					else
					if (super.hg[l2] != 0) {
						fhb = 2;
						keb = super.gg[l2];
						super.ms = "";
						super.ns = "";
					}
			}
			if (aab == 1 && jeb == 1) {
				int i3 = heb.il(ieb);
				if (i3 >= 0 && super.ds < 489 && super.ds > 429)
					lf(super.jg[i3]);
			}
			if (i1 > 166 && aab == 1 && jeb == 0) {
				fhb = 1;
				super.ks = "";
				super.ls = "";
			}
			if (i1 > 166 && aab == 1 && jeb == 1) {
				fhb = 3;
				super.ks = "";
				super.ls = "";
			}
			aab = 0;
		}
	}

	public void to(boolean flag) {
		int l = ((i) (gab)).ni - 199;
		int i1 = 36;
		gab.qf(l - 49, 3, pab + 6);
		char c1 = '\304';
		gab.fh(l, 36, c1, 90, i.qg(181, 181, 181), 160);
		gab.fh(l, 126, c1, 105, i.qg(201, 2011, 201), 160);
		gab.fh(l, 231, c1, 30, i.qg(181, 181, 181), 160);
		int j1 = l + 3;
		int l1 = i1 + 15;
		gab.ah("Game options - click to toggle", j1, l1, 1, 0);
		l1 += 15;
		if (teb)
			gab.ah("Camera angle mode - @gre@Auto", j1, l1, 1, 0xffffff);
		else
			gab.ah("Camera angle mode - @red@Manual", j1, l1, 1, 0xffffff);
		l1 += 15;
		if (cfb)
			gab.ah("Mouse buttons - @red@One", j1, l1, 1, 0xffffff);
		else
			gab.ah("Mouse buttons - @gre@Two", j1, l1, 1, 0xffffff);
		l1 += 15;
		if (ueb)
			gab.ah("Player type: @red@Player-Killer", j1, l1, 1, 0xffffff);
		else
			gab.ah("Player type: @gre@Non Player-Killer", j1, l1, 1, 0xffffff);
		l1 += 15;
		int j2 = 0xffffff;
		if (super.ds > j1 && super.ds < j1 + c1 && super.es > l1 - 12 && super.es < l1 + 4)
			j2 = 0xffff00;
		gab.ah("Change password", j1, l1, 1, j2);
		l1 += 15;
		l1 += 15;
		gab.ah("Privacy settings. Will be applied to", l + 3, l1, 1, 0);
		l1 += 15;
		gab.ah("all people not on your friends list", l + 3, l1, 1, 0);
		l1 += 15;
		if (super.kg == 0)
			gab.ah("Hide online-status: @red@<off>", l + 3, l1, 1, 0xffffff);
		else
			gab.ah("Hide online-status: @gre@<on>", l + 3, l1, 1, 0xffffff);
		l1 += 15;
		if (super.lg == 0)
			gab.ah("Block chat messages: @red@<off>", l + 3, l1, 1, 0xffffff);
		else
			gab.ah("Block chat messages: @gre@<on>", l + 3, l1, 1, 0xffffff);
		l1 += 15;
		if (super.mg == 0)
			gab.ah("Block private messages: @red@<off>", l + 3, l1, 1, 0xffffff);
		else
			gab.ah("Block private messages: @gre@<on>", l + 3, l1, 1, 0xffffff);
		l1 += 15;
		if (super.ng == 0)
			gab.ah("Block trade requests: @red@<off>", l + 3, l1, 1, 0xffffff);
		else
			gab.ah("Block trade requests: @gre@<on>", l + 3, l1, 1, 0xffffff);
		l1 += 15;
		l1 += 15;
		j2 = 0xffffff;
		if (super.ds > j1 && super.ds < j1 + c1 && super.es > l1 - 12 && super.es < l1 + 4)
			j2 = 0xffff00;
		gab.ah("Click here to logout", l + 3, l1, 1, j2);
		if (!flag)
			return;
		l = super.ds - (((i) (gab)).ni - 199);
		i1 = super.es - 36;
		if (l >= 0 && i1 >= 0 && l < 196 && i1 < 231) {
			int k2 = ((i) (gab)).ni - 199;
			byte byte0 = 36;
			char c2 = '\304';
			int k1 = k2 + 3;
			int i2 = byte0 + 30;
			if (super.ds > k1 && super.ds < k1 + c2 && super.es > i2 - 12 && super.es < i2 + 4 && aab == 1) {
				teb = !teb;
				super.zf.gc(213);
				super.zf.fc(0);
				super.zf.fc(teb ? 1 : 0);
				super.zf.jc();
			}
			i2 += 15;
			if (super.ds > k1 && super.ds < k1 + c2 && super.es > i2 - 12 && super.es < i2 + 4 && aab == 1) {
				cfb = !cfb;
				super.zf.gc(213);
				super.zf.fc(2);
				super.zf.fc(cfb ? 1 : 0);
				super.zf.jc();
			}
			i2 += 15;
			if (super.ds > k1 && super.ds < k1 + c2 && super.es > i2 - 12 && super.es < i2 + 4 && aab == 1 && dhb > 0)
				ehb = 1;
			i2 += 15;
			if (super.ds > k1 && super.ds < k1 + c2 && super.es > i2 - 12 && super.es < i2 + 4 && aab == 1) {
				ghb = 1;
				super.ks = "";
				super.ls = "";
			}
			boolean flag1 = false;
			i2 += 60;
			if (super.ds > k1 && super.ds < k1 + c2 && super.es > i2 - 12 && super.es < i2 + 4 && aab == 1) {
				super.kg = 1 - super.kg;
				flag1 = true;
			}
			i2 += 15;
			if (super.ds > k1 && super.ds < k1 + c2 && super.es > i2 - 12 && super.es < i2 + 4 && aab == 1) {
				super.lg = 1 - super.lg;
				flag1 = true;
			}
			i2 += 15;
			if (super.ds > k1 && super.ds < k1 + c2 && super.es > i2 - 12 && super.es < i2 + 4 && aab == 1) {
				super.mg = 1 - super.mg;
				flag1 = true;
			}
			i2 += 15;
			if (super.ds > k1 && super.ds < k1 + c2 && super.es > i2 - 12 && super.es < i2 + 4 && aab == 1) {
				super.ng = 1 - super.ng;
				flag1 = true;
			}
			if (flag1)
				bf(super.kg, super.lg, super.mg, super.ng, 0);
			i2 += 30;
			if (super.ds > k1 && super.ds < k1 + c2 && super.es > i2 - 12 && super.es < i2 + 4 && aab == 1)
				trylogout();
			aab = 0;
		}
	}

	public void gn() {
		int l = -1;
		for (int i1 = 0; i1 < zcb; i1++)
			gdb[i1] = false;

		for (int j1 = 0; j1 < idb; j1++)
			odb[j1] = false;

		int k1 = fab.q();
		p ap1[] = fab.r();
		int ai[] = fab.k();
		for (int l1 = 0; l1 < k1; l1++) {
			int i2 = ai[l1];
			p p1 = ap1[l1];
			if (p1.qv[i2] <= 65535 || p1.qv[i2] >= 0x30d40 && p1.qv[i2] <= 0x493e0)
				if (p1 == fab.yb) {
					int k2 = p1.qv[i2] % 10000;
					int j3 = p1.qv[i2] / 10000;
					if (j3 == 1) {
						String s = "";
						int i4 = -1;
						int k4 = dcb[k2].fz;
						if (k4 == 1) {
							i4 = 0;
							if (fcb.gz > 0 && dcb[k2].gz > 0)
								i4 = fcb.gz - dcb[k2].gz;
							if (i4 < 0)
								s = "@or1@";
							if (i4 < -3)
								s = "@or2@";
							if (i4 < -6)
								s = "@or3@";
							if (i4 < -9)
								s = "@red@";
							if (i4 > 0)
								s = "@gr1@";
							if (i4 > 3)
								s = "@gr2@";
							if (i4 > 6)
								s = "@gr3@";
							if (i4 > 9)
								s = "@gre@";
							s = " " + s + "(level-" + dcb[k2].gz + ")";
						}
						if (geb >= 0) {
							if (j.vo[geb] == 1 || j.vo[geb] == 2 && k4 == 1 && fcb.fz == 1) {
								efb[afb] = "Cast " + j.ro[geb] + " on";
								dfb[afb] = "@whi@" + dcb[k2].jy;
								ffb[afb] = 800;
								gfb[afb] = dcb[k2].my;
								hfb[afb] = dcb[k2].ny;
								ifb[afb] = dcb[k2].ky;
								jfb[afb] = geb;
								afb++;
							}
						} else
						if (vdb >= 0) {
							efb[afb] = "Use " + wdb + " with";
							dfb[afb] = "@whi@" + dcb[k2].jy;
							ffb[afb] = 810;
							gfb[afb] = dcb[k2].my;
							hfb[afb] = dcb[k2].ny;
							ifb[afb] = dcb[k2].ky;
							jfb[afb] = vdb;
							afb++;
						} else {
							if (k4 == 1 && fcb.fz == 1) {
								efb[afb] = "Attack";
								dfb[afb] = "@whi@" + dcb[k2].jy + s;
								if (i4 >= 0 && i4 < 5)
									ffb[afb] = 805;
								else
									ffb[afb] = 2805;
								gfb[afb] = dcb[k2].my;
								hfb[afb] = dcb[k2].ny;
								ifb[afb] = dcb[k2].ky;
								afb++;
							}
							efb[afb] = "Trade with";
							dfb[afb] = "@whi@" + dcb[k2].jy;
							ffb[afb] = 2810;
							ifb[afb] = dcb[k2].ky;
							afb++;
							efb[afb] = "Follow";
							dfb[afb] = "@whi@" + dcb[k2].jy;
							ffb[afb] = 2820;
							ifb[afb] = dcb[k2].ky;
							afb++;
						}
					} else
					if (j3 == 2) {
						if (geb >= 0) {
							if (j.vo[geb] == 3) {
								efb[afb] = "Cast " + j.ro[geb] + " on";
								dfb[afb] = "@lre@" + j.vk[wcb[k2]][0];
								ffb[afb] = 200;
								gfb[afb] = ucb[k2];
								hfb[afb] = vcb[k2];
								ifb[afb] = wcb[k2];
								jfb[afb] = geb;
								afb++;
							}
						} else
						if (vdb >= 0) {
							efb[afb] = "Use " + wdb + " with";
							dfb[afb] = "@lre@" + j.vk[wcb[k2]][0];
							ffb[afb] = 210;
							gfb[afb] = ucb[k2];
							hfb[afb] = vcb[k2];
							ifb[afb] = wcb[k2];
							jfb[afb] = vdb;
							afb++;
						} else {
							efb[afb] = "Take";
							dfb[afb] = "@lre@" + j.vk[wcb[k2]][0];
							ffb[afb] = 220;
							gfb[afb] = ucb[k2];
							hfb[afb] = vcb[k2];
							ifb[afb] = wcb[k2];
							afb++;
							efb[afb] = "Examine";
							dfb[afb] = "@lre@" + j.vk[wcb[k2]][0];
							ffb[afb] = 3200;
							ifb[afb] = wcb[k2];
							afb++;
						}
					} else
					if (j3 == 3) {
						String s1 = "";
						int j4 = -1;
						int l4 = ocb[k2].oy;
						if (j.vl[l4] > 0) {
							int i5 = (j.rl[l4] + j.ul[l4] + j.sl[l4] + j.tl[l4]) / 4;
							int j5 = (ydb[0] + ydb[1] + ydb[2] + ydb[3] + 27) / 4;
							j4 = j5 - i5;
							s1 = "@yel@";
							if (j4 < 0)
								s1 = "@or1@";
							if (j4 < -3)
								s1 = "@or2@";
							if (j4 < -6)
								s1 = "@or3@";
							if (j4 < -9)
								s1 = "@red@";
							if (j4 > 0)
								s1 = "@gr1@";
							if (j4 > 3)
								s1 = "@gr2@";
							if (j4 > 6)
								s1 = "@gr3@";
							if (j4 > 9)
								s1 = "@gre@";
							s1 = " " + s1 + "(level-" + i5 + ")";
						}
						if (geb >= 0) {
							if (j.vo[geb] == 2) {
								efb[afb] = "Cast " + j.ro[geb] + " on";
								dfb[afb] = "@yel@" + j.pl[ocb[k2].oy][0];
								ffb[afb] = 700;
								gfb[afb] = ocb[k2].my;
								hfb[afb] = ocb[k2].ny;
								ifb[afb] = ocb[k2].ky;
								jfb[afb] = geb;
								afb++;
							}
						} else
						if (vdb >= 0) {
							efb[afb] = "Use " + wdb + " with";
							dfb[afb] = "@yel@" + j.pl[ocb[k2].oy][0];
							ffb[afb] = 710;
							gfb[afb] = ocb[k2].my;
							hfb[afb] = ocb[k2].ny;
							ifb[afb] = ocb[k2].ky;
							jfb[afb] = vdb;
							afb++;
						} else {
							if (j.vl[l4] > 0) {
								efb[afb] = "Attack";
								dfb[afb] = "@yel@" + j.pl[ocb[k2].oy][0] + s1;
								if (j4 >= 0)
									ffb[afb] = 715;
								else
									ffb[afb] = 2715;
								gfb[afb] = ocb[k2].my;
								hfb[afb] = ocb[k2].ny;
								ifb[afb] = ocb[k2].ky;
								afb++;
							}
							efb[afb] = "Talk-to";
							dfb[afb] = "@yel@" + j.pl[ocb[k2].oy][0];
							ffb[afb] = 720;
							gfb[afb] = ocb[k2].my;
							hfb[afb] = ocb[k2].ny;
							ifb[afb] = ocb[k2].ky;
							afb++;
							efb[afb] = "Examine";
							dfb[afb] = "@yel@" + j.pl[ocb[k2].oy][0];
							ffb[afb] = 3700;
							ifb[afb] = ocb[k2].oy;
							afb++;
						}
					}
				} else
				if (p1 != null && p1.pv >= 10000) {
					int l2 = p1.pv - 10000;
					int k3 = ndb[l2];
					if (!odb[l2]) {
						if (geb >= 0) {
							if (j.vo[geb] == 4) {
								efb[afb] = "Cast " + j.ro[geb] + " on";
								dfb[afb] = "@cya@" + j.mn[k3][0];
								ffb[afb] = 300;
								gfb[afb] = kdb[l2];
								hfb[afb] = ldb[l2];
								ifb[afb] = mdb[l2];
								jfb[afb] = geb;
								afb++;
							}
						} else
						if (vdb >= 0) {
							efb[afb] = "Use " + wdb + " with";
							dfb[afb] = "@cya@" + j.mn[k3][0];
							ffb[afb] = 310;
							gfb[afb] = kdb[l2];
							hfb[afb] = ldb[l2];
							ifb[afb] = mdb[l2];
							jfb[afb] = vdb;
							afb++;
						} else {
							if (!j.on[k3].equalsIgnoreCase("WalkTo")) {
								efb[afb] = j.on[k3];
								dfb[afb] = "@cya@" + j.mn[k3][0];
								ffb[afb] = 320;
								gfb[afb] = kdb[l2];
								hfb[afb] = ldb[l2];
								ifb[afb] = mdb[l2];
								afb++;
							}
							if (!j.pn[k3].equalsIgnoreCase("Examine")) {
								efb[afb] = j.pn[k3];
								dfb[afb] = "@cya@" + j.mn[k3][0];
								ffb[afb] = 2300;
								gfb[afb] = kdb[l2];
								hfb[afb] = ldb[l2];
								ifb[afb] = mdb[l2];
								afb++;
							}
							efb[afb] = "Examine";
							dfb[afb] = "@cya@" + j.mn[k3][0];
							ffb[afb] = 3300;
							ifb[afb] = k3;
							afb++;
						}
						odb[l2] = true;
					}
				} else
				if (p1 != null && p1.pv >= 0) {
					int i3 = p1.pv;
					int l3 = ddb[i3];
					if (!gdb[i3]) {
						if (geb >= 0) {
							if (j.vo[geb] == 5) {
								efb[afb] = "Cast " + j.ro[geb] + " on";
								dfb[afb] = "@cya@" + j.bn[l3][0];
								ffb[afb] = 400;
								gfb[afb] = bdb[i3];
								hfb[afb] = cdb[i3];
								ifb[afb] = edb[i3];
								jfb[afb] = ddb[i3];
								kfb[afb] = geb;
								afb++;
							}
						} else
						if (vdb >= 0) {
							efb[afb] = "Use " + wdb + " with";
							dfb[afb] = "@cya@" + j.bn[l3][0];
							ffb[afb] = 410;
							gfb[afb] = bdb[i3];
							hfb[afb] = cdb[i3];
							ifb[afb] = edb[i3];
							jfb[afb] = ddb[i3];
							kfb[afb] = vdb;
							afb++;
						} else {
							if (!j.dn[l3].equalsIgnoreCase("WalkTo")) {
								efb[afb] = j.dn[l3];
								dfb[afb] = "@cya@" + j.bn[l3][0];
								ffb[afb] = 420;
								gfb[afb] = bdb[i3];
								hfb[afb] = cdb[i3];
								ifb[afb] = edb[i3];
								jfb[afb] = ddb[i3];
								afb++;
							}
							if (!j.en[l3].equalsIgnoreCase("Examine")) {
								efb[afb] = j.en[l3];
								dfb[afb] = "@cya@" + j.bn[l3][0];
								ffb[afb] = 2400;
								gfb[afb] = bdb[i3];
								hfb[afb] = cdb[i3];
								ifb[afb] = edb[i3];
								jfb[afb] = ddb[i3];
								afb++;
							}
							efb[afb] = "Examine";
							dfb[afb] = "@cya@" + j.bn[l3][0];
							ffb[afb] = 3400;
							ifb[afb] = l3;
							afb++;
						}
						gdb[i3] = true;
					}
				} else {
					if (i2 >= 0)
						i2 = p1.qv[i2] - 0x30d40;
					if (i2 >= 0)
						l = i2;
				}
		}

		if (geb >= 0 && j.vo[geb] <= 1) {
			efb[afb] = "Cast " + j.ro[geb] + " on self";
			dfb[afb] = "";
			ffb[afb] = 1000;
			ifb[afb] = geb;
			afb++;
		}
		if (l != -1) {
			int j2 = l;
			if (geb >= 0) {
				if (j.vo[geb] == 6) {
					efb[afb] = "Cast " + j.ro[geb] + " on ground";
					dfb[afb] = "";
					ffb[afb] = 900;
					gfb[afb] = abb.bf[j2];
					hfb[afb] = abb.cf[j2];
					ifb[afb] = geb;
					afb++;
					return;
				}
			} else
			if (vdb < 0) {
				efb[afb] = "Walk here";
				dfb[afb] = "";
				ffb[afb] = 920;
				gfb[afb] = abb.bf[j2];
				hfb[afb] = abb.cf[j2];
				afb++;
			}
		}
	}

	public void tp() {
		if (aab != 0) {
			for (int l = 0; l < afb; l++) {
				int j1 = web + 2;
				int l1 = xeb + 27 + l * 15;
				if (super.ds <= j1 - 2 || super.es <= l1 - 12 || super.es >= l1 + 4 || super.ds >= (j1 - 3) + yeb)
					continue;
				fp(lfb[l]);
				break;
			}

			aab = 0;
			veb = false;
			return;
		}
		if (super.ds < web - 10 || super.es < xeb - 10 || super.ds > web + yeb + 10 || super.es > xeb + zeb + 10) {
			veb = false;
			return;
		}
		gab.fh(web, xeb, yeb, zeb, 0xd0d0d0, 160);
		gab.ah("Choose option", web + 2, xeb + 12, 1, 65535);
		for (int i1 = 0; i1 < afb; i1++) {
			int k1 = web + 2;
			int i2 = xeb + 27 + i1 * 15;
			int j2 = 0xffffff;
			if (super.ds > k1 - 2 && super.es > i2 - 12 && super.es < i2 + 4 && super.ds < (k1 - 3) + yeb)
				j2 = 0xffff00;
			gab.ah(efb[lfb[i1]] + " " + dfb[lfb[i1]], k1, i2, 1, j2);
		}

	}

	public void no() {
		if (geb >= 0 || vdb >= 0) {
			efb[afb] = "Cancel";
			dfb[afb] = "";
			ffb[afb] = 4000;
			afb++;
		}
		for (int l = 0; l < afb; l++)
			lfb[l] = l;

		for (boolean flag = false; !flag;) {
			flag = true;
			for (int i1 = 0; i1 < afb - 1; i1++) {
				int k1 = lfb[i1];
				int i2 = lfb[i1 + 1];
				if (ffb[k1] > ffb[i2]) {
					lfb[i1] = i2;
					lfb[i1 + 1] = k1;
					flag = false;
				}
			}

		}

		if (afb > 20)
			afb = 20;
		if (afb > 0) {
			int j1 = -1;
			for (int l1 = 0; l1 < afb; l1++) {
				if (dfb[lfb[l1]] == null || dfb[lfb[l1]].length() <= 0)
					continue;
				j1 = l1;
				break;
			}

			String s = null;
			if ((vdb >= 0 || geb >= 0) && afb == 1)
				s = "Choose a target";
			else
			if ((vdb >= 0 || geb >= 0) && afb > 1)
				s = "@whi@" + efb[lfb[0]] + " " + dfb[lfb[0]];
			else
			if (j1 != -1)
				s = dfb[lfb[j1]] + ": @whi@" + efb[lfb[0]];
			if (afb == 2 && s != null)
				s = s + "@whi@ / 1 more option";
			if (afb > 2 && s != null)
				s = s + "@whi@ / " + (afb - 1) + " more options";
			if (s != null)
				gab.ah(s, 6, 14, 1, 0xffff00);
			if (!cfb && aab == 1 || cfb && aab == 1 && afb == 1) {
				fp(lfb[0]);
				aab = 0;
				return;
			}
			if (!cfb && aab == 2 || cfb && aab == 1) {
				zeb = (afb + 1) * 15;
				yeb = gab.mf("Choose option", 1) + 5;
				for (int j2 = 0; j2 < afb; j2++) {
					int k2 = gab.mf(efb[j2] + " " + dfb[j2], 1) + 5;
					if (k2 > yeb)
						yeb = k2;
				}

				web = super.ds - yeb / 2;
				xeb = super.es - 7;
				veb = true;
				if (web < 0)
					web = 0;
				if (xeb < 0)
					xeb = 0;
				if (web + yeb > 510)
					web = 510 - yeb;
				if (xeb + zeb > 315)
					xeb = 315 - zeb;
				aab = 0;
			}
		}
	}

	public void fp(int l) {
		int i1 = gfb[l];
		int j1 = hfb[l];
		int k1 = ifb[l];
		int l1 = jfb[l];
		int i2 = kfb[l];
		int j2 = ffb[l];
		if (j2 == 200) {
			xn(gcb, hcb, i1, j1, true);
			super.zf.gc(224);
			super.zf.ec(i1 + fbb);
			super.zf.ec(j1 + gbb);
			super.zf.ec(k1);
			super.zf.ec(l1);
			on();
			geb = -1;
		}
		if (j2 == 210) {
			xn(gcb, hcb, i1, j1, true);
			super.zf.gc(250);
			super.zf.ec(i1 + fbb);
			super.zf.ec(j1 + gbb);
			super.zf.ec(k1);
			super.zf.ec(l1);
			on();
			vdb = -1;
		}
		if (j2 == 220) {
			xn(gcb, hcb, i1, j1, true);
			super.zf.gc(252);
			super.zf.ec(i1 + fbb);
			super.zf.ec(j1 + gbb);
			super.zf.ec(k1);
			on();
		}
		if (j2 == 3200)
			sp(j.wk[k1], 3);
		if (j2 == 300) {
			jp(i1, j1, k1);
			super.zf.gc(223);
			super.zf.ec(i1 + fbb);
			super.zf.ec(j1 + gbb);
			super.zf.fc(k1);
			super.zf.ec(l1);
			on();
			geb = -1;
		}
		if (j2 == 310) {
			jp(i1, j1, k1);
			super.zf.gc(239);
			super.zf.ec(i1 + fbb);
			super.zf.ec(j1 + gbb);
			super.zf.fc(k1);
			super.zf.ec(l1);
			on();
			vdb = -1;
		}
		if (j2 == 320) {
			jp(i1, j1, k1);
			super.zf.gc(238);
			super.zf.ec(i1 + fbb);
			super.zf.ec(j1 + gbb);
			super.zf.fc(k1);
			on();
		}
		if (j2 == 2300) {
			jp(i1, j1, k1);
			super.zf.gc(229);
			super.zf.ec(i1 + fbb);
			super.zf.ec(j1 + gbb);
			super.zf.fc(k1);
			on();
		}
		if (j2 == 3300)
			sp(j.nn[k1], 3);
		if (j2 == 400) {
			np(i1, j1, k1, l1);
			super.zf.gc(222);
			super.zf.ec(i1 + fbb);
			super.zf.ec(j1 + gbb);
			super.zf.ec(i2);
			on();
			geb = -1;
		}
		if (j2 == 410) {
			np(i1, j1, k1, l1);
			super.zf.gc(241);
			super.zf.ec(i1 + fbb);
			super.zf.ec(j1 + gbb);
			super.zf.ec(i2);
			on();
			vdb = -1;
		}
		if (j2 == 420) {
			np(i1, j1, k1, l1);
			super.zf.gc(242);
			super.zf.ec(i1 + fbb);
			super.zf.ec(j1 + gbb);
			on();
		}
		if (j2 == 2400) {
			np(i1, j1, k1, l1);
			super.zf.gc(230);
			super.zf.ec(i1 + fbb);
			super.zf.ec(j1 + gbb);
			on();
		}
		if (j2 == 3400)
			sp(j.cn[k1], 3);
		if (j2 == 600) {
			super.zf.gc(220);
			super.zf.ec(k1);
			super.zf.ec(l1);
			on();
			geb = -1;
		}
		if (j2 == 610) {
			super.zf.gc(240);
			super.zf.ec(k1);
			super.zf.ec(l1);
			on();
			vdb = -1;
		}
		if (j2 == 620) {
			super.zf.gc(248);
			super.zf.ec(k1);
			on();
		}
		if (j2 == 630) {
			super.zf.gc(249);
			super.zf.ec(k1);
			on();
		}
		if (j2 == 640) {
			super.zf.gc(246);
			super.zf.ec(k1);
			on();
		}
		if (j2 == 650) {
			vdb = k1;
			pdb = 0;
			wdb = j.vk[sdb[vdb]][0];
		}
		if (j2 == 660) {
			super.zf.gc(251);
			super.zf.ec(k1);
			on();
			vdb = -1;
			pdb = 0;
			sp("Dropping " + j.vk[sdb[k1]][0], 4);
		}
		if (j2 == 3600)
			sp(j.wk[k1], 3);
		if (j2 == 700) {
			int k2 = (i1 - 64) / jab;
			int j4 = (j1 - 64) / jab;
			lp(gcb, hcb, k2, j4, true);
			super.zf.gc(225);
			super.zf.ec(k1);
			super.zf.ec(l1);
			on();
			geb = -1;
		}
		if (j2 == 710) {
			int l2 = (i1 - 64) / jab;
			int k4 = (j1 - 64) / jab;
			lp(gcb, hcb, l2, k4, true);
			super.zf.gc(243);
			super.zf.ec(k1);
			super.zf.ec(l1);
			on();
			vdb = -1;
		}
		if (j2 == 720) {
			int i3 = (i1 - 64) / jab;
			int l4 = (j1 - 64) / jab;
			lp(gcb, hcb, i3, l4, true);
			super.zf.gc(245);
			super.zf.ec(k1);
			on();
		}
		if (j2 == 715 || j2 == 2715) {
			int j3 = (i1 - 64) / jab;
			int i5 = (j1 - 64) / jab;
			lp(gcb, hcb, j3, i5, true);
			super.zf.gc(244);
			super.zf.ec(k1);
			on();
		}
		if (j2 == 3700)
			sp(j.ql[k1], 3);
		if (j2 == 800) {
			int k3 = (i1 - 64) / jab;
			int j5 = (j1 - 64) / jab;
			lp(gcb, hcb, k3, j5, true);
			super.zf.gc(226);
			super.zf.ec(k1);
			super.zf.ec(l1);
			on();
			geb = -1;
		}
		if (j2 == 810) {
			int l3 = (i1 - 64) / jab;
			int k5 = (j1 - 64) / jab;
			lp(gcb, hcb, l3, k5, true);
			super.zf.gc(219);
			super.zf.ec(k1);
			super.zf.ec(l1);
			on();
			vdb = -1;
		}
		if (j2 == 805 || j2 == 2805) {
			int i4 = (i1 - 64) / jab;
			int l5 = (j1 - 64) / jab;
			lp(gcb, hcb, i4, l5, true);
			super.zf.gc(228);
			super.zf.ec(k1);
			on();
		}
		if (j2 == 2810) {
			super.zf.gc(235);
			super.zf.ec(k1);
			on();
		}
		if (j2 == 2820) {
			super.zf.gc(214);
			super.zf.ec(k1);
			on();
		}
		if (j2 == 900) {
			lp(gcb, hcb, i1, j1, true);
			super.zf.gc(221);
			super.zf.ec(i1 + fbb);
			super.zf.ec(j1 + gbb);
			super.zf.ec(k1);
			on();
			geb = -1;
		}
		if (j2 == 920) {
			lp(gcb, hcb, i1, j1, false);
			if (xab == -24)
				xab = 24;
		}
		if (j2 == 1000) {
			super.zf.gc(227);
			super.zf.ec(k1);
			on();
			geb = -1;
		}
		if (j2 == 4000) {
			vdb = -1;
			geb = -1;
		}
	}

	public mudclient() {
		sz = false;
		vz = false;
		wz = false;
		xz = true;
		zz = 0xbc614e;
		bab = 8000;
		cab = new int[bab];
		dab = new int[bab];
		jab = 128;
		lab = 800;
		mab = 600;
		nab = 9;
		qab = 40;
		vab = -1;
		wab = -1;
		ebb = -1;
		hbb = -1;
		pbb = 550;
		qbb = false;
		tbb = 1;
		vbb = 128;
		xbb = 4000;
		ybb = 500;
		ccb = new r[xbb];
		dcb = new r[ybb];
		ecb = new r[ybb];
		fcb = new r();
		icb = -1;
		jcb = 1000;
		kcb = 500;
		ncb = new r[jcb];
		ocb = new r[kcb];
		pcb = new r[kcb];
		qcb = new int[500];
		rcb = 500;
		ucb = new int[rcb];
		vcb = new int[rcb];
		wcb = new int[rcb];
		xcb = new int[rcb];
		ycb = 1500;
		adb = new p[ycb];
		bdb = new int[ycb];
		cdb = new int[ycb];
		ddb = new int[ycb];
		edb = new int[ycb];
		fdb = new p[200];
		gdb = new boolean[ycb];
		hdb = 500;
		jdb = new p[hdb];
		kdb = new int[hdb];
		ldb = new int[hdb];
		mdb = new int[hdb];
		ndb = new int[hdb];
		odb = new boolean[hdb];
		qdb = 30;
		sdb = new int[35];
		tdb = new int[35];
		udb = new int[35];
		vdb = -1;
		wdb = "";
		xdb = new int[16];
		ydb = new int[16];
		zdb = new int[5];
		geb = -1;
		oeb = 16;
		qeb = new boolean[oeb];
		reb = new boolean[50];
		seb = false;
		teb = true;
		ueb = false;
		veb = false;
		bfb = 200;
		cfb = false;
		dfb = new String[bfb];
		efb = new String[bfb];
		ffb = new int[bfb];
		gfb = new int[bfb];
		hfb = new int[bfb];
		ifb = new int[bfb];
		jfb = new int[bfb];
		kfb = new int[bfb];
		lfb = new int[bfb];
		wfb = 5;
		xfb = new String[wfb];
		yfb = new int[wfb];
		zfb = false;
		agb = "";
		cgb = new int[14];
		dgb = new int[14];
		fgb = new int[14];
		ggb = new int[14];
		hgb = false;
		igb = false;
		lgb = false;
		ogb = new int[256];
		pgb = new int[256];
		qgb = new int[256];
		rgb = -1;
		sgb = -2;
		tgb = false;
		vgb = new int[256];
		wgb = new int[256];
		xgb = -1;
		ygb = -2;
		zgb = false;
		bhb = new String[5];
		hhb = "";
		lhb = false;
		jib = "";
		kib = "";
		lib = "";
		mib = "";
		ckb = new int[20];
		rkb = false;
		vkb = -1;
		wkb = new int[5];
		xkb = new int[5];
		ykb = new int[5];
		zkb = new int[5];
		blb = new String[5];
		dlb = new String[50];
		elb = new int[50];
		flb = new int[50];
		glb = new int[50];
		hlb = new int[50];
		jlb = new int[50];
		klb = new int[50];
		llb = new int[50];
		mlb = new int[50];
		olb = new int[50];
		plb = new int[50];
		qlb = new int[50];
		ulb = false;
		wlb = 1;
		xlb = 2;
		ylb = 2;
		zlb = 8;
		amb = 14;
		cmb = 1;
	}

	boolean sz;
	int tz;
	int uz;
	boolean vz;
	boolean wz;
	public boolean xz;
	int yz;
	int zz;
	int aab;
	int bab;
	int cab[];
	int dab[];
	Graphics eab;
	a fab;
	g gab;
	Image hab;
	int iab;
	int jab;
	int kab;
	int lab;
	int mab;
	int nab;
	int oab;
	int pab;
	int qab;
	int rab;
	int sab;
	int tab;
	int uab;
	int vab;
	int wab;
	int xab;
	int yab;
	int zab;
	d abb;
	int bbb;
	int cbb;
	int dbb;
	int ebb;
	int fbb;
	int gbb;
	int hbb;
	int ibb;
	int jbb;
	int kbb;
	int lbb;
	int mbb;
	int nbb;
	int obb;
	int pbb;
	boolean qbb;
	int rbb;
	int sbb;
	int tbb;
	int ubb;
	int vbb;
	int wbb;
	int xbb;
	int ybb;
	int zbb;
	int acb;
	int bcb;
	r ccb[];
	r dcb[];
	r ecb[];
	r fcb;
	int gcb;
	int hcb;
	int icb;
	int jcb;
	int kcb;
	int lcb;
	int mcb;
	r ncb[];
	r ocb[];
	r pcb[];
	int qcb[];
	int rcb;
	int scb;
	int tcb;
	int ucb[];
	int vcb[];
	int wcb[];
	int xcb[];
	int ycb;
	int zcb;
	p adb[];
	int bdb[];
	int cdb[];
	int ddb[];
	int edb[];
	p fdb[];
	boolean gdb[];
	int hdb;
	int idb;
	p jdb[];
	int kdb[];
	int ldb[];
	int mdb[];
	int ndb[];
	boolean odb[];
	int pdb;
	int qdb;
	int rdb;
	int sdb[];
	int tdb[];
	int udb[];
	int vdb;
	String wdb;
	int xdb[];
	int ydb[];
	int zdb[];
	int aeb;
	String beb[] = {
		"Attack", "Defense", "Strength", "Hits", "Ranged", "Prayer", "Magic", "Cooking", "Woodcutting", "Fletching", 
		"Fishing", "Firemaking", "Crafting", "Smithing", "Mining", "Herblaw"
	};
	String ceb[] = {
		"Armour", "WeaponAim", "WeaponPower", "Magic", "Prayer"
	};
	o deb;
	int eeb;
	int feb;
	int geb;
	o heb;
	int ieb;
	int jeb;
	long keb;
	o leb;
	int meb;
	int neb;
	int oeb;
	String peb[] = {
		"Black knight's fortress", "Cook's assistant", "Demon slayer", "Doric's quest", "The restless ghost", "Goblin diplomacy", "Ernest the chicken", "Imp catcher", "Pirate's treasure", "Prince Ali rescue", 
		"Romeo & Juliet", "Sheep shearer", "Shield of Arrav", "The knight's sword", "Vampire slayer", "Witch's potion"
	};
	boolean qeb[];
	boolean reb[];
	boolean seb;
	boolean teb;
	boolean ueb;
	boolean veb;
	int web;
	int xeb;
	int yeb;
	int zeb;
	int afb;
	int bfb;
	boolean cfb;
	String dfb[];
	String efb[];
	int ffb[];
	int gfb[];
	int hfb[];
	int ifb[];
	int jfb[];
	int kfb[];
	int lfb[];
	int mfb;
	int nfb;
	int ofb;
	int pfb;
	o qfb;
	int rfb;
	int sfb;
	int tfb;
	int ufb;
	int vfb;
	int wfb;
	String xfb[];
	int yfb[];
	boolean zfb;
	String agb;
	int bgb;
	int cgb[];
	int dgb[];
	int egb;
	int fgb[];
	int ggb[];
	boolean hgb;
	boolean igb;
	int jgb;
	int kgb;
	boolean lgb;
	int mgb;
	int ngb;
	int ogb[];
	int pgb[];
	int qgb[];
	int rgb;
	int sgb;
	boolean tgb;
	int ugb;
	int vgb[];
	int wgb[];
	int xgb;
	int ygb;
	boolean zgb;
	int ahb;
	String bhb[];
	int chb;
	int dhb;
	int ehb;
	int fhb;
	int ghb;
	String hhb;
	int ihb;
	int jhb;
	int khb;
	boolean lhb;
	int mhb;
	int nhb;
	o ohb;
	int phb;
	int qhb;
	o rhb;
	int shb;
	int thb;
	int uhb;
	int vhb;
	int whb;
	int xhb;
	int yhb;
	int zhb;
	o aib;
	int bib;
	int cib;
	int dib;
	int eib;
	int fib;
	int gib;
	int hib;
	int iib;
	String jib;
	String kib;
	String lib;
	String mib;
	o nib;
	int oib;
	int pib;
	int qib;
	int rib;
	int sib;
	int tib;
	int uib;
	int vib;
	int wib;
	int xib;
	int yib;
	int zib;
	int ajb;
	int bjb;
	int cjb;
	int djb;
	o ejb;
	o fjb;
	o gjb;
	o hjb;
	o ijb;
	int jjb;
	int kjb;
	int ljb;
	int mjb;
	int njb;
	int ojb;
	int pjb;
	int qjb;
	int rjb;
	int sjb;
	int tjb;
	int ujb;
	int vjb;
	int wjb;
	int xjb;
	int yjb;
	int zjb;
	int akb;
	int bkb;
	int ckb[];
	int dkb;
	int ekb;
	int fkb;
	int gkb;
	int hkb;
	int ikb;
	int jkb;
	int kkb;
	int lkb;
	int mkb;
	int nkb;
	int okb;
	int pkb;
	int qkb;
	boolean rkb;
	o skb;
	int tkb;
	int ukb;
	int vkb;
	int wkb[];
	int xkb[];
	int ykb[];
	int zkb[];
	int alb[] = {
		0, 1, 2, 3, 4
	};
	String blb[];
	int clb;
	String dlb[];
	int elb[];
	int flb[];
	int glb[];
	int hlb[];
	int ilb;
	int jlb[];
	int klb[];
	int llb[];
	int mlb[];
	int nlb;
	int olb[];
	int plb[];
	int qlb[];
	int rlb;
	int slb;
	int tlb[][] = {
		{
			11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 
			3, 4
		}, {
			11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 
			3, 4
		}, {
			11, 3, 2, 9, 7, 1, 6, 10, 0, 5, 
			8, 4
		}, {
			3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 
			0, 5
		}, {
			3, 4, 2, 9, 7, 1, 6, 10, 8, 11, 
			0, 5
		}, {
			4, 3, 2, 9, 7, 1, 6, 10, 8, 11, 
			0, 5
		}, {
			11, 4, 2, 9, 7, 1, 6, 10, 0, 5, 
			8, 3
		}, {
			11, 2, 9, 7, 1, 6, 10, 0, 5, 8, 
			4, 3
		}
	};
	boolean ulb;
	int vlb;
	int wlb;
	int xlb;
	int ylb;
	int zlb;
	int amb;
	int bmb;
	int cmb;
	public int dmb[] = {
		0xff0000, 0xff8000, 0xffe000, 0xa0e000, 57344, 32768, 41088, 45311, 33023, 12528, 
		0xe000e0, 0x303030, 0x604000, 0x805000, 0xffffff
	};
	public int emb[] = {
		0xffc030, 0xffa040, 0x805030, 0x604020, 0x303030, 0xff6020, 0xff4000, 0xffffff, 65280, 65535
	};
	public int fmb[] = {
		0xecded0, 0xccb366, 0xb38c40, 0x997326, 0x906020
	};
	int gmb[] = {
		0, 1, 2, 1
	};
	int hmb[] = {
		0, 1, 2, 1, 0, 0, 0, 0
	};
	int imb[] = {
		0, 0, 0, 0, 0, 1, 2, 1
	};
	String jmb[] = {
		"Where were you born?", "What was your first teacher's name?", "What is your father's middle name?", "Who was your first best friend?", "What is your favourite vacation spot?", "What is your mother's middle name?", "What was your first pet's name?", "What was the name of your first school?", "What is your mother's maiden name?", "Who was your first boyfriend/girlfriend?", 
		"What was the first computer game you purchased?", "Who is your favourite actor/actress?", "Who is your favourite author?", "Who is your favourite musician?", "Who is your favourite cartoon character?", "What is your favourite book?", "What is your favourite food?", "What is your favourite movie?"
	};
}
