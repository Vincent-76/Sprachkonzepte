sum([], 0).
sum([Head|Tail], Sum) :-
    sum(Tail, TailSum),
    Sum is Head + TailSum.

/** <examples>
sum([1,2,3,4], Sum).
*/