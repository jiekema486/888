import java.util.*;

class DateCount{
	public static void main(String[] args){
	Calendar cal = Calendar.getInstance();
	Calendar cal2 = Calendar.getInstance();
	cal2.set(2001,6,6);
	int month = cal.get(Calendar.MONTH) + 1;
	int year = cal.get(Calendar.YEAR);
	System.out.print("��ǰ������:");
	System.out.print(year+"��");
	System.out.println(month+"��");
	System.out.println("��ĳ���������:"+cal2.get(Calendar.YEAR)+"��"+cal2.get(Calendar.MONTH)+"��");
	if(cal.get(Calendar.MONTH) < cal2.get(Calendar.MONTH)){
		System.out.print("�������Ϊ:");
		System.out.println(cal.get(Calendar.YEAR)-cal2.get(Calendar.YEAR)-1);
	}else{
		System.out.print("�������Ϊ:");
		System.out.println(cal.get(Calendar.YEAR)-cal2.get(Calendar.YEAR));
		}
	}
}