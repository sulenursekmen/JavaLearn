package com.sullens.landmarkbook;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.sullens.landmarkbook.databinding.ActivityDetailsBinding;
import com.sullens.landmarkbook.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    ArrayList<LandMark>landMarkArrayList;
    private ActivityMainBinding binding;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        landMarkArrayList=new ArrayList<>();
        //ArrayList<String> landmarkNames=new ArrayList<String>();
        //landmarkNames.add(pisa);

        //Data
        LandMark pisa=new LandMark("Pisa","Italy",R.drawable.pisa) ;
        LandMark eiffel=new LandMark("Eiffel","France",R.drawable.eiffel);
        LandMark colosseum=new LandMark("Colesseum","Italy",R.drawable.colosseum);
        LandMark londonBridge=new LandMark("London Bridge","U.K",R.drawable.londonbridge);

        landMarkArrayList.add(pisa);
        landMarkArrayList.add(eiffel);
        landMarkArrayList.add(colosseum);
        landMarkArrayList.add(londonBridge);

        //Adapter
        //ListView
        //mapping

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                landMarkArrayList.stream().map(landMark -> landMark.name).collect(Collectors.toList())
        );
        binding.listView.setAdapter(arrayAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               // Toast.makeText(MainActivity.this,landMarkArrayList.get(i).name,Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,DetailsActivity.class);
                intent.putExtra("landmark",landMarkArrayList.get(i));
                startActivity(intent);
            }
        });


    }
}