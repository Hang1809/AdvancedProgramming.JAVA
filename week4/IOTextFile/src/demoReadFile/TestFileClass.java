package demoReadFile;

import java.io.File;

public class TestFileClass {
    public static void main(String[] args) {
        File myObj = new File("filename.txt");

        System.out.println("Does it exist? " + myObj.exists());

        System.out.println("The file has " + myObj.length() + " bytes");

        System.out.println("Can it be read? " + myObj.canRead());

        System.out.println("Can it be written? " + myObj.canWrite());

        System.out.println("Is it a directory? " + myObj.isDirectory());

        System.out.println("Is it a file? " + myObj.isFile());

        System.out.println("Is it absolute? " + myObj.isAbsolute());

        System.out.println("Is it hidden? " + myObj.isHidden());

        System.out.println("Absolute path is " +
                myObj.getAbsolutePath());

        System.out.println("Last modified on " +

                new java.util.Date(myObj.lastModified()));

    }
}
