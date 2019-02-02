package com.example.aluno.ecommerce;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by axel on 02/02/19.
 */

public class TimesAdapter extends ArrayAdapter<Times> {

    private final Context context;
    private final ArrayList<Times> elementos;

    public TimesAdapter(Context context,ArrayList<Times>elementos){
        super(context,R.layout.item,elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item,parent,false);

        TextView nome = (TextView) rowView.findViewById(R.id.nome);
        TextView subnome = (TextView) rowView.findViewById(R.id.subnome);
        TextView preco = (TextView) rowView.findViewById(R.id.preco);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.imagem);

        nome.setText(elementos.get(position).getNome());
        subnome.setText(elementos.get(position).getSubnome());
        //preco.setText((int) elementos.get(position).getPreco());
        imagem.setImageResource(elementos.get(position).getImagem());
        return rowView;
    }
}


