class calender
{
public static void main(String args[])
{
int date=integer.parseiny(args[0]);
int month=integer.parseiny(args[1]);
int year=integer.parseiny(args[2]);
int daspassed=date;
int dayofmonth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
for(inti=0;i<month;i++)
{daypassed=daypassed+dayofmonth[i];
}
if(year%4==0&&month>2)
{
daypassed=daypassed+1;
}
System.out.println(datpassed);
year=year-1;
int mf=year%400;
int y=mf/100;
int totalyear=mf%100;
int remaining=year-totalyear;
int leap=0;
for(int i=remaining+1;i<=year;i++)
{
if(i%4==0&&i%100!=0||i%400==0)
{
leap++;
}
}
int oddyear=totalyear-leap;
int toraldays=daypassed=(y*5)+oddyear+(leap*2);
int numofoddday=totaldays%7;
System.out.println(numofoddday);
switch(numododdday)
{
case 0:
System.out.println("monday");
break;
case 1:
System.out.println("tuesday");
break;
case 2:
System.out.println("wednesday");
break;
case 3:
System.out.println("thursday");
break;
case 4:
System.out.println("friday");
break;
case 5:
System.out.println("saturday");
break;
case 6:
System.out.println("sunday");
break;
}
}
}
