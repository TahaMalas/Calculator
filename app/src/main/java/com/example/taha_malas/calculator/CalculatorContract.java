package com.example.taha_malas.calculator;

/**
 * Created by taha.m on 2/18/18.
 */

public interface CalculatorContract {

    //Our view handles theses methods
    interface View {
        void showResult(String result);

        void showError(String error);
    }

    //passes click events from the View(DisplayFragment) to the Presenter
    interface DisplayPresenter {
        void onShortClearClicked();

        void onLongClearClicked();
    }

    //passes click events from th View(InputFragment) to the Presenter
    interface InputPresenter {
        void onNumberClicked(int number);

        void onDecimalClicked();

        void onOperatorClicked(String operator);

        void onEvaluateClicked();
    }
}
