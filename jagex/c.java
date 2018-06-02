// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb space 

package jagex;

import java.io.*;
import java.net.URL;

// Referenced classes of package jagex:
//			q

public class c {

	public static InputStream nc(String s) throws IOException {
		Object obj;
		//if (td == null) {
			obj = new FileInputStream(s);
		/*} else {
			URL url = new URL(td, s);
			obj = url.openStream();
		}*/
		return ((InputStream) (obj));
	}

	public static void xc(String s, byte abyte0[], int i) throws IOException {
		InputStream inputstream = nc(s);
		DataInputStream datainputstream = new DataInputStream(inputstream);
		try {
			datainputstream.readFully(abyte0, 0, i);
		}
		catch (EOFException _ex) { }
		datainputstream.close();
	}

	public static int tc(byte byte0) {
		return byte0 & 0xff;
	}

	public static int vc(byte abyte0[], int i) {
		return ((abyte0[i] & 0xff) << 8) + (abyte0[i + 1] & 0xff);
	}

	public static int uc(byte abyte0[], int i) {
		return ((abyte0[i] & 0xff) << 24) + ((abyte0[i + 1] & 0xff) << 16) + ((abyte0[i + 2] & 0xff) << 8) + (abyte0[i + 3] & 0xff);
	}

	public static long pc(byte abyte0[], int i) {
		return (((long)uc(abyte0, i) & 0xffffffffL) << 32) + ((long)uc(abyte0, i + 4) & 0xffffffffL);
	}

	public static int bd(byte abyte0[], int i) {
		int j = tc(abyte0[i]) * 256 + tc(abyte0[i + 1]);
		if (j > 32767)
			j -= 0x10000;
		return j;
	}

	public static int qc(byte abyte0[], int i, int j) {
		int k = i >> 3;
		int l = 8 - (i & 7);
		int i1 = 0;
		for (; j > l; l = 8) {
			i1 += (abyte0[k++] & ud[l]) << j - l;
			j -= l;
		}

		if (j == l)
			i1 += abyte0[k] & ud[l];
		else
			i1 += abyte0[k] >> l - j & ud[j];
		return i1;
	}

	public static String oc(String s, int i) {
		String s1 = "";
		for (int j = 0; j < i; j++)
			if (j >= s.length()) {
				s1 = s1 + " ";
			} else {
				char c1 = s.charAt(j);
				if (c1 >= 'a' && c1 <= 'z')
					s1 = s1 + c1;
				else
				if (c1 >= 'A' && c1 <= 'Z')
					s1 = s1 + c1;
				else
				if (c1 >= '0' && c1 <= '9')
					s1 = s1 + c1;
				else
					s1 = s1 + '_';
			}

		return s1;
	}

	public static String yc(String s, int i) {
		for (; s.length() < i; s = s + " ");
		if (s.length() > i)
			s = s.substring(0, i);
		return s;
	}

	public static long mc(String s) {
		s = s.trim();
		s = s.toLowerCase();
		long l = 0L;
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			l = l * 47L * (l - (long)(c1 * 6) - (long)(i * 7));
			l += (c1 - 32) + i * c1;
		}

