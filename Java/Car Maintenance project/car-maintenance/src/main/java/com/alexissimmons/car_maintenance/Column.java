package com.alexissimmons.car_maintenance;

public @interface Column {

    String name();

    boolean nullable();

    int length();

}
