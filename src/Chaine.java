
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
		
		return tete == null;
	}
	
	public char premier(){
		char res;
		try{
			res = tete.getChar();
		}catch(Exception e){
			throw e;
		}
		return res;
	}
	
	public Chaine reste(){
		Chaine reste = new Chaine();
		try{
			reste.tete = this.tete.getNext();
		}catch(Exception e){
			throw e;
		}
		return reste;
	}
	
	public void adjt(char car){
		Element e = new Element(car);
		e.addNext(this.tete);
		this.tete = e;
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
