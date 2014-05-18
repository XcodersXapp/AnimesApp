package com.xcoders.adaptors;


import com.xcoders.animesapp.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class LibraryGridAdaptor extends BaseAdapter {
	private Context context;
	
	
	public LibraryGridAdaptor(Context context){
		this.context = context;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 8;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;
		
		if (convertView == null) {
			imageView = new ImageView(context);
			imageView.setLayoutParams(new GridView.LayoutParams(400,400));
			imageView.setScaleType(ImageView.ScaleType.CENTER);
			imageView.setPadding(2, 2, 2, 2);
			imageView.setImageResource(mThumbIds[position]);
			
		}else{
			imageView = (ImageView) convertView;
		}
		
		return imageView;
		
		
	}
	
	private Integer[] mThumbIds = {
			R.drawable.sample_0,
			R.drawable.sample_1,
			R.drawable.sample_2,
			R.drawable.sample_3,
			R.drawable.sample_4,
			R.drawable.sample_5,
			R.drawable.sample_6,
			R.drawable.sample_7
	};
}
