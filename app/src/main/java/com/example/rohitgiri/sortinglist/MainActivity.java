package com.example.rohitgiri.sortinglist;
//importing packages
import android.support.constraint.solver.ArrayLinkedVariables;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//creating class which is extending AppCpat Activity and implementing On Click Listener
public class MainActivity extends AppCompatActivity {

    //making objects of xml file
    private ListView mListview;
    private ArrayList<String> mListdata;
    private Button button1;
    private Button button2;

    //oncreate method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //connecting objects with buttons of user interface
        setContentView(R.layout.activity_main);
        mListview=(ListView)findViewById(R.id.listview);
        //initialising array list
        mListdata=new ArrayList<>();
        //Adding Data to empty list
        addDataInList();
        //Initialising Adapter

        //using array Adapter and making Connection between array list and list view
        ArrayAdapter<String> arrayadapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,mListdata);
        mListview.setAdapter(arrayadapter);
        button1=(Button)findViewById(R.id.ascending);
        button2=(Button)findViewById(R.id.descending);
    }

    private void addDataInList() {
        mListdata.add("Jan");
        mListdata.add("Feb");
        mListdata.add("March");
        mListdata.add("April");
        mListdata.add("May");
        mListdata.add("June");
        mListdata.add("July");
        mListdata.add("August");
        mListdata.add("Sep");
        mListdata.add("Oct");
        mListdata.add("Nov");
        mListdata.add("Dec");
    }
    public void ascending(View v)
    {
        Collections.sort(mListdata);
        ArrayAdapter<String> arrayadapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,mListdata);
        mListview.setAdapter(arrayadapter);
    }
    public void descending(View v)
    {
        Collections.sort(mListdata);
        Collections.reverse(mListdata);
        ArrayAdapter<String> arrayadapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,mListdata);
        //setting adapter
        mListview.setAdapter(arrayadapter);
    }
}
