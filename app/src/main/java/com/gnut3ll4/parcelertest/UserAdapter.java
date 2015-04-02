package com.gnut3ll4.parcelertest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gnut3ll4 on 01/04/15.
 */
public class UserAdapter extends ArrayAdapter<User> {

    public UserAdapter(Context context, int resource, List<User> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        User user = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        }
        TextView text = (TextView) convertView.findViewById(android.R.id.text1);

        text.setText(user.getNom());

        return convertView;
    }


    static class ViewHolder {
        protected TextView text;

    }
}
