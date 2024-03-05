@domain
Feature: Calculadora

Calculadora de suma, resta, multiplicación y división

Scenario Outline: Hacer operaciones aritmeticas

Given primer numero es <a>
And segundo numero es <b>
And operacion es <op>
When ejecuta la operacion con ambos numeros
Then el resultado deberia ser <x>

Examples:
|  a |  b | op |  x |
| 10 | 20 |  1 | 30 |
| 15 |  6 |  2 |  9 |
| 11 |  4 |  3 | 44 |
| 55 |  5 |  4 | 11 |