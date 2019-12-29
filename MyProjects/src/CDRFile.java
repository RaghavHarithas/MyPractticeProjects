import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class CDRFile {

//holds number of records
    int numberOfRecords;
    BufferedWriter bufferedWriter;
    FileWriter fileWriter;

    static String filename;
    String fileStart = "cdr";
    String seperator= "-";
    String filenameSeperator = ".";
    String fileNameExtension = ".cdr";
    String  filePath = "/var/opt";
    public CDRFile( Date date, long milliseconds){
        try {

            fileWriter = new FileWriter(createFile(date, milliseconds));
            bufferedWriter = new BufferedWriter(fileWriter);
            // need to write file minrtore
            Timer timer = new Timer();

            //new TimerTask(new CDRFileMonitor(milliseconds, this)).scheduledExecutionTime();
        }catch (Exception e){
            //log exception
        }

    }

    private File  createFile(Date date, long milliseconds){
        StringBuilder stringBuilder = new StringBuilder("");
        stringBuilder = stringBuilder.append(fileStart).append(seperator).append(date).append(seperator).append(milliseconds).append(filenameSeperator).append(fileNameExtension);
        filename = stringBuilder.toString();
        File file = new File(filePath+filename);
        return file;

    }

    public  void write(String cdr) throws IOException {
        //log

        bufferedWriter.write(cdr);
        bufferedWriter.flush();
        bufferedWriter.newLine();
        numberOfRecords++;



    }

    public void moveToArchive(){
        //move file from one source to another

    }

    public void  close() throws IOException{
        fileWriter.close();
        bufferedWriter.close();

    }
}
