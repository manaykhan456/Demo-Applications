package manay.helper;

import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import manay.listgrid.R;

/**
 * Created by DELL on 6/14/2016.
 */
public class Utils {

    /*
     *  Name: showNotification
     *  Purpose: show a Toast for notifications to user
     *  @params:
     *          1) Context : for scope
     *          2) String  : message to show
     *          3) Boolean : either to display the toast for a long period of time
     *  @returns: NONE
     */
    public static void showNotification(Context context, String message, boolean longVisibility){
        Toast.makeText(context, "Notification: "+message, (longVisibility) ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT).show();
    }

    private static void showSnackBar(View view, String message, boolean longVisibility, int color){
        Snackbar snackbar = Snackbar.make(view, message, (longVisibility) ? Snackbar.LENGTH_LONG : Snackbar.LENGTH_SHORT);
        View snackbarView = snackbar.getView();
        ( (TextView) snackbarView.findViewById(android.support.design.R.id.snackbar_text) ).setTextColor(color);
        snackbar.show();
    }

    public static void snackBarError(Context context, View view, String message, boolean longVisibility){
        showSnackBar(view, "Error: "+message, longVisibility, context.getResources().getColor(R.color.red));
    }

    public static void snackBarNotification(Context context, View view, String message, boolean longVisibility){
        showSnackBar(view, "Notification: "+message, longVisibility, context.getResources().getColor(R.color.yellow));
    }
}
