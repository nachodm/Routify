package routify.routify;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatRatingBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.SupportMapFragment;

import org.w3c.dom.Text;


public class Sightseeing_suggestions extends Fragment {
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_sightseeing_suggestions, container, false);

        final String[] routeName = {"Oulu", "Helsinki", "Rovaniemi", "Oulu", "Helsinki", "Rovaniemi", "Tampere", "Oulanka", "Turku", "Tornio", "Haparanda"};

        String[] routeDesc = {"Best sightseeing route through the capital of Northern Ostrobothnia", "Wanna do more than just visiting Santa? Join this route and discover the city!", "Capital city, cultural city.", "defult text I dont know what to write on it", "defult text I dont know what to write on it", "defult text I dont know what to write on it",
                "default text I dont know what to write on it", "defult text I dont know what to write on it", "defult text I dont know what to write on it",
                "default text I dont know what to write on it", "defult text I dont know what to write on it", "defult text I dont know what to write on it"};

        CustomList adapter = new CustomList(getActivity(), routeName, routeDesc);

        ListView listView = (ListView) view.findViewById(R.id.ss_rout_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.route_detail);

                final TextView detailRouteName = (TextView) dialog.findViewById(R.id.detailRouteName);
                detailRouteName.setText("Oulu");

                dialog.show();

            }
        });

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
