package adrianofpinheiro.meusjogos.listaJogos

import adrianofpinheiro.meusjogos.R
import adrianofpinheiro.meusjogos.detalhejogo.DetalheActivity
import adrianofpinheiro.meusjogos.model.Jogo
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lista_jogos.*

class ListaJogosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_jogos)


        val jogos = getJogos()
        rvJogos.adapter = JogosAdapter(this, jogos, {})
        /*rvJogos.adapter = JogosAdapter(this, jogos, { jogo ->
            val detalheIntent = Intent(this, DetalheActivity::class.java)
            detalheIntent.putExtra("TITULO", jogo.titulo)
            startActivity(detalheIntent)

            rvJogos.layoutManager = LinearLayoutManager(this)

        })*/
    }

    private fun getJogos(): List<Jogo> {
        return listOf(Jogo(R.drawable.spiderman, "Spiderman", 2018, "Não Informada"),
                Jogo(R.drawable.colossus, "Colossus", 2016, "Não Informada"),
                Jogo(R.drawable.crash, "Crash", 2014, "Não Informada"),
                Jogo(R.drawable.godofwar, "God Of War", 2013, "Não Informada"),
                Jogo(R.drawable.marvel, "Marvel vs Capcom", 2018, "Não Informada"),
                Jogo(R.drawable.mortalkombat, "Mortal Kombat", 2018, "Não Informada"),
                Jogo(R.drawable.nioh, "Nioh", 2015, "Não Informada"),
                Jogo(R.drawable.sonic, "Sonic", 2000, "Não Informada")
        )
    }
}
