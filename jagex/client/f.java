// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb space 

package jagex.client;

import jagex.c;
import jagex.m;
import java.applet.Applet;
import java.awt.*;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;

// Referenced classes of package jagex.client:
//			n, b

public class f extends n {

	public void me(String s, String s1) {
		try {
			xf = s;
			s = c.oc(s, 20);
			yf = s1;
			s1 = c.oc(s1, 20);
			if (s.trim().length() == 0 || s1.trim().length() == 0) {
				gf(pf[0], pf[1]);
				return;
			}
			gf(pf[6], pf[7]);
			if (vi())
				zf = b.xb(uf, this, wf);
			else
				zf = b.xb(uf, null, wf);
			byte abyte0[] = {
				127, 0, 0, 1
			};
			try {
				InetAddress inetaddress = zf.ac();
				abyte0 = inetaddress.getAddress();
			}
			catch (Exception _ex) { }
			if (abyte0[0] == 127 && abyte0[1] == 0 && abyte0[2] == 0 && abyte0[3] == 1)
				try {
					InetAddress inetaddress1 = InetAddress.getLocalHost();
					abyte0 = inetaddress1.getAddress();
				}
				catch (Exception _ex) { }
			try {
				if (abyte0[0] == 127 && abyte0[1] == 0 && abyte0[2] == 0 && abyte0[3] == 1 && vi()) {
					String s2 = getParameter("client");
					if (s2 != null && s2.equals("exe")) {
						abyte0[0] = (byte)(int)(Math.random() * 256D);
						abyte0[1] = (byte)(int)(Math.random() * 256D);
						abyte0[2] = (byte)(int)(Math.random() * 256D);
						abyte0[3] = (byte)(int)(Math.random() * 256D);
					}
				}
			}
			catch (Exception _ex) { }
			zf.gc(0);
			zf.wb(c.dd(s));
			zf.zb(s1);
			zf.ec(tf);
			zf.fc(abyte0[0]);
			zf.fc(abyte0[1]);
			zf.fc(abyte0[2]);
			zf.fc(abyte0[3]);
			zf.ic();
			zf.ii();
			int i = zf.ri();
			System.out.println("Login response: " + i);
			if (i == 0) {
				se();
				ne();
				return;
			}
			if (i == 2) {
				gf(pf[8], pf[9]);
				return;
			}
			if (i == 3) {
				gf(pf[10], pf[11]);
				return;
			}
			if (i == 4) {
				gf(pf[4], pf[5]);
				return;
			}
			if (i == 5) {
				gf(pf[16], pf[17]);
				return;
			}
			if (i == 6) {
				gf(pf[18], pf[19]);
				return;
			}
			if (i == 7) {
				gf(pf[20], pf[21]);
				return;
			} else {
				gf(pf[12], pf[13]);
				return;
			}
		}
		catch (Exception exception) {
			uf = vf;
			System.out.println(String.valueOf(exception));
			gf(pf[12], pf[13]);
			return;
		}
	}

	public void oe(String s, String s1, String s2, int i, int j, int k) {
		try {
			if (vi())
				zf = b.xb(uf, this, wf);
			else
				zf = b.xb(uf, null, wf);
			zf.gc(2);
			s = c.oc(s, 20);
			s1 = c.oc(s1, 20);
			zf.wb(c.dd(s));
			zf.zb(s1);
			for (; s2.length() < 40; s2 = s2 + " ");
			zf.zb(s2);
			zf.cc(i);
			zf.cc(j);
			zf.cc(k);
			zf.jc();
			zf.ii();
			int l = zf.ri();
			zf.qi();
			System.out.println("Newplayer response: " + l);
			if (l == 0) {
				xe();
				return;
			}
			if (l == 2) {
				gf(pf[8], pf[9]);
				return;
			}
			if (l == 3) {
				gf(pf[14], pf[15]);
				return;
			}
			if (l == 4) {
				gf(pf[4], pf[5]);
				return;
			}
			if (l == 5) {
				gf(pf[16], pf[17]);
				return;
			}
			if (l == 6) {
				gf(pf[18], pf[19]);
				return;
			}
			if (l == 7) {
				gf(pf[20], pf[21]);
				return;
			} else {
				gf(pf[12], pf[13]);
				return;
			}
		}
		catch (Exception exception) {
			uf = vf;
			System.out.println(String.valueOf(exception));
			gf(pf[12], pf[13]);
			return;
		}
	}

	public void ve() {
		if (zf != null) {
			zf.gc(1);
			zf.jc();
			xf = "";
			yf = "";
			ye();
		}
	}

