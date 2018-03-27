package cicr.com.locale.Gallary;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import cicr.com.locale.Adapter.GlobalClass;
import cicr.com.locale.R;

import static cicr.com.locale.R.id.dismiss;

public class BrandOption extends Activity {

    String brand_bold,brand_bold1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_brand_option);
        setContentView(R.layout.activity_brand_option);
        String insecticide_brand = getIntent().getStringExtra("insecticide_brand");

        TextView txttt,row2text21,row2text22,row2text23,row2text24,row2text25,row2text26,row2text27,
                row3text31,row3text32,row3text33,row3text34,row3text35,row3text36,row3text37,
                row4text41,row4text42,row4text43,row4text44,row4text45,row4text46,row4text47,
                row5text51,row5text52,row5text53,row5text54,row5text55,row5text56,row5text57,
                row6text61,row6text62,row6text63,row6text64,row6text65,row6text66,row6text67,
                row7text71,row7text72,row7text73,row7text74,row7text75,row7text76,row7text77,
                row8text81,row8text82,row8text83,row8text84,row8text85,row8text86,row8text87,
                row9text91,row9text92,row9text93,row9text94,row9text95,row9text96,row9text97,
                row10text101,row10text102,row10text103,row10text104,row10text105,row10text106,row10text107,
                row11text116,row12text126,row13text136,row14text146,row15text156,row16text166,row17text176;
        Button backbutton = (Button) findViewById(R.id.back);
        txttt = (TextView) findViewById(R.id.title);
        row2text21 = (TextView) findViewById(R.id.row2text21);
        row2text22 = (TextView) findViewById(R.id.row2text22);
        row2text23 = (TextView) findViewById(R.id.row2text23);
        row2text24 = (TextView) findViewById(R.id.row2text24);
        row2text25 = (TextView) findViewById(R.id.row2text25);
        row2text26 = (TextView) findViewById(R.id.row2text26);
       // row2text27 = (TextView) findViewById(R.id.row2text27);
        row3text31 = (TextView) findViewById(R.id.row3text31);
        row3text32 = (TextView) findViewById(R.id.row3text32);
        row3text33 = (TextView) findViewById(R.id.row3text33);
        row3text34 = (TextView) findViewById(R.id.row3text34);
        row3text35 = (TextView) findViewById(R.id.row3text35);
        row3text36 = (TextView) findViewById(R.id.row3text36);
        //row3text37 = (TextView) findViewById(R.id.row3text37);
        row4text41 = (TextView) findViewById(R.id.row4text41);
        row4text42 = (TextView) findViewById(R.id.row4text42);
        row4text43 = (TextView) findViewById(R.id.row4text43);
        row4text44 = (TextView) findViewById(R.id.row4text44);
        row4text45 = (TextView) findViewById(R.id.row4text45);
        row4text46 = (TextView) findViewById(R.id.row4text46);
        //row4text47 = (TextView) findViewById(R.id.row4text47);
        row5text51 = (TextView) findViewById(R.id.row5text51);
        row5text52 = (TextView) findViewById(R.id.row5text52);
        row5text53 = (TextView) findViewById(R.id.row5text53);
        row5text54 = (TextView) findViewById(R.id.row5text54);
        row5text55 = (TextView) findViewById(R.id.row5text55);
        row5text56 = (TextView) findViewById(R.id.row5text56);
        //row5text57 = (TextView) findViewById(R.id.row5text57);
        row6text61 = (TextView) findViewById(R.id.row6text61);
        row6text62 = (TextView) findViewById(R.id.row6text62);
        row6text63 = (TextView) findViewById(R.id.row6text63);
        row6text64 = (TextView) findViewById(R.id.row6text64);
        row6text65 = (TextView) findViewById(R.id.row6text65);
        row6text66 = (TextView) findViewById(R.id.row6text66);
//        row6text67 = (TextView) findViewById(R.id.row6text67);
        row7text71 = (TextView) findViewById(R.id.row7text71);
        row7text72 = (TextView) findViewById(R.id.row7text72);
        row7text73 = (TextView) findViewById(R.id.row7text73);
        row7text74 = (TextView) findViewById(R.id.row7text74);
        row7text75 = (TextView) findViewById(R.id.row7text75);
        row7text76 = (TextView) findViewById(R.id.row7text76);
//        row7text77 = (TextView) findViewById(R.id.row7text77);
        row8text81 = (TextView) findViewById(R.id.row8text81);
        row8text82 = (TextView) findViewById(R.id.row8text82);
        row8text83 = (TextView) findViewById(R.id.row8text83);
        row8text84 = (TextView) findViewById(R.id.row8text84);
        row8text85 = (TextView) findViewById(R.id.row8text85);
        row8text86 = (TextView) findViewById(R.id.row8text86);
//        row8text87 = (TextView) findViewById(R.id.row8text87);
        row9text91 = (TextView) findViewById(R.id.row9text91);
        row9text92 = (TextView) findViewById(R.id.row9text92);
        row9text93 = (TextView) findViewById(R.id.row9text93);
        row9text94 = (TextView) findViewById(R.id.row9text94);
        row9text95 = (TextView) findViewById(R.id.row9text95);
        row9text96 = (TextView) findViewById(R.id.row9text96);
//        row9text97 = (TextView) findViewById(R.id.row9text97);
        row10text101 = (TextView) findViewById(R.id.row10text101);
        row10text102 = (TextView) findViewById(R.id.row10text102);
        row10text103 = (TextView) findViewById(R.id.row10text103);
        row10text104 = (TextView) findViewById(R.id.row10text104);
        row10text105 = (TextView) findViewById(R.id.row10text105);
        row10text106 = (TextView) findViewById(R.id.row10text106);
