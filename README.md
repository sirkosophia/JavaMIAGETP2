# JavaMIAGETP2

Sophia Sirko-Galouchenko TD2 Java 

exercice 1:

1)Le main affiche deux fois 42 et puis 4 fois 24 pour les deux objets de type fille par ce que la classe Fille hérite la classe Mere, un objet de type fille peut donc utiliser la méthode de la classe Mere printMeth car cette méthode est public. 

42
42
24
24
24
24

2)Dans la classe fille l'objet de type Fille a accès a deux méthodes meth(). Celle de la classe Fille mais aussi de la classe Mere. On peut accéder a la méthode meth() de la classe Fille en appelant super.meth(). Si on fait un sysout(super.meth()) dans la classe Fille, 42 sera affiche. On a bien sur aussi accès a la méthode meth() de la classe fille qu'on peut appeler sur un element de type fille. Par contre dans le main comme la méthode est protected et qu'on peut pas appeler super dans une classe statique l'objet de type fille dans le main peut accéder uniquement a une seule méthode meth(), celle de la classe Fille.



3)The overridden static method becomes a hidden method, which means that if we call it in the superclass then the hidden method gets called, but if we call it in the subclass then the method that is written in the subclass is called. That is why when we call the printMeth method it called the meth() method from the super class and prints 42. The meth() method is now not overridden by the subclass, so the version from the superclass is invoked when mereFille meth() is called because it uses the type Mere of mereFille. 
42
42
24
42
42
42 

4)The declaration of the field meth in Fille "hides" the declaration of the field meth in Mere so it acts like a hidden method. When the printMeth() method is called since it is declared in the Mere class it accesses the meth field of the Mere class. And the same as before, when down casting mereFille is considered as Mere type because meth is hidden. 
42
42
24
42
42
42

Exercice2: 

1)A la ligne 36, on doit e() en protected car on ne peut pas restreindre la portée d'une méthode dans une classe fille.

A la ligne 40, le type de la méthode h() n'est pas compatible avec celui de la méthode h() dans la superclasse. Le type de la méthode qui override doit être soit le meme ou un sous-classe du type que retourne la méthode de base.

A la ligne 41 meme problème que la ligne 40

A la ligne 44 c'est la meme chose, on peut pas declarer une exception parent de celle de la méthode de base. Donc elle doit declarer la meme exception, une exception fille ou pas d'exception. 

A la ligne 54 la classe Mere n'as pas de mettre miage

%%A la ligne 56, l'objet mereFille a comme type effectif Fille mais est déclaré en tant que Mere, pour qui la méthode miage n'est pas définie

3)La surcharge survient lorsque deux méthodes ou plus dans une classe ont le même nom de méthode mais des paramètres différents. 
Redéfinition signifie avoir deux méthodes avec le même nom et les mêmes paramètres, l'une des méthodes est dans la classe parente et l'autre dans la classe fille

Dans Mere c est surcharge 
Dans Fille  c() et d() sont surcharges et redéfinis 
 a() est redéfinie b() est est redéfinie. f() est redéfinie. j() est redéfinie. g() est redéfinie. l() est redéfinie. m() est redéfinie.

4)Miage 
la méthode miage de la classe Fille

Miage  
on a forcé le cast de l'objet mereFille en Fille. Ce qui permet l'accès à la méthode miage de Fille

Mere_a 
la méthode a() de la classe Mere

Fille_a 
%% la méthode a() de Fille car le type effectif de mereFille est Fille

Fille_a  
la méthode a() de la classe Fille

Fille_a 
%%le type effectif de mereFille est Fille donc on utilise la méthode a() de Fille

Fille_b(Fille) 
%% le type effectif de mereFille est Fille donc on utilise la méthode b() de Fille

Mere_c
 il utilise la seule méthode c() qui n'a pas de paramètres. C'est une méthode de Mere et mereFille est déclaré en Mere donc il y a accès

Fille_c(Mere) 
on appelle la méthode c de type effectif Fille avec comme paramètre un objet de type Mere

Fille_c(Mere) 
 on appelle la méthode c de type effectif Fille avec comme paramètre un objet de type Mere

Fille_c(Mere)

Fille_c(Fille) 
on appelle la méthode c de Fille avec comme paramètre un objet de type Fille

static Mere_d 
 on appelle la méthode d() de la classe Mere

static Mere_d  
on appelle la méthode d() de la classe Mere car l'objet mereFille est déclaré en tant que Mere

Mere_f  
on appelle une méthode de Mère sur un objet de type Mere

Mere_f  
la classe Fille n'ayant pas de méthode printF redéfinie on utilise celle de la classe Mere 
 
Fille_j 
 mereFille est de type effectif Fille donc c'est la méthode j de Fille qui est appelée

Mere_k  
la classe Fille n'ayant pas de méthode k() redéfinie, on appelle la méthode k() de Mere

Fille_l  
la méthode l() étant redéfinie dans la classe Fille, on appelle celle ci sur l'objet mereFille de type effectif Fille

Fille_m 
la méthode m() étant redéfinie dans la classe Fille, on appelle celle ci sur l'objet mereFille de type effectif Fille





