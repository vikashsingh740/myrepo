package org.example.design.designpatterns.structural.composite;

public class CompositeMain {
    public static void main(String[] args) {
        FileSystemOrComponent file1 = new FileOrLeaf("vikash");
        FileSystemOrComponent file2 = new FileOrLeaf("kumar");
        FileSystemOrComponent file3 = new FileOrLeaf("singh");

        DirectoryOrComposite directory1 = new DirectoryOrComposite("Dir1");
        DirectoryOrComposite directory2 = new DirectoryOrComposite("Dir2");
        DirectoryOrComposite directory3 = new DirectoryOrComposite("Dir3");

        directory1.addComponent(file1);
        directory1.addComponent(directory2);
        directory2.addComponent(file2);
        directory2.addComponent(directory3);
        directory3.addComponent(file3);

        directory1.ls();
    }
}
