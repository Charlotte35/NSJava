import java.util.Scanner;

public class Main extends Shot {

	public static void main(String[] args) {
		// Objet accessibles sans paramètres
		CameraBody cameraBody = new CameraBody();
		Lens lens = new Lens();
		Shot shot = new Shot();

		// Objets accessibles avec paramètres
		/*
		 * Lens l1 = new Lens (); Shot s1 = new Shot (); CameraBody c1 = new
		 * CameraBody ();
		 */

		// **********************************************Affichage***********************
		int choix = 0;
		Scanner sc = new Scanner(System.in);

		System.out
				.println("Bienvenue dans le programme de calcul de profondeur de champ\n");
		System.out.println("Veuillez entrer vos données :\n");

		while (lens.focalLength == 0 || lens.maxAperture == 0
				|| lens.focusDistance == 0 || cameraBody.circleOfConfusion == 0) {
			System.out
					.println("Faites un choix : \n"
							+ " 1. Entrez la longueur focale \n"
							+ " 2. Entrez l'ouverture de l'objectif \n"
							+ " 3. Entrer la distance du sujet \n"
							+ " 4. Entrer le cercle de confusion de l'appareil\n"
							+ " 5. Quitter");
			choix = sc.nextInt();

			switch (choix) {
			case 1:
				System.out.println("Entrez la longueur focale en mm.");
				lens.focalLength = sc.nextInt();
				System.out.println("Vous avez entré : " + lens.focalLength
						+ "mm.\n");
				break;
			case 2:
				System.out.println("Entrez l'ouverture de l'objectif en mm.");
				lens.maxAperture = sc.nextInt();
				System.out.println("Vous avez entré : " + lens.maxAperture
						+ " mm.\n");
				break;
			case 3:
				System.out.println("Entrez la distance du sujet en m.");
				lens.focusDistance = sc.nextInt();
				System.out.println("Vous avez entré : " + lens.focusDistance
						+ "m.\n");
				break;
			case 4:
				System.out
						.println("Entrez le cercle de confusion de l'appareil en mm.");
				cameraBody.circleOfConfusion = sc.nextFloat();
				System.out.println("Vous avez entré : "
						+ cameraBody.circleOfConfusion + "mm.\n");
				break;
			}
			if (lens.focalLength == 0 || lens.maxAperture == 0
					|| lens.focusDistance == 0
					|| cameraBody.circleOfConfusion == 0)
				System.out.println("Il manque des valeurs !\n");
		}
		System.out.println("L'objectif a une taille de "
				+ lens.getFocaleLenght() + " mm, une ouverture de "
				+ lens.getAperture() + " mm, pour une distance de "
				+ lens.getFocusDistance() + " mm et un cercle de confusion de "
				+ cameraBody.getCircleOfConfusion() + ".\n");
		System.out.println("L'hyperfocale est de " + shot.getHyperfocal()
				+ " mm, la profondeur de champ est de "
				+ shot.getDepthOfField() + "m, avec une distance minimum de "
				+ shot.getNearFocusLimit() + " m et une distance maximum de "
				+ shot.getFarFocusLimit() + " m.\n");
	}

}
