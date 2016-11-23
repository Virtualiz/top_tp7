
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
	
	public Chaine(Chaine ch){
		if(!ch.estVide()){
			this.tete = new Element(ch.getTete());
			
		}else this.tete = null;
	}
	
	public Chaine(Element e){
		this.tete = e;
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
	
	public void adjq(char car){
		Element e = this.tete;
		while(e.hasNext()){
			e = e.getNext();
		}
		e.addNext(new Element(car));
	}
	
	public void supp(char car){
		Element e = this.tete;
		if(e != null){
			if(e.getChar()==car){
				this.tete = e.getNext();
			}else{
				Chaine ch = new Chaine(e.getNext());
				this.tete.addNext(ch.getTete());
			}
		}
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
