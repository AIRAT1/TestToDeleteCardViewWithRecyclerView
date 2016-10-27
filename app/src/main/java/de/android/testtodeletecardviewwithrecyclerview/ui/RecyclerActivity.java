package de.android.testtodeletecardviewwithrecyclerview.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import de.android.testtodeletecardviewwithrecyclerview.R;
import de.android.testtodeletecardviewwithrecyclerview.adapter.RVAdapter;
import de.android.testtodeletecardviewwithrecyclerview.model.Person;

public class RecyclerActivity extends AppCompatActivity {
    private RecyclerView rv;
    private List<Person> persons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager. VERTICAL, false));

        initializeData();
        initializeAdapter();
    }

    private void initializeData() {
        persons = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            persons.add(new Person("Venera", "69", R.drawable.barbie_1));
            persons.add(new Person("Ayrat", "40", R.drawable.barbie_2));
            persons.add(new Person("Diana", "8", R.drawable.barbie_3));
            persons.add(new Person("Damir", "0", R.drawable.barbie_4));
        }
    }

    private void initializeAdapter() {
        RVAdapter adapter = new RVAdapter(persons);
        rv.setAdapter(adapter);
    }
}
