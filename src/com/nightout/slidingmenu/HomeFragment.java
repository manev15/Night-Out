package com.nightout.slidingmenu;

 

import com.nightout.FacebookActivity;
import com.nightout.R;
import com.nightout.Singleton;
import com.nightout.foursquare.AndroidFoursquare;
 


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class HomeFragment extends Fragment {

	private TextView user;
	private Button kopce;
	private Button fblogin;
	Singleton lol;
	public HomeFragment(){}
	public int ace;
	private String Item="",ae;
	private Button post;
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
         user=(TextView)rootView.findViewById(R.id.textView2);
         fblogin=(Button)rootView.findViewById(R.id.fblogin);
         post=(Button)rootView.findViewById(R.id.button1);
      
         fblogin.setOnClickListener(new View.OnClickListener() {
        			
           			@Override
           			public void onClick(View arg0) {		
           				// create class object
           				ace++;
           				Intent i = new Intent(getActivity(),FacebookActivity.class);
           				startActivity(i);
           				
           			
        			}
           		});
       
         post.setOnClickListener(new View.OnClickListener() {
 			
    			@Override
    			public void onClick(View arg0) {		
    				// create class object
    				
    				Intent i = new Intent(getActivity(),FacebookActivity.class);
    				startActivity(i);
    				
    			
 			}
    		});
         
        return rootView;
    }

	@Override
	public void onResume() {
	    super.onResume();
	    Log.e("kolkoo", "kolko");
	    
	    int io=Singleton.getInstance().br;
	
	    if(io!=0)
	    {
	     String imee=Singleton.getInstance().ime;
//	    Intent i = getActivity().getIntent();
//	    Item=i.getExtras().getString("name");
 	    user.setText("Logged as: "+imee);
 	    fblogin.setVisibility(View.GONE);
 	   post.setVisibility(View.VISIBLE);
 	    
	    }
	    else
	    {
	      user.setText("You are not logged in");
	    }    
	      
	      
	}
} 

