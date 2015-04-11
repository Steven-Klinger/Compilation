java -jar "chemin de JFlex.jar" AnalyseurLexical.jflex
-> cree une classe AnalyseurLexical.java ( analyseur lexical) ( bazarder celui d'Adrien du coup )


java -jar "chemin de java-cup-11a.jar" -parser AnalyseurSyntaxique -symbols
CodesLexicaux Grammaire.cup
->crée AnalyseurSyntaxique.java et CodesLexicaux.java

Demandez la compilation de toutes les classes du package de plic :

javac -cp "chemin de java-cup-11a.jar":. "package de plic"/*.java

puis lancez l’analyse par la commande :

java -cp "chemin de java-cup-11a.jar":. "package de plic".TestAnalyse fichier

où fichier contient une suite de déclarations de variables de type primitif.
et  TestAnalyse.java contient la fonction main() qui instancie l’analyseur syntaxique, lequel va instancier l’analyseur lexical. L’appel de la fonction parse() sur cet analyseur syntaxique déclenche le traitement du fichier dont le nom est passé en paramètre.
