package com.nightout.slidingmenu;



import java.io.IOException;
import java.util.List;

import com.nightout.R;
import com.nightout.foursquare.AndroidFoursquare;







import android.app.Fragment;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FindPlacesFragment extends Fragment {

	 

	private Geocoder geocoder;
	private Button find;
	private TextView lokacija;
	private TextView txt;
	
	public FindPlacesFragment(){
		
	}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_find_places, container, false);
        find=(Button)rootView.findViewById(R.id.button1);
        lokacija=(EditText)rootView.findViewById(R.id.editText1);
        txt=(TextView)rootView.findViewById(R.id.textView1);
        geocoder = new Geocoder(getActivity());
       
        find.setOnClickListener(new View.OnClickListener() {

		    private double lat;
			private double lng;

			public void onClick(View v) {
		    	String add=lokacija.getText().toString();
		    	

		    	
		    	      
		    	try {

		    	List<Address> addresses= geocoder.getFromLocationName(add, 1);

		    	if (addresses != null && !addresses.isEmpty()) {

		    	 Address address = addresses.get(0);
                 lat=address.getLatitude();
		    	 lng=address.getLongitude();
		    	
		    	 String a1= Double.toString(lat);
		    	 String a2= Double.toString(lng);
		    	 
		    	 txt.setText(a1+" "+a2);
		    	 
		    	}
		    	
		    	} 
		    	catch (IOException e)    {
		    	  
		    	}
				  

	        }    
		});

		   
		        

        
        return rootView;
    }


}

