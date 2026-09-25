.class Lcom/mycompany/app/dialog/DialogTabMini$20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mycompany/app/view/MyPopupMenu$MyPopupListener;


# instance fields
.field public final synthetic a:Lcom/mycompany/app/dialog/DialogTabMini;


# direct methods
.method public constructor <init>(Lcom/mycompany/app/dialog/DialogTabMini;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/mycompany/app/dialog/DialogTabMini$20;->a:Lcom/mycompany/app/dialog/DialogTabMini;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    sget v0, Lcom/mycompany/app/dialog/DialogTabMini;->H1:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/mycompany/app/dialog/DialogTabMini$20;->a:Lcom/mycompany/app/dialog/DialogTabMini;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/mycompany/app/dialog/DialogTabMini;->N()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b(Landroid/view/View;I)Z
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0xf

    .line 3
    .line 4
    iget-object v2, p0, Lcom/mycompany/app/dialog/DialogTabMini$20;->a:Lcom/mycompany/app/dialog/DialogTabMini;

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :pswitch_0
    iget-object p1, v2, Lcom/mycompany/app/dialog/DialogTabMini;->c1:Lcom/mycompany/app/dialog/DialogTabFind;

    .line 13
    .line 14
    if-nez p1, :cond_6

    .line 15
    .line 16
    iget-object v7, v2, Lcom/mycompany/app/view/MyDialogBottom;->t:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 17
    .line 18
    if-nez v7, :cond_0

    .line 19
    .line 20
    goto/16 :goto_0

    .line 21
    .line 22
    :cond_0
    new-instance v4, Lcom/mycompany/app/dialog/DialogTabFind;

    .line 23
    .line 24
    iget-object v5, v2, Lcom/mycompany/app/dialog/DialogTabMini;->a0:Lcom/mycompany/app/web/WebViewActivity;

    .line 25
    .line 26
    iget-object v6, v2, Lcom/mycompany/app/dialog/DialogTabMini;->b0:Landroid/content/Context;

    .line 27
    .line 28
    iget-boolean v8, v2, Lcom/mycompany/app/dialog/DialogTabMini;->h0:Z

    .line 29
    .line 30
    new-instance v10, Lcom/mycompany/app/dialog/DialogTabMini$42;

    .line 31
    .line 32
    invoke-direct {v10, v2}, Lcom/mycompany/app/dialog/DialogTabMini$42;-><init>(Lcom/mycompany/app/dialog/DialogTabMini;)V

    .line 33
    .line 34
    .line 35
    const/4 v9, 0x1

    .line 36
    invoke-direct/range {v4 .. v10}, Lcom/mycompany/app/dialog/DialogTabFind;-><init>(Lcom/mycompany/app/web/WebViewActivity;Landroid/content/Context;Landroid/view/ViewGroup;ZZLcom/mycompany/app/dialog/DialogTabFind$TabFindListener;)V

    .line 37
    .line 38
    .line 39
    iput-object v4, v2, Lcom/mycompany/app/dialog/DialogTabMini;->c1:Lcom/mycompany/app/dialog/DialogTabFind;

    .line 40
    .line 41
    iput-object v2, v4, Lcom/mycompany/app/dialog/DialogTabFind;->j:Lcom/mycompany/app/view/MyDialogBottom;

    .line 42
    .line 43
    return v3

    .line 44
    :pswitch_1
    iget-object p1, v2, Lcom/mycompany/app/dialog/DialogTabMini;->a0:Lcom/mycompany/app/web/WebViewActivity;

    .line 45
    .line 46
    if-nez p1, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-virtual {v2}, Lcom/mycompany/app/dialog/DialogTabMini;->S()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget-object p1, v2, Lcom/mycompany/app/dialog/DialogTabMini;->I0:Lcom/mycompany/app/dialog/DialogSetTabRestore;

    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/mycompany/app/dialog/DialogSetTabRestore;->dismiss()V

    .line 61
    .line 62
    .line 63
    iput-object v0, v2, Lcom/mycompany/app/dialog/DialogTabMini;->I0:Lcom/mycompany/app/dialog/DialogSetTabRestore;

    .line 64
    .line 65
    :cond_3
    new-instance p1, Lcom/mycompany/app/dialog/DialogSetTabRestore;

    .line 66
    .line 67
    iget-object p2, v2, Lcom/mycompany/app/dialog/DialogTabMini;->a0:Lcom/mycompany/app/web/WebViewActivity;

    .line 68
    .line 69
    invoke-direct {p1, p2, v0}, Lcom/mycompany/app/dialog/DialogSetTabRestore;-><init>(Landroid/app/Activity;Lcom/mycompany/app/dialog/DialogSetFull$DialogApplyListener;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, v2, Lcom/mycompany/app/dialog/DialogTabMini;->I0:Lcom/mycompany/app/dialog/DialogSetTabRestore;

    .line 73
    .line 74
    new-instance p2, Lcom/mycompany/app/dialog/DialogTabMini$27;

    .line 75
    .line 76
    invoke-direct {p2, v2}, Lcom/mycompany/app/dialog/DialogTabMini$27;-><init>(Lcom/mycompany/app/dialog/DialogTabMini;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, p2}, Lcom/mycompany/app/view/MyDialogBottom;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 80
    .line 81
    .line 82
    return v3

    .line 83
    :pswitch_2
    sget-boolean p1, Lcom/mycompany/app/pref/PrefZone;->E:Z

    .line 84
    .line 85
    xor-int/2addr p1, v3

    .line 86
    sput-boolean p1, Lcom/mycompany/app/pref/PrefZone;->E:Z

    .line 87
    .line 88
    iget-object p2, v2, Lcom/mycompany/app/dialog/DialogTabMini;->b0:Landroid/content/Context;

    .line 89
    .line 90
    const-string v0, "mSwipeDelete"

    .line 91
    .line 92
    invoke-static {v1, p2, v0, p1}, Lcom/mycompany/app/pref/PrefSet;->d(ILandroid/content/Context;Ljava/lang/String;Z)V

    .line 93
    .line 94
    .line 95
    return v3

    .line 96
    :pswitch_3
    sget-boolean p1, Lcom/mycompany/app/pref/PrefZtwo;->z:Z

    .line 97
    .line 98
    xor-int/2addr p1, v3

    .line 99
    sput-boolean p1, Lcom/mycompany/app/pref/PrefZtwo;->z:Z

    .line 100
    .line 101
    iget-object p2, v2, Lcom/mycompany/app/dialog/DialogTabMini;->b0:Landroid/content/Context;

    .line 102
    .line 103
    const/16 v0, 0x10

    .line 104
    .line 105
    const-string v1, "mTabDown2"

    .line 106
    .line 107
    invoke-static {v0, p2, v1, p1}, Lcom/mycompany/app/pref/PrefSet;->d(ILandroid/content/Context;Ljava/lang/String;Z)V

    .line 108
    .line 109
    .line 110
    iget-object p1, v2, Lcom/mycompany/app/dialog/DialogTabMini;->w0:Lcom/mycompany/app/dialog/DialogTabMini$TabGrid;

    .line 111
    .line 112
    if-eqz p1, :cond_4

    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/mycompany/app/dialog/DialogTabMini$TabGrid;->f()V

    .line 115
    .line 116
    .line 117
    :cond_4
    iget-object p1, v2, Lcom/mycompany/app/dialog/DialogTabMini;->x0:Lcom/mycompany/app/dialog/DialogTabMini$TabGrid;

    .line 118
    .line 119
    if-eqz p1, :cond_6

    .line 120
    .line 121
    invoke-virtual {p1}, Lcom/mycompany/app/dialog/DialogTabMini$TabGrid;->f()V

    .line 122
    .line 123
    .line 124
    return v3

    .line 125
    :pswitch_4
    sget-boolean p1, Lcom/mycompany/app/pref/PrefZone;->D:Z

    .line 126
    .line 127
    xor-int/2addr p1, v3

    .line 128
    sput-boolean p1, Lcom/mycompany/app/pref/PrefZone;->D:Z

    .line 129
    .line 130
    iget-object p2, v2, Lcom/mycompany/app/dialog/DialogTabMini;->b0:Landroid/content/Context;

    .line 131
    .line 132
    const-string v0, "mTabMiniMode"

    .line 133
    .line 134
    invoke-static {v1, p2, v0, p1}, Lcom/mycompany/app/pref/PrefSet;->d(ILandroid/content/Context;Ljava/lang/String;Z)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Lcom/mycompany/app/dialog/DialogTabMini;->dismiss()V

    .line 138
    .line 139
    .line 140
    return v3

    .line 141
    :pswitch_5
    iget-object p1, v2, Lcom/mycompany/app/dialog/DialogTabMini;->a0:Lcom/mycompany/app/web/WebViewActivity;

    .line 142
    .line 143
    if-nez p1, :cond_5

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_5
    invoke-virtual {v2}, Lcom/mycompany/app/dialog/DialogTabMini;->S()Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-eqz p1, :cond_7

    .line 151
    .line 152
    :cond_6
    :goto_0
    return v3

    .line 153
    :cond_7
    iget-object p1, v2, Lcom/mycompany/app/dialog/DialogTabMini;->M0:Lcom/mycompany/app/dialog/DialogEditIcon;

    .line 154
    .line 155
    if-eqz p1, :cond_8

    .line 156
    .line 157
    invoke-virtual {p1}, Lcom/mycompany/app/dialog/DialogEditIcon;->dismiss()V

    .line 158
    .line 159
    .line 160
    iput-object v0, v2, Lcom/mycompany/app/dialog/DialogTabMini;->M0:Lcom/mycompany/app/dialog/DialogEditIcon;

    .line 161
    .line 162
    :cond_8
    new-instance p1, Lcom/mycompany/app/dialog/DialogEditIcon;

    .line 163
    .line 164
    iget-object p2, v2, Lcom/mycompany/app/dialog/DialogTabMini;->a0:Lcom/mycompany/app/web/WebViewActivity;

    .line 165
    .line 166
    new-instance v0, Lcom/mycompany/app/dialog/DialogTabMini$37;

    .line 167
    .line 168
    invoke-direct {v0, v2}, Lcom/mycompany/app/dialog/DialogTabMini$37;-><init>(Lcom/mycompany/app/dialog/DialogTabMini;)V

    .line 169
    .line 170
    .line 171
    const/4 v1, 0x6

    .line 172
    invoke-direct {p1, p2, v1, v0}, Lcom/mycompany/app/dialog/DialogEditIcon;-><init>(Lcom/mycompany/app/main/MainActivity;ILcom/mycompany/app/dialog/DialogEditorText$EditorSetListener;)V

    .line 173
    .line 174
    .line 175
    iput-object p1, v2, Lcom/mycompany/app/dialog/DialogTabMini;->M0:Lcom/mycompany/app/dialog/DialogEditIcon;

    .line 176
    .line 177
    new-instance p2, Lcom/mycompany/app/dialog/DialogTabMini$38;

    .line 178
    .line 179
    invoke-direct {p2, v2}, Lcom/mycompany/app/dialog/DialogTabMini$38;-><init>(Lcom/mycompany/app/dialog/DialogTabMini;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, p2}, Lcom/mycompany/app/view/MyDialogBottom;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 183
    .line 184
    .line 185
    return v3

    .line 186
    :pswitch_6
    iget-object p2, v2, Lcom/mycompany/app/dialog/DialogTabMini;->F0:Lcom/mycompany/app/view/MyPopupMenu;

    .line 187
    .line 188
    const/4 v0, 0x0

    .line 189
    if-eqz p2, :cond_9

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_9
    invoke-virtual {v2}, Lcom/mycompany/app/dialog/DialogTabMini;->P()V

    .line 193
    .line 194
    .line 195
    if-nez p1, :cond_a

    .line 196
    .line 197
    :goto_1
    return v0

    .line 198
    :cond_a
    new-instance v8, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 201
    .line 202
    .line 203
    sget-object p2, Lcom/mycompany/app/dialog/DialogTabMain;->l1:[I

    .line 204
    .line 205
    move p2, v0

    .line 206
    :goto_2
    const/4 v1, 0x3

    .line 207
    if-ge p2, v1, :cond_c

    .line 208
    .line 209
    sget-object v1, Lcom/mycompany/app/dialog/DialogTabMain;->l1:[I

    .line 210
    .line 211
    aget v1, v1, p2

    .line 212
    .line 213
    new-instance v4, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;

    .line 214
    .line 215
    sget-object v5, Lcom/mycompany/app/dialog/DialogTabMain;->m1:[I

    .line 216
    .line 217
    aget v5, v5, v1

    .line 218
    .line 219
    sget v6, Lcom/mycompany/app/pref/PrefZone;->C:I

    .line 220
    .line 221
    if-ne v6, v1, :cond_b

    .line 222
    .line 223
    move v1, v3

    .line 224
    goto :goto_3

    .line 225
    :cond_b
    move v1, v0

    .line 226
    :goto_3
    invoke-direct {v4, p2, v5, v1}, Lcom/mycompany/app/view/MyPopupAdapter$PopMenuItem;-><init>(IIZ)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    add-int/lit8 p2, p2, 0x1

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_c
    new-instance v4, Lcom/mycompany/app/view/MyPopupMenu;

    .line 236
    .line 237
    iget-object v5, v2, Lcom/mycompany/app/dialog/DialogTabMini;->a0:Lcom/mycompany/app/web/WebViewActivity;

    .line 238
    .line 239
    iget-object v6, v2, Lcom/mycompany/app/dialog/DialogTabMini;->k0:Lcom/mycompany/app/view/MyDialogMenu;

    .line 240
    .line 241
    sget-boolean v9, Lcom/mycompany/app/main/MainApp;->K1:Z

    .line 242
    .line 243
    new-instance v10, Lcom/mycompany/app/dialog/DialogTabMini$21;

    .line 244
    .line 245
    invoke-direct {v10, v2}, Lcom/mycompany/app/dialog/DialogTabMini$21;-><init>(Lcom/mycompany/app/dialog/DialogTabMini;)V

    .line 246
    .line 247
    .line 248
    move-object v7, p1

    .line 249
    invoke-direct/range {v4 .. v10}, Lcom/mycompany/app/view/MyPopupMenu;-><init>(Lcom/mycompany/app/main/MainActivity;Landroid/view/View;Landroid/view/View;Ljava/util/ArrayList;ZLcom/mycompany/app/view/MyPopupMenu$MyPopupListener;)V

    .line 250
    .line 251
    .line 252
    iput-object v4, v2, Lcom/mycompany/app/dialog/DialogTabMini;->F0:Lcom/mycompany/app/view/MyPopupMenu;

    .line 253
    .line 254
    iput v3, v4, Lcom/mycompany/app/view/MyPopupMenu;->m:I

    .line 255
    .line 256
    iput-object v4, v2, Lcom/mycompany/app/view/MyDialogBottom;->Y:Lcom/mycompany/app/view/MyPopupWrap;

    .line 257
    .line 258
    return v0

    :pswitch_7
    iget-boolean v4, v2, Lcom/mycompany/app/dialog/DialogTabMini;->h0:Z

    invoke-virtual {v2, v4}, Lcom/mycompany/app/dialog/DialogTabMini;->G(Z)Lcom/mycompany/app/web/WebTabAdapter;

    move-result-object v4

    if-eqz v4, :cond_d

    iget-boolean v5, v4, Lcom/mycompany/app/web/WebTabAdapter;->u:Z

    if-nez v5, :cond_d

    const/4 v5, 0x0

    invoke-virtual {v4, v5, v3}, Lcom/mycompany/app/web/WebTabAdapter;->Y(IZ)V

    invoke-virtual {v2}, Lcom/mycompany/app/dialog/DialogTabMini;->Z()V

    :cond_d
    return v3

    :pswitch_8
    const/4 v4, 0x0

    invoke-static {v2, v4}, Lcom/mycompany/app/dialog/DialogTabMini;->F(Lcom/mycompany/app/dialog/DialogTabMini;Lcom/mycompany/app/web/WebTabAdapter$WebTabItem;)V

    return v3

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_7
        :pswitch_8
    .end packed-switch
.end method
