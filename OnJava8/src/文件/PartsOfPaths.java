package 文件;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PartsOfPaths {
    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        Path path = Paths.get("PartsofPaths.java").toAbsolutePath();
        for(int i=0;i<path.getNameCount();i++){
            System.out.println(path.getName(i));
        }
        System.out.println("ends with '.java'"+
                path.endsWith(".java"));
        for(Path p:path){
            System.out.print(p+":");
            System.out.print(p.endsWith(path)+":");
            System.out.println(p.startsWith(path));
            System.out.println("Starts with " + path.getRoot() + " " + p.startsWith(path.getRoot()));
        }

    }
}
