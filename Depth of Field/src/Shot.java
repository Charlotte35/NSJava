

public class Shot extends Lens {

	/*1 boitier + 1 objectif + paramètres de mise au point effectifs et donne la dof, hyperfocale pour une certaine ouverture et focale*/
	
	protected float nearFocusLimit, hyperfocale, depthOfField, farFocusLimit;
	
	//Constructeur par défaut
	public Shot(){
		System.out.println("Création d'une prise de vue");
		hyperfocale=0f;
		nearFocusLimit=0f;
		farFocusLimit=0f;
		depthOfField=0f;
	}
	
	//Constructeur avec des paramètres
	public Shot(float hyperfocale, float nearFocusLimit, int depthOfField, int farFocusLimit){
		System.out.println("Création d'une prise de vue avec des paramètres");
		this.hyperfocale=hyperfocale;
		this.nearFocusLimit=nearFocusLimit;
		this.farFocusLimit=farFocusLimit;
		this.depthOfField=depthOfField;
	}
	
	
	//************************ACCESSEURS****************
	
	//Retourne la distance hyperfocale
	public float getHyperfocale(){
		return hyperfocale=((this.focaleLenght*this.focaleLenght)/(this.aperture*this.circleOfConfusion)+this.focaleLenght);
	}
	
	//Retourne la distance minimum
	public float getNearFocusLimit(){
		return nearFocusLimit=(this.hyperfocale*this.focusDistance*1000)/(this.hyperfocale+this.focusDistance*1000)/1000;
	}
	
	//Retourne la distance maximum
	public float getFarFocusLimit(){
		return farFocusLimit=(this.hyperfocale*this.focusDistance*1000)/(this.hyperfocale-this.focusDistance*1000)/1000;
	}
	
	//Retourne la profondeur de champ
	public float getDepthOfField(){
		return depthOfField=(this.farFocusLimit-this.nearFocusLimit);
	}
		
	//*********************MUTATEURS**********************
	
	//Définit la distance Hyperfocale
	public void setHyperfocale(float pHyperfocale){
		hyperfocale=pHyperfocale;
	}
	
	//Définit la distance minimum
	public void setNearFocusLimit(float pNearFocusLimit){
		nearFocusLimit=pNearFocusLimit;
	}
	
	//Définit la profondeur de champ
	public void setDepthOfField (float pDepthOfField){
		depthOfField=pDepthOfField;
	}
	
	//Définit la distance maximum
	public void setFarFocusLimit (float pFarFocusLimit){
		farFocusLimit=pFarFocusLimit;
	}
}		
