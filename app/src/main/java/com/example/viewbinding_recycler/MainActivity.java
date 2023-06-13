package com.example.viewbinding_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.viewbinding_recycler.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    String[] cat_name_arr={"Best Wishes","Friendship", "Fun",
            "God", "Inspiration", "Life",
            "Love", "Memorable","Sad",
            "Birthday","Politics","Others"};
    int[] img_arr={R.drawable.bearbar,R.drawable.bestwishesh,R.drawable.birthday,
            R.drawable.boyfriendgirl,R.drawable.bewfa,R.drawable.child,
            R.drawable.holiimg,R.drawable.husband,R.drawable.god,
            R.drawable.love,R.drawable.motivational,R.drawable.sad};
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        binding=ActivityMainBinding.inflate(getLayoutInflater());
//        View view=binding.getRoot();
//        setContentView(view);
        binding= DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        RecyclerView recyclerView=binding.categorylist;

        MyAdapter adapter=new MyAdapter(MainActivity.this,img_arr,cat_name_arr);
        LinearLayoutManager manager=new LinearLayoutManager(getApplicationContext());
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.animate();
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

    }
}