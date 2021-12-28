package checkradio;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class Check_radioController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox chkDosa;

    @FXML
    private CheckBox chkBurger;

    @FXML
    private CheckBox chkMan;

    @FXML
    private RadioButton rad10;

    @FXML
    private ToggleGroup discount;

    @FXML
    private RadioButton rad20;

    @FXML
    private Button btnBill;

    @FXML
    private Label lblTotal;

    @FXML
    private Label lblNet;
    
    @FXML // fx:id="chkAll"
    private CheckBox chkAll; // Value injected by FXMLLoader
    

    @FXML
    void doChkUncheckAll(ActionEvent event)
    {
    		/*if(chkAll.isSelected())
    		{
    			chkDosa.setSelected(true);
    		}
    		else
    			chkDosa.setSelected(false);*/
    	chkDosa.setSelected(chkAll.isSelected());
    	chkMan.setSelected(chkAll.isSelected());
    	chkBurger.setSelected(chkAll.isSelected());
    	
    			
    }
    
    int total,dis,net;
    @FXML
    void doBill(ActionEvent event) 
    {
    	total=0;
    	if(chkDosa.isSelected()==true)
    		total=total+100;
    	if(chkBurger.isSelected()==true)
    		total=total+60;
    	if(chkMan.isSelected()==true)
    		total=total+200;
    	
    	if(rad10.isSelected()==true)
    		dis=total*10/100;
    	else
    		if(rad20.isSelected()==true)
    		dis=total*20/100;
    	
    	net=total-dis;
    	
    	lblTotal.setText(total+"");
    	lblNet.setText(String.valueOf(net));	

    }

    @FXML
    void doRad10(ActionEvent event) {
    	  btnBill.setDisable(false);
    }
    @FXML
    void initialize() {
        btnBill.setDisable(true);
        
    }
}
