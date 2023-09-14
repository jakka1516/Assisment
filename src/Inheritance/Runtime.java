package Inheritance;
class player {
	String name,country;
	int age;
	player(String n,String c,int age) {
		this.name=n;
		this.country=c;
		this.age=age;
	}
	void printdata1() {
		System.out.println("player name: "+ name+","+"country: "+ country+","+"age:"+age);
	}
}
class Cricket extends player {
 int runs;
  Cricket(String n,String c,int age,int runs) {
	  super(n,c,age);
	  this.runs=runs;
  }
  void printdata2() {
	  printdata1();
	  System.out.println("runs scored: "+runs);
  }
	
}
class Football extends player {
	int goals;
	int penalities;
	Football(String n,String c,int age,int runs,int g,int p) {
		super(n,c,age);
		this.goals = g;
		this.penalities=p;
	}
	void printdata3() {
		System.out.println();
		System.out.println("football player detailes ");
		printdata1();
		System.out.println("number of goals: "+ goals+","+"penalities"+ "penalities");
		
	}
}
class Batsman extends Cricket {
	 double strikerate;
	 int fiftees,hundreds;
	 Batsman(String n,String c,int age,int runs,double sr,int fif,int hun) {
		 super(n,c,age,runs);
		 this.strikerate=sr;
		 this.fiftees=fif;
		 this.hundreds=hun;
	 }
	 void printdata4() {
		 System.out.println();
			System.out.println("Batsman player detailes ");
			printdata2();
			System.out.println("strikerate: "+ strikerate+","+"fiftees: "+ "fiftees"+"hundreds:"+hundreds);
			
	 }
}
class Bowler extends Cricket {
	int wickets,movers,economy;
	double speed;
	Bowler(String n,String c,int age,int runs,int wkts,int mov,int eco,double speed) {
		super(n,c,age,runs);
		this.wickets=wkts;
		this.movers=mov;
		this.economy=eco;
	}
	
	
	void printdata5() {
		System.out.println();
		System.out.println("Bowler player detailes ");
		printdata2();
		System.out.println("no.of wickets: "+wickets +","+"movers: "+ movers);
		System.out.println("economy: "+economy +","+"speed: "+ speed);

	}
}
class Keeper extends Cricket {
	int stumps,catches,runout;
	Keeper(String n,String c,int age,int runs,int stu,int cat,int runo) {
		super(n,c,age,runs);
		this.stumps=stu;
		this.catches=cat;
		this.runout=runo;
	}
	void printdata6() {
		System.out.println();
		System.out.println("Keeper player detailes ");
		printdata2();
		System.out.println("no.of stumps: "+ stumps+","+"catches: "+ catches+","+"runout:"+runout);

	}
}
public class Runtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket c = new Cricket("Rajesh","india",25,1000);
		c.printdata2();
		
		Football f =new Football ("muni","india",34,400,239, 180);
		f.printdata3();
		
		Batsman b1 = new Batsman ("virat","india",34,2345,126.4,23,21);
		b1.printdata4();
		
		Bowler b2 = new Bowler ("Shami","india",23,3243,434,45,34,134.6);
		b2.printdata5();
		
		Keeper k= new Keeper ("manoj","india",25,3000,46,74,21);
		k.printdata6();

	}

}
