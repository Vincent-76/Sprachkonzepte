fakultaet(0, 1).
fakultaet(N, Ergebnis) :-
    N > 0,
    N1 is N - 1,
    fakultaet(N1, Ergebnis1),
    Ergebnis is N * Ergebnis1.

/** <examples>
?- member(c, [a, b, c]).
*/
