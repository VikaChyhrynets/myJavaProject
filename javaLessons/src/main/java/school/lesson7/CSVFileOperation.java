package school.lesson7;

import java.io.*;
import java.util.ArrayList;

public class CSVFileOperation {

    private String fileName;

    public CSVFileOperation(String fileName) {
        this.fileName = fileName;
    }

    public void writeToCSV(AppData appData) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i< appData.getHeader().length; i++) {
                sb.append(appData.getHeader()[i]);
                if(i==appData.getHeader().length -1) {
                    sb.append('\n');
                } else {
                    sb.append(';');
                }
            }

            for(int i = 0; i< appData.getData().length; i++) {
                for(int j = 0; j< appData.getData()[i].length; j++) {
                    sb.append(appData.getData()[i][j]);
                    if(j!=appData.getData()[i].length-1) {
                        sb.append(';');
                    }
                }
                sb.append("\n");
            }

            writer.write(sb.toString());


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList readFromCSV() {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            ArrayList list = new ArrayList<>();
            String line;
            while((line = reader.readLine()) != null) {
                list.add(line);
            }

            return list;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
