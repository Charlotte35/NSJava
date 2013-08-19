public class CameraBody {

	/* Connait le cercle de confusion acceptable pour le boitier */
	/* Choose the camera, film format or circle of confusion */
	protected float circleOfConfusion;

	// Constructeur par défaut
	public CameraBody() {
		System.out.println("Création d'un boîtier");
		circleOfConfusion = 0f;
	}

	// Constructeur avec des paramètres
	public CameraBody(float circleOfConfusion) {
		System.out.println("Création d'un boîtier avec des paramètres");
		this.circleOfConfusion = circleOfConfusion;
	}

	// *************************ACCESSEURS************

	// Retourne le cercle de confusion
	public float getCircleOfConfusion() {
		return circleOfConfusion;
	}

	// ****************MUTATEURS*****************

	// Définit le cercle de confusion
	public void setCircleOfCondusion(float pCircleOfConfusion) {
		circleOfConfusion = pCircleOfConfusion;
	}

}
