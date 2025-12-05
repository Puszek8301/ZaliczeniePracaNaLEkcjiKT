package com.example.zadaniezaliczeniowekt30;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText poleImie, poleNazwisko, poleIleZnakow;
    Spinner listaStanowisko;
    CheckBox checkLitery, checkZnaki, checkCyfry;
    Button przyciskGeneruj, przyciskZatwierdz;
    String ostatnieHaslo;

    String maleLitery = "abcdefghijklmnopqrstuvwxyz";
    String duzeLitery = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String znaki = "!@#$%^&*()_+-=.";
    String cyfry = "0123456789";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        poleImie = findViewById(R.id.imie);
        poleNazwisko = findViewById(R.id.nazwisko);
        poleIleZnakow = findViewById(R.id.ileZnakow);
        listaStanowisko = findViewById(R.id.stanowisko);
        checkLitery = findViewById(R.id.litery);
        checkCyfry = findViewById(R.id.cyfry);
        checkCyfry = findViewById(R.id.cyfry);
        checkZnaki = findViewById(R.id.znakiSpecjalne);
        przyciskGeneruj = findViewById(R.id.przyciskGeneruj);
        przyciskZatwierdz = findViewById(R.id.przyciskZatwierdz);

        String[] stanowiska = {"Kierownik"," Starszy programista"," Młodszy programista", "Tester"};

        ArrayAdapter<CharSequence> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, stanowiska);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        listaStanowisko.setAdapter(adapter);




        przyciskZatwierdz.setOnClickListener(view -> {
            String dane = "Imię: " + poleImie.getText().toString() +
                     "\nNazwisko: " + poleNazwisko.getText().toString() +
                    "\nStanwosiko: " + listaStanowisko.getSelectedItem().toString() ;


            new AlertDialog.Builder(this)
                    .setTitle("Dane Pracownika")
                    .setMessage(dane)
                    .setPositiveButton("OK", null)
                    .show();
        });



    }
}