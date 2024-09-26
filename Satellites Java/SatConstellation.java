//allowed ide to import 
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SatConstellation {
    
    private String satConstellationName;
    private Country country=new Country();
    ArrayList<Satellite> satelliteList= new ArrayList<Satellite>();

     SatConstellation() {
        setSatConstellationName("unknown");
        Country country = new Country();
    }


    SatConstellation(String satConstellationName,String countryname) {
        setSatConstellationName(satConstellationName);
        this.country = new Country(countryname);
        createSatellites();
    }
    
    public String getSatConstellationName() {
        return satConstellationName;
    }

    public void setSatConstellationName(String satConstellationName) {
        this.satConstellationName = satConstellationName;
    }

    public void createSatellites () {
        //creating scanner for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter file name to read Satellite list:");
        //opening satellites.txt file (use terminal!!)
        String fileName = input.nextLine();
        
        try {
            
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader((fr));
           String line ;
            while((line = br.readLine()) != null) {
                Satellite satellite = new Satellite(line);
                satelliteList.add(satellite);
            }
            
            br.close();
        }
        catch (Exception e ) {
            System.out.println("File is not here and " +e);
        }
        //closing scanner 
        input.close();

    }
    
    //accessors and mutators
    //try and catch clause!
    public int getNumSatellites() {
        return satelliteList.size();
    }
    public Satellite getSatellite(int index) {
        try {
            return satelliteList.get(index);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println("Satellite doesn't exist");
            return null;
        }
    }
    
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("The name of the "+country.getCountryName()+" satellite is "+ satConstellationName+".\n");
        for(Satellite satellite: satelliteList) {
            result.append(satellite+"\n");
        }
        
        return result.toString();
    }

}
