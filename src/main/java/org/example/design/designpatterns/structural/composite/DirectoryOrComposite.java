package org.example.design.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DirectoryOrComposite implements FileSystemOrComponent {
    private String name;
    List<FileSystemOrComponent> componentList;

    public DirectoryOrComposite(String name) {
        this.name = name;
        this.componentList = new ArrayList<>();
    }

    public void addComponent(FileSystemOrComponent comp) {
        componentList.add(comp);
    }

    @Override
    public void ls() {
        System.out.println(name);
        for (FileSystemOrComponent component : componentList) {
            component.ls();
        }
    }
}
