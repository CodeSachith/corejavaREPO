package corejava;

public class WrapperClass {

	public static void main(String[] args) {
		
		
		String x = "100";
		System.out.println(x+20);
		
		
		//data conversion : string to int
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		//Integer Double Character Boolean
		
		//String to double conversion
		
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(y+20);
		System.out.println(d+20);
		
		//String to boolean
		
		String t = "true";
		boolean b = Boolean.parseBoolean(t);
		System.out.println(b);
		
		//int to String conversion
		
		int j = 200;
		System.out.println(j+20);
		
		String j1 = String.valueOf(j);
		System.out.println(j1+20);
		
		
		//NumberFormatException
		
		String u = "100A";
		Integer.parseInt(u);	
	}

}
