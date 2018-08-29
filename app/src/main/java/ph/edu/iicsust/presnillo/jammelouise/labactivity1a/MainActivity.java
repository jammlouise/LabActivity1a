package ph.edu.iicsust.presnillo.jammelouise.labactivity1a;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button displayButton = (Button) findViewById(R.id.displayButton);

        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText inputNumber = (EditText) findViewById(R.id.inputNumber);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num = Integer.parseInt(inputNumber.getText().toString());
                String result = "";
                int x = 0;

                while(x != 10){

                    if(num % 2 == 0) {

                        result = result + (num + ".");
                        num++;
                        x++;

                    }

                    else{

                        num++;

                    }



                }


                resultTextView.setText(result + "");

            }
        });




    }
}
