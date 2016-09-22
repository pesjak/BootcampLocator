package com.primoz.bootcamplocator.services;

import com.primoz.bootcamplocator.models.Coders;

import java.util.ArrayList;

/**
 * Created by primo on 21. 09. 2016.
 */
public class DataService {
    private static DataService instance = new DataService();

    public static DataService getInstance() {
        return instance;
    }

    private DataService() {

    }

    public ArrayList<Coders> getLocationsWithin10km(int zipcode) {
        ArrayList<Coders> list = new ArrayList<>();


        list.add(new Coders(46.062668f, 14.4968741f, "Pivnica", "Pivovarniška ulica", "slo"));
        list.add(new Coders(46.0507689f, 14.4734061f, "ZOO", "Večna pot 70", "slo"));
        list.add(new Coders(46.0576439f, 14.5127694f, "Zmajski most", "Ljubljana", "slo"));
        list.add(new Coders(46.0615715f, 14.5468985f, "BTC", "Šmartinska 152", "slo"));

        return list;
    }
}
