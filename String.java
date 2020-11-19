package learningjava;

public class Strings {
	public static void main(String[] args)
	{                                              //functions in strings
		String name="   Nayana";
		String name2=new String ("yana");
		System.out.println(name.charAt(3));
		System.out.println(name.length());
		System.out.println(name.substring(2));
		System.out.println(name.substring(2,5));
		System.out.println(name.contains("ay"));
		System.out.println(name.equals(name2));
		System.out.println(name.isEmpty());
		System.out.println("nayana"+" barbie");
	    System.out.println(name.concat("barbie"));
	    System.out.println(name.replace("na","ya"));
	    String cars="hundai,maruti,Swift,wagonr,ferrari,lamboragini";
	    String allcars[]= cars.split(",");
	    for(String car:allcars) {
	    	System.out.println(car);
	    }
	    System.out.println(name.indexOf('n'));
	    System.out.println(name.toUpperCase());
	    System.out.println(name.toLowerCase());
	    System.out.println(name+" "+name.trim());
	    
	}

}
