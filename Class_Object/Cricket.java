class Cricket
{
   public static void main(String []args)
   {
	   Team team=new Team();
	   team.bowler();
	   
	   team.name="Ravichandran Ashwin";
       String teamname=team.name;
	   System.out.println(teamname);
	   
	   team.age=34;
       int teamage=team.age;
	   System.out.println(teamage);
	   
	   team.state="Karnataka";
       String teamstate=team.state;
	   System.out.println(teamstate);
	   
       team.batsman();
	   
	   team.name="KL Rahul.";
       String teamname1=team.name;
	   System.out.println(teamname1);
	   
	   team.age=36;
       int teamage1=team.age;
	   System.out.println(teamage1);
	   
	   team.state="Karnataka";
       String teamstate1=team.state;
	   System.out.println(teamstate1);
	   
	   
   }



}