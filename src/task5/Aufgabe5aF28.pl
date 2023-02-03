append([],L,L).
append([H|T1],L,[H|T2]) :- append(T1,L,T2).

/** <examples>
?- append(X, Y, [1,2,3,4]).
?- append(X, [1,2,3,4], Y).
*/