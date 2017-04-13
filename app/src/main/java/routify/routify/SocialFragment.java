package routify.routify;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

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
       // CustomList adapter = new CustomList(getActivity(), routeName, routeDesc);
        //ListView listViewA = (ListView) getView().findViewById(R.id.rout_list);
        //listViewA.setAdapter(adapter);

        //final Button buttA = (Button) getView().findViewById(R.id.create_reviews_button);


        //listViewA.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            //public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
          //      Toast.makeText(getContext(), "This should fetch route. " /*+ routeName + position*/, Toast.LENGTH_SHORT).show();

        //    }
        //});

        //buttA.setOnClickListener(new View.OnClickListener() {
          //  public void onClick(View v) {
          //      Toast.makeText(getContext(), " Extra Functionality Button ", Toast.LENGTH_SHORT).show();
            //}
        //});
    }
}