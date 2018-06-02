// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb space 

package jagex;

import java.io.*;
import java.net.Socket;

// Referenced classes of package jagex:
//			c

public class m {

	public m(InputStream inputstream) {
		iq = false;
		fq = inputstream;
	}

	public m(Socket socket) throws IOException {
		iq = false;
		hq = socket;
		fq = socket.getInputStream();
		gq = socket.getOutputStream();
	}

	public m(String s) throws IOException {
		iq = false;
		fq = c.nc(s);
	}

	public m(byte abyte0[]) {
		iq = false;
		jq = abyte0;
		kq = 0;
		iq = true;
	}

	public m(byte abyte0[], int i) {
		iq = false;
		jq = abyte0;
		kq = i;
		iq = true;
	}

	public void qi() {
		if (iq)
			return;
		if (gq != null)
			try {
				gq.flush();
			}
			catch (IOException _ex) { }
		try {
			if (hq != null)
				hq.close();
			if (fq != null)
				fq.close();
			if (gq != null) {
				gq.close();
				return;
			}
		}
		catch (IOException _ex) {
			System.out.println("Error closing stream");
		}
	}

	public int ri() throws IOException {
		if (jq != null)
			return jq[kq++];
		if (iq)
			return 0;
		else
			return fq.read();
	}

	public int ji() throws IOException {
		return ri();
	}

	public int ii() throws IOException {
		int i = ji();
		int j = ji();
		return i * 256 + j;
	}

	public int oi() throws IOException {
		if (iq)
			return 0;
		else
			return fq.available();
	}

	public void ki(int i, byte abyte0[]) throws IOException {
		if (iq)
			return;
		int j = 0;
		boolean flag = false;
		int k;
		for (; j < i; j += k)
			if ((k = fq.read(abyte0, j, i - j)) <= 0)
				throw new IOException("EOF");

	}

	public void li() throws IOException {
		for (int i = ri(); i != 61 && i != -1; i = ri());
	}

	public int mi() throws IOException {
		int i = 0;
		boolean flag = false;
		int j;
		for (j = ri(); j < 48 || j > 57;) {
			if (j == 45)
				flag = true;
			j = ri();
			if (j == -1)
				throw new IOException("Eof!");
		}

		for (; j >= 48 && j <= 57; j = ri())
			i = (i * 10 + j) - 48;

		if (flag)
			i = -i;
		return i;
	}

	public String ni() throws IOException {
		String s = "";
		boolean flag = false;
		int i;
		for (i = ri(); i < 32 || i == 44 || i == 59 || i == 61;) {
			i = ri();
			if (i == -1)
				throw new IOException("Eof!");
		}

		if (i == 34) {
			flag = true;
			i = ri();
		}
		for (; i != -1; i = ri()) {
			if (!flag && (i == 44 || i == 61 || i == 59) || flag && i == 34)
				break;
			s = s + xq[i];
		}

		return s;
	}

	public int pi() throws IOException {
		int i = 0;
		int j;
		for (j = ri(); (j < 48 || j > 57) && (j < 97 || j > 102) && (j < 65 || j > 70);) {
			j = ri();
			if (j == -1)
				throw new IOException("Eof!");
		}

		do {
			if (j >= 48 && j <= 57)
				i = (i * 16 + j) - 48;
			else
			if (j >= 97 && j <= 102) {
				i = (i * 16 + j + 10) - 97;
			} else {
				if (j < 65 || j > 70)
					break;
				i = (i * 16 + j + 10) - 65;
			}
			j = ri();
		} while (true);
		return i;
	}

	protected InputStream fq;
	protected OutputStream gq;
	protected Socket hq;
	protected boolean iq;
	protected byte jq[];
	int kq;
	final int lq = 61;
	final int mq = 59;
	final int nq = 42;
	final int oq = 43;
	final int pq = 44;
	final int qq = 45;
	final int rq = 46;
	final int sq = 47;
	final int tq = 92;
	final int uq = 32;
	final int vq = 124;
	final int wq = 34;
	static char xq[];

	static  {
		xq = new char[256];
		for (int i = 0; i < 256; i++)
			xq[i] = (char)i;

		xq[61] = '=';
		xq[59] = ';';
		xq[42] = '*';
		xq[43] = '+';
		xq[44] = ',';
		xq[45] = '-';
		xq[46] = '.';
		xq[47] = '/';
		xq[92] = '\\';
		xq[124] = '|';
		xq[33] = '!';
		xq[34] = '"';
	}
}