	public void kf(String s, String s1) {
		xf = s;
		s = c.oc(s, 20);
		yf = s1;
		s1 = c.oc(s1, 20);
		if (s.length() == 0 || s1.length() == 0) {
			ye();
			return;
		}
		for (long l = System.currentTimeMillis(); System.currentTimeMillis() - l < 60000L;) {
			pe(pf[2], pf[3]);
			try {
				if (vi())
					zf = b.xb(uf, this, wf);
				else
					zf = b.xb(uf, null, wf);
				byte abyte0[] = {
					127, 0, 0, 1
				};
				try {
					InetAddress inetaddress = zf.ac();
					abyte0 = inetaddress.getAddress();
				}
				catch (Exception _ex) { }
				if (abyte0[0] == 127 && abyte0[1] == 0 && abyte0[2] == 0 && abyte0[3] == 1)
					try {
						InetAddress inetaddress1 = InetAddress.getLocalHost();
						abyte0 = inetaddress1.getAddress();
					}
					catch (Exception _ex) { }
				zf.gc(19);
				zf.wb(c.dd(s));
				zf.zb(s1);
				zf.ec(tf);
				zf.fc(abyte0[0]);
				zf.fc(abyte0[1]);
				zf.fc(abyte0[2]);
				zf.fc(abyte0[3]);
				zf.ic();
				zf.ii();
				int i = zf.ri();
				if (i == 0) {
					se();
					ff();
					return;
				}
				if (i >= 1 && i <= 6) {
					s = "";
					s1 = "";
					ye();
					return;
				}
			}
			catch (Exception _ex) {
				pe(pf[2], pf[3]);
			}
			pe(pf[2], pf[3]);
			try {
				Thread.sleep(5000L);
			}
			catch (Exception _ex) { }
		}

		s = "";
		s1 = "";
		ye();
	}

	public void jf() {
		System.out.println("Lost connection");
		kf(xf, yf);
	}

	public void pe(String s, String s1) {
		Graphics g = getGraphics();
		Font font = new Font("Helvetica", 1, 15);
		int i = ti();
		int j = aj();
		g.setColor(Color.black);
		g.fillRect(i / 2 - 140, j / 2 - 25, 280, 50);
		g.setColor(Color.white);
		g.drawRect(i / 2 - 140, j / 2 - 25, 280, 50);
		cj(g, s, font, i / 2, j / 2 - 10);
		cj(g, s1, font, i / 2, j / 2 + 10);
	}

	public void se() {
		ag = 0;
		bg = 0;
		sf = -500;
		fg = 0;
	}

	public void ze() {
		long l = System.currentTimeMillis();
		eg = l;
	}

	public void re() {
		try {
			long l = System.currentTimeMillis();
			if (l - eg > 5000L) {
				eg = l;
				zf.gc(5);
				zf.ic();
			}
			if (!ue())
				return;
			sf++;
			if (sf > rf) {
				se();
				jf();
				return;
			}
			if (ag == 0 && zf.oi() >= 2)
				ag = zf.ii();
			if (ag > 0 && zf.oi() >= ag) {
				zf.ki(ag, cg);
				bg = c.tc(cg[0]);
				sf = 0;
				if (bg == 8) {
					String s = new String(cg, 1, ag - 1);
					af(c.rc(s, true));
				}
				if (bg == 9)
					ve();
				if (bg == 10)
					ef();
				else
				if (bg == 23) {
					fg = c.tc(cg[1]);
					for (int i = 0; i < fg; i++) {
						gg[i] = c.pc(cg, 2 + i * 9);
						hg[i] = c.tc(cg[10 + i * 9]);
					}

				} else
				if (bg == 24) {
					long l1 = c.pc(cg, 1);
					int k = cg[9] & 0xff;
					for (int i1 = 0; i1 < fg; i1++)
						if (gg[i1] == l1) {
							if (hg[i1] == 0 && k != 0)
								af("@pri@" + c.zc(l1) + " has logged in");
							if (hg[i1] != 0 && k == 0)
								af("@pri@" + c.zc(l1) + " has logged out");
							hg[i1] = k;
							ag = 0;
							return;
						}

					gg[fg] = l1;
					hg[fg] = k;
					fg++;
					af("@pri@" + c.zc(l1) + " has been added to your friends list");
				} else
				if (bg == 26) {
					ig = c.tc(cg[1]);
					for (int j = 0; j < ig; j++)
						jg[j] = c.pc(cg, 2 + j * 8);

				} else
				if (bg == 27) {
					kg = cg[1];
					lg = cg[2];
					mg = cg[3];
					ng = cg[4];
					og = cg[5];
				} else
				if (bg == 28) {
					long l2 = c.pc(cg, 1);
					String s1 = new String(cg, 9, ag - 9);
					if (l2 != c.dd(xf))
						s1 = c.rc(s1, true);
					af("@pri@" + c.zc(l2) + ": tells you " + s1);
				} else {
					we(bg, ag, cg);
				}
				ag = 0;
				return;
			}
		}
		catch (IOException _ex) {
			jf();
		}
	}

