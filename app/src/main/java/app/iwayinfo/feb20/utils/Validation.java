package app.iwayinfo.feb20.utils;

import android.text.TextUtils;
import android.util.Patterns;

/**
 * Created by IWAY on 04-03-2017.
 */

public class Validation {
    public static boolean validateFields(String name){

        if (TextUtils.isEmpty(name)) {

            return false;

        } else {

            return true;
        }
    }

    public static boolean validateEmail(String string) {

        if (TextUtils.isEmpty(string) || !Patterns.EMAIL_ADDRESS.matcher(string).matches()) {

            return false;

        } else {

            return  true;
        }
    }
}
