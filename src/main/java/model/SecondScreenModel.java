package model;

import java.util.List;

public class SecondScreenModel{
    private SpinnerMy spinnerMy;
    private List<TextsMy> textsMy;
    private List<CheckboxMy> checkboxMy;
    private List<ButtonsMy> buttonsMy;

    public SpinnerMy getSpinnerMy(){
        return spinnerMy;
    }
    public void setSpinnerMy(SpinnerMy input){
        this.spinnerMy = input;
    }
    public List<TextsMy> getTextsMy(){
        return textsMy;
    }
    public void setTextsMy(List<TextsMy> input){
        this.textsMy = input;
    }
    public List<CheckboxMy> getCheckboxMy(){
        return checkboxMy;
    }
    public void setCheckboxMy(List<CheckboxMy> input){
        this.checkboxMy = input;
    }
    public List<ButtonsMy> getButtonsMy(){
        return buttonsMy;
    }
    public void setButtonsMy(List<ButtonsMy> input){
        this.buttonsMy = input;
    }
}


