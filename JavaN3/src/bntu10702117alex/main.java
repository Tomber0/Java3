package bntu10702117alex;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		netbok newcomp1 = new netbok(1,"name","Me");
		
		netbok newcomp2 = new netbok(2,"name2","not me");
		
		netbok newcomp3 = new netbok(1,"name2","not me");
		
		
		
		System.out.println(newcomp1.hashCode());
		
		System.out.println(newcomp1.toString());
		
		System.out.println(newcomp1.equals(newcomp2));
		System.out.println(newcomp1.equals(newcomp3));
	}

}
