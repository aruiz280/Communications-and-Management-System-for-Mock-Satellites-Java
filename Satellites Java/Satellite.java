import java.util.Random;

public class Satellite {
    private String satelliteName;
    private int satelliteOrbitHeight;
    public static Random randy = new Random(4);

    Satellite() {
        setSatelliteName("unknown");
    }
    Satellite(String satelliteName) {
        setSatelliteName(satelliteName);
        setSatelliteOrbitHeight(randy.nextInt(101)+100 );

    }

    public String getSatelliteName() {
        return satelliteName;
    }

    
    public void setSatelliteName(String satelliteName) {
        this.satelliteName = satelliteName;
    }

    public int getSatelliteOrbitHeight() {
        return satelliteOrbitHeight;
    }

    
    public void setSatelliteOrbitHeight(int satelliteOrbitHeight) {
        this.satelliteOrbitHeight = satelliteOrbitHeight;
    }

    public boolean equalSatellite (String satelliteName2 , int satelliteOrbitHeight2) {
        
        if(this.satelliteName.equals(satelliteName2) && satelliteOrbitHeight == satelliteOrbitHeight2)
            return true;
        else
            return false;
    }
    
    public String toString() {
        return "The satellite named "+satelliteName+" has an orbital height of "+satelliteOrbitHeight+".";
    }

}
