package com.example.listview2;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity {

	private Button adicionar;
	private Button destroy;
	private EditText nome;
	private ListView lista;
	private ArrayList<String> arraylista = new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listview);
		adicionar = (Button)findViewById(R.id.btadicionar);
		nome = (EditText)findViewById(R.id.nome);
		lista = (ListView)findViewById(R.id.listadenomes);
		destroy = (Button)findViewById(R.id.btDestroy);
		
		adicionar.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				addlista();
			}
		});
		Log.w("sytem.out", "system.out");
		
		destroy.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				destroy();
			}
		});
		//log.w = console.log
	}

	protected void destroy() {
		super.onDestroy();
	}
	
	public void addlista(){
		arraylista.add(nome.getText().toString());
		lista.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arraylista));
		nome.setText(null);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
