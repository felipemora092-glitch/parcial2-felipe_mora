package modelos;

import datos.Dataset;

/**
 * Modelo CNN. Hiperparámetro: número de filtros.
 */
public class ModeloCNN extends Modelo {

    private int numFiltros;

    public ModeloCNN(String nombre, int maxEpocas, int numFiltros) {
        super(nombre, maxEpocas);
        this.numFiltros = numFiltros;
    }

    @Override
    public double entrenar(Dataset dataset) {
        for (int i = 0; i < 5; i++) {
            registrarEpoca(100 - (i * 10));
        }
        return mejorLoss();
    }

    public int getNumFiltros() {
        return numFiltros;
    }
}