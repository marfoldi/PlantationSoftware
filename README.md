PlantationSoftware
==================

Programozási Technilógia 1, 2013/2014, őszi félév, első zárthelyi:

A zárthelyin egy ültetvényt (Plantation) kell modellezni,
melyen 3 fajta növényből (Plant) fordulhat elő tetszőleges számú:
páfrányok (Fern), fenyők (Pine) és zárvatermők (Magnoliphyta).

A főprogram működése a Teszt.java fájlban adott, ezen a fájlon nem
kell semmit módosítani. Csak az osztálydiagramban adott osztályokat
kell értelemszerűen megvalósítani. Az osztálydiagramon nincsenek
feltüntetve a láthatósági körök, ezek mindenhol a lehető legszűkebbek
legyenek.
Az osztálydiagramon nincs feltüntetve a Plantation interfész
DefaultPlantation típusú konstansa sem, ez nyílvánvalóan a
következőképp néz ki:
public final Plantation PLANTATION = new DefaultPlantation();

Az ültetvényen elvégezhető műveletek:
-növény ültetése (plant())
-minden elültetett növény világítása (illuminateAll())
-minden elültetett növény öntözése (irrigateAll())
-a legmagasabbra nőtt növény lekérdezése (getHighestPlant())

A növények közös tulajdonságai
-név (name)
-méret (size) double típusú, figyeljünk a törtértékekre
-termőföld (soil)
-elpusztult-e (dead)

A növények közös műveletei:
-név lekérdezése (getName())
-magasság lekérdezése (getHeight()) a magasság nem azonos a mérettel,
 hanem annak négyzetgyöke
-termőföld cserélése (setSoil())
-elpusztult-e tulajdonság lekérdezése (isDead())
-elpusztult-e tulajdonság igazra állítása (die())
-adott mennyiségű tápanyag elszívása a termőföldből (takeEnergyFromSoil()).
 Ha nem áll rendelkezésre a megadott tápanyagmennyiség a termőföldben,
 akkor a növény elpusztul.

A növényeket az világítható (Illuminable) interfészen keresztül lehet fénnyel táplálni,
 valamint az öntözhető (Irrigable) interfészen keresztül lehet vízzel ellátni.
A különböző fajta növények ezt a két interfészt a következőképp valósítják meg:
-Páfrány (Fern)
--világítás (illuminate()): a növény mérete a megadott fénymennyiség egyhuszonnegyed
  részével nő
--öntözés (irrigate()): a növény mérete a megadott vízmennyiség egyharmincad részével nő
-Fenyő (Pine)
--világítás (illuminate()): elszív 10 egységnyi tápanyagot a termőföldből, és ha ez sikerült,
  akkor a növény mérete a megadott fénymennyiség egyharmad részével nő
--öntözés (irrigate()): elszív 5 egységnyi tápanyagot a termőföldből, és ha ez sikerült,
  akkor a növény mérete a megadott vízmennyiség egyheted részével nő
-Zárvatermő (Magnoliphyta)
--világítás (illuminate()): elszív 8 egységnyi tápanyagot a termőföldből, és ha ez sikerült,
  akkor a növény mérete a megadott fénymennyiség egyhatod részével nő
--öntözés (irrigate()): elszív 12 egységnyi tápanyagot a termőföldből, és ha ez sikerült,
  akkor a növény mérete a megadott vízmennyiség egynegyed részével nő

A termőföld (Soil) működése:
-megkonstruálható egy kezdeti tápanyagmennyiséggel (Soil(energy))
-tápanyag elszívása (takeEnergy()): ha a termőföld rendelkezik a megadott
 tápanyagmennyiséggel, akkor a mennyiség annyival csökken és visszaadja
 a csökkenés mértékét. Ellenkező esetben a tápanyagmennyiség nem változik
 és nullát ad vissza.
