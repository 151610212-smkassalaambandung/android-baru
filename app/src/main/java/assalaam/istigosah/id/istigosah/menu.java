package assalaam.istigosah.id.istigosah;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button menu =(Button) findViewById(R.id.activity_menu);
        menu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(),home.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
