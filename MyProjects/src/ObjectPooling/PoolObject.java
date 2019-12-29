package ObjectPooling;

public class PoolObject {

    public int getProcessNo() {
        return processNo;
    }

    public void setProcessNo(int processNo) {
        this.processNo = processNo;
    }

    public String getLocationNo() {
        return locationNo;
    }

    public void setLocationNo(String locationNo) {
        this.locationNo = locationNo;
    }

    private int processNo;
    private String locationNo;

    PoolObject(int processNo, String location){
        this.locationNo = location;
        this.processNo = processNo;
        System.out.println("Object is created ny processs no "+processNo);
    }


}
