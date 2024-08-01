package TEST;

public class MethodOverriding {

    public static void main(String[] args) {
        // Create objects of the subclasses
        HillStations manali = new Manali();
        HillStations mussoorie = new Mussoorie();
        HillStations gulmarg = new Gulmarg();

        // Call methods using superclass reference
        System.out.println("Calling methods using superclass reference:");
        manali.location();
        manali.famousFor();
        System.out.println();

        mussoorie.location();
        mussoorie.famousFor();
        System.out.println();

        gulmarg.location();
        gulmarg.famousFor();
        System.out.println();

        // Call methods using subclass references
        System.out.println("Calling methods using subclass reference:");
        //creating object
        Manali m = new Manali();
        Mussoorie mu = new Mussoorie();
        Gulmarg g = new Gulmarg();

        m.location();
        m.famousFor();
        System.out.println();

        mu.location();
        mu.famousFor();
        System.out.println();

        g.location();
        g.famousFor();
    }
}


//Superclass
class HillStations {
 
	// Method to be overridden
	public void location() 
	{
		
		System.out.println("Location of the Hill Station");
	}

 // Method to be overridden
	public void famousFor() 
	{
		System.out.println("Famous for something");
	}
}



//Subclass Manali
class Manali extends HillStations {

	

	@Override
	 public void location() 
	{
	     System.out.println("Manali is located in Himachal Pradesh.");
	 }
	
	 @Override
	 public void famousFor() 
	 {
	     System.out.println("Manali is famous for its beautiful landscapes and skiing.");
	 }
}

//Subclass Mussoorie
class Mussoorie extends HillStations {

	 @Override
	 public void location() 
	 {
	     System.out.println("Mussoorie is located in Uttarakhand.");
	 }
	
	 @Override
	 public void famousFor() 
	 {
	     System.out.println("Mussoorie is famous for its scenic beauty and pleasant weather.");
	 }
}

//Subclass Gulmarg
class Gulmarg extends HillStations {

	 @Override
	 public void location() {
	     System.out.println("Gulmarg is located in Jammu and Kashmir.");
	 }
	
	 @Override
	 public void famousFor() {
	     System.out.println("Gulmarg is famous for its skiing and natural beauty.");
	 }
}