<?php

class Trig{
    /*
    *
    *   Gives approximation of sin and cos 
    *   Provide a given number of point for $n
    *
    *   @param int $numpoints : number of terms
    */
    public static function unitCircle(int $numpoints = 11):array{
        $n = $numpoints - 1;
        $result = [];
        for ($i = 0; $i <= $n; $i++ ){
            $x = cos(2 * pi() * $i / ($n));
            $y = sin(2 * pi() * $i / ($n));
            $result[] = [$x,$y];
        }
        return $result;
    }
}

$n = 4;
$points[] = Trig::unitCircle($n);
var_dump($points);
