package com.PSC.AMRAP.models;

public class Request {
    double OneRepMax;
    int Percentage;
    int Sets;

    public Request(double oneRepMax, int percentage, int sets) {
        OneRepMax = oneRepMax;
        Percentage = percentage;
        Sets = sets;
    }
}
