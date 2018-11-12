package br.usjt.deswebmob.meuprimeiroapp_mvp.presenter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import br.usjt.deswebmob.meuprimeiroapp_mvp.view.MainView;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TestMainPresenter {
    MainPresenter presenter;

    @Mock
    private MainView view;

    @Before
    public void setUp(){
        presenter = new MainPresenter(view);
    }

    @Test
    public void testeInverte(){
        presenter.inverte("Uma frase");
        verify(view).atualizarMensagem("esarf amU");

        presenter.inverte("Radar");
        verify(view).atualizarMensagem("radaR");

        presenter.inverte("");
        verify(view).atualizarMensagem("");

        presenter.inverte(" ");
        verify(view).atualizarMensagem(" ");

        presenter.inverte(null);
        verify(view).atualizarMensagem(null);
    }
}
