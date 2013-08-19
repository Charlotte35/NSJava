
public class Lens extends CameraBody {

	/*Connait les intervalles de valeur focale, f-number, focus distance*/
	
	/* Taille focale de l'objectif*/
	protected int focaleLenght;
	/* Ouverture de l'objectif*/
	protected int aperture;
	/* Distance du sujet*/
	protected int focusDistance;
	
	//Constructeur par d�faut
	public Lens(){
		System.out.println("Cr�ation d'un objectif");
		focaleLenght=0;
		aperture=0;
		focusDistance=0;
	}
	
	//Constructeur avec param�tres
	public Lens(int focaleLenght, int aperture, int focusDistance){
		System.out.println("Cr�ation d'un objectif avec des param�tres");
		this.focaleLenght=focaleLenght;
		this.aperture=aperture;
		this.focusDistance=focusDistance;
	}
	
	//************************ACCESSEURS****************
	
	//Retourne la taille focale de l'objectif
	public int getFocaleLenght(){
		return focaleLenght;
	}
	
	//Retourne l'ouverture de l'objectif
	public int getAperture(){
		return aperture;
	}
	
	//Retourne la distance du sujet
	public int getFocusDistance(){
		return focusDistance*1000;
	}
	
	//*********************MUTATEURS**********************
	//D�finit la taille de l'objectif
	public void setFocaleLenght(int pFocaleLenght){
		focaleLenght=pFocaleLenght;
	}
	
	//D�finit l'ouverture de l'objectif
	public void setAperture(int pAperture){
		aperture=pAperture;
	}
	
	//D�finit la distance du sujet
	public void setFocusDistance(int pFocusDistance){
		focusDistance=pFocusDistance;
	}
	
}
