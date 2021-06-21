package com.example.anthony.chap7_opendata.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.anthony.chap7_opendata.R;
import com.example.anthony.chap7_opendata.model.beans.Fields;

import java.util.ArrayList;


/**
 * Created by booth09-mgr2 on 21/03/2017.
 */

public class FieldAdapter extends RecyclerView.Adapter<FieldAdapter.ViewHolder> {


    private ArrayList<Fields> fields;

    //Pointeur vers une classe qui implémente OnFieldsListener
    private OnFieldsListener onFieldsListener;


    public FieldAdapter(ArrayList<Fields> fields, OnFieldsListener onFieldsListener) {
        this.fields = fields;
        this.onFieldsListener = onFieldsListener;
    }


    /**
     * Méthode qui permet de créer une ligne mais que nous n'appellerons jamais nous-mêmes
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ligne_evenement, parent, false);

        return new FieldAdapter.ViewHolder(view);
    }

    /**
     * Méthode qui remplit une ligne créée mais que nous n'appellerons jamais nous-mêmes
     */
    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Fields field = fields.get(position);

        holder.tv_titre.setText(field.getNomDeLaManifestation());
        holder.tv_description.setText(field.getDescriptifCourt());


        holder.root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onFieldsListener != null) {
                    onFieldsListener.onClick(field);
                }
            }
        });
    }

    /**
     * Méthode qui indique le nombre de lignes à créer mais que nous n'appellerons jamais nous-mêmes
     */
    @Override
    public int getItemCount() {
        return fields.size();
    }

    /**
     * Classe interne représentant les pointeurs vers les composants graphiques d'une ligne de la liste
     * Il y aura une instance de cette classe par ligne
     */
    protected class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tv_titre, tv_description;
        public View root;

        public ViewHolder(View itemView) {
            super(itemView);

            tv_titre = (TextView) itemView.findViewById(R.id.tv_titre);
            tv_description = (TextView) itemView.findViewById(R.id.tv_description);
            root = itemView.findViewById(R.id.root);
        }
    }

    //Notre moyen de communication
    public interface OnFieldsListener {

        void onClick(Fields fields);

    }


}
