// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb space 

package jagex.client;

import jagex.c;
import jagex.q;
import java.applet.Applet;
import java.awt.*;
import java.awt.image.IndexColorModel;
import java.awt.image.MemoryImageSource;
import java.io.*;

// Referenced classes of package jagex.client:
//			l, i

public class n extends Applet
	implements Runnable {

	public void ui() {
	}

	public synchronized void ej() {
	}

	public void qj() {
	}

	public synchronized void nj() {
	}

	public void xi() {
	}

	public final void oj(int j, int k, String s, boolean flag) {
		fr = false;
		System.out.println("Started application");
		yq = j;
		zq = k;
		er = new l(this, j, k, s, flag, false);
		kr = 1;
		ar = new Thread(this);
		ar.start();
		ar.setPriority(1);
	}

	public final boolean vi() {
		return fr;
	}

	public final void lj(int j, int k, String s, boolean flag) {
		if (er != null) {
			return;
		} else {
			yq = j;
			zq = k;
			er = new l(this, j, k, s, flag, fr);
			return;
		}
	}

	public final void jj(int j, int k) {
		if (er == null) {
			return;
		} else {
			er.resize(j, k);
			yq = j;
			zq = k;
			return;
		}
	}

	public final void bj(Image image) {
		if (er == null) {
			return;
		} else {
			er.setIconImage(image);
			return;
		}
	}

	public void fj(int j, int k) {
		jj(j, k);
	}

	public final Graphics getGraphics() {
		if (er == null)
			return super.getGraphics();
		else
			return er.getGraphics();
	}

	public final int ti() {
		return yq;
	}

	public final int aj() {
		return zq;
	}

	public final Image createImage(int j, int k) {
		if (er == null)
			return super.createImage(j, k);
		else
			return er.createImage(j, k);
	}

	public Frame yi() {
		return er;
	}

	public final void hj(int j) {
		br = 1000 / j;
	}

	public final void mj(int j) {
		cr = j;
	}

	public final void pj() {
		for (int j = 0; j < 10; j++)
			dr[j] = 0L;

	}

	public synchronized boolean keyDown(Event event, int j) {
		gj(j);
		hs = j;
		is = j;
		jr = 0;
		if (j == 1006)
			wr = true;
		if (j == 1007)
			xr = true;
		if (j == 1004)
			yr = true;
		if (j == 1005)
			zr = true;
		if ((char)j == ' ')
			as = true;
		if ((char)j == 'n' || (char)j == 'm')
			bs = true;
		if ((char)j == 'N' || (char)j == 'M')
			bs = true;
		if ((char)j == '{')
			ur = true;
		if ((char)j == '}')
			vr = true;
		if ((char)j == '\u03F0')
			js = !js;
		if ((j >= 97 && j <= 122 || j >= 65 && j <= 90 || j >= 48 && j <= 57 || j == 32) && ks.length() < 20)
			ks += (char)j;
		if (j >= 32 && j <= 122 && ms.length() < 80)
			ms += (char)j;
		if (j == 8 && ks.length() > 0)
			ks = ks.substring(0, ks.length() - 1);
		if (j == 8 && ms.length() > 0)
			ms = ms.substring(0, ms.length() - 1);
		if (j == 10 || j == 13) {
			ls = ks;
			ns = ms;
		}
		return true;
	}

	public void gj(int j) {
	}

	public synchronized boolean keyUp(Event event, int j) {
		hs = 0;
		if (j == 1006)
			wr = false;
		if (j == 1007)
			xr = false;
		if (j == 1004)
			yr = false;
		if (j == 1005)
			zr = false;
		if ((char)j == ' ')
			as = false;
		if ((char)j == 'n' || (char)j == 'm')
			bs = false;
		if ((char)j == 'N' || (char)j == 'M')
			bs = false;
		if ((char)j == '{')
			ur = false;
		if ((char)j == '}')
			vr = false;
		return true;
	}

	public synchronized boolean mouseMove(Event event, int j, int k) {
		ds = j;
		es = k + ir;
		fs = 0;
		jr = 0;
		return true;
	}

	public synchronized boolean mouseUp(Event event, int j, int k) {
		ds = j;
		es = k + ir;
		fs = 0;
		return true;
	}

	public synchronized boolean mouseDown(Event event, int j, int k) {
		ds = j;
		es = k + ir;
		if (event.metaDown())
			fs = 2;
		else
			fs = 1;
		gs = fs;
		jr = 0;
		return true;
	}

	public synchronized boolean mouseDrag(Event event, int j, int k) {
		ds = j;
		es = k + ir;
		if (event.metaDown())
			fs = 2;
		else
			fs = 1;
		return true;
	}

	public final void init() {
		fr = true;
		System.out.println("Started applet");
		yq = size().width;
		zq = size().height;
		kr = 1;
		c.td = getCodeBase();
		ar = new Thread(this);
		ar.start();
	}

	public final void start() {
		if (gr >= 0)
			gr = 0;
	}

	public final void stop() {
		if (gr >= 0)
			gr = 4000 / br;
	}

	public final void destroy() {
		gr = -1;
		try {
			Thread.sleep(5000L);
		}
		catch (Exception _ex) { }
		if (gr == -1) {
			System.out.println("5 seconds expired, forcing kill");
			dj();
			if (ar != null) {
				ar.stop();
				ar = null;
			}
		}
	}

	public final void dj() {
		gr = -2;
		System.out.println("Closing program");
		qj();
		try {
			Thread.sleep(1000L);
		}
		catch (Exception _ex) { }
		if (er != null)
			er.dispose();
		if (!fr)
			System.exit(0);
	}

	public final void run() {
		if (kr == 1) {
			kr = 2;
			tr = getGraphics();
			zi();
			kj(0, "Loading...");
			ui();
			kr = 0;
		}
		int j = 0;
		int k = 256;
		int i1 = 1;
		int j1 = 0;
		for (int k1 = 0; k1 < 10; k1++)
			dr[k1] = System.currentTimeMillis();

		long l1 = System.currentTimeMillis();
		while (gr >= 0)  {
			if (gr > 0) {
				gr--;
				if (gr == 0) {
					dj();
					ar = null;
					return;
				}
			}
			int i2 = k;
			int j2 = i1;
			k = 300;
			i1 = 1;
			long l2 = System.currentTimeMillis();
			if (dr[j] == 0L) {
				k = i2;
				i1 = j2;
			} else
			if (l2 > dr[j])
				k = (int)((long)(2560 * br) / (l2 - dr[j]));
			if (k < 25)
				k = 25;
			if (k > 256) {
				k = 256;
				i1 = (int)((long)br - (l2 - dr[j]) / 10L);
				if (i1 < cs)
					i1 = cs;
			}
			try {
				Thread.sleep(i1);
			}
			catch (InterruptedException _ex) { }
			dr[j] = l2;
			j = (j + 1) % 10;
			if (i1 > 1) {
				for (int k2 = 0; k2 < 10; k2++)
					if (dr[k2] != 0L)
						dr[k2] += i1;

			}
			int i3 = 0;
			while (j1 < 256)  {
				ej();
				j1 += k;
				if (++i3 > cr) {
					j1 = 0;
					hr += 6;
					if (hr > 25) {
						hr = 0;
						js = true;
					}
					break;
				}
			}
			hr--;
			j1 &= 0xff;
			nj();
			os = (1000 * k) / (br * 256);
			if (fr && j == 0)
				showStatus("Fps:" + os + "Del:" + i1);
			if (er != null && (er.hi() != yq || er.gi() != zq))
				fj(er.hi(), er.gi());
		}
		if (gr == -1)
			dj();
		ar = null;
	}

	public final void update(Graphics g) {
		paint(g);
	}

	public final void paint(Graphics g) {
		if (kr == 2 && sr != null) {
			kj(nr, or);
			return;
		}
		if (kr == 0)
			xi();
	}

	public void zi() {
		try {
			byte abyte0[] = c.cd("jagex.jag");
			byte abyte1[] = c.lc("logo.tga", 0, abyte0);
			sr = ij(abyte1);
			i.rf(c.lc("h11p.jf", 0, abyte0));
			i.rf(c.lc("h12b.jf", 0, abyte0));
			i.rf(c.lc("h12p.jf", 0, abyte0));
			i.rf(c.lc("h13b.jf", 0, abyte0));
			i.rf(c.lc("h14b.jf", 0, abyte0));
			i.rf(c.lc("h16b.jf", 0, abyte0));
			i.rf(c.lc("h20b.jf", 0, abyte0));
			i.rf(c.lc("h24b.jf", 0, abyte0));
			return;
		}
		catch (IOException _ex) {
			System.out.println("Error loading jagex.dat");
		}
	}

	public void kj(int j, String s) {
		int k = (yq - 281) / 2;
		int i1 = (zq - 148) / 2;
		tr.setColor(Color.black);
		tr.fillRect(0, 0, yq, zq);
		if (!mr)
			tr.drawImage(sr, k, i1, this);
		k += 2;
		i1 += 90;
		nr = j;
		or = s;
		tr.setColor(new Color(132, 132, 132));
		if (mr)
			tr.setColor(new Color(220, 0, 0));
		tr.drawRect(k - 2, i1 - 2, 280, 23);
		tr.fillRect(k, i1, (277 * j) / 100, 20);
		tr.setColor(new Color(198, 198, 198));
		if (mr)
			tr.setColor(new Color(255, 255, 255));
		cj(tr, s, pr, k + 138, i1 + 10);
		if (!mr) {
			cj(tr, "Created by JAGeX - visit www.jagex.com", qr, k + 138, i1 + 30);
			cj(tr, "Copyright \2512000 Andrew Gower", qr, k + 138, i1 + 44);
		} else {
			tr.setColor(new Color(132, 132, 152));
			cj(tr, "Copyright \2512000 Andrew Gower", rr, k + 138, zq - 20);
		}
		if (lr != null) {
			tr.setColor(Color.white);
			cj(tr, lr, qr, k + 138, i1 - 120);
		}
	}

	public void si(int j, String s) {
		int k = (yq - 281) / 2;
		int i1 = (zq - 148) / 2;
		k += 2;
		i1 += 90;
		nr = j;
		or = s;
		int j1 = (277 * j) / 100;
		tr.setColor(new Color(132, 132, 132));
		if (mr)
			tr.setColor(new Color(220, 0, 0));
		tr.fillRect(k, i1, j1, 20);
		tr.setColor(Color.black);
		tr.fillRect(k + j1, i1, 277 - j1, 20);
		tr.setColor(new Color(198, 198, 198));
		if (mr)
			tr.setColor(new Color(255, 255, 255));
		cj(tr, s, pr, k + 138, i1 + 10);
	}

	public void cj(Graphics g, String s, Font font, int j, int k) {
		Object obj;
		if (er == null)
			obj = this;
		else
			obj = er;
		FontMetrics fontmetrics = ((Component) (obj)).getFontMetrics(font);
		fontmetrics.stringWidth(s);
		g.setFont(font);
		g.drawString(s, j - fontmetrics.stringWidth(s) / 2, k + fontmetrics.getHeight() / 4);
	}

	public Image ij(byte abyte0[]) {
		int j = abyte0[13] * 256 + abyte0[12];
		int k = abyte0[15] * 256 + abyte0[14];
		byte abyte1[] = new byte[256];
		byte abyte2[] = new byte[256];
		byte abyte3[] = new byte[256];
		for (int i1 = 0; i1 < 256; i1++) {
			abyte1[i1] = abyte0[20 + i1 * 3];
			abyte2[i1] = abyte0[19 + i1 * 3];
			abyte3[i1] = abyte0[18 + i1 * 3];
		}

		IndexColorModel indexcolormodel = new IndexColorModel(8, 256, abyte1, abyte2, abyte3);
		byte abyte4[] = new byte[j * k];
		int j1 = 0;
		for (int k1 = k - 1; k1 >= 0; k1--) {
			for (int l1 = 0; l1 < j; l1++)
				abyte4[j1++] = abyte0[786 + l1 + k1 * j];

		}

		MemoryImageSource memoryimagesource = new MemoryImageSource(j, k, indexcolormodel, abyte4, 0, j);
		Image image = createImage(memoryimagesource);
		return image;
	}

	public byte[] wi(String s, String s1, int j) throws IOException {
		int k = 0;
		int i1 = 0;
		int j1 = 0;
		byte abyte0[] = null;
		System.out.println(s);
		while (k < 2) 
			try {
				si(j, "Loading " + s1 + " - 0%");
				if (k == 1)
					s = s.toUpperCase();
				java.io.InputStream inputstream = c.nc(s);
				DataInputStream datainputstream = new DataInputStream(inputstream);
				byte abyte2[] = new byte[6];
				datainputstream.readFully(abyte2, 0, 6);
				i1 = ((abyte2[0] & 0xff) << 16) + ((abyte2[1] & 0xff) << 8) + (abyte2[2] & 0xff);
				j1 = ((abyte2[3] & 0xff) << 16) + ((abyte2[4] & 0xff) << 8) + (abyte2[5] & 0xff);
				si(j, "Loading " + s1 + " - 5%");
				int k1 = 0;
				abyte0 = new byte[j1];
				while (k1 < j1)  {
					int l1 = j1 - k1;
					if (l1 > 1000)
						l1 = 1000;
					datainputstream.readFully(abyte0, k1, l1);
					k1 += l1;
					si(j, "Loading " + s1 + " - " + (5 + (k1 * 95) / j1) + "%");
				}
				k = 2;
				datainputstream.close();
			}
			catch (IOException _ex) {
				k++;
			}
		si(j, "Unpacking " + s1);
		if (j1 != i1) {
			byte abyte1[] = new byte[i1];
			q.dn(abyte1, i1, abyte0, j1, 0);
			return abyte1;
		} else {
			return abyte0;
		}
	}

	public n() {
		yq = 512;
		zq = 384;
		br = 20;
		cr = 1000;
		dr = new long[10];
		kr = 1;
		mr = false;
		or = "Loading";
		pr = new Font("TimesRoman", 0, 15);
		qr = new Font("Helvetica", 1, 13);
		rr = new Font("Helvetica", 0, 12);
		ur = false;
		vr = false;
		wr = false;
		xr = false;
		yr = false;
		zr = false;
		as = false;
		bs = false;
		cs = 1;
		js = false;
		ks = "";
		ls = "";
		ms = "";
		ns = "";
	}

	private int yq;
	private int zq;
	private Thread ar;
	private int br;
	private int cr;
	private long dr[];
	static l er = null;
	private boolean fr;
	private int gr;
	private int hr;
	public int ir;
	public int jr;
	public int kr;
	public String lr;
	private boolean mr;
	private int nr;
	private String or;
	private Font pr;
	private Font qr;
	private Font rr;
	private Image sr;
	private Graphics tr;
	public boolean ur;
	public boolean vr;
	public boolean wr;
	public boolean xr;
	public boolean yr;
	public boolean zr;
	public boolean as;
	public boolean bs;
	public int cs;
	public int ds;
	public int es;
	public int fs;
	public int gs;
	public int hs;
	public int is;
	public boolean js;
	public String ks;
	public String ls;
	public String ms;
	public String ns;
	public int os;

}