	public void cf(String s) {
		s = c.oc(s, 20);
		zf.gc(25);
		zf.zb(s);
		zf.jc();
	}

	public void bf(int i, int j, int k, int l, int i1) {
		zf.gc(31);
		zf.fc(i);
		zf.fc(j);
		zf.fc(k);
		zf.fc(l);
		zf.fc(i1);
		zf.jc();
	}

	public void df(String s) {
		long l = c.dd(s);
		zf.gc(29);
		zf.wb(l);
		zf.jc();
		for (int i = 0; i < ig; i++)
			if (jg[i] == l)
				return;

		if (ig >= 50) {
			return;
		} else {
			jg[ig++] = l;
			return;
		}
	}

	public void lf(long l) {
		zf.gc(30);
		zf.wb(l);
		zf.jc();
		for (int i = 0; i < ig; i++)
			if (jg[i] == l) {
				ig--;
				for (int j = i; j < ig; j++)
					jg[j] = jg[j + 1];

				return;
			}

	}

	public void hf(String s) {
		zf.gc(26);
		zf.wb(c.dd(s));
		zf.jc();
	}

	public void te(long l) {
		zf.gc(27);
		zf.wb(l);
		zf.jc();
		for (int i = 0; i < fg; i++) {
			if (gg[i] != l)
				continue;
			fg--;
			for (int j = i; j < fg; j++) {
				gg[j] = gg[j + 1];
				hg[j] = hg[j + 1];
			}

			break;
		}

		af("@pri@" + c.zc(l) + " has been removed from your friends list");
	}

	public void qe(long l, String s) {
		if (s.length() > 80)
			s = s.substring(0, 80);
		zf.gc(28);
		zf.wb(l);
		zf.fc(s.length());
		zf.zb(s);
		zf.jc();
		af("@pri@You tell " + c.zc(l) + ": " + s);
	}

	public boolean _mthif(String s) {
		if (s.toLowerCase().startsWith("tell ")) {
			s = s.substring(5);
			int i = s.indexOf(' ');
			if (i == -1 || i >= s.length() - 1) {
				af("You must type a message too!");
				return true;
			} else {
				String s1 = s.substring(0, i);
				s = s.substring(i + 1);
				qe(c.dd(s1), s);
				return true;
			}
		}
		zf.gc(3);
		zf.zb(s);
		zf.jc();
		eg = dg = System.currentTimeMillis();
		if (qf)
			af("@yel@" + xf.trim() + ": @whi@" + s);
		return false;
	}

	public void gf(String s, String s1) {
	}

	public void ff() {
	}

	public void ne() {
	}

	public void ye() {
	}

	public void ef() {
	}

	public void xe() {
	}

	public void we(int i, int j, byte abyte0[]) {
	}

	public void af(String s) {
	}

	public boolean ue() {
		return true;
	}

	public f() {
		uf = "127.0.0.1";
		vf = "server3.runescape.com";
		wf = 43594;
		xf = "";
		yf = "";
		cg = new byte[5000];
		gg = new long[50];
		hg = new int[50];
		jg = new long[50];
	}

	public static String pf[];
	public static boolean qf = true;
	public static int rf = 0x5f5e0ff;
	public static int sf;
	public static int tf = 1;
	public String uf;
	public String vf;
	public int wf;
	String xf;
	String yf;
	public b zf;
	int ag;
	int bg;
	byte cg[];
	long dg;
	long eg;
	public int fg;
	public long gg[];
	public int hg[];
	public int ig;
	public long jg[];
	public int kg;
	public int lg;
	public int mg;
	public int ng;
	public int og;

	static  {
		pf = new String[50];
		pf[0] = "You must enter both a username";
		pf[1] = "and a password - Please try again";
		pf[2] = "Connection lost! Please wait...";
		pf[3] = "Attempting to re-establish";
		pf[4] = "That username is already in use.";
		pf[5] = "Wait 60 seconds then retry";
		pf[6] = "Please wait...";
		pf[7] = "Connecting to server";
		pf[8] = "Sorry! The server is currently full.";
		pf[9] = "Please try again later";
		pf[10] = "Invalid username or password.";
		pf[11] = "Try again, or create a new account";
		pf[12] = "Sorry! Unable to connect to server.";
		pf[13] = "Check your internet settings";
		pf[14] = "Username already taken.";
		pf[15] = "Please choose another username";
		pf[16] = "The client has been updated.";
		pf[17] = "Please reload this page";
		pf[18] = "You may only use 1 character at once.";
		pf[19] = "Your ip-address is already in use";
		pf[20] = "Connection limit exceeded!";
		pf[21] = "Please try again in 1 minute";
	}
}
