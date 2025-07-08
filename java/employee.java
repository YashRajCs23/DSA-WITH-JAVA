class generate{
	String dep;
	String fname;
	String lname;
	int random;
	int x;
	generate(String dep,String fname,String lname,int random,int x){
		this.dep=dep;
		this.fname=fname;
		this.lname=lname;
		this.random=random;
		this.x=x;
	}
	public String generateid() {
		String ans="";
		String shorter;
		String longer;
		if(fname.length()>lname.length()) {
			shorter=lname;
			longer=fname;
		}else if(fname.length()<lname.length()) {
			shorter=fname;
			longer=lname;
		}else {
			if(fname.compareTo(lname)<=0) {
				shorter=fname;
				longer=lname;
			}else {
				shorter=lname;
				longer=fname;
			}
		}
		ans+=shorter.charAt(0);
		ans+=dep;
		ans+=longer.charAt(longer.length()-1);
		String randomnum=String.valueOf(random);
		ans+=randomnum.substring(x,x+2);
		return ans;
	}
	
	
}
public class employee {

	public static void main(String[] args) {
		generate e1=new generate("HR","JOHN","PATEL",67891,2);
		System.out.println(e1.generateid());

	}

}