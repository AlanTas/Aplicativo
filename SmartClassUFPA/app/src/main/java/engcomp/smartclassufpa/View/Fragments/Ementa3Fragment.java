package engcomp.smartclassufpa.View.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import engcomp.smartclassufpa.R;

/**
 * Created by Rosa on 18/02/2017.
 */

public class Ementa3Fragment extends Fragment {
    public Ementa3Fragment(){}

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceBundle) {
        return inflater.inflate(R.layout.ementa_3_bloco,container, false);
    }

}
