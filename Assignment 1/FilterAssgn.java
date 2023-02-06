package question1;

import java.util.*;

class GroupMembers{
	int id;
	String name;
	public GroupMembers(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}

public class FilterAssgn {
	public static void main(String[] args) {
		List<GroupMembers> GrpList = new ArrayList<GroupMembers>();
		GrpList.add(new GroupMembers(1, "Shubh"));
		GrpList.add(new GroupMembers(2, "Monidepa"));
		GrpList.add(new GroupMembers(3, "Swairik"));
		GrpList.add(new GroupMembers(4, "Mayukh"));
		GrpList.add(new GroupMembers(5, "Ankita"));
		
		GrpList.stream().filter(g-> (g.name.length()>5 && g.name.length()<8)).forEach(g->System.out.println(g.name));
	}
}
