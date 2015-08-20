package com.nightout.slidingmenu;

 

import com.google.android.gms.common.internal.IAccountAccessor;
import com.nightout.FacebookActivity;
import com.nightout.R;
import com.nightout.Singleton;
import com.nightout.foursquare.AndroidFoursquare;
 






import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class HomeFragment extends Fragment {

	private TextView user;
	private Button kopce;
	private Button fblogin;
	final Context cont=getActivity();
	Singleton lol;
	public HomeFragment(){}
	public int ace;
	private String Item="",ae;
	private Button post;
	private ImageButton login;
	private ImageButton post1;
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
         user=(TextView)rootView.findViewById(R.id.textView2);
         fblogin=(Button)rootView.findViewById(R.id.fblogin);
         post=(Button)rootView.findViewById(R.id.button1);
         post1=(ImageButton)rootView.findViewById(R.id.imageButton2);
         login=(ImageButton)rootView.findViewById(R.id.imageButton1);
         
         String ime = Singleton.getInstance().ime;
         int ace1=ime.length();
         if(ace1==0)
         {     
        	 user.setText("You are not logged in");
        	   login.setVisibility(View.VISIBLE);
        	   post1.setVisibility(View.GONE);
        
         }
	    else
	    {
	      
	      user.setText("Logged as: "+ime);
     	 login.setVisibility(View.GONE);
     	   post1.setVisibility(View.VISIBLE);
	    }    
         
    /*  
         fblogin.setOnClickListener(new View.OnClickListener() {
        			
           			@Override
           			public void onClick(View arg0) {		
           				// create class object
           				ace++;
           				Intent i = new Intent(getActivity(),FacebookActivity.class);
           				startActivity(i);
           				
           			
        			}
           		});
       */
         
         login.setOnClickListener(new View.OnClickListener() {
 			
    			@Override
    			public void onClick(View arg0) {		
    				
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
	/*    Log.e("kolkoo", "kolko");
	    
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
	      
	      */
	}
} 

