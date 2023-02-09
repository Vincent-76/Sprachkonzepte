/*grammar Aufgabe1b;

timeFormat : hours COLON minutes SPACE daytime | '12' SPACE MIDNIGHTORNOON;

hours : HOURS;
minutes : MINUTES;
daytime : DAYTIME;

HOURS : ('0'[1-9] | '1'[0-2]);
MINUTES : ([0-5][0-9]);
DAYTIME : ('am' |'a.m.' | 'pm' |'p.m.');
MIDNIGHTORNOON: ('noon' | 'midnight');
COLON: (':');
SPACE: (' ');*/

lexer grammar Aufgabe1b;

Time: MidnightOrNoonTime | AmOrPmTime;

fragment MidnightOrNoonTime: (TWELVE SPACE MIDNIGHTORNOON);
fragment AmOrPmTime: (HOURS (COLON MINUTES)? SPACE DAYTIME);

fragment MIDNIGHTORNOON: 'midnight' | 'noon';
fragment DAYTIME: 'am' | 'pm';
fragment HOURS : ('0'[1-9] | '1'[0-2]);
fragment MINUTES: [0-5] [0-9];

fragment COLON: ':';
fragment SPACE: ' ';
fragment TWELVE: '12';

WS: [ \t\r\n]+ -> channel(HIDDEN);





