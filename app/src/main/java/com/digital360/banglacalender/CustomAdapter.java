package com.digital360.banglacalender;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
      String[] english,bangla,arabic;

    public CustomAdapter(Context context, String[] english, String[] bangla, String[] arabic) {
        this.context=context;
        this.english = english;
        this.bangla = bangla;
        this.arabic = arabic;
    }

    @Override
    public int getCount() {
        return english.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.month_select_txt,parent,false);
        TextView banglaMonth,englishMonth,arabicMonth;
        englishMonth=view.findViewById(R.id.englishDate);
        banglaMonth=view.findViewById(R.id.banglaDate);
        arabicMonth=view.findViewById(R.id.arabicDate);
        englishMonth.setText(english[position]);
        banglaMonth.setText(bangla[position]);
        arabicMonth.setText(arabic[position]);
        return view;
    }
}
