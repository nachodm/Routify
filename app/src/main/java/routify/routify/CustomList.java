package routify.routify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomList extends ArrayAdapter<String>{
    private final Context context;
    private final String[] rName;
    private final String[] rDesc;
    public CustomList(Context context, String[] rName, String[] rDesc) {
        super(context, R.layout.list_view, rName);
        this.context = context;
        this.rName = rName;
        this.rDesc = rDesc;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView= inflater.inflate(R.layout.list_view, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.routName);

        TextView txtTitle2 = (TextView) rowView.findViewById(R.id.routDesc);
        txtTitle.setText(rName[position]);
        txtTitle2.setText(rDesc[position]);
        return rowView;
    }
}
