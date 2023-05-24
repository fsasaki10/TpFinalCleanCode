# TpFinalCleanCode

Sommaire :  
1.Répartition du travail   
2.Liste et explication des choix des concepts vus en cours   
3.Amélioration du code possible    

**1.Répartition du travail**  

On a fait les classes et la base du code ensemble. Ensuite François a corrigé les erreurs au niveau de l'affichage et des arrondis et Christian a optimisé l'enum et le calcul de la facture.
  
**2.Liste et explication des choix des concepts vus en cours**  
  Clean Code: On a choisi de coder en anglais avec un naming clair : des verbes pour les méthodes, des noms pour les classes. Des méthodes exécutant une action avec pas plus de 3 paramètres. Des commentaires succincts mais efficace. 
  
  Functional Programming style: On a utilisé des lambdas pour réduire la longueur du code en faisant passer des instances en paramètres. Avec les boucles forEach et stream (dans une première version du code) le code est plus concis que sur nos précédents projets.
  
  TDD: On crée des tests avant de coder nos classes et méthodes. Ces tests nous ont guidé pour affiner notre dans le calcul des montants et de l'affichage.
  
  Design Pattern: On s'est inspiré du design pattern strategy pour structurer notre code avec la création d'un objet product, une enum permettant de répertorier les différents cas de calculs de taxes, une classe invoiceCalculator pour implémenter les enums et le calcul sur la facture. Enfin une classe InvoiceDisplay pour l'affichage.

**3.Amélioration du code possible**

- On peut créer deux « boolean » « imported » et « Tva » qui nous permettent de set et savoir si un produit est importé ou non et si on doit lui appliquer un Tva ou non. Le but est d’éviter de set la valeur de l’attribut « taxes » manuellement. 
- On aurait pu utiliser des stream pour les boucles. Cela aurait été plus efficace que les forEach
- On aurait pu utiliser les interfaces
- On a ajouter comme amélioration sur la facture( le displayer) le prix total d’un produit en fonction de la quantité(qté x prix)
- On aurait pu améliorer la complexité et la structure du code

# Consigne #
Sur un fichier README :
Ecrire ce que chaque des binômes a fait sur le projet. 
Lister et expliquer les choix des concepts vus en cours (en 4 parties : Clean Code, Functional 
Programming style, TDD, Design Pattern)
Comment auriez-vous pu encore davantage perfectionner votre code ?
