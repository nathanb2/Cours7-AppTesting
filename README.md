# Cours7-AppTesting
Exemple test unitaire et Android test


On peut tester une application Android a plusieurs niveaux reunis en 2 groupes, les tests purement Java et les AndroidTests necessitant l'intercation avec l'OS Android essentillement pour manipuler les vues et tester le UI

- Les annotations @setUp et @before permettent de realiser des actions avant de lancer une classe de tests ou apres la realisation des tests

- Pour les tests unitaires on appele la fonction du code a tester et avec assert comparons le resltat attendu au resultat reelement retourne par la fonction

- Pour les tests Android:
 
 - On declare sur quel Activity on veut lancer nos tests avec l'annotation @Rule sur le setup
 - On recupere les vues grace a onView(withId())
 - On realise des actions sur ces vues avec .performe()
 - On check ce que l'on souhaite de ces vues avec .check(matches())

ressources : 
slide 03.2 : https://drive.google.com/drive/folders/1eu-LXxiHocSktGYpG04PfE9Xmr_pBY5P?usp=sharing
doc espresso : https://developer.android.com/training/testing/espresso
