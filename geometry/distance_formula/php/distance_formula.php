<?PHP

function euclidianDistance($p1,$p2)
{
    $dX = $p1.x - $p2.x;
    $dY = $p1.y - $p2.y;
    $distance = sqrt($dX*$dX+$dY*$dY);

    return $distance;
};

function test() {
    $p1 = {
        "x" : 0,
        "y" : 0
    };

    $p2 = {
        "x" : 1,
        "y" : 1
    };

    return euclidianDistance(p1,p2);
}

alert test();

?>
