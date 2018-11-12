package br.usjt.deswebmob.meuprimeiroapp_mvp.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import br.usjt.deswebmob.meuprimeiroapp_mvp.presenter.MainPresenter;
import br.usjt.deswebmob.meuprimeiroapp_mvp.R;

public class MainActivity extends Activity implements MainView{
    public static final String MENSAGEM = "br.usjt.deswebmob.meuprimeiroappccp.mensagem";
    private MainPresenter presenter = new MainPresenter(this);
    private String mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.onCreate();
    }

    @Override
    protected void onStart() {
        super.onStart();
        presenter.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        presenter.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    public void sendMessage(View view) {
        EditText editText = (EditText)findViewById(R.id.edit_text);
        mensagem = editText.getText().toString();
        presenter.inverte(mensagem);
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra(MENSAGEM, mensagem);
        startActivity(intent);
    }

    @Override
    public void atualizarMensagem(String s){
        mensagem = s;
    }
}
