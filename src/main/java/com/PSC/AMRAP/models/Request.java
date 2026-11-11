package com.PSC.AMRAP.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class Request {
    double OneRepMax;
    int Percentage;
    int Sets;

}
