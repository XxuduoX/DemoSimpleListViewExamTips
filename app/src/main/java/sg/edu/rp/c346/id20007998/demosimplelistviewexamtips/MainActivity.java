package sg.edu.rp.c346.id20007998.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lsView=findViewById(R.id.listViewExamTips);

        String [] tips=new String[5];
        tips[0]="Don't just read the code, code it as much as possible during each practical session";
        tips[1]="Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        tips[2]="Prepare your template source code for each topic";
        tips[3]="Create a few empty Android projects to speed up your coding during the exam";
        tips[4]="Ensure that your Android Studio is up and running before the exam";

        ArrayAdapter Adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,tips);
        lsView.setAdapter(Adapter);
    }
}