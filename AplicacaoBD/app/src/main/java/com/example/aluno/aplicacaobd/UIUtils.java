package com.example.aluno.aplicacaobd;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.View;

/**
 * Created by aluno on 09/02/19.
 */

public class UIUtils {

    public static void showAlertBuilder(Context activity, @Nullable View view, CharSequence titleMessage,
                                        CharSequence message, CharSequence positiveButtonMessage, CharSequence cancelButtonMessage, DialogInterface.OnClickListener clickListener, DialogInterface.OnCancelListener cancelListener) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        if (!(titleMessage.length() == 0))
            builder.setTitle(titleMessage);
        if (!(message.length() == 0))
            builder.setMessage(message);
        if (view != null)
            builder.setView(view);

        builder.setPositiveButton(positiveButtonMessage, clickListener);
        builder.setNegativeButton(cancelButtonMessage, clickListener);
        builder.setOnCancelListener(cancelListener);
        AlertDialog alert = builder.create();
        alert.show();
    }
}
