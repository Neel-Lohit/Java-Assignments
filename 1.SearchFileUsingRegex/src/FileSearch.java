import java.io.File;

public class FileSearch {

    String findFile(String path,String pattern) throws NullPointerException {

        File directory = new File(path);
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    findFile(file.getAbsolutePath(), pattern);
                }
                else if (file.getName().matches(pattern)) {
                    return file.getAbsolutePath();
                }
            }


        }
        else {
            return "Invalid Path";
        }
        return "file not found";
    }
}
