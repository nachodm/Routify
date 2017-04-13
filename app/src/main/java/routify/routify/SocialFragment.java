package routify.routify;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class SocialFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_social, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        String[] routeName = {"Oulu-Tourney", "Swamp-land", "Statue-of-Libertine", "Backalley Vend",
                "NoGo Traffic", "Skater Eight", "Dooby Dooby Doo", "Old Man Henderson"};

        String[] routeDesc = {"For the bicyclist in you.", "You shall not sink", "For the anarchists.", "Avoid these.",
                "Only Cars can.", "Tony Hawk Special", "Accursed Meddling Kids.", "Don't steal his gnomes."};

    /* Define column names for cursor. */
        //String[] fromColumns = {ContactsContract.Data.DISPLAY_NAME,
        //        ContactsContract.CommonDataKinds.Phone.NUMBER};

    /* array of int for views, each represents one column. */
        //int[] toViews = {R.id.rout_list, R.id.desc_list};

        //ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_view,routeName);
        //ArrayAdapter adapter2 = new ArrayAdapter<String>(this,R.layout.list_view,routeDesc);
        CustomList adapter = new CustomList(getActivity(), routeName, routeDesc);
        ListView listViewA = (ListView) getView().findViewById(R.id.rout_list);
        listViewA.setAdapter(adapter);

        final Button buttA = (Button) getView().findViewById(R.id.create_reviews_button);


        listViewA.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), "This should fetch route. " /*+ routeName + position*/, Toast.LENGTH_SHORT).show();

            }
        });

        buttA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getContext(), " Extra Functionality Button ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

/*@Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mapView = inflater.inflate(R.layout.fragment_maps, container, false);

        try {
            SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(MapsFragment.this);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mapView;
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {

        if (ActivityCompat.checkSelfPermission(getContext(),
                android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getContext(),
                android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        mMap.setMyLocationEnabled(true);
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.getUiSettings().setCompassEnabled(true);


        LatLng initPosition = new LatLng(60.016, 25);
        mMap.addMarker(new MarkerOptions().position(initPosition).title("Marker"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(initPosition,7));

        if(mMap != null) {
            mMap.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() {
                @Override
                public void onMapLongClick(LatLng latLng) {
                    mMap.addMarker(new MarkerOptions()
                            .position(latLng)
                            .title("Marker " + counter++)
                            .snippet("Intermediate point"));
                }
            });
        }
    }


    public void onDestroyView()
    {
        try {
            Fragment fragment = (getChildFragmentManager().findFragmentById(R.id.map));
            if (fragment != null) {
                FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.remove(fragment);
                ft.commit();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        super.onDestroyView();
    }*/