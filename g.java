// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb space 

import jagex.client.i;
import java.awt.Component;

public class g extends i {

	public g(int j, int k, int l, Component component) {
		super(j, k, l, component);
		boolean flag = false;
		if (flag)
			new i(j, k, l, component);
	}

	public void nf(int j, int k, int l, int i1, int j1, int k1, int l1) {
		if (j1 >= 40000) {
			pg.op(j, k, l, i1, j1 - 40000, k1, l1);
			return;
		}
		if (j1 >= 20000) {
			pg.gp(j, k, l, i1, j1 - 20000, k1, l1);
			return;
		}
		if (j1 >= 5000) {
			pg.ko(j, k, l, i1, j1 - 5000, k1, l1);
			return;
		} else {
			super.ug(j, k, l, i1, j1);
			return;
		}
	}

	public mudclient pg;
}
