package com.example.lucas.lab01c2016;

import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar seekbar1;
    Button boton1;
    TextView seekBarValue, ganancia, resultado, importe;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            importe = (TextView)findViewById(R.id.textView4);
            boton1 = (Button)findViewById(R.id.button);
            seekbar1 = (SeekBar)findViewById(R.id.seekBar);
            seekBarValue = (TextView)findViewById(R.id.textView6);
            ganancia = (TextView)findViewById(R.id.textView7);
            resultado = (TextView)findViewById(R.id.textView9);

            seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

                @Override
                public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) {
                    // TODO Auto-generated method stub
                    seekBarValue.setText(String.valueOf(progress));
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                    // TODO Auto-generated method stub
                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                    // TODO Auto-generated method stub
                }
            });

            boton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(importe < 5000 && seekBarValue <30){
                        resultado.setText("Plazo fijo realizado. Recibira" + Importe * @tasas/tasas0a5000menor30 + "al vencimiento!");
                    }
                }
            });




        }
}
