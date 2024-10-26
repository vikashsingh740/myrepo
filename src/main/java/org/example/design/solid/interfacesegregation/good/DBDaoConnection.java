package org.example.design.solid.interfacesegregation.good;

public class DBDaoConnection implements DBInterface, DaoInterface{
    @Override
    public void openConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }
}
