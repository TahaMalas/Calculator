package com.example.taha_malas.calculator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;


/**
 * A simple {@link Fragment} subclass.
 */
public class DisplayFragment extends Fragment implements CalculatorContract.View {

    private CalculatorContract.DisplayPresenter displayPresenter;

    public void setDisplayPresenter(CalculatorContract.DisplayPresenter displayPresenter) {
        this.displayPresenter = displayPresenter;
    }

    @BindView(R.id.tv_result)
    TextView resultTV;

    @OnClick(R.id.imb_delete)
    public void onDeleteShortClicked (View v) {
        displayPresenter.onShortClearClicked();
    }

    @OnLongClick(R.id.imb_delete)
    public void onDeleteLongClicked (View v) {
        displayPresenter.onLongClearClicked();
    }

    public DisplayFragment() {
        // Required empty public constructor
    }

    public static DisplayFragment newInstance (){
        return new DisplayFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_display, container, false);
        ButterKnife.bind(this, v);
        return v;
    }

    @Override
    public void showResult(String result) {
        resultTV.setText(result);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(getActivity(), error, Toast.LENGTH_SHORT).show();
    }
}
