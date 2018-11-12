package br.usjt.deswebmob.meuprimeiroapp_mvp.presenter;

import br.usjt.deswebmob.meuprimeiroapp_mvp.model.Transformer;
import br.usjt.deswebmob.meuprimeiroapp_mvp.view.MainView;

public class MainPresenter implements Presenter {
    private Transformer model;
    private MainView view;

    public MainPresenter(MainView v){
        view = v;
        model = new Transformer();//para funcionar no teste
    }


    @Override
    public void onCreate() {
        model = new Transformer();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onDestroy() {

    }

    public void inverte(String s){
        String msg = model.inverte(s);
        view.atualizarMensagem(msg);
    }
}
