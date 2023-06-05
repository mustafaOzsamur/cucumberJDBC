package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.JDBCReusableMethods;
import utilities.Manage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static utilities.JDBCReusableMethods.getStatement;

public class Stepdefinition {

    String query;
    ResultSet rs;
    ResultSet rs1;

    String query1;

    int flag;

Manage manage=new Manage();

    Statement st;

    @Given("DataBase baglantisi kurulur")
    public void data_base_baglantisi_kurulur() {

        JDBCReusableMethods.createConnection();
    }
    @Given("Query Hazirlanir")
    public void query_hazirlanir() {
     query="Select charge_id From heallife_hospitaltraining.ambulance_call Where patient_id=1 AND driver='Smith';";
    }
    @Given("Query calistirilir ve sonuclari alinir")
    public void query_calistirilir_ve_sonuclari_alinir() throws SQLException {
        Statement st= getStatement();

         rs= getStatement().executeQuery(query);

    }
    @Given("Query sonuclari dogrulanir")
    public void query_sonuclari_dogrulanir() throws SQLException {
    int expectedData=2;
    flag=0;
    while (rs.next());{
     flag++;
        }

        Assert.assertEquals(expectedData,flag);

    }
    @Given("DataBase baglantisi kapatilir")
    public void data_base_baglantisi_kapatilir() {

        JDBCReusableMethods.closeConnection();
    }

    //--------------------------------------------------------

    @Given("Update Query'si hazirlanir")
    public void update_query_si_hazirlanir() {
    query1="insert into heallife_hospitaltraining.appointment (priority,specialist,doctor,amount,message,appointment_status,source,is_opd,is_ipd,live_consult) values (1,2,2,0,'hello','approved','OFFline','no','yes','yes');";


    }
    @Given("Sonuclar alinir ve dogrulanir")
    public void sonuclar_alinir_ve_dogrulanir() throws SQLException {
        int sonuc=JDBCReusableMethods.getStatement().executeUpdate(query1);


       int verify=0;
       if (sonuc>0){
           verify++;
       }
        Assert.assertEquals(verify,1);
    }

    // -------------------------------------------------------------------------


    @Given("Randevu sayilarini ogrenebilecegimiz sqi querysi hazirlanir")
    public void randevu_sayilarini_ogrenebilecegimiz_sqi_querysi_hazirlanir() {




    }
    @Given("Query calistirilir ve sonuclar dogrulanir")
    public void query_calistirilir_ve_sonuclar_dogrulanir() throws SQLException {
    rs=getStatement().executeQuery(manage.getQuerySabah());

    rs.next();

        System.out.println(rs.getInt(1));
        int sabahRandevulari= rs.getInt(1);


        rs1=getStatement().executeQuery(manage.getQueryAksam());

        rs1.next();

        System.out.println(rs1.getInt(1));
                int aksamRandevulari=rs1.getInt(1);


                Assert.assertTrue(sabahRandevulari<aksamRandevulari);


    }





}
