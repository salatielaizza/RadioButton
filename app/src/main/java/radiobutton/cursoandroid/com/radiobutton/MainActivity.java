package radiobutton.cursoandroid.com.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButtonEscolhido;
    private Button botaoEscolher;
    private TextView textoExibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroupID);
        botaoEscolher = (Button) findViewById(R.id.botaoEscolherID);
        textoExibido = (TextView) findViewById(R.id.texoExibidoID);

        botaoEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //criação dinâmica do radioButton escolhido. o método getCheckedRadioButtonId() pega o RadioButton escolhido e armazena no int radioButton Escolhido
                int idRadioButtonEscolhido = radioGroup.getCheckedRadioButtonId();
                radioButtonEscolhido = (RadioButton) findViewById( idRadioButtonEscolhido );

                Toast.makeText(MainActivity.this, radioButtonEscolhido.getText() , Toast.LENGTH_LONG).show();


                /**
                 *if (idRadioButtonEscolhido > 0) {
                 radioButtonEscolhido = (RadioButton) findViewById( idRadioButtonEscolhido );
                 textoExibido.setText(radioButtonEscolhido.getText());
                 }
                 */

                /**recupera o numero do id escolhido
                 * textoExibido.setText("série predileta/ID: " + R.id.radioGroupID);
                 */

            }
        });





    }
}
