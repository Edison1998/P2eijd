package mx.edu.tesoem.isc.eijd.p2eijd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class frm2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
    }

    public void pantalla3(View v)
    {
        Intent frm3 = new Intent(this, frm3Activity.class);
        startActivity(frm3);
        finish();
    }
}
