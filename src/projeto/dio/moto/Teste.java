package projeto.dio.moto;

public class Teste {

    public static void main (String[] args) {
        Atividades ligarMoto = new LigarMoto();
        Atividades acelerarLentamente = new AcelerandoLentamente();
        Atividades acelerarRapidamente = new AcelerandoRapidamente();
        Atividades desligarMoto = new DesligarMoto();

        Moto lindy = new Moto();

        lindy.setAtividades(ligarMoto);
        lindy.ligar();
        lindy.setAtividades(acelerarLentamente);
        lindy.acelerar();
        lindy.setAtividades(acelerarRapidamente);
        lindy.acelerar();
        lindy.setAtividades(desligarMoto);
        lindy.desligar();
    }
}
