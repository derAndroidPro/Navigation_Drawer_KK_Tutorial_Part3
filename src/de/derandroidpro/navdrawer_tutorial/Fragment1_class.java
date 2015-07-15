package de.derandroidpro.navdrawer_tutorial;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment1_class extends Fragment implements OnClickListener {

	public Button fragbtn1;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View fraglayoutv = inflater.inflate(R.layout.frag1_layout, null);
		
		fragbtn1 = (Button) fraglayoutv.findViewById(R.id.buttonfrag1);
		fragbtn1.setOnClickListener(this);
		
		
		return fraglayoutv;
	}

	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonfrag1:{
			
			Toast.makeText(getActivity(), "Button gedrückt!!", Toast.LENGTH_SHORT).show();
			
			
		}
		
		
		
		}
		
	}
	
	
	
	
	
	
	
	
}
