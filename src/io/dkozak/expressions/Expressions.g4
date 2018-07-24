grammar Expressions;

start
    : stat* EOF
    ;

stat
    : assignment
    | print
    ;

assignment
    : VAR '=' expr ';'
    ;

print
    : 'print ' expr ';'
    ;

expr
    : '(' expr ')' # bracket
    | expr '*' expr # mult
    | expr '/' expr # div
    | expr '+' expr # plus
    | expr '-' expr # minus
    | INT # int
    | VAR # var
    ;

VAR
    : [a-zA-Z_]+
    ;

INT
    : [0-9]+
    ;

WS
    : [ \t\r\n]+ -> skip // skip spaces, tabs, newlines
    ;