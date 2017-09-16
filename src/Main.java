import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	try{
		      Student sd[];
		      StudentGroup gr=new StudentGroup(5);
		      sd=gr.getStudents();
		      for(int i=0;i<sd.length;i++)
		      {
		           String df="1997-08-18";
                       Date d1=new SimpleDateFormat("yyyy-MM-dd").parse(df);
		           sd[i]=new Student(i+1,"saheer"+i,d1,8.74+(double)i);
		      }
		      for(int i=0;i<sd.length;i++)
		      {
		            System.out.println(sd[i].getId()+"  "+sd[i].getFullName()+"  "+sd[i].getBirthDate()+"  "+sd[i].getAvgMark());
		      }
		      Student s[]=gr.getStudents();
		      for(int i=0;i<sd.length;i++)
		      {
		            System.out.println(s[i].getId()+"  "+s[i].getFullName()+"  "+s[i].getBirthDate()+"  "+s[i].getAvgMark());
		      }
		      sd=null;
		      
		      sd=gr.getStudents();
		      for(int i=0;i<sd.length;i++)
		      {
		           String df="1995-05-17";
                       Date d1=new SimpleDateFormat("yyyy-MM-dd").parse(df);
		           sd[i]=new Student(i+1,"keerthi"+i,d1,7.14+(double)i);
		      }
		      System.out.println();
		      gr.setStudents(sd);
		      for(int i=0;i<sd.length;i++)
		      {
		            System.out.println(sd[i].getId()+"  "+sd[i].getFullName()+"  "+sd[i].getBirthDate()+"  "+sd[i].getAvgMark());
		      }
		      System.out.println(gr.getStudent(3).getFullName());
		      
		      System.out.println();
		      String df="1995-11-17";
                  Date d1=new SimpleDateFormat("yyyy-MM-dd").parse(df);
		      Student p=new Student(6,"urvi",d1,7.01);
		      gr.setStudent(p,2);
		      for(int i=0;i<sd.length;i++)
		      {
		            System.out.println(sd[i].getId()+"  "+sd[i].getFullName()+"  "+sd[i].getBirthDate()+"  "+sd[i].getAvgMark());
		      }
		      System.out.println();
		      String df2="1995-11-14";
                  Date d2=new SimpleDateFormat("yyyy-MM-dd").parse(df2);
		      Student q=new Student(12,"manoj",d2,7.00);
		     
		      gr.addFirst(q);
		      Student h[]=gr.getStudents();
		     for(int i=0;i<h.length;i++)
		      {
		           System.out.println(h[i].getId()+"  "+h[i].getFullName()+"  "+h[i].getBirthDate()+"  "+h[i].getAvgMark());
		      }
		      System.out.println();
		      Student y=new Student(8,"susmi",d2,8.70);
		      gr.addLast(y);
		      Student h1[]=gr.getStudents();
		     for(int i=0;i<h1.length;i++)
		      {
		           System.out.println(h1[i].getId()+"  "+h1[i].getFullName()+"  "+h1[i].getBirthDate()+"  "+h1[i].getAvgMark());
		      }
		      
		}
		
	}

}
