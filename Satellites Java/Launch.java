import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the country name:");
        String countryname = input.nextLine();
        System.out.println("Enter the satallites constellation name :");
        String constellationName= input.nextLine();
        SatConstellation Myconstellation = new SatConstellation(constellationName,countryname);
        System.out.println(Myconstellation);
        int satNotEqual = 0;
        int sizeofArraylist= Myconstellation.satelliteList.size();
        
        for (int i = 1; i < Myconstellation.satelliteList.size(); i++) {

            if(Myconstellation.satelliteList.get(0).equalSatellite(Myconstellation.satelliteList.get(i).getSatelliteName()
                , Myconstellation.satelliteList.get(i).getSatelliteOrbitHeight()))
            {
                
                System.out.println("The satellite is named:"+Myconstellation.satelliteList.get(i).getSatelliteName()+" has a maximum orbital height of: "
                +Myconstellation.satelliteList.get(i).getSatelliteOrbitHeight());
                System.out.print("and is equal to the first satellite within the ArrayList.");
            }

            else {
                satNotEqual++;
            }

            if((Myconstellation.satelliteList.size()-1)==satNotEqual) {
                System.out.println("No Satellites were found that match the first satellite.");
            }

        }

       
        //setting the names and height max 
        Myconstellation.satelliteList.get(sizeofArraylist-1).setSatelliteOrbitHeight
                (Myconstellation.satelliteList.get(0).getSatelliteOrbitHeight());
        Myconstellation.satelliteList.get(sizeofArraylist-1).setSatelliteName
                (Myconstellation.satelliteList.get(0).getSatelliteName());

        if(Myconstellation.satelliteList.get(0).equalSatellite(Myconstellation.satelliteList.get(sizeofArraylist-1).getSatelliteName(),
                Myconstellation.satelliteList.get(sizeofArraylist-1).getSatelliteOrbitHeight()))
        {
            System.out.println("The Satellite is named:  "+Myconstellation.satelliteList.get(0).getSatelliteName()+" has a maximum orbital height of "
                    +Myconstellation.satelliteList.get(0).getSatelliteOrbitHeight()+" and is equal to  the first satellite in the arrayList.");
        }
        //close scanner 
        input.close();
    }
}
