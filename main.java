public static void ecrireFichier(ArbreAbstrait arbre, String filename){
                
                
                String code = arbre.getCodeFinal();
                File fichier = new File(filename);

		try {
			FileOutputStream fos = new FileOutputStream(fichier);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Writer ecriture = null;
		try {
			ecriture = new OutputStreamWriter(new FileOutputStream(fichier));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			try {
				ecriture.append(code); 

				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} finally {
			try {
				ecriture.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}
