package org.example.design.solid.interfacesegregation.bad;

public class BadFileDaoConnection implements BadDaoInterface {
    @Override
    public void openConnection() {
      // we can't open connection in file system
      throw new UnsupportedOperationException();
    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {

    }

    @Override
    public void deleteRecord() {

    }
}
