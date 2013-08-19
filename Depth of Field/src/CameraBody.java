
public class CameraBody {
	
	/*Connait le cercle de confusion acceptable pour le boitier*/
	/*Choose the camera, film format or circle of confusion*/
	protected float circleOfConfusion;
	
	//Constructeur par d�faut
	public CameraBody(){
		System.out.println("Cr�ation d'un bo�tier");
		circleOfConfusion=0f;
	}
	
	//Constructeur avec des param�tres
	public CameraBody(float circleOfConfusion){
		System.out.println("Cr�ation d'un bo�tier avec des param�tres");
		this.circleOfConfusion=circleOfConfusion;
	}
	
	//*************************ACCESSEURS************
	
	//Retourne le cercle de confusion
	public float getCircleOfConfusion(){
		return circleOfConfusion;
	}
	
	//****************MUTATEURS*****************
	
	//D�finit le cercle de confusion
	public void setCircleOfCondusion (float pCircleOfConfusion){
		circleOfConfusion=pCircleOfConfusion;
	}
	
		

}
