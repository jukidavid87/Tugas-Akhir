/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import static javafx.scene.input.KeyCode.S;

/**
 * FXML Controller class
 *
 * @author DAVID
 */
public class desainController implements Initializable {

     @FXML
    private Label cancel;

    @FXML
    private Label cafenama;

    @FXML
    private Button sweet;

    @FXML
    private Button fast;

    @FXML
    private Button ice;

    @FXML
    private Button coffee;

    @FXML
    private Button ipok;

    @FXML
    private Button bread;

    @FXML
    private Button noodle;

    @FXML
    private Label prosestrans;

    @FXML
    private Label tulisantotal;

    @FXML
    private Label jumlah;

    @FXML
    private Label kembali;

    @FXML
    private Button submitaja;

    @FXML
    private TextField kolomtotal;

    @FXML
    private TextField kolomjumlah;

    @FXML
    private TextField kolomkembali;

    @FXML
    private Button neworder;

    @FXML
    private TextArea areajenis;
    
    @FXML
    private JFXTextField beli1;

    @FXML
    private JFXTextField jenis1;

    @FXML
    private JFXTextField beli2;

    @FXML
    private JFXTextField beli3;

    @FXML
    private JFXTextField beli4;

    @FXML
    private JFXTextField beli5;

    @FXML
    private JFXTextField beli6;

    @FXML
    private JFXTextField beli7;

    @FXML
    private JFXTextField jenis2;

    @FXML
    private JFXTextField jenis3;

    @FXML
    private JFXTextField jenis4;

    @FXML
    private JFXTextField jenis5;

    @FXML
    private JFXTextField jenis6;

    @FXML
    private JFXTextField jenis7;

    @FXML
    private Button pilih;
    
    public String sweet1;
    public String sweet2;
    public String sweet3;
    public String sweet4;
    public String sweet5;
    public int harga1;
    public int harga2;
    public int harga3;
    public int harga4;
    public int harga5;
    
    public String fast1;
    public String fast2;
    public String fast3;
    public String fast4;
    public String fast5;
    
    public String ice1;
    public String ice2;
    public String ice3;
    public String ice4;
    public String ice5;
    
    public String inter1;
    public String inter2;
    public String inter3;
    public String inter4;
    public String inter5;
    
    public String ipok1;
    public String ipok2;
    public String ipok3;
    public String ipok4;
    public String ipok5;
    
    public String bread1;
    public String bread2;
    public String bread3;
    public String bread4;
    public String bread5;
    
    public String mie1;
    public String mie2;
    public String mie3;
    public String mie4;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sweet1="Arum Manis Small";
        harga1=4000;
        
        sweet2="Arum Manis Medium";
        harga2 =9000;
        
        sweet3 ="Lollipop Small";
        harga3 =8000;
        
        sweet4 ="Gula Aren Madu";
        harga4 =12000;
        
        sweet5 ="Candy Candy Ball";
        harga5=12000;
        
        fast1="Burger Biasa";
        harga1=8000;
        
        fast2="Burger Special";
        harga2=12000;
        
        fast3="Hot Dog Biasa";
        harga3=12000;
        
        fast4="Hot Dog Special";
        harga4=18000;
        
        fast5="Spaghetti Biasa";
        harga5=10000;
        
        ice1="Ice Cream Pot Kecil";
        harga1=11000;
        
        ice2="Ice Cream Pot Medium";
        harga2=16000;
        
        ice3="Ice Cream Pot Big";
        harga3=21000;
        
        ice4="Ice Cream Cone";
        harga4=6000;
        
        ice5="Ice Cream Roti";
        harga5=3500;
    
        inter1="Cappucino Italian";
        harga1=7000;
        
        inter2="Coffee Carry";
        harga2=5000;
        
        inter3="MilkShake";
        harga3=10000;
        
        inter4="Fosco Coffee";
        harga4=6500;
        
        inter5="Arabic Coffee";
        harga5=6000;
       
        ipok1="Kopi Hitam Sido Mampir";
        harga1=3000;
        
        ipok2="Ipok Ala Mama";
        harga2=4500;
        
        ipok3="Ipok Jagalan";
        harga3=4000;
        
        ipok4="Susu Buai Buai";
        harga4=5000;
        
        ipok5="Ipok Juanda";
        harga5=5000;
        
        bread1="Roti Ekonomis";
        harga1=4000;
        
        bread2="Roti Lumer Rasa";
        harga2=6000;
        
        bread3="Roti Ban";
        harga3=35000;
        
        bread4="Tart Small";
        harga4=35000;
        
        bread5="Tart Medium";
        harga5=50000;
    
        mie1="Mie Tarik Malang";
        harga1=12000;
        
        mie2="Mie Teco";
        harga2=12000;
               
        mie3="Mie Ramen";
        harga3=12000;
        
        mie4="Mie'Nggat Pedes e";
        harga4=15000;
    }    

    @FXML
    private void areajenis(ActionEvent event) {
    
    }
    
    @FXML
    private void buttonsweet(ActionEvent event) {
       
        areajenis.setText(sweet1+" "+harga1+"\n"+sweet2+" "
        + ""+harga2+"\n"+sweet3+" "+harga3+"\n"+sweet4+" "+harga4+
        "\n"+sweet5+" "+harga5);
    }

    @FXML
    private void buttonfast(ActionEvent event) {
        areajenis.setText(fast2+" "+ ""+harga2+"\n"+fast3+" "+harga3+"\n"+fast4+" "+harga4+
        "\n"+fast5+" "+harga5);
        
        
    }

    @FXML
    private void buttonice(ActionEvent event) {
        areajenis.setText(ice1+" "+harga1+"\n"+ice2+" "
        + ""+harga2+"\n"+ice3+" "+harga3+"\n"+ice4+" "+harga4+
        "\n"+ice5+" "+harga5);
    }

    @FXML
    private void buttoninter(ActionEvent event) {
        areajenis.setText(inter1+" "+harga1+"\n"+inter2+" "
        + ""+harga2+"\n"+inter3+" "+harga3+"\n"+inter4+" "+harga4+
        "\n"+inter5+" "+harga5);
    }

    @FXML
    private void buttonipok(ActionEvent event) {
        areajenis.setText(ipok1+" "+harga1+"\n"+ipok2+" "
        + ""+harga2+"\n"+ipok3+" "+harga3+"\n"+ipok4+" "+harga4+
        "\n"+ipok5+" "+harga5);        
    }

    @FXML
    private void buttonbread(ActionEvent event) {
        areajenis.setText(bread1+" "+harga1+"\n"+bread2+" "
        + ""+harga2+"\n"+bread3+" "+harga3+"\n"+bread4+" "+harga4+
        "\n"+bread5+" "+harga5);  
    }

    @FXML
    private void buttonmie(ActionEvent event) {
        areajenis.setText(mie1+" "+harga1+"\n"+mie2+" "
        + ""+harga2+"\n"+mie3+" "+harga3+"\n"+mie4+" "+harga4);  
    }  
    @FXML
    void buttonpilih(ActionEvent event) {

    }
    @FXML
    void buttonsubmit(ActionEvent event) {
        
        String jenisMakanan1;
        String jenisMakanan2;
        jenisMakanan1=beli1.getText();
        jenisMakanan2=beli2.getText();
        if (jenis1.getText().length()!=0){
        
         }
      
       
         
         
    }
    @FXML
    void buttonnew(ActionEvent event) {

    }

    @FXML
    private void jenisedit(TableColumn.CellEditEvent<?, ?> event) {
    }
    
}
