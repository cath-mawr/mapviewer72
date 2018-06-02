// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) nonlb space 

package jagex.client;

import java.awt.*;

// Referenced classes of package jagex.client:
//			n

public class l extends Frame {

	public l(n n1, int i, int j, String s, boolean flag, boolean flag1) {
		cq = 28;
		zp = i;
		aq = j;
		dq = n1;
		if (flag1)
			cq = 48;
		else
			cq = 28;
		setTitle(s);
		setResizable(flag);
		show();
		toFront();
		resize(zp, aq);
		eq = getGraphics();
	}

	public Graphics getGraphics() {
		Graphics g = super.getGraphics();
		if (bq == 0)
			g.translate(0, 24);
		else
			g.translate(-5, 0);
		return g;
	}

	public void resize(int i, int j) {
		super.resize(i, j + cq);
	}

	public int hi() {
		return size().width;
	}

	public int gi() {
		return size().height - cq;
	}

	public boolean handleEvent(Event event) {
		if (event.id == 401)
			dq.keyDown(event, event.key);
		else
		if (event.id == 402)
			dq.keyUp(event, event.key);
		else
		if (event.id == 501)
			dq.mouseDown(event, event.x, event.y - 24);
		else
		if (event.id == 506)
			dq.mouseDrag(event, event.x, event.y - 24);
		else
		if (event.id == 502)
			dq.mouseUp(event, event.x, event.y - 24);
		else
		if (event.id == 503)
			dq.mouseMove(event, event.x, event.y - 24);
		else
		if (event.id == 201)
			dq.destroy();
		else
		if (event.id == 1001)
			dq.action(event, event.target);
		else
		if (event.id == 403)
			dq.keyDown(event, event.key);
		else
		if (event.id == 404)
			dq.keyUp(event, event.key);
		return true;
	}

	public final void paint(Graphics g) {
		dq.paint(g);
	}

	int zp;
	int aq;
	int bq;
	int cq;
	n dq;
	Graphics eq;
}
