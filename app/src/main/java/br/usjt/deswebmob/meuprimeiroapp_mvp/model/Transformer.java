package br.usjt.deswebmob.meuprimeiroapp_mvp.model;

public class Transformer {
    public String inverte(String s){
        if(s == null)
            return null;
        StringBuffer sb = new StringBuffer();
        for(int i = s.length()-1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
