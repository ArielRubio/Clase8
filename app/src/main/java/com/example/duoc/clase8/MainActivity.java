package com.example.duoc.clase8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn1);
        btn.setOnCreateContextMenuListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        CreateMenu(menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return MenuChoice(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view,
                                    ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, view, menuInfo);
        CreateMenu(menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return MenuChoice(item);
    }

    private void CreateMenu(Menu menu) {

        menu.setQwertyMode(true);
        MenuItem mnu1 = menu.add(0, 0, 0, "Ingreso de Datos");
        {
            mnu1.setAlphabeticShortcut('a');

        }
        MenuItem mnu2 = menu.add(0, 1, 1, "Mostrar mis fotografías");
        {
            mnu2.setAlphabeticShortcut('b');

        }
        MenuItem mnu3 = menu.add(0, 2, 2, "Texto a voz");
        {
            mnu3.setAlphabeticShortcut('c');

        }
        MenuItem mnu4 = menu.add(0, 3, 3, "Reproducir una canción");
        {
            mnu4.setAlphabeticShortcut('d');

        }

    }
    private boolean MenuChoice(MenuItem item) {
        switch (item.getItemId()) {
            case 0:
                Toast.makeText(this, "Has elegido Ingresar de datos", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, ingresarDatos.class);
                startActivity(intent);
                return true;
            case 1:
                Toast.makeText(this, "Has elegido Mostrar mis fotografías", Toast.LENGTH_LONG).show();
                Intent intent2 = new Intent(this, ingresarDatos.class);
                startActivity(intent2);
                return true;
            case 2:
                Toast.makeText(this, "Has elegido Texto a voz", Toast.LENGTH_LONG).show();
                Intent intent3 = new Intent(this, ingresarDatos.class);
                startActivity(intent3);
                return true;
            case 3:
                Toast.makeText(this, "Has elegido una canción", Toast.LENGTH_LONG).show();
                Intent intent4 = new Intent(this, ingresarDatos.class);
                startActivity(intent4);
                return true;
        }
        return false;
    }

}
