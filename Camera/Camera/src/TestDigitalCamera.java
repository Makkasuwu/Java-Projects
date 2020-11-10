import java.util.Scanner;


public class TestDigitalCamera {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String brand;
		int megapixels;
		
		
		DigitalCamera s = new DigitalCamera();
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is the mega pixels of your camera");
		megapixels = keyboard.nextInt();

		
		System.out.println("What is the brand of your camera?");
		brand = keyboard.toString();
		
		

		s.setMegaPixels(megapixels);
		s.setBrand(brand);
		
	
		System.out.println(s.toString());
	}

}
