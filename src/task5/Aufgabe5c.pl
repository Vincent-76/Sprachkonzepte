zug(konstanz, 08.39, offenburg, 10.59).
zug(konstanz, 08.39, karlsruhe, 11.49).
zug(konstanz, 08.53, singen, 09.26).
zug(singen, 09.37, stuttgart, 11.32).
zug(offenburg, 11.29, mannheim, 12.24).
zug(karlsruhe, 12.06, mainz, 13.47).
zug(stuttgart, 11.51, mannheim, 12.28).
zug(mannheim, 12.39, mainz, 13.18).

verbindung(Startstadt, Startzeit, Zielstadt, Reiseplan) :-
	zug(Startstadt, CheckStartzeit, Zielstadt, _),
    CheckStartzeit > Startzeit,
	Reiseplan = [Startstadt-Zielstadt].

verbindung(Startstadt, Startzeit, Zielstadt, Reiseplan) :-
	zug(Startstadt, TMPSZeit, TMPStadt, TMPAZeit),
    TMPSZeit > Startzeit,
    verbindung(TMPStadt, TMPAZeit, Zielstadt, TMPReiseplan),
	Reiseplan = [Startstadt-TMPStadt|TMPReiseplan].


/** <examples>
?- verbindung(konstanz, 8.00, mainz, Reiseplan).
*/
