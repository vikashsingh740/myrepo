package org.example.design.designpatterns.structural.composite;

public class FileOrLeaf implements FileSystemOrComponent {

    private String name;

    public FileOrLeaf(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println(name);
    }
}
