package com.example.thoithanh.currencyexchange;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] array_countries = {
            "AED",
            "AFN",
            "ALL",
            "AMD",
            "ANG",
            "AOA",
            "ARS",
            "AUD",
            "AWG",
            "AZN",
            "BAM",
            "BBD",
            "BDT",
            "BGN",
            "BHD",
            "BIF",
            "BMD",
            "BND",
            "BOB",
            "BRL",
            "BSD",
            "BTC",
            "BTN",
            "BWP",
            "BYN",
            "BYR",
            "BZD",
            "CAD",
            "CDF",
            "CHF",
            "CLF",
            "CLP",
            "CNY",
            "COP",
            "CRC",
            "CUC",
            "CUP",
            "CVE",
            "CZK",
            "DJF",
            "DKK",
            "DOP",
            "DZD",
            "EGP",
            "ERN",
            "ETB",
            "EUR",
            "FJD",
            "FKP",
            "GBP",
            "GEL",
            "GGP",
            "GHS",
            "GIP",
            "GMD",
            "GNF",
            "GTQ",
            "GYD",
            "HKD",
            "HNL",
            "HRK",
            "HTG",
            "HUF",
            "IDR",
            "ILS",
            "IMP",
            "INR",
            "IQD",
            "IRR",
            "ISK",
            "JEP",
            "JMD",
            "JOD",
            "JPY",
            "KES",
            "KGS",
            "KHR",
            "KMF",
            "KPW",
            "KRW",
            "KWD",
            "KYD",
            "KZT",
            "LAK",
            "LBP",
            "LKR",
            "LRD",
            "LSL",
            "LTL",
            "LVL",
            "LYD",
            "MAD",
            "MDL",
            "MGA",
            "MKD",
            "MMK",
            "MNT",
            "MOP",
            "MRO",
            "MUR",
            "MVR",
            "MWK",
            "MXN",
            "MYR",
            "MZN",
            "NAD",
            "NGN",
            "NIO",
            "NOK",
            "NPR",
            "NZD",
            "OMR",
            "PAB",
            "PEN",
            "PGK",
            "PHP",
            "PKR",
            "PLN",
            "PYG",
            "QAR",
            "RON",
            "RSD",
            "RUB",
            "RWF",
            "SAR",
            "SBD",
            "SCR",
            "SDG",
            "SEK",
            "SGD",
            "SHP",
            "SLL",
            "SOS",
            "SRD",
            "STD",
            "SVC",
            "SYP",
            "SZL",
            "THB",
            "TJS",
            "TMT",
            "TND",
            "TOP",
            "TRY",
            "TTD",
            "TWD",
            "TZS",
            "UAH",
            "UGX",
            "USD",
            "UYU",
            "UZS",
            "VEF",
            "VND",
            "VUV",
            "WST",
            "XAF",
            "XAG",
            "XAU",
            "XCD",
            "XDR",
            "XOF",
            "XPF",
            "YER",
            "ZAR",
            "ZMK",
            "ZMW",
            "ZWL"};

    Double[] array_currencies = {3.672904,69.900002,104.949997,479.679993,1.780403,216.309998,20.172001,1.303604,1.78,1.699504,1.593804,2.0,82.959999,1.588904,0.376904,1750.97998,1.0,1.303504,6.860399,3.412704,1.0,0.000112,65.625041,9.610404,2.000363,19600.0,1.997804,1.276204,1565.50392,0.97449,0.02185,596.200012,6.294404,2757.800049,561.503904,1.0,26.5,89.739998,20.615999,176.830002,6.06006,49.410393,113.851997,17.660393,14.990392,27.200001,0.813804,2.022504,0.713204,0.71415,2.425104,0.714174,4.428504,0.713404,46.869999,9000.000355,7.33604,205.889999,7.842704,23.56204,6.026604,64.309998,252.699997,13873.0,3.524404,0.714174,66.198997,1184.0,42000.000352,100.150002,0.714174,123.800003,0.707504,107.647003,99.800003,68.562504,3997.000351,399.019989,900.00035,1069.599976,0.300104,0.820383,326.410004,8279.000349,1505.000349,156.300003,130.580002,12.090382,3.048704,0.62055,1.323904,9.194039,16.388039,3175.000347,49.830002,1319.000346,2387.000346,8.078804,352.000346,33.450001,15.203741,715.299988,18.518999,3.895039,59.689999,12.088039,359.000344,31.000344,7.822704,105.684196,1.387104,0.384804,1.0,3.215404,3.182504,52.130001,115.503704,3.395204,5517.000341,3.641304,3.791704,95.467499,61.375999,845.809998,3.749904,7.779604,13.430372,18.051201,8.445038,1.314604,0.713404,7630.000339,563.000338,7.420371,19941.300781,8.75037,514.97998,12.102504,31.32037,8.862038,3.4,2.410369,2.235104,4.075604,6.745504,29.448999,2276.000336,26.150367,3684.300049,1.0,28.160367,8055.000335,59351.000334,22770.0,104.860001,2.526604,533.330017,0.058382,0.000748,2.703606,0.688902,533.330017,97.135857,249.899994,12.087904,9001.203593,9.430363,322.355011};

    String currency_from = "USD";
    String currency_to = "USD";

