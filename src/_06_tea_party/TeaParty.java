package _06_tea_party;

public class TeaParty {
public String welcome(String name, boolean isWoman, boolean isKnighted) {
	String prefix = "";
	if(!isWoman && isKnighted) {
		prefix = "Sir ";
	}else if(!isWoman) {
		prefix = "Mr. ";
	}
	if(isWoman && isKnighted) {
		prefix = "Lady ";
	}else if(isWoman) {
		prefix = "Ms. ";
	}
	return "Hello " + prefix + name;
}
}
