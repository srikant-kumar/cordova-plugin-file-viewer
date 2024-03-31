package com.cordova.plugin.file.viewer;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Intent;
import android.net.Uri;
import android.webkit.MimeTypeMap;

/**
 * This class echoes a string called from JavaScript.
 */
public class CordovaFileViewer extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("coolMethod")) {
            String message = args.getString(0);
            this.coolMethod(message, callbackContext);
            return true;
        }

        if ("openFile".equals(action)) {
            String url = args.getString(0);
            this.openFile(url);
            callbackContext.success();
            return true;
        }

        return false;
    }

    private void coolMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }

    private void openFile(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        Uri uri = Uri.parse(url);
        String type = getMimeType(uri); // Determine the MIME type
        intent.setDataAndType(uri, type);
        cordova.getActivity().startActivity(intent);
    }

    private String getMimeType(Uri uri) {
        String mimeType;
        if (uri.getScheme().equals("content")) {
            mimeType = cordova.getActivity().getContentResolver().getType(uri);
        } else {
            String fileExtension = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
            mimeType = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtension.toLowerCase());
        }
        return mimeType != null ? mimeType : "*/*";
    }
}
