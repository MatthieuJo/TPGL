/**
 *
 * @author roudet
 */
public class Kiwi {
    private double prix;
    private String origine;
	
    public Kiwi() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Kiwi(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Kiwi de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Kiwi or = (Kiwi) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	System.out.println("premier test Kiwi");
	Kiwi o = new Kiwi();
	Kiwi o2 = new Kiwi(-5,"FRANCE");
	System.out.println("Kiwi 1 : "+o.toString());
	System.out.println("Kiwi 2 : "+o2.toString());
	System.out.println("Kiwi 1 = Kiwi 2 ? : "+o.equals(o2));
	System.out.println("Kiwi 1 is SeedLess ? : "+o.isSeedless());
   }
}
