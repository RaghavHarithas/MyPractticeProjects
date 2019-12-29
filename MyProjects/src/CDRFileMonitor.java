

import java.util.Calendar;
import java.util.TimerTask;

public class CDRFileMonitor extends TimerTask {

    CDRFile cdrFile;
    long timeOpnen;
    int masTime= 60;

    CDRFileMonitor(long timeinMilliseconds , CDRFile cdrFile){
        this.cdrFile= cdrFile;
        this.timeOpnen=timeinMilliseconds;

    }

    public void run(){

        try {

            long timeElapsed = (Calendar.getInstance().getTimeInMillis() - timeOpnen) / 10000;
            if (timeElapsed > 60) {
                cdrFile.close();
                cdrFile = null;
            }
        }catch(Exception e){

        }

    }
}
