public class Corrida {

    private int tempoEspera;
    double valorFinal;
    private double fatDemanda, distancia, tarifaBase;

    public void calcularValorCorrida(){
        valorFinal = (distancia*2) + (tempoEspera*0.5) + tarifaBase * fatDemanda;
    }
    public void exibirDetalhes(){
        System.out.printf("Detalhes da Viagem:\nDistância %.2f Km\nTempo de Espera: %d Minutos\nTarifa Base: %.2f\nFator de demanda: %.2f\nValor Total: R$%.2f\n", distancia, tempoEspera, tarifaBase, fatDemanda, valorFinal);
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public double getFatDemanda() {
        return fatDemanda;
    }

    public void setFatDemanda(double fatDemanda) {
        this.fatDemanda = fatDemanda;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
}
