
public class Shot extends Lens {

	/*
	 * 1 boitier + 1 objectif + param�tres de mise au point effectifs et donne
	 * la dof, hyperfocale pour une certaine ouverture et focale
	 */

	protected float nearFocusLimit, hyperfocale, depthOfField, farFocusLimit;

	// Constructeur par d�faut
	public Shot() {
		System.out.println("Cr�ation d'une prise de vue");
		hyperfocale = 0f;
		nearFocusLimit = 0f;
		farFocusLimit = 0f;
		depthOfField = 0f;
	}

	// Constructeur avec des param�tres
	public Shot(float hyperfocale, float nearFocusLimit, int depthOfField,
			int farFocusLimit) {
		System.out.println("Cr�ation d'une prise de vue avec des param�tres");
		this.hyperfocale = hyperfocale;
		this.nearFocusLimit = nearFocusLimit;
		this.farFocusLimit = farFocusLimit;
		this.depthOfField = depthOfField;
	}

	// ************************ACCESSEURS****************

	// Retourne la distance hyperfocale
	public float getHyperfocal() {
		return hyperfocale = ((this.focalLength * this.focalLength)
				/ (this.maxAperture * this.circleOfConfusion) + this.focalLength);
	}

	// Retourne la distance minimum
	public float getNearFocusLimit() {
		return nearFocusLimit = (this.hyperfocale * this.focusDistance * 1000)
				/ (this.hyperfocale + this.focusDistance * 1000) / 1000;
	}

	// Retourne la distance maximum
	public float getFarFocusLimit() {
		return farFocusLimit = (this.hyperfocale * this.focusDistance * 1000)
				/ (this.hyperfocale - this.focusDistance * 1000) / 1000;
	}

	// Retourne la profondeur de champ
	public float getDepthOfField() {
		return depthOfField = (this.farFocusLimit - this.nearFocusLimit);
	}

	// *********************MUTATEURS**********************

	// D�finit la distance Hyperfocale
	public void setHyperfocal(float pHyperfocale) {
		hyperfocale = pHyperfocale;
	}

	// D�finit la distance minimum
	public void setNearFocusLimit(float pNearFocusLimit) {
		nearFocusLimit = pNearFocusLimit;
	}

	// D�finit la profondeur de champ
	public void setDepthOfField(float pDepthOfField) {
		depthOfField = pDepthOfField;
	}

	// D�finit la distance maximum
	public void setFarFocusLimit(float pFarFocusLimit) {
		farFocusLimit = pFarFocusLimit;
	}
}
