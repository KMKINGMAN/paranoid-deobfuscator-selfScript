package com.easyvictory.cheto;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
/* loaded from: classes.dex */
public class SettingsActivity extends AppCompatActivity {
    private static boolean isAnyRequestProcessing = false;

    /* JADX INFO: Access modifiers changed from: private */
    public native String XXX();

    /* JADX INFO: Access modifiers changed from: private */
    public native String XXXX(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native String XXXXX(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native String XXXXXX(String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public native String XXXXXXX();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0785R.C0789layout.activity_settings);
        ((TextView) findViewById(C0785R.C0788id.RemainingDaysText)).setText(((Object) getResources().getText(C0785R.string.remaining_time)) + ":
 " + XXX());
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C0785R.C0788id.BackButton /* 2131296269 */:
                super.finish();
                return;
            case C0785R.C0788id.EditPIN /* 2131296280 */:
                ModulesActivity.showPinInputDialog(this);
                return;
            case C0785R.C0788id.RedeemKeyButton /* 2131296309 */:
                if (isAnyRequestProcessing) {
                    Toast.makeText(this, (int) C0785R.string.please_wait_few_moments, Toast.LENGTH_SHORT).show();
                    return;
                }
                final String obj = ((EditText) findViewById(C0785R.C0788id.SubKeyInput)).getText().toString();
                isAnyRequestProcessing = true;
                new Thread(new Runnable() { // from class: com.easyvictory.cheto.SettingsActivity.1
                    @Override // java.lang.Runnable
                    public void run() {
                        final SettingsActivity settingsActivity = SettingsActivity.this;
                        final String XXXX = settingsActivity.XXXX(obj);
                        boolean unused = SettingsActivity.isAnyRequestProcessing = false;
                        if (XXXX.length() > 0) {
                            settingsActivity.runOnUiThread(new Runnable() { // from class: com.easyvictory.cheto.SettingsActivity.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Toast.makeText(settingsActivity, XXXX, Toast.LENGTH_SHORT).show();
                                }
                            });
                            if (XXXX.equals("Success")) {
                                ((TextView) SettingsActivity.this.findViewById(C0785R.C0788id.RemainingDaysText)).setText(((Object) SettingsActivity.this.getResources().getText(C0785R.string.remaining_time)) + ":
 " + SettingsActivity.this.XXX());
                            }
                        }
                    }
                }).start();
                return;
            case C0785R.C0788id.ResetHwidButton /* 2131296312 */:
                if (isAnyRequestProcessing) {
                    Toast.makeText(this, (int) C0785R.string.please_wait_few_moments, Toast.LENGTH_SHORT).show();
                    return;
                }
                isAnyRequestProcessing = true;
                new Thread(new Runnable() { // from class: com.easyvictory.cheto.SettingsActivity.4
                    @Override // java.lang.Runnable
                    public void run() {
                        final SettingsActivity settingsActivity = SettingsActivity.this;
                        final String XXXXXXX = settingsActivity.XXXXXXX();
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        boolean unused = SettingsActivity.isAnyRequestProcessing = false;
                        if (XXXXXXX.length() > 0) {
                            settingsActivity.runOnUiThread(new Runnable() { // from class: com.easyvictory.cheto.SettingsActivity.4.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Toast.makeText(settingsActivity, XXXXXXX, Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                    }
                }).start();
                return;
            case C0785R.C0788id.UpdatePasswordButton /* 2131296326 */:
                if (isAnyRequestProcessing) {
                    Toast.makeText(this, (int) C0785R.string.please_wait_few_moments, Toast.LENGTH_SHORT).show();
                    return;
                }
                final String obj2 = ((EditText) findViewById(C0785R.C0788id.PasswordInput)).getText().toString();
                if (!obj2.equals(((EditText) findViewById(C0785R.C0788id.PasswordConfirmationInput)).getText().toString())) {
                    Toast.makeText(this, (int) C0785R.string.passwords_dont_match, Toast.LENGTH_SHORT).show();
                    return;
                }
                isAnyRequestProcessing = true;
                new Thread(new Runnable() { // from class: com.easyvictory.cheto.SettingsActivity.2
                    @Override // java.lang.Runnable
                    public void run() {
                        final SettingsActivity settingsActivity = SettingsActivity.this;
                        final String XXXXX = settingsActivity.XXXXX(obj2);
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        boolean unused = SettingsActivity.isAnyRequestProcessing = false;
                        if (XXXXX.length() > 0) {
                            settingsActivity.runOnUiThread(new Runnable() { // from class: com.easyvictory.cheto.SettingsActivity.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Toast.makeText(settingsActivity, XXXXX, Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                    }
                }).start();
                return;
            case C0785R.C0788id.UpdateSecurityQASButton /* 2131296327 */:
                if (isAnyRequestProcessing) {
                    Toast.makeText(this, (int) C0785R.string.please_wait_few_moments, Toast.LENGTH_SHORT).show();
                    return;
                }
                final String obj3 = ((EditText) findViewById(C0785R.C0788id.SecurityQuestionInput)).getText().toString();
                final String obj4 = ((EditText) findViewById(C0785R.C0788id.SecurityAnswerInput)).getText().toString();
                isAnyRequestProcessing = true;
                new Thread(new Runnable() { // from class: com.easyvictory.cheto.SettingsActivity.3
                    @Override // java.lang.Runnable
                    public void run() {
                        final SettingsActivity settingsActivity = SettingsActivity.this;
                        final String XXXXXX = settingsActivity.XXXXXX(obj3, obj4);
                        try {
                            Thread.sleep(1000L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        boolean unused = SettingsActivity.isAnyRequestProcessing = false;
                        if (XXXXXX.length() > 0) {
                            settingsActivity.runOnUiThread(new Runnable() { // from class: com.easyvictory.cheto.SettingsActivity.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Toast.makeText(settingsActivity, XXXXXX, Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                    }
                }).start();
                return;
            default:
                return;
        }
    }
}
