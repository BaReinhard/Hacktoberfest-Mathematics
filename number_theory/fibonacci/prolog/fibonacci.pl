:- initialization(main).

fibonnaci(1, 1).
fibonnaci(2, 1).
fibonnaci(N,Result):-
        N1 is N - 1,
        fibonnaci(N1, Result1),
        N2 is N - 2,
        fibonnaci(N2,Result2),
        Result is Result1 + Result2.

main:-
    read(N),
    fibonnaci(N, Result),
    writeln(Result).
    
