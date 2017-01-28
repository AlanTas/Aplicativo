package engcomp.smartclassufpa;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by alan on 27/01/17.
 */

public class FotosListaAdapter extends BaseAdapter {


    private Activity activity;
    private ArrayList<String> arrayList;
    private String[] dados;
    private static LayoutInflater inflater=null;

    public FotosListaAdapter(Activity activity, ArrayList<String> arrayList, String[] dados) {
        this.activity = activity;
        this.arrayList = arrayList;
        this.dados = dados;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        System.out.println("fez2");
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            view = inflater.inflate(R.layout.elemento_lista_fotos, parent, false);
            System.out.println("nfez");
        }

        TextView title = (TextView)view.findViewById(R.id.materia); // title

        title.setText(dados[position]);
        System.out.println("fez");
        return view;
    }


    public int getCount(){
        return dados.length;
    }

    public Object getItem(int position) {
        return dados[position];
    }

    public long getItemId(int position) {
        return position;
    }


}

