
public class Ques2 {
double distance;
String name;
 int numOfJumpers=0;

public Ques2(double distance,String name)
{
	this.distance=distance;
	this.name=name;
	numOfJumpers++;
}
public Ques2() {  }
public void setDistance(double distance) {
	this.distance=distance;
}
public double getDistance() {
	return distance;
	
}
public void setName(String name) {
	this.name=name;
}
public String getNmame()
{
	return name;
}
public double avg_jump(Ques2[]arr) {
	int i,sum=0;
	for (i=0;i<numOfJumpers;i++)
	{
		sum+=arr[i].distance;
	}
	return distance / numOfJumpers;
}
public void above_avg(Ques2[]arr,double avg)
{
	int i;
	for (i=0;i<numOfJumpers;i++)
		if(arr[i].distance<=avg)
			System.out.println(arr[i].name);
	
}










}
