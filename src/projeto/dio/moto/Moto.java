package projeto.dio.moto;

public class Moto {

    private Atividades atividades;

    public void setAtividades(Atividades atividades) {
        this.atividades = atividades;}

    public void ligar(){ atividades.ligar();}
    public void acelerar(){ atividades.acelerar();}
    public void desligar() { atividades.desligar();}

}