//    String query_from = "http://apilayer.net/api/live?access_key=9ffb64d184d4ccbc8bbb4879f68bafdb&currencies="+currency_from+"&source=USD&format=1";
//    String query_to = "http://apilayer.net/api/live?access_key=9ffb64d184d4ccbc8bbb4879f68bafdb&currencies="+currency_to+"&source=USD&format=1";



    Double money_from,money_to;

    Spinner spinner_from;
    Spinner spinner_to;

    EditText money_input;

    ImageButton convert_button;

    TextView final_money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final_money = (TextView)findViewById(R.id.txt_final);


        money_input = (EditText)findViewById(R.id.editText);

        convert_button = (ImageButton) findViewById(R.id.btn_convert);
        convert_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                money_from = Double.valueOf(money_input.getText().toString());
                int index1 = 0;
                int index2 = 0;

                for (int i=0;i<array_countries.length;i++) {
                    if (array_countries[i].equals(currency_from)) {
                        index1 = i;
                        break;
                    }
                }
                for (int i=0;i<array_countries.length;i++) {
                    if (array_countries[i].equals(currency_to)) {
                        index2 = i;
                        break;
                    }
                }
                Double a = array_currencies[index1];
                Double b = array_currencies[index2];
                Double c = money_from*b/a;
                c = Math.round(c * 10000.0) / 10000.0;



                final_money.setText(c.toString());
            }
        });

        spinner_from = (Spinner)findViewById(R.id.spinner_from);
        spinner_to = (Spinner)findViewById(R.id.spinner_to);

        final ArrayList<String> arrayCountries = new ArrayList<String>();

        for( int i = 0; i <= array_countries.length - 1; i++){
            arrayCountries.add((String)array_countries[i]);
        }
//        arrayCountries.add("USD");
//        arrayCountries.add("VND");
//        arrayCountries.add("EUR");

        ArrayAdapter arrayAdapter1 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,arrayCountries);
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,arrayCountries);

        arrayAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_from.setAdapter(arrayAdapter1);
        spinner_from.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);

                //Toast.makeText(MainActivity.this,arrayCountries.get(position),Toast.LENGTH_SHORT).show();
                currency_from = (String)arrayCountries.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_to.setAdapter(arrayAdapter2);
        spinner_to.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) parent.getChildAt(0)).setTextColor(Color.WHITE);
                //Toast.makeText(MainActivity.this,arrayCountries.get(position),Toast.LENGTH_SHORT).show();
                currency_to = (String)arrayCountries.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
