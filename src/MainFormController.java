import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class MainFormController {
    public RadioButton rBtnFemale;
    public RadioButton rBtnMale;
    public TextField txtGender;
    public CheckBox chbPhp;
    public CheckBox cbxJavaScript;
    public CheckBox cbxRuby;
    public CheckBox cbxKotlin;
    public TextField txtSelectedLanguage;
    public CheckBox cbxPhp;

    public void submitOnAction(ActionEvent actionEvent) {

         String gender="Male";
        if(rBtnFemale.isSelected()){
            gender="Female";
        }
        txtGender.setText(gender);
    }

    public void showLanguagesOnAction(ActionEvent actionEvent) {

        txtSelectedLanguage.clear();
        String[] languages=new String[4];

        if(cbxJavaScript.isSelected()) languages[0]="JavaScript";
        if(cbxKotlin.isSelected()) languages[1]="Kotlin";
        if (cbxRuby.isSelected()) languages[2]="Ruby";
        if(cbxPhp.isSelected()) languages[3]="PHP";

        String  selectedLanguage=" ";
        for(String lang:languages){
            if(lang!=null){
                selectedLanguage+=" "+lang;
            }
        }

        txtSelectedLanguage.setText(selectedLanguage);

    }
}
