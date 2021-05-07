package com.ATR.camerafix;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class infoBox extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("FYI")
                .setMessage("I do not claim responsibility for any damage on your device, read the instructions on the app and USE AT YOUR OWN RISK.")
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
        return builder.create();
    }
}
