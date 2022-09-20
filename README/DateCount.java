import java.util.*;

class DateCount{
	public static void main(String[] args){
	Calendar cal = Calendar.getInstance();
	Calendar cal2 = Calendar.getInstance();
	cal2.set(2001,6,6);
	int month = cal.get(Calendar.MONTH) + 1;
	int year = cal.get(Calendar.YEAR);
	System.out.print("当前年月是:");
	System.out.print(year+"年");
	System.out.println(month+"月");
	System.out.println("你的出生年月是:"+cal2.get(Calendar.YEAR)+"年"+cal2.get(Calendar.MONTH)+"月");
	if(cal.get(Calendar.MONTH) < cal2.get(Calendar.MONTH)){
		System.out.print("你的年龄为:");
		System.out.println(cal.get(Calendar.YEAR)-cal2.get(Calendar.YEAR)-1);
	}else{
		System.out.print("你的年龄为:");
		System.out.println(cal.get(Calendar.YEAR)-cal2.get(Calendar.YEAR));
		}
	}
}