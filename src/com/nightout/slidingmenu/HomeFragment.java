package com.nightout.slidingmenu;

import com.nightout.FacebookActivity;
import com.nightout.R;
import com.nightout.foursquare.AndroidFoursquare;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {
	
	private Button fblogin;

	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        fblogin=(Button)rootView.findViewById(R.id.fblogin);
     
 fblogin.setOnClickListener(new View.OnClickListener() {
			
   			@Override
   			public void onClick(View arg0) {		
   				// create class object
   				Intent i = new Intent(getActivity(),FacebookActivity.class);
   			  
				 startActivity(i);
   			}
   		});
        
        
        return rootView;
    }
}
