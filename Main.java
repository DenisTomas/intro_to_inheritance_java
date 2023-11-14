public class Main {
    public static void main(String[] args) {
        VeiculoDePassageiro veiculoDePassageiro = new VeiculoDePassageiro();
        veiculoDePassageiro.setNumeroDePassageiros(5);

        System.out.println("Estamos com " + veiculoDePassageiro.toString() + " passageiros no veículo.");

        VeiculoDeCarga veiculoDeCarga = new VeiculoDeCarga();
        veiculoDeCarga.setAltura(2);
        veiculoDeCarga.setLargura(2.5);
        veiculoDeCarga.setProfundidade(10);

        System.out.println("O veículo de carga possui as seguintes dimensões: " + veiculoDeCarga.toString());
    }

}