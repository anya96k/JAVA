import java.util.Scanner;
class date_to_day
{
public String get_day()
{
int day,year;
String Month;

Scanner sc=new Scanner(System.in);

System.out.print("Enter the day:=");
day=sc.nextInt();

System.out.print("Enter the month:=");
Month=sc.next();

System.out.print("Enter the year:=");
year=sc.nextInt();

int century,twelves,remainder,fours;
int sum,mod,Code=0;
String month[]={"january","february","march","april","may","june","july","august","september","october","november","december"};
int monthCode[]={1,4,4,0,2,5,0,3,6,1,4,6};
String days[]={"saturday","sunday","monday","tuesday","wednesday","thursday","friday"};
int count[]={0,1,2,3,4,5,6};
String Day="x";

for(int i=0;i<11;i++)
{
if(Month==month[i])
{
Code=monthCode[i];
break;
}

}

century=(year%100);
twelves=century%12;
remainder=year-(twelves%12);
fours=remainder%4;
sum=twelves+remainder+fours+day+Code;
mod=sum%7;

for(int i=0;i<7;i++)
{
if(mod==count[i])
{
Day=days[i];
}
}
return Day;
}
}

class Date
{
public static void main(String []args)
{
date_to_day d=new date_to_day();
System.out.print("Day of the given date:="+d.get_day());
}
}