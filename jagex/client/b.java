// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb space 

package jagex.client;

import jagex.m;
import java.applet.Applet;
import java.io.*;
import java.net.*;

public class b extends m
	implements Runnable {

	public b(InputStream inputstream) {
		super(inputstream);
		kd = false;
		ld = "error in twriter";
		qd = true;
		rd = 3;
	}

	public b(Socket socket) throws IOException {
		super(socket);
		kd = false;
		ld = "error in twriter";
		qd = true;
		rd = 3;
	}

	public b(String s) throws IOException {
		super(s);
		kd = false;
		ld = "error in twriter";
		qd = true;
		rd = 3;
	}

	public b(byte abyte0[]) {
		super(abyte0);
		kd = false;
		ld = "error in twriter";
		qd = true;
		rd = 3;
	}

	public static b xb(String s, Applet applet, int i) throws IOException {
		Socket socket;
		if (applet != null)
			socket = new Socket(InetAddress.getByName(applet.getCodeBase().getHost()), i);
		else
			socket = new Socket(InetAddress.getByName(s), i);
		socket.setSoTimeout(30000);
		return new b(socket);
	}

	public void qi() {
		if (super.iq)
			return;
		try {
			if (super.hq != null)
				super.hq.close();
			if (pd != null) {
				qd = true;
				synchronized (this) {
					notify();
				}
				pd = null;
			}
			if (super.fq != null)
				super.fq.close();
			if (super.gq != null)
				super.gq.close();
			md = null;
			sd = null;
			return;
		}
		catch (IOException _ex) {
			System.out.println("Error closing stream");
		}
	}

	public InetAddress ac() {
		return super.hq.getLocalAddress();
	}

	public void hc(byte abyte0[], int i, int j) throws IOException {
		if (super.iq) {
			return;
		} else {
			super.gq.write(abyte0, i, j);
			return;
		}
	}

	public void dc(byte abyte0[], int i, int j, boolean flag) throws IOException {
		if (super.iq)
			return;
		if (md == null)
			md = new byte[5000];
		synchronized (this) {
			for (int k = 0; k < j; k++) {
				md[od] = abyte0[k + i];
				od = (od + 1) % 5000;
				if (od != (nd + 4900) % 5000)
					continue;
				kd = true;
				ld = "Write buffer full! " + j;
				k = j + 1;
				qd = true;
				super.fq.close();
				super.gq.close();
				super.iq = true;
				break;
			}

			if (flag) {
				if (pd == null) {
					qd = false;
					pd = new Thread(this);
					pd.setDaemon(true);
					pd.setPriority(4);
					pd.start();
				}
				notify();
			}
		}
		if (kd)
			throw new IOException(ld);
		else
			return;
	}

	public void yb() {
		synchronized (this) {
			if (od == nd || md == null)
				return;
			if (pd == null) {
				qd = false;
				pd = new Thread(this);
				pd.setDaemon(true);
				pd.setPriority(4);
				pd.start();
			}
			notify();
		}
	}

	public void run() {
		while (pd != null && !qd)  {
			int i;
			int j;
			synchronized (this) {
				if (od == nd)
					try {
						wait();
					}
					catch (InterruptedException _ex) { }
				if (pd == null || qd)
					return;
				j = nd;
				if (od >= nd)
					i = od - nd;
				else
					i = 5000 - nd;
			}
			if (i > 0) {
				try {
					super.gq.write(md, j, i);
				}
				catch (IOException ioexception) {
					kd = true;
					ld = "Twriter IOEx:" + ioexception;
				}
				nd = (nd + i) % 5000;
				try {
					if (od == nd)
						super.gq.flush();
				}
				catch (IOException ioexception1) {
					kd = true;
					ld = "Twriter IOEx:" + ioexception1;
				}
			}
		}
	}

	public void gc(int i) {
		if (sd == null)
			sd = new byte[4000];
		sd[2] = (byte)i;
		rd = 3;
	}

	public void fc(int i) {
		sd[rd++] = (byte)i;
	}

	public void ec(int i) {
		sd[rd++] = (byte)(i >> 8);
		sd[rd++] = (byte)i;
	}

	public void cc(int i) {
		sd[rd++] = (byte)(i >> 24);
		sd[rd++] = (byte)(i >> 16);
		sd[rd++] = (byte)(i >> 8);
		sd[rd++] = (byte)i;
	}

	public void wb(long l) {
		cc((int)(l >> 32));
		cc((int)(l & -1L));
	}

	public void zb(String s) {
		s.getBytes(0, s.length(), sd, rd);
		rd += s.length();
	}

	public void bc(int i, int j) {
		sd[j++] = (byte)(i >> 8);
		sd[j++] = (byte)i;
	}

	public void ic() throws IOException {
		sd[0] = (byte)((rd - 2) / 256);
		sd[1] = (byte)(rd - 2 & 0xff);
		dc(sd, 0, rd, true);
	}

	public void jc() {
		sd[0] = (byte)((rd - 2) / 256);
		sd[1] = (byte)(rd - 2 & 0xff);
		try {
			dc(sd, 0, rd, true);
			return;
		}
		catch (IOException _ex) {
			return;
		}
	}

	public void kc() {
		sd[0] = (byte)((rd - 2) / 256);
		sd[1] = (byte)(rd - 2 & 0xff);
		try {
			dc(sd, 0, rd, false);
			return;
		}
		catch (IOException _ex) {
			return;
		}
	}

	private boolean kd;
	private String ld;
	private byte md[];
	private int nd;
	private int od;
	private Thread pd;
	private boolean qd;
	public int rd;
	public byte sd[];
}
