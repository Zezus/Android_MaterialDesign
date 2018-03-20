package com.example.materialdesigne;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by СадвакасовР on 20.03.2018.
 */

public class UsersAdapter extends ArrayAdapter {
    private Context context;
    private List<User> usres;

    public UsersAdapter(@NonNull Context context,
                        @NonNull List<User> usres) {
        super(context, R.layout.item, usres);

        this.context = context;
        this.usres = usres;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView = View.inflate(context, R.layout.item, null);
        ImageView photoImageView = convertView.findViewById(R.id.i_photo_iv);
        TextView loginTextView = convertView.findViewById(R.id.i_login_tv);
        TextView passwordTextView = convertView.findViewById(R.id.i_password_tv);

        User user = usres.get(position);

        photoImageView.setImageResource(user.getImage());
        loginTextView.setText(user.getLogin());
        passwordTextView.setText(user.getPassword());

        return convertView;
    }
}
