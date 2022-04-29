package Entitys;

import java.util.Arrays;

public class Array {
    double[] array = new double[50];
    double[] array2 = new double[20];

    public Array() {
    }


    public Array(double[] array, double[] array2) {
        this.array = array;
        this.array2 = array2;
    }

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }

    public double[] getArray2() {
        return array2;
    }

    public void setArray2(double[] array2) {
        this.array2 = array2;
    }

    @Override
    public String toString() {
        return "Array{" + "array=" + Arrays.toString(array) + ", array2=" + Arrays.toString(array2) + '}';
    }
}

