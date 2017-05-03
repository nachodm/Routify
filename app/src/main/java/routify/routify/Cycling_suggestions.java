package routify.routify;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class Cycling_suggestions extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cycling_suggestions, container, false);
        String[] routeName = {"Oulu-Kiiminki", "Helsinki", "Rovaniemi", "Oulu", "Helsinki", "Rovaniemi", "Tampere", "Oulanka", "Turku", "Tornio", "Haparanda"};

        String[] routeDesc = {"Enjoy the rapids when you arrive", "defult text I dont know what to write on it", "defult text I dont know what to write on it", "defult text I dont know what to write on it", "defult text I dont know what to write on it", "defult text I dont know what to write on it",
                "defult text I dont know what to write on it", "defult text I dont know what to write on it", "defult text I dont know what to write on it",
                "default text I dont know what to write on it", "defult text I dont know what to write on it", "defult text I dont know what to write on it"};

        CustomList adapter = new CustomList(this.getActivity(), routeName, routeDesc);

        ListView listViewC = (ListView) view.findViewById(R.id.cs_rout_list);
        listViewC.setAdapter(adapter);
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


}
