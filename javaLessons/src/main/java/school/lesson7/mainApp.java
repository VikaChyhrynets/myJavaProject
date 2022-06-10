package school.lesson7;

public class mainApp {

    public static void main( String[] agg) {

        String fileName = "myFile.csv";
        String[] header = {"value1","value2","value3"};

        int[][] data = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        AppData newData = new AppData();

        newData.setHeader(header);
        newData.setData(data);

        CSVFileOperation fileOperation = new CSVFileOperation(fileName);

        fileOperation.writeToCSV(newData);

        for(int i = 0; i < fileOperation.readFromCSV().size(); i ++) {
            System.out.println(fileOperation.readFromCSV().get(i));
        }

    }
}
