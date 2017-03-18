package id.duza.customadapter.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import id.duza.customadapter.R;
import id.duza.customadapter.adapter.SimpleAdapter;
import id.duza.customadapter.model.Chat;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Chat> chatList = new ArrayList<>();
    private SimpleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupView();
        insertData();
    }

    private void insertData() {
        for (int i = 0; i < 10; i++)    {
            chatList.add(new Chat("Mark Zuckerberg", "Halloo AMCC Developer", "07:00"));
        }
        adapter.notifyDataSetChanged();
    }

    private void setupView() {
        listView = (ListView) findViewById(R.id.list_view_main);
        adapter = new SimpleAdapter(this, chatList);
        listView.setAdapter(adapter);
    }
}
