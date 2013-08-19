public class Lens extends CameraBody {

	/* Connait les intervalles de valeur focale, f-number, focus distance */

	/* Taille focale de l'objectif */
	protected int focalLength;
	/* Ouverture de l'objectif */
	protected int maxAperture;
	/* Distance du sujet */
	protected int focusDistance;

	// Constructeur par d�faut
	public Lens() {
		System.out.println("Cr�ation d'un objectif");
		focalLength = 0;
		maxAperture = 0;
		focusDistance = 0;
	}

	// Constructeur avec param�tres
	public Lens(int focaleLenght, int aperture, int focusDistance) {
		System.out.println("Cr�ation d'un objectif avec des param�tres");
		this.focalLength = focaleLenght;
		this.maxAperture = aperture;
		this.focusDistance = focusDistance;
	}

	// ************************ACCESSEURS****************

	// Retourne la taille focale de l'objectif
	public int getFocaleLenght() {
		return focalLength;
	}

	// Retourne l'ouverture de l'objectif
	public int getAperture() {
		return maxAperture;
	}

	// Retourne la distance du sujet
	public int getFocusDistance() {
		return focusDistance * 1000;
	}

	// *********************MUTATEURS**********************
	// D�finit la taille de l'objectif
	public void setFocaleLenght(int pFocaleLenght) {
		focalLength = pFocaleLenght;
	}

	// D�finit l'ouverture de l'objectif
	public void setAperture(int pAperture) {
		maxAperture = pAperture;
	}

	// D�finit la distance du sujet
	public void setFocusDistance(int pFocusDistance) {
		focusDistance = pFocusDistance;
	}

}
