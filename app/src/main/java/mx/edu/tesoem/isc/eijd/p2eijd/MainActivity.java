package mx.edu.tesoem.isc.eijd.p2eijd;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button boton_sig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
boton_sig=(Button)findViewById(R.id.btnsig);
boton_sig.setOnClickListener(this);
    }

    @Override
public void onClick(View v)
    {
Intent frm2 = new Intent( this, frm2Activity.class);
startActivity(frm2);
finish();
    }
}
