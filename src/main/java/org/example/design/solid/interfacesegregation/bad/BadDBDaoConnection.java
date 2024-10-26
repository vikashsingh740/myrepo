package org.example.design.solid.interfacesegregation.bad;

public class BadDBDaoConnection implements BadDaoInterface {
    @Override
    public void openConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {
      throw new UnsupportedOperationException("open file not supported");
    }

    @Override
    public void deleteRecord() {

    }
}
