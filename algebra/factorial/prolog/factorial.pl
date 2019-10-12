:- initialization(main).


factorial(1,1).
factorial(2,2).
factorial(N, Result) :-
    N1 is N - 1,
    factorial(N1, Result2),
    Result is N * Result2.

main:-
    read(N),
    factorial(N, Result),
    writeln(Result).