package matrices;

public class Matrix {
    double[][] values;

    public Matrix(double[][] in) {
        values = new double[in.length][in[0].length];

        for(int i = 0; i < in.length; i ++) {
            for (int j = 0; j < in[i].length; j ++) {
                values[i][j] = in[i][j];
            }
        }

    }
    public Matrix() {
        values = new double[][] {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
    }



}

