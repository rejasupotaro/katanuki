package com.rejasupotaro.katanuki.ui.helper;

import android.os.Bundle;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.widget.Toast;

import com.rejasupotaro.katanuki.loader.UserLoader;
import com.rejasupotaro.katanuki.model.User;


public class KatanukiActivityHelper extends AbstractContextHelper implements LoaderCallbacks<User> {

    private static final int REQUEST_USER = 1;

    public void get() {
        getActivity().getSupportLoaderManager().initLoader(REQUEST_USER, null, this);
    }

    public Loader<User> onCreateLoader(int id, Bundle bundle) {
        return new UserLoader(getContext(), "1");
    }

    public void onLoadFinished(Loader<User> loader, User user) {
        if (user == null) return;
        Toast.makeText(getContext(), "Hello " + user.name + "!", Toast.LENGTH_SHORT).show();
    }

    public void onLoaderReset(Loader<User> loader) {
        // nothing to do
    }
}
