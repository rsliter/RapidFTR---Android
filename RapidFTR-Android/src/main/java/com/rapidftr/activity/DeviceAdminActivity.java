package com.rapidftr.activity;

import android.app.Activity;
import android.app.admin.DeviceAdminReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.rapidftr.R;

public class DeviceAdminActivity extends DeviceAdminReceiver {

    void showToast(Context context, String msg) {
        String status = "";
        Toast.makeText(context, status, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onReceive(Context context, Intent intent){
        //
        ;
    }

    @Override
    public void onEnabled(Context context, Intent intent) {
        showToast(context, "");
    }

    @Override
    public CharSequence onDisableRequested(Context context, Intent intent) {
        return "";//context.getString(R.string.admin_receiver_status_disable_warning);
    }

    @Override
    public void onDisabled(Context context, Intent intent) {
        showToast(context, "");
    }

    @Override
    public void onPasswordChanged(Context context, Intent intent) {
        showToast(context, "");
    }
}