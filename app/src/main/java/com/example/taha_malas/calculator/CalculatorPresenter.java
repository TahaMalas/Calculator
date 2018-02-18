package com.example.taha_malas.calculator;

/**
 * Created by taha.m on 2/18/18.
 */

public class CalculatorPresenter implements CalculatorContract.DisplayPresenter, CalculatorContract.InputPresenter {

    private CalculatorContract.View viewInterface;

                                //We're passing the DisplayFragment
                                //Which implements the ViewInterface
    public CalculatorPresenter(CalculatorContract.View viewInterface) {
        this.viewInterface = viewInterface;
    }

    @Override
    public void onShortClearClicked() {

    }

    @Override
    public void onLongClearClicked() {

    }

    @Override
    public void onNumberClicked(int number) {

    }

    @Override
    public void onDecimalClicked() {

    }

    @Override
    public void onOperatorClicked(String operator) {

    }

    @Override
    public void onEvaluateClicked() {

    }
}
