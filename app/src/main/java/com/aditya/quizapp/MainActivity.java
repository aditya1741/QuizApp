package com.aditya.quizapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aditya.quizapp.adapter.CategoryRvAdapter;
import com.aditya.quizapp.model.CategoryRvModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<CategoryRvModel> categoryList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        RecyclerView categoryRv = findViewById(R.id.category_recycler_view);
        categoryRv.setLayoutManager(new GridLayoutManager(this, 2));
        CategoryRvModel categoryModel = new CategoryRvModel(R.drawable.ic_trophy, "Sports", "30");
        categoryList.add(categoryModel);
        categoryList.add(new CategoryRvModel(R.drawable.ic_coin, "Math", "40"));
        categoryList.add(new CategoryRvModel(R.drawable.ic_coin, "Math", "40"));
        CategoryRvAdapter rvAdapter = new CategoryRvAdapter(this,categoryList);
        categoryRv.setAdapter(rvAdapter);


    }
}