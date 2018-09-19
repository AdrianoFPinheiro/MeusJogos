package adrianofpinheiro.meusjogos.listaJogos

import adrianofpinheiro.meusjogos.model.Jogo
import android.support.v4.content.ContextCompat
import android.support.v7.view.menu.MenuView
import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.meus_jogos_item.view.*

class JogoViewHolder (ItemView:View) : RecyclerView.ViewHolder(ItemView){

    fun bindView(jogo: Jogo,
                 listener: (Jogo) -> Unit) = with (itemView){
            tvTitulo.text = jogo.titulo
            tvAno.text = jogo.ano.toString()
            ivJogo.setImageDrawable(
                    ContextCompat.getDrawable(itemView.context, jogo.resourceId)
            )

            tvDescricao.text = jogo.descricao

            setOnClickListener{ listener(jogo)}
    }
}