package routify.routify;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] rName;
    private final String[] rDesc;
    public CustomList(Activity context, String[] rName, String[] rDesc) {
        super(context, R.layout.list_view, rName);
        this.context = context;
        this.rName = rName;
        this.rDesc = rDesc;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_view, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.routName);

        TextView txtTitle2 = (TextView) rowView.findViewById(R.id.routDesc);
        txtTitle.setText(rName[position]);
        txtTitle2.setText(rDesc[position]);

        return rowView;
    }
}
