import java.util.*;

public class testcollections  {
	public static void main(String[] args) {
		List<employeee> list = new ArrayList<>();
		for(int i = 100; i <= 105; i++) {
			employeee emp = new employeee(i, "Name"+i, 5 * i);
			list.add(emp);
		}
		Iterator<employeee> it = list.iterator();
		System.out.println("Size: "+list.size());
		while(it.hasNext())
		{
			employeee e = it.next();
			if(e.getId() == 102)
			{
				it.remove();
			}
			System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		}
		System.out.println("Size: "+list.size());
	}
}
