/*
Final Project 2021
 */

package com.pfinal.onlineshop_project.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.pfinal.onlineshop_project.R;
import com.pfinal.onlineshop_project.model.CenterRepository;
import com.pfinal.onlineshop_project.model.entities.ProductCategoryModel;
import com.pfinal.onlineshop_project.util.ColorGenerator;
import com.pfinal.onlineshop_project.view.customview.LabelView;
import com.pfinal.onlineshop_project.view.customview.TextDrawable;
import com.pfinal.onlineshop_project.view.customview.TextDrawable.IBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hitesh Sahu (hiteshsahu.com)
 */
public class CategoryListAdapter extends
        RecyclerView.Adapter<CategoryListAdapter.VersionViewHolder> {

    public static List<ProductCategoryModel> categoryList = new ArrayList<ProductCategoryModel>();
    OnItemClickListener clickListener;
    private ColorGenerator mColorGenerator = ColorGenerator.MATERIAL;
    private IBuilder mDrawableBuilder;
    private TextDrawable drawable;
    private String ImageUrl;
    private Context context;

    public CategoryListAdapter(Context context) {

        categoryList = CenterRepository.getCenterRepository().getListOfCategory();

        this.context = context;
    }

    @Override
    public VersionViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.item_category_list, viewGroup, false);
        VersionViewHolder viewHolder = new VersionViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(VersionViewHolder versionViewHolder,
                                 int categoryIndex) {

        versionViewHolder.itemName.setText(categoryList.get(categoryIndex)
                .getProductCategoryName());

        versionViewHolder.itemDesc.setText(categoryList.get(categoryIndex)
                .getProductCategoryDescription());

        mDrawableBuilder = TextDrawable.builder().beginConfig().withBorder(4)
                .endConfig().roundRect(10);

        drawable = mDrawableBuilder.build(String.valueOf(categoryList
                        .get(categoryIndex).getProductCategoryName().charAt(0)),
                mColorGenerator.getColor(categoryList.get(categoryIndex)
                        .getProductCategoryName()));

        ImageUrl = categoryList.get(categoryIndex).getProductCategoryImageUrl();

        Glide.with(context).load(ImageUrl).placeholder(drawable)
                .error(drawable).animate(R.anim.base_slide_right_in)
                .centerCrop().into(versionViewHolder.imagView);

        LabelView label = new LabelView(context);
        label.setText(categoryList.get(categoryIndex)
                .getProductCategoryDiscount());
        label.setBackgroundColor(0xffE91E63);
        label.setTargetView(versionViewHolder.imagView, 10,
                LabelView.Gravity.RIGHT_TOP);

    }

    @Override
    public int getItemCount() {
        return categoryList == null ? 0 : categoryList.size();
    }

    public void SetOnItemClickListener(
            final OnItemClickListener itemClickListener) {
        this.clickListener = itemClickListener;
    }

    public interface OnItemClickListener {
        public void onItemClick(View view, int position);
    }

    class VersionViewHolder extends RecyclerView.ViewHolder implements
            View.OnClickListener {
        TextView itemName, itemDesc, itemCost, availability, quanitity,
                addItem, removeItem;
        ImageView imagView;

        public VersionViewHolder(View itemView) {
            super(itemView);

            itemName = (TextView) itemView.findViewById(R.id.item_name);

            itemDesc = (TextView) itemView.findViewById(R.id.item_short_desc);

            itemName.setSelected(true);

            imagView = ((ImageView) itemView.findViewById(R.id.imageView));

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            clickListener.onItemClick(v, getPosition());
        }
    }

}
