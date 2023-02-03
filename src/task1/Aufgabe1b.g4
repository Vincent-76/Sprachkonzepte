grammar Aufgabe1b;

timeFormat : hours COLON minutes SPACE daytime | '12' SPACE MIDNIGHTORNOON;

hours : HOURS;
minutes : MINUTES;
daytime : DAYTIME;

HOURS : ('0'[1-9] | '1'[0-2]);
MINUTES : ([0-5][0-9]);
DAYTIME : ('am' |'a.m.' | 'pm' |'p.m.');
MIDNIGHTORNOON: ('noon' | 'midnight');
COLON: (':');
SPACE: (' ');