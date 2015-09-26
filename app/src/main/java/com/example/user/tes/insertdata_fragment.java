package com.example.user.tes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by user on 9/25/2015.
 */
public class insertdata_fragment extends Fragment {
    EditText nama;
    EditText umur;
    Button tombol;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.insert_data, container, false);

        nama = (EditText) rootView.findViewById(R.id.edittext_nama);
        umur = (EditText) rootView.findViewById(R.id.edittext_umur);

        tombol = (Button) rootView.findViewById(R.id.btn_submit);

     tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(nama.getText().toString().equalsIgnoreCase(""))
                {
                    Toast.makeText(getContext(),"nama harus diisi", Toast.LENGTH_SHORT ).show();
                }
                else if(nama.getText().toString().equalsIgnoreCase(""))
                {
                    Toast.makeText(getContext(),"umur harus diisi ", Toast.LENGTH_SHORT ).show();
                }
                else
                {

                    MainActivity.list_nama.add(String.valueOf(nama.getText()));
                    MainActivity.list_umur.add(Integer.parseInt(umur.getText().toString()));


                    getActivity().onBackPressed();
                }







            }
        });


        return rootView;
    }

}
