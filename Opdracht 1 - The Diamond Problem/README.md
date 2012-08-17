Opdracht 1 - the Diamond Problem
================================

_Maak de volgende 4 entiteiten met bijbehorende methodes_:  

    Voertuig  
      String getNaam()  
      int getSnelheid()  
      setSnelheid(int)  

    Auto  
      rij()  

    Boot  
      vaar()  

    Amfibie  

Relaties
--------
Een Auto is een Voertuig, dwz gedrag van Voertuig (de methodes) wordt verwacht voor een Auto.  
Een Boot is een Voertuig, dwz gedrag van Voertuig (de methodes) wordt verwacht voor een Boot.  
Een Amfibie is een Voertuig, een Boot en een Auto (gedrag van alle 3 wordt verwacht in amfibie).  

Instantiatie van een Entiteit gebeurd, door mijn test, via een VoertuigFabriek die je dus ook zult moeten maken.

Restricties
----------
De implementatie van methodes moet zoveel mogelijk hergebruikt worden. kopieren is in deze opdracht NIET hergebruik.  
Hergebruik wil wel zeggen dat als ik de implementatie van vaar, rij, getSnelheid etc aan wil passen ik dat op 1 plek doe.  

Onder geen beding mag de test worden aangepast.  
Als je mij je code zou geven om na te kijken gebruik ik mijn eigen versie van de test class, hierin zijn de waarden voor de namen en snelheden anders!  

Doel
----
Doel van de opdracht is het laten zien van het beheersen van materiaal o.a. geleerd in H1 en H2 + het oplossen van 'the Diamond Problem'.  
Ik weet zeker dat niet alles wat in de hoofdstukken staat wordt gedekt.  
Ik weet niet of je, met die twee hoofdstukken, het probleem kan oplossen.  

Vr. Gr. Marcel.