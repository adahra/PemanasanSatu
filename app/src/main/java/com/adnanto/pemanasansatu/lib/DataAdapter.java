package com.adnanto.pemanasansatu.lib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.adnanto.pemanasansatu.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

/**
 * Created by adnanto on 8/30/16.
 */
public class DataAdapter extends BaseAdapter {
    private String[] sDataGambar;
    private String[] sDataNama;
    private String[] sDataBio;
    private String[] sDataPengikut;
    private boolean[] bIsFollow;
    private boolean bDataAction;
    private Context context;
    private static LayoutInflater layoutInflater = null;

    public DataAdapter(Context context, String[] sDataGambar, String[] sDataNama, String[] sDataBio, String[] sDataPengikut) {
        this.sDataGambar = sDataGambar;
        this.sDataNama = sDataNama;
        this.sDataBio = sDataBio;
        this.sDataPengikut = sDataPengikut;
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public DataAdapter(Context context, String[] sDataGambar, String[] sDataNama, String[] sDataBio, boolean[] bIsFollow) {
        this.sDataGambar = sDataGambar;
        this.sDataNama = sDataNama;
        this.sDataBio = sDataBio;
        this.bIsFollow = bIsFollow;
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public DataAdapter(Context context, String[] sDataGambar, String[] sDataNama, String[] sDataBio) {
        this.sDataGambar = sDataGambar;
        this.sDataNama = sDataNama;
        this.sDataBio = sDataBio;
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public DataAdapter(Context context, String[] sDataGambar, String[] sDataNama) {
        this.sDataGambar = sDataGambar;
        this.sDataNama = sDataNama;
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public DataAdapter(Context context, String[] sDataNama) {
        this.sDataNama = sDataNama;
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return sDataNama.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final Holder holder = new Holder();
        View rowView = layoutInflater.inflate(R.layout.custom_list_view, null);
        holder.ivGambarAvatar = (ImageView) rowView.findViewById(R.id.ivGambar);
        holder.tvUserNama = (TextView) rowView.findViewById(R.id.tvUserName);
        holder.tvName = (TextView) rowView.findViewById(R.id.tvName);
        holder.tvDeskripsi = (TextView) rowView.findViewById(R.id.tvDeskripsi);
        holder.imgBtnGambar = (ImageButton) rowView.findViewById(R.id.imgBtnGambar);

        if (bIsFollow[position]) {
            holder.imgBtnGambar.setImageResource(R.drawable.i_followed);
            holder.imgBtnGambar.setBackgroundColor(Color.GREEN);
        } else {
            holder.imgBtnGambar.setImageResource(R.drawable.i_follow);
            holder.imgBtnGambar.setBackgroundColor(Color.WHITE);
        }

        Glide.with(context).load(sDataGambar[position]).asBitmap().centerCrop().
                into(new BitmapImageViewTarget(holder.ivGambarAvatar) {
                    @Override
                    protected void setResource(Bitmap resource) {
                        RoundedBitmapDrawable circularBitmapDrawable = RoundedBitmapDrawableFactory
                                .create(context.getResources(), resource);
                        circularBitmapDrawable.setCircular(true);
                        holder.ivGambarAvatar.setImageDrawable(circularBitmapDrawable);
                    }
                });

        try {
            holder.tvUserNama.setText(sDataNama[position]);
            holder.tvName.setText(sDataBio[position]);
            holder.tvDeskripsi.setText(sDataPengikut[position]);
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        } finally {

        }

        holder.imgBtnGambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "You clicked " + sDataNama[position], Toast.LENGTH_LONG)
                        .show();
            }
        });

        return rowView;
    }

    private class Holder {
        public ImageView ivGambarAvatar;
        public TextView tvUserNama;
        public TextView tvName;
        public TextView tvDeskripsi;
        public ImageButton imgBtnGambar;
    }
}
