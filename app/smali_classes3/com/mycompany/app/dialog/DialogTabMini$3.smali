.class Lcom/mycompany/app/dialog/DialogTabMini$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/mycompany/app/dialog/DialogTabMini;


# direct methods
.method public constructor <init>(Lcom/mycompany/app/dialog/DialogTabMini;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/mycompany/app/dialog/DialogTabMini$3;->c:Lcom/mycompany/app/dialog/DialogTabMini;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/mycompany/app/dialog/DialogTabMini$3;->c:Lcom/mycompany/app/dialog/DialogTabMini;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/mycompany/app/dialog/DialogTabMini;->l0:Lcom/mycompany/app/view/MyButtonImage;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v2}, Lcom/mycompany/app/view/MyButtonImage;->setNoti(Z)V

    .line 10
    .line 11
    .line 12
    iget-boolean v1, v0, Lcom/mycompany/app/dialog/DialogTabMini;->h0:Z

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/mycompany/app/dialog/DialogTabMini;->G(Z)Lcom/mycompany/app/web/WebTabAdapter;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-boolean v1, v1, Lcom/mycompany/app/web/WebTabAdapter;->u:Z

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_2
    iget-object v1, v0, Lcom/mycompany/app/dialog/DialogTabMini;->E0:Lcom/mycompany/app/view/MyPopupMenu;

    .line 27
    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    invoke-virtual {v0}, Lcom/mycompany/app/dialog/DialogTabMini;->N()V

    .line 32
    .line 33
    .line 34
    if-nez p1, :cond_4

    .line 35
    .line 36
    :goto_0
    return-void

    .line 37
    :cond_4
    new-instance v7, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance v1, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;

    .line 43
    .line 44
    sget v3, Lnet/kaki87/soul2/testing/R$string;->type:I

    .line 45
    .line 46
    invoke-direct {v1, v2, v3}, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;-><init>(II)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    new-instance v1, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;

    .line 53
    .line 54
    sget v3, Lnet/kaki87/soul2/testing/R$string;->outline_color:I

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    invoke-direct {v1, v4, v3}, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;-><init>(II)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    new-instance v1, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;

    .line 64
    .line 65
    sget v3, Lnet/kaki87/soul2/testing/R$string;->mini_mode:I

    .line 66
    .line 67
    sget-boolean v4, Lcom/mycompany/app/pref/PrefZone;->D:Z

    .line 68
    .line 69
    const/4 v5, 0x2

    .line 70
    invoke-direct {v1, v5, v3, v2, v4}, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;-><init>(IIIZ)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    new-instance v1, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;

    .line 77
    .line 78
    sget v3, Lnet/kaki87/soul2/testing/R$string;->at_bottom:I

    .line 79
    .line 80
    sget-boolean v4, Lcom/mycompany/app/pref/PrefZtwo;->z:Z

    .line 81
    .line 82
    const/4 v5, 0x3

    .line 83
    invoke-direct {v1, v5, v3, v2, v4}, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;-><init>(IIIZ)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    new-instance v1, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;

    .line 90
    .line 91
    sget v3, Lnet/kaki87/soul2/testing/R$string;->swipe_delete:I

    .line 92
    .line 93
    sget-boolean v4, Lcom/mycompany/app/pref/PrefZone;->E:Z

    .line 94
    .line 95
    const/4 v5, 0x4

    .line 96
    invoke-direct {v1, v5, v3, v2, v4}, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;-><init>(IIIZ)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    new-instance v1, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;

    .line 103
    .line 104
    const/4 v2, 0x5

    .line 105
    sget v3, Lnet/kaki87/soul2/testing/R$string;->undelete:I

    .line 106
    .line 107
    invoke-direct {v1, v2, v3}, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;-><init>(II)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    new-instance v1, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;

    .line 114
    .line 115
    const/4 v2, 0x6

    .line 116
    sget v3, Lnet/kaki87/soul2/testing/R$string;->search_url:I

    .line 117
    .line 118
    invoke-direct {v1, v2, v3}, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;-><init>(II)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;

    const/4 v2, 0x7

    sget v3, Lnet/kaki87/soul2/testing/R$string;->select_all:I

    invoke-direct {v1, v2, v3}, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;-><init>(II)V

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;

    const/4 v2, 0x8

    sget v3, Lnet/kaki87/soul2/testing/R$string;->delete_all:I

    invoke-direct {v1, v2, v3}, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;-><init>(II)V

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    new-instance v3, Lcom/mycompany/app/view/MyPopupMenu;

    .line 125
    .line 126
    iget-object v4, v0, Lcom/mycompany/app/dialog/DialogTabMini;->a0:Lcom/mycompany/app/web/WebViewActivity;

    .line 127
    .line 128
    iget-object v5, v0, Lcom/mycompany/app/dialog/DialogTabMini;->k0:Lcom/mycompany/app/view/MyDialogMenu;

    .line 129
    .line 130
    sget-boolean v8, Lcom/mycompany/app/main/MainApp;->K1:Z

    .line 131
    .line 132
    new-instance v9, Lcom/mycompany/app/dialog/DialogTabMini$20;

    .line 133
    .line 134
    invoke-direct {v9, v0}, Lcom/mycompany/app/dialog/DialogTabMini$20;-><init>(Lcom/mycompany/app/dialog/DialogTabMini;)V

    .line 135
    .line 136
    .line 137
    move-object v6, p1

    .line 138
    invoke-direct/range {v3 .. v9}, Lcom/mycompany/app/view/MyPopupMenu;-><init>(Lcom/mycompany/app/main/MainActivity;Landroid/view/View;Landroid/view/View;Ljava/util/ArrayList;ZLcom/mycompany/app/view/MyPopupMenu$MyPopupListener;)V

    .line 139
    .line 140
    .line 141
    iput-object v3, v0, Lcom/mycompany/app/dialog/DialogTabMini;->E0:Lcom/mycompany/app/view/MyPopupMenu;

    .line 142
    .line 143
    iput-object v3, v0, Lcom/mycompany/app/view/MyDialogBottom;->Y:Lcom/mycompany/app/view/MyPopupWrap;

    .line 144
    .line 145
    return-void
.end method
