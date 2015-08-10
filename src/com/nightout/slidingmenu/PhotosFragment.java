package com.nightout.slidingmenu;

import java.util.ArrayList;
import java.util.List;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.nightout.R;

public class PhotosFragment extends Fragment {
	private Spinner spinner1;
	private Button btnSubmit;
	public PhotosFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_popular, container, false);
         
    //    addItemsOnSpinner();
	
		
		  
		
        return rootView;
    }
	/*public void addItemsOnSpinner() {
		 
		spinner1 = (Spinner) getActivity().findViewById(R.id.spinner1);
		List<String> list = new ArrayList<String>();
		list.add("Skopje");
		list.add("Valandovo");
		list.add("list 3");
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(getActivity(),
			android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner1.setAdapter(dataAdapter);
	  }*/
	

}
