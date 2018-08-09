package com.example.user.jengaapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContractorAdapter extends ArrayAdapter<Here>{
    Context mCtx;
    int resource;
    List<Here> listhere;
    public ContractorAdapter(Context mCtx,int resource,List<Here> listhere){
        super(mCtx,resource,listhere);
//        initialize varibales
        this.mCtx=mCtx;
        this.resource=resource;
        this.listhere = listhere;
    }
//    override method to return view of all items on list
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        we create a layout inflator to inflate the layout resource file
        LayoutInflater inflater = LayoutInflater.
                from(mCtx);
        View view=inflater.inflate(R.layout.contractor,null);

        TextView nameit = view.findViewById(R.id.textView2);
        TextView describeit = view.findViewById(R.id.textView3);
        ImageView picture = view.findViewById(R.id.imageView2);
//    get objects based on position
        Here here = listhere.get(position);
        nameit.setText(here.getName());
        describeit.setText(here.getDescription());
        picture.setImageDrawable(mCtx.getResources().getDrawable(here.getImage()));
        view.findViewById(R.id.button);
        return view;
    }
}
