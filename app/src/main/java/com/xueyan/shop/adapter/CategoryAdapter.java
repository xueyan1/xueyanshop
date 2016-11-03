package com.xueyan.shop.adapter;

import android.content.Context;

import com.xueyan.shop.R;
import com.xueyan.shop.bean.Category;

import java.util.List;

public class CategoryAdapter extends SimpleAdapter<Category> {

    public CategoryAdapter(Context context, List<Category> datas) {
        super(context, R.layout.template_single_text, datas);
    }

    @Override
    protected void convert(BaseViewHolder viewHoder, Category item) {
        viewHoder.getTextView(R.id.textView).setText(item.getName());
    }
}