		return l;
	}

	public static long dd(String s) {
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			if (c1 >= 'a' && c1 <= 'z')
				s1 = s1 + c1;
			else
			if (c1 >= 'A' && c1 <= 'Z')
				s1 = s1 + (char)((c1 + 97) - 65);
			else
			if (c1 >= '0' && c1 <= '9')
				s1 = s1 + c1;
			else
				s1 = s1 + ' ';
		}

		s1 = s1.trim();
		if (s1.length() > 12)
			s1 = s1.substring(0, 12);
		long l = 0L;
		for (int j = 0; j < s1.length(); j++) {
			char c2 = s1.charAt(j);
			l *= 37L;
			if (c2 >= 'a' && c2 <= 'z')
				l += (1 + c2) - 97;
			else
			if (c2 >= '0' && c2 <= '9')
				l += (27 + c2) - 48;
		}

		return l;
	}

	public static String zc(long l) {
		String s = "";
		while (l != 0L)  {
			int i = (int)(l % 37L);
			l /= 37L;
			if (i == 0)
				s = " " + s;
			else
			if (i < 27) {
				if (l % 37L == 0L)
					s = (char)((i + 65) - 1) + s;
				else
					s = (char)((i + 97) - 1) + s;
			} else {
				s = (char)((i + 48) - 27) + s;
			}
		}
		return s;
	}

	public static byte[] cd(String s) throws IOException {
		int i = 0;
		int j = 0;
		int k = 0;
		byte abyte0[] = null;
		while (i < 2) 
			try {
				if (i == 1)
					s = s.toUpperCase();
				InputStream inputstream = nc(s);
				DataInputStream datainputstream = new DataInputStream(inputstream);
				byte abyte2[] = new byte[6];
				datainputstream.readFully(abyte2, 0, 6);
				j = ((abyte2[0] & 0xff) << 16) + ((abyte2[1] & 0xff) << 8) + (abyte2[2] & 0xff);
				k = ((abyte2[3] & 0xff) << 16) + ((abyte2[4] & 0xff) << 8) + (abyte2[5] & 0xff);
				int l = 0;
				abyte0 = new byte[k];
				int i1;
				for (; l < k; l += i1) {
					i1 = k - l;
					if (i1 > 1000)
						i1 = 1000;
					datainputstream.readFully(abyte0, l, i1);
				}

				i = 2;
				datainputstream.close();
			}
			catch (IOException _ex) {
				i++;
			}
		if (k != j) {
			byte abyte1[] = new byte[j];
			q.dn(abyte1, j, abyte0, k, 0);
			return abyte1;
		} else {
			return abyte0;
		}
	}

	public static int wc(String s, byte abyte0[]) {
		int i = abyte0[0] * 256 + abyte0[1];
		int j = 0;
		s = s.toUpperCase();
		for (int k = 0; k < s.length(); k++)
			j = (j * 61 + s.charAt(k)) - 32;

		int l = 2 + i * 10;
		int j1, k1;
		for (int i1 = 0; i1 < i; i1++) {
			j1 = (abyte0[i1 * 10 + 2] & 0xff) * 0x1000000 + (abyte0[i1 * 10 + 3] & 0xff) * 0x10000 + (abyte0[i1 * 10 + 4] & 0xff) * 256 + (abyte0[i1 * 10 + 5] & 0xff);
			k1 = (abyte0[i1 * 10 + 9] & 0xff) * 0x10000 + (abyte0[i1 * 10 + 10] & 0xff) * 256 + (abyte0[i1 * 10 + 11] & 0xff);
			if (j1 == j) {
				try (java.io.FileOutputStream out = new java.io.FileOutputStream(String.format("output/%s", s))) {
					out.write(abyte0, l, k1);
				} catch (Exception e) {
				}
				return l;
			}
			l += k1;
		}

		return 0;
	}

	public static byte[] sc(String s, int i, byte abyte0[], byte abyte1[]) {
		int j = abyte0[0] * 256 + abyte0[1];
		int k = 0;
		s = s.toUpperCase();
		for (int l = 0; l < s.length(); l++)
			k = (k * 61 + s.charAt(l)) - 32;

		int i1 = 2 + j * 10;
		for (int j1 = 0; j1 < j; j1++) {
			int k1 = (abyte0[j1 * 10 + 2] & 0xff) * 0x1000000 + (abyte0[j1 * 10 + 3] & 0xff) * 0x10000 + (abyte0[j1 * 10 + 4] & 0xff) * 256 + (abyte0[j1 * 10 + 5] & 0xff);
			int l1 = (abyte0[j1 * 10 + 6] & 0xff) * 0x10000 + (abyte0[j1 * 10 + 7] & 0xff) * 256 + (abyte0[j1 * 10 + 8] & 0xff);
			int i2 = (abyte0[j1 * 10 + 9] & 0xff) * 0x10000 + (abyte0[j1 * 10 + 10] & 0xff) * 256 + (abyte0[j1 * 10 + 11] & 0xff);
			if (k1 == k) {
				if (l1 != i2) {
					q.dn(abyte1, l1, abyte0, i2, i1);
				} else {
					for (int j2 = 0; j2 < l1; j2++)
						abyte1[j2] = abyte0[i1 + j2];

				}
				try (java.io.FileOutputStream out = new java.io.FileOutputStream(String.format("output/%s", s))) {
					out.write(abyte1, 0, l1);
				} catch (Exception e) {
				}
				return abyte1;
			}
			i1 += i2;
		}

		return null;
	}

	public static byte[] lc(String s, int i, byte abyte0[]) {
		int j = abyte0[0] * 256 + abyte0[1];
		int k = 0;
		s = s.toUpperCase();
		for (int l = 0; l < s.length(); l++)
			k = (k * 61 + s.charAt(l)) - 32;

		int i1 = 2 + j * 10;
		for (int j1 = 0; j1 < j; j1++) {
			int k1 = (abyte0[j1 * 10 + 2] & 0xff) * 0x1000000 + (abyte0[j1 * 10 + 3] & 0xff) * 0x10000 + (abyte0[j1 * 10 + 4] & 0xff) * 256 + (abyte0[j1 * 10 + 5] & 0xff);
			int l1 = (abyte0[j1 * 10 + 6] & 0xff) * 0x10000 + (abyte0[j1 * 10 + 7] & 0xff) * 256 + (abyte0[j1 * 10 + 8] & 0xff);
			int i2 = (abyte0[j1 * 10 + 9] & 0xff) * 0x10000 + (abyte0[j1 * 10 + 10] & 0xff) * 256 + (abyte0[j1 * 10 + 11] & 0xff);
			if (k1 == k) {
				byte abyte1[] = new byte[l1 + i];
				if (l1 != i2) {
					q.dn(abyte1, l1, abyte0, i2, i1);
				} else {
					for (int j2 = 0; j2 < l1; j2++)
						abyte1[j2] = abyte0[i1 + j2];

				}
				try (java.io.FileOutputStream out = new java.io.FileOutputStream(String.format("output/%s", s))) {
					out.write(abyte1, 0, l1);
				} catch (Exception e) {
				}
				return abyte1;
			}
			i1 += i2;
		}

		return null;
	}

	public static String rc(String s, boolean flag) {
		s = s.replace('~', '@');
		for (int i = 0; i < 2; i++) {
			String s1 = s;
			yd = 0;
			int j = 0;
			for (int k = 0; k < s.length(); k++) {
				char c1 = s.charAt(k);
				if (c1 >= 'A' && c1 <= 'Z')
					c1 = (char)((c1 + 97) - 65);
				if (flag && c1 == '@' && k + 4 < s.length() && s.charAt(k + 4) == '@') {
					k += 4;
				} else {
					byte byte0;
					if (c1 >= 'a' && c1 <= 'z' || c1 >= '0' && c1 <= '9')
						byte0 = 0;
					else
					if (c1 == '\'')
						byte0 = 1;
					else
					if (c1 == '\r' || c1 == ' ' || c1 == '.' || c1 == ',' || c1 == '-' || c1 == '(' || c1 == ')' || c1 == '?' || c1 == '!')
						byte0 = 2;
					else
						byte0 = 3;
					int l = yd;
					for (int i1 = 0; i1 < l; i1++)
						if (byte0 == 3) {
							if (de[i1] > 0 && de[i1] < zd[i1] + be[i1].length() / 2) {
								de[yd] = de[i1] + 1;
								ce[yd] = ce[i1];
								ae[yd] = ae[i1] + 1;
								zd[yd] = zd[i1];
								be[yd++] = be[i1];
								de[i1] = -de[i1];
							}
						} else {
							char c2 = be[i1].charAt(ae[i1]);
							if (ad(c1, c2)) {
								ae[i1]++;
								if (de[i1] < 0)
									de[i1] = -de[i1];
							} else
							if ((c1 == ' ' || c1 == '\r') && zd[i1] == 0) {
								ae[i1] = 0x1869f;
							} else {
								char c3 = be[i1].charAt(ae[i1] - 1);
								if (byte0 == 0 && !ad(c1, c3))
									ae[i1] = 0x1869f;
							}
						}

					if (byte0 >= 2)
						j = 1;
					if (byte0 <= 2) {
						for (int j1 = 0; j1 < vd.length; j1++)
							if (ad(c1, vd[j1].charAt(0))) {
								de[yd] = 1;
								ce[yd] = k;
								ae[yd] = 1;
								zd[yd] = 1;
								be[yd++] = vd[j1];
							}

						for (int l1 = 0; l1 < wd.length; l1++)
							if (ad(c1, wd[l1].charAt(0))) {
								de[yd] = 1;
								ce[yd] = k;
								ae[yd] = 1;
								zd[yd] = j;
								be[yd++] = wd[l1];
							}

						if (j == 1) {
							for (int j2 = 0; j2 < xd.length; j2++)
								if (ad(c1, xd[j2].charAt(0))) {
									de[yd] = 1;
									ce[yd] = k;
									ae[yd] = 1;
									zd[yd] = 1;
									be[yd++] = xd[j2];
								}

						}
						if (byte0 == 0)
							j = 0;
					}
					for (int k1 = 0; k1 < yd; k1++)
						if (ae[k1] >= be[k1].length()) {
							if (ae[k1] < 0x1869f) {
								String s2 = "";
								for (int k2 = 0; k2 < s.length(); k2++)
									if (k2 < ce[k1] || k2 > k)
										s2 = s2 + s.charAt(k2);
									else
										s2 = s2 + "*";

								s = s2;
							}
							yd--;
							for (int i2 = k1; i2 < yd; i2++) {
								zd[i2] = zd[i2 + 1];
								ae[i2] = ae[i2 + 1];
								be[i2] = be[i2 + 1];
								ce[i2] = ce[i2 + 1];
								de[i2] = de[i2 + 1];
							}

							k1--;
						}

				}
			}

			if (s.equalsIgnoreCase(s1))
				break;
		}

		return s;
	}

	static boolean ad(char c1, char c2) {
		if (c1 == c2)
			return true;
		if (c2 == 'i' && (c1 == 'l' || c1 == '1' || c1 == '!' || c1 == '|' || c1 == ':' || c1 == '\246' || c1 == ';'))
			return true;
		if (c2 == 's' && (c1 == '5' || c1 == '$'))
			return true;
		if (c2 == 'a' && (c1 == '4' || c1 == '@'))
			return true;
		if (c2 == 'c' && (c1 == '(' || c1 == '<' || c1 == '['))
			return true;
		if (c2 == 'o' && c1 == '0')
			return true;
		return c2 == 'u' && c1 == 'v';
	}

	public c() {
	}

	public static URL td = null;
	static int ud[] = {
		0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 
		1023, 2047, 4095, 8191, 16383, 32767, 65535
	};
	static String vd[] = {
		"fuck", "bastard", "lesbian", "prostitut", "spastic", "vagina", "retard", "arsehole", "asshole", "tosser", 
		"homosex", "hetrosex", "hitler", "urinate"
	};
	static String wd[] = {
		"shit", "lesbo", "phuck", "bitch", "penis", "bisex", "sperm", "rapist", "shag", "slag", 
		"slut", "clit", "cunt", "piss", "nazi", "urine"
	};
	static String xd[] = {
		"wank", "naked", "fag", "niga", "nige", "gay", "rape", "cock", "homo", "twat", 
		"arse", "crap"
	};
	static int yd;
	static int zd[] = new int[1000];
	static int ae[] = new int[1000];
	static String be[] = new String[1000];
	static int ce[] = new int[1000];
	static int de[] = new int[1000];

}
