parser grammar FightParser;

options {tokenVocab = FightLexer;}
arenastart: fight EOF;

fight: score VS score;

score: fighter COLON POINTS;

fighter: FIGHTER1 | FIGHTER2;

/*
start: adress EOF;
adress: name COMMA street SPACE housenumber COMMA plz SPACE city DOT;

name: VORNAME SPACE NACHNAME;
VORNAME: 'vn';
SPACE: ' ';
NACHNAME: 'nn';
COMMA: ',';
street: STREET;
STREET: 's';
housenumber: NUMBER;
NUMBER: ([0-9]);
plz: PLZ;
PLZ: '3';
city: CITY;
CITY: 'c';
DOT: '.';


/*
city: cityname COMMA SPACE street | street+;

cityname: 'c1';

street: house COMMA house;

house: HOUSE NUMBER;

HOUSE: 'h';
NUMBER: '1';
COMMA: ',';


//city: 'city';

/*



start: '#' city;
city: CITYNAME SPACE EINS | EINS ; //| CITYNAME COMMA SPACE street;

street: STREET;

//city: CITY | house;
//house: HOUSE;


/*

city: CITYNAME COMMA street | street;
street: STREET | ;
city     :   '< city' Name attribute* '>' content '<' '/' Name '>'
            |   '<' Name attribute* '/>';

attribute   :   Name '=' STRING ;
content     :   chardata?
                ((element | COMMENT) chardata?)* ;

chardata    :   TEXT;
*/
