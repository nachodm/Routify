package routify.routify;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatRatingBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class Sightseeing_suggestions extends Fragment {
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_sightseeing_suggestions, container, false);

        String[] routeName = {"Oulu", "Helsinki", "Rovaniemi", "Oulu", "Helsinki", "Rovaniemi", "Tampere", "Oulanka", "Turku", "Tornio", "Haparanda"};

        String[] routeDesc = {"default text I dont know what to write on it", "defult text I dont know what to write on it", "defult text I dont know what to write on it", "defult text I dont know what to write on it", "defult text I dont know what to write on it", "defult text I dont know what to write on it",
                "defult text I dont know what to write on it", "defult text I dont know what to write on it", "defult text I dont know what to write on it",
                "default text I dont know what to write on it", "defult text I dont know what to write on it", "defult text I dont know what to write on it"};

        CustomList adapter = new CustomList(getActivity(), routeName, routeDesc);

        ListView listViewA = (ListView) view.findViewById(R.id.rout_list);
        listViewA.setAdapter(adapter);

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