//        row10text107 = (TextView) findViewById(R.id.row10text107);
        row11text116 = (TextView) findViewById(R.id.row11text116);




        // Calling Application class (see application tag in AndroidManifest.xml)
        final GlobalClass globalVariable = (GlobalClass) getApplicationContext();
        // Get Title from global/application context
        final String Title = globalVariable.getTitle();

        if (Title.equals("Aphid")) {
            txttt.setText("The identified Pest is aphid");
            String currentbrand;
            switch (insecticide_brand) {
                case "FLONICAMID 50% WG": {
                    row2text21.setText(Html.fromHtml("FLONICAMID 50% WG"));
                    currentbrand = getString(R.string.FLONICAMID_50_WG_ap);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Ulala <br> Panama </b>"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                } case "DIAFENTHIURON 50%WP": {
                    row2text21.setText(Html.fromHtml("DIAFENTHIURON 50%WP"));
                    currentbrand = getString(R.string.DIAFENTHIURON_50_WP_ap);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Alero </B>(Sumil)<br><B> Derby </B>(BioStadt)<br><B> Ferotia </B>(Coromandel)<br><B> Krijet/Krijet Super </B>(KR)<br><B> Logo/Gama </B>(IIL)<br><B> Polo/Pegasus </B>(Syngenta)<br><B> Ruby/Declare </B>(GSP)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                } case "THIAMETHOXAM 25% WG": {
                    row2text21.setText(Html.fromHtml("THIAMETHOXAM 25% WG"));
                    currentbrand = getString(R.string.THIAMETHOXAM_25_WG_ap);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Abhedh </b>(Amber)<br><b> Actara </b>(Syngenta)<br><b> Actor </b>(Kilpest)<br><b> Agrostar </b>(AOL)<br><b> Areva </b>(Dhanuka)<br><b> Arrow </b>(IIL)<br><b> Battalion </b>(Swal)<br><b> Click </b>(Indofil)<br><b> Devitara </b>(Devidayal)<br><b> Dxtar </b>(Nagarjuna)<br><b> Evident & Tiomax </b>(BioStadt)<br><b> Extra Super </b>(Crystal)<br><b> Giltara </b>(GIL)<br><b> King Tara </b>(KCS)<br><b> Kri-Oxm </b>(KR)<br><b> Maestro 707 </b>(Sumil)<br><b> Maxima </b>(PI Ind.)<br><b> Maxtara </b>(Vimax)<br><b> Optra </b>(Coromandel)<br><b> Renova </b>(UPL)<br><b> Spike </b>(Sulphur Mills)<br><b> Spora </b>(Atul)<br><b> Super Tara </b>(SuperCSL)<br><b> Tagxone </b>(Tropical)<br><b> Theme </b>(MIL)<br><b> Willoxam </b>(Willowood)<br><b> Wonderex </b>(Excel)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                } case "CARBARYL 50% WP": {
                    row2text21.setText(Html.fromHtml("CARBARYL 50% WP"));
                    currentbrand = getString(R.string.CARBARYL_50_WP_ap);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Devicarb </b>(Devidayal)<br><b> Kavin</b> (KR)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                } case "FENVALERATE 20% EC": {
                    row2text21.setText(Html.fromHtml("FENVALERATE 20% EC"));
                    currentbrand = getString(R.string.FENVALERATE_20_EC_ap);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Devifen 20 </b>(Devidayal)<br><b> Fencot 20 E </b>(Kilpest)<br><b> Fenkill </b>(UPL)<br><b>Fenval 20 EC </b>(Isagro Asia)<br><b> Final 20 </b>(AOL)<br><b> King en </b>(KCS)<br><b> Krifen </b>(KR)<br><b> Tatafen 10 EC </b>(TATA)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                } case "IMIDACLOPRID 17.8% SL": {
                    row2text21.setText(Html.fromHtml("IMIDACLOPRID 17.8% SL"));
                    currentbrand = getString(R.string.IMADACLOPRID_17_8_SL_ap);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Atom </b>(Indofil)<br><b> Chemida </b>(Cheminova)<br><b> Confidor </b>(Bayer)<br><b> Courage </b>(MIL)<br><b> Crop Mida </b>(NACL)<br><b> Expert 100 </b>(Sumil)<br><b> Farrata </b>(Canary)<br><b> Hilmida </b>(HIL)<br><b> Hotshot </b>(Sulphur Mills)<br><b> Imida Gold </b>(UPL)<br><b> Imidacel </b>(Excel)<br><b> Imidastar </b>(Swal)<br><b> Imiden </b>(Dow)<br><b> Imidore </b>(CCIL)<br><b> Imigrow </b>(CLSL)<br><b> Josh </b>(KR)<br><b> Jumbo </b>(PI Ind.)<br><b> Kildor </b>(Kilpest)<br><b> King Dor </b>(KCS)<br><b> Leopard </b>(Willowood)<br><b> Media </b>(Dhanuka)<br><b> Mida </b>(Nagarjuna)<br><b> Midas </b>(AOL)<br><b> Midas 2000 </b>(Devidayal)<br><b> Parrymida </b>(Coromandel)<br><b> Radiant </b>(PCCPL)<br><b> Ribo </b>(Atul)<br><b> Sacdor </b>(Shivalik)<br><b> Seamer </b>(DuPont)<br><b> Sumida </b>(SuperCSL)<br><b> Tatamida </b>(TATA)<br><b> Tropical Magic </b>(Tropical)<br><b> Ultimo </b>(BioStadt)<br><b> Victor </b>(IIL)<br><b> V-Mida </b>(Vimax)."));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                } case "CHLORPYRIFOS 20% EC": {
                    row2text21.setText(Html.fromHtml("CHLORPYRIFOS 20% EC"));
                    currentbrand = getString(R.string.CHLORPYRIFOS_20_EC_ap);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>All-Drin </b>(Ambuja)<br><b> Banest 20 </b>(Arysta)<br><b> Chloroban </b>(UPL)<br><b> Chlorocil </b>(GSP)<br><b> ChloroKing </b>(KCS)<br><b> Classic-20 </b>(Cheminova)<br><b> Crop Chlor </b>(NACL)<br><b>Dangal </b>(Canary)<br><b> Deviban 20 </b>(Devidayal)<br><b> Dursban </b>(Dow)<br><b> Gilphos </b>(GIL)<br><b>Gold Ban </b>(CCIL)<br><b> Hilban 20 </b>(HIL)<br><b> Hyban </b>(HCL)<br><b> Kaman / Eldrin TC </b>(Crystal)<br><b> Kartoos </b>(Amber)<br><b> Kattar 20 </b>(GKR)<br><b> Krishan 20 </b>(KR)<br><b> Lethal 20 EC </b>(IIL)<br><b>Lynch </b>(PCCPL)<br><b> Megaban </b>(MIL)<br><b> Mig-20 </b>(Kilpest)<br><b> Potta </b>(AOL)<br><b> Pyriban </b>(Aimco)<br><b> Pyrifex </b>(Safex)<br><b> Pyrifex </b>(Safex)<br><b> Sacban </b>(Shivalik)<br><b> Shreeban TC </b>(SKSCC)<br><b> Starban </b>(Swal)<br><b> Strike 20EC </b>(BioStadt)<br><b> Sulban </b>(SulphurMills)<br><b>Suldrin </b>(SuperCSL)<br><b> Tafaban </b>(TATA)<br><b> Tagban </b>(Tropical)<br><b> Tricel 20 </b>(Excel)<br><b> Trishul </b>(Coromandel)<br><b> Uno 501 </b>(Sumil)<br><b> Veermet </b>(Vimax)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                } case "ACETAMIPRID 20% SP": {
                    row2text21.setText(Html.fromHtml("ACETAMIPRID 20% SP"));
                    currentbrand = getString(R.string.ACETAMIPRID_20_SP_ap);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Acelon </b>(CAPL)<br><b> Aceta </b>(UPL)<br><b> Acetacel </b>(Excel)<br><b> Active </b>(Devidayal)<br><b> Albis </b>(Atul)<br><b> Antenna </b>(Willowood)<br><b> Armour </b>(Advance)<br><b> Award </b>(MIL)<br><b> Crop Pride </b>(NACL)<br><b> Dhan Preet </b>(Dhanuka)<br><b>Echo 797 </b>(Sumil)<br><b> Ekka </b>(KR)<br><b> Ennova </b>(Nagarjuna)<br><b> Glide </b>(Safex)<br><b> Hilprid </b>(HIL)<br><b> King Prid </b>(KCS)<br><b> Lift </b>(Indofil)<br><b> Manik </b>(TATA)<br><b> Molprid </b>(GP)<br><b> Nize </b>(GSP)<br><b> Patron </b>(PCCPL)<br><b> Pounce </b>(FMC)<br><b> Prima </b>(Sulphur Mills)<br><b> Proud </b>(Kilpest)<br><b> Quick </b>(CLSL)<br><b> Rapid </b>(Crystal)<br><b> Rekord </b>(DuPont)<br><b>Scuba </b>(Coromandel)<br><b> Sharp </b>(IIL)<br><b> Shourya </b>(Amber)<br><b> Stona </b>(Vimax)<br><b> SuPride </b>(SuperCSL)<br><b> Tada </b>(CGI)<br><b> Tagride </b>(Tropical)<br><b> Wapkil & Rider </b>(BioStadt)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                } case "DELTAMETHRIN 2.8% EC": {
                    row2text21.setText(Html.fromHtml("DELTAMETHRIN 2.8% EC"));
                    currentbrand = getString(R.string.DELTAMETHRIN_2_8_EC_ap);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Decis 2.8 </b>(Bayer)<br> <b>Shastra </b>(Devidayal)<br> <b>Tagcis 100 </b>(Tropical)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                } case "MONOCROTOPHOS 36% SL": {
                    row2text21.setText(Html.fromHtml("MONOCROTOPHOS 36% SL"));
                    currentbrand = getString(R.string.MONOCROTOPHOS_36_SL_ap);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Admono </b>(Advance)<br><b> Crop Mono </b>(NACL)<br><b> Crotocel </b>(Excel)<br><b> Devimono </b>(Devidayal)<br><b> Hilcron </b>(HIL)<br><b> Kevin 360 </b>(Sumil)<br><b> Kilphex 36% </b>(Kilpest)<br><b> King Phos </b>(KCS)<br><b> Luphos </b>(Crystal)<br><b> Macrophos </b>(Tropical)<br><b> Megamono </b>(MIL)<br><b> Monocil </b>(IIL)<br><b>  Monocip </b>(Vimax)<br><b> Monofos 36 </b>(Safex)<br><b> Monogil </b>(GIL)<br><b> Monostar </b>(Swal)<br><b> Monosul </b>(Sulphur Mills)<br><b> Parryfos/Monophos </b>(Coromandel)<br><b> Phoskill </b>(UPL)<br><b> Rasayanphos </b>(KR)<br><b> Shura </b>(PCCPL)<br><b> Sumo </b>(SuperCSL)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                } case "PROFENOFOS 50% EC": {
                    row2text21.setText(Html.fromHtml("PROFENOFOS 50% EC"));
                    currentbrand = getString(R.string.PROFENOPHOS_50_EC_ap);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Ajanta </b>(Coromandel)<br><b> Aurifos </b>(Cheminova)<br><b> Bahadur 201- 40% </b>(Sumil)<br><b>Banjo </b>(IIL)<br><b> Carina </b>(PI Ind.)<br><b> Celcron </b>(Excel)<br><b> Curacron </b>(Syngenta)<br><b> Devi-soldier </b>(Devidayal)<br><b> Hilfos </b>(HIL)<br><b> Jashn </b>(TATA)<br><b> Kilcron </b>(Crystal)<br><b> King Cron </b>(KCS)<br><b> Kombat </b>(PCCPL)<br><b> Kriphos </b>(KR)<br><b> Laser </b>(Advance)<br><b> Maxcron </b>(Vimax)<br><b> Orax </b>(Atul)<br><b> Prahar & Prudent </b>(BioStadt)<br><b> Profax </b>(AOL)<br><b> Profenofos 50 EC </b>(GAICL)<br><b> Profex </b>(Nagarjuna)<br><b> Profos </b>(Sulphur Mills)<br><b> Proven </b>(MIL)<br><b> Simcron </b>(GSP)<br><b> Sucron </b>(SuperCSL)<br><b> Tagpro </b>(Tropical)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                } case "BUPROFEZIN 25% SC": {
                    row2text21.setText(Html.fromHtml("BUPROFEZIN 25% SC"));
                    currentbrand = getString(R.string.BUPROFEZIN_25_SC_ap);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Applaud </b>(TATA)<br><b> Apple </b>(Dhanuka)<br><b> Awaksh </b>(Amber)<br><b> Banzo </b>(BioStadt)<br><b>Benj </b>(Nagarjuna)<br><b> Braun 111 </b>(Sumil)<br><b> Bravo </b>(Sulphur Mills)<br><b> Buprostar </b>(MIL)<br><b> Cordon </b>(Advance)<br><b> Deligent </b>(Willowood)<br><b> Devifezin </b>(Devidayal)<br><b> Flotis </b>(Bayer)<br><b> Hillblaze </b>(HIL)<br><b> Irvy </b>(Dow)<br><b> Jantar </b>(Canary)<br><b> Jawaa </b>(DuPont)<br><b> KriMarch </b>(KR)<br><b> Ninja </b>(Coromandel)<br><b> Phentom </b>(IIL)<br><b> PI Bupro </b>(PI Ind.)<br><b> Tagvoltage </b>(Tropical)<br><b> Tribune </b>(Crystal)<br><b> Trust </b>(Swal) "));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                } case "THIACLOPRID 21.7% SC": {
                    row2text21.setText(Html.fromHtml("THIACLOPRID 21.7% SC"));
                    currentbrand = getString(R.string.THIACHLOPRID_21_7_SC_ap);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Alanto </b>(Bayer)<br> <b>Splendour</b> (Cheminova)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                } case "CHLORPYRIFOS 50% + CYPERMETHRIN 5%EC": {
                    row2text21.setText(Html.fromHtml("CHLORPYRIFOS 50% + <br>CYPERMETHRIN 5%EC"));
                    currentbrand = getString(R.string.CHLORPYRIFOS_50_CYPERMETHRIN_5_EC_ap);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Action 505 </b>(Tropical)<br><b> Anth </b>(KR)<br><b> Balio </b>(Atul)<br><b> Cannon </b>(Nagarjuna)<br><b> Catchh </b>(Coromandel)<br><b> Combi King </b>(KCS)<br><b> Cyklon </b>(GSP)<br><b> Double Star </b>(Swal)<br><b> Hamla 550 </b>(Gharda)<br><b> Hilhunter </b>(HIL)<br><b> Koranda 505 </b>(TATA)<br><b> Lethal Super 505 </b>(IIL)<br><b> Lynch + Combi </b>(PCCPL)<br><b> Nagraj 505 </b>(CCIL)<br><b> Nurocomb </b>(Cheminova)<br><b> Panther </b>(Amber)<br><b> Pradhan </b>(Kilpest)<br><b> Sac 505 </b>(Shivalik)<br><b> Sinergy </b>(MIL)<br><b> Super 505 </b>(SuperCSL)<br><b> Super Strong 505 </b>(Sumil)<br><b> Ulka 505 </b>(BioStadt) "));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
            }
        } else if (Title.equals("Whitefly")) {
            txttt.setText("The identified Pest is whitefly");
            String currentbrand;
            switch (insecticide_brand) {
                case "DIAFENTHIURON 50% WP": {
                    row2text21.setText(Html.fromHtml("DIAFENTHIURON 50% WP"));
                    currentbrand = getString(R.string.DIAFENTHIURON_50_WP_wh);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Alero </b>(Sumil)<br><b> Derby </b>(BioStadt)<br><b> Ferotia </b>(Coromandel)<br><b> Krijet/Krijet Super </b>(KR)<br><b> Logo/Gama </b>(IIL)<br><b> Polo/Pegasus </b>(Syngenta)<br><b> Ruby/Declare </b>(GSP)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "BUPROFEZIN 25% SC": {
                    row2text21.setText(Html.fromHtml("BUPROFEZIN 25% SC"));
                    currentbrand = getString(R.string.BUPROFEZIN_25_SC_wh);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Applaud </b>(TATA)<br><b> Apple </b>(Dhanuka)<br><b> Awaksh </b>(Amber)<br><b> Banzo </b>(BioStadt)<br><b> Benj </b>(Nagarjuna)<br><b> Braun 111 </b>(Sumil)<br><b> Bravo </b>(Sulphur Mills)<br><b> Buprostar </b>(MIL)<br><b> Cordon </b>(Advance)<br><b> Deligent </b>(Willowood)<br><b> Devifezin </b>(Devidayal)<br><b> Flotis </b>(Bayer)<br><b> Hillblaze </b>(HIL)<br><b> Irvy </b>(Dow)<br><b> Jantar </b>(Canary)<br><b> Jawaa </b>(DuPont)<br><b> KriMarch </b>(KR)<br><b> Ninja </b>(Coromandel)<br><b> Phentom </b>(IIL)<br><b> PI Bupro </b>(PI Ind.)<br><b> Tagvoltage </b>(Tropical)<br><b> Tribune </b>(Crystal)<br><b> Trust </b>(Swal)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "FLONICAMID 50% WG": {
                    row2text21.setText(Html.fromHtml("FLONICAMID 50% WG"));
                    currentbrand = getString(R.string.FLONICAMID_50WG_wh);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Ulala <br>Panama"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "PYRIPROXYFEN 10% EC": {
                    row2text21.setText(Html.fromHtml("PYRIPROXYFEN 10% EC"));
                    currentbrand = getString(R.string.PYRIPROXYFEN_10_EC_wh);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Daita"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "SPIROMESIFEN 22.9% SC": {
                    row2text21.setText(Html.fromHtml("SPIROMESIFEN 22.9% SC"));
                    currentbrand = getString(R.string.SPIROMESIFEN_22_9_SC_wh);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Oberon </b>(Bayer)<br><b> Voltage </b>(PI Ind.)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "ACETAMIPRID 20% SP": {
                    row2text21.setText(Html.fromHtml("ACETAMIPRID 20% SP"));
                    currentbrand = getString(R.string.ACETAMIPRID_20_SP_wh);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Acelon </b>(CAPL)<br><b> Aceta </b>(UPL)<br><b> Acetacel </b>(Excel)<br><b> Active </b>(Devidayal)<br><b> Albis </b>(Atul)<br><b> Antenna </b>(Willowood)<br><b> Armour </b>(Advance)<br><b> Award </b>(MIL)<br><b> Crop Pride </b>(NACL)<br><b>Dhan Preet </b>(Dhanuka)<br><b>Echo 797 </b>(Sumil)<br><b> Ekka </b>(KR)<br><b> Ennova </b>(Nagarjuna)<br><b> Glide </b>(Safex)<br><b> Hilprid </b>(HIL)<br><b> King Prid </b>(KCS)<br><b> Lift </b>(Indofil)<br><b> Manik </b>(TATA)<br><b>Molprid </b>(GP)<br><b> Nize </b>(GSP)<br><b> Patron </b>(PCCPL)<br><b> Pounce </b>(FMC)<br><b> Prima </b>(Sulphur Mills)<br><b> Proud </b>(Kilpest)<br><b> Quick </b>(CLSL)<br><b> Rapid </b>(Crystal)<br><b> Rekord </b>(DuPont)<br><b> Scuba </b>(Coromandel)<br><b> Sharp </b>(IIL)<br><b> Shourya </b>(Amber)<br><b> Stona </b>(Vimax)<br><b>SuPride </b>(SuperCSL)<br><b> Tada </b>(CGI)<br><b> Tagride </b>(Tropical)<br><b> Wapkil & Rider </b>(BioStadt)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "IMIDACLOPRID 17.8% SL": {
                    row2text21.setText(Html.fromHtml("IMIDACLOPRID 17.8% SL"));
                    currentbrand = getString(R.string.IMIDACHLOPRID_17_8_SL_wh);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Atom </b>(Indofil)<br><b> Chemida </b>(Cheminova)<br><b> Confidor </b>(Bayer)<br><b> Courage </b>(MIL)<br><b> Crop Mida </b>(NACL)<br><b> Expert 100 </b>(Sumil)<br><b> Farrata </b>(Canary)<br><b> Hilmida </b>(HIL)<br><b> Hotshot </b>(Sulphur Mills)<br><b> Imida Gold </b>(UPL)<br><b> Imidacel </b>(Excel)<br><b> Imidastar </b>(Swal)<br><b> Imiden </b>(Dow)<br><b> Imidore </b>(CCIL)<br><b> Imigrow </b>(CLSL)<br><b> Josh </b>(KR)<br><b> Jumbo </b>(PI Ind.)<br><b> Kildor </b>(Kilpest)<br><b> King Dor </b>(KCS)<br><b> Leopard </b>(Willowood)<br><b> Media </b>(Dhanuka)<br><b> Mida </b>(Nagarjuna)<br><b> Midas </b>(AOL)<br><b> Midas 2000 </b>(Devidayal)<br><b> Parrymida </b>(Coromandel)<br><b> Radiant </b>(PCCPL)<br><b> Ribo </b>(Atul)<br><b> Sacdor </b>(Shivalik)<br><b> Seamer </b>(DuPont)<br><b> Sumida </b>(SuperCSL)<br><b> Tatamida </b>(TATA)<br><b> Tropical Magic </b>(Tropical)<br><b> Ultimo </b>(BioStadt)<br><b> Victor </b>(IIL)<br><b> V-Mida </b>(Vimax)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "MONOCROTOPHOS 36% SL": {
                    row2text21.setText(Html.fromHtml("MONOCROTOPHOS 36% SL"));
                    currentbrand = getString(R.string.MONOCROTOPHOS_36_SL_wh);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Admono </b>(Advance)<br><b> Crop Mono </b>(NACL)<br><b> Crotocel </b>(Excel)<br><b> Devimono </b>(Devidayal)<br><b> Hilcron </b>(HIL)<br><b> Kevin 360 </b>(Sumil)<br><b> Kilphex 36% </b>(Kilpest)<br><b> King Phos </b>(KCS)<br><b> Luphos </b>(Crystal)<br><b> Macrophos </b>(Tropical)<br><b> Megamono </b>(MIL)<br><b> Monocil </b>(IIL)<br><b>  Monocip </b>(Vimax)<br><b> Monofos 36 </b>(Safex)<br><b> Monogil </b>(GIL)<br><b> Monostar </b>(Swal)<br><b> Monosul </b>(Sulphur Mills)<br><b> Parryfos/Monophos </b>(Coromandel)<br><b> Phoskill </b>(UPL)<br><b> Rasayanphos </b>(KR)<br><b> Shura </b>(PCCPL)<br><b> Sumo </b>(SuperCSL)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "PROFENOFOS 50% EC": {
                    row2text21.setText(Html.fromHtml("PROFENOFOS 50% EC"));
                    currentbrand = getString(R.string.PROFENOPHOS_50_EC_wh);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Ajanta </b>(Coromandel)<br><b> Aurifos </b>(Cheminova)<br><b> Bahadur 201- 40% </b>(Sumil)<br><b> Banjo </b>(IIL)<br><b> Carina </b>(PI Ind.)<br><b> Celcron </b>(Excel)<br><b> Curacron </b>(Syngenta)<br><b> Devi-soldier </b>(Devidayal)<br><b> Hilfos </b>(HIL)<br><b> Jashn </b>(TATA)<br><b> Kilcron </b>(Crystal)<br><b> King Cron </b>(KCS)<br><b> Kombat </b>(PCCPL)<br><b> Kriphos </b>(KR)<br><b> Laser </b>(Advance)<br><b> Maxcron </b>(Vimax)<br><b> Orax </b>(Atul)<br><b> Prahar & Prudent </b>(BioStadt)<br><b> Profax </b>(AOL)<br><b> Profenofos 50 EC </b>(GAICL)<br><b> Profex </b>(Nagarjuna)<br><b> Profos </b>(Sulphur Mills)<br><b>Proven </b>(MIL)<br><b> Simcron </b>(GSP)<br><b> Sucron </b>(SuperCSL)<br><b> Tagpro </b>(Tropical)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "THIAMETHOXAM 25% WG": {
                    row2text21.setText(Html.fromHtml("THIAMETHOXAM 25% WG"));
                    currentbrand = getString(R.string.THIAMETHOXAM_25_WG_wh);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Abhedh </b>(Amber)<br><b> Actara </b>(Syngenta)<br><b> Actor </b>(Kilpest)<br><b> Agrostar </b>(AOL)<br><b> Areva </b>(Dhanuka)<br><b> Arrow </b>(IIL)<br><b> Battalion </b>(Swal)<br><b> Click </b>(Indofil)<br><b> Devitara </b>(Devidayal)<br><b> Dxtar </b>(Nagarjuna)<br><b> Evident & Tiomax </b>(BioStadt)<br><b>Extra Super </b>(Crystal)<br><b> Giltara </b>(GIL)<br><b> King Tara </b>(KCS)<br><b> Kri-Oxm </b>(KR)<br><b>Maestro 707 </b>(Sumil)<br><b> Maxima </b>(PI Ind.)<br><b> Maxtara </b>(Vimax)<br><b> Optra </b>(Coromandel)<br><b> Renova </b>(UPL)<br><b> Spike </b>(Sulphur Mills)<br><b> Spora </b>(Atul)<br><b> Super Tara </b>(SuperCSL)<br><b> Tagxone </b>(Tropical)<br><b> Theme </b>(MIL)<br><b> Willoxam </b>(Willowood)<br><b> Wonderex </b>(Excel)s"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "CHLORPYRIFOS 50% + CYPERMETHRIN 5%EC": {
                    row2text21.setText(Html.fromHtml("CHLORPYRIFOS 50% +<br> CYPERMETHRIN 5%EC"));
                    currentbrand = getString(R.string.CHLORPYRIFOS_50_CYPERMETHRIN_5_EC_wh);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Action 505 </b>(Tropical)<br><b> Anth </b>(KR)<br><b> Balio </b>(Atul)<br><b> Cannon </b>(Nagarjuna)<br><b> Catchh </b>(Coromandel)<br><b> Combi King </b>(KCS)<br><b> Cyklon </b>(GSP)<br><b> Double Star </b>(Swal)<br><b> Hamla 550 </b>(Gharda)<br><b> Hilhunter </b>(HIL)<br><b> Koranda 505 </b>(TATA)<br><b> Lethal Super 505 </b>(IIL)<br><b> Lynch + Combi </b>(PCCPL)<br><b> Nagraj 505 </b>(CCIL)<br><b> Nurocomb </b>(Cheminova)<br><b> Panther </b>(Amber)<br><b> Pradhan </b>(Kilpest)<br><b> Sac 505 </b>(Shivalik)<br><b> Sinergy </b>(MIL)<br><b> Super 505 </b>(SuperCSL)<br><b> Super Strong 505 </b>(Sumil)<br><b> Ulka 505 </b>(BioStadt)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "CHLORPYRIFOS 20% EC": {
                    row2text21.setText(Html.fromHtml("CHLORPYRIFOS 20% EC"));
                    currentbrand = getString(R.string.CHLORPYRIFOS_20_EC_wh);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>All-Drin </b>(Ambuja)<br><b> Banest 20 </b>(Arysta)<br><b> Chloroban </b>(UPL)<br><b> Chlorocil </b>(GSP)<br><b> ChloroKing </b>(KCS)<br><b> Classic-20 </b>(Cheminova)<br><b> Crop Chlor </b>(NACL)<br><b> Dangal </b>(Canary)<br><b> Deviban 20 </b>(Devidayal)<br><b> Dursban </b>(Dow)<br><b> Gilphos </b>(GIL)<br><b>Gold Ban </b>(CCIL)<br><b> Hilban 20 </b>(HIL)<br><b> Hyban </b>(HCL)<br><b> Kaman / Eldrin TC </b>(Crystal)<br><b> Kartoos </b>(Amber)<br><b> Kattar 20 </b>(GKR)<br><b> Krishan 20 </b>(KR)<br><b> Lethal 20 EC </b>(IIL)<br><b>Lynch </b>(PCCPL)<br><b> Megaban </b>(MIL)<br><b> Mig-20 </b>(Kilpest)<br><b> Potta </b>(AOL)<br><b> Pyriban </b>(Aimco)<br><b> Pyrifex </b>(Safex)<br><b> Pyrifex </b>(Safex)<br><b> Sacban </b>(Shivalik)<br><b> Shreeban TC </b>(SKSCC)<br><b> Starban </b>(Swal)<br><b> Strike 20EC </b>(BioStadt)<br><b> Sulban </b>(SulphurMills)<br><b> Suldrin </b>(SuperCSL)<br><b> Tafaban </b>(TATA)<br><b> Tagban </b>(Tropical)<br><b> Tricel 20 </b>(Excel)<br><b> Trishul </b>(Coromandel)<br><b> Uno 501 </b>(Sumil)<br><b> Veermet </b>(Vimax)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "DELTAMETHRIN 2.8% EC": {
                    row2text21.setText(Html.fromHtml("DELTAMETHRIN 2.8% EC"));
                    currentbrand = getString(R.string.Deltamethrin_2_8_EC_wh);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Decis 2.8</b> (Bayer)<br><b> Shastra</b> (Devidayal)<br> <b>Tagcis 100</b> (Tropical)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }


            }
        } else if (Title.equals("Jassid")) {
            txttt.setText("The identified Pest is jassid");
            String currentbrand;

            switch (insecticide_brand) {
                case "DIAFENTHIURON 50% WP": {
                    row2text21.setText(Html.fromHtml("DIAFENTHIURON 50% WP"));
                    currentbrand = getString(R.string.DIAFENTHIURON_50_WP_ja);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Alero </b>(Sumil)<br><b> Derby </b>(BioStadt)<br><b> Ferotia </b>(Coromandel)<br><b> Krijet/Krijet Super </b>(KR)<br><b> Logo/Gama </b>(IIL)<br><b> Polo/Pegasus </b>(Syngenta)<br><b> Ruby/Declare </b>(GSP)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                } case "FLONICAMID 50% WG": {
                    row2text21.setText(Html.fromHtml("FLONICAMID 50% WG"));
                    currentbrand = getString(R.string.FLONICAMID_50_WG_ja);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Fluton</b> (PI Ind.)<br><b> Suraksha </b>(Nagarjuna)<br><b> Takumi </b>(TATA)."));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "BUPROFEZIN 25% SC": {
                    row2text21.setText(Html.fromHtml("BUPROFEZIN 25% SC"));
                    currentbrand = getString(R.string.BUPROFEZIN_25_SC_ja);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Applaud </b>(TATA)<br><b> Apple </b>(Dhanuka)<br><b> Awaksh </b>(Amber)<br><b> Banzo </b>(BioStadt)<br><b>Benj </b>(Nagarjuna)<br><b> Braun 111 </b>(Sumil)<br><b> Bravo </b>(Sulphur Mills)<br><b> Buprostar </b>(MIL)<br><b> Cordon </b>(Advance)<br><b> Deligent </b>(Willowood)<br><b> Devifezin </b>(Devidayal)<br><b> Flotis </b>(Bayer)<br><b> Hillblaze </b>(HIL)<br><b> Irvy </b>(Dow)<br><b> Jantar </b>(Canary)<br><b> Jawaa </b>(DuPont)<br><b> KriMarch </b>(KR)<br><b> Ninja </b>(Coromandel)<br><b> Phentom </b>(IIL)<br><b> PI Bupro </b>(PI Ind.)<br><b> Tagvoltage </b>(Tropical)<br><b> Tribune </b>(Crystal)<br><b> Trust </b>(Swal)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "IMIDACLOPRID 17.8% SL": {
                    row2text21.setText(Html.fromHtml("IMIDACLOPRID 17.8% SL"));
                    currentbrand = getString(R.string.IMADACLOPRID_17_8_SL_ja);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Atom </b>(Indofil)<br><b> Chemida </b>(Cheminova)<br><b> Confidor </b>(Bayer)<br><b> Courage </b>(MIL)<br><b>Crop Mida </b>(NACL)<br><b> Expert 100 </b>(Sumil)<br><b> Farrata </b>(Canary)<br><b> Hilmida </b>(HIL)<br><b>Hotshot </b>(Sulphur Mills)<br><b> Imida Gold </b>(UPL)<br><b> Imidacel </b>(Excel)<br><b> Imidastar </b>(Swal)<br><b> Imiden </b>(Dow)<br><b> Imidore </b>(CCIL)<br><b> Imigrow </b>(CLSL)<br><b> Josh </b>(KR)<br><b> Jumbo </b>(PI Ind.)<br><b> Kildor </b>(Kilpest)<br><b> King Dor </b>(KCS)<br><b> Leopard </b>(Willowood)<br><b> Media </b>(Dhanuka)<br><b>Mida </b>(Nagarjuna)<br><b> Midas </b>(AOL)<br><b> Midas 2000 </b>(Devidayal)<br><b>Parrymida </b>(Coromandel)<br><b> Radiant </b>(PCCPL)<br><b> Ribo </b>(Atul)<br><b> Sacdor </b>(Shivalik)<br><b>Seamer </b>(DuPont)<br><b> Sumida </b>(SuperCSL)<br><b> Tatamida </b>(TATA)<br><b>Tropical Magic </b>(Tropical)<br><b> Ultimo </b>(BioStadt)<br><b> Victor </b>(IIL)<br><b> V-Mida </b>(Vimax)."));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "THIAMETHOXAM 25% WG": {
                    row2text21.setText(Html.fromHtml("THIAMETHOXAM 25% WG"));
                    currentbrand = getString(R.string.THIAMETHOXAM_25_WG_ja);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Abhedh </b>(Amber)<br><b> Actara </b>(Syngenta)<br><b> Actor </b>(Kilpest)<br><b> Agrostar </b>(AOL)<br><b>Areva </b>(Dhanuka)<br><b> Arrow </b>(IIL)<br><b> Battalion </b>(Swal)<br><b> Click </b>(Indofil)<br><b> Devitara </b>(Devidayal)<br><b> Dxtar </b>(Nagarjuna)<br><b> Evident & Tiomax </b>(BioStadt)<br><b> Extra Super </b>(Crystal)<br><b> Giltara </b>(GIL)<br><b> King Tara </b>(KCS)<br><b> Kri-Oxm </b>(KR)<br><b> Maestro 707 </b>(Sumil)<br><b> Maxima </b>(PI Ind.)<br><b> Maxtara </b>(Vimax)<br><b> Optra </b>(Coromandel)<br><b> Renova </b>(UPL)<br><b> Spike </b>(Sulphur Mills)<br><b> Spora </b>(Atul)<br><b> Super Tara </b>(SuperCSL)<br><b> Tagxone </b>(Tropical)<br><b> Theme </b>(MIL)<br><b> Willoxam </b>(Willowood)<br><b> Wonderex </b>(Excel)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "ACEPHATE 75% SP": {
                    row2text21.setText(Html.fromHtml("ACEPHATE 75% SP"));
                    currentbrand = getString(R.string.ACEPHATE_75_SP_ja);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Accent 787 </b>(Sumil)<br><b> Ace </b>(Canary)<br><b> Acefex </b>(Excel)<br><b> Acesul </b>(Sulphur Mills)<br><b> Ample </b>(Advance)<br><b> Archa </b>(Amber)<br><b> Asataf </b>(TATA)<br><b> Bheem </b>(Kilpest)<br><b> Bhoochal 75 </b>(AOL)<br><b> Chettak </b>(GSP)<br><b> Corohamp </b>(CAPL)<br><b> Hilphate </b>(HIL)<br><b> King Phate </b>(KCS)<br><b> Kingmax </b>(Vimax)<br><b> Lancer </b>(UPL)<br><b> Lion </b>(SuperCSL)<br><b> Lucid </b>(Cheminova)<br><b> Megastar </b>(MIL)<br><b> Miltaf </b>(IIL)<br><b> Missile </b>(Devidayal)<br><b> Molphate </b>(GP)<br><b> Ortain </b>(Coromandel)<br><b> Orthene </b>(Arysta)<br><b> Oval </b>(PI Ind.)<br><b>Pace </b>(Nagarjuna)<br><b> Rasayan Phate </b>(KR)<br><b> Rythane </b>(Ramcides)<br><b> Sritaf </b>(Crystal)<br><b> Starthene </b>(Swal)<br><b> Tagace </b>(Tropical)<br><b> Top‘O’Top </b>(CGI)<br><b> Topsis </b>(Atul)<br><b> Topsis </b>(Atul)<br><b> Tremor </b>(BioStadt)<br><b> Vega </b>(PCCPL)<br><b> Willace </b>(Willowood)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "ACETAMIPRID 20% SP": {
                    row2text21.setText(Html.fromHtml("ACETAMIPRID 20% SP"));
                    currentbrand = getString(R.string.ACETAMIPRID_20_SP_ja);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b><b>Acelon </b>(CAPL)<br><b> Aceta </b>(UPL)<br><b> Acetacel </b>(Excel)<br><b> Active </b>(Devidayal)<br><b> Albis </b>(Atul)<br><b> Antenna </b>(Willowood)<br><b> Armour </b>(Advance)<br><b> Award </b>(MIL)<br><b> Crop Pride </b>(NACL)<br><b> Dhan Preet </b>(Dhanuka)<br><b>Echo 797 </b>(Sumil)<br><b> Ekka </b>(KR)<br><b> Ennova </b>(Nagarjuna)<br><b> Glide </b>(Safex)<br><b> Hilprid </b>(HIL)<br><b> King Prid </b>(KCS)<br><b> Lift </b>(Indofil)<br><b> Manik </b>(TATA)<br><b> Molprid </b>(GP)<br><b> Nize </b>(GSP)<br><b> Patron </b>(PCCPL)<br><b> Pounce </b>(FMC)<br><b> Prima </b>(Sulphur Mills)<br><b> Proud </b>(Kilpest)<br><b> Quick </b>(CLSL)<br><b> Rapid </b>(Crystal)<br><b> Rekord </b>(DuPont)<br><b> Scuba </b>(Coromandel)<br><b> Sharp </b>(IIL)<br><b> Shourya </b>(Amber)<br><b> Stona </b>(Vimax)<br><b> SuPride </b>(SuperCSL)<br><b> Tada </b>(CGI)<br><b> Tagride </b>(Tropical)<br><b> Wapkil & Rider </b>(BioStadt)\n"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "DELTAMETHRIN 2.8% EC": {
                    row2text21.setText(Html.fromHtml("DELTAMETHRIN 2.8% EC"));
                    currentbrand = getString(R.string.DELTAMETHRIN_2_8_EC_ja);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Decis 2.8 </b>(Bayer)<br><b> Shastra </b>(Devidayal)<br><b> Tagcis 100 </b>(Tropical)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "FENVALERATE 20% EC": {
                    row2text21.setText(Html.fromHtml("FENVALERATE 20% EC"));
                    currentbrand = getString(R.string.FENVALERATE_20_EC_ja);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Krifen </b>(KR)<br><b> Fenkill </b>(UPL)<br><b> King Pen </b>(KCS)<br><b>Fenval 20 EC </b>(Isagro Asia)<br><b> Devifen 20 </b>(Devidayal)\n"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "LAMBDA-CYHALOTHRIN 2.5% EC": {
                    row2text21.setText(Html.fromHtml("LAMBDA-CYHALOTHRIN 2.5% EC"));
                    currentbrand = getString(R.string.LAMBDA_CYHALOTHRIN_2_5_EC_ja);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Agent Plus </b>(Indofil)<br><b> Bravo 2500 </b>(IIL)<br><b> Demand </b>(Tropical)<br><b> Flex 801 </b>(Sumil)<br><b> Hillambda </b>(HIL)<br><b> Jaguar </b>(Sulphur Mills)<br><b> Judo </b>(Crystal)<br><b> Kozuka </b>(BioStadt)<br><b> Lambada 2.5 </b>(Canary)<br><b> Lambdastar </b>(Swal)<br><b> Ninja </b>(Devidayal)<br><b> Reeva 25 </b>(TATA)<br><b> Samurai </b>(GSP)<br><b> Spider </b>(SuperCSL)<br><b> Sumo </b>(Kilpest)<br><b> Xylo </b>(Atul)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "MONOCROTOPHOS 36% SL": {
                    row2text21.setText(Html.fromHtml("MONOCROTOPHOS 36% SL"));
                    currentbrand = getString(R.string.MONOCROTOPHOS_36_SL_ja);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Admono </b>(Advance)<br><b> Crop Mono </b>(NACL)<br><b> Crotocel </b>(Excel)<br><b> Devimono </b>(Devidayal)<br><b> Hilcron </b>(HIL)<br><b> Kevin 360 </b>(Sumil)<br><b> Kilphex 36% </b>(Kilpest)<br><b> King Phos </b>(KCS)<br><b> Luphos </b>(Crystal)<br><b> Macrophos </b>(Tropical)<br><b> Megamono </b>(MIL)<br><b> Monocil </b>(IIL)<br><b>  Monocip </b>(Vimax)<br><b> Monofos 36 </b>(Safex)<br><b> Monogil </b>(GIL)<br><b> Monostar </b>(Swal)<br><b> Monosul </b>(Sulphur Mills)<br><b> Parryfos/Monophos </b>(Coromandel)<br><b> Phoskill </b>(UPL)<br><b> Rasayanphos </b>(KR)<br><b> Shura </b>(PCCPL)<br><b> Sumo </b>(SuperCSL) \n"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "THIACLOPRID 21.7% SC": {
                    row2text21.setText(Html.fromHtml("THIACLOPRID 21.7% SC"));
                    currentbrand = getString(R.string.THIACHLOPRID_21_7_SC_ja);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Alanto </b>(Bayer)<br><b> Splendour </b>(Cheminova)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "CARBARYL 50% WP": {
                    row2text21.setText(Html.fromHtml("CARBARYL 50% WP"));
                    currentbrand = getString(R.string.CARBARYL_50_WP_ja);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Devicarb </b>(Devidayal)<br><b> Kavin </b>(KR)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "CHLORPYRIFOS 50% + CYPERMETHRIN 5%EC": {
                    row2text21.setText(Html.fromHtml("CHLORPYRIFOS 50% +<br> CYPERMETHRIN 5%EC"));
                    currentbrand = getString(R.string.CHLORPYRIFOS_50_CYPERMETHRIN_5_EC_ja);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Action 505 </b>(Tropical)<br><b> Anth </b>(KR)<br><b> Balio </b>(Atul)<br><b> Cannon </b>(Nagarjuna)<br><b> Catchh </b>(Coromandel)<br><b> Combi King </b>(KCS)<br><b> Cyklon </b>(GSP)<br><b> Double Star </b>(Swal)<br><b> Hamla 550 </b>(Gharda)<br><b> Hilhunter </b>(HIL)<br><b> Koranda 505 </b>(TATA)<br><b> Lethal Super 505 </b>(IIL)<br><b> Lynch + Combi </b>(PCCPL)<br><b> Nagraj 505 </b>(CCIL)<br><b> Nurocomb </b>(Cheminova)<br><b> Panther </b>(Amber)<br><b> Pradhan </b>(Kilpest)<br><b> Sac 505 </b>(Shivalik)<br><b> Sinergy </b>(MIL)<br><b> Super 505 </b>(SuperCSL)<br><b> Super Strong 505 </b>(Sumil)<br><b> Ulka 505 </b>(BioStadt)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "PROFENOFOS 50% EC": {
                    row2text21.setText(Html.fromHtml("PROFENOFOS 50% EC"));
                    currentbrand = getString(R.string.PROFENOPHOS_50_EC_ja);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Ajanta </b>(Coromandel)<br><b> Aurifos </b>(Cheminova)<br><b> Bahadur 201- 40% </b>(Sumil)<br><b> Banjo </b>(IIL)<br><b> Carina </b>(PI Ind.)<br><b> Celcron </b>(Excel)<br><b> Curacron </b>(Syngenta)<br><b> Devi-soldier </b>(Devidayal)<br><b> Hilfos </b>(HIL)<br><b> Jashn </b>(TATA)<br><b> Kilcron </b>(Crystal)<br><b>King Cron </b>(KCS)<br><b> Kombat </b>(PCCPL)<br><b> Kriphos </b>(KR)<br><b> Laser </b>(Advance)<br><b> Maxcron </b>(Vimax)<br><b> Orax </b>(Atul)<br><b> Prahar & Prudent </b>(BioStadt)<br><b> Profax </b>(AOL)<br><b> Profenofos 50 EC </b>(GAICL)<br><b> Profex </b>(Nagarjuna)<br><b> Profos </b>(Sulphur Mills)<br><b> Proven </b>(MIL)<br><b> Simcron </b>(GSP)<br><b> Sucron </b>(SuperCSL)<br><b> Tagpro </b>(Tropical)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "CYPERMETHRIN 3% + QUINALPHOS 20% EC": {
                    row2text21.setText(Html.fromHtml("CYPERMETHRIN 3% +<br> QUINALPHOS 20% EC"));
                    currentbrand = getString(R.string.CYPERMETHRIN_3_QUINALPHOS_20_EC_ja);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Viraat </b>(UPL)<br><b>  Alert </b>(Devidayal)."));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
            }
        } else if (Title.equals("American bollworm")) {
            txttt.setText("The identified Pest is American bollworm");
            txttt.setSingleLine();
            String currentbrand;

            switch(insecticide_brand){
                case "CHLORANTRANILIPROLE 18.5% SC": {
                    row2text21.setText(Html.fromHtml("Chlorantraniliprole<br><b> 18.5% SC"));

                    currentbrand = getString(R.string.CHLORANTRANILIPROLE_18_5_SC_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Coragen <b>(DuPont) </b>"));
                    //row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "FLUBENDIAMIDE 20% WG": {
                    row2text21.setText(Html.fromHtml("FLUBENDIAMIDE <br><b> 20% WG"));

                    currentbrand = getString(R.string.FLUBENDIAMIDE_20_WG_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Fluton </b>(PI Ind.)<br><b> Suraksha </b>(Nagarjuna)<br><b> Takumi </b>(TATA)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "SPINOSAD 45.0% SC":{
                    row2text21.setText(Html.fromHtml("SPINOSAD 45.0% SC"));

                    currentbrand = getString(R.string.SPINOSAD_45_0_SC_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Conserve </b>(Nagarjuna)<br><b> One-Up </b>(Dhanuka)</br> <br><b>Spintor </b>(Bayer)</br><br><b> Taffin </b>(TATA)</br>Tracer </b>(Dow)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "EMAMECTIN BENZOATE 5% SG": {
                    row2text21.setText(Html.fromHtml("EMAMECTIN BENZOATE <br> 5% SG"));

                    currentbrand = getString(R.string.EMAMECTIN_BENZOATE_5_SG_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Benzer </b>(Coromandel)<br><b> Bioclaim and Inclaim </b>(BioStadt)</br><br><b> Claim </b>(Canary)</br><br><b>EM-1 </b>(Dhanuka)</br><br><b> Emacto </b>(Willowood)</br><br><b> Empower </b>(Sumil)</br><br><b> Emstar 5 </b>(KR)</br><br><b>Emzet </b>(Sulphur Mills)</br><br><b> Missile </b>(Crystal)</br><br><b> Proceed </b>(Amber)</br><br><b> Proclaim </b>(Syngenta)</br><br><b> Robot </b>(Excel)</br><br><b> Spolit </b>(UPL)</br><br><b> Starclaim </b>(Swal)</br><br><b> Tatkal </b>(Gharda)</br><br><b>Trust </b>(Nagarjuna)</br><br><b> Wegon </b>(Vimax)</br>Xplode </b>(IIL)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "INDOXACARB 14.5% SC": {
                    row2text21.setText(Html.fromHtml("INDOXACARB 14.5% SC"));

                    currentbrand = getString(R.string.INDOXACARB_14_5_SC_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Amsac </b>(Atul)<br><b> Arav </b>(Amber)</br><br><b> Avaunt </b>(DuPont)</br><br><b> Avval </b>(IIL)</br><br><b> Care </b>(KR)</br><br><b>Dhawa Gold </b>(Dhanuka)</br><br><b> Fego </b>(UPL)</br><br><b> Index </b>(Devidayal)</br><br><b> Indica </b>(Willowood)</br><br><b> Indimax </b>(Sumil)</br><br><b> Kaal </b>(Kilpest)</br><br><b> Super Doxa </b>(AOL)</br><br><b> Super Indoxa </b>(SuperCSL)</br> <br><b> Tagpower </b>(Tropical)</br><br><b> Vantage </b>(Sulphur Mills)</br>Vindoxa </b>(Vimax)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "THIODICARB 75% WP": {
                    row2text21.setText(Html.fromHtml("THIODICARB 75% WP"));

                    currentbrand = getString(R.string.THIODICARB_75_WP_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Larvin </b>(Bayer)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "DIFLUBENZURON 25% WP": {
                    row2text21.setText(Html.fromHtml("DIFLUBENZURON 25% WP"));

                    currentbrand = getString(R.string.DIFLUBENZURON_25_WP_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    //  row2text26.setText(Html.fromHtml(splitter[4]));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "NOVALURON 10% EC": {
                    row2text21.setText(Html.fromHtml("NOVALURON 10% EC"));

                    currentbrand = getString(R.string.NOVALURON_10_EC_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>DNA </b>(Willowood)<br><b>Noval </b>(KR) <br><b> Novamax </b>(Vimax)<br><b>Remostar </b>(Swal) Rimon </b>(Indofil)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "LUFENURON 5.4% EC": {
                    row2text21.setText(Html.fromHtml("LUFENURON 5.4% EC"));

                    currentbrand = getString(R.string.LUFENURON_5_4_EC_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    //    row2text26.setText(Html.fromHtml(splitter[4]));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "ACEPHATE 75% SP": {
                    row2text21.setText(Html.fromHtml("ACEPHATE 75% SP"));

                    currentbrand = getString(R.string.ACEPHATE_75_SP_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Accent 787 </b>(Sumil)<br><b> Ace </b>(Canary)<br><b> Acefex </b>(Excel)<br><b> Acesul </b>(Sulphur Mills)<br><b>Ample </b>(Advance)<br><b> Archa </b>(Amber)<br><b> Asataf </b>(TATA)<br><b> Bheem </b>(Kilpest)<br><b>\n" +
                            "Bhoochal 75 </b>(AOL)<br><b> Chettak </b>(GSP)<br><b> Corohamp </b>(CAPL)<br><b> Hilphate </b>(HIL)<br><b> King Phate </b>(KCS)<br><b> Kingmax </b>(Vimax)<br><b> Lancer </b>(UPL)<br><b> Lion </b>(SuperCSL)<br><b>\n" +
                            "Lucid </b>(Cheminova)<br><b> Megastar </b>(MIL)<br><b> Miltaf </b>(IIL)<br><b> Missile </b>(Devidayal)<br><b>Molphate </b>(GP)<br><b> Ortain </b>(Coromandel)<br><b> Orthene </b>(Arysta)<br><b> Oval </b>(PI Ind.)<br><b>\n" +
                            "Pace </b>(Nagarjuna)<br><b> Rasayan Phate </b>(KR)<br><b> Rythane </b>(Ramcides)<br><b> Sritaf </b>(Crystal)<br><b> Starthene </b>(Swal)<br><b> Tagace </b>(Tropical)<br><b> Top‘O’Top </b>(CGI)<br><b> Topsis </b>(Atul)<br><b>\n" +
                            "Topsis </b>(Atul)<br><b> Tremor </b>(BioStadt)<br><b> Vega </b>(PCCPL)<br><b> Willace </b>(Willowood)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "PROFENOFOS 50% EC": {
                    row2text21.setText(Html.fromHtml("PROFENOFOS 50% EC"));

                    currentbrand = getString(R.string.PROFENOPHOS_50_EC_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Ajanta </b>(Coromandel)<br><b> Aurifos </b>(Cheminova)<br><b> Bahadur 201- 40% </b>(Sumil)<br><b>Banjo </b>(IIL)<br><b> Carina </b>(PI Ind.)<br><b> Celcron </b>(Excel)<br><b> Curacron </b>(Syngenta)<br><b>Devi-soldier </b>(Devidayal)<br><b> Hilfos </b>(HIL)<br><b> Jashn </b>(TATA)<br><b> Kilcron </b>(Crystal)<br><b>King Cron </b>(KCS)<br><b> Kombat </b>(PCCPL)<br><b> Kriphos </b>(KR)<br><b> Laser </b>(Advance)<br><b>Maxcron </b>(Vimax)<br><b> Orax </b>(Atul)<br><b> Prahar and Prudent </b>(BioStadt)<br><b> Profax </b>(AOL)<br><b> Profenofos 50 EC </b>(GAICL)<br><b> Profex </b>(Nagarjuna)<br><b> Profos </b>(Sulphur Mills)<br><b>Proven </b>(MIL)<br><b> Simcron </b>(GSP)<br><b> Sucron </b>(SuperCSL)<br><b> Tagpro </b>(Tropical)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "CYPERMETHRIN 10% EC": {
                    row2text21.setText(Html.fromHtml("CYPERMETHRIN 10% EC"));

                    currentbrand = getString(R.string.CYPERMETHRIN_10_EC_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Action-10 </b>(CCIL)<br><b> Challenger 10 </b>(Tropical)<br><b> Cyper King </b>(KCS)<br><b> Cypercil </b>(GSP)<br><b> Cypercot 10 E </b>(Kilpest)<br><b> Cypermil </b>(IIL)<br><b> Devicyper 10 </b>(Devidayal)<br><b>Kricyp-10 </b>(KR)<br><b> Megatrin </b>(MIL)<br><b> Shakti-10 </b>(Cheminova)<br><b> Shera 10 </b>(AOL)<br><b> Starcip-10 </b>(Swal)<br><b> Super Jet </b>(SuperCSL)<br><b> SuperKiller 10 </b>(Dhanuka)<br><b> Ustaad </b>(UPL)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "DELTAMETHRIN 2.8% EC": {
                    row2text21.setText(Html.fromHtml("DELTAMETHRIN 2.8% EC"));

                    currentbrand = getString(R.string.DELTAMETHRIN_2_8_EC_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Decis 2.8 </b>(Bayer)<br><b> Shastra </b>(Devidayal)</br> <br><b>Tagcis 100 </b>(Tropical) </br>"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "LAMBDA CYHALOTHRIN 2.5% EC": {
                    row2text21.setText(Html.fromHtml("LAMBDA CYHALOTHRIN <br><b> 2.5% EC"));

                    currentbrand = getString(R.string.LAMBDA_CYHALOTHRIN_2_5_EC_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Agent Plus </b>(Indofil)<br><b> Bravo 2500 </b>(IIL)</br><br><b> Demand </b>(Tropical)</br><br><b> Flex 801 </b>(Sumil)</br><br><b> Hillambda </b>(HIL)</br><br><b> Jaguar </b>(Sulphur Mills)</br><br><b> Judo </b>(Crystal)</br><br><b> Kozuka </b>(BioStadt)</br><br><b> Lambada 2.5 </b>(Canary)</br><br><b> Lambdastar </b>(Swal)</br><br><b> Ninja </b>(Devidayal)</br><br><b> Reeva 2.5 </b>(TATA)</br><br><b> Samurai </b>(GSP)</br><br><b> Spider </b>(SuperCSL)</br><br><b> Sumo </b>(Kilpest)</br><br><b> Xylo </b>(Atul)</br> "));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "LAMBDA-CYHALOTHRIN 5% EC": {
                    row2text21.setText(Html.fromHtml("LAMBDA-CYHALOTHRIN 5% EC"));

                    currentbrand = getString(R.string.LAMBDA_CYHALOTHRIN_5_EC_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Bravo 5000 </b>(IIL)<br><b> Dragon 701 </b>(Sumil)<br><b> Hillambda </b>(HIL)<br><b> Judho 5 EC </b>(Yesell)<br><b>\n" +
                            "Judo </b>(Devidayal)<br><b> Judo Plus </b>(Crystal)<br><b> Karate </b>(Syngenta)<br><b> Kataar </b>(CCIL)<br><b>\n" +
                            "Lakshya </b>(Advance)<br><b> Lambada5 </b>(Canary)<br><b>  LOC-5 </b>(KR)<br><b>  Mustang </b>(Sulphur Mills)<br><b> Ray </b>(PCCPL)<br><b> Reeva 5 </b>(TATA)<br><b> Remand </b>(Amber)<br><b> Richo </b>(Vimax)<br><b> Santri </b>(GSP)<br><b> Spider Plus </b>(SuperCSL)<br><b> Sumo Plus </b>(Kilpest)<br><b> Sunny </b>(Willowood)<br><b>\n" +
                            "Tag Command </b>(Tropical)<br><b> Thiachi </b>(AOL)<br><b> Xylo-5 </b>(Atul)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "MONOCROTOPHOS 36% SL": {
                    row2text21.setText(Html.fromHtml("MONOCROTOPHOS 36% SL"));

                    currentbrand = getString(R.string.MONOCROTOPHOS_36_SL_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Admono </b>(Advance)<br><b> Crop Mono </b>(NACL)<br><b> Crotocel </b>(Excel)<br><b> Devimono </b>(Devidayal)<br><b> Hilcron </b>(HIL)<br><b> Kevin 360 </b>(Sumil)<br><b> Kilphex 36% </b>(Kilpest)<br><b> King Phos </b>(KCS)<br><b> Luphos </b>(Crystal)<br><b> Macrophos </b>(Tropical)<br><b> Megamono </b>(MIL)<br><b> Monocil </b>(IIL)<br><b>  Monocip </b>(Vimax)<br><b> Monofos 36 </b>(Safex)<br><b> Monogil </b>(GIL)<br><b>    Monostar </b>(Swal)<br><b> Monosul </b>(Sulphur Mills)<br><b> Parryfos/Monophos </b>(Coromandel)<br><b> Phoskill </b>(UPL)<br><b> Rasayanphos </b>(KR)<br><b> Shura </b>(PCCPL)<br><b> Sumo </b>(SuperCSL)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "CHLORPYRIFOS 50% + CYPERMETHRIN 5%EC": {
                    row2text21.setText(Html.fromHtml("CHLORPYRIFOS 50% <br><b> + CYPERMETHRIN 5% EC"));

                    currentbrand = getString(R.string.CHLORPYRIFOS_50_CYPERMETHRIN_5_EC_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Action 505 </b>(Tropical)<br><b> Anth </b>(KR)<br><b> Balio </b>(Atul)<br><b> Cannon </b>(Nagarjuna)<br><b>Catchh </b>(Coromandel)<br><b> Combi King </b>(KCS)<br><b> Cyklon </b>(GSP)<br><b> Double Star </b>(Swal)<br><b> Hamla 550 </b>(Gharda)<br><b> Hilhunter </b>(HIL)<br><b> Koranda 505 </b>(TATA)<br><b>Lethal Super 505 </b>(IIL)<br><b> Lynch + Combi </b>(PCCPL)<br><b> Nagraj 505 </b>(CCIL)<br><b>Nurocomb </b>(Cheminova)<br><b> Panther </b>(Amber)<br><b> Pradhan </b>(Kilpest)<br><b> Sac 505 </b>(Shivalik)<br><b> Sinergy </b>(MIL)<br><b> Super 505 </b>(SuperCSL)<br><b> Super Strong 505 </b>(Sumil)<br><b> Ulka 505 </b>(BioStadt)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "CYPERMETHRIN 3% + QUINALPHOS 20% EC": {
                    row2text21.setText(Html.fromHtml("CYPERMETHRIN 3% <br><b>+ QUINALPHOS 20% EC"));

                    currentbrand = getString(R.string.CYPERMETHRIN_3_QUINALPHOS_20_EC_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Viraat </b>(UPL)<br><b>Alert </b>(Devidayal)</br>"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "ETHION 40% + CYPERMETHRIN 5% EC": {
                    row2text21.setText(Html.fromHtml("ETHION 40% <br><b>+ CYPERMETHRIN 5% EC"));

                    currentbrand = getString(R.string.ETHION_40_CYPERMETHRIN_5_EC_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Colfos </b>(PI Ind.)<br><b> Cyperton </b>(MIL)</br><br><b> Eagle 405 </b>(Devidayal)</br><br><b> Jashn </b>(KR)</br><br><b>Mit Plus </b>(Swal)</br><br><b> Nagata </b>(TATA)</br><br><b> Rim Jhim </b>(IIL)</br><br><b> Sumite-405 </b>(SuperCSL)</br> "));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "PROFENOFOS 40% + CYPERMETHRIN 4% EC": {
                    row2text21.setText(Html.fromHtml("PROFENOFOS 40% + <br> CYPERMETHRIN 4% EC"));

                    currentbrand = getString(R.string.PROFENOPHOS_40_CYPERMETHRIN_4_EC_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Ajanta Super </b>(Coromandel)<br><b> Banjo Super </b>(IIL)</br><br><b> Correct </b>(MIL)</br><br><b>Cypro </b>(Sulphur Mills)</br><br><b> Genesis </b>(Willowood)</br><br><b> Hitcel </b>(Excel)</br><br><b> Impact </b>(Advance)</br><br><b>Kilcron Plus </b>(Crystal)</br><br><b> Kriphos Super </b>(KR)</br><br><b> Legend Super </b>(CCIL)</br><br><b> Maxcron Super </b>(Vimax)</br><br><b> Orax Super </b>(Atul)</br><br><b> Pataka </b>(Tropical)</br><br><b> Polytrin C </b>(Syngenta)</br><br><b> Profeno King </b>(KCS)</br><br><b> Profex Super </b>(Nagarjuna)</br><br><b> Prosper-44 </b>(Devidayal)</br><br><b> Protrin </b>(Sumil)</br><br><b> Razor </b>(Kilpest)</br><br><b> Roket </b>(PI Ind.)</br><br><b> Sumit 99 </b>(SuperCSL)</br> "));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "CARBARYL 50% WP": {
                    row2text21.setText(Html.fromHtml("CARBARYL 50% WP"));

                    currentbrand = getString(R.string.CARBARYL_50_WP_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Devicarb </b>(Devidayal)<br><b> Kavin </b>(KR)</br>"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "CHLORPYRIFOS 20% EC": {
                    row2text21.setText(Html.fromHtml("CHLORPYRIFOS 20% EC"));

                    currentbrand = getString(R.string.CHLORPYRIFOS_20_EC_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>All-Drin </b>(Ambuja)<br><b> Banest 20 </b>(Arysta)</br><br><b> Chloroban </b>(UPL)</br><br><b> Chlorocil </b>(GSP)</br><br><b> ChloroKing </b>(KCS)</br><br><b> Classic-20 </b>(Cheminova)</br><br><b> Crop Chlor </b>(NACL)</br><br><b>Dangal </b>(Canary)</br><br><b> Deviban 20 </b>(Devidayal)</br><br><b> Dursban </b>(Dow)</br><br><b> Gilphos </b>(GIL)</br><br><b>Gold Ban </b>(CCIL)</br><br><b> Hilban 20 </b>(HIL)</br><br><b> Hyban </b>(HCL)</br><br><b> Kaman / Eldrin TC </b>(Crystal)</br><br><b> Kartoos </b>(Amber)</br><br><b> Kattar 20 </b>(GKR)</br><br><b> Krishan 20 </b>(KR)</br><br><b> Lethal 20 EC </b>(IIL)</br><br><b> Lynch </b>(PCCPL)</br><br><b> Megaban </b>(MIL)</br><br><b> Mig-20 </b>(Kilpest)</br><br><b> Potta </b>(AOL)</br><br><b> Pyriban </b>(Aimco)</br><br><b> Pyrifex </b>(Safex)</br><br><b> Pyrifex </b>(Safex)</br><br><b> Sacban </b>(Shivalik)</br><br><b> Shreeban TC </b>(SKSCC)</br><br><b> Starban </b>(Swal)</br><br><b> Strike 20EC </b>(BioStadt)</br><br><b> Sulban </b>(SulphurMills)</br><br><b> Suldrin </b>(SuperCSL)</br><br><b> Tafaban </b>(TATA)</br><br><b> Tagban </b>(Tropical)</br><br><b> Tricel 20 </b>(Excel)</br><br><b> Trishul </b>(Coromandel)</br><br><b> Uno 501 </b>(Sumil)</br><br><b> Veermet </b>(Vimax)</br>"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "FENVALERATE 20% EC": {
                    row2text21.setText(Html.fromHtml("FENVALERATE 20% EC"));

                    currentbrand = getString(R.string.FENVALERATE_20_EC_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Devifen 20 </b>(Devidayal)<br><b> Fencot 20 E </b>(Kilpest)</br><br><b> Fenkill </b>(UPL)</br><br><b>Fenval 20 EC </b>(Isagro Asia)</br><br><b> Final 20 </b>(AOL)</br><br><b> King Pen </b>(KCS)</br><br><b>Krifen </b>(KR)</br><br><b> Tatafen </b>(TATA)</br>"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "QUINALPHOS 20% AF": {
                    row2text21.setText(Html.fromHtml("QUINALPHOS 20% AF"));

                    currentbrand = getString(R.string.QUINALPHOS_20_AF_am);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Battle </b>(GKR)<br><b> Deviquin </b>(Devidayal)</br><br><b> Ekalux </b>(Syngenta)</br><br><b> Flash </b>(Indofil)</br><br><b> Hilquin </b>(HIL)</br><br><b> Keterphos  </b>(Kilpest)</br><br><b> Krilux </b>(KR)</br><br><b> Krush </b>(BioStadt)</br><br><b>Starlux </b>(Swal)</br><br><b> Vazra </b>(Cheminova)</br><br><b>  Virsta </b>(Vimax)</br>"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }

            }
        }else if (Title.equals("Pink Bollworm")) {
            txttt.setText("The identified Pest is Pink Bollworm");
            txttt.setSingleLine();
            String currentbrand;

            switch(insecticide_brand) {
                case "FENVALERATE 0.4% DP": {
                    row2text21.setText(Html.fromHtml("FENVALERATE 0.4% DP"));

                    currentbrand = getString(R.string.FENVALERATE_0_4_DP_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Devifen 0.4 DP </b>(Devidayal)<br><b> Fencot 0.4 D </b>(Kilpest)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "CARBARYL 50% WP": {
                    row2text21.setText(Html.fromHtml("CARBARYL 50% WP"));

                    currentbrand = getString(R.string.CARBARYL_50_WP_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Devicarb </b>(Devidayal)<br><b> Kavin </b>(KR)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "CHLORPYRIPHOS 16% + ALPHACYPERMETHRIN 1%": {
                    row2text21.setText(Html.fromHtml("CHLORPYRIPHOS 16% +<br> ALPHACYPERMETHRIN 1%"));

                    currentbrand = getString(R.string.CHLORPYRIPHOS_16_ALPHACYPERMETHRIN_1_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Aaghaat </b>(Bharat)<br><b> Aflatoon </b>(IIL)<br><b> Alert </b>(Tropical)<br><b> Anth Super </b>(KR)<br><b> Chlorthrin </b>(Devidayal)<br><b> Legend Plus </b>(MIL)<br><b> Logan </b>(SuperCSL)<br><b> Pincer 115 </b>(Sumil)<br><b> Twins </b>(Sulphur Mills)<br><b> Zoro </b>(Crystal)<br><b>\n"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "ALPHACYPERMETHRIN 10% EC": {
                    row2text21.setText(Html.fromHtml("ALPHACYPERMETHRIN 10% EC"));

                    currentbrand = getString(R.string.ALPHA_CYPERMETHRIN_10_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Alfastar </b>(Swal)<br><b> Dash 5% WP </b>(MIL)<br><b> Dolphin </b>(GSP)<br><b> Guru </b>(UPL)<br><b> Karfu </b>(Kilpest)<br><b> Safari </b>(SuperCSL)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "CYPERMETHRIN 10% EC": {
                    row2text21.setText(Html.fromHtml("CYPERMETHRIN 10% EC"));

                    currentbrand = getString(R.string.CYPERMETHRIN_10_EC_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Action-10 </b>(CCIL)<br><b> Challenger 10 </b>(Tropical)<br><b> Cyper King </b>(KCS)<br><b> Cypercil </b>(GSP)<br><b> Cypercot 10 E </b>(Kilpest)<br><b> Cypermil </b>(IIL)<br><b> Devicyper 10 </b>(Devidayal)<br><b>Kricyp-10 </b>(KR)<br><b> Megatrin </b>(MIL)<br><b> Shakti-10 </b>(Cheminova)<br><b> Shera 10 </b>(AOL)<br><b> Starcip-10 </b>(Swal)<br><b> Super Jet </b>(SuperCSL)<br><b> SuperKiller 10 </b>(Dhanuka)<br><b> Ustaad </b>(UPL)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "DELTAMETHRIN 2.8% EC": {
                    row2text21.setText(Html.fromHtml("DELTAMETHRIN 2.8% EC"));

                    currentbrand = getString(R.string.DELTAMETHRIN_2_8_EC_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Decis 2.8 </b>(Bayer)<br><b> Shastra </b>(Devidayal)<br><b> Tagcis 100 </b>(Tropical)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "INDOXACARB 14.5% SC": {
                    row2text21.setText(Html.fromHtml("INDOXACARB 14.5% SC"));

                    currentbrand = getString(R.string.INDOXACARB_14_5_SC_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Amsac </b>(Atul)<br><b> Arav </b>(Amber)<br><b> Avaunt </b>(DuPont)<br><b> Avval </b>(IIL)<br><b> Care </b>(KR)<br><b> Dhawa Gold </b>(Dhanuka)<br><b> Fego </b>(UPL)<br><b> Index </b>(Devidayal)<br><b> Indica </b>(Willowood)<br><b> Indimax </b>(Sumil)<br><b> Kaal </b>(Kilpest)<br><b> Super Doxa </b>(AOL)<br><b> Super Indoxa </b>(SuperCSL)<br><b> Tagpower </b>(Tropical)<br><b> Vantage </b>(Sulphur Mills)<br><b> Vindoxa </b>(Vimax)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "LAMBDA-CYHALOTHRIN 2.5% EC": {
                    row2text21.setText(Html.fromHtml("LAMBDA-CYHALOTHRIN 2.5% EC"));

                    currentbrand = getString(R.string.LAMBDA_CYHALOTHRIN_2_5_EC_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Agent Plus </b>(Indofil)<br><b> Bravo 2500 </b>(IIL)<br><b> Demand </b>(Tropical)<br><b> Flex 801 </b>(Sumil)<br><b> Hillambda </b>(HIL)<br><b> Jaguar </b>(Sulphur Mills)<br><b> Judo </b>(Crystal)<br><b> Kozuka </b>(BioStadt)<br><b> Lambada 2.5 </b>(Canary)<br><b> Lambdastar </b>(Swal)<br><b> Ninja </b>(Devidayal)<br><b> Reeva 2.5 </b>(TATA)<br><b> Samurai </b>(GSP)<br><b> Spider </b>(SuperCSL)<br><b> Sumo </b>(Kilpest)<br><b> Xylo </b>(Atul)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "MONOCROTOPHOS 36% SL": {
                    row2text21.setText(Html.fromHtml("MONOCROTOPHOS 36% SL"));

                    currentbrand = getString(R.string.MONOCROTOPHOS_36_SL_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Admono </b>(Advance)<br><b> Crop Mono </b>(NACL)<br><b> Crotocel </b>(Excel)<br><b> Devimono </b>(Devidayal)<br><b> Hilcron </b>(HIL)<br><b> Kevin 360 </b>(Sumil)<br><b> Kilphex 36% </b>(Kilpest)<br><b>King Phos </b>(KCS)<br><b> Luphos </b>(Crystal)<br><b> Macrophos </b>(Tropical)<br><b> Megamono </b>(MIL)<br><b> Monocil </b>(IIL)<br><b>  Monocip </b>(Vimax)<br><b> Monofos 36 </b>(Safex)<br><b> Monogil </b>(GIL)<br><b>Monostar </b>(Swal)<br><b> Monosul </b>(Sulphur Mills)<br><b> Parryfos/Monophos </b>(Coromandel)<br><b> Phoskill </b>(UPL)<br><b> Rasayanphos </b>(KR)<br><b> Shura </b>(PCCPL)<br><b> Sumo </b>(SuperCSL).\n"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "PROFENOFOS 50% EC": {
                    row2text21.setText(Html.fromHtml("PROFENOFOS 50% EC"));

                    currentbrand = getString(R.string.PROFENOPHOS_50_EC_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Ajanta </b>(Coromandel)<br><b> Aurifos </b>(Cheminova)<br><b> Bahadur 201- 40% </b>(Sumil)<br><b>Banjo </b>(IIL)<br><b> Carina </b>(PI Ind.)<br><b> Celcron </b>(Excel)<br><b> Curacron </b>(Syngenta)<br><b> Devi-soldier </b>(Devidayal)<br><b> Hilfos </b>(HIL)<br><b> Jashn </b>(TATA)<br><b> Kilcron </b>(Crystal)<br><b> \n" +
                            "King Cron </b>(KCS)<br><b> Kombat </b>(PCCPL)<br><b> Kriphos </b>(KR)<br><b> Laser </b>(Advance)<br><b> Maxcron </b>(Vimax)<br><b> Orax </b>(Atul)<br><b> Prahar & Prudent </b>(BioStadt)<br><b> Profax </b>(AOL)<br><b> Profenofos 50 EC </b>(GAICL)<br><b> Profex </b>(Nagarjuna)<br><b> Profos </b>(Sulphur Mills)<br><b> \n" +
                            "Proven </b>(MIL)<br><b> Simcron </b>(GSP)<br><b> Sucron </b>(SuperCSL)<br><b> Tagpro </b>(Tropical).\n"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "THIODICARB 75% WP": {
                    row2text21.setText(Html.fromHtml("THIODICARB 75% WP"));

                    currentbrand = getString(R.string.THIODICARB_75_WP_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Larvin </b>(Bayer)"));
                    //row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "CHLORANTRANILIPROLE 9.3% + LAMBDA CYHALOTHRIN 4.6% ZC": {
                    row2text21.setText(Html.fromHtml("CHLORANTRANILIPROLE 9.3% +<br> LAMBDA CYHALOTHRIN 4.6% ZC"));

                    currentbrand = getString(R.string.CHLORANTRANILIPROLE_9_3_LAMBDA_CYHALOTHRIN_4_6_ZC_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Ampligo </b>(Syngenta)"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "CHLORPYRIFOS 50% + CYPERMETHRIN 5%EC": {
                    row2text21.setText(Html.fromHtml("CHLORPYRIFOS 50% +<br> CYPERMETHRIN 5%EC"));

                    currentbrand = getString(R.string.CHLORPYRIFOS_50_CYPERMETHRIN_5_EC_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Action 505 </b>(Tropical)<br><b> Anth </b>(KR)<br><b> Balio </b>(Atul)<br><b> Cannon </b>(Nagarjuna)<br><b> Catchh </b>(Coromandel)<br><b> Combi King </b>(KCS)<br><b> Cyklon </b>(GSP)<br><b> Double Star </b>(Swal)<br><b> Hamla 550 </b>(Gharda)<br><b> Hilhunter </b>(HIL)<br><b> Koranda 505 </b>(TATA)<br><b>Lethal Super 505 </b>(IIL)<br><b> Lynch + Combi </b>(PCCPL)<br><b> Nagraj 505 </b>(CCIL)<br><b> Nurocomb </b>(Cheminova)<br><b> Panther </b>(Amber)<br><b> Pradhan </b>(Kilpest)<br><b> \n" +
                            "Sac 505 </b>(Shivalik)<br><b> Sinergy </b>(MIL)<br><b> Super 505 </b>(SuperCSL)<br><b> Super Strong 505 </b>(Sumil)<br><b> Ulka 505 </b>(BioStadt)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "ACEPHATE 75% SP": {
                    row2text21.setText(Html.fromHtml("ACEPHATE 75% SP"));

                    currentbrand = getString(R.string.ACEPHATE_75_SP_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Accent 787 </b>(Sumil)<br><b> Ace </b>(Canary)<br><b> Acefex </b>(Excel)<br><b> Acesul </b>(Sulphur Mills)<br><b> Ample </b>(Advance)<br><b> Archa </b>(Amber)<br><b> Asataf </b>(TATA)<br><b> Bheem </b>(Kilpest)<br><b> Bhoochal 75 </b>(AOL)<br><b> Chettak </b>(GSP)<br><b> Corohamp </b>(CAPL)<br><b> Hilphate </b>(HIL)<br><b> \n" +
                            "King Phate </b>(KCS)<br><b> Kingmax </b>(Vimax)<br><b> Lancer </b>(UPL)<br><b> Lion </b>(SuperCSL)<br><b> Lucid </b>(Cheminova)<br><b> Megastar </b>(MIL)<br><b> Miltaf </b>(IIL)<br><b> Missile </b>(Devidayal)<br><b> Molphate </b>(GP)<br><b> Ortain </b>(Coromandel)<br><b> Orthene </b>(Arysta)<br><b> Oval </b>(PI Ind.)<br><b> \n" +
                            "Pace </b>(Nagarjuna)<br><b> Rasayan Phate </b>(KR)<br><b> Rythane </b>(Ramcides)<br><b> Sritaf </b>(Crystal)<br><b> Starthene </b>(Swal)<br><b> Tagace </b>(Tropical)<br><b> Top‘O’Top </b>(CGI)<br><b> Topsis </b>(Atul)<br><b> Topsis </b>(Atul)<br><b> Tremor </b>(BioStadt)<br><b> Vega </b>(PCCPL)<br><b> Willace </b>(Willowood)\n"));
                    //   row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "CHLORPYRIFOS 20% EC": {
                    row2text21.setText(Html.fromHtml("CHLORPYRIFOS 20% EC"));

                    currentbrand = getString(R.string.CHLORPYRIFOS_20_EC_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>All-Drin </b>(Ambuja)<br><b> Banest 20 </b>(Arysta)<br><b> Chloroban </b>(UPL)<br><b> Chlorocil </b>(GSP)<br><b> ChloroKing </b>(KCS)<br><b> Classic-20 </b>(Cheminova)<br><b> Crop Chlor </b>(NACL)<br><b> Dangal </b>(Canary)<br><b> Deviban 20 </b>(Devidayal)<br><b> Dursban </b>(Dow)<br><b> Gilphos </b>(GIL)<br><b> \n" +
                            "Gold Ban </b>(CCIL)<br><b> Hilban 20 </b>(HIL)<br><b> Hyban </b>(HCL)<br><b> Kaman / Eldrin TC </b>(Crystal)<br><b> Kartoos </b>(Amber)<br><b> Kattar 20 </b>(GKR)<br><b> Krishan 20 </b>(KR)<br><b> Lethal 20 EC </b>(IIL)<br><b> Lynch </b>(PCCPL)<br><b> Megaban </b>(MIL)<br><b> Mig-20 </b>(Kilpest)<br><b> Potta </b>(AOL)<br><b> Pyriban </b>(Aimco)<br><b> Pyrifex </b>(Safex)<br><b> Pyrifex </b>(Safex)<br><b> Sacban </b>(Shivalik)<br><b> Shreeban TC </b>(SKSCC)<br><b> Starban </b>(Swal)<br><b> Strike 20EC </b>(BioStadt)<br><b> Sulban </b>(SulphurMills)<br><b> Suldrin </b>(SuperCSL)<br><b> Tafaban </b>(TATA)<br><b> Tagban </b>(Tropical)<br><b> Tricel 20 </b>(Excel)<br><b> Trishul </b>(Coromandel)<br><b> Uno 501 </b>(Sumil)<br><b> Veermet </b>(Vimax)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "FENVALERATE 20% EC": {
                    row2text21.setText(Html.fromHtml("FENVALERATE 20% EC"));

                    currentbrand = getString(R.string.FENVALERATE_20_EC_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Devifen 20 </b>(Devidayal)<br><b> Fencot  </b>(Kilpest)<br><b> Fenkill </b>(UPL)<br><b> Fenval </b>(Isagro Asia)<br><b> Final 20 </b>(AOL)<br><b> King Pen </b>(KCS)<br><b> Krifen </b>(KR)<br><b> Tatafen </b>(TATA)<br><b>"));
                    //   row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "EMAMECTIN BENZOATE 5% SG": {
                    row2text21.setText(Html.fromHtml("EMAMECTIN BENZOATE 5% SG"));

                    currentbrand = getString(R.string.EMAMECTIN_BENZOATE_5_SG_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Benzer </b>(Coromandel)<br><b> Bioclaim & Inclaim </b>(BioStadt)<br><b> Claim </b>(Canary)<br><b>EM-1 </b>(Dhanuka)<br><b> Emacto </b>(Willowood)<br><b> Empower </b>(Sumil)<br><b> Emstar 5 </b>(KR)<br><b> Emzet </b>(Sulphur Mills)<br><b> Missile </b>(Crystal)<br><b> Proceed </b>(Amber)<br><b> Proclaim </b>(Syngenta)<br><b> Robot </b>(Excel)<br><b> Spolit </b>(UPL)<br><b> Starclaim </b>(Swal)<br><b> Tatkal </b>(Gharda)<br><b> Trust </b>(Nagarjuna)<br><b> Wegon </b>(Vimax)<br><b> Xplode </b>(IIL)\n"));
                    // row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "LAMBDA-CYHALOTHRIN 5% EC": {
                    row2text21.setText(Html.fromHtml("LAMBDA-CYHALOTHRIN 5% EC"));

                    currentbrand = getString(R.string.LAMBDA_CYHALOTHRIN_5_EC_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Bravo 5000 </b>(IIL)<br><b> Dragon 701 </b>(Sumil)<br><b> Hillambda </b>(HIL)<br><b> Judho 5 EC </b>(Yesell)<br><b> Judo </b>(Devidayal)<br><b> Judo Plus </b>(Crystal)<br><b> Karate </b>(Syngenta)<br><b> Kataar </b>(CCIL)<br><b> Lakshya </b>(Advance)<br><b> Lambada5 </b>(Canary)<br><b>  LOC-5 </b>(KR)<br><b>  Mustang </b>(Sulphur Mills)<br><b> Ray </b>(PCCPL)<br><b> Reeva 5 </b>(TATA)<br><b> Remand </b>(Amber)<br><b> Richo </b>(Vimax)<br><b> Santri </b>(GSP)<br><b> Spider Plus </b>(SuperCSL)<br><b> Sumo Plus </b>(Kilpest)<br><b> Sunny </b>(Willowood)<br><b> Tag Command </b>(Tropical)<br><b> Thiachi </b>(AOL)<br><b> Xylo-5 </b>(Atul)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "PROFENOFOS 40% + CYPERMETHRIN 4% EC": {
                    row2text21.setText(Html.fromHtml("PROFENOFOS 40% +<br> CYPERMETHRIN 4% EC"));

                    currentbrand = getString(R.string.PROFENOPHOS_40_CYPERMETHRIN_4_EC_pink);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Ajanta Super </b>(Coromandel)<br><b> Banjo Super </b>(IIL)<br><b> Correct </b>(MIL)<br><b> Cypro </b>(Sulphur Mills)<br><b> Genesis </b>(Willowood)<br><b> Hitcel </b>(Excel)<br><b> Impact </b>(Advance)<br><b> Kilcron Plus </b>(Crystal)<br><b> Kriphos Super </b>(KR)<br><b> Legend Super </b>(CCIL)<br><b> \n" +
                            "Maxcron Super </b>(Vimax)<br><b> Orax Super </b>(Atul)<br><b> Pataka </b>(Tropical)<br><b> Polytrin C </b>(Syngenta)<br><b> Profeno King </b>(KCS)<br><b> Profex Super </b>(Nagarjuna)<br><b> Prosper-44 </b>(Devidayal)<br><b> Protrin </b>(Sumil)<br><b> Razor </b>(Kilpest)<br><b> Roket </b>(PI Ind.)<br><b> Sumit 99 </b>(SuperCSL)\n"));
//                    row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
            }
        }else if (Title.equals("Spotted and Spiny Bollworm")) {
            txttt.setText("The identified Pest is Spotted and Spiny Bollworm");
            txttt.setSingleLine();
            String currentbrand;

            switch(insecticide_brand) {
                case "CHLORANTRANILIPROLE 18.5% SC": {
                    row2text21.setText(Html.fromHtml("CHLORANTRANILIPROLE 18.5% SC"));

                    currentbrand = getString(R.string.CLORANTRANILIPROLE_18_5_S_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Coragen </b>(DuPont)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "FLUBENDIAMIDE 39.35% M/M SC": {
                    row2text21.setText(Html.fromHtml("FLUBENDIAMIDE 39.35% M/M SC"));

                    currentbrand = getString(R.string.FLUBENDIAMIDE_39_35MM_SC_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Fame </b>(Bayer)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
                case "INDOXACARB 14.5% SC": {
                    row2text21.setText(Html.fromHtml("INDOXACARB 14.5% SC"));

                    currentbrand = getString(R.string.INDOXACARB_14_5_SC_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Amsac </b>(Atul)<br><b> Arav </b>(Amber)<br><b> Avaunt </b>(DuPont)<br><b> Avval </b>(IIL)<br><b> Care </b>(KR)<br><b> \n" +
                            "Dhawa Gold </b>(Dhanuka)<br><b> Fego </b>(UPL)<br><b> Index </b>(Devidayal)<br><b> Indica </b>(Willowood)<br><b> Indimax </b>(Sumil)<br><b> Kaal </b>(Kilpest)<br><b> Super Doxa </b>(AOL)<br><b> Super Indoxa </b>(SuperCSL)<br><b> Tagpower </b>(Tropical)<br><b> Vantage </b>(Sulphur Mills)<br><b> Vindoxa </b>(Vimax)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "ACEPHATE 75% SP": {
                    row2text21.setText(Html.fromHtml("ACEPHATE 75% SP"));

                    currentbrand = getString(R.string.ACEPHATE_75_SP_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Accent 787 </b>(Sumil)<br><b> Ace </b>(Canary)<br><b> Acefex </b>(Excel)<br><b> Acesul </b>(Sulphur Mills)<br><b>Ample </b>(Advance)<br><b> Archa </b>(Amber)<br><b> Asataf </b>(TATA)<br><b> Bheem </b>(Kilpest)<br><b> Bhoochal 75 </b>(AOL)<br><b> Chettak </b>(GSP)<br><b> Corohamp </b>(CAPL)<br><b> Hilphate </b>(HIL)<br><b> \n" +
                            "King Phate </b>(KCS)<br><b> Kingmax </b>(Vimax)<br><b> Lancer </b>(UPL)<br><b> Lion </b>(SuperCSL)<br><b> Lucid </b>(Cheminova)<br><b> Megastar </b>(MIL)<br><b> Miltaf </b>(IIL)<br><b> Missile </b>(Devidayal)<br><b> Molphate </b>(GP)<br><b> Ortain </b>(Coromandel)<br><b> Orthene </b>(Arysta)<br><b> Oval </b>(PI Ind.)<br><b> \n" +
                            "Pace </b>(Nagarjuna)<br><b> Rasayan Phate </b>(KR)<br><b> Rythane </b>(Ramcides)<br><b> Sritaf </b>(Crystal)<br><b> Starthene </b>(Swal)<br><b> Tagace </b>(Tropical)<br><b> Top‘O’Top </b>(CGI)<br><b> Topsis </b>(Atul)<br><b> Topsis </b>(Atul)<br><b> Tremor </b>(BioStadt)<br><b> Vega </b>(PCCPL)<br><b> Willace </b>(Willowood)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "CARBARYL 50% WP": {
                    row2text21.setText(Html.fromHtml("CARBARYL 50% WP"));

                    currentbrand = getString(R.string.CARBARYL__50_WP_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Devicarb </b>(Devidayal)<br><b> Kavin </b>(KR)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "CHLORPYRIFOS 20% EC": {
                    row2text21.setText(Html.fromHtml("CHLORPYRIFOS 20% EC"));

                    currentbrand = getString(R.string.CHLORPYRIFOS_20_EC_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>All-Drin </b>(Ambuja)<br><b> Banest 20 </b>(Arysta)<br><b> Chloroban </b>(UPL)<br><b> Chlorocil </b>(GSP)<br><b> ChloroKing </b>(KCS)<br><b> Classic-20 </b>(Cheminova)<br><b> Crop Chlor </b>(NACL)<br><b>Dangal </b>(Canary)<br><b> Deviban 20 </b>(Devidayal)<br><b> Dursban </b>(Dow)<br><b> Gilphos </b>(GIL)<br><b>Gold Ban </b>(CCIL)<br><b> Hilban 20 </b>(HIL)<br><b> Hyban </b>(HCL)<br><b> Kaman / Eldrin TC </b>(Crystal)<br><b> Kartoos </b>(Amber)<br><b> Kattar 20 </b>(GKR)<br><b> Krishan 20 </b>(KR)<br><b> Lethal 20 EC </b>(IIL)<br><b> Lynch </b>(PCCPL)<br><b> Megaban </b>(MIL)<br><b> Mig-20 </b>(Kilpest)<br><b> Potta </b>(AOL)<br><b> Pyriban </b>(Aimco)<br><b> Pyrifex </b>(Safex)<br><b> Pyrifex </b>(Safex)<br><b> Sacban </b>(Shivalik)<br><b> Shreeban TC </b>(SKSCC)<br><b> Starban </b>(Swal)<br><b> Strike 20EC </b>(BioStadt)<br><b> Sulban </b>(SulphurMills)<br><b> Suldrin </b>(SuperCSL)<br><b> Tafaban </b>(TATA)<br><b> Tagban </b>(Tropical)<br><b> Tricel 20 </b>(Excel)<br><b> Trishul </b>(Coromandel)<br><b> Uno 501 </b>(Sumil)<br><b> Veermet </b>(Vimax)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "CYPERMETHRIN 3% + QUINALPHOS 20% EC": {
                    row2text21.setText(Html.fromHtml("CYPERMETHRIN 3% +<br> QUINALPHOS 20% EC"));

                    currentbrand = getString(R.string.CYPERMETHRIN_3_QUINALPHOS_20_EC_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Viraat </b>(UPL)<br><b> Alert </b>(Devidayal)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "FENVALERATE 20% EC": {
                    row2text21.setText(Html.fromHtml("FENVALERATE 20% EC"));

                    currentbrand = getString(R.string.FENVALERATE_20_EC_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Devifen 20 </b>(Devidayal)<br><b> Fencot 20 E </b>(Kilpest)<br><b> Fenkill </b>(UPL)<br><b>Fenval 20 EC </b>(Isagro Asia)<br><b> Final 20 </b>(AOL)<br><b> King Pen </b>(KCS)<br><b>Krifen </b>(KR)<br><b> Tatafen </b>(TATA)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "THIODICARB 75% WP": {
                    row2text21.setText(Html.fromHtml("THIODICARB 75% WP"));

                    currentbrand = getString(R.string.THIODICARB_75__WP_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Larvin </b>(Bayer)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "QUINALPHOS 20% AF": {
                    row2text21.setText(Html.fromHtml("QUINALPHOS 20% AF"));

                    currentbrand = getString(R.string.QUINALPHOS_20_AF_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Battle </b>(GKR)<br><b> Deviquin </b>(Devidayal)<br><b> Ekalux </b>(Syngenta)<br><b> Flash </b>(Indofil)<br><b> Hilquin </b>(HIL)<br><b> Keterphos  </b>(Kilpest)<br><b> Krilux </b>(KR)<br><b> Krush </b>(BioStadt)<br><b>Starlux </b>(Swal)<br><b> Vazra </b>(Cheminova)<br><b>  Virsta </b>(Vimax)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "CHLORPYRIFOS 50% + CYPERMETHRIN 5%EC": {
                    row2text21.setText(Html.fromHtml("CHLORPYRIFOS 50% +<br> CYPERMETHRIN 5%EC"));

                    currentbrand = getString(R.string.CHLORPYRIFOS_50_CYPERMETHRIN_5_EC_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Action 505 </b>(Tropical)<br><b> Anth </b>(KR)<br><b> Balio </b>(Atul)<br><b> Cannon </b>(Nagarjuna)<br><b> Catchh </b>(Coromandel)<br><b> Combi King </b>(KCS)<br><b> Cyklon </b>(GSP)<br><b> Double Star </b>(Swal)<br><b> Hamla 550 </b>(Gharda)<br><b> Hilhunter </b>(HIL)<br><b> Koranda 505 </b>(TATA)<br><b> \n" +
                            "Lethal Super 505 </b>(IIL)<br><b> Lynch + Combi </b>(PCCPL)<br><b> Nagraj 505 </b>(CCIL)<br><b> Nurocomb </b>(Cheminova)<br><b> Panther </b>(Amber)<br><b> Pradhan </b>(Kilpest)<br><b> Sac 505 </b>(Shivalik)<br><b> Sinergy </b>(MIL)<br><b> Super 505 </b>(SuperCSL)<br><b>Super Strong 505 </b>(Sumil)<br><b> Ulka 505 </b>(BioStadt)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "CYPERMETHRIN 10% EC": {
                    row2text21.setText(Html.fromHtml("CYPERMETHRIN 10% EC"));

                    currentbrand = getString(R.string.CYPERMETHRIN_10_EC_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Action-10 </b>(CCIL)<br><b> Challenger 10 </b>(Tropical)<br><b> Cyper King </b>(KCS)<br><b> Cypercil </b>(GSP)<br><b> Cypercot 10 E </b>(Kilpest)<br><b> Cypermil </b>(IIL)<br><b> Devicyper 10 </b>(Devidayal)<br><b>Kricyp-10 </b>(KR)<br><b> Megatrin </b>(MIL)<br><b> Shakti-10 </b>(Cheminova)<br><b> Shera 10 </b>(AOL)<br><b> Starcip-10 </b>(Swal)<br><b> Super Jet </b>(SuperCSL)<br><b> SuperKiller 10 </b>(Dhanuka)<br><b> Ustaad </b>(UPL)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "DELTAMETHRIN 2.8% EC": {
                    row2text21.setText(Html.fromHtml("DELTAMETHRIN 2.8% EC"));

                    currentbrand = getString(R.string.DELTAMETHRIN_2_8_EC_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Decis 2.8 </b>(Bayer)<br><b> Shastra </b>(Devidayal)<br><b> Tagcis 100 </b>(Tropical)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "PROFENOFOS 50% EC": {
                    row2text21.setText(Html.fromHtml("PROFENOFOS 50% EC"));

                    currentbrand = getString(R.string.PROFENOPHOS_50_EC_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Ajanta </b>(Coromandel)<br><b> Aurifos </b>(Cheminova)<br><b> Bahadur 201- 40% </b>(Sumil)<br><b> Banjo </b>(IIL)<br><b> Carina </b>(PI Ind.)<br><b> Celcron </b>(Excel)<br><b> Curacron </b>(Syngenta)<br><b> Devi-soldier </b>(Devidayal)<br><b> Hilfos </b>(HIL)<br><b> Jashn </b>(TATA)<br><b> Kilcron </b>(Crystal)<br><b> \n" +
                            "King Cron </b>(KCS)<br><b> Kombat </b>(PCCPL)<br><b> Kriphos </b>(KR)<br><b> Laser </b>(Advance)<br><b> Maxcron </b>(Vimax)<br><b> Orax </b>(Atul)<br><b> Prahar & Prudent </b>(BioStadt)<br><b> Profax </b>(AOL)<br><b> Profenofos 50 EC </b>(GAICL)<br><b> Profex </b>(Nagarjuna)<br><b> Profos </b>(Sulphur Mills)<br><b> \n" +
                            "Proven </b>(MIL)<br><b> Simcron </b>(GSP)<br><b> Sucron </b>(SuperCSL)<br><b> Tagpro </b>(Tropical)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "PROFENOFOS 40% + CYPERMETHRIN 4% EC": {
                    row2text21.setText(Html.fromHtml("PROFENOFOS 40% +<br> CYPERMETHRIN 4% EC"));

                    currentbrand = getString(R.string.PROFENOPHOS_40_CYPERMETHRIN_4_EC_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Ajanta Super </b>(Coromandel)<br><b> Banjo Super </b>(IIL)<br><b> Correct </b>(MIL)<br><b> Cypro </b>(Sulphur Mills)<br><b> Genesis </b>(Willowood)<br><b> Hitcel </b>(Excel)<br><b> Impact </b>(Advance)<br><b> Kilcron Plus </b>(Crystal)<br><b> Kriphos Super </b>(KR)<br><b> Legend Super </b>(CCIL)<br><b> \n" +
                            "Maxcron Super </b>(Vimax)<br><b> Orax Super </b>(Atul)<br><b> Pataka </b>(Tropical)<br><b> Polytrin C </b>(Syngenta)<br><b> Profeno King </b>(KCS)<br><b> Profex Super </b>(Nagarjuna)<br><b> Prosper-44 </b>(Devidayal)<br><b> Protrin </b>(Sumil)<br><b> Razor </b>(Kilpest)<br><b> Roket </b>(PI Ind.)<br><b> Sumit 99 </b>(SuperCSL)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "EMAMECTIN BENZOATE 5% SG": {
                    row2text21.setText(Html.fromHtml("EMAMECTIN BENZOATE 5% SG"));

                    currentbrand = getString(R.string.EMAMECTIN_BENZOATE_5_SG_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Benzer </b>(Coromandel)<br><b> Bioclaim & Inclaim </b>(BioStadt)<br><b> Claim </b>(Canary)<br><b>EM-1 </b>(Dhanuka)<br><b> Emacto </b>(Willowood)<br><b> Empower </b>(Sumil)<br><b> Emstar 5 </b>(KR)<br><b>Emzet </b>(Sulphur Mills)<br><b> Missile </b>(Crystal)<br><b> Proceed </b>(Amber)<br><b> Proclaim </b>(Syngenta)<br><b> Robot </b>(Excel)<br><b> Spolit </b>(UPL)<br><b> Starclaim </b>(Swal)<br><b> Tatkal </b>(Gharda)<br><b> Trust </b>(Nagarjuna)<br><b> Wegon </b>(Vimax)<br><b> Xplode </b>(IIL).\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "LAMBDA-CYHALOTHRIN 2.5% EC": {
                    row2text21.setText(Html.fromHtml("LAMBDA-CYHALOTHRIN 2.5% EC"));

                    currentbrand = getString(R.string.LAMBDA_CYHALOTHRIN_2_5_EC_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Agent Plus </b>(Indofil)<br><b> Bravo 2500 </b>(IIL)<br><b> Demand </b>(Tropical)<br><b> Flex 801 </b>(Sumil)<br><b> Hillambda </b>(HIL)<br><b> Jaguar </b>(Sulphur Mills)<br><b> Judo </b>(Crystal)<br><b> Kozuka </b>(BioStadt)<br><b> Lambada 2.5 </b>(Canary)<br><b> Lambdastar </b>(Swal)<br><b> Ninja </b>(Devidayal)<br><b> Reeva 2.5 </b>(TATA)<br><b> Samurai </b>(GSP)<br><b> Spider </b>(SuperCSL)<br><b> Sumo </b>(Kilpest)<br><b> Xylo </b>(Atul)."));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "LAMBDA-CYHALOTHRIN 5% EC": {
                    row2text21.setText(Html.fromHtml("LAMBDA-CYHALOTHRIN 5% EC"));

                    currentbrand = getString(R.string.LAMBDA_CYHALOTHRIN_5_EC_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Bravo 5000 </b>(IIL)<br><b> Dragon 701 </b>(Sumil)<br><b> Hillambda </b>(HIL)<br><b> Judho 5 EC </b>(Yesell)<br><b> Judo </b>(Devidayal)<br><b> Judo Plus </b>(Crystal)<br><b> Karate </b>(Syngenta)<br><b> Kataar </b>(CCIL)<br><b>Lakshya </b>(Advance)<br><b> Lambada5 </b>(Canary)<br><b>  LOC-5 </b>(KR)<br><b>  Mustang </b>(Sulphur Mills)<br><b> Ray </b>(PCCPL)<br><b> Reeva 5 </b>(TATA)<br><b> Remand </b>(Amber)<br><b> Richo </b>(Vimax)<br><b> Santri </b>(GSP)<br><b> Spider Plus </b>(SuperCSL)<br><b> Sumo Plus </b>(Kilpest)<br><b> Sunny </b>(Willowood)<br><b> Tag Command </b>(Tropical)<br><b> Thiachi </b>(AOL)<br><b> Xylo-5 </b>(Atul).\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "MONOCROTOPHOS 36% SL": {
                    row2text21.setText(Html.fromHtml("MONOCROTOPHOS 36% SL"));

                    currentbrand = getString(R.string.MONOCROTOPHOS_36_SL_spotted);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Admono </b>(Advance)<br><b> Crop Mono </b>(NACL)<br><b> Crotocel </b>(Excel)<br><b> Devimono </b>(Devidayal)<br><b> Hilcron </b>(HIL)<br><b> Kevin 360 </b>(Sumil)<br><b> Kilphex 36% </b>(Kilpest)<br><b> King Phos </b>(KCS)<br><b> Luphos </b>(Crystal)<br><b> Macrophos </b>(Tropical)<br><b> Megamono </b>(MIL)<br><b> Monocil </b>(IIL)<br><b>  Monocip </b>(Vimax)<br><b> Monofos 36 </b>(Safex)<br><b> Monogil </b>(GIL)<br><b> Monostar </b>(Swal)<br><b> Monosul </b>(Sulphur Mills)<br><b> Parryfos/Monophos </b>(Coromandel)<br><b> Phoskill </b>(UPL)<br><b> Rasayanphos </b>(KR)<br><b> Shura </b>(PCCPL)<br><b> Sumo </b>(SuperCSL).\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
            }
        }else if (Title.equals("Leafworm or Tobacco caterpillar")) {
            txttt.setText("The identified Pest is Leafworm or Tobacco caterpillar");
            txttt.setSingleLine();
            String currentbrand;

            switch(insecticide_brand) {
                case "CHLORANTRANILIPROLE 18.5% SC": {
                    row2text21.setText(Html.fromHtml("CHLORANTRANILIPROLE 18.5% SC"));

                    currentbrand = getString(R.string.CHLORANTRANILIPROLE_18_5_SC_leafworm);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Coragen </b>(DuPont)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "NOVALURON 8.8% SC": {
                    row2text21.setText(Html.fromHtml("NOVALURON 8.8% SC"));

                    currentbrand = getString(R.string.NOVALURON_8_8_SC_leafworm);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>DNA </b>(Willowood)<br><b> Noval </b>(KR)<br><b> Novamax </b>(Vimax)<br><b> Remostar </b>(Swal)<br><b> Rimon </b>(Indofil)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "CHLORPYRIFOS 20% EC": {
                    row2text21.setText(Html.fromHtml("CHLORPYRIFOS 20% EC"));

                    currentbrand = getString(R.string.CHLORPYRIFOS_20_EC_leafworm);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>All-Drin </b>(Ambuja)<br><b> Banest 20 </b>(Arysta)<br><b> Chloroban </b>(UPL)<br><b> Chlorocil </b>(GSP)<br><b> ChloroKing </b>(KCS)<br><b> Classic-20 </b>(Cheminova)<br><b> Crop Chlor </b>(NACL)<br><b> Dangal </b>(Canary)<br><b> Deviban 20 </b>(Devidayal)<br><b> Dursban </b>(Dow)<br><b> Gilphos </b>(GIL)<br><b> \n" +
                            "Gold Ban </b>(CCIL)<br><b> Hilban 20 </b>(HIL)<br><b> Hyban </b>(HCL)<br><b> Kaman / Eldrin TC </b>(Crystal)<br><b> Kartoos </b>(Amber)<br><b> Kattar 20 </b>(GKR)<br><b> Krishan 20 </b>(KR)<br><b> Lethal 20 EC </b>(IIL)<br><b> Lynch </b>(PCCPL)<br><b> Megaban </b>(MIL)<br><b> Mig-20 </b>(Kilpest)<br><b> Potta </b>(AOL)<br><b> Pyriban </b>(Aimco)<br><b> Pyrifex </b>(Safex)<br><b> Pyrifex </b>(Safex)<br><b> Sacban </b>(Shivalik)<br><b> Shreeban TC </b>(SKSCC)<br><b> Starban </b>(Swal)<br><b> Strike 20EC </b>(BioStadt)<br><b> Sulban </b>(SulphurMills)<br><b>Suldrin </b>(SuperCSL)<br><b> Tafaban </b>(TATA)<br><b> Tagban </b>(Tropical)<br><b> Tricel 20 </b>(Excel)<br><b> Trishul </b>(Coromandel)<br><b> Uno 501 </b>(Sumil)<br><b> Veermet </b>(Vimax)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "EMAMECTIN BENZOATE 5% SG": {
                    row2text21.setText(Html.fromHtml("EMAMECTIN BENZOATE 5% SG"));

                    currentbrand = getString(R.string.EMAMECTIN_BENZOATE_5_SG_leafworm);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Benzer </b>(Coromandel)<br><b> Bioclaim & Inclaim </b>(BioStadt)<br><b> Claim </b>(Canary)<br><b> EM-1 </b>(Dhanuka)<br><b> Emacto </b>(Willowood)<br><b> Empower </b>(Sumil)<br><b> Emstar 5 </b>(KR)<br><b> Emzet </b>(Sulphur Mills)<br><b> Missile </b>(Crystal)<br><b> Proceed </b>(Amber)<br><b> Proclaim </b>(Syngenta)<br><b> Robot </b>(Excel)<br><b> Spolit </b>(UPL)<br><b> Starclaim </b>(Swal)<br><b> Tatkal </b>(Gharda)<br><b> Trust </b>(Nagarjuna)<br><b> Wegon </b>(Vimax)<br><b> Xplode </b>(IIL)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "HLORANTRANILIPROLE 9.3% + LAMBDA CYHALOTHRIN 4.6% ZC": {
                    row2text21.setText(Html.fromHtml("HLORANTRANILIPROLE 9.3% +<br> LAMBDA CYHALOTHRIN 4.6% ZC"));

                    currentbrand = getString(R.string.CHLORANTRANILIPROLE_9_3LAMBDA_CYHALOTHRIN_4_6_ZC_leafworm);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Ampligo </b>(Syngenta)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "ACEPHATE 75% SP": {
                    row2text21.setText(Html.fromHtml("ACEPHATE 75% SP"));

                    currentbrand = getString(R.string.ACEPHATE_75_SP_leafworm);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Accent 787 </b>(Sumil)<br><b> Ace </b>(Canary)<br><b> Acefex </b>(Excel)<br><b> Acesul </b>(Sulphur Mills)<br><b> Ample </b>(Advance)<br><b> Archa </b>(Amber)<br><b> Asataf </b>(TATA)<br><b> Bheem </b>(Kilpest)<br><b> Bhoochal 75 </b>(AOL)<br><b> Chettak </b>(GSP)<br><b> Corohamp </b>(CAPL)<br><b> Hilphate </b>(HIL)<br><b> \n" +
                            "King Phate </b>(KCS)<br><b> Kingmax </b>(Vimax)<br><b> Lancer </b>(UPL)<br><b> Lion </b>(SuperCSL)<br><b> Lucid </b>(Cheminova)<br><b> Megastar </b>(MIL)<br><b> Miltaf </b>(IIL)<br><b> Missile </b>(Devidayal)<br><b> Molphate </b>(GP)<br><b> Ortain </b>(Coromandel)<br><b> Orthene </b>(Arysta)<br><b> Oval </b>(PI Ind.)<br><b> \n" +
                            "Pace </b>(Nagarjuna)<br><b> Rasayan Phate </b>(KR)<br><b> Rythane </b>(Ramcides)<br><b> Sritaf </b>(Crystal)<br><b> Starthene </b>(Swal)<br><b> Tagace </b>(Tropical)<br><b> Top‘O’Top </b>(CGI)<br><b> Topsis </b>(Atul)<br><b> Topsis </b>(Atul)<br><b> Tremor </b>(BioStadt)<br><b> Vega </b>(PCCPL)<br><b> Willace </b>(Willowood)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "CARBARYL 50% WP": {
                    row2text21.setText(Html.fromHtml("CARBARYL 50% WP"));

                    currentbrand = getString(R.string.CARBARYL_50_WP_leafworm);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Devicarb </b>(Devidayal) <br><b> Kavin </b>(KR)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "DELTAMETHRIN 2.8% EC": {
                    row2text21.setText(Html.fromHtml("DELTAMETHRIN 2.8% EC"));

                    currentbrand = getString(R.string.DELTAMETHRIN_2_8_EC_leafworm);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Decis 2.8 </b>(Bayer)<br><b> Shastra </b>(Devidayal)<br><b> Tagcis 100 </b>(Tropical)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "FENVALERATE 20% EC": {
                    row2text21.setText(Html.fromHtml("FENVALERATE 20% EC"));

                    currentbrand = getString(R.string.FENVALERATE_20_EC_leafworm);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Devifen 20 </b>(Devidayal)<br><b> Fencot 20 E </b>(Kilpest)<br><b> Fenkill </b>(UPL)<br><b> Fenval 20 EC </b>(Isagro Asia)<br><b> Final 20 </b>(AOL)<br><b> King Pen </b>(KCS)<br><b> Krifen </b>(KR)<br><b> Tatafen </b>(TATA)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "INDOXACARB 14.5% SC": {
                    row2text21.setText(Html.fromHtml("INDOXACARB 14.5% SC"));

                    currentbrand = getString(R.string.INDOXACARB_14_5_SC_leafworm);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Amsac </b>(Atul)<br><b> Arav </b>(Amber)<br><b> Avaunt </b>(DuPont)<br><b> Avval </b>(IIL)<br><b> Care </b>(KR)<br><b> Dhawa Gold </b>(Dhanuka)<br><b> Fego </b>(UPL)<br><b> Index </b>(Devidayal)<br><b> Indica </b>(Willowood)<br><b> Indimax </b>(Sumil)<br><b> Kaal </b>(Kilpest)<br><b> Super Doxa </b>(AOL)<br><b> Super Indoxa </b>(SuperCSL)<br><b> Tagpower </b>(Tropical)<br><b> Vantage </b>(Sulphur Mills)<br><b> Vindoxa </b>(Vimax)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "LAMBDA-CYHALOTHRIN 2.5% EC": {
                    row2text21.setText(Html.fromHtml("LAMBDA-CYHALOTHRIN 2.5% EC"));

                    currentbrand = getString(R.string.LAMBDA_CYHALOTHRIN_2_5_EC_leafworm);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Agent Plus </b>(Indofil)<br><b> Bravo 2500 </b>(IIL)<br><b> Demand </b>(Tropical)<br><b> Flex 801 </b>(Sumil)<br><b> Hillambda </b>(HIL)<br><b> Jaguar </b>(Sulphur Mills)<br><b> Judo </b>(Crystal)<br><b> Kozuka </b>(BioStadt)<br><b> Lambada 2.5 </b>(Canary)<br><b> Lambdastar </b>(Swal)<br><b> Ninja </b>(Devidayal)<br><b> Reeva 2.5 </b>(TATA)<br><b> Samurai </b>(GSP)<br><b> Spider </b>(SuperCSL)<br><b> Sumo </b>(Kilpest)<br><b> Xylo </b>(Atul)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "LAMBDA-CYHALOTHRIN 5% EC": {
                    row2text21.setText(Html.fromHtml("LAMBDA-CYHALOTHRIN 5% EC"));

                    currentbrand = getString(R.string.LAMBDA_CYHALOTHRIN_5_EC_leafworm);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Bravo 5000 </b>(IIL)<br><b> Dragon 701 </b>(Sumil)<br><b> Hillambda </b>(HIL)<br><b> Judho 5 EC </b>(Yesell)<br><b> Judo </b>(Devidayal)<br><b> Judo Plus </b>(Crystal)<br><b> Karate </b>(Syngenta)<br><b> Kataar </b>(CCIL)<br><b>Lakshya </b>(Advance)<br><b> Lambada5 </b>(Canary)<br><b>  LOC-5 </b>(KR)<br><b>  Mustang </b>(Sulphur Mills)<br><b> Ray </b>(PCCPL)<br><b> Reeva 5 </b>(TATA)<br><b> Remand </b>(Amber)<br><b> Richo </b>(Vimax)<br><b> Santri </b>(GSP)<br><b> Spider Plus </b>(SuperCSL)<br><b> Sumo Plus </b>(Kilpest)<br><b> Sunny </b>(Willowood)<br><b> Tag Command </b>(Tropical)<br><b> Thiachi </b>(AOL)<br><b> Xylo-5 </b>(Atul)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "MONOCROTOPHOS 36% SL": {
                    row2text21.setText(Html.fromHtml("MONOCROTOPHOS 36% SL"));

                    currentbrand = getString(R.string.MONOCROTOPHOS_36_SL_leafworm);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Admono </b>(Advance)<br><b> Crop Mono </b>(NACL)<br><b> Crotocel </b>(Excel)<br><b> Devimono </b>(Devidayal)<br><b> Hilcron </b>(HIL)<br><b> Kevin 360 </b>(Sumil)<br><b> Kilphex 36% </b>(Kilpest)<br><b> King Phos </b>(KCS)<br><b> Luphos </b>(Crystal)<br><b> Macrophos </b>(Tropical)<br><b> Megamono </b>(MIL)<br><b> Monocil </b>(IIL)<br><b>  Monocip </b>(Vimax)<br><b> Monofos 36 </b>(Safex)<br><b> Monogil </b>(GIL)<br><b> Monostar </b>(Swal)<br><b> Monosul </b>(Sulphur Mills)<br><b> Parryfos/Monophos </b>(Coromandel)<br><b> Phoskill </b>(UPL)<br><b> Rasayanphos </b>(KR)<br><b> Shura </b>(PCCPL)<br><b> Sumo </b>(SuperCSL)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "PROFENOFOS 40% + CYPERMETHRIN 4% EC": {
                    row2text21.setText(Html.fromHtml("PROFENOFOS 40% +<br> CYPERMETHRIN 4% EC"));

                    currentbrand = getString(R.string.PROFENOPHOS_40CYPERMETHRIN_4_EC_leafworm);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Ajanta Super </b>(Coromandel)<br><b> Banjo Super </b>(IIL)<br><b> Correct </b>(MIL)<br><b> Cypro </b>(Sulphur Mills)<br><b> Genesis </b>(Willowood)<br><b> Hitcel </b>(Excel)<br><b> Impact </b>(Advance)<br><b> Kilcron Plus </b>(Crystal)<br><b> Kriphos Super </b>(KR)<br><b> Legend Super </b>(CCIL)<br><b> \n" +
                            "Maxcron Super </b>(Vimax)<br><b> Orax Super </b>(Atul)<br><b> Pataka </b>(Tropical)<br><b> Polytrin C </b>(Syngenta)<br><b> Profeno King </b>(KCS)<br><b> Profex Super </b>(Nagarjuna)<br><b> Prosper-44 </b>(Devidayal)<br><b> Protrin </b>(Sumil)<br><b> Razor </b>(Kilpest)<br><b> Roket </b>(PI Ind.)<br><b> Sumit 99 </b>(SuperCSL)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
            }
        }else if (Title.equals("Thrips")) {
            txttt.setText("The identified Pest is Thrips");
            txttt.setSingleLine();
            String currentbrand;

            switch(insecticide_brand) {
                case "THIAMETHOXAM 25% WG": {
                    row2text21.setText(Html.fromHtml("THIAMETHOXAM 25% WG"));

                    currentbrand = getString(R.string.THIOMETHOXAM_25_WG);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Abhedh </b>(Amber)<br><b> Actara </b>(Syngenta)<br><b> Actor </b>(Kilpest)<br><b> Agrostar </b>(AOL)<br><b> Areva </b>(Dhanuka)<br><b> Arrow </b>(IIL)<br><b> Battalion </b>(Swal)<br><b> Click </b>(Indofil)<br><b> Devitara </b>(Devidayal)<br><b> Dxtar </b>(Nagarjuna)<br><b> Evident & Tiomax </b>(BioStadt)<br><b> \n" +
                            "Extra Super </b>(Crystal)<br><b> Giltara </b>(GIL)<br><b> King Tara </b>(KCS)<br><b> Kri-Oxm </b>(KR)<br><b> Maestro 707 </b>(Sumil)<br><b> Maxima </b>(PI Ind.)<br><b> Maxtara </b>(Vimax)<br><b> Optra </b>(Coromandel)<br><b> Renova </b>(UPL)<br><b> Spike </b>(Sulphur Mills)<br><b> Spora </b>(Atul)<br><b> Super Tara </b>(SuperCSL)<br><b> Tagxone </b>(Tropical)<br><b> Theme </b>(MIL)<br><b> Willoxam </b>(Willowood)<br><b> Wonderex </b>(Excel)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "FLONICAMID 50% WG": {
                    row2text21.setText(Html.fromHtml("FLONICAMID 50% WG"));

                    currentbrand = getString(R.string.FLONICAMID_50_WG);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Ulala<br><b>  Panama"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "BUPROFEZIN 25% SC": {
                    row2text21.setText(Html.fromHtml("BUPROFEZIN 25% SC"));

                    currentbrand = getString(R.string.BUPROFEZIN_25_SC_th);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Applaud </b>(TATA)<br><b> Apple </b>(Dhanuka)<br><b> Awaksh </b>(Amber)<br><b> Banzo </b>(BioStadt)<br><b> Benj </b>(Nagarjuna)<br><b> Braun 111 </b>(Sumil)<br><b> Bravo </b>(Sulphur Mills)<br><b> Buprostar </b>(MIL)<br><b> Cordon </b>(Advance)<br><b> Deligent </b>(Willowood)<br><b> Devifezin </b>(Devidayal)<br><b> Flotis </b>(Bayer)<br><b> Hillblaze </b>(HIL)<br><b> Irvy </b>(Dow)<br><b> Jantar </b>(Canary)<br><b> Jawaa </b>(DuPont)<br><b> KriMarch </b>(KR)<br><b> Ninja </b>(Coromandel)<br><b> Phentom </b>(IIL)<br><b> PI Bupro </b>(PI Ind.)<br><b> Tagvoltage </b>(Tropical)<br><b> Tribune </b>(Crystal)<br><b> Trust </b>(Swal)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "CARBARYL 50% WP": {
                    row2text21.setText(Html.fromHtml("CARBARYL  50% WP"));

                    currentbrand = getString(R.string.CARBARYL_50_WP);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Devicarb </b>(Devidayal)<br><b>  Kavin </b>(KR)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "IMIDACLOPRID 17.8% SL": {
                    row2text21.setText(Html.fromHtml("IMIDACLOPRID 17.8% SL"));

                    currentbrand = getString(R.string.IMIDACHLOPRID_17_8_SL);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Atom </b>(Indofil)<br><b> Chemida </b>(Cheminova)<br><b> Confidor </b>(Bayer)<br><b> Courage </b>(MIL)<br><b> Crop Mida </b>(NACL)<br><b> Expert 100 </b>(Sumil)<br><b> Farrata </b>(Canary)<br><b> Hilmida </b>(HIL)<br><b>Hotshot </b>(Sulphur Mills)<br><b> Imida Gold </b>(UPL)<br><b> Imidacel </b>(Excel)<br><b> Imidastar </b>(Swal)<br><b> Imiden </b>(Dow)<br><b> Imidore </b>(CCIL)<br><b> Imigrow </b>(CLSL)<br><b> Josh </b>(KR)<br><b> Jumbo </b>(PI Ind.)<br><b> Kildor </b>(Kilpest)<br><b> King Dor </b>(KCS)<br><b> Leopard </b>(Willowood)<br><b> Media </b>(Dhanuka)<br><b>Mida </b>(Nagarjuna)<br><b> Midas </b>(AOL)<br><b> Midas 2000 </b>(Devidayal)<br><b> Parrymida </b>(Coromandel)<br><b> Radiant </b>(PCCPL)<br><b> Ribo </b>(Atul)<br><b> Sacdor </b>(Shivalik)<br><b> Seamer </b>(DuPont)<br><b> Sumida </b>(SuperCSL)<br><b> Tatamida </b>(TATA)<br><b> Tropical Magic </b>(Tropical)<br><b> Ultimo </b>(BioStadt)<br><b> Victor </b>(IIL)<br><b> V-Mida </b>(Vimax).\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "LAMBDA-CYHALOTHRIN 2.5% EC": {
                    row2text21.setText(Html.fromHtml("LAMBDA-CYHALOTHRIN 2.5% EC"));

                    currentbrand = getString(R.string.LAMBDA_CYHALOTHRIN_2_5_EC);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Agent Plus </b>(Indofil)<br><b> Bravo 2500 </b>(IIL)<br><b> Demand </b>(Tropical)<br><b> Flex 801 </b>(Sumil)<br><b> Hillambda </b>(HIL)<br><b> Jaguar </b>(Sulphur Mills)<br><b> Judo </b>(Crystal)<br><b> Kozuka </b>(BioStadt)<br><b> Lambada 2.5 </b>(Canary)<br><b> Lambdastar </b>(Swal)<br><b> Ninja </b>(Devidayal)<br><b> Reeva 2.5 </b>(TATA)<br><b> Samurai </b>(GSP)<br><b> Spider </b>(SuperCSL)<br><b> Sumo </b>(Kilpest)<br><b> Xylo </b>(Atul)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "MONOCROTOPHOS 36% SL": {
                    row2text21.setText(Html.fromHtml("MONOCROTOPHOS 36% SL"));

                    currentbrand = getString(R.string.MONOCROTOPHOS_36_SL_th);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Admono </b>(Advance)<br><b> Crop Mono </b>(NACL)<br><b> Crotocel </b>(Excel)<br><b>Devimono </b>(Devidayal)<br><b> Hilcron </b>(HIL)<br><b> Kevin 360 </b>(Sumil)<br><b> Kilphex 36% </b>(Kilpest)<br><b> King Phos </b>(KCS)<br><b> Luphos </b>(Crystal)<br><b> Macrophos </b>(Tropical)<br><b> Megamono </b>(MIL)<br><b> Monocil </b>(IIL)<br><b>  Monocip </b>(Vimax)<br><b> Monofos 36 </b>(Safex)<br><b> Monogil </b>(GIL)<br><b> Monostar </b>(Swal)<br><b> Monosul </b>(Sulphur Mills)<br><b> Parryfos/Monophos </b>(Coromandel)<br><b> Phoskill </b>(UPL)<br><b> Rasayanphos </b>(KR)<br><b> Shura </b>(PCCPL)<br><b> Sumo </b>(SuperCSL)\n"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "PROFENOFOS 50% EC": {
                    row2text21.setText(Html.fromHtml("PROFENOFOS 50% EC"));

                    currentbrand = getString(R.string.PROFENOPHOS50_EC);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Ajanta </b>(Coromandel)<br><b> Aurifos </b>(Cheminova)<br><b> Bahadur 201- 40% </b>(Sumil)<br><b> Banjo </b>(IIL)<br><b> Carina </b>(PI Ind.)<br><b> Celcron </b>(Excel)<br><b> Curacron </b>(Syngenta)<br><b> Devi-soldier </b>(Devidayal)<br><b> Hilfos </b>(HIL)<br><b> Jashn </b>(TATA)<br><b> Kilcron </b>(Crystal)<br><b> \n" +
                            "King Cron </b>(KCS)<br><b> Kombat </b>(PCCPL)<br><b> Kriphos </b>(KR)<br><b> Laser </b>(Advance)<br><b> Maxcron </b>(Vimax)<br><b> Orax </b>(Atul)<br><b> Prahar & Prudent </b>(BioStadt)<br><b> Profax </b>(AOL)<br><b> Profenofos 50 EC </b>(GAICL)<br><b> Profex </b>(Nagarjuna)<br><b> Profos </b>(Sulphur Mills)<br><b> \n" +
                            "Proven </b>(MIL)<br><b> Simcron </b>(GSP)<br><b> Sucron </b>(SuperCSL)<br><b> Tagpro </b>(Tropical)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "CHLORPYRIFOS 50% + CYPERMETHRIN 5%EC": {
                    row2text21.setText(Html.fromHtml("CHLORPYRIFOS 50% + <br>CYPERMETHRIN 5%EC"));

                    currentbrand = getString(R.string.CHLORPYRIFOS50_CYPERMETHRIN_5_EC);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Action 505 </b>(Tropical)<br><b> Anth </b>(KR)<br><b> Balio </b>(Atul)<br><b> Cannon </b>(Nagarjuna)<br><b> Catchh </b>(Coromandel)<br><b> Combi King </b>(KCS)<br><b> Cyklon </b>(GSP)<br><b> Double Star </b>(Swal)<br><b> Hamla 550 </b>(Gharda)<br><b> Hilhunter </b>(HIL)<br><b> Koranda 505 </b>(TATA)<br><b> Lethal Super 505 </b>(IIL)<br><b> Lynch + Combi </b>(PCCPL)<br><b> Nagraj 505 </b>(CCIL)<br><b> Nurocomb </b>(Cheminova)<br><b> Panther </b>(Amber)<br><b> Pradhan </b>(Kilpest)<br><b> \n" +
                            "Sac 505 </b>(Shivalik)<br><b> Sinergy </b>(MIL)<br><b> Super 505 </b>(SuperCSL)<br><b> Super Strong 505 </b>(Sumil)<br><b>  Ulka 505 </b>(BioStadt)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "DELTAMETHRIN 2.8% EC": {
                    row2text21.setText(Html.fromHtml("DELTAMETHRIN 2.8% EC"));

                    currentbrand = getString(R.string.DELTAMETHRIN_2_8_EC);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Decis 2.8 </b>(Bayer)<br><b> Shastra </b>(Devidayal)<br><b> Tagcis 100 </b>(Tropical)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "FENVALERATE 20% EC": {
                    row2text21.setText(Html.fromHtml("FENVALERATE 20% EC"));

                    currentbrand = getString(R.string.FENVALERATE_20_EC_th);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Krifen </b>(KR)<br><b> Fenkill </b>(UPL)<br><b> King Pen </b>(KCS)<br><b> Fenval </b>(Isagro Asia)<br><b> Devifen 20 </b>(Devidayal)<br><b> Tatafen </b>(TATA)<br><b> Fencot </b>(Kilpest)<br><b> Final 20 </b>(AOL)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "THIACLOPRID 21.7% SC": {
                    row2text21.setText(Html.fromHtml("THIACLOPRID 21.7% SC"));

                    currentbrand = getString(R.string.THIACHLOPRID_21_7_SC);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Alanto </b>(Bayer)<br><b> Splendour </b>(Cheminova)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }case "DIAFENTHIURON 50%WP": {
                    row2text21.setText(Html.fromHtml("DIAFENTHIURON 50%WP"));

                    currentbrand = getString(R.string.DIAFENTHIURON_50_WP);
                    String[] splitter = currentbrand.split(":");
                    row2text22.setText(splitter[0]);
                    row2text23.setText(splitter[1]);
                    row2text24.setText(splitter[2]);
                    row2text25.setText(splitter[3]);
                    //  brand_bold = getString(R.string.brand_name1a).toString();
                    row2text26.setText(Html.fromHtml("<b>Alero </b>(Sumil)<br><b> Derby </b>(BioStadt)<br><b> Ferotia </b>(Coromandel)<br><b> Krijet/Krijet Super </b>(KR)<br><b> Logo/Gama </b>(IIL)<br><b> Polo/Pegasus </b>(Syngenta)<br><b> Ruby/Declare </b>(GSP)"));
                    //  row2text27.setText(getString(R.string.rate1a_brand_name1a));
                    break;
                }
            }
        }



                final Button btnOpenPopup = (Button)findViewById(R.id.Application);
        btnOpenPopup.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                LayoutInflater layoutInflater
                        = (LayoutInflater)getBaseContext()
                        .getSystemService(LAYOUT_INFLATER_SERVICE);
                View popupView = layoutInflater.inflate(R.layout.popup_application, null);
                final PopupWindow popupWindow = new PopupWindow(
                        popupView,
                        ActionBar.LayoutParams.WRAP_CONTENT,
                        ActionBar.LayoutParams.WRAP_CONTENT);

                Button cancel = (Button)popupView.findViewById(R.id.cancel);
                Button btnDismiss = (Button)popupView.findViewById(dismiss);
                btnDismiss.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }});
                cancel.setOnClickListener(new Button.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        popupWindow.dismiss();
                    }});
                popupWindow.showAsDropDown(btnOpenPopup, 50, 50);

            }});

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }


    @Override
    public void onBackPressed() {

        super.onBackPressed();
        this.finish();

    }
}
