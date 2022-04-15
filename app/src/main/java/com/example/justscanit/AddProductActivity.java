package com.example.justscanit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AddProductActivity extends AppCompatActivity {

    Context context;
    public ArrayList<Products> list;

    public void AdapterClass(Context context, ArrayList<Products> list) {
        this.context = context;
        this.list = list;
    }
}
