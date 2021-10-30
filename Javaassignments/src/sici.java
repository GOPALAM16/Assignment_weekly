import java.util .*;
public class sici {

	public static void main(String[] args) {
	
			double pr,rate,t,sim,com;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the amount:");
			pr=sc.nextDouble();
			System.out.println("enter the number of years:");
			t=sc.nextDouble();
			System.out.println("enter the Rate of interest");
			rate=sc.nextDouble();
			sim=(pr*t*rate)/100;
			com=pr*Math.pow(1.0+rate/100.0, t)-pr;
			System.out.println("simple interest="+sim);
			
			System.out.println("compound interst="+com);

	}

}
