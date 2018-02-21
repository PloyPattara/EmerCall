package ploypattara.snru.ac.th.emercall.fragment;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import ploypattara.snru.ac.th.emercall.R;

/**
 * Created by Admin on 20/2/2561.
 */

public class MainFragment extends Fragment {
    //    Explicit
    private String tag = "MyTagV1";


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



        //        For Station1
        ImageView Station1ImageView = getView().findViewById(R.id.imageStation1);
        Station1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d(tag, "You Click Image Station1");
                callStation("0801934816");

            }
        });
        TextView Station1TextView = getView().findViewById(R.id.textViewStation1);
        Station1TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(tag, "Click Text" + getString(R.string.station1));
            }
        });




        //        For Station2
        ImageView Station2ImageView = getView().findViewById(R.id.imageStation2);
        Station2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(tag, "You Click Image Station2");
                callStation("2222");

            }
        });
        TextView Station2TextView = getView().findViewById(R.id.textViewStation2);
        Station2TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(tag, "Click Text" + getString(R.string.station2));
            }
        });




        //        For Station3
        ImageView Station3ImageView = getView().findViewById(R.id.imageStation3);
        Station3ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(tag, "You Click Image Station3");
                callStation("3333");
            }
        });
        TextView Station3TextView = getView().findViewById(R.id.textViewStation3);
        Station3TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(tag, "Click Text" + getString(R.string.station3));
            }
        });





        //        For Station4
        ImageView Statiion4ImageView = getView().findViewById(R.id.imageStation4);
        Statiion4ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(tag, "You Click Image Station4");
                callStation("4444");
            }
        });
        TextView Station4TextView = getView().findViewById(R.id.textViewStation4);
        Station4TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(tag, "Click Text" + getString(R.string.station4));
            }
        });




    } //    Main Method

    public void callStation(String numberCall) {

        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + numberCall));
        if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        getActivity().startActivity(intent);


    }  //CallStation



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_police, container, false);
        return view;
    }
} //Main Class
