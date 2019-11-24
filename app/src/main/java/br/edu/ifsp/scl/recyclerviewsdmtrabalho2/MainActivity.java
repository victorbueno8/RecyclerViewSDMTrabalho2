package br.edu.ifsp.scl.recyclerviewsdmtrabalho2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<CartaoPostal> postalList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        geraCartaoPostal();

        CartaoPostalAdapter adapter = new CartaoPostalAdapter(postalList);
        recyclerView.setAdapter(adapter);

//        LISTENER
        ClickListItemListener clickListItemListener = new ClickListItemListener();
        RecyclerItemClickListener listListener = new RecyclerItemClickListener( getApplicationContext(), recyclerView, clickListItemListener );
        recyclerView.addOnItemTouchListener(listListener);
    }

    private void geraCartaoPostal() {
        postalList.add( new CartaoPostal(1, "Eiffel Tower", "Paris", "France", R.drawable.eiffeltower) );
        postalList.add( new CartaoPostal(2, "Grand Canyon", "Arizona", "United States", R.drawable.grandcanyon) );
        postalList.add( new CartaoPostal(3, "London Eye", "London", "England", R.drawable.londoneye) );
        postalList.add( new CartaoPostal(4, "Mount Fuji", "Honshu Island", "Japan", R.drawable.mountfuji) );
        postalList.add( new CartaoPostal(5, "Sydney Opera House", "Sydney", "Australia", R.drawable.operahouse) );
        postalList.add( new CartaoPostal(6, "Pyramids of Giza", "Cairo", "Egypt", R.drawable.pyramidsgiza) );
        postalList.add( new CartaoPostal(7, "Stonehenge", "Salisbury", "United Kingdom", R.drawable.stonehenge) );
        postalList.add( new CartaoPostal(8, "Taj Mahal", "Agra", "India", R.drawable.tajmahal) );
        postalList.add( new CartaoPostal(9, "Christ the Redeemer", "Rio de Janeiro", "Brazil", R.drawable.christ_redeemer) );
        postalList.add( new CartaoPostal(10, "The Colosseum", "Rome", "Italy", R.drawable.colosseum) );
    }

    private class ClickListItemListener implements RecyclerItemClickListener.OnItemClickListener {

        @Override
        public void onItemClick(View view, int position) {
            String nome = postalList.get(position).getNome();
            Toast.makeText(MainActivity.this, "You desire to visit " + nome, Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onLongItemClick(View view, int position) {
            String nome = postalList.get(position).getNome();
            Toast.makeText(MainActivity.this, "You REALLY desire to visit " + nome, Toast.LENGTH_LONG).show();
        }
    }
}
