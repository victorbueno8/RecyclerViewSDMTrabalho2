package br.edu.ifsp.scl.recyclerviewsdmtrabalho2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CartaoPostalAdapter extends RecyclerView.Adapter<CartaoPostalAdapter.ItemHolder> {

    private ArrayList<CartaoPostal> postalList;

    public CartaoPostalAdapter(ArrayList<CartaoPostal> postalList) {
        this.postalList = postalList;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater i = LayoutInflater.from(parent.getContext());
        View itemList = i.inflate(R.layout.lista_layout, parent, false);

        return new ItemHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        CartaoPostal postal = postalList.get(position);

        holder.lblNome.setText(postal.getNome());
        holder.lblLocal.setText(postal.getLocal());
        holder.lblPais.setText(postal.getPais());
        holder.imgFoto.setImageResource(postal.getImage());
    }

    @Override
    public int getItemCount() {
        return postalList.size();
    }


    class ItemHolder extends RecyclerView.ViewHolder {
        private TextView lblNome;
        private TextView lblLocal;
        private TextView lblPais;
        private ImageView imgFoto;

        public ItemHolder(View itemView) {
            super(itemView);

            lblNome = itemView.findViewById(R.id.nome);
            lblLocal = itemView.findViewById(R.id.local);
            lblPais = itemView.findViewById(R.id.pais);
            imgFoto = itemView.findViewById(R.id.imageView);
        }
    }
}
