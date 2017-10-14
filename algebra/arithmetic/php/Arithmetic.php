<?php

class Arithmetic
{
    /**
     * This function is necessary because pow($x, 1/3) returns NAN for negative values.
     * PHP does not have the cube root built-in function.
     *
     * @param  number $x
     *
     * @return number
     */
    public static function cubeRoot($x)
    {
        if ($x >= 0) {
            return pow($x, 1/3);
        }
        return -pow(abs($x), 1/3);
    }
    /**
     *
     * log x  1
     *   ∑    -- (x mod bⁿ⁺¹ - x mod bⁿ)
     *  ⁿ⁼⁰   bⁿ
     *
     * Example (base 10): 5031   = 5 + 0 + 3 + 1 = 9
     * Example (base 2):  0b1010 = 1 + 0 + 1 + 0 = 2
     *
     * @param  int $x
     * @param  int $b Base (Default is base 10)
     *
     * @return int
     */
    public static function digitSum(int $x, int $b = 10): int
    {
        $logx                        = log($x, $b);
        $mod = 0; // $mod = ∑1／bⁿ⟮x mod bⁿ⁺¹ − x mod bⁿ⟯
        for ($n = 0; $n <= $logx; $n++) {
            $mod += (($x % pow($b, $n+1)) - ($x % $b**$n)) / ($b**$n);
        }
        return $mod;
    }
    /**
     * Digital root (iterated digit sum, repeated digital sum)
     *
     * Example: 65,536 is 7, because 6 + 5 + 5 + 3 + 6 = 25 and 2 + 5 = 7
     *
     * @param  int    $x [description]
     */
    public static function digitalRoot(int $x): int
    {
        $root = $x;
        while ($root >= 10) {
            $root = self::digitSum($root);
        }
        return $root;
    }
}
$x = 4;
$cubeRoot = Arithmetic::cubeRoot($x);
$digitSum = Arithmetic::digitSum($x);
$digitRoot = Arithmetic::digitalRoot($x);
$result[] = ['Cube Root:' => $cubeRoot, 'DigitSum' => $digitSum, 'DigitalRoot' => $digitRoot];
var_dump($result);
