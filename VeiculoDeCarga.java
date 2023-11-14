public class VeiculoDeCarga extends Veiculo {
    private double altura;
    private double largura;
    private double profundidade;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    @Override
    public String toString() {
        return String.valueOf(altura) + " M de altura, " + String.valueOf(largura) + ", M de largura, " + String.valueOf(profundidade) + " M de profundidade.";
    }
}
