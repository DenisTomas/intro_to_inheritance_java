public class VeiculoDePassageiro extends Veiculo{
    private int numeroDePassageiros;

    public int getNumeroDePassageiros() {
        return numeroDePassageiros;
    }

    public void setNumeroDePassageiros(int numeroDePassageiros) {
        this.numeroDePassageiros = numeroDePassageiros;
    }

    @Override
    public String toString() {
        return String.valueOf(numeroDePassageiros);
    }
}
