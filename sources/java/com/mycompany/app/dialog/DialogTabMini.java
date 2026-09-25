package com.mycompany.app.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.mycompany.app.db.book.DbBookTab;
import com.mycompany.app.dialog.DialogDeleteItem;
import com.mycompany.app.dialog.DialogEditorText;
import com.mycompany.app.dialog.DialogSetFull;
import com.mycompany.app.dialog.DialogTabFind;
import com.mycompany.app.dialog.DialogTabMain;
import com.mycompany.app.image.ImageSizeListener;
import com.mycompany.app.main.MainApp;
import com.mycompany.app.main.MainListView;
import com.mycompany.app.main.MainUtil;
import com.mycompany.app.pref.PrefAlbum;
import com.mycompany.app.pref.PrefSecret;
import com.mycompany.app.pref.PrefSet;
import com.mycompany.app.pref.PrefSync;
import com.mycompany.app.pref.PrefWeb;
import com.mycompany.app.pref.PrefZone;
import com.mycompany.app.pref.PrefZtwo;
import com.mycompany.app.quick.TabDragHelper;
import com.mycompany.app.quick.TabSubView;
import com.mycompany.app.soulbrowser.R;
import com.mycompany.app.view.MyButtonCheck;
import com.mycompany.app.view.MyButtonImage;
import com.mycompany.app.view.MyButtonRelative;
import com.mycompany.app.view.MyButtonText;
import com.mycompany.app.view.MyCoverView;
import com.mycompany.app.view.MyDialogBottom;
import com.mycompany.app.view.MyDialogMenu;
import com.mycompany.app.view.MyFadeFrame;
import com.mycompany.app.view.MyFadeListener;
import com.mycompany.app.view.MyLineLinear;
import com.mycompany.app.view.MyLineText;
import com.mycompany.app.view.MyManagerLinear;
import com.mycompany.app.view.MyPopupAdapter;
import com.mycompany.app.view.MyPopupMenu;
import com.mycompany.app.view.MyRecyclerView;
import com.mycompany.app.view.MyRoundImage;
import com.mycompany.app.view.MyRoundLinear;
import com.mycompany.app.view.MyScrollBar;
import com.mycompany.app.view.MySnackbar;
import com.mycompany.app.web.TabListLongPressGate;
import com.mycompany.app.web.WebNestFrame;
import com.mycompany.app.web.WebTabAdapter;
import com.mycompany.app.web.WebTabBarAdapter;
import com.mycompany.app.web.WebViewActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class DialogTabMini extends MyDialogBottom {
    public static final /* synthetic */ int H1 = 0;
    public MyLineText A0;
    public boolean A1;
    public AppCompatTextView B0;
    public boolean B1;
    public int C0;
    public boolean C1;
    public int D0;
    public boolean D1;
    public MyPopupMenu E0;
    public boolean E1;
    public MyPopupMenu F0;
    public boolean F1;
    public MyPopupMenu G0;
    public boolean G1;
    public MyFadeFrame H0;
    public DialogSetTabRestore I0;
    public DialogDeleteItem J0;
    public DialogDeleteItem K0;
    public DialogTabEdit L0;
    public DialogEditIcon M0;
    public TabSubView N0;
    public PopupWindow O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public final int U0;
    public float V0;
    public float W0;
    public float X0;
    public GestureDetector Y0;
    public boolean Z0;
    public WebViewActivity a0;
    public MySnackbar a1;
    public Context b0;
    public boolean b1;
    public DialogTabMain.ListTabListener c0;
    public DialogTabFind c1;
    public WebNestFrame d0;
    public boolean d1;
    public List e0;
    public boolean e1;
    public final boolean f0;
    public DialogTabMain.ReleaseBackListener f1;
    public final boolean g0;
    public boolean g1;
    public boolean h0;
    public boolean h1;
    public boolean i0;
    public WebTabAdapter.WebTabItem i1;
    public boolean j0;
    public WebTabAdapter j1;
    public MyDialogMenu k0;
    public int k1;
    public MyButtonImage l0;
    public int l1;
    public AppCompatTextView m0;
    public WebTabAdapter.WebTabItem m1;
    public MyButtonCheck n0;
    public WebTabAdapter.WebTabItem n1;
    public LinearLayout o0;
    public int o1;
    public MyButtonRelative p0;
    public WebTabAdapter.WebTabItem p1;
    public ImageView q0;
    public WebTabAdapter.WebTabItem q1;
    public MyButtonRelative r0;
    public List r1;
    public ImageView s0;
    public int s1;
    public TabLayout t0;
    public int t1;
    public ViewPager2 u0;
    public int u1;
    public ViewPager2.OnPageChangeCallback v0;
    public List v1;
    public TabGrid w0;
    public long w1;
    public TabGrid x0;
    public int x1;
    public MyScrollBar y0;
    public long y1;
    public MyLineLinear z0;
    public boolean z1;

    /* renamed from: com.mycompany.app.dialog.DialogTabMini$13, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass13 implements TabLayoutMediator.TabConfigurationStrategy {
    }

    /* renamed from: com.mycompany.app.dialog.DialogTabMini$14, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass14 implements Runnable {
        public AnonymousClass14() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            DialogTabMini.this.dismiss();
        }
    }

    /* renamed from: com.mycompany.app.dialog.DialogTabMini$15, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass15 implements View.OnClickListener {
        public AnonymousClass15() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DialogTabMini dialogTabMini = DialogTabMini.this;
            if (dialogTabMini.c0 == null || dialogTabMini.z1) {
                return;
            }
            dialogTabMini.z1 = true;
            boolean z = PrefSync.k;
            boolean z2 = dialogTabMini.h0;
            if (z == z2) {
                WebTabAdapter G = dialogTabMini.G(z2);
                if (G != null && G.J() != 0) {
                    DialogTabMini.D(dialogTabMini, dialogTabMini.h0);
                    return;
                } else {
                    dialogTabMini.dismiss();
                    return;
                }
            }
            dialogTabMini.s(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.15.1
                /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.mycompany.app.web.WebTabAdapter$WebTabItem] */
                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    DialogTabMini dialogTabMini2 = DialogTabMini.this;
                    WebTabAdapter G2 = dialogTabMini2.G(dialogTabMini2.h0);
                    if (G2 != null) {
                        List list = G2.j;
                        if (list != null) {
                            i = list.size();
                        } else {
                            i = 0;
                        }
                        ?? obj = new Object();
                        obj.f19520c = DbBookTab.f(list);
                        obj.d = DbBookTab.j(i, list);
                        obj.h = i;
                        obj.j = WebViewActivity.o3();
                        obj.k = WebViewActivity.q3(dialogTabMini2.b0, obj);
                        obj.l = PrefWeb.j;
                        boolean z3 = dialogTabMini2.h0;
                        if (z3) {
                            PrefSync.m = i;
                        } else {
                            PrefSync.l = i;
                        }
                        DbBookTab.o(dialogTabMini2.b0, obj, z3);
                        Handler handler = dialogTabMini2.i;
                        if (handler == null) {
                            return;
                        }
                        handler.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.15.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                DialogTabMini.D(dialogTabMini3, dialogTabMini3.h0);
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: com.mycompany.app.dialog.DialogTabMini$21, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass21 implements MyPopupMenu.MyPopupListener {
        public AnonymousClass21() {
        }

        @Override // com.mycompany.app.view.MyPopupMenu.MyPopupListener
        public final void a() {
            int i = DialogTabMini.H1;
            DialogTabMini.this.P();
        }

        @Override // com.mycompany.app.view.MyPopupMenu.MyPopupListener
        public final boolean b(View view, int i) {
            boolean z;
            boolean z2;
            int i2 = DialogTabMain.l1[i % 3];
            int i3 = PrefZone.C;
            if (i3 != i2) {
                if (i3 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (i2 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                PrefZone.C = i2;
                DialogTabMini dialogTabMini = DialogTabMini.this;
                PrefSet.f(dialogTabMini.b0, 15, i2, "mTabListType");
                dialogTabMini.P();
                if (z == z2) {
                    Handler handler = dialogTabMini.i;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.21.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                DialogTabMini.this.T();
                            }
                        });
                        return false;
                    }
                } else {
                    Handler handler2 = dialogTabMini.i;
                    if (handler2 != null) {
                        handler2.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.21.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                DialogTabMini dialogTabMini2 = DialogTabMini.this;
                                int i4 = DialogTabMini.H1;
                                dialogTabMini2.N();
                                Handler handler3 = dialogTabMini2.i;
                                if (handler3 == null) {
                                    return;
                                }
                                handler3.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.21.2.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        DialogTabMini.this.dismiss();
                                    }
                                });
                            }
                        });
                        return false;
                    }
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mycompany.app.dialog.DialogTabMini$29, reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass29 implements DialogDeleteItem.DelItemListener {

        /* renamed from: com.mycompany.app.dialog.DialogTabMini$29$1, reason: invalid class name */
        /* loaded from: classes3.dex */
        class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                DialogTabMini dialogTabMini = DialogTabMini.this;
                if (dialogTabMini.g1) {
                    dialogTabMini.g1 = false;
                    if (dialogTabMini.h0) {
                        TabGrid tabGrid = dialogTabMini.x0;
                        if (tabGrid != null) {
                            tabGrid.a();
                        }
                    } else {
                        TabGrid tabGrid2 = dialogTabMini.w0;
                        if (tabGrid2 != null) {
                            tabGrid2.a();
                        }
                    }
                    Handler handler = dialogTabMini.i;
                    if (handler != null) {
                        handler.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.29.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass29 anonymousClass29 = AnonymousClass29.this;
                                DialogTabMini dialogTabMini2 = DialogTabMini.this;
                                int i = DialogTabMini.H1;
                                dialogTabMini2.L();
                                MainUtil.e8(DialogTabMini.this.b0, R.string.deleted);
                            }
                        });
                        return;
                    }
                    return;
                }
                WebTabAdapter G = dialogTabMini.G(dialogTabMini.h0);
                if (G != null) {
                    final boolean w = G.w(dialogTabMini.h1);
                    Handler handler2 = dialogTabMini.i;
                    if (handler2 == null) {
                        return;
                    }
                    handler2.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.29.1.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass29 anonymousClass29 = AnonymousClass29.this;
                            DialogTabMini dialogTabMini2 = DialogTabMini.this;
                            if (dialogTabMini2.c0 != null) {
                                if (!w) {
                                    DialogDeleteItem dialogDeleteItem = dialogTabMini2.J0;
                                    if (dialogDeleteItem != null) {
                                        dialogDeleteItem.B(false);
                                        MainUtil.e8(DialogTabMini.this.b0, R.string.fail);
                                        return;
                                    }
                                    return;
                                }
                                WebTabAdapter G2 = dialogTabMini2.G(dialogTabMini2.h0);
                                if (G2 != null) {
                                    G2.g();
                                    DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                    dialogTabMini3.a0(-1, false, dialogTabMini3.h0);
                                    DialogTabMini.this.Z();
                                    DialogTabMini.this.b0();
                                    Handler handler3 = DialogTabMini.this.i;
                                    if (handler3 == null) {
                                        return;
                                    }
                                    handler3.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.29.1.2.1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                            DialogTabMini dialogTabMini4 = DialogTabMini.this;
                                            int i = DialogTabMini.H1;
                                            dialogTabMini4.L();
                                            MainUtil.e8(DialogTabMini.this.b0, R.string.deleted);
                                        }
                                    });
                                }
                            }
                        }
                    });
                }
            }
        }

        public AnonymousClass29() {
        }

        @Override // com.mycompany.app.dialog.DialogDeleteItem.DelItemListener
        public final void a() {
            DialogTabMini dialogTabMini = DialogTabMini.this;
            if (dialogTabMini.J0 == null) {
                return;
            }
            dialogTabMini.s(new AnonymousClass1());
        }

        @Override // com.mycompany.app.dialog.DialogDeleteItem.DelItemListener
        public final void b(MyRoundImage myRoundImage, AppCompatTextView appCompatTextView) {
            WebTabAdapter.WebTabItem webTabItem;
            int i;
            DialogTabMini dialogTabMini = DialogTabMini.this;
            WebTabAdapter.WebTabItem webTabItem2 = dialogTabMini.i1;
            WebTabAdapter webTabAdapter = dialogTabMini.j1;
            int i2 = dialogTabMini.k1;
            dialogTabMini.i1 = null;
            dialogTabMini.j1 = null;
            if (dialogTabMini.J0 == null || dialogTabMini.b0 == null) {
                return;
            }
            if (webTabItem2 == null && i2 == 1 && webTabAdapter != null) {
                webTabItem2 = webTabAdapter.F();
            }
            if (webTabItem2 == null) {
                myRoundImage.o(-460552, R.drawable.outline_public_black_24);
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                Context context = dialogTabMini.b0;
                if (i2 == 1) {
                    i = R.string.item;
                } else {
                    i = R.string.items;
                }
                sb.append(context.getString(i));
                appCompatTextView.setText(sb.toString());
                return;
            }
            List list = webTabItem2.q;
            if (list != null && !list.isEmpty()) {
                webTabItem = (WebTabAdapter.WebTabItem) webTabItem2.q.get(0);
            } else {
                webTabItem = null;
            }
            String q3 = WebViewActivity.q3(dialogTabMini.b0, webTabItem2);
            if (webTabItem != null) {
                myRoundImage.o(0, WebTabBarAdapter.y(webTabItem.g, MainApp.K1));
            } else if (TextUtils.isEmpty(webTabItem2.j)) {
                myRoundImage.p(-460552, R.drawable.outline_public_black_24, q3, null);
            } else if (webTabItem2.j.startsWith("file:///")) {
                if ("file:///android_asset/shortcut.html".equals(webTabItem2.j)) {
                    myRoundImage.o(0, R.drawable.outline_home_black_24);
                } else {
                    myRoundImage.o(0, R.drawable.outline_offline_pin_black_24);
                }
            } else {
                Bitmap n4 = MainUtil.n4(MainUtil.O1(webTabItem2.j));
                if (MainUtil.f6(n4)) {
                    myRoundImage.setIconSmall(true);
                    myRoundImage.setImageBitmap(n4);
                } else {
                    myRoundImage.p(-460552, R.drawable.outline_public_black_24, q3, null);
                }
            }
            appCompatTextView.setText(q3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mycompany.app.dialog.DialogTabMini$30, reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass30 implements DialogInterface.OnDismissListener {
        public AnonymousClass30() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            int i = DialogTabMini.H1;
            DialogTabMini dialogTabMini = DialogTabMini.this;
            dialogTabMini.L();
            if (dialogTabMini.g1) {
                dialogTabMini.g1 = false;
                if (dialogTabMini.h0) {
                    TabGrid tabGrid = dialogTabMini.x0;
                    if (tabGrid != null) {
                        tabGrid.d();
                        return;
                    }
                    return;
                }
                TabGrid tabGrid2 = dialogTabMini.w0;
                if (tabGrid2 != null) {
                    tabGrid2.d();
                }
            }
        }
    }

    /* renamed from: com.mycompany.app.dialog.DialogTabMini$32, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass32 implements DialogDeleteItem.DelItemListener {
        public AnonymousClass32() {
        }

        @Override // com.mycompany.app.dialog.DialogDeleteItem.DelItemListener
        public final void a() {
            DialogTabMini dialogTabMini = DialogTabMini.this;
            if (dialogTabMini.K0 == null) {
                return;
            }
            dialogTabMini.s(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.32.1
                @Override // java.lang.Runnable
                public final void run() {
                    WebTabAdapter.WebTabItem H;
                    List list;
                    DialogTabMini dialogTabMini2 = DialogTabMini.this;
                    int i = dialogTabMini2.l1;
                    WebTabAdapter G = dialogTabMini2.G(dialogTabMini2.h0);
                    if (G != null && (H = G.H(i)) != null && (list = H.q) != null && !list.isEmpty()) {
                        boolean z = true;
                        H.m = true;
                        if (G.J() != 1) {
                            z = false;
                        }
                        final boolean w = G.w(z);
                        Handler handler = dialogTabMini2.i;
                        if (handler != null) {
                            handler.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.32.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    AnonymousClass32 anonymousClass32 = AnonymousClass32.this;
                                    DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                    if (dialogTabMini3.c0 != null) {
                                        if (!w) {
                                            DialogDeleteItem dialogDeleteItem = dialogTabMini3.K0;
                                            if (dialogDeleteItem != null) {
                                                dialogDeleteItem.B(false);
                                                MainUtil.e8(DialogTabMini.this.b0, R.string.fail);
                                                return;
                                            }
                                            return;
                                        }
                                        WebTabAdapter G2 = dialogTabMini3.G(dialogTabMini3.h0);
                                        if (G2 == null) {
                                            return;
                                        }
                                        G2.g();
                                        DialogTabMini.this.K();
                                        DialogTabMini.this.Z();
                                        DialogTabMini.this.b0();
                                        MainUtil.e8(DialogTabMini.this.b0, R.string.deleted);
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }

        @Override // com.mycompany.app.dialog.DialogDeleteItem.DelItemListener
        public final void b(MyRoundImage myRoundImage, AppCompatTextView appCompatTextView) {
            DialogTabMini dialogTabMini = DialogTabMini.this;
            WebTabAdapter.WebTabItem webTabItem = dialogTabMini.m1;
            WebTabAdapter.WebTabItem webTabItem2 = dialogTabMini.n1;
            dialogTabMini.m1 = null;
            dialogTabMini.n1 = null;
            if (webTabItem2 == null || dialogTabMini.K0 == null) {
                return;
            }
            String q3 = WebViewActivity.q3(dialogTabMini.b0, webTabItem);
            myRoundImage.o(0, WebTabBarAdapter.y(webTabItem2.g, MainApp.K1));
            appCompatTextView.setText(q3);
        }
    }

    /* renamed from: com.mycompany.app.dialog.DialogTabMini$37, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass37 implements DialogEditorText.EditorSetListener {
        public AnonymousClass37() {
        }

        @Override // com.mycompany.app.dialog.DialogEditorText.EditorSetListener
        public final void a(int i, String str) {
            Handler handler = DialogTabMini.this.i;
            if (handler == null) {
                return;
            }
            handler.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.37.1
                @Override // java.lang.Runnable
                public final void run() {
                    WebTabAdapter webTabAdapter;
                    WebTabAdapter webTabAdapter2;
                    DialogTabMini dialogTabMini = DialogTabMini.this;
                    if (dialogTabMini.h0) {
                        final TabGrid tabGrid = dialogTabMini.x0;
                        if (tabGrid != null && (webTabAdapter2 = tabGrid.m) != null) {
                            int i2 = webTabAdapter2.n;
                            List list = webTabAdapter2.k;
                            if (list != null && i2 >= 0 && i2 < list.size()) {
                                webTabAdapter2.h(i2);
                            }
                            Handler handler2 = DialogTabMini.this.i;
                            if (handler2 != null) {
                                handler2.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.15
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        WebTabAdapter webTabAdapter3;
                                        TabGrid tabGrid2 = TabGrid.this;
                                        MyManagerLinear myManagerLinear = tabGrid2.n;
                                        if (myManagerLinear != null && (webTabAdapter3 = tabGrid2.m) != null) {
                                            myManagerLinear.x0(webTabAdapter3.n);
                                        }
                                    }
                                });
                            }
                        }
                    } else {
                        final TabGrid tabGrid2 = dialogTabMini.w0;
                        if (tabGrid2 != null && (webTabAdapter = tabGrid2.m) != null) {
                            int i3 = webTabAdapter.n;
                            List list2 = webTabAdapter.k;
                            if (list2 != null && i3 >= 0 && i3 < list2.size()) {
                                webTabAdapter.h(i3);
                            }
                            Handler handler3 = DialogTabMini.this.i;
                            if (handler3 != null) {
                                handler3.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.15
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        WebTabAdapter webTabAdapter3;
                                        TabGrid tabGrid22 = TabGrid.this;
                                        MyManagerLinear myManagerLinear = tabGrid22.n;
                                        if (myManagerLinear != null && (webTabAdapter3 = tabGrid22.m) != null) {
                                            myManagerLinear.x0(webTabAdapter3.n);
                                        }
                                    }
                                });
                            }
                        }
                    }
                    Handler handler4 = dialogTabMini.i;
                    if (handler4 == null) {
                        return;
                    }
                    handler4.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.37.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            WebTabAdapter webTabAdapter3;
                            WebTabAdapter webTabAdapter4;
                            DialogTabMini dialogTabMini2 = DialogTabMini.this;
                            if (!dialogTabMini2.h0) {
                                TabGrid tabGrid3 = dialogTabMini2.x0;
                                if (tabGrid3 != null && (webTabAdapter4 = tabGrid3.m) != null) {
                                    int i4 = webTabAdapter4.n;
                                    List list3 = webTabAdapter4.k;
                                    if (list3 != null && i4 >= 0 && i4 < list3.size()) {
                                        webTabAdapter4.h(i4);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            TabGrid tabGrid4 = dialogTabMini2.w0;
                            if (tabGrid4 != null && (webTabAdapter3 = tabGrid4.m) != null) {
                                int i5 = webTabAdapter3.n;
                                List list4 = webTabAdapter3.k;
                                if (list4 != null && i5 >= 0 && i5 < list4.size()) {
                                    webTabAdapter3.h(i5);
                                }
                            }
                        }
                    });
                }
            });
        }
    }

    /* renamed from: com.mycompany.app.dialog.DialogTabMini$40, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass40 implements TabSubView.TabSubListener {

        /* renamed from: a, reason: collision with root package name */
        public int f14860a;
        public boolean b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f14861c;
        public int d;
        public boolean e;

        /* renamed from: com.mycompany.app.dialog.DialogTabMini$40$3, reason: invalid class name */
        /* loaded from: classes3.dex */
        class AnonymousClass3 implements Runnable {
            public AnonymousClass3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                AnonymousClass40 anonymousClass40 = AnonymousClass40.this;
                int i = anonymousClass40.d;
                DialogTabMini dialogTabMini = DialogTabMini.this;
                WebTabAdapter G = dialogTabMini.G(dialogTabMini.h0);
                if (G == null) {
                    dialogTabMini.G1 = false;
                    return;
                }
                anonymousClass40.e = G.y(i);
                Handler handler = dialogTabMini.i;
                if (handler == null) {
                    return;
                }
                handler.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.40.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass40 anonymousClass402 = AnonymousClass40.this;
                        boolean z = anonymousClass402.e;
                        TabSubView tabSubView = DialogTabMini.this.N0;
                        if (tabSubView != null) {
                            tabSubView.setDeleted(z);
                        }
                        Handler handler2 = DialogTabMini.this.i;
                        if (handler2 == null) {
                            return;
                        }
                        handler2.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.40.3.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                AnonymousClass40 anonymousClass403 = AnonymousClass40.this;
                                DialogTabMini dialogTabMini2 = DialogTabMini.this;
                                int i2 = anonymousClass403.d;
                                if (anonymousClass403.e) {
                                    if (dialogTabMini2.G(dialogTabMini2.h0) != null) {
                                        DialogTabMini.C(dialogTabMini2, i2);
                                        MainUtil.e8(dialogTabMini2.b0, R.string.deleted);
                                    }
                                } else {
                                    MainUtil.e8(dialogTabMini2.b0, R.string.fail);
                                }
                                DialogTabMini.this.G1 = false;
                            }
                        });
                    }
                });
            }
        }

        public AnonymousClass40() {
        }

        @Override // com.mycompany.app.quick.TabSubView.TabSubListener
        public final void a(long j) {
            DialogTabMini dialogTabMini = DialogTabMini.this;
            WebTabAdapter G = dialogTabMini.G(dialogTabMini.h0);
            if (G == null) {
                return;
            }
            G.l = j;
            dialogTabMini.b0();
            dialogTabMini.R0 = true;
        }

        @Override // com.mycompany.app.quick.TabSubView.TabSubListener
        public final void b(int i, long j) {
            WebTabAdapter G;
            DialogTabMini dialogTabMini = DialogTabMini.this;
            if (dialogTabMini.c0 == null || (G = dialogTabMini.G(dialogTabMini.h0)) == null) {
                return;
            }
            G.Q();
            G.l = j;
            G.T(true);
            DialogTabMini.C(dialogTabMini, i);
        }

        @Override // com.mycompany.app.quick.TabSubView.TabSubListener
        public final void c(int i) {
            WebTabAdapter G;
            DialogTabMini dialogTabMini = DialogTabMini.this;
            if (dialogTabMini.c0 == null || (G = dialogTabMini.G(dialogTabMini.h0)) == null) {
                return;
            }
            G.T(true);
            DialogTabMini.C(dialogTabMini, i);
        }

        @Override // com.mycompany.app.quick.TabSubView.TabSubListener
        public final void d(int i) {
            DialogTabMini dialogTabMini = DialogTabMini.this;
            DialogTabMini.E(dialogTabMini, i, dialogTabMini.h0);
        }

        @Override // com.mycompany.app.quick.TabSubView.TabSubListener
        public final void e(int i, int i2) {
            WebTabAdapter G;
            DialogTabMini dialogTabMini = DialogTabMini.this;
            if (dialogTabMini.c0 == null || (G = dialogTabMini.G(dialogTabMini.h0)) == null) {
                return;
            }
            G.O(i, i2);
            dialogTabMini.b0();
        }

        @Override // com.mycompany.app.quick.TabSubView.TabSubListener
        public final void f(int i) {
            DialogTabMini dialogTabMini = DialogTabMini.this;
            if (dialogTabMini.G1) {
                return;
            }
            dialogTabMini.G1 = true;
            this.d = i;
            dialogTabMini.s(new AnonymousClass3());
        }

        @Override // com.mycompany.app.quick.TabSubView.TabSubListener
        public final void g() {
            DialogTabMini dialogTabMini = DialogTabMini.this;
            if (dialogTabMini.c0 == null) {
                return;
            }
            dialogTabMini.s(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.40.2
                @Override // java.lang.Runnable
                public final void run() {
                    WebTabAdapter G;
                    DialogTabMini dialogTabMini2 = DialogTabMini.this;
                    if (dialogTabMini2.c0 == null || (G = dialogTabMini2.G(dialogTabMini2.h0)) == null) {
                        return;
                    }
                    G.v();
                }
            });
        }

        @Override // com.mycompany.app.quick.TabSubView.TabSubListener
        public final void h(int i, boolean z, boolean z2) {
            DialogTabMini dialogTabMini = DialogTabMini.this;
            if (!dialogTabMini.F1) {
                dialogTabMini.F1 = true;
                this.f14860a = i;
                this.b = z;
                this.f14861c = z2;
                if (dialogTabMini.c0 == null) {
                    return;
                }
                dialogTabMini.s(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.40.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass40 anonymousClass40 = AnonymousClass40.this;
                        boolean z3 = anonymousClass40.b;
                        DialogTabMini dialogTabMini2 = DialogTabMini.this;
                        if (dialogTabMini2.c0 != null) {
                            WebTabAdapter G = dialogTabMini2.G(dialogTabMini2.h0);
                            if (G == null) {
                                dialogTabMini2.F1 = false;
                                return;
                            }
                            G.x(z3, false);
                            Handler handler = dialogTabMini2.i;
                            if (handler == null) {
                                return;
                            }
                            handler.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.40.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TabSubView tabSubView;
                                    AnonymousClass40 anonymousClass402 = AnonymousClass40.this;
                                    int i2 = anonymousClass402.f14860a;
                                    boolean z4 = anonymousClass402.f14861c;
                                    DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                    DialogTabMini.C(dialogTabMini3, i2);
                                    if (!z4 && (tabSubView = dialogTabMini3.N0) != null) {
                                        tabSubView.n();
                                    }
                                    DialogTabMini.this.F1 = false;
                                }
                            });
                        }
                    }
                });
            }
        }

        @Override // com.mycompany.app.quick.TabSubView.TabSubListener
        public final void i() {
            int i = DialogTabMini.H1;
            DialogTabMini.this.O();
        }
    }

    /* loaded from: classes3.dex */
    public class TabGrid {
        public final Runnable A = new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.16
            @Override // java.lang.Runnable
            public final void run() {
                MyRecyclerView myRecyclerView;
                TabGrid tabGrid = TabGrid.this;
                DialogTabMini dialogTabMini = DialogTabMini.this;
                if (dialogTabMini.y0 != null && (myRecyclerView = tabGrid.h) != null && dialogTabMini.D0 != 0 && dialogTabMini.C0 != 0) {
                    int height = myRecyclerView.getHeight();
                    int i = dialogTabMini.D0;
                    int i2 = height / i;
                    int i3 = i2 + 1;
                    if (height % i > 0) {
                        i3 = i2 + 2;
                    }
                    int J = tabGrid.m.J();
                    int i4 = dialogTabMini.C0;
                    int i5 = J / i4;
                    int i6 = i5 + 1;
                    if (J % i4 > 0) {
                        i6 = i5 + 2;
                    }
                    dialogTabMini.y0.p(i3, i6);
                }
                tabGrid.z = false;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14875a;
        public List b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f14876c;
        public long d;
        public int e;
        public int f;
        public FrameLayout g;
        public MyRecyclerView h;
        public ImageView i;
        public MyCoverView j;
        public MyRoundLinear k;
        public MyButtonText l;
        public WebTabAdapter m;
        public MyManagerLinear n;
        public TabDragHelper o;
        public ItemTouchHelper p;
        public boolean q;
        public int r;
        public boolean s;
        public boolean t;
        public WebTabAdapter.WebTabItem u;
        public boolean v;
        public boolean w;
        public WebTabAdapter.WebTabItem x;
        public int y;
        public boolean z;

        /* renamed from: com.mycompany.app.dialog.DialogTabMini$TabGrid$1, reason: invalid class name */
        /* loaded from: classes3.dex */
        class AnonymousClass1 implements View.OnClickListener {
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v10, types: [android.view.View$OnClickListener, java.lang.Object] */
        public TabGrid(boolean z) {
            Context context;
            int i;
            this.f14875a = z;
            Context context2 = DialogTabMini.this.b0;
            if (context2 == null) {
                return;
            }
            FrameLayout frameLayout = new FrameLayout(context2);
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            MyRecyclerView myRecyclerView = new MyRecyclerView(context2);
            int i2 = MainApp.q1;
            myRecyclerView.setPadding(i2, 0, i2, 0);
            myRecyclerView.setVerticalScrollBarEnabled(false);
            myRecyclerView.setHorizontalScrollBarEnabled(false);
            frameLayout.addView(myRecyclerView, -1, -1);
            ImageView imageView = new ImageView(context2);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setImageResource(R.drawable.logo_gray);
            imageView.setVisibility(8);
            frameLayout.addView(imageView, -1, -1);
            MyCoverView myCoverView = new MyCoverView(context2);
            myCoverView.setVisibility(8);
            frameLayout.addView(myCoverView, -1, -1);
            this.g = frameLayout;
            this.h = myRecyclerView;
            this.i = imageView;
            this.j = myCoverView;
            if (z && DialogTabMini.this.i0 && (context = DialogTabMini.this.b0) != null) {
                MyRoundLinear myRoundLinear = new MyRoundLinear(context);
                myRoundLinear.setOrientation(1);
                frameLayout.addView(myRoundLinear, -1, -1);
                View view = new View(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
                layoutParams.weight = 1.0f;
                myRoundLinear.addView(view, layoutParams);
                MyButtonText myButtonText = new MyButtonText(context);
                myButtonText.setPadding(MainApp.F1, MainApp.G1, MainApp.F1, MainApp.G1);
                myButtonText.setMinHeight(MainApp.f1);
                myButtonText.setGravity(17);
                myButtonText.setTextSize(1, 16.0f);
                myButtonText.setText(R.string.unlock);
                myButtonText.setBgNorFixed(true);
                myButtonText.setRoundRect(true);
                myButtonText.setRoundRadius(MainApp.F1);
                int G = (int) MainUtil.G(context, 24.0f);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.setMarginStart(G);
                layoutParams2.setMarginEnd(G);
                myRoundLinear.addView(myButtonText, layoutParams2);
                View view2 = new View(context);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
                layoutParams3.weight = 1.0f;
                myRoundLinear.addView(view2, layoutParams3);
                this.k = myRoundLinear;
                this.l = myButtonText;
                if (MainApp.K1) {
                    myButtonText.setTextColor(-328966);
                    this.l.u(-16777216, -14211289);
                } else {
                    myButtonText.setTextColor(-16777216);
                    this.l.u(-2039584, -3092272);
                }
                this.k.c(true, true);
                MyRoundLinear myRoundLinear2 = this.k;
                if (MainApp.K1) {
                    i = -14606047;
                } else {
                    i = -328966;
                }
                myRoundLinear2.setColor(i);
                this.k.setOnClickListener(new Object());
                this.l.setOnClickListener(new View.OnClickListener() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        boolean z2;
                        DialogTabMini dialogTabMini = DialogTabMini.this;
                        if (dialogTabMini.a0 != null) {
                            int i3 = PrefSecret.s;
                            if (i3 == 0) {
                                z2 = false;
                            } else {
                                z2 = PrefSecret.u;
                            }
                            if (!z2) {
                                return;
                            }
                            Intent i22 = MainUtil.i2(dialogTabMini.b0, i3);
                            i22.putExtra("EXTRA_TYPE", 2);
                            dialogTabMini.a0.t0(i22, 3);
                        }
                    }
                });
            }
            if (PrefZone.C != 0) {
                this.h.setPadding(MainApp.G1, MainApp.F1, MainApp.G1, MainApp.F1);
            }
            this.h.setBackgroundColor(MainApp.K1 ? -14606047 : -328966);
        }

        public final void a() {
            WebTabAdapter webTabAdapter = this.m;
            if (webTabAdapter != null) {
                webTabAdapter.v();
            }
        }

        public final void b(final boolean z) {
            MyCoverView myCoverView = this.j;
            if (myCoverView == null) {
                return;
            }
            myCoverView.n(true, 1.0f, 200L);
            DialogTabMini.this.s(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.3
                /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, com.mycompany.app.web.WebTabAdapter$WebTabItem] */
                /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, com.mycompany.app.web.WebTabAdapter$WebTabItem] */
                /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, com.mycompany.app.web.WebTabAdapter$WebTabItem] */
                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, com.mycompany.app.web.WebTabAdapter$WebTabItem] */
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList arrayList;
                    int i;
                    WebTabAdapter.WebTabItem webTabItem;
                    WebTabAdapter.WebTabItem webTabItem2;
                    WebTabAdapter.WebTabItem webTabItem3;
                    TabGrid tabGrid = TabGrid.this;
                    boolean z2 = tabGrid.f14875a;
                    DialogTabMini dialogTabMini = DialogTabMini.this;
                    Context context = dialogTabMini.b0;
                    if (context != null) {
                        if (PrefSync.k == z2 && !z) {
                            tabGrid.b = dialogTabMini.e0;
                        } else {
                            tabGrid.b = DbBookTab.d(context, z2);
                        }
                        if (dialogTabMini.b0 != null) {
                            long j = 0;
                            tabGrid.d = 0L;
                            tabGrid.e = 0;
                            tabGrid.f = 0;
                            List list = tabGrid.b;
                            if (list != null && !list.isEmpty()) {
                                WebTabAdapter webTabAdapter = tabGrid.m;
                                if (webTabAdapter != null) {
                                    tabGrid.e = webTabAdapter.m;
                                } else if (z2) {
                                    tabGrid.e = PrefSync.m;
                                } else {
                                    tabGrid.e = PrefSync.l;
                                }
                                ArrayList arrayList2 = new ArrayList();
                                if (PrefZone.C == 0) {
                                    i = 0;
                                } else {
                                    ?? obj = new Object();
                                    obj.f19519a = 1;
                                    arrayList2.add(obj);
                                    i = 1;
                                }
                                Iterator it = list.iterator();
                                long j2 = 0;
                                long j3 = 0;
                                int i2 = 0;
                                int i3 = 0;
                                int i4 = 0;
                                ArrayList arrayList3 = null;
                                while (it.hasNext()) {
                                    long j4 = j;
                                    WebTabAdapter.WebTabItem webTabItem4 = (WebTabAdapter.WebTabItem) it.next();
                                    if (webTabItem4 == null) {
                                        j = j4;
                                    } else {
                                        ?? obj2 = new Object();
                                        Iterator it2 = it;
                                        obj2.f19520c = webTabItem4.f19520c;
                                        obj2.d = webTabItem4.d;
                                        long j5 = webTabItem4.e;
                                        obj2.e = j5;
                                        obj2.f = webTabItem4.f;
                                        obj2.g = webTabItem4.g;
                                        obj2.h = i2;
                                        obj2.j = webTabItem4.j;
                                        obj2.k = webTabItem4.k;
                                        obj2.l = webTabItem4.l;
                                        obj2.p = webTabItem4.p;
                                        if (arrayList3 == null || (j5 != j4 && j5 == j3)) {
                                            webTabItem2 = obj2;
                                        } else {
                                            if (arrayList3.size() == 1) {
                                                WebTabAdapter.WebTabItem webTabItem5 = (WebTabAdapter.WebTabItem) arrayList3.get(0);
                                                webTabItem2 = obj2;
                                                webTabItem5.e = j4;
                                                webTabItem5.f = null;
                                                webTabItem5.g = 0;
                                                webTabItem5.q = null;
                                                webTabItem3 = webTabItem5;
                                            } else {
                                                webTabItem2 = obj2;
                                                ?? obj3 = new Object();
                                                obj3.q = arrayList3;
                                                webTabItem3 = obj3;
                                            }
                                            webTabItem3.i = i;
                                            arrayList2.add(webTabItem3);
                                            i++;
                                            arrayList3 = null;
                                        }
                                        int i5 = tabGrid.e;
                                        int i6 = webTabItem2.h;
                                        if (i5 == i6) {
                                            tabGrid.d = webTabItem2.f19520c;
                                            tabGrid.f = i;
                                        } else {
                                            i3 = i6;
                                            i4 = i;
                                            j2 = webTabItem2.f19520c;
                                        }
                                        if (webTabItem2.e != 0) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(webTabItem2);
                                        } else {
                                            webTabItem2.i = i;
                                            arrayList2.add(webTabItem2);
                                            i++;
                                        }
                                        i2++;
                                        j3 = webTabItem2.e;
                                        it = it2;
                                        j = 0;
                                    }
                                }
                                if (tabGrid.d == 0) {
                                    tabGrid.d = j2;
                                    tabGrid.e = i3;
                                    tabGrid.f = i4;
                                }
                                if (arrayList3 != null) {
                                    if (arrayList3.size() == 1) {
                                        WebTabAdapter.WebTabItem webTabItem6 = (WebTabAdapter.WebTabItem) arrayList3.get(0);
                                        webTabItem6.e = 0L;
                                        webTabItem6.f = null;
                                        webTabItem6.g = 0;
                                        webTabItem6.q = null;
                                        webTabItem = webTabItem6;
                                    } else {
                                        ?? obj4 = new Object();
                                        obj4.q = arrayList3;
                                        webTabItem = obj4;
                                    }
                                    webTabItem.i = i;
                                    arrayList2.add(webTabItem);
                                }
                                arrayList = arrayList2;
                            } else {
                                arrayList = null;
                            }
                            tabGrid.f14876c = arrayList;
                            Handler handler = dialogTabMini.i;
                            if (handler == null) {
                                return;
                            }
                            handler.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.3.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i7;
                                    final TabGrid tabGrid2 = TabGrid.this;
                                    DialogTabMini dialogTabMini2 = DialogTabMini.this;
                                    MyCoverView myCoverView2 = tabGrid2.j;
                                    if (myCoverView2 != null) {
                                        myCoverView2.f(false);
                                        WebTabAdapter webTabAdapter2 = tabGrid2.m;
                                        if (webTabAdapter2 != null) {
                                            webTabAdapter2.b0(tabGrid2.b, tabGrid2.f14876c, tabGrid2.d, tabGrid2.e, tabGrid2.f);
                                            tabGrid2.b = null;
                                            tabGrid2.f14876c = null;
                                            int i8 = DialogTabMini.H1;
                                            dialogTabMini2.Z();
                                            dialogTabMini2.V();
                                            return;
                                        }
                                        if (PrefZone.C == 0) {
                                            i7 = 0;
                                        } else {
                                            i7 = 1;
                                        }
                                        MyManagerLinear myManagerLinear = new MyManagerLinear(i7) { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.4
                                            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
                                            public final void e0(RecyclerView recyclerView, int i9, int i10) {
                                                TabGrid tabGrid3 = TabGrid.this;
                                                if (tabGrid3.q) {
                                                    tabGrid3.q = false;
                                                    WebTabAdapter webTabAdapter3 = tabGrid3.m;
                                                    if (webTabAdapter3 != null) {
                                                        webTabAdapter3.D(true);
                                                    }
                                                }
                                            }

                                            @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
                                            public final void h0(RecyclerView recyclerView, int i9, int i10) {
                                                TabGrid tabGrid3 = TabGrid.this;
                                                if (tabGrid3.q) {
                                                    tabGrid3.q = false;
                                                    WebTabAdapter webTabAdapter3 = tabGrid3.m;
                                                    if (webTabAdapter3 != null) {
                                                        webTabAdapter3.D(false);
                                                    }
                                                }
                                            }

                                            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                                            public final void k0(RecyclerView.State state) {
                                                super.k0(state);
                                                TabGrid.this.q = false;
                                            }
                                        };
                                        tabGrid2.n = myManagerLinear;
                                        WebTabAdapter webTabAdapter3 = new WebTabAdapter(dialogTabMini2.b0, tabGrid2.h, false, tabGrid2.b, tabGrid2.f14876c, tabGrid2.d, tabGrid2.e, tabGrid2.f, dialogTabMini2.C0, dialogTabMini2.D0, tabGrid2.f14875a, myManagerLinear);
                                        tabGrid2.m = webTabAdapter3;
                                        tabGrid2.b = null;
                                        tabGrid2.f14876c = null;
                                        if (PrefSync.k == tabGrid2.f14875a) {
                                            MyRecyclerView myRecyclerView = tabGrid2.h;
                                            WebNestFrame webNestFrame = dialogTabMini2.d0;
                                            webTabAdapter3.A = myRecyclerView;
                                            webTabAdapter3.B = webNestFrame;
                                        }
                                        webTabAdapter3.x = new WebTabAdapter.WebTabListener() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.5
                                            @Override // com.mycompany.app.web.WebTabAdapter.WebTabListener
                                            public final void a() {
                                                ViewPager2 viewPager2;
                                                if (PrefZone.E) {
                                                    TabGrid tabGrid3 = TabGrid.this;
                                                    DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                                    int i9 = DialogTabMini.H1;
                                                    if (!dialogTabMini3.R() && (viewPager2 = DialogTabMini.this.u0) != null) {
                                                        viewPager2.setUserInputEnabled(false);
                                                    }
                                                }
                                            }

                                            @Override // com.mycompany.app.web.WebTabAdapter.WebTabListener
                                            public final void b(View view, final int i9) {
                                                final DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                                MyPopupMenu myPopupMenu = dialogTabMini3.G0;
                                                if (myPopupMenu == null) {
                                                    if (myPopupMenu != null) {
                                                        dialogTabMini3.Y = null;
                                                        myPopupMenu.a();
                                                        dialogTabMini3.G0 = null;
                                                    }
                                                    if (view == null) {
                                                        return;
                                                    }
                                                    ArrayList arrayList4 = new ArrayList();
                                                    arrayList4.add(new MyPopupAdapter.PopMenuItem(0, R.string.edit));
                                                    arrayList4.add(new MyPopupAdapter.PopMenuItem(1, R.string.delete));
                                                    MyPopupMenu myPopupMenu2 = new MyPopupMenu(dialogTabMini3.a0, dialogTabMini3.k0, view, arrayList4, MainApp.K1, new MyPopupMenu.MyPopupListener() { // from class: com.mycompany.app.dialog.DialogTabMini.22
                                                        @Override // com.mycompany.app.view.MyPopupMenu.MyPopupListener
                                                        public final void a() {
                                                            int i10 = DialogTabMini.H1;
                                                            DialogTabMini dialogTabMini4 = DialogTabMini.this;
                                                            MyPopupMenu myPopupMenu3 = dialogTabMini4.G0;
                                                            if (myPopupMenu3 != null) {
                                                                dialogTabMini4.Y = null;
                                                                myPopupMenu3.a();
                                                                dialogTabMini4.G0 = null;
                                                            }
                                                        }

                                                        @Override // com.mycompany.app.view.MyPopupMenu.MyPopupListener
                                                        public final boolean b(View view2, int i10) {
                                                            WebTabAdapter.WebTabItem H;
                                                            List list2;
                                                            WebTabAdapter.WebTabItem webTabItem7;
                                                            List list3;
                                                            WebTabAdapter.WebTabItem H2;
                                                            List list4;
                                                            WebTabAdapter.WebTabItem webTabItem8;
                                                            List list5;
                                                            int i11 = i9;
                                                            final DialogTabMini dialogTabMini4 = DialogTabMini.this;
                                                            if (i10 == 0) {
                                                                if (dialogTabMini4.a0 != null && !dialogTabMini4.S()) {
                                                                    dialogTabMini4.M();
                                                                    WebTabAdapter G = dialogTabMini4.G(dialogTabMini4.h0);
                                                                    if (G != null && (H2 = G.H(i11)) != null && (list4 = H2.q) != null && !list4.isEmpty() && (webTabItem8 = (WebTabAdapter.WebTabItem) H2.q.get(0)) != null && (list5 = G.j) != null && !list5.isEmpty()) {
                                                                        dialogTabMini4.o1 = i11;
                                                                        dialogTabMini4.p1 = H2;
                                                                        dialogTabMini4.q1 = webTabItem8;
                                                                        dialogTabMini4.r1 = list5;
                                                                        dialogTabMini4.U(false, new DialogTabMain.ReleaseBackListener() { // from class: com.mycompany.app.dialog.DialogTabMini.34
                                                                            @Override // com.mycompany.app.dialog.DialogTabMain.ReleaseBackListener
                                                                            public final void a() {
                                                                                final DialogTabMini dialogTabMini5 = DialogTabMini.this;
                                                                                WebTabAdapter.WebTabItem webTabItem9 = dialogTabMini5.p1;
                                                                                WebTabAdapter.WebTabItem webTabItem10 = dialogTabMini5.q1;
                                                                                List list6 = dialogTabMini5.r1;
                                                                                dialogTabMini5.p1 = null;
                                                                                dialogTabMini5.q1 = null;
                                                                                dialogTabMini5.r1 = null;
                                                                                WebViewActivity webViewActivity = dialogTabMini5.a0;
                                                                                if (webViewActivity == null) {
                                                                                    return;
                                                                                }
                                                                                DialogTabEdit dialogTabEdit = new DialogTabEdit(webViewActivity, list6, webTabItem9.q, webTabItem10.f, webTabItem10.g, new DialogSetFull.DialogApplyListener() { // from class: com.mycompany.app.dialog.DialogTabMini.35
                                                                                    @Override // com.mycompany.app.dialog.DialogSetFull.DialogApplyListener
                                                                                    public final void a() {
                                                                                        DialogTabMini dialogTabMini6 = DialogTabMini.this;
                                                                                        int i12 = dialogTabMini6.o1;
                                                                                        if (dialogTabMini6.c0 != null) {
                                                                                            dialogTabMini6.M();
                                                                                            WebTabAdapter G2 = dialogTabMini6.G(dialogTabMini6.h0);
                                                                                            if (G2 != null) {
                                                                                                G2.h(i12);
                                                                                            }
                                                                                            if (PrefSync.k == dialogTabMini6.h0) {
                                                                                                dialogTabMini6.c0.e();
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                });
                                                                                dialogTabMini5.L0 = dialogTabEdit;
                                                                                dialogTabEdit.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.mycompany.app.dialog.DialogTabMini.36
                                                                                    @Override // android.content.DialogInterface.OnDismissListener
                                                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                                                        int i12 = DialogTabMini.H1;
                                                                                        DialogTabMini.this.M();
                                                                                    }
                                                                                });
                                                                            }
                                                                        });
                                                                        return true;
                                                                    }
                                                                    return true;
                                                                }
                                                                return true;
                                                            }
                                                            if (dialogTabMini4.a0 != null && !dialogTabMini4.S()) {
                                                                dialogTabMini4.K();
                                                                WebTabAdapter G2 = dialogTabMini4.G(dialogTabMini4.h0);
                                                                if (G2 != null && (H = G2.H(i11)) != null && (list2 = H.q) != null && !list2.isEmpty() && (webTabItem7 = (WebTabAdapter.WebTabItem) H.q.get(0)) != null && (list3 = G2.j) != null && !list3.isEmpty()) {
                                                                    dialogTabMini4.l1 = i11;
                                                                    dialogTabMini4.m1 = H;
                                                                    dialogTabMini4.n1 = webTabItem7;
                                                                    dialogTabMini4.U(false, new DialogTabMain.ReleaseBackListener() { // from class: com.mycompany.app.dialog.DialogTabMini.31
                                                                        @Override // com.mycompany.app.dialog.DialogTabMain.ReleaseBackListener
                                                                        public final void a() {
                                                                            final DialogTabMini dialogTabMini5 = DialogTabMini.this;
                                                                            WebViewActivity webViewActivity = dialogTabMini5.a0;
                                                                            if (webViewActivity == null) {
                                                                                return;
                                                                            }
                                                                            DialogDeleteItem dialogDeleteItem = new DialogDeleteItem(webViewActivity, new AnonymousClass32());
                                                                            dialogTabMini5.K0 = dialogDeleteItem;
                                                                            dialogDeleteItem.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.mycompany.app.dialog.DialogTabMini.33
                                                                                @Override // android.content.DialogInterface.OnDismissListener
                                                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                                                    int i12 = DialogTabMini.H1;
                                                                                    DialogTabMini.this.K();
                                                                                }
                                                                            });
                                                                        }
                                                                    });
                                                                    return true;
                                                                }
                                                                return true;
                                                            }
                                                            return true;
                                                        }
                                                    });
                                                    dialogTabMini3.G0 = myPopupMenu2;
                                                    dialogTabMini3.Y = myPopupMenu2;
                                                }
                                            }

                                            @Override // com.mycompany.app.web.WebTabAdapter.WebTabListener
                                            public final void c(WebTabAdapter.WebTabHolder webTabHolder, int i9) {
                                                WebTabAdapter webTabAdapter4;
                                                int width;
                                                int height;
                                                TabGrid tabGrid3 = TabGrid.this;
                                                final DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                                if (!dialogTabMini3.Z0 && (webTabAdapter4 = tabGrid3.m) != null && dialogTabMini3.c0 != null) {
                                                    if (webTabAdapter4.u) {
                                                        webTabAdapter4.f0(i9);
                                                        dialogTabMini3.Z();
                                                        AppCompatTextView appCompatTextView = dialogTabMini3.m0;
                                                        if (appCompatTextView != null) {
                                                            appCompatTextView.setText(MainUtil.h3(tabGrid3.m.E(), tabGrid3.m.J()));
                                                        }
                                                        MyButtonCheck myButtonCheck = dialogTabMini3.n0;
                                                        if (myButtonCheck != null) {
                                                            myButtonCheck.q(tabGrid3.m.N(), true);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    WebTabAdapter.WebTabItem H = webTabAdapter4.H(i9);
                                                    if (H != null) {
                                                        if (H.q == null) {
                                                            DialogTabMini.E(dialogTabMini3, H.h, tabGrid3.f14875a);
                                                            return;
                                                        }
                                                        int[] iArr = new int[2];
                                                        dialogTabMini3.s.getLocationOnScreen(iArr);
                                                        int i10 = iArr[0];
                                                        int i11 = iArr[1];
                                                        dialogTabMini3.k0.getLocationOnScreen(iArr);
                                                        int i12 = iArr[0];
                                                        int i13 = iArr[1];
                                                        View view = webTabHolder.f1589a;
                                                        if (view != null) {
                                                            int width2 = view.getWidth();
                                                            int height2 = view.getHeight();
                                                            view.getLocationOnScreen(iArr);
                                                            width = (width2 / 2) + (iArr[0] - i12);
                                                            height = (height2 / 2) + (iArr[1] - i13);
                                                            if (MainUtil.O5(dialogTabMini3.b0)) {
                                                                width = dialogTabMini3.k0.getWidth() - width;
                                                            }
                                                        } else {
                                                            width = dialogTabMini3.k0.getWidth() / 2;
                                                            height = dialogTabMini3.k0.getHeight() / 2;
                                                        }
                                                        int i14 = (i12 - i10) + width;
                                                        int i15 = (i13 - i11) + height;
                                                        List list2 = H.q;
                                                        WebTabAdapter webTabAdapter5 = tabGrid3.m;
                                                        long j6 = webTabAdapter5.l;
                                                        int i16 = webTabAdapter5.m;
                                                        if (dialogTabMini3.a0 != null && !dialogTabMini3.S()) {
                                                            dialogTabMini3.O();
                                                            dialogTabMini3.R0 = false;
                                                            dialogTabMini3.s1 = i14;
                                                            dialogTabMini3.t1 = i15;
                                                            dialogTabMini3.u1 = i9;
                                                            dialogTabMini3.v1 = list2;
                                                            dialogTabMini3.w1 = j6;
                                                            dialogTabMini3.x1 = i16;
                                                            dialogTabMini3.U(false, new DialogTabMain.ReleaseBackListener() { // from class: com.mycompany.app.dialog.DialogTabMini.39
                                                                @Override // com.mycompany.app.dialog.DialogTabMain.ReleaseBackListener
                                                                public final void a() {
                                                                    final DialogTabMini dialogTabMini4 = DialogTabMini.this;
                                                                    int i17 = dialogTabMini4.s1;
                                                                    int i18 = dialogTabMini4.t1;
                                                                    int i19 = dialogTabMini4.u1;
                                                                    List list3 = dialogTabMini4.v1;
                                                                    long j7 = dialogTabMini4.w1;
                                                                    int i20 = dialogTabMini4.x1;
                                                                    dialogTabMini4.v1 = null;
                                                                    if (dialogTabMini4.N0 == null) {
                                                                        TabSubView tabSubView = new TabSubView(dialogTabMini4.a0);
                                                                        dialogTabMini4.N0 = tabSubView;
                                                                        tabSubView.setFilterColor(MainUtil.l1());
                                                                        dialogTabMini4.N0.h(dialogTabMini4.a0, dialogTabMini4.d0, i17, i18, dialogTabMini4.C0, i19, list3, j7, i20, dialogTabMini4.h0, new AnonymousClass40());
                                                                        if (dialogTabMini4.f0) {
                                                                            dialogTabMini4.setCanceledOnTouchOutside(false);
                                                                        }
                                                                        dialogTabMini4.N0.i();
                                                                        dialogTabMini4.O0 = new PopupWindow(dialogTabMini4.N0, -1, -1);
                                                                        Handler handler2 = dialogTabMini4.i;
                                                                        if (handler2 == null) {
                                                                            return;
                                                                        }
                                                                        handler2.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.41
                                                                            @Override // java.lang.Runnable
                                                                            public final void run() {
                                                                                DialogTabMini dialogTabMini5 = DialogTabMini.this;
                                                                                PopupWindow popupWindow = dialogTabMini5.O0;
                                                                                if (popupWindow == null) {
                                                                                    return;
                                                                                }
                                                                                popupWindow.showAtLocation(dialogTabMini5.k0, 0, 0, 0);
                                                                                dialogTabMini5.N0.p();
                                                                            }
                                                                        });
                                                                    }
                                                                }
                                                            });
                                                        }
                                                    }
                                                }
                                            }

                                            @Override // com.mycompany.app.web.WebTabAdapter.WebTabListener
                                            public final void d(int i9) {
                                                TabGrid.this.g(i9);
                                            }

                                            @Override // com.mycompany.app.web.WebTabAdapter.WebTabListener
                                            public final void e(WebTabAdapter.WebTabHolder webTabHolder, int i9) {
                                                WebTabAdapter webTabAdapter4;
                                                TabGrid tabGrid3 = TabGrid.this;
                                                DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                                if (!dialogTabMini3.Z0 && (webTabAdapter4 = tabGrid3.m) != null) {
                                                    if (webTabAdapter4.u) {
                                                        webTabAdapter4.selectRangeTo(i9);
                                                        dialogTabMini3.Z();
                                                        AppCompatTextView appCompatTextView = dialogTabMini3.m0;
                                                        if (appCompatTextView != null) {
                                                            appCompatTextView.setText(MainUtil.h3(tabGrid3.m.E(), tabGrid3.m.J()));
                                                        }
                                                        MyButtonCheck myButtonCheck = dialogTabMini3.n0;
                                                        if (myButtonCheck != null) {
                                                            myButtonCheck.q(tabGrid3.m.N(), true);
                                                        }
                                                        return;
                                                    }
                                                    View view = TabListLongPressGate.anchorFor(webTabHolder);
                                                    ItemTouchHelper itemTouchHelper = null;
                                                    WebTabAdapter.WebTabItem H = tabGrid3.m.H(i9);
                                                    if (H != null && H.f19519a == 0) {
                                                        itemTouchHelper = tabGrid3.p;
                                                    }
                                                    TabListLongPressGate.armMini(dialogTabMini3, view, webTabHolder, itemTouchHelper, i9, tabGrid3.f14875a);
                                                }
                                            }
                                        };
                                        TabDragHelper tabDragHelper = new TabDragHelper(null, null, false, new TabDragHelper.TabDragListener() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.6
                                            @Override // com.mycompany.app.quick.TabDragHelper.TabDragListener
                                            public final void a(int i9) {
                                                Handler handler2;
                                                TabGrid tabGrid3 = TabGrid.this;
                                                DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                                if (i9 == 1) {
                                                    dialogTabMini3.S0 = PrefZone.E;
                                                    dialogTabMini3.Z0 = false;
                                                } else if (i9 == 2) {
                                                    dialogTabMini3.S0 = false;
                                                    dialogTabMini3.Z0 = true;
                                                } else if (i9 == 0 && tabGrid3.m != null && dialogTabMini3.c0 != null && (handler2 = dialogTabMini3.i) != null) {
                                                    handler2.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.6.1
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            TabGrid tabGrid4 = TabGrid.this;
                                                            WebTabAdapter webTabAdapter4 = tabGrid4.m;
                                                            if (webTabAdapter4 != null) {
                                                                DialogTabMini dialogTabMini4 = DialogTabMini.this;
                                                                if (dialogTabMini4.c0 != null) {
                                                                    if (dialogTabMini4.Z0) {
                                                                        webTabAdapter4.T(true);
                                                                        DialogTabMini.this.b0();
                                                                    }
                                                                    DialogTabMini.this.Z0 = false;
                                                                }
                                                            }
                                                        }
                                                    });
                                                }
                                            }

                                            @Override // com.mycompany.app.quick.TabDragHelper.TabDragListener
                                            public final boolean b(int i9, int i10) {
                                                WebTabAdapter webTabAdapter4 = TabGrid.this.m;
                                                if (webTabAdapter4 == null) {
                                                    return false;
                                                }
                                                return webTabAdapter4.S(i9, i10);
                                            }

                                            @Override // com.mycompany.app.quick.TabDragHelper.TabDragListener
                                            public final void c(int i9, int i10) {
                                                TabGrid tabGrid3 = TabGrid.this;
                                                DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                                if (tabGrid3.m == null) {
                                                    return;
                                                }
                                                boolean z3 = tabGrid3.f14875a;
                                                int i11 = DialogTabMini.H1;
                                                dialogTabMini3.a0(-1, false, z3);
                                                tabGrid3.m.M(tabGrid3.h, i9, i10);
                                                dialogTabMini3.b0();
                                                dialogTabMini3.S0 = false;
                                                dialogTabMini3.Z0 = false;
                                            }

                                            @Override // com.mycompany.app.quick.TabDragHelper.TabDragListener
                                            public final void d(int i9) {
                                                TabGrid tabGrid3 = TabGrid.this;
                                                DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                                if (dialogTabMini3.S0) {
                                                    dialogTabMini3.S0 = false;
                                                    tabGrid3.g(i9);
                                                }
                                            }

                                            @Override // com.mycompany.app.quick.TabDragHelper.TabDragListener
                                            public final void e(int i9) {
                                                DialogTabMini.this.T0 = i9;
                                            }
                                        });
                                        tabGrid2.o = tabDragHelper;
                                        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(tabDragHelper);
                                        tabGrid2.p = itemTouchHelper;
                                        itemTouchHelper.i(tabGrid2.h);
                                        tabGrid2.m.Z(tabGrid2.h.getHeight(), dialogTabMini2.C0, dialogTabMini2.D0, PrefZtwo.z);
                                        tabGrid2.h.setSizeListener(new ImageSizeListener() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.7
                                            @Override // com.mycompany.app.image.ImageSizeListener
                                            public final void a(View view, int i9, int i10) {
                                                DialogTabMini.this.T();
                                            }
                                        });
                                        tabGrid2.h.setLayoutManager(tabGrid2.n);
                                        tabGrid2.h.setAdapter(tabGrid2.m);
                                        tabGrid2.h.j(new RecyclerView.OnScrollListener() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.8
                                            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                                            public final void b(RecyclerView recyclerView, int i9, int i10) {
                                                TabGrid tabGrid3 = TabGrid.this;
                                                MyRecyclerView myRecyclerView2 = tabGrid3.h;
                                                if (myRecyclerView2 != null) {
                                                    if (myRecyclerView2.computeVerticalScrollOffset() > 0) {
                                                        tabGrid3.h.w0();
                                                    } else {
                                                        tabGrid3.h.r0();
                                                    }
                                                    Runnable runnable = tabGrid3.A;
                                                    DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                                    MyScrollBar myScrollBar = dialogTabMini3.y0;
                                                    if (myScrollBar != null && tabGrid3.h != null && dialogTabMini3.D0 != 0 && dialogTabMini3.C0 != 0 && !tabGrid3.z) {
                                                        tabGrid3.z = true;
                                                        myScrollBar.removeCallbacks(runnable);
                                                        dialogTabMini3.y0.post(runnable);
                                                    }
                                                    if (PrefZone.C != 0 && tabGrid3.h.getScrollState() == 2 && tabGrid3.h.canScrollVertically(-1) != tabGrid3.h.canScrollVertically(1)) {
                                                        tabGrid3.h.p0();
                                                    }
                                                }
                                            }
                                        });
                                        tabGrid2.h.setVisibility(4);
                                        Handler handler2 = dialogTabMini2.i;
                                        if (handler2 == null) {
                                            return;
                                        }
                                        handler2.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.9
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                int i9;
                                                int i10;
                                                TabGrid tabGrid3 = TabGrid.this;
                                                DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                                WebTabAdapter webTabAdapter4 = tabGrid3.m;
                                                if (webTabAdapter4 != null && tabGrid3.n != null) {
                                                    if (PrefZtwo.z) {
                                                        i9 = webTabAdapter4.g - 1;
                                                        if (i9 > 0 && (i10 = dialogTabMini3.C0) > 0) {
                                                            i9 -= webTabAdapter4.G(PrefZone.C) * ((webTabAdapter4.n - 1) / i10);
                                                        }
                                                    } else {
                                                        i9 = 0;
                                                    }
                                                    if (i9 > 0) {
                                                        tabGrid3.n.k1(0, (-tabGrid3.m.g) + 1);
                                                    } else {
                                                        tabGrid3.n.x0(tabGrid3.m.n);
                                                    }
                                                    int i11 = DialogTabMini.H1;
                                                    dialogTabMini3.Z();
                                                    Handler handler3 = dialogTabMini3.i;
                                                    if (handler3 != null) {
                                                        handler3.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.9.1
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                                                TabGrid tabGrid4 = TabGrid.this;
                                                                MyRecyclerView myRecyclerView2 = tabGrid4.h;
                                                                if (myRecyclerView2 != null && tabGrid4.j != null) {
                                                                    myRecyclerView2.setVisibility(0);
                                                                    TabGrid.this.j.f(false);
                                                                }
                                                            }
                                                        });
                                                    }
                                                }
                                            }
                                        });
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }

        public final void c() {
            MyRecyclerView myRecyclerView = this.h;
            if (myRecyclerView != null) {
                myRecyclerView.s0();
                this.h = null;
            }
            MyCoverView myCoverView = this.j;
            if (myCoverView != null) {
                myCoverView.i();
                this.j = null;
            }
            MyRoundLinear myRoundLinear = this.k;
            if (myRoundLinear != null) {
                myRoundLinear.a();
                this.k = null;
            }
            MyButtonText myButtonText = this.l;
            if (myButtonText != null) {
                myButtonText.t();
                this.l = null;
            }
            WebTabAdapter webTabAdapter = this.m;
            if (webTabAdapter != null) {
                webTabAdapter.P();
                this.m = null;
            }
            TabDragHelper tabDragHelper = this.o;
            if (tabDragHelper != null) {
                tabDragHelper.p();
                this.o = null;
            }
            this.b = null;
            this.f14876c = null;
            this.g = null;
            this.i = null;
            this.n = null;
            this.p = null;
        }

        public final void d() {
            WebTabAdapter webTabAdapter = this.m;
            if (webTabAdapter != null) {
                DialogTabMini dialogTabMini = DialogTabMini.this;
                if (!dialogTabMini.B1) {
                    dialogTabMini.B1 = true;
                    int U = webTabAdapter.U();
                    if (U == -1) {
                        dialogTabMini.B1 = false;
                        return;
                    }
                    this.y = U;
                    Handler handler = dialogTabMini.i;
                    if (handler == null) {
                        return;
                    }
                    handler.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.13
                        @Override // java.lang.Runnable
                        public final void run() {
                            final TabGrid tabGrid = TabGrid.this;
                            DialogTabMini dialogTabMini2 = DialogTabMini.this;
                            int i = tabGrid.y;
                            WebTabAdapter webTabAdapter2 = tabGrid.m;
                            if (webTabAdapter2 == null) {
                                dialogTabMini2.B1 = false;
                                return;
                            }
                            webTabAdapter2.c0(i);
                            Handler handler2 = dialogTabMini2.i;
                            if (handler2 == null) {
                                return;
                            }
                            handler2.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.14
                                @Override // java.lang.Runnable
                                public final void run() {
                                    TabGrid tabGrid2 = TabGrid.this;
                                    DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                    WebTabAdapter webTabAdapter3 = tabGrid2.m;
                                    if (webTabAdapter3 != null) {
                                        webTabAdapter3.T(false);
                                        int i2 = DialogTabMini.H1;
                                        dialogTabMini3.Z();
                                        dialogTabMini3.b0();
                                    }
                                    DialogTabMini.this.B1 = false;
                                }
                            });
                        }
                    });
                }
            }
        }

        public final void e() {
            int i;
            MyButtonText myButtonText = this.l;
            int i2 = -14606047;
            if (myButtonText != null) {
                if (MainApp.K1) {
                    myButtonText.setTextColor(-328966);
                    this.l.u(-16777216, -14211289);
                } else {
                    myButtonText.setTextColor(-16777216);
                    this.l.u(-2039584, -3092272);
                }
                MyRoundLinear myRoundLinear = this.k;
                if (MainApp.K1) {
                    i = -14606047;
                } else {
                    i = -328966;
                }
                myRoundLinear.setColor(i);
            }
            MyRecyclerView myRecyclerView = this.h;
            if (myRecyclerView != null) {
                if (!MainApp.K1) {
                    i2 = -328966;
                }
                myRecyclerView.setBackgroundColor(i2);
            }
        }

        public final void f() {
            WebTabAdapter webTabAdapter;
            MyRecyclerView myRecyclerView = this.h;
            if (myRecyclerView != null && (webTabAdapter = this.m) != null) {
                boolean z = PrefZtwo.z;
                int height = myRecyclerView.getHeight();
                DialogTabMini dialogTabMini = DialogTabMini.this;
                webTabAdapter.Z(height, dialogTabMini.C0, dialogTabMini.D0, z);
            }
        }

        public final void g(int i) {
            if (this.m != null) {
                DialogTabMini dialogTabMini = DialogTabMini.this;
                if (dialogTabMini.A1) {
                    return;
                }
                dialogTabMini.A1 = true;
                this.r = i;
                dialogTabMini.s(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.10
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogTabMini dialogTabMini2 = DialogTabMini.this;
                        TabGrid tabGrid = dialogTabMini2.w0;
                        if (tabGrid != null) {
                            tabGrid.a();
                        }
                        TabGrid tabGrid2 = dialogTabMini2.x0;
                        if (tabGrid2 != null) {
                            tabGrid2.a();
                        }
                        Handler handler = dialogTabMini2.i;
                        if (handler == null) {
                            return;
                        }
                        handler.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.10.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z;
                                boolean z2;
                                MySnackbar mySnackbar;
                                final TabGrid tabGrid3 = TabGrid.this;
                                DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                int i2 = tabGrid3.r;
                                WebTabAdapter webTabAdapter = tabGrid3.m;
                                if (webTabAdapter == null) {
                                    return;
                                }
                                WebTabAdapter.WebTabItem H = webTabAdapter.H(i2);
                                if (H == null) {
                                    dialogTabMini3.A1 = false;
                                    return;
                                }
                                boolean z3 = true;
                                if (H.q != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!PrefZone.F && !z) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (mySnackbar = dialogTabMini3.a1) != null) {
                                    mySnackbar.i(false);
                                    dialogTabMini3.a1 = null;
                                }
                                WebTabAdapter webTabAdapter2 = tabGrid3.m;
                                if (i2 != webTabAdapter2.n) {
                                    z3 = false;
                                }
                                tabGrid3.q = z3;
                                if (!webTabAdapter2.R(i2, z2)) {
                                    dialogTabMini3.A1 = false;
                                    return;
                                }
                                tabGrid3.s = z;
                                tabGrid3.t = z2;
                                tabGrid3.u = H;
                                dialogTabMini3.s(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.11
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        TabGrid tabGrid4 = TabGrid.this;
                                        boolean z4 = tabGrid4.s;
                                        boolean z5 = tabGrid4.t;
                                        WebTabAdapter.WebTabItem webTabItem = tabGrid4.u;
                                        tabGrid4.u = null;
                                        WebTabAdapter webTabAdapter3 = tabGrid4.m;
                                        if (webTabAdapter3 != null) {
                                            webTabAdapter3.x(z5, true);
                                            tabGrid4.v = z4;
                                            tabGrid4.w = z5;
                                            tabGrid4.x = webTabItem;
                                            Handler handler2 = DialogTabMini.this.i;
                                            if (handler2 == null) {
                                                return;
                                            }
                                            handler2.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.11.1
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    final TabGrid tabGrid5 = TabGrid.this;
                                                    DialogTabMini dialogTabMini4 = DialogTabMini.this;
                                                    boolean z6 = tabGrid5.v;
                                                    boolean z7 = tabGrid5.w;
                                                    WebTabAdapter.WebTabItem webTabItem2 = tabGrid5.x;
                                                    tabGrid5.x = null;
                                                    if (tabGrid5.m != null) {
                                                        int i3 = DialogTabMini.H1;
                                                        dialogTabMini4.Z();
                                                        dialogTabMini4.b0();
                                                        if (z6) {
                                                            DialogTabMini.F(dialogTabMini4, webTabItem2);
                                                        } else if (z7) {
                                                            MySnackbar mySnackbar2 = new MySnackbar(dialogTabMini4.a0);
                                                            dialogTabMini4.a1 = mySnackbar2;
                                                            CoordinatorLayout coordinatorLayout = dialogTabMini4.t;
                                                            int i4 = R.string.undelete;
                                                            MySnackbar.SnackbarListener snackbarListener = new MySnackbar.SnackbarListener() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.12
                                                                @Override // com.mycompany.app.view.MySnackbar.SnackbarListener
                                                                public final void a() {
                                                                }

                                                                @Override // com.mycompany.app.view.MySnackbar.SnackbarListener
                                                                public final void b() {
                                                                    DialogTabMini dialogTabMini5 = DialogTabMini.this;
                                                                    if (dialogTabMini5.C1) {
                                                                        return;
                                                                    }
                                                                    dialogTabMini5.C1 = true;
                                                                    dialogTabMini5.s(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.12.1
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            AnonymousClass12 anonymousClass12 = AnonymousClass12.this;
                                                                            TabGrid.this.a();
                                                                            DialogTabMini.this.C1 = false;
                                                                        }
                                                                    });
                                                                }

                                                                @Override // com.mycompany.app.view.MySnackbar.SnackbarListener
                                                                public final void c() {
                                                                    TabGrid.this.d();
                                                                }

                                                                @Override // com.mycompany.app.view.MySnackbar.SnackbarListener
                                                                public final void onDismiss() {
                                                                    DialogTabMini dialogTabMini5 = DialogTabMini.this;
                                                                    if (dialogTabMini5.D1) {
                                                                        return;
                                                                    }
                                                                    dialogTabMini5.D1 = true;
                                                                    dialogTabMini5.s(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.TabGrid.12.2
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            AnonymousClass12 anonymousClass12 = AnonymousClass12.this;
                                                                            TabGrid.this.a();
                                                                            DialogTabMini.this.D1 = false;
                                                                        }
                                                                    });
                                                                    dialogTabMini5.a1 = null;
                                                                }
                                                            };
                                                            mySnackbar2.i = 2;
                                                            mySnackbar2.x(coordinatorLayout, 0, i4, 0, snackbarListener);
                                                        }
                                                    }
                                                    DialogTabMini.this.A1 = false;
                                                }
                                            });
                                        }
                                    }
                                });
                            }
                        });
                    }
                });
            }
        }
    }

    /* loaded from: classes3.dex */
    public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerHolder> {
        public ViewPagerAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int d() {
            return 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int f(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final /* bridge */ /* synthetic */ void n(RecyclerView.ViewHolder viewHolder, int i) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder o(ViewGroup viewGroup, int i) {
            View view;
            DialogTabMini dialogTabMini = DialogTabMini.this;
            if (i == 1) {
                TabGrid tabGrid = dialogTabMini.x0;
                if (tabGrid != null) {
                    view = tabGrid.g;
                }
                view = null;
            } else {
                TabGrid tabGrid2 = dialogTabMini.w0;
                if (tabGrid2 != null) {
                    view = tabGrid2.g;
                }
                view = null;
            }
            try {
                MainUtil.W6(view);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            } catch (Exception unused) {
                int i2 = DialogTabMini.H1;
                Handler handler = dialogTabMini.i;
                if (handler != null) {
                    handler.post(new AnonymousClass14());
                }
            }
            int i3 = DialogTabMini.H1;
            if (view == null) {
                try {
                    View view2 = new View(dialogTabMini.b0);
                    try {
                        view2.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                    } catch (Exception unused2) {
                    }
                    view = view2;
                } catch (Exception unused3) {
                }
            }
            return new RecyclerView.ViewHolder(view);
        }
    }

    /* loaded from: classes3.dex */
    public static class ViewPagerHolder extends RecyclerView.ViewHolder {
    }

    public DialogTabMini(WebViewActivity webViewActivity, WebNestFrame webNestFrame, int i, List list, boolean z, boolean z2, DialogTabMain.ListTabListener listTabListener) {
        super(webViewActivity, i);
        boolean z3;
        this.w = MainApp.Y0;
        m();
        this.a0 = webViewActivity;
        this.b0 = getContext();
        this.c0 = listTabListener;
        this.d0 = webNestFrame;
        this.e0 = list;
        this.f0 = z;
        this.g0 = z2;
        boolean z4 = PrefSync.k;
        this.h0 = z4;
        if (!z4 && PrefSecret.u && PrefSecret.s != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.i0 = z3;
        this.b1 = MainApp.K1;
        this.U0 = MainApp.E1 + MainApp.G1;
        if (!z) {
            this.x = true;
        }
        if (PrefZone.C == 0) {
            this.D = true;
        }
        this.j0 = true;
        Handler handler = this.i;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.1
            @Override // java.lang.Runnable
            public final void run() {
                int G;
                float G2;
                MyScrollBar myScrollBar;
                final DialogTabMini dialogTabMini = DialogTabMini.this;
                Context context = dialogTabMini.b0;
                if (context != null) {
                    if (PrefZone.C == 0) {
                        G = (int) MainUtil.G(context, 222.0f);
                        G2 = MainUtil.G(context, 166.0f);
                    } else {
                        G = (int) MainUtil.G(context, 320.0f);
                        G2 = MainUtil.G(context, 264.0f);
                    }
                    int i2 = (int) G2;
                    MyDialogMenu myDialogMenu = new MyDialogMenu(context);
                    FrameLayout frameLayout = new FrameLayout(context);
                    myDialogMenu.addView(frameLayout, -1, G);
                    ViewPager2 viewPager2 = new ViewPager2(context);
                    viewPager2.setOrientation(0);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i2);
                    layoutParams.topMargin = MainApp.b1;
                    frameLayout.addView(viewPager2, layoutParams);
                    if (PrefZone.C != 0) {
                        myScrollBar = new MyScrollBar(context);
                        myScrollBar.setPadTop(MainApp.b1);
                        myScrollBar.setVisibility(4);
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(MainApp.g1, -1);
                        layoutParams2.gravity = 8388613;
                        frameLayout.addView(myScrollBar, layoutParams2);
                    } else {
                        myScrollBar = null;
                    }
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    frameLayout.addView(frameLayout2, -1, MainApp.b1);
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setBaselineAligned(false);
                    linearLayout.setOrientation(0);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, MainApp.g1);
                    layoutParams3.topMargin = MainApp.G1;
                    layoutParams3.setMarginStart(MainApp.i1);
                    layoutParams3.setMarginEnd(MainApp.i1);
                    frameLayout2.addView(linearLayout, layoutParams3);
                    MyButtonRelative myButtonRelative = new MyButtonRelative(context);
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -1);
                    layoutParams4.weight = 1.0f;
                    linearLayout.addView(myButtonRelative, layoutParams4);
                    ImageView imageView = new ImageView(context);
                    int G3 = (int) MainUtil.G(context, 14.0f);
                    imageView.setPadding(G3, G3, G3, G3);
                    ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
                    imageView.setScaleType(scaleType);
                    myButtonRelative.addView(imageView, -1, -1);
                    MyButtonRelative myButtonRelative2 = new MyButtonRelative(context);
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -1);
                    layoutParams5.weight = 1.0f;
                    linearLayout.addView(myButtonRelative2, layoutParams5);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setPadding(G3, G3, G3, G3);
                    imageView2.setScaleType(scaleType);
                    myButtonRelative2.addView(imageView2, -1, -1);
                    MyButtonImage myButtonImage = new MyButtonImage(context);
                    myButtonImage.setScaleType(scaleType);
                    MyScrollBar myScrollBar2 = myScrollBar;
                    FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(MainApp.g1, MainApp.b1);
                    layoutParams6.setMarginStart(MainApp.F1);
                    frameLayout2.addView(myButtonImage, layoutParams6);
                    AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                    int i3 = MainApp.F1;
                    appCompatTextView.setPadding(i3, 0, i3, 0);
                    appCompatTextView.setGravity(16);
                    appCompatTextView.setTextDirection(3);
                    appCompatTextView.setTextSize(1, 16.0f);
                    appCompatTextView.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, MainApp.g1);
                    layoutParams7.gravity = 8388613;
                    layoutParams7.topMargin = MainApp.G1;
                    layoutParams7.setMarginEnd(MainApp.h1);
                    frameLayout2.addView(appCompatTextView, layoutParams7);
                    MyButtonCheck myButtonCheck = new MyButtonCheck(context);
                    myButtonCheck.setVisibility(8);
                    int i4 = MainApp.g1;
                    FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(i4, i4);
                    layoutParams8.gravity = 8388613;
                    layoutParams8.topMargin = MainApp.G1;
                    frameLayout2.addView(myButtonCheck, layoutParams8);
                    MyButtonImage myButtonImage2 = new MyButtonImage(context);
                    myButtonImage2.setPadding(G3, G3, G3, G3);
                    myButtonImage2.setScaleType(scaleType);
                    int i5 = MainApp.g1;
                    FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(i5, i5);
                    layoutParams9.gravity = 8388613;
                    layoutParams9.topMargin = MainApp.G1;
                    frameLayout2.addView(myButtonImage2, layoutParams9);
                    TabLayout tabLayout = new TabLayout(context);
                    tabLayout.setTabMode(1);
                    tabLayout.setTabGravity(0);
                    int G4 = (int) MainUtil.G(context, 2.0f);
                    int G5 = (int) MainUtil.G(context, 20.0f);
                    FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, G4);
                    layoutParams10.topMargin = (int) MainUtil.G(context, 54.0f);
                    layoutParams10.setMarginStart(G5);
                    layoutParams10.setMarginEnd(G5);
                    frameLayout.addView(tabLayout, layoutParams10);
                    dialogTabMini.k0 = myDialogMenu;
                    dialogTabMini.l0 = myButtonImage2;
                    dialogTabMini.m0 = appCompatTextView;
                    dialogTabMini.n0 = myButtonCheck;
                    dialogTabMini.o0 = linearLayout;
                    dialogTabMini.p0 = myButtonRelative;
                    dialogTabMini.q0 = imageView;
                    dialogTabMini.r0 = myButtonRelative2;
                    dialogTabMini.s0 = imageView2;
                    dialogTabMini.t0 = tabLayout;
                    dialogTabMini.u0 = viewPager2;
                    dialogTabMini.y0 = myScrollBar2;
                    Handler handler2 = dialogTabMini.i;
                    if (handler2 == null) {
                        return;
                    }
                    handler2.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            final DialogTabMini dialogTabMini2 = DialogTabMini.this;
                            MyDialogMenu myDialogMenu2 = dialogTabMini2.k0;
                            if (myDialogMenu2 != null && dialogTabMini2.b0 != null) {
                                if (MainApp.K1) {
                                    myDialogMenu2.setBackColor(-16777216);
                                    dialogTabMini2.m0.setTextColor(-328966);
                                    dialogTabMini2.l0.setImageResource(R.drawable.outline_more_vert_dark_20);
                                    dialogTabMini2.n0.p(R.drawable.baseline_check_circle_dark_24, R.drawable.outline_radio_button_unchecked_dark_24);
                                    dialogTabMini2.q0.setImageResource(R.drawable.outline_mood_dark_20);
                                    dialogTabMini2.s0.setImageResource(R.drawable.outline_secret_mode_dark_20);
                                    dialogTabMini2.t0.setSelectedTabIndicatorColor(-5197648);
                                    dialogTabMini2.p0.setBgPreColor(-12632257);
                                    dialogTabMini2.r0.setBgPreColor(-12632257);
                                    dialogTabMini2.n0.setBgPreColor(-12632257);
                                    dialogTabMini2.l0.setBgPreColor(-12632257);
                                } else {
                                    myDialogMenu2.setBackColor(-460552);
                                    dialogTabMini2.m0.setTextColor(-16777216);
                                    dialogTabMini2.l0.setImageResource(R.drawable.outline_more_vert_black_20);
                                    dialogTabMini2.n0.p(R.drawable.baseline_check_circle_black_24, R.drawable.outline_radio_button_unchecked_black_24);
                                    dialogTabMini2.q0.setImageResource(R.drawable.outline_mood_black_20);
                                    dialogTabMini2.s0.setImageResource(R.drawable.outline_secret_mode_black_20);
                                    dialogTabMini2.t0.setSelectedTabIndicatorColor(-5854742);
                                    dialogTabMini2.p0.setBgPreColor(553648128);
                                    dialogTabMini2.r0.setBgPreColor(553648128);
                                    dialogTabMini2.n0.setBgPreColor(553648128);
                                    dialogTabMini2.l0.setBgPreColor(553648128);
                                }
                                if (dialogTabMini2.h0) {
                                    dialogTabMini2.q0.setAlpha(0.4f);
                                    dialogTabMini2.s0.setAlpha(1.0f);
                                } else {
                                    dialogTabMini2.q0.setAlpha(1.0f);
                                    dialogTabMini2.s0.setAlpha(0.4f);
                                }
                                if (PrefAlbum.n) {
                                    dialogTabMini2.l0.setNoti(true);
                                }
                                dialogTabMini2.l0.setOnClickListener(new View.OnClickListener() { // from class: com.mycompany.app.dialog.DialogTabMini.3
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        final DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                        MyButtonImage myButtonImage3 = dialogTabMini3.l0;
                                        if (myButtonImage3 != null) {
                                            myButtonImage3.setNoti(false);
                                            WebTabAdapter G6 = dialogTabMini3.G(dialogTabMini3.h0);
                                            if (G6 != null && !G6.u && dialogTabMini3.E0 == null) {
                                                dialogTabMini3.N();
                                                if (view == null) {
                                                    return;
                                                }
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(new MyPopupAdapter.PopMenuItem(0, R.string.type));
                                                arrayList.add(new MyPopupAdapter.PopMenuItem(1, R.string.outline_color));
                                                arrayList.add(new MyPopupAdapter.PopMenuItem(2, R.string.mini_mode, 0, PrefZone.D));
                                                arrayList.add(new MyPopupAdapter.PopMenuItem(3, R.string.at_bottom, 0, PrefZtwo.z));
                                                arrayList.add(new MyPopupAdapter.PopMenuItem(4, R.string.swipe_delete, 0, PrefZone.E));
                                                arrayList.add(new MyPopupAdapter.PopMenuItem(5, R.string.undelete));
                                                arrayList.add(new MyPopupAdapter.PopMenuItem(6, R.string.search_url));
                                                arrayList.add(new MyPopupAdapter.PopMenuItem(7, R.string.select));
                                                arrayList.add(new MyPopupAdapter.PopMenuItem(8, R.string.close_all));
                                                MyPopupMenu myPopupMenu = new MyPopupMenu(dialogTabMini3.a0, dialogTabMini3.k0, view, arrayList, MainApp.K1, new MyPopupMenu.MyPopupListener() { // from class: com.mycompany.app.dialog.DialogTabMini.20
                                                    @Override // com.mycompany.app.view.MyPopupMenu.MyPopupListener
                                                    public final void a() {
                                                        int i6 = DialogTabMini.H1;
                                                        DialogTabMini.this.N();
                                                    }

                                                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                                                    @Override // com.mycompany.app.view.MyPopupMenu.MyPopupListener
                                                    public final boolean b(View view2, int i6) {
                                                        boolean z5;
                                                        CoordinatorLayout coordinatorLayout;
                                                        final DialogTabMini dialogTabMini4 = DialogTabMini.this;
                                                        switch (i6) {
                                                            case 0:
                                                                if (dialogTabMini4.F0 == null) {
                                                                    dialogTabMini4.P();
                                                                    if (view2 != null) {
                                                                        ArrayList arrayList2 = new ArrayList();
                                                                        int[] iArr = DialogTabMain.l1;
                                                                        for (int i7 = 0; i7 < 3; i7++) {
                                                                            int i8 = DialogTabMain.l1[i7];
                                                                            int i9 = DialogTabMain.m1[i8];
                                                                            if (PrefZone.C == i8) {
                                                                                z5 = true;
                                                                            } else {
                                                                                z5 = false;
                                                                            }
                                                                            arrayList2.add(new MyPopupAdapter.PopMenuItem(i7, i9, z5));
                                                                        }
                                                                        MyPopupMenu myPopupMenu2 = new MyPopupMenu(dialogTabMini4.a0, dialogTabMini4.k0, view2, arrayList2, MainApp.K1, new AnonymousClass21());
                                                                        dialogTabMini4.F0 = myPopupMenu2;
                                                                        myPopupMenu2.m = 1;
                                                                        dialogTabMini4.Y = myPopupMenu2;
                                                                        return false;
                                                                    }
                                                                }
                                                                return false;
                                                            case 1:
                                                                if (dialogTabMini4.a0 != null && !dialogTabMini4.S()) {
                                                                    DialogEditIcon dialogEditIcon = dialogTabMini4.M0;
                                                                    if (dialogEditIcon != null) {
                                                                        dialogEditIcon.dismiss();
                                                                        dialogTabMini4.M0 = null;
                                                                    }
                                                                    DialogEditIcon dialogEditIcon2 = new DialogEditIcon(dialogTabMini4.a0, 6, new AnonymousClass37());
                                                                    dialogTabMini4.M0 = dialogEditIcon2;
                                                                    dialogEditIcon2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.mycompany.app.dialog.DialogTabMini.38
                                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                                            int i10 = DialogTabMini.H1;
                                                                            DialogTabMini dialogTabMini5 = DialogTabMini.this;
                                                                            DialogEditIcon dialogEditIcon3 = dialogTabMini5.M0;
                                                                            if (dialogEditIcon3 != null) {
                                                                                dialogEditIcon3.dismiss();
                                                                                dialogTabMini5.M0 = null;
                                                                            }
                                                                        }
                                                                    });
                                                                    return true;
                                                                }
                                                                return true;
                                                            case 2:
                                                                boolean z6 = !PrefZone.D;
                                                                PrefZone.D = z6;
                                                                PrefSet.d(15, dialogTabMini4.b0, "mTabMiniMode", z6);
                                                                dialogTabMini4.dismiss();
                                                                return true;
                                                            case 3:
                                                                boolean z7 = !PrefZtwo.z;
                                                                PrefZtwo.z = z7;
                                                                PrefSet.d(16, dialogTabMini4.b0, "mTabDown2", z7);
                                                                TabGrid tabGrid = dialogTabMini4.w0;
                                                                if (tabGrid != null) {
                                                                    tabGrid.f();
                                                                }
                                                                TabGrid tabGrid2 = dialogTabMini4.x0;
                                                                if (tabGrid2 != null) {
                                                                    tabGrid2.f();
                                                                    return true;
                                                                }
                                                                return true;
                                                            case 4:
                                                                boolean z8 = !PrefZone.E;
                                                                PrefZone.E = z8;
                                                                PrefSet.d(15, dialogTabMini4.b0, "mSwipeDelete", z8);
                                                                return true;
                                                            case 5:
                                                                if (dialogTabMini4.a0 != null && !dialogTabMini4.S()) {
                                                                    DialogSetTabRestore dialogSetTabRestore = dialogTabMini4.I0;
                                                                    if (dialogSetTabRestore != null) {
                                                                        dialogSetTabRestore.dismiss();
                                                                        dialogTabMini4.I0 = null;
                                                                    }
                                                                    DialogSetTabRestore dialogSetTabRestore2 = new DialogSetTabRestore(dialogTabMini4.a0, null);
                                                                    dialogTabMini4.I0 = dialogSetTabRestore2;
                                                                    dialogSetTabRestore2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.mycompany.app.dialog.DialogTabMini.27
                                                                        @Override // android.content.DialogInterface.OnDismissListener
                                                                        public final void onDismiss(DialogInterface dialogInterface) {
                                                                            int i10 = DialogTabMini.H1;
                                                                            DialogTabMini dialogTabMini5 = DialogTabMini.this;
                                                                            DialogSetTabRestore dialogSetTabRestore3 = dialogTabMini5.I0;
                                                                            if (dialogSetTabRestore3 != null) {
                                                                                dialogSetTabRestore3.dismiss();
                                                                                dialogTabMini5.I0 = null;
                                                                            }
                                                                        }
                                                                    });
                                                                    return true;
                                                                }
                                                                return true;
                                                            case 7:
                                                                WebTabAdapter G7 = dialogTabMini4.G(dialogTabMini4.h0);
                                                                if (G7 != null && !G7.u) {
                                                                    G7.Y(0, true);
                                                                    dialogTabMini4.Z();
                                                                }
                                                                return true;
                                                            case 8:
                                                                DialogTabMini.F(dialogTabMini4, null);
                                                                return true;
                                                            case 6:
                                                                if (dialogTabMini4.c1 == null && (coordinatorLayout = dialogTabMini4.t) != null) {
                                                                    DialogTabFind dialogTabFind = new DialogTabFind(dialogTabMini4.a0, dialogTabMini4.b0, coordinatorLayout, dialogTabMini4.h0, true, new DialogTabFind.TabFindListener() { // from class: com.mycompany.app.dialog.DialogTabMini.42
                                                                        @Override // com.mycompany.app.dialog.DialogTabFind.TabFindListener
                                                                        public final void a() {
                                                                            DialogTabMini dialogTabMini5 = DialogTabMini.this;
                                                                            if (dialogTabMini5.h0) {
                                                                                TabGrid tabGrid3 = dialogTabMini5.x0;
                                                                                if (tabGrid3 != null) {
                                                                                    tabGrid3.b(true);
                                                                                }
                                                                            } else {
                                                                                TabGrid tabGrid4 = dialogTabMini5.w0;
                                                                                if (tabGrid4 != null) {
                                                                                    tabGrid4.b(true);
                                                                                }
                                                                            }
                                                                            dialogTabMini5.b0();
                                                                        }

                                                                        @Override // com.mycompany.app.dialog.DialogTabFind.TabFindListener
                                                                        public final void b(int i10) {
                                                                            DialogTabMini dialogTabMini5 = DialogTabMini.this;
                                                                            DialogTabMini.E(dialogTabMini5, i10, dialogTabMini5.h0);
                                                                        }

                                                                        @Override // com.mycompany.app.dialog.DialogTabFind.TabFindListener
                                                                        public final void c() {
                                                                            int i10 = DialogTabMini.H1;
                                                                            DialogTabMini.this.V();
                                                                        }
                                                                    });
                                                                    dialogTabMini4.c1 = dialogTabFind;
                                                                    dialogTabFind.j = dialogTabMini4;
                                                                    return true;
                                                                }
                                                                return true;
                                                            default:
                                                                return true;
                                                        }
                                                    }
                                                });
                                                dialogTabMini3.E0 = myPopupMenu;
                                                dialogTabMini3.Y = myPopupMenu;
                                            }
                                        }
                                    }
                                });
                                dialogTabMini2.n0.setOnClickListener(new View.OnClickListener() { // from class: com.mycompany.app.dialog.DialogTabMini.4
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                        WebTabAdapter G6 = dialogTabMini3.G(dialogTabMini3.h0);
                                        if (G6 == null || !G6.u) {
                                            return;
                                        }
                                        boolean z5 = !G6.N();
                                        dialogTabMini3.n0.q(z5, true);
                                        G6.X(z5, true);
                                        dialogTabMini3.m0.setText(MainUtil.h3(G6.E(), G6.J()));
                                        dialogTabMini3.Z();
                                    }
                                });
                                MyScrollBar myScrollBar3 = dialogTabMini2.y0;
                                if (myScrollBar3 != null) {
                                    myScrollBar3.setListener(new MyScrollBar.ScrollBarListener() { // from class: com.mycompany.app.dialog.DialogTabMini.5
                                        @Override // com.mycompany.app.view.MyScrollBar.ScrollBarListener
                                        public final void c(int i6) {
                                            MyManagerLinear myManagerLinear;
                                            WebTabAdapter G6;
                                            int i7;
                                            DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                            boolean z5 = dialogTabMini3.h0;
                                            if (z5) {
                                                TabGrid tabGrid = dialogTabMini3.x0;
                                                if (tabGrid != null) {
                                                    myManagerLinear = tabGrid.n;
                                                }
                                                myManagerLinear = null;
                                            } else {
                                                TabGrid tabGrid2 = dialogTabMini3.w0;
                                                if (tabGrid2 != null) {
                                                    myManagerLinear = tabGrid2.n;
                                                }
                                                myManagerLinear = null;
                                            }
                                            if (myManagerLinear != null && (G6 = dialogTabMini3.G(z5)) != null && (i7 = (i6 + 1) * dialogTabMini3.C0) >= 0 && i7 < G6.d()) {
                                                myManagerLinear.k1(i7, 0);
                                            }
                                        }

                                        @Override // com.mycompany.app.view.MyScrollBar.ScrollBarListener
                                        public final int d() {
                                            DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                            MyRecyclerView I = dialogTabMini3.I(dialogTabMini3.h0);
                                            if (I == null) {
                                                return 0;
                                            }
                                            return I.computeVerticalScrollOffset();
                                        }

                                        @Override // com.mycompany.app.view.MyScrollBar.ScrollBarListener
                                        public final void e() {
                                        }

                                        @Override // com.mycompany.app.view.MyScrollBar.ScrollBarListener
                                        public final int f() {
                                            DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                            MyRecyclerView I = dialogTabMini3.I(dialogTabMini3.h0);
                                            if (I == null) {
                                                return 0;
                                            }
                                            return I.computeVerticalScrollRange();
                                        }

                                        @Override // com.mycompany.app.view.MyScrollBar.ScrollBarListener
                                        public final int g() {
                                            DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                            MyRecyclerView I = dialogTabMini3.I(dialogTabMini3.h0);
                                            if (I == null) {
                                                return 0;
                                            }
                                            return I.computeVerticalScrollExtent();
                                        }
                                    });
                                }
                                dialogTabMini2.Y0 = new GestureDetector(dialogTabMini2.b0, new GestureDetector.SimpleOnGestureListener() { // from class: com.mycompany.app.dialog.DialogTabMini.6
                                    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
                                    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
                                    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final boolean onFling(android.view.MotionEvent r6, android.view.MotionEvent r7, float r8, float r9) {
                                        /*
                                            r5 = this;
                                            int r0 = com.mycompany.app.pref.PrefZone.C
                                            if (r0 != 0) goto L7
                                            r1 = r8
                                            r0 = r9
                                            goto L9
                                        L7:
                                            r0 = r8
                                            r1 = r9
                                        L9:
                                            float r2 = java.lang.Math.abs(r0)
                                            float r1 = java.lang.Math.abs(r1)
                                            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
                                            if (r1 <= 0) goto L64
                                            r1 = 1120403456(0x42c80000, float:100.0)
                                            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                                            r2 = 0
                                            r3 = -1
                                            com.mycompany.app.dialog.DialogTabMini r4 = com.mycompany.app.dialog.DialogTabMini.this
                                            if (r1 <= 0) goto L33
                                            boolean r0 = r4.S0
                                            if (r0 == 0) goto L64
                                            int r0 = r4.T0
                                            if (r0 == r3) goto L64
                                            float r0 = r4.X0
                                            int r1 = com.mycompany.app.main.MainApp.f1
                                            float r1 = (float) r1
                                            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                                            if (r0 <= 0) goto L64
                                            r4.S0 = r2
                                            goto L4d
                                        L33:
                                            r1 = -1027080192(0xffffffffc2c80000, float:-100.0)
                                            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                                            if (r0 >= 0) goto L64
                                            boolean r0 = r4.S0
                                            if (r0 == 0) goto L64
                                            int r0 = r4.T0
                                            if (r0 == r3) goto L64
                                            float r0 = r4.X0
                                            int r1 = com.mycompany.app.main.MainApp.f1
                                            int r1 = -r1
                                            float r1 = (float) r1
                                            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                                            if (r0 >= 0) goto L64
                                            r4.S0 = r2
                                        L4d:
                                            boolean r0 = r4.h0
                                            if (r0 == 0) goto L5b
                                            com.mycompany.app.dialog.DialogTabMini$TabGrid r0 = r4.x0
                                            if (r0 == 0) goto L64
                                            int r1 = r4.T0
                                            r0.g(r1)
                                            goto L64
                                        L5b:
                                            com.mycompany.app.dialog.DialogTabMini$TabGrid r0 = r4.w0
                                            if (r0 == 0) goto L64
                                            int r1 = r4.T0
                                            r0.g(r1)
                                        L64:
                                            boolean r6 = super.onFling(r6, r7, r8, r9)
                                            return r6
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.mycompany.app.dialog.DialogTabMini.AnonymousClass6.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
                                    }
                                });
                                dialogTabMini2.p0.setOnClickListener(new View.OnClickListener() { // from class: com.mycompany.app.dialog.DialogTabMini.7
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        ViewPager2 viewPager22 = DialogTabMini.this.u0;
                                        if (viewPager22 != null) {
                                            viewPager22.setCurrentItem(0);
                                        }
                                    }
                                });
                                dialogTabMini2.r0.setOnClickListener(new View.OnClickListener() { // from class: com.mycompany.app.dialog.DialogTabMini.8
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        ViewPager2 viewPager22 = DialogTabMini.this.u0;
                                        if (viewPager22 != null) {
                                            viewPager22.setCurrentItem(1);
                                        }
                                    }
                                });
                                dialogTabMini2.g(dialogTabMini2.k0, new MyDialogBottom.BotViewListener() { // from class: com.mycompany.app.dialog.DialogTabMini.9
                                    @Override // com.mycompany.app.view.MyDialogBottom.BotViewListener
                                    public final void a(View view) {
                                        Context context2;
                                        int i6;
                                        final DialogTabMini dialogTabMini3 = DialogTabMini.this;
                                        if (dialogTabMini3.k0 != null) {
                                            if (dialogTabMini3.t != null && (context2 = dialogTabMini3.b0) != null) {
                                                MyLineLinear myLineLinear = new MyLineLinear(context2);
                                                myLineLinear.setBaselineAligned(false);
                                                myLineLinear.setOrientation(0);
                                                AppCompatTextView C = com.google.android.gms.internal.mlkit_vision_text_common.a.C(context2, null, 17, 1, 16.0f);
                                                LinearLayout.LayoutParams e = com.google.android.gms.internal.mlkit_vision_text_common.a.e(C, R.string.delete_all, 0, -1);
                                                e.weight = 1.0f;
                                                myLineLinear.addView(C, e);
                                                MyLineText myLineText = new MyLineText(context2);
                                                myLineText.r(context2);
                                                myLineText.setGravity(17);
                                                myLineText.setTextSize(1, 16.0f);
                                                LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, -1);
                                                layoutParams11.weight = 1.0f;
                                                myLineLinear.addView(myLineText, layoutParams11);
                                                dialogTabMini3.z0 = myLineLinear;
                                                dialogTabMini3.A0 = myLineText;
                                                dialogTabMini3.B0 = C;
                                                if (MainApp.K1) {
                                                    myLineLinear.setBackgroundColor(-16777216);
                                                    dialogTabMini3.A0.setBackgroundResource(R.drawable.selector_normal_dark);
                                                    dialogTabMini3.B0.setBackgroundResource(R.drawable.selector_normal_dark);
                                                    dialogTabMini3.A0.setTextColor(-328966);
                                                } else {
                                                    myLineLinear.setBackgroundColor(-460552);
                                                    dialogTabMini3.A0.setBackgroundResource(R.drawable.selector_normal_gray);
                                                    dialogTabMini3.B0.setBackgroundResource(R.drawable.selector_normal_gray);
                                                    dialogTabMini3.A0.setTextColor(-14784824);
                                                }
                                                dialogTabMini3.z0.setFilterColor(MainUtil.l1());
                                                dialogTabMini3.W();
                                                dialogTabMini3.A0.setOnClickListener(new AnonymousClass15());
                                                dialogTabMini3.B0.setEnabled(false);
                                                AppCompatTextView appCompatTextView2 = dialogTabMini3.B0;
                                                if (MainApp.K1) {
                                                    i6 = -8355712;
                                                } else {
                                                    i6 = -2434342;
                                                }
                                                appCompatTextView2.setTextColor(i6);
                                                dialogTabMini3.B0.setOnClickListener(new View.OnClickListener() { // from class: com.mycompany.app.dialog.DialogTabMini.16
                                                    @Override // android.view.View.OnClickListener
                                                    public final void onClick(View view2) {
                                                        DialogTabMini.F(DialogTabMini.this, null);
                                                    }
                                                });
                                                try {
                                                    CoordinatorLayout.LayoutParams layoutParams12 = new CoordinatorLayout.LayoutParams(-1, MainApp.g1);
                                                    layoutParams12.f611c = 80;
                                                    dialogTabMini3.t.addView(dialogTabMini3.z0, layoutParams12);
                                                } catch (Exception unused) {
                                                    Handler handler3 = dialogTabMini3.i;
                                                    if (handler3 != null) {
                                                        handler3.post(new AnonymousClass14());
                                                    }
                                                }
                                                int i7 = MainApp.g1;
                                                if (dialogTabMini3.t != null && MainUtil.l1() == 0) {
                                                    View view2 = new View(dialogTabMini3.b0);
                                                    View view3 = new View(dialogTabMini3.b0);
                                                    if (MainApp.K1) {
                                                        view2.setBackgroundResource(R.drawable.round_bot_left_b);
                                                        view3.setBackgroundResource(R.drawable.round_bot_right_b);
                                                    } else {
                                                        view2.setBackgroundResource(R.drawable.round_bot_left_g);
                                                        view3.setBackgroundResource(R.drawable.round_bot_right_g);
                                                    }
                                                    int i8 = MainApp.m1;
                                                    CoordinatorLayout.LayoutParams layoutParams13 = new CoordinatorLayout.LayoutParams(i8, i8);
                                                    layoutParams13.f611c = 8388691;
                                                    ((ViewGroup.MarginLayoutParams) layoutParams13).bottomMargin = i7;
                                                    int i9 = MainApp.m1;
                                                    CoordinatorLayout.LayoutParams layoutParams14 = new CoordinatorLayout.LayoutParams(i9, i9);
                                                    layoutParams14.f611c = 8388693;
                                                    ((ViewGroup.MarginLayoutParams) layoutParams14).bottomMargin = i7;
                                                    try {
                                                        dialogTabMini3.t.addView(view2, layoutParams13);
                                                        dialogTabMini3.t.addView(view3, layoutParams14);
                                                    } catch (Exception unused2) {
                                                    }
                                                }
                                            }
                                            Handler handler4 = dialogTabMini3.i;
                                            if (handler4 != null) {
                                                handler4.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.10
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        DialogTabMini dialogTabMini4 = DialogTabMini.this;
                                                        dialogTabMini4.show();
                                                        Handler handler5 = dialogTabMini4.i;
                                                        if (handler5 == null) {
                                                            return;
                                                        }
                                                        handler5.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.10.1
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                final DialogTabMini dialogTabMini5 = DialogTabMini.this;
                                                                if (dialogTabMini5.t0 != null) {
                                                                    dialogTabMini5.w0 = new TabGrid(false);
                                                                    Handler handler6 = dialogTabMini5.i;
                                                                    if (handler6 == null) {
                                                                        return;
                                                                    }
                                                                    handler6.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.12
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            DialogTabMini dialogTabMini6 = DialogTabMini.this;
                                                                            if (dialogTabMini6.t0 != null) {
                                                                                dialogTabMini6.x0 = new TabGrid(true);
                                                                                Handler handler7 = dialogTabMini6.i;
                                                                                if (handler7 == null) {
                                                                                    return;
                                                                                }
                                                                                handler7.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.12.1
                                                                                    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.material.tabs.TabLayoutMediator$TabConfigurationStrategy, java.lang.Object] */
                                                                                    @Override // java.lang.Runnable
                                                                                    public final void run() {
                                                                                        Handler handler8;
                                                                                        final DialogTabMini dialogTabMini7 = DialogTabMini.this;
                                                                                        if (dialogTabMini7.t0 != null) {
                                                                                            if (Build.VERSION.SDK_INT < 31) {
                                                                                                dialogTabMini7.u0.setOverScrollMode(2);
                                                                                            }
                                                                                            if (dialogTabMini7.g0) {
                                                                                                dialogTabMini7.u0.setLayoutDirection(1);
                                                                                            }
                                                                                            MainUtil.q7(dialogTabMini7.u0);
                                                                                            ViewPager2 viewPager22 = dialogTabMini7.u0;
                                                                                            if (viewPager22 != null) {
                                                                                                dialogTabMini7.v0 = new ViewPager2.OnPageChangeCallback() { // from class: com.mycompany.app.dialog.DialogTabMini.18
                                                                                                    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                                                                                                    public final void c(int i10) {
                                                                                                        int i11 = DialogTabMini.H1;
                                                                                                        DialogTabMini dialogTabMini8 = DialogTabMini.this;
                                                                                                        dialogTabMini8.getClass();
                                                                                                        boolean z5 = true;
                                                                                                        if (i10 != 1) {
                                                                                                            z5 = false;
                                                                                                        }
                                                                                                        dialogTabMini8.Y(z5, false);
                                                                                                    }
                                                                                                };
                                                                                                viewPager22.setAdapter(new ViewPagerAdapter());
                                                                                                dialogTabMini7.u0.b(dialogTabMini7.v0);
                                                                                            }
                                                                                            new TabLayoutMediator(dialogTabMini7.t0, dialogTabMini7.u0, new Object()).a();
                                                                                            dialogTabMini7.X();
                                                                                            TabGrid tabGrid = dialogTabMini7.w0;
                                                                                            if (tabGrid != null) {
                                                                                                tabGrid.b(false);
                                                                                            }
                                                                                            TabGrid tabGrid2 = dialogTabMini7.x0;
                                                                                            if (tabGrid2 != null) {
                                                                                                tabGrid2.b(false);
                                                                                            }
                                                                                            if (dialogTabMini7.h0) {
                                                                                                dialogTabMini7.u0.d(1, false);
                                                                                            }
                                                                                            dialogTabMini7.Y(dialogTabMini7.h0, true);
                                                                                            boolean z5 = PrefAlbum.n;
                                                                                            if (z5 && z5 && dialogTabMini7.H0 == null && !dialogTabMini7.S() && dialogTabMini7.k0 != null && (handler8 = dialogTabMini7.i) != null) {
                                                                                                handler8.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.23
                                                                                                    @Override // java.lang.Runnable
                                                                                                    public final void run() {
                                                                                                        WebViewActivity webViewActivity2;
                                                                                                        if (!PrefAlbum.n) {
                                                                                                            int i10 = DialogTabMini.H1;
                                                                                                            return;
                                                                                                        }
                                                                                                        final DialogTabMini dialogTabMini8 = DialogTabMini.this;
                                                                                                        if (dialogTabMini8.H0 == null && !dialogTabMini8.S() && dialogTabMini8.k0 != null && (webViewActivity2 = dialogTabMini8.a0) != null) {
                                                                                                            MyFadeFrame myFadeFrame = new MyFadeFrame(webViewActivity2);
                                                                                                            int i11 = MainApp.F1;
                                                                                                            myFadeFrame.setPadding(i11, i11, i11, i11);
                                                                                                            FrameLayout frameLayout3 = new FrameLayout(webViewActivity2);
                                                                                                            frameLayout3.setBackgroundResource(R.drawable.round_guide_8);
                                                                                                            FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, -2);
                                                                                                            layoutParams15.gravity = 8388691;
                                                                                                            myFadeFrame.addView(frameLayout3, layoutParams15);
                                                                                                            LinearLayout linearLayout2 = new LinearLayout(webViewActivity2);
                                                                                                            int i12 = MainApp.E1;
                                                                                                            linearLayout2.setPadding(i12, i12, i12, i12);
                                                                                                            linearLayout2.setOrientation(1);
                                                                                                            FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-2, -2);
                                                                                                            layoutParams16.gravity = 1;
                                                                                                            frameLayout3.addView(linearLayout2, layoutParams16);
                                                                                                            AppCompatTextView appCompatTextView3 = new AppCompatTextView(webViewActivity2, null);
                                                                                                            appCompatTextView3.setLineSpacing(MainApp.G1, 1.0f);
                                                                                                            appCompatTextView3.setTextSize(1, 16.0f);
                                                                                                            appCompatTextView3.setTextColor(-1);
                                                                                                            linearLayout2.addView(appCompatTextView3, -2, -2);
                                                                                                            AppCompatTextView appCompatTextView4 = new AppCompatTextView(webViewActivity2, null);
                                                                                                            appCompatTextView4.setLineSpacing(MainApp.G1, 1.0f);
                                                                                                            appCompatTextView4.setTextSize(1, 16.0f);
                                                                                                            appCompatTextView4.setTextColor(-1);
                                                                                                            LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(-2, -2);
                                                                                                            layoutParams17.topMargin = MainApp.E1;
                                                                                                            linearLayout2.addView(appCompatTextView4, layoutParams17);
                                                                                                            dialogTabMini8.H0 = myFadeFrame;
                                                                                                            appCompatTextView3.setText(R.string.tab_guide_1);
                                                                                                            appCompatTextView4.setText(R.string.tab_guide_2);
                                                                                                            dialogTabMini8.H0.setListener(new MyFadeListener() { // from class: com.mycompany.app.dialog.DialogTabMini.24
                                                                                                                @Override // com.mycompany.app.view.MyFadeListener
                                                                                                                public final void a(boolean z6) {
                                                                                                                    DialogTabMini dialogTabMini9;
                                                                                                                    MyFadeFrame myFadeFrame2;
                                                                                                                    if (!z6 && (myFadeFrame2 = (dialogTabMini9 = DialogTabMini.this).H0) != null && dialogTabMini9.k0 != null) {
                                                                                                                        myFadeFrame2.f();
                                                                                                                        dialogTabMini9.k0.removeView(dialogTabMini9.H0);
                                                                                                                        dialogTabMini9.H0 = null;
                                                                                                                    }
                                                                                                                }

                                                                                                                @Override // com.mycompany.app.view.MyFadeListener
                                                                                                                public final void b(boolean z6, boolean z7) {
                                                                                                                }
                                                                                                            });
                                                                                                            dialogTabMini8.H0.setOnTouchListener(new View.OnTouchListener() { // from class: com.mycompany.app.dialog.DialogTabMini.25
                                                                                                                @Override // android.view.View.OnTouchListener
                                                                                                                public final boolean onTouch(View view4, MotionEvent motionEvent) {
                                                                                                                    boolean z6 = PrefAlbum.n;
                                                                                                                    DialogTabMini dialogTabMini9 = DialogTabMini.this;
                                                                                                                    if (z6) {
                                                                                                                        PrefAlbum.n = false;
                                                                                                                        PrefSet.d(0, dialogTabMini9.b0, "mGuideTab", false);
                                                                                                                    }
                                                                                                                    MyFadeFrame myFadeFrame2 = dialogTabMini9.H0;
                                                                                                                    if (myFadeFrame2 != null) {
                                                                                                                        myFadeFrame2.d(true);
                                                                                                                    }
                                                                                                                    return false;
                                                                                                                }
                                                                                                            });
                                                                                                            frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.mycompany.app.dialog.DialogTabMini.26
                                                                                                                @Override // android.view.View.OnClickListener
                                                                                                                public final void onClick(View view4) {
                                                                                                                    boolean z6 = PrefAlbum.n;
                                                                                                                    DialogTabMini dialogTabMini9 = DialogTabMini.this;
                                                                                                                    if (z6) {
                                                                                                                        PrefAlbum.n = false;
                                                                                                                        PrefSet.d(0, dialogTabMini9.b0, "mGuideTab", false);
                                                                                                                    }
                                                                                                                    MyFadeFrame myFadeFrame2 = dialogTabMini9.H0;
                                                                                                                    if (myFadeFrame2 != null) {
                                                                                                                        myFadeFrame2.d(true);
                                                                                                                    }
                                                                                                                }
                                                                                                            });
                                                                                                            try {
                                                                                                                dialogTabMini8.k0.addView(dialogTabMini8.H0, -1, MainApp.F1 * 30);
                                                                                                            } catch (Exception unused3) {
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                });
                                                                                            }
                                                                                        }
                                                                                        dialogTabMini7.j0 = false;
                                                                                    }
                                                                                });
                                                                            }
                                                                        }
                                                                    });
                                                                }
                                                            }
                                                        });
                                                    }
                                                });
                                            }
                                        }
                                    }
                                });
                            }
                        }
                    });
                }
            }
        });
    }

    public static void B(DialogTabMini dialogTabMini) {
        boolean z;
        WebTabAdapter G;
        WebTabAdapter G2 = dialogTabMini.G(PrefSync.k);
        if (G2 != null) {
            G2.B = null;
        }
        WebNestFrame webNestFrame = dialogTabMini.d0;
        if (webNestFrame != null && !webNestFrame.f19303c) {
            webNestFrame.t(null);
        }
        dialogTabMini.d0 = null;
        MySnackbar mySnackbar = dialogTabMini.a1;
        if (mySnackbar != null) {
            mySnackbar.i(false);
            dialogTabMini.a1 = null;
        }
        if (dialogTabMini.c0 != null) {
            boolean z2 = PrefSync.k;
            if (z2) {
                z = dialogTabMini.Q0;
            } else {
                z = dialogTabMini.P0;
            }
            dialogTabMini.P0 = false;
            dialogTabMini.Q0 = false;
            if (z && (G = dialogTabMini.G(z2)) != null) {
                dialogTabMini.c0.a(G.m, G.j);
            }
        }
        dialogTabMini.N();
        dialogTabMini.P();
        MyPopupMenu myPopupMenu = dialogTabMini.G0;
        if (myPopupMenu != null) {
            dialogTabMini.Y = null;
            myPopupMenu.a();
            dialogTabMini.G0 = null;
        }
        DialogSetTabRestore dialogSetTabRestore = dialogTabMini.I0;
        if (dialogSetTabRestore != null) {
            dialogSetTabRestore.dismiss();
            dialogTabMini.I0 = null;
        }
        dialogTabMini.L();
        dialogTabMini.K();
        dialogTabMini.M();
        DialogEditIcon dialogEditIcon = dialogTabMini.M0;
        if (dialogEditIcon != null) {
            dialogEditIcon.dismiss();
            dialogTabMini.M0 = null;
        }
        dialogTabMini.O();
        dialogTabMini.V();
        ViewPager2 viewPager2 = dialogTabMini.u0;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = dialogTabMini.v0;
        dialogTabMini.u0 = null;
        dialogTabMini.v0 = null;
        if (viewPager2 != null) {
            if (onPageChangeCallback != null) {
                viewPager2.f(onPageChangeCallback);
            }
            viewPager2.setAdapter(null);
        }
        MyDialogMenu myDialogMenu = dialogTabMini.k0;
        if (myDialogMenu != null) {
            myDialogMenu.f18666c = false;
            myDialogMenu.h = null;
            myDialogMenu.i = null;
            myDialogMenu.j = null;
            myDialogMenu.k = null;
            dialogTabMini.k0 = null;
        }
        MyButtonImage myButtonImage = dialogTabMini.l0;
        if (myButtonImage != null) {
            myButtonImage.j();
            dialogTabMini.l0 = null;
        }
        MyButtonCheck myButtonCheck = dialogTabMini.n0;
        if (myButtonCheck != null) {
            myButtonCheck.l();
            dialogTabMini.n0 = null;
        }
        MyButtonRelative myButtonRelative = dialogTabMini.p0;
        if (myButtonRelative != null) {
            myButtonRelative.f();
            dialogTabMini.p0 = null;
        }
        MyButtonRelative myButtonRelative2 = dialogTabMini.r0;
        if (myButtonRelative2 != null) {
            myButtonRelative2.f();
            dialogTabMini.r0 = null;
        }
        TabGrid tabGrid = dialogTabMini.w0;
        if (tabGrid != null) {
            tabGrid.c();
            dialogTabMini.w0 = null;
        }
        TabGrid tabGrid2 = dialogTabMini.x0;
        if (tabGrid2 != null) {
            tabGrid2.c();
            dialogTabMini.x0 = null;
        }
        MyScrollBar myScrollBar = dialogTabMini.y0;
        if (myScrollBar != null) {
            myScrollBar.k();
            dialogTabMini.y0 = null;
        }
        MyLineLinear myLineLinear = dialogTabMini.z0;
        if (myLineLinear != null) {
            myLineLinear.a();
            dialogTabMini.z0 = null;
        }
        MyLineText myLineText = dialogTabMini.A0;
        if (myLineText != null) {
            myLineText.u();
            dialogTabMini.A0 = null;
        }
        dialogTabMini.a0 = null;
        dialogTabMini.b0 = null;
        dialogTabMini.c0 = null;
        dialogTabMini.e0 = null;
        dialogTabMini.m0 = null;
        dialogTabMini.o0 = null;
        dialogTabMini.q0 = null;
        dialogTabMini.s0 = null;
        dialogTabMini.t0 = null;
        dialogTabMini.B0 = null;
        dialogTabMini.Y0 = null;
        super.dismiss();
    }

    public static void C(DialogTabMini dialogTabMini, int i) {
        WebTabAdapter G;
        List list;
        if (dialogTabMini.N0 == null || (G = dialogTabMini.G(dialogTabMini.h0)) == null) {
            return;
        }
        WebTabAdapter.WebTabItem H = G.H(i);
        if (H != null) {
            list = H.q;
        } else {
            list = null;
        }
        dialogTabMini.b0();
        dialogTabMini.R0 = true;
        if (list != null && list.size() >= 2) {
            dialogTabMini.N0.o(list, G.l, G.m);
        } else {
            dialogTabMini.O();
        }
    }

    public static void D(DialogTabMini dialogTabMini, boolean z) {
        boolean z2;
        WebTabAdapter webTabAdapter;
        if (dialogTabMini.c0 == null) {
            return;
        }
        boolean z3 = PrefSync.k;
        if (z3) {
            z2 = dialogTabMini.Q0;
        } else {
            z2 = dialogTabMini.P0;
        }
        dialogTabMini.P0 = false;
        dialogTabMini.Q0 = false;
        if (z2) {
            webTabAdapter = dialogTabMini.G(z3);
        } else {
            webTabAdapter = null;
        }
        if (webTabAdapter != null) {
            dialogTabMini.c0.d(true, webTabAdapter.j, webTabAdapter.m, z);
        } else {
            dialogTabMini.c0.d(false, null, 0, z);
        }
    }

    public static void E(DialogTabMini dialogTabMini, int i, boolean z) {
        boolean z2;
        WebTabAdapter webTabAdapter;
        if (dialogTabMini.c0 == null) {
            return;
        }
        boolean z3 = PrefSync.k;
        if (z3) {
            z2 = dialogTabMini.Q0;
        } else {
            z2 = dialogTabMini.P0;
        }
        dialogTabMini.P0 = false;
        dialogTabMini.Q0 = false;
        if (z2) {
            webTabAdapter = dialogTabMini.G(z3);
        } else {
            webTabAdapter = null;
        }
        if (webTabAdapter != null) {
            dialogTabMini.c0.c(true, webTabAdapter.j, i, z);
        } else {
            dialogTabMini.c0.c(false, null, i, z);
        }
    }

    public static void F(DialogTabMini dialogTabMini, WebTabAdapter.WebTabItem webTabItem) {
        boolean z;
        int J;
        if (dialogTabMini.a0 != null && !dialogTabMini.S()) {
            dialogTabMini.L();
            WebTabAdapter G = dialogTabMini.G(dialogTabMini.h0);
            if (G != null) {
                boolean z2 = true;
                if (webTabItem != null) {
                    z = true;
                } else {
                    z = false;
                }
                dialogTabMini.g1 = z;
                if (webTabItem != null) {
                    J = 1;
                } else if (G.u) {
                    J = G.E();
                } else {
                    J = G.J();
                }
                if (J != 0) {
                    if (J != G.J()) {
                        z2 = false;
                    }
                    dialogTabMini.h1 = z2;
                    dialogTabMini.i1 = webTabItem;
                    dialogTabMini.j1 = G;
                    dialogTabMini.k1 = J;
                    if (webTabItem == null) {
                        dialogTabMini.U(false, new DialogTabMain.ReleaseBackListener() { // from class: com.mycompany.app.dialog.DialogTabMini.28
                            @Override // com.mycompany.app.dialog.DialogTabMain.ReleaseBackListener
                            public final void a() {
                                int i = DialogTabMini.H1;
                                DialogTabMini dialogTabMini2 = DialogTabMini.this;
                                WebViewActivity webViewActivity = dialogTabMini2.a0;
                                if (webViewActivity == null) {
                                    return;
                                }
                                DialogDeleteItem dialogDeleteItem = new DialogDeleteItem(webViewActivity, new AnonymousClass29());
                                dialogTabMini2.J0 = dialogDeleteItem;
                                dialogDeleteItem.setOnDismissListener(new AnonymousClass30());
                            }
                        });
                        return;
                    }
                    WebViewActivity webViewActivity = dialogTabMini.a0;
                    if (webViewActivity == null) {
                        return;
                    }
                    DialogDeleteItem dialogDeleteItem = new DialogDeleteItem(webViewActivity, new AnonymousClass29());
                    dialogTabMini.J0 = dialogDeleteItem;
                    dialogDeleteItem.setOnDismissListener(new AnonymousClass30());
                }
            }
        }
    }

    public final WebTabAdapter G(boolean z) {
        if (z) {
            TabGrid tabGrid = this.x0;
            if (tabGrid == null) {
                return null;
            }
            return tabGrid.m;
        }
        TabGrid tabGrid2 = this.w0;
        if (tabGrid2 == null) {
            return null;
        }
        return tabGrid2.m;
    }

    public final TabDragHelper H(boolean z) {
        if (z) {
            TabGrid tabGrid = this.x0;
            if (tabGrid == null) {
                return null;
            }
            return tabGrid.o;
        }
        TabGrid tabGrid2 = this.w0;
        if (tabGrid2 == null) {
            return null;
        }
        return tabGrid2.o;
    }

    public final MyRecyclerView I(boolean z) {
        if (z) {
            TabGrid tabGrid = this.x0;
            if (tabGrid == null) {
                return null;
            }
            return tabGrid.h;
        }
        TabGrid tabGrid2 = this.w0;
        if (tabGrid2 == null) {
            return null;
        }
        return tabGrid2.h;
    }

    public final boolean J(int i, int i2, Intent intent) {
        MyRoundLinear myRoundLinear;
        int i3;
        WebTabAdapter G;
        if (i != 3) {
            return false;
        }
        if (i2 == -1) {
            this.i0 = false;
            if (intent != null && intent.getBooleanExtra("EXTRA_LOAD", false) && (G = G(true)) != null && G.J() != 0) {
                if (PrefSync.m != 0) {
                    PrefSync.m = 0;
                    PrefSync.t(this.b0);
                }
                G.b0(null, null, 0L, 0, 0);
            }
            MyLineText myLineText = this.A0;
            if (myLineText != null) {
                myLineText.setEnabled(true);
                MyLineText myLineText2 = this.A0;
                if (MainApp.K1) {
                    i3 = -328966;
                } else {
                    i3 = -14784824;
                }
                myLineText2.setTextColor(i3);
            }
            Z();
            TabGrid tabGrid = this.x0;
            if (tabGrid != null && (myRoundLinear = tabGrid.k) != null) {
                myRoundLinear.setVisibility(8);
            }
        }
        return true;
    }

    public final void K() {
        DialogDeleteItem dialogDeleteItem = this.K0;
        if (dialogDeleteItem != null) {
            dialogDeleteItem.dismiss();
            this.K0 = null;
        }
    }

    public final void L() {
        DialogDeleteItem dialogDeleteItem = this.J0;
        if (dialogDeleteItem != null) {
            dialogDeleteItem.dismiss();
            this.J0 = null;
        }
    }

    public final void M() {
        DialogTabEdit dialogTabEdit = this.L0;
        if (dialogTabEdit != null) {
            dialogTabEdit.dismiss();
            this.L0 = null;
        }
    }

    public final void N() {
        MyPopupMenu myPopupMenu = this.E0;
        if (myPopupMenu != null) {
            this.Y = null;
            myPopupMenu.a();
            this.E0 = null;
        }
    }

    public final void O() {
        TabSubView tabSubView = this.N0;
        if (tabSubView != null) {
            tabSubView.j();
            this.N0 = null;
        }
        PopupWindow popupWindow = this.O0;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.O0 = null;
        }
        if (this.f0) {
            setCanceledOnTouchOutside(true);
        }
        if (this.R0) {
            this.R0 = false;
            WebTabAdapter G = G(this.h0);
            if (G != null) {
                G.g();
            }
        }
    }

    public final void P() {
        MyPopupMenu myPopupMenu = this.F0;
        if (myPopupMenu != null) {
            this.Y = this.E0;
            myPopupMenu.a();
            this.F0 = null;
        }
    }

    public final boolean Q() {
        if (!this.z1 && !this.A1 && !this.B1 && !this.C1 && !this.D1 && !this.E1 && !this.F1 && !this.G1) {
            return false;
        }
        return true;
    }

    public final boolean R() {
        CoordinatorLayout coordinatorLayout = this.t;
        if (coordinatorLayout == null || this.u0 == null) {
            return false;
        }
        float x = this.V0 - coordinatorLayout.getX();
        if (x >= this.U0 && x <= this.u0.getWidth() - r0) {
            return false;
        }
        return true;
    }

    public final boolean S() {
        if (this.I0 != null || this.J0 != null || this.K0 != null || this.L0 != null || this.M0 != null || this.N0 != null) {
            return true;
        }
        return false;
    }

    public final void T() {
        int i;
        O();
        X();
        U(false, null);
        boolean z = this.b1;
        boolean z2 = MainApp.K1;
        if (z != z2) {
            this.b1 = z2;
            MyDialogMenu myDialogMenu = this.k0;
            if (myDialogMenu != null) {
                int i2 = -328966;
                if (z2) {
                    myDialogMenu.setBackColor(-16777216);
                    this.m0.setTextColor(-328966);
                    this.l0.setImageResource(R.drawable.outline_more_vert_dark_20);
                    this.n0.p(R.drawable.baseline_check_circle_dark_24, R.drawable.outline_radio_button_unchecked_dark_24);
                    this.q0.setImageResource(R.drawable.outline_mood_dark_20);
                    this.s0.setImageResource(R.drawable.outline_secret_mode_dark_20);
                    this.t0.setSelectedTabIndicatorColor(-5197648);
                    this.z0.setBackgroundColor(-16777216);
                    this.A0.setBackgroundResource(R.drawable.selector_normal_dark);
                    this.B0.setBackgroundResource(R.drawable.selector_normal_dark);
                    this.p0.setBgPreColor(-12632257);
                    this.r0.setBgPreColor(-12632257);
                    this.n0.setBgPreColor(-12632257);
                    this.l0.setBgPreColor(-12632257);
                } else {
                    myDialogMenu.setBackColor(-460552);
                    this.m0.setTextColor(-16777216);
                    this.l0.setImageResource(R.drawable.outline_more_vert_black_20);
                    this.n0.p(R.drawable.baseline_check_circle_black_24, R.drawable.outline_radio_button_unchecked_black_24);
                    this.q0.setImageResource(R.drawable.outline_mood_black_20);
                    this.s0.setImageResource(R.drawable.outline_secret_mode_black_20);
                    this.t0.setSelectedTabIndicatorColor(-5854742);
                    this.z0.setBackgroundColor(-460552);
                    this.A0.setBackgroundResource(R.drawable.selector_normal_gray);
                    this.B0.setBackgroundResource(R.drawable.selector_normal_gray);
                    this.p0.setBgPreColor(553648128);
                    this.r0.setBgPreColor(553648128);
                    this.n0.setBgPreColor(553648128);
                    this.l0.setBgPreColor(553648128);
                }
                Z();
                MyLineText myLineText = this.A0;
                if (myLineText != null) {
                    if (myLineText.isEnabled()) {
                        MyLineText myLineText2 = this.A0;
                        if (!MainApp.K1) {
                            i2 = -14784824;
                        }
                        myLineText2.setTextColor(i2);
                    } else {
                        MyLineText myLineText3 = this.A0;
                        if (MainApp.K1) {
                            i = -8355712;
                        } else {
                            i = -2434342;
                        }
                        myLineText3.setTextColor(i);
                    }
                }
                TabGrid tabGrid = this.w0;
                if (tabGrid != null) {
                    tabGrid.e();
                    WebTabAdapter webTabAdapter = this.w0.m;
                    if (webTabAdapter != null) {
                        webTabAdapter.g();
                    }
                }
                TabGrid tabGrid2 = this.x0;
                if (tabGrid2 != null) {
                    tabGrid2.e();
                    WebTabAdapter webTabAdapter2 = this.x0.m;
                    if (webTabAdapter2 != null) {
                        webTabAdapter2.g();
                    }
                }
            }
            DialogTabFind dialogTabFind = this.c1;
            if (dialogTabFind != null) {
                dialogTabFind.a();
            }
        }
    }

    public final void U(boolean z, DialogTabMain.ReleaseBackListener releaseBackListener) {
        if (this.E1) {
            return;
        }
        this.E1 = true;
        this.e1 = z;
        this.f1 = releaseBackListener;
        s(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.19
            @Override // java.lang.Runnable
            public final void run() {
                DialogTabMini dialogTabMini = DialogTabMini.this;
                TabGrid tabGrid = dialogTabMini.w0;
                if (tabGrid != null) {
                    tabGrid.a();
                }
                TabGrid tabGrid2 = dialogTabMini.x0;
                if (tabGrid2 != null) {
                    tabGrid2.a();
                }
                Handler handler = dialogTabMini.i;
                if (handler == null) {
                    return;
                }
                handler.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.19.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogTabMini dialogTabMini2 = DialogTabMini.this;
                        boolean z2 = dialogTabMini2.e1;
                        MySnackbar mySnackbar = dialogTabMini2.a1;
                        if (mySnackbar != null) {
                            mySnackbar.i(z2);
                            dialogTabMini2.a1 = null;
                        }
                        DialogTabMain.ReleaseBackListener releaseBackListener2 = dialogTabMini2.f1;
                        if (releaseBackListener2 != null) {
                            releaseBackListener2.a();
                            dialogTabMini2.f1 = null;
                        }
                        dialogTabMini2.E1 = false;
                    }
                });
            }
        });
    }

    public final void V() {
        DialogTabFind dialogTabFind = this.c1;
        if (dialogTabFind != null) {
            dialogTabFind.b();
            this.c1 = null;
        }
    }

    public final void W() {
        int i;
        int i2;
        MyLineText myLineText = this.A0;
        if (myLineText == null) {
            return;
        }
        if (this.h0 && this.i0) {
            myLineText.setEnabled(false);
            MyLineText myLineText2 = this.A0;
            if (MainApp.K1) {
                i2 = -8355712;
            } else {
                i2 = -2434342;
            }
            myLineText2.setTextColor(i2);
        } else {
            myLineText.setEnabled(true);
            MyLineText myLineText3 = this.A0;
            if (MainApp.K1) {
                i = -328966;
            } else {
                i = -14784824;
            }
            myLineText3.setTextColor(i);
        }
        if (this.h0) {
            this.A0.setText(R.string.secret_tab);
        } else {
            this.A0.setText(R.string.new_url);
        }
    }

    public final void X() {
        MyDialogMenu myDialogMenu = this.k0;
        if (myDialogMenu != null && this.c0 != null) {
            if (PrefZone.C == 0) {
                this.C0 = 0;
                this.D0 = 0;
                return;
            }
            int width = myDialogMenu.getWidth();
            if (width != 0 || (width = this.c0.b()) != 0) {
                int i = width - (MainApp.q1 * 2);
                this.C0 = 1;
                this.D0 = Math.round(i * 1.3f);
                TabGrid tabGrid = this.x0;
                if (tabGrid != null) {
                    tabGrid.f();
                }
                TabGrid tabGrid2 = this.w0;
                if (tabGrid2 != null) {
                    tabGrid2.f();
                }
            }
        }
    }

    public final void Y(boolean z, boolean z2) {
        ImageView imageView = this.q0;
        if (imageView != null) {
            if (!z2 && this.h0 == z) {
                return;
            }
            this.h0 = z;
            if (z) {
                imageView.setAlpha(0.4f);
                this.s0.setAlpha(1.0f);
            } else {
                imageView.setAlpha(1.0f);
                this.s0.setAlpha(0.4f);
            }
            if (PrefZone.C != 0) {
                MyRecyclerView I = I(true);
                MyRecyclerView I2 = I(false);
                if (this.h0) {
                    if (I != null) {
                        I.setTag(null);
                        A(I);
                    }
                    if (I2 != null) {
                        I2.setTag("skip_scroll");
                    }
                } else {
                    if (I != null) {
                        I.setTag("skip_scroll");
                    }
                    if (I2 != null) {
                        I2.setTag(null);
                        A(I2);
                    }
                }
            }
            W();
            Z();
            U(true, null);
        }
    }

    public final void Z() {
        WebTabAdapter webTabAdapter;
        WebTabAdapter webTabAdapter2;
        if (this.B0 != null) {
            TabGrid tabGrid = this.w0;
            if (tabGrid != null && (webTabAdapter2 = tabGrid.m) != null && tabGrid.i != null) {
                if (webTabAdapter2.J() > 0) {
                    tabGrid.i.setVisibility(8);
                } else {
                    tabGrid.i.setVisibility(0);
                }
            }
            TabGrid tabGrid2 = this.x0;
            if (tabGrid2 != null && (webTabAdapter = tabGrid2.m) != null && tabGrid2.i != null) {
                if (webTabAdapter.J() > 0) {
                    tabGrid2.i.setVisibility(8);
                } else {
                    tabGrid2.i.setVisibility(0);
                }
            }
            MyScrollBar myScrollBar = this.y0;
            if (myScrollBar != null) {
                myScrollBar.a0 = true;
                myScrollBar.d(false);
            }
            boolean z = this.h0;
            int i = -2434342;
            if (z && this.i0) {
                this.B0.setEnabled(false);
                AppCompatTextView appCompatTextView = this.B0;
                if (MainApp.K1) {
                    i = -8355712;
                }
                appCompatTextView.setTextColor(i);
                return;
            }
            WebTabAdapter G = G(z);
            if (G == null) {
                return;
            }
            int i2 = -14784824;
            if (G.u) {
                if (G.E() > 0) {
                    this.B0.setEnabled(true);
                    AppCompatTextView appCompatTextView2 = this.B0;
                    if (MainApp.K1) {
                        i2 = -328966;
                    }
                    appCompatTextView2.setTextColor(i2);
                    MyLineText copyUrl = this.A0;
                    if (copyUrl != null) {
                        copyUrl.setEnabled(true);
                        copyUrl.setTextColor(i2);
                    }
                    return;
                }
                this.B0.setEnabled(false);
                AppCompatTextView appCompatTextView3 = this.B0;
                if (MainApp.K1) {
                    i = -8355712;
                }
                appCompatTextView3.setTextColor(i);
                MyLineText copyUrl2 = this.A0;
                if (copyUrl2 != null) {
                    copyUrl2.setEnabled(false);
                    copyUrl2.setTextColor(i);
                }
                return;
            }
            if (G.J() > 0) {
                this.B0.setEnabled(true);
                AppCompatTextView appCompatTextView4 = this.B0;
                if (MainApp.K1) {
                    i2 = -328966;
                }
                appCompatTextView4.setTextColor(i2);
                return;
            }
            this.B0.setEnabled(false);
            AppCompatTextView appCompatTextView5 = this.B0;
            if (MainApp.K1) {
                i = -8355712;
            }
            appCompatTextView5.setTextColor(i);
        }
    }

    public final void a0(int i, boolean z, boolean z2) {
        WebTabAdapter G = G(z2);
        if (G != null && z != G.u) {
            TabDragHelper H = H(z2);
            if (H != null) {
                H.h = !z;
            }
            G.Y(i, z);
            ViewPager2 viewPager2 = this.u0;
            if (viewPager2 != null) {
                viewPager2.setUserInputEnabled(!z);
            }
            Z();
            if (z) {
                this.A0.setText(R.string.copy_url);
                this.B0.setText(R.string.delete);
                AppCompatTextView appCompatTextView = this.m0;
                if (appCompatTextView != null) {
                    appCompatTextView.setText(MainUtil.h3(G.E(), G.J()));
                }
                MyButtonCheck myButtonCheck = this.n0;
                if (myButtonCheck != null) {
                    myButtonCheck.q(G.N(), true);
                }
                LinearLayout linearLayout = this.o0;
                if (linearLayout != null) {
                    MainUtil.h8(this.b0, linearLayout, R.anim.ic_scale_out, true);
                }
                MyButtonImage myButtonImage = this.l0;
                if (myButtonImage != null) {
                    MainUtil.h8(this.b0, myButtonImage, R.anim.ic_rotate_out, true);
                }
                AppCompatTextView appCompatTextView2 = this.m0;
                if (appCompatTextView2 != null) {
                    MainUtil.h8(this.b0, appCompatTextView2, R.anim.ic_scale_in, false);
                }
                MyButtonCheck myButtonCheck2 = this.n0;
                if (myButtonCheck2 != null) {
                    MainUtil.h8(this.b0, myButtonCheck2, R.anim.ic_rotate_in, false);
                }
                TabLayout tabLayout = this.t0;
                if (tabLayout != null) {
                    tabLayout.setVisibility(8);
                    return;
                }
                return;
            }
            this.A0.setVisibility(0);
            W();
            this.B0.setText(R.string.delete_all);
            LinearLayout linearLayout2 = this.o0;
            if (linearLayout2 != null) {
                MainUtil.h8(this.b0, linearLayout2, R.anim.ic_scale_in, false);
            }
            MyButtonImage myButtonImage2 = this.l0;
            if (myButtonImage2 != null) {
                MainUtil.h8(this.b0, myButtonImage2, R.anim.ic_rotate_in, false);
            }
            AppCompatTextView appCompatTextView3 = this.m0;
            if (appCompatTextView3 != null) {
                MainUtil.h8(this.b0, appCompatTextView3, R.anim.ic_scale_out, true);
            }
            MyButtonCheck myButtonCheck3 = this.n0;
            if (myButtonCheck3 != null) {
                MainUtil.h8(this.b0, myButtonCheck3, R.anim.ic_rotate_out, true);
            }
            TabLayout tabLayout2 = this.t0;
            if (tabLayout2 != null) {
                tabLayout2.setVisibility(0);
            }
        }
    }

    public final void b0() {
        if (this.h0) {
            this.Q0 = true;
        } else {
            this.P0 = true;
        }
    }

    public final void c0() {
        Handler handler;
        if (this.j0 || (handler = this.i) == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.17
            @Override // java.lang.Runnable
            public final void run() {
                boolean z = PrefSync.k;
                int i = DialogTabMini.H1;
                WebTabAdapter G = DialogTabMini.this.G(z);
                if (G == null) {
                    return;
                }
                G.B();
            }
        });
    }

    @Override // com.mycompany.app.view.MyDialogBottom, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        this.f18633c = false;
        if (this.b0 == null || this.d1) {
            return;
        }
        this.d1 = true;
        s(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.11
            @Override // java.lang.Runnable
            public final void run() {
                DialogTabMini dialogTabMini = DialogTabMini.this;
                TabGrid tabGrid = dialogTabMini.w0;
                if (tabGrid != null) {
                    tabGrid.a();
                }
                TabGrid tabGrid2 = dialogTabMini.x0;
                if (tabGrid2 != null) {
                    tabGrid2.a();
                }
                Handler handler = dialogTabMini.i;
                if (handler == null) {
                    return;
                }
                handler.post(new Runnable() { // from class: com.mycompany.app.dialog.DialogTabMini.11.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        DialogTabMini.B(DialogTabMini.this);
                    }
                });
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (r0 != 3) goto L69;
     */
    @Override // com.mycompany.app.view.MyDialogBottom, android.app.Dialog, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mycompany.app.dialog.DialogTabMini.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.mycompany.app.view.MyDialogBottom, android.app.Dialog
    public final void onBackPressed() {
        if (e()) {
            return;
        }
        r();
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        if (this.N0 != null && this.f0 && ((actionMasked = motionEvent.getActionMasked()) == 1 || actionMasked == 3)) {
            this.N0.g();
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.mycompany.app.view.MyDialogBottom
    public final void r() {
        if (Q()) {
            if (this.y1 == 0) {
                this.y1 = System.currentTimeMillis();
                return;
            }
            if (System.currentTimeMillis() - this.y1 > 500) {
                this.y1 = 0L;
                this.z1 = false;
                this.A1 = false;
                this.B1 = false;
                this.C1 = false;
                this.D1 = false;
                this.E1 = false;
                this.F1 = false;
                this.G1 = false;
                return;
            }
            return;
        }
        this.y1 = 0L;
        TabSubView tabSubView = this.N0;
        if (tabSubView != null) {
            WebTabAdapter webTabAdapter = tabSubView.D;
            if (webTabAdapter != null && webTabAdapter.u) {
                tabSubView.m(-1, false);
                return;
            } else {
                tabSubView.g();
                return;
            }
        }
        DialogTabFind dialogTabFind = this.c1;
        if (dialogTabFind != null) {
            MainListView mainListView = dialogTabFind.f;
            if (mainListView != null && mainListView.V()) {
                return;
            }
            V();
            return;
        }
        WebTabAdapter G = G(this.h0);
        if (G != null && G.u) {
            a0(-1, false, this.h0);
        } else {
            dismiss();
        }
    }
}
