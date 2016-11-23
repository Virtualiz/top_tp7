
public class Element {
	char c;
	Element next;
	
	public Element(char c){
		this.c = c;
		next = null;
	}
	
	public Element(Element other){
		if(other != null){
			this.c = other.getChar();
			if(other.hasNext()){
				this.next = new Element(other.getNext());
			}else this.next = null;
		}
	}
	
	public void addNext(Element e){
		this.next = e;
	}

	public char getChar() {
		return c;
	}

	public Element getNext() {
		return next;
	}
	
	public boolean hasNext(){
		return (next != null);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Element other = (Element) obj;
		if (c != other.c)
			return false;
		return true;
	}
	
	public Element retourneV2() {
		if(!this.hasNext()){
			return this;
		}else{
			Element res = this.next.retourneV2();
			
		}
		
	}
	
}
