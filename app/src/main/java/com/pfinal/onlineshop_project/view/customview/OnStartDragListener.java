/*
Final Project 2021
 */

package com.pfinal.onlineshop_project.view.customview;


import androidx.recyclerview.widget.RecyclerView;

/**
 * Listener for manual initiation of a drag.
 */
public interface OnStartDragListener {

    /**
     * Called when a view is requesting a start of a drag.
     *
     * @param viewHolder The holder of the view to drag.
     */
    void onStartDrag(RecyclerView.ViewHolder viewHolder);

}
