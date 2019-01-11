package aula.solu.angoware.instangramuilogin;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;

import static aula.solu.angoware.instangramuilogin.R.drawable.ic_visibility_off_black_24dp;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btnMostrar);
        final EditText editText = (EditText) findViewById(R.id.edt);
        CheckBox mostra = (CheckBox) findViewById(R.id.showHide);

        if (mostra.isChecked()) {
            editText.setInputType(16);
        } else {
            editText.setInputType(18);
        }




    }
}
