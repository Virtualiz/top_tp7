
public class Chaine {
	
	private Element tete;
	
	public Chaine(){
		this.tete=null;
	}
	
	public Chaine(String s){
		if(s != null){
			tete = new Element(s.charAt(0));
			Element last = tete;
			for(int i=1;i<s.length();i++){
				last.addNext(new Element(s.charAt(i)));
				last = last.getNext();
			}
		}else{
			tete = null;
		}
	}
	
	public boolean estVide(){
		System.out.println("Not yet implemeted !");
		return false;
	}
	
	public char premier(){
		System.out.println("Not yet implemeted !");
		return (Character) null;
	}
	
	public Chaine reste(){
		System.out.println("Not yet implemeted !");
		return null;
	}
	
	public void adjt(){
		System.out.println("Not yet implemeted !");
	}
	
	public Element getTete(){
		return this.tete;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chaine other = (Chaine) obj;
		if (tete != other.tete)
			return false;
		return true;
	}
	
}
