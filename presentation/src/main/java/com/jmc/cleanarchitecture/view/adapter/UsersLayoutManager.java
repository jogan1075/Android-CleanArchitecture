/**
 * Copyright (C) 2014 android10.org. All rights reserved.
 * @author Fernando Cejas (the android10 coder)
 */
package com.jmc.cleanarchitecture.view.adapter;

import android.content.Context;
//import android.support.v7.widget.LinearLayoutManager;

import androidx.recyclerview.widget.LinearLayoutManager;

/**
 * Layout manager to position items inside a {@link android.support.v7.widget.RecyclerView}.
 */
public class UsersLayoutManager extends LinearLayoutManager {
  public UsersLayoutManager(Context context) {
    super(context);
  }
}
