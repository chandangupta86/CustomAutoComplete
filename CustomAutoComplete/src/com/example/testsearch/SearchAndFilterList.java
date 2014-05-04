package com.example.testsearch;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class SearchAndFilterList extends Activity {
    private ArrayList<String> mStringList;
    private ValueAdapter valueAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_and_filter_list);
        initData();
        valueAdapter=new ValueAdapter(mStringList,this);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.ac_edit);
        textView.setThreshold(1);
        textView.setAdapter(valueAdapter);
        textView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int pos,
					long id) {
				TextView tv_data =(TextView)view.findViewById(R.id.txt_listitem);
        		Toast.makeText(getApplicationContext(), "ListView clicked and item selected is "+tv_data.getText().toString(), Toast.LENGTH_LONG).show();
   
			}
		});
        
    }
    private void initData() {

        mStringList=new ArrayList<String>();

        mStringList.add("one");

        mStringList.add("two");

        mStringList.add("three");

        mStringList.add("four");

        mStringList.add("five");

        mStringList.add("six");

        mStringList.add("seven");

        mStringList.add("eight");

        mStringList.add("nine");

        mStringList.add("ten");

        mStringList.add("eleven");

        mStringList.add("twelve");

        mStringList.add("thirteen");

        mStringList.add("fourteen");

      
    }

    
}