package factory.impl;

import chair.Chair;
import chair.PlasticChair;
import factory.FurnitureAbstractFactory;
import table.PlasticTable;
import table.Table;

public class PlasticFactory extends FurnitureAbstractFactory {

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }

}